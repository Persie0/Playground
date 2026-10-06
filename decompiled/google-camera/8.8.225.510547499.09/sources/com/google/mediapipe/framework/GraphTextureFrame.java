package com.google.mediapipe.framework;

import java.util.HashSet;
import java.util.Set;
import p000.nbe;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GraphTextureFrame implements TextureFrame {

    /* JADX INFO: renamed from: d */
    private static final nbh f8423d = nbh.m17259h("com/google/mediapipe/framework/GraphTextureFrame");

    /* JADX INFO: renamed from: a */
    public final int f8424a;

    /* JADX INFO: renamed from: b */
    public final int f8425b;

    /* JADX INFO: renamed from: c */
    public long f8426c;

    /* JADX INFO: renamed from: e */
    private long f8427e;

    /* JADX INFO: renamed from: f */
    private final int f8428f;

    /* JADX INFO: renamed from: g */
    private final Set f8429g = new HashSet();

    /* JADX INFO: renamed from: h */
    private int f8430h = 1;

    public GraphTextureFrame(long j, long j2) {
        this.f8426c = Long.MIN_VALUE;
        this.f8427e = j;
        this.f8428f = nativeGetTextureName(j);
        this.f8424a = nativeGetWidth(this.f8427e);
        this.f8425b = nativeGetHeight(this.f8427e);
        this.f8426c = j2;
    }

    private native long nativeCreateSyncTokenForCurrentExternalContext(long j);

    private native void nativeDidRead(long j, long j2);

    private native long nativeGetCurrentExternalContextHandle();

    private native int nativeGetHeight(long j);

    private native int nativeGetTextureName(long j);

    private native int nativeGetWidth(long j);

    private native void nativeReleaseBuffer(long j);

    protected final void finalize() {
        if (this.f8430h > 0 || this.f8427e != 0) {
            ((nbe) ((nbe) f8423d.m17252c()).mo17276G((char) 4603)).mo17290o("release was not called before finalize");
        }
        if (this.f8429g.isEmpty()) {
            return;
        }
        ((nbe) ((nbe) f8423d.m17252c()).mo17276G((char) 4604)).mo17290o("active consumers did not release with sync before finalize");
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getHeight() {
        return this.f8425b;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final synchronized int getTextureName() {
        if (this.f8427e == 0) {
            return 0;
        }
        this.f8429g.add(Long.valueOf(nativeGetCurrentExternalContextHandle()));
        return this.f8428f;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final long getTimestamp() {
        return this.f8426c;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getWidth() {
        return this.f8424a;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final synchronized void release() {
        release(this.f8429g.remove(Long.valueOf(nativeGetCurrentExternalContextHandle())) ? new GraphGlSyncToken(nativeCreateSyncTokenForCurrentExternalContext(this.f8427e)) : null);
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final synchronized void retain() {
        this.f8430h++;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final boolean supportsRetain() {
        return true;
    }

    @Override // com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public final synchronized void release(GlSyncToken glSyncToken) {
        if (this.f8427e == 0) {
            if (glSyncToken != null) {
                ((nbe) ((nbe) f8423d.m17252c()).mo17276G((char) 4605)).mo17290o("release with sync token, but handle is 0");
            }
            return;
        }
        if (glSyncToken != null) {
            nativeDidRead(this.f8427e, glSyncToken.nativeToken());
            glSyncToken.release();
        }
        int i = this.f8430h - 1;
        this.f8430h = i;
        if (i <= 0) {
            nativeReleaseBuffer(this.f8427e);
            this.f8427e = 0L;
        }
    }
}
