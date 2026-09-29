package p290o6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.RemoteException;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.C2181a;
import com.google.firebase.messaging.C3238d0;
import com.google.firebase.messaging.C3246i;
import com.google.firebase.messaging.C3258u;
import dm.C5207g;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import p289o5.C7940t;

/* JADX INFO: renamed from: o6.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC7948c implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43283a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43284b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f43285c;

    public /* synthetic */ CallableC7948c(Object obj, int i10, Object obj2) {
        this.f43283a = i10;
        this.f43284b = obj;
        this.f43285c = obj2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i10;
        ComponentName componentNameStartService;
        String str2 = null;
        switch (this.f43283a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7950d c7950d = (C7950d) this.f43284b;
                InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.f43285c;
                c7950d.getClass();
                try {
                    return installReferrerClient.getInstallReferrer();
                } catch (RemoteException e10) {
                    C7944a c7944a = c7950d.f43289b;
                    C2181a c2181aM6433b = c7944a.f43270d.m6433b();
                    String str3 = c7944a.f43270d.f10995a;
                    String str4 = "Remote exception caused by Google Play Install Referrer library - " + e10.getMessage();
                    c2181aM6433b.getClass();
                    C2181a.m6452d(str3, str4);
                    installReferrerClient.endConnection();
                    c7944a.f43272f.f43467i = false;
                    return str2;
                }
            case 1:
                C7940t c7940t = (C7940t) this.f43284b;
                Callable callable = (Callable) this.f43285c;
                C5207g.m11111f(c7940t, "this$0");
                Object obj = c7940t.f43257b;
                C5207g.m11111f(callable, "$callable");
                try {
                    c7940t.f43256a = callable.call();
                    CountDownLatch countDownLatch = (CountDownLatch) obj;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                    return str2;
                } catch (Throwable th2) {
                    CountDownLatch countDownLatch2 = (CountDownLatch) obj;
                    if (countDownLatch2 != null) {
                        countDownLatch2.countDown();
                    }
                    throw th2;
                }
            default:
                Context context = (Context) this.f43284b;
                Intent intent = (Intent) this.f43285c;
                Object obj2 = C3246i.f16394c;
                C3258u c3258uM9290a = C3258u.m9290a();
                c3258uM9290a.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                c3258uM9290a.f16441d.offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (c3258uM9290a) {
                    String str5 = c3258uM9290a.f16438a;
                    if (str5 != null) {
                        str2 = str5;
                    } else {
                        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                        if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
                            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                        } else {
                            if (str.startsWith(".")) {
                                c3258uM9290a.f16438a = context.getPackageName() + serviceInfo.name;
                            } else {
                                c3258uM9290a.f16438a = serviceInfo.name;
                            }
                            str2 = c3258uM9290a.f16438a;
                        }
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if (c3258uM9290a.m9292c(context)) {
                        componentNameStartService = C3238d0.m9253b(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = 404;
                    } else {
                        i10 = -1;
                    }
                } catch (IllegalStateException e11) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e11);
                    i10 = 402;
                } catch (SecurityException e12) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e12);
                    i10 = 401;
                }
                return Integer.valueOf(i10);
        }
    }
}
