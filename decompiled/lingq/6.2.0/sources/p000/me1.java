package p000;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes2.dex */
public final class me1 extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a */
    public final ib2 f51193a;

    /* JADX INFO: renamed from: b */
    public final long f51194b;

    /* JADX INFO: renamed from: c */
    public final vi3 f51195c;

    public me1(ib2 ib2Var, long j, vi3 vi3Var) {
        this.f51193a = ib2Var;
        this.f51194b = j;
        this.f51195c = vi3Var;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        an0 an0Var = new an0();
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        Canvas canvas2 = AbstractC3497qg.f57736a;
        C3459pg c3459pg = new C3459pg();
        c3459pg.f56079a = canvas;
        zm0 zm0Var = an0Var.f852a;
        fb2 fb2Var = zm0Var.f71734a;
        LayoutDirection layoutDirection2 = zm0Var.f71735b;
        ym0 ym0Var = zm0Var.f71736c;
        long j = zm0Var.f71737d;
        zm0Var.f71734a = this.f51193a;
        zm0Var.f71735b = layoutDirection;
        zm0Var.f71736c = c3459pg;
        zm0Var.f71737d = this.f51194b;
        c3459pg.mo17016h();
        this.f51195c.invoke(an0Var);
        c3459pg.mo17024p();
        zm0Var.f71734a = fb2Var;
        zm0Var.f71735b = layoutDirection2;
        zm0Var.f71736c = ym0Var;
        zm0Var.f71737d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.f51194b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        ib2 ib2Var = this.f51193a;
        point.set(ib2Var.mo916w0(fIntBitsToFloat / ib2Var.mo594a()), ib2Var.mo916w0(Float.intBitsToFloat((int) (j & 4294967295L)) / ib2Var.mo594a()));
        point2.set(point.x / 2, point.y / 2);
    }
}
