package p000;

import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bmz implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Handler f3850a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ bnk f3851b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ bnb f3852c;

    public bmz(bnb bnbVar, Handler handler, bnk bnkVar) {
        this.f3852c = bnbVar;
        this.f3850a = handler;
        this.f3851b = bnkVar;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        if (this.f3852c.f3856a.f3880e.m2800a() != 16) {
            bop.m2814c(bnh.f3875a, "onAutoFocus callback returning when not focusing");
        } else {
            this.f3852c.f3856a.f3880e.m2802c(2);
        }
        this.f3850a.post(new bnp(this, z, 1));
    }
}
