package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wrc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67210a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f67211b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f67212c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f67213d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f67214e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f67215f;

    public wrc(v4d v4dVar, zzr zzrVar, boolean z, zzbf zzbfVar, Bundle bundle) {
        this.f67212c = zzrVar;
        this.f67211b = z;
        this.f67213d = zzbfVar;
        this.f67214e = bundle;
        Objects.requireNonNull(v4dVar);
        this.f67215f = v4dVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f67210a;
        Object obj = this.f67214e;
        Object obj2 = this.f67213d;
        Object obj3 = this.f67212c;
        Object obj4 = this.f67215f;
        switch (i) {
            case 0:
                v4d v4dVarM15287o = ((AppMeasurementDynamiteService) obj4).f12312f.m15287o();
                v4dVarM15287o.mo12359D();
                v4dVarM15287o.m13744E();
                v4dVarM15287o.m23117R(new p0d(v4dVarM15287o, (String) obj2, (String) obj, v4dVarM15287o.m23119T(false), this.f67211b, (oub) obj3));
                break;
            default:
                v4d v4dVar = (v4d) obj4;
                q9c q9cVar = v4dVar.f64866d;
                kjc kjcVar = (kjc) v4dVar.f60774a;
                if (q9cVar == null) {
                    xcc xccVar = kjcVar.f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68080f.m17923a("Failed to send default event parameters to service");
                } else {
                    zzr zzrVar = (zzr) obj3;
                    if (kjcVar.f47436d.m4869O(null, z8c.f71146W0)) {
                        v4dVar.m23121V(q9cVar, this.f67211b ? null : (zzbf) obj2, zzrVar);
                    } else {
                        try {
                            q9cVar.mo11305t((Bundle) obj, zzrVar);
                            v4dVar.m23116Q();
                        } catch (RemoteException e) {
                            xcc xccVar2 = kjcVar.f47438f;
                            kjc.m15280l(xccVar2);
                            xccVar2.f68080f.m17924b(e, "Failed to send default event parameters to service");
                        }
                    }
                }
                break;
        }
    }

    public wrc(AppMeasurementDynamiteService appMeasurementDynamiteService, oub oubVar, String str, String str2, boolean z) {
        this.f67212c = oubVar;
        this.f67213d = str;
        this.f67214e = str2;
        this.f67211b = z;
        this.f67215f = appMeasurementDynamiteService;
    }
}
