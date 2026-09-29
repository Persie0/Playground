package p000;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class pt0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f56777a;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        f56777a = iArr;
        try {
            iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f56777a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
