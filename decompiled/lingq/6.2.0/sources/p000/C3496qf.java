package p000;

import java.util.Objects;

/* JADX INFO: renamed from: qf */
/* JADX INFO: loaded from: classes.dex */
public final class C3496qf {

    /* JADX INFO: renamed from: a */
    public final long f57666a;

    /* JADX INFO: renamed from: b */
    public final z0a f57667b;

    /* JADX INFO: renamed from: c */
    public final int f57668c;

    /* JADX INFO: renamed from: d */
    public final jv5 f57669d;

    /* JADX INFO: renamed from: e */
    public final long f57670e;

    /* JADX INFO: renamed from: f */
    public final z0a f57671f;

    /* JADX INFO: renamed from: g */
    public final int f57672g;

    /* JADX INFO: renamed from: h */
    public final jv5 f57673h;

    /* JADX INFO: renamed from: i */
    public final long f57674i;

    /* JADX INFO: renamed from: j */
    public final long f57675j;

    public C3496qf(long j, z0a z0aVar, int i, jv5 jv5Var, long j2, z0a z0aVar2, int i2, jv5 jv5Var2, long j3, long j4) {
        this.f57666a = j;
        this.f57667b = z0aVar;
        this.f57668c = i;
        this.f57669d = jv5Var;
        this.f57670e = j2;
        this.f57671f = z0aVar2;
        this.f57672g = i2;
        this.f57673h = jv5Var2;
        this.f57674i = j3;
        this.f57675j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3496qf.class != obj.getClass()) {
            return false;
        }
        C3496qf c3496qf = (C3496qf) obj;
        return this.f57666a == c3496qf.f57666a && this.f57668c == c3496qf.f57668c && this.f57670e == c3496qf.f57670e && this.f57672g == c3496qf.f57672g && this.f57674i == c3496qf.f57674i && this.f57675j == c3496qf.f57675j && this.f57667b.equals(c3496qf.f57667b) && Objects.equals(this.f57669d, c3496qf.f57669d) && Objects.equals(this.f57671f, c3496qf.f57671f) && Objects.equals(this.f57673h, c3496qf.f57673h);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f57666a), this.f57667b, Integer.valueOf(this.f57668c), this.f57669d, Long.valueOf(this.f57670e), this.f57671f, Integer.valueOf(this.f57672g), this.f57673h, Long.valueOf(this.f57674i), Long.valueOf(this.f57675j));
    }
}
