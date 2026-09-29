package androidx.compose.p002ui.window;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.C0272a;
import androidx.compose.runtime.internal.C0282a;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import p000.C3531rd;
import p000.C3756xe;
import p000.C3761xj;
import p000.C3798yj;
import p000.a02;
import p000.aq4;
import p000.b16;
import p000.ci8;
import p000.d32;
import p000.e16;
import p000.fb2;
import p000.gc0;
import p000.ht5;
import p000.l77;
import p000.n84;
import p000.nv8;
import p000.oha;
import p000.p84;
import p000.pb1;
import p000.ph7;
import p000.pk9;
import p000.pvc;
import p000.qh7;
import p000.se1;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.vi3;
import p000.we1;
import p000.x18;
import p000.xfa;
import p000.xwc;
import p000.ye1;
import p000.zf1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.window.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0456d {

    /* JADX INFO: renamed from: a */
    public static final zf1 f5291a = new zf1(AndroidPopup_androidKt$LocalPopupTestTag$1.f5233b);

    /* JADX INFO: renamed from: b */
    public static final zf1 f5292b = new zf1(AndroidPopup_androidKt$LocalIsInPopupLayout$1.f5232b);

    /* JADX WARN: Code duplicated, block: B:102:0x020d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x020f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0235  */
    /* JADX WARN: Code duplicated, block: B:107:0x0239  */
    /* JADX WARN: Code duplicated, block: B:109:0x0262  */
    /* JADX WARN: Code duplicated, block: B:112:0x026d  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:57:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x0126  */
    /* JADX WARN: Code duplicated, block: B:64:0x012f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0131  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x014a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0165  */
    /* JADX WARN: Code duplicated, block: B:73:0x0167  */
    /* JADX WARN: Code duplicated, block: B:76:0x016e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0170  */
    /* JADX WARN: Code duplicated, block: B:80:0x0187 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ea  */
    /* JADX INFO: renamed from: a */
    public static final void m1897a(ph7 ph7Var, ui3 ui3Var, qh7 qh7Var, final C0282a c0282a, ye1 ye1Var, final int i, final int i2) {
        int i3;
        ui3 ui3Var2;
        int i4;
        qh7 qh7Var2;
        int i5;
        int i6;
        boolean z;
        final ui3 ui3Var3;
        final qh7 qh7Var3;
        x18 x18VarM22143u;
        final ui3 ui3Var4;
        final qh7 qh7Var4;
        View view;
        fb2 fb2Var;
        String str;
        final LayoutDirection layoutDirection;
        C0272a c0272aM19380w;
        final t66 t66VarM1263m;
        Object objM22097O;
        p84 p84Var;
        UUID uuid;
        boolean zBooleanValue;
        Object objM22097O2;
        boolean z2;
        String str2;
        Continuation continuation;
        final C0461i c0461i;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        boolean zM22120g;
        Object objM22097O3;
        boolean z5;
        boolean z6;
        boolean zM22120g2;
        Object objM22097O4;
        boolean z7;
        boolean z8;
        Object objM22097O5;
        boolean zM22124i;
        Object objM22097O6;
        boolean zM22124i2;
        Object objM22097O7;
        boolean zM22124i3;
        Object objM22097O8;
        ui3 ui3Var5;
        int i9;
        final ph7 ph7Var2 = ph7Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1772091631);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22120g(ph7Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                ui3Var2 = ui3Var;
                i3 |= tj3Var.m22124i(ui3Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    qh7Var2 = qh7Var;
                    if (tj3Var.m22120g(qh7Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if (tj3Var.m22124i(c0282a)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i3 |= i9;
                }
                i6 = i3;
                if ((i6 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i6 & 1, z)) {
                    if (i10 != 0) {
                        ui3Var4 = null;
                    } else {
                        ui3Var4 = ui3Var2;
                    }
                    if (i4 != 0) {
                        qh7Var4 = new qh7(31, false);
                    } else {
                        qh7Var4 = qh7Var2;
                    }
                    view = (View) tj3Var.m22128k(AbstractC0394f.f4765f);
                    fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                    str = (String) tj3Var.m22128k(f5291a);
                    layoutDirection = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
                    c0272aM19380w = pk9.m19380w(tj3Var);
                    t66VarM1263m = AbstractC0278f.m1263m(c0282a, tj3Var);
                    Object[] objArr = new Object[0];
                    objM22097O = tj3Var.m22097O();
                    p84Var = we1.f66679a;
                    if (objM22097O == p84Var) {
                        objM22097O = AndroidPopup_androidKt$Popup$popupId$1$1.f5265b;
                        tj3Var.m22131l0(objM22097O);
                    }
                    uuid = (UUID) xwc.m24745R(objArr, (ui3) objM22097O, tj3Var, 48);
                    zBooleanValue = ((Boolean) tj3Var.m22128k(f5292b)).booleanValue();
                    objM22097O2 = tj3Var.m22097O();
                    if (objM22097O2 == p84Var) {
                        z2 = false;
                        str2 = str;
                        continuation = null;
                        final C0461i c0461i2 = new C0461i(ui3Var4, qh7Var4, str2, view, fb2Var, ph7Var2, uuid, zBooleanValue);
                        ph7Var2 = ph7Var2;
                        c0461i2.m1903m(c0272aM19380w, new C0282a(-297523940, true, new zi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ye1 ye1Var2 = (ye1) obj;
                                int iIntValue = ((Number) obj2).intValue();
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    a02 a02VarMo1265a = AbstractC0456d.f5292b.mo1265a(Boolean.TRUE);
                                    final C0461i c0461i3 = c0461i2;
                                    final t66 t66Var = t66VarM1263m;
                                    pvc.m19507c(a02VarMo1265a, ci8.m4703P(1022273628, new zi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // p000.zi3
                                        public final Object invoke(Object obj3, Object obj4) {
                                            ye1 ye1Var3 = (ye1) obj3;
                                            int iIntValue2 = ((Number) obj4).intValue();
                                            tj3 tj3Var3 = (tj3) ye1Var3;
                                            if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                Object objM22097O9 = tj3Var3.m22097O();
                                                p84 p84Var2 = we1.f66679a;
                                                if (objM22097O9 == p84Var2) {
                                                    objM22097O9 = AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1.f5270b;
                                                    tj3Var3.m22131l0(objM22097O9);
                                                }
                                                e16 e16VarM17643c = nv8.m17643c(b16.f7762a, false, (vi3) objM22097O9);
                                                final C0461i c0461i4 = c0461i3;
                                                boolean zM22124i4 = tj3Var3.m22124i(c0461i4);
                                                Object objM22097O10 = tj3Var3.m22097O();
                                                if (zM22124i4 || objM22097O10 == p84Var2) {
                                                    objM22097O10 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // p000.vi3
                                                        public final Object invoke(Object obj5) {
                                                            n84 n84Var = new n84(((n84) obj5).f52482a);
                                                            C0461i c0461i5 = c0461i4;
                                                            c0461i5.m25915setPopupContentSizefhxjrPA(n84Var);
                                                            c0461i5.m1907q();
                                                            return xfa.f68157a;
                                                        }
                                                    };
                                                    tj3Var3.m22131l0(objM22097O10);
                                                }
                                                e16 e16VarM19514j = pvc.m19514j(pb1.m19025M(e16VarM17643c, (vi3) objM22097O10), c0461i4.getCanCalculatePosition() ? 1.0f : 0.0f);
                                                zf1 zf1Var = AbstractC0456d.f5291a;
                                                zi3 zi3Var = (zi3) t66Var.getValue();
                                                Object objM22097O11 = tj3Var3.m22097O();
                                                if (objM22097O11 == p84Var2) {
                                                    objM22097O11 = C3798yj.f69888b;
                                                    tj3Var3.m22131l0(objM22097O11);
                                                }
                                                ht5 ht5Var = (ht5) objM22097O11;
                                                int iHashCode = Long.hashCode(tj3Var3.f62385T);
                                                l77 l77VarM22132m = tj3Var3.m22132m();
                                                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM19514j);
                                                se1.f60731q.getClass();
                                                ui3 ui3Var6 = C0352b.f4299b;
                                                tj3Var3.m22119f0();
                                                if (tj3Var3.f62384S) {
                                                    tj3Var3.m22130l(ui3Var6);
                                                } else {
                                                    tj3Var3.m22137o0();
                                                }
                                                oha.m18001g(tj3Var3, C0352b.f4303f, ht5Var);
                                                oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                                                oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                                                oha.m18000f(tj3Var3, C0352b.f4305h);
                                                oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                                                zi3Var.invoke(tj3Var3, 0);
                                                tj3Var3.m22139q(true);
                                            } else {
                                                tj3Var3.m22102U();
                                            }
                                            return xfa.f68157a;
                                        }
                                    }, tj3Var2), tj3Var2, 56);
                                } else {
                                    tj3Var2.m22102U();
                                }
                                return xfa.f68157a;
                            }
                        }));
                        tj3Var.m22131l0(c0461i2);
                        objM22097O2 = c0461i2;
                    } else {
                        z2 = false;
                        str2 = str;
                        continuation = null;
                    }
                    c0461i = (C0461i) objM22097O2;
                    boolean zM22124i4 = tj3Var.m22124i(c0461i);
                    i7 = i6 & 112;
                    if (i7 == 32) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    boolean z9 = zM22124i4 | z3;
                    i8 = i6 & 896;
                    if (i8 == 256) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    zM22120g = z9 | z4 | tj3Var.m22120g(str2) | tj3Var.m22116e(layoutDirection.ordinal());
                    objM22097O3 = tj3Var.m22097O();
                    if (zM22120g || objM22097O3 == p84Var) {
                        final String str3 = str2;
                        objM22097O3 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p000.vi3
                            public final Object invoke(Object obj) {
                                C0461i c0461i3 = c0461i;
                                c0461i3.f5309K.addView(c0461i3, c0461i3.f5310L);
                                c0461i3.m1904n(ui3Var4, qh7Var4, str3, layoutDirection);
                                return new C3531rd(c0461i3, 2);
                            }
                        };
                        tj3Var.m22131l0(objM22097O3);
                    }
                    d32.m10041h(c0461i, (vi3) objM22097O3, tj3Var);
                    boolean zM22124i5 = tj3Var.m22124i(c0461i);
                    if (i7 == 32) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    boolean z10 = zM22124i5 | z5;
                    if (i8 == 256) {
                        z6 = true;
                    } else {
                        z6 = z2;
                    }
                    zM22120g2 = z10 | z6 | tj3Var.m22120g(str2) | tj3Var.m22116e(layoutDirection.ordinal());
                    objM22097O4 = tj3Var.m22097O();
                    if (zM22120g2 || objM22097O4 == p84Var) {
                        final String str4 = str2;
                        objM22097O4 = new ui3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                c0461i.m1904n(ui3Var4, qh7Var4, str4, layoutDirection);
                                return xfa.f68157a;
                            }
                        };
                        tj3Var.m22131l0(objM22097O4);
                    }
                    d32.m10064x((ui3) objM22097O4, tj3Var);
                    boolean zM22124i6 = tj3Var.m22124i(c0461i);
                    if ((i6 & 14) == 4) {
                        z7 = true;
                    } else {
                        z7 = z2;
                    }
                    z8 = zM22124i6 | z7;
                    objM22097O5 = tj3Var.m22097O();
                    if (z8 || objM22097O5 == p84Var) {
                        objM22097O5 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p000.vi3
                            public final Object invoke(Object obj) {
                                ph7 ph7Var3 = ph7Var2;
                                C0461i c0461i3 = c0461i;
                                c0461i3.setPositionProvider(ph7Var3);
                                c0461i3.m1907q();
                                return new C3761xj();
                            }
                        };
                        tj3Var.m22131l0(objM22097O5);
                    }
                    d32.m10041h(ph7Var2, (vi3) objM22097O5, tj3Var);
                    zM22124i = tj3Var.m22124i(c0461i);
                    objM22097O6 = tj3Var.m22097O();
                    if (zM22124i || objM22097O6 == p84Var) {
                        objM22097O6 = new AndroidPopup_androidKt$Popup$5$1(c0461i, continuation);
                        tj3Var.m22131l0(objM22097O6);
                    }
                    d32.m10047k(tj3Var, (zi3) objM22097O6, c0461i);
                    zM22124i2 = tj3Var.m22124i(c0461i);
                    objM22097O7 = tj3Var.m22097O();
                    if (zM22124i2 || objM22097O7 == p84Var) {
                        objM22097O7 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                            {
                                super(1);
                            }

                            @Override // p000.vi3
                            public final Object invoke(Object obj) {
                                aq4 aq4VarMo1662D = ((aq4) obj).mo1662D();
                                aq4VarMo1662D.getClass();
                                c0461i.m1906p(aq4VarMo1662D);
                                return xfa.f68157a;
                            }
                        };
                        tj3Var.m22131l0(objM22097O7);
                    }
                    e16 e16VarM24741N = xwc.m24741N(b16.f7762a, (vi3) objM22097O7);
                    zM22124i3 = tj3Var.m22124i(c0461i) | tj3Var.m22116e(layoutDirection.ordinal());
                    objM22097O8 = tj3Var.m22097O();
                    if (zM22124i3 || objM22097O8 == p84Var) {
                        objM22097O8 = new C0455c(c0461i, layoutDirection);
                        tj3Var.m22131l0(objM22097O8);
                    }
                    ht5 ht5Var = (ht5) objM22097O8;
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM24741N);
                    se1.f60731q.getClass();
                    ui3Var5 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var5);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5Var);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    tj3Var.m22139q(true);
                    ui3Var3 = ui3Var4;
                    qh7Var3 = qh7Var4;
                } else {
                    tj3Var.m22102U();
                    ui3Var3 = ui3Var2;
                    qh7Var3 = qh7Var2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Number) obj2).intValue();
                            AbstractC0456d.m1897a(ph7Var2, ui3Var3, qh7Var3, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i3 |= 384;
            qh7Var2 = qh7Var;
            if ((i & 3072) == 0) {
                if (tj3Var.m22124i(c0282a)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i3 |= i9;
            }
            i6 = i3;
            if ((i6 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i6 & 1, z)) {
                if (i10 != 0) {
                    ui3Var4 = null;
                } else {
                    ui3Var4 = ui3Var2;
                }
                if (i4 != 0) {
                    qh7Var4 = new qh7(31, false);
                } else {
                    qh7Var4 = qh7Var2;
                }
                view = (View) tj3Var.m22128k(AbstractC0394f.f4765f);
                fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                str = (String) tj3Var.m22128k(f5291a);
                layoutDirection = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
                c0272aM19380w = pk9.m19380w(tj3Var);
                t66VarM1263m = AbstractC0278f.m1263m(c0282a, tj3Var);
                Object[] objArr2 = new Object[0];
                objM22097O = tj3Var.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = AndroidPopup_androidKt$Popup$popupId$1$1.f5265b;
                    tj3Var.m22131l0(objM22097O);
                }
                uuid = (UUID) xwc.m24745R(objArr2, (ui3) objM22097O, tj3Var, 48);
                zBooleanValue = ((Boolean) tj3Var.m22128k(f5292b)).booleanValue();
                objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    z2 = false;
                    str2 = str;
                    continuation = null;
                    final C0461i c0461i3 = new C0461i(ui3Var4, qh7Var4, str2, view, fb2Var, ph7Var2, uuid, zBooleanValue);
                    ph7Var2 = ph7Var2;
                    c0461i3.m1903m(c0272aM19380w, new C0282a(-297523940, true, new zi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ye1 ye1Var2 = (ye1) obj;
                            int iIntValue = ((Number) obj2).intValue();
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                a02 a02VarMo1265a = AbstractC0456d.f5292b.mo1265a(Boolean.TRUE);
                                final C0461i c0461i4 = c0461i3;
                                final t66 t66Var = t66VarM1263m;
                                pvc.m19507c(a02VarMo1265a, ci8.m4703P(1022273628, new zi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // p000.zi3
                                    public final Object invoke(Object obj3, Object obj4) {
                                        ye1 ye1Var3 = (ye1) obj3;
                                        int iIntValue2 = ((Number) obj4).intValue();
                                        tj3 tj3Var3 = (tj3) ye1Var3;
                                        if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            Object objM22097O9 = tj3Var3.m22097O();
                                            p84 p84Var2 = we1.f66679a;
                                            if (objM22097O9 == p84Var2) {
                                                objM22097O9 = AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1.f5270b;
                                                tj3Var3.m22131l0(objM22097O9);
                                            }
                                            e16 e16VarM17643c = nv8.m17643c(b16.f7762a, false, (vi3) objM22097O9);
                                            final C0461i c0461i5 = c0461i4;
                                            boolean zM22124i7 = tj3Var3.m22124i(c0461i5);
                                            Object objM22097O10 = tj3Var3.m22097O();
                                            if (zM22124i7 || objM22097O10 == p84Var2) {
                                                objM22097O10 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // p000.vi3
                                                    public final Object invoke(Object obj5) {
                                                        n84 n84Var = new n84(((n84) obj5).f52482a);
                                                        C0461i c0461i6 = c0461i5;
                                                        c0461i6.m25915setPopupContentSizefhxjrPA(n84Var);
                                                        c0461i6.m1907q();
                                                        return xfa.f68157a;
                                                    }
                                                };
                                                tj3Var3.m22131l0(objM22097O10);
                                            }
                                            e16 e16VarM19514j = pvc.m19514j(pb1.m19025M(e16VarM17643c, (vi3) objM22097O10), c0461i5.getCanCalculatePosition() ? 1.0f : 0.0f);
                                            zf1 zf1Var = AbstractC0456d.f5291a;
                                            zi3 zi3Var = (zi3) t66Var.getValue();
                                            Object objM22097O11 = tj3Var3.m22097O();
                                            if (objM22097O11 == p84Var2) {
                                                objM22097O11 = C3798yj.f69888b;
                                                tj3Var3.m22131l0(objM22097O11);
                                            }
                                            ht5 ht5Var2 = (ht5) objM22097O11;
                                            int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                                            l77 l77VarM22132m2 = tj3Var3.m22132m();
                                            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM19514j);
                                            se1.f60731q.getClass();
                                            ui3 ui3Var6 = C0352b.f4299b;
                                            tj3Var3.m22119f0();
                                            if (tj3Var3.f62384S) {
                                                tj3Var3.m22130l(ui3Var6);
                                            } else {
                                                tj3Var3.m22137o0();
                                            }
                                            oha.m18001g(tj3Var3, C0352b.f4303f, ht5Var2);
                                            oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m2);
                                            oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode2));
                                            oha.m18000f(tj3Var3, C0352b.f4305h);
                                            oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c2);
                                            zi3Var.invoke(tj3Var3, 0);
                                            tj3Var3.m22139q(true);
                                        } else {
                                            tj3Var3.m22102U();
                                        }
                                        return xfa.f68157a;
                                    }
                                }, tj3Var2), tj3Var2, 56);
                            } else {
                                tj3Var2.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }));
                    tj3Var.m22131l0(c0461i3);
                    objM22097O2 = c0461i3;
                } else {
                    z2 = false;
                    str2 = str;
                    continuation = null;
                }
                c0461i = (C0461i) objM22097O2;
                boolean zM22124i7 = tj3Var.m22124i(c0461i);
                i7 = i6 & 112;
                if (i7 == 32) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                boolean z11 = zM22124i7 | z3;
                i8 = i6 & 896;
                if (i8 == 256) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                zM22120g = z11 | z4 | tj3Var.m22120g(str2) | tj3Var.m22116e(layoutDirection.ordinal());
                objM22097O3 = tj3Var.m22097O();
                if (zM22120g) {
                    final String str5 = str2;
                    objM22097O3 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            C0461i c0461i4 = c0461i;
                            c0461i4.f5309K.addView(c0461i4, c0461i4.f5310L);
                            c0461i4.m1904n(ui3Var4, qh7Var4, str5, layoutDirection);
                            return new C3531rd(c0461i4, 2);
                        }
                    };
                    tj3Var.m22131l0(objM22097O3);
                } else {
                    final String str6 = str2;
                    objM22097O3 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            C0461i c0461i4 = c0461i;
                            c0461i4.f5309K.addView(c0461i4, c0461i4.f5310L);
                            c0461i4.m1904n(ui3Var4, qh7Var4, str6, layoutDirection);
                            return new C3531rd(c0461i4, 2);
                        }
                    };
                    tj3Var.m22131l0(objM22097O3);
                }
                d32.m10041h(c0461i, (vi3) objM22097O3, tj3Var);
                boolean zM22124i8 = tj3Var.m22124i(c0461i);
                if (i7 == 32) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                boolean z12 = zM22124i8 | z5;
                if (i8 == 256) {
                    z6 = true;
                } else {
                    z6 = z2;
                }
                zM22120g2 = z12 | z6 | tj3Var.m22120g(str2) | tj3Var.m22116e(layoutDirection.ordinal());
                objM22097O4 = tj3Var.m22097O();
                if (zM22120g2) {
                    final String str7 = str2;
                    objM22097O4 = new ui3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            c0461i.m1904n(ui3Var4, qh7Var4, str7, layoutDirection);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(objM22097O4);
                } else {
                    final String str8 = str2;
                    objM22097O4 = new ui3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            c0461i.m1904n(ui3Var4, qh7Var4, str8, layoutDirection);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(objM22097O4);
                }
                d32.m10064x((ui3) objM22097O4, tj3Var);
                boolean zM22124i9 = tj3Var.m22124i(c0461i);
                if ((i6 & 14) == 4) {
                    z7 = true;
                } else {
                    z7 = z2;
                }
                z8 = zM22124i9 | z7;
                objM22097O5 = tj3Var.m22097O();
                if (z8) {
                    objM22097O5 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            ph7 ph7Var3 = ph7Var2;
                            C0461i c0461i4 = c0461i;
                            c0461i4.setPositionProvider(ph7Var3);
                            c0461i4.m1907q();
                            return new C3761xj();
                        }
                    };
                    tj3Var.m22131l0(objM22097O5);
                } else {
                    objM22097O5 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            ph7 ph7Var3 = ph7Var2;
                            C0461i c0461i4 = c0461i;
                            c0461i4.setPositionProvider(ph7Var3);
                            c0461i4.m1907q();
                            return new C3761xj();
                        }
                    };
                    tj3Var.m22131l0(objM22097O5);
                }
                d32.m10041h(ph7Var2, (vi3) objM22097O5, tj3Var);
                zM22124i = tj3Var.m22124i(c0461i);
                objM22097O6 = tj3Var.m22097O();
                if (zM22124i) {
                    objM22097O6 = new AndroidPopup_androidKt$Popup$5$1(c0461i, continuation);
                    tj3Var.m22131l0(objM22097O6);
                } else {
                    objM22097O6 = new AndroidPopup_androidKt$Popup$5$1(c0461i, continuation);
                    tj3Var.m22131l0(objM22097O6);
                }
                d32.m10047k(tj3Var, (zi3) objM22097O6, c0461i);
                zM22124i2 = tj3Var.m22124i(c0461i);
                objM22097O7 = tj3Var.m22097O();
                if (zM22124i2) {
                    objM22097O7 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            aq4 aq4VarMo1662D = ((aq4) obj).mo1662D();
                            aq4VarMo1662D.getClass();
                            c0461i.m1906p(aq4VarMo1662D);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(objM22097O7);
                } else {
                    objM22097O7 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            aq4 aq4VarMo1662D = ((aq4) obj).mo1662D();
                            aq4VarMo1662D.getClass();
                            c0461i.m1906p(aq4VarMo1662D);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(objM22097O7);
                }
                e16 e16VarM24741N2 = xwc.m24741N(b16.f7762a, (vi3) objM22097O7);
                zM22124i3 = tj3Var.m22124i(c0461i) | tj3Var.m22116e(layoutDirection.ordinal());
                objM22097O8 = tj3Var.m22097O();
                if (zM22124i3) {
                    objM22097O8 = new C0455c(c0461i, layoutDirection);
                    tj3Var.m22131l0(objM22097O8);
                } else {
                    objM22097O8 = new C0455c(c0461i, layoutDirection);
                    tj3Var.m22131l0(objM22097O8);
                }
                ht5 ht5Var2 = (ht5) objM22097O8;
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM24741N2);
                se1.f60731q.getClass();
                ui3Var5 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var5);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, ht5Var2);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m2);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode2));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c2);
                tj3Var.m22139q(true);
                ui3Var3 = ui3Var4;
                qh7Var3 = qh7Var4;
            } else {
                tj3Var.m22102U();
                ui3Var3 = ui3Var2;
                qh7Var3 = qh7Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        AbstractC0456d.m1897a(ph7Var2, ui3Var3, qh7Var3, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i3 |= 48;
        ui3Var2 = ui3Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                qh7Var2 = qh7Var;
                if (tj3Var.m22120g(qh7Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (tj3Var.m22124i(c0282a)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i3 |= i9;
            }
            i6 = i3;
            if ((i6 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i6 & 1, z)) {
                if (i10 != 0) {
                    ui3Var4 = null;
                } else {
                    ui3Var4 = ui3Var2;
                }
                if (i4 != 0) {
                    qh7Var4 = new qh7(31, false);
                } else {
                    qh7Var4 = qh7Var2;
                }
                view = (View) tj3Var.m22128k(AbstractC0394f.f4765f);
                fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                str = (String) tj3Var.m22128k(f5291a);
                layoutDirection = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
                c0272aM19380w = pk9.m19380w(tj3Var);
                t66VarM1263m = AbstractC0278f.m1263m(c0282a, tj3Var);
                Object[] objArr3 = new Object[0];
                objM22097O = tj3Var.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = AndroidPopup_androidKt$Popup$popupId$1$1.f5265b;
                    tj3Var.m22131l0(objM22097O);
                }
                uuid = (UUID) xwc.m24745R(objArr3, (ui3) objM22097O, tj3Var, 48);
                zBooleanValue = ((Boolean) tj3Var.m22128k(f5292b)).booleanValue();
                objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    z2 = false;
                    str2 = str;
                    continuation = null;
                    final C0461i c0461i4 = new C0461i(ui3Var4, qh7Var4, str2, view, fb2Var, ph7Var2, uuid, zBooleanValue);
                    ph7Var2 = ph7Var2;
                    c0461i4.m1903m(c0272aM19380w, new C0282a(-297523940, true, new zi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ye1 ye1Var2 = (ye1) obj;
                            int iIntValue = ((Number) obj2).intValue();
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                a02 a02VarMo1265a = AbstractC0456d.f5292b.mo1265a(Boolean.TRUE);
                                final C0461i c0461i5 = c0461i4;
                                final t66 t66Var = t66VarM1263m;
                                pvc.m19507c(a02VarMo1265a, ci8.m4703P(1022273628, new zi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // p000.zi3
                                    public final Object invoke(Object obj3, Object obj4) {
                                        ye1 ye1Var3 = (ye1) obj3;
                                        int iIntValue2 = ((Number) obj4).intValue();
                                        tj3 tj3Var3 = (tj3) ye1Var3;
                                        if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            Object objM22097O9 = tj3Var3.m22097O();
                                            p84 p84Var2 = we1.f66679a;
                                            if (objM22097O9 == p84Var2) {
                                                objM22097O9 = AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1.f5270b;
                                                tj3Var3.m22131l0(objM22097O9);
                                            }
                                            e16 e16VarM17643c = nv8.m17643c(b16.f7762a, false, (vi3) objM22097O9);
                                            final C0461i c0461i6 = c0461i5;
                                            boolean zM22124i10 = tj3Var3.m22124i(c0461i6);
                                            Object objM22097O10 = tj3Var3.m22097O();
                                            if (zM22124i10 || objM22097O10 == p84Var2) {
                                                objM22097O10 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // p000.vi3
                                                    public final Object invoke(Object obj5) {
                                                        n84 n84Var = new n84(((n84) obj5).f52482a);
                                                        C0461i c0461i7 = c0461i6;
                                                        c0461i7.m25915setPopupContentSizefhxjrPA(n84Var);
                                                        c0461i7.m1907q();
                                                        return xfa.f68157a;
                                                    }
                                                };
                                                tj3Var3.m22131l0(objM22097O10);
                                            }
                                            e16 e16VarM19514j = pvc.m19514j(pb1.m19025M(e16VarM17643c, (vi3) objM22097O10), c0461i6.getCanCalculatePosition() ? 1.0f : 0.0f);
                                            zf1 zf1Var = AbstractC0456d.f5291a;
                                            zi3 zi3Var = (zi3) t66Var.getValue();
                                            Object objM22097O11 = tj3Var3.m22097O();
                                            if (objM22097O11 == p84Var2) {
                                                objM22097O11 = C3798yj.f69888b;
                                                tj3Var3.m22131l0(objM22097O11);
                                            }
                                            ht5 ht5Var3 = (ht5) objM22097O11;
                                            int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                                            l77 l77VarM22132m3 = tj3Var3.m22132m();
                                            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, e16VarM19514j);
                                            se1.f60731q.getClass();
                                            ui3 ui3Var6 = C0352b.f4299b;
                                            tj3Var3.m22119f0();
                                            if (tj3Var3.f62384S) {
                                                tj3Var3.m22130l(ui3Var6);
                                            } else {
                                                tj3Var3.m22137o0();
                                            }
                                            oha.m18001g(tj3Var3, C0352b.f4303f, ht5Var3);
                                            oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m3);
                                            oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode3));
                                            oha.m18000f(tj3Var3, C0352b.f4305h);
                                            oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c3);
                                            zi3Var.invoke(tj3Var3, 0);
                                            tj3Var3.m22139q(true);
                                        } else {
                                            tj3Var3.m22102U();
                                        }
                                        return xfa.f68157a;
                                    }
                                }, tj3Var2), tj3Var2, 56);
                            } else {
                                tj3Var2.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }));
                    tj3Var.m22131l0(c0461i4);
                    objM22097O2 = c0461i4;
                } else {
                    z2 = false;
                    str2 = str;
                    continuation = null;
                }
                c0461i = (C0461i) objM22097O2;
                boolean zM22124i10 = tj3Var.m22124i(c0461i);
                i7 = i6 & 112;
                if (i7 == 32) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                boolean z13 = zM22124i10 | z3;
                i8 = i6 & 896;
                if (i8 == 256) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                zM22120g = z13 | z4 | tj3Var.m22120g(str2) | tj3Var.m22116e(layoutDirection.ordinal());
                objM22097O3 = tj3Var.m22097O();
                if (zM22120g) {
                    final String str9 = str2;
                    objM22097O3 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            C0461i c0461i5 = c0461i;
                            c0461i5.f5309K.addView(c0461i5, c0461i5.f5310L);
                            c0461i5.m1904n(ui3Var4, qh7Var4, str9, layoutDirection);
                            return new C3531rd(c0461i5, 2);
                        }
                    };
                    tj3Var.m22131l0(objM22097O3);
                } else {
                    final String str10 = str2;
                    objM22097O3 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            C0461i c0461i5 = c0461i;
                            c0461i5.f5309K.addView(c0461i5, c0461i5.f5310L);
                            c0461i5.m1904n(ui3Var4, qh7Var4, str10, layoutDirection);
                            return new C3531rd(c0461i5, 2);
                        }
                    };
                    tj3Var.m22131l0(objM22097O3);
                }
                d32.m10041h(c0461i, (vi3) objM22097O3, tj3Var);
                boolean zM22124i11 = tj3Var.m22124i(c0461i);
                if (i7 == 32) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                boolean z14 = zM22124i11 | z5;
                if (i8 == 256) {
                    z6 = true;
                } else {
                    z6 = z2;
                }
                zM22120g2 = z14 | z6 | tj3Var.m22120g(str2) | tj3Var.m22116e(layoutDirection.ordinal());
                objM22097O4 = tj3Var.m22097O();
                if (zM22120g2) {
                    final String str11 = str2;
                    objM22097O4 = new ui3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            c0461i.m1904n(ui3Var4, qh7Var4, str11, layoutDirection);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(objM22097O4);
                } else {
                    final String str12 = str2;
                    objM22097O4 = new ui3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            c0461i.m1904n(ui3Var4, qh7Var4, str12, layoutDirection);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(objM22097O4);
                }
                d32.m10064x((ui3) objM22097O4, tj3Var);
                boolean zM22124i12 = tj3Var.m22124i(c0461i);
                if ((i6 & 14) == 4) {
                    z7 = true;
                } else {
                    z7 = z2;
                }
                z8 = zM22124i12 | z7;
                objM22097O5 = tj3Var.m22097O();
                if (z8) {
                    objM22097O5 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            ph7 ph7Var3 = ph7Var2;
                            C0461i c0461i5 = c0461i;
                            c0461i5.setPositionProvider(ph7Var3);
                            c0461i5.m1907q();
                            return new C3761xj();
                        }
                    };
                    tj3Var.m22131l0(objM22097O5);
                } else {
                    objM22097O5 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            ph7 ph7Var3 = ph7Var2;
                            C0461i c0461i5 = c0461i;
                            c0461i5.setPositionProvider(ph7Var3);
                            c0461i5.m1907q();
                            return new C3761xj();
                        }
                    };
                    tj3Var.m22131l0(objM22097O5);
                }
                d32.m10041h(ph7Var2, (vi3) objM22097O5, tj3Var);
                zM22124i = tj3Var.m22124i(c0461i);
                objM22097O6 = tj3Var.m22097O();
                if (zM22124i) {
                    objM22097O6 = new AndroidPopup_androidKt$Popup$5$1(c0461i, continuation);
                    tj3Var.m22131l0(objM22097O6);
                } else {
                    objM22097O6 = new AndroidPopup_androidKt$Popup$5$1(c0461i, continuation);
                    tj3Var.m22131l0(objM22097O6);
                }
                d32.m10047k(tj3Var, (zi3) objM22097O6, c0461i);
                zM22124i2 = tj3Var.m22124i(c0461i);
                objM22097O7 = tj3Var.m22097O();
                if (zM22124i2) {
                    objM22097O7 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            aq4 aq4VarMo1662D = ((aq4) obj).mo1662D();
                            aq4VarMo1662D.getClass();
                            c0461i.m1906p(aq4VarMo1662D);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(objM22097O7);
                } else {
                    objM22097O7 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            aq4 aq4VarMo1662D = ((aq4) obj).mo1662D();
                            aq4VarMo1662D.getClass();
                            c0461i.m1906p(aq4VarMo1662D);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(objM22097O7);
                }
                e16 e16VarM24741N3 = xwc.m24741N(b16.f7762a, (vi3) objM22097O7);
                zM22124i3 = tj3Var.m22124i(c0461i) | tj3Var.m22116e(layoutDirection.ordinal());
                objM22097O8 = tj3Var.m22097O();
                if (zM22124i3) {
                    objM22097O8 = new C0455c(c0461i, layoutDirection);
                    tj3Var.m22131l0(objM22097O8);
                } else {
                    objM22097O8 = new C0455c(c0461i, layoutDirection);
                    tj3Var.m22131l0(objM22097O8);
                }
                ht5 ht5Var3 = (ht5) objM22097O8;
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM24741N3);
                se1.f60731q.getClass();
                ui3Var5 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var5);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, ht5Var3);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m3);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode3));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c3);
                tj3Var.m22139q(true);
                ui3Var3 = ui3Var4;
                qh7Var3 = qh7Var4;
            } else {
                tj3Var.m22102U();
                ui3Var3 = ui3Var2;
                qh7Var3 = qh7Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        AbstractC0456d.m1897a(ph7Var2, ui3Var3, qh7Var3, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i3 |= 384;
        qh7Var2 = qh7Var;
        if ((i & 3072) == 0) {
            if (tj3Var.m22124i(c0282a)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        i6 = i3;
        if ((i6 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i6 & 1, z)) {
            if (i10 != 0) {
                ui3Var4 = null;
            } else {
                ui3Var4 = ui3Var2;
            }
            if (i4 != 0) {
                qh7Var4 = new qh7(31, false);
            } else {
                qh7Var4 = qh7Var2;
            }
            view = (View) tj3Var.m22128k(AbstractC0394f.f4765f);
            fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
            str = (String) tj3Var.m22128k(f5291a);
            layoutDirection = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
            c0272aM19380w = pk9.m19380w(tj3Var);
            t66VarM1263m = AbstractC0278f.m1263m(c0282a, tj3Var);
            Object[] objArr4 = new Object[0];
            objM22097O = tj3Var.m22097O();
            p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AndroidPopup_androidKt$Popup$popupId$1$1.f5265b;
                tj3Var.m22131l0(objM22097O);
            }
            uuid = (UUID) xwc.m24745R(objArr4, (ui3) objM22097O, tj3Var, 48);
            zBooleanValue = ((Boolean) tj3Var.m22128k(f5292b)).booleanValue();
            objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                z2 = false;
                str2 = str;
                continuation = null;
                final C0461i c0461i5 = new C0461i(ui3Var4, qh7Var4, str2, view, fb2Var, ph7Var2, uuid, zBooleanValue);
                ph7Var2 = ph7Var2;
                c0461i5.m1903m(c0272aM19380w, new C0282a(-297523940, true, new zi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ye1 ye1Var2 = (ye1) obj;
                        int iIntValue = ((Number) obj2).intValue();
                        tj3 tj3Var2 = (tj3) ye1Var2;
                        if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            a02 a02VarMo1265a = AbstractC0456d.f5292b.mo1265a(Boolean.TRUE);
                            final C0461i c0461i6 = c0461i5;
                            final t66 t66Var = t66VarM1263m;
                            pvc.m19507c(a02VarMo1265a, ci8.m4703P(1022273628, new zi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // p000.zi3
                                public final Object invoke(Object obj3, Object obj4) {
                                    ye1 ye1Var3 = (ye1) obj3;
                                    int iIntValue2 = ((Number) obj4).intValue();
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        Object objM22097O9 = tj3Var3.m22097O();
                                        p84 p84Var2 = we1.f66679a;
                                        if (objM22097O9 == p84Var2) {
                                            objM22097O9 = AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1.f5270b;
                                            tj3Var3.m22131l0(objM22097O9);
                                        }
                                        e16 e16VarM17643c = nv8.m17643c(b16.f7762a, false, (vi3) objM22097O9);
                                        final C0461i c0461i7 = c0461i6;
                                        boolean zM22124i13 = tj3Var3.m22124i(c0461i7);
                                        Object objM22097O10 = tj3Var3.m22097O();
                                        if (zM22124i13 || objM22097O10 == p84Var2) {
                                            objM22097O10 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1
                                                {
                                                    super(1);
                                                }

                                                @Override // p000.vi3
                                                public final Object invoke(Object obj5) {
                                                    n84 n84Var = new n84(((n84) obj5).f52482a);
                                                    C0461i c0461i8 = c0461i7;
                                                    c0461i8.m25915setPopupContentSizefhxjrPA(n84Var);
                                                    c0461i8.m1907q();
                                                    return xfa.f68157a;
                                                }
                                            };
                                            tj3Var3.m22131l0(objM22097O10);
                                        }
                                        e16 e16VarM19514j = pvc.m19514j(pb1.m19025M(e16VarM17643c, (vi3) objM22097O10), c0461i7.getCanCalculatePosition() ? 1.0f : 0.0f);
                                        zf1 zf1Var = AbstractC0456d.f5291a;
                                        zi3 zi3Var = (zi3) t66Var.getValue();
                                        Object objM22097O11 = tj3Var3.m22097O();
                                        if (objM22097O11 == p84Var2) {
                                            objM22097O11 = C3798yj.f69888b;
                                            tj3Var3.m22131l0(objM22097O11);
                                        }
                                        ht5 ht5Var4 = (ht5) objM22097O11;
                                        int iHashCode4 = Long.hashCode(tj3Var3.f62385T);
                                        l77 l77VarM22132m4 = tj3Var3.m22132m();
                                        e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var3, e16VarM19514j);
                                        se1.f60731q.getClass();
                                        ui3 ui3Var6 = C0352b.f4299b;
                                        tj3Var3.m22119f0();
                                        if (tj3Var3.f62384S) {
                                            tj3Var3.m22130l(ui3Var6);
                                        } else {
                                            tj3Var3.m22137o0();
                                        }
                                        oha.m18001g(tj3Var3, C0352b.f4303f, ht5Var4);
                                        oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m4);
                                        oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode4));
                                        oha.m18000f(tj3Var3, C0352b.f4305h);
                                        oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c4);
                                        zi3Var.invoke(tj3Var3, 0);
                                        tj3Var3.m22139q(true);
                                    } else {
                                        tj3Var3.m22102U();
                                    }
                                    return xfa.f68157a;
                                }
                            }, tj3Var2), tj3Var2, 56);
                        } else {
                            tj3Var2.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }));
                tj3Var.m22131l0(c0461i5);
                objM22097O2 = c0461i5;
            } else {
                z2 = false;
                str2 = str;
                continuation = null;
            }
            c0461i = (C0461i) objM22097O2;
            boolean zM22124i13 = tj3Var.m22124i(c0461i);
            i7 = i6 & 112;
            if (i7 == 32) {
                z3 = true;
            } else {
                z3 = z2;
            }
            boolean z15 = zM22124i13 | z3;
            i8 = i6 & 896;
            if (i8 == 256) {
                z4 = true;
            } else {
                z4 = z2;
            }
            zM22120g = z15 | z4 | tj3Var.m22120g(str2) | tj3Var.m22116e(layoutDirection.ordinal());
            objM22097O3 = tj3Var.m22097O();
            if (zM22120g) {
                final String str13 = str2;
                objM22097O3 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        C0461i c0461i6 = c0461i;
                        c0461i6.f5309K.addView(c0461i6, c0461i6.f5310L);
                        c0461i6.m1904n(ui3Var4, qh7Var4, str13, layoutDirection);
                        return new C3531rd(c0461i6, 2);
                    }
                };
                tj3Var.m22131l0(objM22097O3);
            } else {
                final String str14 = str2;
                objM22097O3 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        C0461i c0461i6 = c0461i;
                        c0461i6.f5309K.addView(c0461i6, c0461i6.f5310L);
                        c0461i6.m1904n(ui3Var4, qh7Var4, str14, layoutDirection);
                        return new C3531rd(c0461i6, 2);
                    }
                };
                tj3Var.m22131l0(objM22097O3);
            }
            d32.m10041h(c0461i, (vi3) objM22097O3, tj3Var);
            boolean zM22124i14 = tj3Var.m22124i(c0461i);
            if (i7 == 32) {
                z5 = true;
            } else {
                z5 = z2;
            }
            boolean z16 = zM22124i14 | z5;
            if (i8 == 256) {
                z6 = true;
            } else {
                z6 = z2;
            }
            zM22120g2 = z16 | z6 | tj3Var.m22120g(str2) | tj3Var.m22116e(layoutDirection.ordinal());
            objM22097O4 = tj3Var.m22097O();
            if (zM22120g2) {
                final String str15 = str2;
                objM22097O4 = new ui3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        c0461i.m1904n(ui3Var4, qh7Var4, str15, layoutDirection);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O4);
            } else {
                final String str16 = str2;
                objM22097O4 = new ui3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        c0461i.m1904n(ui3Var4, qh7Var4, str16, layoutDirection);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O4);
            }
            d32.m10064x((ui3) objM22097O4, tj3Var);
            boolean zM22124i15 = tj3Var.m22124i(c0461i);
            if ((i6 & 14) == 4) {
                z7 = true;
            } else {
                z7 = z2;
            }
            z8 = zM22124i15 | z7;
            objM22097O5 = tj3Var.m22097O();
            if (z8) {
                objM22097O5 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        ph7 ph7Var3 = ph7Var2;
                        C0461i c0461i6 = c0461i;
                        c0461i6.setPositionProvider(ph7Var3);
                        c0461i6.m1907q();
                        return new C3761xj();
                    }
                };
                tj3Var.m22131l0(objM22097O5);
            } else {
                objM22097O5 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        ph7 ph7Var3 = ph7Var2;
                        C0461i c0461i6 = c0461i;
                        c0461i6.setPositionProvider(ph7Var3);
                        c0461i6.m1907q();
                        return new C3761xj();
                    }
                };
                tj3Var.m22131l0(objM22097O5);
            }
            d32.m10041h(ph7Var2, (vi3) objM22097O5, tj3Var);
            zM22124i = tj3Var.m22124i(c0461i);
            objM22097O6 = tj3Var.m22097O();
            if (zM22124i) {
                objM22097O6 = new AndroidPopup_androidKt$Popup$5$1(c0461i, continuation);
                tj3Var.m22131l0(objM22097O6);
            } else {
                objM22097O6 = new AndroidPopup_androidKt$Popup$5$1(c0461i, continuation);
                tj3Var.m22131l0(objM22097O6);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O6, c0461i);
            zM22124i2 = tj3Var.m22124i(c0461i);
            objM22097O7 = tj3Var.m22097O();
            if (zM22124i2) {
                objM22097O7 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        aq4 aq4VarMo1662D = ((aq4) obj).mo1662D();
                        aq4VarMo1662D.getClass();
                        c0461i.m1906p(aq4VarMo1662D);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O7);
            } else {
                objM22097O7 = new vi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        aq4 aq4VarMo1662D = ((aq4) obj).mo1662D();
                        aq4VarMo1662D.getClass();
                        c0461i.m1906p(aq4VarMo1662D);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O7);
            }
            e16 e16VarM24741N4 = xwc.m24741N(b16.f7762a, (vi3) objM22097O7);
            zM22124i3 = tj3Var.m22124i(c0461i) | tj3Var.m22116e(layoutDirection.ordinal());
            objM22097O8 = tj3Var.m22097O();
            if (zM22124i3) {
                objM22097O8 = new C0455c(c0461i, layoutDirection);
                tj3Var.m22131l0(objM22097O8);
            } else {
                objM22097O8 = new C0455c(c0461i, layoutDirection);
                tj3Var.m22131l0(objM22097O8);
            }
            ht5 ht5Var4 = (ht5) objM22097O8;
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM24741N4);
            se1.f60731q.getClass();
            ui3Var5 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var5);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5Var4);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m4);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode4));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c4);
            tj3Var.m22139q(true);
            ui3Var3 = ui3Var4;
            qh7Var3 = qh7Var4;
        } else {
            tj3Var.m22102U();
            ui3Var3 = ui3Var2;
            qh7Var3 = qh7Var2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AbstractC0456d.m1897a(ph7Var2, ui3Var3, qh7Var3, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m1898b(final gc0 gc0Var, final long j, ui3 ui3Var, qh7 qh7Var, final C0282a c0282a, ye1 ye1Var, final int i, final int i2) {
        ui3 ui3Var2;
        int i3;
        qh7 qh7Var2;
        int i4;
        boolean z;
        final ui3 ui3Var3;
        final qh7 qh7Var3;
        x18 x18VarM22143u;
        qh7 qh7Var4;
        boolean zM22116e;
        Object objM22097O;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(71005054);
        int i5 = (tj3Var.m22118f(j) ? 32 : 16) | i;
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                ui3Var2 = ui3Var;
                i5 |= tj3Var.m22124i(ui3Var2) ? 256 : 128;
            }
            i3 = i2 & 8;
            if (i3 != 0) {
                if ((i & 3072) == 0) {
                    qh7Var2 = qh7Var;
                    if (tj3Var.m22120g(qh7Var2)) {
                        i4 = 2048;
                    } else {
                        i4 = 1024;
                    }
                    i5 |= i4;
                }
                if ((i5 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i5 & 1, z)) {
                    if (i6 != 0) {
                        ui3Var2 = null;
                    }
                    if (i3 != 0) {
                        qh7Var4 = new qh7(31, false);
                    } else {
                        qh7Var4 = qh7Var2;
                    }
                    zM22116e = tj3Var.m22116e(qh7Var4.f57790f) | ((i5 & 112) == 32) | tj3Var.m22120g(null);
                    objM22097O = tj3Var.m22097O();
                    if (zM22116e || objM22097O == we1.f66679a) {
                        objM22097O = new C3756xe(gc0Var, j);
                        tj3Var.m22131l0(objM22097O);
                    }
                    ui3 ui3Var4 = ui3Var2;
                    m1897a((C3756xe) objM22097O, ui3Var4, qh7Var4, c0282a, tj3Var, (i5 >> 3) & 8176, 0);
                    ui3Var3 = ui3Var4;
                    qh7Var3 = qh7Var4;
                } else {
                    tj3Var.m22102U();
                    ui3Var3 = ui3Var2;
                    qh7Var3 = qh7Var2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Number) obj2).intValue();
                            AbstractC0456d.m1898b(gc0Var, j, ui3Var3, qh7Var3, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i5 |= 3072;
            qh7Var2 = qh7Var;
            if ((i5 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i5 & 1, z)) {
                if (i6 != 0) {
                    ui3Var2 = null;
                }
                if (i3 != 0) {
                    qh7Var4 = new qh7(31, false);
                } else {
                    qh7Var4 = qh7Var2;
                }
                zM22116e = tj3Var.m22116e(qh7Var4.f57790f) | ((i5 & 112) == 32) | tj3Var.m22120g(null);
                objM22097O = tj3Var.m22097O();
                if (zM22116e) {
                    objM22097O = new C3756xe(gc0Var, j);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new C3756xe(gc0Var, j);
                    tj3Var.m22131l0(objM22097O);
                }
                ui3 ui3Var5 = ui3Var2;
                m1897a((C3756xe) objM22097O, ui3Var5, qh7Var4, c0282a, tj3Var, (i5 >> 3) & 8176, 0);
                ui3Var3 = ui3Var5;
                qh7Var3 = qh7Var4;
            } else {
                tj3Var.m22102U();
                ui3Var3 = ui3Var2;
                qh7Var3 = qh7Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        AbstractC0456d.m1898b(gc0Var, j, ui3Var3, qh7Var3, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i5 |= 384;
        ui3Var2 = ui3Var;
        i3 = i2 & 8;
        if (i3 != 0) {
            if ((i & 3072) == 0) {
                qh7Var2 = qh7Var;
                if (tj3Var.m22120g(qh7Var2)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i5 |= i4;
            }
            if ((i5 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i5 & 1, z)) {
                if (i6 != 0) {
                    ui3Var2 = null;
                }
                if (i3 != 0) {
                    qh7Var4 = new qh7(31, false);
                } else {
                    qh7Var4 = qh7Var2;
                }
                zM22116e = tj3Var.m22116e(qh7Var4.f57790f) | ((i5 & 112) == 32) | tj3Var.m22120g(null);
                objM22097O = tj3Var.m22097O();
                if (zM22116e) {
                    objM22097O = new C3756xe(gc0Var, j);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new C3756xe(gc0Var, j);
                    tj3Var.m22131l0(objM22097O);
                }
                ui3 ui3Var6 = ui3Var2;
                m1897a((C3756xe) objM22097O, ui3Var6, qh7Var4, c0282a, tj3Var, (i5 >> 3) & 8176, 0);
                ui3Var3 = ui3Var6;
                qh7Var3 = qh7Var4;
            } else {
                tj3Var.m22102U();
                ui3Var3 = ui3Var2;
                qh7Var3 = qh7Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        AbstractC0456d.m1898b(gc0Var, j, ui3Var3, qh7Var3, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i5 |= 3072;
        qh7Var2 = qh7Var;
        if ((i5 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i5 & 1, z)) {
            if (i6 != 0) {
                ui3Var2 = null;
            }
            if (i3 != 0) {
                qh7Var4 = new qh7(31, false);
            } else {
                qh7Var4 = qh7Var2;
            }
            zM22116e = tj3Var.m22116e(qh7Var4.f57790f) | ((i5 & 112) == 32) | tj3Var.m22120g(null);
            objM22097O = tj3Var.m22097O();
            if (zM22116e) {
                objM22097O = new C3756xe(gc0Var, j);
                tj3Var.m22131l0(objM22097O);
            } else {
                objM22097O = new C3756xe(gc0Var, j);
                tj3Var.m22131l0(objM22097O);
            }
            ui3 ui3Var7 = ui3Var2;
            m1897a((C3756xe) objM22097O, ui3Var7, qh7Var4, c0282a, tj3Var, (i5 >> 3) & 8176, 0);
            ui3Var3 = ui3Var7;
            qh7Var3 = qh7Var4;
        } else {
            tj3Var.m22102U();
            ui3Var3 = ui3Var2;
            qh7Var3 = qh7Var2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AbstractC0456d.m1898b(gc0Var, j, ui3Var3, qh7Var3, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m1899c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
