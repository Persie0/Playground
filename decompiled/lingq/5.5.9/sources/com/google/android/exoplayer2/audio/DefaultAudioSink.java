package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.C0166e;
import android.util.Pair;
import android.view.Choreographer;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.emoji2.text.ThreadFactoryC0887a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.C2505u;
import com.google.android.exoplayer2.InterfaceC2536y;
import com.google.common.primitives.Ints;
import dm.C5207g;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p080e.RunnableC5286r;
import p174i9.C6215e0;
import p195j9.C6425b;
import p195j9.C6426c;
import p195j9.C6428e;
import p195j9.C6433j;
import p195j9.C6434k;
import p195j9.C6436m;
import p195j9.C6437n;
import p195j9.InterfaceC6429f;
import p195j9.RunnableC6431h;
import p195j9.RunnableC6432i;
import p338qd.C8573r0;
import p357r6.C8739a;
import p476x7.RunnableC10104c;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10136e;
import p479xa.C10145n;
import p479xa.C10147p;
import p508yd.C10351a;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: d0 */
    public static final Object f11848d0 = new Object();

    /* JADX INFO: renamed from: e0 */
    public static ExecutorService f11849e0;

    /* JADX INFO: renamed from: f0 */
    public static int f11850f0;

    /* JADX INFO: renamed from: A */
    public int f11851A;

    /* JADX INFO: renamed from: B */
    public long f11852B;

    /* JADX INFO: renamed from: C */
    public long f11853C;

    /* JADX INFO: renamed from: D */
    public long f11854D;

    /* JADX INFO: renamed from: E */
    public long f11855E;

    /* JADX INFO: renamed from: F */
    public int f11856F;

    /* JADX INFO: renamed from: G */
    public boolean f11857G;

    /* JADX INFO: renamed from: H */
    public boolean f11858H;

    /* JADX INFO: renamed from: I */
    public long f11859I;

    /* JADX INFO: renamed from: J */
    public float f11860J;

    /* JADX INFO: renamed from: K */
    public AudioProcessor[] f11861K;

    /* JADX INFO: renamed from: L */
    public ByteBuffer[] f11862L;

    /* JADX INFO: renamed from: M */
    public ByteBuffer f11863M;

    /* JADX INFO: renamed from: N */
    public int f11864N;

    /* JADX INFO: renamed from: O */
    public ByteBuffer f11865O;

    /* JADX INFO: renamed from: P */
    public byte[] f11866P;

    /* JADX INFO: renamed from: Q */
    public int f11867Q;

    /* JADX INFO: renamed from: R */
    public int f11868R;

    /* JADX INFO: renamed from: S */
    public boolean f11869S;

    /* JADX INFO: renamed from: T */
    public boolean f11870T;

    /* JADX INFO: renamed from: U */
    public boolean f11871U;

    /* JADX INFO: renamed from: V */
    public boolean f11872V;

    /* JADX INFO: renamed from: W */
    public int f11873W;

    /* JADX INFO: renamed from: X */
    public C6434k f11874X;

    /* JADX INFO: renamed from: Y */
    public C2358c f11875Y;

    /* JADX INFO: renamed from: Z */
    public boolean f11876Z;

    /* JADX INFO: renamed from: a */
    public final C6428e f11877a;

    /* JADX INFO: renamed from: a0 */
    public long f11878a0;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6429f f11879b;

    /* JADX INFO: renamed from: b0 */
    public boolean f11880b0;

    /* JADX INFO: renamed from: c */
    public final boolean f11881c;

    /* JADX INFO: renamed from: c0 */
    public boolean f11882c0;

    /* JADX INFO: renamed from: d */
    public final C2371e f11883d;

    /* JADX INFO: renamed from: e */
    public final C2378l f11884e;

    /* JADX INFO: renamed from: f */
    public final AudioProcessor[] f11885f;

    /* JADX INFO: renamed from: g */
    public final AudioProcessor[] f11886g;

    /* JADX INFO: renamed from: h */
    public final C10136e f11887h;

    /* JADX INFO: renamed from: i */
    public final C2369c f11888i;

    /* JADX INFO: renamed from: j */
    public final ArrayDeque<C2363h> f11889j;

    /* JADX INFO: renamed from: k */
    public final boolean f11890k;

    /* JADX INFO: renamed from: l */
    public final int f11891l;

    /* JADX INFO: renamed from: m */
    public C2366k f11892m;

    /* JADX INFO: renamed from: n */
    public final C2364i<AudioSink.InitializationException> f11893n;

    /* JADX INFO: renamed from: o */
    public final C2364i<AudioSink.WriteException> f11894o;

    /* JADX INFO: renamed from: p */
    public final C2372f f11895p;

    /* JADX INFO: renamed from: q */
    public C6215e0 f11896q;

    /* JADX INFO: renamed from: r */
    public AudioSink.InterfaceC2355a f11897r;

    /* JADX INFO: renamed from: s */
    public C2361f f11898s;

    /* JADX INFO: renamed from: t */
    public C2361f f11899t;

    /* JADX INFO: renamed from: u */
    public AudioTrack f11900u;

    /* JADX INFO: renamed from: v */
    public C2367a f11901v;

    /* JADX INFO: renamed from: w */
    public C2363h f11902w;

    /* JADX INFO: renamed from: x */
    public C2363h f11903x;

    /* JADX INFO: renamed from: y */
    public C2505u f11904y;

    /* JADX INFO: renamed from: z */
    public ByteBuffer f11905z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        public InvalidAudioTrackTimestampException() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$a */
    public static final class C2356a {
        /* JADX INFO: renamed from: a */
        public static void m6827a(AudioTrack audioTrack, C2358c c2358c) {
            audioTrack.setPreferredDevice(c2358c == null ? null : c2358c.f11906a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$b */
    public static final class C2357b {
        /* JADX INFO: renamed from: a */
        public static void m6828a(AudioTrack audioTrack, C6215e0 c6215e0) {
            C6215e0.a aVar = c6215e0.f36164a;
            aVar.getClass();
            LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            LogSessionId logSessionId2 = aVar.f36166a;
            if (logSessionId2.equals(logSessionId)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionId2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$c */
    public static final class C2358c {

        /* JADX INFO: renamed from: a */
        public final AudioDeviceInfo f11906a;

        public C2358c(AudioDeviceInfo audioDeviceInfo) {
            this.f11906a = audioDeviceInfo;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$d */
    public interface InterfaceC2359d {

        /* JADX INFO: renamed from: a */
        public static final C2372f f11907a = new C2372f(new C2372f.a());
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$e */
    public static final class C2360e {

        /* JADX INFO: renamed from: b */
        public C2362g f11909b;

        /* JADX INFO: renamed from: c */
        public boolean f11910c;

        /* JADX INFO: renamed from: d */
        public boolean f11911d;

        /* JADX INFO: renamed from: a */
        public C6428e f11908a = C6428e.f36916c;

        /* JADX INFO: renamed from: e */
        public int f11912e = 0;

        /* JADX INFO: renamed from: f */
        public final C2372f f11913f = InterfaceC2359d.f11907a;
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$f */
    public static final class C2361f {

        /* JADX INFO: renamed from: a */
        public final C2416m f11914a;

        /* JADX INFO: renamed from: b */
        public final int f11915b;

        /* JADX INFO: renamed from: c */
        public final int f11916c;

        /* JADX INFO: renamed from: d */
        public final int f11917d;

        /* JADX INFO: renamed from: e */
        public final int f11918e;

        /* JADX INFO: renamed from: f */
        public final int f11919f;

        /* JADX INFO: renamed from: g */
        public final int f11920g;

        /* JADX INFO: renamed from: h */
        public final int f11921h;

        /* JADX INFO: renamed from: i */
        public final AudioProcessor[] f11922i;

        public C2361f(C2416m c2416m, int i10, int i11, int i12, int i13, int i14, int i15, int i16, AudioProcessor[] audioProcessorArr) {
            this.f11914a = c2416m;
            this.f11915b = i10;
            this.f11916c = i11;
            this.f11917d = i12;
            this.f11918e = i13;
            this.f11919f = i14;
            this.f11920g = i15;
            this.f11921h = i16;
            this.f11922i = audioProcessorArr;
        }

        /* JADX INFO: renamed from: c */
        public static AudioAttributes m6829c(C2367a c2367a, boolean z10) {
            return z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : c2367a.m6838a().f11944a;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final AudioTrack m6830a(boolean z10, C2367a c2367a, int i10) throws AudioSink.InitializationException {
            int i11 = this.f11916c;
            try {
                AudioTrack audioTrackM6831b = m6831b(z10, c2367a, i10);
                int state = audioTrackM6831b.getState();
                if (state == 1) {
                    return audioTrackM6831b;
                }
                try {
                    audioTrackM6831b.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f11918e, this.f11919f, this.f11921h, this.f11914a, i11 == 1, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new AudioSink.InitializationException(0, this.f11918e, this.f11919f, this.f11921h, this.f11914a, i11 == 1, e10);
            }
        }

        /* JADX INFO: renamed from: b */
        public final AudioTrack m6831b(boolean z10, C2367a c2367a, int i10) {
            int i11 = C10134c0.f51354a;
            int i12 = this.f11920g;
            int i13 = this.f11919f;
            int i14 = this.f11918e;
            if (i11 < 29) {
                if (i11 >= 21) {
                    return new AudioTrack(m6829c(c2367a, z10), DefaultAudioSink.m6809r(i14, i13, i12), this.f11921h, 1, i10);
                }
                int iM19057x = C10134c0.m19057x(c2367a.f11940c);
                return i10 == 0 ? new AudioTrack(iM19057x, this.f11918e, this.f11919f, this.f11920g, this.f11921h, 1) : new AudioTrack(iM19057x, this.f11918e, this.f11919f, this.f11920g, this.f11921h, 1, i10);
            }
            AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(m6829c(c2367a, z10)).setAudioFormat(DefaultAudioSink.m6809r(i14, i13, i12));
            boolean z11 = true;
            AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.f11921h).setSessionId(i10);
            if (this.f11916c != 1) {
                z11 = false;
            }
            return sessionId.setOffloadedPlayback(z11).build();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$g */
    public static class C2362g implements InterfaceC6429f {

        /* JADX INFO: renamed from: a */
        public final AudioProcessor[] f11923a;

        /* JADX INFO: renamed from: b */
        public final C2376j f11924b;

        /* JADX INFO: renamed from: c */
        public final C2377k f11925c;

        public C2362g(AudioProcessor... audioProcessorArr) {
            C2376j c2376j = new C2376j();
            C2377k c2377k = new C2377k();
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f11923a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f11924b = c2376j;
            this.f11925c = c2377k;
            audioProcessorArr2[audioProcessorArr.length] = c2376j;
            audioProcessorArr2[audioProcessorArr.length + 1] = c2377k;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$h */
    public static final class C2363h {

        /* JADX INFO: renamed from: a */
        public final C2505u f11926a;

        /* JADX INFO: renamed from: b */
        public final boolean f11927b;

        /* JADX INFO: renamed from: c */
        public final long f11928c;

        /* JADX INFO: renamed from: d */
        public final long f11929d;

        public C2363h(C2505u c2505u, boolean z10, long j10, long j11) {
            this.f11926a = c2505u;
            this.f11927b = z10;
            this.f11928c = j10;
            this.f11929d = j11;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$i */
    public static final class C2364i<T extends Exception> {

        /* JADX INFO: renamed from: a */
        public T f11930a;

        /* JADX INFO: renamed from: b */
        public long f11931b;

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final void m6832a(T t10) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f11930a == null) {
                this.f11930a = t10;
                this.f11931b = 100 + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f11931b) {
                T t11 = this.f11930a;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f11930a;
                this.f11930a = null;
                throw t12;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$j */
    public final class C2365j implements C2369c.a {
        public C2365j() {
        }

        @Override // com.google.android.exoplayer2.audio.C2369c.a
        /* JADX INFO: renamed from: a */
        public final void mo6833a(long j10) {
            InterfaceC2368b.a aVar;
            Handler handler;
            AudioSink.InterfaceC2355a interfaceC2355a = DefaultAudioSink.this.f11897r;
            if (interfaceC2355a == null || (handler = (aVar = C2374h.this.f11991Y0).f11945a) == null) {
                return;
            }
            handler.post(new RunnableC10104c(aVar, j10));
        }

        @Override // com.google.android.exoplayer2.audio.C2369c.a
        /* JADX INFO: renamed from: b */
        public final void mo6834b(int i10, long j10) {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            if (defaultAudioSink.f11897r != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - defaultAudioSink.f11878a0;
                InterfaceC2368b.a aVar = C2374h.this.f11991Y0;
                Handler handler = aVar.f11945a;
                if (handler != null) {
                    handler.post(new RunnableC6432i(aVar, i10, j10, jElapsedRealtime, 0));
                }
            }
        }

        @Override // com.google.android.exoplayer2.audio.C2369c.a
        /* JADX INFO: renamed from: c */
        public final void mo6835c(long j10) {
            C10145n.m19099g("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // com.google.android.exoplayer2.audio.C2369c.a
        /* JADX INFO: renamed from: d */
        public final void mo6836d(long j10, long j11, long j12, long j13) {
            StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j12);
            sb2.append(", ");
            sb2.append(j13);
            sb2.append(", ");
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            sb2.append(defaultAudioSink.m6821t());
            sb2.append(", ");
            sb2.append(defaultAudioSink.m6822u());
            String string = sb2.toString();
            Object obj = DefaultAudioSink.f11848d0;
            C10145n.m19099g("DefaultAudioSink", string);
        }

        @Override // com.google.android.exoplayer2.audio.C2369c.a
        /* JADX INFO: renamed from: e */
        public final void mo6837e(long j10, long j11, long j12, long j13) {
            StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j12);
            sb2.append(", ");
            sb2.append(j13);
            sb2.append(", ");
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            sb2.append(defaultAudioSink.m6821t());
            sb2.append(", ");
            sb2.append(defaultAudioSink.m6822u());
            String string = sb2.toString();
            Object obj = DefaultAudioSink.f11848d0;
            C10145n.m19099g("DefaultAudioSink", string);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$k */
    public final class C2366k {

        /* JADX INFO: renamed from: a */
        public final Handler f11933a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b */
        public final a f11934b = new a();

        /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$k$a */
        public class a extends AudioTrack.StreamEventCallback {
            public a() {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onDataRequest(AudioTrack audioTrack, int i10) {
                InterfaceC2536y.a aVar;
                if (audioTrack.equals(DefaultAudioSink.this.f11900u)) {
                    DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                    AudioSink.InterfaceC2355a interfaceC2355a = defaultAudioSink.f11897r;
                    if (interfaceC2355a != null && defaultAudioSink.f11871U && (aVar = C2374h.this.f12000h1) != null) {
                        aVar.mo7063b();
                    }
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onTearDown(AudioTrack audioTrack) {
                InterfaceC2536y.a aVar;
                if (audioTrack.equals(DefaultAudioSink.this.f11900u)) {
                    DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                    AudioSink.InterfaceC2355a interfaceC2355a = defaultAudioSink.f11897r;
                    if (interfaceC2355a != null && defaultAudioSink.f11871U && (aVar = C2374h.this.f12000h1) != null) {
                        aVar.mo7063b();
                    }
                }
            }
        }

        public C2366k() {
        }
    }

    public DefaultAudioSink(C2360e c2360e) {
        this.f11877a = c2360e.f11908a;
        C2362g c2362g = c2360e.f11909b;
        this.f11879b = c2362g;
        int i10 = C10134c0.f51354a;
        this.f11881c = i10 >= 21 && c2360e.f11910c;
        this.f11890k = i10 >= 23 && c2360e.f11911d;
        this.f11891l = i10 >= 29 ? c2360e.f11912e : 0;
        this.f11895p = c2360e.f11913f;
        C10136e c10136e = new C10136e(0);
        this.f11887h = c10136e;
        c10136e.m19062a();
        this.f11888i = new C2369c(new C2365j());
        C2371e c2371e = new C2371e();
        this.f11883d = c2371e;
        C2378l c2378l = new C2378l();
        this.f11884e = c2378l;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C2375i(), c2371e, c2378l);
        Collections.addAll(arrayList, c2362g.f11923a);
        this.f11885f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f11886g = new AudioProcessor[]{new C2373g()};
        this.f11860J = 1.0f;
        this.f11901v = C2367a.f11937g;
        this.f11873W = 0;
        this.f11874X = new C6434k();
        C2505u c2505u = C2505u.f13473d;
        this.f11903x = new C2363h(c2505u, false, 0L, 0L);
        this.f11904y = c2505u;
        this.f11868R = -1;
        this.f11861K = new AudioProcessor[0];
        this.f11862L = new ByteBuffer[0];
        this.f11889j = new ArrayDeque<>();
        this.f11893n = new C2364i<>();
        this.f11894o = new C2364i<>();
    }

    /* JADX INFO: renamed from: r */
    public static AudioFormat m6809r(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    /* JADX INFO: renamed from: x */
    public static boolean m6810x(AudioTrack audioTrack) {
        return C10134c0.f51354a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: renamed from: A */
    public final void m6811A() {
        this.f11852B = 0L;
        this.f11853C = 0L;
        this.f11854D = 0L;
        this.f11855E = 0L;
        int i10 = 0;
        this.f11882c0 = false;
        this.f11856F = 0;
        this.f11903x = new C2363h(m6820s().f11926a, m6820s().f11927b, 0L, 0L);
        this.f11859I = 0L;
        this.f11902w = null;
        this.f11889j.clear();
        this.f11863M = null;
        this.f11864N = 0;
        this.f11865O = null;
        this.f11870T = false;
        this.f11869S = false;
        this.f11868R = -1;
        this.f11905z = null;
        this.f11851A = 0;
        this.f11884e.f12035o = 0L;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.f11861K;
            if (i10 >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i10];
            audioProcessor.flush();
            this.f11862L[i10] = audioProcessor.mo6790e();
            i10++;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m6812B(C2505u c2505u, boolean z10) {
        C2363h c2363hM6820s = m6820s();
        if (!c2505u.equals(c2363hM6820s.f11926a) || z10 != c2363hM6820s.f11927b) {
            C2363h c2363h = new C2363h(c2505u, z10, -9223372036854775807L, -9223372036854775807L);
            if (m6824w()) {
                this.f11902w = c2363h;
                return;
            }
            this.f11903x = c2363h;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m6813C(C2505u c2505u) {
        if (m6824w()) {
            try {
                this.f11900u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(c2505u.f13474a).setPitch(c2505u.f13475b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                C10145n.m19100h("DefaultAudioSink", "Failed to set playback params", e10);
            }
            c2505u = new C2505u(this.f11900u.getPlaybackParams().getSpeed(), this.f11900u.getPlaybackParams().getPitch());
            C2369c c2369c = this.f11888i;
            c2369c.f11963j = c2505u.f13474a;
            C6433j c6433j = c2369c.f11959f;
            if (c6433j != null) {
                c6433j.m13056a();
            }
            c2369c.m6854c();
        }
        this.f11904y = c2505u;
    }

    /* JADX INFO: renamed from: D */
    public final void m6814D() {
        if (m6824w()) {
            if (C10134c0.f51354a >= 21) {
                this.f11900u.setVolume(this.f11860J);
                return;
            }
            AudioTrack audioTrack = this.f11900u;
            float f3 = this.f11860J;
            audioTrack.setStereoVolume(f3, f3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX INFO: renamed from: E */
    public final boolean m6815E() {
        boolean z10;
        if (this.f11876Z || !"audio/raw".equals(this.f11899t.f11914a.f12484l)) {
            return false;
        }
        int i10 = this.f11899t.f11914a.f12465V;
        if (this.f11881c) {
            int i11 = C10134c0.f51354a;
            if (i10 == 536870912 || i10 == 805306368 || i10 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return !z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: F */
    public final boolean m6816F(C2416m c2416m, C2367a c2367a) {
        int i10;
        int iM19046m;
        int playbackOffloadSupport;
        int i11 = C10134c0.f51354a;
        if (i11 < 29 || (i10 = this.f11891l) == 0) {
            return false;
        }
        String str = c2416m.f12484l;
        str.getClass();
        int iM19103c = C10147p.m19103c(str, c2416m.f12481i);
        if (iM19103c == 0 || (iM19046m = C10134c0.m19046m(c2416m.f12463T)) == 0) {
            return false;
        }
        AudioFormat audioFormatM6809r = m6809r(c2416m.f12464U, iM19046m, iM19103c);
        AudioAttributes audioAttributes = c2367a.m6838a().f11944a;
        if (i11 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatM6809r, audioAttributes);
        } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatM6809r, audioAttributes)) {
            playbackOffloadSupport = (i11 == 30 && C10134c0.f51357d.startsWith("Pixel")) ? 2 : 1;
        } else {
            playbackOffloadSupport = 0;
        }
        if (playbackOffloadSupport == 0) {
            return false;
        }
        if (playbackOffloadSupport != 1) {
            if (playbackOffloadSupport == 2) {
                return true;
            }
            throw new IllegalStateException();
        }
        boolean z10 = (c2416m.f12466W == 0 && c2416m.f12467X == 0) ? false : true;
        boolean z11 = i10 == 1;
        if (z10 && z11) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    /* JADX INFO: renamed from: G */
    public final void m6817G(ByteBuffer byteBuffer, long j10) throws Exception {
        int iWrite;
        AudioSink.InterfaceC2355a interfaceC2355a;
        InterfaceC2536y.a aVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f11865O;
            if (byteBuffer2 != null) {
                C10129a.m18990b(byteBuffer2 == byteBuffer);
            } else {
                this.f11865O = byteBuffer;
                if (C10134c0.f51354a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f11866P;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f11866P = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f11866P, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f11867Q = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i10 = C10134c0.f51354a;
            if (i10 < 21) {
                long j11 = this.f11854D;
                C2369c c2369c = this.f11888i;
                int iM6852a = c2369c.f11958e - ((int) (j11 - (c2369c.m6852a() * ((long) c2369c.f11957d))));
                if (iM6852a > 0) {
                    iWrite = this.f11900u.write(this.f11866P, this.f11867Q, Math.min(iRemaining2, iM6852a));
                    if (iWrite > 0) {
                        this.f11867Q += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else if (this.f11876Z) {
                C10129a.m18992d(j10 != -9223372036854775807L);
                AudioTrack audioTrack = this.f11900u;
                if (i10 >= 26) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j10 * 1000);
                } else {
                    if (this.f11905z == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f11905z = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f11905z.putInt(1431633921);
                    }
                    if (this.f11851A == 0) {
                        this.f11905z.putInt(4, iRemaining2);
                        this.f11905z.putLong(8, j10 * 1000);
                        this.f11905z.position(0);
                        this.f11851A = iRemaining2;
                    }
                    int iRemaining3 = this.f11905z.remaining();
                    if (iRemaining3 <= 0) {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.f11851A = 0;
                        } else {
                            this.f11851A -= iWrite;
                        }
                    } else {
                        int iWrite2 = audioTrack.write(this.f11905z, iRemaining3, 1);
                        if (iWrite2 < 0) {
                            this.f11851A = 0;
                            iWrite = iWrite2;
                        } else if (iWrite2 < iRemaining3) {
                            iWrite = 0;
                        } else {
                            iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                            if (iWrite < 0) {
                                this.f11851A = 0;
                            } else {
                                this.f11851A -= iWrite;
                            }
                        }
                    }
                }
            } else {
                iWrite = this.f11900u.write(byteBuffer, iRemaining2, 1);
            }
            this.f11878a0 = SystemClock.elapsedRealtime();
            C2364i<AudioSink.WriteException> c2364i = this.f11894o;
            if (iWrite < 0) {
                AudioSink.WriteException writeException = new AudioSink.WriteException(iWrite, this.f11899t.f11914a, ((i10 >= 24 && iWrite == -6) || iWrite == -32) && this.f11855E > 0);
                AudioSink.InterfaceC2355a interfaceC2355a2 = this.f11897r;
                if (interfaceC2355a2 != null) {
                    ((C2374h.b) interfaceC2355a2).m6894a(writeException);
                }
                if (writeException.f11846b) {
                    throw writeException;
                }
                c2364i.m6832a(writeException);
                return;
            }
            c2364i.f11930a = null;
            if (m6810x(this.f11900u)) {
                if (this.f11855E > 0) {
                    this.f11882c0 = false;
                }
                if (this.f11871U && (interfaceC2355a = this.f11897r) != null && iWrite < iRemaining2 && !this.f11882c0 && (aVar = C2374h.this.f12000h1) != null) {
                    aVar.mo7062a();
                }
            }
            int i11 = this.f11899t.f11916c;
            if (i11 == 0) {
                this.f11854D += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i11 != 0) {
                    C10129a.m18992d(byteBuffer == this.f11863M);
                    this.f11855E = (((long) this.f11856F) * ((long) this.f11864N)) + this.f11855E;
                }
                this.f11865O = null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6818a(long j10) {
        C2505u c2505u;
        boolean z10;
        InterfaceC2368b.a aVar;
        Handler handler;
        boolean zM6815E = m6815E();
        InterfaceC6429f interfaceC6429f = this.f11879b;
        if (zM6815E) {
            c2505u = m6820s().f11926a;
            C2362g c2362g = (C2362g) interfaceC6429f;
            c2362g.getClass();
            float f3 = c2505u.f13474a;
            C2377k c2377k = c2362g.f11925c;
            if (c2377k.f12015c != f3) {
                c2377k.f12015c = f3;
                c2377k.f12021i = true;
            }
            float f10 = c2377k.f12016d;
            float f11 = c2505u.f13475b;
            if (f10 != f11) {
                c2377k.f12016d = f11;
                c2377k.f12021i = true;
            }
        } else {
            c2505u = C2505u.f13473d;
        }
        C2505u c2505u2 = c2505u;
        int i10 = 0;
        if (m6815E()) {
            z10 = m6820s().f11927b;
            ((C2362g) interfaceC6429f).f11924b.f12006m = z10;
        } else {
            z10 = false;
        }
        this.f11889j.add(new C2363h(c2505u2, z10, Math.max(0L, j10), (m6822u() * 1000000) / ((long) this.f11899t.f11918e)));
        AudioProcessor[] audioProcessorArr = this.f11899t.f11922i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.mo6787b()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.f11861K = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.f11862L = new ByteBuffer[size];
        int i11 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr2 = this.f11861K;
            if (i11 >= audioProcessorArr2.length) {
                break;
            }
            AudioProcessor audioProcessor2 = audioProcessorArr2[i11];
            audioProcessor2.flush();
            this.f11862L[i11] = audioProcessor2.mo6790e();
            i11++;
        }
        AudioSink.InterfaceC2355a interfaceC2355a = this.f11897r;
        if (interfaceC2355a == null || (handler = (aVar = C2374h.this.f11991Y0).f11945a) == null) {
            return;
        }
        handler.post(new RunnableC6431h(i10, aVar, z10));
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: b */
    public final boolean mo6794b(C2416m c2416m) {
        return mo6808p(c2416m) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: c */
    public final void mo6795c() {
        flush();
        for (AudioProcessor audioProcessor : this.f11885f) {
            audioProcessor.mo6788c();
        }
        for (AudioProcessor audioProcessor2 : this.f11886g) {
            audioProcessor2.mo6788c();
        }
        this.f11871U = false;
        this.f11880b0 = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: d */
    public final boolean mo6796d() {
        return !m6824w() || (this.f11869S && !mo6799g());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: e */
    public final void mo6797e(AudioDeviceInfo audioDeviceInfo) {
        C2358c c2358c = audioDeviceInfo == null ? null : new C2358c(audioDeviceInfo);
        this.f11875Y = c2358c;
        AudioTrack audioTrack = this.f11900u;
        if (audioTrack != null) {
            C2356a.m6827a(audioTrack, c2358c);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: f */
    public final void mo6798f() throws AudioSink.WriteException {
        if (!this.f11869S && m6824w() && m6819q()) {
            m6825y();
            this.f11869S = true;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void flush() {
        if (m6824w()) {
            m6811A();
            AudioTrack audioTrack = this.f11888i.f11956c;
            audioTrack.getClass();
            int i10 = 1;
            if (audioTrack.getPlayState() == 3) {
                this.f11900u.pause();
            }
            if (m6810x(this.f11900u)) {
                C2366k c2366k = this.f11892m;
                c2366k.getClass();
                this.f11900u.unregisterStreamEventCallback(c2366k.f11934b);
                c2366k.f11933a.removeCallbacksAndMessages(null);
            }
            if (C10134c0.f51354a < 21 && !this.f11872V) {
                this.f11873W = 0;
            }
            C2361f c2361f = this.f11898s;
            if (c2361f != null) {
                this.f11899t = c2361f;
                this.f11898s = null;
            }
            C2369c c2369c = this.f11888i;
            c2369c.m6854c();
            c2369c.f11956c = null;
            c2369c.f11959f = null;
            AudioTrack audioTrack2 = this.f11900u;
            C10136e c10136e = this.f11887h;
            synchronized (c10136e) {
                c10136e.f51371a = false;
            }
            synchronized (f11848d0) {
                try {
                    if (f11849e0 == null) {
                        f11849e0 = Executors.newSingleThreadExecutor(new ThreadFactoryC0887a("ExoPlayer:AudioTrackReleaseThread", i10));
                    }
                    f11850f0++;
                    f11849e0.execute(new RunnableC5286r(audioTrack2, 12, c10136e));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f11900u = null;
        }
        this.f11894o.f11930a = null;
        this.f11893n.f11930a = null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: g */
    public final boolean mo6799g() {
        return m6824w() && this.f11888i.m6853b(m6822u());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final C2505u getPlaybackParameters() {
        return this.f11890k ? this.f11904y : m6820s().f11926a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x0171  */
    /* JADX WARN: Code duplicated, block: B:105:0x0174  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: h */
    public final void mo6800h(C2416m c2416m, int[] iArr) throws AudioSink.ConfigurationException {
        int iIntValue;
        int iIntValue2;
        int i10;
        AudioProcessor[] audioProcessorArr;
        int i11;
        int i12;
        int iM19055v;
        int iM19055v2;
        int iM19041h;
        int iM6861a;
        boolean z10;
        boolean z11;
        int[] iArr2;
        boolean zEquals = "audio/raw".equals(c2416m.f12484l);
        int i13 = c2416m.f12464U;
        int i14 = c2416m.f12463T;
        if (zEquals) {
            int i15 = c2416m.f12465V;
            C10129a.m18990b(C10134c0.m19022G(i15));
            iM19055v2 = C10134c0.m19055v(i15, i14);
            if (!this.f11881c) {
                z11 = false;
            } else if (i15 == 536870912 || i15 == 805306368 || i15 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            AudioProcessor[] audioProcessorArr2 = z11 ? this.f11886g : this.f11885f;
            int i16 = c2416m.f12466W;
            C2378l c2378l = this.f11884e;
            c2378l.f12029i = i16;
            c2378l.f12030j = c2416m.f12467X;
            if (C10134c0.f51354a < 21 && i14 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i17 = 0; i17 < 6; i17++) {
                    iArr2[i17] = i17;
                }
            } else {
                iArr2 = iArr;
            }
            this.f11883d.f11987i = iArr2;
            AudioProcessor.C2354a c2354a = new AudioProcessor.C2354a(i13, i14, i15);
            for (AudioProcessor audioProcessor : audioProcessorArr2) {
                try {
                    AudioProcessor.C2354a c2354aMo6792g = audioProcessor.mo6792g(c2354a);
                    if (audioProcessor.mo6787b()) {
                        c2354a = c2354aMo6792g;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e10) {
                    throw new AudioSink.ConfigurationException(e10, c2416m);
                }
            }
            i12 = c2354a.f11839c;
            int i18 = c2354a.f11838b;
            iIntValue2 = C10134c0.m19046m(i18);
            iM19055v = C10134c0.m19055v(i12, i18);
            i11 = c2354a.f11837a;
            audioProcessorArr = audioProcessorArr2;
            i10 = 0;
        } else {
            AudioProcessor[] audioProcessorArr3 = new AudioProcessor[0];
            if (m6816F(c2416m, this.f11901v)) {
                String str = c2416m.f12484l;
                str.getClass();
                iIntValue = C10147p.m19103c(str, c2416m.f12481i);
                iIntValue2 = C10134c0.m19046m(i14);
                i10 = 1;
            } else {
                Pair<Integer, Integer> pairM13053a = this.f11877a.m13053a(c2416m);
                if (pairM13053a == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + c2416m, c2416m);
                }
                iIntValue = ((Integer) pairM13053a.first).intValue();
                iIntValue2 = ((Integer) pairM13053a.second).intValue();
                i10 = 2;
            }
            audioProcessorArr = audioProcessorArr3;
            i11 = i13;
            i12 = iIntValue;
            iM19055v = -1;
            iM19055v2 = -1;
        }
        if (i12 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i10 + ") for: " + c2416m, c2416m);
        }
        if (iIntValue2 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i10 + ") for: " + c2416m, c2416m);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i11, iIntValue2, i12);
        C10129a.m18992d(minBufferSize != -2);
        int i19 = iM19055v != -1 ? iM19055v : 1;
        double d10 = this.f11890k ? 8.0d : 1.0d;
        this.f11895p.getClass();
        if (i10 == 0) {
            long j10 = i11;
            long j11 = i19;
            iM19041h = C10134c0.m19041h(minBufferSize * 4, Ints.m9142l0(((((long) 250000) * j10) * j11) / 1000000), Ints.m9142l0(((((long) 750000) * j10) * j11) / 1000000));
        } else if (i10 == 1) {
            iM19041h = Ints.m9142l0((((long) 50000000) * ((long) C2372f.m6861a(i12))) / 1000000);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            int i20 = i12 == 5 ? 500000 : 250000;
            int i21 = c2416m.f12480h;
            if (i21 != -1) {
                RoundingMode roundingMode = RoundingMode.CEILING;
                roundingMode.getClass();
                iM6861a = i21 / 8;
                int i22 = i21 - (iM6861a * 8);
                if (i22 != 0) {
                    int i23 = ((i21 ^ 8) >> 31) | 1;
                    switch (C10351a.f52059a[roundingMode.ordinal()]) {
                        case 1:
                            if (!(i22 == 0)) {
                                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                            }
                            z10 = false;
                            if (z10) {
                                iM6861a += i23;
                            }
                            break;
                        case 2:
                            z10 = false;
                            if (z10) {
                                iM6861a += i23;
                            }
                            break;
                        case 3:
                            if (i23 < 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                iM6861a += i23;
                            }
                            break;
                        case 4:
                            z10 = true;
                            if (z10) {
                                iM6861a += i23;
                            }
                            break;
                        case 5:
                            if (i23 > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                iM6861a += i23;
                            }
                            break;
                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        case 8:
                            int iAbs = Math.abs(i22);
                            int iAbs2 = iAbs - (Math.abs(8) - iAbs);
                            if (iAbs2 == 0) {
                                if (roundingMode == RoundingMode.HALF_UP) {
                                    z10 = true;
                                } else if ((roundingMode == RoundingMode.HALF_EVEN) && ((iM6861a & 1) != 0)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else if (iAbs2 > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                iM6861a += i23;
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
            } else {
                iM6861a = C2372f.m6861a(i12);
            }
            iM19041h = Ints.m9142l0((((long) i20) * ((long) iM6861a)) / 1000000);
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) iM19041h) * d10)) + i19) - 1) / i19) * i19;
        this.f11880b0 = false;
        C2361f c2361f = new C2361f(c2416m, iM19055v2, i10, iM19055v, i11, iIntValue2, i12, iMax, audioProcessorArr);
        if (m6824w()) {
            this.f11898s = c2361f;
        } else {
            this.f11899t = c2361f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:115:0x0207  */
    /* JADX WARN: Code duplicated, block: B:117:0x0216  */
    /* JADX WARN: Code duplicated, block: B:119:0x021a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0224  */
    /* JADX WARN: Code duplicated, block: B:123:0x0230  */
    /* JADX WARN: Code duplicated, block: B:126:0x023d  */
    /* JADX WARN: Code duplicated, block: B:129:0x024d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0267  */
    /* JADX WARN: Code duplicated, block: B:134:0x026d  */
    /* JADX WARN: Code duplicated, block: B:143:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:144:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:146:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:148:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:150:0x0300  */
    /* JADX WARN: Code duplicated, block: B:151:0x0307  */
    /* JADX WARN: Code duplicated, block: B:152:0x0313  */
    /* JADX WARN: Code duplicated, block: B:154:0x031f  */
    /* JADX WARN: Code duplicated, block: B:63:0x011f  */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: i */
    public final long mo6801i(boolean z10) {
        C2369c.a aVar;
        boolean z11;
        long jNanoTime;
        C6433j c6433j;
        boolean z12;
        long jM19053t;
        long jMax;
        long j10;
        long jMin;
        ArrayDeque<C2363h> arrayDeque;
        long j11;
        boolean zEquals;
        InterfaceC6429f interfaceC6429f;
        long jM19053t2;
        C2377k c2377k;
        long jM19030O;
        long j12;
        int i10;
        int i11;
        long j13;
        C6433j.a aVar2;
        long j14;
        long j15;
        C2369c.a aVar3;
        boolean timestamp;
        Method method;
        if (!m6824w() || this.f11858H) {
            return Long.MIN_VALUE;
        }
        C2369c c2369c = this.f11888i;
        AudioTrack audioTrack = c2369c.f11956c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        C2369c.a aVar4 = c2369c.f11954a;
        if (playState == 3) {
            long jNanoTime2 = System.nanoTime() / 1000;
            if (jNanoTime2 - c2369c.f11966m >= 30000) {
                aVar3 = aVar4;
                long jM6852a = (c2369c.m6852a() * 1000000) / ((long) c2369c.f11960g);
                if (jM6852a != 0) {
                    int i12 = c2369c.f11976w;
                    long jM19056w = C10134c0.m19056w(c2369c.f11963j, jM6852a) - jNanoTime2;
                    long[] jArr = c2369c.f11955b;
                    jArr[i12] = jM19056w;
                    c2369c.f11976w = (c2369c.f11976w + 1) % 10;
                    int i13 = c2369c.f11977x;
                    if (i13 < 10) {
                        c2369c.f11977x = i13 + 1;
                    }
                    c2369c.f11966m = jNanoTime2;
                    c2369c.f11965l = 0L;
                    int i14 = 0;
                    while (true) {
                        int i15 = c2369c.f11977x;
                        if (i14 >= i15) {
                            break;
                        }
                        c2369c.f11965l = (jArr[i14] / ((long) i15)) + c2369c.f11965l;
                        i14++;
                    }
                }
                aVar = aVar3;
            } else {
                aVar3 = aVar4;
            }
            if (!c2369c.f11961h) {
                C6433j c6433j2 = c2369c.f11959f;
                c6433j2.getClass();
                C6433j.a aVar5 = c6433j2.f36935a;
                if (aVar5 == null || jNanoTime2 - c6433j2.f36939e < c6433j2.f36938d) {
                    timestamp = false;
                } else {
                    c6433j2.f36939e = jNanoTime2;
                    AudioTrack audioTrack2 = aVar5.f36941a;
                    AudioTimestamp audioTimestamp = aVar5.f36942b;
                    timestamp = audioTrack2.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        long j16 = audioTimestamp.framePosition;
                        if (aVar5.f36944d > j16) {
                            aVar5.f36943c++;
                        }
                        aVar5.f36944d = j16;
                        aVar5.f36945e = j16 + (aVar5.f36943c << 32);
                    }
                    int i16 = c6433j2.f36936b;
                    if (i16 != 0) {
                        if (i16 != 1) {
                            if (i16 != 2) {
                                if (i16 != 3) {
                                    if (i16 != 4) {
                                        throw new IllegalStateException();
                                    }
                                } else if (timestamp) {
                                    c6433j2.m13056a();
                                }
                            } else if (!timestamp) {
                                c6433j2.m13056a();
                            }
                        } else if (!timestamp) {
                            c6433j2.m13056a();
                        } else if (aVar5.f36945e > c6433j2.f36940f) {
                            c6433j2.m13057b(2);
                        }
                    } else if (timestamp) {
                        if (audioTimestamp.nanoTime / 1000 >= c6433j2.f36937c) {
                            c6433j2.f36940f = aVar5.f36945e;
                            c6433j2.m13057b(1);
                        } else {
                            timestamp = false;
                        }
                    } else if (jNanoTime2 - c6433j2.f36937c > 500000) {
                        c6433j2.m13057b(3);
                    }
                }
                if (timestamp) {
                    long j17 = aVar5 != null ? aVar5.f36942b.nanoTime / 1000 : -9223372036854775807L;
                    long j18 = aVar5 != null ? aVar5.f36945e : -1L;
                    long jM6852a2 = (c2369c.m6852a() * 1000000) / ((long) c2369c.f11960g);
                    if (Math.abs(j17 - jNanoTime2) > 5000000) {
                        c2369c.f11954a.mo6837e(j18, j17, jNanoTime2, jM6852a2);
                        c6433j2.m13057b(4);
                    } else if (Math.abs(((j18 * 1000000) / ((long) c2369c.f11960g)) - jM6852a2) > 5000000) {
                        c2369c.f11954a.mo6836d(j18, j17, jNanoTime2, jM6852a2);
                        c6433j2.m13057b(4);
                    } else if (c6433j2.f36936b == 4) {
                        c6433j2.m13056a();
                    }
                }
                if (c2369c.f11970q && (method = c2369c.f11967n) != null && jNanoTime2 - c2369c.f11971r >= 500000) {
                    try {
                        AudioTrack audioTrack3 = c2369c.f11956c;
                        audioTrack3.getClass();
                        z11 = false;
                        try {
                            Integer num = (Integer) method.invoke(audioTrack3, new Object[0]);
                            int i17 = C10134c0.f51354a;
                            long jIntValue = (((long) num.intValue()) * 1000) - c2369c.f11962i;
                            c2369c.f11968o = jIntValue;
                            long jMax2 = Math.max(jIntValue, 0L);
                            c2369c.f11968o = jMax2;
                            if (jMax2 > 5000000) {
                                aVar = aVar3;
                                try {
                                    aVar.mo6835c(jMax2);
                                    c2369c.f11968o = 0L;
                                } catch (Exception unused) {
                                    c2369c.f11967n = null;
                                }
                            } else {
                                aVar = aVar3;
                            }
                        } catch (Exception unused2) {
                            aVar = aVar3;
                        }
                    } catch (Exception unused3) {
                        aVar = aVar3;
                        z11 = false;
                    }
                    c2369c.f11971r = jNanoTime2;
                }
                jNanoTime = System.nanoTime() / 1000;
                c6433j = c2369c.f11959f;
                c6433j.getClass();
                if (c6433j.f36936b == 2) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (z12) {
                    aVar2 = c6433j.f36935a;
                    if (aVar2 != null) {
                        j14 = aVar2.f36945e;
                    } else {
                        j14 = -1;
                    }
                    long j19 = (j14 * 1000000) / ((long) c2369c.f11960g);
                    if (aVar2 != null) {
                        j15 = aVar2.f36942b.nanoTime / 1000;
                    } else {
                        j15 = -9223372036854775807L;
                    }
                    jMax = C10134c0.m19053t(c2369c.f11963j, jNanoTime - j15) + j19;
                } else {
                    if (c2369c.f11977x == 0) {
                        jM19053t = (c2369c.m6852a() * 1000000) / ((long) c2369c.f11960g);
                    } else {
                        jM19053t = C10134c0.m19053t(c2369c.f11963j, c2369c.f11965l + jNanoTime);
                    }
                    jMax = jM19053t;
                    if (!z10) {
                        jMax = Math.max(0L, jMax - c2369c.f11968o);
                    }
                }
                if (c2369c.f11951E != z12) {
                    c2369c.f11953G = c2369c.f11950D;
                    c2369c.f11952F = c2369c.f11949C;
                }
                j10 = jNanoTime - c2369c.f11953G;
                if (j10 < 1000000) {
                    long jM19053t3 = C10134c0.m19053t(c2369c.f11963j, j10) + c2369c.f11952F;
                    long j20 = (j10 * 1000) / 1000000;
                    jMax = (((1000 - j20) * jM19053t3) + (jMax * j20)) / 1000;
                }
                if (!c2369c.f11964k) {
                    j13 = c2369c.f11949C;
                    if (jMax > j13) {
                        c2369c.f11964k = true;
                        aVar.mo6833a(System.currentTimeMillis() - C10134c0.m19033R(C10134c0.m19056w(c2369c.f11963j, C10134c0.m19033R(jMax - j13))));
                    }
                }
                c2369c.f11950D = jNanoTime;
                c2369c.f11949C = jMax;
                c2369c.f11951E = z12;
                jMin = Math.min(jMax, (m6822u() * 1000000) / ((long) this.f11899t.f11918e));
                while (true) {
                    arrayDeque = this.f11889j;
                    if (!!arrayDeque.isEmpty() || jMin < arrayDeque.getFirst().f11929d) {
                        break;
                    }
                    this.f11903x = arrayDeque.remove();
                }
                C2363h c2363h = this.f11903x;
                j11 = jMin - c2363h.f11929d;
                zEquals = c2363h.f11926a.equals(C2505u.f13473d);
                interfaceC6429f = this.f11879b;
                if (zEquals) {
                    jM19053t2 = this.f11903x.f11928c + j11;
                } else if (arrayDeque.isEmpty()) {
                    c2377k = ((C2362g) interfaceC6429f).f11925c;
                    if (c2377k.f12027o >= 1024) {
                        long j21 = c2377k.f12026n;
                        C6437n c6437n = c2377k.f12022j;
                        c6437n.getClass();
                        j12 = j21 - ((long) ((c6437n.f36975k * c6437n.f36966b) * 2));
                        i10 = c2377k.f12020h.f11837a;
                        i11 = c2377k.f12019g.f11837a;
                        if (i10 == i11) {
                            jM19030O = C10134c0.m19030O(j11, j12, c2377k.f12027o);
                        } else {
                            jM19030O = C10134c0.m19030O(j11, j12 * ((long) i10), c2377k.f12027o * ((long) i11));
                        }
                    } else {
                        jM19030O = (long) (((double) c2377k.f12015c) * j11);
                    }
                    jM19053t2 = jM19030O + this.f11903x.f11928c;
                } else {
                    C2363h first = arrayDeque.getFirst();
                    jM19053t2 = first.f11928c - C10134c0.m19053t(this.f11903x.f11926a.f13474a, first.f11929d - jMin);
                }
                return ((((C2362g) interfaceC6429f).f11924b.f12013t * 1000000) / ((long) this.f11899t.f11918e)) + jM19053t2;
            }
            aVar = aVar3;
        } else {
            aVar = aVar4;
        }
        z11 = false;
        jNanoTime = System.nanoTime() / 1000;
        c6433j = c2369c.f11959f;
        c6433j.getClass();
        if (c6433j.f36936b == 2) {
            z12 = true;
        } else {
            z12 = z11;
        }
        if (z12) {
            aVar2 = c6433j.f36935a;
            if (aVar2 != null) {
                j14 = aVar2.f36945e;
            } else {
                j14 = -1;
            }
            long j110 = (j14 * 1000000) / ((long) c2369c.f11960g);
            if (aVar2 != null) {
                j15 = aVar2.f36942b.nanoTime / 1000;
            } else {
                j15 = -9223372036854775807L;
            }
            jMax = C10134c0.m19053t(c2369c.f11963j, jNanoTime - j15) + j110;
        } else {
            if (c2369c.f11977x == 0) {
                jM19053t = (c2369c.m6852a() * 1000000) / ((long) c2369c.f11960g);
            } else {
                jM19053t = C10134c0.m19053t(c2369c.f11963j, c2369c.f11965l + jNanoTime);
            }
            jMax = jM19053t;
            if (!z10) {
                jMax = Math.max(0L, jMax - c2369c.f11968o);
            }
        }
        if (c2369c.f11951E != z12) {
            c2369c.f11953G = c2369c.f11950D;
            c2369c.f11952F = c2369c.f11949C;
        }
        j10 = jNanoTime - c2369c.f11953G;
        if (j10 < 1000000) {
            long jM19053t4 = C10134c0.m19053t(c2369c.f11963j, j10) + c2369c.f11952F;
            long j22 = (j10 * 1000) / 1000000;
            jMax = (((1000 - j22) * jM19053t4) + (jMax * j22)) / 1000;
        }
        if (!c2369c.f11964k) {
            j13 = c2369c.f11949C;
            if (jMax > j13) {
                c2369c.f11964k = true;
                aVar.mo6833a(System.currentTimeMillis() - C10134c0.m19033R(C10134c0.m19056w(c2369c.f11963j, C10134c0.m19033R(jMax - j13))));
            }
        }
        c2369c.f11950D = jNanoTime;
        c2369c.f11949C = jMax;
        c2369c.f11951E = z12;
        jMin = Math.min(jMax, (m6822u() * 1000000) / ((long) this.f11899t.f11918e));
        while (true) {
            arrayDeque = this.f11889j;
            if (!arrayDeque.isEmpty()) {
                break;
            }
            break;
            break;
            this.f11903x = arrayDeque.remove();
        }
        C2363h c2363h2 = this.f11903x;
        j11 = jMin - c2363h2.f11929d;
        zEquals = c2363h2.f11926a.equals(C2505u.f13473d);
        interfaceC6429f = this.f11879b;
        if (zEquals) {
            jM19053t2 = this.f11903x.f11928c + j11;
        } else if (arrayDeque.isEmpty()) {
            c2377k = ((C2362g) interfaceC6429f).f11925c;
            if (c2377k.f12027o >= 1024) {
                long j23 = c2377k.f12026n;
                C6437n c6437n2 = c2377k.f12022j;
                c6437n2.getClass();
                j12 = j23 - ((long) ((c6437n2.f36975k * c6437n2.f36966b) * 2));
                i10 = c2377k.f12020h.f11837a;
                i11 = c2377k.f12019g.f11837a;
                if (i10 == i11) {
                    jM19030O = C10134c0.m19030O(j11, j12, c2377k.f12027o);
                } else {
                    jM19030O = C10134c0.m19030O(j11, j12 * ((long) i10), c2377k.f12027o * ((long) i11));
                }
            } else {
                jM19030O = (long) (((double) c2377k.f12015c) * j11);
            }
            jM19053t2 = jM19030O + this.f11903x.f11928c;
        } else {
            C2363h first2 = arrayDeque.getFirst();
            jM19053t2 = first2.f11928c - C10134c0.m19053t(this.f11903x.f11926a.f13474a, first2.f11929d - jMin);
        }
        return ((((C2362g) interfaceC6429f).f11924b.f12013t * 1000000) / ((long) this.f11899t.f11918e)) + jM19053t2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: j */
    public final void mo6802j() {
        if (this.f11876Z) {
            this.f11876Z = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: k */
    public final void mo6803k(C2367a c2367a) {
        if (this.f11901v.equals(c2367a)) {
            return;
        }
        this.f11901v = c2367a;
        if (this.f11876Z) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: l */
    public final void mo6804l() {
        this.f11857G = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: m */
    public final void mo6805m() {
        C10129a.m18992d(C10134c0.f51354a >= 21);
        C10129a.m18992d(this.f11872V);
        if (this.f11876Z) {
            return;
        }
        this.f11876Z = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: n */
    public final void mo6806n(C6215e0 c6215e0) {
        this.f11896q = c6215e0;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00f9  */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: o */
    public final boolean mo6807o(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        boolean z10;
        boolean z11;
        int iM13059b;
        int i11;
        byte b10;
        int i12;
        byte b11;
        int i13;
        ByteBuffer byteBuffer2 = this.f11863M;
        C10129a.m18990b(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f11898s != null) {
            if (!m6819q()) {
                return false;
            }
            C2361f c2361f = this.f11898s;
            C2361f c2361f2 = this.f11899t;
            c2361f.getClass();
            if (c2361f2.f11916c == c2361f.f11916c && c2361f2.f11920g == c2361f.f11920g && c2361f2.f11918e == c2361f.f11918e && c2361f2.f11919f == c2361f.f11919f && c2361f2.f11917d == c2361f.f11917d) {
                this.f11899t = this.f11898s;
                this.f11898s = null;
                if (m6810x(this.f11900u) && this.f11891l != 3) {
                    if (this.f11900u.getPlayState() == 3) {
                        this.f11900u.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f11900u;
                    C2416m c2416m = this.f11899t.f11914a;
                    audioTrack.setOffloadDelayPadding(c2416m.f12466W, c2416m.f12467X);
                    this.f11882c0 = true;
                }
            } else {
                m6825y();
                if (mo6799g()) {
                    return false;
                }
                flush();
            }
            m6818a(j10);
        }
        boolean zM6824w = m6824w();
        C2364i<AudioSink.InitializationException> c2364i = this.f11893n;
        if (!zM6824w) {
            try {
                if (!m6823v()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e10) {
                if (e10.f11843b) {
                    throw e10;
                }
                c2364i.m6832a(e10);
                return false;
            }
        }
        c2364i.f11930a = null;
        if (this.f11858H) {
            this.f11859I = Math.max(0L, j10);
            this.f11857G = false;
            this.f11858H = false;
            if (this.f11890k && C10134c0.f51354a >= 23) {
                m6813C(this.f11904y);
            }
            m6818a(j10);
            if (this.f11871U) {
                play();
            }
        }
        long jM6822u = m6822u();
        C2369c c2369c = this.f11888i;
        AudioTrack audioTrack2 = c2369c.f11956c;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        if (c2369c.f11961h) {
            if (playState == 2) {
                c2369c.f11969p = false;
            } else if (playState != 1 || c2369c.m6852a() != 0) {
                z10 = c2369c.f11969p;
                boolean zM6853b = c2369c.m6853b(jM6822u);
                c2369c.f11969p = zM6853b;
                if (z10) {
                    c2369c.f11954a.mo6834b(c2369c.f11958e, C10134c0.m19033R(c2369c.f11962i));
                }
                z11 = true;
            }
            z11 = false;
        } else {
            z10 = c2369c.f11969p;
            boolean zM6853b2 = c2369c.m6853b(jM6822u);
            c2369c.f11969p = zM6853b2;
            if (z10 && !zM6853b2 && playState != 1) {
                c2369c.f11954a.mo6834b(c2369c.f11958e, C10134c0.m19033R(c2369c.f11962i));
            }
            z11 = true;
        }
        if (!z11) {
            return false;
        }
        if (this.f11863M == null) {
            C10129a.m18990b(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C2361f c2361f3 = this.f11899t;
            if (c2361f3.f11916c != 0 && this.f11856F == 0) {
                int i14 = c2361f3.f11920g;
                switch (i14) {
                    case 5:
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    case 18:
                        iM13059b = !(((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) ? 1536 : C6425b.f36906a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 8:
                        int iPosition = byteBuffer.position();
                        byte b12 = byteBuffer.get(iPosition);
                        if (b12 != -2) {
                            if (b12 == -1) {
                                i11 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                b11 = byteBuffer.get(iPosition + 7);
                            } else if (b12 != 31) {
                                i11 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                b10 = byteBuffer.get(iPosition + 5);
                            } else {
                                i11 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                b11 = byteBuffer.get(iPosition + 6);
                            }
                            i12 = b11 & 60;
                            iM13059b = (((i12 >> 2) | i11) + 1) * 32;
                        } else {
                            i11 = (byteBuffer.get(iPosition + 5) & 1) << 6;
                            b10 = byteBuffer.get(iPosition + 4);
                        }
                        i12 = b10 & 252;
                        iM13059b = (((i12 >> 2) | i11) + 1) * 32;
                        break;
                    case 9:
                        int iPosition2 = byteBuffer.position();
                        int i15 = C10134c0.f51354a;
                        int iReverseBytes = byteBuffer.getInt(iPosition2);
                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                            iReverseBytes = Integer.reverseBytes(iReverseBytes);
                        }
                        iM13059b = C6436m.m13059b(iReverseBytes);
                        if (iM13059b == -1) {
                            throw new IllegalArgumentException();
                        }
                        break;
                    case 10:
                    case 16:
                        iM13059b = 1024;
                        break;
                    case 11:
                    case 12:
                        iM13059b = 2048;
                        break;
                    case 13:
                    case 19:
                    default:
                        throw new IllegalStateException(C0166e.m761g("Unexpected audio encoding: ", i14));
                    case 14:
                        int iPosition3 = byteBuffer.position();
                        int iLimit = byteBuffer.limit() - 10;
                        int i16 = iPosition3;
                        while (true) {
                            if (i16 <= iLimit) {
                                int i17 = C10134c0.f51354a;
                                int iReverseBytes2 = byteBuffer.getInt(i16 + 4);
                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                    iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                }
                                if ((iReverseBytes2 & (-2)) == -126718022) {
                                    i13 = i16 - iPosition3;
                                } else {
                                    i16++;
                                }
                            } else {
                                i13 = -1;
                            }
                        }
                        iM13059b = i13 != -1 ? (40 << ((byteBuffer.get((byteBuffer.position() + i13) + ((byteBuffer.get((byteBuffer.position() + i13) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16 : 0;
                        break;
                    case 15:
                        iM13059b = 512;
                        break;
                    case 17:
                        byte[] bArr = new byte[16];
                        int iPosition4 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(iPosition4);
                        iM13059b = C6426c.m13049b(new C8739a(bArr, 16)).f36915c;
                        break;
                    case 20:
                        iM13059b = (int) ((C8573r0.m16753r0(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
                        break;
                }
                this.f11856F = iM13059b;
                if (iM13059b == 0) {
                    return true;
                }
            }
            if (this.f11902w != null) {
                if (!m6819q()) {
                    return false;
                }
                m6818a(j10);
                this.f11902w = null;
            }
            long jM6821t = (((m6821t() - this.f11884e.f12035o) * 1000000) / ((long) this.f11899t.f11914a.f12464U)) + this.f11859I;
            if (!this.f11857G && Math.abs(jM6821t - j10) > 200000) {
                AudioSink.InterfaceC2355a interfaceC2355a = this.f11897r;
                if (interfaceC2355a != null) {
                    ((C2374h.b) interfaceC2355a).m6894a(new AudioSink.UnexpectedDiscontinuityException(j10, jM6821t));
                }
                this.f11857G = true;
            }
            if (this.f11857G) {
                if (!m6819q()) {
                    return false;
                }
                long j11 = j10 - jM6821t;
                this.f11859I += j11;
                this.f11857G = false;
                m6818a(j10);
                AudioSink.InterfaceC2355a interfaceC2355a2 = this.f11897r;
                if (interfaceC2355a2 != null && j11 != 0) {
                    C2374h.this.f11998f1 = true;
                }
            }
            if (this.f11899t.f11916c == 0) {
                this.f11852B += (long) byteBuffer.remaining();
            } else {
                this.f11853C = (((long) this.f11856F) * ((long) i10)) + this.f11853C;
            }
            this.f11863M = byteBuffer;
            this.f11864N = i10;
        }
        m6826z(j10);
        if (!this.f11863M.hasRemaining()) {
            this.f11863M = null;
            this.f11864N = 0;
            return true;
        }
        if (!(c2369c.f11979z != -9223372036854775807L && m6822u() > 0 && SystemClock.elapsedRealtime() - c2369c.f11979z >= 200)) {
            return false;
        }
        C10145n.m19099g("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: p */
    public final int mo6808p(C2416m c2416m) {
        boolean z10 = true;
        if (!"audio/raw".equals(c2416m.f12484l)) {
            if (!this.f11880b0 && m6816F(c2416m, this.f11901v)) {
                return 2;
            }
            if (this.f11877a.m13053a(c2416m) == null) {
                z10 = false;
            }
            return z10 ? 2 : 0;
        }
        int i10 = c2416m.f12465V;
        if (C10134c0.m19022G(i10)) {
            return (i10 == 2 || (this.f11881c && i10 == 4)) ? 2 : 1;
        }
        C10145n.m19099g("DefaultAudioSink", "Invalid PCM encoding: " + i10);
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void pause() {
        boolean z10 = false;
        this.f11871U = false;
        if (m6824w()) {
            C2369c c2369c = this.f11888i;
            c2369c.m6854c();
            if (c2369c.f11978y == -9223372036854775807L) {
                C6433j c6433j = c2369c.f11959f;
                c6433j.getClass();
                c6433j.m13056a();
                z10 = true;
            }
            if (z10) {
                this.f11900u.pause();
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void play() {
        this.f11871U = true;
        if (m6824w()) {
            C6433j c6433j = this.f11888i.f11959f;
            c6433j.getClass();
            c6433j.m13056a();
            this.f11900u.play();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0036 -> B:5:0x000c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: q */
    public final boolean m6819q() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            r13 = this;
            r9 = r13
            int r0 = r9.f11868R
            r1 = 1
            r12 = 0
            r2 = r12
            r12 = -1
            r3 = r12
            if (r0 != r3) goto Le
            r9.f11868R = r2
        Lc:
            r0 = r1
            goto L10
        Le:
            r11 = 1
            r0 = r2
        L10:
            int r4 = r9.f11868R
            r11 = 7
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.f11861K
            r12 = 6
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = 7
            if (r4 >= r6) goto L40
            r4 = r5[r4]
            r12 = 7
            if (r0 == 0) goto L29
            r11 = 7
            r4.mo6793h()
            r12 = 4
        L29:
            r11 = 7
            r9.m6826z(r7)
            r11 = 1
            boolean r12 = r4.mo6789d()
            r0 = r12
            if (r0 != 0) goto L36
            return r2
        L36:
            r12 = 4
            int r0 = r9.f11868R
            r11 = 1
            int r0 = r0 + r1
            r12 = 4
            r9.f11868R = r0
            r12 = 7
            goto Lc
        L40:
            r12 = 2
            java.nio.ByteBuffer r0 = r9.f11865O
            if (r0 == 0) goto L4e
            r9.m6817G(r0, r7)
            java.nio.ByteBuffer r0 = r9.f11865O
            r12 = 6
            if (r0 == 0) goto L4e
            return r2
        L4e:
            r12 = 2
            r9.f11868R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.m6819q():boolean");
    }

    /* JADX INFO: renamed from: s */
    public final C2363h m6820s() {
        C2363h c2363h = this.f11902w;
        if (c2363h != null) {
            return c2363h;
        }
        ArrayDeque<C2363h> arrayDeque = this.f11889j;
        return !arrayDeque.isEmpty() ? arrayDeque.getLast() : this.f11903x;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void setAudioSessionId(int i10) {
        if (this.f11873W != i10) {
            this.f11873W = i10;
            this.f11872V = i10 != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void setAuxEffectInfo(C6434k c6434k) {
        if (this.f11874X.equals(c6434k)) {
            return;
        }
        int i10 = c6434k.f36946a;
        AudioTrack audioTrack = this.f11900u;
        if (audioTrack != null) {
            if (this.f11874X.f36946a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f11900u.setAuxEffectSendLevel(c6434k.f36947b);
            }
        }
        this.f11874X = c6434k;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void setPlaybackParameters(C2505u c2505u) {
        C2505u c2505u2 = new C2505u(C10134c0.m19040g(c2505u.f13474a, 0.1f, 8.0f), C10134c0.m19040g(c2505u.f13475b, 0.1f, 8.0f));
        if (!this.f11890k || C10134c0.f51354a < 23) {
            m6812B(c2505u2, m6820s().f11927b);
        } else {
            m6813C(c2505u2);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void setSkipSilenceEnabled(boolean z10) {
        m6812B(m6820s().f11926a, z10);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void setVolume(float f3) {
        if (this.f11860J != f3) {
            this.f11860J = f3;
            m6814D();
        }
    }

    /* JADX INFO: renamed from: t */
    public final long m6821t() {
        C2361f c2361f = this.f11899t;
        return c2361f.f11916c == 0 ? this.f11852B / ((long) c2361f.f11915b) : this.f11853C;
    }

    /* JADX INFO: renamed from: u */
    public final long m6822u() {
        C2361f c2361f = this.f11899t;
        return c2361f.f11916c == 0 ? this.f11854D / ((long) c2361f.f11917d) : this.f11855E;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0103  */
    /* JADX WARN: Code duplicated, block: B:64:0x0107  */
    /* JADX WARN: Code duplicated, block: B:78:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v3, types: [r1.w] */
    /* JADX INFO: renamed from: v */
    public final boolean m6823v() throws AudioSink.InitializationException {
        boolean z10;
        AudioTrack audioTrackM6830a;
        C6215e0 c6215e0;
        C10136e c10136e = this.f11887h;
        synchronized (c10136e) {
            z10 = c10136e.f51371a;
        }
        if (!z10) {
            return false;
        }
        final int i10 = 1;
        try {
            C2361f c2361f = this.f11899t;
            c2361f.getClass();
            try {
                audioTrackM6830a = c2361f.m6830a(this.f11876Z, this.f11901v, this.f11873W);
            } catch (AudioSink.InitializationException e10) {
                AudioSink.InterfaceC2355a interfaceC2355a = this.f11897r;
                if (interfaceC2355a != null) {
                    ((C2374h.b) interfaceC2355a).m6894a(e10);
                }
                throw e10;
            }
        } catch (AudioSink.InitializationException e11) {
            C2361f c2361f2 = this.f11899t;
            if (c2361f2.f11921h > 1000000) {
                C2361f c2361f3 = new C2361f(c2361f2.f11914a, c2361f2.f11915b, c2361f2.f11916c, c2361f2.f11917d, c2361f2.f11918e, c2361f2.f11919f, c2361f2.f11920g, 1000000, c2361f2.f11922i);
                try {
                    try {
                        audioTrackM6830a = c2361f3.m6830a(this.f11876Z, this.f11901v, this.f11873W);
                        this.f11899t = c2361f3;
                    } catch (AudioSink.InitializationException e12) {
                        AudioSink.InterfaceC2355a interfaceC2355a2 = this.f11897r;
                        if (interfaceC2355a2 != null) {
                            ((C2374h.b) interfaceC2355a2).m6894a(e12);
                        }
                        throw e12;
                    }
                } catch (AudioSink.InitializationException e13) {
                    e11.addSuppressed(e13);
                    if (!(this.f11899t.f11916c == 1)) {
                        throw e11;
                    }
                    this.f11880b0 = true;
                    throw e11;
                }
            }
            if (!(this.f11899t.f11916c == 1)) {
                throw e11;
            }
            this.f11880b0 = true;
            throw e11;
        }
        this.f11900u = audioTrackM6830a;
        if (m6810x(audioTrackM6830a)) {
            AudioTrack audioTrack = this.f11900u;
            if (this.f11892m == null) {
                this.f11892m = new C2366k();
            }
            C2366k c2366k = this.f11892m;
            final Handler handler = c2366k.f11933a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: r1.w
                @Override // java.util.concurrent.Executor
                public final void execute(final Runnable runnable) {
                    int i11 = i10;
                    Object obj = handler;
                    switch (i11) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            Choreographer choreographer = (Choreographer) obj;
                            C5207g.m11111f(choreographer, "$this_asExecutor");
                            choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: r1.x
                                @Override // android.view.Choreographer.FrameCallback
                                public final void doFrame(long j10) {
                                    runnable.run();
                                }
                            });
                            break;
                        default:
                            ((Handler) obj).post(runnable);
                            break;
                    }
                }
            }, c2366k.f11934b);
            if (this.f11891l != 3) {
                AudioTrack audioTrack2 = this.f11900u;
                C2416m c2416m = this.f11899t.f11914a;
                audioTrack2.setOffloadDelayPadding(c2416m.f12466W, c2416m.f12467X);
            }
        }
        int i11 = C10134c0.f51354a;
        if (i11 >= 31 && (c6215e0 = this.f11896q) != null) {
            C2357b.m6828a(this.f11900u, c6215e0);
        }
        this.f11873W = this.f11900u.getAudioSessionId();
        C2369c c2369c = this.f11888i;
        AudioTrack audioTrack3 = this.f11900u;
        C2361f c2361f4 = this.f11899t;
        c2369c.m6855d(audioTrack3, c2361f4.f11916c == 2, c2361f4.f11920g, c2361f4.f11917d, c2361f4.f11921h);
        m6814D();
        int i12 = this.f11874X.f36946a;
        if (i12 != 0) {
            this.f11900u.attachAuxEffect(i12);
            this.f11900u.setAuxEffectSendLevel(this.f11874X.f36947b);
        }
        C2358c c2358c = this.f11875Y;
        if (c2358c != null && i11 >= 23) {
            C2356a.m6827a(this.f11900u, c2358c);
        }
        this.f11858H = true;
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m6824w() {
        return this.f11900u != null;
    }

    /* JADX INFO: renamed from: y */
    public final void m6825y() {
        if (this.f11870T) {
            return;
        }
        this.f11870T = true;
        long jM6822u = m6822u();
        C2369c c2369c = this.f11888i;
        c2369c.f11947A = c2369c.m6852a();
        c2369c.f11978y = SystemClock.elapsedRealtime() * 1000;
        c2369c.f11948B = jM6822u;
        this.f11900u.stop();
        this.f11851A = 0;
    }

    /* JADX INFO: renamed from: z */
    public final void m6826z(long j10) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.f11861K.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.f11862L[i10 - 1];
            } else {
                byteBuffer = this.f11863M;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f11835a;
                }
            }
            if (i10 == length) {
                m6817G(byteBuffer, j10);
            } else {
                AudioProcessor audioProcessor = this.f11861K[i10];
                if (i10 > this.f11868R) {
                    audioProcessor.mo6791f(byteBuffer);
                }
                ByteBuffer byteBufferMo6790e = audioProcessor.mo6790e();
                this.f11862L[i10] = byteBufferMo6790e;
                if (byteBufferMo6790e.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }
}
