package p000;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.accompanist.drawablepainter.AbstractC0942b;
import com.google.accompanist.drawablepainter.C0941a;

/* JADX INFO: renamed from: lm */
/* JADX INFO: loaded from: classes2.dex */
public final class C3303lm implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49811a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f49812b;

    public /* synthetic */ C3303lm(Object obj, int i) {
        this.f49811a = i;
        this.f49812b = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        int i = this.f49811a;
        Object obj = this.f49812b;
        switch (i) {
            case 0:
                ((C3465pm) obj).invalidateSelf();
                break;
            default:
                drawable.getClass();
                C0941a c0941a = (C0941a) obj;
                t66 t66Var = c0941a.f11533f;
                ((xc9) t66Var).setValue(Integer.valueOf(((Number) ((xc9) t66Var).getValue()).intValue() + 1));
                Drawable drawable2 = c0941a.f11532e;
                cs4 cs4Var = AbstractC0942b.f11536a;
                ((xc9) c0941a.f11534g).setValue(new x89((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : do7.m10528d(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f49811a) {
            case 0:
                ((C3465pm) this.f49812b).scheduleSelf(runnable, j);
                break;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) AbstractC0942b.f11536a.getValue()).postAtTime(runnable, j);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f49811a) {
            case 0:
                ((C3465pm) this.f49812b).unscheduleSelf(runnable);
                break;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) AbstractC0942b.f11536a.getValue()).removeCallbacks(runnable);
                break;
        }
    }
}
