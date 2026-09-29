package p000;

/* JADX INFO: renamed from: ml */
/* JADX INFO: loaded from: classes2.dex */
public final class C3339ml {

    /* JADX INFO: renamed from: a */
    public final boolean f51462a;

    /* JADX INFO: renamed from: b */
    public final boolean f51463b;

    public C3339ml(boolean z, boolean z2) {
        this.f51462a = z;
        this.f51463b = z2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16915a() {
        return this.f51463b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m16916b() {
        return this.f51462a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3339ml)) {
            return false;
        }
        C3339ml c3339ml = (C3339ml) obj;
        return this.f51462a == c3339ml.f51462a && this.f51463b == c3339ml.f51463b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f51463b) + (Boolean.hashCode(this.f51462a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrustrationSettings(ignoreRageClick=");
        sb.append(this.f51462a);
        sb.append(", ignoreDeadClick=");
        return ux5.m22993p(sb, this.f51463b, ')');
    }
}
