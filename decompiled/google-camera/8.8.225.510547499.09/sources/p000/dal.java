package p000;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dal extends get {

    /* JADX INFO: renamed from: j */
    private static final nbh f10269j = nbh.m17259h("com/google/android/apps/camera/camcorder/ui/optionsmenuitem/FpsMenuItem");

    /* JADX INFO: renamed from: a */
    public final jww f10270a = new jwf(gfc.FPS_AUTO);

    /* JADX INFO: renamed from: b */
    public final jww f10271b = new jwf(false);

    /* JADX INFO: renamed from: c */
    public final jww f10272c = new jwf(false);

    /* JADX INFO: renamed from: d */
    public mws f10273d;

    /* JADX INFO: renamed from: e */
    public mws f10274e;

    /* JADX INFO: renamed from: f */
    public boolean f10275f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f10276g;

    /* JADX INFO: renamed from: h */
    public boolean f10277h;

    /* JADX INFO: renamed from: i */
    public gfa f10278i;

    /* JADX INFO: renamed from: k */
    private final har f10279k;

    /* JADX INFO: renamed from: l */
    private final jww f10280l;

    /* JADX INFO: renamed from: m */
    private final ohb f10281m;

    /* JADX INFO: renamed from: n */
    private final djm f10282n;

    public dal(djm djmVar, har harVar, jww jwwVar, ohb ohbVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = mws.f41739d;
        mws mwsVar = mzr.f41857a;
        this.f10273d = mwsVar;
        this.f10274e = mwsVar;
        this.f10275f = false;
        this.f10276g = false;
        this.f10277h = false;
        this.f10278i = null;
        this.f10282n = djmVar;
        this.f10279k = harVar;
        this.f10280l = jwwVar;
        this.f10281m = ohbVar;
    }

    /* JADX INFO: renamed from: p */
    public static gfc m5827p(gzm gzmVar) {
        gzm gzmVar2 = gzm.FPS_AUTO;
        gfc gfcVar = gfc.UNKNOWN;
        switch (gzmVar) {
            case FPS_AUTO:
                return gfc.FPS_AUTO;
            case FPS_24:
                return gfc.FPS_24;
            case FPS_30:
                return gfc.FPS_30;
            case FPS_60:
                return gfc.FPS_60;
            default:
                throw new AssertionError(PMZiHihxLGEy.cTqsTgQlTBA);
        }
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: a */
    public final int mo5765a() {
        return C0100R.string.fps_options_desc;
    }

    @Override // p000.get
    /* JADX INFO: renamed from: d */
    public final int mo5768d(gfc gfcVar) {
        gzm gzmVar = gzm.FPS_AUTO;
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 26:
                return C0100R.drawable.quantum_gm_ic_autofps_select_white_24;
            case 27:
                return C0100R.drawable.ic_options_24fps_24px;
            case 28:
                return C0100R.drawable.quantum_gm_ic_30fps_select_white_24;
            case 29:
                return C0100R.drawable.quantum_gm_ic_60fps_select_white_24;
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(gfcVar))));
        }
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: e */
    public final int mo5769e() {
        return C0100R.string.fps_option_desc;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: g */
    public final gev mo5771g() {
        return gev.FPS;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: i */
    public final jww mo5773i() {
        return this.f10270a;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: j */
    public final mws mo5774j() {
        return this.f10273d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.gfb
    /* JADX INFO: renamed from: k */
    public final void mo5775k(gfa gfaVar) {
        jvb jvbVar = ((geo) gfaVar).f24413q;
        djm djmVar = this.f10282n;
        jvbVar.m13537d(jwr.m13632b(djmVar.f11789c, djmVar.f11788b, djmVar.f11787a).mo3830a(new czq(this, 7), not.INSTANCE));
        jvbVar.m13537d(this.f10270a.mo3830a(new czq(this, 8), not.INSTANCE));
        jvbVar.m13537d(this.f10279k.mo3830a(new czq(this, 9), not.INSTANCE));
        jvbVar.m13537d(this.f10280l.mo3830a(new cdb(this, gfaVar, 17), not.INSTANCE));
        this.f10278i = gfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    @Override // p000.gfb
    /* JADX INFO: renamed from: n */
    public final boolean mo5778n(gfa gfaVar) {
        boolean z;
        boolean zEquals = ikw.VIDEO.equals(gfaVar.mo9115b());
        boolean z2 = false;
        if (gew.m9150a(gfaVar)) {
            if (this.f10274e.size() > 1) {
                z = true;
            } else {
                z = false;
            }
        } else if (this.f10273d.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        if (zEquals && z) {
            z2 = true;
        }
        if (((Boolean) ((jwf) this.f10272c).f34942d).booleanValue() != z2) {
            this.f10272c.mo3415bf(Boolean.valueOf(z2));
        }
        return ((Boolean) ((jwf) this.f10272c).f34942d).booleanValue();
    }

    /* JADX INFO: renamed from: o */
    public final gfc m5828o() {
        return m5827p((gzm) m5829q().mo3831be());
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, jww] */
    /* JADX INFO: renamed from: q */
    public final jww m5829q() {
        if (((Boolean) ((jwf) this.f10271b).f34942d).booleanValue()) {
            return this.f10282n.f11788b;
        }
        return this.f10275f ? this.f10282n.f11789c : this.f10282n.f11787a;
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: r */
    public final String mo5830r(gfc gfcVar, Resources resources) {
        gzm gzmVar = gzm.FPS_AUTO;
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 26:
                return resources.getString(C0100R.string.fps_auto_desc);
            case 27:
                return resources.getString(C0100R.string.fps_desc, Integer.valueOf(resources.getInteger(C0100R.integer.fps_24)));
            case 28:
                return resources.getString(C0100R.string.fps_desc, Integer.valueOf(resources.getInteger(C0100R.integer.fps_30)));
            case 29:
                return resources.getString(C0100R.string.fps_desc, Integer.valueOf(resources.getInteger(C0100R.integer.fps_60)));
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(gfcVar))));
        }
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: s */
    public final String mo5831s(gfc gfcVar, Resources resources) {
        gzm gzmVar = gzm.FPS_AUTO;
        gfc gfcVar2 = gfc.UNKNOWN;
        int iOrdinal = gfcVar.ordinal();
        String str = xRFdVyfdeve.zfuHJ;
        switch (iOrdinal) {
            case 26:
                return resources.getString(C0100R.string.fps_auto);
            case 27:
                return String.format(str, Integer.valueOf(resources.getInteger(C0100R.integer.fps_24)));
            case 28:
                return String.format(str, Integer.valueOf(resources.getInteger(C0100R.integer.fps_30)));
            case 29:
                return String.format(str, Integer.valueOf(resources.getInteger(C0100R.integer.fps_60)));
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(gfcVar))));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m5832t() {
        gfc gfcVarM5828o = m5828o();
        if (((gfc) ((jwf) this.f10270a).f34942d).equals(gfcVarM5828o)) {
            return;
        }
        this.f10270a.mo3415bf(gfcVarM5828o);
    }

    @Override // p000.get, p000.gfd
    /* JADX INFO: renamed from: u */
    public final boolean mo5833u(gev gevVar, gfc gfcVar, boolean z) {
        boolean z2 = this.f10276g;
        boolean z3 = true;
        if (!z2 && !((hml) this.f10281m.get()).mo5833u(gevVar, gfcVar, z)) {
            z3 = false;
        }
        if (z3) {
            ((nbe) ((nbe) f10269j.m17252c()).mo17276G(809)).mo17271B("shouldBlockSelection: block. option=%s invalidState=%b isSelected=%b", gfcVar, Boolean.valueOf(z2), Boolean.valueOf(z));
        }
        return z3;
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: v */
    public final boolean mo5834v(gfa gfaVar, gfc gfcVar) {
        if (this.f10277h || !this.f10275f || !gfc.FPS_60.equals(gfcVar) || ((Float) this.f10280l.mo3831be()).floatValue() >= 1.0f) {
            return this.f10274e.contains(gfcVar);
        }
        return false;
    }
}
