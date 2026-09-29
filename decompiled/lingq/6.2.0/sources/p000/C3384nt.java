package p000;

import android.os.Build;
import com.google.firebase.sessions.LogEnvironment;

/* JADX INFO: renamed from: nt */
/* JADX INFO: loaded from: classes.dex */
public final class C3384nt {

    /* JADX INFO: renamed from: a */
    public final String f53225a;

    /* JADX INFO: renamed from: b */
    public final LogEnvironment f53226b;

    /* JADX INFO: renamed from: c */
    public final C3297lg f53227c;

    public C3384nt(String str, LogEnvironment logEnvironment, C3297lg c3297lg) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        str.getClass();
        str2.getClass();
        str3.getClass();
        logEnvironment.getClass();
        this.f53225a = str;
        this.f53226b = logEnvironment;
        this.f53227c = c3297lg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3384nt)) {
            return false;
        }
        C3384nt c3384nt = (C3384nt) obj;
        if (!fa4.m11650l(this.f53225a, c3384nt.f53225a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!fa4.m11650l(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return fa4.m11650l(str2, str2) && this.f53226b == c3384nt.f53226b && this.f53227c.equals(c3384nt.f53227c);
    }

    public final int hashCode() {
        return this.f53227c.hashCode() + ((this.f53226b.hashCode() + ux5.m22980c((((Build.MODEL.hashCode() + (this.f53225a.hashCode() * 31)) * 31) + 48517565) * 31, Build.VERSION.RELEASE, 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f53225a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.6, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + this.f53226b + ", androidAppInfo=" + this.f53227c + ')';
    }
}
