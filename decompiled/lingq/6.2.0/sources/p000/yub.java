package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.AbstractC0985a;

/* JADX INFO: loaded from: classes2.dex */
public final class yub implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70523a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f70524b;

    public /* synthetic */ yub(Object obj, int i) {
        this.f70523a = i;
        this.f70524b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        unb mnbVar;
        switch (this.f70523a) {
            case 0:
                AbstractC0985a.m5507h("BillingClientTesting", "Billing Override Service connected.");
                hvb hvbVar = (hvb) this.f70524b;
                int i = rnb.f59598g;
                if (iBinder == null) {
                    mnbVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    mnbVar = iInterfaceQueryLocalInterface instanceof unb ? (unb) iInterfaceQueryLocalInterface : new mnb(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 4);
                }
                hvbVar.f43016E = mnbVar;
                hvbVar.f43015D = 2;
                hvbVar.m13511I(26);
                break;
            default:
                ajd ajdVar = (ajd) this.f70524b;
                ajdVar.f736b.m12786b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                ajdVar.m507a().post(new b4c(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f70523a) {
            case 0:
                AbstractC0985a.m5508i("BillingClientTesting", "Billing Override Service disconnected.");
                hvb hvbVar = (hvb) this.f70524b;
                hvbVar.f43016E = null;
                hvbVar.f43015D = 0;
                break;
            default:
                ajd ajdVar = (ajd) this.f70524b;
                ajdVar.f736b.m12786b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                ajdVar.m507a().post(new k3d(this, 1));
                break;
        }
    }
}
