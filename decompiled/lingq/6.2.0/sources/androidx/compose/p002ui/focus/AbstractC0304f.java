package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import java.util.Arrays;
import p000.AbstractC3695vr;
import p000.C3386nv;
import p000.bc0;
import p000.d16;
import p000.e28;
import p000.fa2;
import p000.fa4;
import p000.gm5;
import p000.hda;
import p000.i54;
import p000.i84;
import p000.ir9;
import p000.k40;
import p000.l70;
import p000.ma3;
import p000.p4d;
import p000.rx6;
import p000.te1;
import p000.vi3;
import p000.x66;

/* JADX INFO: renamed from: androidx.compose.ui.focus.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0304f {
    /* JADX WARN: Code duplicated, block: B:41:0x008b A[RETURN] */
    /* JADX INFO: renamed from: a */
    public static final boolean m1381a(C0302d c0302d, vi3 vi3Var) {
        FocusStateImpl focusStateImplM1373e1 = c0302d.m1373e1();
        int[] iArr = rx6.f59996a;
        int i = iArr[focusStateImplM1373e1.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return m1394n(c0302d, vi3Var);
            }
            if (i != 4) {
                gm5.m12750e();
                return false;
            }
            if (!m1394n(c0302d, vi3Var)) {
                if (!(c0302d.m1370b1().f67960a ? ((Boolean) ((FocusOwnerImpl$focusSearch$1) vi3Var).invoke(c0302d)).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        C0302d c0302dM23501l = AbstractC3695vr.m23501l(c0302d);
        if (c0302dM23501l == null) {
            C3386nv.m17633t("ActiveParent must have a focusedChild");
            return false;
        }
        int i2 = iArr[c0302dM23501l.m1373e1().ordinal()];
        if (i2 == 1) {
            if (m1381a(c0302dM23501l, vi3Var) || m1389i(c0302d, c0302dM23501l, 2, vi3Var) || (c0302dM23501l.m1370b1().f67960a && ((Boolean) ((FocusOwnerImpl$focusSearch$1) vi3Var).invoke(c0302dM23501l)).booleanValue())) {
                return true;
            }
            return false;
        }
        if (i2 == 2 || i2 == 3) {
            return m1389i(c0302d, c0302dM23501l, 2, vi3Var);
        }
        if (i2 != 4) {
            gm5.m12750e();
            return false;
        }
        C3386nv.m17633t("ActiveParent must have a focusedChild");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.f36622c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.f36620a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.f36623d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.f36621b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        p000.C3386nv.m17633t("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        p000.C3386nv.m17633t("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m1382b(e28 e28Var, e28 e28Var2, e28 e28Var3, int i) {
        boolean zM1383c = m1383c(i, e28Var3, e28Var);
        float f = e28Var3.f36621b;
        float f2 = e28Var3.f36623d;
        float f3 = e28Var3.f36620a;
        float f4 = e28Var3.f36622c;
        float f5 = e28Var.f36623d;
        float f6 = e28Var.f36621b;
        float f7 = e28Var.f36622c;
        float f8 = e28Var.f36620a;
        if (!zM1383c && m1383c(i, e28Var2, e28Var)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            C3386nv.m17633t("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m1383c(int i, e28 e28Var, e28 e28Var2) {
        if (i == 3 || i == 4) {
            return e28Var.f36623d > e28Var2.f36621b && e28Var.f36621b < e28Var2.f36623d;
        }
        if (i == 5 || i == 6) {
            return e28Var.f36622c > e28Var2.f36620a && e28Var.f36620a < e28Var2.f36622c;
        }
        C3386nv.m17633t("This function should only be used for 2-D focus search");
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final void m1384d(C0302d c0302d, x66 x66Var) {
        if (!c0302d.f34837a.f34836I) {
            i54.m13663b("visitChildren called on an unattached node");
        }
        x66 x66Var2 = new x66(new d16[16]);
        d16 d16Var = c0302d.f34837a;
        d16 d16Var2 = d16Var.f34842f;
        if (d16Var2 == null) {
            te1.m21990d(x66Var2, d16Var);
        } else {
            x66Var2.m24305c(d16Var2);
        }
        while (true) {
            int i = x66Var2.f67832c;
            if (i == 0) {
                return;
            }
            d16 d16VarM21992f = (d16) x66Var2.m24314l(i - 1);
            if ((d16VarM21992f.f34840d & 1024) == 0) {
                te1.m21990d(x66Var2, d16VarM21992f);
            } else {
                while (d16VarM21992f != null) {
                    if ((d16VarM21992f.f34839c & 1024) != 0) {
                        x66 x66Var3 = null;
                        while (d16VarM21992f != null) {
                            if (d16VarM21992f instanceof C0302d) {
                                C0302d c0302d2 = (C0302d) d16VarM21992f;
                                if (c0302d2.f34836I && !te1.m21979L(c0302d2).f4357l0) {
                                    if (c0302d2.m1370b1().f67960a) {
                                        x66Var.m24305c(c0302d2);
                                    } else {
                                        m1384d(c0302d2, x66Var);
                                    }
                                }
                            } else if ((d16VarM21992f.f34839c & 1024) != 0 && (d16VarM21992f instanceof fa2)) {
                                int i2 = 0;
                                for (d16 d16Var3 = ((fa2) d16VarM21992f).f38701K; d16Var3 != null; d16Var3 = d16Var3.f34842f) {
                                    if ((d16Var3.f34839c & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            d16VarM21992f = d16Var3;
                                        } else {
                                            if (x66Var3 == null) {
                                                x66Var3 = new x66(new d16[16]);
                                            }
                                            if (d16VarM21992f != null) {
                                                x66Var3.m24305c(d16VarM21992f);
                                                d16VarM21992f = null;
                                            }
                                            x66Var3.m24305c(d16Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            d16VarM21992f = te1.m21992f(x66Var3);
                        }
                        break;
                    }
                    d16VarM21992f = d16VarM21992f.f34842f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C0302d m1385e(x66 x66Var, e28 e28Var, int i) {
        e28 e28VarM10809j;
        C0302d c0302d = null;
        if (i == 3) {
            e28VarM10809j = e28Var.m10809j((e28Var.f36622c - e28Var.f36620a) + 1.0f, 0.0f);
        } else if (i == 4) {
            e28VarM10809j = e28Var.m10809j(-((e28Var.f36622c - e28Var.f36620a) + 1.0f), 0.0f);
        } else if (i == 5) {
            e28VarM10809j = e28Var.m10809j(0.0f, (e28Var.f36623d - e28Var.f36621b) + 1.0f);
        } else {
            if (i != 6) {
                C3386nv.m17633t("This function should only be used for 2-D focus search");
                return null;
            }
            e28VarM10809j = e28Var.m10809j(0.0f, -((e28Var.f36623d - e28Var.f36621b) + 1.0f));
        }
        Object[] objArr = x66Var.f67830a;
        int i2 = x66Var.f67832c;
        for (int i3 = 0; i3 < i2; i3++) {
            C0302d c0302d2 = (C0302d) objArr[i3];
            if (AbstractC3695vr.m23511v(c0302d2)) {
                e28 e28VarM23500k = AbstractC3695vr.m23500k(c0302d2);
                if (m1390j(e28VarM23500k, e28VarM10809j, e28Var, i)) {
                    c0302d = c0302d2;
                    e28VarM10809j = e28VarM23500k;
                }
            }
        }
        return c0302d;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m1386f(C0302d c0302d, int i, vi3 vi3Var) {
        e28 e28Var;
        x66 x66Var = new x66(new C0302d[16]);
        m1384d(c0302d, x66Var);
        int i2 = x66Var.f67832c;
        if (i2 <= 1) {
            C0302d c0302d2 = (C0302d) (i2 == 0 ? null : x66Var.f67830a[0]);
            if (c0302d2 != null) {
                return ((Boolean) vi3Var.invoke(c0302d2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                e28 e28VarM23500k = AbstractC3695vr.m23500k(c0302d);
                float f = e28VarM23500k.f36620a;
                float f2 = e28VarM23500k.f36621b;
                e28Var = new e28(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    C3386nv.m17633t("This function should only be used for 2-D focus search");
                    return false;
                }
                e28 e28VarM23500k2 = AbstractC3695vr.m23500k(c0302d);
                float f3 = e28VarM23500k2.f36622c;
                float f4 = e28VarM23500k2.f36623d;
                e28Var = new e28(f3, f4, f3, f4);
            }
            C0302d c0302dM1385e = m1385e(x66Var, e28Var, i);
            if (c0302dM1385e != null) {
                return ((Boolean) vi3Var.invoke(c0302dM1385e)).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m1387g(C0302d c0302d, vi3 vi3Var) {
        int i = rx6.f59996a[c0302d.m1373e1().ordinal()];
        if (i == 1) {
            C0302d c0302dM23501l = AbstractC3695vr.m23501l(c0302d);
            if (c0302dM23501l != null) {
                return m1387g(c0302dM23501l, vi3Var) || m1389i(c0302d, c0302dM23501l, 1, vi3Var);
            }
            C3386nv.m17633t("ActiveParent must have a focusedChild");
            return false;
        }
        if (i == 2 || i == 3) {
            return m1395o(c0302d, vi3Var);
        }
        if (i == 4) {
            return c0302d.m1370b1().f67960a ? ((Boolean) ((FocusOwnerImpl$focusSearch$1) vi3Var).invoke(c0302d)).booleanValue() : m1395o(c0302d, vi3Var);
        }
        gm5.m12750e();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m1388h(final int i, final vi3 vi3Var, final e28 e28Var, final C0302d c0302d) {
        if (m1396p(i, vi3Var, e28Var, c0302d)) {
            return true;
        }
        final C0302d c0302dM1362h = ((C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(c0302d)).getFocusOwner()).m1362h();
        Boolean bool = (Boolean) p4d.m18886b(c0302d, i, new vi3() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                bc0 bc0Var = (bc0) obj;
                C0302d c0302d2 = c0302d;
                if (c0302dM1362h != ((C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(c0302d2)).getFocusOwner()).m1362h()) {
                    return Boolean.TRUE;
                }
                boolean zM1396p = AbstractC0304f.m1396p(i, vi3Var, e28Var, c0302d2);
                Boolean boolValueOf = Boolean.valueOf(zM1396p);
                if (zM1396p || !bc0Var.mo3605a()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m1389i(final C0302d c0302d, final C0302d c0302d2, final int i, final vi3 vi3Var) {
        if (m1397q(c0302d, c0302d2, i, vi3Var)) {
            return true;
        }
        final C0302d c0302dM1362h = ((C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(c0302d)).getFocusOwner()).m1362h();
        Boolean bool = (Boolean) p4d.m18886b(c0302d, i, new vi3() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                bc0 bc0Var = (bc0) obj;
                C0302d c0302d3 = c0302d;
                if (c0302dM1362h != ((C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(c0302d3)).getFocusOwner()).m1362h()) {
                    return Boolean.TRUE;
                }
                boolean zM1397q = AbstractC0304f.m1397q(c0302d3, c0302d2, i, vi3Var);
                Boolean boolValueOf = Boolean.valueOf(zM1397q);
                if (zM1397q || !bc0Var.mo3605a()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m1390j(e28 e28Var, e28 e28Var2, e28 e28Var3, int i) {
        if (!m1391k(i, e28Var, e28Var3)) {
            return false;
        }
        if (m1391k(i, e28Var2, e28Var3) && !m1382b(e28Var3, e28Var, e28Var2, i)) {
            return !m1382b(e28Var3, e28Var2, e28Var, i) && m1392l(i, e28Var3, e28Var) < m1392l(i, e28Var3, e28Var2);
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m1391k(int i, e28 e28Var, e28 e28Var2) {
        if (i == 3) {
            float f = e28Var2.f36622c;
            float f2 = e28Var2.f36620a;
            float f3 = e28Var.f36622c;
            return (f > f3 || f2 >= f3) && f2 > e28Var.f36620a;
        }
        if (i == 4) {
            float f4 = e28Var2.f36620a;
            float f5 = e28Var2.f36622c;
            float f6 = e28Var.f36620a;
            return (f4 < f6 || f5 <= f6) && f5 < e28Var.f36622c;
        }
        if (i == 5) {
            float f7 = e28Var2.f36623d;
            float f8 = e28Var2.f36621b;
            float f9 = e28Var.f36623d;
            return (f7 > f9 || f8 >= f9) && f8 > e28Var.f36621b;
        }
        if (i != 6) {
            C3386nv.m17633t("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = e28Var2.f36621b;
        float f11 = e28Var2.f36623d;
        float f12 = e28Var.f36621b;
        return (f10 < f12 || f11 <= f12) && f11 < e28Var.f36623d;
    }

    /* JADX INFO: renamed from: l */
    public static final long m1392l(int i, e28 e28Var, e28 e28Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = e28Var.f36620a;
            f2 = e28Var2.f36622c;
        } else if (i == 4) {
            f = e28Var2.f36620a;
            f2 = e28Var.f36622c;
        } else if (i == 5) {
            f = e28Var.f36621b;
            f2 = e28Var2.f36623d;
        } else {
            if (i != 6) {
                C3386nv.m17633t("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = e28Var2.f36621b;
            f2 = e28Var.f36623d;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = e28Var.f36621b;
            f3 = ((e28Var.f36623d - f7) / 2.0f) + f7;
            f4 = e28Var2.f36621b;
            f5 = e28Var2.f36623d;
        } else {
            if (i != 5 && i != 6) {
                C3386nv.m17633t("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = e28Var.f36620a;
            f3 = ((e28Var.f36622c - f8) / 2.0f) + f8;
            f4 = e28Var2.f36620a;
            f5 = e28Var2.f36622c;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m1393m(C0302d c0302d, int i, vi3 vi3Var) {
        if (i == 1) {
            return m1387g(c0302d, vi3Var);
        }
        if (i == 2) {
            return m1381a(c0302d, vi3Var);
        }
        C3386nv.m17633t("This function should only be used for 1-D focus search");
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m1394n(C0302d c0302d, vi3 vi3Var) {
        Object[] objArr = new C0302d[16];
        if (!c0302d.f34837a.f34836I) {
            i54.m13663b("visitChildren called on an unattached node");
        }
        x66 x66Var = new x66(new d16[16]);
        d16 d16Var = c0302d.f34837a;
        d16 d16Var2 = d16Var.f34842f;
        if (d16Var2 == null) {
            te1.m21990d(x66Var, d16Var);
        } else {
            x66Var.m24305c(d16Var2);
        }
        int i = 0;
        while (true) {
            int i2 = x66Var.f67832c;
            if (i2 == 0) {
                break;
            }
            d16 d16VarM21992f = (d16) x66Var.m24314l(i2 - 1);
            if ((d16VarM21992f.f34840d & 1024) == 0) {
                te1.m21990d(x66Var, d16VarM21992f);
            } else {
                while (d16VarM21992f != null) {
                    if ((d16VarM21992f.f34839c & 1024) != 0) {
                        x66 x66Var2 = null;
                        while (d16VarM21992f != null) {
                            if (d16VarM21992f instanceof C0302d) {
                                C0302d c0302d2 = (C0302d) d16VarM21992f;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = c0302d2;
                                i = i3;
                            } else if ((d16VarM21992f.f34839c & 1024) != 0 && (d16VarM21992f instanceof fa2)) {
                                int i4 = 0;
                                for (d16 d16Var3 = ((fa2) d16VarM21992f).f38701K; d16Var3 != null; d16Var3 = d16Var3.f34842f) {
                                    if ((d16Var3.f34839c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            d16VarM21992f = d16Var3;
                                        } else {
                                            if (x66Var2 == null) {
                                                x66Var2 = new x66(new d16[16]);
                                            }
                                            if (d16VarM21992f != null) {
                                                x66Var2.m24305c(d16VarM21992f);
                                                d16VarM21992f = null;
                                            }
                                            x66Var2.m24305c(d16Var3);
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
        Arrays.sort(objArr, 0, i, ma3.f50829b);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                C0302d c0302d3 = (C0302d) objArr[i5];
                if (AbstractC3695vr.m23511v(c0302d3) && m1381a(c0302d3, vi3Var)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m1395o(C0302d c0302d, vi3 vi3Var) {
        Object[] objArr = new C0302d[16];
        if (!c0302d.f34837a.f34836I) {
            i54.m13663b("visitChildren called on an unattached node");
        }
        x66 x66Var = new x66(new d16[16]);
        d16 d16Var = c0302d.f34837a;
        d16 d16Var2 = d16Var.f34842f;
        if (d16Var2 == null) {
            te1.m21990d(x66Var, d16Var);
        } else {
            x66Var.m24305c(d16Var2);
        }
        int i = 0;
        while (true) {
            int i2 = x66Var.f67832c;
            if (i2 == 0) {
                break;
            }
            d16 d16VarM21992f = (d16) x66Var.m24314l(i2 - 1);
            if ((d16VarM21992f.f34840d & 1024) == 0) {
                te1.m21990d(x66Var, d16VarM21992f);
            } else {
                while (d16VarM21992f != null) {
                    if ((d16VarM21992f.f34839c & 1024) != 0) {
                        x66 x66Var2 = null;
                        while (d16VarM21992f != null) {
                            if (d16VarM21992f instanceof C0302d) {
                                C0302d c0302d2 = (C0302d) d16VarM21992f;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = c0302d2;
                                i = i3;
                            } else if ((d16VarM21992f.f34839c & 1024) != 0 && (d16VarM21992f instanceof fa2)) {
                                int i4 = 0;
                                for (d16 d16Var3 = ((fa2) d16VarM21992f).f38701K; d16Var3 != null; d16Var3 = d16Var3.f34842f) {
                                    if ((d16Var3.f34839c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            d16VarM21992f = d16Var3;
                                        } else {
                                            if (x66Var2 == null) {
                                                x66Var2 = new x66(new d16[16]);
                                            }
                                            if (d16VarM21992f != null) {
                                                x66Var2.m24305c(d16VarM21992f);
                                                d16VarM21992f = null;
                                            }
                                            x66Var2.m24305c(d16Var3);
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
        Arrays.sort(objArr, 0, i, ma3.f50829b);
        for (int i5 = 0; i5 < i; i5++) {
            C0302d c0302d3 = (C0302d) objArr[i5];
            if (AbstractC3695vr.m23511v(c0302d3) && m1387g(c0302d3, vi3Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m1396p(int i, vi3 vi3Var, e28 e28Var, C0302d c0302d) {
        C0302d c0302dM1385e;
        x66 x66Var = new x66(new C0302d[16]);
        if (!c0302d.f34837a.f34836I) {
            i54.m13663b("visitChildren called on an unattached node");
        }
        x66 x66Var2 = new x66(new d16[16]);
        d16 d16Var = c0302d.f34837a;
        d16 d16Var2 = d16Var.f34842f;
        if (d16Var2 == null) {
            te1.m21990d(x66Var2, d16Var);
        } else {
            x66Var2.m24305c(d16Var2);
        }
        while (true) {
            int i2 = x66Var2.f67832c;
            if (i2 == 0) {
                break;
            }
            d16 d16VarM21992f = (d16) x66Var2.m24314l(i2 - 1);
            if ((d16VarM21992f.f34840d & 1024) == 0) {
                te1.m21990d(x66Var2, d16VarM21992f);
            } else {
                while (d16VarM21992f != null) {
                    if ((d16VarM21992f.f34839c & 1024) != 0) {
                        x66 x66Var3 = null;
                        while (d16VarM21992f != null) {
                            if (d16VarM21992f instanceof C0302d) {
                                C0302d c0302d2 = (C0302d) d16VarM21992f;
                                if (c0302d2.f34836I) {
                                    x66Var.m24305c(c0302d2);
                                }
                            } else if ((d16VarM21992f.f34839c & 1024) != 0 && (d16VarM21992f instanceof fa2)) {
                                int i3 = 0;
                                for (d16 d16Var3 = ((fa2) d16VarM21992f).f38701K; d16Var3 != null; d16Var3 = d16Var3.f34842f) {
                                    if ((d16Var3.f34839c & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            d16VarM21992f = d16Var3;
                                        } else {
                                            if (x66Var3 == null) {
                                                x66Var3 = new x66(new d16[16]);
                                            }
                                            if (d16VarM21992f != null) {
                                                x66Var3.m24305c(d16VarM21992f);
                                                d16VarM21992f = null;
                                            }
                                            x66Var3.m24305c(d16Var3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            d16VarM21992f = te1.m21992f(x66Var3);
                        }
                        break;
                    }
                    d16VarM21992f = d16VarM21992f.f34842f;
                }
            }
        }
        while (x66Var.f67832c != 0 && (c0302dM1385e = m1385e(x66Var, e28Var, i)) != null) {
            if (c0302dM1385e.m1370b1().f67960a) {
                return ((Boolean) ((FocusOwnerImpl$focusSearch$1) vi3Var).invoke(c0302dM1385e)).booleanValue();
            }
            if (m1388h(i, vi3Var, e28Var, c0302dM1385e)) {
                return true;
            }
            x66Var.m24313k(c0302dM1385e);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:158:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[ADDED_TO_REGION, LOOP:6: B:92:0x013a->B:120:0x0187, LOOP_START, PHI: r13
      0x013a: PHI (r13v13 d16) = (r13v7 d16), (r13v14 d16) binds: [B:91:0x0138, B:120:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    /* JADX INFO: renamed from: q */
    public static final boolean m1397q(C0302d c0302d, C0302d c0302d2, int i, vi3 vi3Var) {
        d16 d16Var;
        d16 d16Var2;
        C0357g c0357gM21979L;
        k40 k40Var;
        d16 d16VarM21992f;
        x66 x66Var;
        if (c0302d.m1373e1() != FocusStateImpl.ActiveParent) {
            C3386nv.m17633t("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new C0302d[16];
        if (!c0302d.f34837a.f34836I) {
            i54.m13663b("visitChildren called on an unattached node");
        }
        x66 x66Var2 = new x66(new d16[16]);
        d16 d16Var3 = c0302d.f34837a;
        d16 d16Var4 = d16Var3.f34842f;
        if (d16Var4 == null) {
            te1.m21990d(x66Var2, d16Var3);
        } else {
            x66Var2.m24305c(d16Var4);
        }
        int i2 = 0;
        while (true) {
            int i3 = x66Var2.f67832c;
            d16Var = null;
            if (i3 == 0) {
                break;
            }
            d16 d16VarM21992f2 = (d16) x66Var2.m24314l(i3 - 1);
            if ((d16VarM21992f2.f34840d & 1024) == 0) {
                te1.m21990d(x66Var2, d16VarM21992f2);
            } else {
                while (d16VarM21992f2 != null) {
                    if ((d16VarM21992f2.f34839c & 1024) != 0) {
                        x66 x66Var3 = null;
                        while (d16VarM21992f2 != null) {
                            if (d16VarM21992f2 instanceof C0302d) {
                                C0302d c0302d3 = (C0302d) d16VarM21992f2;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = c0302d3;
                                i2 = i4;
                            } else if ((d16VarM21992f2.f34839c & 1024) != 0 && (d16VarM21992f2 instanceof fa2)) {
                                int i5 = 0;
                                for (d16 d16Var5 = ((fa2) d16VarM21992f2).f38701K; d16Var5 != null; d16Var5 = d16Var5.f34842f) {
                                    if ((d16Var5.f34839c & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            d16VarM21992f2 = d16Var5;
                                        } else {
                                            if (x66Var3 == null) {
                                                x66Var3 = new x66(new d16[16]);
                                            }
                                            if (d16VarM21992f2 != null) {
                                                x66Var3.m24305c(d16VarM21992f2);
                                                d16VarM21992f2 = null;
                                            }
                                            x66Var3.m24305c(d16Var5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            d16VarM21992f2 = te1.m21992f(x66Var3);
                        }
                        break;
                    }
                    d16VarM21992f2 = d16VarM21992f2.f34842f;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, ma3.f50829b);
        if (i != 1) {
            if (i != 2) {
                C3386nv.m17633t("This function should only be used for 1-D focus search");
                return false;
            }
            i84 i84VarM15922M = l70.m15922M(0, i2);
            int i6 = i84VarM15922M.f40379a;
            int i7 = i84VarM15922M.f40380b;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        C0302d c0302d4 = (C0302d) objArr[i7];
                        if (AbstractC3695vr.m23511v(c0302d4) && m1381a(c0302d4, vi3Var)) {
                            return true;
                        }
                    }
                    if (fa4.m11650l(objArr[i7], c0302d2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!c0302d.f34837a.f34836I) {
                    i54.m13663b("visitAncestors called on an unattached node");
                }
                d16Var2 = c0302d.f34837a.f34841e;
                c0357gM21979L = te1.m21979L(c0302d);
                loop5: while (c0357gM21979L != null) {
                    if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 1024) != 0) {
                        while (d16Var2 != null) {
                            if ((d16Var2.f34839c & 1024) != 0) {
                                d16VarM21992f = d16Var2;
                                x66Var = null;
                                while (d16VarM21992f != null) {
                                    if (d16VarM21992f instanceof C0302d) {
                                        d16Var = d16VarM21992f;
                                        break loop5;
                                    }
                                    if ((d16VarM21992f.f34839c & 1024) == 0) {
                                    }
                                    d16VarM21992f = te1.m21992f(x66Var);
                                }
                            }
                            d16Var2 = d16Var2.f34841e;
                        }
                    }
                    c0357gM21979L = c0357gM21979L.m1610w();
                    if (c0357gM21979L != null) {
                    }
                }
                if (d16Var != null) {
                    return ((Boolean) ((FocusOwnerImpl$focusSearch$1) vi3Var).invoke(c0302d)).booleanValue();
                }
            }
            return false;
        }
        i84 i84VarM15922M2 = l70.m15922M(0, i2);
        int i8 = i84VarM15922M2.f40379a;
        int i9 = i84VarM15922M2.f40380b;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    C0302d c0302d5 = (C0302d) objArr[i8];
                    if (AbstractC3695vr.m23511v(c0302d5) && m1387g(c0302d5, vi3Var)) {
                        return true;
                    }
                }
                if (fa4.m11650l(objArr[i8], c0302d2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && c0302d.m1370b1().f67960a) {
            if (!c0302d.f34837a.f34836I) {
                i54.m13663b("visitAncestors called on an unattached node");
            }
            d16Var2 = c0302d.f34837a.f34841e;
            c0357gM21979L = te1.m21979L(c0302d);
            loop5: while (c0357gM21979L != null) {
                if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 1024) != 0) {
                    while (d16Var2 != null) {
                        if ((d16Var2.f34839c & 1024) != 0) {
                            d16VarM21992f = d16Var2;
                            x66Var = null;
                            while (d16VarM21992f != null) {
                                if (d16VarM21992f instanceof C0302d) {
                                    d16Var = d16VarM21992f;
                                    break loop5;
                                }
                                if ((d16VarM21992f.f34839c & 1024) == 0 && (d16VarM21992f instanceof fa2)) {
                                    int i10 = 0;
                                    for (d16 d16Var6 = ((fa2) d16VarM21992f).f38701K; d16Var6 != null; d16Var6 = d16Var6.f34842f) {
                                        if ((d16Var6.f34839c & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                d16VarM21992f = d16Var6;
                                            } else {
                                                if (x66Var == null) {
                                                    x66Var = new x66(new d16[16]);
                                                }
                                                if (d16VarM21992f != null) {
                                                    x66Var.m24305c(d16VarM21992f);
                                                    d16VarM21992f = null;
                                                }
                                                x66Var.m24305c(d16Var6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                d16VarM21992f = te1.m21992f(x66Var);
                            }
                        }
                        d16Var2 = d16Var2.f34841e;
                    }
                }
                c0357gM21979L = c0357gM21979L.m1610w();
                d16Var2 = (c0357gM21979L != null || (k40Var = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
            }
            if (d16Var != null) {
                return ((Boolean) ((FocusOwnerImpl$focusSearch$1) vi3Var).invoke(c0302d)).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static final Boolean m1398r(int i, vi3 vi3Var, e28 e28Var, C0302d c0302d) {
        FocusStateImpl focusStateImplM1373e1 = c0302d.m1373e1();
        int[] iArr = hda.f42227a;
        int i2 = iArr[focusStateImplM1373e1.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return Boolean.valueOf(m1386f(c0302d, i, vi3Var));
            }
            if (i2 != 4) {
                gm5.m12750e();
                return null;
            }
            if (c0302d.m1370b1().f67960a) {
                return (Boolean) ((FocusOwnerImpl$focusSearch$1) vi3Var).invoke(c0302d);
            }
            return e28Var == null ? Boolean.valueOf(m1386f(c0302d, i, vi3Var)) : Boolean.valueOf(m1396p(i, vi3Var, e28Var, c0302d));
        }
        C0302d c0302dM23501l = AbstractC3695vr.m23501l(c0302d);
        if (c0302dM23501l == null) {
            C3386nv.m17633t("ActiveParent must have a focusedChild");
            return null;
        }
        int i3 = iArr[c0302dM23501l.m1373e1().ordinal()];
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                if (e28Var == null) {
                    e28Var = AbstractC3695vr.m23500k(c0302dM23501l);
                }
                return Boolean.valueOf(m1388h(i, vi3Var, e28Var, c0302d));
            }
            if (i3 != 4) {
                gm5.m12750e();
                return null;
            }
            C3386nv.m17633t("ActiveParent must have a focusedChild");
            return null;
        }
        Boolean boolM1398r = m1398r(i, vi3Var, e28Var, c0302dM23501l);
        if (!fa4.m11650l(boolM1398r, Boolean.FALSE)) {
            return boolM1398r;
        }
        if (e28Var == null) {
            if (c0302dM23501l.m1373e1() != FocusStateImpl.ActiveParent) {
                C3386nv.m17633t("Searching for active node in inactive hierarchy");
                return null;
            }
            C0302d c0302dM23497h = AbstractC3695vr.m23497h(c0302dM23501l);
            if (c0302dM23497h == null) {
                C3386nv.m17633t("ActiveParent must have a focusedChild");
                return null;
            }
            e28Var = AbstractC3695vr.m23500k(c0302dM23497h);
        }
        return Boolean.valueOf(m1388h(i, vi3Var, e28Var, c0302d));
    }
}
