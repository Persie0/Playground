package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class evj extends BottomBarListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ evo f20402a;

    public evj(evo evoVar) {
        this.f20402a = evoVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCameraSwitchButtonClicked() {
        dbr dbrVar = this.f20402a.f20426k;
        if (dbrVar != null) {
            dbrVar.m5899h(cik.f5797e);
            this.f20402a.f20419d.mo11721B(false);
            this.f20402a.f20419d.mo11768s();
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onRetakeButtonPressed() {
        this.f20402a.f20424i.mo10782b();
        evf evfVar = this.f20402a.f20431p;
        jvd.m13538a();
        evfVar.f20387g = false;
        evfVar.f20385e.m4503a();
        evfVar.f20386f.setVisibility(8);
        evfVar.f20382b.mo3720j(true);
        ((ciq) evfVar.f20382b).f5851q.mo10738f(true);
        evfVar.f20382b.mo3725o();
    }
}
