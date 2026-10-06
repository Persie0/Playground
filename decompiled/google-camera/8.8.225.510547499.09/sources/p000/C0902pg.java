package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: pg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0902pg extends Drawable {

    /* JADX INFO: renamed from: a */
    private final Path f47411a;

    public C0902pg() {
        new Handler(Looper.getMainLooper());
        new Rect();
        new Rect();
        this.f47411a = new Path();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.f47411a.reset();
        this.f47411a.addOval(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
