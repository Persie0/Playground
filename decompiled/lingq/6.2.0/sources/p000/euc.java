package p000;

import com.lingq.core.database.entity.StatsCalendarEntity;
import com.lingq.core.domain.model.language.StatsCalendarDay;
import com.lingq.core.network.api.result.ResultStatsCalendar;
import com.lingq.core.network.api.result.ResultStatsCalendarDay;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class euc {

    /* JADX INFO: renamed from: a */
    public static final int[] f37920a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* JADX INFO: renamed from: a */
    public static void m11352a(ad0 ad0Var, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    ad0Var.m273b(i5, i4);
                    ad0Var.m273b(i5, i6);
                    ad0Var.m273b(i4, i5);
                    ad0Var.m273b(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        ad0Var.m273b(i7, i7);
        int i8 = i7 + 1;
        ad0Var.m273b(i8, i7);
        ad0Var.m273b(i7, i8);
        int i9 = i + i2;
        ad0Var.m273b(i9, i7);
        ad0Var.m273b(i9, i8);
        ad0Var.m273b(i9, i9 - 1);
    }

    /* JADX INFO: renamed from: b */
    public static zc0 m11353b(zc0 zc0Var, int i, int i2) {
        el3 el3Var;
        int i3 = zc0Var.f71347b / i2;
        if (i2 == 4) {
            el3Var = el3.f37421j;
        } else if (i2 == 6) {
            el3Var = el3.f37420i;
        } else if (i2 == 8) {
            el3Var = el3.f37423l;
        } else if (i2 == 10) {
            el3Var = el3.f37419h;
        } else {
            if (i2 != 12) {
                C3386nv.m17626m("Unsupported word size ".concat(String.valueOf(i2)));
                return null;
            }
            el3Var = el3.f37418g;
        }
        p33 p33Var = new p33(el3Var);
        int i4 = i / i2;
        int[] iArr = new int[i4];
        int i5 = zc0Var.f71347b / i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= zc0Var.m25547d((i6 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        p33Var.m18868J(iArr, i4 - i3);
        zc0 zc0Var2 = new zc0();
        zc0Var2.m25545b(0, i % i2);
        for (int i9 = 0; i9 < i4; i9++) {
            zc0Var2.m25545b(iArr[i9], i2);
        }
        return zc0Var2;
    }

    /* JADX INFO: renamed from: c */
    public static zc0 m11354c(zc0 zc0Var, int i) {
        zc0 zc0Var2 = new zc0();
        int i2 = zc0Var.f71347b;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || zc0Var.m25547d(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                zc0Var2.m25545b(i8, i);
            } else {
                if (i8 == 0) {
                    zc0Var2.m25545b(i5 | 1, i);
                } else {
                    zc0Var2.m25545b(i5, i);
                }
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return zc0Var2;
    }

    /* JADX INFO: renamed from: d */
    public static final StatsCalendarEntity m11355d(ResultStatsCalendar resultStatsCalendar, String str, int i, int i2) {
        ArrayList arrayList;
        resultStatsCalendar.getClass();
        str.getClass();
        int i3 = resultStatsCalendar.f21518a;
        List list = resultStatsCalendar.f21520c;
        if (list != null) {
            List<ResultStatsCalendarDay> list2 = list;
            arrayList = new ArrayList(v91.m23189q0(list2, 10));
            for (ResultStatsCalendarDay resultStatsCalendarDay : list2) {
                resultStatsCalendarDay.getClass();
                arrayList.add(new StatsCalendarDay(resultStatsCalendarDay.f21521a, resultStatsCalendarDay.f21522b));
            }
        } else {
            arrayList = null;
        }
        return new StatsCalendarEntity(str, i3, i2, i, arrayList);
    }
}
