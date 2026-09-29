package p386t;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.p017ui.platform.AbstractC0664t0;
import androidx.compose.p017ui.platform.C0661s0;
import cm.InterfaceC2052l;
import dm.C5207g;
import p327q0.InterfaceC8460f;
import p375s0.C8944f;
import p387t0.C9139d;
import p387t0.C9141e;
import p387t0.InterfaceC9165q;
import p424v0.InterfaceC9619c;
import sl.C9072e;

/* JADX INFO: renamed from: t.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9117i extends AbstractC0664t0 implements InterfaceC8460f {

    /* JADX INFO: renamed from: b */
    public final AndroidEdgeEffectOverscrollEffect f47622b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9117i(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, InterfaceC2052l<? super C0661s0, C9072e> interfaceC2052l) {
        super(interfaceC2052l);
        C5207g.m11111f(androidEdgeEffectOverscrollEffect, "overscrollEffect");
        C5207g.m11111f(interfaceC2052l, "inspectorInfo");
        this.f47622b = androidEdgeEffectOverscrollEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9117i)) {
            return false;
        }
        return C5207g.m11106a(this.f47622b, ((C9117i) obj).f47622b);
    }

    public final int hashCode() {
        return this.f47622b.hashCode();
    }

    @Override // p327q0.InterfaceC8460f
    /* JADX INFO: renamed from: s */
    public final void mo16542s(InterfaceC9619c interfaceC9619c) {
        boolean zM1400g;
        C5207g.m11111f(interfaceC9619c, "<this>");
        interfaceC9619c.mo12668E0();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.f47622b;
        androidEdgeEffectOverscrollEffect.getClass();
        if (C8944f.m17178e(androidEdgeEffectOverscrollEffect.f1683o)) {
            return;
        }
        InterfaceC9165q interfaceC9165qMo18080b = interfaceC9619c.mo12676l0().mo18080b();
        androidEdgeEffectOverscrollEffect.f1680l.getValue();
        Canvas canvas = C9141e.f47648a;
        C5207g.m11111f(interfaceC9165qMo18080b, "<this>");
        Canvas canvas2 = ((C9139d) interfaceC9165qMo18080b).f47644a;
        EdgeEffect edgeEffect = androidEdgeEffectOverscrollEffect.f1678j;
        boolean z10 = true;
        if (!(C9118j.m17361b(edgeEffect) == 0.0f)) {
            androidEdgeEffectOverscrollEffect.m1401h(interfaceC9619c, edgeEffect, canvas2);
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = androidEdgeEffectOverscrollEffect.f1673e;
        if (edgeEffect2.isFinished()) {
            zM1400g = false;
        } else {
            zM1400g = androidEdgeEffectOverscrollEffect.m1400g(interfaceC9619c, edgeEffect2, canvas2);
            C9118j.m17362c(edgeEffect, C9118j.m17361b(edgeEffect2));
        }
        EdgeEffect edgeEffect3 = androidEdgeEffectOverscrollEffect.f1676h;
        if (!(C9118j.m17361b(edgeEffect3) == 0.0f)) {
            androidEdgeEffectOverscrollEffect.m1399f(interfaceC9619c, edgeEffect3, canvas2);
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = androidEdgeEffectOverscrollEffect.f1671c;
        boolean zIsFinished = edgeEffect4.isFinished();
        C9131w c9131w = androidEdgeEffectOverscrollEffect.f1669a;
        if (!zIsFinished) {
            int iSave = canvas2.save();
            canvas2.translate(0.0f, interfaceC9619c.mo1463i0(c9131w.f47640b.mo18277d()));
            boolean zDraw = edgeEffect4.draw(canvas2);
            canvas2.restoreToCount(iSave);
            zM1400g = zDraw || zM1400g;
            C9118j.m17362c(edgeEffect3, C9118j.m17361b(edgeEffect4));
        }
        EdgeEffect edgeEffect5 = androidEdgeEffectOverscrollEffect.f1679k;
        if (!(C9118j.m17361b(edgeEffect5) == 0.0f)) {
            androidEdgeEffectOverscrollEffect.m1400g(interfaceC9619c, edgeEffect5, canvas2);
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = androidEdgeEffectOverscrollEffect.f1674f;
        if (!edgeEffect6.isFinished()) {
            zM1400g = androidEdgeEffectOverscrollEffect.m1401h(interfaceC9619c, edgeEffect6, canvas2) || zM1400g;
            C9118j.m17362c(edgeEffect5, C9118j.m17361b(edgeEffect6));
        }
        EdgeEffect edgeEffect7 = androidEdgeEffectOverscrollEffect.f1677i;
        if (!(C9118j.m17361b(edgeEffect7) == 0.0f)) {
            int iSave2 = canvas2.save();
            canvas2.translate(0.0f, interfaceC9619c.mo1463i0(c9131w.f47640b.mo18277d()));
            edgeEffect7.draw(canvas2);
            canvas2.restoreToCount(iSave2);
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = androidEdgeEffectOverscrollEffect.f1672d;
        if (!edgeEffect8.isFinished()) {
            if (!androidEdgeEffectOverscrollEffect.m1399f(interfaceC9619c, edgeEffect8, canvas2) && !zM1400g) {
                z10 = false;
            }
            C9118j.m17362c(edgeEffect7, C9118j.m17361b(edgeEffect8));
            zM1400g = z10;
        }
        if (zM1400g) {
            androidEdgeEffectOverscrollEffect.m1402i();
        }
    }

    public final String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f47622b + ')';
    }
}
