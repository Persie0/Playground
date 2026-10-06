package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gny extends gnx {

    /* JADX INFO: renamed from: b */
    public final gvw f25822b;

    /* JADX INFO: renamed from: c */
    public final kbz f25823c;

    /* JADX INFO: renamed from: d */
    public final inm f25824d;

    /* JADX INFO: renamed from: e */
    public final dhv f25825e;

    /* JADX INFO: renamed from: f */
    public final ohb f25826f;

    /* JADX INFO: renamed from: g */
    public final Map f25827g;

    /* JADX INFO: renamed from: h */
    public final jwn f25828h;

    /* JADX INFO: renamed from: i */
    public final fvu f25829i;

    /* JADX INFO: renamed from: j */
    private final Executor f25830j;

    /* JADX INFO: renamed from: k */
    private final gkz f25831k;

    public gny(gva gvaVar, bko bkoVar, gvw gvwVar, fvu fvuVar, Executor executor, kbz kbzVar, inm inmVar, dhv dhvVar, gkz gkzVar, ohb ohbVar, jwn jwnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(gvaVar, bkoVar, kbzVar, null, null);
        this.f25827g = new HashMap();
        this.f25829i = fvuVar;
        this.f25822b = gvwVar;
        this.f25830j = executor;
        this.f25823c = kbzVar;
        this.f25824d = inmVar;
        this.f25825e = dhvVar;
        this.f25831k = gkzVar;
        this.f25826f = ohbVar;
        this.f25828h = jwnVar;
    }

    @Override // p000.gnx, p000.ech
    /* JADX INFO: renamed from: g */
    public final void mo7114g(gyu gyuVar) {
        this.f25827g.put(gyuVar, this.f25831k.m9396a());
        een eenVarM2622p = this.f25818a.m2622p(gyuVar);
        eenVarM2622p.m7221a(new gnw(this, 0));
        eenVarM2622p.m7226f(this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [gyh, java.lang.Object] */
    @Override // p000.gnx
    /* JADX INFO: renamed from: j */
    protected final synchronized void mo9568j(eem eemVar) {
        this.f25827g.remove(eemVar.f13675v.f25502c.mo9902h());
        super.mo9568j(eemVar);
    }

    @Override // p000.gnx
    /* JADX INFO: renamed from: k */
    protected final void mo9569k(eem eemVar, kpw kpwVar) {
        if (eemVar.m7220c()) {
            kpwVar.close();
        } else {
            this.f25830j.execute(new ghc(this, kpwVar, eemVar, 6));
        }
    }
}
