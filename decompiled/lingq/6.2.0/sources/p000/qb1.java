package p000;

import kotlin.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public final class qb1 {

    /* JADX INFO: renamed from: a */
    public final Instant f57529a;

    /* JADX INFO: renamed from: b */
    public final Instant f57530b;

    public qb1(Instant instant, Instant instant2) {
        this.f57529a = instant;
        this.f57530b = instant2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19844a(Comparable comparable) {
        comparable.getClass();
        Instant instant = (Instant) comparable;
        return instant.compareTo(this.f57529a) >= 0 && instant.compareTo(this.f57530b) < 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qb1)) {
            return false;
        }
        Instant instant = this.f57529a;
        Instant instant2 = this.f57530b;
        if (instant.compareTo(instant2) >= 0) {
            qb1 qb1Var = (qb1) obj;
            if (qb1Var.f57529a.compareTo(qb1Var.f57530b) >= 0) {
                return true;
            }
        }
        qb1 qb1Var2 = (qb1) obj;
        return instant.equals(qb1Var2.f57529a) && instant2.equals(qb1Var2.f57530b);
    }

    public final int hashCode() {
        Instant instant = this.f57529a;
        Instant instant2 = this.f57530b;
        if (instant.compareTo(instant2) >= 0) {
            return -1;
        }
        return instant2.hashCode() + (instant.hashCode() * 31);
    }

    public final String toString() {
        return this.f57529a + "..<" + this.f57530b;
    }
}
