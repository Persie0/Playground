package p387t0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import dm.C5207g;
import p375s0.C8941c;
import p375s0.C8942d;
import p470x1.C10020h;
import p470x1.C10022j;
import sl.C9072e;

/* JADX INFO: renamed from: t0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9139d implements InterfaceC9165q {

    /* JADX INFO: renamed from: a */
    public Canvas f47644a = C9141e.f47648a;

    /* JADX INFO: renamed from: b */
    public final Rect f47645b = new Rect();

    /* JADX INFO: renamed from: c */
    public final Rect f47646c = new Rect();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p387t0.InterfaceC9165q
    /* JADX INFO: renamed from: a */
    public final void mo17417a(InterfaceC9138c0 interfaceC9138c0, int i10) {
        C5207g.m11111f(interfaceC9138c0, "path");
        Canvas canvas = this.f47644a;
        if (!(interfaceC9138c0 instanceof C9151j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C9151j) interfaceC9138c0).f47676a, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p387t0.InterfaceC9165q
    /* JADX INFO: renamed from: b */
    public final void mo17418b(float f3, long j10, C9147h c9147h) {
        this.f47644a.drawCircle(C8941c.m17164c(j10), C8941c.m17165d(j10), f3, c9147h.f47651a);
    }

    @Override // p387t0.InterfaceC9165q
    /* JADX INFO: renamed from: c */
    public final void mo17419c(float f3, float f10, float f11, float f12, C9147h c9147h) {
        C5207g.m11111f(c9147h, "paint");
        this.f47644a.drawRect(f3, f10, f11, f12, c9147h.f47651a);
    }

    @Override // p387t0.InterfaceC9165q
    /* JADX INFO: renamed from: d */
    public final void mo17420d() {
        this.f47644a.save();
    }

    @Override // p387t0.InterfaceC9165q
    /* JADX INFO: renamed from: f */
    public final void mo17421f() {
        C9167s.m17493a(this.f47644a, false);
    }

    @Override // p387t0.InterfaceC9165q
    /* JADX INFO: renamed from: h */
    public final void mo17422h(float f3, float f10, float f11, float f12, float f13, float f14, C9147h c9147h) {
        this.f47644a.drawRoundRect(f3, f10, f11, f12, f13, f14, c9147h.f47651a);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0092  */
    @Override // p387t0.InterfaceC9165q
    /* JADX INFO: renamed from: i */
    public final void mo17423i(float[] fArr) {
        boolean z10;
        boolean z11;
        int i10 = 0;
        loop0: while (true) {
            if (i10 >= 4) {
                z10 = true;
                break;
            }
            int i11 = 0;
            while (i11 < 4) {
                if (!(fArr[(i10 * 4) + i11] == (i10 == i11 ? 1.0f : 0.0f))) {
                    z10 = false;
                    break loop0;
                }
                i11++;
            }
            i10++;
        }
        if (z10) {
            return;
        }
        Matrix matrix = new Matrix();
        float f3 = fArr[2];
        if (f3 == 0.0f) {
            if (fArr[6] == 0.0f) {
                if (fArr[10] == 1.0f) {
                    if (fArr[14] == 0.0f) {
                        if (fArr[8] == 0.0f) {
                            if (fArr[9] == 0.0f) {
                                if (fArr[11] == 0.0f) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (!z11) {
            throw new IllegalArgumentException("Android does not support arbitrary transforms".toString());
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f20 = fArr[15];
        fArr[0] = f10;
        fArr[1] = f13;
        fArr[2] = f18;
        fArr[3] = f11;
        fArr[4] = f14;
        fArr[5] = f19;
        fArr[6] = f12;
        fArr[7] = f16;
        fArr[8] = f20;
        matrix.setValues(fArr);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f3;
        fArr[3] = f12;
        fArr[4] = f13;
        fArr[5] = f14;
        fArr[6] = f15;
        fArr[7] = f16;
        fArr[8] = f17;
        this.f47644a.concat(matrix);
    }

    @Override // p387t0.InterfaceC9165q
    /* JADX INFO: renamed from: k */
    public final void mo17424k(InterfaceC9174z interfaceC9174z, long j10, long j11, long j12, long j13, C9147h c9147h) {
        C5207g.m11111f(interfaceC9174z, "image");
        Canvas canvas = this.f47644a;
        if (!(interfaceC9174z instanceof C9143f)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        int i10 = C10020h.f50974c;
        int i11 = (int) (j10 >> 32);
        Rect rect = this.f47645b;
        rect.left = i11;
        rect.top = C10020h.m18625a(j10);
        rect.right = i11 + ((int) (j11 >> 32));
        rect.bottom = C10022j.m18628b(j11) + C10020h.m18625a(j10);
        C9072e c9072e = C9072e.f47360a;
        int i12 = (int) (j12 >> 32);
        Rect rect2 = this.f47646c;
        rect2.left = i12;
        rect2.top = C10020h.m18625a(j12);
        rect2.right = i12 + ((int) (j13 >> 32));
        rect2.bottom = C10022j.m18628b(j13) + C10020h.m18625a(j12);
        canvas.drawBitmap(((C9143f) interfaceC9174z).f47649a, rect, rect2, c9147h.f47651a);
    }

    @Override // p387t0.InterfaceC9165q
    /* JADX INFO: renamed from: l */
    public final void mo17425l() {
        this.f47644a.scale(-1.0f, 1.0f);
    }

    @Override // p387t0.InterfaceC9165q
    /* JADX INFO: renamed from: m */
    public final void mo17426m(float f3, float f10, float f11, float f12, int i10) {
        this.f47644a.clipRect(f3, f10, f11, f12, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p387t0.InterfaceC9165q
    /* JADX INFO: renamed from: n */
    public final void mo17427n(float f3, float f10) {
        this.f47644a.translate(f3, f10);
    }

    @Override // p387t0.InterfaceC9165q
    /* JADX INFO: renamed from: o */
    public final void mo17428o() {
        this.f47644a.restore();
    }

    @Override // p387t0.InterfaceC9165q
    /* JADX INFO: renamed from: p */
    public final void mo17429p(C8942d c8942d, InterfaceC9136b0 interfaceC9136b0) {
        this.f47644a.saveLayer(c8942d.f46894a, c8942d.f46895b, c8942d.f46896c, c8942d.f46897d, interfaceC9136b0.mo17402a(), 31);
    }

    @Override // p387t0.InterfaceC9165q
    /* JADX INFO: renamed from: q */
    public final void mo17430q() {
        C9167s.m17493a(this.f47644a, true);
    }

    @Override // p387t0.InterfaceC9165q
    /* JADX INFO: renamed from: r */
    public final void mo17431r(InterfaceC9138c0 interfaceC9138c0, C9147h c9147h) {
        C5207g.m11111f(interfaceC9138c0, "path");
        Canvas canvas = this.f47644a;
        if (!(interfaceC9138c0 instanceof C9151j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C9151j) interfaceC9138c0).f47676a, c9147h.f47651a);
    }

    /* JADX INFO: renamed from: s */
    public final Canvas m17432s() {
        return this.f47644a;
    }

    /* JADX INFO: renamed from: t */
    public final void m17433t(Canvas canvas) {
        C5207g.m11111f(canvas, "<set-?>");
        this.f47644a = canvas;
    }
}
