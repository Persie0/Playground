package p000;

import com.google.googlex.gcam.BurstSpec;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gky implements gbi {

    /* JADX INFO: renamed from: a */
    public static final nbh f25408a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/commands/PckZslTorchHdrPlusImageCaptureCommand");

    /* JADX INFO: renamed from: b */
    public final int f25409b;

    /* JADX INFO: renamed from: c */
    public final Object f25410c = new Object();

    /* JADX INFO: renamed from: d */
    public gkx f25411d;

    /* JADX INFO: renamed from: e */
    public kfc f25412e;

    /* JADX INFO: renamed from: f */
    public gau f25413f;

    /* JADX INFO: renamed from: g */
    private final kfk f25414g;

    /* JADX INFO: renamed from: h */
    private final gof f25415h;

    /* JADX INFO: renamed from: i */
    private final gks f25416i;

    /* JADX INFO: renamed from: j */
    private final kbz f25417j;

    /* JADX INFO: renamed from: k */
    private final ghg f25418k;

    /* JADX INFO: renamed from: l */
    private final gib f25419l;

    /* JADX INFO: renamed from: m */
    private final edm f25420m;

    /* JADX INFO: renamed from: n */
    private final mrm f25421n;

    /* JADX INFO: renamed from: o */
    private final dhv f25422o;

    /* JADX INFO: renamed from: p */
    private final gir f25423p;

    /* JADX INFO: renamed from: q */
    private final ecq f25424q;

    /* JADX INFO: renamed from: r */
    private final jvb f25425r;

    /* JADX INFO: renamed from: s */
    private final jwn f25426s;

    /* JADX INFO: renamed from: t */
    private final gbi f25427t;

    /* JADX INFO: renamed from: u */
    private final boolean f25428u;

    /* JADX INFO: renamed from: v */
    private final jwn f25429v;

    /* JADX INFO: renamed from: w */
    private final gva f25430w;

    /* JADX INFO: renamed from: x */
    private final gkz f25431x;

    public gky(kfk kfkVar, gof gofVar, kbz kbzVar, gks gksVar, ghg ghgVar, edm edmVar, mrm mrmVar, gkz gkzVar, gva gvaVar, dhv dhvVar, gir girVar, ecq ecqVar, jvb jvbVar, jwn jwnVar, jwn jwnVar2, gib gibVar, int i, gbi gbiVar, byte[] bArr, byte[] bArr2) {
        this.f25414g = kfkVar;
        this.f25415h = gofVar;
        this.f25417j = kbzVar;
        this.f25416i = gksVar;
        this.f25418k = ghgVar;
        this.f25409b = i;
        this.f25412e = gofVar.mo9308f();
        this.f25420m = edmVar;
        this.f25421n = mrmVar;
        this.f25431x = gkzVar;
        this.f25430w = gvaVar;
        this.f25422o = dhvVar;
        this.f25423p = girVar;
        this.f25424q = ecqVar;
        this.f25425r = jvbVar;
        this.f25426s = jwnVar;
        this.f25419l = gibVar;
        this.f25427t = gbiVar;
        this.f25429v = jwnVar2;
        this.f25428u = kfkVar.mo14116c().mo14139d().mo14558k() == kmq.BACK;
    }

    /* JADX INFO: renamed from: d */
    private final List m9393d(eem eemVar, List list, ebn ebnVar, kho khoVar, kfo kfoVar) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            ((nbe) ((nbe) f25408a.m17252c()).mo17276G((char) 2909)).mo17290o("No ZSL frames found, requesting a single PSL frame.");
            try {
                kfj kfjVarMo14154c = kfoVar.mo14154c();
                kfjVarMo14154c.mo14110b(khoVar);
                arrayList.add(kfoVar.mo14157f(kfjVarMo14154c.mo14109a()));
            } catch (kec e) {
                ((nbe) ((nbe) ((nbe) f25408a.m17252c()).mo17283h(e)).mo17276G((char) 2910)).mo17290o("Couldn't acquire session for PSL request");
            }
        } else if (this.f25421n.mo16813g() && eemVar != null) {
            key keyVar = (key) list.get(0);
            kfv.m14171t(keyVar);
            kpp kppVarMo7042c = keyVar.mo7042c() != null ? keyVar.mo7042c() : this.f25420m.f13500a;
            if (kppVarMo7042c != null) {
                BurstSpec burstSpecM9361b = ((gkf) this.f25421n.mo16809c()).m9361b(eemVar, kppVarMo7042c, this.f25430w.m9784a(keyVar), ebnVar);
                if (burstSpecM9361b != null && !burstSpecM9361b.m4911b().m4970d()) {
                    return (List) ((gkf) this.f25421n.mo16809c()).m9360a(eemVar, kppVarMo7042c, khoVar, kfoVar, burstSpecM9361b).second;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    private static final void m9394e(key keyVar, jwn jwnVar) {
        keyVar.mo7041b();
        keyVar.mo7049j();
        kpp kppVarMo7042c = keyVar.mo7042c();
        if (kppVarMo7042c != null) {
        }
    }

    /* JADX INFO: renamed from: f */
    private static final void m9395f(gbi gbiVar, gbh gbhVar, glk glkVar) {
        ((nbe) ((nbe) f25408a.m17252c()).mo17276G((char) 2919)).mo17290o("Executing fallback");
        gbiVar.mo7628c(gbhVar, glkVar);
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        return this.f25426s;
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        return jwr.m13637g(fxo.m8931e());
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x04d2 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17751. Try increasing type updates limit count.
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
    public final void mo7628c(p000.gbh r27, p000.glk r28) {
        /*
            Method dump skipped, instruction units count: 1775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gky.mo7628c(gbh, glk):void");
    }
}
