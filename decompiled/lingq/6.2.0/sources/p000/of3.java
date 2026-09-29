package p000;

import androidx.lifecycle.Lifecycle$State;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class of3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f54264a;

    static {
        int[] iArr = new int[Lifecycle$State.values().length];
        f54264a = iArr;
        try {
            iArr[Lifecycle$State.RESUMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f54264a[Lifecycle$State.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f54264a[Lifecycle$State.CREATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f54264a[Lifecycle$State.INITIALIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
