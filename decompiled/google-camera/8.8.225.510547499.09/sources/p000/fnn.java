package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fnn extends BottomBarListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ foc f22794a;

    public fnn(foc focVar) {
        this.f22794a = focVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCancelButtonPressed() {
        this.f22794a.m8610A();
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onRetakeButtonPressed() {
        foc focVar = this.f22794a;
        focVar.f22835N++;
        if (focVar.f22885p == 0) {
            ((nbe) ((nbe) foc.f22821b.m17251b()).mo17276G((char) 2381)).mo17290o("Can't undo capture, no images captured.");
            return;
        }
        Object obj = exh.f20734a;
        if (!LightCycleNative.CanUndo() || this.f22794a.f22878i.f20688b.mo2722g().m2800a() == 8) {
            ((nbe) ((nbe) foc.f22821b.m17251b()).mo17276G((char) 2380)).mo17290o("Can't undo capture, LightCycle not ready to undo.");
            return;
        }
        foc focVar2 = this.f22794a;
        int i = focVar2.f22885p;
        if (i > 0) {
            focVar2.f22885p = i - 1;
            focVar2.f22886q.m8020d();
            this.f22794a.f22823B.sendEmptyMessage(101);
        }
        foc focVar3 = this.f22794a;
        if (focVar3.f22885p == 0) {
            focVar3.m8620x();
        }
    }
}
