package p000;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class upb {

    /* JADX INFO: renamed from: a */
    public final sla f64198a;

    /* JADX INFO: renamed from: b */
    public boolean f64199b;

    /* JADX INFO: renamed from: c */
    public long f64200c;

    /* JADX INFO: renamed from: d */
    public long f64201d;

    public upb(sla slaVar) {
        if (slaVar != null) {
            this.f64198a = slaVar;
        } else {
            C3386nv.m17635v("ticker");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m22855a() {
        if (this.f64199b) {
            C3386nv.m17633t("This stopwatch is already running.");
        } else {
            this.f64199b = true;
            this.f64201d = this.f64198a.mo19435a();
        }
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long jMo19435a = this.f64199b ? (this.f64198a.mo19435a() - this.f64201d) + this.f64200c : this.f64200c;
        long j = jMo19435a / 86400000000000L;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (j > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (jMo19435a / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (jMo19435a / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (jMo19435a / 1000000000 > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (jMo19435a / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = jMo19435a / 1000 > 0 ? TimeUnit.MICROSECONDS : timeUnit2;
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jMo19435a / timeUnit2.convert(1L, timeUnit)));
        switch (qpb.f58034a[timeUnit.ordinal()]) {
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
                uk9.m22780o();
                return null;
        }
        return AbstractC3393o1.m17735j(str2, " ", str);
    }
}
