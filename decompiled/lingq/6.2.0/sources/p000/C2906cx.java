package p000;

import android.os.HandlerThread;

/* JADX INFO: renamed from: cx */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2906cx implements on9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34669a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f34670b;

    public /* synthetic */ C2906cx(int i, int i2) {
        this.f34669a = i2;
        this.f34670b = i;
    }

    @Override // p000.on9
    public final Object get() {
        int i = this.f34669a;
        int i2 = this.f34670b;
        switch (i) {
            case 0:
                return new HandlerThread(C2943dx.m10710g(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(C2943dx.m10710g(i2, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
