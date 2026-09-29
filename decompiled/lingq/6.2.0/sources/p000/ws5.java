package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ws5 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final long f67250a;

    /* JADX INFO: renamed from: b */
    public final long f67251b;

    /* JADX INFO: renamed from: c */
    public final long f67252c;

    public ws5(long j, long j2, long j3) {
        this.f67250a = j;
        this.f67251b = j2;
        this.f67252c = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f67250a, ((ws5) obj).f67250a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws5)) {
            return false;
        }
        ws5 ws5Var = (ws5) obj;
        return this.f67250a == ws5Var.f67250a && this.f67251b == ws5Var.f67251b && this.f67252c == ws5Var.f67252c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f67250a), Long.valueOf(this.f67251b), Long.valueOf(this.f67252c));
    }
}
