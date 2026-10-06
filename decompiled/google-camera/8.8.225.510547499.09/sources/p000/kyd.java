package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kyd implements kqa {

    /* JADX INFO: renamed from: a */
    public final amv f37718a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f37719b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    private final List f37720c = new ArrayList();

    public kyd(FileOutputStream fileOutputStream, oyo oyoVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            this.f37718a = acw.m246c(fileOutputStream, oyoVar);
        } catch (Exception e) {
            Log.e("GcaMediaMuxer", "Error creating the GCA muxer", e);
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                Log.e("GcaMediaMuxer", "... and close also threw", e2);
            }
            throw new kye(e);
        }
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: a */
    public final int mo14517a(MediaFormat mediaFormat) {
        List list = this.f37720c;
        list.add(this.f37718a.m978f(list.size(), mediaFormat));
        Integer numM203b = acm.m203b(mediaFormat);
        if (numM203b != null) {
            this.f37718a.m974b(numM203b.intValue());
        }
        return this.f37720c.size() - 1;
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: b */
    public final void mo14518b(String str, Object obj) {
        this.f37718a.m973a(str, obj);
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: c */
    public final void mo14519c() {
        m15048j();
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: d */
    public final void mo14520d(float f, float f2) {
        this.f37718a.m975c(f, f2);
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: e */
    public final void mo14521e(int i) {
        this.f37718a.m977e(i);
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: f */
    public final void mo14522f() {
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: g */
    public final void mo14523g() {
        m15048j();
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: h */
    public final void mo14524h(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
        byteBuffer.rewind();
        byteBufferAllocateDirect.put(byteBuffer);
        byteBufferAllocateDirect.flip();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        try {
            this.f37718a.m979g((amy) this.f37720c.get(i), byteBufferAllocateDirect, bufferInfo2);
        } catch (IOException e) {
            throw new kye(e);
        }
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: i */
    public final boolean mo14525i() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m15048j() {
        try {
            if (this.f37719b.getAndSet(true)) {
                return;
            }
            this.f37718a.close();
        } catch (IOException e) {
            throw new kye(e);
        }
    }
}
