package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.C2505u;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2536y;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.C2425b;
import com.google.android.exoplayer2.mediacodec.C2427d;
import com.google.android.exoplayer2.mediacodec.InterfaceC2426c;
import com.google.android.exoplayer2.mediacodec.InterfaceC2428e;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p080e.RunnableC5286r;
import p128g2.RunnableC5682t;
import p150h9.C5926m0;
import p150h9.InterfaceC5924l0;
import p150h9.RunnableC5918i0;
import p174i9.C6215e0;
import p195j9.C6434k;
import p195j9.RunnableC6430g;
import p213k4.RunnableC6590j;
import p218k9.C6635e;
import p218k9.C6637g;
import p290o6.C7968m;
import p402u0.C9369l;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10147p;
import p479xa.InterfaceC10146o;
import p504y9.C10317j;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2374h extends MediaCodecRenderer implements InterfaceC10146o {

    /* JADX INFO: renamed from: X0 */
    public final Context f11990X0;

    /* JADX INFO: renamed from: Y0 */
    public final InterfaceC2368b.a f11991Y0;

    /* JADX INFO: renamed from: Z0 */
    public final AudioSink f11992Z0;

    /* JADX INFO: renamed from: a1 */
    public int f11993a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f11994b1;

    /* JADX INFO: renamed from: c1 */
    public C2416m f11995c1;

    /* JADX INFO: renamed from: d1 */
    public long f11996d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f11997e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f11998f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f11999g1;

    /* JADX INFO: renamed from: h1 */
    public InterfaceC2536y.a f12000h1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.h$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m6893a(AudioSink audioSink, Object obj) {
            audioSink.mo6797e((AudioDeviceInfo) obj);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.h$b */
    public final class b implements AudioSink.InterfaceC2355a {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m6894a(Exception exc) {
            C10145n.m19096d("MediaCodecAudioRenderer", "Audio sink error", exc);
            InterfaceC2368b.a aVar = C2374h.this.f11991Y0;
            Handler handler = aVar.f11945a;
            if (handler != null) {
                handler.post(new RunnableC6590j(aVar, 10, exc));
            }
        }
    }

    public C2374h(Context context, C2425b c2425b, Handler handler, C2413j.b bVar, DefaultAudioSink defaultAudioSink) {
        super(1, c2425b, 44100.0f);
        this.f11990X0 = context.getApplicationContext();
        this.f11992Z0 = defaultAudioSink;
        this.f11991Y0 = new InterfaceC2368b.a(handler, bVar);
        defaultAudioSink.f11897r = new b();
    }

    /* JADX INFO: renamed from: B0 */
    public static ImmutableList m6862B0(InterfaceC2428e interfaceC2428e, C2416m c2416m, boolean z10, AudioSink audioSink) throws MediaCodecUtil.DecoderQueryException {
        String str = c2416m.f12484l;
        if (str == null) {
            return ImmutableList.m9062Y();
        }
        if (audioSink.mo6794b(c2416m)) {
            List<C2427d> listM7165e = MediaCodecUtil.m7165e("audio/raw", false, false);
            C2427d c2427d = listM7165e.isEmpty() ? null : listM7165e.get(0);
            if (c2427d != null) {
                return ImmutableList.m9064b0(c2427d);
            }
        }
        List<C2427d> listMo33a = interfaceC2428e.mo33a(str, z10, false);
        String strM7162b = MediaCodecUtil.m7162b(c2416m);
        if (strM7162b == null) {
            return ImmutableList.m9060Q(listMo33a);
        }
        List<C2427d> listMo33a2 = interfaceC2428e.mo33a(strM7162b, z10, false);
        ImmutableList.C3147b c3147b = ImmutableList.f16043b;
        ImmutableList.C3146a c3146a = new ImmutableList.C3146a();
        c3146a.m9067d(listMo33a);
        c3146a.m9067d(listMo33a2);
        return c3146a.m9068e();
    }

    /* JADX INFO: renamed from: A0 */
    public final int m6863A0(C2416m c2416m, C2427d c2427d) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(c2427d.f12615a) || (i10 = C10134c0.f51354a) >= 24 || (i10 == 23 && C10134c0.m19024I(this.f11990X0))) {
            return c2416m.f12451H;
        }
        return -1;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: B */
    public final void mo6864B() {
        InterfaceC2368b.a aVar = this.f11991Y0;
        this.f11999g1 = true;
        try {
            this.f11992Z0.flush();
            try {
                super.mo6864B();
                aVar.m6851a(this.f12549S0);
            } catch (Throwable th2) {
                aVar.m6851a(this.f12549S0);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                super.mo6864B();
                aVar.m6851a(this.f12549S0);
                throw th3;
            } catch (Throwable th4) {
                aVar.m6851a(this.f12549S0);
                throw th4;
            }
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: C */
    public final void mo6865C(boolean z10, boolean z11) throws ExoPlaybackException {
        C6635e c6635e = new C6635e();
        this.f12549S0 = c6635e;
        InterfaceC2368b.a aVar = this.f11991Y0;
        Handler handler = aVar.f11945a;
        if (handler != null) {
            handler.post(new RunnableC5286r(aVar, 11, c6635e));
        }
        C5926m0 c5926m0 = this.f12222c;
        c5926m0.getClass();
        boolean z12 = c5926m0.f35346a;
        AudioSink audioSink = this.f11992Z0;
        if (z12) {
            audioSink.mo6805m();
        } else {
            audioSink.mo6802j();
        }
        C6215e0 c6215e0 = this.f12224e;
        c6215e0.getClass();
        audioSink.mo6806n(c6215e0);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m6866C0() {
        long jMo6801i = this.f11992Z0.mo6801i(mo6877d());
        if (jMo6801i != Long.MIN_VALUE) {
            if (!this.f11998f1) {
                jMo6801i = Math.max(this.f11996d1, jMo6801i);
            }
            this.f11996d1 = jMo6801i;
            this.f11998f1 = false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: D */
    public final void mo6867D(boolean z10, long j10) throws ExoPlaybackException {
        super.mo6867D(z10, j10);
        this.f11992Z0.flush();
        this.f11996d1 = j10;
        this.f11997e1 = true;
        this.f11998f1 = true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: E */
    public final void mo6868E() {
        AudioSink audioSink = this.f11992Z0;
        try {
            try {
                m7132M();
                m7150o0();
                DrmSession.m6958i(this.f12554V, null);
                this.f12554V = null;
                if (this.f11999g1) {
                    this.f11999g1 = false;
                    audioSink.mo6795c();
                }
            } catch (Throwable th2) {
                DrmSession.m6958i(this.f12554V, null);
                this.f12554V = null;
                throw th2;
            }
        } catch (Throwable th3) {
            if (this.f11999g1) {
                this.f11999g1 = false;
                audioSink.mo6795c();
            }
            throw th3;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: F */
    public final void mo6869F() {
        this.f11992Z0.play();
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: G */
    public final void mo6870G() {
        m6866C0();
        this.f11992Z0.pause();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: K */
    public final C6637g mo6871K(C2427d c2427d, C2416m c2416m, C2416m c2416m2) {
        C6637g c6637gM7196b = c2427d.m7196b(c2416m, c2416m2);
        int iM6863A0 = m6863A0(c2416m2, c2427d);
        int i10 = this.f11993a1;
        int i11 = c6637gM7196b.f37621e;
        if (iM6863A0 > i10) {
            i11 |= 64;
        }
        int i12 = i11;
        return new C6637g(c2427d.f12615a, c2416m, c2416m2, i12 != 0 ? 0 : c6637gM7196b.f37620d, i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: U */
    public final float mo6872U(float f3, C2416m[] c2416mArr) {
        int iMax = -1;
        for (C2416m c2416m : c2416mArr) {
            int i10 = c2416m.f12464U;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f3 * iMax;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: V */
    public final ArrayList mo6873V(InterfaceC2428e interfaceC2428e, C2416m c2416m, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        ImmutableList immutableListM6862B0 = m6862B0(interfaceC2428e, c2416m, z10, this.f11992Z0);
        Pattern pattern = MediaCodecUtil.f12594a;
        ArrayList arrayList = new ArrayList(immutableListM6862B0);
        Collections.sort(arrayList, new C10317j(0, new C9369l(14, c2416m)));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: X */
    public final InterfaceC2426c.a mo6874X(C2427d c2427d, C2416m c2416m, MediaCrypto mediaCrypto, float f3) {
        boolean z10;
        boolean z11;
        C2416m[] c2416mArr = this.f12227h;
        c2416mArr.getClass();
        int iM6863A0 = m6863A0(c2416m, c2427d);
        boolean z12 = false;
        if (c2416mArr.length != 1) {
            for (C2416m c2416m2 : c2416mArr) {
                if (c2427d.m7196b(c2416m, c2416m2).f37620d != 0) {
                    iM6863A0 = Math.max(iM6863A0, m6863A0(c2416m2, c2427d));
                }
            }
        }
        this.f11993a1 = iM6863A0;
        int i10 = C10134c0.f51354a;
        if (i10 < 24 && "OMX.SEC.aac.dec".equals(c2427d.f12615a) && "samsung".equals(C10134c0.f51356c)) {
            String str = C10134c0.f51355b;
            if (str.startsWith("zeroflte") || str.startsWith("herolte") || str.startsWith("heroqlte")) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f11994b1 = z10;
        int i11 = this.f11993a1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", c2427d.f12617c);
        mediaFormat.setInteger("channel-count", c2416m.f12463T);
        int i12 = c2416m.f12464U;
        mediaFormat.setInteger("sample-rate", i12);
        C10129a.m19002n(mediaFormat, c2416m.f12452I);
        C10129a.m19001m(mediaFormat, "max-input-size", i11);
        if (i10 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f3 != -1.0f) {
                if (i10 == 23) {
                    String str2 = C10134c0.f51357d;
                    if ("ZTE B2017G".equals(str2) || "AXON 7 mini".equals(str2)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (!z11) {
                    mediaFormat.setFloat("operating-rate", f3);
                }
            }
        }
        String str3 = c2416m.f12484l;
        if (i10 <= 28 && "audio/ac4".equals(str3)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i10 >= 24) {
            C2416m.a aVar = new C2416m.a();
            aVar.f12501k = "audio/raw";
            aVar.f12514x = c2416m.f12463T;
            aVar.f12515y = i12;
            aVar.f12516z = 4;
            if (this.f11992Z0.mo6808p(aVar.m7128a()) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i10 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if ("audio/raw".equals(c2427d.f12616b) && !"audio/raw".equals(str3)) {
            z12 = true;
        }
        this.f11995c1 = z12 ? c2416m : null;
        return new InterfaceC2426c.a(c2427d, mediaFormat, c2416m, null, mediaCrypto);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y, p150h9.InterfaceC5924l0
    /* JADX INFO: renamed from: a */
    public final String mo6875a() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: c0 */
    public final void mo6876c0(Exception exc) {
        C10145n.m19096d("MediaCodecAudioRenderer", "Audio codec error", exc);
        InterfaceC2368b.a aVar = this.f11991Y0;
        Handler handler = aVar.f11945a;
        if (handler != null) {
            handler.post(new RunnableC5682t(aVar, 9, exc));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC2406e, com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: d */
    public final boolean mo6877d() {
        return this.f12541O0 && this.f11992Z0.mo6796d();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: d0 */
    public final void mo6878d0(String str, long j10, long j11) {
        InterfaceC2368b.a aVar = this.f11991Y0;
        Handler handler = aVar.f11945a;
        if (handler != null) {
            handler.post(new RunnableC6430g(aVar, str, j10, j11, 0));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: e */
    public final boolean mo6879e() {
        if (!this.f11992Z0.mo6799g() && !super.mo6879e()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: e0 */
    public final void mo6880e0(String str) {
        InterfaceC2368b.a aVar = this.f11991Y0;
        Handler handler = aVar.f11945a;
        if (handler != null) {
            handler.post(new RunnableC5286r(aVar, 10, str));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: f0 */
    public final C6637g mo6881f0(C7968m c7968m) throws ExoPlaybackException {
        C6637g c6637gMo6881f0 = super.mo6881f0(c7968m);
        C2416m c2416m = (C2416m) c7968m.f43384b;
        InterfaceC2368b.a aVar = this.f11991Y0;
        Handler handler = aVar.f11945a;
        if (handler != null) {
            handler.post(new RunnableC5918i0(1, aVar, c2416m, c6637gMo6881f0));
        }
        return c6637gMo6881f0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: g0 */
    public final void mo6882g0(C2416m c2416m, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iM19054u;
        int i10;
        C2416m c2416m2 = this.f11995c1;
        int[] iArr = null;
        if (c2416m2 != null) {
            c2416m = c2416m2;
        } else if (this.f12561b0 != null) {
            if ("audio/raw".equals(c2416m.f12484l)) {
                iM19054u = c2416m.f12465V;
            } else if (C10134c0.f51354a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iM19054u = mediaFormat.containsKey("v-bits-per-sample") ? C10134c0.m19054u(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iM19054u = mediaFormat.getInteger("pcm-encoding");
            }
            C2416m.a aVar = new C2416m.a();
            aVar.f12501k = "audio/raw";
            aVar.f12516z = iM19054u;
            aVar.f12485A = c2416m.f12466W;
            aVar.f12486B = c2416m.f12467X;
            aVar.f12514x = mediaFormat.getInteger("channel-count");
            aVar.f12515y = mediaFormat.getInteger("sample-rate");
            C2416m c2416m3 = new C2416m(aVar);
            if (this.f11994b1 && c2416m3.f12463T == 6 && (i10 = c2416m.f12463T) < 6) {
                int[] iArr2 = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr2[i11] = i11;
                }
                iArr = iArr2;
            }
            c2416m = c2416m3;
        }
        try {
            this.f11992Z0.mo6800h(c2416m, iArr);
        } catch (AudioSink.ConfigurationException e10) {
            throw m7009z(5001, e10.f11841a, e10, false);
        }
    }

    @Override // p479xa.InterfaceC10146o
    public final C2505u getPlaybackParameters() {
        return this.f11992Z0.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: h0 */
    public final void mo6883h0(long j10) {
        this.f11992Z0.getClass();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: j0 */
    public final void mo6884j0() {
        this.f11992Z0.mo6804l();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: k0 */
    public final void mo6885k0(DecoderInputBuffer decoderInputBuffer) {
        if (this.f11997e1 && !decoderInputBuffer.m13270o()) {
            if (Math.abs(decoderInputBuffer.f12118e - this.f11996d1) > 500000) {
                this.f11996d1 = decoderInputBuffer.f12118e;
            }
            this.f11997e1 = false;
        }
    }

    @Override // p479xa.InterfaceC10146o
    /* JADX INFO: renamed from: l */
    public final long mo6886l() {
        if (this.f12225f == 2) {
            m6866C0();
        }
        return this.f11996d1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: m0 */
    public final boolean mo6887m0(long j10, long j11, InterfaceC2426c interfaceC2426c, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C2416m c2416m) throws ExoPlaybackException {
        byteBuffer.getClass();
        if (this.f11995c1 != null && (i11 & 2) != 0) {
            interfaceC2426c.getClass();
            interfaceC2426c.mo7186i(i10, false);
            return true;
        }
        AudioSink audioSink = this.f11992Z0;
        if (z10) {
            if (interfaceC2426c != null) {
                interfaceC2426c.mo7186i(i10, false);
            }
            this.f12549S0.f37609f += i12;
            audioSink.mo6804l();
            return true;
        }
        try {
            if (!audioSink.mo6807o(byteBuffer, j12, i12)) {
                return false;
            }
            if (interfaceC2426c != null) {
                interfaceC2426c.mo7186i(i10, false);
            }
            this.f12549S0.f37608e += i12;
            return true;
        } catch (AudioSink.InitializationException e10) {
            throw m7009z(5001, e10.f11844c, e10, e10.f11843b);
        } catch (AudioSink.WriteException e11) {
            throw m7009z(5002, c2416m, e11, e11.f11846b);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: p0 */
    public final void mo6888p0() throws ExoPlaybackException {
        try {
            this.f11992Z0.mo6798f();
        } catch (AudioSink.WriteException e10) {
            throw m7009z(5002, e10.f11847c, e10, e10.f11846b);
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e, com.google.android.exoplayer2.C2534w.b
    /* JADX INFO: renamed from: q */
    public final void mo6889q(int i10, Object obj) throws ExoPlaybackException {
        AudioSink audioSink = this.f11992Z0;
        if (i10 == 2) {
            audioSink.setVolume(((Float) obj).floatValue());
        } else {
            if (i10 == 3) {
                audioSink.mo6803k((C2367a) obj);
                return;
            }
            if (i10 == 6) {
                audioSink.setAuxEffectInfo((C6434k) obj);
                return;
            }
            switch (i10) {
                case 9:
                    audioSink.setSkipSilenceEnabled(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    audioSink.setAudioSessionId(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f12000h1 = (InterfaceC2536y.a) obj;
                    return;
                case 12:
                    if (C10134c0.f51354a >= 23) {
                        a.m6893a(audioSink, obj);
                        return;
                    }
                    break;
                default:
                    return;
            }
        }
    }

    @Override // p479xa.InterfaceC10146o
    public final void setPlaybackParameters(C2505u c2505u) {
        this.f11992Z0.setPlaybackParameters(c2505u);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: v0 */
    public final boolean mo6890v0(C2416m c2416m) {
        return this.f11992Z0.mo6794b(c2416m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: w0 */
    public final int mo6891w0(InterfaceC2428e interfaceC2428e, C2416m c2416m) throws MediaCodecUtil.DecoderQueryException {
        boolean z10;
        int i10 = 0;
        if (!C10147p.m19109i(c2416m.f12484l)) {
            return InterfaceC5924l0.m12343j(0, 0, 0);
        }
        int i11 = C10134c0.f51354a >= 21 ? 32 : 0;
        boolean z11 = true;
        int i12 = c2416m.f12473b0;
        boolean z12 = i12 != 0;
        boolean z13 = i12 == 0 || i12 == 2;
        int i13 = 8;
        int i14 = 4;
        AudioSink audioSink = this.f11992Z0;
        if (z13 && audioSink.mo6794b(c2416m)) {
            if (z12) {
                List<C2427d> listM7165e = MediaCodecUtil.m7165e("audio/raw", false, false);
                if ((listM7165e.isEmpty() ? null : listM7165e.get(0)) != null) {
                }
            }
            return InterfaceC5924l0.m12343j(4, 8, i11);
        }
        if ("audio/raw".equals(c2416m.f12484l) && !audioSink.mo6794b(c2416m)) {
            return InterfaceC5924l0.m12343j(1, 0, 0);
        }
        C2416m.a aVar = new C2416m.a();
        aVar.f12501k = "audio/raw";
        aVar.f12514x = c2416m.f12463T;
        aVar.f12515y = c2416m.f12464U;
        aVar.f12516z = 2;
        if (!audioSink.mo6794b(aVar.m7128a())) {
            return InterfaceC5924l0.m12343j(1, 0, 0);
        }
        ImmutableList immutableListM6862B0 = m6862B0(interfaceC2428e, c2416m, false, audioSink);
        if (immutableListM6862B0.isEmpty()) {
            return InterfaceC5924l0.m12343j(1, 0, 0);
        }
        if (!z13) {
            return InterfaceC5924l0.m12343j(2, 0, 0);
        }
        C2427d c2427d = (C2427d) immutableListM6862B0.get(0);
        boolean zM7198d = c2427d.m7198d(c2416m);
        if (!zM7198d) {
            int i15 = 1;
            while (true) {
                if (i15 >= immutableListM6862B0.size()) {
                    z10 = true;
                    z11 = zM7198d;
                    break;
                }
                C2427d c2427d2 = (C2427d) immutableListM6862B0.get(i15);
                if (c2427d2.m7198d(c2416m)) {
                    z10 = false;
                    c2427d = c2427d2;
                    break;
                }
                i15++;
            }
        } else {
            z10 = true;
            z11 = zM7198d;
            break;
        }
        if (!z11) {
            i14 = 3;
        }
        if (z11 && c2427d.m7199e(c2416m)) {
            i13 = 16;
        }
        int i16 = c2427d.f12621g ? 64 : 0;
        if (z10) {
            i10 = 128;
        }
        return i14 | i13 | i11 | i16 | i10;
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e, com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: x */
    public final InterfaceC10146o mo6892x() {
        return this;
    }
}
