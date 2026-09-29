package p000;

import com.lingq.core.domain.model.status.WordStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class q7b {

    /* JADX INFO: renamed from: a */
    public final xz7 f57357a;

    /* JADX INFO: renamed from: b */
    public final boolean f57358b;

    /* JADX INFO: renamed from: c */
    public final boolean f57359c;

    /* JADX INFO: renamed from: d */
    public final int f57360d;

    /* JADX INFO: renamed from: e */
    public final Integer f57361e;

    /* JADX INFO: renamed from: f */
    public final String f57362f;

    /* JADX INFO: renamed from: g */
    public final boolean f57363g;

    /* JADX INFO: renamed from: h */
    public final boolean f57364h;

    /* JADX INFO: renamed from: i */
    public final boolean f57365i;

    public /* synthetic */ q7b(xz7 xz7Var, boolean z, boolean z2, int i, Integer num, String str, boolean z3, boolean z4, int i2) {
        this(xz7Var, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? WordStatus.New.getValue() : str, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? false : z4, (i2 & 256) == 0);
    }

    /* JADX INFO: renamed from: a */
    public static q7b m19709a(q7b q7bVar, int i, String str) {
        xz7 xz7Var = q7bVar.f57357a;
        boolean z = q7bVar.f57359c;
        Integer num = q7bVar.f57361e;
        boolean z2 = q7bVar.f57363g;
        boolean z3 = q7bVar.f57364h;
        boolean z4 = q7bVar.f57365i;
        xz7Var.getClass();
        str.getClass();
        return new q7b(xz7Var, true, z, i, num, str, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7b)) {
            return false;
        }
        q7b q7bVar = (q7b) obj;
        return fa4.m11650l(this.f57357a, q7bVar.f57357a) && this.f57358b == q7bVar.f57358b && this.f57359c == q7bVar.f57359c && this.f57360d == q7bVar.f57360d && fa4.m11650l(this.f57361e, q7bVar.f57361e) && fa4.m11650l(this.f57362f, q7bVar.f57362f) && this.f57363g == q7bVar.f57363g && this.f57364h == q7bVar.f57364h && this.f57365i == q7bVar.f57365i;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f57360d, g9a.m12428e(g9a.m12428e(this.f57357a.hashCode() * 31, 31, this.f57358b), 31, this.f57359c), 31);
        Integer num = this.f57361e;
        return Boolean.hashCode(this.f57365i) + g9a.m12428e(g9a.m12428e(ux5.m22980c((iM24106b + (num == null ? 0 : num.hashCode())) * 31, this.f57362f, 31), 31, this.f57363g), 31, this.f57364h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WordHighlightData(token=");
        sb.append(this.f57357a);
        sb.append(", isCard=");
        sb.append(this.f57358b);
        sb.append(", isWord=");
        hn1.m13373w(sb, this.f57359c, ", cardStatus=", this.f57360d, ", extendedCardStatus=");
        sb.append(this.f57361e);
        sb.append(", wordStatus=");
        sb.append(this.f57362f);
        sb.append(", scriptRestricted=");
        wq1.m24101A(sb, this.f57363g, ", isKnown=", this.f57364h, ", isLink=");
        return AbstractC3393o1.m17740o(sb, this.f57365i, ")");
    }

    public q7b(xz7 xz7Var, boolean z, boolean z2, int i, Integer num, String str, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        this.f57357a = xz7Var;
        this.f57358b = z;
        this.f57359c = z2;
        this.f57360d = i;
        this.f57361e = num;
        this.f57362f = str;
        this.f57363g = z3;
        this.f57364h = z4;
        this.f57365i = z5;
    }
}
