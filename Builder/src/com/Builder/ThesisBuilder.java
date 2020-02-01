package com.Builder;

public class ThesisBuilder implements Builder {
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
        text.Content = "Thesis about something. Made by John Smith";
        document.Add(text);
    }

    @Override
    public void AddIntroduction() {
        Text header = new Text();
        header.Content = "INTRODUCTION:";
        document.Add(header);

        Text text = new Text();
        text.Content = "Lorem ipsum dolor sit amet, " +
                "consectetur adipiscing elit. Vivamus ut felis elementum, " +
                "finibus sapien quis, feugiat ligula. Duis quis ipsum nunc.";
        document.Add(text);
    }

    @Override
    public void AddMainPart() {
        Text header = new Text();
        header.Content = "MAIN PART:";
        document.Add(header);

        Text text = new Text();
        text.Content = "Vivamus nisl massa, lacinia vitae cursus a, gravida ut mauris. " +
                "Donec sed rhoncus elit, eget fringilla ante. " +
                "Aliquam feugiat risus sit amet odio volutpat ultrices. " +
                "Maecenas feugiat mi eu nisi vestibulum fermentum. ";
        document.Add(text);

        Image image = new Image();
        image.Content = "Image about 'Lorem Ipsum'.";
        document.Add(image);

        Text blah = new Text();
        blah.Content = "blah blah blah blah blah blah blah blah blah blah blah";
        document.Add(blah);

        Chart barChart = new Chart();
        barChart.Content = "Bar chart about 'blah'";
        document.Add(barChart);

        Diagram diagram = new Diagram();
        diagram.Content = "Fancy diagram...";
        document.Add(diagram);
    }

    @Override
    public void AddConclusion() {
        Text header = new Text();
        header.Content = "CONCLUSION:";
        document.Add(header);

        Text conclusionText = new Text();
        conclusionText.Content = "Financial literacy is one of the most important things a person needs to understand as a fully functional adult. " +
                "It's crucial for someone to be able to know how to purchase a car, open a bank account, invest in a 401k plan, " +
                "and pay back his or her student debt all while being able to balance paying rent and saving money.";
        document.Add(conclusionText);
    }
}
