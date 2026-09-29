package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.statistics.StreakCalendarType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.C3209b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h4d {
    /* JADX INFO: renamed from: a */
    public static final void m13052a(e16 e16Var, List list, LocalDate localDate, boolean z, ye1 ye1Var, int i) {
        e16 e16Var2;
        float f;
        long jM198b;
        b16 b16Var;
        boolean z2;
        boolean z3;
        fc0 fc0Var = nj0.f52817l;
        C3549ru c3549ru = eh0.f37236b;
        C3587su c3587su = eh0.f37238d;
        list.getClass();
        localDate.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2112408115);
        int i2 = i | 6 | (tj3Var.m22124i(list) ? 32 : 16) | (tj3Var.m22124i(localDate) ? 256 : 128) | (tj3Var.m22122h(z) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            bb1 bb1VarM230a = ab1.m230a(c3587su, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var2);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
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
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            boolean z4 = true;
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            tj3Var.m22111b0(281418493);
            boolean z5 = false;
            List listSubList = list.subList(0, 7);
            ArrayList arrayList = new ArrayList(v91.m23189q0(listSubList, 10));
            Iterator it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(y02.m24813k("EEE", ((tl0) it.next()).f62466a));
            }
            int firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek() - 1;
            Iterator it2 = u91.m22603U0(u91.m22615g1(arrayList, firstDayOfWeek), u91.m22584B0(arrayList, firstDayOfWeek)).iterator();
            while (true) {
                f = 1.0f;
                if (!it2.hasNext()) {
                    break;
                }
                String str = (String) it2.next();
                e16 e16VarM21607T = AbstractC3584sr.m21607T(new as4(1.0f, z4), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d);
                vh9 vh9Var = ps5.f56764b;
                tj3 tj3Var2 = tj3Var;
                lw9.m16554b(str, e16VarM21607T, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var2, 0, 0, 130040);
                z5 = z5;
                tj3Var = tj3Var2;
                b16Var2 = b16Var2;
                z4 = true;
            }
            boolean z6 = z5;
            b16 b16Var3 = b16Var2;
            tj3Var.m22139q(z6);
            boolean z7 = true;
            tj3Var.m22139q(true);
            tj3Var.m22111b0(1360897017);
            for (List<tl0> list2 : u91.m22632y0(list, 7)) {
                b16 b16Var4 = b16Var3;
                e16 e16VarM4412e = c99.m4412e(b16Var4, f);
                sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, fc0Var, tj3Var, z6 ? 1 : 0);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
                se1.f60731q.getClass();
                ui3 ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a2);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m3);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode3));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c3);
                tj3Var.m22111b0(-445926325);
                for (tl0 tl0Var : list2) {
                    e16 e16VarM21607T2 = AbstractC3584sr.m21607T(c99.m4412e(new as4(f, z7), f), ge9.m12515a(tj3Var).f38954c);
                    ec0 ec0Var = nj0.f52792K;
                    bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var, 48);
                    int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m4 = tj3Var.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM21607T2);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var3);
                    } else {
                        tj3Var.m22137o0();
                    }
                    zi3 zi3Var5 = C0352b.f4303f;
                    oha.m18001g(tj3Var, zi3Var5, bb1VarM230a2);
                    zi3 zi3Var6 = C0352b.f4302e;
                    oha.m18001g(tj3Var, zi3Var6, l77VarM22132m4);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    zi3 zi3Var7 = C0352b.f4304g;
                    oha.m18001g(tj3Var, zi3Var7, numValueOf2);
                    vi3 vi3Var2 = C0352b.f4305h;
                    oha.m18000f(tj3Var, vi3Var2);
                    zi3 zi3Var8 = C0352b.f4301d;
                    oha.m18001g(tj3Var, zi3Var8, e16VarM1322c4);
                    if (z) {
                        tj3Var.m22111b0(-992075841);
                        e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4412e(b16Var4, f), 0.0f, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 13);
                        bb1 bb1VarM230a3 = ab1.m230a(c3587su, ec0Var, tj3Var, 48);
                        int iHashCode5 = Long.hashCode(tj3Var.f62385T);
                        l77 l77VarM22132m5 = tj3Var.m22132m();
                        e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
                        tj3Var.m22119f0();
                        if (tj3Var.f62384S) {
                            tj3Var.m22130l(ui3Var3);
                        } else {
                            tj3Var.m22137o0();
                        }
                        oha.m18001g(tj3Var, zi3Var5, bb1VarM230a3);
                        oha.m18001g(tj3Var, zi3Var6, l77VarM22132m5);
                        AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var7, tj3Var, vi3Var2);
                        oha.m18001g(tj3Var, zi3Var8, e16VarM1322c5);
                        qh0.m19963a(x74.m24341H(c99.m4414g(c99.m4412e(pb1.m19045o(b16Var4, ui8.m22752a(8)), 0.5f), 24.0f)), tj3Var, 0);
                        thb.m22044c(tj3Var, c99.m4414g(b16Var4, 20.0f));
                        qh0.m19963a(x74.m24341H(c99.m4414g(c99.m4412e(pb1.m19045o(b16Var4, ui8.m22752a(8)), 0.3f), ge9.m12515a(tj3Var).f38952a)), tj3Var, 0);
                        tj3Var.m22139q(true);
                        tj3Var.m22139q(false);
                        z2 = true;
                        z3 = false;
                        b16Var = b16Var4;
                    } else {
                        tj3Var.m22111b0(-990849078);
                        e16 e16VarM4414g = c99.m4414g(c99.m4412e(b16Var4, 0.8f), 46.0f);
                        LocalDate localDate2 = tl0Var.f62466a;
                        m13053b(pvc.m19514j(e16VarM4414g, localDate2.isAfter(LocalDate.now()) ? 0.3f : 1.0f), tl0Var, tj3Var, 0);
                        String strM24813k = y02.m24813k("d", localDate2);
                        vx9 vx9Var = p58.m18902j(tj3Var).f71407k;
                        if (y02.m24812j(localDate2)) {
                            tj3Var.m22111b0(-989952248);
                            tj3Var.m22139q(false);
                            jM198b = d32.m10037f(4294926397L);
                        } else if (localDate.getMonth() == localDate2.getMonth()) {
                            tj3Var.m22111b0(-989685834);
                            jM198b = p58.m18900f(tj3Var).f55873q;
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(-989816189);
                            jM198b = aa1.m198b(0.2f, p58.m18900f(tj3Var).f55873q);
                            tj3Var.m22139q(false);
                        }
                        b16Var = b16Var4;
                        tj3 tj3Var3 = tj3Var;
                        z2 = true;
                        lw9.m16554b(strM24813k, null, jM198b, null, 0L, null, y02.m24812j(localDate2) ? bc3.f8324j : null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9Var, tj3Var3, 0, 0, 129978);
                        tj3Var = tj3Var3;
                        z3 = false;
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(z2);
                    boolean z8 = z3;
                    z7 = z2;
                    z6 = z8;
                    b16Var4 = b16Var;
                    f = 1.0f;
                }
                boolean z9 = z7;
                boolean z10 = z6;
                b16Var3 = b16Var4;
                tj3Var.m22139q(z10);
                tj3Var.m22139q(z9);
                z7 = z9;
                z6 = z10 ? 1 : 0;
                f = 1.0f;
            }
            tj3Var.m22139q(z6 ? 1 : 0);
            tj3Var.m22139q(z7);
            e16Var2 = b16Var3;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new py0(e16Var2, list, localDate, z, i, 7);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m13053b(e16 e16Var, tl0 tl0Var, ye1 ye1Var, int i) {
        StreakCalendarType streakCalendarType;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1969617011);
        int i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i | (tj3Var.m22124i(tl0Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            int i3 = tl0Var.f62467b;
            int i4 = i3 / tl0Var.f62468c;
            LocalDate localDate = tl0Var.f62466a;
            if (localDate.isAfter(LocalDate.now())) {
                streakCalendarType = StreakCalendarType.Future;
            } else if (!(y02.m24812j(localDate) && i3 == 0) && i4 <= 0) {
                streakCalendarType = (i4 != 0 || ((double) i3) <= 0.0d) ? StreakCalendarType.Lost : StreakCalendarType.StreakProgress;
            } else {
                streakCalendarType = StreakCalendarType.Streak;
            }
            int i5 = di9.f35691a[streakCalendarType.ordinal()];
            if (i5 == 1) {
                tj3Var.m22111b0(1453722302);
                a5d.m126a(null, 0, 10, true, false, 0.0f, tj3Var, 28080, 33);
                tj3Var.m22139q(false);
            } else if (i5 == 2) {
                tj3Var.m22111b0(1453988716);
                ty3.m22351a(r7d.m20438b(), null, c99.m4411d(b16.f7762a, 0.8f), aa1.f405d, tj3Var, 3504, 0);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else if (i5 == 3) {
                tj3Var.m22111b0(1454270940);
                a5d.m126a(null, tl0Var.f62467b, tl0Var.f62468c, false, false, 0.0f, tj3Var, 27648, 33);
                tj3Var.m22139q(false);
            } else {
                if (i5 != 4) {
                    throw ux5.m23001x(tj3Var, 323987787, false);
                }
                tj3Var.m22111b0(1454563890);
                a5d.m126a(null, tl0Var.f62467b, tl0Var.f62468c, false, true, 3.0f, tj3Var, 224256, 1);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(e16Var, i, 12, tl0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m13054c(hi9 hi9Var, LocalDate localDate, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, ye1 ye1Var, int i, int i2) {
        ui3 ui3Var4;
        int i3;
        ui3 ui3Var5;
        int i4;
        ui3 ui3Var6;
        int i5;
        ui3 ui3Var7;
        ui3 ui3Var8;
        ui3 ui3Var9;
        ui3 ui3Var10;
        ui3 ui3Var11;
        hi9Var.getClass();
        localDate.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2120776140);
        int i6 = i | (tj3Var.m22120g(hi9Var) ? 4 : 2) | (tj3Var.m22124i(localDate) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i6 | 384;
            ui3Var4 = ui3Var;
        } else {
            ui3Var4 = ui3Var;
            i3 = i6 | (tj3Var.m22124i(ui3Var4) ? 256 : 128);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i4 = i3 | 3072;
            ui3Var5 = ui3Var2;
        } else {
            ui3Var5 = ui3Var2;
            i4 = i3 | (tj3Var.m22124i(ui3Var5) ? 2048 : 1024);
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i5 = i4 | 24576;
            ui3Var6 = ui3Var3;
        } else {
            ui3Var6 = ui3Var3;
            i5 = i4 | (tj3Var.m22124i(ui3Var6) ? 16384 : 8192);
        }
        if (tj3Var.m22099R(i5 & 1, (i5 & 9363) != 9362)) {
            p84 p84Var = we1.f66679a;
            if (i7 != 0) {
                Object objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = new C3288l7(7);
                    tj3Var.m22131l0(objM22097O);
                }
                ui3Var9 = (ui3) objM22097O;
            } else {
                ui3Var9 = ui3Var4;
            }
            if (i8 != 0) {
                Object objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new C3288l7(7);
                    tj3Var.m22131l0(objM22097O2);
                }
                ui3Var10 = (ui3) objM22097O2;
            } else {
                ui3Var10 = ui3Var5;
            }
            if (i9 != 0) {
                Object objM22097O3 = tj3Var.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new C3288l7(7);
                    tj3Var.m22131l0(objM22097O3);
                }
                ui3Var11 = (ui3) objM22097O3;
            } else {
                ui3Var11 = ui3Var6;
            }
            ui3 ui3Var12 = ui3Var11;
            b34.m3232b(b16.f7762a, ci8.m4703P(1562216328, new v29(3, ui3Var9), tj3Var), null, null, null, 0, 0L, 0L, null, ci8.m4703P(380921245, new ci9(hi9Var, localDate, ui3Var11, ui3Var10, 0), tj3Var), tj3Var, 805306422, 508);
            ui3Var4 = ui3Var9;
            ui3Var7 = ui3Var10;
            ui3Var8 = ui3Var12;
        } else {
            tj3Var.m22102U();
            ui3Var7 = ui3Var5;
            ui3Var8 = ui3Var6;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rb0(hi9Var, localDate, ui3Var4, ui3Var7, ui3Var8, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final Object m13055d(ArrayList arrayList, SuspendLambda suspendLambda) {
        if (arrayList.isEmpty()) {
            return EmptyList.f47638a;
        }
        x92[] x92VarArr = (x92[]) arrayList.toArray(new x92[0]);
        o60 o60Var = new o60(x92VarArr);
        sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(suspendLambda));
        sm0Var.m21468u();
        int length = x92VarArr.length;
        m60[] m60VarArr = new m60[length];
        for (int i = 0; i < length; i++) {
            C3209b c3209b = x92VarArr[i];
            c3209b.start();
            m60 m60Var = new m60(o60Var, sm0Var);
            m60Var.f50635i = AbstractC3208a.m15442i(c3209b, m60Var);
            m60VarArr[i] = m60Var;
        }
        n60 n60Var = new n60(m60VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            m60VarArr[i2].m16654u(n60Var);
        }
        if (sm0Var.m21472y()) {
            n60Var.m17246a();
        } else {
            sm0Var.m21471x(n60Var);
        }
        Object objM21466r = sm0Var.m21466r();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM21466r;
    }
}
