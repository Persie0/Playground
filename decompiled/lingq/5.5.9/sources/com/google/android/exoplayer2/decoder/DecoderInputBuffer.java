package com.google.android.exoplayer2.decoder;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p003a2.C0009a;
import p150h9.C5941x;
import p218k9.AbstractC6631a;
import p218k9.C6633c;

/* JADX INFO: loaded from: classes.dex */
public class DecoderInputBuffer extends AbstractC6631a {

    /* JADX INFO: renamed from: c */
    public ByteBuffer f12116c;

    /* JADX INFO: renamed from: d */
    public boolean f12117d;

    /* JADX INFO: renamed from: e */
    public long f12118e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f12119f;

    /* JADX INFO: renamed from: g */
    public final int f12120g;

    /* JADX INFO: renamed from: b */
    public final C6633c f12115b = new C6633c();

    /* JADX INFO: renamed from: h */
    public final int f12121h = 0;

    public static final class InsufficientCapacityException extends IllegalStateException {
        public InsufficientCapacityException(int i10, int i11) {
            super(C0009a.m20h("Buffer too small (", i10, " < ", i11, ")"));
        }
    }

    static {
        C5941x.m12374a("goog.exo.decoder");
    }

    public DecoderInputBuffer(int i10) {
        this.f12120g = i10;
    }

    /* JADX INFO: renamed from: p */
    public void mo6927p() {
        this.f37591a = 0;
        ByteBuffer byteBuffer = this.f12116c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f12119f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f12117d = false;
    }

    /* JADX INFO: renamed from: q */
    public final ByteBuffer m6928q(int i10) {
        int i11 = this.f12120g;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f12116c;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    @EnsuresNonNull({"data"})
    /* JADX INFO: renamed from: s */
    public final void m6929s(int i10) {
        int i11 = i10 + this.f12121h;
        ByteBuffer byteBuffer = this.f12116c;
        if (byteBuffer == null) {
            this.f12116c = m6928q(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f12116c = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM6928q = m6928q(i12);
        byteBufferM6928q.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM6928q.put(byteBuffer);
        }
        this.f12116c = byteBufferM6928q;
    }

    /* JADX INFO: renamed from: t */
    public final void m6930t() {
        ByteBuffer byteBuffer = this.f12116c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f12119f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
