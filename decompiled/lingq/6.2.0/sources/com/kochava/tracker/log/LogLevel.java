package com.kochava.tracker.log;

import p000.gj5;

/* JADX INFO: loaded from: classes.dex */
public enum LogLevel {
    NONE,
    ERROR,
    WARN,
    INFO,
    DEBUG,
    TRACE;

    public static LogLevel fromLevel(int i) {
        if (i == 2) {
            return TRACE;
        }
        if (i == 3) {
            return DEBUG;
        }
        if (i == 5) {
            return WARN;
        }
        if (i != 6) {
            return i != 7 ? INFO : NONE;
        }
        return ERROR;
    }

    public static LogLevel fromString(String str) {
        int i;
        if ("NONE".equalsIgnoreCase(str) || "NEVER".equalsIgnoreCase(str) || "N".equalsIgnoreCase(str)) {
            i = 7;
        } else if ("ERROR".equalsIgnoreCase(str) || "E".equalsIgnoreCase(str)) {
            i = 6;
        } else if ("WARN".equalsIgnoreCase(str) || "W".equalsIgnoreCase(str)) {
            i = 5;
        } else {
            i = 4;
            if (!"INFO".equalsIgnoreCase(str) && !"I".equalsIgnoreCase(str)) {
                if ("DEBUG".equalsIgnoreCase(str) || "D".equalsIgnoreCase(str)) {
                    i = 3;
                } else if ("TRACE".equalsIgnoreCase(str) || "VERBOSE".equalsIgnoreCase(str) || "T".equalsIgnoreCase(str) || "V".equalsIgnoreCase(str)) {
                    i = 2;
                }
            }
        }
        return fromLevel(i);
    }

    public final int toLevel() {
        int i = gj5.f40875a[ordinal()];
        if (i == 1) {
            return 7;
        }
        if (i == 2) {
            return 6;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 5) {
            return i != 6 ? 4 : 2;
        }
        return 3;
    }

    @Override // java.lang.Enum
    public final String toString() {
        switch (toLevel()) {
            case 2:
                return "Trace";
            case 3:
                return "Debug";
            case 4:
            default:
                return "Info";
            case 5:
                return "Warn";
            case 6:
                return "Error";
            case 7:
                return "None";
        }
    }
}
