package p000;

import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class czz extends get {

    /* JADX INFO: renamed from: a */
    public final czy f10196a;

    /* JADX INFO: renamed from: b */
    private final jww f10197b;

    /* JADX INFO: renamed from: c */
    private final boolean f10198c;

    /* JADX INFO: renamed from: d */
    private final dal f10199d;

    /* JADX INFO: renamed from: e */
    private final kpb f10200e;

    public czz(hai haiVar, dhv dhvVar, dal dalVar, czy czyVar, kpb kpbVar) {
        jww jwwVarMo10030b = haiVar.mo10030b(gzy.f26991C);
        cgh cghVar = cgh.f5605u;
        gfc gfcVar = gfc.AMETHYST_ON;
        gfcVar.getClass();
        this.f10197b = jwv.m13645b(jwwVarMo10030b, cghVar, new ceg(gfcVar, 11));
        this.f10198c = dhvVar.mo6184l(dhh.f11086al);
        this.f10199d = dalVar;
        this.f10196a = czyVar;
        this.f10200e = kpbVar;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: a */
    public final int mo5765a() {
        return C0100R.string.hdr_video_content_desc;
    }

    @Override // p000.get
    /* JADX INFO: renamed from: b */
    protected final int mo5766b(gfc gfcVar) {
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 34:
                return C0100R.string.hdr_video_on_desc;
            case 35:
                return C0100R.string.hdr_video_off_desc;
            default:
                return 0;
        }
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: c */
    public final int mo5767c() {
        return C0100R.string.hdr_video_options_menu_disabled_reason;
    }

    @Override // p000.get
    /* JADX INFO: renamed from: d */
    public final int mo5768d(gfc gfcVar) {
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 34:
                return C0100R.drawable.ic_hdr_video_on;
            case 35:
                return C0100R.drawable.ic_hdr_video_off;
            default:
                return 0;
        }
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: e */
    public final int mo5769e() {
        return C0100R.string.hdr_video_label;
    }

    @Override // p000.get
    /* JADX INFO: renamed from: f */
    protected final int mo5770f(gfc gfcVar) {
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 34:
                return C0100R.string.hdr_video_on;
            case 35:
                return C0100R.string.hdr_video_off;
            default:
                return 0;
        }
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: g */
    public final gev mo5771g() {
        return gev.AMETHYST;
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: h */
    public final gff mo5772h() {
        return new dqc(this, 1);
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: i */
    public final jww mo5773i() {
        return this.f10197b;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: j */
    public final mws mo5774j() {
        return mws.m17098m(gfc.AMETHYST_OFF, gfc.AMETHYST_ON);
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: k */
    public final void mo5775k(gfa gfaVar) {
        jvb jvbVar = ((geo) gfaVar).f24413q;
        jvbVar.m13537d(this.f10199d.f10270a.mo3830a(new czq(gfaVar, 2), not.INSTANCE));
        jvbVar.m13537d(this.f10199d.f10271b.mo3830a(new czq(gfaVar, 3), not.INSTANCE));
        jvbVar.m13537d(jwj.m13624c(this.f10199d.f10272c).mo3830a(new cdb(this, gfaVar, 16), not.INSTANCE));
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: l */
    public final boolean mo5776l() {
        return true;
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: m */
    public final boolean mo5777m(gfa gfaVar) {
        boolean z = gfc.FPS_30.equals(((jwf) this.f10199d.f10270a).f34942d) || (((Boolean) ((jwf) this.f10199d.f10272c).f34942d).booleanValue() ^ true);
        if (this.f10200e.f36782o) {
            return z && !gew.m9150a(gfaVar);
        }
        return z;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: n */
    public final boolean mo5778n(gfa gfaVar) {
        return this.f10198c && ikw.VIDEO.equals(gfaVar.mo9115b()) && !((Boolean) ((jwf) this.f10199d.f10271b).f34942d).booleanValue();
    }
}
