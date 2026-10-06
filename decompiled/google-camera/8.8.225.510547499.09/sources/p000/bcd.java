package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bcd {

    /* JADX INFO: renamed from: a */
    public final String f2939a;

    /* JADX INFO: renamed from: b */
    public final int f2940b;

    /* JADX INFO: renamed from: c */
    public final int f2941c;

    public bcd(String str, int i, int i2) {
        str.getClass();
        this.f2939a = str;
        this.f2940b = i;
        this.f2941c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcd)) {
            return false;
        }
        bcd bcdVar = (bcd) obj;
        return ooc.m18737c(this.f2939a, bcdVar.f2939a) && this.f2940b == bcdVar.f2940b && this.f2941c == bcdVar.f2941c;
    }

    public final int hashCode() {
        return (((this.f2939a.hashCode() * 31) + this.f2940b) * 31) + this.f2941c;
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.f2939a + ", generation=" + this.f2940b + ", systemId=" + this.f2941c + ')';
    }
}
