package p000;

import java.io.File;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gxc implements gxa {

    /* JADX INFO: renamed from: a */
    public static final nbh f26709a = nbh.m17259h("com/google/android/apps/camera/session/CaptureSessionManagerImpl");

    /* JADX INFO: renamed from: b */
    private final Map f26710b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    private final jvd f26711c;

    /* JADX INFO: renamed from: d */
    private final oju f26712d;

    /* JADX INFO: renamed from: e */
    private final gyg f26713e;

    /* JADX INFO: renamed from: f */
    private final jfs f26714f;

    public gxc(gyg gygVar, jvd jvdVar, jfs jfsVar, oju ojuVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f26713e = gygVar;
        this.f26711c = jvdVar;
        this.f26714f = jfsVar;
        this.f26712d = ojuVar;
    }

    @Override // p000.gxa
    /* JADX INFO: renamed from: a */
    public final gyh mo9921a(gyu gyuVar) {
        gyh gyhVar;
        synchronized (this.f26710b) {
            gyhVar = (gyh) this.f26710b.get(gyuVar);
        }
        return gyhVar;
    }

    @Override // p000.gxa
    /* JADX INFO: renamed from: b */
    public final nps mo9922b(gyi gyiVar) {
        nps npsVar;
        synchronized (this.f26710b) {
            Collection<gyh> collectionValues = this.f26710b.values();
            int size = collectionValues.size();
            cjc cjcVar = size > 0 ? new cjc(size) : null;
            for (gyh gyhVar : collectionValues) {
                kxk.m14975U(gyhVar.mo9911q(), new gxb(gyhVar, gyiVar, cjcVar, 0), this.f26711c);
            }
            npsVar = cjcVar == null ? npp.f44031a : cjcVar.f5916a;
        }
        return npsVar;
    }

    @Override // p000.gxa
    /* JADX INFO: renamed from: c */
    public final File mo9923c(String str) {
        return this.f26713e.m9975a(str);
    }

    @Override // p000.gxa
    /* JADX INFO: renamed from: d */
    public final void mo9924d(gyu gyuVar) {
        gyh gyhVar;
        synchronized (this.f26710b) {
            synchronized (this.f26710b) {
                gyhVar = (gyh) this.f26710b.remove(gyuVar);
            }
        }
        if (gyhVar != null) {
            gyhVar.mo9920z();
        } else {
            ((nbe) ((nbe) f26709a.m17252c()).mo17276G((char) 3333)).mo17290o("Session was already removed, cannot be finalized");
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, oju] */
    @Override // p000.gxa
    /* JADX INFO: renamed from: e */
    public final void mo9925e(gyh gyhVar) {
        jfs jfsVar = this.f26714f;
        gyu gyuVarMo9902h = gyhVar.mo9902h();
        ihk ihkVar = (ihk) jfsVar.f33914a;
        fcp fcpVar = (fcp) ihkVar.f30967b.get();
        Object obj = ihkVar.f30966a;
        hkb hkbVar = new hkb(fcpVar, gyuVarMo9902h);
        hjy hjyVarMo9905k = gyhVar.mo9905k();
        hjyVarMo9905k.getClass();
        ((hjz) hjyVarMo9905k).f28084j = hkbVar;
        gyhVar.mo9915u(hkbVar);
        gyhVar.mo9915u(((dmp) this.f26712d).get());
        synchronized (this.f26710b) {
            this.f26710b.put(gyhVar.mo9902h(), gyhVar);
        }
    }
}
