package textAnaliser;

enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

interface TextAnalyzer {
    Label processText(String text);
}

abstract class KeywordAnalyzer implements TextAnalyzer {
    protected String[] keywords;

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        for (String keyWord : getKeywords()) {
            if (text.contains(keyWord))
                return getLabel();
        }
        return Label.OK;
    }

}

class NegativeTextAnalyzer extends KeywordAnalyzer {
    public NegativeTextAnalyzer() {
        keywords = new String[]{":(", "=(", ":|"};
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}

class SpamAnalyzer extends KeywordAnalyzer {

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}

class TooLongTextAnalyzer implements TextAnalyzer {
    private final int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) return Label.TOO_LONG;
        return Label.OK;
    }
}

public class CheckLabels {
    public void main1() {
        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"afa", "bbb"});
        TooLongTextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer(20);
        Label l = checkLabels(
                new TextAnalyzer[]{negativeTextAnalyzer, spamAnalyzer, tooLongTextAnalyzer},
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa:(aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
        );
        System.out.println(l);
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label label = analyzer.processText(text);
            if (label != Label.OK) return label;
        }
        return Label.OK;
    }
}
