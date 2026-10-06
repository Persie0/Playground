package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.p014ui.widget.ReviewImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cqi implements crf {

    /* JADX INFO: renamed from: a */
    public ReviewImageView f8904a;

    /* JADX INFO: renamed from: b */
    private final jvd f8905b;

    public cqi(iid iidVar, jvd jvdVar) {
        this.f8905b = jvdVar;
        jvdVar.m13541c(new cgl(this, iidVar, 12));
    }

    @Override // p000.crf
    /* JADX INFO: renamed from: a */
    public final void mo5253a() {
        this.f8905b.m13541c(new cmd(this, 18));
    }

    @Override // p000.crf
    /* JADX INFO: renamed from: b */
    public final void mo5254b(Bitmap bitmap) {
        this.f8905b.m13541c(new cgl(this, bitmap, 13));
    }
}
