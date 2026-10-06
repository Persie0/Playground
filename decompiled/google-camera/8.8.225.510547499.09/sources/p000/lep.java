package p000;

import android.media.MediaCodec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lep implements leu {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MediaCodec.QueueRequest f38070a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f38071b;

    public lep(MediaCodec.QueueRequest queueRequest, int i) {
        this.f38070a = queueRequest;
        this.f38071b = i;
    }

    @Override // p000.leu
    /* JADX INFO: renamed from: a */
    public final int mo15257a() {
        return this.f38071b;
    }

    @Override // p000.leu
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo15258b() {
        return this.f38070a;
    }

    @Override // p000.leu, java.lang.AutoCloseable
    public final void close() {
        this.f38070a.queue();
    }
}
