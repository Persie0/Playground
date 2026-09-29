package p000;

import androidx.compose.foundation.style.StyleAnimations$EntryState;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class wl9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f67020a;

    static {
        int[] iArr = new int[StyleAnimations$EntryState.values().length];
        try {
            iArr[StyleAnimations$EntryState.Inserted.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StyleAnimations$EntryState.Unchanged.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StyleAnimations$EntryState.Changed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StyleAnimations$EntryState.Untouched.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f67020a = iArr;
    }
}
