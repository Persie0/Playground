package p000;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class n50 {

    /* JADX INFO: renamed from: a */
    public final int f52351a;

    /* JADX INFO: renamed from: b */
    public final int f52352b;

    /* JADX INFO: renamed from: c */
    public final long f52353c;

    /* JADX INFO: renamed from: d */
    public final long f52354d;

    /* JADX INFO: renamed from: e */
    public final boolean f52355e;

    /* JADX INFO: renamed from: f */
    public final int f52356f;

    public n50(int i, int i2, long j, long j2, boolean z, int i3) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f52351a = i;
        if (str == null) {
            C3386nv.m17635v("Null model");
            throw null;
        }
        this.f52352b = i2;
        this.f52353c = j;
        this.f52354d = j2;
        this.f52355e = z;
        this.f52356f = i3;
        if (str2 == null) {
            C3386nv.m17635v("Null manufacturer");
            throw null;
        }
        if (str3 != null) {
            return;
        }
        C3386nv.m17635v("Null modelClass");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n50)) {
            return false;
        }
        n50 n50Var = (n50) obj;
        if (this.f52351a != n50Var.f52351a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f52352b != n50Var.f52352b || this.f52353c != n50Var.f52353c || this.f52354d != n50Var.f52354d || this.f52355e != n50Var.f52355e || this.f52356f != n50Var.f52356f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f52351a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f52352b) * 1000003;
        long j = this.f52353c;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f52354d;
        return ((((this.f52356f ^ ((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f52355e ? 1231 : 1237)) * 1000003)) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f52351a);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", availableProcessors=");
        sb.append(this.f52352b);
        sb.append(", totalRam=");
        sb.append(this.f52353c);
        sb.append(", diskSpace=");
        sb.append(this.f52354d);
        sb.append(", isEmulator=");
        sb.append(this.f52355e);
        sb.append(", state=");
        sb.append(this.f52356f);
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", modelClass=");
        return AbstractC3393o1.m17738m(sb, Build.PRODUCT, "}");
    }
}
