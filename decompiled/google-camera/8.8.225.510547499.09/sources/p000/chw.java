package p000;

import android.content.res.Configuration;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class chw implements kba {

    /* JADX INFO: renamed from: b */
    private static final nbh f5763b = nbh.m17259h("com/google/android/apps/camera/app/interfaces/ModuleController");

    /* JADX INFO: renamed from: a */
    public boolean f5764a;

    /* JADX INFO: renamed from: c */
    private boolean f5765c;

    /* JADX INFO: renamed from: bL */
    public mrm mo3766bL() {
        return mqu.f41450a;
    }

    /* JADX INFO: renamed from: bS */
    public void mo3767bS(int i) {
    }

    /* JADX INFO: renamed from: bT */
    public void mo3768bT(boolean z) {
    }

    /* JADX INFO: renamed from: bU */
    public void mo3769bU() {
    }

    /* JADX INFO: renamed from: bV */
    protected abstract void mo3770bV();

    /* JADX INFO: renamed from: bW */
    public final void m3771bW() {
        jvd.m13538a();
        if (this.f5765c) {
            ((nbe) ((nbe) f5763b.m17252c()).mo17276G((char) 161)).mo17290o("Module is already resumed; skipping start.");
        } else if (this.f5764a) {
            ((nbe) ((nbe) f5763b.m17252c()).mo17276G((char) 160)).mo17290o("Duplicate call to startModule; skipping start.");
        } else {
            this.f5764a = true;
            mo3780n();
        }
    }

    /* JADX INFO: renamed from: bz */
    public mrm mo3772bz() {
        return mqu.f41450a;
    }

    /* JADX INFO: renamed from: c */
    public String mo3773c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void mo3774d(bnq bnqVar) {
    }

    /* JADX INFO: renamed from: e */
    public void mo3775e(Configuration configuration) {
    }

    /* JADX INFO: renamed from: j */
    public final void m3776j() {
        jvd.m13538a();
        if (!this.f5764a) {
            ((nbe) ((nbe) f5763b.m17252c()).mo17276G((char) 158)).mo17290o("Module is already stopped; skipping pause.");
        } else if (this.f5765c) {
            this.f5765c = false;
            mo3770bV();
        } else {
            ((nbe) ((nbe) f5763b.m17252c()).mo17276G((char) 157)).mo17290o(VCYBIzY.QrzqZP);
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo3777k() {
    }

    /* JADX INFO: renamed from: l */
    protected abstract void mo3778l();

    /* JADX INFO: renamed from: m */
    public final void m3779m() {
        jvd.m13538a();
        lku.m15614I(this.f5764a, "Cannot resume a stopped module");
        if (this.f5765c) {
            ((nbe) ((nbe) f5763b.m17252c()).mo17276G((char) 159)).mo17290o("Duplicate call to resumeModule; skipping resume.");
        } else {
            this.f5765c = true;
            mo3778l();
        }
    }

    /* JADX INFO: renamed from: n */
    protected abstract void mo3780n();

    /* JADX INFO: renamed from: p */
    protected abstract void mo3781p();

    /* JADX INFO: renamed from: q */
    public final void m3782q() {
        jvd.m13538a();
        if (this.f5765c) {
            ((nbe) ((nbe) f5763b.m17252c()).mo17276G((char) 163)).mo17290o("Attempting to stop a resumed module!");
            m3776j();
        }
        if (!this.f5764a) {
            ((nbe) ((nbe) f5763b.m17252c()).mo17276G((char) 162)).mo17290o("Duplicate call to stopModule; skipping stop.");
        } else {
            this.f5764a = false;
            mo3781p();
        }
    }

    /* JADX INFO: renamed from: r */
    public void mo3783r() {
    }

    /* JADX INFO: renamed from: s */
    public void mo3784s(Runnable runnable) {
    }

    /* JADX INFO: renamed from: t */
    public boolean mo3785t() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public boolean mo3786u() {
        return false;
    }

    /* JADX INFO: renamed from: v */
    public boolean mo3787v() {
        return true;
    }
}
