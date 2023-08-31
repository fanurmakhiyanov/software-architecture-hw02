package ru.geekbrains.lesson2.factorymethod;

import ru.geekbrains.lesson2.templatemethod.LogEntry;
import ru.geekbrains.lesson2.templatemethod.LogReader;

public class Program {

    public static String data = """
У Лукоморья дуб зеленый;
Златая цепь на дубе том;
И днем и ночью кот ученый
Все ходит по цепи кругом;
Идет направо - песень заводит,
Налево ― сказку говорит.""";

    public static void main(String[] args) {

        LogReader logReader = new ConcreteReaderCreater()
                .createLogReader(LogType.Poem, data);
        for (LogEntry log : logReader.readLogEntry()){
            System.out.println(log.getText());
        }

    }
}
