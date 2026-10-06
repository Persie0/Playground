package p000;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbd implements gbi {

    /* JADX INFO: renamed from: a */
    public final Object f24086a;

    /* JADX INFO: renamed from: b */
    private final gbi f24087b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f24088c;

    public gbd(gbi gbiVar, jwl jwlVar, int i, byte[] bArr) {
        this.f24088c = i;
        this.f24087b = gbiVar;
        this.f24086a = jwlVar;
    }

    public gbd(gbi gbiVar, kbg kbgVar, int i) {
        this.f24088c = i;
        this.f24087b = gbiVar;
        this.f24086a = kbgVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kbg] */
    /* JADX INFO: renamed from: d */
    private final void m9021d(ftv ftvVar) {
        this.f24086a.mo3415bf(ftvVar);
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        switch (this.f24088c) {
            case 0:
                break;
        }
        return this.f24087b.mo7626a();
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        switch (this.f24088c) {
            case 0:
                break;
        }
        return this.f24087b.mo7627b();
    }

    public final String toString() {
        switch (this.f24088c) {
            case 0:
                mrl mrlVarM16765d = mpw.m16765d(this);
                mrlVarM16765d.m16823b("delegate", this.f24087b);
                return mrlVarM16765d.toString();
            default:
                mrl mrlVarM16765d2 = mpw.m16765d(this);
                mrlVarM16765d2.m16823b("delegate", this.f24087b);
                return mrlVarM16765d2.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kbz] */
    @Override // p000.gbi
    /* JADX INFO: renamed from: c */
    public final void mo7628c(gbh gbhVar, glk glkVar) throws kec {
        switch (this.f24088c) {
            case 0:
                try {
                    m9021d(ftv.RUNNING);
                    this.f24087b.mo7628c(gbhVar, glkVar);
                    return;
                } finally {
                    m9021d(ftv.IDLE);
                }
            default:
                ?? r0 = glkVar.f25502c;
                try {
                    Object obj = this.f24086a;
                    synchronized (obj) {
                        if (((jwl) obj).f34954a) {
                            throw new IllegalStateException("Attempting to add shot after pipeline was shutdown!");
                        }
                        if (((HashSet) ((jwl) obj).f34955b).isEmpty()) {
                            ((jwl) obj).f34957d.mo13961e("#notifyPipelineResumed");
                            Iterator it = ((jwl) obj).m13625a().iterator();
                            while (it.hasNext()) {
                                ((gyq) it.next()).mo9548c();
                            }
                            ((jwl) obj).f34957d.mo13962f();
                        }
                        ((HashSet) ((jwl) obj).f34955b).add(r0);
                    }
                    r0.mo9910p().mo2282d(new fro(this, (gyh) r0, 9, (byte[]) null), not.INSTANCE);
                    this.f24087b.mo7628c(gbhVar, glkVar);
                    return;
                } catch (IllegalStateException e) {
                    throw new kec("ShotPipeline not available", e);
                }
        }
    }
}
