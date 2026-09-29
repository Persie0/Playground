package p000;

/* JADX INFO: renamed from: sy */
/* JADX INFO: loaded from: classes2.dex */
public final class C3591sy {

    /* JADX INFO: renamed from: d */
    public static final C3591sy f61573d = new C3553ry().m20983a();

    /* JADX INFO: renamed from: a */
    public final boolean f61574a;

    /* JADX INFO: renamed from: b */
    public final boolean f61575b;

    /* JADX INFO: renamed from: c */
    public final boolean f61576c;

    public C3591sy(C3553ry c3553ry) {
        this.f61574a = c3553ry.f60020a;
        this.f61575b = c3553ry.f60021b;
        this.f61576c = c3553ry.f60022c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3591sy.class != obj.getClass()) {
            return false;
        }
        C3591sy c3591sy = (C3591sy) obj;
        return this.f61574a == c3591sy.f61574a && this.f61575b == c3591sy.f61575b && this.f61576c == c3591sy.f61576c;
    }

    public final int hashCode() {
        return ((this.f61574a ? 1 : 0) << 2) + ((this.f61575b ? 1 : 0) << 1) + (this.f61576c ? 1 : 0);
    }
}
