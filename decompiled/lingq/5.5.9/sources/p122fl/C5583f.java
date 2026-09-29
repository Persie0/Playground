package p122fl;

/* JADX INFO: renamed from: fl.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C5583f {

    /* JADX INFO: renamed from: a */
    public final int f34392a;

    /* JADX INFO: renamed from: b */
    public final int f34393b;

    /* JADX INFO: renamed from: c */
    public final long f34394c;

    /* JADX INFO: renamed from: d */
    public final long f34395d;

    /* JADX INFO: renamed from: e */
    public long f34396e;

    public C5583f() {
        this(0, 0, 0L, 0L, 0L);
    }

    public C5583f(int i10, int i11, long j10, long j11, long j12) {
        this.f34392a = i10;
        this.f34393b = i11;
        this.f34394c = j10;
        this.f34395d = j11;
        this.f34396e = j12;
    }

    /* JADX INFO: renamed from: a */
    public final long m11834a() {
        return this.f34396e;
    }

    /* JADX INFO: renamed from: b */
    public final long m11835b() {
        return this.f34395d;
    }

    /* JADX INFO: renamed from: c */
    public final int m11836c() {
        return this.f34392a;
    }

    /* JADX INFO: renamed from: d */
    public final int m11837d() {
        return this.f34393b;
    }

    /* JADX INFO: renamed from: e */
    public final long m11838e() {
        return this.f34394c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r8.f34396e == r9.f34396e) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5583f) {
                C5583f c5583f = (C5583f) obj;
                if (this.f34392a == c5583f.f34392a) {
                    if (this.f34393b == c5583f.f34393b) {
                        if (this.f34394c == c5583f.f34394c) {
                            if (this.f34395d == c5583f.f34395d) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m11839f() {
        return this.f34394c + this.f34396e == this.f34395d;
    }

    public final int hashCode() {
        int i10 = ((this.f34392a * 31) + this.f34393b) * 31;
        long j10 = this.f34394c;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f34395d;
        int i12 = (i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f34396e;
        return i12 + ((int) (j12 ^ (j12 >>> 32)));
    }

    public final String toString() {
        return "FileSlice(id=" + this.f34392a + ", position=" + this.f34393b + ", startBytes=" + this.f34394c + ", endBytes=" + this.f34395d + ", downloaded=" + this.f34396e + ")";
    }
}
