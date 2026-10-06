package p000;

import android.view.View;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;

/* JADX INFO: renamed from: bk */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0065bk implements ale {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DialogInterfaceOnCancelListenerC0067bm f3559a;

    public C0065bk(DialogInterfaceOnCancelListenerC0067bm dialogInterfaceOnCancelListenerC0067bm) {
        this.f3559a = dialogInterfaceOnCancelListenerC0067bm;
    }

    @Override // p000.ale
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo906a(Object obj) {
        if (((akv) obj) != null) {
            DialogInterfaceOnCancelListenerC0067bm dialogInterfaceOnCancelListenerC0067bm = this.f3559a;
            if (dialogInterfaceOnCancelListenerC0067bm.f3749b) {
                View viewRequireView = dialogInterfaceOnCancelListenerC0067bm.requireView();
                if (viewRequireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (this.f3559a.f3750c != null) {
                    if (C0111cq.m5275S(3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(xPAWq.udIAzEs);
                        sb.append(this);
                        sb.append(" setting the content view on ");
                        sb.append(this.f3559a.f3750c);
                    }
                    this.f3559a.f3750c.setContentView(viewRequireView);
                }
            }
        }
    }
}
