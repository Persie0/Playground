package com.kochava.tracker.log;

import ag.C0075b;

/* JADX INFO: loaded from: classes.dex */
public enum LogLevel {
    NONE,
    ERROR,
    WARN,
    INFO,
    DEBUG,
    TRACE;

    /* JADX INFO: renamed from: com.kochava.tracker.log.LogLevel$a */
    public static /* synthetic */ class C3265a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16493a;

        static {
            int[] iArr = new int[LogLevel.values().length];
            f16493a = iArr;
            try {
                iArr[LogLevel.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16493a[LogLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16493a[LogLevel.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16493a[LogLevel.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16493a[LogLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16493a[LogLevel.TRACE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static LogLevel fromLevel(int i10) {
        if (i10 == 2) {
            return TRACE;
        }
        if (i10 == 3) {
            return DEBUG;
        }
        if (i10 == 5) {
            return WARN;
        }
        if (i10 != 6) {
            return i10 != 7 ? INFO : NONE;
        }
        return ERROR;
    }

    public static LogLevel fromString(String str) {
        int i10;
        if ("NONE".equalsIgnoreCase(str) || "NEVER".equalsIgnoreCase(str) || "N".equalsIgnoreCase(str)) {
            i10 = 7;
        } else if ("ERROR".equalsIgnoreCase(str) || "E".equalsIgnoreCase(str)) {
            i10 = 6;
        } else if ("WARN".equalsIgnoreCase(str) || "W".equalsIgnoreCase(str)) {
            i10 = 5;
        } else {
            i10 = 4;
            if (!"INFO".equalsIgnoreCase(str) && !"I".equalsIgnoreCase(str)) {
                if ("DEBUG".equalsIgnoreCase(str) || "D".equalsIgnoreCase(str)) {
                    i10 = 3;
                } else if ("TRACE".equalsIgnoreCase(str) || "VERBOSE".equalsIgnoreCase(str) || "T".equalsIgnoreCase(str) || "V".equalsIgnoreCase(str)) {
                    i10 = 2;
                }
            }
        }
        return fromLevel(i10);
    }

    public final int toLevel() {
        int i10 = C3265a.f16493a[ordinal()];
        if (i10 == 1) {
            return 7;
        }
        if (i10 == 2) {
            return 6;
        }
        if (i10 == 3) {
            return 5;
        }
        if (i10 != 5) {
            return i10 != 6 ? 4 : 2;
        }
        return 3;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return C0075b.m455a(toLevel(), true);
    }
}
