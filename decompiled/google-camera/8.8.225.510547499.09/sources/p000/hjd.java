package p000;

import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hjd extends get {

    /* JADX INFO: renamed from: a */
    public final gev f28008a;

    /* JADX INFO: renamed from: b */
    public final hiz f28009b;

    /* JADX INFO: renamed from: c */
    public final hah f28010c;

    /* JADX INFO: renamed from: d */
    private final boolean f28011d;

    /* JADX INFO: renamed from: e */
    private final boolean f28012e;

    /* JADX INFO: renamed from: f */
    private final jww f28013f;

    /* JADX INFO: renamed from: g */
    private final har f28014g;

    /* JADX INFO: renamed from: h */
    private final dal f28015h;

    /* JADX INFO: renamed from: i */
    private final Executor f28016i;

    /* JADX INFO: renamed from: j */
    private final AtomicBoolean f28017j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    private final ihk f28018k;

    public hjd(hiz hizVar, boolean z, boolean z2, hak hakVar, gzo gzoVar, hah hahVar, har harVar, dal dalVar, Executor executor, ihk ihkVar, byte[] bArr, byte[] bArr2) {
        this.f28009b = hizVar;
        this.f28011d = z;
        this.f28012e = z2;
        this.f28010c = hahVar;
        this.f28014g = harVar;
        this.f28015h = dalVar;
        this.f28016i = executor;
        this.f28018k = ihkVar;
        this.f28008a = z2 ? gev.COCKTAIL_PARTY_BACK : gev.COCKTAIL_PARTY_FRONT;
        this.f28013f = new geu(hakVar, gzoVar, gzo.ON, gfc.COCKTAIL_PARTY_ON, gzo.OFF, gfc.COCKTAIL_PARTY_OFF);
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: a */
    public final int mo5765a() {
        return C0100R.string.speech_enhance_content_desc;
    }

    @Override // p000.get
    /* JADX INFO: renamed from: b */
    protected final int mo5766b(gfc gfcVar) {
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 50:
                return C0100R.string.speech_enhance_on_desc;
            case 51:
                return C0100R.string.speech_enhance_off_desc;
            default:
                return 0;
        }
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: c */
    public final int mo5767c() {
        return C0100R.string.speech_enhancement_options_menu_disabled_reason;
    }

    @Override // p000.get
    /* JADX INFO: renamed from: d */
    public final int mo5768d(gfc gfcVar) {
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 50:
                return C0100R.drawable.gm_filled_record_voice_over_white_24;
            case 51:
                return C0100R.drawable.gm_filled_voice_over_off_white_24;
            default:
                return 0;
        }
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: e */
    public final int mo5769e() {
        return C0100R.string.speech_enhance_label;
    }

    @Override // p000.get
    /* JADX INFO: renamed from: f */
    protected final int mo5770f(gfc gfcVar) {
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 50:
                return C0100R.string.speech_enhance_on;
            case 51:
                return C0100R.string.speech_enhance_off;
            default:
                return 0;
        }
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: g */
    public final gev mo5771g() {
        return this.f28008a;
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: h */
    public final gff mo5772h() {
        return new dqc(this, 4);
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: i */
    public final jww mo5773i() {
        return this.f28013f;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: j */
    public final mws mo5774j() {
        return mws.m17098m(gfc.COCKTAIL_PARTY_OFF, gfc.COCKTAIL_PARTY_ON);
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: k */
    public final void mo5775k(gfa gfaVar) {
        jvb jvbVar = ((geo) gfaVar).f24413q;
        jvbVar.m13537d(this.f28014g.mo3830a(new gmb(this, gfaVar, 5), not.INSTANCE));
        jvbVar.m13537d(this.f28015h.f10270a.mo3830a(new gmb(this, gfaVar, 6), not.INSTANCE));
        jvbVar.m13537d(this.f28015h.f10271b.mo3830a(new gmb(this, gfaVar, 7), not.INSTANCE));
        jvbVar.m13537d(jwj.m13624c(this.f28015h.f10272c).mo3830a(new gmb(this, gfaVar, 8), not.INSTANCE));
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: l */
    public final boolean mo5776l() {
        return true;
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: m */
    public final boolean mo5777m(gfa gfaVar) {
        jxp jxpVar;
        jxn jxnVar;
        boolean z = !((Boolean) ((jwf) this.f28015h.f10272c).f34942d).booleanValue();
        gzr gzrVar = z ? gzr.RES_1080P : (gzr) this.f28014g.mo3831be();
        gfc gfcVar = z ? gfc.FPS_30 : (gfc) ((jwf) this.f28015h.f10270a).f34942d;
        ihk ihkVar = this.f28018k;
        kmq kmqVar = gfaVar.mo9107F() ? kmq.f36557a : kmq.BACK;
        gfc gfcVar2 = gfc.UNKNOWN;
        gzr gzrVar2 = gzr.RES_1080P;
        switch (gzrVar) {
            case RES_1080P:
                jxpVar = jxp.RES_1080P;
                break;
            case RES_2160P:
                jxpVar = jxp.RES_2160P;
                break;
            default:
                throw new IllegalArgumentException("Unknown video resolution option");
        }
        switch (gfcVar.ordinal()) {
            case 26:
                jxnVar = jxn.FPS_AUTO;
                break;
            case 27:
                jxnVar = jxn.f35050b;
                break;
            case 28:
                jxnVar = jxn.FPS_30;
                break;
            case 29:
                jxnVar = jxn.FPS_60;
                break;
            default:
                throw new IllegalArgumentException("Unsupported menu option");
        }
        return ihkVar.m11347o(kmqVar, jxpVar, jxnVar);
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: n */
    public final boolean mo5778n(gfa gfaVar) {
        boolean z = this.f28011d && ikw.VIDEO.equals(gfaVar.mo9115b()) && (gew.m9150a(gfaVar) ^ this.f28012e) && !((Boolean) ((jwf) this.f28015h.f10271b).f34942d).booleanValue();
        if (!z || !this.f28017j.compareAndSet(false, true) || ((Boolean) this.f28010c.mo10031c(gzy.f26996H)).booleanValue()) {
            return z;
        }
        ((geo) gfaVar).f24413q.m13537d(this.f28013f.mo3830a(new gmb(this, (gfc) this.f28013f.mo3831be(), 9), this.f28016i));
        return true;
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: z */
    public final void mo5840z(gfa gfaVar, boolean z) {
        boolean z2 = false;
        if (z && gfc.COCKTAIL_PARTY_ON.equals(this.f28013f.mo3831be())) {
            z2 = true;
        }
        gfaVar.mo9135v(z2, C0100R.drawable.gm_filled_record_voice_over_white_24, C0100R.string.speech_enhance_on_desc, true != this.f28012e ? "SpeechEnhanceFront" : "SpeechEnhanceBack");
    }
}
