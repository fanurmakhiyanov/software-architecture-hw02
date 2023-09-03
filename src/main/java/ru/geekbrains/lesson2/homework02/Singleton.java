package ru.geekbrains.lesson2.homework02;

public class Singleton {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First log");
        System.out.println(ProgramLogger.getProgramLogger().toString()); // проверка hash-кода экземпляра объекта
        ProgramLogger.getProgramLogger().addLogInfo("Second log");
        System.out.println(ProgramLogger.getProgramLogger().toString());// проверка hash-кода экземпляра объекта
        ProgramLogger.getProgramLogger().addLogInfo("Third log");
        System.out.println(ProgramLogger.getProgramLogger().toString());// проверка hash-кода экземпляра объекта
        ProgramLogger.getProgramLogger().showLogFile();
    }
}
