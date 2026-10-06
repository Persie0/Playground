package p000;

import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Log;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kkg implements kkb {

    /* JADX INFO: renamed from: a */
    private final kpi f36348a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f36349b;

    public kkg(klj kljVar, int i) {
        this.f36349b = i;
        this.f36348a = kljVar;
    }

    public kkg(kpi kpiVar, int i) {
        this.f36349b = i;
        this.f36348a = kpiVar;
    }

    /* JADX INFO: renamed from: g */
    private final int m14417g(List list, kpg kpgVar, Handler handler, boolean z) {
        mwn mwnVar = new mwn();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mwnVar.m17083h(m14418h((kpk) it.next(), z));
        }
        return ((kli) this.f36348a).mo14484b(mwnVar.m17081f(), kpgVar, handler);
    }

    /* JADX INFO: renamed from: h */
    private final List m14418h(kpk kpkVar, boolean z) throws kpf {
        try {
            List<CaptureRequest> listCreateHighSpeedRequestList = ((klj) this.f36348a).f36475b.createHighSpeedRequestList((CaptureRequest) kua.m14869h(kpkVar));
            ArrayList arrayList = new ArrayList(listCreateHighSpeedRequestList.size());
            for (int i = 0; i < listCreateHighSpeedRequestList.size(); i++) {
                arrayList.add(new klm(listCreateHighSpeedRequestList.get(i)));
            }
            if (z || arrayList.size() == 1) {
                return arrayList;
            }
            lku.m15616K(!arrayList.isEmpty(), "No requests returned from createHighSpeedRequestList for %s!", this.f36348a);
            ((kpk) arrayList.get(0)).getClass();
            return mws.m17097l((kpk) arrayList.get(0));
        } catch (IllegalArgumentException | IllegalStateException e) {
            if (e instanceof IllegalArgumentException) {
                Log.w("HFRCaptureSession", EArqVBjecl.wmfFlS);
            }
            throw new kpf(e);
        }
    }

    @Override // p000.kkb
    /* JADX INFO: renamed from: a */
    public final int mo14408a(kpk kpkVar, kpg kpgVar, Handler handler, boolean z) {
        switch (this.f36349b) {
            case 0:
                return this.f36348a.mo14483a(kpkVar, kpgVar, handler);
            default:
                return m14417g(mws.m17097l(kpkVar), kpgVar, handler, z);
        }
    }

    @Override // p000.kkb
    /* JADX INFO: renamed from: b */
    public final int mo14409b(List list, kpg kpgVar, Handler handler, boolean z) {
        switch (this.f36349b) {
            case 0:
                return this.f36348a.mo14484b(list, kpgVar, handler);
            default:
                return m14417g(list, kpgVar, handler, z);
        }
    }

    @Override // p000.kkb
    /* JADX INFO: renamed from: c */
    public final int mo14410c(kpk kpkVar, kpg kpgVar, Handler handler, boolean z) throws kpf {
        switch (this.f36349b) {
            case 0:
                return this.f36348a.mo14485c(kpkVar, kpgVar, handler);
            default:
                try {
                    return ((kli) this.f36348a).f36474a.setRepeatingBurst(kua.m14870i(m14418h(kpkVar, z)), new klh(kpgVar), handler);
                } catch (IllegalStateException | SecurityException e) {
                    throw new kpf(e);
                }
        }
    }

    @Override // p000.kkb
    /* JADX INFO: renamed from: d */
    public final void mo14411d() throws kpf {
        switch (this.f36349b) {
            case 0:
                this.f36348a.mo14487e();
                break;
            default:
                ((kli) this.f36348a).mo14487e();
                break;
        }
    }

    @Override // p000.kkb
    /* JADX INFO: renamed from: e */
    public final void mo14412e() throws kpf {
        switch (this.f36349b) {
            case 0:
                this.f36348a.mo14490h();
                break;
            default:
                ((kli) this.f36348a).mo14490h();
                break;
        }
    }

    @Override // p000.kkb
    /* JADX INFO: renamed from: f */
    public final kln mo14413f(kiz kizVar) {
        switch (this.f36349b) {
            case 0:
                return this.f36348a.mo14486d().mo14498h(kizVar.f36226a);
            default:
                return ((kli) this.f36348a).mo14486d().mo14498h(kizVar.f36226a);
        }
    }
}
