package p000;

import com.google.android.apps.camera.p014ui.views.MainActivityLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ijz implements gfg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ika f31267a;

    public ijz(ika ikaVar) {
        this.f31267a = ikaVar;
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: a */
    public final void mo5759a() {
        MainActivityLayout mainActivityLayout = ((iig) this.f31267a.f31278a).get().f31066c;
        mainActivityLayout.post(new hri(this, mainActivityLayout, 19));
        if (this.f31267a.f31282e.mo3831be() == gzp.AUTO) {
            ((clo) this.f31267a.f31287j.get()).m3924c();
        } else {
            ((clo) this.f31267a.f31287j.get()).m3922a();
        }
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5760b() {
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: c */
    public final void mo5761c() {
        ((iig) this.f31267a.f31278a).get().f31066c.m4477s(this.f31267a.f31303z);
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo5762d() {
    }
}
