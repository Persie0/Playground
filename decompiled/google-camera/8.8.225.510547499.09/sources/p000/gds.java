package p000;

import com.google.android.apps.camera.stats.ViewfinderJankSession;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gds implements gdo {

    /* JADX INFO: renamed from: a */
    private final ViewfinderJankSession f24336a;

    public gds(ViewfinderJankSession viewfinderJankSession) {
        this.f24336a = viewfinderJankSession;
    }

    @Override // p000.gdo
    /* JADX INFO: renamed from: a */
    public final void mo9080a(kpp kppVar, double d, double d2) {
        ViewfinderJankSession viewfinderJankSession = this.f24336a;
        synchronized (viewfinderJankSession.f6952a) {
            if (viewfinderJankSession.f6953b.size() < 30) {
                nje njeVarM4301c = ViewfinderJankSession.m4301c(kppVar, d, d2);
                viewfinderJankSession.f6953b.add(njeVarM4301c);
                viewfinderJankSession.m4302a(njeVarM4301c);
            }
        }
    }
}
