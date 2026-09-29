package com.google.android.exoplayer2.mediacodec;

import ae.C0062b;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.AbstractC2406e;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.kochava.tracker.BuildConfig;
import ga.InterfaceC5731n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p003a2.C0009a;
import p150h9.C5903b;
import p174i9.C6215e0;
import p195j9.C6436m;
import p218k9.C6633c;
import p218k9.C6635e;
import p218k9.C6637g;
import p218k9.InterfaceC6632b;
import p239l9.C7291f;
import p290o6.C7968m;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10148q;
import p479xa.C10157z;
import p504y9.C10314g;
import p504y9.C10315h;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaCodecRenderer extends AbstractC2406e {

    /* JADX INFO: renamed from: W0 */
    public static final byte[] f12518W0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A0 */
    public boolean f12519A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f12520B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f12521C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f12522D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f12523E0;

    /* JADX INFO: renamed from: F0 */
    public int f12524F0;

    /* JADX INFO: renamed from: G0 */
    public int f12525G0;

    /* JADX INFO: renamed from: H */
    public final InterfaceC2426c.b f12526H;

    /* JADX INFO: renamed from: H0 */
    public int f12527H0;

    /* JADX INFO: renamed from: I */
    public final InterfaceC2428e f12528I;

    /* JADX INFO: renamed from: I0 */
    public boolean f12529I0;

    /* JADX INFO: renamed from: J */
    public final boolean f12530J;

    /* JADX INFO: renamed from: J0 */
    public boolean f12531J0;

    /* JADX INFO: renamed from: K */
    public final float f12532K;

    /* JADX INFO: renamed from: K0 */
    public boolean f12533K0;

    /* JADX INFO: renamed from: L */
    public final DecoderInputBuffer f12534L;

    /* JADX INFO: renamed from: L0 */
    public long f12535L0;

    /* JADX INFO: renamed from: M */
    public final DecoderInputBuffer f12536M;

    /* JADX INFO: renamed from: M0 */
    public long f12537M0;

    /* JADX INFO: renamed from: N */
    public final DecoderInputBuffer f12538N;

    /* JADX INFO: renamed from: N0 */
    public boolean f12539N0;

    /* JADX INFO: renamed from: O */
    public final C10314g f12540O;

    /* JADX INFO: renamed from: O0 */
    public boolean f12541O0;

    /* JADX INFO: renamed from: P */
    public final ArrayList<Long> f12542P;

    /* JADX INFO: renamed from: P0 */
    public boolean f12543P0;

    /* JADX INFO: renamed from: Q */
    public final MediaCodec.BufferInfo f12544Q;

    /* JADX INFO: renamed from: Q0 */
    public boolean f12545Q0;

    /* JADX INFO: renamed from: R */
    public final ArrayDeque<C2418b> f12546R;

    /* JADX INFO: renamed from: R0 */
    public ExoPlaybackException f12547R0;

    /* JADX INFO: renamed from: S */
    public C2416m f12548S;

    /* JADX INFO: renamed from: S0 */
    public C6635e f12549S0;

    /* JADX INFO: renamed from: T */
    public C2416m f12550T;

    /* JADX INFO: renamed from: T0 */
    public C2418b f12551T0;

    /* JADX INFO: renamed from: U */
    public DrmSession f12552U;

    /* JADX INFO: renamed from: U0 */
    public long f12553U0;

    /* JADX INFO: renamed from: V */
    public DrmSession f12554V;

    /* JADX INFO: renamed from: V0 */
    public boolean f12555V0;

    /* JADX INFO: renamed from: W */
    public MediaCrypto f12556W;

    /* JADX INFO: renamed from: X */
    public boolean f12557X;

    /* JADX INFO: renamed from: Y */
    public final long f12558Y;

    /* JADX INFO: renamed from: Z */
    public float f12559Z;

    /* JADX INFO: renamed from: a0 */
    public float f12560a0;

    /* JADX INFO: renamed from: b0 */
    public InterfaceC2426c f12561b0;

    /* JADX INFO: renamed from: c0 */
    public C2416m f12562c0;

    /* JADX INFO: renamed from: d0 */
    public MediaFormat f12563d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f12564e0;

    /* JADX INFO: renamed from: f0 */
    public float f12565f0;

    /* JADX INFO: renamed from: g0 */
    public ArrayDeque<C2427d> f12566g0;

    /* JADX INFO: renamed from: h0 */
    public DecoderInitializationException f12567h0;

    /* JADX INFO: renamed from: i0 */
    public C2427d f12568i0;

    /* JADX INFO: renamed from: j0 */
    public int f12569j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f12570k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f12571l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f12572m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f12573n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f12574o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f12575p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f12576q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f12577r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f12578s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f12579t0;

    /* JADX INFO: renamed from: u0 */
    public C10315h f12580u0;

    /* JADX INFO: renamed from: v0 */
    public long f12581v0;

    /* JADX INFO: renamed from: w0 */
    public int f12582w0;

    /* JADX INFO: renamed from: x0 */
    public int f12583x0;

    /* JADX INFO: renamed from: y0 */
    public ByteBuffer f12584y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f12585z0;

    public static class DecoderInitializationException extends Exception {

        /* JADX INFO: renamed from: a */
        public final String f12586a;

        /* JADX INFO: renamed from: b */
        public final boolean f12587b;

        /* JADX INFO: renamed from: c */
        public final C2427d f12588c;

        /* JADX INFO: renamed from: d */
        public final String f12589d;

        public DecoderInitializationException(int i10, C2416m c2416m, MediaCodecUtil.DecoderQueryException decoderQueryException, boolean z10) {
            this("Decoder init failed: [" + i10 + "], " + c2416m, decoderQueryException, c2416m.f12484l, z10, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
        }

        public DecoderInitializationException(String str, Throwable th2, String str2, boolean z10, C2427d c2427d, String str3) {
            super(str, th2);
            this.f12586a = str2;
            this.f12587b = z10;
            this.f12588c = c2427d;
            this.f12589d = str3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$a */
    public static final class C2417a {
        /* JADX INFO: renamed from: a */
        public static void m7160a(InterfaceC2426c.a aVar, C6215e0 c6215e0) {
            C6215e0.a aVar2 = c6215e0.f36164a;
            aVar2.getClass();
            LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            LogSessionId logSessionId2 = aVar2.f36166a;
            if (logSessionId2.equals(logSessionId)) {
                return;
            }
            aVar.f12611b.setString("log-session-id", logSessionId2.getStringId());
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b */
    public static final class C2418b {

        /* JADX INFO: renamed from: d */
        public static final C2418b f12590d = new C2418b(-9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a */
        public final long f12591a;

        /* JADX INFO: renamed from: b */
        public final long f12592b;

        /* JADX INFO: renamed from: c */
        public final C10157z<C2416m> f12593c = new C10157z<>();

        public C2418b(long j10, long j11) {
            this.f12591a = j10;
            this.f12592b = j11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecRenderer(int i10, C2425b c2425b, float f3) {
        super(i10);
        C0009a c0009a = InterfaceC2428e.f12623q;
        this.f12526H = c2425b;
        this.f12528I = c0009a;
        this.f12530J = false;
        this.f12532K = f3;
        this.f12534L = new DecoderInputBuffer(0);
        this.f12536M = new DecoderInputBuffer(0);
        this.f12538N = new DecoderInputBuffer(2);
        C10314g c10314g = new C10314g();
        this.f12540O = c10314g;
        this.f12542P = new ArrayList<>();
        this.f12544Q = new MediaCodec.BufferInfo();
        this.f12559Z = 1.0f;
        this.f12560a0 = 1.0f;
        this.f12558Y = -9223372036854775807L;
        this.f12546R = new ArrayDeque<>();
        m7155t0(C2418b.f12590d);
        c10314g.m6929s(0);
        c10314g.f12116c.order(ByteOrder.nativeOrder());
        this.f12565f0 = -1.0f;
        this.f12569j0 = 0;
        this.f12524F0 = 0;
        this.f12582w0 = -1;
        this.f12583x0 = -1;
        this.f12581v0 = -9223372036854775807L;
        this.f12535L0 = -9223372036854775807L;
        this.f12537M0 = -9223372036854775807L;
        this.f12553U0 = -9223372036854775807L;
        this.f12525G0 = 0;
        this.f12527H0 = 0;
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: B */
    public void mo6864B() {
        this.f12548S = null;
        m7155t0(C2418b.f12590d);
        this.f12546R.clear();
        m7137R();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: D */
    public void mo6867D(boolean z10, long j10) throws ExoPlaybackException {
        int i10;
        this.f12539N0 = false;
        this.f12541O0 = false;
        this.f12545Q0 = false;
        if (this.f12520B0) {
            this.f12540O.mo6927p();
            this.f12538N.mo6927p();
            this.f12521C0 = false;
        } else if (m7137R()) {
            m7143a0();
        }
        C10157z<C2416m> c10157z = this.f12551T0.f12593c;
        synchronized (c10157z) {
            try {
                i10 = c10157z.f51459d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i10 > 0) {
            this.f12543P0 = true;
        }
        this.f12551T0.f12593c.m19166b();
        this.f12546R.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r10 >= r8.f12535L0) goto L12;
     */
    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6992H(C2416m[] c2416mArr, long j10, long j11) throws ExoPlaybackException {
        if (this.f12551T0.f12592b != -9223372036854775807L) {
            ArrayDeque<C2418b> arrayDeque = this.f12546R;
            if (arrayDeque.isEmpty()) {
                long j12 = this.f12553U0;
                if (j12 != -9223372036854775807L) {
                }
            }
            arrayDeque.add(new C2418b(this.f12535L0, j11));
            return;
        }
        m7155t0(new C2418b(-9223372036854775807L, j11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.google.android.exoplayer2.e, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer] */
    /* JADX INFO: renamed from: J */
    public final boolean m7130J(long j10, long j11) throws ExoPlaybackException {
        ?? r10;
        C10314g c10314g;
        C10129a.m18992d(!this.f12541O0);
        C10314g c10314g2 = this.f12540O;
        int i10 = c10314g2.f51871j;
        if (!(i10 > 0)) {
            r10 = 0;
            c10314g = c10314g2;
        } else {
            if (!mo6887m0(j10, j11, null, c10314g2.f12116c, this.f12583x0, 0, i10, c10314g2.f12118e, c10314g2.m13270o(), c10314g2.m13269m(4), this.f12550T)) {
                return false;
            }
            c10314g = c10314g2;
            mo7146i0(c10314g.f51870i);
            c10314g.mo6927p();
            r10 = 0;
        }
        if (this.f12539N0) {
            this.f12541O0 = true;
            return r10;
        }
        boolean z10 = this.f12521C0;
        DecoderInputBuffer decoderInputBuffer = this.f12538N;
        if (z10) {
            C10129a.m18992d(c10314g.m19317u(decoderInputBuffer));
            this.f12521C0 = r10;
        }
        if (this.f12522D0) {
            if ((c10314g.f51871j > 0 ? 1 : r10) != 0) {
                return true;
            }
            m7132M();
            this.f12522D0 = r10;
            m7143a0();
            if (!this.f12520B0) {
                return r10;
            }
        }
        C10129a.m18992d(!this.f12539N0);
        C7968m c7968m = this.f12221b;
        c7968m.m15817e();
        decoderInputBuffer.mo6927p();
        while (true) {
            decoderInputBuffer.mo6927p();
            int iM6993I = m6993I(c7968m, decoderInputBuffer, r10);
            if (iM6993I == -5) {
                mo6881f0(c7968m);
                break;
            }
            if (iM6993I != -4) {
                if (iM6993I == -3) {
                    break;
                }
                throw new IllegalStateException();
            }
            if (decoderInputBuffer.m13269m(4)) {
                this.f12539N0 = true;
                break;
            }
            if (this.f12543P0) {
                C2416m c2416m = this.f12548S;
                c2416m.getClass();
                this.f12550T = c2416m;
                mo6882g0(c2416m, null);
                this.f12543P0 = r10;
            }
            decoderInputBuffer.m6930t();
            if (!c10314g.m19317u(decoderInputBuffer)) {
                this.f12521C0 = true;
                break;
            }
        }
        if ((c10314g.f51871j > 0 ? 1 : r10) != 0) {
            c10314g.m6930t();
        }
        if ((c10314g.f51871j > 0 ? 1 : r10) != 0 || this.f12539N0 || this.f12522D0) {
            return true;
        }
        return r10;
    }

    /* JADX INFO: renamed from: K */
    public abstract C6637g mo6871K(C2427d c2427d, C2416m c2416m, C2416m c2416m2);

    /* JADX INFO: renamed from: L */
    public MediaCodecDecoderException mo7131L(IllegalStateException illegalStateException, C2427d c2427d) {
        return new MediaCodecDecoderException(illegalStateException, c2427d);
    }

    /* JADX INFO: renamed from: M */
    public final void m7132M() {
        this.f12522D0 = false;
        this.f12540O.mo6927p();
        this.f12538N.mo6927p();
        this.f12521C0 = false;
        this.f12520B0 = false;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: N */
    public final boolean m7133N() throws ExoPlaybackException {
        if (this.f12529I0) {
            this.f12525G0 = 1;
            if (!this.f12571l0 && !this.f12573n0) {
                this.f12527H0 = 2;
            }
            this.f12527H0 = 3;
            return false;
        }
        m7158y0();
        return true;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m7134O(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        MediaCodec.BufferInfo bufferInfo;
        boolean zMo6887m0;
        int iMo7183f;
        boolean z11;
        boolean z12 = this.f12583x0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f12544Q;
        if (!z12) {
            if (this.f12574o0 && this.f12531J0) {
                try {
                    iMo7183f = this.f12561b0.mo7183f(bufferInfo2);
                } catch (IllegalStateException unused) {
                    m7147l0();
                    if (this.f12541O0) {
                        m7150o0();
                    }
                    return false;
                }
            } else {
                iMo7183f = this.f12561b0.mo7183f(bufferInfo2);
            }
            if (iMo7183f < 0) {
                if (iMo7183f != -2) {
                    if (this.f12579t0 && (this.f12539N0 || this.f12525G0 == 2)) {
                        m7147l0();
                    }
                    return false;
                }
                this.f12533K0 = true;
                MediaFormat mediaFormatMo7179b = this.f12561b0.mo7179b();
                if (this.f12569j0 != 0 && mediaFormatMo7179b.getInteger("width") == 32 && mediaFormatMo7179b.getInteger("height") == 32) {
                    this.f12578s0 = true;
                } else {
                    if (this.f12576q0) {
                        mediaFormatMo7179b.setInteger("channel-count", 1);
                    }
                    this.f12563d0 = mediaFormatMo7179b;
                    this.f12564e0 = true;
                }
                return true;
            }
            if (this.f12578s0) {
                this.f12578s0 = false;
                this.f12561b0.mo7186i(iMo7183f, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m7147l0();
                return false;
            }
            this.f12583x0 = iMo7183f;
            ByteBuffer byteBufferMo7190m = this.f12561b0.mo7190m(iMo7183f);
            this.f12584y0 = byteBufferMo7190m;
            if (byteBufferMo7190m != null) {
                byteBufferMo7190m.position(bufferInfo2.offset);
                this.f12584y0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f12575p0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j12 = this.f12535L0;
                if (j12 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j12;
                }
            }
            long j13 = bufferInfo2.presentationTimeUs;
            ArrayList<Long> arrayList = this.f12542P;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z11 = false;
                    break;
                }
                if (arrayList.get(i10).longValue() == j13) {
                    arrayList.remove(i10);
                    z11 = true;
                    break;
                }
                i10++;
            }
            this.f12585z0 = z11;
            long j14 = this.f12537M0;
            long j15 = bufferInfo2.presentationTimeUs;
            this.f12519A0 = j14 == j15;
            m7159z0(j15);
        }
        if (this.f12574o0 && this.f12531J0) {
            try {
                z10 = false;
                try {
                    zMo6887m0 = mo6887m0(j10, j11, this.f12561b0, this.f12584y0, this.f12583x0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f12585z0, this.f12519A0, this.f12550T);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    m7147l0();
                    if (this.f12541O0) {
                        m7150o0();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            bufferInfo = bufferInfo2;
            zMo6887m0 = mo6887m0(j10, j11, this.f12561b0, this.f12584y0, this.f12583x0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f12585z0, this.f12519A0, this.f12550T);
        }
        if (zMo6887m0) {
            mo7146i0(bufferInfo.presentationTimeUs);
            boolean z13 = (bufferInfo.flags & 4) != 0 ? true : z10;
            this.f12583x0 = -1;
            this.f12584y0 = null;
            if (!z13) {
                return r13;
            }
            m7147l0();
        }
        return z10;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m7135P() throws ExoPlaybackException {
        InterfaceC2426c interfaceC2426c = this.f12561b0;
        if (interfaceC2426c == null || this.f12525G0 == 2 || this.f12539N0) {
            return false;
        }
        int i10 = this.f12582w0;
        DecoderInputBuffer decoderInputBuffer = this.f12536M;
        if (i10 < 0) {
            int iMo7182e = interfaceC2426c.mo7182e();
            this.f12582w0 = iMo7182e;
            if (iMo7182e < 0) {
                return false;
            }
            decoderInputBuffer.f12116c = this.f12561b0.mo7188k(iMo7182e);
            decoderInputBuffer.mo6927p();
        }
        if (this.f12525G0 == 1) {
            if (!this.f12579t0) {
                this.f12531J0 = true;
                this.f12561b0.mo7184g(this.f12582w0, 0, 4, 0L);
                this.f12582w0 = -1;
                decoderInputBuffer.f12116c = null;
            }
            this.f12525G0 = 2;
            return false;
        }
        if (this.f12577r0) {
            this.f12577r0 = false;
            decoderInputBuffer.f12116c.put(f12518W0);
            this.f12561b0.mo7184g(this.f12582w0, 38, 0, 0L);
            this.f12582w0 = -1;
            decoderInputBuffer.f12116c = null;
            this.f12529I0 = true;
            return true;
        }
        if (this.f12524F0 == 1) {
            for (int i11 = 0; i11 < this.f12562c0.f12452I.size(); i11++) {
                decoderInputBuffer.f12116c.put(this.f12562c0.f12452I.get(i11));
            }
            this.f12524F0 = 2;
        }
        int iPosition = decoderInputBuffer.f12116c.position();
        C7968m c7968m = this.f12221b;
        c7968m.m15817e();
        try {
            int iM6993I = m6993I(c7968m, decoderInputBuffer, 0);
            if (mo6997h()) {
                this.f12537M0 = this.f12535L0;
            }
            if (iM6993I == -3) {
                return false;
            }
            if (iM6993I == -5) {
                if (this.f12524F0 == 2) {
                    decoderInputBuffer.mo6927p();
                    this.f12524F0 = 1;
                }
                mo6881f0(c7968m);
                return true;
            }
            if (decoderInputBuffer.m13269m(4)) {
                if (this.f12524F0 == 2) {
                    decoderInputBuffer.mo6927p();
                    this.f12524F0 = 1;
                }
                this.f12539N0 = true;
                if (!this.f12529I0) {
                    m7147l0();
                    return false;
                }
                try {
                    if (!this.f12579t0) {
                        this.f12531J0 = true;
                        this.f12561b0.mo7184g(this.f12582w0, 0, 4, 0L);
                        this.f12582w0 = -1;
                        decoderInputBuffer.f12116c = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw m7009z(C10134c0.m19050q(e10.getErrorCode()), this.f12548S, e10, false);
                }
            }
            if (!this.f12529I0 && !decoderInputBuffer.m13269m(1)) {
                decoderInputBuffer.mo6927p();
                if (this.f12524F0 == 2) {
                    this.f12524F0 = 1;
                }
                return true;
            }
            boolean zM13269m = decoderInputBuffer.m13269m(1073741824);
            C6633c c6633c = decoderInputBuffer.f12115b;
            if (zM13269m) {
                if (iPosition == 0) {
                    c6633c.getClass();
                } else {
                    if (c6633c.f37595d == null) {
                        int[] iArr = new int[1];
                        c6633c.f37595d = iArr;
                        c6633c.f37600i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = c6633c.f37595d;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            if (this.f12570k0 && !zM13269m) {
                ByteBuffer byteBuffer = decoderInputBuffer.f12116c;
                byte[] bArr = C10148q.f51402a;
                int iPosition2 = byteBuffer.position();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int i14 = i12 + 1;
                    if (i14 >= iPosition2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i15 = byteBuffer.get(i12) & 255;
                    if (i13 == 3) {
                        if (i15 == 1 && (byteBuffer.get(i14) & 31) == 7) {
                            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                            byteBufferDuplicate.position(i12 - 3);
                            byteBufferDuplicate.limit(iPosition2);
                            byteBuffer.position(0);
                            byteBuffer.put(byteBufferDuplicate);
                            break;
                        }
                    } else if (i15 == 0) {
                        i13++;
                    }
                    if (i15 != 0) {
                        i13 = 0;
                    }
                    i12 = i14;
                }
                if (decoderInputBuffer.f12116c.position() == 0) {
                    return true;
                }
                this.f12570k0 = false;
            }
            long j10 = decoderInputBuffer.f12118e;
            C10315h c10315h = this.f12580u0;
            if (c10315h != null) {
                C2416m c2416m = this.f12548S;
                if (c10315h.f51874b == 0) {
                    c10315h.f51873a = j10;
                }
                if (!c10315h.f51875c) {
                    ByteBuffer byteBuffer2 = decoderInputBuffer.f12116c;
                    byteBuffer2.getClass();
                    int i16 = 0;
                    int i17 = 0;
                    for (int i18 = 4; i16 < i18; i18 = 4) {
                        i17 = (i17 << 8) | (byteBuffer2.get(i16) & 255);
                        i16++;
                    }
                    int iM13059b = C6436m.m13059b(i17);
                    if (iM13059b == -1) {
                        c10315h.f51875c = true;
                        c10315h.f51874b = 0L;
                        c10315h.f51873a = decoderInputBuffer.f12118e;
                        C10145n.m19099g("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                        j10 = decoderInputBuffer.f12118e;
                    } else {
                        long jMax = Math.max(0L, ((c10315h.f51874b - 529) * 1000000) / c2416m.f12464U) + c10315h.f51873a;
                        c10315h.f51874b += (long) iM13059b;
                        j10 = jMax;
                    }
                }
                long j11 = this.f12535L0;
                C10315h c10315h2 = this.f12580u0;
                C2416m c2416m2 = this.f12548S;
                c10315h2.getClass();
                this.f12535L0 = Math.max(j11, Math.max(0L, ((c10315h2.f51874b - 529) * 1000000) / c2416m2.f12464U) + c10315h2.f51873a);
            } else {
                zM13269m = zM13269m;
            }
            if (decoderInputBuffer.m13270o()) {
                this.f12542P.add(Long.valueOf(j10));
            }
            if (this.f12543P0) {
                ArrayDeque<C2418b> arrayDeque = this.f12546R;
                if (arrayDeque.isEmpty()) {
                    this.f12551T0.f12593c.m19165a(j10, this.f12548S);
                } else {
                    arrayDeque.peekLast().f12593c.m19165a(j10, this.f12548S);
                }
                this.f12543P0 = false;
            }
            this.f12535L0 = Math.max(this.f12535L0, j10);
            decoderInputBuffer.m6930t();
            if (decoderInputBuffer.m13269m(268435456)) {
                mo7141Y(decoderInputBuffer);
            }
            mo6885k0(decoderInputBuffer);
            try {
                if (zM13269m) {
                    this.f12561b0.mo7187j(this.f12582w0, c6633c, j10);
                } else {
                    this.f12561b0.mo7184g(this.f12582w0, decoderInputBuffer.f12116c.limit(), 0, j10);
                }
                this.f12582w0 = -1;
                decoderInputBuffer.f12116c = null;
                this.f12529I0 = true;
                this.f12524F0 = 0;
                this.f12549S0.f37606c++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw m7009z(C10134c0.m19050q(e11.getErrorCode()), this.f12548S, e11, false);
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e12) {
            mo6876c0(e12);
            m7149n0(0);
            m7136Q();
            return true;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m7136Q() {
        try {
            this.f12561b0.flush();
        } finally {
            mo7152q0();
        }
    }

    /* JADX INFO: renamed from: R */
    public final boolean m7137R() {
        if (this.f12561b0 == null) {
            return false;
        }
        int i10 = this.f12527H0;
        if (i10 != 3 && !this.f12571l0 && (!this.f12572m0 || this.f12533K0)) {
            if (!this.f12573n0 || !this.f12531J0) {
                if (i10 == 2) {
                    int i11 = C10134c0.f51354a;
                    C10129a.m18992d(i11 >= 23);
                    if (i11 >= 23) {
                        try {
                            m7158y0();
                        } catch (ExoPlaybackException e10) {
                            C10145n.m19100h("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                            m7150o0();
                            return true;
                        }
                    }
                }
                m7136Q();
                return false;
            }
        }
        m7150o0();
        return true;
    }

    /* JADX INFO: renamed from: S */
    public final List<C2427d> m7138S(boolean z10) throws MediaCodecUtil.DecoderQueryException {
        C2416m c2416m = this.f12548S;
        InterfaceC2428e interfaceC2428e = this.f12528I;
        ArrayList arrayListMo6873V = mo6873V(interfaceC2428e, c2416m, z10);
        if (arrayListMo6873V.isEmpty() && z10) {
            arrayListMo6873V = mo6873V(interfaceC2428e, this.f12548S, false);
            if (!arrayListMo6873V.isEmpty()) {
                C10145n.m19099g("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f12548S.f12484l + ", but no secure decoder available. Trying to proceed with " + arrayListMo6873V + ".");
            }
        }
        return arrayListMo6873V;
    }

    /* JADX INFO: renamed from: T */
    public boolean mo7139T() {
        return false;
    }

    /* JADX INFO: renamed from: U */
    public abstract float mo6872U(float f3, C2416m[] c2416mArr);

    /* JADX INFO: renamed from: V */
    public abstract ArrayList mo6873V(InterfaceC2428e interfaceC2428e, C2416m c2416m, boolean z10) throws MediaCodecUtil.DecoderQueryException;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: W */
    public final C7291f m7140W(DrmSession drmSession) throws ExoPlaybackException {
        InterfaceC6632b interfaceC6632bMo6942m = drmSession.mo6942m();
        if (interfaceC6632bMo6942m != null && !(interfaceC6632bMo6942m instanceof C7291f)) {
            throw m7009z(6001, this.f12548S, new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + interfaceC6632bMo6942m), false);
        }
        return (C7291f) interfaceC6632bMo6942m;
    }

    /* JADX INFO: renamed from: X */
    public abstract InterfaceC2426c.a mo6874X(C2427d c2427d, C2416m c2416m, MediaCrypto mediaCrypto, float f3);

    /* JADX INFO: renamed from: Y */
    public void mo7141Y(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x018d  */
    /* JADX INFO: renamed from: Z */
    public final void m7142Z(C2427d c2427d, MediaCrypto mediaCrypto) throws Exception {
        float fMo6872U;
        int i10;
        boolean z10;
        boolean z11;
        String str = c2427d.f12615a;
        int i11 = C10134c0.f51354a;
        if (i11 < 23) {
            fMo6872U = -1.0f;
        } else {
            float f3 = this.f12560a0;
            C2416m[] c2416mArr = this.f12227h;
            c2416mArr.getClass();
            fMo6872U = mo6872U(f3, c2416mArr);
        }
        float f10 = fMo6872U > this.f12532K ? fMo6872U : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InterfaceC2426c.a aVarMo6874X = mo6874X(c2427d, this.f12548S, mediaCrypto, f10);
        if (i11 >= 31) {
            C6215e0 c6215e0 = this.f12224e;
            c6215e0.getClass();
            C2417a.m7160a(aVarMo6874X, c6215e0);
        }
        try {
            C0062b.m315V("createCodec:" + str);
            this.f12561b0 = this.f12526H.mo7192a(aVarMo6874X);
            C0062b.m283K0();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!c2427d.m7198d(this.f12548S)) {
                C10145n.m19099g("MediaCodecRenderer", C10134c0.m19045l("Format exceeds selected codec's capabilities [%s, %s]", C2416m.m7124d(this.f12548S), str));
            }
            this.f12568i0 = c2427d;
            this.f12565f0 = f10;
            this.f12562c0 = this.f12548S;
            if (i11 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = C10134c0.f51357d;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i10 = 2;
                } else if (i11 < 24) {
                    i10 = 0;
                } else {
                    i10 = 0;
                }
            } else if (i11 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                i10 = 0;
            } else {
                String str3 = C10134c0.f51355b;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
            }
            this.f12569j0 = i10;
            this.f12570k0 = i11 < 21 && this.f12562c0.f12452I.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.f12571l0 = i11 < 18 || (i11 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i11 == 19 && C10134c0.f51357d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
            this.f12572m0 = i11 == 29 && "c2.android.aac.decoder".equals(str);
            if (i11 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
                if (i11 <= 19) {
                    String str4 = C10134c0.f51355b;
                    z10 = ("hb2000".equals(str4) || "stvm8".equals(str4)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str));
                }
            }
            this.f12573n0 = z10;
            this.f12574o0 = i11 == 21 && "OMX.google.aac.decoder".equals(str);
            if (i11 < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(C10134c0.f51356c)) {
                String str5 = C10134c0.f51355b;
                if (str5.startsWith("baffin") || str5.startsWith("grand") || str5.startsWith("fortuna") || str5.startsWith("gprimelte") || str5.startsWith("j2y18lte") || str5.startsWith("ms01")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            this.f12575p0 = z11;
            this.f12576q0 = i11 <= 18 && this.f12562c0.f12463T == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
            String str6 = c2427d.f12615a;
            this.f12579t0 = ((i11 <= 25 && "OMX.rk.video_decoder.avc".equals(str6)) || ((i11 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str6)) || ((i11 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str6) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str6) || "OMX.bcm.vdec.avc.tunnel".equals(str6) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str6) || "OMX.bcm.vdec.hevc.tunnel".equals(str6) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str6))) || ("Amazon".equals(C10134c0.f51356c) && "AFTS".equals(C10134c0.f51357d) && c2427d.f12620f)))) || mo7139T();
            this.f12561b0.mo7178a();
            if ("c2.android.mp3.decoder".equals(str6)) {
                this.f12580u0 = new C10315h();
            }
            if (this.f12225f == 2) {
                this.f12581v0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f12549S0.f37604a++;
            mo6878d0(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th2) {
            C0062b.m283K0();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a0 */
    public final void m7143a0() throws ExoPlaybackException {
        C2416m c2416m;
        if (this.f12561b0 != null || this.f12520B0 || (c2416m = this.f12548S) == null) {
            return;
        }
        if (this.f12554V == null && mo6890v0(c2416m)) {
            C2416m c2416m2 = this.f12548S;
            m7132M();
            String str = c2416m2.f12484l;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            C10314g c10314g = this.f12540O;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                c10314g.getClass();
                c10314g.f51872k = 32;
            } else {
                c10314g.getClass();
                c10314g.f51872k = 1;
            }
            this.f12520B0 = true;
            return;
        }
        m7154s0(this.f12554V);
        String str2 = this.f12548S.f12484l;
        DrmSession drmSession = this.f12552U;
        if (drmSession != null) {
            if (this.f12556W == null) {
                C7291f c7291fM7140W = m7140W(drmSession);
                if (c7291fM7140W != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(c7291fM7140W.f40806a, c7291fM7140W.f40807b);
                        this.f12556W = mediaCrypto;
                        this.f12557X = !c7291fM7140W.f40808c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e10) {
                        throw m7009z(6006, this.f12548S, e10, false);
                    }
                } else if (this.f12552U.mo6936f() == null) {
                    return;
                }
            }
            if (C7291f.f40805d) {
                int state = this.f12552U.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException drmSessionExceptionMo6936f = this.f12552U.mo6936f();
                    drmSessionExceptionMo6936f.getClass();
                    throw m7009z(drmSessionExceptionMo6936f.f12195a, this.f12548S, drmSessionExceptionMo6936f, false);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            m7145b0(this.f12556W, this.f12557X);
        } catch (DecoderInitializationException e11) {
            throw m7009z(4001, this.f12548S, e11, false);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p150h9.InterfaceC5924l0
    /* JADX INFO: renamed from: b */
    public final int mo7144b(C2416m c2416m) throws ExoPlaybackException {
        try {
            return mo6891w0(this.f12528I, c2416m);
        } catch (MediaCodecUtil.DecoderQueryException e10) {
            throw m6991A(e10, c2416m);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0056 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b0 */
    public final void m7145b0(MediaCrypto mediaCrypto, boolean z10) throws DecoderInitializationException {
        DecoderInitializationException decoderInitializationException;
        String diagnosticInfo;
        DecoderInitializationException decoderInitializationException2;
        if (this.f12566g0 == null) {
            try {
                List<C2427d> listM7138S = m7138S(z10);
                ArrayDeque<C2427d> arrayDeque = new ArrayDeque<>();
                this.f12566g0 = arrayDeque;
                if (this.f12530J) {
                    arrayDeque.addAll(listM7138S);
                } else if (!listM7138S.isEmpty()) {
                    this.f12566g0.add(listM7138S.get(0));
                }
                this.f12567h0 = null;
            } catch (MediaCodecUtil.DecoderQueryException e10) {
                throw new DecoderInitializationException(-49998, this.f12548S, e10, z10);
            }
        }
        if (this.f12566g0.isEmpty()) {
            throw new DecoderInitializationException(-49999, this.f12548S, null, z10);
        }
        C2427d c2427dPeekFirst = this.f12566g0.peekFirst();
        while (this.f12561b0 == null) {
            C2427d c2427dPeekFirst2 = this.f12566g0.peekFirst();
            if (!mo7156u0(c2427dPeekFirst2)) {
                return;
            }
            try {
                m7142Z(c2427dPeekFirst2, mediaCrypto);
            } catch (Exception e11) {
                if (c2427dPeekFirst2 != c2427dPeekFirst) {
                    throw e11;
                }
                try {
                    C10145n.m19099g("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    m7142Z(c2427dPeekFirst2, mediaCrypto);
                } catch (Exception e12) {
                    C10145n.m19100h("MediaCodecRenderer", "Failed to initialize decoder: " + c2427dPeekFirst2, e12);
                    this.f12566g0.removeFirst();
                    C2416m c2416m = this.f12548S;
                    String str = "Decoder init failed: " + c2427dPeekFirst2.f12615a + ", " + c2416m;
                    String str2 = c2416m.f12484l;
                    if (C10134c0.f51354a >= 21) {
                        diagnosticInfo = null;
                    } else {
                        diagnosticInfo = null;
                    }
                    decoderInitializationException = new DecoderInitializationException(str, e12, str2, z10, c2427dPeekFirst2, diagnosticInfo);
                    mo6876c0(decoderInitializationException);
                    decoderInitializationException2 = this.f12567h0;
                    if (decoderInitializationException2 == null) {
                        this.f12567h0 = decoderInitializationException;
                    } else {
                        this.f12567h0 = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.f12586a, decoderInitializationException2.f12587b, decoderInitializationException2.f12588c, decoderInitializationException2.f12589d);
                    }
                    if (!this.f12566g0.isEmpty()) {
                        throw this.f12567h0;
                    }
                }
                C10145n.m19100h("MediaCodecRenderer", "Failed to initialize decoder: " + c2427dPeekFirst2, e12);
                this.f12566g0.removeFirst();
                C2416m c2416m2 = this.f12548S;
                String str3 = "Decoder init failed: " + c2427dPeekFirst2.f12615a + ", " + c2416m2;
                String str4 = c2416m2.f12484l;
                if (C10134c0.f51354a >= 21 || !(e12 instanceof MediaCodec.CodecException)) {
                    diagnosticInfo = null;
                } else {
                    diagnosticInfo = ((MediaCodec.CodecException) e12).getDiagnosticInfo();
                }
                decoderInitializationException = new DecoderInitializationException(str3, e12, str4, z10, c2427dPeekFirst2, diagnosticInfo);
                mo6876c0(decoderInitializationException);
                decoderInitializationException2 = this.f12567h0;
                if (decoderInitializationException2 == null) {
                    this.f12567h0 = decoderInitializationException;
                } else {
                    this.f12567h0 = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.f12586a, decoderInitializationException2.f12587b, decoderInitializationException2.f12588c, decoderInitializationException2.f12589d);
                }
                if (!this.f12566g0.isEmpty()) {
                    throw this.f12567h0;
                }
            }
        }
        this.f12566g0 = null;
    }

    /* JADX INFO: renamed from: c0 */
    public abstract void mo6876c0(Exception exc);

    @Override // com.google.android.exoplayer2.AbstractC2406e, com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: d */
    public boolean mo6877d() {
        return this.f12541O0;
    }

    /* JADX INFO: renamed from: d0 */
    public abstract void mo6878d0(String str, long j10, long j11);

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: e */
    public boolean mo6879e() {
        boolean zMo427e;
        if (this.f12548S == null) {
            return false;
        }
        if (mo6997h()) {
            zMo427e = this.f12230k;
        } else {
            InterfaceC5731n interfaceC5731n = this.f12226g;
            interfaceC5731n.getClass();
            zMo427e = interfaceC5731n.mo427e();
        }
        if (!zMo427e) {
            if (!(this.f12583x0 >= 0) && (this.f12581v0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f12581v0)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e0 */
    public abstract void mo6880e0(String str);

    /* JADX WARN: Code duplicated, block: B:119:0x018d  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a7  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f0 */
    public C6637g mo6881f0(C7968m c7968m) throws ExoPlaybackException {
        boolean z10;
        int i10;
        C7291f c7291fM7140W;
        boolean z11 = true;
        this.f12543P0 = true;
        C2416m c2416m = (C2416m) c7968m.f43384b;
        c2416m.getClass();
        String str = c2416m.f12484l;
        if (str == null) {
            throw m7009z(4005, c2416m, new IllegalArgumentException(), false);
        }
        DrmSession drmSession = (DrmSession) c7968m.f43383a;
        DrmSession.m6958i(this.f12554V, drmSession);
        this.f12554V = drmSession;
        this.f12548S = c2416m;
        if (this.f12520B0) {
            this.f12522D0 = true;
            return null;
        }
        InterfaceC2426c interfaceC2426c = this.f12561b0;
        if (interfaceC2426c == null) {
            this.f12566g0 = null;
            m7143a0();
            return null;
        }
        C2427d c2427d = this.f12568i0;
        C2416m c2416m2 = this.f12562c0;
        DrmSession drmSession2 = this.f12552U;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                if (drmSession2 != null && drmSession.mo6939j().equals(drmSession2.mo6939j()) && C10134c0.f51354a >= 23) {
                    UUID uuid = C5903b.f35262e;
                    if (!uuid.equals(drmSession2.mo6939j()) && !uuid.equals(drmSession.mo6939j()) && (c7291fM7140W = m7140W(drmSession)) != null) {
                        boolean zMo6941l = c7291fM7140W.f40808c ? false : drmSession.mo6941l(str);
                        if (c2427d.f12620f || !zMo6941l) {
                            z10 = false;
                        }
                    }
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f12529I0) {
                this.f12525G0 = 1;
                this.f12527H0 = 3;
            } else {
                m7150o0();
                m7143a0();
            }
            return new C6637g(c2427d.f12615a, c2416m2, c2416m, 0, BuildConfig.SDK_TRUNCATE_LENGTH);
        }
        boolean z12 = this.f12554V != this.f12552U;
        C10129a.m18992d(!z12 || C10134c0.f51354a >= 23);
        C6637g c6637gMo6871K = mo6871K(c2427d, c2416m2, c2416m);
        int i11 = c6637gMo6871K.f37620d;
        if (i11 == 0) {
            if (this.f12529I0) {
                this.f12525G0 = 1;
                this.f12527H0 = 3;
            } else {
                m7150o0();
                m7143a0();
            }
            i10 = 0;
            if (c6637gMo6871K.f37620d != 0) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException();
                }
                if (m7157x0(c2416m)) {
                    this.f12562c0 = c2416m;
                    if (z12 && !m7133N()) {
                        i10 = 2;
                    }
                } else {
                    i10 = 16;
                }
            } else if (m7157x0(c2416m)) {
                this.f12523E0 = true;
                this.f12524F0 = 1;
                int i12 = this.f12569j0;
                if (i12 != 2) {
                    if (i12 == 1) {
                        if (c2416m.f12455L != c2416m2.f12455L || c2416m.f12456M != c2416m2.f12456M) {
                        }
                    }
                    z11 = false;
                }
                this.f12577r0 = z11;
                this.f12562c0 = c2416m;
                if (z12 && !m7133N()) {
                    i10 = 2;
                }
            } else {
                i10 = 16;
            }
        } else if (m7157x0(c2416m)) {
            this.f12562c0 = c2416m;
            if (!z12) {
                if (this.f12529I0) {
                    this.f12525G0 = 1;
                    if (this.f12571l0 || this.f12573n0) {
                        this.f12527H0 = 3;
                        z11 = false;
                    } else {
                        this.f12527H0 = 1;
                    }
                }
                if (!z11) {
                    i10 = 2;
                }
            } else if (!m7133N()) {
                i10 = 2;
            }
        } else {
            i10 = 16;
        }
        return (c6637gMo6871K.f37620d != 0 || (this.f12561b0 == interfaceC2426c && this.f12527H0 != 3)) ? c6637gMo6871K : new C6637g(c2427d.f12615a, c2416m2, c2416m, 0, i10);
        i10 = 0;
        if (c6637gMo6871K.f37620d != 0) {
        }
    }

    /* JADX INFO: renamed from: g0 */
    public abstract void mo6882g0(C2416m c2416m, MediaFormat mediaFormat) throws ExoPlaybackException;

    /* JADX INFO: renamed from: h0 */
    public void mo6883h0(long j10) {
    }

    /* JADX INFO: renamed from: i0 */
    public void mo7146i0(long j10) {
        this.f12553U0 = j10;
        ArrayDeque<C2418b> arrayDeque = this.f12546R;
        if (arrayDeque.isEmpty() || j10 < arrayDeque.peek().f12591a) {
            return;
        }
        m7155t0(arrayDeque.poll());
        mo6884j0();
    }

    /* JADX INFO: renamed from: j0 */
    public abstract void mo6884j0();

    /* JADX INFO: renamed from: k0 */
    public abstract void mo6885k0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException;

    @TargetApi(23)
    /* JADX INFO: renamed from: l0 */
    public final void m7147l0() throws ExoPlaybackException {
        int i10 = this.f12527H0;
        if (i10 == 1) {
            m7136Q();
            return;
        }
        if (i10 == 2) {
            m7136Q();
            m7158y0();
        } else if (i10 != 3) {
            this.f12541O0 = true;
            mo6888p0();
        } else {
            m7150o0();
            m7143a0();
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: m */
    public void mo7148m(float f3, float f10) throws ExoPlaybackException {
        this.f12559Z = f3;
        this.f12560a0 = f10;
        m7157x0(this.f12562c0);
    }

    /* JADX INFO: renamed from: m0 */
    public abstract boolean mo6887m0(long j10, long j11, InterfaceC2426c interfaceC2426c, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C2416m c2416m) throws ExoPlaybackException;

    /* JADX INFO: renamed from: n0 */
    public final boolean m7149n0(int i10) throws ExoPlaybackException {
        C7968m c7968m = this.f12221b;
        c7968m.m15817e();
        DecoderInputBuffer decoderInputBuffer = this.f12534L;
        decoderInputBuffer.mo6927p();
        int iM6993I = m6993I(c7968m, decoderInputBuffer, i10 | 4);
        if (iM6993I == -5) {
            mo6881f0(c7968m);
            return true;
        }
        if (iM6993I == -4 && decoderInputBuffer.m13269m(4)) {
            this.f12539N0 = true;
            m7147l0();
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e, p150h9.InterfaceC5924l0
    /* JADX INFO: renamed from: o */
    public final int mo7001o() {
        return 8;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o0 */
    public final void m7150o0() {
        try {
            InterfaceC2426c interfaceC2426c = this.f12561b0;
            if (interfaceC2426c != null) {
                interfaceC2426c.release();
                this.f12549S0.f37605b++;
                mo6880e0(this.f12568i0.f12615a);
            }
            this.f12561b0 = null;
            try {
                MediaCrypto mediaCrypto = this.f12556W;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
                this.f12556W = null;
                m7154s0(null);
                m7153r0();
            } catch (Throwable th2) {
                this.f12556W = null;
                m7154s0(null);
                m7153r0();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f12561b0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f12556W;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                this.f12556W = null;
                m7154s0(null);
                m7153r0();
                throw th3;
            } catch (Throwable th4) {
                this.f12556W = null;
                m7154s0(null);
                m7153r0();
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00c7  */
    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: p */
    public final void mo7151p(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        boolean z11 = false;
        if (this.f12545Q0) {
            this.f12545Q0 = false;
            m7147l0();
        }
        ExoPlaybackException exoPlaybackException = this.f12547R0;
        if (exoPlaybackException != null) {
            this.f12547R0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f12541O0) {
                mo6888p0();
                return;
            }
            if (this.f12548S != null || m7149n0(2)) {
                m7143a0();
                if (this.f12520B0) {
                    C0062b.m315V("bypassRender");
                    while (m7130J(j10, j11)) {
                    }
                    C0062b.m283K0();
                } else if (this.f12561b0 != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    C0062b.m315V("drainAndFeed");
                    while (m7134O(j10, j11)) {
                        long j12 = this.f12558Y;
                        if (!(j12 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j12)) {
                            break;
                        }
                    }
                    while (m7135P()) {
                        long j13 = this.f12558Y;
                        if (!(j13 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j13)) {
                            break;
                        }
                    }
                    C0062b.m283K0();
                } else {
                    C6635e c6635e = this.f12549S0;
                    int i10 = c6635e.f37607d;
                    InterfaceC5731n interfaceC5731n = this.f12226g;
                    interfaceC5731n.getClass();
                    c6635e.f37607d = i10 + interfaceC5731n.mo426d(j10 - this.f12228i);
                    m7149n0(1);
                }
                synchronized (this.f12549S0) {
                }
            }
        } catch (IllegalStateException e10) {
            int i11 = C10134c0.f51354a;
            if (i11 < 21 || !(e10 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e10.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = true;
            }
            if (!z10) {
                throw e10;
            }
            mo6876c0(e10);
            if (i11 >= 21) {
                if (e10 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e10).isRecoverable() : false) {
                    z11 = true;
                }
            }
            if (z11) {
                m7150o0();
            }
            throw m7009z(4003, this.f12548S, mo7131L(e10, this.f12568i0), z11);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void mo6888p0() throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: q0 */
    public void mo7152q0() {
        this.f12582w0 = -1;
        this.f12536M.f12116c = null;
        this.f12583x0 = -1;
        this.f12584y0 = null;
        this.f12581v0 = -9223372036854775807L;
        this.f12531J0 = false;
        this.f12529I0 = false;
        this.f12577r0 = false;
        this.f12578s0 = false;
        this.f12585z0 = false;
        this.f12519A0 = false;
        this.f12542P.clear();
        this.f12535L0 = -9223372036854775807L;
        this.f12537M0 = -9223372036854775807L;
        this.f12553U0 = -9223372036854775807L;
        C10315h c10315h = this.f12580u0;
        if (c10315h != null) {
            c10315h.f51873a = 0L;
            c10315h.f51874b = 0L;
            c10315h.f51875c = false;
        }
        this.f12525G0 = 0;
        this.f12527H0 = 0;
        this.f12524F0 = this.f12523E0 ? 1 : 0;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m7153r0() {
        mo7152q0();
        this.f12547R0 = null;
        this.f12580u0 = null;
        this.f12566g0 = null;
        this.f12568i0 = null;
        this.f12562c0 = null;
        this.f12563d0 = null;
        this.f12564e0 = false;
        this.f12533K0 = false;
        this.f12565f0 = -1.0f;
        this.f12569j0 = 0;
        this.f12570k0 = false;
        this.f12571l0 = false;
        this.f12572m0 = false;
        this.f12573n0 = false;
        this.f12574o0 = false;
        this.f12575p0 = false;
        this.f12576q0 = false;
        this.f12579t0 = false;
        this.f12523E0 = false;
        this.f12524F0 = 0;
        this.f12557X = false;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m7154s0(DrmSession drmSession) {
        DrmSession.m6958i(this.f12552U, drmSession);
        this.f12552U = drmSession;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m7155t0(C2418b c2418b) {
        this.f12551T0 = c2418b;
        long j10 = c2418b.f12592b;
        if (j10 != -9223372036854775807L) {
            this.f12555V0 = true;
            mo6883h0(j10);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public boolean mo7156u0(C2427d c2427d) {
        return true;
    }

    /* JADX INFO: renamed from: v0 */
    public boolean mo6890v0(C2416m c2416m) {
        return false;
    }

    /* JADX INFO: renamed from: w0 */
    public abstract int mo6891w0(InterfaceC2428e interfaceC2428e, C2416m c2416m) throws MediaCodecUtil.DecoderQueryException;

    /* JADX INFO: renamed from: x0 */
    public final boolean m7157x0(C2416m c2416m) throws ExoPlaybackException {
        if (C10134c0.f51354a >= 23 && this.f12561b0 != null && this.f12527H0 != 3 && this.f12225f != 0) {
            float f3 = this.f12560a0;
            C2416m[] c2416mArr = this.f12227h;
            c2416mArr.getClass();
            float fMo6872U = mo6872U(f3, c2416mArr);
            float f10 = this.f12565f0;
            if (f10 == fMo6872U) {
                return true;
            }
            if (fMo6872U == -1.0f) {
                if (this.f12529I0) {
                    this.f12525G0 = 1;
                    this.f12527H0 = 3;
                } else {
                    m7150o0();
                    m7143a0();
                }
                return false;
            }
            if (f10 == -1.0f && fMo6872U <= this.f12532K) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fMo6872U);
            this.f12561b0.mo7180c(bundle);
            this.f12565f0 = fMo6872U;
        }
        return true;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m7158y0() throws ExoPlaybackException {
        try {
            this.f12556W.setMediaDrmSession(m7140W(this.f12554V).f40807b);
            m7154s0(this.f12554V);
            this.f12525G0 = 0;
            this.f12527H0 = 0;
        } catch (MediaCryptoException e10) {
            throw m7009z(6006, this.f12548S, e10, false);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: z0 */
    public final void m7159z0(long j10) throws ExoPlaybackException {
        boolean z10;
        Object objM19168d;
        C2416m c2416mM19169e;
        C10157z<C2416m> c10157z = this.f12551T0.f12593c;
        synchronized (c10157z) {
            z10 = true;
            objM19168d = c10157z.m19168d(true, j10);
        }
        C2416m c2416m = (C2416m) objM19168d;
        if (c2416m == null && this.f12555V0 && this.f12563d0 != null) {
            C10157z<C2416m> c10157z2 = this.f12551T0.f12593c;
            synchronized (c10157z2) {
                try {
                    c2416mM19169e = c10157z2.f51459d == 0 ? null : c10157z2.m19169e();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c2416m = c2416mM19169e;
        }
        if (c2416m != null) {
            this.f12550T = c2416m;
        } else {
            z10 = false;
        }
        if (z10 || (this.f12564e0 && this.f12550T != null)) {
            mo6882g0(this.f12550T, this.f12563d0);
            this.f12564e0 = false;
            this.f12555V0 = false;
        }
    }
}
