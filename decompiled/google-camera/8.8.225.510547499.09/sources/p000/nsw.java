package p000;

import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.hdrplus.EncodedBlobCallback;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nsw implements EncodedBlobCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f44454a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f44455b;

    public /* synthetic */ nsw(EncodedBlobCallback encodedBlobCallback, int i) {
        this.f44455b = i;
        this.f44454a = encodedBlobCallback;
    }

    public /* synthetic */ nsw(eem eemVar, int i) {
        this.f44455b = i;
        this.f44454a = eemVar;
    }

    @Override // com.google.googlex.gcam.hdrplus.EncodedBlobCallback
    public final void onDataAvailable(int i, ByteBuffer byteBuffer, int i2, int i3) {
        switch (this.f44455b) {
            case 0:
                Object obj = this.f44454a;
                ByteBuffer byteBufferM4905d = BufferUtils.m4905d(byteBuffer, true);
                Object obj2 = ((nsw) obj).f44454a;
                byteBufferM4905d.capacity();
                eem eemVar = (eem) obj2;
                lku.m15613H(eemVar.f13672s == 1);
                ((eda) eemVar.f13665l.m7230c().mo16809c()).mo7062a(new bko(byteBufferM4905d));
                break;
            default:
                Object obj3 = this.f44454a;
                byteBuffer.capacity();
                eem eemVar2 = (eem) obj3;
                lku.m15613H(eemVar2.f13672s == 1);
                ((eda) eemVar2.f13665l.m7230c().mo16809c()).mo7062a(new bko(byteBuffer));
                break;
        }
    }
}
