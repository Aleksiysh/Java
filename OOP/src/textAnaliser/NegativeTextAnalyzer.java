package textAnaliser;

class NegativeTextAnalyzer extends KeywordAnalyzer{
    public NegativeTextAnalyzer() {
        keywords = new String[]{":(","=(",":|"};
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
