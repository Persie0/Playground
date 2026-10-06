package p000;

import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayh {

    /* JADX INFO: renamed from: a */
    public final Set f2714a;

    /* JADX INFO: renamed from: b */
    public final int f2715b;

    /* JADX INFO: renamed from: c */
    private final UUID f2716c;

    /* JADX INFO: renamed from: d */
    private final axt f2717d;

    /* JADX INFO: renamed from: e */
    private final axt f2718e;

    /* JADX INFO: renamed from: f */
    private final int f2719f;

    /* JADX INFO: renamed from: g */
    private final int f2720g;

    public ayh(UUID uuid, int i, Set set, axt axtVar, axt axtVar2, int i2, int i3) {
        this.f2716c = uuid;
        this.f2715b = i;
        this.f2714a = set;
        this.f2717d = axtVar;
        this.f2718e = axtVar2;
        this.f2719f = i2;
        this.f2720g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ooc.m18737c(getClass(), obj.getClass())) {
            return false;
        }
        ayh ayhVar = (ayh) obj;
        if (this.f2719f == ayhVar.f2719f && this.f2720g == ayhVar.f2720g && ooc.m18737c(this.f2716c, ayhVar.f2716c) && this.f2715b == ayhVar.f2715b && ooc.m18737c(this.f2717d, ayhVar.f2717d) && ooc.m18737c(this.f2714a, ayhVar.f2714a)) {
            return ooc.m18737c(this.f2718e, ayhVar.f2718e);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f2716c.hashCode() * 31;
        int i = this.f2715b;
        C0158ej.m7380g(i);
        return ((((((((((iHashCode + i) * 31) + this.f2717d.hashCode()) * 31) + this.f2714a.hashCode()) * 31) + this.f2718e.hashCode()) * 31) + this.f2719f) * 31) + this.f2720g;
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f2716c + "', state=" + ((Object) C0158ej.m7378e(this.f2715b)) + ", outputData=" + this.f2717d + ", tags=" + this.f2714a + ", progress=" + this.f2718e + ", runAttemptCount=" + this.f2719f + ", generation=" + this.f2720g + '}';
    }
}
