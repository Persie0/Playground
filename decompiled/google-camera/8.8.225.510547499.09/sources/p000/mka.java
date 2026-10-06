package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mka extends mjx {

    /* JADX INFO: renamed from: c */
    private float f40811c;

    /* JADX INFO: renamed from: d */
    private float f40812d;

    /* JADX INFO: renamed from: e */
    private float f40813e;

    public mka(mki mkiVar) {
        super(mkiVar);
        this.f40811c = 300.0f;
    }

    @Override // p000.mjx
    /* JADX INFO: renamed from: a */
    public final int mo16454a() {
        return ((mki) this.f40788a).f40741a;
    }

    @Override // p000.mjx
    /* JADX INFO: renamed from: b */
    public final int mo16455b() {
        return -1;
    }

    @Override // p000.mjx
    /* JADX INFO: renamed from: c */
    public final void mo16456c(Canvas canvas, Rect rect, float f) {
        this.f40811c = rect.width();
        float f2 = ((mki) this.f40788a).f40741a;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - ((mki) this.f40788a).f40741a) / 2.0f));
        if (((mki) this.f40788a).f40838i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f40789b.m16472g() && ((mki) this.f40788a).f40745e == 1) || (this.f40789b.m16471f() && ((mki) this.f40788a).f40746f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f40789b.m16472g() || this.f40789b.m16471f()) {
            canvas.translate(0.0f, (((mki) this.f40788a).f40741a * ((-1.0f) + f)) / 2.0f);
        }
        float f3 = this.f40811c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        mki mkiVar = (mki) this.f40788a;
        this.f40812d = mkiVar.f40741a * f;
        this.f40813e = mkiVar.f40742b * f;
    }

    @Override // p000.mjx
    /* JADX INFO: renamed from: d */
    public final void mo16457d(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.f40811c;
        float f4 = -f3;
        float f5 = this.f40813e;
        float f6 = f5 + f5;
        float f7 = f3 - f6;
        float f8 = f4 / 2.0f;
        float f9 = f * f7;
        float f10 = f2 * f7;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f11 = this.f40812d;
        float f12 = f10 + f8 + f6;
        float f13 = f8 + f9;
        RectF rectF = new RectF(f13, (-f11) / 2.0f, f12, f11 / 2.0f);
        float f14 = this.f40813e;
        canvas.drawRoundRect(rectF, f14, f14, paint);
    }

    @Override // p000.mjx
    /* JADX INFO: renamed from: e */
    public final void mo16458e(Canvas canvas, Paint paint) {
        int iM15023p = kxk.m15023p(((mki) this.f40788a).f40744d, this.f40789b.f40786i);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iM15023p);
        float f = this.f40811c;
        float f2 = this.f40812d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f40813e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }
}
