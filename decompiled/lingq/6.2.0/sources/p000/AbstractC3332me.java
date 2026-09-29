package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: renamed from: me */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3332me {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f51191a;

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
        f51191a = iArr;
    }
}
