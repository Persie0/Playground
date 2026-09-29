package zm;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import sl.C9069b;

/* JADX INFO: renamed from: zm.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C10531p {

    /* JADX INFO: renamed from: d */
    public static final C10531p f52527d = new C10531p(ReportLevel.STRICT, 6);

    /* JADX INFO: renamed from: a */
    public final ReportLevel f52528a;

    /* JADX INFO: renamed from: b */
    public final C9069b f52529b;

    /* JADX INFO: renamed from: c */
    public final ReportLevel f52530c;

    public C10531p(ReportLevel reportLevel, int i10) {
        this(reportLevel, (i10 & 2) != 0 ? new C9069b(0, 0) : null, (i10 & 4) != 0 ? reportLevel : null);
    }

    public C10531p(ReportLevel reportLevel, C9069b c9069b, ReportLevel reportLevel2) {
        C5207g.m11111f(reportLevel, "reportLevelBefore");
        C5207g.m11111f(reportLevel2, "reportLevelAfter");
        this.f52528a = reportLevel;
        this.f52529b = c9069b;
        this.f52530c = reportLevel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10531p)) {
            return false;
        }
        C10531p c10531p = (C10531p) obj;
        if (this.f52528a == c10531p.f52528a && C5207g.m11106a(this.f52529b, c10531p.f52529b) && this.f52530c == c10531p.f52530c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f52528a.hashCode() * 31;
        C9069b c9069b = this.f52529b;
        return this.f52530c.hashCode() + ((iHashCode + (c9069b == null ? 0 : c9069b.f47358d)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f52528a + ", sinceVersion=" + this.f52529b + ", reportLevelAfter=" + this.f52530c + ')';
    }
}
