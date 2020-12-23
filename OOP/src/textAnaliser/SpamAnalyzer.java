package textAnaliser;

class SpamAnalyzer  extends KeywordAnalyzer  implements TextAnalyzer{

    @Override
    public Label processText(String text) {
        return null;
    }

    @Override
    protected String[] getKeywords() {
        return new String[0];
    }

    @Override
    protected Label getLabel() {
        return null;
    }
}
