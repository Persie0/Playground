package p000;

import com.facebook.internal.instrument.InstrumentData$Type;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class p74 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f55693a;

    static {
        int[] iArr = new int[InstrumentData$Type.values().length];
        try {
            iArr[InstrumentData$Type.Analysis.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InstrumentData$Type.AnrReport.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InstrumentData$Type.CrashReport.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InstrumentData$Type.CrashShield.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InstrumentData$Type.ThreadCheck.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f55693a = iArr;
    }
}
