package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.C2416m;
import java.io.IOException;
import java.nio.ByteBuffer;
import p218k9.C6633c;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2426c {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C2427d f12610a;

        /* JADX INFO: renamed from: b */
        public final MediaFormat f12611b;

        /* JADX INFO: renamed from: c */
        public final C2416m f12612c;

        /* JADX INFO: renamed from: d */
        public final Surface f12613d;

        /* JADX INFO: renamed from: e */
        public final MediaCrypto f12614e;

        public a(C2427d c2427d, MediaFormat mediaFormat, C2416m c2416m, Surface surface, MediaCrypto mediaCrypto) {
            this.f12610a = c2427d;
            this.f12611b = mediaFormat;
            this.f12612c = c2416m;
            this.f12613d = surface;
            this.f12614e = mediaCrypto;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        InterfaceC2426c mo7192a(a aVar) throws IOException;
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.c$c */
    public interface c {
    }

    /* JADX INFO: renamed from: a */
    void mo7178a();

    /* JADX INFO: renamed from: b */
    MediaFormat mo7179b();

    /* JADX INFO: renamed from: c */
    void mo7180c(Bundle bundle);

    /* JADX INFO: renamed from: d */
    void mo7181d(int i10, long j10);

    /* JADX INFO: renamed from: e */
    int mo7182e();

    /* JADX INFO: renamed from: f */
    int mo7183f(MediaCodec.BufferInfo bufferInfo);

    void flush();

    /* JADX INFO: renamed from: g */
    void mo7184g(int i10, int i11, int i12, long j10);

    /* JADX INFO: renamed from: h */
    void mo7185h(c cVar, Handler handler);

    /* JADX INFO: renamed from: i */
    void mo7186i(int i10, boolean z10);

    /* JADX INFO: renamed from: j */
    void mo7187j(int i10, C6633c c6633c, long j10);

    /* JADX INFO: renamed from: k */
    ByteBuffer mo7188k(int i10);

    /* JADX INFO: renamed from: l */
    void mo7189l(Surface surface);

    /* JADX INFO: renamed from: m */
    ByteBuffer mo7190m(int i10);

    void release();

    void setVideoScalingMode(int i10);
}
