package p000;

import androidx.glance.Visibility;

/* JADX INFO: renamed from: st */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3586st {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f61375a;

    static {
        int[] iArr = new int[Visibility.values().length];
        try {
            iArr[Visibility.Visible.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Visibility.Invisible.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Visibility.Gone.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f61375a = iArr;
    }
}
