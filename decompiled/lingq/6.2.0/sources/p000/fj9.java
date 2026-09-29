package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class fj9 {

    /* JADX INFO: renamed from: a */
    public final int f39204a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f39205b;

    /* JADX INFO: renamed from: c */
    public final boolean f39206c;

    /* JADX INFO: renamed from: d */
    public final dx1 f39207d;

    /* JADX INFO: renamed from: e */
    public final int f39208e;

    public fj9(int i, ArrayList arrayList, dx1 dx1Var, int i2) {
        dx1Var.getClass();
        this.f39204a = i;
        this.f39205b = arrayList;
        this.f39206c = true;
        this.f39207d = dx1Var;
        this.f39208e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj9)) {
            return false;
        }
        fj9 fj9Var = (fj9) obj;
        return this.f39204a == fj9Var.f39204a && fa4.m11650l(this.f39205b, fj9Var.f39205b) && this.f39206c == fj9Var.f39206c && fa4.m11650l(this.f39207d, fj9Var.f39207d) && this.f39208e == fj9Var.f39208e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39208e) + ((this.f39207d.hashCode() + g9a.m12428e((this.f39205b.hashCode() + (Integer.hashCode(this.f39204a) * 31)) * 31, 31, this.f39206c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Streak(value=");
        sb.append(this.f39204a);
        sb.append(", entries=");
        sb.append(this.f39205b);
        sb.append(", showCurrentDayStreak=");
        sb.append(this.f39206c);
        sb.append(", currentDay=");
        sb.append(this.f39207d);
        sb.append(", coins=");
        return wq1.m24123s(sb, this.f39208e, ")");
    }
}
