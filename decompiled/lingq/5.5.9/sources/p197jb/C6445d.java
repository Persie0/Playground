package p197jb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import p152hb.InterfaceC5957c;
import p152hb.InterfaceC5980j;
import p176ib.AbstractC6257c;
import p176ib.C6254b;
import p176ib.C6276k;
import p412ub.C9515d;

/* JADX INFO: renamed from: jb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6445d extends AbstractC6257c<C6442a> {

    /* JADX INFO: renamed from: b0 */
    public final C6276k f36993b0;

    public C6445d(Context context, Looper looper, C6254b c6254b, C6276k c6276k, InterfaceC5957c interfaceC5957c, InterfaceC5980j interfaceC5980j) {
        super(context, looper, 270, c6254b, interfaceC5957c, interfaceC5980j);
        this.f36993b0 = c6276k;
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: A */
    public final Bundle mo11557A() {
        C6276k c6276k = this.f36993b0;
        c6276k.getClass();
        Bundle bundle = new Bundle();
        String str = c6276k.f36472a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: D */
    public final String mo5606D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: E */
    public final String mo5607E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: F */
    public final boolean mo12872F() {
        return true;
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: m */
    public final int mo5608m() {
        return 203400000;
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ IInterface mo5609w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C6442a ? (C6442a) iInterfaceQueryLocalInterface : new C6442a(iBinder);
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: y */
    public final Feature[] mo12890y() {
        return C9515d.f49020b;
    }
}
