package p000;

import android.view.ViewStub;
import com.google.android.apps.camera.p014ui.hotshot.HotshotView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyz {

    /* JADX INFO: renamed from: a */
    public static final nbh f29999a = nbh.m17259h("com/google/android/apps/camera/ui/hotshot/HotshotViewAdapter");

    /* JADX INFO: renamed from: b */
    public final mrm f30000b;

    /* JADX INFO: renamed from: c */
    public boolean f30001c = false;

    /* JADX INFO: renamed from: d */
    public jww f30002d = new jwf(new hyx[0]);

    public hyz(ViewStub viewStub, dhv dhvVar) {
        this.f30000b = dhvVar.mo6184l(dib.f11357ck) ? mrm.m16829i((HotshotView) viewStub.inflate()) : mqu.f41450a;
    }

    /* JADX INFO: renamed from: a */
    public final void m10888a(boolean z) {
        mrm mrmVar = this.f30000b;
        if (mrmVar.mo16813g()) {
            ((HotshotView) mrmVar.mo16809c()).setVisibility(true != z ? 4 : 0);
        }
    }
}
