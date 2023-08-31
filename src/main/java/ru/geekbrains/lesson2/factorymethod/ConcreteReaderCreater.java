package ru.geekbrains.lesson2.factorymethod;

import ru.geekbrains.lesson2.templatemethod.LogReader;
import ru.geekbrains.lesson2.templatemethod.PoemReader;

public class ConcreteReaderCreater extends BaseLogReaderCreator{
    @Override
    protected LogReader createLogReaderInstance(LogType logType) {
        return switch (logType) {
            case Poem -> new PoemReader();
            case Text -> new TextFileReader();
            case System -> new OperationSystemLogEventReader();
            case Database -> new DatabaseReader();
        };
    }
}
