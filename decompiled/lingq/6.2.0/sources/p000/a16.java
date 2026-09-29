package p000;

import androidx.loader.content.ModernAsyncTask$Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a16 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f64a;

    static {
        int[] iArr = new int[ModernAsyncTask$Status.values().length];
        f64a = iArr;
        try {
            iArr[ModernAsyncTask$Status.RUNNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f64a[ModernAsyncTask$Status.FINISHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
