package p000;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.C0713b;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.exoplayer.audio.AudioOutput$WriteException;
import androidx.media3.exoplayer.audio.AudioOutputProvider$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import com.google.common.collect.ImmutableList;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
public final class s52 {

    /* JADX INFO: renamed from: c0 */
    public static final AtomicInteger f60314c0 = new AtomicInteger();

    /* JADX INFO: renamed from: A */
    public long f60315A;

    /* JADX INFO: renamed from: B */
    public long f60316B;

    /* JADX INFO: renamed from: C */
    public long f60317C;

    /* JADX INFO: renamed from: D */
    public int f60318D;

    /* JADX INFO: renamed from: E */
    public boolean f60319E;

    /* JADX INFO: renamed from: F */
    public boolean f60320F;

    /* JADX INFO: renamed from: G */
    public long f60321G;

    /* JADX INFO: renamed from: H */
    public float f60322H;

    /* JADX INFO: renamed from: I */
    public ByteBuffer f60323I;

    /* JADX INFO: renamed from: J */
    public int f60324J;

    /* JADX INFO: renamed from: K */
    public ByteBuffer f60325K;

    /* JADX INFO: renamed from: L */
    public boolean f60326L;

    /* JADX INFO: renamed from: M */
    public boolean f60327M;

    /* JADX INFO: renamed from: N */
    public boolean f60328N;

    /* JADX INFO: renamed from: O */
    public boolean f60329O;

    /* JADX INFO: renamed from: P */
    public boolean f60330P;

    /* JADX INFO: renamed from: Q */
    public int f60331Q;

    /* JADX INFO: renamed from: R */
    public boolean f60332R;

    /* JADX INFO: renamed from: S */
    public d60 f60333S;

    /* JADX INFO: renamed from: T */
    public AudioDeviceInfo f60334T;

    /* JADX INFO: renamed from: U */
    public int f60335U;

    /* JADX INFO: renamed from: V */
    public boolean f60336V;

    /* JADX INFO: renamed from: W */
    public long f60337W;

    /* JADX INFO: renamed from: X */
    public boolean f60338X;

    /* JADX INFO: renamed from: Y */
    public boolean f60339Y;

    /* JADX INFO: renamed from: Z */
    public long f60340Z;

    /* JADX INFO: renamed from: a */
    public final Context f60341a;

    /* JADX INFO: renamed from: a0 */
    public long f60342a0;

    /* JADX INFO: renamed from: b */
    public final C3309ls f60343b;

    /* JADX INFO: renamed from: b0 */
    public Handler f60344b0;

    /* JADX INFO: renamed from: c */
    public final gu0 f60345c;

    /* JADX INFO: renamed from: d */
    public final fca f60346d;

    /* JADX INFO: renamed from: e */
    public final s1a f60347e;

    /* JADX INFO: renamed from: f */
    public final r1a f60348f;

    /* JADX INFO: renamed from: g */
    public final ImmutableList f60349g;

    /* JADX INFO: renamed from: h */
    public final ArrayDeque f60350h;

    /* JADX INFO: renamed from: i */
    public int f60351i;

    /* JADX INFO: renamed from: j */
    public n52 f60352j;

    /* JADX INFO: renamed from: k */
    public final r52 f60353k;

    /* JADX INFO: renamed from: l */
    public final r52 f60354l;

    /* JADX INFO: renamed from: m */
    public xb7 f60355m;

    /* JADX INFO: renamed from: n */
    public cc4 f60356n;

    /* JADX INFO: renamed from: o */
    public p52 f60357o;

    /* JADX INFO: renamed from: p */
    public p52 f60358p;

    /* JADX INFO: renamed from: q */
    public C3813yy f60359q;

    /* JADX INFO: renamed from: r */
    public b00 f60360r;

    /* JADX INFO: renamed from: s */
    public m52 f60361s;

    /* JADX INFO: renamed from: t */
    public C3851zz f60362t;

    /* JADX INFO: renamed from: u */
    public C3476px f60363u;

    /* JADX INFO: renamed from: v */
    public q52 f60364v;

    /* JADX INFO: renamed from: w */
    public q52 f60365w;

    /* JADX INFO: renamed from: x */
    public n97 f60366x;

    /* JADX INFO: renamed from: y */
    public boolean f60367y;

    /* JADX INFO: renamed from: z */
    public long f60368z;

    public s52(tz1 tz1Var) {
        int deviceId;
        Context context = (Context) tz1Var.f63123b;
        this.f60341a = context.getApplicationContext();
        this.f60363u = C3476px.f56934c;
        this.f60343b = (C3309ls) tz1Var.f63124c;
        this.f60351i = 0;
        this.f60360r = (b00) tz1Var.f63126e;
        gu0 gu0Var = new gu0();
        this.f60345c = gu0Var;
        fca fcaVar = new fca();
        fcaVar.f38865m = uma.f64081b;
        this.f60346d = fcaVar;
        this.f60347e = new s1a();
        this.f60348f = new r1a();
        this.f60349g = ImmutableList.m6280B(fcaVar, gu0Var);
        this.f60322H = 1.0f;
        this.f60331Q = 0;
        this.f60333S = new d60();
        n97 n97Var = n97.f52509d;
        this.f60365w = new q52(n97Var, 0L, 0L);
        this.f60366x = n97Var;
        this.f60367y = false;
        this.f60350h = new ArrayDeque();
        this.f60353k = new r52();
        this.f60354l = new r52();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.f60335U = i;
    }

