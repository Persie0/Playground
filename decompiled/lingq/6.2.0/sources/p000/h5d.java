package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.room.util.AbstractC0758a;
import androidx.work.WorkInfo$State;
import androidx.work.impl.C0773b;
import androidx.work.impl.C0778d;
import androidx.work.impl.WorkDatabase;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.reader.R$drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h5d {
    /* JADX INFO: renamed from: a */
    public static final void m13068a(int i, long j, ye1 ye1Var, String str) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2047051112);
        int i2 = 2;
        int i3 = i | (tj3Var.m22118f(j) ? 4 : 2) | (tj3Var.m22120g(str) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            e16 e16VarM4422o = c99.m4422o(b16Var, 8.0f);
            boolean z = (i3 & 14) == 4;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new C3405od(i2, j);
                tj3Var.m22131l0(objM22097O);
            }
            eh0.m11124d(e16VarM4422o, (vi3) objM22097O, tj3Var, 6);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d));
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(str, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71408l, tj3Var, (i3 >> 3) & 14, 0, 131066);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new np4(str, i, j);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m13069b(final e16 e16Var, final int i, final List list, final List list2, final float f, final float f2, ye1 ye1Var, final int i2) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-93847984);
        int i3 = i2 | (tj3Var.m22120g(e16Var) ? 4 : 2) | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22124i(list) ? 256 : 128) | (tj3Var.m22124i(list2) ? 2048 : 1024) | (tj3Var.m22114d(f) ? 16384 : 8192) | (tj3Var.m22114d(f2) ? 131072 : 65536);
        if (tj3Var.m22099R(i3 & 1, (74899 & i3) != 74898)) {
            qid.m19982b(e16Var, ci8.m4703P(49170575, new zi3() { // from class: rl9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    List list3;
                    float f3;
                    boolean z;
                    String strM23620a0;
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    fc0 fc0Var = nj0.f52817l;
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var2).f38956e);
                        bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                        int iHashCode = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m = tj3Var2.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21607T);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        zi3 zi3Var = C0352b.f4303f;
                        oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
                        zi3 zi3Var2 = C0352b.f4302e;
                        oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var3 = C0352b.f4304g;
                        oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                        vi3 vi3Var = C0352b.f4305h;
                        oha.m18000f(tj3Var2, vi3Var);
                        zi3 zi3Var4 = C0352b.f4301d;
                        oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                        e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                        sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var2, 48);
                        int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m2 = tj3Var2.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
                        oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                        oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                        bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_hourglass, tj3Var2, 0), null, c99.m4422o(b16Var, 24.0f), null, null, 0.0f, null, tj3Var2, 440, 120);
                        thb.m22044c(tj3Var2, c99.m4426s(b16Var, ge9.m12515a(tj3Var2).f38955d));
                        lw9.m16554b(vz1.m23620a0(tj3Var2, R$string.stats_study_time), null, p58.m18900f(tj3Var2).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71405i, tj3Var2, 0, 0, 131066);
                        tj3Var2.m22139q(true);
                        thb.m22044c(tj3Var2, c99.m4414g(b16Var, ge9.m12515a(tj3Var2).f38952a));
                        lw9.m16554b(vz1.m23620a0(tj3Var2, com.lingq.feature.reader.R$string.stats_todays_study_time), null, p58.m18900f(tj3Var2).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71407k, tj3Var2, 0, 0, 131066);
                        final int i4 = i;
                        lw9.m16554b((i4 / 60) + "h " + (i4 % 60) + "m", null, p58.m18900f(tj3Var2).f55873q, null, 0L, null, bc3.f8324j, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71400d, tj3Var2, 1572864, 0, 131002);
                        tj3 tj3Var3 = tj3Var2;
                        thb.m22044c(tj3Var3, c99.m4414g(b16Var, ge9.m12515a(tj3Var3).f38952a));
                        List list4 = list;
                        int size = list4.size();
                        List list5 = list2;
                        if (size <= 1 || list5.isEmpty()) {
                            list3 = list5;
                            tj3Var3.m22111b0(-2085668059);
                            lw9.m16554b(vz1.m23620a0(tj3Var3, com.lingq.feature.reader.R$string.stats_study_time_empty_tip), null, p58.m18900f(tj3Var3).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, 0, 0, 131066);
                            tj3Var3 = tj3Var3;
                            f3 = ge9.m12515a(tj3Var3).f38956e;
                        } else {
                            tj3Var3.m22111b0(-2087143845);
                            List list6 = list5;
                            ArrayList arrayList = new ArrayList(v91.m23189q0(list6, 10));
                            Iterator it = list6.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Float.valueOf(((Number) ((Pair) it.next()).f47624b).floatValue()));
                            }
                            final float fM22631x0 = (float) u91.m22631x0(arrayList);
                            if (fM22631x0 > 0.0f) {
                                tj3Var3.m22111b0(-2087019907);
                                e16 e16VarM4414g = c99.m4414g(c99.m4412e(b16Var, 1.0f), 8.0f);
                                long jM4208a = ((bx2) tj3Var3.m22128k(cx2.f34676a)).m4208a();
                                boolean zM22116e = tj3Var3.m22116e(i4) | tj3Var3.m22114d(fM22631x0);
                                Object objM22097O = tj3Var3.m22097O();
                                if (zM22116e || objM22097O == we1.f66679a) {
                                    objM22097O = new ui3() { // from class: tl9
                                        @Override // p000.ui3
                                        /* JADX INFO: renamed from: a */
                                        public final Object mo0a() {
                                            float f4 = i4;
                                            float f5 = fM22631x0;
                                            return Float.valueOf(f5 > 0.0f ? l70.m15944g(f4 / f5, 0.0f, 1.0f) : 0.0f);
                                        }
                                    };
                                    tj3Var3.m22131l0(objM22097O);
                                }
                                list3 = list5;
                                dn7.m10494c((ui3) objM22097O, e16VarM4414g, jM4208a, 0L, 0, 0.0f, null, tj3Var3, 48, 120);
                                thb.m22044c(tj3Var3, c99.m4414g(b16Var, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38955d));
                                int i5 = (int) (fM22631x0 - i4);
                                if (i5 > 0) {
                                    tj3Var3.m22111b0(-2086324794);
                                    strM23620a0 = vz1.m23618Z(com.lingq.feature.reader.R$string.stats_min_left_beat_last_week, new Object[]{Integer.valueOf(i5)}, tj3Var3);
                                    tj3Var3.m22139q(false);
                                } else {
                                    tj3Var3.m22111b0(-2086128285);
                                    strM23620a0 = vz1.m23620a0(tj3Var3, com.lingq.feature.reader.R$string.stats_exceeded_last_week);
                                    tj3Var3.m22139q(false);
                                }
                                String str = strM23620a0;
                                vh9 vh9Var = ps5.f56764b;
                                lw9.m16554b(str, null, ((ms5) tj3Var3.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(vh9Var)).f51800b.f71408l, tj3Var3, 0, 0, 131066);
                                tj3Var3 = tj3Var3;
                                tj3Var3.m22139q(false);
                            } else {
                                list3 = list5;
                                tj3Var3.m22111b0(-2085778295);
                                tj3Var3.m22139q(false);
                            }
                            f3 = ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38956e;
                        }
                        ux5.m23003z(b16Var, f3, tj3Var3, false);
                        sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(((fe9) tj3Var3.m22128k(ge9.f40637a)).f38956e, true, new gm5(28)), fc0Var, tj3Var3, 0);
                        int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m3 = tj3Var3.m22132m();
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, b16Var);
                        se1.f60731q.getClass();
                        ui3 ui3Var2 = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var2);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        zi3 zi3Var5 = C0352b.f4303f;
                        oha.m18001g(tj3Var3, zi3Var5, sj8VarM20003a2);
                        zi3 zi3Var6 = C0352b.f4302e;
                        oha.m18001g(tj3Var3, zi3Var6, l77VarM22132m3);
                        Integer numValueOf2 = Integer.valueOf(iHashCode3);
                        zi3 zi3Var7 = C0352b.f4304g;
                        oha.m18001g(tj3Var3, zi3Var7, numValueOf2);
                        vi3 vi3Var2 = C0352b.f4305h;
                        oha.m18000f(tj3Var3, vi3Var2);
                        zi3 zi3Var8 = C0352b.f4301d;
                        oha.m18001g(tj3Var3, zi3Var8, e16VarM1322c3);
                        vh9 vh9Var2 = cx2.f34676a;
                        h5d.m13068a(0, ((bx2) tj3Var3.m22128k(vh9Var2)).m4208a(), tj3Var3, vz1.m23620a0(tj3Var3, com.lingq.feature.reader.R$string.stats_this_week));
                        List list7 = list3;
                        if (list7.isEmpty()) {
                            z = false;
                            tj3Var3.m22111b0(-1470384252);
                            tj3Var3.m22139q(false);
                        } else {
                            tj3Var3.m22111b0(-1470615853);
                            z = false;
                            h5d.m13068a(0, aa1.m198b(0.5f, ((bx2) tj3Var3.m22128k(vh9Var2)).m4208a()), tj3Var3, vz1.m23620a0(tj3Var3, com.lingq.feature.reader.R$string.stats_last_week));
                            tj3Var3.m22139q(false);
                        }
                        tj3Var3.m22139q(true);
                        e16 e16VarM4414g2 = c99.m4414g(c99.m4412e(b16Var, 1.0f), 160.0f);
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, z);
                        int iHashCode4 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m4 = tj3Var3.m22132m();
                        e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var3, e16VarM4414g2);
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var2);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, zi3Var5, ht5VarM19966d);
                        oha.m18001g(tj3Var3, zi3Var6, l77VarM22132m4);
                        AbstractC3393o1.m17747v(iHashCode4, tj3Var3, zi3Var7, tj3Var3, vi3Var2);
                        oha.m18001g(tj3Var3, zi3Var8, e16VarM1322c4);
                        if (list7.isEmpty()) {
                            tj3Var3.m22111b0(1392166895);
                            tj3Var3.m22139q(false);
                        } else {
                            tj3Var3.m22111b0(1391440379);
                            List list8 = list3;
                            ArrayList arrayList2 = new ArrayList(v91.m23189q0(list8, 10));
                            int i6 = 0;
                            for (Object obj3 : list8) {
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    vz1.m23628e0();
                                    throw null;
                                }
                                Pair pair = (Pair) obj3;
                                arrayList2.add(new lc5((String) pair.f47623a, i6, ((Number) pair.f47624b).floatValue()));
                                i6 = i7;
                            }
                            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                            vh9 vh9Var3 = cx2.f34676a;
                            tj3 tj3Var4 = tj3Var3;
                            lnc.m16398a(e16VarM4412e2, arrayList2, aa1.m198b(0.5f, ((bx2) tj3Var3.m22128k(vh9Var3)).m4208a()), aa1.m198b(0.5f, ((bx2) tj3Var3.m22128k(vh9Var3)).m4208a()), false, 0.0f, tj3Var4, 24582);
                            tj3Var3 = tj3Var4;
                            tj3Var3.m22139q(false);
                        }
                        if (list4.isEmpty()) {
                            tj3Var3.m22111b0(1392928751);
                            tj3Var3.m22139q(false);
                        } else {
                            tj3Var3.m22111b0(1392236831);
                            List list9 = list4;
                            ArrayList arrayList3 = new ArrayList(v91.m23189q0(list9, 10));
                            int i8 = 0;
                            for (Object obj4 : list9) {
                                int i9 = i8 + 1;
                                if (i8 < 0) {
                                    vz1.m23628e0();
                                    throw null;
                                }
                                Pair pair2 = (Pair) obj4;
                                arrayList3.add(new lc5((String) pair2.f47623a, i8, ((Number) pair2.f47624b).floatValue()));
                                i8 = i9;
                            }
                            e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                            vh9 vh9Var4 = cx2.f34676a;
                            tj3 tj3Var5 = tj3Var3;
                            lnc.m16398a(e16VarM4412e3, arrayList3, ((bx2) tj3Var3.m22128k(vh9Var4)).m4208a(), ((bx2) tj3Var3.m22128k(vh9Var4)).m4218k(), true, 0.0f, tj3Var5, 24582);
                            tj3Var3 = tj3Var5;
                            tj3Var3.m22139q(false);
                        }
                        tj3Var3.m22139q(true);
                        e16 e16VarM22984g = ux5.m22984g(b16Var, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38952a, tj3Var3, b16Var, 1.0f);
                        sj8 sj8VarM20003a3 = qj8.m20003a(eh0.f37242h, fc0Var, tj3Var3, 6);
                        int iHashCode5 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m5 = tj3Var3.m22132m();
                        e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var3, e16VarM22984g);
                        se1.f60731q.getClass();
                        ui3 ui3Var3 = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var3);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a3);
                        oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m5);
                        oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode5));
                        oha.m18000f(tj3Var3, C0352b.f4305h);
                        oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c5);
                        String str2 = vz1.m23620a0(tj3Var3, com.lingq.feature.reader.R$string.stats_daily_average) + "\n" + ((int) f) + "m";
                        vh9 vh9Var5 = ps5.f56764b;
                        tj3 tj3Var6 = tj3Var3;
                        lw9.m16554b(str2, null, ((ms5) tj3Var3.m22128k(vh9Var5)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(vh9Var5)).f51800b.f71407k, tj3Var6, 0, 0, 131066);
                        if (list4.size() > 1) {
                            tj3Var6.m22111b0(-1294152467);
                            h5d.m13070c(f2, null, tj3Var6, 0);
                            tj3Var6.m22139q(false);
                        } else {
                            tj3Var6.m22111b0(-1294067899);
                            tj3Var6.m22139q(false);
                        }
                        tj3Var6.m22139q(true);
                        tj3Var6.m22139q(true);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, (i3 & 14) | 48, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(i, list, list2, f, f2, i2) { // from class: sl9

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f60983b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ List f60984c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ List f60985d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ float f60986e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ float f60987f;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    h5d.m13069b(this.f60982a, this.f60983b, this.f60984c, this.f60985d, this.f60986e, this.f60987f, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m13070c(float f, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        long jM4213f;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1965866707);
        int i2 = (tj3Var.m22114d(f) ? 4 : 2) | i | 48;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            if (f >= 0.0f) {
                tj3Var.m22111b0(1039112670);
                jM4213f = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4212e();
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1039173213);
                jM4213f = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4213f();
                tj3Var.m22139q(false);
            }
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            long j = jM4213f;
            ty3.m22352b(AbstractC3423or.m18236U(f >= 0.0f ? R$drawable.ic_arrow_upward : R$drawable.ic_arrow_downward, tj3Var, 0), null, c99.m4422o(b16Var, 16.0f), j, tj3Var, 440, 0);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38954c));
            lw9.m16554b(vz1.m23618Z(com.lingq.feature.reader.R$string.stats_trending_percent, new Object[]{(f >= 0.0f ? "+" : "") + ((int) f)}, tj3Var), null, j, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71407k, tj3Var, 1572864, 0, 131002);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2961ee(f, e16Var2, i, 2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m13071d(C0773b c0773b, String str) {
        C0778d c0778dM14013b;
        WorkDatabase workDatabase = c0773b.f7206c;
        workDatabase.getClass();
        u8b u8bVarMo2909z = workDatabase.mo2909z();
        rb2 rb2VarMo2904u = workDatabase.mo2904u();
        ArrayList arrayListM23608N = vz1.m23608N(str);
        while (!arrayListM23608N.isEmpty()) {
            String str2 = (String) u91.m22608Z0(arrayListM23608N);
            WorkInfo$State workInfo$StateM22568d = u8bVarMo2909z.m22568d(str2);
            if (workInfo$StateM22568d != WorkInfo$State.SUCCEEDED && workInfo$StateM22568d != WorkInfo$State.FAILED) {
                ((Number) AbstractC0758a.m2859b(u8bVarMo2909z.f63598a, false, true, new xca(str2, 11))).intValue();
            }
            arrayListM23608N.addAll(rb2VarMo2904u.m20569a(str2));
        }
        il7 il7Var = c0773b.f7209f;
        il7Var.getClass();
        synchronized (il7Var.f44277k) {
            oj5.m18040f().m18042a(il7.f44266l, "Processor cancelling " + str);
            il7Var.f44275i.add(str);
            c0778dM14013b = il7Var.m14013b(str);
        }
        il7.m14011d(str, c0778dM14013b, 1);
        Iterator it = c0773b.f7208e.iterator();
        while (it.hasNext()) {
            ((sm8) it.next()).mo21481d(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final web m13072e(C0773b c0773b, String str) {
        iy5 iy5Var = c0773b.f7205b.f42359m;
        String strConcat = "CancelWorkByName_".concat(str);
        by8 by8Var = c0773b.f7207d.f36847a;
        by8Var.getClass();
        return pyb.m19571a(iy5Var, strConcat, by8Var, new C3577sk(3, str, c0773b));
    }
}
