package p067d8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import dm.C5207g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C6744b;
import p173i8.C6205a;
import p260m8.C7499b;
import p291o7.C8004n;

/* JADX INFO: renamed from: d8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5063e {

    /* JADX INFO: renamed from: a */
    public static final String[] f32918a;

    static {
        new C5063e();
        f32918a = new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    }

    /* JADX INFO: renamed from: a */
    public static final String m10752a() {
        if (C6205a.m12742b(C5063e.class)) {
            return null;
        }
        try {
            Context contextM15871a = C8004n.m15871a();
            List<ResolveInfo> listQueryIntentServices = contextM15871a.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            C5207g.m11110e(listQueryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            String[] strArr = f32918a;
            C5207g.m11111f(strArr, "<this>");
            HashSet hashSet = new HashSet(C7499b.m14941g0(strArr.length));
            C6744b.m13390v0(hashSet, strArr);
            Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th2) {
            C6205a.m12741a(C5063e.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m10753b() {
        if (C6205a.m12742b(C5063e.class)) {
            return null;
        }
        try {
            return C5207g.m11116k(C8004n.m15871a().getPackageName(), "fbconnect://cct.");
        } catch (Throwable th2) {
            C6205a.m12741a(C5063e.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m10754c(String str) {
        if (C6205a.m12742b(C5063e.class)) {
            return null;
        }
        try {
            C5207g.m11111f(str, "developerDefinedRedirectURI");
            String str2 = C5056a0.f32910a;
            if (C5056a0.m10743a(C8004n.m15871a(), str)) {
                return str;
            }
            return C5056a0.m10743a(C8004n.m15871a(), m10753b()) ? m10753b() : "";
        } catch (Throwable th2) {
            C6205a.m12741a(C5063e.class, th2);
            return null;
        }
    }
}
