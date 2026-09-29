package androidx.compose.p002ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.C0272a;
import p000.AbstractC3393o1;
import p000.AbstractC3517r;
import p000.b16;
import p000.cfa;
import p000.e16;
import p000.fb2;
import p000.gi5;
import p000.ha3;
import p000.il8;
import p000.kl8;
import p000.l77;
import p000.li5;
import p000.oha;
import p000.pk9;
import p000.se1;
import p000.tj3;
import p000.ub5;
import p000.ui3;
import p000.vi3;
import p000.vl8;
import p000.we1;
import p000.x18;
import p000.xfa;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0443c {
    /* JADX INFO: renamed from: a */
    public static final void m1890a(final vi3 vi3Var, final e16 e16Var, final vi3 vi3Var2, ye1 ye1Var, final int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-180024211);
        AbstractC3517r abstractC3517r = tj3Var.f62387a;
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(vi3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        int i4 = i & 3072;
        AndroidView_androidKt$NoOpUpdate$1 androidView_androidKt$NoOpUpdate$1 = AndroidView_androidKt$NoOpUpdate$1.f5144b;
        if (i4 == 0) {
            i3 |= tj3Var.m22124i(androidView_androidKt$NoOpUpdate$1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var.m22124i(vi3Var2) ? 16384 : 8192;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var.mo3161g(C0446f.f5206b).mo3161g(ha3.f42087b).mo3161g(C0450j.f5214b).mo3161g(C0448h.f5211b));
            fb2 fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
            LayoutDirection layoutDirection = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
            l77 l77VarM22132m = tj3Var.m22132m();
            ub5 ub5Var = (ub5) tj3Var.m22128k(gi5.f40854a);
            vl8 vl8Var = (vl8) tj3Var.m22128k(li5.f49717a);
            tj3Var.m22111b0(1314774735);
            int i5 = i3 & 14;
            final int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            final Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            final C0272a c0272aM19380w = pk9.m19380w(tj3Var);
            final il8 il8Var = (il8) tj3Var.m22128k(kl8.f47496a);
            final View view = (View) tj3Var.m22128k(AbstractC0394f.f4765f);
            boolean zM22124i = tj3Var.m22124i(context) | ((((i5 & 14) ^ 6) > 4 && tj3Var.m22120g(vi3Var)) || (i5 & 6) == 4) | tj3Var.m22124i(c0272aM19380w) | tj3Var.m22124i(il8Var) | tj3Var.m22116e(iHashCode2) | tj3Var.m22124i(view);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                ui3 ui3Var = new ui3() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        KeyEvent.Callback callback = view;
                        callback.getClass();
                        return new ViewFactoryHolder(context, vi3Var, c0272aM19380w, il8Var, iHashCode2, (Owner) callback).getLayoutNode();
                    }
                };
                tj3Var.m22131l0(ui3Var);
                objM22097O = ui3Var;
            }
            ui3 ui3Var2 = (ui3) objM22097O;
            if (!(abstractC3517r instanceof cfa)) {
                pk9.m19377r();
                throw null;
            }
            tj3Var.m22107Z();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            se1.f60731q.getClass();
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, AndroidView_androidKt$updateViewHolderParams$1.f5151b, e16VarM1322c);
            oha.m18001g(tj3Var, AndroidView_androidKt$updateViewHolderParams$2.f5152b, fb2Var);
            oha.m18001g(tj3Var, AndroidView_androidKt$updateViewHolderParams$3.f5153b, ub5Var);
            oha.m18001g(tj3Var, AndroidView_androidKt$updateViewHolderParams$4.f5154b, vl8Var);
            oha.m18001g(tj3Var, AndroidView_androidKt$updateViewHolderParams$5.f5155b, layoutDirection);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18001g(tj3Var, AndroidView_androidKt$AndroidView$3$1.f5138b, vi3Var2);
            oha.m18001g(tj3Var, AndroidView_androidKt$AndroidView$3$2.f5139b, androidView_androidKt$NoOpUpdate$1);
            tj3Var.m22139q(true);
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iM19383z = pk9.m19383z(i | 1);
                    AbstractC0443c.m1890a(vi3Var, e16Var, vi3Var2, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1891b(final vi3 vi3Var, e16 e16Var, vi3 vi3Var2, ye1 ye1Var, final int i, final int i2) {
        int i3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1783766393);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22124i(vi3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= tj3Var.m22120g(e16Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= tj3Var.m22124i(vi3Var2) ? 256 : 128;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                e16Var = b16.f7762a;
            }
            if (i5 != 0) {
                vi3Var2 = AndroidView_androidKt$NoOpUpdate$1.f5144b;
            }
            m1890a(vi3Var, e16Var, vi3Var2, tj3Var, ((i3 << 6) & 57344) | (i3 & 14) | 3072 | (i3 & 112));
        } else {
            tj3Var.m22102U();
        }
        final e16 e16Var2 = e16Var;
        final vi3 vi3Var3 = vi3Var2;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AbstractC0443c.m1891b(vi3Var, e16Var2, vi3Var3, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final ViewFactoryHolder m1892c(C0357g c0357g) {
        AbstractC0442b abstractC0442b = c0357g.f4317J;
        if (abstractC0442b != null) {
            return (ViewFactoryHolder) abstractC0442b;
        }
        throw AbstractC3393o1.m17745t("Required value was null.");
    }
}
