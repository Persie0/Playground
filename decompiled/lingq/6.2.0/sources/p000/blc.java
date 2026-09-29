package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.reader.R$drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public abstract class blc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f8666a = new C0282a(1006784410, false, new ce1(23));

    /* JADX INFO: renamed from: b */
    public static final C0282a f8667b = new C0282a(734348123, false, new ce1(24));

    /* JADX INFO: renamed from: a */
    public static final void m3872a(e16 e16Var, final int i, final List list, final float f, ye1 ye1Var, int i2) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1954786996);
        int i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i2 | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22124i(list) ? 256 : 128) | (tj3Var.m22114d(f) ? 2048 : 1024);
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            qid.m19982b(e16Var, ci8.m4703P(867809557, new zi3() { // from class: y08
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    tj3 tj3Var2;
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var3).f38956e);
                        bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM21607T);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        zi3 zi3Var = C0352b.f4303f;
                        oha.m18001g(tj3Var3, zi3Var, bb1VarM230a);
                        zi3 zi3Var2 = C0352b.f4302e;
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var3 = C0352b.f4304g;
                        oha.m18001g(tj3Var3, zi3Var3, numValueOf);
                        vi3 vi3Var = C0352b.f4305h;
                        oha.m18000f(tj3Var3, vi3Var);
                        zi3 zi3Var4 = C0352b.f4301d;
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c);
                        e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                        fc0 fc0Var = nj0.f52789H;
                        C3549ru c3549ru = eh0.f37236b;
                        sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var3, 48);
                        int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m2 = tj3Var3.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e);
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a);
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var3, tj3Var3, vi3Var);
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
                        bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_timer, tj3Var3, 0), null, c99.m4422o(b16Var, 24.0f), null, null, 0.0f, null, tj3Var3, 440, 120);
                        thb.m22044c(tj3Var3, c99.m4426s(b16Var, ge9.m12515a(tj3Var3).f38955d));
                        lw9.m16554b(vz1.m23620a0(tj3Var3, R$string.stats_reading_speed), null, p58.m18900f(tj3Var3).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71405i, tj3Var3, 0, 0, 131066);
                        tj3Var3.m22139q(true);
                        thb.m22044c(tj3Var3, c99.m4414g(b16Var, ge9.m12515a(tj3Var3).f38952a));
                        lw9.m16554b(vz1.m23620a0(tj3Var3, com.lingq.feature.reader.R$string.stats_today_wpm_speed), null, p58.m18900f(tj3Var3).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, 0, 0, 131066);
                        sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, nj0.f52790I, tj3Var3, 48);
                        int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m3 = tj3Var3.m22132m();
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, b16Var);
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a2);
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m3);
                        AbstractC3393o1.m17747v(iHashCode3, tj3Var3, zi3Var3, tj3Var3, vi3Var);
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c3);
                        lw9.m16554b(String.valueOf(i), null, p58.m18900f(tj3Var3).f55873q, null, 0L, null, bc3.f8324j, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71400d, tj3Var3, 1572864, 0, 131002);
                        lw9.m16554b(vz1.m23620a0(tj3Var3, com.lingq.feature.reader.R$string.stats_wpm_unit), AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var3).f38955d, 0.0f, 0.0f, ge9.m12515a(tj3Var3).f38955d, 6), p58.m18900f(tj3Var3).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71406j, tj3Var3, 0, 0, 131064);
                        tj3Var3.m22139q(true);
                        thb.m22044c(tj3Var3, c99.m4414g(b16Var, ge9.m12515a(tj3Var3).f38956e));
                        List list2 = list;
                        if (list2.size() > 1) {
                            tj3Var3.m22111b0(1297722015);
                            List list3 = list2;
                            ArrayList arrayList = new ArrayList(v91.m23189q0(list3, 10));
                            int i4 = 0;
                            for (Object obj3 : list3) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    vz1.m23628e0();
                                    throw null;
                                }
                                Pair pair = (Pair) obj3;
                                arrayList.add(new lc5((String) pair.f47623a, i4, ((Number) pair.f47624b).floatValue()));
                                i4 = i5;
                            }
                            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                            vh9 vh9Var = cx2.f34676a;
                            lnc.m16398a(e16VarM4412e2, arrayList, ((bx2) tj3Var3.m22128k(vh9Var)).m4214g(), ((bx2) tj3Var3.m22128k(vh9Var)).m4218k(), true, 0.0f, tj3Var3, 24582);
                            e16 e16VarM22984g = ux5.m22984g(b16Var, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38952a, tj3Var3, b16Var, 1.0f);
                            sj8 sj8VarM20003a3 = qj8.m20003a(eh0.f37242h, nj0.f52817l, tj3Var3, 6);
                            int iHashCode4 = Long.hashCode(tj3Var3.f62385T);
                            l77 l77VarM22132m4 = tj3Var3.m22132m();
                            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var3, e16VarM22984g);
                            se1.f60731q.getClass();
                            ui3 ui3Var2 = C0352b.f4299b;
                            tj3Var3.m22119f0();
                            if (tj3Var3.f62384S) {
                                tj3Var3.m22130l(ui3Var2);
                            } else {
                                tj3Var3.m22137o0();
                            }
                            oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a3);
                            oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m4);
                            oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode4));
                            oha.m18000f(tj3Var3, C0352b.f4305h);
                            oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c4);
                            String strM23620a0 = vz1.m23620a0(tj3Var3, com.lingq.feature.reader.R$string.stats_six_month_progress);
                            vh9 vh9Var2 = ps5.f56764b;
                            lw9.m16554b(strM23620a0, null, ((ms5) tj3Var3.m22128k(vh9Var2)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(vh9Var2)).f51800b.f71407k, tj3Var3, 0, 0, 131066);
                            tj3Var2 = tj3Var3;
                            h5d.m13070c(f, null, tj3Var2, 0);
                            tj3Var2.m22139q(true);
                            tj3Var2.m22139q(false);
                        } else {
                            tj3Var3.m22111b0(1298975717);
                            lw9.m16554b(vz1.m23620a0(tj3Var3, com.lingq.feature.reader.R$string.stats_wpm_monthly_average_tip), null, p58.m18900f(tj3Var3).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, 0, 0, 131066);
                            tj3Var2 = tj3Var3;
                            tj3Var2.m22139q(false);
                        }
                        tj3Var2.m22139q(true);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, (i3 & 14) | 48, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new z08(e16Var, i, list, f, i2);
        }
    }
}
