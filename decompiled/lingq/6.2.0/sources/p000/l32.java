package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class l32 {

    /* JADX INFO: renamed from: a */
    public int f48968a;

    /* JADX INFO: renamed from: b */
    public int f48969b;

    /* JADX INFO: renamed from: c */
    public int f48970c;

    /* JADX INFO: renamed from: d */
    public int f48971d;

    /* JADX INFO: renamed from: e */
    public int f48972e;

    /* JADX INFO: renamed from: f */
    public int f48973f;

    /* JADX INFO: renamed from: g */
    public int f48974g;

    /* JADX INFO: renamed from: h */
    public int f48975h;

    /* JADX INFO: renamed from: i */
    public int f48976i;

    /* JADX INFO: renamed from: j */
    public int f48977j;

    /* JADX INFO: renamed from: k */
    public long f48978k;

    /* JADX INFO: renamed from: l */
    public int f48979l;

    public final String toString() {
        int i = this.f48968a;
        int i2 = this.f48969b;
        int i3 = this.f48970c;
        int i4 = this.f48971d;
        int i5 = this.f48972e;
        int i6 = this.f48973f;
        int i7 = this.f48974g;
        int i8 = this.f48975h;
        int i9 = this.f48976i;
        int i10 = this.f48977j;
        long j = this.f48978k;
        int i11 = this.f48979l;
        String str = uma.f64080a;
        Locale locale = Locale.US;
        StringBuilder sbM22994q = ux5.m22994q(i, i2, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        hn1.m13360j(i3, i4, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", sbM22994q);
        hn1.m13360j(i5, i6, "\n skippedOutputBuffers=", "\n droppedBuffers=", sbM22994q);
        hn1.m13360j(i7, i8, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", sbM22994q);
        hn1.m13360j(i9, i10, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", sbM22994q);
        sbM22994q.append(j);
        sbM22994q.append("\n videoFrameProcessingOffsetCount=");
        sbM22994q.append(i11);
        sbM22994q.append("\n}");
        return sbM22994q.toString();
    }
}
