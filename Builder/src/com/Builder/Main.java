package com.Builder;

/*
* Задание
* Создание отчета, содержащего различные графические компоненты (текст, диаграммы, графики), которые могут идти в произвольном порядке.
*/

public class Main {

    public static void main(String[] args) {
        ThesisBuilder thesisBuilder = new ThesisBuilder();
        Director director = new Director();
        director.setBuilder(thesisBuilder);
        director.Construct();
        String thesis = thesisBuilder.getDocument();
        System.out.println(thesis);

        ReportBuilder reportBuilder = new ReportBuilder();
        director.setBuilder(reportBuilder);
        director.Construct();
        String report = reportBuilder.getDocument();
        System.out.println(report);
    }
}
