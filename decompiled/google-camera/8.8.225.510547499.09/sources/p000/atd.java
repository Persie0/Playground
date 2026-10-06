package p000;

import android.graphics.drawable.Drawable;
import android.support.wearable.view.CircledImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class atd implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f2294a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f2295b;

    public atd(CircledImageView circledImageView, int i) {
        this.f2295b = i;
        this.f2294a = circledImageView;
    }

    public atd(androidx.wear.widget.CircledImageView circledImageView, int i) {
        this.f2295b = i;
        this.f2294a = circledImageView;
    }

    public atd(ati atiVar, int i) {
        this.f2295b = i;
        this.f2294a = atiVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f2295b) {
            case 0:
                ((ati) this.f2294a).scheduleSelf(runnable, j);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f2295b) {
            case 0:
                ((ati) this.f2294a).unscheduleSelf(runnable);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f2295b) {
            case 0:
                ((ati) this.f2294a).invalidateSelf();
                break;
            case 1:
                ((CircledImageView) this.f2294a).invalidate();
                break;
            default:
                ((androidx.wear.widget.CircledImageView) this.f2294a).invalidate();
                break;
        }
    }
}
