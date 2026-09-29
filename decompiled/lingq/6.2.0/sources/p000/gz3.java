package p000;

/* JADX INFO: loaded from: classes.dex */
public final class gz3 {

    /* JADX INFO: renamed from: a */
    public final String f41547a;

    /* JADX INFO: renamed from: b */
    public final String f41548b;

    public gz3(String str, String str2) {
        this.f41547a = str;
        this.f41548b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz3)) {
            return false;
        }
        gz3 gz3Var = (gz3) obj;
        return fa4.m11650l(this.f41547a, gz3Var.f41547a) && fa4.m11650l(this.f41548b, gz3Var.f41548b);
    }

    public final int hashCode() {
        String str = this.f41547a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f41548b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Identity(userId=");
        sb.append(this.f41547a);
        sb.append(", deviceId=");
        return ux5.m22992o(sb, this.f41548b, ')');
    }
}
