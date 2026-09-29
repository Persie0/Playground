package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.node.AbstractC0356f;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import p000.AbstractC3695vr;
import p000.C3386nv;
import p000.d16;
import p000.fa2;
import p000.fa4;
import p000.gm5;
import p000.i54;
import p000.ir9;
import p000.k40;
import p000.ka3;
import p000.om0;
import p000.te1;
import p000.ui3;
import p000.x66;
import p000.x93;
import p000.xfa;
import p000.z93;

/* JADX INFO: renamed from: androidx.compose.ui.focus.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0303e {
    /* JADX INFO: renamed from: a */
    public static final CustomDestinationResult m1376a(C0302d c0302d, int i) {
        int i2 = ka3.f46936a[c0302d.m1373e1().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i2 == 3) {
                C0302d c0302dM23501l = AbstractC3695vr.m23501l(c0302d);
                if (c0302dM23501l == null) {
                    C3386nv.m17626m("ActiveParent with no focused child");
                    return null;
                }
                CustomDestinationResult customDestinationResultM1376a = m1376a(c0302dM23501l, i);
                CustomDestinationResult customDestinationResult = CustomDestinationResult.None;
                CustomDestinationResult customDestinationResult2 = customDestinationResultM1376a != customDestinationResult ? customDestinationResultM1376a : null;
                if (customDestinationResult2 != null) {
                    return customDestinationResult2;
                }
                if (c0302d.f3916L) {
                    return customDestinationResult;
                }
                c0302d.f3916L = true;
                try {
                    x93 x93VarM1370b1 = c0302d.m1370b1();
                    om0 om0Var = new om0(i);
                    C0301c c0301c = (C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(c0302d)).getFocusOwner();
                    C0302d c0302dM1362h = c0301c.m1362h();
                    x93VarM1370b1.f67970k.invoke(om0Var);
                    C0302d c0302dM1362h2 = c0301c.m1362h();
                    if (om0Var.f54563b) {
                        z93 z93Var = z93.f71219b;
                        return CustomDestinationResult.Cancelled;
                    }
                    if (c0302dM1362h == c0302dM1362h2 || c0302dM1362h2 == null) {
                        return customDestinationResult;
                    }
                    return z93.f71221d == z93.f71220c ? CustomDestinationResult.Cancelled : CustomDestinationResult.Redirected;
                } finally {
                    c0302d.f3916L = false;
                }
            }
            if (i2 != 4) {
                gm5.m12750e();
                return null;
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: b */
    public static final CustomDestinationResult m1377b(C0302d c0302d, int i) {
        if (!c0302d.f3917M) {
            c0302d.f3917M = true;
            try {
                x93 x93VarM1370b1 = c0302d.m1370b1();
                om0 om0Var = new om0(i);
                C0301c c0301c = (C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(c0302d)).getFocusOwner();
                C0302d c0302dM1362h = c0301c.m1362h();
                x93VarM1370b1.f67969j.invoke(om0Var);
                C0302d c0302dM1362h2 = c0301c.m1362h();
                if (om0Var.f54563b) {
                    z93 z93Var = z93.f71219b;
                    return CustomDestinationResult.Cancelled;
                }
                if (c0302dM1362h != c0302dM1362h2 && c0302dM1362h2 != null) {
                    return z93.f71221d == z93.f71220c ? CustomDestinationResult.Cancelled : CustomDestinationResult.Redirected;
                }
            } finally {
                c0302d.f3917M = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: c */
    public static final CustomDestinationResult m1378c(C0302d c0302d, int i) {
        d16 d16VarM21992f;
        k40 k40Var;
        int i2 = ka3.f46936a[c0302d.m1373e1().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return CustomDestinationResult.None;
        }
        if (i2 == 3) {
            C0302d c0302dM23501l = AbstractC3695vr.m23501l(c0302d);
            if (c0302dM23501l != null) {
                return m1376a(c0302dM23501l, i);
            }
            C3386nv.m17626m("ActiveParent with no focused child");
            return null;
        }
        if (i2 != 4) {
            gm5.m12750e();
            return null;
        }
        if (!c0302d.f34837a.f34836I) {
            i54.m13663b("visitAncestors called on an unattached node");
        }
        d16 d16Var = c0302d.f34837a.f34841e;
        C0357g c0357gM21979L = te1.m21979L(c0302d);
        loop0: while (true) {
            if (c0357gM21979L == null) {
                d16VarM21992f = null;
                break;
            }
            if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 1024) != 0) {
                while (d16Var != null) {
                    if ((d16Var.f34839c & 1024) != 0) {
                        d16VarM21992f = d16Var;
                        x66 x66Var = null;
                        while (d16VarM21992f != null) {
                            if (d16VarM21992f instanceof C0302d) {
                                break loop0;
                            }
                            if ((d16VarM21992f.f34839c & 1024) != 0 && (d16VarM21992f instanceof fa2)) {
                                int i3 = 0;
                                for (d16 d16Var2 = ((fa2) d16VarM21992f).f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
                                    if ((d16Var2.f34839c & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
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
                                if (i3 == 1) {
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
        C0302d c0302d2 = (C0302d) d16VarM21992f;
        if (c0302d2 == null) {
            return CustomDestinationResult.None;
        }
        int i4 = ka3.f46936a[c0302d2.m1373e1().ordinal()];
        if (i4 == 1) {
            return m1377b(c0302d2, i);
        }
        if (i4 == 2) {
            return CustomDestinationResult.Cancelled;
        }
        if (i4 == 3) {
            return m1378c(c0302d2, i);
        }
        if (i4 != 4) {
            gm5.m12750e();
            return null;
        }
        CustomDestinationResult customDestinationResultM1378c = m1378c(c0302d2, i);
        CustomDestinationResult customDestinationResult = customDestinationResultM1378c != CustomDestinationResult.None ? customDestinationResultM1378c : null;
        return customDestinationResult == null ? m1377b(c0302d2, i) : customDestinationResult;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m1379d(final C0302d c0302d) {
        x66 x66Var;
        k40 k40Var;
        boolean z;
        k40 k40Var2;
        C0301c c0301c = (C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(c0302d)).getFocusOwner();
        C0302d c0302dM1362h = c0301c.m1362h();
        FocusStateImpl focusStateImplM1373e1 = c0302d.m1373e1();
        if (c0302dM1362h == c0302d) {
            c0302d.m1369a1(focusStateImplM1373e1, focusStateImplM1373e1);
            return true;
        }
        if ((c0302dM1362h == null || c0302dM1362h.f3914J) && !c0302d.f3914J && !((C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(c0302d)).getFocusOwner()).f3906a.m1735K()) {
            return false;
        }
        if (c0302dM1362h != null) {
            x66Var = new x66(new C0302d[16]);
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
                            x66 x66Var2 = null;
                            while (d16VarM21992f != null) {
                                if (d16VarM21992f instanceof C0302d) {
                                    x66Var.m24305c((C0302d) d16VarM21992f);
                                } else if ((d16VarM21992f.f34839c & 1024) != 0 && (d16VarM21992f instanceof fa2)) {
                                    int i = 0;
                                    for (d16 d16Var2 = ((fa2) d16VarM21992f).f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
                                        if ((d16Var2.f34839c & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                d16VarM21992f = d16Var2;
                                            } else {
                                                if (x66Var2 == null) {
                                                    x66Var2 = new x66(new d16[16]);
                                                }
                                                if (d16VarM21992f != null) {
                                                    x66Var2.m24305c(d16VarM21992f);
                                                    d16VarM21992f = null;
                                                }
                                                x66Var2.m24305c(d16Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                d16VarM21992f = te1.m21992f(x66Var2);
                            }
                        }
                        d16Var = d16Var.f34841e;
                    }
                }
                c0357gM21979L = c0357gM21979L.m1610w();
                d16Var = (c0357gM21979L == null || (k40Var2 = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var2.f46678f;
            }
        } else {
            x66Var = null;
        }
        Object[] objArr = new C0302d[16];
        Object[] objArr2 = new C0302d[16];
        if (!c0302d.f34837a.f34836I) {
            i54.m13663b("visitAncestors called on an unattached node");
        }
        d16 d16Var3 = c0302d.f34837a.f34841e;
        C0357g c0357gM21979L2 = te1.m21979L(c0302d);
        boolean z2 = true;
        int i2 = 0;
        int i3 = 0;
        while (c0357gM21979L2 != null) {
            if ((((d16) c0357gM21979L2.f4335a0.f46679g).f34840d & 1024) != 0) {
                while (d16Var3 != null) {
                    if ((d16Var3.f34839c & 1024) != 0) {
                        d16 d16VarM21992f2 = d16Var3;
                        x66 x66Var3 = null;
                        while (d16VarM21992f2 != null) {
                            if (d16VarM21992f2 instanceof C0302d) {
                                C0302d c0302d2 = (C0302d) d16VarM21992f2;
                                if (fa4.m11650l(x66Var != null ? Boolean.valueOf(x66Var.m24313k(c0302d2)) : null, Boolean.TRUE)) {
                                    int i4 = i2 + 1;
                                    if (objArr.length < i4) {
                                        int length = objArr.length;
                                        Object[] objArr3 = new Object[Math.max(i4, length * 2)];
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    }
                                    objArr[i2] = c0302d2;
                                    i2 = i4;
                                } else {
                                    c0301c = c0301c;
                                    int i5 = i3 + 1;
                                    if (objArr2.length < i5) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i5, length2 * 2)];
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    }
                                    objArr2[i3] = c0302d2;
                                    i3 = i5;
                                }
                                if (c0302d2 == c0302dM1362h) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                c0301c = c0301c;
                                z = true;
                            }
                            if (z && (d16VarM21992f2.f34839c & 1024) != 0 && (d16VarM21992f2 instanceof fa2)) {
                                int i6 = 0;
                                for (d16 d16Var4 = ((fa2) d16VarM21992f2).f38701K; d16Var4 != null; d16Var4 = d16Var4.f34842f) {
                                    if ((d16Var4.f34839c & 1024) != 0) {
                                        int i7 = i6 + 1;
                                        if (i7 == 1) {
                                            d16VarM21992f2 = d16Var4;
                                            i7 = i7;
                                        } else {
                                            x66 x66Var4 = x66Var3 == null ? new x66(new d16[16]) : x66Var3;
                                            if (d16VarM21992f2 != null) {
                                                x66Var4.m24305c(d16VarM21992f2);
                                                d16VarM21992f2 = null;
                                            }
                                            x66Var4.m24305c(d16Var4);
                                            x66Var3 = x66Var4;
                                        }
                                        i6 = i7;
                                    }
                                }
                                if (i6 != 1) {
                                    d16VarM21992f2 = te1.m21992f(x66Var3);
                                }
                            } else {
                                d16VarM21992f2 = te1.m21992f(x66Var3);
                            }
                        }
                    }
                    d16Var3 = d16Var3.f34841e;
                    c0301c = c0301c;
                }
            }
            C0301c c0301c2 = c0301c;
            c0357gM21979L2 = c0357gM21979L2.m1610w();
            d16Var3 = (c0357gM21979L2 == null || (k40Var = c0357gM21979L2.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
            c0301c = c0301c2;
        }
        C0301c c0301c3 = c0301c;
        if (z2 && c0302dM1362h != null && !m1380e(c0302dM1362h, false)) {
            return false;
        }
        AbstractC0356f.m1552b(c0302d, new ui3() { // from class: androidx.compose.ui.focus.FocusTransactionsKt$grantFocus$1
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                c0302d.m1370b1();
                return xfa.f68157a;
            }
        });
        int i8 = ka3.f46936a[c0302d.m1373e1().ordinal()];
        if (i8 != 1 && i8 != 2) {
            if (i8 != 3 && i8 != 4) {
                gm5.m12750e();
                return false;
            }
            ((C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(c0302d)).getFocusOwner()).m1365k(c0302d);
        }
        if (z2 && c0302dM1362h != null) {
            c0302dM1362h.m1369a1(FocusStateImpl.Active, FocusStateImpl.Inactive);
        }
        if (x66Var != null) {
            int i9 = x66Var.f67832c - 1;
            Object[] objArr5 = x66Var.f67830a;
            if (i9 < objArr5.length) {
                while (i9 >= 0) {
                    C0302d c0302d3 = (C0302d) objArr5[i9];
                    if (c0301c3.m1362h() != c0302d) {
                        return false;
                    }
                    c0302d3.m1369a1(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                    i9--;
                }
            }
        }
        int i10 = i3 - 1;
        if (i10 < objArr2.length) {
            while (i10 >= 0) {
                C0302d c0302d4 = (C0302d) objArr2[i10];
                if (c0301c3.m1362h() != c0302d) {
                    return false;
                }
                c0302d4.m1369a1(c0302d4 == c0302dM1362h ? FocusStateImpl.Active : FocusStateImpl.Inactive, FocusStateImpl.ActiveParent);
                i10--;
            }
        }
        if (c0301c3.m1362h() != c0302d) {
            return false;
        }
        c0302d.m1369a1(focusStateImplM1373e1, FocusStateImpl.Active);
        return c0301c3.m1362h() == c0302d;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m1380e(C0302d c0302d, boolean z) {
        int i = ka3.f46936a[c0302d.m1373e1().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return z;
            }
            if (i == 3) {
                C0302d c0302dM23501l = AbstractC3695vr.m23501l(c0302d);
                if (!(c0302dM23501l != null ? m1380e(c0302dM23501l, z) : true)) {
                    return false;
                }
                c0302d.m1369a1(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                return true;
            }
            if (i != 4) {
                gm5.m12750e();
                return false;
            }
        }
        return true;
    }
}
