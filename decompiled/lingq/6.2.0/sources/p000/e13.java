package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.room.util.AbstractC0758a;
import androidx.work.WorkInfo$State;
import androidx.work.impl.C0778d;
import com.airbnb.lottie.LottieAnimationView;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e13 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36567a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f36568b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f36569c;

    public /* synthetic */ e13(int i, Object obj, Object obj2) {
        this.f36567a = i;
        this.f36568b = obj;
        this.f36569c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i;
        ComponentName componentNameStartService;
        boolean z = false;
        String str2 = null;
        switch (this.f36567a) {
            case 0:
                Context context = (Context) this.f36568b;
                Intent intent = (Intent) this.f36569c;
                ny8 ny8VarM17672A = ny8.m17672A();
                ny8VarM17672A.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) ny8VarM17672A.f53417e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (ny8VarM17672A) {
                    try {
                        String str3 = (String) ny8VarM17672A.f53414b;
                        if (str3 != null) {
                            str2 = str3;
                        } else {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str.startsWith(".")) {
                                    ny8VarM17672A.f53414b = context.getPackageName() + serviceInfo.name;
                                } else {
                                    ny8VarM17672A.f53414b = serviceInfo.name;
                                }
                                str2 = (String) ny8VarM17672A.f53414b;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if (ny8VarM17672A.m17677D(context)) {
                        componentNameStartService = vxc.m23591c(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            case 1:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f36568b;
                String str4 = (String) this.f36569c;
                if (!lottieAnimationView.f10579H) {
                    return ll5.m16349b(lottieAnimationView.getContext(), str4, null);
                }
                Context context2 = lottieAnimationView.getContext();
                HashMap map = ll5.f49797a;
                return ll5.m16349b(context2, str4, "asset_" + str4);
            default:
                g9b g9bVar = (g9b) this.f36568b;
                C0778d c0778d = (C0778d) this.f36569c;
                String str5 = c0778d.f7251l;
                String str6 = c0778d.f7242c;
                u8b u8bVar = c0778d.f7248i;
                p8b p8bVar = c0778d.f7240a;
                if (g9bVar instanceof e9b) {
                    og5 og5Var = ((e9b) g9bVar).f36890a;
                    WorkInfo$State workInfo$StateM22568d = u8bVar.m22568d(str6);
                    h8b h8bVarMo2908y = c0778d.f7247h.mo2908y();
                    h8bVarMo2908y.getClass();
                    AbstractC0758a.m2859b(h8bVarMo2908y.f42000a, false, true, new xca(str6, 7));
                    if (workInfo$StateM22568d != null) {
                        if (workInfo$StateM22568d == WorkInfo$State.RUNNING) {
                            if (og5Var instanceof ng5) {
                                String str7 = h9b.f42060a;
                                oj5.m18040f().m18045g(str7, "Worker result SUCCESS for " + str5);
                                if (p8bVar.m18988k()) {
                                    c0778d.m2928d();
                                } else {
                                    u8bVar.m22574j(WorkInfo$State.SUCCEEDED, str6);
                                    sz1 sz1Var = ((ng5) og5Var).f52706a;
                                    sz1Var.getClass();
                                    AbstractC0758a.m2859b(u8bVar.f63598a, false, true, new r3a(20, sz1Var, str6));
                                    c0778d.f7245f.getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    rb2 rb2Var = c0778d.f7249j;
                                    for (String str8 : rb2Var.m20569a(str6)) {
                                        if (u8bVar.m22568d(str8) == WorkInfo$State.BLOCKED && ((Boolean) AbstractC0758a.m2859b(rb2Var.f59016a, true, false, new t70(str8, 22))).booleanValue()) {
                                            oj5.m18040f().m18045g(h9b.f42060a, "Setting status to enqueued for ".concat(str8));
                                            u8bVar.m22574j(WorkInfo$State.ENQUEUED, str8);
                                            u8bVar.m22573i(str8, jCurrentTimeMillis);
                                        }
                                    }
                                }
                            } else if (og5Var instanceof mg5) {
                                String str9 = h9b.f42060a;
                                oj5.m18040f().m18045g(str9, "Worker result RETRY for " + str5);
                                c0778d.m2927c(-256);
                                z = true;
                            } else {
                                String str10 = h9b.f42060a;
                                oj5.m18040f().m18045g(str10, "Worker result FAILURE for " + str5);
                                if (p8bVar.m18988k()) {
                                    c0778d.m2928d();
                                } else {
                                    c0778d.m2929e(og5Var);
                                }
                            }
                        } else if (!workInfo$StateM22568d.isFinished()) {
                            c0778d.m2927c(-512);
                            z = true;
                        }
                    }
                } else if (g9bVar instanceof d9b) {
                    og5 og5Var2 = ((d9b) g9bVar).f35222a;
                    String str11 = h9b.f42060a;
                    oj5.m18040f().m18045g(str11, "Worker result FAILURE for " + str5);
                    if (p8bVar.m18988k()) {
                        c0778d.m2928d();
                    } else {
                        c0778d.m2929e(og5Var2);
                    }
                } else {
                    if (!(g9bVar instanceof f9b)) {
                        gm5.m12750e();
                        return null;
                    }
                    int i2 = ((f9b) g9bVar).f38695a;
                    if (fa4.m11650l(p8bVar.f55796y, Boolean.TRUE)) {
                        String str12 = h9b.f42060a;
                        oj5.m18040f().m18042a(str12, "Worker " + p8bVar.f55774c + " was interrupted. Backing off.");
                        c0778d.m2927c(i2);
                    } else {
                        WorkInfo$State workInfo$StateM22568d2 = u8bVar.m22568d(str6);
                        if (workInfo$StateM22568d2 == null || workInfo$StateM22568d2.isFinished()) {
                            String str13 = h9b.f42060a;
                            oj5.m18040f().m18042a(str13, "Status for " + str6 + " is " + workInfo$StateM22568d2 + " ; not doing any work");
                        } else {
                            String str14 = h9b.f42060a;
                            oj5.m18040f().m18042a(str14, "Status for " + str6 + " is " + workInfo$StateM22568d2 + "; not doing any work and rescheduling for later execution");
                            u8bVar.m22574j(WorkInfo$State.ENQUEUED, str6);
                            u8bVar.m22575k(i2, str6);
                            u8bVar.m22571g(str6, -1L);
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
