package p000;

import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iix implements hze {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MainActivityLayout f31157a;

    public iix(MainActivityLayout mainActivityLayout) {
        this.f31157a = mainActivityLayout;
    }

    @Override // p000.hze
    public final /* synthetic */ void onLayoutUpdated(hzj hzjVar, ilk ilkVar) {
    }

    @Override // p000.hze
    public final void onLayoutUpdated(ilk ilkVar) {
        jvh.m13577y(this.f31157a.findViewById(C0100R.id.zoom_slider_area), ilkVar);
    }
}
