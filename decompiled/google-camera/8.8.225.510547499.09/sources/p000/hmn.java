package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hmn extends hei implements fbp, fbd, ezx {

    /* JADX INFO: renamed from: b */
    public final Context f28335b;

    /* JADX INFO: renamed from: c */
    public final gvo f28336c;

    /* JADX INFO: renamed from: d */
    public final fcp f28337d;

    /* JADX INFO: renamed from: e */
    public final dhv f28338e;

    /* JADX INFO: renamed from: f */
    public boolean f28339f;

    /* JADX INFO: renamed from: g */
    private final jww f28340g;

    /* JADX INFO: renamed from: h */
    private final jvd f28341h;

    /* JADX INFO: renamed from: i */
    private final fba f28342i;

    /* JADX INFO: renamed from: j */
    private hev f28343j;

    /* JADX INFO: renamed from: k */
    private long f28344k = -1;

    /* JADX INFO: renamed from: l */
    private final drj f28345l;

    public hmn(Context context, jww jwwVar, gvo gvoVar, drj drjVar, fcp fcpVar, jvd jvdVar, fba fbaVar, dhv dhvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f28335b = context;
        this.f28340g = jwwVar;
        this.f28336c = gvoVar;
        this.f28345l = drjVar;
        this.f28337d = fcpVar;
        this.f28341h = jvdVar;
        this.f28342i = fbaVar;
        this.f28338e = dhvVar;
    }

    @Override // p000.hei, p000.hes
    /* JADX INFO: renamed from: b */
    public final void mo3951b(hew hewVar) {
        super.mo3951b(hewVar);
        fdh.m8265e(this.f28341h, this.f28342i, this);
    }

    @Override // p000.ezx
    /* JADX INFO: renamed from: bD */
    public final void mo6425bD(Intent intent) {
        this.f28339f = false;
    }

    @Override // p000.fbd
    /* JADX INFO: renamed from: bI */
    public final void mo6422bI() {
        this.f28339f = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m10461e(hmq hmqVar) {
        if (this.f28339f) {
            dhv dhvVar = this.f28338e;
            dhx dhxVar = did.f11416a;
            dhvVar.mo6175c();
            return;
        }
        hmh hmhVarM6639s = this.f28345l.m6639s(hmqVar);
        ikw ikwVar = (ikw) this.f28340g.mo3831be();
        if (((ikwVar != ikw.PHOTO && ikwVar != ikw.PORTRAIT && ikwVar != ikw.LONG_EXPOSURE) || !hmhVarM6639s.f28311c) && (ikwVar != ikw.VIDEO || !hmhVarM6639s.f28312d)) {
            this.f28344k = -1L;
            m10152c();
            return;
        }
        long j = this.f28344k;
        if (j < 0 || hmqVar.f28352b < j) {
            this.f28344k = Math.max(0L, hmqVar.f28352b - 25000000);
            if (this.f28343j == null) {
                Resources resources = this.f28335b.getResources();
                heu heuVarM10165a = hev.m10165a();
                heuVarM10165a.f27492a = resources.getString(C0100R.string.storage_low_warning_toast);
                heuVarM10165a.f27493b = resources.getDrawable(C0100R.drawable.quantum_gm_ic_sd_card_alert_white_24, null);
                heuVarM10165a.m10164e(6000L);
                heuVarM10165a.f27494c = new hmm(this, 0);
                heuVarM10165a.f27497f = new hmm(this, 2);
                this.f28343j = heuVarM10165a.m10160a();
            }
            m10153d(this.f28343j);
        }
    }

    @Override // p000.hei, p000.hes
    /* JADX INFO: renamed from: v */
    public final void mo3969v() {
        super.mo3969v();
        this.f28344k = -1L;
    }
}
