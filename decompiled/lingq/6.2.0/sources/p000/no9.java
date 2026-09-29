package p000;

import androidx.compose.p002ui.input.pointer.PointerEventPass;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class no9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f53067a;

    static {
        int[] iArr = new int[PointerEventPass.values().length];
        try {
            iArr[PointerEventPass.Initial.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PointerEventPass.Final.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PointerEventPass.Main.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f53067a = iArr;
    }
}
