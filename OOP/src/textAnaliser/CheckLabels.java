package textAnaliser;

public class CheckLabels {
    public void main1() {
        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"afa","bbb"});
        TooLongTextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer(20);
        Label l = checkLabels(
                new TextAnalyzer[]{negativeTextAnalyzer,spamAnalyzer,tooLongTextAnalyzer},
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa:(aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
        );
        System.out.println(l);
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer: analyzers) {
            Label label =analyzer.processText(text);
            if(label!=Label.OK) return label;
        }
        return Label.OK;
    }
}
