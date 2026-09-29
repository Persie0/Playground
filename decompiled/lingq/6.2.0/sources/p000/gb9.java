package p000;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class gb9 {

    /* JADX INFO: renamed from: a */
    public final long f40503a;

    /* JADX INFO: renamed from: b */
    public final long f40504b;

    /* JADX INFO: renamed from: c */
    public final int f40505c;

    public gb9(int i, long j, long j2) {
        bna.m3969q(j < j2);
        this.f40503a = j;
        this.f40504b = j2;
        this.f40505c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gb9.class == obj.getClass()) {
            gb9 gb9Var = (gb9) obj;
            if (this.f40503a == gb9Var.f40503a && this.f40504b == gb9Var.f40504b && this.f40505c == gb9Var.f40505c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f40503a), Long.valueOf(this.f40504b), Integer.valueOf(this.f40505c));
    }

    public final String toString() {
        String str = uma.f64080a;
        Locale locale = Locale.US;
        StringBuilder sbM22996s = ux5.m22996s(this.f40503a, "Segment: startTimeMs=", ", endTimeMs=");
        sbM22996s.append(this.f40504b);
        sbM22996s.append(", speedDivisor=");
        sbM22996s.append(this.f40505c);
        return sbM22996s.toString();
    }
}
