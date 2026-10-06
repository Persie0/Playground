package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imq {

    /* JADX INFO: renamed from: a */
    private static final nbh f31538a = nbh.m17259h("com/google/android/apps/camera/util/BitmapUtils");

    /* JADX INFO: renamed from: b */
    private static final mxk f31539b = mxk.m17139K(kei.TOP_RIGHT, kei.BOTTOM_LEFT, kei.LEFT_TOP, kei.RIGHT_BOTTOM);

    /* JADX INFO: renamed from: a */
    public static Bitmap m11478a(Bitmap bitmap, int i) {
        return m11479b(bitmap, i, false);
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m11479b(Bitmap bitmap, int i, boolean z) {
        if (i == 0) {
            if (!z) {
                return bitmap;
            }
            i = 0;
            z = true;
        }
        if (bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
            i = (i + 360) % 360;
            if (i == 0 || i == 180) {
                matrix.postTranslate(bitmap.getWidth(), 0.0f);
            } else {
                if (i != 90 && i != 270) {
                    throw new IllegalArgumentException("Invalid degrees=" + i);
                }
                matrix.postTranslate(bitmap.getHeight(), 0.0f);
            }
        }
        if (i != 0) {
            matrix.postRotate(i, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (bitmap == bitmapCreateBitmap) {
                return bitmap;
            }
            bitmap.recycle();
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError e) {
            return bitmap;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m11480c(byte[] bArr) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (!options.mCancel && options.outWidth != -1 && options.outHeight != -1) {
                double d = options.outWidth;
                double d2 = options.outHeight;
                Double.isNaN(d);
                Double.isNaN(d2);
                int iCeil = (int) Math.ceil(Math.sqrt((d * d2) / 51200.0d));
                if (iCeil <= 8) {
                    while (i < iCeil) {
                        i += i;
                    }
                } else {
                    i = ((iCeil + 7) / 8) * 8;
                }
                options.inSampleSize = i;
                options.inJustDecodeBounds = false;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                kei keiVar = kei.TOP_LEFT;
                kei keiVarM14034c = kei.m14034c(kep.m14063a(bArr));
                if (keiVarM14034c != null && keiVarM14034c != kei.TOP_LEFT) {
                    return m11479b(bitmapDecodeByteArray, kei.m14032a(keiVarM14034c).f35503e, f31539b.contains(keiVarM14034c));
                }
                return bitmapDecodeByteArray;
            }
            return null;
        } catch (OutOfMemoryError e) {
            ((nbe) ((nbe) ((nbe) f31538a.m17251b()).mo17283h(e)).mo17276G((char) 4331)).mo17290o("Got oom exception ");
            return null;
        }
    }
}
