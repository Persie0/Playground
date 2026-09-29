package p504y9;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import p479xa.C10129a;

/* JADX INFO: renamed from: y9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10314g extends DecoderInputBuffer {

    /* JADX INFO: renamed from: i */
    public long f51870i;

    /* JADX INFO: renamed from: j */
    public int f51871j;

    /* JADX INFO: renamed from: k */
    public int f51872k;

    public C10314g() {
        super(2);
        this.f51872k = 32;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer
    /* JADX INFO: renamed from: p */
    public final void mo6927p() {
        super.mo6927p();
        this.f51871j = 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m19317u(DecoderInputBuffer decoderInputBuffer) {
        boolean z10;
        ByteBuffer byteBuffer;
        C10129a.m18990b(!decoderInputBuffer.m13269m(1073741824));
        C10129a.m18990b(!decoderInputBuffer.m13269m(268435456));
        C10129a.m18990b(!decoderInputBuffer.m13269m(4));
        int i10 = this.f51871j;
        if (i10 > 0) {
            if (i10 < this.f51872k && decoderInputBuffer.m13270o() == m13270o()) {
                ByteBuffer byteBuffer2 = decoderInputBuffer.f12116c;
                if (byteBuffer2 != null && (byteBuffer = this.f12116c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    }
                }
                z10 = true;
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        int i11 = this.f51871j;
        this.f51871j = i11 + 1;
        if (i11 == 0) {
            this.f12118e = decoderInputBuffer.f12118e;
            if (decoderInputBuffer.m13269m(1)) {
                this.f37591a = 1;
            }
        }
        if (decoderInputBuffer.m13270o()) {
            this.f37591a = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = decoderInputBuffer.f12116c;
        if (byteBuffer3 != null) {
            m6929s(byteBuffer3.remaining());
            this.f12116c.put(byteBuffer3);
        }
        this.f51870i = decoderInputBuffer.f12118e;
        return true;
    }
}
