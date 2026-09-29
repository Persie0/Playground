package p000;

import com.kochava.tracker.log.LogLevel;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class gj5 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f40875a;

    static {
        int[] iArr = new int[LogLevel.values().length];
        f40875a = iArr;
        try {
            iArr[LogLevel.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f40875a[LogLevel.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f40875a[LogLevel.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f40875a[LogLevel.INFO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f40875a[LogLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f40875a[LogLevel.TRACE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
