package p000;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import p021j$.util.DesugarTimeZone;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfl implements Comparable {

    /* JADX INFO: renamed from: a */
    public int f3098a;

    /* JADX INFO: renamed from: b */
    public int f3099b;

    /* JADX INFO: renamed from: c */
    public int f3100c;

    /* JADX INFO: renamed from: d */
    public int f3101d;

    /* JADX INFO: renamed from: e */
    public int f3102e;

    /* JADX INFO: renamed from: f */
    public int f3103f;

    /* JADX INFO: renamed from: g */
    public TimeZone f3104g;

    /* JADX INFO: renamed from: h */
    public int f3105h;

    public bfl() {
        this.f3098a = 0;
        this.f3099b = 0;
        this.f3100c = 0;
        this.f3101d = 0;
        this.f3102e = 0;
        this.f3103f = 0;
        this.f3104g = DesugarTimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: renamed from: a */
    public final Calendar m2315a() {
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(this.f3104g);
        gregorianCalendar.set(1, this.f3098a);
        gregorianCalendar.set(2, this.f3099b - 1);
        gregorianCalendar.set(5, this.f3100c);
        gregorianCalendar.set(11, this.f3101d);
        gregorianCalendar.set(12, this.f3102e);
        gregorianCalendar.set(13, this.f3103f);
        gregorianCalendar.set(14, this.f3105h / 1000000);
        return gregorianCalendar;
    }

    /* JADX INFO: renamed from: b */
    public final void m2316b(int i) {
        if (i <= 0) {
            this.f3100c = 1;
        } else if (i > 31) {
            this.f3100c = 31;
        } else {
            this.f3100c = i;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2317c(int i) {
        if (i <= 0) {
            this.f3099b = 1;
        } else if (i > 12) {
            this.f3099b = 12;
        } else {
            this.f3099b = i;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        bfl bflVar = (bfl) obj;
        long timeInMillis = m2315a().getTimeInMillis() - bflVar.m2315a().getTimeInMillis();
        if (timeInMillis == 0) {
            timeInMillis = this.f3105h - bflVar.f3105h;
        }
        return (int) (timeInMillis % 2);
    }

    public final String toString() {
        return C0167es.m7754e(this);
    }

    public bfl(Calendar calendar) {
        this.f3098a = 0;
        this.f3099b = 0;
        this.f3100c = 0;
        this.f3101d = 0;
        this.f3102e = 0;
        this.f3103f = 0;
        this.f3104g = DesugarTimeZone.getTimeZone("UTC");
        Date time = calendar.getTime();
        TimeZone timeZone = calendar.getTimeZone();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(timeZone);
        gregorianCalendar.setTime(time);
        this.f3098a = gregorianCalendar.get(1);
        this.f3099b = gregorianCalendar.get(2) + 1;
        this.f3100c = gregorianCalendar.get(5);
        this.f3101d = gregorianCalendar.get(11);
        this.f3102e = gregorianCalendar.get(12);
        this.f3103f = gregorianCalendar.get(13);
        this.f3105h = gregorianCalendar.get(14) * 1000000;
        this.f3104g = gregorianCalendar.getTimeZone();
    }

    public bfl(Date date, TimeZone timeZone) {
        this.f3098a = 0;
        this.f3099b = 0;
        this.f3100c = 0;
        this.f3101d = 0;
        this.f3102e = 0;
        this.f3103f = 0;
        this.f3104g = DesugarTimeZone.getTimeZone("UTC");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setTime(date);
        this.f3098a = gregorianCalendar.get(1);
        this.f3099b = gregorianCalendar.get(2) + 1;
        this.f3100c = gregorianCalendar.get(5);
        this.f3101d = gregorianCalendar.get(11);
        this.f3102e = gregorianCalendar.get(12);
        this.f3103f = gregorianCalendar.get(13);
        this.f3105h = gregorianCalendar.get(14) * 1000000;
        this.f3104g = timeZone;
    }
}
