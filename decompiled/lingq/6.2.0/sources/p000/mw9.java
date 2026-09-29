package p000;

import com.airbnb.lottie.model.DocumentData$Justification;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class mw9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f51976a;

    static {
        int[] iArr = new int[DocumentData$Justification.values().length];
        f51976a = iArr;
        try {
            iArr[DocumentData$Justification.LEFT_ALIGN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f51976a[DocumentData$Justification.RIGHT_ALIGN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f51976a[DocumentData$Justification.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
