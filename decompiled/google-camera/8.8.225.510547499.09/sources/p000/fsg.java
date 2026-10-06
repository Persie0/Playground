package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fsg extends MediaCodec.Callback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kyt f23457a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ fsi f23458b;

    public fsg(fsi fsiVar, kyt kytVar) {
        this.f23458b = fsiVar;
        this.f23457a = kytVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.f23458b.f23467h.set(true);
        this.f23458b.m8777b(codecException);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        this.f23458b.f23467h.set(true);
        this.f23458b.f23460a.addLast(Integer.valueOf(i));
        this.f23458b.m8778c();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.f23458b.f23467h.set(true);
        this.f23458b.f23461b.addLast(Pair.create(Integer.valueOf(i), bufferInfo));
        this.f23458b.m8778c();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.f23458b.f23467h.set(true);
        this.f23457a.mo8408a(kxk.m14965K(mediaFormat));
    }
}
