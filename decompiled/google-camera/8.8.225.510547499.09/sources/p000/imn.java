package p000;

import android.app.Activity;
import android.content.IntentSender;
import androidx.wear.ambient.AmbientModeSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imn implements imh, fbp, fbb, fbg {

    /* JADX INFO: renamed from: a */
    public static final nbh f31531a = nbh.m17259h("com/google/android/apps/camera/update/PlayStoreInAppUpdater");

    /* JADX INFO: renamed from: b */
    public final mmr f31532b;

    /* JADX INFO: renamed from: c */
    public img f31533c;

    /* JADX INFO: renamed from: d */
    public mmq f31534d;

    /* JADX INFO: renamed from: e */
    AmbientModeSupport.AmbientController f31535e;

    /* JADX INFO: renamed from: f */
    private final Activity f31536f;

    public imn(Activity activity, jvd jvdVar, fan fanVar) {
        mmr mmrVar = (mmr) lkm.m15585l(activity).f41078a.get();
        this.f31533c = new imm();
        this.f31536f = activity;
        this.f31532b = mmrVar;
        fdh.m8265e(jvdVar, fanVar, this);
    }

    @Override // p000.fbb
    /* JADX INFO: renamed from: b */
    public final void mo8098b(int i, int i2) {
        if (i == 57439) {
            if (i2 == -1) {
                this.f31533c.mo11464i();
                this.f31533c.mo11469z();
            } else if (i2 == 0) {
                this.f31533c.mo11468y();
            } else {
                ((nbe) ((nbe) f31531a.m17252c()).mo17276G(4324)).mo17291p("Failed to update during user confirmation. resultCode: %s", i2);
                this.f31533c.mo11459A(3, i2);
            }
        }
    }

    @Override // p000.fbg
    /* JADX INFO: renamed from: bC */
    public final void mo3521bC() {
        AmbientModeSupport.AmbientController ambientController = this.f31535e;
        if (ambientController != null) {
            this.f31532b.mo16639e(ambientController);
        }
    }

    @Override // p000.imh
    /* JADX INFO: renamed from: c */
    public final void mo11470c() {
        this.f31534d = null;
        this.f31533c.mo11460e();
        jpp jppVarMo16635a = this.f31532b.mo16635a();
        jppVarMo16635a.mo13459l(new jpl() { // from class: imk
            @Override // p000.jpl
            /* JADX INFO: renamed from: d */
            public final void mo4011d(Object obj) {
                imn imnVar = this.f31528a;
                mmq mmqVar = (mmq) obj;
                int i = mmqVar.f41058c;
                int i2 = mmqVar.f41057b;
                imnVar.f31534d = mmqVar;
                if (i == 11) {
                    imnVar.f31533c.mo11466t();
                    return;
                }
                switch (i2) {
                    case 0:
                    case 1:
                        imnVar.f31533c.mo11463h();
                        break;
                    case 2:
                        if (mmqVar.m16633a()) {
                            imnVar.f31533c.mo11465s(mmqVar.f41056a, mmqVar.f41059d);
                        }
                        break;
                    case 3:
                        imnVar.m11476g();
                        imnVar.f31533c.mo11469z();
                        break;
                }
            }
        });
        jppVarMo16635a.mo13456i(new iml(this, 0));
    }

    @Override // p000.imh
    /* JADX INFO: renamed from: d */
    public final void mo11471d() {
        this.f31532b.mo16636b();
    }

    @Override // p000.imh
    /* JADX INFO: renamed from: e */
    public final void mo11472e(img imgVar) {
        this.f31533c = imgVar;
    }

    @Override // p000.imh
    /* JADX INFO: renamed from: f */
    public final void mo11473f() {
        mmq mmqVar = this.f31534d;
        if (mmqVar == null || mmqVar.f41057b != 2 || !mmqVar.m16633a()) {
            ((nbe) ((nbe) f31531a.m17252c()).mo17276G(4325)).mo17293r("App update info is null or not valid: %s", this.f31534d);
            return;
        }
        m11476g();
        try {
            mmr mmrVar = this.f31532b;
            mmq mmqVar2 = this.f31534d;
            mmqVar2.getClass();
            mmrVar.mo16637c(mmqVar2, this.f31536f);
        } catch (IntentSender.SendIntentException e) {
            ((nbe) ((nbe) ((nbe) f31531a.m17252c()).mo17283h(e)).mo17276G((char) 4326)).mo17290o("Failed to start update flow");
            this.f31533c.mo11459A(2, 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m11476g() {
        if (this.f31535e == null) {
            this.f31535e = new AmbientModeSupport.AmbientController(this);
        }
        mmr mmrVar = this.f31532b;
        AmbientModeSupport.AmbientController ambientController = this.f31535e;
        ambientController.getClass();
        mmrVar.mo16638d(ambientController);
    }
}
