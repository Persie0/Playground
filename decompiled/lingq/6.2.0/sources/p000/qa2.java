package p000;

import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class qa2 extends o79 implements xm9 {

    /* JADX INFO: renamed from: n */
    public final cn9 f57487n;

    public qa2(cn9 cn9Var) {
        super(new zm9[2], new vo0[2]);
        int i = this.f53949g;
        m32[] m32VarArr = this.f53947e;
        bna.m3987z(i == m32VarArr.length);
        for (m32 m32Var : m32VarArr) {
            m32Var.m16609n(1024);
        }
        this.f57487n = cn9Var;
    }

    @Override // p000.xm9
    /* JADX INFO: renamed from: c */
    public final void mo19837c(long j) {
    }

    @Override // p000.o79
    /* JADX INFO: renamed from: g */
    public final m32 mo11041g() {
        return new zm9(1);
    }

    @Override // p000.o79
    /* JADX INFO: renamed from: h */
    public final n32 mo11042h() {
        return new vo0(this);
    }

    @Override // p000.o79
    /* JADX INFO: renamed from: i */
    public final DecoderException mo11043i(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // p000.o79
    /* JADX INFO: renamed from: j */
    public final DecoderException mo11044j(m32 m32Var, n32 n32Var, boolean z) {
        zm9 zm9Var = (zm9) m32Var;
        vo0 vo0Var = (vo0) n32Var;
        try {
            ByteBuffer byteBuffer = zm9Var.f50500e;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            cn9 cn9Var = this.f57487n;
            if (z) {
                cn9Var.reset();
            }
            wm9 wm9VarMo4903i = cn9Var.mo4903i(bArrArray, 0, iLimit);
            long j = zm9Var.f50502g;
            long j2 = zm9Var.f71783j;
            vo0Var.f52260c = j;
            vo0Var.f65686e = wm9VarMo4903i;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            vo0Var.f65687f = j;
            vo0Var.f52261d = false;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }
}
