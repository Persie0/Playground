package p000;

import androidx.work.WorkInfo$State;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class c8b {

    /* JADX INFO: renamed from: a */
    public final UUID f9721a;

    /* JADX INFO: renamed from: b */
    public final WorkInfo$State f9722b;

    /* JADX INFO: renamed from: c */
    public final HashSet f9723c;

    /* JADX INFO: renamed from: d */
    public final sz1 f9724d;

    /* JADX INFO: renamed from: e */
    public final sz1 f9725e;

    /* JADX INFO: renamed from: f */
    public final int f9726f;

    /* JADX INFO: renamed from: g */
    public final int f9727g;

    /* JADX INFO: renamed from: h */
    public final ak1 f9728h;

    /* JADX INFO: renamed from: i */
    public final long f9729i;

    /* JADX INFO: renamed from: j */
    public final b8b f9730j;

    /* JADX INFO: renamed from: k */
    public final long f9731k;

    /* JADX INFO: renamed from: l */
    public final int f9732l;

    public c8b(UUID uuid, WorkInfo$State workInfo$State, HashSet hashSet, sz1 sz1Var, sz1 sz1Var2, int i, int i2, ak1 ak1Var, long j, b8b b8bVar, long j2, int i3) {
        workInfo$State.getClass();
        sz1Var.getClass();
        sz1Var2.getClass();
        this.f9721a = uuid;
        this.f9722b = workInfo$State;
        this.f9723c = hashSet;
        this.f9724d = sz1Var;
        this.f9725e = sz1Var2;
        this.f9726f = i;
        this.f9727g = i2;
        this.f9728h = ak1Var;
        this.f9729i = j;
        this.f9730j = b8bVar;
        this.f9731k = j2;
        this.f9732l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !c8b.class.equals(obj.getClass())) {
            return false;
        }
        c8b c8bVar = (c8b) obj;
        if (this.f9726f == c8bVar.f9726f && this.f9727g == c8bVar.f9727g && this.f9721a.equals(c8bVar.f9721a) && this.f9722b == c8bVar.f9722b && fa4.m11650l(this.f9724d, c8bVar.f9724d) && this.f9728h.equals(c8bVar.f9728h) && this.f9729i == c8bVar.f9729i && fa4.m11650l(this.f9730j, c8bVar.f9730j) && this.f9731k == c8bVar.f9731k && this.f9732l == c8bVar.f9732l && this.f9723c.equals(c8bVar.f9723c)) {
            return fa4.m11650l(this.f9725e, c8bVar.f9725e);
        }
        return false;
    }

    public final int hashCode() {
        int iM22981d = ux5.m22981d(this.f9729i, (this.f9728h.hashCode() + ((((((this.f9725e.hashCode() + ((this.f9723c.hashCode() + ((this.f9724d.hashCode() + ((this.f9722b.hashCode() + (this.f9721a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f9726f) * 31) + this.f9727g) * 31)) * 31, 31);
        b8b b8bVar = this.f9730j;
        return Integer.hashCode(this.f9732l) + ux5.m22981d(this.f9731k, (iM22981d + (b8bVar != null ? b8bVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f9721a + "', state=" + this.f9722b + ", outputData=" + this.f9724d + ", tags=" + this.f9723c + ", progress=" + this.f9725e + ", runAttemptCount=" + this.f9726f + ", generation=" + this.f9727g + ", constraints=" + this.f9728h + ", initialDelayMillis=" + this.f9729i + ", periodicityInfo=" + this.f9730j + ", nextScheduleTimeMillis=" + this.f9731k + "}, stopReason=" + this.f9732l;
    }
}
