package androidx.compose.p002ui.focus;

import android.os.Trace;
import androidx.compose.p002ui.node.AbstractC0356f;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.AbstractC3695vr;
import p000.C3386nv;
import p000.aq4;
import p000.c64;
import p000.d16;
import p000.d64;
import p000.e28;
import p000.e64;
import p000.ea2;
import p000.fa2;
import p000.fa4;
import p000.gm5;
import p000.h16;
import p000.i54;
import p000.ia3;
import p000.ir9;
import p000.k40;
import p000.omd;
import p000.ot4;
import p000.p93;
import p000.qp6;
import p000.te1;
import p000.tf1;
import p000.thb;
import p000.u06;
import p000.ui3;
import p000.vi3;
import p000.w93;
import p000.wfb;
import p000.x66;
import p000.x93;
import p000.xc9;
import p000.xfa;
import p000.y93;
import p000.yp4;
import p000.z93;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.focus.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0302d extends d16 implements tf1, yp4, qp6, h16, ea2 {

    /* JADX INFO: renamed from: J */
    public final boolean f3914J;

    /* JADX INFO: renamed from: K */
    public final zi3 f3915K;

    /* JADX INFO: renamed from: L */
    public boolean f3916L;

    /* JADX INFO: renamed from: M */
    public boolean f3917M;

    /* JADX INFO: renamed from: N */
    public final int f3918N;

    public C0302d(int i, zi3 zi3Var, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        zi3Var = (i2 & 4) != 0 ? null : zi3Var;
        this.f3914J = z;
        this.f3915K = zi3Var;
        this.f3918N = i;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        int i = ia3.f43854b[m1373e1().ordinal()];
        if (i == 1 || i == 2) {
            C0301c c0301c = (C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(this)).getFocusOwner();
            c0301c.m1358d(8, true, false);
            if (this.f3914J) {
                c0301c.f3906a.m1735K();
            }
            c0301c.f3909d.m1354a();
            return;
        }
        if (i != 3) {
            if (i == 4) {
                return;
            }
            gm5.m12750e();
            return;
        }
        InterfaceC0300b focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(this)).getFocusOwner();
        C0302d c0302dM23497h = AbstractC3695vr.m23497h(this);
        if (c0302dM23497h == null || !c0302dM23497h.f3914J) {
            return;
        }
        C0301c c0301c2 = (C0301c) focusOwner;
        c0301c2.f3906a.m1735K();
        c0301c2.f3909d.m1354a();
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: T0 */
    public final void mo763T0() {
        if (m1373e1().isFocused()) {
            ((C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(this)).getFocusOwner()).m1358d(8, true, true);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final boolean m1368Z0(int i) {
        int i2 = ia3.f43853a[AbstractC0303e.m1378c(this, i).ordinal()];
        if (i2 == 1) {
            return AbstractC0303e.m1379d(this);
        }
        if (i2 == 2) {
            return true;
        }
        if (i2 == 3 || i2 == 4) {
            return false;
        }
        gm5.m12750e();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [d16] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [d16] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [x66] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [x66] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: a1 */
    public final void m1369a1(FocusStateImpl focusStateImpl, FocusStateImpl focusStateImpl2) {
        k40 k40Var;
        zi3 zi3Var;
        C0301c c0301c = (C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(this)).getFocusOwner();
        C0302d c0302dM1362h = c0301c.m1362h();
        if (!fa4.m11650l(focusStateImpl, focusStateImpl2) && (zi3Var = this.f3915K) != null) {
            zi3Var.invoke(focusStateImpl, focusStateImpl2);
        }
        d16 d16Var = this.f34837a;
        if (!d16Var.f34836I) {
            i54.m13663b("visitAncestors called on an unattached node");
        }
        d16 d16Var2 = this.f34837a;
        C0357g c0357gM21979L = te1.m21979L(this);
        while (c0357gM21979L != null) {
            if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 5120) != 0) {
                while (d16Var2 != null) {
                    int i = d16Var2.f34839c;
                    if ((i & 5120) != 0) {
                        if (d16Var2 != d16Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? M21992f = d16Var2;
                            ?? x66Var = 0;
                            while (M21992f != 0) {
                                if (M21992f instanceof p93) {
                                    p93 p93Var = (p93) M21992f;
                                    if (c0302dM1362h == c0301c.m1362h()) {
                                        p93Var.mo971j0(focusStateImpl2);
                                    }
                                } else if ((M21992f.f34839c & 4096) != 0 && (M21992f instanceof fa2)) {
                                    d16 d16Var3 = ((fa2) M21992f).f38701K;
                                    int i2 = 0;
                                    M21992f = M21992f;
                                    x66Var = x66Var;
                                    while (d16Var3 != null) {
                                        if ((d16Var3.f34839c & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                x66Var = x66Var;
                                                M21992f = d16Var3;
                                            } else {
                                                if (x66Var == 0) {
                                                    x66Var = new x66(new d16[16]);
                                                }
                                                if (M21992f != 0) {
                                                    x66Var.m24305c(M21992f);
                                                    M21992f = 0;
                                                }
                                                x66Var.m24305c(d16Var3);
                                            }
                                        }
                                        d16Var3 = d16Var3.f34842f;
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M21992f = te1.m21992f(x66Var);
                            }
                        }
                    }
                    d16Var2 = d16Var2.f34841e;
                }
            }
            c0357gM21979L = c0357gM21979L.m1610w();
            d16Var2 = (c0357gM21979L == null || (k40Var = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [d16] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [d16] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [x66] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [x66] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX INFO: renamed from: b1 */
    public final x93 m1370b1() {
        boolean z;
        k40 k40Var;
        x93 x93Var = new x93();
        x93Var.f67960a = true;
        z93 z93Var = z93.f71219b;
        x93Var.f67961b = z93Var;
        x93Var.f67962c = z93Var;
        x93Var.f67963d = z93Var;
        x93Var.f67964e = z93Var;
        x93Var.f67965f = z93Var;
        x93Var.f67966g = z93Var;
        x93Var.f67967h = z93Var;
        x93Var.f67968i = z93Var;
        x93Var.f67969j = FocusPropertiesImpl$onEnter$1.f3885b;
        x93Var.f67970k = FocusPropertiesImpl$onExit$1.f3886b;
        x93Var.f67971l = u06.f63175c;
        int i = this.f3918N;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((c64) ((xc9) ((e64) ((d64) thb.m22050i(this, AbstractC0402n.f4821m))).f36757a).getValue()).f9630a == 1);
        } else {
            if (i != 2) {
                C3386nv.m17633t("Unknown Focusability");
                return null;
            }
            z = false;
        }
        x93Var.f67960a = z;
        d16 d16Var = this.f34837a;
        if (!d16Var.f34836I) {
            i54.m13663b("visitAncestors called on an unattached node");
        }
        d16 d16Var2 = this.f34837a;
        C0357g c0357gM21979L = te1.m21979L(this);
        loop0: while (c0357gM21979L != null) {
            if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 3072) != 0) {
                while (d16Var2 != null) {
                    int i2 = d16Var2.f34839c;
                    if ((i2 & 3072) != 0) {
                        if (d16Var2 != d16Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? x66Var = 0;
                            ?? M21992f = d16Var2;
                            while (M21992f != 0) {
                                if (M21992f instanceof y93) {
                                    ((y93) M21992f).mo1893H(x93Var);
                                } else if ((M21992f.f34839c & 2048) != 0 && (M21992f instanceof fa2)) {
                                    d16 d16Var3 = ((fa2) M21992f).f38701K;
                                    int i3 = 0;
                                    while (d16Var3 != null) {
                                        if ((d16Var3.f34839c & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                M21992f = M21992f;
                                                x66Var = x66Var;
                                                x66Var = x66Var;
                                                M21992f = d16Var3;
                                            } else {
                                                if (x66Var == 0) {
                                                    x66Var = new x66(new d16[16]);
                                                }
                                                if (M21992f != 0) {
                                                    x66Var.m24305c(M21992f);
                                                    M21992f = 0;
                                                }
                                                x66Var.m24305c(d16Var3);
                                            }
                                        } else {
                                            M21992f = M21992f;
                                            x66Var = x66Var;
                                        }
                                        d16Var3 = d16Var3.f34842f;
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                    }
                                    if (i3 == 1) {
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                    } else {
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                    }
                                }
                                M21992f = te1.m21992f(x66Var);
                            }
                        }
                    }
                    d16Var2 = d16Var2.f34841e;
                }
            }
            c0357gM21979L = c0357gM21979L.m1610w();
            d16Var2 = (c0357gM21979L == null || (k40Var = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
        }
        return x93Var;
    }

    /* JADX INFO: renamed from: c1 */
    public final e28 m1371c1(aq4 aq4Var) {
        e28 e28Var = m1370b1().f67971l;
        if (e28Var != u06.f63175c) {
            return aq4Var == null ? e28Var : e28Var.m10810k(aq4Var.mo1669P(te1.m21978K(this), 0L));
        }
        return aq4Var != null ? aq4Var.mo1670Q(te1.m21978K(this), false) : wfb.m23907b(0L, omd.m18152h0(te1.m21978K(this).f49303c));
    }

    /* JADX INFO: renamed from: d1 */
    public final ot4 m1372d1() {
        k40 k40Var;
        Object obj;
        if (!this.f34837a.f34836I) {
            i54.m13663b("visitAncestors called on an unattached node");
        }
        d16 d16Var = this.f34837a.f34841e;
        C0357g c0357gM21979L = te1.m21979L(this);
        loop0: while (c0357gM21979L != null) {
            if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 8388640) != 0) {
                while (d16Var != null) {
                    int i = d16Var.f34839c;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(d16Var instanceof ot4)) {
                                if (d16Var instanceof fa2) {
                                    d16Var = null;
                                    for (d16 d16Var2 = ((fa2) d16Var).f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
                                        if (d16Var2 instanceof ot4) {
                                            d16Var = d16Var2;
                                        }
                                    }
                                } else {
                                    d16Var = null;
                                }
                            }
                            ot4 ot4Var = (ot4) d16Var;
                            if (ot4Var != null) {
                                return ot4Var;
                            }
                        } else if ((i & 32) != 0) {
                            if (d16Var instanceof h16) {
                                obj = d16Var;
                            } else if (d16Var instanceof fa2) {
                                obj = null;
                                for (d16 d16Var3 = ((fa2) d16Var).f38701K; d16Var3 != null; d16Var3 = d16Var3.f34842f) {
                                    if (d16Var3 instanceof h16) {
                                        obj = d16Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            h16 h16Var = (h16) obj;
                            if (h16Var != null) {
                                h16Var.mo12997a0();
                            }
                        }
                    }
                    d16Var = d16Var.f34841e;
                }
            }
            c0357gM21979L = c0357gM21979L.m1610w();
            d16Var = (c0357gM21979L == null || (k40Var = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
        }
        return null;
    }

    /* JADX INFO: renamed from: e1 */
    public final FocusStateImpl m1373e1() {
        C0302d c0302dM1362h;
        k40 k40Var;
        if (this.f34836I && (c0302dM1362h = ((C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(this)).getFocusOwner()).m1362h()) != null) {
            if (this == c0302dM1362h) {
                return FocusStateImpl.Active;
            }
            if (c0302dM1362h.f34836I) {
                if (!c0302dM1362h.f34837a.f34836I) {
                    i54.m13663b("visitAncestors called on an unattached node");
                }
                d16 d16Var = c0302dM1362h.f34837a.f34841e;
                C0357g c0357gM21979L = te1.m21979L(c0302dM1362h);
                while (c0357gM21979L != null) {
                    if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 1024) != 0) {
                        while (d16Var != null) {
                            if ((d16Var.f34839c & 1024) != 0) {
                                d16 d16VarM21992f = d16Var;
                                x66 x66Var = null;
                                while (d16VarM21992f != null) {
                                    if (d16VarM21992f instanceof C0302d) {
                                        if (this == ((C0302d) d16VarM21992f)) {
                                            return FocusStateImpl.ActiveParent;
                                        }
                                    } else if ((d16VarM21992f.f34839c & 1024) != 0 && (d16VarM21992f instanceof fa2)) {
                                        int i = 0;
                                        for (d16 d16Var2 = ((fa2) d16VarM21992f).f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
                                            if ((d16Var2.f34839c & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    d16VarM21992f = d16Var2;
                                                } else {
                                                    if (x66Var == null) {
                                                        x66Var = new x66(new d16[16]);
                                                    }
                                                    if (d16VarM21992f != null) {
                                                        x66Var.m24305c(d16VarM21992f);
                                                        d16VarM21992f = null;
                                                    }
                                                    x66Var.m24305c(d16Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    d16VarM21992f = te1.m21992f(x66Var);
                                }
                            }
                            d16Var = d16Var.f34841e;
                        }
                    }
                    c0357gM21979L = c0357gM21979L.m1610w();
                    d16Var = (c0357gM21979L == null || (k40Var = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
                }
            }
            return FocusStateImpl.Inactive;
        }
        return FocusStateImpl.Inactive;
    }

    /* JADX INFO: renamed from: f1 */
    public final void m1374f1() {
        int i = ia3.f43854b[m1373e1().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                return;
            }
            gm5.m12750e();
            return;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        AbstractC0356f.m1552b(this, new ui3() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                ref$ObjectRef.f47718a = this.m1370b1();
                return xfa.f68157a;
            }
        });
        Object obj = ref$ObjectRef.f47718a;
        if (obj == null) {
            fa4.m11636J("focusProperties");
            throw null;
        }
        if (((w93) obj).mo15333b()) {
            return;
        }
        ((C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(this)).getFocusOwner()).m1358d(8, true, true);
    }

    /* JADX INFO: renamed from: g1 */
    public final boolean m1375g1(final int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return m1370b1().f67960a ? m1368Z0(i) : AbstractC0304f.m1386f(this, i, new vi3() { // from class: androidx.compose.ui.focus.FocusTargetNode$requestFocus$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(((C0302d) obj).m1368Z0(i));
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    @Override // p000.yp4
    /* JADX INFO: renamed from: q */
    public final void mo1049q(aq4 aq4Var) {
    }

    @Override // p000.qp6
    /* JADX INFO: renamed from: r0 */
    public final void mo804r0() {
        m1374f1();
    }
}
