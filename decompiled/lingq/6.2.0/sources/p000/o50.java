package p000;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class o50 {

    /* JADX INFO: renamed from: a */
    public final boolean f53856a;

    public o50(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            C3386nv.m17635v("Null osRelease");
            throw null;
        }
        if (str2 != null) {
            this.f53856a = z;
        } else {
            C3386nv.m17635v("Null osCodeName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o50)) {
            return false;
        }
        o50 o50Var = (o50) obj;
        String str = Build.VERSION.RELEASE;
        if (!str.equals(str)) {
            return false;
        }
        String str2 = Build.VERSION.CODENAME;
        return str2.equals(str2) && this.f53856a == o50Var.f53856a;
    }

    public final int hashCode() {
        return (this.f53856a ? 1231 : 1237) ^ ((((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(Build.VERSION.RELEASE);
        sb.append(", osCodeName=");
        sb.append(Build.VERSION.CODENAME);
        sb.append(", isRooted=");
        return AbstractC3393o1.m17740o(sb, this.f53856a, "}");
    }
}
