package com.google.android.exoplayer2.mediacodec;

import ae.C0062b;
import android.media.MediaCodec;
import java.io.IOException;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10147p;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2425b implements InterfaceC2426c.b {
    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c.b
    /* JADX INFO: renamed from: a */
    public final InterfaceC2426c mo7192a(InterfaceC2426c.a aVar) throws IOException {
        int i10 = C10134c0.f51354a;
        if (i10 >= 23 && i10 >= 31) {
            int iM19108h = C10147p.m19108h(aVar.f12612c.f12484l);
            C10145n.m19098f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + C10134c0.m19016A(iM19108h));
            return new C2424a.a(iM19108h).mo7192a(aVar);
        }
        MediaCodec mediaCodecM7203b = null;
        try {
            mediaCodecM7203b = C2429f.a.m7203b(aVar);
            C0062b.m315V("configureCodec");
            mediaCodecM7203b.configure(aVar.f12611b, aVar.f12613d, aVar.f12614e, 0);
            C0062b.m283K0();
            C0062b.m315V("startCodec");
            mediaCodecM7203b.start();
            C0062b.m283K0();
            return new C2429f(mediaCodecM7203b);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodecM7203b != null) {
                mediaCodecM7203b.release();
            }
            throw e10;
        }
    }
}
