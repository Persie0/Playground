package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.AbstractC0356f;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.runtime.C0272a;
import androidx.compose.runtime.internal.C0282a;
import java.util.List;
import p000.b16;
import p000.d32;
import p000.e16;
import p000.e41;
import p000.f66;
import p000.l77;
import p000.n66;
import p000.nj0;
import p000.oha;
import p000.pk9;
import p000.se1;
import p000.sq4;
import p000.tj3;
import p000.ui3;
import p000.we1;
import p000.x18;
import p000.x66;
import p000.xfa;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.layout.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0337d {

    /* JADX INFO: renamed from: a */
    public static final e41 f4187a = new e41(16);

    /* JADX INFO: renamed from: b */
    public static final Object f4188b = new Object();

    /* JADX INFO: renamed from: a */
    public static final void m1486a(final e16 e16Var, final zi3 zi3Var, ye1 ye1Var, final int i, final int i2) {
        int i3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(zi3Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                e16Var = b16.f7762a;
            }
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = new C0345l(nj0.f52796O);
                tj3Var.m22131l0(objM22097O);
            }
            m1487b((C0345l) objM22097O, e16Var, zi3Var, tj3Var, (i3 << 3) & 1008);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iM19383z = pk9.m19383z(i | 1);
                    int i5 = i2;
                    AbstractC0337d.m1486a(e16Var, zi3Var, (ye1) obj, iM19383z, i5);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1487b(final C0345l c0345l, final e16 e16Var, final zi3 zi3Var, ye1 ye1Var, final int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-511989831);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(c0345l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(zi3Var) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            C0272a c0272aM19380w = pk9.m19380w(tj3Var);
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            l77 l77VarM22132m = tj3Var.m22132m();
            ui3 ui3VarM1551a = AbstractC0356f.m1551a();
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3VarM1551a);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, c0345l.f4220c, c0345l);
            oha.m18001g(tj3Var, c0345l.f4221d, c0272aM19380w);
            oha.m18001g(tj3Var, c0345l.f4222e, zi3Var);
            se1.f60731q.getClass();
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            tj3Var.m22139q(true);
            if (tj3Var.m22086D()) {
                tj3Var.m22111b0(-1259187287);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1259245908);
                boolean zM22124i = tj3Var.m22124i(c0345l);
                Object objM22097O = tj3Var.m22097O();
                if (zM22124i || objM22097O == we1.f66679a) {
                    objM22097O = new ui3() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Code duplicated, block: B:16:0x005a A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:17:0x005c A[LOOP:0: B:7:0x0026->B:17:0x005c, LOOP_END] */
                        /* JADX WARN: Code duplicated, block: B:28:0x005f A[EDGE_INSN: B:28:0x005f->B:18:0x005f BREAK  A[LOOP:0: B:7:0x0026->B:17:0x005c], SYNTHETIC] */
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            C0339f c0339fM1531a = c0345l.m1531a();
                            C0357g c0357g = c0339fM1531a.f4193a;
                            if (c0339fM1531a.f4190I != ((x66) ((f66) c0357g.m1603p()).f38520b).f67832c) {
                                n66 n66Var = c0339fM1531a.f4198f;
                                Object[] objArr = n66Var.f52401c;
                                long[] jArr = n66Var.f52399a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    while (true) {
                                        long j = jArr[i3];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                            if (i3 != length) {
                                                break;
                                                break;
                                            }
                                            i3++;
                                        } else {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((255 & j) < 128) {
                                                    ((sq4) objArr[(i3 << 3) + i5]).f61240d = true;
                                                }
                                                j >>= 8;
                                            }
                                            if (i4 != 8) {
                                                break;
                                            }
                                            if (i3 != length) {
                                                break;
                                            }
                                            i3++;
                                        }
                                    }
                                }
                                if (c0357g.f4348h != null) {
                                    if (!c0357g.f4337b0.f58059e) {
                                        C0357g.m1554Z(c0357g, false, 7);
                                    }
                                } else if (!c0357g.m1605r()) {
                                    C0357g.m1555b0(c0357g, false, 7);
                                }
                            }
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(objM22097O);
                }
                d32.m10064x((ui3) objM22097O, tj3Var);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iM19383z = pk9.m19383z(i | 1);
                    AbstractC0337d.m1487b(c0345l, e16Var, zi3Var, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C0282a m1488c(final List list) {
        return new C0282a(1271844412, true, new zi3() { // from class: androidx.compose.ui.layout.LayoutKt$combineAsVirtualLayouts$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Number) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list2 = list;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        zi3 zi3Var = (zi3) list2.get(i);
                        int iHashCode = Long.hashCode(tj3Var.f62385T);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4300c;
                        tj3Var.m22119f0();
                        if (tj3Var.f62384S) {
                            tj3Var.m22130l(ui3Var);
                        } else {
                            tj3Var.m22137o0();
                        }
                        oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                        zi3Var.invoke(tj3Var, 0);
                        tj3Var.m22139q(true);
                    }
                } else {
                    tj3Var.m22102U();
                }
                return xfa.f68157a;
            }
        });
    }
}
