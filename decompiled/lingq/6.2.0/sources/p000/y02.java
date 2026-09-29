package p000;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public abstract class y02 {
    /* JADX INFO: renamed from: a */
    public static final String m24803a() {
        try {
            String str = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
            str.getClass();
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m24804b() {
        try {
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            Calendar calendar = Calendar.getInstance(timeZone);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            simpleDateFormat.setTimeZone(timeZone);
            String str = simpleDateFormat.format(calendar.getTime());
            str.getClass();
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static final long m24805c() {
        return Calendar.getInstance().getTimeInMillis();
    }

    /* JADX INFO: renamed from: d */
    public static int m24806d(long j) {
        long jM24805c = m24805c();
        if (j == 0) {
            return 0;
        }
        return (int) ((jM24805c - j) / 86400000);
    }

    /* JADX INFO: renamed from: e */
    public static final String m24807e(String str, String str2, String str3) {
        ux5.m22974A(str, str2, str3);
        try {
            Date date = new SimpleDateFormat(str2).parse(str);
            if (date == null) {
                return "";
            }
            String str4 = new SimpleDateFormat(str3).format(date);
            str4.getClass();
            return str4;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public static final String m24809g(long j) {
        if (j == 0) {
            return "";
        }
        long j2 = j / 1000;
        return j / 3600000 == 0 ? String.format(Locale.getDefault(), "%02d:%02d min", Arrays.copyOf(new Object[]{Long.valueOf((j2 % 3600) / 60), Long.valueOf(j2 % 60)}, 2)) : m24810h(j);
    }

    /* JADX INFO: renamed from: h */
    public static final String m24810h(long j) {
        if (j == 0) {
            return "";
        }
        long j2 = j / 1000;
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 3600), Long.valueOf((j2 % 3600) / 60), Long.valueOf(j2 % 60)}, 3));
    }

    /* JADX INFO: renamed from: i */
    public static final ArrayList m24811i(int i, int i2) {
        YearMonth yearMonthOf = YearMonth.of(i, i2);
        LocalDate localDateAtDay = yearMonthOf.atDay(1);
        LocalDate localDateAtEndOfMonth = yearMonthOf.atEndOfMonth();
        DayOfWeek firstDayOfWeek = WeekFields.of(Locale.getDefault()).getFirstDayOfWeek();
        int value = ((localDateAtDay.getDayOfWeek().getValue() - firstDayOfWeek.getValue()) + 7) % 7;
        i84 i84Var = new i84(1, Math.min(42, localDateAtEndOfMonth.getDayOfMonth() + value + (((firstDayOfWeek.getValue() + (7 - localDateAtEndOfMonth.getDayOfWeek().getValue())) - 1) % 7)), 1);
        ArrayList arrayList = new ArrayList(v91.m23189q0(i84Var, 10));
        Iterator it = i84Var.iterator();
        while (((h84) it).f41941c) {
            arrayList.add(yearMonthOf.atDay(1).plusDays((((a84) it).nextInt() - value) - 1));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m24812j(LocalDate localDate) {
        localDate.getClass();
        return ChronoUnit.DAYS.between(LocalDate.now(), localDate) == 0;
    }

    /* JADX INFO: renamed from: k */
    public static final String m24813k(String str, LocalDate localDate) {
        localDate.getClass();
        try {
            String str2 = localDate.format(DateTimeFormatter.ofPattern(str));
            str2.getClass();
            return str2;
        } catch (Exception unused) {
            return "";
        }
    }
}
