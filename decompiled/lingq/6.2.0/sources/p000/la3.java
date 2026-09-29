package p000;

import androidx.compose.p002ui.focus.FocusStateImpl;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class la3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f49363a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f49364b;

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
        f49363a = iArr;
        int[] iArr2 = new int[FocusStateImpl.values().length];
        try {
            iArr2[FocusStateImpl.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[FocusStateImpl.Captured.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f49364b = iArr2;
    }
}
