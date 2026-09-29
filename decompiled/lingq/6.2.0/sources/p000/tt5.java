package p000;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.LoudnessCodecController;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.C0713b;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import com.google.common.collect.ImmutableList;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class tt5 extends xt5 implements qt5 {

    /* JADX INFO: renamed from: c1 */
    public final Context f62845c1;

    /* JADX INFO: renamed from: d1 */
    public final C3165jz f62846d1;

    /* JADX INFO: renamed from: e1 */
    public final s52 f62847e1;

    /* JADX INFO: renamed from: f1 */
    public final C3309ls f62848f1;

    /* JADX INFO: renamed from: g1 */
    public int f62849g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f62850h1;

    /* JADX INFO: renamed from: i1 */
    public C0713b f62851i1;

    /* JADX INFO: renamed from: j1 */
    public C0713b f62852j1;

    /* JADX INFO: renamed from: k1 */
    public long f62853k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f62854l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f62855m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f62856n1;

    /* JADX INFO: renamed from: o1 */
    public boolean f62857o1;

    /* JADX INFO: renamed from: p1 */
    public int f62858p1;

    /* JADX INFO: renamed from: q1 */
    public boolean f62859q1;

    /* JADX INFO: renamed from: r1 */
    public long f62860r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt5(Context context, rt5 rt5Var, Handler handler, ew2 ew2Var, s52 s52Var) {
        super(context.getApplicationContext(), 1, rt5Var, 44100.0f);
        C3309ls c3309ls = Build.VERSION.SDK_INT >= 35 ? new C3309ls(28) : null;
        this.f62845c1 = context.getApplicationContext();
        this.f62847e1 = s52Var;
        this.f62848f1 = c3309ls;
        this.f62858p1 = -1000;
        this.f62846d1 = new C3165jz(handler, ew2Var, 0);
        this.f62860r1 = -9223372036854775807L;
        s52Var.f60356n = new cc4(this);
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: A0 */
    public final int mo12156A0(gm5 gm5Var, C0713b c0713b) {
        int iM22300E0;
        List listM3057h;
        vt5 vt5VarM3059j;
        boolean z;
        boolean z2;
        int iM24988f = y90.m24988f(1, 0, 0, 0);
        String str = c0713b.f6406o;
        String str2 = c0713b.f6406o;
        if (!ez5.m11398h(str)) {
            return y90.m24988f(0, 0, 0, 0);
        }
        int i = c0713b.f6390P;
        boolean z3 = i != 0;
        boolean z4 = i == 0 || i == 2;
        int i2 = 8;
        s52 s52Var = this.f62847e1;
        if (!z4 || (z3 && au5.m3059j() == null)) {
            iM22300E0 = 0;
        } else {
            iM22300E0 = m22300E0(c0713b);
            if (s52Var.m21089h(c0713b) != 0) {
                return y90.m24988f(4, 8, 32, iM22300E0);
            }
        }
        if (!"audio/raw".equals(str2) || s52Var.m21089h(c0713b) != 0) {
            int i3 = c0713b.f6381G;
            int i4 = c0713b.f6382H;
            lc3 lc3Var = new lc3();
            lc3Var.m16083p("audio/raw");
            lc3Var.m16069b(i3);
            lc3Var.m16084q(i4);
            lc3Var.m16080m(2);
            if (s52Var.m21089h(lc3Var.m16068a()) != 0) {
                if (str2 == null) {
                    listM3057h = ImmutableList.m6289v();
                } else {
                    listM3057h = (s52Var.m21089h(c0713b) == 0 || (vt5VarM3059j = au5.m3059j()) == null) ? au5.m3057h(gm5Var, c0713b, false, false) : ImmutableList.m6291y(vt5VarM3059j);
                }
                if (!((AbstractCollection) listM3057h).isEmpty()) {
                    if (!z4) {
                        return y90.m24988f(2, 0, 0, 0);
                    }
                    vt5 vt5Var = (vt5) listM3057h.get(0);
                    Context context = this.f62845c1;
                    boolean zM23539g = vt5Var.m23539g(context, c0713b);
                    if (!zM23539g) {
                        int i5 = 1;
                        while (true) {
                            if (i5 >= listM3057h.size()) {
                                z = zM23539g;
                                z2 = true;
                                break;
                            }
                            vt5 vt5Var2 = (vt5) listM3057h.get(i5);
                            if (vt5Var2.m23539g(context, c0713b)) {
                                z2 = false;
                                vt5Var = vt5Var2;
                                z = true;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        z = zM23539g;
                        z2 = true;
                        break;
                    }
                    int i6 = z ? 4 : 3;
                    if (z && vt5Var.m23541i(c0713b)) {
                        i2 = 16;
                    }
                    return (vt5Var.f65887g ? 64 : 0) | i6 | i2 | 32 | (z2 ? 128 : 0) | iM22300E0;
                }
            }
        }
        return iM24988f;
    }

    /* JADX INFO: renamed from: E0 */
    public final int m22300E0(C0713b c0713b) {
        C3591sy c3591syM20983a;
        s52 s52Var = this.f62847e1;
        if (s52Var.f60338X) {
            c3591syM20983a = C3591sy.f61573d;
        } else {
            C3702vy c3702vyM3139b = s52Var.f60360r.m3139b(s52Var.m21088g(c0713b));
            C3553ry c3553ry = new C3553ry();
            c3553ry.m20984b(c3702vyM3139b.f66073a);
            c3553ry.m20985c(c3702vyM3139b.f66074b);
            c3553ry.m20986d(c3702vyM3139b.f66075c);
            c3591syM20983a = c3553ry.m20983a();
        }
        if (!c3591syM20983a.f61574a) {
            return 0;
        }
        int i = c3591syM20983a.f61575b ? 1536 : 512;
        return c3591syM20983a.f61576c ? i | 2048 : i;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m22301F0() {
        long j;
        long jMax;
        long j2;
        mo4258m();
        s52 s52Var = this.f62847e1;
        C3309ls c3309ls = s52Var.f60343b;
        if (!s52Var.m21094n() || s52Var.f60320F) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(s52Var.f60362t.m25882f(), p52.m18897k(s52Var.f60358p, s52Var.m21090j()));
            ArrayDeque arrayDeque = s52Var.f60350h;
            while (!arrayDeque.isEmpty() && jMin >= ((q52) arrayDeque.getFirst()).f57285c) {
                s52Var.f60365w = (q52) arrayDeque.remove();
            }
            q52 q52Var = s52Var.f60365w;
            long jM22803H = jMin - q52Var.f57285c;
            long jM22824s = uma.m22824s(q52Var.f57283a.f52510a, jM22803H);
            if (arrayDeque.isEmpty()) {
                wd9 wd9Var = (wd9) c3309ls.f50066d;
                if (!wd9Var.mo4227b()) {
                    j = Long.MIN_VALUE;
                } else if (wd9Var.f66671n >= 1024) {
                    long j3 = wd9Var.f66670m;
                    vd9 vd9Var = wd9Var.f66667j;
                    vd9Var.getClass();
                    long jM23237c = j3 - ((long) vd9Var.m23237c());
                    int i = wd9Var.f66665h.f72366a;
                    int i2 = wd9Var.f66664g.f72366a;
                    j = Long.MIN_VALUE;
                    long j4 = wd9Var.f66671n;
                    jM22803H = i == i2 ? uma.m22803H(jM22803H, jM23237c, j4, RoundingMode.DOWN) : uma.m22803H(jM22803H, jM23237c * ((long) i), j4 * ((long) i2), RoundingMode.DOWN);
                } else {
                    j = Long.MIN_VALUE;
                    jM22803H = (long) (((double) wd9Var.f66660c) * jM22803H);
                }
                q52 q52Var2 = s52Var.f60365w;
                j2 = q52Var2.f57284b + jM22803H;
                q52Var2.f57286d = jM22803H - jM22824s;
            } else {
                j = Long.MIN_VALUE;
                q52 q52Var3 = s52Var.f60365w;
                j2 = q52Var3.f57284b + jM22824s + q52Var3.f57286d;
            }
            long j5 = ((k79) c3309ls.f50065c).f46826q;
            jMax = p52.m18897k(s52Var.f60358p, j5) + j2;
            long j6 = s52Var.f60340Z;
            if (j5 > j6) {
                long jM18897k = p52.m18897k(s52Var.f60358p, j5 - j6);
                s52Var.f60340Z = j5;
                s52Var.f60342a0 += jM18897k;
                if (s52Var.f60344b0 == null) {
                    s52Var.f60344b0 = new Handler(Looper.myLooper());
                }
                s52Var.f60344b0.removeCallbacksAndMessages(null);
                s52Var.f60344b0.postDelayed(new RunnableC3781y2(s52Var, 13), 100L);
            }
        }
        if (jMax != j) {
            if (!this.f62854l1) {
                jMax = Math.max(this.f62853k1, jMax);
            }
            this.f62853k1 = jMax;
            this.f62854l1 = false;
        }
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: I */
    public final o32 mo12159I(vt5 vt5Var, C0713b c0713b, C0713b c0713b2) {
        o32 o32VarM23535c = vt5Var.m23535c(c0713b, c0713b2);
        int i = o32VarM23535c.f53764e;
        if (this.f68748c0 == null && mo22305z0(c0713b2)) {
            i |= 32768;
        }
        "OMX.google.raw.decoder".equals(vt5Var.f65881a);
        if (c0713b2.f6407p > this.f62849g1) {
            i |= 64;
        }
        int i2 = i;
        return new o32(vt5Var.f65881a, c0713b, c0713b2, i2 != 0 ? 0 : o32VarM23535c.f53763d, i2);
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: Q */
    public final float mo12170Q(float f, C0713b c0713b, C0713b[] c0713bArr) {
        int iMax = -1;
        for (C0713b c0713b2 : c0713bArr) {
            int i = c0713b2.f6382H;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: R */
    public final ArrayList mo12172R(gm5 gm5Var, C0713b c0713b, boolean z) {
        List listM3057h;
        vt5 vt5VarM3059j;
        if (c0713b.f6406o == null) {
            listM3057h = ImmutableList.m6289v();
        } else {
            listM3057h = (this.f62847e1.m21089h(c0713b) == 0 || (vt5VarM3059j = au5.m3059j()) == null) ? au5.m3057h(gm5Var, c0713b, z, false) : ImmutableList.m6291y(vt5VarM3059j);
        }
        return au5.m3058i(this.f62845c1, listM3057h, c0713b);
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: S */
    public final long mo22302S(long j, long j2, boolean z) {
        long jM22803H;
        s52 s52Var = this.f62847e1;
        boolean z2 = s52Var.m21092l() && this.f62860r1 != -9223372036854775807L;
        if (this.f62859q1) {
            if (!s52Var.m21094n()) {
                jM22803H = -9223372036854775807L;
            } else if (p52.m18893g(s52Var.f60358p)) {
                jM22803H = p52.m18897k(s52Var.f60358p, s52Var.f60362t.m25880d());
            } else {
                long jM25880d = s52Var.f60362t.m25880d();
                int iM22678b = ucd.m22678b(p52.m18888b(s52Var.f60358p).f68936a);
                bna.m3987z(iM22678b != -2147483647);
                jM22803H = uma.m22803H(jM25880d, 1000000L, iM22678b, RoundingMode.DOWN);
            }
            if (this.f62857o1 && z2 && jM22803H != -9223372036854775807L) {
                float fMin = Math.min(jM22803H, this.f62860r1 - j);
                n97 n97Var = s52Var.f60366x;
                return Math.max(10000L, (long) ((fMin / (n97Var != null ? n97Var.f52510a : 1.0f)) / 2.0f));
            }
        } else if (z2 || this.f68720N0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: U */
    public final a34 mo12176U(vt5 vt5Var, C0713b c0713b, MediaCrypto mediaCrypto, float f) {
        Pair pairM16616b;
        C0713b[] c0713bArr = this.f69504j;
        c0713bArr.getClass();
        String str = vt5Var.f65881a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = c0713b.f6407p;
        String str2 = c0713b.f6406o;
        int i = c0713b.f6381G;
        boolean z = true;
        if (c0713bArr.length != 1) {
            for (C0713b c0713b2 : c0713bArr) {
                if (vt5Var.m23535c(c0713b, c0713b2).f53763d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, c0713b2.f6407p);
                }
            }
        }
        this.f62849g1 = iMax;
        if (!str.equals("OMX.google.opus.decoder") && !str.equals("c2.android.opus.decoder") && !str.equals("OMX.google.vorbis.decoder") && !str.equals("c2.android.vorbis.decoder")) {
            z = false;
        }
        this.f62850h1 = z;
        String str3 = vt5Var.f65883c;
        int i2 = this.f62849g1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i);
        int i3 = c0713b.f6382H;
        mediaFormat.setInteger("sample-rate", i3);
        fpb.m11993d(mediaFormat, c0713b.f6409r);
        fpb.m11992c(mediaFormat, "max-input-size", i2);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2) && (pairM16616b = m41.m16616b(c0713b)) != null) {
            fpb.m11992c(mediaFormat, "profile", ((Integer) pairM16616b.first).intValue());
            fpb.m11992c(mediaFormat, "level", ((Integer) pairM16616b.second).intValue());
        }
        lc3 lc3Var = new lc3();
        lc3Var.m16083p("audio/raw");
        lc3Var.m16069b(i);
        lc3Var.m16084q(i3);
        lc3Var.m16080m(4);
        C0713b c0713bM16068a = lc3Var.m16068a();
        s52 s52Var = this.f62847e1;
        if (s52Var.m21089h(c0713bM16068a) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i4 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f62858p1));
        }
        C0713b c0713b3 = null;
        if (Objects.equals(str2, "audio/iamf")) {
            b00 b00Var = s52Var.f60360r;
            C3627tx c3627tx = b00Var != null ? b00Var.f7713h : null;
            if (c3627tx == null) {
                ss5.m21707d0("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                int iM15732a = ky3.m15732a(c3627tx);
                int iBitCount = Integer.bitCount(iM15732a);
                mediaFormat.setInteger("channel-mask", iM15732a);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        m24680G(mediaFormat);
        if ("audio/raw".equals(vt5Var.f65882b) && !"audio/raw".equals(str2)) {
            c0713b3 = c0713b;
        }
        this.f62852j1 = c0713b3;
        return a34.m58a(vt5Var, mediaFormat, c0713b, mediaCrypto, this.f62848f1);
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: V */
    public final void mo12178V(m32 m32Var) {
        p52 p52Var;
        C0713b c0713b = m32Var.f50498c;
        if (c0713b != null && Objects.equals(c0713b.f6406o, "audio/opus") && this.f68707B0) {
            ByteBuffer byteBuffer = m32Var.f50503h;
            byteBuffer.getClass();
            C0713b c0713b2 = m32Var.f50498c;
            c0713b2.getClass();
            int i = c0713b2.f6384J;
            if (byteBuffer.remaining() == 8) {
                int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                s52 s52Var = this.f62847e1;
                C3851zz c3851zz = s52Var.f60362t;
                if (c3851zz == null || !c3851zz.m25885i() || (p52Var = s52Var.f60358p) == null || !p52.m18888b(p52Var).f68946k) {
                    return;
                }
                s52Var.f60362t.m25890n(i, i2);
            }
        }
    }

    @Override // p000.qt5
    /* JADX INFO: renamed from: a */
    public final void mo14311a(n97 n97Var) {
        s52 s52Var = this.f62847e1;
        if (s52Var.m21100t()) {
            s52Var.f60366x = n97Var;
            if (s52Var.m21094n()) {
                s52Var.f60362t.m25892p(s52Var.f60366x);
                s52Var.f60366x = s52Var.f60362t.m25881e();
                return;
            }
            return;
        }
        n97 n97Var2 = new n97(uma.m22811f(n97Var.f52510a, 0.1f, 8.0f), uma.m22811f(n97Var.f52511b, 0.1f, 8.0f));
        s52Var.f60366x = n97Var2;
        q52 q52Var = new q52(n97Var2, -9223372036854775807L, -9223372036854775807L);
        if (s52Var.m21094n()) {
            s52Var.f60364v = q52Var;
        } else {
            s52Var.f60365w = q52Var;
        }
    }

    @Override // p000.qt5
    /* JADX INFO: renamed from: b */
    public final long mo14312b() {
        if (this.f69502h == 2) {
            m22301F0();
        }
        return this.f62853k1;
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: b0 */
    public final void mo12180b0(Exception exc) {
        ss5.m21724v("MediaCodecAudioRenderer", "Audio codec error", exc);
        C3165jz c3165jz = this.f62846d1;
        Handler handler = c3165jz.f46413a;
        if (handler != null) {
            handler.post(new RunnableC2908cz(c3165jz, exc, 0));
        }
    }

    @Override // p000.qt5
    /* JADX INFO: renamed from: c */
    public final boolean mo14313c() {
        boolean z = this.f62856n1;
        this.f62856n1 = false;
        return z;
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: c0 */
    public final void mo12181c0(long j, long j2, String str) {
        C3165jz c3165jz = this.f62846d1;
        Handler handler = c3165jz.f46413a;
        if (handler != null) {
            handler.post(new RunnableC3093hz(0, j, j2, c3165jz, str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    @Override // p000.xt5, p000.y90, p000.yb7
    /* JADX INFO: renamed from: d */
    public final void mo4256d(int i, Object obj) throws Exception {
        C3309ls c3309ls;
        s52 s52Var = this.f62847e1;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (s52Var.f60322H != fFloatValue) {
                s52Var.f60322H = fFloatValue;
                if (s52Var.m21094n()) {
                    s52Var.f60362t.m25895s(s52Var.f60322H);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            C3476px c3476px = (C3476px) obj;
            c3476px.getClass();
            if (s52Var.f60363u.equals(c3476px)) {
                return;
            }
            s52Var.f60363u = c3476px;
            if (s52Var.f60336V) {
                return;
            }
            s52Var.m21096p();
            return;
        }
        if (i == 6) {
            d60 d60Var = (d60) obj;
            d60Var.getClass();
            if (s52Var.f60333S.equals(d60Var)) {
                return;
            }
            if (s52Var.f60362t != null) {
                s52Var.f60333S.getClass();
            }
            s52Var.f60333S = d60Var;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            s52Var.f60334T = audioDeviceInfo;
            C3851zz c3851zz = s52Var.f60362t;
            if (c3851zz != null) {
                c3851zz.m25894r(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f62858p1 = ((Integer) obj).intValue();
            st5 st5Var = this.f68754i0;
            if (st5Var != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f62858p1));
                st5Var.mo10717d(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            s52Var.f60367y = ((Boolean) obj).booleanValue();
            q52 q52Var = new q52(s52Var.m21100t() ? n97.f52509d : s52Var.f60366x, -9223372036854775807L, -9223372036854775807L);
            if (s52Var.m21094n()) {
                s52Var.f60364v = q52Var;
                return;
            } else {
                s52Var.f60365w = q52Var;
                return;
            }
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (s52Var.f60332R) {
                if (s52Var.f60331Q == iIntValue) {
                    s52Var.f60332R = false;
                    if (s52Var.f60331Q != iIntValue) {
                        s52Var.f60331Q = iIntValue;
                        s52Var.f60330P = iIntValue != 0;
                        s52Var.m21096p();
                    }
                }
            } else if (s52Var.f60331Q != iIntValue) {
                s52Var.f60331Q = iIntValue;
                s52Var.f60330P = iIntValue != 0;
                s52Var.m21096p();
            }
            if (Build.VERSION.SDK_INT < 35 || (c3309ls = this.f62848f1) == null) {
                return;
            }
            c3309ls.m16495O(iIntValue);
            return;
        }
        if (i == 19) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            AtomicInteger atomicInteger = s52.f60314c0;
            if (iIntValue2 == 0 || iIntValue2 == -1) {
                iIntValue2 = -1;
            }
            if (s52Var.f60335U == iIntValue2) {
                return;
            }
            s52Var.f60335U = iIntValue2;
            s52Var.m21096p();
            return;
        }
        if (i != 20) {
            super.mo4256d(i, obj);
            return;
        }
        obj.getClass();
        b00 b00Var = (b00) obj;
        b00 b00Var2 = s52Var.f60360r;
        if (b00Var != b00Var2) {
            b00Var2.m3141d();
            s52Var.f60360r = b00Var;
            m52 m52Var = s52Var.f60361s;
            if (m52Var != null) {
                b00Var.m3143f();
                if (b00Var.f7711f == null) {
                    b00Var.f7711f = new vg5(Thread.currentThread());
                }
                b00Var.f7711f.m23268a(m52Var);
            }
            s52Var.m21096p();
        }
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: d0 */
    public final void mo12182d0(l41 l41Var) {
        C3165jz c3165jz = this.f62846d1;
        Handler handler = c3165jz.f46413a;
        if (handler != null) {
            handler.post(new RunnableC0806bd(8, c3165jz, l41Var));
        }
    }

    @Override // p000.qt5
    /* JADX INFO: renamed from: e */
    public final n97 mo14315e() {
        return this.f62847e1.f60366x;
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: e0 */
    public final void mo12183e0(String str) {
        C3165jz c3165jz = this.f62846d1;
        Handler handler = c3165jz.f46413a;
        if (handler != null) {
            handler.post(new RunnableC0806bd(7, c3165jz, str));
        }
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: f0 */
    public final o32 mo12184f0(p33 p33Var) {
        C0713b c0713b = (C0713b) p33Var.f55514c;
        c0713b.getClass();
        this.f62851i1 = c0713b;
        o32 o32VarMo12184f0 = super.mo12184f0(p33Var);
        C3165jz c3165jz = this.f62846d1;
        Handler handler = c3165jz.f46413a;
        if (handler != null) {
            handler.post(new RunnableC3725wk(c3165jz, c0713b, o32VarMo12184f0, 1));
        }
        return o32VarMo12184f0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b3 A[Catch: AudioSink$ConfigurationException -> 0x00b1, TryCatch #0 {AudioSink$ConfigurationException -> 0x00b1, blocks: (B:22:0x0098, B:25:0x009e, B:27:0x00a7, B:31:0x00b5, B:30:0x00b3), top: B:35:0x0098 }] */
    @Override // p000.xt5
    /* JADX INFO: renamed from: g0 */
    public final void mo12185g0(C0713b c0713b, MediaFormat mediaFormat) throws Exception {
        int iM22825t;
        C0713b c0713b2 = this.f62852j1;
        int[] iArrM16062b = null;
        if (c0713b2 != null) {
            c0713b = c0713b2;
        } else if (this.f68754i0 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(c0713b.f6406o)) {
                iM22825t = c0713b.f6383I;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iM22825t = mediaFormat.getInteger("pcm-encoding");
            } else {
                iM22825t = mediaFormat.containsKey("v-bits-per-sample") ? uma.m22825t(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            lc3 lc3Var = new lc3();
            lc3Var.m16083p("audio/raw");
            lc3Var.m16080m(iM22825t);
            lc3Var.m16071d(c0713b.f6384J);
            lc3Var.m16072e(c0713b.f6385K);
            lc3Var.m16079l(c0713b.f6403l);
            lc3Var.m16074g(c0713b.f6392a);
            lc3Var.m16076i(c0713b.f6393b);
            lc3Var.m16077j(c0713b.f6394c);
            lc3Var.m16078k(c0713b.f6395d);
            lc3Var.m16085r(c0713b.f6396e);
            lc3Var.m16082o(c0713b.f6397f);
            lc3Var.m16069b(mediaFormat.getInteger("channel-count"));
            lc3Var.m16084q(mediaFormat.getInteger("sample-rate"));
            c0713b = lc3Var.m16068a();
            if (this.f62850h1) {
                iArrM16062b = lbd.m16062b(c0713b.f6381G);
            }
        }
        try {
            boolean z = this.f68707B0;
            s52 s52Var = this.f62847e1;
            if (z) {
                b68 b68Var = this.f69498d;
                b68Var.getClass();
                if (b68Var.f8019a != 0) {
                    b68 b68Var2 = this.f69498d;
                    b68Var2.getClass();
                    s52Var.f60351i = b68Var2.f8019a;
                } else {
                    s52Var.f60351i = 0;
                }
            } else {
                s52Var.f60351i = 0;
            }
            s52Var.m21084c(c0713b, iArrM16062b);
        } catch (AudioSink$ConfigurationException e) {
            throw m24992g(e, e.f6448a, false, 5001);
        }
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: h0 */
    public final void mo22303h0() {
        this.f62847e1.getClass();
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: j */
    public final qt5 mo22304j() {
        return this;
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: j0 */
    public final void mo12188j0() {
        this.f62847e1.f60319E = true;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: k */
    public final String mo4257k() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: m */
    public final boolean mo4258m() {
        if (!this.f68720N0) {
            return false;
        }
        s52 s52Var = this.f62847e1;
        if (s52Var.m21094n()) {
            return s52Var.f60326L && !s52Var.m21092l();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    @Override // p000.xt5
    /* JADX INFO: renamed from: m0 */
    public final boolean mo12190m0(long j, long j2, st5 st5Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C0713b c0713b) throws ExoPlaybackException {
        int i4;
        int i5;
        byteBuffer.getClass();
        this.f62860r1 = -9223372036854775807L;
        if (this.f62852j1 != null && (i2 & 2) != 0) {
            st5Var.getClass();
            st5Var.mo10720h(i);
            return true;
        }
        s52 s52Var = this.f62847e1;
        if (z) {
            if (st5Var != null) {
                st5Var.mo10720h(i);
            }
            this.f68728R0.f48973f += i3;
            s52Var.f60319E = true;
            return true;
        }
        try {
            if (!s52Var.m21091k(i3, j3, byteBuffer)) {
                this.f62860r1 = j3;
                return false;
            }
            if (st5Var != null) {
                st5Var.mo10720h(i);
            }
            this.f68728R0.f48972e += i3;
            return true;
        } catch (AudioSink$InitializationException e) {
            C0713b c0713b2 = this.f62851i1;
            if (this.f68707B0) {
                b68 b68Var = this.f69498d;
                b68Var.getClass();
                if (b68Var.f8019a != 0) {
                    i5 = 5004;
                } else {
                    i5 = 5001;
                }
            } else {
                i5 = 5001;
            }
            throw m24992g(e, c0713b2, e.f6449a, i5);
        } catch (AudioSink$WriteException e2) {
            if (this.f68707B0) {
                b68 b68Var2 = this.f69498d;
                b68Var2.getClass();
                if (b68Var2.f8019a != 0) {
                    i4 = 5003;
                } else {
                    i4 = 5002;
                }
            } else {
                i4 = 5002;
            }
            throw m24992g(e2, c0713b, e2.f6451b, i4);
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: o */
    public final boolean mo4259o() {
        return this.f62847e1.m21092l();
    }

    @Override // p000.xt5, p000.y90
    /* JADX INFO: renamed from: p */
    public final void mo4260p() {
        C3165jz c3165jz = this.f62846d1;
        this.f62855m1 = true;
        this.f62851i1 = null;
        this.f62860r1 = -9223372036854775807L;
        this.f62857o1 = false;
        try {
            this.f62847e1.m21087f();
            try {
                super.mo4260p();
            } finally {
                c3165jz.m14751a(this.f68728R0);
            }
        } catch (Throwable th) {
            try {
                super.mo4260p();
                throw th;
            } finally {
                c3165jz.m14751a(this.f68728R0);
            }
        }
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: p0 */
    public final void mo12191p0() throws ExoPlaybackException {
        try {
            s52 s52Var = this.f62847e1;
            if (!s52Var.f60326L && s52Var.m21094n() && s52Var.m21086e()) {
                if (!s52Var.f60327M) {
                    s52Var.f60327M = true;
                    if (s52Var.f60362t.m25885i()) {
                        s52Var.f60328N = false;
                    }
                    s52Var.f60362t.m25896t();
                }
                s52Var.f60326L = true;
            }
            long j = this.f68730S0.f67281e;
            if (j != -9223372036854775807L) {
                this.f62860r1 = j;
            }
        } catch (AudioSink$WriteException e) {
            throw m24992g(e, e.f6452c, e.f6451b, this.f68707B0 ? 5003 : 5002);
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: q */
    public final void mo4261q(boolean z, boolean z2) throws Exception {
        l32 l32Var = new l32();
        this.f68728R0 = l32Var;
        C3165jz c3165jz = this.f62846d1;
        Handler handler = c3165jz.f46413a;
        int i = 1;
        if (handler != null) {
            handler.post(new RunnableC2945dz(c3165jz, l32Var, i));
        }
        b68 b68Var = this.f69498d;
        b68Var.getClass();
        boolean z3 = b68Var.f8020b;
        s52 s52Var = this.f62847e1;
        if (z3) {
            bna.m3987z(s52Var.f60330P);
            if (!s52Var.f60336V) {
                s52Var.f60336V = true;
                s52Var.m21096p();
            }
        } else if (s52Var.f60336V) {
            s52Var.f60336V = false;
            s52Var.m21096p();
        }
        xb7 xb7Var = this.f69500f;
        xb7Var.getClass();
        s52Var.f60355m = xb7Var;
        mp9 mp9Var = this.f69501g;
        mp9Var.getClass();
        s52Var.f60360r.f7712g = mp9Var;
    }

    @Override // p000.xt5, p000.y90
    /* JADX INFO: renamed from: r */
    public final void mo4262r(long j, boolean z, boolean z2) {
        super.mo4262r(j, z, z2);
        this.f62847e1.m21087f();
        this.f62853k1 = j;
        this.f62860r1 = -9223372036854775807L;
        this.f62856n1 = false;
        this.f62857o1 = false;
        this.f62854l1 = true;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: s */
    public final void mo4263s() {
        C3309ls c3309ls;
        this.f62847e1.f60360r.m3141d();
        if (Build.VERSION.SDK_INT < 35 || (c3309ls = this.f62848f1) == null) {
            return;
        }
        ((HashSet) c3309ls.f50065c).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c3309ls.f50066d;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: t */
    public final void mo4264t() {
        s52 s52Var = this.f62847e1;
        this.f62856n1 = false;
        this.f62857o1 = false;
        this.f62860r1 = -9223372036854775807L;
        try {
            try {
                this.f68707B0 = false;
                m24696q0();
                m24695o0();
                web.m23861M(this.f68748c0, null);
                this.f68748c0 = null;
                if (this.f62855m1) {
                    this.f62855m1 = false;
                    s52Var.m21097q();
                }
            } catch (Throwable th) {
                web.m23861M(this.f68748c0, null);
                this.f68748c0 = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.f62855m1) {
                this.f62855m1 = false;
                s52Var.m21097q();
            }
            throw th2;
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: u */
    public final void mo12193u() {
        s52 s52Var = this.f62847e1;
        s52Var.f60329O = true;
        if (s52Var.m21094n()) {
            s52Var.f60362t.m25888l();
        }
        this.f62859q1 = true;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: v */
    public final void mo12194v() {
        m22301F0();
        this.f62859q1 = false;
        s52 s52Var = this.f62847e1;
        s52Var.f60329O = false;
        if (s52Var.m21094n()) {
            s52Var.f60362t.m25887k();
        }
        this.f62857o1 = false;
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: z0 */
    public final boolean mo22305z0(C0713b c0713b) {
        b68 b68Var = this.f69498d;
        b68Var.getClass();
        if (b68Var.f8019a != 0) {
            int iM22300E0 = m22300E0(c0713b);
            if ((iM22300E0 & 512) != 0) {
                b68 b68Var2 = this.f69498d;
                b68Var2.getClass();
                if (b68Var2.f8019a == 2 || (iM22300E0 & 1024) != 0 || (c0713b.f6384J == 0 && c0713b.f6385K == 0)) {
                    return true;
                }
            }
        }
        return this.f62847e1.m21089h(c0713b) != 0;
    }
}
