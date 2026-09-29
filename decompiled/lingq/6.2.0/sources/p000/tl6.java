package p000;

import androidx.compose.p002ui.focus.C0299a;
import androidx.compose.p002ui.focus.C0301c;
import androidx.compose.p002ui.focus.C0302d;
import androidx.compose.p002ui.layout.C0341h;
import androidx.compose.p002ui.layout.InterfaceC0338e;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.C0360j;
import androidx.compose.p002ui.node.InterfaceC0354d;
import androidx.compose.p002ui.platform.C0390b;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;

/* JADX INFO: loaded from: classes.dex */
public abstract class tl6 {

    /* JADX INFO: renamed from: a */
    public static final d66 f62483a;

    static {
        d66 d66Var = hp6.f42737a;
        f62483a = new d66();
    }

    /* JADX INFO: renamed from: a */
    public static final void m22193a(d16 d16Var, int i, int i2) {
        if (!(d16Var instanceof fa2)) {
            m22194b(d16Var, i & d16Var.f34839c, i2);
            return;
        }
        fa2 fa2Var = (fa2) d16Var;
        int i3 = fa2Var.f38700J;
        m22194b(d16Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (d16 d16Var2 = fa2Var.f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
            m22193a(d16Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m22194b(d16 d16Var, int i, int i2) {
        if (i2 != 0 || d16Var.mo574O0()) {
            if ((i & 2) != 0 && (d16Var instanceof InterfaceC0354d)) {
                d32.m10020R((InterfaceC0354d) d16Var);
                if (i2 == 2) {
                    te1.m21976I(d16Var, 2).m1697r1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                te1.m21979L(d16Var).m1566I();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                te1.m21979L(d16Var).m1582a0(false);
            }
            if ((i & 256) != 0 && (d16Var instanceof un3)) {
                if (i2 == 1) {
                    C0357g c0357gM21979L = te1.m21979L(d16Var);
                    c0357gM21979L.m1591g0(c0357gM21979L.f4355k0 + 1);
                } else if (i2 == 2) {
                    C0357g c0357gM21979L2 = te1.m21979L(d16Var);
                    c0357gM21979L2.m1591g0(c0357gM21979L2.f4355k0 - 1);
                }
                if (i2 != 2) {
                    C0357g c0357gM21979L3 = te1.m21979L(d16Var);
                    if (c0357gM21979L3.f4355k0 != 0 && !c0357gM21979L3.m1604q() && !c0357gM21979L3.m1605r() && !c0357gM21979L3.f4353j0) {
                        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = (ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357gM21979L3);
                        fs6 fs6Var = viewTreeObserverOnGlobalLayoutListenerC0391c.f4709n0.f39621e;
                        fs6Var.getClass();
                        if (c0357gM21979L3.f4355k0 > 0) {
                            ((x66) fs6Var.f39590b).m24305c(c0357gM21979L3);
                            c0357gM21979L3.f4353j0 = true;
                        }
                        viewTreeObserverOnGlobalLayoutListenerC0391c.m1737M(null);
                    }
                }
            }
            if ((i & 4) != 0 && (d16Var instanceof ll2)) {
                AbstractC3489q9.m19789s((ll2) d16Var);
            }
            if ((i & 8) != 0 && (d16Var instanceof ov8)) {
                te1.m21979L(d16Var).f4320M = true;
            }
            if ((i & 64) != 0 && (d16Var instanceof e47)) {
                qq4 qq4Var = te1.m21979L((e47) d16Var).f4337b0;
                qq4Var.f58070p.f4398M = true;
                C0360j c0360j = qq4Var.f58071q;
                if (c0360j != null) {
                    c0360j.f4380S = true;
                }
            }
            if ((i & 2048) != 0 && (d16Var instanceof y93)) {
                y93 y93Var = (y93) d16Var;
                km0.f47509b = null;
                y93Var.mo1893H(km0.f47508a);
                if (km0.f47509b != null) {
                    d16 d16Var2 = (d16) y93Var;
                    if (!d16Var2.f34837a.f34836I) {
                        i54.m13663b("visitChildren called on an unattached node");
                    }
                    x66 x66Var = new x66(new d16[16]);
                    d16 d16Var3 = d16Var2.f34837a;
                    d16 d16Var4 = d16Var3.f34842f;
                    if (d16Var4 == null) {
                        te1.m21990d(x66Var, d16Var3);
                    } else {
                        x66Var.m24305c(d16Var4);
                    }
                    while (true) {
                        int i3 = x66Var.f67832c;
                        if (i3 == 0) {
                            break;
                        }
                        d16 d16VarM21992f = (d16) x66Var.m24314l(i3 - 1);
                        if ((d16VarM21992f.f34840d & 1024) == 0) {
                            te1.m21990d(x66Var, d16VarM21992f);
                        } else {
                            while (d16VarM21992f != null) {
                                if ((d16VarM21992f.f34839c & 1024) != 0) {
                                    x66 x66Var2 = null;
                                    while (d16VarM21992f != null) {
                                        if (d16VarM21992f instanceof C0302d) {
                                            C0302d c0302d = (C0302d) d16VarM21992f;
                                            C0299a c0299a = ((C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(c0302d)).getFocusOwner()).f3909d;
                                            if (c0299a.f3903c.m17811d(c0302d)) {
                                                c0299a.m1354a();
                                            }
                                        } else if ((d16VarM21992f.f34839c & 1024) != 0 && (d16VarM21992f instanceof fa2)) {
                                            int i4 = 0;
                                            for (d16 d16Var5 = ((fa2) d16VarM21992f).f38701K; d16Var5 != null; d16Var5 = d16Var5.f34842f) {
                                                if ((d16Var5.f34839c & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        d16VarM21992f = d16Var5;
                                                    } else {
                                                        if (x66Var2 == null) {
                                                            x66Var2 = new x66(new d16[16]);
                                                        }
                                                        if (d16VarM21992f != null) {
                                                            x66Var2.m24305c(d16VarM21992f);
                                                            d16VarM21992f = null;
                                                        }
                                                        x66Var2.m24305c(d16Var5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        d16VarM21992f = te1.m21992f(x66Var2);
                                    }
                                    break;
                                }
                                d16VarM21992f = d16VarM21992f.f34842f;
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (d16Var instanceof p93)) {
                pdd.m19075a((p93) d16Var);
            }
            if ((i & 2097152) != 0 && (d16Var instanceof h44) && i2 == 2) {
                ((h44) d16Var).mo820k0();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m22195c(d16 d16Var) {
        if (!d16Var.f34836I) {
            i54.m13663b("autoInvalidateUpdatedNode called on unattached node");
        }
        m22193a(d16Var, -1, 0);
    }

    /* JADX INFO: renamed from: d */
    public static final int m22196d(c16 c16Var) {
        int i = c16Var instanceof InterfaceC0338e ? 3 : 1;
        if (c16Var instanceof t34) {
            i |= 4;
        }
        if (c16Var instanceof mv8) {
            i |= 8;
        }
        if (c16Var instanceof pg7) {
            i |= 16;
        }
        if (c16Var instanceof d47) {
            i |= 64;
        }
        return c16Var instanceof hi0 ? 524288 | i : i;
    }

    /* JADX INFO: renamed from: e */
    public static final int m22197e(d16 d16Var) {
        int i = d16Var.f34839c;
        if (i != 0) {
            return i;
        }
        Class<?> cls = d16Var.getClass();
        d66 d66Var = f62483a;
        int iM10125d = d66Var.m10125d(cls);
        if (iM10125d >= 0) {
            return d66Var.f35036c[iM10125d];
        }
        int i2 = d16Var instanceof InterfaceC0354d ? 3 : 1;
        if (d16Var instanceof ll2) {
            i2 |= 4;
        }
        if (d16Var instanceof ov8) {
            i2 |= 8;
        }
        if (d16Var instanceof ng7) {
            i2 |= 16;
        }
        if (d16Var instanceof h16) {
            i2 |= 32;
        }
        if (d16Var instanceof e47) {
            i2 |= 64;
        }
        if (d16Var instanceof yp4) {
            i2 |= 4194432;
        } else if (d16Var instanceof mt5) {
            i2 |= 128;
        }
        if (d16Var instanceof un3) {
            i2 |= 256;
        }
        if (d16Var instanceof C0302d) {
            i2 |= 1024;
        }
        if (d16Var instanceof y93) {
            i2 |= 2048;
        }
        if (d16Var instanceof p93) {
            i2 |= 4096;
        }
        if (d16Var instanceof gi4) {
            i2 |= 8192;
        }
        if (d16Var instanceof C0390b) {
            i2 |= 16384;
        }
        if (d16Var instanceof tf1) {
            i2 |= 32768;
        }
        if (d16Var instanceof pba) {
            i2 |= 262144;
        }
        if (d16Var instanceof hi0) {
            i2 |= 524288;
        }
        if (d16Var instanceof C0341h) {
            i2 |= 1048576;
        }
        if (d16Var instanceof h44) {
            i2 |= 2097152;
        }
        if (d16Var instanceof ot4) {
            i2 |= 8388608;
        }
        d66Var.m10128g(i2, cls);
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public static final int m22198f(d16 d16Var) {
        if (!(d16Var instanceof fa2)) {
            return m22197e(d16Var);
        }
        fa2 fa2Var = (fa2) d16Var;
        int iM22198f = fa2Var.f38700J;
        for (d16 d16Var2 = fa2Var.f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
            iM22198f |= m22198f(d16Var2);
        }
        return iM22198f;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m22199g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
