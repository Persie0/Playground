package androidx.compose.p002ui.window;

import android.view.View;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.C0272a;
import androidx.compose.runtime.internal.C0282a;
import java.util.UUID;
import p000.C3531rd;
import p000.b16;
import p000.d32;
import p000.e16;
import p000.fb2;
import p000.ge2;
import p000.ht5;
import p000.l77;
import p000.nv8;
import p000.oha;
import p000.p84;
import p000.pk9;
import p000.se1;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.vi3;
import p000.we1;
import p000.x18;
import p000.xc9;
import p000.xfa;
import p000.xwc;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.window.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0454b {
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Code duplicated, block: B:51:0x0113  */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    /* JADX WARN: Code duplicated, block: B:59:0x012f  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0147  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m1895a(final ui3 ui3Var, ge2 ge2Var, final C0282a c0282a, ye1 ye1Var, final int i, final int i2) {
        int i3;
        ge2 ge2Var2;
        int i4;
        boolean z;
        final ge2 ge2Var3;
        x18 x18VarM22143u;
        View view;
        fb2 fb2Var;
        final LayoutDirection layoutDirection;
        C0272a c0272aM19380w;
        final t66 t66VarM1263m;
        Object objM22097O;
        p84 p84Var;
        UUID uuid;
        boolean zM22116e;
        Object objM22097O2;
        final DialogC0460h dialogC0460h;
        boolean zM22124i;
        Object objM22097O3;
        boolean z2;
        boolean zM22116e2;
        Object objM22097O4;
        int i5;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(826668973);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                ge2Var2 = ge2Var;
                i3 |= tj3Var.m22120g(ge2Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (tj3Var.m22124i(c0282a)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i4 = i3;
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i4 & 1, z)) {
                if (i6 != 0) {
                    ge2Var3 = new ge2(7, false, false);
                } else {
                    ge2Var3 = ge2Var2;
                }
                view = (View) tj3Var.m22128k(AbstractC0394f.f4765f);
                fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                layoutDirection = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
                c0272aM19380w = pk9.m19380w(tj3Var);
                t66VarM1263m = AbstractC0278f.m1263m(c0282a, tj3Var);
                Object[] objArr = new Object[0];
                objM22097O = tj3Var.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = AndroidDialog_androidKt$Dialog$dialogId$1$1.f5227b;
                    tj3Var.m22131l0(objM22097O);
                }
                uuid = (UUID) xwc.m24745R(objArr, (ui3) objM22097O, tj3Var, 48);
                zM22116e = tj3Var.m22116e(ge2Var3.f40627g) | tj3Var.m22120g(view) | tj3Var.m22120g(fb2Var) | tj3Var.m22120g(null);
                objM22097O2 = tj3Var.m22097O();
                if (zM22116e || objM22097O2 == p84Var) {
                    DialogC0460h dialogC0460h2 = new DialogC0460h(ui3Var, ge2Var3, view, layoutDirection, fb2Var, uuid);
                    C0282a c0282a2 = new C0282a(-1338939603, true, new zi3() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                        {
                            super(2);
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ye1 ye1Var2 = (ye1) obj;
                            int iIntValue = ((Number) obj2).intValue();
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                Object objM22097O5 = tj3Var2.m22097O();
                                if (objM22097O5 == we1.f66679a) {
                                    objM22097O5 = AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1.f5226b;
                                    tj3Var2.m22131l0(objM22097O5);
                                }
                                AbstractC0454b.m1896b(nv8.m17643c(b16.f7762a, false, (vi3) objM22097O5), (zi3) t66VarM1263m.getValue(), tj3Var2, 0);
                            } else {
                                tj3Var2.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    });
                    C0459g c0459g = dialogC0460h2.f5304h;
                    c0459g.setParentCompositionContext(c0272aM19380w);
                    ((xc9) c0459g.f5299k).setValue(c0282a2);
                    c0459g.f5297J = true;
                    c0459g.m1710d();
                    tj3Var.m22131l0(dialogC0460h2);
                    objM22097O2 = dialogC0460h2;
                }
                dialogC0460h = (DialogC0460h) objM22097O2;
                zM22124i = tj3Var.m22124i(dialogC0460h);
                objM22097O3 = tj3Var.m22097O();
                if (zM22124i || objM22097O3 == p84Var) {
                    objM22097O3 = new vi3() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            DialogC0460h dialogC0460h3 = dialogC0460h;
                            dialogC0460h3.show();
                            return new C3531rd(dialogC0460h3, 1);
                        }
                    };
                    tj3Var.m22131l0(objM22097O3);
                }
                d32.m10041h(dialogC0460h, (vi3) objM22097O3, tj3Var);
                boolean zM22124i2 = tj3Var.m22124i(dialogC0460h);
                if ((i4 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zM22116e2 = zM22124i2 | z2 | ((i4 & 112) == 32) | tj3Var.m22116e(layoutDirection.ordinal());
                objM22097O4 = tj3Var.m22097O();
                if (zM22116e2 || objM22097O4 == p84Var) {
                    objM22097O4 = new ui3() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            dialogC0460h.m1901g(ui3Var, ge2Var3, layoutDirection);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(objM22097O4);
                }
                d32.m10064x((ui3) objM22097O4, tj3Var);
            } else {
                tj3Var.m22102U();
                ge2Var3 = ge2Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        AbstractC0454b.m1895a(ui3Var, ge2Var3, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i3 |= 48;
        ge2Var2 = ge2Var;
        if ((i & 384) == 0) {
            if (tj3Var.m22124i(c0282a)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        i4 = i3;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i4 & 1, z)) {
            if (i6 != 0) {
                ge2Var3 = new ge2(7, false, false);
            } else {
                ge2Var3 = ge2Var2;
            }
            view = (View) tj3Var.m22128k(AbstractC0394f.f4765f);
            fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
            layoutDirection = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
            c0272aM19380w = pk9.m19380w(tj3Var);
            t66VarM1263m = AbstractC0278f.m1263m(c0282a, tj3Var);
            Object[] objArr2 = new Object[0];
            objM22097O = tj3Var.m22097O();
            p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AndroidDialog_androidKt$Dialog$dialogId$1$1.f5227b;
                tj3Var.m22131l0(objM22097O);
            }
            uuid = (UUID) xwc.m24745R(objArr2, (ui3) objM22097O, tj3Var, 48);
            zM22116e = tj3Var.m22116e(ge2Var3.f40627g) | tj3Var.m22120g(view) | tj3Var.m22120g(fb2Var) | tj3Var.m22120g(null);
            objM22097O2 = tj3Var.m22097O();
            if (zM22116e) {
                DialogC0460h dialogC0460h3 = new DialogC0460h(ui3Var, ge2Var3, view, layoutDirection, fb2Var, uuid);
                C0282a c0282a3 = new C0282a(-1338939603, true, new zi3() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ye1 ye1Var2 = (ye1) obj;
                        int iIntValue = ((Number) obj2).intValue();
                        tj3 tj3Var2 = (tj3) ye1Var2;
                        if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Object objM22097O5 = tj3Var2.m22097O();
                            if (objM22097O5 == we1.f66679a) {
                                objM22097O5 = AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1.f5226b;
                                tj3Var2.m22131l0(objM22097O5);
                            }
                            AbstractC0454b.m1896b(nv8.m17643c(b16.f7762a, false, (vi3) objM22097O5), (zi3) t66VarM1263m.getValue(), tj3Var2, 0);
                        } else {
                            tj3Var2.m22102U();
                        }
                        return xfa.f68157a;
                    }
                });
                C0459g c0459g2 = dialogC0460h3.f5304h;
                c0459g2.setParentCompositionContext(c0272aM19380w);
                ((xc9) c0459g2.f5299k).setValue(c0282a3);
                c0459g2.f5297J = true;
                c0459g2.m1710d();
                tj3Var.m22131l0(dialogC0460h3);
                objM22097O2 = dialogC0460h3;
            } else {
                DialogC0460h dialogC0460h4 = new DialogC0460h(ui3Var, ge2Var3, view, layoutDirection, fb2Var, uuid);
                C0282a c0282a4 = new C0282a(-1338939603, true, new zi3() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ye1 ye1Var2 = (ye1) obj;
                        int iIntValue = ((Number) obj2).intValue();
                        tj3 tj3Var2 = (tj3) ye1Var2;
                        if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Object objM22097O5 = tj3Var2.m22097O();
                            if (objM22097O5 == we1.f66679a) {
                                objM22097O5 = AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1.f5226b;
                                tj3Var2.m22131l0(objM22097O5);
                            }
                            AbstractC0454b.m1896b(nv8.m17643c(b16.f7762a, false, (vi3) objM22097O5), (zi3) t66VarM1263m.getValue(), tj3Var2, 0);
                        } else {
                            tj3Var2.m22102U();
                        }
                        return xfa.f68157a;
                    }
                });
                C0459g c0459g3 = dialogC0460h4.f5304h;
                c0459g3.setParentCompositionContext(c0272aM19380w);
                ((xc9) c0459g3.f5299k).setValue(c0282a4);
                c0459g3.f5297J = true;
                c0459g3.m1710d();
                tj3Var.m22131l0(dialogC0460h4);
                objM22097O2 = dialogC0460h4;
            }
            dialogC0460h = (DialogC0460h) objM22097O2;
            zM22124i = tj3Var.m22124i(dialogC0460h);
            objM22097O3 = tj3Var.m22097O();
            if (zM22124i) {
                objM22097O3 = new vi3() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        DialogC0460h dialogC0460h5 = dialogC0460h;
                        dialogC0460h5.show();
                        return new C3531rd(dialogC0460h5, 1);
                    }
                };
                tj3Var.m22131l0(objM22097O3);
            } else {
                objM22097O3 = new vi3() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        DialogC0460h dialogC0460h5 = dialogC0460h;
                        dialogC0460h5.show();
                        return new C3531rd(dialogC0460h5, 1);
                    }
                };
                tj3Var.m22131l0(objM22097O3);
            }
            d32.m10041h(dialogC0460h, (vi3) objM22097O3, tj3Var);
            boolean zM22124i3 = tj3Var.m22124i(dialogC0460h);
            if ((i4 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            zM22116e2 = zM22124i3 | z2 | ((i4 & 112) == 32) | tj3Var.m22116e(layoutDirection.ordinal());
            objM22097O4 = tj3Var.m22097O();
            if (zM22116e2) {
                objM22097O4 = new ui3() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        dialogC0460h.m1901g(ui3Var, ge2Var3, layoutDirection);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O4);
            } else {
                objM22097O4 = new ui3() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        dialogC0460h.m1901g(ui3Var, ge2Var3, layoutDirection);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O4);
            }
            d32.m10064x((ui3) objM22097O4, tj3Var);
        } else {
            tj3Var.m22102U();
            ge2Var3 = ge2Var2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AbstractC0454b.m1895a(ui3Var, ge2Var3, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1896b(final e16 e16Var, final zi3 zi3Var, ye1 ye1Var, final int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1090521195);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(zi3Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = C0453a.f5288a;
                tj3Var.m22131l0(objM22097O);
            }
            ht5 ht5Var = (ht5) objM22097O;
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            int i3 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5Var);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            zi3Var.invoke(tj3Var, Integer.valueOf((i3 >> 6) & 14));
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iM19383z = pk9.m19383z(i | 1);
                    AbstractC0454b.m1896b(e16Var, zi3Var, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }
}
