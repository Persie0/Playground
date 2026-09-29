package p000;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: renamed from: lg */
/* JADX INFO: loaded from: classes.dex */
public final class C3297lg {

    /* JADX INFO: renamed from: a */
    public final String f49611a;

    /* JADX INFO: renamed from: b */
    public final String f49612b;

    /* JADX INFO: renamed from: c */
    public final String f49613c;

    /* JADX INFO: renamed from: d */
    public final al7 f49614d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f49615e;

    public C3297lg(String str, String str2, String str3, al7 al7Var, ArrayList arrayList) {
        ux5.m22974A(str2, str3, Build.MANUFACTURER);
        this.f49611a = str;
        this.f49612b = str2;
        this.f49613c = str3;
        this.f49614d = al7Var;
        this.f49615e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3297lg)) {
            return false;
        }
        C3297lg c3297lg = (C3297lg) obj;
        if (!this.f49611a.equals(c3297lg.f49611a) || !fa4.m11650l(this.f49612b, c3297lg.f49612b) || !fa4.m11650l(this.f49613c, c3297lg.f49613c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return fa4.m11650l(str, str) && this.f49614d.equals(c3297lg.f49614d) && this.f49615e.equals(c3297lg.f49615e);
    }

    public final int hashCode() {
        return this.f49615e.hashCode() + ((this.f49614d.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f49611a.hashCode() * 31, this.f49612b, 31), this.f49613c, 31), Build.MANUFACTURER, 31)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f49611a + ", versionName=" + this.f49612b + ", appBuildVersion=" + this.f49613c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f49614d + ", appProcessDetails=" + this.f49615e + ')';
    }
}
