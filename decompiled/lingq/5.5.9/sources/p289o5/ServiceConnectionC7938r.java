package p289o5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.C2933a;
import java.util.concurrent.Callable;
import p205jk.C6505a;
import p480xb.AbstractBinderC10160c;
import p480xb.C10159b;
import p480xb.InterfaceC10161d;

/* JADX INFO: renamed from: o5.r */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC7938r implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final Object f43237a = new Object();

    /* JADX INFO: renamed from: b */
    public boolean f43238b = false;

    /* JADX INFO: renamed from: c */
    public InterfaceC7923c f43239c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C7922b f43240d;

    public /* synthetic */ ServiceConnectionC7938r(C7922b c7922b, C6505a.b bVar) {
        this.f43240d = c7922b;
        this.f43239c = bVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m15749a(C7925e c7925e) {
        synchronized (this.f43237a) {
            InterfaceC7923c interfaceC7923c = this.f43239c;
            if (interfaceC7923c != null) {
                interfaceC7923c.mo13093a(c7925e);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC10161d c10159b;
        C2933a.m8514f("BillingClient", "Billing service connected.");
        C7922b c7922b = this.f43240d;
        int i10 = AbstractBinderC10160c.f51460a;
        if (iBinder == null) {
            c10159b = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            c10159b = iInterfaceQueryLocalInterface instanceof InterfaceC10161d ? (InterfaceC10161d) iInterfaceQueryLocalInterface : new C10159b(iBinder);
        }
        c7922b.f43163f = c10159b;
        C7922b c7922b2 = this.f43240d;
        if (c7922b2.m15742o0(new Callable() { // from class: o5.q
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle;
                int iMo19171K0;
                ServiceConnectionC7938r serviceConnectionC7938r = this.f43236a;
                synchronized (serviceConnectionC7938r.f43237a) {
                    try {
                        if (!serviceConnectionC7938r.f43238b) {
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                            }
                            int i11 = 3;
                            try {
                                String packageName = serviceConnectionC7938r.f43240d.f43162e.getPackageName();
                                iMo19171K0 = 3;
                                int i12 = 17;
                                while (true) {
                                    if (i12 < 3) {
                                        i12 = 0;
                                        break;
                                    }
                                    if (bundle == null) {
                                        try {
                                            iMo19171K0 = serviceConnectionC7938r.f43240d.f43163f.mo19171K0(packageName, i12, "subs");
                                        } catch (Exception e10) {
                                            e = e10;
                                            i11 = iMo19171K0;
                                            C2933a.m8516h("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                            serviceConnectionC7938r.f43240d.f43158a = 0;
                                            serviceConnectionC7938r.f43240d.f43163f = null;
                                            iMo19171K0 = i11;
                                        }
                                    } else {
                                        iMo19171K0 = serviceConnectionC7938r.f43240d.f43163f.mo19172M0(i12, packageName, "subs", bundle);
                                    }
                                    if (iMo19171K0 == 0) {
                                        break;
                                    }
                                    i12--;
                                }
                                serviceConnectionC7938r.f43240d.getClass();
                                boolean z10 = true;
                                serviceConnectionC7938r.f43240d.f43165h = i12 >= 3;
                                if (i12 < 3) {
                                    C2933a.m8514f("BillingClient", "In-app billing API does not support subscription on this device.");
                                }
                                for (int i13 = 17; i13 >= 3; i13--) {
                                    iMo19171K0 = bundle == null ? serviceConnectionC7938r.f43240d.f43163f.mo19171K0(packageName, i13, "inapp") : serviceConnectionC7938r.f43240d.f43163f.mo19172M0(i13, packageName, "inapp", bundle);
                                    if (iMo19171K0 == 0) {
                                        serviceConnectionC7938r.f43240d.f43166i = i13;
                                        break;
                                    }
                                }
                                C7922b c7922b3 = serviceConnectionC7938r.f43240d;
                                int i14 = c7922b3.f43166i;
                                c7922b3.f43154J = i14 >= 17;
                                c7922b3.f43153I = i14 >= 16;
                                c7922b3.f43152H = i14 >= 15;
                                c7922b3.f43169l = i14 >= 14;
                                c7922b3.f43168k = i14 >= 9;
                                if (i14 < 6) {
                                    z10 = false;
                                }
                                c7922b3.f43167j = z10;
                                if (i14 < 3) {
                                    C2933a.m8515g("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                }
                                if (iMo19171K0 == 0) {
                                    serviceConnectionC7938r.f43240d.f43158a = 2;
                                } else {
                                    serviceConnectionC7938r.f43240d.f43158a = 0;
                                    serviceConnectionC7938r.f43240d.f43163f = null;
                                }
                            } catch (Exception e11) {
                                e = e11;
                            }
                            if (iMo19171K0 == 0) {
                                serviceConnectionC7938r.m15749a(C7939s.f43249i);
                            } else {
                                serviceConnectionC7938r.m15749a(C7939s.f43241a);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return null;
            }
        }, 30000L, new RunnableC7930j(1, this), c7922b2.m15739l0()) == null) {
            m15749a(this.f43240d.m15741n0());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2933a.m8515g("BillingClient", "Billing service disconnected.");
        this.f43240d.f43163f = null;
        this.f43240d.f43158a = 0;
        synchronized (this.f43237a) {
            InterfaceC7923c interfaceC7923c = this.f43239c;
            if (interfaceC7923c != null) {
                interfaceC7923c.mo13094b();
            }
        }
    }
}
