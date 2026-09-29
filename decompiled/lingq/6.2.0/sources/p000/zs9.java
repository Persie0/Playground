package p000;

import androidx.compose.foundation.text.selection.SelectedTextType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class zs9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f72112a;

    static {
        int[] iArr = new int[SelectedTextType.values().length];
        try {
            iArr[SelectedTextType.EditableText.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectedTextType.StaticText.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f72112a = iArr;
    }
}
