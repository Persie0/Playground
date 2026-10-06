package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mjz extends mjw {

    /* JADX INFO: renamed from: a */
    public final mjx f40793a;

    /* JADX INFO: renamed from: b */
    public final mjy f40794b;

    public mjz(Context context, mjj mjjVar, mjx mjxVar, mjy mjyVar) {
        super(context, mjjVar);
        this.f40793a = mjxVar;
        mjxVar.f40789b = this;
        this.f40794b = mjyVar;
        mjyVar.f40790j = this;
    }

    @Override // p000.mjw
    /* JADX INFO: renamed from: b */
    public final boolean mo16465b(boolean z, boolean z2, boolean z3) {
        boolean zMo16465b = super.mo16465b(z, z2, z3);
        if (!isRunning()) {
            this.f40794b.mo16459a();
        }
        lij.m15397E(this.f40781d.getContentResolver());
        if (z && z3) {
            this.f40794b.mo16462d();
        }
        return zMo16465b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.f40793a.m16476f(canvas, getBounds(), m16468c());
        this.f40793a.mo16458e(canvas, this.f40785h);
        int i = 0;
        while (true) {
            mjy mjyVar = this.f40794b;
            int[] iArr = mjyVar.f40792l;
            if (i >= iArr.length) {
                canvas.restore();
                return;
            }
            mjx mjxVar = this.f40793a;
            Paint paint = this.f40785h;
            float[] fArr = mjyVar.f40791k;
            int i2 = i + i;
            mjxVar.mo16457d(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f40793a.mo16454a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f40793a.mo16455b();
    }

    @Override // p000.mjw, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }
}
