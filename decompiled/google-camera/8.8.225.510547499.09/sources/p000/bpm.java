package p000;

import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class bpm {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f4068a;

    /* JADX INFO: renamed from: b */
    static final /* synthetic */ int[] f4069b;

    static {
        int[] iArr = new int[bpe.values().length];
        f4069b = iArr;
        try {
            iArr[bpe.LOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f4069b[bpe.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f4069b[bpe.HIGH.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f4069b[bpe.IMMEDIATE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        f4068a = iArr2;
        try {
            iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f4068a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f4068a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError e7) {
        }
        try {
            f4068a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
        } catch (NoSuchFieldError e8) {
        }
        try {
            f4068a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
        } catch (NoSuchFieldError e9) {
        }
        try {
            f4068a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
        } catch (NoSuchFieldError e10) {
        }
        try {
            f4068a[ImageView.ScaleType.CENTER.ordinal()] = 7;
        } catch (NoSuchFieldError e11) {
        }
        try {
            f4068a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
        } catch (NoSuchFieldError e12) {
        }
    }
}
