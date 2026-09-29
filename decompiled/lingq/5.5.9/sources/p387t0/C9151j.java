package p387t0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import dm.C5207g;
import p375s0.C8939a;
import p375s0.C8941c;
import p375s0.C8942d;
import p375s0.C8943e;

/* JADX INFO: renamed from: t0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9151j implements InterfaceC9138c0 {

    /* JADX INFO: renamed from: a */
    public final Path f47676a;

    /* JADX INFO: renamed from: b */
    public final RectF f47677b;

    /* JADX INFO: renamed from: c */
    public final float[] f47678c;

    public C9151j() {
        this(0);
    }

    public /* synthetic */ C9151j(int i10) {
        this(new Path());
    }

    public C9151j(Path path) {
        C5207g.m11111f(path, "internalPath");
        this.f47676a = path;
        this.f47677b = new RectF();
        this.f47678c = new float[8];
        new Matrix();
    }

    @Override // p387t0.InterfaceC9138c0
    /* JADX INFO: renamed from: a */
    public final boolean mo17405a() {
        return this.f47676a.isConvex();
    }

    @Override // p387t0.InterfaceC9138c0
    /* JADX INFO: renamed from: b */
    public final void mo17406b(float f3, float f10) {
        this.f47676a.rMoveTo(f3, f10);
    }

    @Override // p387t0.InterfaceC9138c0
    /* JADX INFO: renamed from: c */
    public final void mo17407c() {
        this.f47676a.reset();
    }

    @Override // p387t0.InterfaceC9138c0
    public final void close() {
        this.f47676a.close();
    }

    @Override // p387t0.InterfaceC9138c0
    /* JADX INFO: renamed from: d */
    public final void mo17408d(float f3, float f10, float f11, float f12, float f13, float f14) {
        this.f47676a.rCubicTo(f3, f10, f11, f12, f13, f14);
    }

    @Override // p387t0.InterfaceC9138c0
    /* JADX INFO: renamed from: e */
    public final void mo17409e(float f3, float f10, float f11, float f12) {
        this.f47676a.quadTo(f3, f10, f11, f12);
    }

    @Override // p387t0.InterfaceC9138c0
    /* JADX INFO: renamed from: f */
    public final void mo17410f(float f3, float f10, float f11, float f12) {
        this.f47676a.rQuadTo(f3, f10, f11, f12);
    }

    @Override // p387t0.InterfaceC9138c0
    /* JADX INFO: renamed from: g */
    public final boolean mo17411g(InterfaceC9138c0 interfaceC9138c0, InterfaceC9138c0 interfaceC9138c1, int i10) {
        Path.Op op;
        C5207g.m11111f(interfaceC9138c0, "path1");
        boolean z10 = false;
        if (i10 == 0) {
            op = Path.Op.DIFFERENCE;
        } else {
            if (i10 == 1) {
                op = Path.Op.INTERSECT;
            } else {
                if (i10 == 4) {
                    op = Path.Op.REVERSE_DIFFERENCE;
                } else {
                    if (i10 == 2) {
                        z10 = true;
                    }
                    op = z10 ? Path.Op.UNION : Path.Op.XOR;
                }
            }
        }
        if (!(interfaceC9138c0 instanceof C9151j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        C9151j c9151j = (C9151j) interfaceC9138c0;
        if (interfaceC9138c1 instanceof C9151j) {
            return this.f47676a.op(c9151j.f47676a, ((C9151j) interfaceC9138c1).f47676a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // p387t0.InterfaceC9138c0
    /* JADX INFO: renamed from: h */
    public final void mo17412h(float f3, float f10) {
        this.f47676a.moveTo(f3, f10);
    }

    @Override // p387t0.InterfaceC9138c0
    /* JADX INFO: renamed from: i */
    public final void mo17413i(float f3, float f10, float f11, float f12, float f13, float f14) {
        this.f47676a.cubicTo(f3, f10, f11, f12, f13, f14);
    }

    @Override // p387t0.InterfaceC9138c0
    /* JADX INFO: renamed from: j */
    public final void mo17414j(C8943e c8943e) {
        C5207g.m11111f(c8943e, "roundRect");
        RectF rectF = this.f47677b;
        rectF.set(c8943e.f46898a, c8943e.f46899b, c8943e.f46900c, c8943e.f46901d);
        long j10 = c8943e.f46902e;
        float fM17157b = C8939a.m17157b(j10);
        float[] fArr = this.f47678c;
        fArr[0] = fM17157b;
        fArr[1] = C8939a.m17158c(j10);
        long j11 = c8943e.f46903f;
        fArr[2] = C8939a.m17157b(j11);
        fArr[3] = C8939a.m17158c(j11);
        long j12 = c8943e.f46904g;
        fArr[4] = C8939a.m17157b(j12);
        fArr[5] = C8939a.m17158c(j12);
        long j13 = c8943e.f46905h;
        fArr[6] = C8939a.m17157b(j13);
        fArr[7] = C8939a.m17158c(j13);
        this.f47676a.addRoundRect(rectF, fArr, Path.Direction.CCW);
    }

    @Override // p387t0.InterfaceC9138c0
    /* JADX INFO: renamed from: k */
    public final void mo17415k(float f3, float f10) {
        this.f47676a.rLineTo(f3, f10);
    }

    @Override // p387t0.InterfaceC9138c0
    /* JADX INFO: renamed from: l */
    public final void mo17416l(float f3, float f10) {
        this.f47676a.lineTo(f3, f10);
    }

    /* JADX INFO: renamed from: m */
    public final void m17470m(InterfaceC9138c0 interfaceC9138c0, long j10) {
        C5207g.m11111f(interfaceC9138c0, "path");
        if (!(interfaceC9138c0 instanceof C9151j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f47676a.addPath(((C9151j) interfaceC9138c0).f47676a, C8941c.m17164c(j10), C8941c.m17165d(j10));
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: n */
    public final void m17471n(C8942d c8942d) {
        float f3 = c8942d.f46894a;
        if (!(!Float.isNaN(f3))) {
            throw new IllegalStateException("Rect.left is NaN".toString());
        }
        float f10 = c8942d.f46895b;
        if (!(!Float.isNaN(f10))) {
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        float f11 = c8942d.f46896c;
        if (!(!Float.isNaN(f11))) {
            throw new IllegalStateException("Rect.right is NaN".toString());
        }
        float f12 = c8942d.f46897d;
        if (!(!Float.isNaN(f12))) {
            throw new IllegalStateException("Rect.bottom is NaN".toString());
        }
        RectF rectF = this.f47677b;
        rectF.set(f3, f10, f11, f12);
        this.f47676a.addRect(rectF, Path.Direction.CCW);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m17472o() {
        return this.f47676a.isEmpty();
    }
}
