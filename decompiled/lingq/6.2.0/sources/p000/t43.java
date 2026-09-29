package p000;

/* JADX INFO: loaded from: classes.dex */
public final class t43 {

    /* JADX INFO: renamed from: a */
    public final String f61849a;

    /* JADX INFO: renamed from: b */
    public final String f61850b;

    public t43(String str, String str2) {
        this.f61849a = str;
        this.f61850b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t43)) {
            return false;
        }
        t43 t43Var = (t43) obj;
        return fa4.m11650l(this.f61849a, t43Var.f61849a) && fa4.m11650l(this.f61850b, t43Var.f61850b);
    }

    public final int hashCode() {
        String str = this.f61849a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61850b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.f61849a);
        sb.append(", authToken=");
        return ux5.m22992o(sb, this.f61850b, ')');
    }
}
