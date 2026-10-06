package p000;

import com.google.geo.lightfield.processing.ProgressCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class eis implements ProgressCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ eit f14173a;

    public eis(eit eitVar) {
        this.f14173a = eitVar;
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final void setProgress(float f) {
        this.f14173a.f14175a.mo9652b(kbb.m13896b(f));
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final void setRange(float f, float f2) {
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final boolean wasCancelled() {
        return false;
    }
}
