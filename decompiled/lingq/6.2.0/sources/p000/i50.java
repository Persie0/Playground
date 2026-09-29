package p000;

import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i50 {

    /* JADX INFO: renamed from: a */
    public final a41 f43530a;

    /* JADX INFO: renamed from: b */
    public final HashMap f43531b;

    public i50(a41 a41Var, HashMap map) {
        this.f43530a = a41Var;
        this.f43531b = map;
    }

    /* JADX INFO: renamed from: a */
    public final long m13661a(Priority priority, long j, int i) {
        long jMo100g = j - this.f43530a.mo100g();
        j50 j50Var = (j50) this.f43531b.get(priority);
        long j2 = j50Var.f45058a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jMo100g), j50Var.f45059b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i50)) {
            return false;
        }
        i50 i50Var = (i50) obj;
        return this.f43530a.equals(i50Var.f43530a) && this.f43531b.equals(i50Var.f43531b);
    }

    public final int hashCode() {
        return this.f43531b.hashCode() ^ ((this.f43530a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f43530a + ", values=" + this.f43531b + "}";
    }
}
