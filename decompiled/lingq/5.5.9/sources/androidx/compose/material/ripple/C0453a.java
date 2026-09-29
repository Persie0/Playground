package androidx.compose.material.ripple;

import android.content.Context;
import android.graphics.Canvas;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import no.InterfaceC7882z;
import p021b0.AbstractC1283h;
import p021b0.C1278c;
import p021b0.C1279d;
import p021b0.C1280e;
import p021b0.C1281f;
import p021b0.C1282g;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5338t0;
import p338qd.C8573r0;
import p375s0.C8944f;
import p385sf.C9000b;
import p387t0.C9139d;
import p387t0.C9141e;
import p387t0.C9169u;
import p387t0.InterfaceC9165q;
import p423v.C9615m;
import p424v0.InterfaceC9619c;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.material.ripple.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0453a extends AbstractC1283h implements InterfaceC5338t0 {

    /* JADX INFO: renamed from: b */
    public final boolean f2629b;

    /* JADX INFO: renamed from: c */
    public final float f2630c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5301c1<C9169u> f2631d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5301c1<C1278c> f2632e;

    /* JADX INFO: renamed from: f */
    public final C1280e f2633f;

    /* JADX INFO: renamed from: g */
    public final ParcelableSnapshotMutableState f2634g;

    /* JADX INFO: renamed from: h */
    public final ParcelableSnapshotMutableState f2635h;

    /* JADX INFO: renamed from: i */
    public long f2636i;

    /* JADX INFO: renamed from: j */
    public int f2637j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2041a<C9072e> f2638k;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C0453a() {
        throw null;
    }

    public C0453a(boolean z10, float f3, InterfaceC5312g0 interfaceC5312g0, InterfaceC5312g0 interfaceC5312g1, C1280e c1280e) {
        super(interfaceC5312g1, z10);
        this.f2629b = z10;
        this.f2630c = f3;
        this.f2631d = interfaceC5312g0;
        this.f2632e = interfaceC5312g1;
        this.f2633f = c1280e;
        this.f2634g = C8573r0.m16684L0(null);
        this.f2635h = C8573r0.m16684L0(Boolean.TRUE);
        this.f2636i = C8944f.f46906b;
        this.f2637j = -1;
        this.f2638k = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.material.ripple.AndroidRippleIndicationInstance$onInvalidateRipple$1
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                C0453a c0453a = this.f2574b;
                c0453a.f2635h.setValue(Boolean.valueOf(!((Boolean) c0453a.f2635h.getValue()).booleanValue()));
                return C9072e.f47360a;
            }
        };
    }

    @Override // p081e0.InterfaceC5338t0
    /* JADX INFO: renamed from: a */
    public final void mo1536a() {
        m1551h();
    }

    @Override // p081e0.InterfaceC5338t0
    /* JADX INFO: renamed from: b */
    public final void mo1537b() {
        m1551h();
    }

    @Override // p081e0.InterfaceC5338t0
    /* JADX INFO: renamed from: c */
    public final void mo1538c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p386t.InterfaceC9127s
    /* JADX INFO: renamed from: d */
    public final void mo1547d(InterfaceC9619c interfaceC9619c) {
        C5207g.m11111f(interfaceC9619c, "<this>");
        this.f2636i = interfaceC9619c.mo12674d();
        float f3 = this.f2630c;
        this.f2637j = Float.isNaN(f3) ? C8573r0.m16710Y0(C1279d.m4782a(interfaceC9619c, this.f2629b, interfaceC9619c.mo12674d())) : interfaceC9619c.mo1464s0(f3);
        long j10 = this.f2631d.getValue().f47705a;
        float f10 = this.f2632e.getValue().f7960d;
        interfaceC9619c.mo12668E0();
        m4788f(interfaceC9619c, f3, j10);
        InterfaceC9165q interfaceC9165qMo18080b = interfaceC9619c.mo12676l0().mo18080b();
        ((Boolean) this.f2635h.getValue()).booleanValue();
        C1282g c1282g = (C1282g) this.f2634g.getValue();
        if (c1282g != null) {
            c1282g.m4787e(f10, this.f2637j, interfaceC9619c.mo12674d(), j10);
            Canvas canvas = C9141e.f47648a;
            C5207g.m11111f(interfaceC9165qMo18080b, "<this>");
            c1282g.draw(((C9139d) interfaceC9165qMo18080b).f47644a);
        }
    }

    @Override // p021b0.AbstractC1283h
    /* JADX INFO: renamed from: e */
    public final void mo1548e(C9615m c9615m, InterfaceC7882z interfaceC7882z) {
        C5207g.m11111f(c9615m, "interaction");
        C5207g.m11111f(interfaceC7882z, "scope");
        C1280e c1280e = this.f2633f;
        c1280e.getClass();
        C1281f c1281f = c1280e.f7965d;
        c1281f.getClass();
        C1282g c1282g = (C1282g) c1281f.f7967a.get(this);
        if (c1282g == null) {
            ArrayList arrayList = c1280e.f7964c;
            C5207g.m11111f(arrayList, "<this>");
            c1282g = (C1282g) (arrayList.isEmpty() ? null : arrayList.remove(0));
            HashMap map = c1281f.f7967a;
            if (c1282g == null) {
                int i10 = c1280e.f7966e;
                ArrayList arrayList2 = c1280e.f7963b;
                if (i10 > C9000b.m17249o(arrayList2)) {
                    Context context = c1280e.getContext();
                    C5207g.m11110e(context, "context");
                    c1282g = new C1282g(context);
                    c1280e.addView(c1282g);
                    arrayList2.add(c1282g);
                } else {
                    c1282g = (C1282g) arrayList2.get(c1280e.f7966e);
                    C5207g.m11111f(c1282g, "rippleHostView");
                    C0453a c0453a = (C0453a) c1281f.f7968b.get(c1282g);
                    if (c0453a != null) {
                        c0453a.f2634g.setValue(null);
                        C1282g c1282g2 = (C1282g) map.get(c0453a);
                        if (c1282g2 != null) {
                        }
                        map.remove(c0453a);
                        c1282g.m4785c();
                    }
                }
                int i11 = c1280e.f7966e;
                if (i11 < c1280e.f7962a - 1) {
                    c1280e.f7966e = i11 + 1;
                } else {
                    c1280e.f7966e = 0;
                }
            }
            map.put(this, c1282g);
            c1281f.f7968b.put(c1282g, this);
        }
        c1282g.m4784b(c9615m, this.f2629b, this.f2636i, this.f2637j, this.f2631d.getValue().f47705a, this.f2632e.getValue().f7960d, this.f2638k);
        this.f2634g.setValue(c1282g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p021b0.AbstractC1283h
    /* JADX INFO: renamed from: g */
    public final void mo1549g(C9615m c9615m) {
        C5207g.m11111f(c9615m, "interaction");
        C1282g c1282g = (C1282g) this.f2634g.getValue();
        if (c1282g != null) {
            c1282g.m4786d();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1551h() {
        C1280e c1280e = this.f2633f;
        c1280e.getClass();
        this.f2634g.setValue(null);
        C1281f c1281f = c1280e.f7965d;
        c1281f.getClass();
        C1282g c1282g = (C1282g) c1281f.f7967a.get(this);
        if (c1282g != null) {
            c1282g.m4785c();
            HashMap map = c1281f.f7967a;
            C1282g c1282g2 = (C1282g) map.get(this);
            if (c1282g2 != null) {
            }
            map.remove(this);
            c1280e.f7964c.add(c1282g);
        }
    }
}
