package p000;

import android.media.MediaRecorder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kaa implements MediaRecorder.OnInfoListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kab f35439a;

    /* JADX INFO: renamed from: b */
    private boolean f35440b;

    /* JADX INFO: renamed from: c */
    private boolean f35441c;

    public kaa(kab kabVar) {
        this.f35439a = kabVar;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, jyt] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, jyt] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, jyt] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, jyt] */
    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 801) {
            if (this.f35441c) {
                return;
            }
            this.f35441c = true;
            this.f35439a.f35442a.mo5351g();
            return;
        }
        if (i == 800) {
            if (this.f35440b) {
                return;
            }
            this.f35440b = true;
            this.f35439a.f35442a.mo5349e();
            return;
        }
        if (i == 802) {
            this.f35439a.f35442a.mo5350f();
        } else if (i == 803) {
            this.f35439a.f35442a.mo5352h();
        }
    }
}
