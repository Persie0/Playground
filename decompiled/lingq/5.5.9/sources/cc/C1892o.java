package cc;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1892o {

    /* JADX INFO: renamed from: a */
    public final String f10041a;

    /* JADX INFO: renamed from: b */
    public final String f10042b;

    /* JADX INFO: renamed from: c */
    public final String f10043c;

    /* JADX INFO: renamed from: d */
    public final long f10044d;

    /* JADX INFO: renamed from: e */
    public final long f10045e;

    /* JADX INFO: renamed from: f */
    public final zzau f10046f;

    public C1892o(C1897o4 c1897o4, String str, String str2, String str3, long j10, long j11, zzau zzauVar) {
        C6272i.m12912f(str2);
        C6272i.m12912f(str3);
        C6272i.m12915i(zzauVar);
        this.f10041a = str2;
        this.f10042b = str3;
        this.f10043c = true == TextUtils.isEmpty(str) ? null : str;
        this.f10044d = j10;
        this.f10045e = j11;
        if (j11 != 0 && j11 > j10) {
            C1860k3 c1860k3 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5625c(C1860k3.m5700q(str2), C1860k3.m5700q(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f10046f = zzauVar;
    }

    public C1892o(C1897o4 c1897o4, String str, String str2, String str3, long j10, Bundle bundle) {
        zzau zzauVar;
        C6272i.m12912f(str2);
        C6272i.m12912f(str3);
        this.f10041a = str2;
        this.f10042b = str3;
        this.f10043c = true == TextUtils.isEmpty(str) ? null : str;
        this.f10044d = j10;
        this.f10045e = 0L;
        if (bundle.isEmpty()) {
            zzauVar = new zzau(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    C1860k3 c1860k3 = c1897o4.f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9942f.m5623a("Param name can't be null");
                    it.remove();
                } else {
                    C1900o7 c1900o7 = c1897o4.f10089l;
                    C1897o4.m5774i(c1900o7);
                    Object objM5833l = c1900o7.m5833l(bundle2.get(next), next);
                    if (objM5833l == null) {
                        C1860k3 c1860k4 = c1897o4.f10086i;
                        C1897o4.m5776k(c1860k4);
                        c1860k4.f9945i.m5624b(c1897o4.f10057H.m5604e(next), "Param value can't be null");
                        it.remove();
                    } else {
                        C1900o7 c1900o8 = c1897o4.f10089l;
                        C1897o4.m5774i(c1900o8);
                        c1900o8.m5847z(bundle2, next, objM5833l);
                    }
                }
            }
            zzauVar = new zzau(bundle2);
        }
        this.f10046f = zzauVar;
    }

    /* JADX INFO: renamed from: a */
    public final C1892o m5773a(C1897o4 c1897o4, long j10) {
        return new C1892o(c1897o4, this.f10043c, this.f10041a, this.f10042b, this.f10044d, j10, this.f10046f);
    }

    public final String toString() {
        return "Event{appId='" + this.f10041a + "', name='" + this.f10042b + "', params=" + this.f10046f.toString() + "}";
    }
}
