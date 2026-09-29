package p000;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k1d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46562a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzr f46563b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v4d f46564c;

    public k1d(v4d v4dVar, zzr zzrVar, int i) {
        this.f46562a = i;
        switch (i) {
            case 1:
                this.f46563b = zzrVar;
                Objects.requireNonNull(v4dVar);
                this.f46564c = v4dVar;
                break;
            default:
                this.f46563b = zzrVar;
                this.f46564c = v4dVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f46562a;
        zzr zzrVar = this.f46563b;
        v4d v4dVar = this.f46564c;
        switch (i) {
            case 0:
                q9c q9cVar = v4dVar.f64866d;
                kjc kjcVar = (kjc) v4dVar.f60774a;
                if (q9cVar != null) {
                    try {
                        q9cVar.mo11294i(zzrVar);
                    } catch (RemoteException e) {
                        xcc xccVar = kjcVar.f47438f;
                        kjc.m15280l(xccVar);
                        xccVar.f68080f.m17924b(e, "Failed to reset data on the service: remote exception");
                    }
                    v4dVar.m23116Q();
                } else {
                    xcc xccVar2 = kjcVar.f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68080f.m17923a("Failed to reset data on the service: not connected to service");
                }
                break;
            default:
                q9c q9cVar2 = v4dVar.f64866d;
                kjc kjcVar2 = (kjc) v4dVar.f60774a;
                if (q9cVar2 == null) {
                    xcc xccVar3 = kjcVar2.f47438f;
                    kjc.m15280l(xccVar3);
                    xccVar3.f68080f.m17923a("Failed to send consent settings to service");
                } else {
                    try {
                        q9cVar2.mo11286D(zzrVar);
                        v4dVar.m23116Q();
                    } catch (RemoteException e2) {
                        xcc xccVar4 = kjcVar2.f47438f;
                        kjc.m15280l(xccVar4);
                        xccVar4.f68080f.m17924b(e2, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }
}
