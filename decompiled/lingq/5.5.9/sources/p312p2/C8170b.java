package p312p2;

import android.graphics.Insets;
import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: p2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8170b {

    /* JADX INFO: renamed from: e */
    public static final C8170b f44301e = new C8170b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f44302a;

    /* JADX INFO: renamed from: b */
    public final int f44303b;

    /* JADX INFO: renamed from: c */
    public final int f44304c;

    /* JADX INFO: renamed from: d */
    public final int f44305d;

    /* JADX INFO: renamed from: p2.b$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Insets m16221a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public C8170b(int i10, int i11, int i12, int i13) {
        this.f44302a = i10;
        this.f44303b = i11;
        this.f44304c = i12;
        this.f44305d = i13;
    }

    /* JADX INFO: renamed from: a */
    public static C8170b m16217a(C8170b c8170b, C8170b c8170b2) {
        return m16218b(Math.max(c8170b.f44302a, c8170b2.f44302a), Math.max(c8170b.f44303b, c8170b2.f44303b), Math.max(c8170b.f44304c, c8170b2.f44304c), Math.max(c8170b.f44305d, c8170b2.f44305d));
    }

    /* JADX INFO: renamed from: b */
    public static C8170b m16218b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f44301e : new C8170b(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: c */
    public static C8170b m16219c(Insets insets) {
        return m16218b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: d */
    public final Insets m16220d() {
        return a.m16221a(this.f44302a, this.f44303b, this.f44304c, this.f44305d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8170b.class != obj.getClass()) {
            return false;
        }
        C8170b c8170b = (C8170b) obj;
        return this.f44305d == c8170b.f44305d && this.f44302a == c8170b.f44302a && this.f44304c == c8170b.f44304c && this.f44303b == c8170b.f44303b;
    }

    public final int hashCode() {
        return (((((this.f44302a * 31) + this.f44303b) * 31) + this.f44304c) * 31) + this.f44305d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f44302a);
        sb2.append(", top=");
        sb2.append(this.f44303b);
        sb2.append(", right=");
        sb2.append(this.f44304c);
        sb2.append(", bottom=");
        return C0204c.m853l(sb2, this.f44305d, '}');
    }
}
