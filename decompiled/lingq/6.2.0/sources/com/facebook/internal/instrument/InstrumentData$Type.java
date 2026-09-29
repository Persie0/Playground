package com.facebook.internal.instrument;

import p000.p74;

/* JADX INFO: loaded from: classes2.dex */
public enum InstrumentData$Type {
    Unknown,
    Analysis,
    AnrReport,
    CrashReport,
    CrashShield,
    ThreadCheck;

    public final String getLogPrefix() {
        int i = p74.f55693a[ordinal()];
        if (i == 1) {
            return "analysis_log_";
        }
        if (i == 2) {
            return "anr_log_";
        }
        if (i == 3) {
            return "crash_log_";
        }
        if (i != 4) {
            return i != 5 ? "Unknown" : "thread_check_log_";
        }
        return "shield_log_";
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = p74.f55693a[ordinal()];
        if (i == 1) {
            return "Analysis";
        }
        if (i == 2) {
            return "AnrReport";
        }
        if (i == 3) {
            return "CrashReport";
        }
        if (i != 4) {
            return i != 5 ? "Unknown" : "ThreadCheck";
        }
        return "CrashShield";
    }
}
