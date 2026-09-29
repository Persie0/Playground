package p000;

import java.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final class tl0 {

    /* JADX INFO: renamed from: a */
    public final LocalDate f62466a;

    /* JADX INFO: renamed from: b */
    public final int f62467b;

    /* JADX INFO: renamed from: c */
    public final int f62468c;

    public tl0(LocalDate localDate, int i, int i2) {
        localDate.getClass();
        this.f62466a = localDate;
        this.f62467b = i;
        this.f62468c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl0)) {
            return false;
        }
        tl0 tl0Var = (tl0) obj;
        return fa4.m11650l(this.f62466a, tl0Var.f62466a) && this.f62467b == tl0Var.f62467b && this.f62468c == tl0Var.f62468c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62468c) + wq1.m24106b(this.f62467b, this.f62466a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarDay(date=");
        sb.append(this.f62466a);
        sb.append(", progress=");
        sb.append(this.f62467b);
        sb.append(", goal=");
        return wq1.m24123s(sb, this.f62468c, ")");
    }
}
