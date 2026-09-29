package p000;

import androidx.compose.foundation.text.Handle;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class rv9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f59883a;

    static {
        int[] iArr = new int[Handle.values().length];
        try {
            iArr[Handle.Cursor.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Handle.SelectionStart.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Handle.SelectionEnd.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f59883a = iArr;
    }
}
