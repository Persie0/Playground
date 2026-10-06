package p000;

import com.google.googlex.gcam.BurstSpec;
import java.util.HashMap;
import java.util.Iterator;
import p021j$.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class gnx implements ech, ecy, edi {

    /* JADX INFO: renamed from: a */
    public final bko f25818a;

    /* JADX INFO: renamed from: b */
    private final HashMap f25819b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final kbz f25820c;

    /* JADX INFO: renamed from: d */
    private final gva f25821d;

    public gnx(gva gvaVar, bko bkoVar, kbz kbzVar, byte[] bArr, byte[] bArr2) {
        this.f25821d = gvaVar;
        this.f25818a = bkoVar;
        this.f25820c = kbzVar;
    }

    @Override // p000.ecy
    /* JADX INFO: renamed from: a */
    public final void mo7052a(eem eemVar, int i, long j, kpp kppVar) {
        HashMap map;
        kpw kpwVar;
        new HashMap();
        synchronized (this) {
            if (!this.f25819b.containsKey(eemVar)) {
                throw new IllegalStateException("Shot hasn't been started yet!");
            }
            map = (HashMap) this.f25819b.remove(eemVar);
        }
        this.f25820c.mo13961e("onBaseFrameSelected#getCandidate");
        if (map != null) {
            Long lValueOf = Long.valueOf(j);
            if (map.containsKey(lValueOf) && (kpwVar = (kpw) map.remove(lValueOf)) != null) {
                this.f25820c.mo13963g("processBaseFrameImage");
                mo9569k(eemVar, kpwVar);
            }
        }
        this.f25820c.mo13963g("clear");
        if (map != null) {
            Map.EL.forEach(map, gnv.f25810c);
            map.clear();
        }
        this.f25820c.mo13962f();
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo7057b(eem eemVar, hkc hkcVar, ebp ebpVar) {
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: c */
    public final void mo7058c(eem eemVar, edc edcVar) {
        mo9568j(eemVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [gyh, java.lang.Object] */
    @Override // p000.ech
    /* JADX INFO: renamed from: d */
    public final synchronized void mo7111d(gyu gyuVar) {
        eem eemVar;
        Iterator it = this.f25819b.keySet().iterator();
        do {
            if (!it.hasNext()) {
                eemVar = null;
                break;
            }
            eemVar = (eem) it.next();
        } while (!eemVar.f13675v.f25502c.mo9902h().equals(gyuVar));
        if (eemVar != null) {
            mo9568j(eemVar);
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: e */
    public final synchronized void mo7112e(eem eemVar, key keyVar) {
        if (this.f25819b.containsKey(eemVar)) {
            kpw kpwVarM9498g = this.f25821d.m9784a(keyVar).m9498g();
            kfd kfdVarMo7041b = keyVar.mo7041b();
            if (kfdVarMo7041b != null) {
                ((HashMap) this.f25819b.get(eemVar)).put(Long.valueOf(kfdVarMo7041b.f35811b), kpwVarM9498g);
            }
        }
        keyVar.close();
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: f */
    public final synchronized void mo7113f(eem eemVar, BurstSpec burstSpec, kpp kppVar) {
        this.f25819b.put(eemVar, new HashMap());
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: g */
    public void mo7114g(gyu gyuVar) {
        throw null;
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: h */
    public final void mo7115h(eem eemVar) {
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo7116i(eem eemVar) {
    }

    /* JADX INFO: renamed from: j */
    protected synchronized void mo9568j(eem eemVar) {
        HashMap map = (HashMap) this.f25819b.remove(eemVar);
        if (map != null) {
            Map.EL.forEach(map, gnv.f25808a);
            map.clear();
        }
    }

    /* JADX INFO: renamed from: k */
    protected abstract void mo9569k(eem eemVar, kpw kpwVar);

    @Override // p000.edi
    /* JADX INFO: renamed from: p */
    public final synchronized void mo7059p(eem eemVar) {
        mo9568j(eemVar);
    }
}
