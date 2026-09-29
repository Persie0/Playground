package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xa1 implements xv9 {

    /* JADX INFO: renamed from: a */
    public final long f67987a;

    public xa1(long j) {
        this.f67987a = j;
        if (j != 16) {
            return;
        }
        j54.m14288a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // p000.xv9
    /* JADX INFO: renamed from: a */
    public final long mo24173a() {
        return this.f67987a;
    }

    @Override // p000.xv9
    /* JADX INFO: renamed from: b */
    public final vi0 mo24174b() {
        return null;
    }

    @Override // p000.xv9
    /* JADX INFO: renamed from: c */
    public final float mo24175c() {
        return aa1.m200d(this.f67987a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xa1) && aa1.m199c(this.f67987a, ((xa1) obj).f67987a);
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Long.hashCode(this.f67987a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) aa1.m205i(this.f67987a)) + ')';
    }
}
