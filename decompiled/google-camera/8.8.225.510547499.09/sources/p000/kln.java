package p000;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kln {

    /* JADX INFO: renamed from: a */
    public final CaptureRequest.Builder f36479a;

    public kln(CaptureRequest.Builder builder) {
        this.f36479a = builder;
    }

    /* JADX INFO: renamed from: a */
    public final kpk m14502a() {
        return new klm(this.f36479a.build());
    }

    /* JADX INFO: renamed from: b */
    public final void m14503b(CaptureRequest.Key key, Object obj) {
        CaptureRequest.Builder builder = this.f36479a;
        key.getName();
        builder.set(key, obj);
    }
}
