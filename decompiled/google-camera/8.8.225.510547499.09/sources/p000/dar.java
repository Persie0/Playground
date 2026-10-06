package p000;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dar extends get {

    /* JADX INFO: renamed from: m */
    private static final nbh f10292m = nbh.m17259h("com/google/android/apps/camera/camcorder/ui/optionsmenuitem/MicInputMenuItem");

    /* JADX INFO: renamed from: a */
    public final gyz f10293a;

    /* JADX INFO: renamed from: b */
    public final jwn f10294b;

    /* JADX INFO: renamed from: c */
    public final elx f10295c;

    /* JADX INFO: renamed from: d */
    public final jvd f10296d;

    /* JADX INFO: renamed from: e */
    public final Activity f10297e;

    /* JADX INFO: renamed from: f */
    public final jwn f10298f;

    /* JADX INFO: renamed from: g */
    public final jwn f10299g;

    /* JADX INFO: renamed from: h */
    public boolean f10300h;

    /* JADX INFO: renamed from: i */
    public idb f10301i;

    /* JADX INFO: renamed from: j */
    public idb f10302j;

    /* JADX INFO: renamed from: k */
    public int f10303k;

    /* JADX INFO: renamed from: l */
    public final jfs f10304l;

    /* JADX INFO: renamed from: n */
    private final jww f10305n;

    /* JADX INFO: renamed from: o */
    private final jwn f10306o;

    /* JADX INFO: renamed from: p */
    private final jwn f10307p;

    /* JADX INFO: renamed from: q */
    private gfa f10308q;

    public dar(gyz gyzVar, jwn jwnVar, dal dalVar, elx elxVar, jfs jfsVar, jvd jvdVar, Activity activity, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f10293a = gyzVar;
        this.f10294b = jwnVar;
        this.f10306o = dalVar.f10271b;
        this.f10295c = elxVar;
        this.f10304l = jfsVar;
        this.f10296d = jvdVar;
        this.f10297e = activity;
        this.f10298f = gyzVar.f26913b;
        this.f10299g = gyzVar.f26914c;
        this.f10307p = gyzVar.f26915d;
        this.f10305n = new geu(gyzVar.f26912a, gzn.PHONE, gzn.PHONE, gfc.MIC_INPUT_PHONE, gzn.EXT_WIRED, gfc.MIC_INPUT_EXT_WIRED, gzn.EXT_BLUETOOTH, gfc.MIC_INPUT_EXT_BLUETOOTH);
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: a */
    public final int mo5765a() {
        return C0100R.string.mic_input_options_desc;
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: c */
    public final int mo5767c() {
        return C0100R.string.mic_input_ext_bluetooth_connecting;
    }

    @Override // p000.get
    /* JADX INFO: renamed from: d */
    public final int mo5768d(gfc gfcVar) {
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 23:
                return C0100R.drawable.quantum_gm_ic_mic_white_24;
            case 24:
                return C0100R.drawable.gm_filled_mic_external_on_white_24;
            case 25:
                return C0100R.drawable.gm_filled_bluetooth_connected_white_24;
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(gfcVar))));
        }
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: e */
    public final int mo5769e() {
        return C0100R.string.mic_input_desc;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: g */
    public final gev mo5771g() {
        return gev.MICROPHONE;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: i */
    public final jww mo5773i() {
        return this.f10305n;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: j */
    public final mws mo5774j() {
        if (((Boolean) ((jwf) this.f10298f).f34942d).booleanValue() && ((Boolean) ((jwf) this.f10299g).f34942d).booleanValue()) {
            return mws.m17099n(gfc.MIC_INPUT_PHONE, gfc.MIC_INPUT_EXT_WIRED, gfc.MIC_INPUT_EXT_BLUETOOTH);
        }
        if (((Boolean) ((jwf) this.f10298f).f34942d).booleanValue()) {
            return mws.m17098m(gfc.MIC_INPUT_PHONE, gfc.MIC_INPUT_EXT_WIRED);
        }
        if (((Boolean) ((jwf) this.f10299g).f34942d).booleanValue()) {
            return mws.m17098m(gfc.MIC_INPUT_PHONE, gfc.MIC_INPUT_EXT_BLUETOOTH);
        }
        ((nbe) ((nbe) f10292m.m17252c()).mo17276G((char) 810)).mo17290o("getOptionList: returning empty list");
        int i = mws.f41739d;
        return mzr.f41857a;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: k */
    public final void mo5775k(gfa gfaVar) {
        jvb jvbVar = ((geo) gfaVar).f24413q;
        jvbVar.m13537d(jwr.m13632b(this.f10299g, this.f10298f).mo3830a(new cdb(this, gfaVar, 19), not.INSTANCE));
        jvbVar.m13537d(this.f10307p.mo3830a(new cdb(this, gfaVar, 20), not.INSTANCE));
        jvbVar.m13537d(this.f10306o.mo3830a(new czq(gfaVar, 11), not.INSTANCE));
        jvbVar.m13537d(this.f10294b.mo3830a(new ecr(this, gfaVar, 1), not.INSTANCE));
        gfaVar.mo9121g(new daq(this));
        this.f10308q = gfaVar;
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: m */
    public final boolean mo5777m(gfa gfaVar) {
        return !this.f10300h;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: n */
    public final boolean mo5778n(gfa gfaVar) {
        return (((Boolean) ((jwf) this.f10298f).f34942d).booleanValue() || ((Boolean) ((jwf) this.f10299g).f34942d).booleanValue()) && m5839w(gfaVar);
    }

    /* JADX INFO: renamed from: o */
    public final void m5836o() {
        if (this.f10301i == null || this.f10302j == null) {
            jvd.m13538a();
            Activity activity = this.f10297e;
            this.f10301i = jpd.m13426g(false, 5000, null, null, activity.getString(C0100R.string.external_wired_mic_connected), activity, false, -1, 1);
            this.f10302j = jpd.m13426g(false, 5000, null, null, this.f10297e.getString(C0100R.string.external_wired_mic_disconnected), activity, false, -1, 1);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m5837p() {
        idb idbVar = this.f10301i;
        if (idbVar != null) {
            this.f10295c.mo7485g(idbVar);
        }
        idb idbVar2 = this.f10302j;
        if (idbVar2 != null) {
            this.f10295c.mo7485g(idbVar2);
        }
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: r */
    public final String mo5830r(gfc gfcVar, Resources resources) {
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 23:
                return resources.getString(C0100R.string.mic_input_phone_acc_desc);
            case 24:
                return resources.getString(C0100R.string.mic_input_ext_wired_acc_desc);
            case 25:
                return this.f10293a.m10006c(gyy.EXT_BLUETOOTH);
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(gfcVar))));
        }
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: s */
    public final String mo5831s(gfc gfcVar, Resources resources) {
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 23:
                return resources.getString(C0100R.string.mic_input_phone_desc);
            case 24:
                return resources.getString(C0100R.string.mic_input_ext_wired_desc);
            case 25:
                return this.f10293a.m10006c(gyy.EXT_BLUETOOTH);
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(gfcVar))));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m5838t(gfa gfaVar) {
        if (((Boolean) this.f10294b.mo3831be()).booleanValue()) {
            return;
        }
        boolean z = true;
        int i = 0;
        boolean z2 = gfc.MIC_INPUT_EXT_WIRED.equals(this.f10305n.mo3831be()) && !((Boolean) ((jwf) this.f10298f).f34942d).booleanValue();
        boolean z3 = gfc.MIC_INPUT_EXT_BLUETOOTH.equals(this.f10305n.mo3831be()) && !((Boolean) ((jwf) this.f10299g).f34942d).booleanValue();
        boolean z4 = (!gfc.MIC_INPUT_EXT_BLUETOOTH.equals(this.f10305n.mo3831be()) || this.f10300h || ((Boolean) ((jwf) this.f10307p).f34942d).booleanValue()) ? false : true;
        if (!z2 && !z3) {
            if (!z4) {
                return;
            } else {
                z4 = true;
            }
        }
        ((nbe) ((nbe) f10292m.m17252c()).mo17276G((char) 822)).mo17293r("validateMicInputProperty: fallback from %s", this.f10305n.mo3831be());
        this.f10305n.mo3415bf(gfc.MIC_INPUT_PHONE);
        if (m5839w(gfaVar)) {
            boolean z5 = z3 || z4;
            if (!((Boolean) this.f10294b.mo3831be()).booleanValue()) {
                synchronized (this) {
                    m5837p();
                    if (z2) {
                        z = z5;
                    }
                    this.f10296d.m13541c(new dap(this, z2, z, i));
                }
            }
            gfaVar.mo9129o(false, gev.MICROPHONE);
        }
    }

    @Override // p000.get, p000.gfd
    /* JADX INFO: renamed from: u */
    public final boolean mo5833u(gev gevVar, gfc gfcVar, boolean z) {
        if (!z && gfc.MIC_INPUT_EXT_BLUETOOTH.equals(gfcVar) && !((Boolean) ((jwf) this.f10307p).f34942d).booleanValue()) {
            this.f10300h = true;
            gfa gfaVar = this.f10308q;
            gfaVar.getClass();
            gfaVar.mo9129o(false, gev.MICROPHONE);
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m5839w(gfa gfaVar) {
        ikw ikwVarMo9115b = gfaVar.mo9115b();
        if (ikw.AMBER.equals(ikwVarMo9115b) || ikw.SLOW_MOTION.equals(ikwVarMo9115b) || ikw.VIDEO_INTENT.equals(ikwVarMo9115b)) {
            return true;
        }
        return ikw.VIDEO.equals(ikwVarMo9115b) && !((Boolean) ((jwf) this.f10306o).f34942d).booleanValue();
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: z */
    public final void mo5840z(gfa gfaVar, boolean z) {
        this.f10305n.mo3831be();
        String strM10006c = this.f10293a.m10006c(gyy.EXT_BLUETOOTH);
        if (z) {
            if (gfc.MIC_INPUT_EXT_WIRED.equals(this.f10305n.mo3831be())) {
                gfaVar.mo9136w(false, C0100R.drawable.gm_filled_bluetooth_connected_white_24, strM10006c, "MicInput");
                gfaVar.mo9135v(true, C0100R.drawable.gm_filled_mic_external_on_white_24, C0100R.string.mic_input_ext_wired_acc_desc, "MicInput");
                return;
            } else if (gfc.MIC_INPUT_EXT_BLUETOOTH.equals(this.f10305n.mo3831be())) {
                gfaVar.mo9135v(false, C0100R.drawable.gm_filled_mic_external_on_white_24, C0100R.string.mic_input_ext_wired_acc_desc, "MicInput");
                gfaVar.mo9136w(true, C0100R.drawable.gm_filled_bluetooth_connected_white_24, strM10006c, "MicInput");
                return;
            }
        }
        gfaVar.mo9136w(false, C0100R.drawable.gm_filled_bluetooth_connected_white_24, strM10006c, "MicInput");
        gfaVar.mo9135v(false, C0100R.drawable.gm_filled_mic_external_on_white_24, C0100R.string.mic_input_ext_wired_acc_desc, "MicInput");
    }
}
