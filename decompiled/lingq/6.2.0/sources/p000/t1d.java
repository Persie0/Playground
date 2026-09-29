package p000;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: classes.dex */
public final class t1d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61757a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzr f61758b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v4d f61759c;

    public /* synthetic */ t1d(v4d v4dVar, zzr zzrVar, int i) {
        this.f61757a = i;
        this.f61758b = zzrVar;
        this.f61759c = v4dVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f61757a;
        zzr zzrVar = this.f61758b;
        v4d v4dVar = this.f61759c;
        switch (i) {
            case 0:
                q9c q9cVar = v4dVar.f64866d;
                kjc kjcVar = (kjc) v4dVar.f60774a;
                if (q9cVar == null) {
                    xcc xccVar = kjcVar.f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68080f.m17923a("Discarding data. Failed to send app launch");
                } else {
                    try {
                        cmb cmbVar = kjcVar.f47436d;
                        t8c t8cVar = z8c.f71146W0;
                        if (cmbVar.m4869O(null, t8cVar)) {
                            v4dVar.m23121V(q9cVar, null, zzrVar);
                        }
                        q9cVar.mo11306v(zzrVar);
                        kjcVar.m15286n().m14376I();
                        kjcVar.f47436d.m4869O(null, t8cVar);
                        v4dVar.m23121V(q9cVar, null, zzrVar);
                        v4dVar.m23116Q();
                    } catch (RemoteException e) {
                        xcc xccVar2 = kjcVar.f47438f;
                        kjc.m15280l(xccVar2);
                        xccVar2.f68080f.m17924b(e, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            default:
                q9c q9cVar2 = v4dVar.f64866d;
                kjc kjcVar2 = (kjc) v4dVar.f60774a;
                if (q9cVar2 == null) {
                    xcc xccVar3 = kjcVar2.f47438f;
                    kjc.m15280l(xccVar3);
                    xccVar3.f68083i.m17923a("Failed to send app backgrounded");
                } else {
                    try {
                        q9cVar2.mo11307x(zzrVar);
                        v4dVar.m23116Q();
                    } catch (RemoteException e2) {
                        xcc xccVar4 = kjcVar2.f47438f;
                        kjc.m15280l(xccVar4);
                        xccVar4.f68080f.m17924b(e2, "Failed to send app backgrounded to the service");
                    }
                }
                break;
        }
    }
}
