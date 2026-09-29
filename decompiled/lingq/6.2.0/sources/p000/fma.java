package p000;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fma {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f39313a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public static Calendar m11943a(Calendar calendar) {
        Calendar calendarM11945c = m11945c(calendar);
        Calendar calendarM11945c2 = m11945c(null);
        calendarM11945c2.set(calendarM11945c.get(1), calendarM11945c.get(2), calendarM11945c.get(5));
        return calendarM11945c2;
    }

    /* JADX INFO: renamed from: b */
    public static Calendar m11944b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* JADX INFO: renamed from: c */
    public static Calendar m11945c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
