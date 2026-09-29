package p388t1;

import ae.C0062b;
import android.graphics.Paint;
import android.support.v4.media.AbstractC0140a;
import android.text.TextPaint;
import dm.C5207g;
import p338qd.C8584v;
import p375s0.C8941c;
import p375s0.C8944f;
import p387t0.AbstractC9150i0;
import p387t0.AbstractC9161o;
import p387t0.C9147h;
import p387t0.C9152j0;
import p387t0.C9156l0;
import p387t0.C9169u;
import p424v0.C9623g;
import p424v0.C9624h;
import p445w1.C9798h;

/* JADX INFO: renamed from: t1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9177c extends TextPaint {

    /* JADX INFO: renamed from: a */
    public final C9147h f47711a;

    /* JADX INFO: renamed from: b */
    public C9798h f47712b;

    /* JADX INFO: renamed from: c */
    public C9152j0 f47713c;

    /* JADX INFO: renamed from: d */
    public AbstractC0140a f47714d;

    public C9177c(float f3) {
        super(1);
        ((TextPaint) this).density = f3;
        this.f47711a = new C9147h(this);
        this.f47712b = C9798h.f49911b;
        this.f47713c = C9152j0.f47679d;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX INFO: renamed from: a */
    public final void m17507a(AbstractC9161o abstractC9161o, long j10, float f3) {
        boolean z10 = abstractC9161o instanceof C9156l0;
        boolean z11 = true;
        C9147h c9147h = this.f47711a;
        if (!z10) {
            if (abstractC9161o instanceof AbstractC9150i0) {
                if (j10 != C8944f.f46907c) {
                    z11 = false;
                }
                if (z11) {
                }
            }
            if (abstractC9161o == null) {
                c9147h.m17446h(null);
                return;
            }
            return;
        }
        if (!(((C9156l0) abstractC9161o).f47684a != C9169u.f47703f)) {
            if (abstractC9161o instanceof AbstractC9150i0) {
                if (j10 != C8944f.f46907c) {
                    z11 = false;
                }
                if (z11) {
                }
            }
            if (abstractC9161o == null) {
                c9147h.m17446h(null);
                return;
            }
            return;
        }
        abstractC9161o.mo17468a(Float.isNaN(f3) ? c9147h.m17440b() : C0062b.m357j0(f3, 0.0f, 1.0f), j10, c9147h);
    }

    /* JADX INFO: renamed from: b */
    public final void m17508b(AbstractC0140a abstractC0140a) {
        if (abstractC0140a == null) {
            return;
        }
        if (!C5207g.m11106a(this.f47714d, abstractC0140a)) {
            this.f47714d = abstractC0140a;
            boolean zM11106a = C5207g.m11106a(abstractC0140a, C9623g.f49295a);
            C9147h c9147h = this.f47711a;
            if (zM11106a) {
                c9147h.m17449k(0);
                return;
            }
            if (abstractC0140a instanceof C9624h) {
                c9147h.m17449k(1);
                C9624h c9624h = (C9624h) abstractC0140a;
                Paint paint = c9147h.f47651a;
                C5207g.m11111f(paint, "<this>");
                paint.setStrokeWidth(c9624h.f49296a);
                Paint paint2 = c9147h.f47651a;
                C5207g.m11111f(paint2, "<this>");
                paint2.setStrokeMiter(c9624h.f49297b);
                c9147h.m17448j(c9624h.f49299d);
                c9147h.m17447i(c9624h.f49298c);
                Paint paint3 = c9147h.f47651a;
                C5207g.m11111f(paint3, "<this>");
                paint3.setPathEffect(null);
                c9624h.getClass();
                c9147h.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17509c(C9152j0 c9152j0) {
        if (c9152j0 == null || C5207g.m11106a(this.f47713c, c9152j0)) {
            return;
        }
        this.f47713c = c9152j0;
        if (C5207g.m11106a(c9152j0, C9152j0.f47679d)) {
            clearShadowLayer();
            return;
        }
        C9152j0 c9152j1 = this.f47713c;
        float f3 = c9152j1.f47682c;
        if (f3 == 0.0f) {
            f3 = Float.MIN_VALUE;
        }
        setShadowLayer(f3, C8941c.m17164c(c9152j1.f47681b), C8941c.m17165d(this.f47713c.f47681b), C8584v.m16780C(this.f47713c.f47680a));
    }

    /* JADX INFO: renamed from: d */
    public final void m17510d(C9798h c9798h) {
        if (c9798h == null) {
            return;
        }
        if (!C5207g.m11106a(this.f47712b, c9798h)) {
            this.f47712b = c9798h;
            setUnderlineText(c9798h.m18285a(C9798h.f49912c));
            setStrikeThruText(this.f47712b.m18285a(C9798h.f49913d));
        }
    }
}
