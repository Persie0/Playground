package p000;

/* JADX INFO: renamed from: rr */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0967rr {

    /* JADX INFO: renamed from: a */
    private final int f47561a;

    /* JADX INFO: renamed from: b */
    private final int f47562b;

    /* JADX INFO: renamed from: c */
    private final C0745jl f47563c;

    public C0967rr() {
        this(null);
    }

    public /* synthetic */ C0967rr(byte[] bArr) {
        C0745jl c0745jl = new C0745jl();
        this.f47561a = 0;
        this.f47562b = 0;
        this.f47563c = c0745jl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0967rr)) {
            return false;
        }
        C0967rr c0967rr = (C0967rr) obj;
        int i = c0967rr.f47561a;
        int i2 = c0967rr.f47562b;
        return ooc.m18737c(this.f47563c, c0967rr.f47563c);
    }

    public final int hashCode() {
        return this.f47563c.hashCode();
    }

    public final String toString() {
        return "MetadataTransform(past=0, future=0, transformFn=" + this.f47563c + ')';
    }
}
