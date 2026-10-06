package p000;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class msd {

    /* JADX INFO: renamed from: a */
    public boolean f41535a;

    /* JADX INFO: renamed from: b */
    private final msn f41536b;

    /* JADX INFO: renamed from: c */
    private long f41537c;

    /* JADX INFO: renamed from: d */
    private long f41538d;

    msd() {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static msd m16856c(msn msnVar) {
        return new msd(msnVar);
    }

    /* JADX INFO: renamed from: a */
    public final long m16857a(TimeUnit timeUnit) {
        return timeUnit.convert(m16858b(), TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: b */
    public final long m16858b() {
        return this.f41535a ? (this.f41536b.mo15326a() - this.f41538d) + this.f41537c : this.f41537c;
    }

    /* JADX INFO: renamed from: d */
    public final void m16859d() {
        this.f41537c = 0L;
        this.f41535a = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m16860e() {
        lku.m15614I(!this.f41535a, "This stopwatch is already running.");
        this.f41535a = true;
        this.f41538d = this.f41536b.mo15326a();
    }

    /* JADX INFO: renamed from: f */
    public final void m16861f() {
        long jMo15326a = this.f41536b.mo15326a();
        lku.m15614I(this.f41535a, "This stopwatch is already stopped.");
        this.f41535a = false;
        this.f41537c += jMo15326a - this.f41538d;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long jM16858b = m16858b();
        if (TimeUnit.DAYS.convert(jM16858b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(jM16858b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(jM16858b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(jM16858b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(jM16858b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = TimeUnit.MICROSECONDS.convert(jM16858b, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        }
        double d = jM16858b;
        double dConvert = TimeUnit.NANOSECONDS.convert(1L, timeUnit);
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.ROOT;
        Double.isNaN(d);
        Double.isNaN(dConvert);
        sb.append(String.format(locale, "%.4g", Double.valueOf(d / dConvert)));
        sb.append(" ");
        switch (msc.f41534a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        sb.append(str);
        return sb.toString();
    }

    public msd(msn msnVar) {
        msnVar.getClass();
        this.f41536b = msnVar;
    }
}
