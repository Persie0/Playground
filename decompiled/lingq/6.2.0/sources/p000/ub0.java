package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ub0 extends m32 {

    /* JADX INFO: renamed from: j */
    public long f63661j;

    /* JADX INFO: renamed from: k */
    public int f63662k;

    /* JADX INFO: renamed from: l */
    public int f63663l;

    @Override // p000.m32
    /* JADX INFO: renamed from: k */
    public final void mo16607k() {
        super.mo16607k();
        this.f63662k = 0;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22665p(m32 m32Var) {
        ByteBuffer byteBuffer;
        bna.m3969q(!m32Var.m3751d(1073741824));
        bna.m3969q(!m32Var.m3751d(268435456));
        bna.m3969q(!m32Var.m3751d(4));
        if (m22666q()) {
            if (this.f63662k >= this.f63663l) {
                return false;
            }
            ByteBuffer byteBuffer2 = m32Var.f50500e;
            if (byteBuffer2 != null && (byteBuffer = this.f50500e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f63662k;
        this.f63662k = i + 1;
        if (i == 0) {
            this.f50502g = m32Var.f50502g;
            if (m32Var.m3751d(1)) {
                this.f8576b = 1;
            }
        }
        ByteBuffer byteBuffer3 = m32Var.f50500e;
        if (byteBuffer3 != null) {
            m16609n(byteBuffer3.remaining());
            this.f50500e.put(byteBuffer3);
        }
        this.f63661j = m32Var.f50502g;
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m22666q() {
        return this.f63662k > 0;
    }
}
