package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class wba {

    /* JADX INFO: renamed from: a */
    public final int f66598a;

    /* JADX INFO: renamed from: b */
    public final int f66599b;

    /* JADX INFO: renamed from: c */
    public final int f66600c;

    /* JADX INFO: renamed from: d */
    public final List f66601d;

    /* JADX INFO: renamed from: e */
    public final boolean f66602e;

    /* JADX INFO: renamed from: f */
    public final boolean f66603f;

    /* JADX INFO: renamed from: g */
    public final boolean f66604g;

    public wba(int i, int i2, int i3, List list, boolean z, int i4) {
        list = (i4 & 8) != 0 ? EmptyList.f47638a : list;
        boolean z2 = (i4 & 32) == 0;
        boolean z3 = (i4 & 64) == 0;
        this.f66598a = i;
        this.f66599b = i2;
        this.f66600c = i3;
        this.f66601d = list;
        this.f66602e = z;
        this.f66603f = z2;
        this.f66604g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wba)) {
            return false;
        }
        wba wbaVar = (wba) obj;
        return this.f66598a == wbaVar.f66598a && this.f66599b == wbaVar.f66599b && this.f66600c == wbaVar.f66600c && this.f66601d.equals(wbaVar.f66601d) && this.f66602e == wbaVar.f66602e && this.f66603f == wbaVar.f66603f && this.f66604g == wbaVar.f66604g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66604g) + g9a.m12428e(g9a.m12428e(ux5.m22979b(wq1.m24106b(this.f66600c, wq1.m24106b(this.f66599b, Integer.hashCode(this.f66598a) * 31, 31), 31), 31, this.f66601d), 31, this.f66602e), 31, this.f66603f);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f66598a, this.f66599b, "TrialStepData(icon=", ", title=", ", description=");
        sbM22994q.append(this.f66600c);
        sbM22994q.append(", argsForDesc=");
        sbM22994q.append(this.f66601d);
        sbM22994q.append(", isActive=");
        wq1.m24101A(sbM22994q, this.f66602e, ", applySpecialEffect=", this.f66603f, ", usesReminderColor=");
        return AbstractC3393o1.m17740o(sbM22994q, this.f66604g, ")");
    }
}
