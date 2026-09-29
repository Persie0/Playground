package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class x09 extends g19 {

    /* JADX INFO: renamed from: a */
    public final ViewKeys f67596a;

    /* JADX INFO: renamed from: b */
    public final int f67597b;

    /* JADX INFO: renamed from: c */
    public final int f67598c;

    public x09(ViewKeys viewKeys, int i, int i2) {
        viewKeys.getClass();
        this.f67596a = viewKeys;
        this.f67597b = i;
        this.f67598c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x09)) {
            return false;
        }
        x09 x09Var = (x09) obj;
        return this.f67596a == x09Var.f67596a && this.f67597b == x09Var.f67597b && this.f67598c == x09Var.f67598c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67598c) + wq1.m24106b(this.f67597b, this.f67596a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnRangeChanged(key=");
        sb.append(this.f67596a);
        sb.append(", min=");
        sb.append(this.f67597b);
        sb.append(", max=");
        return wq1.m24123s(sb, this.f67598c, ")");
    }
}
