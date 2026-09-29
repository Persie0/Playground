package p000;

import androidx.compose.material3.SheetValue;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ch0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f10061a;

    static {
        int[] iArr = new int[SheetValue.values().length];
        try {
            iArr[SheetValue.Hidden.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SheetValue.Expanded.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f10061a = iArr;
    }
}
