package com.Builder;

public class ReportBuilder implements Builder {
    private Document document = new Document();

    public String  getDocument() {
        StringBuilder documentText = new StringBuilder();
        for (DocumentElement element: document.Elements) {
            documentText.append(element).append('\n');
        }
        return documentText.toString();
    }

    @Override
    public void AddTitle() {
        Text header = new Text();
        header.Content = "TITLE:";
        document.Add(header);

        Text text = new Text();
        text.Content = "Report about 2008 financial crisis. Made by Tonald Drump";
        document.Add(text);
    }

    @Override
    public void AddIntroduction() {
        Text header = new Text();
        header.Content = "INTRODUCTION:";
        document.Add(header);

        Text text = new Text();
        text.Content = "The 2008 financial crisis is the worst economic disaster since the Great Depression of 1929, " +
                "and it occurred despite the Federal Reserve and Treasury Department's efforts to prevent it.";
        document.Add(text);
    }

    @Override
    public void AddMainPart() {
        Text header = new Text();
        header.Content = "MAIN PART:";
        document.Add(header);

        Text text = new Text();
        text.Content = "The first sign that the economy was in trouble occurred in 2006 when housing prices began to fall. " +
                "At first, realtors applauded; they thought the overheated housing market would return to a more sustainable level.";
        document.Add(text);

        Chart pieChart = new Chart();
        pieChart.Content = "Pie chart of crisis costs";
        document.Add(pieChart);

        Text dumbText = new Text();
        dumbText.Content = "The 2008 financial crisis timeline began in March 2008, " +
                "when investors sold off their shares of investment bank Bear Stearns because it had too many of the toxic assets. ";
        document.Add(dumbText);

        Image applePie = new Image();
        applePie.Content = "Apple pie";
        document.Add(applePie);
    }

    @Override
    public void AddConclusion() {
        Text header = new Text();
        header.Content = "CONCLUSION:";
        document.Add(header);

        Text conclusionText = new Text();
        conclusionText.Content = "The financial crisis of 2008 proved that banks could not regulate themselves, " +
                "and without government oversight like Dodd-Frank, they could create another global crisis.";
        document.Add(conclusionText);
    }
}
