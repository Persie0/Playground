package p000;

import android.media.MediaCodec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fjf implements flt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f22219a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f22220b;

    public /* synthetic */ fjf(MediaCodec.BufferInfo bufferInfo, int i) {
        this.f22220b = i;
        this.f22219a = bufferInfo;
    }

    public /* synthetic */ fjf(gsr gsrVar, int i) {
        this.f22220b = i;
        this.f22219a = gsrVar;
    }

    @Override // p000.flt
    /* JADX INFO: renamed from: a */
    public final void mo8486a(Object obj) {
        switch (this.f22220b) {
            case 0:
                ((fje) obj).f22213c.mo14894e(this.f22219a);
                break;
            default:
                ((fje) obj).f22214d.mo14894e(this.f22219a);
                break;
        }
    }
}
