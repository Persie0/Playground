package p000;

/* JADX INFO: renamed from: gi */
/* JADX INFO: loaded from: classes.dex */
public final class C3039gi implements c97 {

    /* JADX INFO: renamed from: a */
    public final int f40841a;

    public C3039gi(int i) {
        this.f40841a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3039gi) && this.f40841a == ((C3039gi) obj).f40841a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40841a);
    }

    public final String toString() {
        return wq1.m24122r(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f40841a, ')');
    }
}
