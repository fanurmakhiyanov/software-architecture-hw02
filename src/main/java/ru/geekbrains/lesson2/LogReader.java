package ru.geekbrains.lesson2;

import java.util.ArrayList;

/**
 * Основа работы алгоритма чтения данных
 */
public abstract class LogReader {
    private int currentPosition = 0;
    public int getCurrentPosition() {
        return currentPosition;
    }
    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
    public Iterable<LogEntry> readLogEntry(){
        List<LogEntry> logList = new ArrayList<>()
    }
    public abstract Object getDataSource();
    public abstract void setDataSource(Object data);
    protected abstract Iterable<String> readEntries(Integer position);
    protected abstract LogEntry parseLogEntry(String stringEntry);

}
