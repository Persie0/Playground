package za;

import com.google.android.exoplayer2.AbstractC2406e;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import p150h9.InterfaceC5924l0;
import p290o6.C7968m;
import p479xa.C10134c0;
import p479xa.C10151t;

/* JADX INFO: renamed from: za.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10466b extends AbstractC2406e {

    /* JADX INFO: renamed from: H */
    public final DecoderInputBuffer f52331H;

    /* JADX INFO: renamed from: I */
    public final C10151t f52332I;

    /* JADX INFO: renamed from: J */
    public long f52333J;

    /* JADX INFO: renamed from: K */
    public InterfaceC10465a f52334K;

    /* JADX INFO: renamed from: L */
    public long f52335L;

    public C10466b() {
        super(6);
        this.f52331H = new DecoderInputBuffer(1);
        this.f52332I = new C10151t();
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: B */
    public final void mo6864B() {
        InterfaceC10465a interfaceC10465a = this.f52334K;
        if (interfaceC10465a != null) {
            interfaceC10465a.mo7058j();
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: D */
    public final void mo6867D(boolean z10, long j10) {
        this.f52335L = Long.MIN_VALUE;
        InterfaceC10465a interfaceC10465a = this.f52334K;
        if (interfaceC10465a != null) {
            interfaceC10465a.mo7058j();
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: H */
    public final void mo6992H(C2416m[] c2416mArr, long j10, long j11) {
        this.f52333J = j11;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y, p150h9.InterfaceC5924l0
    /* JADX INFO: renamed from: a */
    public final String mo6875a() {
        return "CameraMotionRenderer";
    }

    @Override // p150h9.InterfaceC5924l0
    /* JADX INFO: renamed from: b */
    public final int mo7144b(C2416m c2416m) {
        return "application/x-camera-motion".equals(c2416m.f12484l) ? InterfaceC5924l0.m12343j(4, 0, 0) : InterfaceC5924l0.m12343j(0, 0, 0);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: e */
    public final boolean mo6879e() {
        return true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: p */
    public final void mo7151p(long j10, long j11) {
        float[] fArr;
        while (!mo6997h() && this.f52335L < 100000 + j10) {
            DecoderInputBuffer decoderInputBuffer = this.f52331H;
            decoderInputBuffer.mo6927p();
            C7968m c7968m = this.f12221b;
            c7968m.m15817e();
            if (m6993I(c7968m, decoderInputBuffer, 0) != -4) {
                break;
            }
            if (decoderInputBuffer.m13269m(4)) {
                return;
            }
            this.f52335L = decoderInputBuffer.f12118e;
            if (this.f52334K != null && !decoderInputBuffer.m13270o()) {
                decoderInputBuffer.m6930t();
                ByteBuffer byteBuffer = decoderInputBuffer.f12116c;
                int i10 = C10134c0.f51354a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    C10151t c10151t = this.f52332I;
                    c10151t.m19122C(bArrArray, iLimit);
                    c10151t.m19124E(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i11 = 0; i11 < 3; i11++) {
                        fArr2[i11] = Float.intBitsToFloat(c10151t.m19132g());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f52334K.mo7057b(this.f52335L - this.f52333J, fArr);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e, com.google.android.exoplayer2.C2534w.b
    /* JADX INFO: renamed from: q */
    public final void mo6889q(int i10, Object obj) throws ExoPlaybackException {
        if (i10 == 8) {
            this.f52334K = (InterfaceC10465a) obj;
        }
    }
}