    /* JADX INFO: renamed from: i */
    public static int m21081i(int i, ByteBuffer byteBuffer) {
        if (i == 20) {
            return syb.m21780e(byteBuffer);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iPosition = byteBuffer.position();
                    String str = uma.f64080a;
                    int iReverseBytes = byteBuffer.getInt(iPosition);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        iReverseBytes = Integer.reverseBytes(iReverseBytes);
                    }
                    int iM22310b = tuc.m22310b(iReverseBytes);
                    if (iM22310b != -1) {
                        return iM22310b;
                    }
                    ij6.m13959q();
                    return 0;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int iM14735a = jx1.m14735a(byteBuffer);
                            if (iM14735a == -1) {
                                return 0;
                            }
                            return jx1.m14738d(iM14735a, byteBuffer) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return wx1.m24196e(byteBuffer);
                        case 18:
                            break;
                        default:
                            C3386nv.m17633t(ux5.m22988k(i, "Unexpected audio encoding: "));
                            return 0;
                    }
                    break;
            }
            return jx1.m14737c(byteBuffer);
        }
        return auc.m3076d(byteBuffer);
    }

    /* JADX INFO: renamed from: a */
    public final void m21082a(long j) {
        n97 n97Var;
        boolean zM21100t = m21100t();
        boolean z = false;
        C3309ls c3309ls = this.f60343b;
        if (zM21100t) {
            n97Var = n97.f52509d;
        } else {
            if (m21099s()) {
                n97Var = this.f60366x;
                wd9 wd9Var = (wd9) c3309ls.f50066d;
                float f = n97Var.f52510a;
                wd9Var.getClass();
                bna.m3969q(f > 0.0f);
                if (wd9Var.f66660c != f) {
                    wd9Var.f66660c = f;
                    wd9Var.f66666i = true;
                }
                float f2 = n97Var.f52511b;
                bna.m3969q(f2 > 0.0f);
                if (wd9Var.f66661d != f2) {
                    wd9Var.f66661d = f2;
                    wd9Var.f66666i = true;
                }
            } else {
                n97Var = n97.f52509d;
            }
            this.f60366x = n97Var;
        }
        n97 n97Var2 = n97Var;
        if (m21099s()) {
            z = this.f60367y;
            ((k79) c3309ls.f50065c).f46824o = z;
        }
        this.f60367y = z;
        this.f60350h.add(new q52(n97Var2, Math.max(0L, j), p52.m18897k(this.f60358p, m21090j())));
        C3813yy c3813yyM18887a = p52.m18887a(this.f60358p);
        this.f60359q = c3813yyM18887a;
        c3813yyM18887a.m25373b();
        cc4 cc4Var = this.f60356n;
        if (cc4Var != null) {
            final boolean z2 = this.f60367y;
            final C3165jz c3165jz = ((tt5) cc4Var.f9881a).f62846d1;
            Handler handler = c3165jz.f46413a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: iz
                    @Override // java.lang.Runnable
                    public final void run() {
                        ew2 ew2Var = c3165jz.f46414b;
                        String str = uma.f64080a;
                        jw2 jw2Var = ew2Var.f37985a;
                        boolean z3 = jw2Var.f46275V;
                        boolean z4 = z2;
                        if (z3 == z4) {
                            return;
                        }
                        jw2Var.f46275V = z4;
                        jw2Var.f46295m.m23271d(23, new xv2(1, z4));
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C3851zz m21083b(C3776xy c3776xy) throws AudioSink$InitializationException {
        try {
            return this.f60360r.m3138a(c3776xy);
        } catch (AudioOutputProvider$InitializationException e) {
            AudioSink$InitializationException audioSink$InitializationException = new AudioSink$InitializationException(c3776xy.f68937b, c3776xy.f68938c, c3776xy.f68936a, c3776xy.f68941f, p52.m18889c(this.f60358p), c3776xy.f68940e, e);
            cc4 cc4Var = this.f60356n;
            if (cc4Var == null) {
                throw audioSink$InitializationException;
            }
            cc4Var.m4519u(audioSink$InitializationException);
            throw audioSink$InitializationException;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m21084c(C0713b c0713b, int[] iArr) throws Exception {
        C3813yy c3813yy;
        C0713b c0713bM16068a;
        int i;
        int iM22819n;
        if (this.f60361s == null && this.f60341a != null) {
            m52 m52Var = new m52(this);
            this.f60361s = m52Var;
            b00 b00Var = this.f60360r;
            b00Var.m3143f();
            if (b00Var.f7711f == null) {
                b00Var.f7711f = new vg5(Thread.currentThread());
            }
            b00Var.f7711f.m23268a(m52Var);
        }
        String str = c0713b.f6406o;
        int i2 = c0713b.f6381G;
        int i3 = c0713b.f6383I;
        if ("audio/raw".equals(str)) {
            bna.m3969q(uma.m22830y(i3));
            int iM22819n2 = uma.m22819n(i3) * i2;
            c14 c14Var = new c14(4);
            c14Var.m3159d(this.f60349g);
            c14Var.m3157b(this.f60347e);
            c14Var.m3158c((InterfaceC0828bz[]) this.f60343b.f50064b);
            c3813yy = new C3813yy(c14Var.m4280g());
            if (c3813yy.equals(this.f60359q)) {
                c3813yy = this.f60359q;
            }
            int i4 = c0713b.f6384J;
            int i5 = c0713b.f6385K;
            fca fcaVar = this.f60346d;
            fcaVar.f38861i = i4;
            fcaVar.f38862j = i5;
            this.f60345c.f41319i = iArr;
            try {
                C3850zy c3850zyM25372a = c3813yy.m25372a(new C3850zy(c0713b.f6382H, i2, i3));
                int i6 = c3850zyM25372a.f72367b;
                int i7 = c3850zyM25372a.f72368c;
                lc3 lc3VarM2520a = c0713b.m2520a();
                lc3VarM2520a.m16080m(i7);
                lc3VarM2520a.m16084q(c3850zyM25372a.f72366a);
                lc3VarM2520a.m16069b(i6);
                c0713bM16068a = lc3VarM2520a.m16068a();
                i = iM22819n2;
                iM22819n = uma.m22819n(i7) * i6;
            } catch (AudioProcessor$UnhandledAudioFormatException e) {
                throw new AudioSink$ConfigurationException(e, c0713b);
            }
        } else {
            c3813yy = new C3813yy(ImmutableList.m6289v());
            c0713bM16068a = c0713b;
            i = -1;
            iM22819n = -1;
        }
        C3813yy c3813yy2 = c3813yy;
        C3628ty c3628tyM21088g = m21088g(c0713bM16068a);
        C0713b c0713b2 = c3628tyM21088g.f63075a;
        try {
            C3776xy c3776xyM3140c = this.f60360r.m3140c(c3628tyM21088g);
            boolean z = c3776xyM3140c.f68940e;
            if (c3776xyM3140c.f68936a == 0) {
                throw new AudioSink$ConfigurationException(hn1.m13355e("Invalid output encoding (isOffload=", ")", z), c0713b2);
            }
            if (c3776xyM3140c.f68938c == 0) {
                throw new AudioSink$ConfigurationException(hn1.m13355e("Invalid output channel config (isOffload=", ")", z), c0713b2);
            }
            this.f60338X = false;
            p52 p52Var = new p52(c0713b, c0713bM16068a, i, iM22819n, c3776xyM3140c, c3813yy2, 0);
            if (m21094n()) {
                this.f60357o = p52Var;
            } else {
                this.f60358p = p52Var;
            }
        } catch (AudioOutputProvider$ConfigurationException e2) {
            throw new AudioSink$ConfigurationException(e2, c0713b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    /* JADX INFO: renamed from: d */
    public final void m21085d(long j) throws AudioSink$WriteException {
        cc4 cc4Var;
        mw2 mw2Var;
        if (this.f60325K == null) {
            return;
        }
        r52 r52Var = this.f60354l;
        if (((Exception) r52Var.f58740c) != null && (f60314c0.get() > 0 || SystemClock.elapsedRealtime() < r52Var.f58739b)) {
            return;
        }
        int iRemaining = this.f60325K.remaining();
        boolean z = true;
        try {
            boolean zM25897u = this.f60362t.m25897u(this.f60324J, j, this.f60325K);
            this.f60337W = SystemClock.elapsedRealtime();
            r52Var.f58740c = null;
            r52Var.f58738a = -9223372036854775807L;
            r52Var.f58739b = -9223372036854775807L;
            if (this.f60362t.m25885i()) {
                if (this.f60317C > 0) {
                    this.f60339Y = false;
                }
                if (this.f60329O && (cc4Var = this.f60356n) != null && !zM25897u && !this.f60339Y && (mw2Var = ((tt5) cc4Var.f9881a).f68749d0) != null) {
                    mw2Var.m17063a();
                }
            }
            if (p52.m18893g(this.f60358p)) {
                this.f60316B += (long) (iRemaining - this.f60325K.remaining());
            }
            if (zM25897u) {
                if (!p52.m18893g(this.f60358p)) {
                    bna.m3987z(this.f60325K == this.f60323I);
                    this.f60317C = (((long) this.f60318D) * ((long) this.f60324J)) + this.f60317C;
                }
                this.f60325K = null;
            }
        } catch (AudioOutput$WriteException e) {
            boolean z2 = e.f6447b;
            if (!z2) {
                z = false;
            } else if (m21090j() <= 0) {
                if (!this.f60362t.m25885i()) {
                    z = false;
                } else if (p52.m18888b(this.f60358p).f68940e) {
                    this.f60338X = true;
                }
            }
            AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(e.f6446a, p52.m18889c(this.f60358p), z);
            cc4 cc4Var2 = this.f60356n;
            if (cc4Var2 != null) {
                cc4Var2.m4519u(audioSink$WriteException);
            }
            if (z2) {
                throw audioSink$WriteException;
            }
            r52Var.m20405a(audioSink$WriteException);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m21086e() throws AudioSink$WriteException {
        if (!this.f60359q.m25377f()) {
            m21085d(Long.MIN_VALUE);
            return this.f60325K == null;
        }
        this.f60359q.m25379h();
        m21095o(Long.MIN_VALUE);
        if (!this.f60359q.m25376e()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f60325K;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX INFO: renamed from: f */
    public final void m21087f() {
        if (m21094n()) {
            this.f60368z = 0L;
            this.f60315A = 0L;
            this.f60316B = 0L;
            this.f60317C = 0L;
            this.f60339Y = false;
            this.f60318D = 0;
            this.f60365w = new q52(this.f60366x, 0L, 0L);
            this.f60321G = 0L;
            this.f60364v = null;
            this.f60350h.clear();
            this.f60323I = null;
            this.f60324J = 0;
            this.f60325K = null;
            this.f60327M = false;
            this.f60326L = false;
            this.f60328N = false;
            this.f60346d.f38867o = 0L;
            C3813yy c3813yyM18887a = p52.m18887a(this.f60358p);
            this.f60359q = c3813yyM18887a;
            c3813yyM18887a.m25373b();
            this.f60352j = null;
            p52 p52Var = this.f60357o;
            if (p52Var != null) {
                this.f60358p = p52Var;
                this.f60357o = null;
            }
            f60314c0.incrementAndGet();
            this.f60362t.m25889m();
            this.f60362t = null;
        }
        r52 r52Var = this.f60354l;
        r52Var.f58740c = null;
        r52Var.f58738a = -9223372036854775807L;
        r52Var.f58739b = -9223372036854775807L;
        r52 r52Var2 = this.f60353k;
        r52Var2.f58740c = null;
        r52Var2.f58738a = -9223372036854775807L;
        r52Var2.f58739b = -9223372036854775807L;
        this.f60340Z = 0L;
        this.f60342a0 = 0L;
        Handler handler = this.f60344b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final C3628ty m21088g(C0713b c0713b) {
        C3628ty c3628ty = new C3628ty(c0713b);
        c3628ty.m22342b(this.f60363u);
        c3628ty.m22344d(this.f60351i != 0);
        c3628ty.m22347g(this.f60334T);
        c3628ty.m22343c(this.f60331Q);
        c3628ty.m22345e(this.f60336V);
        c3628ty.m22346f();
        c3628ty.m22348h(this.f60335U);
        return c3628ty.m22341a();
    }

    /* JADX INFO: renamed from: h */
    public final int m21089h(C0713b c0713b) {
        boolean z;
        if (!uma.m22830y(c0713b.f6383I) || c0713b.f6383I == 2) {
            z = false;
        } else {
            lc3 lc3VarM2520a = c0713b.m2520a();
            lc3VarM2520a.m16080m(2);
            c0713b = lc3VarM2520a.m16068a();
            z = true;
        }
        int i = this.f60360r.m3139b(m21088g(c0713b)).f66076d;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: j */
    public final long m21090j() {
        if (!p52.m18893g(this.f60358p)) {
            return this.f60317C;
        }
        long j = this.f60316B;
        long j2 = this.f60358p.f55590b;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:116:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0105  */
    /* JADX WARN: Code duplicated, block: B:62:0x010d  */
    /* JADX WARN: Code duplicated, block: B:63:0x010f  */
    /* JADX WARN: Code duplicated, block: B:67:0x011a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0122  */
    /* JADX WARN: Code duplicated, block: B:76:0x013b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0143  */
    /* JADX WARN: Code duplicated, block: B:80:0x0148  */
    /* JADX WARN: Code duplicated, block: B:82:0x0152  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0171  */
    /* JADX WARN: Code duplicated, block: B:90:0x0182  */
    /* JADX WARN: Code duplicated, block: B:94:0x0190  */
    /* JADX WARN: Code duplicated, block: B:97:0x0197  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a7  */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0134, code lost:
    
        if (r5 == 0) goto L73;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m21091k(int i, final long j, ByteBuffer byteBuffer) throws AudioSink$WriteException, AudioSink$InitializationException {
        boolean zM21094n;
        r52 r52Var;
        boolean z;
        p52 p52Var;
        long j2;
        final long jM18894h;
        cc4 cc4Var;
        cc4 cc4Var2;
        C3851zz c3851zz;
        ByteBuffer byteBuffer2 = this.f60323I;
        bna.m3969q(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f60357o == null) {
            zM21094n = m21094n();
            r52Var = this.f60353k;
            if (zM21094n) {
                r52Var.f58740c = null;
                r52Var.f58738a = -9223372036854775807L;
                r52Var.f58739b = -9223372036854775807L;
                if (this.f60320F) {
                    this.f60321G = Math.max(0L, j);
                    this.f60319E = false;
                    this.f60320F = false;
                    if (m21100t()) {
                        this.f60362t.m25892p(this.f60366x);
                        this.f60366x = this.f60362t.m25881e();
                    }
                    m21082a(j);
                    if (this.f60329O) {
                        this.f60329O = true;
                        if (m21094n()) {
                            this.f60362t.m25888l();
                        }
                    }
                }
                if (this.f60323I != null) {
                    if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bna.m3969q(z);
                    if (byteBuffer.hasRemaining()) {
                        if (!p52.m18893g(this.f60358p)) {
                            int iM21081i = m21081i(p52.m18888b(this.f60358p).f68936a, byteBuffer);
                            this.f60318D = iM21081i;
                        }
                        if (this.f60364v == null) {
                            long j3 = this.f60321G;
                            p52Var = this.f60358p;
                            if (p52.m18893g(p52Var)) {
                                j2 = this.f60368z / ((long) this.f60358p.f55589a);
                            } else {
                                j2 = this.f60315A;
                            }
                            jM18894h = p52.m18894h(p52Var, j2 - this.f60346d.f38867o) + j3;
                            if (!this.f60319E) {
                                cc4Var2 = this.f60356n;
                                if (cc4Var2 != null) {
                                    cc4Var2.m4519u(new Exception(j, jM18894h) { // from class: androidx.media3.exoplayer.audio.AudioSink$UnexpectedDiscontinuityException
                                        /* JADX WARN: Illegal instructions before constructor call */
                                        {
                                            StringBuilder sbM22996s = ux5.m22996s(jM18894h, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                            sbM22996s.append(j);
                                            super(sbM22996s.toString());
                                        }
                                    });
                                }
                                this.f60319E = true;
                            }
                            if (this.f60319E) {
                                if (m21086e()) {
                                    long j4 = j - jM18894h;
                                    this.f60321G += j4;
                                    this.f60319E = false;
                                    m21082a(j);
                                    cc4Var = this.f60356n;
                                    if (cc4Var != null) {
                                        ((tt5) cc4Var.f9881a).f62854l1 = true;
                                    }
                                }
                            }
                            if (p52.m18893g(this.f60358p)) {
                                this.f60368z += (long) byteBuffer.remaining();
                            } else {
                                this.f60315A = (((long) this.f60318D) * ((long) i)) + this.f60315A;
                            }
                            this.f60323I = byteBuffer;
                            this.f60324J = i;
                            m21095o(j);
                            if (!this.f60323I.hasRemaining()) {
                                this.f60323I = null;
                                this.f60324J = 0;
                                return true;
                            }
                            if (this.f60362t.m25886j()) {
                                ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                                m21087f();
                                return true;
                            }
                        } else if (m21086e()) {
                            m21082a(j);
                            this.f60364v = null;
                            long j5 = this.f60321G;
                            p52Var = this.f60358p;
                            if (p52.m18893g(p52Var)) {
                                j2 = this.f60368z / ((long) this.f60358p.f55589a);
                            } else {
                                j2 = this.f60315A;
                            }
                            jM18894h = p52.m18894h(p52Var, j2 - this.f60346d.f38867o) + j5;
                            if (!this.f60319E) {
                                cc4Var2 = this.f60356n;
                                if (cc4Var2 != null) {
                                    cc4Var2.m4519u(new Exception(j, jM18894h) { // from class: androidx.media3.exoplayer.audio.AudioSink$UnexpectedDiscontinuityException
                                        /* JADX WARN: Illegal instructions before constructor call */
                                        {
                                            StringBuilder sbM22996s = ux5.m22996s(jM18894h, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                            sbM22996s.append(j);
                                            super(sbM22996s.toString());
                                        }
                                    });
                                }
                                this.f60319E = true;
                            }
                            if (this.f60319E) {
                                if (m21086e()) {
                                    long j6 = j - jM18894h;
                                    this.f60321G += j6;
                                    this.f60319E = false;
                                    m21082a(j);
                                    cc4Var = this.f60356n;
                                    if (cc4Var != null) {
                                        ((tt5) cc4Var.f9881a).f62854l1 = true;
                                    }
                                }
                            }
                            if (p52.m18893g(this.f60358p)) {
                                this.f60368z += (long) byteBuffer.remaining();
                            } else {
                                this.f60315A = (((long) this.f60318D) * ((long) i)) + this.f60315A;
                            }
                            this.f60323I = byteBuffer;
                            this.f60324J = i;
                            m21095o(j);
                            if (!this.f60323I.hasRemaining()) {
                                this.f60323I = null;
                                this.f60324J = 0;
                                return true;
                            }
                            if (this.f60362t.m25886j()) {
                                ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                                m21087f();
                                return true;
                            }
                        }
                    }
                    return true;
                }
                m21095o(j);
                if (!this.f60323I.hasRemaining()) {
                    this.f60323I = null;
                    this.f60324J = 0;
                    return true;
                }
                if (this.f60362t.m25886j()) {
                    ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                    m21087f();
                    return true;
                }
            } else {
                try {
                    if (m21093m()) {
                        r52Var.f58740c = null;
                        r52Var.f58738a = -9223372036854775807L;
                        r52Var.f58739b = -9223372036854775807L;
                        if (this.f60320F) {
                            this.f60321G = Math.max(0L, j);
                            this.f60319E = false;
                            this.f60320F = false;
                            if (m21100t() && m21094n()) {
                                this.f60362t.m25892p(this.f60366x);
                                this.f60366x = this.f60362t.m25881e();
                            }
                            m21082a(j);
                            if (this.f60329O) {
                                this.f60329O = true;
                                if (m21094n()) {
                                    this.f60362t.m25888l();
                                }
                            }
                        }
                        if (this.f60323I != null) {
                            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bna.m3969q(z);
                            if (byteBuffer.hasRemaining()) {
                                if (!p52.m18893g(this.f60358p) && this.f60318D == 0) {
                                    int iM21081i2 = m21081i(p52.m18888b(this.f60358p).f68936a, byteBuffer);
                                    this.f60318D = iM21081i2;
                                }
                                if (this.f60364v == null) {
                                    long j7 = this.f60321G;
                                    p52Var = this.f60358p;
                                    if (p52.m18893g(p52Var)) {
                                        j2 = this.f60368z / ((long) this.f60358p.f55589a);
                                    } else {
                                        j2 = this.f60315A;
                                    }
                                    jM18894h = p52.m18894h(p52Var, j2 - this.f60346d.f38867o) + j7;
                                    if (!this.f60319E && Math.abs(jM18894h - j) > 200000) {
                                        cc4Var2 = this.f60356n;
                                        if (cc4Var2 != null) {
                                            cc4Var2.m4519u(new Exception(j, jM18894h) { // from class: androidx.media3.exoplayer.audio.AudioSink$UnexpectedDiscontinuityException
                                                /* JADX WARN: Illegal instructions before constructor call */
                                                {
                                                    StringBuilder sbM22996s = ux5.m22996s(jM18894h, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                                    sbM22996s.append(j);
                                                    super(sbM22996s.toString());
                                                }
                                            });
                                        }
                                        this.f60319E = true;
                                    }
                                    if (this.f60319E) {
                                        if (m21086e()) {
                                            long j8 = j - jM18894h;
                                            this.f60321G += j8;
                                            this.f60319E = false;
                                            m21082a(j);
                                            cc4Var = this.f60356n;
                                            if (cc4Var != null && j8 != 0) {
                                                ((tt5) cc4Var.f9881a).f62854l1 = true;
                                            }
                                        }
                                    }
                                    if (p52.m18893g(this.f60358p)) {
                                        this.f60368z += (long) byteBuffer.remaining();
                                    } else {
                                        this.f60315A = (((long) this.f60318D) * ((long) i)) + this.f60315A;
                                    }
                                    this.f60323I = byteBuffer;
                                    this.f60324J = i;
                                    m21095o(j);
                                    if (!this.f60323I.hasRemaining()) {
                                        this.f60323I = null;
                                        this.f60324J = 0;
                                        return true;
                                    }
                                    if (this.f60362t.m25886j()) {
                                        ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                                        m21087f();
                                        return true;
                                    }
                                } else if (m21086e()) {
                                    m21082a(j);
                                    this.f60364v = null;
                                    long j9 = this.f60321G;
                                    p52Var = this.f60358p;
                                    if (p52.m18893g(p52Var)) {
                                        j2 = this.f60368z / ((long) this.f60358p.f55589a);
                                    } else {
                                        j2 = this.f60315A;
                                    }
                                    jM18894h = p52.m18894h(p52Var, j2 - this.f60346d.f38867o) + j9;
                                    if (!this.f60319E) {
                                        cc4Var2 = this.f60356n;
                                        if (cc4Var2 != null) {
                                            cc4Var2.m4519u(new Exception(j, jM18894h) { // from class: androidx.media3.exoplayer.audio.AudioSink$UnexpectedDiscontinuityException
                                                /* JADX WARN: Illegal instructions before constructor call */
                                                {
                                                    StringBuilder sbM22996s = ux5.m22996s(jM18894h, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                                    sbM22996s.append(j);
                                                    super(sbM22996s.toString());
                                                }
                                            });
                                        }
                                        this.f60319E = true;
                                    }
                                    if (this.f60319E) {
                                        if (m21086e()) {
                                            long j10 = j - jM18894h;
                                            this.f60321G += j10;
                                            this.f60319E = false;
                                            m21082a(j);
                                            cc4Var = this.f60356n;
                                            if (cc4Var != null) {
                                                ((tt5) cc4Var.f9881a).f62854l1 = true;
                                            }
                                        }
                                    }
                                    if (p52.m18893g(this.f60358p)) {
                                        this.f60368z += (long) byteBuffer.remaining();
                                    } else {
                                        this.f60315A = (((long) this.f60318D) * ((long) i)) + this.f60315A;
                                    }
                                    this.f60323I = byteBuffer;
                                    this.f60324J = i;
                                    m21095o(j);
                                    if (!this.f60323I.hasRemaining()) {
                                        this.f60323I = null;
                                        this.f60324J = 0;
                                        return true;
                                    }
                                    if (this.f60362t.m25886j()) {
                                        ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                                        m21087f();
                                        return true;
                                    }
                                }
                            }
                            return true;
                        }
                        m21095o(j);
                        if (!this.f60323I.hasRemaining()) {
                            this.f60323I = null;
                            this.f60324J = 0;
                            return true;
                        }
                        if (this.f60362t.m25886j()) {
                            ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                            m21087f();
                            return true;
                        }
                    }
                } catch (AudioSink$InitializationException e) {
                    if (e.f6449a) {
                        throw e;
                    }
                    r52Var.m20405a(e);
                    return false;
                }
            }
        } else if (m21086e()) {
            if (this.f60362t != null) {
                C3776xy c3776xyM18888b = p52.m18888b(this.f60358p);
                m21088g(p52.m18892f(this.f60357o));
                if (C3851zz.m25877b(c3776xyM18888b, p52.m18888b(this.f60357o))) {
                    this.f60358p = this.f60357o;
                    this.f60357o = null;
                    c3851zz = this.f60362t;
                    if (c3851zz != null && c3851zz.m25885i() && p52.m18888b(this.f60358p).f68946k) {
                        this.f60362t.m25891o();
                        this.f60362t.m25890n(p52.m18889c(this.f60358p).f6384J, p52.m18889c(this.f60358p).f6385K);
                        this.f60339Y = true;
                    }
                } else {
                    if (!this.f60327M) {
                        this.f60327M = true;
                        if (this.f60362t.m25885i()) {
                            this.f60328N = false;
                        }
                        this.f60362t.m25896t();
                    }
                    if (!m21092l()) {
                        m21087f();
                    }
                }
                m21082a(j);
                zM21094n = m21094n();
                r52Var = this.f60353k;
                if (zM21094n) {
                    r52Var.f58740c = null;
                    r52Var.f58738a = -9223372036854775807L;
                    r52Var.f58739b = -9223372036854775807L;
                    if (this.f60320F) {
                        this.f60321G = Math.max(0L, j);
                        this.f60319E = false;
                        this.f60320F = false;
                        if (m21100t()) {
                            this.f60362t.m25892p(this.f60366x);
                            this.f60366x = this.f60362t.m25881e();
                        }
                        m21082a(j);
                        if (this.f60329O) {
                            this.f60329O = true;
                            if (m21094n()) {
                                this.f60362t.m25888l();
                            }
                        }
                    }
                    if (this.f60323I != null) {
                        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bna.m3969q(z);
                        if (byteBuffer.hasRemaining()) {
                            if (!p52.m18893g(this.f60358p)) {
                                int iM21081i3 = m21081i(p52.m18888b(this.f60358p).f68936a, byteBuffer);
                                this.f60318D = iM21081i3;
                            }
                            if (this.f60364v == null) {
                                long j11 = this.f60321G;
                                p52Var = this.f60358p;
                                if (p52.m18893g(p52Var)) {
                                    j2 = this.f60368z / ((long) this.f60358p.f55589a);
                                } else {
                                    j2 = this.f60315A;
                                }
                                jM18894h = p52.m18894h(p52Var, j2 - this.f60346d.f38867o) + j11;
                                if (!this.f60319E) {
                                    cc4Var2 = this.f60356n;
                                    if (cc4Var2 != null) {
                                        cc4Var2.m4519u(new Exception(j, jM18894h) { // from class: androidx.media3.exoplayer.audio.AudioSink$UnexpectedDiscontinuityException
                                            /* JADX WARN: Illegal instructions before constructor call */
                                            {
                                                StringBuilder sbM22996s = ux5.m22996s(jM18894h, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                                sbM22996s.append(j);
                                                super(sbM22996s.toString());
                                            }
                                        });
                                    }
                                    this.f60319E = true;
                                }
                                if (this.f60319E) {
                                    if (m21086e()) {
                                        long j12 = j - jM18894h;
                                        this.f60321G += j12;
                                        this.f60319E = false;
                                        m21082a(j);
                                        cc4Var = this.f60356n;
                                        if (cc4Var != null) {
                                            ((tt5) cc4Var.f9881a).f62854l1 = true;
                                        }
                                    }
                                }
                                if (p52.m18893g(this.f60358p)) {
                                    this.f60368z += (long) byteBuffer.remaining();
                                } else {
                                    this.f60315A = (((long) this.f60318D) * ((long) i)) + this.f60315A;
                                }
                                this.f60323I = byteBuffer;
                                this.f60324J = i;
                                m21095o(j);
                                if (!this.f60323I.hasRemaining()) {
                                    this.f60323I = null;
                                    this.f60324J = 0;
                                    return true;
                                }
                                if (this.f60362t.m25886j()) {
                                    ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                                    m21087f();
                                    return true;
                                }
                            } else if (m21086e()) {
                                m21082a(j);
                                this.f60364v = null;
                                long j13 = this.f60321G;
                                p52Var = this.f60358p;
                                if (p52.m18893g(p52Var)) {
                                    j2 = this.f60368z / ((long) this.f60358p.f55589a);
                                } else {
                                    j2 = this.f60315A;
                                }
                                jM18894h = p52.m18894h(p52Var, j2 - this.f60346d.f38867o) + j13;
                                if (!this.f60319E) {
                                    cc4Var2 = this.f60356n;
                                    if (cc4Var2 != null) {
                                        cc4Var2.m4519u(new Exception(j, jM18894h) { // from class: androidx.media3.exoplayer.audio.AudioSink$UnexpectedDiscontinuityException
                                            /* JADX WARN: Illegal instructions before constructor call */
                                            {
                                                StringBuilder sbM22996s = ux5.m22996s(jM18894h, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                                sbM22996s.append(j);
                                                super(sbM22996s.toString());
                                            }
                                        });
                                    }
                                    this.f60319E = true;
                                }
                                if (this.f60319E) {
                                    if (m21086e()) {
                                        long j14 = j - jM18894h;
                                        this.f60321G += j14;
                                        this.f60319E = false;
                                        m21082a(j);
                                        cc4Var = this.f60356n;
                                        if (cc4Var != null) {
                                            ((tt5) cc4Var.f9881a).f62854l1 = true;
                                        }
                                    }
                                }
                                if (p52.m18893g(this.f60358p)) {
                                    this.f60368z += (long) byteBuffer.remaining();
                                } else {
                                    this.f60315A = (((long) this.f60318D) * ((long) i)) + this.f60315A;
                                }
                                this.f60323I = byteBuffer;
                                this.f60324J = i;
                                m21095o(j);
                                if (!this.f60323I.hasRemaining()) {
                                    this.f60323I = null;
                                    this.f60324J = 0;
                                    return true;
                                }
                                if (this.f60362t.m25886j()) {
                                    ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                                    m21087f();
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    m21095o(j);
                    if (!this.f60323I.hasRemaining()) {
                        this.f60323I = null;
                        this.f60324J = 0;
                        return true;
                    }
                    if (this.f60362t.m25886j()) {
                        ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                        m21087f();
                        return true;
                    }
                } else if (m21093m()) {
                    r52Var.f58740c = null;
                    r52Var.f58738a = -9223372036854775807L;
                    r52Var.f58739b = -9223372036854775807L;
                    if (this.f60320F) {
                        this.f60321G = Math.max(0L, j);
                        this.f60319E = false;
                        this.f60320F = false;
                        if (m21100t()) {
                            this.f60362t.m25892p(this.f60366x);
                            this.f60366x = this.f60362t.m25881e();
                        }
                        m21082a(j);
                        if (this.f60329O) {
                            this.f60329O = true;
                            if (m21094n()) {
                                this.f60362t.m25888l();
                            }
                        }
                    }
                    if (this.f60323I != null) {
                        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bna.m3969q(z);
                        if (byteBuffer.hasRemaining()) {
                            if (!p52.m18893g(this.f60358p)) {
                                int iM21081i4 = m21081i(p52.m18888b(this.f60358p).f68936a, byteBuffer);
                                this.f60318D = iM21081i4;
                            }
                            if (this.f60364v == null) {
                                long j15 = this.f60321G;
                                p52Var = this.f60358p;
                                if (p52.m18893g(p52Var)) {
                                    j2 = this.f60368z / ((long) this.f60358p.f55589a);
                                } else {
                                    j2 = this.f60315A;
                                }
                                jM18894h = p52.m18894h(p52Var, j2 - this.f60346d.f38867o) + j15;
                                if (!this.f60319E) {
                                    cc4Var2 = this.f60356n;
                                    if (cc4Var2 != null) {
                                        cc4Var2.m4519u(new Exception(j, jM18894h) { // from class: androidx.media3.exoplayer.audio.AudioSink$UnexpectedDiscontinuityException
                                            /* JADX WARN: Illegal instructions before constructor call */
                                            {
                                                StringBuilder sbM22996s = ux5.m22996s(jM18894h, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                                sbM22996s.append(j);
                                                super(sbM22996s.toString());
                                            }
                                        });
                                    }
                                    this.f60319E = true;
                                }
                                if (this.f60319E) {
                                    if (m21086e()) {
                                        long j16 = j - jM18894h;
                                        this.f60321G += j16;
                                        this.f60319E = false;
                                        m21082a(j);
                                        cc4Var = this.f60356n;
                                        if (cc4Var != null) {
                                            ((tt5) cc4Var.f9881a).f62854l1 = true;
                                        }
                                    }
                                }
                                if (p52.m18893g(this.f60358p)) {
                                    this.f60368z += (long) byteBuffer.remaining();
                                } else {
                                    this.f60315A = (((long) this.f60318D) * ((long) i)) + this.f60315A;
                                }
                                this.f60323I = byteBuffer;
                                this.f60324J = i;
                                m21095o(j);
                                if (!this.f60323I.hasRemaining()) {
                                    this.f60323I = null;
                                    this.f60324J = 0;
                                    return true;
                                }
                                if (this.f60362t.m25886j()) {
                                    ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                                    m21087f();
                                    return true;
                                }
                            } else if (m21086e()) {
                                m21082a(j);
                                this.f60364v = null;
                                long j17 = this.f60321G;
                                p52Var = this.f60358p;
                                if (p52.m18893g(p52Var)) {
                                    j2 = this.f60368z / ((long) this.f60358p.f55589a);
                                } else {
                                    j2 = this.f60315A;
                                }
                                jM18894h = p52.m18894h(p52Var, j2 - this.f60346d.f38867o) + j17;
                                if (!this.f60319E) {
                                    cc4Var2 = this.f60356n;
                                    if (cc4Var2 != null) {
                                        cc4Var2.m4519u(new Exception(j, jM18894h) { // from class: androidx.media3.exoplayer.audio.AudioSink$UnexpectedDiscontinuityException
                                            /* JADX WARN: Illegal instructions before constructor call */
                                            {
                                                StringBuilder sbM22996s = ux5.m22996s(jM18894h, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                                sbM22996s.append(j);
                                                super(sbM22996s.toString());
                                            }
                                        });
                                    }
                                    this.f60319E = true;
                                }
                                if (this.f60319E) {
                                    if (m21086e()) {
                                        long j18 = j - jM18894h;
                                        this.f60321G += j18;
                                        this.f60319E = false;
                                        m21082a(j);
                                        cc4Var = this.f60356n;
                                        if (cc4Var != null) {
                                            ((tt5) cc4Var.f9881a).f62854l1 = true;
                                        }
                                    }
                                }
                                if (p52.m18893g(this.f60358p)) {
                                    this.f60368z += (long) byteBuffer.remaining();
                                } else {
                                    this.f60315A = (((long) this.f60318D) * ((long) i)) + this.f60315A;
                                }
                                this.f60323I = byteBuffer;
                                this.f60324J = i;
                                m21095o(j);
                                if (!this.f60323I.hasRemaining()) {
                                    this.f60323I = null;
                                    this.f60324J = 0;
                                    return true;
                                }
                                if (this.f60362t.m25886j()) {
                                    ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                                    m21087f();
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    m21095o(j);
                    if (!this.f60323I.hasRemaining()) {
                        this.f60323I = null;
                        this.f60324J = 0;
                        return true;
                    }
                    if (this.f60362t.m25886j()) {
                        ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                        m21087f();
                        return true;
                    }
                }
            } else {
                this.f60358p = this.f60357o;
                this.f60357o = null;
                c3851zz = this.f60362t;
                if (c3851zz != null) {
                    this.f60362t.m25891o();
                    this.f60362t.m25890n(p52.m18889c(this.f60358p).f6384J, p52.m18889c(this.f60358p).f6385K);
                    this.f60339Y = true;
                }
                m21082a(j);
                zM21094n = m21094n();
                r52Var = this.f60353k;
                if (zM21094n) {
                    r52Var.f58740c = null;
                    r52Var.f58738a = -9223372036854775807L;
                    r52Var.f58739b = -9223372036854775807L;
                    if (this.f60320F) {
                        this.f60321G = Math.max(0L, j);
                        this.f60319E = false;
                        this.f60320F = false;
                        if (m21100t()) {
                            this.f60362t.m25892p(this.f60366x);
                            this.f60366x = this.f60362t.m25881e();
                        }
                        m21082a(j);
                        if (this.f60329O) {
                            this.f60329O = true;
                            if (m21094n()) {
                                this.f60362t.m25888l();
                            }
                        }
                    }
                    if (this.f60323I != null) {
                        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bna.m3969q(z);
                        if (byteBuffer.hasRemaining()) {
                            if (!p52.m18893g(this.f60358p)) {
                                int iM21081i5 = m21081i(p52.m18888b(this.f60358p).f68936a, byteBuffer);
                                this.f60318D = iM21081i5;
                            }
                            if (this.f60364v == null) {
                                long j19 = this.f60321G;
                                p52Var = this.f60358p;
                                if (p52.m18893g(p52Var)) {
                                    j2 = this.f60368z / ((long) this.f60358p.f55589a);
                                } else {
                                    j2 = this.f60315A;
                                }
                                jM18894h = p52.m18894h(p52Var, j2 - this.f60346d.f38867o) + j19;
                                if (!this.f60319E) {
                                    cc4Var2 = this.f60356n;
                                    if (cc4Var2 != null) {
                                        cc4Var2.m4519u(new Exception(j, jM18894h) { // from class: androidx.media3.exoplayer.audio.AudioSink$UnexpectedDiscontinuityException
                                            /* JADX WARN: Illegal instructions before constructor call */
                                            {
                                                StringBuilder sbM22996s = ux5.m22996s(jM18894h, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                                sbM22996s.append(j);
                                                super(sbM22996s.toString());
                                            }
                                        });
                                    }
                                    this.f60319E = true;
                                }
                                if (this.f60319E) {
                                    if (m21086e()) {
                                        long j110 = j - jM18894h;
                                        this.f60321G += j110;
                                        this.f60319E = false;
                                        m21082a(j);
                                        cc4Var = this.f60356n;
                                        if (cc4Var != null) {
                                            ((tt5) cc4Var.f9881a).f62854l1 = true;
                                        }
                                    }
                                }
                                if (p52.m18893g(this.f60358p)) {
                                    this.f60368z += (long) byteBuffer.remaining();
                                } else {
                                    this.f60315A = (((long) this.f60318D) * ((long) i)) + this.f60315A;
                                }
                                this.f60323I = byteBuffer;
                                this.f60324J = i;
                                m21095o(j);
                                if (!this.f60323I.hasRemaining()) {
                                    this.f60323I = null;
                                    this.f60324J = 0;
                                    return true;
                                }
                                if (this.f60362t.m25886j()) {
                                    ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                                    m21087f();
                                    return true;
                                }
                            } else if (m21086e()) {
                                m21082a(j);
                                this.f60364v = null;
                                long j111 = this.f60321G;
                                p52Var = this.f60358p;
                                if (p52.m18893g(p52Var)) {
                                    j2 = this.f60368z / ((long) this.f60358p.f55589a);
                                } else {
                                    j2 = this.f60315A;
                                }
                                jM18894h = p52.m18894h(p52Var, j2 - this.f60346d.f38867o) + j111;
                                if (!this.f60319E) {
                                    cc4Var2 = this.f60356n;
                                    if (cc4Var2 != null) {
                                        cc4Var2.m4519u(new Exception(j, jM18894h) { // from class: androidx.media3.exoplayer.audio.AudioSink$UnexpectedDiscontinuityException
                                            /* JADX WARN: Illegal instructions before constructor call */
                                            {
                                                StringBuilder sbM22996s = ux5.m22996s(jM18894h, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                                sbM22996s.append(j);
                                                super(sbM22996s.toString());
                                            }
                                        });
                                    }
                                    this.f60319E = true;
                                }
                                if (this.f60319E) {
                                    if (m21086e()) {
                                        long j112 = j - jM18894h;
                                        this.f60321G += j112;
                                        this.f60319E = false;
                                        m21082a(j);
                                        cc4Var = this.f60356n;
                                        if (cc4Var != null) {
                                            ((tt5) cc4Var.f9881a).f62854l1 = true;
                                        }
                                    }
                                }
                                if (p52.m18893g(this.f60358p)) {
                                    this.f60368z += (long) byteBuffer.remaining();
                                } else {
                                    this.f60315A = (((long) this.f60318D) * ((long) i)) + this.f60315A;
                                }
                                this.f60323I = byteBuffer;
                                this.f60324J = i;
                                m21095o(j);
                                if (!this.f60323I.hasRemaining()) {
                                    this.f60323I = null;
                                    this.f60324J = 0;
                                    return true;
                                }
                                if (this.f60362t.m25886j()) {
                                    ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                                    m21087f();
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    m21095o(j);
                    if (!this.f60323I.hasRemaining()) {
                        this.f60323I = null;
                        this.f60324J = 0;
                        return true;
                    }
                    if (this.f60362t.m25886j()) {
                        ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                        m21087f();
                        return true;
                    }
                } else if (m21093m()) {
                    r52Var.f58740c = null;
                    r52Var.f58738a = -9223372036854775807L;
                    r52Var.f58739b = -9223372036854775807L;
                    if (this.f60320F) {
                        this.f60321G = Math.max(0L, j);
                        this.f60319E = false;
                        this.f60320F = false;
                        if (m21100t()) {
                            this.f60362t.m25892p(this.f60366x);
                            this.f60366x = this.f60362t.m25881e();
                        }
                        m21082a(j);
                        if (this.f60329O) {
                            this.f60329O = true;
                            if (m21094n()) {
                                this.f60362t.m25888l();
                            }
                        }
                    }
                    if (this.f60323I != null) {
                        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bna.m3969q(z);
                        if (byteBuffer.hasRemaining()) {
                            if (!p52.m18893g(this.f60358p)) {
                                int iM21081i6 = m21081i(p52.m18888b(this.f60358p).f68936a, byteBuffer);
                                this.f60318D = iM21081i6;
                            }
                            if (this.f60364v == null) {
                                long j113 = this.f60321G;
                                p52Var = this.f60358p;
                                if (p52.m18893g(p52Var)) {
                                    j2 = this.f60368z / ((long) this.f60358p.f55589a);
                                } else {
                                    j2 = this.f60315A;
                                }
                                jM18894h = p52.m18894h(p52Var, j2 - this.f60346d.f38867o) + j113;
                                if (!this.f60319E) {
                                    cc4Var2 = this.f60356n;
                                    if (cc4Var2 != null) {
                                        cc4Var2.m4519u(new Exception(j, jM18894h) { // from class: androidx.media3.exoplayer.audio.AudioSink$UnexpectedDiscontinuityException
                                            /* JADX WARN: Illegal instructions before constructor call */
                                            {
                                                StringBuilder sbM22996s = ux5.m22996s(jM18894h, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                                sbM22996s.append(j);
                                                super(sbM22996s.toString());
                                            }
                                        });
                                    }
                                    this.f60319E = true;
                                }
                                if (this.f60319E) {
                                    if (m21086e()) {
                                        long j114 = j - jM18894h;
                                        this.f60321G += j114;
                                        this.f60319E = false;
                                        m21082a(j);
                                        cc4Var = this.f60356n;
                                        if (cc4Var != null) {
                                            ((tt5) cc4Var.f9881a).f62854l1 = true;
                                        }
                                    }
                                }
                                if (p52.m18893g(this.f60358p)) {
                                    this.f60368z += (long) byteBuffer.remaining();
                                } else {
                                    this.f60315A = (((long) this.f60318D) * ((long) i)) + this.f60315A;
                                }
                                this.f60323I = byteBuffer;
                                this.f60324J = i;
                                m21095o(j);
                                if (!this.f60323I.hasRemaining()) {
                                    this.f60323I = null;
                                    this.f60324J = 0;
                                    return true;
                                }
                                if (this.f60362t.m25886j()) {
                                    ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                                    m21087f();
                                    return true;
                                }
                            } else if (m21086e()) {
                                m21082a(j);
                                this.f60364v = null;
                                long j115 = this.f60321G;
                                p52Var = this.f60358p;
                                if (p52.m18893g(p52Var)) {
                                    j2 = this.f60368z / ((long) this.f60358p.f55589a);
                                } else {
                                    j2 = this.f60315A;
                                }
                                jM18894h = p52.m18894h(p52Var, j2 - this.f60346d.f38867o) + j115;
                                if (!this.f60319E) {
                                    cc4Var2 = this.f60356n;
                                    if (cc4Var2 != null) {
                                        cc4Var2.m4519u(new Exception(j, jM18894h) { // from class: androidx.media3.exoplayer.audio.AudioSink$UnexpectedDiscontinuityException
                                            /* JADX WARN: Illegal instructions before constructor call */
                                            {
                                                StringBuilder sbM22996s = ux5.m22996s(jM18894h, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                                sbM22996s.append(j);
                                                super(sbM22996s.toString());
                                            }
                                        });
                                    }
                                    this.f60319E = true;
                                }
                                if (this.f60319E) {
                                    if (m21086e()) {
                                        long j116 = j - jM18894h;
                                        this.f60321G += j116;
                                        this.f60319E = false;
                                        m21082a(j);
                                        cc4Var = this.f60356n;
                                        if (cc4Var != null) {
                                            ((tt5) cc4Var.f9881a).f62854l1 = true;
                                        }
                                    }
                                }
                                if (p52.m18893g(this.f60358p)) {
                                    this.f60368z += (long) byteBuffer.remaining();
                                } else {
                                    this.f60315A = (((long) this.f60318D) * ((long) i)) + this.f60315A;
                                }
                                this.f60323I = byteBuffer;
                                this.f60324J = i;
                                m21095o(j);
                                if (!this.f60323I.hasRemaining()) {
                                    this.f60323I = null;
                                    this.f60324J = 0;
                                    return true;
                                }
                                if (this.f60362t.m25886j()) {
                                    ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                                    m21087f();
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    m21095o(j);
                    if (!this.f60323I.hasRemaining()) {
                        this.f60323I = null;
                        this.f60324J = 0;
                        return true;
                    }
                    if (this.f60362t.m25886j()) {
                        ss5.m21707d0("DefaultAudioSink", "Resetting stalled audio output");
                        m21087f();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m21092l() {
        if (!m21094n()) {
            return false;
        }
        if (this.f60362t.m25885i() && this.f60328N) {
            return false;
        }
        long jM21090j = m21090j();
        long jM25882f = this.f60362t.m25882f();
        C3851zz c3851zz = this.f60362t;
        c3851zz.getClass();
        return jM21090j > uma.m22803H(jM25882f, (long) c3851zz.m25883g(), 1000000L, RoundingMode.UP);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m21093m() throws AudioSink$InitializationException {
        C3851zz c3851zzM21083b;
        C3309ls c3309ls;
        r52 r52Var = this.f60353k;
        if (((Exception) r52Var.f58740c) != null && (f60314c0.get() > 0 || SystemClock.elapsedRealtime() < r52Var.f58739b)) {
            return false;
        }
        int i = 1;
        try {
            c3851zzM21083b = m21083b(p52.m18888b(this.f60358p));
        } catch (AudioSink$InitializationException e) {
            int i2 = p52.m18888b(this.f60358p).f68941f;
            while (true) {
                p52 p52Var = this.f60358p;
                if (i2 <= 1000000) {
                    if (p52.m18888b(p52Var).f68940e) {
                        this.f60338X = true;
                    }
                    throw e;
                }
                i2 /= 2;
                int i3 = p52Var.f55590b != -1 ? this.f60358p.f55590b : 1;
                int i4 = i2 % i3;
                if (i4 != 0) {
                    i2 = (i3 - i4) + i2;
                }
                C3739wy c3739wyM24792a = p52.m18888b(this.f60358p).m24792a();
                c3739wyM24792a.m24206d(i2);
                C3776xy c3776xyM24203a = c3739wyM24792a.m24203a();
                try {
                    C3851zz c3851zzM21083b2 = m21083b(c3776xyM24203a);
                    this.f60358p = p52.m18891e(this.f60358p, c3776xyM24203a);
                    c3851zzM21083b = c3851zzM21083b2;
                    break;
                } catch (AudioSink$InitializationException e2) {
                    e.addSuppressed(e2);
                }
            }
        }
        this.f60362t = c3851zzM21083b;
        n52 n52Var = new n52(this, p52.m18888b(this.f60358p));
        this.f60352j = n52Var;
        this.f60362t.m25878a(n52Var);
        if (this.f60362t.m25885i() && p52.m18888b(this.f60358p).f68946k) {
            this.f60362t.m25890n(p52.m18889c(this.f60358p).f6384J, p52.m18889c(this.f60358p).f6385K);
        }
        xb7 xb7Var = this.f60355m;
        if (xb7Var != null) {
            this.f60362t.m25893q(xb7Var);
        }
        if (m21094n()) {
            this.f60362t.m25895s(this.f60322H);
        }
        this.f60333S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.f60334T;
        if (audioDeviceInfo != null) {
            this.f60362t.m25894r(audioDeviceInfo);
        }
        this.f60320F = true;
        int iM25879c = this.f60362t.m25879c();
        boolean z = iM25879c != this.f60331Q;
        this.f60331Q = iM25879c;
        cc4 cc4Var = this.f60356n;
        if (cc4Var != null) {
            C3279kz c3279kzM18890d = p52.m18890d(this.f60358p);
            C3165jz c3165jz = ((tt5) cc4Var.f9881a).f62846d1;
            Handler handler = c3165jz.f46413a;
            if (handler != null) {
                handler.post(new RunnableC3056gz(c3165jz, c3279kzM18890d, i));
            }
            if (z) {
                this.f60332R = true;
                p52 p52Var2 = this.f60358p;
                C3739wy c3739wyM24792a2 = p52.m18888b(p52Var2).m24792a();
                c3739wyM24792a2.m24205c(this.f60331Q);
                this.f60358p = p52.m18891e(p52Var2, c3739wyM24792a2.m24203a());
                p52 p52Var3 = this.f60357o;
                if (p52Var3 != null) {
                    C3739wy c3739wyM24792a3 = p52.m18888b(p52Var3).m24792a();
                    c3739wyM24792a3.m24205c(this.f60331Q);
                    this.f60357o = p52.m18891e(p52Var3, c3739wyM24792a3.m24203a());
                }
                cc4 cc4Var2 = this.f60356n;
                int i5 = this.f60331Q;
                tt5 tt5Var = (tt5) cc4Var2.f9881a;
                if (Build.VERSION.SDK_INT >= 35 && (c3309ls = tt5Var.f62848f1) != null) {
                    c3309ls.m16495O(i5);
                }
                C3165jz c3165jz2 = tt5Var.f62846d1;
                Handler handler2 = c3165jz2.f46413a;
                if (handler2 != null) {
                    handler2.post(new RunnableC2971eo(c3165jz2, i5, i));
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m21094n() {
        return this.f60362t != null;
    }

    /* JADX INFO: renamed from: o */
    public final void m21095o(long j) throws AudioSink$WriteException {
        m21085d(j);
        if (this.f60325K != null) {
            return;
        }
        if (!this.f60359q.m25377f()) {
            ByteBuffer byteBuffer = this.f60323I;
            if (byteBuffer != null) {
                m21098r(byteBuffer);
                m21085d(j);
                return;
            }
            return;
        }
        while (!this.f60359q.m25376e()) {
            do {
                ByteBuffer byteBufferM25375d = this.f60359q.m25375d();
                if (byteBufferM25375d.hasRemaining()) {
                    m21098r(byteBufferM25375d);
                    m21085d(j);
                } else {
                    ByteBuffer byteBuffer2 = this.f60323I;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f60359q.m25380i(this.f60323I);
                    }
                }
            } while (this.f60325K == null);
            return;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m21096p() throws Exception {
        if (this.f60358p != null) {
            p52 p52Var = this.f60357o;
            if (p52Var != null) {
                this.f60358p = p52Var;
                this.f60357o = null;
            }
            try {
                this.f60358p = new p52(p52.m18889c(this.f60358p), p52.m18892f(this.f60358p), this.f60358p.f55589a, this.f60358p.f55590b, this.f60360r.m3140c(m21088g(p52.m18892f(this.f60358p))), p52.m18887a(this.f60358p), 0);
            } catch (AudioOutputProvider$ConfigurationException e) {
                uk9.m22779n(new AudioSink$ConfigurationException(e, p52.m18889c(this.f60358p)));
                return;
            }
        }
        m21087f();
    }

    /* JADX INFO: renamed from: q */
    public final void m21097q() {
        m21087f();
        d14 d14VarListIterator = this.f60349g.listIterator(0);
        while (d14VarListIterator.hasNext()) {
            ((InterfaceC0828bz) d14VarListIterator.next()).reset();
        }
        this.f60347e.reset();
        this.f60348f.reset();
        C3813yy c3813yy = this.f60359q;
        if (c3813yy != null) {
            c3813yy.m25381j();
        }
        this.f60329O = false;
        this.f60338X = false;
    }

    /* JADX INFO: renamed from: r */
    public final void m21098r(ByteBuffer byteBuffer) {
        bna.m3987z(this.f60325K == null);
        if (byteBuffer.hasRemaining()) {
            if (p52.m18893g(this.f60358p)) {
                int iM22803H = (int) uma.m22803H(uma.m22797B(20L), p52.m18888b(this.f60358p).f68937b, 1000000L, RoundingMode.UP);
                long jM21090j = m21090j();
                if (jM21090j < iM22803H) {
                    byteBuffer = b0c.m3149a(byteBuffer, p52.m18888b(this.f60358p).f68936a, this.f60358p.f55590b, (int) jM21090j, iM22803H);
                }
            }
            this.f60325K = byteBuffer;
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m21099s() {
        if (this.f60336V || !p52.m18893g(this.f60358p)) {
            return false;
        }
        int i = p52.m18889c(this.f60358p).f6383I;
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m21100t() {
        p52 p52Var = this.f60358p;
        return p52Var != null && p52.m18888b(p52Var).f68945j;
    }
}
