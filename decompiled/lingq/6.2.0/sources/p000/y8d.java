package p000;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class y8d implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ obd f69488a;

    public /* synthetic */ y8d(obd obdVar) {
        this.f69488a = obdVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            obd obdVar = this.f69488a;
            synchronized (obdVar.f54150a) {
                try {
                    n3d n3dVar = (n3d) message.obj;
                    k6d k6dVar = (k6d) obdVar.f54150a.get(n3dVar);
                    if (k6dVar != null && k6dVar.m14926g()) {
                        if (k6dVar.m14923d()) {
                            k6dVar.m14920a();
                        }
                        obdVar.f54150a.remove(n3dVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        obd obdVar2 = this.f69488a;
        synchronized (obdVar2.f54150a) {
            try {
                n3d n3dVar2 = (n3d) message.obj;
                k6d k6dVar2 = (k6d) obdVar2.f54150a.get(n3dVar2);
                if (k6dVar2 != null && k6dVar2.m14924e() == 3) {
                    String strValueOf = String.valueOf(n3dVar2);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentNameM14928i = k6dVar2.m14928i();
                    if (componentNameM14928i == null) {
                        n3dVar2.getClass();
                        componentNameM14928i = null;
                    }
                    if (componentNameM14928i == null) {
                        String strM17205a = n3dVar2.m17205a();
                        lda.m16130p(strM17205a);
                        componentNameM14928i = new ComponentName(strM17205a, "unknown");
                    }
                    k6dVar2.onServiceDisconnected(componentNameM14928i);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
