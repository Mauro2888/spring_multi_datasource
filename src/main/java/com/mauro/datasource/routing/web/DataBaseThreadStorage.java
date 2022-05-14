package com.mauro.datasource.routing.web;

public class DataBaseThreadStorage {

    private static ThreadLocal<String> currentDatabase = new ThreadLocal<>();

    public static void setDatabaseId(String tenantId) {
        currentDatabase.set(tenantId);
    }

    public static String getDatabaseId() {
        return currentDatabase.get();
    }

    public static void clear(){
        currentDatabase.remove();
    }

}
