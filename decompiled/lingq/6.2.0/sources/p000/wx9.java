package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class wx9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f67488a;

    static {
        int[] iArr = new int[LayoutDirection.values().length];
        try {
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f67488a = iArr;
    }
}
