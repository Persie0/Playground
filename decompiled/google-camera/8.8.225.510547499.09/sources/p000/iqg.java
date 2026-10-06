package p000;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iqg implements eop {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ iqh f31769a;

    public iqg(iqh iqhVar) {
        this.f31769a = iqhVar;
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo5221a(boolean z) {
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5222b(boolean z) {
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: c */
    public final void mo5223c() {
        View viewFindViewById = this.f31769a.f31778i.findViewById(C0100R.id.preview_overlay);
        if (viewFindViewById != null) {
            Point pointM13569q = jvh.m13569q(viewFindViewById);
            this.f31769a.f31775f.mo3488f(new PointF(pointM13569q.x + (viewFindViewById.getWidth() / 2), pointM13569q.y + (viewFindViewById.getHeight() / 2)));
        }
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo5224d(boolean z) {
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo5225e(boolean z) {
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo5226f(boolean z) {
    }
}
