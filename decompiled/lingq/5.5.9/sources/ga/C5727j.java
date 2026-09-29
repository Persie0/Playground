package ga;

/* JADX INFO: renamed from: ga.j */
/* JADX INFO: loaded from: classes.dex */
public class C5727j {

    /* JADX INFO: renamed from: a */
    public final Object f34757a;

    /* JADX INFO: renamed from: b */
    public final int f34758b;

    /* JADX INFO: renamed from: c */
    public final int f34759c;

    /* JADX INFO: renamed from: d */
    public final long f34760d;

    /* JADX INFO: renamed from: e */
    public final int f34761e;

    public C5727j(long j10, Object obj) {
        this(obj, -1, -1, j10, -1);
    }

    public C5727j(C5727j c5727j) {
        this.f34757a = c5727j.f34757a;
        this.f34758b = c5727j.f34758b;
        this.f34759c = c5727j.f34759c;
        this.f34760d = c5727j.f34760d;
        this.f34761e = c5727j.f34761e;
    }

    public C5727j(Object obj, int i10, int i11, long j10, int i12) {
        this.f34757a = obj;
        this.f34758b = i10;
        this.f34759c = i11;
        this.f34760d = j10;
        this.f34761e = i12;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12079a() {
        return this.f34758b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5727j)) {
            return false;
        }
        C5727j c5727j = (C5727j) obj;
        return this.f34757a.equals(c5727j.f34757a) && this.f34758b == c5727j.f34758b && this.f34759c == c5727j.f34759c && this.f34760d == c5727j.f34760d && this.f34761e == c5727j.f34761e;
    }

    public final int hashCode() {
        return ((((((((this.f34757a.hashCode() + 527) * 31) + this.f34758b) * 31) + this.f34759c) * 31) + ((int) this.f34760d)) * 31) + this.f34761e;
    }
}
