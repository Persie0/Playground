package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fpi extends BottomBarListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fpj f23081a;

    public fpi(fpj fpjVar) {
        this.f23081a = fpjVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCameraSwitchButtonClicked() {
        this.f23081a.f23083c.m5233e();
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onRetakeButtonPressed() {
        this.f23081a.m8664x();
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onReviewPlayButtonPressed() {
        synchronized (this.f23081a.f23085e) {
            fpj fpjVar = this.f23081a;
            if (fpjVar.f23089i != null) {
                lku.m15614I(fpjVar.f23087g.mo16813g(), "URI not set.");
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                intent.setDataAndType((Uri) this.f23081a.f23087g.mo16809c(), this.f23081a.f23089i.f9342g.f35097a.f35067f.f37021i);
                try {
                    this.f23081a.f23086f.mo3701o(intent);
                } catch (ActivityNotFoundException e) {
                    ((nbe) ((nbe) ((nbe) fpj.f23082b.m17251b()).mo17283h(e)).mo17276G(2455)).mo17290o("Couldn't view video");
                }
            }
        }
    }
}
