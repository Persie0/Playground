package p000;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.dynamite.p017ho.DNTdN;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jhl implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f34082a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f34083b;

    public jhl(byn bynVar, int i) {
        this.f34083b = i;
        this.f34082a = bynVar;
    }

    public jhl(jhj jhjVar, int i) {
        this.f34083b = i;
        this.f34082a = jhjVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f34083b) {
            case 0:
                switch (message.what) {
                    case 0:
                        synchronized (((jhj) this.f34082a).f34068c) {
                            jhi jhiVar = (jhi) message.obj;
                            jhk jhkVar = (jhk) ((jhj) this.f34082a).f34068c.get(jhiVar);
                            if (jhkVar != null && jhkVar.m13184b()) {
                                if (jhkVar.f34077c) {
                                    jhkVar.f34081g.f34070e.removeMessages(1, jhkVar.f34079e);
                                    jhj jhjVar = jhkVar.f34081g;
                                    jhjVar.f34071f.m13231b(jhjVar.f34069d, jhkVar);
                                    jhkVar.f34077c = false;
                                    jhkVar.f34076b = 2;
                                }
                                ((jhj) this.f34082a).f34068c.remove(jhiVar);
                            }
                            break;
                        }
                        return true;
                    case 1:
                        synchronized (((jhj) this.f34082a).f34068c) {
                            jhi jhiVar2 = (jhi) message.obj;
                            jhk jhkVar2 = (jhk) ((jhj) this.f34082a).f34068c.get(jhiVar2);
                            if (jhkVar2 != null && jhkVar2.f34076b == 3) {
                                Log.e("GmsClientSupervisor", DNTdN.vDEAAYwxkh + String.valueOf(jhiVar2), new Exception());
                                ComponentName componentName = jhkVar2.f34080f;
                                if (componentName == null) {
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    componentName = new ComponentName(jhiVar2.f34061c, "unknown");
                                }
                                jhkVar2.onServiceDisconnected(componentName);
                            }
                            break;
                        }
                        return true;
                    default:
                        return false;
                }
            default:
                if (message.what == 1) {
                    ((byn) this.f34082a).m3195c((byl) message.obj);
                    return true;
                }
                if (message.what != 2) {
                    return false;
                }
                ((byn) this.f34082a).f4761c.m2866f((byl) message.obj);
                return false;
        }
    }
}
