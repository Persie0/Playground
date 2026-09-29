package p205jk;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.activity.RunnableC0183b;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.C2933a;
import dm.C5207g;
import java.util.List;
import p081e0.C5298b1;
import p289o5.C7922b;
import p289o5.C7925e;
import p289o5.C7939s;
import p289o5.C7941u;
import p289o5.InterfaceC7923c;
import p289o5.InterfaceC7927g;
import p289o5.ServiceConnectionC7938r;

/* JADX INFO: renamed from: jk.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6505a implements InterfaceC7927g {

    /* JADX INFO: renamed from: a */
    public final Activity f37118a;

    /* JADX INFO: renamed from: b */
    public final a f37119b;

    /* JADX INFO: renamed from: c */
    public final C7922b f37120c;

    /* JADX INFO: renamed from: d */
    public boolean f37121d;

    /* JADX INFO: renamed from: jk.a$a */
    public interface a {
        /* JADX INFO: renamed from: h */
        void mo9710h();

        /* JADX INFO: renamed from: p */
        void mo9711p(List<? extends Purchase> list);

        /* JADX INFO: renamed from: s */
        void mo9712s(List<? extends Purchase> list);
    }

    /* JADX INFO: renamed from: jk.a$b */
    public static final class b implements InterfaceC7923c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f37123b;

        public b(Runnable runnable) {
            this.f37123b = runnable;
        }

        @Override // p289o5.InterfaceC7923c
        /* JADX INFO: renamed from: a */
        public final void mo13093a(C7925e c7925e) {
            C5207g.m11111f(c7925e, "billingResult");
            if (c7925e.f43186a == 0) {
                C6505a.this.f37121d = true;
                Runnable runnable = this.f37123b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }

        @Override // p289o5.InterfaceC7923c
        /* JADX INFO: renamed from: b */
        public final void mo13094b() {
            C6505a.this.f37121d = false;
        }
    }

    public C6505a(Activity activity, a aVar) {
        C5207g.m11111f(activity, "activity");
        this.f37118a = activity;
        this.f37119b = aVar;
        this.f37120c = new C7922b(true, activity, this);
        m13092b(new RunnableC0183b(17, this));
    }

    @Override // p289o5.InterfaceC7927g
    /* JADX INFO: renamed from: a */
    public final void mo13091a(C7925e c7925e, List<? extends Purchase> list) {
        a aVar;
        C5207g.m11111f(c7925e, "billingResult");
        if (c7925e.f43186a != 0 || list == null || (aVar = this.f37119b) == null) {
            return;
        }
        aVar.mo9712s(list);
    }

    /* JADX INFO: renamed from: b */
    public final void m13092b(Runnable runnable) {
        ServiceInfo serviceInfo;
        C7922b c7922b = this.f37120c;
        b bVar = new b(runnable);
        if (c7922b.m15738k0()) {
            C2933a.m8514f("BillingClient", "Service connection is valid. No need to re-initialize.");
            bVar.mo13093a(C7939s.f43249i);
            return;
        }
        if (c7922b.f43158a == 1) {
            C2933a.m8515g("BillingClient", "Client is already in the process of connecting to billing service.");
            bVar.mo13093a(C7939s.f43244d);
            return;
        }
        if (c7922b.f43158a == 3) {
            C2933a.m8515g("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            bVar.mo13093a(C7939s.f43250j);
            return;
        }
        c7922b.f43158a = 1;
        C5298b1 c5298b1 = c7922b.f43161d;
        c5298b1.getClass();
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        C7941u c7941u = (C7941u) c5298b1.f33573b;
        Context context = (Context) c5298b1.f33572a;
        if (!c7941u.f43260b) {
            context.registerReceiver((C7941u) c7941u.f43261c.f33573b, intentFilter);
            c7941u.f43260b = true;
        }
        C2933a.m8514f("BillingClient", "Starting in-app billing setup.");
        c7922b.f43164g = new ServiceConnectionC7938r(c7922b, bVar);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = c7922b.f43162e.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty() && (serviceInfo = listQueryIntentServices.get(0).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null) {
                C2933a.m8515g("BillingClient", "The device doesn't have valid Play Store.");
            } else {
                ComponentName componentName = new ComponentName(str, str2);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(componentName);
                intent2.putExtra("playBillingLibraryVersion", c7922b.f43159b);
                if (c7922b.f43162e.bindService(intent2, c7922b.f43164g, 1)) {
                    C2933a.m8514f("BillingClient", "Service was bonded successfully.");
                    return;
                }
                C2933a.m8515g("BillingClient", "Connection to Billing service is blocked.");
            }
        }
        c7922b.f43158a = 0;
        C2933a.m8514f("BillingClient", "Billing service unavailable on device.");
        bVar.mo13093a(C7939s.f43243c);
    }
}
