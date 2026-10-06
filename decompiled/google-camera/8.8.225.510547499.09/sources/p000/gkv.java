package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkv implements gbi {

    /* JADX INFO: renamed from: a */
    private static final nbh f25385a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/commands/PckZslShastaImageCaptureCommand");

    /* JADX INFO: renamed from: b */
    private final gbi f25386b;

    /* JADX INFO: renamed from: c */
    private final Set f25387c;

    /* JADX INFO: renamed from: d */
    private final gkf f25388d;

    /* JADX INFO: renamed from: e */
    private final ecq f25389e;

    /* JADX INFO: renamed from: f */
    private final eci f25390f;

    /* JADX INFO: renamed from: g */
    private final gks f25391g;

    /* JADX INFO: renamed from: h */
    private final kbz f25392h;

    /* JADX INFO: renamed from: i */
    private final gva f25393i;

    /* JADX INFO: renamed from: j */
    private final gkz f25394j;

    public gkv(Set set, gbi gbiVar, mrm mrmVar, ecq ecqVar, eci eciVar, gks gksVar, gkz gkzVar, gva gvaVar, kbz kbzVar, byte[] bArr, byte[] bArr2) {
        this.f25386b = gbiVar;
        this.f25387c = set;
        this.f25391g = gksVar;
        this.f25388d = (gkf) mrmVar.mo16809c();
        this.f25389e = ecqVar;
        this.f25390f = eciVar;
        this.f25394j = gkzVar;
        this.f25393i = gvaVar;
        this.f25392h = kbzVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [gav, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    private static final void m9389d(gbi gbiVar, List list, gbh gbhVar, glk glkVar) {
        ((nbe) ((nbe) f25385a.m17251b()).mo17276G((char) 2902)).mo17290o("Executing fallback");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((key) it.next()).close();
        }
        glkVar.f25502c.mo9905k().mo10404f();
        glkVar.f25501b.mo9015h();
        gbiVar.mo7628c(gbhVar, glkVar);
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        return this.f25386b.mo7626a();
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        return jwr.m13637g(fxo.m8929c(mkv.m16499G(this.f25387c)));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x06bf */
    /* JADX WARN: Not initialized variable reg: 32, insn: 0x0765: MOVE (r5 I:??[OBJECT, ARRAY]) = (r32 I:??[OBJECT, ARRAY]), block:B:348:0x0760 */
    /* JADX WARN: Not initialized variable reg: 32, insn: 0x076f: MOVE (r5 I:??[OBJECT, ARRAY]) = (r32 I:??[OBJECT, ARRAY]), block:B:350:0x076a */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 23361. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // p000.gbi
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo7628c(p000.gbh r34, p000.glk r35) {
        /*
            Method dump skipped, instruction units count: 2336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gkv.mo7628c(gbh, glk):void");
    }

    public final String toString() {
        mrl mrlVarM16765d = mpw.m16765d(this);
        mrlVarM16765d.m16823b("fallback", this.f25386b);
        return mrlVarM16765d.toString();
    }
}
