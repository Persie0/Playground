package p000;

import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbp implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f10410a;

    /* JADX INFO: renamed from: b */
    private final oju f10411b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f10412c;

    public dbp(oju ojuVar, oju ojuVar2, int i) {
        this.f10412c = i;
        this.f10410a = ojuVar;
        this.f10411b = ojuVar2;
    }

    public dbp(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f10412c = i;
        this.f10411b = ojuVar;
        this.f10410a = ojuVar2;
    }

    public dbp(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f10412c = i;
        this.f10411b = ojuVar;
        this.f10410a = ojuVar2;
    }

    public dbp(oju ojuVar, oju ojuVar2, int i, float[] fArr) {
        this.f10412c = i;
        this.f10411b = ojuVar;
        this.f10410a = ojuVar2;
    }

    public dbp(oju ojuVar, oju ojuVar2, int i, int[] iArr) {
        this.f10412c = i;
        this.f10411b = ojuVar;
        this.f10410a = ojuVar2;
    }

    public dbp(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f10412c = i;
        this.f10411b = ojuVar;
        this.f10410a = ojuVar2;
    }

    public dbp(oju ojuVar, oju ojuVar2, int i, boolean[] zArr) {
        this.f10412c = i;
        this.f10411b = ojuVar;
        this.f10410a = ojuVar2;
    }

    public dbp(oju ojuVar, oju ojuVar2, int i, byte[][] bArr) {
        this.f10412c = i;
        this.f10411b = ojuVar;
        this.f10410a = ojuVar2;
    }

    public dbp(oju ojuVar, oju ojuVar2, int i, char[][] cArr) {
        this.f10412c = i;
        this.f10411b = ojuVar;
        this.f10410a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static dbp m5886a(oju ojuVar, oju ojuVar2) {
        return new dbp(ojuVar, ojuVar2, 17);
    }

    /* JADX INFO: renamed from: b */
    public static dbp m5887b(oju ojuVar, oju ojuVar2) {
        return new dbp(ojuVar, ojuVar2, 19, (byte[][]) null);
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, oju] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f10412c) {
            case 0:
                return new cvy(hyu.m10886a(), (kqj) this.f10410a.get(), (kbz) this.f10411b.get(), null, null);
            case 1:
                dhv dhvVar = (dhv) this.f10410a.get();
                dao daoVar = new dao(((hai) this.f10411b.get()).mo10030b(gzy.f27064w));
                cdy cdyVar = cdy.f5377f;
                gfj gfjVarM9181o = gfk.m9181o();
                gfjVarM9181o.m9178r(gev.FRONT_VIDEO_FLASH);
                gfjVarM9181o.f24545a = daoVar;
                gfjVarM9181o.m9179s(cdyVar);
                if (dhvVar.mo6183k(dim.f11640c)) {
                    gfjVarM9181o.m9177q(new dan(daoVar, 0));
                    gfjVarM9181o.m9168h(C0100R.string.flash_desc);
                    gfjVarM9181o.m9163c(C0100R.string.flash_options_desc);
                    gfjVarM9181o.m9162b(gfc.VIDEO_FLASH_OFF, C0100R.drawable.quantum_gm_ic_flash_off_white_24, C0100R.string.cam_flash_off, C0100R.string.flash_off_desc);
                    gfjVarM9181o.m9162b(gfc.VIDEO_FLASH_ON, C0100R.drawable.quantum_gm_ic_flash_on_white_24, C0100R.string.cam_flash_on, C0100R.string.flash_on_desc);
                } else {
                    gfjVarM9181o.m9168h(C0100R.string.illumination_desc);
                    gfjVarM9181o.m9163c(C0100R.string.illumination_options_desc);
                    gfjVarM9181o.m9162b(gfc.VIDEO_FLASH_OFF, C0100R.drawable.ic_lightbulb_off, C0100R.string.illumination_off_option_desc, C0100R.string.illumination_off_desc);
                    gfjVarM9181o.m9162b(gfc.VIDEO_FLASH_ON, C0100R.drawable.ic_lightbulb_on, C0100R.string.illumination_on_option_desc, C0100R.string.illumination_on_desc);
                }
                return gfjVarM9181o.m9161a();
            case 2:
                return new htl(this.f10410a, this.f10411b, 1);
            case 3:
                return new lqq(((dws) this.f10410a).m6830a(), (dsx) this.f10411b.get(), null, null);
            case 4:
                return jbx.m12870o(this.f10410a, (kbz) this.f10411b.get(), "cvk");
            case 5:
                jfs jfsVar = ((hdq) this.f10411b).get();
                Executor executor = (Executor) this.f10410a.get();
                htb htbVar = (htb) jfsVar.f33914a.get();
                htbVar.getClass();
                executor.getClass();
                return new hdp(htbVar, executor, null);
            case 6:
                return new kcf(kxk.m14956B((Executor) this.f10411b.get()), (kbz) this.f10410a.get(), VzWFSVj.yeRUiMBRKBwYDaR);
            case 7:
                return new dsx(((dws) this.f10410a).m6830a(), (jvd) this.f10411b.get());
            case 8:
                return new dgl((dge) this.f10410a.get(), (dhv) this.f10411b.get());
            case 9:
                return new dsx(((dws) this.f10411b).m6830a(), (hst) this.f10410a.get());
            case 10:
                return new djy(((dws) this.f10410a).m6830a(), (dhv) this.f10411b.get());
            case 11:
                ohh.m18485a(this.f10411b);
                return new dlj((dhv) this.f10410a.get());
            case 12:
                dhv dhvVar2 = (dhv) this.f10410a.get();
                dhx dhxVar = dib.f11240a;
                dhvVar2.mo6177e();
                return new dlj();
            case 13:
                return new bko((dhv) this.f10410a.get(), (byte[]) null);
            case 14:
                return ((dhv) this.f10410a.get()).mo6184l(dib.f11265aY) ? ((dlq) this.f10411b).get() : new dlu();
            case 15:
                return new dnb((bko) this.f10410a.get(), (gye) this.f10411b.get(), null, null, null, null);
            case 16:
                dhv dhvVar3 = (dhv) this.f10410a.get();
                return new dnf(dhvVar3);
            case 17:
                return !((Boolean) ((jwn) this.f10411b.get()).mo3831be()).booleanValue() ? mrm.m16829i(new dnr()) : (mrm) ((ohj) this.f10410a).f46012a;
            case 18:
                return jbx.m12870o(this.f10410a, (kbz) this.f10411b.get(), "fb");
            case 19:
                dhv dhvVar4 = (dhv) this.f10411b.get();
                Object driVar = (!dhvVar4.mo6184l(dhq.f11154a) || mro.m16832b(dhvVar4.mo6182j(dhq.f11160g))) ? new dri() : (drk) ((ohb) ((mrq) ((etl) this.f10410a).m7866a()).f41482a).get();
                driVar.getClass();
                return driVar;
            default:
                drw drwVar = (drw) this.f10411b.get();
                Object drxVar = new drx();
                dry dryVar = (dry) this.f10410a.get();
                if (drwVar == drw.EXCLUDE_FREQUENT_FACE) {
                    drxVar = dryVar;
                }
                drxVar.getClass();
                return drxVar;
        }
    }
}
