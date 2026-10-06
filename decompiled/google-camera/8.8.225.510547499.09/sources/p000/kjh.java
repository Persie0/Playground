package p000;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kjh extends kkf {
    public kjh(kmd kmdVar, kfn kfnVar, kkz kkzVar, kkk kkkVar, kbo kboVar, kbz kbzVar) {
        super(kmdVar.mo14547P(), kfnVar.f35838b, kkzVar, kkkVar, kboVar, kbzVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.kkf
    /* JADX INFO: renamed from: a */
    protected final void mo14372a(kpj kpjVar, kjo kjoVar, List list, Handler handler) {
        try {
            ArrayList arrayList = new ArrayList(((mzr) list).f41859c);
            nba it = ((mws) list).iterator();
            while (it.hasNext()) {
                kpr kprVarMo14393a = ((kjs) it.next()).mo14393a();
                kprVarMo14393a.getClass();
                arrayList.add(kprVarMo14393a);
            }
            kpjVar.mo14495e(arrayList, kjoVar, handler);
        } catch (Throwable th) {
            this.f36343b.mo13948j("Unable to createCaptureSession for ".concat(String.valueOf(String.valueOf(kjoVar))), th);
            kjoVar.m14383b();
        }
    }
}
