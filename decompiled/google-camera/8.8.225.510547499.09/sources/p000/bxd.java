package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bxd {

    /* JADX INFO: renamed from: a */
    private static final bti f4688a = new bxc();

    /* JADX INFO: renamed from: a */
    static bsz m3153a(bti btiVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + String.valueOf(current) + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                }
                bitmap = null;
            } else if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                if (current.getIntrinsicWidth() > 0) {
                    i = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i2 = current.getIntrinsicHeight();
                }
                Lock lock = bxq.f4717c;
                lock.lock();
                Bitmap bitmapMo3042a = btiVar.mo3042a(i, i2, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(bitmapMo3042a);
                    current.setBounds(0, 0, i, i2);
                    current.draw(canvas);
                    canvas.setBitmap(null);
                    lock.unlock();
                    bitmap = bitmapMo3042a;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            } else {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + String.valueOf(current) + hIAHJKEnGsNbz.tahH);
                }
                bitmap = null;
            }
            z = true;
        }
        if (!z) {
            btiVar = f4688a;
        }
        return bxk.m3162g(bitmap, btiVar);
    }
}
