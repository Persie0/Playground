package p000;

import android.content.Context;
import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.glance.appwidget.components.AbstractC0655b;
import com.lingq.core.designsystem.R$color;
import com.lingq.core.p012ui.AbstractC1916a;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.reader.R$drawable;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bs0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8910a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f8911b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f8912c;

    public /* synthetic */ bs0(int i, Object obj, int i2) {
        this.f8910a = i2;
        this.f8911b = i;
        this.f8912c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x07a8  */
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        boolean zM22124i;
        Object objM22097O;
        List listM23605K;
        int i = this.f8910a;
        p84 p84Var = we1.f66679a;
        int i2 = 28;
        int i3 = this.f8911b;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        Object obj4 = this.f8912c;
        switch (i) {
            case 0:
                hr0 hr0Var = (hr0) obj4;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM4412e, ((fe9) tj3Var.m22128k(zf1Var)).f38957f);
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(i2)), nj0.f52793L, tj3Var, 48);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    b6d.m3383c(null, vz1.m23620a0(tj3Var, R$string.stats_known_words), hr0Var, d32.m10035e(hr0Var.f42819d), tj3Var, 0);
                    b6d.m3388h(i3, 0, tj3Var, null);
                    tj3Var.m22139q(true);
                }
                break;
            case 1:
                vi3 vi3Var = (vi3) obj4;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    zf1 zf1Var2 = ge9.f40637a;
                    e16 e16VarM21609V = AbstractC3584sr.m21609V(AbstractC3584sr.m21607T(b16Var, ((fe9) tj3Var2.m22128k(zf1Var2)).f38952a), ((fe9) tj3Var2.m22128k(zf1Var2)).f38952a, 0.0f, 2);
                    bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(((fe9) tj3Var2.m22128k(zf1Var2)).f38952a, true, new gm5(i2)), nj0.f52791J, tj3Var2, 0);
                    int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m2 = tj3Var2.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM21609V);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var2);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a2);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c2);
                    lw9.m16554b(vz1.m23620a0(tj3Var2, R$string.settings_font_size), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71404h, tj3Var2, 0, 0, 131070);
                    AbstractC1916a.m8794a(c99.m4426s(b16Var, 240.0f), this.f8911b, ua3.f63636a, vi3Var, tj3Var2, 6);
                    tj3Var2.m22139q(true);
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj2;
                ((Integer) obj3).getClass();
                ((uj8) obj).getClass();
                AbstractC0655b.m2219a(new C0850ck(i3), "Active Playlist", (tg9) obj4, null, false, null, ((vn2) ((tj3) ye1Var3).m22128k(yf1.f69766e)).f65636e, ye1Var3, 196608, 24);
                break;
            case 3:
                a85 a85Var = (a85) obj4;
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var4;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    tj3Var3.m22102U();
                } else {
                    z75 z75Var = (z75) a85Var;
                    wy5 wy5Var = z75Var.f71018a;
                    Context context = (Context) tj3Var3.m22128k(AbstractC0394f.f4761b);
                    e16 e16VarM21607T2 = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var3).f38956e);
                    C3587su c3587su = eh0.f37238d;
                    bb1 bb1VarM230a3 = ab1.m230a(c3587su, nj0.f52791J, tj3Var3, 0);
                    int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m3 = tj3Var3.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, e16VarM21607T2);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var3);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var3, zi3Var, bb1VarM230a3);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m3);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var3, zi3Var3, numValueOf);
                    vi3 vi3Var2 = C0352b.f4305h;
                    oha.m18000f(tj3Var3, vi3Var2);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c3);
                    e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                    jj5 jj5Var = eh0.f37242h;
                    sj8 sj8VarM20003a = qj8.m20003a(jj5Var, nj0.f52817l, tj3Var3, 6);
                    int iHashCode4 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m4 = tj3Var3.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e2);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var3);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a);
                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m4);
                    AbstractC3393o1.m17747v(iHashCode4, tj3Var3, zi3Var3, tj3Var3, vi3Var2);
                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c4);
                    fc0 fc0Var = nj0.f52789H;
                    C3549ru c3549ru = eh0.f37236b;
                    sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, fc0Var, tj3Var3, 48);
                    int iHashCode5 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m5 = tj3Var3.m22132m();
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var3, b16Var);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var3);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a2);
                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m5);
                    AbstractC3393o1.m17747v(iHashCode5, tj3Var3, zi3Var3, tj3Var3, vi3Var2);
                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c5);
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_words_vocabulary, tj3Var3, 0), vz1.m23620a0(tj3Var3, R$string.stats_known_words), null, 0L, tj3Var3, 8, 12);
                    thb.m22044c(tj3Var3, c99.m4426s(b16Var, ge9.m12515a(tj3Var3).f38955d));
                    String strM23620a0 = vz1.m23620a0(tj3Var3, R$string.stats_known_words);
                    vx9 vx9Var = p58.m18902j(tj3Var3).f71406j;
                    bc3 bc3Var = bc3.f8324j;
                    lw9.m16554b(strM23620a0, null, 0L, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var3, 1572864, 0, 131006);
                    tj3Var3.m22139q(true);
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(b16Var, ge9.m12515a(tj3Var3).f38952a, ge9.m12515a(tj3Var3).f38955d);
                    gc0 gc0Var = nj0.f52808c;
                    ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
                    int iHashCode6 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m6 = tj3Var3.m22132m();
                    e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var3, e16VarM21608U);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var3);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var, ht5VarM19966d);
                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m6);
                    AbstractC3393o1.m17747v(iHashCode6, tj3Var3, zi3Var3, tj3Var3, vi3Var2);
                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c6);
                    if (wy5Var != null) {
                        tj3Var3.m22111b0(871242009);
                        bq1.m4042R(AbstractC3423or.m18236U(ss5.m21679D(context, "ic_level_" + wy5Var.f67522c), tj3Var3, 0), AbstractC3423or.m18229N(wy5Var, context), te1.m21995i(1.0f, c99.m4422o(b16Var, 40.0f), false), nj0.f52812g, hl1.f42565b, 0.0f, null, tj3Var3, 28040, 96);
                        tj3Var3.m22139q(false);
                    } else {
                        tj3Var3.m22111b0(871961767);
                        tj3Var3.m22139q(false);
                    }
                    tj3Var3.m22139q(true);
                    tj3Var3.m22139q(true);
                    e16 e16VarM22984g = ux5.m22984g(b16Var, ge9.m12515a(tj3Var3).f38956e, tj3Var3, b16Var, 1.0f);
                    sj8 sj8VarM20003a3 = qj8.m20003a(c3549ru, fc0Var, tj3Var3, 48);
                    int iHashCode7 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m7 = tj3Var3.m22132m();
                    e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var3, e16VarM22984g);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var3);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a3);
                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m7);
                    AbstractC3393o1.m17747v(iHashCode7, tj3Var3, zi3Var3, tj3Var3, vi3Var2);
                    as4 as4VarM10871c = e65.m10871c(tj3Var3, e16VarM1322c7, zi3Var4, 1.0f, true);
                    bb1 bb1VarM230a4 = ab1.m230a(c3587su, nj0.f52792K, tj3Var3, 48);
                    int iHashCode8 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m8 = tj3Var3.m22132m();
                    e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var3, as4VarM10871c);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var3);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var, bb1VarM230a4);
                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m8);
                    AbstractC3393o1.m17747v(iHashCode8, tj3Var3, zi3Var3, tj3Var3, vi3Var2);
                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c8);
                    sj8 sj8VarM20003a4 = qj8.m20003a(eh0.f37240f, fc0Var, tj3Var3, 54);
                    int iHashCode9 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m9 = tj3Var3.m22132m();
                    e16 e16VarM1322c9 = AbstractC0287b.m1322c(tj3Var3, b16Var);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var3);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a4);
                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m9);
                    AbstractC3393o1.m17747v(iHashCode9, tj3Var3, zi3Var3, tj3Var3, vi3Var2);
                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c9);
                    lw9.m16554b(String.valueOf(z75Var.f71021d), null, 0L, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71400d, tj3Var3, 1572864, 0, 131006);
                    thb.m22044c(tj3Var3, c99.m4426s(b16Var, ge9.m12515a(tj3Var3).f38952a));
                    e16 e16VarM21608U2 = AbstractC3584sr.m21608U(d32.m10007D(b16Var, aa1.m198b(0.2f, cx2.m9917a(tj3Var3).m4212e()), p58.m18901i(tj3Var3).f64856b), ge9.m12515a(tj3Var3).f38952a, ge9.m12515a(tj3Var3).f38955d);
                    ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                    int iHashCode10 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m10 = tj3Var3.m22132m();
                    e16 e16VarM1322c10 = AbstractC0287b.m1322c(tj3Var3, e16VarM21608U2);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var3);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var, ht5VarM19966d2);
                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m10);
                    AbstractC3393o1.m17747v(iHashCode10, tj3Var3, zi3Var3, tj3Var3, vi3Var2);
                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c10);
                    lw9.m16554b("+" + i3, null, cx2.m9917a(tj3Var3).m4212e(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71406j, tj3Var3, 0, 0, 131066);
                    tj3Var3.m22139q(true);
                    tj3Var3.m22139q(true);
                    tj3Var3.m22139q(true);
                    tj3Var3.m22139q(true);
                    thb.m22044c(tj3Var3, c99.m4414g(b16Var, ge9.m12515a(tj3Var3).f38956e));
                    Integer num = z75Var.f71022e;
                    e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                    sj8 sj8VarM20003a5 = qj8.m20003a(jj5Var, fc0Var, tj3Var3, 54);
                    int iHashCode11 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m11 = tj3Var3.m22132m();
                    e16 e16VarM1322c11 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e3);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var3);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a5);
                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m11);
                    AbstractC3393o1.m17747v(iHashCode11, tj3Var3, zi3Var3, tj3Var3, vi3Var2);
                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c11);
                    if (num == null) {
                        tj3Var3.m22111b0(-1341753451);
                        tj3Var3.m22139q(false);
                        str = null;
                    } else {
                        tj3Var3.m22111b0(-1341753450);
                        str = num.intValue() + " " + vz1.m23620a0(tj3Var3, com.lingq.feature.reader.R$string.stats_words_to_next_level);
                        tj3Var3.m22139q(false);
                    }
                    String strM24216a = "";
                    lw9.m16554b(str == null ? "" : str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, 0, 0, 131070);
                    e16 e16VarM21608U3 = AbstractC3584sr.m21608U(d32.m10007D(b16Var, aa1.m198b(0.8f, cx2.m9917a(tj3Var3).m4208a()), p58.m18901i(tj3Var3).f64856b), ge9.m12515a(tj3Var3).f38952a, ge9.m12515a(tj3Var3).f38955d);
                    ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var, false);
                    int iHashCode12 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m12 = tj3Var3.m22132m();
                    e16 e16VarM1322c12 = AbstractC0287b.m1322c(tj3Var3, e16VarM21608U3);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var3);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var, ht5VarM19966d3);
                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m12);
                    AbstractC3393o1.m17747v(iHashCode12, tj3Var3, zi3Var3, tj3Var3, vi3Var2);
                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c12);
                    if (num == null) {
                        wy5 wy5Var2 = z75Var.f71018a;
                        String strM24216a2 = wy5Var2 != null ? wy5Var2.m24216a() : null;
                        if (strM24216a2 != null) {
                            str2 = strM24216a2;
                        }
                        vx9 vx9Var2 = p58.m18902j(tj3Var3).f71407k;
                        int i4 = aa1.f413l;
                        lw9.m16554b(str2, null, aa1.f406e, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var2, tj3Var3, 1573248, 0, 131002);
                        tj3Var3.m22139q(true);
                        tj3Var3.m22139q(true);
                        thb.m22044c(tj3Var3, c99.m4414g(b16Var, ge9.m12515a(tj3Var3).f38955d));
                        zM22124i = tj3Var3.m22124i(a85Var);
                        objM22097O = tj3Var3.m22097O();
                        if (zM22124i || objM22097O == p84Var) {
                            objM22097O = new sk4(a85Var, 0);
                            tj3Var3.m22131l0(objM22097O);
                        }
                        dn7.m10494c((ui3) objM22097O, pb1.m19045o(c99.m4414g(c99.m4412e(b16Var, 1.0f), 8.0f), p58.m18901i(tj3Var3).f64856b), ss5.m21716l(wy5Var), 0L, 0, 0.0f, null, tj3Var3, 0, 120);
                        tj3Var3.m22139q(true);
                    } else {
                        strM24216a = z75Var.f71019b.m24216a();
                    }
                    str2 = strM24216a;
                    vx9 vx9Var3 = p58.m18902j(tj3Var3).f71407k;
                    int i5 = aa1.f413l;
                    lw9.m16554b(str2, null, aa1.f406e, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var3, tj3Var3, 1573248, 0, 131002);
                    tj3Var3.m22139q(true);
                    tj3Var3.m22139q(true);
                    thb.m22044c(tj3Var3, c99.m4414g(b16Var, ge9.m12515a(tj3Var3).f38955d));
                    zM22124i = tj3Var3.m22124i(a85Var);
                    objM22097O = tj3Var3.m22097O();
                    if (zM22124i) {
                        objM22097O = new sk4(a85Var, 0);
                        tj3Var3.m22131l0(objM22097O);
                    } else {
                        objM22097O = new sk4(a85Var, 0);
                        tj3Var3.m22131l0(objM22097O);
                    }
                    dn7.m10494c((ui3) objM22097O, pb1.m19045o(c99.m4414g(c99.m4412e(b16Var, 1.0f), 8.0f), p58.m18901i(tj3Var3).f64856b), ss5.m21716l(wy5Var), 0L, 0, 0.0f, null, tj3Var3, 0, 120);
                    tj3Var3.m22139q(true);
                }
                break;
            case 4:
                ye1 ye1Var5 = (ye1) obj2;
                ((Integer) obj3).getClass();
                ((InterfaceC0067f) obj).getClass();
                String str3 = i3 + " / " + ((cu7) ((du7) obj4)).f34548a;
                vh9 vh9Var = ps5.f56764b;
                tj3 tj3Var4 = (tj3) ye1Var5;
                lw9.m16554b(str3, AbstractC3584sr.m21608U(d32.m10007D(b16Var, ((ms5) tj3Var4.m22128k(vh9Var)).f51799a.f55822G, ui8.m22753b(6.0f)), 8.0f, 4.0f), ((ms5) tj3Var4.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var4.m22128k(vh9Var)).f51800b.f71411o, ye1Var5, 0, 0, 130040);
                break;
            default:
                ui3 ui3Var4 = (ui3) obj4;
                ye1 ye1Var6 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var5 = (tj3) ye1Var6;
                if (!tj3Var5.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    tj3Var5.m22102U();
                } else {
                    zf1 zf1Var3 = ge9.f40637a;
                    e16 e16VarM21607T3 = AbstractC3584sr.m21607T(b16Var, ((fe9) tj3Var5.m22128k(zf1Var3)).f38956e);
                    sj8 sj8VarM20003a6 = qj8.m20003a(new C3661uu(((fe9) tj3Var5.m22128k(zf1Var3)).f38952a, true, new gm5(i2)), nj0.f52817l, tj3Var5, 0);
                    int iHashCode13 = Long.hashCode(tj3Var5.f62385T);
                    l77 l77VarM22132m13 = tj3Var5.m22132m();
                    e16 e16VarM1322c13 = AbstractC0287b.m1322c(tj3Var5, e16VarM21607T3);
                    se1.f60731q.getClass();
                    ui3 ui3Var5 = C0352b.f4299b;
                    tj3Var5.m22119f0();
                    if (tj3Var5.f62384S) {
                        tj3Var5.m22130l(ui3Var5);
                    } else {
                        tj3Var5.m22137o0();
                    }
                    oha.m18001g(tj3Var5, C0352b.f4303f, sj8VarM20003a6);
                    oha.m18001g(tj3Var5, C0352b.f4302e, l77VarM22132m13);
                    oha.m18001g(tj3Var5, C0352b.f4304g, Integer.valueOf(iHashCode13));
                    oha.m18000f(tj3Var5, C0352b.f4305h);
                    oha.m18001g(tj3Var5, C0352b.f4301d, e16VarM1322c13);
                    bq1.m4042R(AbstractC3423or.m18236U(com.lingq.core.p012ui.R$drawable.ic_fire_red, tj3Var5, 0), null, null, null, null, 0.0f, new qd0(5, j8d.m14343a(tj3Var5, R$color.orange_activity_7)), tj3Var5, 56, 60);
                    int i6 = i3 - 1;
                    String strM23618Z = vz1.m23618Z(com.lingq.core.achievements.R$string.streak_hit_goal_next_n_days, new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)}, tj3Var5);
                    int iM23389l0 = vk9.m23389l0(strM23618Z, String.valueOf(i3), 0, false, 6);
                    int iM23394q0 = vk9.m23394q0(strM23618Z, 6, String.valueOf(i6));
                    try {
                        bc3 bc3Var2 = bc3.f8326l;
                        listM23605K = vz1.m23605K(new C3378nn(new he9(0L, 0L, bc3Var2, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), iM23389l0 < 0 ? 0 : iM23389l0, iM23389l0 + String.valueOf(i3).length()), new C3378nn(new he9(0L, 0L, bc3Var2, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), iM23394q0 < 0 ? 0 : iM23394q0, iM23394q0 + String.valueOf(i6).length()));
                    } catch (Exception unused) {
                        listM23605K = EmptyList.f47638a;
                    }
                    as4 as4Var = new as4(1.0f, true);
                    C3419on c3419on = new C3419on(0, strM23618Z, listM23605K);
                    vh9 vh9Var2 = ps5.f56764b;
                    lw9.m16555c(c3419on, as4Var, ((ms5) tj3Var5.m22128k(vh9Var2)).f51799a.f55873q, null, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((ms5) tj3Var5.m22128k(vh9Var2)).f51800b.f71404h, tj3Var5, 0, 0, 262136);
                    e16 e16VarM21607T4 = AbstractC3584sr.m21607T(c99.m4422o(b16Var, 24.0f), 0.0f);
                    boolean zM22120g = tj3Var5.m22120g(ui3Var4);
                    Object objM22097O2 = tj3Var5.m22097O();
                    if (zM22120g || objM22097O2 == p84Var) {
                        objM22097O2 = new zy7(11, ui3Var4);
                        tj3Var5.m22131l0(objM22097O2);
                    }
                    omd.m18141c((ui3) objM22097O2, e16VarM21607T4, false, null, null, hpc.f42761a, tj3Var5, 1572912, 60);
                    tj3Var5.m22139q(true);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ bs0(Object obj, int i, int i2) {
        this.f8910a = i2;
        this.f8912c = obj;
        this.f8911b = i;
    }
}
