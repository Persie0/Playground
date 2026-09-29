package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.RemoteViews;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.glance.Visibility;
import androidx.glance.appwidget.R$id;
import androidx.glance.appwidget.R$layout;
import com.lingq.feature.onboarding.R$drawable;
import com.lingq.feature.onboarding.R$string;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e3d {
    /* JADX INFO: renamed from: a */
    public static final void m10826a(final String str, final vi3 vi3Var, final int i, final boolean z, final boolean z2, final ui3 ui3Var, final ui3 ui3Var2, final ui3 ui3Var3, final ui3 ui3Var4, ye1 ye1Var, final int i2) {
        int i3;
        ui3 ui3Var5;
        ui3 ui3Var6;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1301620945);
        if ((i2 & 6) == 0) {
            i3 = (tj3Var.m22120g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var.m22116e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= tj3Var.m22122h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= tj3Var.m22122h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= tj3Var.m22124i(ui3Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            ui3Var5 = ui3Var2;
            i3 |= tj3Var.m22124i(ui3Var5) ? 1048576 : 524288;
        } else {
            ui3Var5 = ui3Var2;
        }
        if ((12582912 & i2) == 0) {
            ui3Var6 = ui3Var3;
            i3 |= tj3Var.m22124i(ui3Var6) ? 8388608 : 4194304;
        } else {
            ui3Var6 = ui3Var3;
        }
        if ((100663296 & i2) == 0) {
            i3 |= tj3Var.m22124i(ui3Var4) ? 67108864 : 33554432;
        }
        if (tj3Var.m22099R(i3 & 1, (38347923 & i3) != 38347922)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            si8 si8Var = p58.m18901i(tj3Var).f64857c;
            hj4 hj4Var = new hj4(6, 0, null, 123);
            boolean z3 = !z2;
            bna.m3942c(str, vi3Var, e16VarM4412e, z3, null, poc.f56608a, null, null, null, null, ci8.m4703P(55539496, new ex0(i, 16), tj3Var), i != 0, null, hj4Var, null, true, 0, 0, si8Var, null, tj3Var, (i3 & 14) | 1573248 | (i3 & 112), 12779904, 6115248);
            ss5.m21710f(c99.m4412e(b16Var, 1.0f), null, null, z, ui3Var, poc.f56609b, tj3Var, (i3 & 7168) | 196614 | ((i3 >> 3) & 57344), 6);
            e16 e16VarM22984g = ux5.m22984g(b16Var, ge9.m12515a(tj3Var).f38957f, tj3Var, b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM22984g);
            se1.f60731q.getClass();
            ui3 ui3Var7 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var7);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            pb1.m19031a(0.0f, 0, 6, 0L, tj3Var, new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.onboarding_v2_or), AbstractC3584sr.m21609V(b16Var, ge9.m12515a(tj3Var).f38957f, 0.0f, 2), p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131064);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            pb1.m19031a(0.0f, 0, 6, 0L, tj3Var, new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            m10830e(R$drawable.ic_user_gog, (i3 >> 12) & 896, tj3Var, ui3Var5, null, vz1.m23620a0(tj3Var, R$string.onboarding_v2_continue_google), z3);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38952a));
            m10830e(R$drawable.ic_user_fb, (i3 >> 15) & 896, tj3Var, ui3Var6, null, vz1.m23620a0(tj3Var, R$string.onboarding_v2_continue_facebook), z3);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            m10828c((i3 >> 24) & 14, tj3Var, ui3Var4);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: f79
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    e3d.m10826a(str, vi3Var, i, z, z2, ui3Var, ui3Var2, ui3Var3, ui3Var4, (ye1) obj, pk9.m19383z(i2 | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10827b(final String str, final vi3 vi3Var, final int i, final String str2, final vi3 vi3Var2, final String str3, final vi3 vi3Var3, final int i2, final String str4, final vi3 vi3Var4, final boolean z, final vi3 vi3Var5, final boolean z2, final boolean z3, final boolean z4, final ui3 ui3Var, final ui3 ui3Var2, ye1 ye1Var, final int i3, final int i4) {
        int i5;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-185621903);
        int i6 = i3 | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22116e(i) ? 256 : 128) | (tj3Var.m22120g(str2) ? 2048 : 1024) | (tj3Var.m22124i(vi3Var2) ? 16384 : 8192) | (tj3Var.m22120g(str3) ? 131072 : 65536) | (tj3Var.m22124i(vi3Var3) ? 1048576 : 524288) | (tj3Var.m22116e(i2) ? 8388608 : 4194304) | (tj3Var.m22120g(str4) ? 67108864 : 33554432) | (tj3Var.m22124i(vi3Var4) ? 536870912 : 268435456);
        if ((i4 & 6) == 0) {
            i5 = i4 | (tj3Var.m22122h(z) ? 4 : 2);
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= tj3Var.m22124i(vi3Var5) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= tj3Var.m22122h(z2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= tj3Var.m22122h(z3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= tj3Var.m22122h(z4) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= tj3Var.m22124i(ui3Var) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i5 |= tj3Var.m22124i(ui3Var2) ? 1048576 : 524288;
        }
        int i7 = i5;
        if (tj3Var.m22099R(i6 & 1, ((i6 & 306783379) == 306783378 && (599187 & i7) == 599186) ? false : true)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            si8 si8Var = p58.m18901i(tj3Var).f64857c;
            boolean z5 = !z4;
            bna.m3942c(str, vi3Var, e16VarM4412e, z5, null, poc.f56610c, null, null, null, null, ci8.m4703P(1950963178, new ex0(i, 17), tj3Var), i != 0, null, new hj4(6, 0, null, 123), null, true, 0, 0, si8Var, null, tj3Var, (i6 & 14) | 1573248 | (i6 & 112), 12779904, 6115248);
            int i8 = i6 >> 9;
            bna.m3942c(str2, vi3Var2, c99.m4412e(b16Var, 1.0f), z5, null, poc.f56611d, null, null, null, null, poc.f56612e, false, null, null, null, true, 0, 0, p58.m18901i(tj3Var).f64857c, null, tj3Var, (i8 & 14) | 1573248 | (i8 & 112), 12583296, 6156208);
            tj3Var = tj3Var;
            int i9 = i6 >> 15;
            bna.m3942c(str3, vi3Var3, c99.m4412e(b16Var, 1.0f), z5, null, poc.f56613f, null, null, null, null, ci8.m4703P(189179698, new ex0(i2, 18), tj3Var), i2 != 0, null, null, null, true, 0, 0, p58.m18901i(tj3Var).f64857c, null, tj3Var, (i9 & 14) | 1573248 | (i9 & 112), 12583296, 6148016);
            boolean z6 = str4.length() > 0 && !z2;
            int i10 = i6 >> 24;
            bna.m3942c(str4, vi3Var4, c99.m4412e(b16Var, 1.0f), z5, null, poc.f56614g, null, null, ci8.m4703P(303630209, new g79(vi3Var5, z), tj3Var), null, ci8.m4703P(1090247633, new c81(14, z6), tj3Var), z6, z ? g9c.f40432f : new c57(), null, null, true, 0, 0, p58.m18901i(tj3Var).f64857c, null, tj3Var, (i10 & 14) | 806879616 | (i10 & 112), 12583296, 6131120);
            ss5.m21710f(ux5.m22984g(b16Var, ge9.m12515a(tj3Var).f38952a, tj3Var, b16Var, 1.0f), null, null, z3, ui3Var, poc.f56615h, tj3Var, (i7 & 7168) | 196614 | ((i7 >> 3) & 57344), 6);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            m10828c((i7 >> 18) & 14, tj3Var, ui3Var2);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(str, vi3Var, i, str2, vi3Var2, str3, vi3Var3, i2, str4, vi3Var4, z, vi3Var5, z2, z3, z4, ui3Var, ui3Var2, i3, i4) { // from class: h79

                /* JADX INFO: renamed from: H */
                public final /* synthetic */ boolean f41898H;

                /* JADX INFO: renamed from: I */
                public final /* synthetic */ boolean f41899I;

                /* JADX INFO: renamed from: J */
                public final /* synthetic */ boolean f41900J;

                /* JADX INFO: renamed from: K */
                public final /* synthetic */ ui3 f41901K;

                /* JADX INFO: renamed from: L */
                public final /* synthetic */ ui3 f41902L;

                /* JADX INFO: renamed from: M */
                public final /* synthetic */ int f41903M;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f41904a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ vi3 f41905b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f41906c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f41907d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ vi3 f41908e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ String f41909f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ vi3 f41910g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ int f41911h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ String f41912i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ vi3 f41913j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ boolean f41914k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ vi3 f41915l;

                {
                    this.f41903M = i4;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    int iM19383z2 = pk9.m19383z(this.f41903M);
                    e3d.m10827b(this.f41904a, this.f41905b, this.f41906c, this.f41907d, this.f41908e, this.f41909f, this.f41910g, this.f41911h, this.f41912i, this.f41913j, this.f41914k, this.f41915l, this.f41898H, this.f41899I, this.f41900J, this.f41901K, this.f41902L, (ye1) obj, iM19383z, iM19383z2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m10828c(int i, ye1 ye1Var, ui3 ui3Var) {
        int i2;
        char c;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1587748489);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.onboarding_v2_already_have_account_prompt);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(strM23620a0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, 0, 0, 131066);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, 4.0f));
            c = 0;
            tj3Var = tj3Var;
            AbstractC0231g.m1153f((i2 & 14) | 805306368, 510, null, tj3Var, ui3Var, poc.f56616i, null, null, null, false);
            tj3Var.m22139q(true);
        } else {
            c = 0;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new d00(ui3Var, i, 6, c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:156:0x038c  */
    /* JADX WARN: Code duplicated, block: B:215:0x0577  */
    /* JADX WARN: Code duplicated, block: B:216:0x0579  */
    /* JADX WARN: Code duplicated, block: B:220:0x0582  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX INFO: renamed from: d */
    public static final void m10829d(final boolean z, final ym5 ym5Var, final vi3 vi3Var, final vi3 vi3Var2, final ui3 ui3Var, final ui3 ui3Var2, final bj3 bj3Var, final ui3 ui3Var3, vi3 vi3Var3, e16 e16Var, final String str, ye1 ye1Var, final int i) {
        int i2;
        final e16 e16Var2;
        int i3;
        int i4;
        p84 p84Var;
        int i5;
        boolean z2;
        p84 p84Var2;
        ?? r2;
        Object objM22097O;
        p84 p84Var3;
        boolean zM22120g;
        Object objM22097O2;
        vi3 vi3Var4 = vi3Var3;
        ym5Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        bj3Var.getClass();
        ui3Var3.getClass();
        vi3Var4.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(726668946);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ym5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(vi3Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22124i(ui3Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= tj3Var.m22124i(bj3Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= tj3Var.m22124i(ui3Var3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= tj3Var.m22124i(vi3Var4) ? 67108864 : 33554432;
        }
        int i6 = i2 | 805306368;
        char c = tj3Var.m22120g(str) ? (char) 4 : (char) 2;
        if (tj3Var.m22099R(i6 & 1, ((i6 & 306783379) == 306783378 && (c & 3) == 2) ? false : true)) {
            Object[] objArr = new Object[0];
            Object objM22097O3 = tj3Var.m22097O();
            p84 p84Var4 = we1.f66679a;
            if (objM22097O3 == p84Var4) {
                objM22097O3 = new ks8(7);
                tj3Var.m22131l0(objM22097O3);
            }
            t66 t66Var = (t66) xwc.m24745R(objArr, (ui3) objM22097O3, tj3Var, 48);
            Object[] objArr2 = new Object[0];
            Object objM22097O4 = tj3Var.m22097O();
            if (objM22097O4 == p84Var4) {
                objM22097O4 = new ks8(11);
                tj3Var.m22131l0(objM22097O4);
            }
            t66 t66Var2 = (t66) xwc.m24745R(objArr2, (ui3) objM22097O4, tj3Var, 48);
            Object[] objArr3 = new Object[0];
            boolean z3 = (c & 14) == 4;
            Object objM22097O5 = tj3Var.m22097O();
            if (z3 || objM22097O5 == p84Var4) {
                i3 = 0;
                objM22097O5 = new j79(str, 0);
                tj3Var.m22131l0(objM22097O5);
            } else {
                i3 = 0;
            }
            t66 t66Var3 = (t66) xwc.m24745R(objArr3, (ui3) objM22097O5, tj3Var, i3);
            Object[] objArr4 = new Object[i3];
            Object objM22097O6 = tj3Var.m22097O();
            if (objM22097O6 == p84Var4) {
                objM22097O6 = new ks8(8);
                tj3Var.m22131l0(objM22097O6);
            }
            t66 t66Var4 = (t66) xwc.m24745R(objArr4, (ui3) objM22097O6, tj3Var, 48);
            Object[] objArr5 = new Object[0];
            Object objM22097O7 = tj3Var.m22097O();
            if (objM22097O7 == p84Var4) {
                objM22097O7 = new ks8(9);
                tj3Var.m22131l0(objM22097O7);
            }
            t66 t66Var5 = (t66) xwc.m24745R(objArr5, (ui3) objM22097O7, tj3Var, 48);
            Object[] objArr6 = new Object[0];
            Object objM22097O8 = tj3Var.m22097O();
            if (objM22097O8 == p84Var4) {
                objM22097O8 = new ks8(10);
                tj3Var.m22131l0(objM22097O8);
            }
            t66 t66Var6 = (t66) xwc.m24745R(objArr6, (ui3) objM22097O8, tj3Var, 48);
            i48 i48Var = (i48) pk9.m19372j(ym5Var, new i48(0, 0, 3));
            boolean z4 = ((String) t66Var2.getValue()).length() > 0 && (ym5Var instanceof xm5) && !z;
            boolean z5 = ((String) t66Var5.getValue()).length() >= 8;
            boolean z6 = ((String) t66Var2.getValue()).length() > 0 && ((String) t66Var3.getValue()).length() > 0 && ((String) t66Var4.getValue()).length() > 0 && z5 && i48Var.f43519b == 0 && i48Var.f43518a == 0 && !z;
            b16 b16Var = b16.f7762a;
            boolean z7 = z5;
            boolean z8 = z4;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(l70.m15962y(c99.m4411d(b16Var, 1.0f)), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
            ec0 ec0Var = nj0.f52792K;
            C3587su c3587su = eh0.f37238d;
            bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var4 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var4);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var5 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var5);
            zi3 zi3Var4 = C0352b.f4301d;
            e16 e16VarM3912B0 = bna.m3912B0(e65.m10871c(tj3Var, e16VarM1322c, zi3Var4, 1.0f, true), bna.m3972r0(tj3Var), false, 14);
            bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var, 48);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM3912B0);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var4);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var5);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.onboarding_v2_signup_title), null, p58.m18900f(tj3Var).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71400d, tj3Var, 0, 0, 130042);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            if (((Boolean) t66Var.getValue()).booleanValue()) {
                tj3Var.m22111b0(-1738197935);
                String str2 = (String) t66Var2.getValue();
                boolean zM22120g2 = tj3Var.m22120g(t66Var2) | ((i6 & 896) == 256);
                Object objM22097O9 = tj3Var.m22097O();
                if (zM22120g2 || objM22097O9 == p84Var4) {
                    objM22097O9 = new ix0(vi3Var, t66Var2, 19);
                    tj3Var.m22131l0(objM22097O9);
                }
                vi3 vi3Var6 = (vi3) objM22097O9;
                int i7 = i48Var.f43519b;
                String str3 = (String) t66Var3.getValue();
                boolean zM22120g3 = tj3Var.m22120g(t66Var3);
                Object objM22097O10 = tj3Var.m22097O();
                if (zM22120g3 || objM22097O10 == p84Var4) {
                    objM22097O10 = new dt6(15, t66Var3);
                    tj3Var.m22131l0(objM22097O10);
                }
                vi3 vi3Var7 = (vi3) objM22097O10;
                String str4 = (String) t66Var4.getValue();
                boolean zM22120g4 = tj3Var.m22120g(t66Var4) | ((i6 & 7168) == 2048);
                Object objM22097O11 = tj3Var.m22097O();
                if (zM22120g4 || objM22097O11 == p84Var4) {
                    objM22097O11 = new ix0(vi3Var2, t66Var4, 20);
                    tj3Var.m22131l0(objM22097O11);
                }
                vi3 vi3Var8 = (vi3) objM22097O11;
                int i8 = i48Var.f43518a;
                String str5 = (String) t66Var5.getValue();
                boolean zM22120g5 = tj3Var.m22120g(t66Var5);
                Object objM22097O12 = tj3Var.m22097O();
                if (zM22120g5 || objM22097O12 == p84Var4) {
                    objM22097O12 = new dt6(16, t66Var5);
                    tj3Var.m22131l0(objM22097O12);
                }
                vi3 vi3Var9 = (vi3) objM22097O12;
                boolean zBooleanValue = ((Boolean) t66Var6.getValue()).booleanValue();
                boolean zM22120g6 = tj3Var.m22120g(t66Var6);
                Object objM22097O13 = tj3Var.m22097O();
                if (zM22120g6 || objM22097O13 == p84Var4) {
                    objM22097O13 = new dt6(17, t66Var6);
                    tj3Var.m22131l0(objM22097O13);
                }
                vi3 vi3Var10 = (vi3) objM22097O13;
                boolean zM22120g7 = ((i6 & 3670016) == 1048576) | tj3Var.m22120g(t66Var4) | tj3Var.m22120g(t66Var2) | tj3Var.m22120g(t66Var5) | tj3Var.m22120g(t66Var3);
                Object objM22097O14 = tj3Var.m22097O();
                if (zM22120g7 || objM22097O14 == p84Var4) {
                    objM22097O14 = new um3(bj3Var, t66Var4, t66Var2, t66Var5, t66Var3, 2);
                    tj3Var.m22131l0(objM22097O14);
                }
                i4 = i6;
                p84Var = p84Var4;
                m10827b(str2, vi3Var6, i7, str3, vi3Var7, str4, vi3Var8, i8, str5, vi3Var9, zBooleanValue, vi3Var10, z7, z6, z, (ui3) objM22097O14, ui3Var3, tj3Var, 0, ((i6 << 12) & 57344) | ((i6 >> 3) & 3670016));
                tj3Var = tj3Var;
                i5 = 0;
                tj3Var.m22139q(false);
                z2 = true;
            } else {
                tj3Var.m22111b0(-1738738761);
                String str6 = (String) t66Var2.getValue();
                boolean zM22120g8 = tj3Var.m22120g(t66Var2) | ((i6 & 896) == 256);
                Object objM22097O15 = tj3Var.m22097O();
                if (zM22120g8) {
                    p84Var3 = p84Var4;
                } else {
                    p84Var3 = p84Var4;
                    if (objM22097O15 == p84Var3) {
                    }
                    vi3 vi3Var11 = (vi3) objM22097O15;
                    int i9 = i48Var.f43519b;
                    zM22120g = tj3Var.m22120g(t66Var);
                    objM22097O2 = tj3Var.m22097O();
                    if (zM22120g || objM22097O2 == p84Var3) {
                        objM22097O2 = new un7(24, t66Var);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    int i10 = i6 << 6;
                    m10826a(str6, vi3Var11, i9, z8, z, (ui3) objM22097O2, ui3Var, ui3Var2, ui3Var3, tj3Var, (57344 & (i6 << 12)) | (3670016 & i10) | (29360128 & i10) | ((i6 << 3) & 234881024));
                    tj3Var.m22139q(false);
                    i4 = i6;
                    i5 = 0;
                    p84Var = p84Var3;
                    z2 = true;
                }
                objM22097O15 = new ix0(vi3Var, t66Var2, 18);
                tj3Var.m22131l0(objM22097O15);
                vi3 vi3Var12 = (vi3) objM22097O15;
                int i11 = i48Var.f43519b;
                zM22120g = tj3Var.m22120g(t66Var);
                objM22097O2 = tj3Var.m22097O();
                if (zM22120g) {
                    objM22097O2 = new un7(24, t66Var);
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new un7(24, t66Var);
                    tj3Var.m22131l0(objM22097O2);
                }
                int i12 = i6 << 6;
                m10826a(str6, vi3Var12, i11, z8, z, (ui3) objM22097O2, ui3Var, ui3Var2, ui3Var3, tj3Var, (57344 & (i6 << 12)) | (3670016 & i12) | (29360128 & i12) | ((i6 << 3) & 234881024));
                tj3Var.m22139q(false);
                i4 = i6;
                i5 = 0;
                p84Var = p84Var3;
                z2 = true;
            }
            tj3Var.m22139q(z2);
            e16 e16VarM21608U = AbstractC3584sr.m21608U(b16Var, ge9.m12515a(tj3Var).f38952a, ge9.m12515a(tj3Var).f38957f);
            int i13 = i4 & 234881024;
            ?? r5 = i13 == 67108864 ? z2 : i5;
            Object objM22097O16 = tj3Var.m22097O();
            if (r5 == 0) {
                p84Var2 = p84Var;
                if (objM22097O16 != p84Var2) {
                    vi3Var4 = vi3Var3;
                }
                ui3 ui3Var5 = (ui3) objM22097O16;
                if (i13 == 67108864) {
                    r2 = z2;
                } else {
                    r2 = i5;
                }
                objM22097O = tj3Var.m22097O();
                if (r2 == 0 || objM22097O == p84Var2) {
                    objM22097O = new ex8(vi3Var4, 14);
                    tj3Var.m22131l0(objM22097O);
                }
                te1.m21989c(e16VarM21608U, ui3Var5, (ui3) objM22097O, tj3Var, i5);
                tj3Var.m22139q(z2);
                e16Var2 = b16Var;
            } else {
                p84Var2 = p84Var;
            }
            vi3Var4 = vi3Var3;
            objM22097O16 = new ex8(vi3Var4, 13);
            tj3Var.m22131l0(objM22097O16);
            ui3 ui3Var6 = (ui3) objM22097O16;
            if (i13 == 67108864) {
                r2 = z2;
            } else {
                r2 = i5;
            }
            objM22097O = tj3Var.m22097O();
            if (r2 == 0) {
                objM22097O = new ex8(vi3Var4, 14);
                tj3Var.m22131l0(objM22097O);
            } else {
                objM22097O = new ex8(vi3Var4, 14);
                tj3Var.m22131l0(objM22097O);
            }
            te1.m21989c(e16VarM21608U, ui3Var6, (ui3) objM22097O, tj3Var, i5);
            tj3Var.m22139q(z2);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final vi3 vi3Var13 = vi3Var4;
            x18VarM22143u.f67642d = new zi3() { // from class: i79
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e3d.m10829d(z, ym5Var, vi3Var, vi3Var2, ui3Var, ui3Var2, bj3Var, ui3Var3, vi3Var13, e16Var2, str, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m10830e(int i, int i2, ye1 ye1Var, ui3 ui3Var, e16 e16Var, String str, boolean z) {
        int i3;
        boolean z2;
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1779701992);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (tj3Var.m22116e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tj3Var.m22120g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            z2 = z;
            i3 |= tj3Var.m22122h(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        int i5 = i3 | 24576;
        if (tj3Var.m22099R(i5 & 1, (i5 & 9363) != 9362)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4414g = c99.m4414g(c99.m4412e(b16Var, 1.0f), 52.0f);
            vh9 vh9Var = ps5.f56764b;
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            vf0 vf0VarM4714a = ci8.m4714a(1.0f, aa1.m198b(0.3f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A));
            x17 x17Var = wj0.f66899a;
            AbstractC0231g.m1151d(ui3Var, e16VarM4414g, z2, si8Var, wj0.m24002g(((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55872p, 0L, tj3Var, 14), vf0VarM4714a, null, ci8.m4703P(-1513066778, new u75(i, str, i4), tj3Var), tj3Var, ((i5 >> 3) & 896) | ((i5 >> 6) & 14) | 805306368, 416);
            tj3Var = tj3Var;
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new co5(e16Var2, str, i, z, ui3Var, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021c  */
    /* JADX WARN: Code duplicated, block: B:101:0x021e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0223  */
    /* JADX WARN: Code duplicated, block: B:108:0x0250  */
    /* JADX WARN: Code duplicated, block: B:111:0x0258  */
    /* JADX WARN: Code duplicated, block: B:113:0x0260  */
    /* JADX WARN: Code duplicated, block: B:116:0x026f  */
    /* JADX WARN: Code duplicated, block: B:118:0x027b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0281  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:134:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:78:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180  */
    /* JADX WARN: Code duplicated, block: B:81:0x0185  */
    /* JADX WARN: Code duplicated, block: B:84:0x018a A[Catch: all -> 0x0197, TryCatch #0 {all -> 0x0197, blocks: (B:82:0x0186, B:84:0x018a, B:87:0x0199), top: B:139:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0199 A[Catch: all -> 0x0197, TRY_LEAVE, TryCatch #0 {all -> 0x0197, blocks: (B:82:0x0186, B:84:0x018a, B:87:0x0199), top: B:139:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d2  */
    /* JADX INFO: renamed from: f */
    public static final void m10831f(yaa yaaVar, RemoteViews remoteViews, on3 on3Var, j64 j64Var) {
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        C0836c6 c0836c6;
        pg2 pg2Var;
        r17 r17Var;
        int i2;
        Object obj;
        ur2 ur2Var;
        lv8 lv8Var;
        int i3;
        Object obj2;
        List list;
        float fM23908c;
        float fM23908c2;
        boolean z;
        float f;
        InterfaceC3063h5 interfaceC3063h5;
        Integer num;
        int iIntValue;
        Context context = yaaVar.f69568a;
        Ref$ObjectRef ref$ObjectRef5 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef6 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef7 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef8 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef9 = new Ref$ObjectRef();
        ref$ObjectRef9.f47718a = Visibility.Visible;
        Ref$ObjectRef ref$ObjectRef10 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef11 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef12 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef13 = new Ref$ObjectRef();
        on3Var.mo11685a(xfa.f68157a, new C3548rt(ref$ObjectRef10, ref$ObjectRef5, ref$ObjectRef6, context, remoteViews, j64Var, ref$ObjectRef7, ref$ObjectRef9, ref$ObjectRef8, yaaVar, ref$ObjectRef12, ref$ObjectRef11, ref$ObjectRef13));
        m4b m4bVar = (m4b) ref$ObjectRef5.f47718a;
        cs3 cs3Var = (cs3) ref$ObjectRef6.f47718a;
        Context context2 = yaaVar.f69568a;
        Map map = xr4.f68580a;
        int i4 = j64Var.f45112b;
        int i5 = j64Var.f45111a;
        int i6 = 0;
        if (i4 != -1) {
            if (Build.VERSION.SDK_INT >= 31) {
                C3386nv.m17633t("There is currently no valid use case where a complex view is used on Android S");
                return;
            }
            pg2 pg2Var2 = m4bVar != null ? m4bVar.f50591a : null;
            pg2 pg2Var3 = cs3Var != null ? cs3Var.f34485a : null;
            if (m10834i(pg2Var2) || m10834i(pg2Var3)) {
                boolean z2 = (pg2Var2 instanceof kg2) || (pg2Var2 instanceof jg2);
                boolean z3 = (pg2Var3 instanceof kg2) || (pg2Var3 instanceof jg2);
                if (z2 && z3) {
                    i = R$layout.size_match_match;
                } else if (z2) {
                    i = R$layout.size_match_wrap;
                } else {
                    i = z3 ? R$layout.size_wrap_match : R$layout.size_wrap_wrap;
                }
                int iM11684g = fad.m11684g(remoteViews, yaaVar, R$id.sizeViewStub, i, null);
                boolean z4 = pg2Var2 instanceof ig2;
                og2 og2Var = og2.f54304a;
                ref$ObjectRef = ref$ObjectRef9;
                kg2 kg2Var = kg2.f47164a;
                ref$ObjectRef2 = ref$ObjectRef13;
                jg2 jg2Var = jg2.f45515a;
                if (z4) {
                    ref$ObjectRef4 = ref$ObjectRef11;
                    ref$ObjectRef3 = ref$ObjectRef12;
                    remoteViews.setInt(iM11684g, "setWidth", (int) TypedValue.applyDimension(1, ((ig2) pg2Var2).f44068a, context2.getResources().getDisplayMetrics()));
                } else {
                    ref$ObjectRef3 = ref$ObjectRef12;
                    ref$ObjectRef4 = ref$ObjectRef11;
                    if (pg2Var2 instanceof mg2) {
                        remoteViews.setInt(iM11684g, "setWidth", context2.getResources().getDimensionPixelSize(((mg2) pg2Var2).f51278a));
                    } else if (!fa4.m11650l(pg2Var2, jg2Var) && !fa4.m11650l(pg2Var2, kg2Var) && !fa4.m11650l(pg2Var2, og2Var) && pg2Var2 != null) {
                        gm5.m12750e();
                        return;
                    }
                }
                if (pg2Var3 instanceof ig2) {
                    remoteViews.setInt(iM11684g, "setHeight", (int) TypedValue.applyDimension(1, ((ig2) pg2Var3).f44068a, context2.getResources().getDisplayMetrics()));
                } else if (pg2Var3 instanceof mg2) {
                    remoteViews.setInt(iM11684g, "setHeight", context2.getResources().getDimensionPixelSize(((mg2) pg2Var3).f51278a));
                } else if (!fa4.m11650l(pg2Var3, jg2Var) && !fa4.m11650l(pg2Var3, kg2Var) && !fa4.m11650l(pg2Var3, og2Var) && pg2Var3 != null) {
                    gm5.m12750e();
                    return;
                }
            }
            c0836c6 = (C0836c6) ref$ObjectRef10.f47718a;
            if (c0836c6 != null) {
                interfaceC3063h5 = c0836c6.f9603a;
                num = yaaVar.f69580m;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = i5;
                }
                try {
                    if (yaaVar.f69573f) {
                        remoteViews.setOnClickFillInIntent(iIntValue, c3d.m4305a(interfaceC3063h5, yaaVar, iIntValue, new C3013ft(2)));
                    } else {
                        remoteViews.setOnClickPendingIntent(iIntValue, c3d.m4307c(interfaceC3063h5, yaaVar, iIntValue, new C3013ft(2)));
                    }
                } catch (Throwable th) {
                    Log.e("GlanceAppWidget", "Unrecognized Action: " + interfaceC3063h5, th);
                }
            }
            pg2Var = (pg2) ref$ObjectRef8.f47718a;
            if (pg2Var != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    AbstractC0780ao.m2936b(remoteViews, i5, pg2Var);
                } else {
                    Log.w("GlanceAppWidget", "Cannot set the rounded corner of views before Api 31.");
                }
            }
            r17Var = (r17) ref$ObjectRef7.f47718a;
            if (r17Var != null) {
                Resources resources = context.getResources();
                n17 n17Var = r17Var.f58487a;
                float fM23908c3 = wfb.m23908c(n17Var.f52183b, resources) + n17Var.f52182a;
                n17 n17Var2 = r17Var.f58488b;
                fM23908c = wfb.m23908c(n17Var2.f52183b, resources) + n17Var2.f52182a;
                n17 n17Var3 = r17Var.f58489c;
                float fM23908c4 = wfb.m23908c(n17Var3.f52183b, resources) + n17Var3.f52182a;
                n17 n17Var4 = r17Var.f58490d;
                float fM23908c5 = wfb.m23908c(n17Var4.f52183b, resources) + n17Var4.f52182a;
                n17 n17Var5 = r17Var.f58491e;
                fM23908c2 = wfb.m23908c(n17Var5.f52183b, resources) + n17Var5.f52182a;
                n17 n17Var6 = r17Var.f58492f;
                float fM23908c6 = wfb.m23908c(n17Var6.f52183b, resources) + n17Var6.f52182a;
                z = yaaVar.f69570c;
                if (z) {
                    f = fM23908c2;
                } else {
                    f = fM23908c;
                }
                float f2 = fM23908c3 + f;
                if (!z) {
                    fM23908c = fM23908c2;
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                i2 = 1;
                obj = null;
                remoteViews.setViewPadding(j64Var.f45111a, (int) TypedValue.applyDimension(1, f2, displayMetrics), (int) TypedValue.applyDimension(1, fM23908c4, displayMetrics), (int) TypedValue.applyDimension(1, fM23908c5 + fM23908c, displayMetrics), (int) TypedValue.applyDimension(1, fM23908c6, displayMetrics));
            } else {
                i2 = 1;
                obj = null;
            }
            if (ref$ObjectRef3.f47718a == null) {
                ho2.m13383c();
                return;
            }
            ur2Var = (ur2) ref$ObjectRef4.f47718a;
            if (ur2Var != null) {
                remoteViews.setBoolean(i5, "setEnabled", ur2Var.f64246a);
            }
            lv8Var = (lv8) ref$ObjectRef2.f47718a;
            if (lv8Var != null) {
                obj2 = lv8Var.f50195a.f46235a.get(omd.f54598c);
                if (obj2 == null) {
                    obj2 = obj;
                }
                list = (List) obj2;
                if (list != null) {
                    remoteViews.setContentDescription(i5, u91.m22596N0(list, null, null, null, null, 63));
                }
            }
            i3 = AbstractC3586st.f61375a[((Visibility) ref$ObjectRef.f47718a).ordinal()];
            if (i3 != i2) {
                if (i3 != 2) {
                    i6 = 4;
                } else {
                    if (i3 == 3) {
                        gm5.m12750e();
                        return;
                    }
                    i6 = 8;
                }
            }
            remoteViews.setViewVisibility(i5, i6);
        }
        if (m4bVar != null) {
            m10833h(context2, remoteViews, m4bVar, i5);
        }
        if (cs3Var != null) {
            m10832g(context2, remoteViews, cs3Var, i5);
        }
        ref$ObjectRef = ref$ObjectRef9;
        ref$ObjectRef3 = ref$ObjectRef12;
        ref$ObjectRef4 = ref$ObjectRef11;
        ref$ObjectRef2 = ref$ObjectRef13;
        c0836c6 = (C0836c6) ref$ObjectRef10.f47718a;
        if (c0836c6 != null) {
            interfaceC3063h5 = c0836c6.f9603a;
            num = yaaVar.f69580m;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = i5;
            }
            if (yaaVar.f69573f) {
                remoteViews.setOnClickFillInIntent(iIntValue, c3d.m4305a(interfaceC3063h5, yaaVar, iIntValue, new C3013ft(2)));
            } else {
                remoteViews.setOnClickPendingIntent(iIntValue, c3d.m4307c(interfaceC3063h5, yaaVar, iIntValue, new C3013ft(2)));
            }
        }
        pg2Var = (pg2) ref$ObjectRef8.f47718a;
        if (pg2Var != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC0780ao.m2936b(remoteViews, i5, pg2Var);
            } else {
                Log.w("GlanceAppWidget", "Cannot set the rounded corner of views before Api 31.");
            }
        }
        r17Var = (r17) ref$ObjectRef7.f47718a;
        if (r17Var != null) {
            Resources resources2 = context.getResources();
            n17 n17Var7 = r17Var.f58487a;
            float fM23908c7 = wfb.m23908c(n17Var7.f52183b, resources2) + n17Var7.f52182a;
            n17 n17Var8 = r17Var.f58488b;
            fM23908c = wfb.m23908c(n17Var8.f52183b, resources2) + n17Var8.f52182a;
            n17 n17Var9 = r17Var.f58489c;
            float fM23908c8 = wfb.m23908c(n17Var9.f52183b, resources2) + n17Var9.f52182a;
            n17 n17Var10 = r17Var.f58490d;
            float fM23908c9 = wfb.m23908c(n17Var10.f52183b, resources2) + n17Var10.f52182a;
            n17 n17Var11 = r17Var.f58491e;
            fM23908c2 = wfb.m23908c(n17Var11.f52183b, resources2) + n17Var11.f52182a;
            n17 n17Var12 = r17Var.f58492f;
            float fM23908c10 = wfb.m23908c(n17Var12.f52183b, resources2) + n17Var12.f52182a;
            z = yaaVar.f69570c;
            if (z) {
                f = fM23908c2;
            } else {
                f = fM23908c;
            }
            float f3 = fM23908c7 + f;
            if (!z) {
                fM23908c = fM23908c2;
            }
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            i2 = 1;
            obj = null;
            remoteViews.setViewPadding(j64Var.f45111a, (int) TypedValue.applyDimension(1, f3, displayMetrics2), (int) TypedValue.applyDimension(1, fM23908c8, displayMetrics2), (int) TypedValue.applyDimension(1, fM23908c9 + fM23908c, displayMetrics2), (int) TypedValue.applyDimension(1, fM23908c10, displayMetrics2));
        } else {
            i2 = 1;
            obj = null;
        }
        if (ref$ObjectRef3.f47718a == null) {
            ho2.m13383c();
            return;
        }
        ur2Var = (ur2) ref$ObjectRef4.f47718a;
        if (ur2Var != null) {
            remoteViews.setBoolean(i5, "setEnabled", ur2Var.f64246a);
        }
        lv8Var = (lv8) ref$ObjectRef2.f47718a;
        if (lv8Var != null) {
            obj2 = lv8Var.f50195a.f46235a.get(omd.f54598c);
            if (obj2 == null) {
                obj2 = obj;
            }
            list = (List) obj2;
            if (list != null) {
                remoteViews.setContentDescription(i5, u91.m22596N0(list, null, null, null, null, 63));
            }
        }
        i3 = AbstractC3586st.f61375a[((Visibility) ref$ObjectRef.f47718a).ordinal()];
        if (i3 != i2) {
            if (i3 != 2) {
                i6 = 4;
            } else {
                if (i3 == 3) {
                    gm5.m12750e();
                    return;
                }
                i6 = 8;
            }
        }
        remoteViews.setViewVisibility(i5, i6);
    }

    /* JADX INFO: renamed from: g */
    public static final void m10832g(Context context, RemoteViews remoteViews, cs3 cs3Var, int i) {
        pg2 pg2Var = cs3Var.f34485a;
        int i2 = Build.VERSION.SDK_INT;
        jg2 jg2Var = jg2.f45515a;
        og2 og2Var = og2.f54304a;
        if (i2 < 31) {
            if (vz1.m23605K(og2Var, kg2.f47164a, jg2Var).contains(xr4.m24655e(pg2Var, context))) {
                return;
            }
            ij6.m13965w("Using a height of ", pg2Var, " requires a complex layout before API 31");
        } else if (i2 >= 33 || !vz1.m23605K(og2Var, jg2Var).contains(pg2Var)) {
            AbstractC0780ao.m2945k(remoteViews, i, pg2Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m10833h(Context context, RemoteViews remoteViews, m4b m4bVar, int i) {
        pg2 pg2Var = m4bVar.f50591a;
        int i2 = Build.VERSION.SDK_INT;
        jg2 jg2Var = jg2.f45515a;
        og2 og2Var = og2.f54304a;
        if (i2 < 31) {
            if (vz1.m23605K(og2Var, kg2.f47164a, jg2Var).contains(xr4.m24655e(pg2Var, context))) {
                return;
            }
            ij6.m13965w("Using a width of ", pg2Var, " requires a complex layout before API 31");
        } else if (i2 >= 33 || !vz1.m23605K(og2Var, jg2Var).contains(pg2Var)) {
            AbstractC0780ao.m2946l(remoteViews, i, pg2Var);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m10834i(pg2 pg2Var) {
        if ((pg2Var instanceof ig2) || (pg2Var instanceof mg2)) {
            return true;
        }
        if (!fa4.m11650l(pg2Var, jg2.f45515a) && !fa4.m11650l(pg2Var, kg2.f47164a) && !fa4.m11650l(pg2Var, og2.f54304a) && pg2Var != null) {
            gm5.m12750e();
        }
        return false;
    }
}
