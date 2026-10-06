package p000;

import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bna implements Camera.PictureCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Handler f3853a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bno f3854b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ bnb f3855c;

    public bna(bnb bnbVar, Handler handler, bno bnoVar) {
        this.f3855c = bnbVar;
        this.f3853a = handler;
        this.f3854b = bnoVar;
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        if (this.f3855c.f3856a.f3880e.m2800a() != 8) {
            bop.m2814c(bnh.f3875a, "picture callback returning when not capturing");
        } else {
            this.f3855c.f3856a.f3880e.m2802c(2);
        }
        this.f3853a.post(new bey(this, bArr, 5));
    }
}
