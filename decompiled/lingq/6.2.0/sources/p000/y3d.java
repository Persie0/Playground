package p000;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y3d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69261a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v4d f69262b;

    public /* synthetic */ y3d(v4d v4dVar, int i) {
        this.f69261a = i;
        this.f69262b = v4dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f69261a;
        v4d v4dVar = this.f69262b;
        switch (i) {
            case 0:
                v4dVar.m23109J();
                break;
            case 1:
                kjc kjcVar = (kjc) v4dVar.f60774a;
                q9c q9cVar = v4dVar.f64866d;
                if (q9cVar == null) {
                    xcc xccVar = kjcVar.f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68080f.m17923a("Failed to send Dma consent settings to service");
                } else {
                    try {
                        q9cVar.mo11301p(v4dVar.m23119T(false));
                        v4dVar.m23116Q();
                    } catch (RemoteException e) {
                        xcc xccVar2 = kjcVar.f47438f;
                        kjc.m15280l(xccVar2);
                        xccVar2.f68080f.m17924b(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                kjc kjcVar2 = (kjc) v4dVar.f60774a;
                q9c q9cVar2 = v4dVar.f64866d;
                if (q9cVar2 == null) {
                    xcc xccVar3 = kjcVar2.f47438f;
                    kjc.m15280l(xccVar3);
                    xccVar3.f68080f.m17923a("Failed to send storage consent settings to service");
                } else {
                    try {
                        q9cVar2.mo11299n(v4dVar.m23119T(false));
                        v4dVar.m23116Q();
                    } catch (RemoteException e2) {
                        xcc xccVar4 = kjcVar2.f47438f;
                        kjc.m15280l(xccVar4);
                        xccVar4.f68080f.m17924b(e2, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
