package p000;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kji extends kkf {

    /* JADX INFO: renamed from: e */
    private final kmd f36257e;

    /* JADX INFO: renamed from: f */
    private final Set f36258f;

    /* JADX INFO: renamed from: g */
    private final kgb f36259g;

    public kji(kmd kmdVar, kfn kfnVar, kkz kkzVar, kkk kkkVar, kbo kboVar, kbz kbzVar) {
        super(kmdVar.mo14547P(), kfnVar.f35838b, kkzVar, kkkVar, kboVar, kbzVar);
        this.f36257e = kmdVar;
        this.f36258f = kfnVar.f35844h;
        this.f36259g = kfnVar.f35839c;
    }

    /* JADX INFO: renamed from: c */
    private static final void m14374c(kln klnVar, kfy kfyVar) {
        klnVar.m14503b(kfyVar.f35858a, kfyVar.f35859b);
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
            juy juyVar = new juy(handler);
            kln klnVarMo14498h = kpjVar.mo14498h(this.f36259g.f35863a);
            Set setM14216f = kgq.m14216f(this.f36257e.mo14532A());
            mws mwsVar = this.f36259g.f35864b;
            int size = mwsVar.size();
            for (int i = 0; i < size; i++) {
                kfy kfyVar = (kfy) mwsVar.get(i);
                if (setM14216f.contains(kfyVar.m14177a())) {
                    m14374c(klnVarMo14498h, kfyVar);
                }
            }
            for (kfy kfyVar2 : this.f36258f) {
                if (setM14216f.contains(kfyVar2.m14177a())) {
                    m14374c(klnVarMo14498h, kfyVar2);
                }
            }
            kpk kpkVarM14502a = klnVarMo14498h.m14502a();
            int i2 = this.f36342a == kfx.HIGH_SPEED ? 1 : 0;
            if (kjoVar == null) {
                throw new NullPointerException("Null stateCallback");
            }
            kpjVar.mo14493c(new kps(i2, arrayList, juyVar, kjoVar, kpkVarM14502a));
        } catch (Throwable th) {
            this.f36343b.mo13948j("Unable to createCaptureSession for ".concat(String.valueOf(String.valueOf(kjoVar))), th);
            kjoVar.m14383b();
        }
    }
}
