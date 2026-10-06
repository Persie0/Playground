package p000;

import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gga extends get {

    /* JADX INFO: renamed from: a */
    private final jww f24636a;

    /* JADX INFO: renamed from: b */
    private final jwn f24637b;

    public gga(jww jwwVar, jwn jwnVar) {
        this.f24637b = jwnVar;
        this.f24636a = new geu(jwwVar, gzp.OFF, gzp.OFF, gfc.TIMER_ZERO_SECONDS, gzp.THREE, gfc.TIMER_THREE_SECONDS, gzp.TEN, gfc.TIMER_TEN_SECONDS, gzp.AUTO, gfc.TIMER_AUTO);
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: a */
    public final int mo5765a() {
        return C0100R.string.timer_options_desc;
    }

    @Override // p000.get
    /* JADX INFO: renamed from: b */
    protected final int mo5766b(gfc gfcVar) {
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 1:
                return C0100R.string.timer_off_desc;
            case 2:
                return C0100R.string.timer_3_seconds_option_desc;
            case 3:
                return C0100R.string.timer_10_seconds_option_desc;
            case 4:
                return C0100R.string.timer_auto_desc;
            default:
                return 0;
        }
    }

    @Override // p000.get
    /* JADX INFO: renamed from: d */
    public final int mo5768d(gfc gfcVar) {
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 1:
                return C0100R.drawable.quantum_gm_ic_timer_off_white_24;
            case 2:
                return C0100R.drawable.quantum_gm_ic_timer_3_alt_1_white_24;
            case 3:
                return C0100R.drawable.quantum_gm_ic_timer_10_alt_1_white_24;
            case 4:
                return C0100R.drawable.timer_option_auto_24px;
            default:
                return 0;
        }
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: e */
    public final int mo5769e() {
        return C0100R.string.timer_desc;
    }

    @Override // p000.get
    /* JADX INFO: renamed from: f */
    protected final int mo5770f(gfc gfcVar) {
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 1:
                return C0100R.string.timer_off;
            case 2:
                return C0100R.string.timer_3_seconds;
            case 3:
                return C0100R.string.timer_10_seconds;
            case 4:
                return C0100R.string.timer_auto;
            default:
                return 0;
        }
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: g */
    public final gev mo5771g() {
        return gev.TIMER;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: i */
    public final jww mo5773i() {
        return this.f24636a;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: j */
    public final mws mo5774j() {
        return ((Boolean) this.f24637b.mo3831be()).booleanValue() ? mws.m17100o(gfc.TIMER_ZERO_SECONDS, gfc.TIMER_AUTO, gfc.TIMER_THREE_SECONDS, gfc.TIMER_TEN_SECONDS) : mws.m17099n(gfc.TIMER_ZERO_SECONDS, gfc.TIMER_THREE_SECONDS, gfc.TIMER_TEN_SECONDS);
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: k */
    public final void mo5775k(gfa gfaVar) {
        ((geo) gfaVar).f24413q.m13537d(this.f24637b.mo3830a(new ecr(this, gfaVar, 17), not.INSTANCE));
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: n */
    public final boolean mo5778n(gfa gfaVar) {
        ikw ikwVarMo9115b = gfaVar.mo9115b();
        return ikw.PHOTO.equals(ikwVarMo9115b) || ikw.IMAGE_INTENT.equals(ikwVarMo9115b) || ikw.PORTRAIT.equals(ikwVarMo9115b) || ikw.LONG_EXPOSURE.equals(ikwVarMo9115b) || ikw.MOTION_BLUR.equals(ikwVarMo9115b);
    }
}
