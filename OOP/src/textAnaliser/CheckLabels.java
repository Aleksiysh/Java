package textAnaliser;

public class CheckLabels {
    public void main1() {
        Label l = checkLabels(new TextAnalyzer[10],"aaaaaaaaa");
        System.out.println(l);
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        return Label.OK;
    }
}
