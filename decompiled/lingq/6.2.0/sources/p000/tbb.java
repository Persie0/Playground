package p000;

import androidx.lifecycle.Lifecycle$Event;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class tbb {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f62119a;

    static {
        int[] iArr = new int[Lifecycle$Event.values().length];
        try {
            iArr[Lifecycle$Event.ON_STOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Lifecycle$Event.ON_DESTROY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f62119a = iArr;
    }
}
