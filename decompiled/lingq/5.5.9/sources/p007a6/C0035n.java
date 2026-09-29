package p007a6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p407u5.C9453d;
import p407u5.InterfaceC9452c;

/* JADX INFO: renamed from: a6.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0035n {

    /* JADX INFO: renamed from: a */
    public static final a f31a = new a();

    /* JADX INFO: renamed from: a6.n$a */
    public class a extends C9453d {
        @Override // p407u5.C9453d, p407u5.InterfaceC9452c
        /* JADX INFO: renamed from: d */
        public final void mo164d(Bitmap bitmap) {
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C0028g m163a(InterfaceC9452c interfaceC9452c, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i10 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i11 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i10 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i11 = current.getIntrinsicHeight();
                    }
                    Lock lock = C0043v.f54d;
                    lock.lock();
                    Bitmap bitmapMo17857e = interfaceC9452c.mo17857e(i10, i11, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapMo17857e);
                        current.setBounds(0, 0, i10, i11);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapMo17857e;
                    } catch (Throwable th2) {
                        lock.unlock();
                        throw th2;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
                z10 = true;
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z10 = true;
        }
        if (!z10) {
            interfaceC9452c = f31a;
        }
        return C0028g.m155e(bitmap, interfaceC9452c);
    }
}
