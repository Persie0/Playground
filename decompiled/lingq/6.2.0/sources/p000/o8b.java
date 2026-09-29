package p000;

import androidx.work.BackoffPolicy;
import androidx.work.WorkInfo$State;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class o8b {

    /* JADX INFO: renamed from: a */
    public final String f54025a;

    /* JADX INFO: renamed from: b */
    public final WorkInfo$State f54026b;

    /* JADX INFO: renamed from: c */
    public final sz1 f54027c;

    /* JADX INFO: renamed from: d */
    public final long f54028d;

    /* JADX INFO: renamed from: e */
    public final long f54029e;

    /* JADX INFO: renamed from: f */
    public final long f54030f;

    /* JADX INFO: renamed from: g */
    public final ak1 f54031g;

    /* JADX INFO: renamed from: h */
    public final int f54032h;

    /* JADX INFO: renamed from: i */
    public final BackoffPolicy f54033i;

    /* JADX INFO: renamed from: j */
    public final long f54034j;

    /* JADX INFO: renamed from: k */
    public final long f54035k;

    /* JADX INFO: renamed from: l */
    public final int f54036l;

    /* JADX INFO: renamed from: m */
    public final int f54037m;

    /* JADX INFO: renamed from: n */
    public final long f54038n;

    /* JADX INFO: renamed from: o */
    public final int f54039o;

    /* JADX INFO: renamed from: p */
    public final List f54040p;

    /* JADX INFO: renamed from: q */
    public final List f54041q;

    public o8b(String str, WorkInfo$State workInfo$State, sz1 sz1Var, long j, long j2, long j3, ak1 ak1Var, int i, BackoffPolicy backoffPolicy, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        str.getClass();
        workInfo$State.getClass();
        sz1Var.getClass();
        backoffPolicy.getClass();
        this.f54025a = str;
        this.f54026b = workInfo$State;
        this.f54027c = sz1Var;
        this.f54028d = j;
        this.f54029e = j2;
        this.f54030f = j3;
        this.f54031g = ak1Var;
        this.f54032h = i;
        this.f54033i = backoffPolicy;
        this.f54034j = j4;
        this.f54035k = j5;
        this.f54036l = i2;
        this.f54037m = i3;
        this.f54038n = j6;
        this.f54039o = i4;
        this.f54040p = list;
        this.f54041q = list2;
    }

    /* JADX INFO: renamed from: a */
    public final c8b m17856a() {
        long j;
        long jM25058a;
        List list = this.f54041q;
        sz1 sz1Var = !list.isEmpty() ? (sz1) list.get(0) : sz1.f61645b;
        UUID uuidFromString = UUID.fromString(this.f54025a);
        uuidFromString.getClass();
        HashSet hashSet = new HashSet(this.f54040p);
        long j2 = this.f54029e;
        b8b b8bVar = j2 != 0 ? new b8b(j2, this.f54030f) : null;
        WorkInfo$State workInfo$State = WorkInfo$State.ENQUEUED;
        int i = this.f54032h;
        long j3 = this.f54028d;
        WorkInfo$State workInfo$State2 = this.f54026b;
        if (workInfo$State2 == workInfo$State) {
            String str = p8b.f55771z;
            j = j3;
            jM25058a = ybd.m25058a(workInfo$State2 == workInfo$State && i > 0, i, this.f54033i, this.f54034j, this.f54035k, this.f54036l, j2 != 0, j, this.f54030f, j2, this.f54038n);
        } else {
            j = j3;
            jM25058a = Long.MAX_VALUE;
        }
        return new c8b(uuidFromString, this.f54026b, hashSet, this.f54027c, sz1Var, i, this.f54037m, this.f54031g, j, b8bVar, jM25058a, this.f54039o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8b)) {
            return false;
        }
        o8b o8bVar = (o8b) obj;
        return fa4.m11650l(this.f54025a, o8bVar.f54025a) && this.f54026b == o8bVar.f54026b && fa4.m11650l(this.f54027c, o8bVar.f54027c) && this.f54028d == o8bVar.f54028d && this.f54029e == o8bVar.f54029e && this.f54030f == o8bVar.f54030f && this.f54031g.equals(o8bVar.f54031g) && this.f54032h == o8bVar.f54032h && this.f54033i == o8bVar.f54033i && this.f54034j == o8bVar.f54034j && this.f54035k == o8bVar.f54035k && this.f54036l == o8bVar.f54036l && this.f54037m == o8bVar.f54037m && this.f54038n == o8bVar.f54038n && this.f54039o == o8bVar.f54039o && this.f54040p.equals(o8bVar.f54040p) && this.f54041q.equals(o8bVar.f54041q);
    }

    public final int hashCode() {
        return this.f54041q.hashCode() + ux5.m22979b(wq1.m24106b(this.f54039o, ux5.m22981d(this.f54038n, wq1.m24106b(this.f54037m, wq1.m24106b(this.f54036l, ux5.m22981d(this.f54035k, ux5.m22981d(this.f54034j, (this.f54033i.hashCode() + wq1.m24106b(this.f54032h, (this.f54031g.hashCode() + ux5.m22981d(this.f54030f, ux5.m22981d(this.f54029e, ux5.m22981d(this.f54028d, (this.f54027c.hashCode() + ((this.f54026b.hashCode() + (this.f54025a.hashCode() * 31)) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31), 31), 31), 31, this.f54040p);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.f54025a + ", state=" + this.f54026b + ", output=" + this.f54027c + ", initialDelay=" + this.f54028d + ", intervalDuration=" + this.f54029e + ", flexDuration=" + this.f54030f + ", constraints=" + this.f54031g + ", runAttemptCount=" + this.f54032h + ", backoffPolicy=" + this.f54033i + ", backoffDelayDuration=" + this.f54034j + ", lastEnqueueTime=" + this.f54035k + ", periodCount=" + this.f54036l + ", generation=" + this.f54037m + ", nextScheduleTimeOverride=" + this.f54038n + ", stopReason=" + this.f54039o + ", tags=" + this.f54040p + ", progress=" + this.f54041q + ')';
    }
}
