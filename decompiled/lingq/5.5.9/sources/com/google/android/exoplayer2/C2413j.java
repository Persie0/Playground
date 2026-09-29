package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.p017ui.platform.C0639l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.exoplayer2.audio.C2367a;
import com.google.android.exoplayer2.audio.InterfaceC2368b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.C2479g;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.common.collect.ImmutableList;
import ga.C5736s;
import ga.InterfaceC5732o;
import ge.C5787k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p118fe.C5509a;
import p128g2.RunnableC5682t;
import p150h9.C5909e;
import p150h9.C5913g;
import p150h9.C5920j0;
import p150h9.C5921k;
import p150h9.C5922k0;
import p150h9.C5925m;
import p150h9.C5926m0;
import p150h9.C5927n;
import p150h9.C5930o0;
import p150h9.C5931p;
import p150h9.C5932p0;
import p150h9.C5934q0;
import p150h9.C5935r;
import p150h9.C5941x;
import p150h9.InterfaceC5904b0;
import p174i9.C6211c0;
import p174i9.C6215e0;
import p174i9.C6219i;
import p174i9.InterfaceC6206a;
import p174i9.InterfaceC6208b;
import p195j9.C6434k;
import p218k9.C6635e;
import p218k9.C6637g;
import p219ka.C6642c;
import p219ka.InterfaceC6651l;
import p291o7.C8002l;
import p402u0.C9362e;
import p402u0.C9369l;
import p402u0.C9370m;
import p402u0.C9371n;
import p454wa.InterfaceC9878c;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10136e;
import p479xa.C10141j;
import p479xa.C10144m;
import p479xa.C10145n;
import p479xa.C10153v;
import p479xa.C10155x;
import p479xa.InterfaceC10133c;
import p479xa.InterfaceC10142k;
import p482xd.InterfaceC10171c;
import p502y7.C10302c;
import p505ya.C10332n;
import p505ya.InterfaceC10326h;
import p505ya.InterfaceC10327i;
import p505ya.InterfaceC10331m;
import p529z9.InterfaceC10464d;
import ua.AbstractC9510s;
import ua.C9496e;
import ua.C9506o;
import ua.C9508q;
import ua.C9511t;
import ua.InterfaceC9502k;
import za.C10474j;
import za.InterfaceC10465a;

/* JADX INFO: renamed from: com.google.android.exoplayer2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2413j extends AbstractC2383d implements ExoPlayer, ExoPlayer.InterfaceC2346a, ExoPlayer.InterfaceC2351f, ExoPlayer.InterfaceC2350e, ExoPlayer.InterfaceC2349d {

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ int f12267x0 = 0;

    /* JADX INFO: renamed from: A */
    public final C2381c f12268A;

    /* JADX INFO: renamed from: B */
    public final C2353a0 f12269B;

    /* JADX INFO: renamed from: C */
    public final C5932p0 f12270C;

    /* JADX INFO: renamed from: D */
    public final C5934q0 f12271D;

    /* JADX INFO: renamed from: E */
    public final long f12272E;

    /* JADX INFO: renamed from: F */
    public int f12273F;

    /* JADX INFO: renamed from: G */
    public boolean f12274G;

    /* JADX INFO: renamed from: H */
    public int f12275H;

    /* JADX INFO: renamed from: I */
    public int f12276I;

    /* JADX INFO: renamed from: J */
    public boolean f12277J;

    /* JADX INFO: renamed from: K */
    public int f12278K;

    /* JADX INFO: renamed from: L */
    public boolean f12279L;

    /* JADX INFO: renamed from: M */
    public C5930o0 f12280M;

    /* JADX INFO: renamed from: N */
    public InterfaceC5732o f12281N;

    /* JADX INFO: renamed from: O */
    public boolean f12282O;

    /* JADX INFO: renamed from: P */
    public InterfaceC2532v.a f12283P;

    /* JADX INFO: renamed from: Q */
    public C2467q f12284Q;

    /* JADX INFO: renamed from: R */
    public C2467q f12285R;

    /* JADX INFO: renamed from: S */
    public C2416m f12286S;

    /* JADX INFO: renamed from: T */
    public C2416m f12287T;

    /* JADX INFO: renamed from: U */
    public AudioTrack f12288U;

    /* JADX INFO: renamed from: V */
    public Object f12289V;

    /* JADX INFO: renamed from: W */
    public Surface f12290W;

    /* JADX INFO: renamed from: X */
    public SurfaceHolder f12291X;

    /* JADX INFO: renamed from: Y */
    public C10474j f12292Y;

    /* JADX INFO: renamed from: Z */
    public boolean f12293Z;

    /* JADX INFO: renamed from: a0 */
    public TextureView f12294a0;

    /* JADX INFO: renamed from: b */
    public final C9511t f12295b;

    /* JADX INFO: renamed from: b0 */
    public int f12296b0;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2532v.a f12297c;

    /* JADX INFO: renamed from: c0 */
    public int f12298c0;

    /* JADX INFO: renamed from: d */
    public final C10136e f12299d = new C10136e();

    /* JADX INFO: renamed from: d0 */
    public C10153v f12300d0;

    /* JADX INFO: renamed from: e */
    public final Context f12301e;

    /* JADX INFO: renamed from: e0 */
    public C6635e f12302e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2532v f12303f;

    /* JADX INFO: renamed from: f0 */
    public C6635e f12304f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2536y[] f12305g;

    /* JADX INFO: renamed from: g0 */
    public int f12306g0;

    /* JADX INFO: renamed from: h */
    public final AbstractC9510s f12307h;

    /* JADX INFO: renamed from: h0 */
    public C2367a f12308h0;

    /* JADX INFO: renamed from: i */
    public final InterfaceC10142k f12309i;

    /* JADX INFO: renamed from: i0 */
    public float f12310i0;

    /* JADX INFO: renamed from: j */
    public final C5509a f12311j;

    /* JADX INFO: renamed from: j0 */
    public boolean f12312j0;

    /* JADX INFO: renamed from: k */
    public final C2415l f12313k;

    /* JADX INFO: renamed from: k0 */
    public C6642c f12314k0;

    /* JADX INFO: renamed from: l */
    public final C10144m<InterfaceC2532v.c> f12315l;

    /* JADX INFO: renamed from: l0 */
    public InterfaceC10327i f12316l0;

    /* JADX INFO: renamed from: m */
    public final CopyOnWriteArraySet<ExoPlayer.InterfaceC2347b> f12317m;

    /* JADX INFO: renamed from: m0 */
    public InterfaceC10465a f12318m0;

    /* JADX INFO: renamed from: n */
    public final AbstractC2382c0.b f12319n;

    /* JADX INFO: renamed from: n0 */
    public final boolean f12320n0;

    /* JADX INFO: renamed from: o */
    public final ArrayList f12321o;

    /* JADX INFO: renamed from: o0 */
    public boolean f12322o0;

    /* JADX INFO: renamed from: p */
    public final boolean f12323p;

    /* JADX INFO: renamed from: p0 */
    public boolean f12324p0;

    /* JADX INFO: renamed from: q */
    public final InterfaceC2492i.a f12325q;

    /* JADX INFO: renamed from: q0 */
    public boolean f12326q0;

    /* JADX INFO: renamed from: r */
    public final InterfaceC6206a f12327r;

    /* JADX INFO: renamed from: r0 */
    public C2412i f12328r0;

    /* JADX INFO: renamed from: s */
    public final Looper f12329s;

    /* JADX INFO: renamed from: s0 */
    public C10332n f12330s0;

    /* JADX INFO: renamed from: t */
    public final InterfaceC9878c f12331t;

    /* JADX INFO: renamed from: t0 */
    public C2467q f12332t0;

    /* JADX INFO: renamed from: u */
    public final long f12333u;

    /* JADX INFO: renamed from: u0 */
    public C5920j0 f12334u0;

    /* JADX INFO: renamed from: v */
    public final long f12335v;

    /* JADX INFO: renamed from: v0 */
    public int f12336v0;

    /* JADX INFO: renamed from: w */
    public final C10155x f12337w;

    /* JADX INFO: renamed from: w0 */
    public long f12338w0;

    /* JADX INFO: renamed from: x */
    public final b f12339x;

    /* JADX INFO: renamed from: y */
    public final c f12340y;

    /* JADX INFO: renamed from: z */
    public final C2379b f12341z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C6215e0 m7041a(Context context, C2413j c2413j, boolean z10) {
            MediaMetricsManager mediaMetricsManagerM2402d = C0639l.m2402d(context.getSystemService("media_metrics"));
            C6211c0 c6211c0 = mediaMetricsManagerM2402d == null ? null : new C6211c0(context, mediaMetricsManagerM2402d.createPlaybackSession());
            if (c6211c0 == null) {
                C10145n.m19099g("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new C6215e0(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z10) {
                c2413j.getClass();
                c2413j.f12327r.mo12743K(c6211c0);
            }
            return new C6215e0(c6211c0.f36130c.getSessionId());
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$b */
    public final class b implements InterfaceC10331m, InterfaceC2368b, InterfaceC6651l, InterfaceC10464d, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C10474j.b, C2381c.b, C2379b.b, C2353a0.a, ExoPlayer.InterfaceC2347b {
        public b() {
        }

        @Override // p505ya.InterfaceC10331m
        /* JADX INFO: renamed from: a */
        public final void mo7042a(String str) {
            C2413j.this.f12327r.mo12747a(str);
        }

        @Override // p505ya.InterfaceC10331m
        /* JADX INFO: renamed from: b */
        public final void mo7043b(int i10, long j10) {
            C2413j.this.f12327r.mo12748b(i10, j10);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC2368b
        /* JADX INFO: renamed from: c */
        public final void mo6841c(C6635e c6635e) {
            C2413j c2413j = C2413j.this;
            c2413j.f12304f0 = c6635e;
            c2413j.f12327r.mo12749c(c6635e);
        }

        @Override // p505ya.InterfaceC10331m
        /* JADX INFO: renamed from: d */
        public final void mo7044d(C6635e c6635e) {
            C2413j c2413j = C2413j.this;
            c2413j.f12327r.mo12750d(c6635e);
            c2413j.f12286S = null;
            c2413j.f12302e0 = null;
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC2368b
        /* JADX INFO: renamed from: e */
        public final void mo6842e(String str) {
            C2413j.this.f12327r.mo12751e(str);
        }

        @Override // p529z9.InterfaceC10464d
        /* JADX INFO: renamed from: f */
        public final void mo7045f(Metadata metadata) {
            C2413j c2413j = C2413j.this;
            C2467q c2467q = c2413j.f12332t0;
            c2467q.getClass();
            C2467q.a aVar = new C2467q.a(c2467q);
            int i10 = 0;
            while (true) {
                Metadata.Entry[] entryArr = metadata.f12627a;
                if (i10 >= entryArr.length) {
                    break;
                }
                entryArr[i10].mo7206s(aVar);
                i10++;
            }
            c2413j.f12332t0 = new C2467q(aVar);
            C2467q c2467qM7023g = c2413j.m7023g();
            boolean zEquals = c2467qM7023g.equals(c2413j.f12284Q);
            C10144m<InterfaceC2532v.c> c10144m = c2413j.f12315l;
            if (!zEquals) {
                c2413j.f12284Q = c2467qM7023g;
                c10144m.m19088b(14, new C5509a(5, this));
            }
            c10144m.m19088b(28, new C9371n(6, metadata));
            c10144m.m19087a();
        }

        @Override // p505ya.InterfaceC10331m
        /* JADX INFO: renamed from: g */
        public final void mo7046g(int i10, long j10) {
            C2413j.this.f12327r.mo12753g(i10, j10);
        }

        @Override // p505ya.InterfaceC10331m
        /* JADX INFO: renamed from: h */
        public final void mo7047h(C10332n c10332n) {
            C2413j c2413j = C2413j.this;
            c2413j.f12330s0 = c10332n;
            c2413j.f12315l.m19091e(25, new C9370m(6, c10332n));
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC2368b
        /* JADX INFO: renamed from: i */
        public final void mo6843i(C2416m c2416m, C6637g c6637g) {
            C2413j c2413j = C2413j.this;
            c2413j.f12287T = c2416m;
            c2413j.f12327r.mo12754i(c2416m, c6637g);
        }

        @Override // p219ka.InterfaceC6651l
        /* JADX INFO: renamed from: j */
        public final void mo7048j(C6642c c6642c) {
            C2413j c2413j = C2413j.this;
            c2413j.f12314k0 = c6642c;
            c2413j.f12315l.m19091e(27, new C9371n(7, c6642c));
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC2368b
        /* JADX INFO: renamed from: k */
        public final void mo6844k(boolean z10) {
            C2413j c2413j = C2413j.this;
            if (c2413j.f12312j0 == z10) {
                return;
            }
            c2413j.f12312j0 = z10;
            c2413j.f12315l.m19091e(23, new C5925m(1, z10));
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC2368b
        /* JADX INFO: renamed from: l */
        public final void mo6845l(Exception exc) {
            C2413j.this.f12327r.mo12755l(exc);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC2368b
        /* JADX INFO: renamed from: m */
        public final void mo6846m(long j10) {
            C2413j.this.f12327r.mo12756m(j10);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC2368b
        /* JADX INFO: renamed from: n */
        public final void mo6847n(Exception exc) {
            C2413j.this.f12327r.mo12757n(exc);
        }

        @Override // p505ya.InterfaceC10331m
        /* JADX INFO: renamed from: o */
        public final void mo7049o(Exception exc) {
            C2413j.this.f12327r.mo12758o(exc);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            C2413j c2413j = C2413j.this;
            c2413j.getClass();
            Surface surface = new Surface(surfaceTexture);
            c2413j.m7038x(surface);
            c2413j.f12290W = surface;
            c2413j.m7032r(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C2413j c2413j = C2413j.this;
            c2413j.m7038x(null);
            c2413j.m7032r(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            C2413j.this.m7032r(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // p505ya.InterfaceC10331m
        /* JADX INFO: renamed from: p */
        public final void mo7050p(long j10, Object obj) {
            C2413j c2413j = C2413j.this;
            c2413j.f12327r.mo12759p(j10, obj);
            if (c2413j.f12289V == obj) {
                c2413j.f12315l.m19091e(26, new C8002l(8));
            }
        }

        @Override // p505ya.InterfaceC10331m
        /* JADX INFO: renamed from: q */
        public final void mo7051q(C2416m c2416m, C6637g c6637g) {
            C2413j c2413j = C2413j.this;
            c2413j.f12286S = c2416m;
            c2413j.f12327r.mo12760q(c2416m, c6637g);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC2368b
        /* JADX INFO: renamed from: r */
        public final void mo6848r(C6635e c6635e) {
            C2413j c2413j = C2413j.this;
            c2413j.f12327r.mo12761r(c6635e);
            c2413j.f12287T = null;
            c2413j.f12304f0 = null;
        }

        @Override // p505ya.InterfaceC10331m
        /* JADX INFO: renamed from: s */
        public final void mo7052s(long j10, long j11, String str) {
            C2413j.this.f12327r.mo12762s(j10, j11, str);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            C2413j.this.m7032r(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C2413j c2413j = C2413j.this;
            if (c2413j.f12293Z) {
                c2413j.m7038x(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C2413j c2413j = C2413j.this;
            if (c2413j.f12293Z) {
                c2413j.m7038x(null);
            }
            c2413j.m7032r(0, 0);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC2368b
        /* JADX INFO: renamed from: t */
        public final void mo6849t(int i10, long j10, long j11) {
            C2413j.this.f12327r.mo12763t(i10, j10, j11);
        }

        @Override // p505ya.InterfaceC10331m
        /* JADX INFO: renamed from: u */
        public final void mo7053u(C6635e c6635e) {
            C2413j c2413j = C2413j.this;
            c2413j.f12302e0 = c6635e;
            c2413j.f12327r.mo12764u(c6635e);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC2368b
        /* JADX INFO: renamed from: v */
        public final void mo6850v(long j10, long j11, String str) {
            C2413j.this.f12327r.mo12765v(j10, j11, str);
        }

        @Override // za.C10474j.b
        /* JADX INFO: renamed from: w */
        public final void mo7054w() {
            C2413j.this.m7038x(null);
        }

        @Override // za.C10474j.b
        /* JADX INFO: renamed from: x */
        public final void mo7055x(Surface surface) {
            C2413j.this.m7038x(surface);
        }

        @Override // p219ka.InterfaceC6651l
        /* JADX INFO: renamed from: y */
        public final void mo7056y(ImmutableList immutableList) {
            C2413j.this.f12315l.m19091e(27, new C10302c(immutableList));
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.InterfaceC2347b
        /* JADX INFO: renamed from: z */
        public final void mo6768z() {
            C2413j.this.m7020C();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$c */
    public static final class c implements InterfaceC10327i, InterfaceC10465a, C2534w.b {

        /* JADX INFO: renamed from: a */
        public InterfaceC10327i f12343a;

        /* JADX INFO: renamed from: b */
        public InterfaceC10465a f12344b;

        /* JADX INFO: renamed from: c */
        public InterfaceC10327i f12345c;

        /* JADX INFO: renamed from: d */
        public InterfaceC10465a f12346d;

        @Override // za.InterfaceC10465a
        /* JADX INFO: renamed from: b */
        public final void mo7057b(long j10, float[] fArr) {
            InterfaceC10465a interfaceC10465a = this.f12346d;
            if (interfaceC10465a != null) {
                interfaceC10465a.mo7057b(j10, fArr);
            }
            InterfaceC10465a interfaceC10465a2 = this.f12344b;
            if (interfaceC10465a2 != null) {
                interfaceC10465a2.mo7057b(j10, fArr);
            }
        }

        @Override // za.InterfaceC10465a
        /* JADX INFO: renamed from: j */
        public final void mo7058j() {
            InterfaceC10465a interfaceC10465a = this.f12346d;
            if (interfaceC10465a != null) {
                interfaceC10465a.mo7058j();
            }
            InterfaceC10465a interfaceC10465a2 = this.f12344b;
            if (interfaceC10465a2 != null) {
                interfaceC10465a2.mo7058j();
            }
        }

        @Override // p505ya.InterfaceC10327i
        /* JADX INFO: renamed from: l */
        public final void mo7059l(long j10, long j11, C2416m c2416m, MediaFormat mediaFormat) {
            InterfaceC10327i interfaceC10327i = this.f12345c;
            if (interfaceC10327i != null) {
                interfaceC10327i.mo7059l(j10, j11, c2416m, mediaFormat);
            }
            InterfaceC10327i interfaceC10327i2 = this.f12343a;
            if (interfaceC10327i2 != null) {
                interfaceC10327i2.mo7059l(j10, j11, c2416m, mediaFormat);
            }
        }

        @Override // com.google.android.exoplayer2.C2534w.b
        /* JADX INFO: renamed from: q */
        public final void mo6889q(int i10, Object obj) {
            if (i10 == 7) {
                this.f12343a = (InterfaceC10327i) obj;
                return;
            }
            if (i10 == 8) {
                this.f12344b = (InterfaceC10465a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            C10474j c10474j = (C10474j) obj;
            if (c10474j == null) {
                this.f12345c = null;
                this.f12346d = null;
            } else {
                this.f12345c = c10474j.getVideoFrameMetadataListener();
                this.f12346d = c10474j.getCameraMotionListener();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$d */
    public static final class d implements InterfaceC5904b0 {

        /* JADX INFO: renamed from: a */
        public final Object f12347a;

        /* JADX INFO: renamed from: b */
        public AbstractC2382c0 f12348b;

        public d(C2479g.a aVar, Object obj) {
            this.f12347a = obj;
            this.f12348b = aVar;
        }

        @Override // p150h9.InterfaceC5904b0
        /* JADX INFO: renamed from: a */
        public final Object mo7060a() {
            return this.f12347a;
        }

        @Override // p150h9.InterfaceC5904b0
        /* JADX INFO: renamed from: b */
        public final AbstractC2382c0 mo7061b() {
            return this.f12348b;
        }
    }

    static {
        C5941x.m12374a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public C2413j(ExoPlayer.C2348c c2348c) {
        try {
            C10145n.m19098f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.5] [" + C10134c0.f51358e + "]");
            Context context = c2348c.f11797a;
            Looper looper = c2348c.f11805i;
            this.f12301e = context.getApplicationContext();
            InterfaceC10171c<InterfaceC10133c, InterfaceC6206a> interfaceC10171c = c2348c.f11804h;
            C10155x c10155x = c2348c.f11798b;
            this.f12327r = interfaceC10171c.apply(c10155x);
            this.f12308h0 = c2348c.f11806j;
            this.f12296b0 = c2348c.f11807k;
            this.f12298c0 = 0;
            this.f12312j0 = false;
            this.f12272E = c2348c.f11814r;
            b bVar = new b();
            this.f12339x = bVar;
            this.f12340y = new c();
            Handler handler = new Handler(looper);
            InterfaceC2536y[] interfaceC2536yArrMo12334a = c2348c.f11799c.get().mo12334a(handler, bVar, bVar, bVar, bVar);
            this.f12305g = interfaceC2536yArrMo12334a;
            C10129a.m18992d(interfaceC2536yArrMo12334a.length > 0);
            this.f12307h = c2348c.f11801e.get();
            this.f12325q = c2348c.f11800d.get();
            this.f12331t = c2348c.f11803g.get();
            this.f12323p = c2348c.f11808l;
            this.f12280M = c2348c.f11809m;
            this.f12333u = c2348c.f11810n;
            this.f12335v = c2348c.f11811o;
            this.f12282O = false;
            this.f12329s = looper;
            this.f12337w = c10155x;
            this.f12303f = this;
            this.f12315l = new C10144m<>(looper, c10155x, new C5927n(this));
            this.f12317m = new CopyOnWriteArraySet<>();
            this.f12321o = new ArrayList();
            this.f12281N = new InterfaceC5732o.a();
            this.f12295b = new C9511t(new C5926m0[interfaceC2536yArrMo12334a.length], new InterfaceC9502k[interfaceC2536yArrMo12334a.length], C2384d0.f12104b, null);
            this.f12319n = new AbstractC2382c0.b();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int i10 = 4;
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i11 = 0; i11 < 21; i11++) {
                int i12 = iArr[i11];
                C10129a.m18992d(!false);
                sparseBooleanArray.append(i12, true);
            }
            AbstractC9510s abstractC9510s = this.f12307h;
            abstractC9510s.getClass();
            if (abstractC9510s instanceof C9496e) {
                C10129a.m18992d(!false);
                sparseBooleanArray.append(29, true);
            }
            C10129a.m18992d(true);
            C10141j c10141j = new C10141j(sparseBooleanArray);
            this.f12297c = new InterfaceC2532v.a(c10141j);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i13 = 0; i13 < c10141j.m19072b(); i13++) {
                int iM19071a = c10141j.m19071a(i13);
                C10129a.m18992d(!false);
                sparseBooleanArray2.append(iM19071a, true);
            }
            C10129a.m18992d(true);
            sparseBooleanArray2.append(4, true);
            C10129a.m18992d(true);
            sparseBooleanArray2.append(10, true);
            C10129a.m18992d(!false);
            this.f12283P = new InterfaceC2532v.a(new C10141j(sparseBooleanArray2));
            this.f12309i = this.f12337w.mo19013b(this.f12329s, null);
            C5509a c5509a = new C5509a(i10, this);
            this.f12311j = c5509a;
            this.f12334u0 = C5920j0.m12335h(this.f12295b);
            this.f12327r.mo12745U(this.f12303f, this.f12329s);
            int i14 = C10134c0.f51354a;
            this.f12313k = new C2415l(this.f12305g, this.f12307h, this.f12295b, c2348c.f11802f.get(), this.f12331t, this.f12273F, this.f12274G, this.f12327r, this.f12280M, c2348c.f11812p, c2348c.f11813q, this.f12282O, this.f12329s, this.f12337w, c5509a, i14 < 31 ? new C6215e0() : a.m7041a(this.f12301e, this, c2348c.f11815s));
            this.f12310i0 = 1.0f;
            this.f12273F = 0;
            C2467q c2467q = C2467q.f12883d0;
            this.f12284Q = c2467q;
            this.f12285R = c2467q;
            this.f12332t0 = c2467q;
            int iGenerateAudioSessionId = -1;
            this.f12336v0 = -1;
            if (i14 < 21) {
                this.f12306g0 = m7029n(0);
            } else {
                AudioManager audioManager = (AudioManager) this.f12301e.getSystemService("audio");
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.f12306g0 = iGenerateAudioSessionId;
            }
            this.f12314k0 = C6642c.f37688b;
            this.f12320n0 = true;
            addListener(this.f12327r);
            this.f12331t.mo18371a(new Handler(this.f12329s), this.f12327r);
            addAudioOffloadListener(this.f12339x);
            C2379b c2379b = new C2379b(context, handler, this.f12339x);
            this.f12341z = c2379b;
            c2379b.m6898a(false);
            C2381c c2381c = new C2381c(context, handler, this.f12339x);
            this.f12268A = c2381c;
            c2381c.m6901c(null);
            C2353a0 c2353a0 = new C2353a0(context, handler, this.f12339x);
            this.f12269B = c2353a0;
            c2353a0.m6785c(C10134c0.m19057x(this.f12308h0.f11940c));
            C5932p0 c5932p0 = new C5932p0(context);
            this.f12270C = c5932p0;
            c5932p0.m12346a(false);
            C5934q0 c5934q0 = new C5934q0(context);
            this.f12271D = c5934q0;
            c5934q0.m12347a(false);
            this.f12328r0 = new C2412i(0, c2353a0.m6784a(), c2353a0.f11828d.getStreamMaxVolume(c2353a0.f11830f));
            this.f12330s0 = C10332n.f52011e;
            this.f12300d0 = C10153v.f51445c;
            this.f12307h.mo17942e(this.f12308h0);
            m7035u(1, 10, Integer.valueOf(this.f12306g0));
            m7035u(2, 10, Integer.valueOf(this.f12306g0));
            m7035u(1, 3, this.f12308h0);
            m7035u(2, 4, Integer.valueOf(this.f12296b0));
            m7035u(2, 5, Integer.valueOf(this.f12298c0));
            m7035u(1, 9, Boolean.valueOf(this.f12312j0));
            m7035u(2, 7, this.f12340y);
            m7035u(6, 8, this.f12340y);
        } finally {
            this.f12299d.m19062a();
        }
    }

    /* JADX INFO: renamed from: m */
    public static long m7016m(C5920j0 c5920j0) {
        AbstractC2382c0.c cVar = new AbstractC2382c0.c();
        AbstractC2382c0.b bVar = new AbstractC2382c0.b();
        c5920j0.f35313a.mo6778g(c5920j0.f35314b.f34757a, bVar);
        long j10 = c5920j0.f35315c;
        return j10 == -9223372036854775807L ? c5920j0.f35313a.m6908m(bVar.f12065c, cVar).f12086H : bVar.f12067e + j10;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m7017o(C5920j0 c5920j0) {
        return c5920j0.f35317e == 3 && c5920j0.f35324l && c5920j0.f35325m == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: A */
    public final void m7018A(int i10, int i11, boolean z10) {
        int i12 = 0;
        ?? r10 = (!z10 || i10 == -1) ? 0 : 1;
        if (r10 != 0 && i10 != 1) {
            i12 = 1;
        }
        C5920j0 c5920j0 = this.f12334u0;
        if (c5920j0.f35324l == r10 && c5920j0.f35325m == i12) {
            return;
        }
        this.f12275H++;
        C5920j0 c5920j0M12338c = c5920j0.m12338c(i12, r10);
        C2415l c2415l = this.f12313k;
        c2415l.getClass();
        c2415l.f12383h.mo19076b(1, r10, i12).m19164a();
        m7019B(c5920j0M12338c, 0, i11, false, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: B */
    public final void m7019B(final C5920j0 c5920j0, int i10, int i11, boolean z10, boolean z11, final int i12, long j10, int i13, boolean z12) {
        Pair pair;
        C2466p c2466p;
        final int i14;
        final int i15;
        C2466p c2466p2;
        int iMo6774b;
        int i16;
        Object obj;
        Object obj2;
        long j11;
        long j12;
        long jM7016m;
        long jM7016m2;
        Object obj3;
        C2466p c2466p3;
        Object obj4;
        int i17;
        C5920j0 c5920j1 = this.f12334u0;
        this.f12334u0 = c5920j0;
        int i18 = 1;
        boolean z13 = !c5920j1.f35313a.equals(c5920j0.f35313a);
        AbstractC2382c0 abstractC2382c0 = c5920j1.f35313a;
        AbstractC2382c0 abstractC2382c1 = c5920j0.f35313a;
        if (abstractC2382c1.m6910p() && abstractC2382c0.m6910p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (abstractC2382c1.m6910p() != abstractC2382c0.m6910p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            InterfaceC2492i.b bVar = c5920j1.f35314b;
            Object obj5 = bVar.f34757a;
            AbstractC2382c0.b bVar2 = this.f12319n;
            int i19 = abstractC2382c0.mo6778g(obj5, bVar2).f12065c;
            AbstractC2382c0.c cVar = this.f12103a;
            Object obj6 = abstractC2382c0.m6908m(i19, cVar).f12091a;
            InterfaceC2492i.b bVar3 = c5920j0.f35314b;
            if (!obj6.equals(abstractC2382c1.m6908m(abstractC2382c1.mo6778g(bVar3.f34757a, bVar2).f12065c, cVar).f12091a)) {
                if (!z11 || i12 != 0) {
                    if (z11 && i12 == 1) {
                        i18 = 2;
                    } else {
                        if (!z13) {
                            throw new IllegalStateException();
                        }
                        i18 = 3;
                    }
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i18));
            } else if (z11 && i12 == 0 && bVar.f34760d < bVar3.f34760d) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = (z11 && i12 == 1 && z12) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        C2467q c2467qM7023g = this.f12284Q;
        if (zBooleanValue) {
            c2466p = c5920j0.f35313a.m6910p() ? null : c5920j0.f35313a.m6908m(c5920j0.f35313a.mo6778g(c5920j0.f35314b.f34757a, this.f12319n).f12065c, this.f12103a).f12093c;
            this.f12332t0 = C2467q.f12883d0;
        } else {
            c2466p = null;
        }
        if (zBooleanValue || !c5920j1.f35322j.equals(c5920j0.f35322j)) {
            C2467q c2467q = this.f12332t0;
            c2467q.getClass();
            C2467q.a aVar = new C2467q.a(c2467q);
            List<Metadata> list = c5920j0.f35322j;
            for (int i20 = 0; i20 < list.size(); i20++) {
                Metadata metadata = list.get(i20);
                int i21 = 0;
                while (true) {
                    Metadata.Entry[] entryArr = metadata.f12627a;
                    if (i21 < entryArr.length) {
                        entryArr[i21].mo7206s(aVar);
                        i21++;
                    }
                }
            }
            this.f12332t0 = new C2467q(aVar);
            c2467qM7023g = m7023g();
        }
        boolean z14 = !c2467qM7023g.equals(this.f12284Q);
        this.f12284Q = c2467qM7023g;
        boolean z15 = c5920j1.f35324l != c5920j0.f35324l;
        boolean z16 = c5920j1.f35317e != c5920j0.f35317e;
        if (z16 || z15) {
            m7020C();
        }
        boolean z17 = c5920j1.f35319g != c5920j0.f35319g;
        if (z13) {
            this.f12315l.m19088b(0, new C6219i(i10, 2, c5920j0));
        }
        if (z11) {
            AbstractC2382c0.b bVar4 = new AbstractC2382c0.b();
            if (c5920j1.f35313a.m6910p()) {
                c2466p2 = null;
                iMo6774b = -1;
                i16 = i13;
                obj = null;
                obj2 = null;
            } else {
                Object obj7 = c5920j1.f35314b.f34757a;
                c5920j1.f35313a.mo6778g(obj7, bVar4);
                int i22 = bVar4.f12065c;
                iMo6774b = c5920j1.f35313a.mo6774b(obj7);
                Object obj8 = c5920j1.f35313a.m6908m(i22, this.f12103a).f12091a;
                c2466p2 = this.f12103a.f12093c;
                obj2 = obj7;
                obj = obj8;
                i16 = i22;
            }
            int i23 = iMo6774b;
            C2466p c2466p4 = c2466p2;
            if (i12 == 0) {
                if (c5920j1.f35314b.m12079a()) {
                    InterfaceC2492i.b bVar5 = c5920j1.f35314b;
                    jM7016m = bVar4.m6911a(bVar5.f34758b, bVar5.f34759c);
                    jM7016m2 = m7016m(c5920j1);
                } else {
                    if (c5920j1.f35314b.f34761e != -1) {
                        jM7016m = m7016m(this.f12334u0);
                    } else {
                        j11 = bVar4.f12067e;
                        j12 = bVar4.f12066d;
                        jM7016m = j11 + j12;
                    }
                    jM7016m2 = jM7016m;
                }
            } else if (c5920j1.f35314b.m12079a()) {
                jM7016m = c5920j1.f35330r;
                jM7016m2 = m7016m(c5920j1);
            } else {
                j11 = bVar4.f12067e;
                j12 = c5920j1.f35330r;
                jM7016m = j11 + j12;
                jM7016m2 = jM7016m;
            }
            long jM19033R = C10134c0.m19033R(jM7016m);
            long jM19033R2 = C10134c0.m19033R(jM7016m2);
            InterfaceC2492i.b bVar6 = c5920j1.f35314b;
            final InterfaceC2532v.d dVar = new InterfaceC2532v.d(obj, i16, c2466p4, obj2, i23, jM19033R, jM19033R2, bVar6.f34758b, bVar6.f34759c);
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            if (this.f12334u0.f35313a.m6910p()) {
                obj3 = null;
                c2466p3 = null;
                obj4 = null;
                i17 = -1;
            } else {
                C5920j0 c5920j2 = this.f12334u0;
                Object obj9 = c5920j2.f35314b.f34757a;
                c5920j2.f35313a.mo6778g(obj9, this.f12319n);
                int iMo6774b2 = this.f12334u0.f35313a.mo6774b(obj9);
                AbstractC2382c0 abstractC2382c2 = this.f12334u0.f35313a;
                AbstractC2382c0.c cVar2 = this.f12103a;
                Object obj10 = abstractC2382c2.m6908m(currentMediaItemIndex, cVar2).f12091a;
                i17 = iMo6774b2;
                c2466p3 = cVar2.f12093c;
                obj4 = obj9;
                obj3 = obj10;
            }
            long jM19033R3 = C10134c0.m19033R(j10);
            long jM19033R4 = this.f12334u0.f35314b.m12079a() ? C10134c0.m19033R(m7016m(this.f12334u0)) : jM19033R3;
            InterfaceC2492i.b bVar7 = this.f12334u0.f35314b;
            final InterfaceC2532v.d dVar2 = new InterfaceC2532v.d(obj3, currentMediaItemIndex, c2466p3, obj4, i17, jM19033R3, jM19033R4, bVar7.f34758b, bVar7.f34759c);
            this.f12315l.m19088b(11, new C10144m.a() { // from class: h9.u
                @Override // p479xa.C10144m.a
                /* JADX INFO: renamed from: n */
                public final void mo780n(Object obj11) {
                    InterfaceC2532v.c cVar3 = (InterfaceC2532v.c) obj11;
                    cVar3.mo7504l0();
                    cVar3.mo7409O(i12, dVar, dVar2);
                }
            });
        }
        if (zBooleanValue) {
            C10144m<InterfaceC2532v.c> c10144m = this.f12315l;
            C5921k c5921k = new C5921k(iIntValue, 0, c2466p);
            i14 = 1;
            c10144m.m19088b(1, c5921k);
        } else {
            i14 = 1;
        }
        int i24 = 10;
        if (c5920j1.f35318f != c5920j0.f35318f) {
            this.f12315l.m19088b(10, new C10144m.a() { // from class: h9.t
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // p479xa.C10144m.a
                /* JADX INFO: renamed from: n */
                public final void mo780n(Object obj11) {
                    int i25 = i14;
                    C5920j0 c5920j3 = c5920j0;
                    switch (i25) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            ((InterfaceC2532v.c) obj11).mo7506n0(c5920j3.f35326n);
                            break;
                        case 1:
                            ((InterfaceC2532v.c) obj11).mo7502j0(c5920j3.f35318f);
                            break;
                        default:
                            InterfaceC2532v.c cVar3 = (InterfaceC2532v.c) obj11;
                            boolean z18 = c5920j3.f35319g;
                            cVar3.mo7497b0();
                            cVar3.mo7484B(c5920j3.f35319g);
                            break;
                    }
                }
            });
            if (c5920j0.f35318f != null) {
                final int i25 = 0;
                this.f12315l.m19088b(10, new C10144m.a() { // from class: h9.l
                    @Override // p479xa.C10144m.a
                    /* JADX INFO: renamed from: n */
                    public final void mo780n(Object obj11) {
                        int i26 = i25;
                        C5920j0 c5920j3 = c5920j0;
                        switch (i26) {
                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                ((InterfaceC2532v.c) obj11).mo7510z(c5920j3.f35318f);
                                break;
                            default:
                                ((InterfaceC2532v.c) obj11).mo7501i0(c5920j3.f35317e, c5920j3.f35324l);
                                break;
                        }
                    }
                });
            }
        }
        C9511t c9511t = c5920j1.f35321i;
        C9511t c9511t2 = c5920j0.f35321i;
        if (c9511t != c9511t2) {
            this.f12307h.mo17971b(c9511t2.f49015e);
            final int i26 = 1;
            this.f12315l.m19088b(2, new C10144m.a() { // from class: h9.s
                @Override // p479xa.C10144m.a
                /* JADX INFO: renamed from: n */
                public final void mo780n(Object obj11) {
                    int i27 = i26;
                    C5920j0 c5920j3 = c5920j0;
                    switch (i27) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            ((InterfaceC2532v.c) obj11).mo7509w(c5920j3.f35325m);
                            break;
                        case 1:
                            ((InterfaceC2532v.c) obj11).mo7406A(c5920j3.f35321i.f49014d);
                            break;
                        default:
                            ((InterfaceC2532v.c) obj11).mo7408J(c5920j3.f35317e);
                            break;
                    }
                }
            });
        }
        if (z14) {
            this.f12315l.m19088b(14, new C9369l(11, this.f12284Q));
        }
        if (z17) {
            final int i27 = 2;
            this.f12315l.m19088b(3, new C10144m.a() { // from class: h9.t
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // p479xa.C10144m.a
                /* JADX INFO: renamed from: n */
                public final void mo780n(Object obj11) {
                    int i28 = i27;
                    C5920j0 c5920j3 = c5920j0;
                    switch (i28) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            ((InterfaceC2532v.c) obj11).mo7506n0(c5920j3.f35326n);
                            break;
                        case 1:
                            ((InterfaceC2532v.c) obj11).mo7502j0(c5920j3.f35318f);
                            break;
                        default:
                            InterfaceC2532v.c cVar3 = (InterfaceC2532v.c) obj11;
                            boolean z18 = c5920j3.f35319g;
                            cVar3.mo7497b0();
                            cVar3.mo7484B(c5920j3.f35319g);
                            break;
                    }
                }
            });
        }
        if (z16 || z15) {
            final int i28 = 1;
            this.f12315l.m19088b(-1, new C10144m.a() { // from class: h9.l
                @Override // p479xa.C10144m.a
                /* JADX INFO: renamed from: n */
                public final void mo780n(Object obj11) {
                    int i29 = i28;
                    C5920j0 c5920j3 = c5920j0;
                    switch (i29) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            ((InterfaceC2532v.c) obj11).mo7510z(c5920j3.f35318f);
                            break;
                        default:
                            ((InterfaceC2532v.c) obj11).mo7501i0(c5920j3.f35317e, c5920j3.f35324l);
                            break;
                    }
                }
            });
        }
        if (z16) {
            final int i29 = 2;
            this.f12315l.m19088b(4, new C10144m.a() { // from class: h9.s
                @Override // p479xa.C10144m.a
                /* JADX INFO: renamed from: n */
                public final void mo780n(Object obj11) {
                    int i210 = i29;
                    C5920j0 c5920j3 = c5920j0;
                    switch (i210) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            ((InterfaceC2532v.c) obj11).mo7509w(c5920j3.f35325m);
                            break;
                        case 1:
                            ((InterfaceC2532v.c) obj11).mo7406A(c5920j3.f35321i.f49014d);
                            break;
                        default:
                            ((InterfaceC2532v.c) obj11).mo7408J(c5920j3.f35317e);
                            break;
                    }
                }
            });
        }
        if (z15) {
            i15 = 0;
            this.f12315l.m19088b(5, new C5935r(i11, i15, c5920j0));
        } else {
            i15 = 0;
        }
        if (c5920j1.f35325m != c5920j0.f35325m) {
            this.f12315l.m19088b(6, new C10144m.a() { // from class: h9.s
                @Override // p479xa.C10144m.a
                /* JADX INFO: renamed from: n */
                public final void mo780n(Object obj11) {
                    int i210 = i15;
                    C5920j0 c5920j3 = c5920j0;
                    switch (i210) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            ((InterfaceC2532v.c) obj11).mo7509w(c5920j3.f35325m);
                            break;
                        case 1:
                            ((InterfaceC2532v.c) obj11).mo7406A(c5920j3.f35321i.f49014d);
                            break;
                        default:
                            ((InterfaceC2532v.c) obj11).mo7408J(c5920j3.f35317e);
                            break;
                    }
                }
            });
        }
        if (m7017o(c5920j1) != m7017o(c5920j0)) {
            this.f12315l.m19088b(7, new C9369l(i24, c5920j0));
        }
        if (!c5920j1.f35326n.equals(c5920j0.f35326n)) {
            final int i30 = 0;
            this.f12315l.m19088b(12, new C10144m.a() { // from class: h9.t
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // p479xa.C10144m.a
                /* JADX INFO: renamed from: n */
                public final void mo780n(Object obj11) {
                    int i210 = i30;
                    C5920j0 c5920j3 = c5920j0;
                    switch (i210) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            ((InterfaceC2532v.c) obj11).mo7506n0(c5920j3.f35326n);
                            break;
                        case 1:
                            ((InterfaceC2532v.c) obj11).mo7502j0(c5920j3.f35318f);
                            break;
                        default:
                            InterfaceC2532v.c cVar3 = (InterfaceC2532v.c) obj11;
                            boolean z18 = c5920j3.f35319g;
                            cVar3.mo7497b0();
                            cVar3.mo7484B(c5920j3.f35319g);
                            break;
                    }
                }
            });
        }
        if (z10) {
            this.f12315l.m19088b(-1, new C9362e(11));
        }
        m7040z();
        this.f12315l.m19087a();
        if (c5920j1.f35327o != c5920j0.f35327o) {
            Iterator<ExoPlayer.InterfaceC2347b> it = this.f12317m.iterator();
            while (it.hasNext()) {
                it.next().mo6768z();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m7020C() {
        int playbackState = getPlaybackState();
        C5934q0 c5934q0 = this.f12271D;
        C5932p0 c5932p0 = this.f12270C;
        boolean z10 = true;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                boolean zExperimentalIsSleepingForOffload = experimentalIsSleepingForOffload();
                if (!getPlayWhenReady() || zExperimentalIsSleepingForOffload) {
                    z10 = false;
                }
                c5932p0.f35356d = z10;
                PowerManager.WakeLock wakeLock = c5932p0.f35354b;
                if (wakeLock != null) {
                    if (c5932p0.f35355c && z10) {
                        wakeLock.acquire();
                    } else {
                        wakeLock.release();
                    }
                }
                boolean playWhenReady = getPlayWhenReady();
                c5934q0.f35361d = playWhenReady;
                WifiManager.WifiLock wifiLock = c5934q0.f35359b;
                if (wifiLock == null) {
                    return;
                }
                if (c5934q0.f35360c && playWhenReady) {
                    wifiLock.acquire();
                    return;
                } else {
                    wifiLock.release();
                    return;
                }
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        c5932p0.f35356d = false;
        PowerManager.WakeLock wakeLock2 = c5932p0.f35354b;
        if (wakeLock2 != null) {
            boolean z11 = c5932p0.f35355c;
            wakeLock2.release();
        }
        c5934q0.f35361d = false;
        WifiManager.WifiLock wifiLock2 = c5934q0.f35359b;
        if (wifiLock2 == null) {
            return;
        }
        boolean z12 = c5934q0.f35360c;
        wifiLock2.release();
    }

    /* JADX INFO: renamed from: D */
    public final void m7021D() {
        C10136e c10136e = this.f12299d;
        synchronized (c10136e) {
            boolean z10 = false;
            while (!c10136e.f51371a) {
                try {
                    c10136e.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f12329s.getThread()) {
            String strM19045l = C10134c0.m19045l("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f12329s.getThread().getName());
            if (this.f12320n0) {
                throw new IllegalStateException(strM19045l);
            }
            C10145n.m19100h("ExoPlayerImpl", strM19045l, this.f12322o0 ? null : new IllegalStateException());
            this.f12322o0 = true;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC2383d
    /* JADX INFO: renamed from: a */
    public final void mo6921a(int i10, long j10, boolean z10) {
        m7021D();
        C10129a.m18990b(i10 >= 0);
        this.f12327r.mo12744P();
        AbstractC2382c0 abstractC2382c0 = this.f12334u0.f35313a;
        if (abstractC2382c0.m6910p() || i10 < abstractC2382c0.mo6909o()) {
            this.f12275H++;
            if (isPlayingAd()) {
                C10145n.m19099g("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C2415l.d dVar = new C2415l.d(this.f12334u0);
                dVar.m7122a(1);
                C2413j c2413j = (C2413j) this.f12311j.f34148b;
                c2413j.getClass();
                c2413j.f12309i.mo19079e(new RunnableC5682t(c2413j, 7, dVar));
                return;
            }
            int i11 = getPlaybackState() != 1 ? 2 : 1;
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            C5920j0 c5920j0M7030p = m7030p(this.f12334u0.m12341f(i11), abstractC2382c0, m7031q(abstractC2382c0, i10, j10));
            long jM19026K = C10134c0.m19026K(j10);
            C2415l c2415l = this.f12313k;
            c2415l.getClass();
            c2415l.f12383h.mo19085k(3, new C2415l.g(abstractC2382c0, i10, jM19026K)).m19164a();
            m7019B(c5920j0M7030p, 0, 1, true, true, 1, m7026j(c5920j0M7030p), currentMediaItemIndex, z10);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void addAnalyticsListener(InterfaceC6208b interfaceC6208b) {
        interfaceC6208b.getClass();
        this.f12327r.mo12743K(interfaceC6208b);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void addAudioOffloadListener(ExoPlayer.InterfaceC2347b interfaceC2347b) {
        this.f12317m.add(interfaceC2347b);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void addListener(InterfaceC2532v.c cVar) {
        cVar.getClass();
        C10144m<InterfaceC2532v.c> c10144m = this.f12315l;
        c10144m.getClass();
        synchronized (c10144m.f51390g) {
            if (c10144m.f51391h) {
                return;
            }
            c10144m.f51387d.add(new C10144m.c<>(cVar));
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void addMediaItems(int i10, List<C2466p> list) {
        m7021D();
        addMediaSources(i10, m7024h(list));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void addMediaSource(int i10, InterfaceC2492i interfaceC2492i) {
        m7021D();
        addMediaSources(i10, Collections.singletonList(interfaceC2492i));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void addMediaSource(InterfaceC2492i interfaceC2492i) {
        m7021D();
        addMediaSources(Collections.singletonList(interfaceC2492i));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void addMediaSources(int i10, List<InterfaceC2492i> list) {
        m7021D();
        C10129a.m18990b(i10 >= 0);
        ArrayList arrayList = this.f12321o;
        int iMin = Math.min(i10, arrayList.size());
        AbstractC2382c0 currentTimeline = getCurrentTimeline();
        this.f12275H++;
        ArrayList arrayListM7022f = m7022f(iMin, list);
        C5922k0 c5922k0 = new C5922k0(arrayList, this.f12281N);
        C5920j0 c5920j0M7030p = m7030p(this.f12334u0, c5922k0, m7028l(currentTimeline, c5922k0));
        InterfaceC5732o interfaceC5732o = this.f12281N;
        C2415l c2415l = this.f12313k;
        c2415l.getClass();
        c2415l.f12383h.mo19078d(new C2415l.a(arrayListM7022f, interfaceC5732o, -1, -9223372036854775807L), 18, iMin, 0).m19164a();
        m7019B(c5920j0M7030p, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void addMediaSources(List<InterfaceC2492i> list) {
        m7021D();
        addMediaSources(this.f12321o.size(), list);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void clearAuxEffectInfo() {
        m7021D();
        setAuxEffectInfo(new C6434k());
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void clearCameraMotionListener(InterfaceC10465a interfaceC10465a) {
        m7021D();
        if (this.f12318m0 != interfaceC10465a) {
            return;
        }
        C2534w c2534wM7025i = m7025i(this.f12340y);
        c2534wM7025i.m7519e(8);
        c2534wM7025i.m7518d(null);
        c2534wM7025i.m7517c();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void clearVideoFrameMetadataListener(InterfaceC10327i interfaceC10327i) {
        m7021D();
        if (this.f12316l0 != interfaceC10327i) {
            return;
        }
        C2534w c2534wM7025i = m7025i(this.f12340y);
        c2534wM7025i.m7519e(7);
        c2534wM7025i.m7518d(null);
        c2534wM7025i.m7517c();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void clearVideoSurface() {
        m7021D();
        m7034t();
        m7038x(null);
        m7032r(0, 0);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void clearVideoSurface(Surface surface) {
        m7021D();
        if (surface == null || surface != this.f12289V) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        m7021D();
        if (surfaceHolder != null && surfaceHolder == this.f12291X) {
            clearVideoSurface();
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        m7021D();
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void clearVideoTextureView(TextureView textureView) {
        m7021D();
        if (textureView == null || textureView != this.f12294a0) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final C2534w createMessage(C2534w.b bVar) {
        m7021D();
        return m7025i(bVar);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void decreaseDeviceVolume() {
        m7021D();
        C2353a0 c2353a0 = this.f12269B;
        if (c2353a0.f11831g <= c2353a0.m6784a()) {
            return;
        }
        c2353a0.f11828d.adjustStreamVolume(c2353a0.f11830f, -1, 1);
        c2353a0.m6786d();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final boolean experimentalIsSleepingForOffload() {
        m7021D();
        return this.f12334u0.f35327o;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void experimentalSetOffloadSchedulingEnabled(boolean z10) {
        m7021D();
        this.f12313k.f12383h.mo19076b(24, z10 ? 1 : 0, 0).m19164a();
        Iterator<ExoPlayer.InterfaceC2347b> it = this.f12317m.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m7022f(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            C2469s.c cVar = new C2469s.c((InterfaceC2492i) list.get(i11), this.f12323p);
            arrayList.add(cVar);
            d dVar = new d(cVar.f13003a.f13113h, cVar.f13004b);
            this.f12321o.add(i11 + i10, dVar);
        }
        this.f12281N = this.f12281N.mo12085f(i10, arrayList.size());
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final C2467q m7023g() {
        AbstractC2382c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.m6910p()) {
            return this.f12332t0;
        }
        C2466p c2466p = currentTimeline.m6908m(getCurrentMediaItemIndex(), this.f12103a).f12093c;
        C2467q c2467q = this.f12332t0;
        c2467q.getClass();
        C2467q.a aVar = new C2467q.a(c2467q);
        C2467q c2467q2 = c2466p.f12774d;
        if (c2467q2 != null) {
            CharSequence charSequence = c2467q2.f12925a;
            if (charSequence != null) {
                aVar.f12947a = charSequence;
            }
            CharSequence charSequence2 = c2467q2.f12927b;
            if (charSequence2 != null) {
                aVar.f12948b = charSequence2;
            }
            CharSequence charSequence3 = c2467q2.f12929c;
            if (charSequence3 != null) {
                aVar.f12949c = charSequence3;
            }
            CharSequence charSequence4 = c2467q2.f12931d;
            if (charSequence4 != null) {
                aVar.f12950d = charSequence4;
            }
            CharSequence charSequence5 = c2467q2.f12932e;
            if (charSequence5 != null) {
                aVar.f12951e = charSequence5;
            }
            CharSequence charSequence6 = c2467q2.f12933f;
            if (charSequence6 != null) {
                aVar.f12952f = charSequence6;
            }
            CharSequence charSequence7 = c2467q2.f12934g;
            if (charSequence7 != null) {
                aVar.f12953g = charSequence7;
            }
            AbstractC2535x abstractC2535x = c2467q2.f12935h;
            if (abstractC2535x != null) {
                aVar.f12954h = abstractC2535x;
            }
            AbstractC2535x abstractC2535x2 = c2467q2.f12936i;
            if (abstractC2535x2 != null) {
                aVar.f12955i = abstractC2535x2;
            }
            byte[] bArr = c2467q2.f12937j;
            if (bArr != null) {
                aVar.f12956j = (byte[]) bArr.clone();
                aVar.f12957k = c2467q2.f12938k;
            }
            Uri uri = c2467q2.f12939l;
            if (uri != null) {
                aVar.f12958l = uri;
            }
            Integer num = c2467q2.f12906H;
            if (num != null) {
                aVar.f12959m = num;
            }
            Integer num2 = c2467q2.f12907I;
            if (num2 != null) {
                aVar.f12960n = num2;
            }
            Integer num3 = c2467q2.f12908J;
            if (num3 != null) {
                aVar.f12961o = num3;
            }
            Boolean bool = c2467q2.f12909K;
            if (bool != null) {
                aVar.f12962p = bool;
            }
            Boolean bool2 = c2467q2.f12910L;
            if (bool2 != null) {
                aVar.f12963q = bool2;
            }
            Integer num4 = c2467q2.f12911M;
            if (num4 != null) {
                aVar.f12964r = num4;
            }
            Integer num5 = c2467q2.f12912N;
            if (num5 != null) {
                aVar.f12964r = num5;
            }
            Integer num6 = c2467q2.f12913O;
            if (num6 != null) {
                aVar.f12965s = num6;
            }
            Integer num7 = c2467q2.f12914P;
            if (num7 != null) {
                aVar.f12966t = num7;
            }
            Integer num8 = c2467q2.f12915Q;
            if (num8 != null) {
                aVar.f12967u = num8;
            }
            Integer num9 = c2467q2.f12916R;
            if (num9 != null) {
                aVar.f12968v = num9;
            }
            Integer num10 = c2467q2.f12917S;
            if (num10 != null) {
                aVar.f12969w = num10;
            }
            CharSequence charSequence8 = c2467q2.f12918T;
            if (charSequence8 != null) {
                aVar.f12970x = charSequence8;
            }
            CharSequence charSequence9 = c2467q2.f12919U;
            if (charSequence9 != null) {
                aVar.f12971y = charSequence9;
            }
            CharSequence charSequence10 = c2467q2.f12920V;
            if (charSequence10 != null) {
                aVar.f12972z = charSequence10;
            }
            Integer num11 = c2467q2.f12921W;
            if (num11 != null) {
                aVar.f12940A = num11;
            }
            Integer num12 = c2467q2.f12922X;
            if (num12 != null) {
                aVar.f12941B = num12;
            }
            CharSequence charSequence11 = c2467q2.f12923Y;
            if (charSequence11 != null) {
                aVar.f12942C = charSequence11;
            }
            CharSequence charSequence12 = c2467q2.f12924Z;
            if (charSequence12 != null) {
                aVar.f12943D = charSequence12;
            }
            CharSequence charSequence13 = c2467q2.f12926a0;
            if (charSequence13 != null) {
                aVar.f12944E = charSequence13;
            }
            Integer num13 = c2467q2.f12928b0;
            if (num13 != null) {
                aVar.f12945F = num13;
            }
            Bundle bundle = c2467q2.f12930c0;
            if (bundle != null) {
                aVar.f12946G = bundle;
            }
        }
        return new C2467q(aVar);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final InterfaceC6206a getAnalyticsCollector() {
        m7021D();
        return this.f12327r;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final Looper getApplicationLooper() {
        return this.f12329s;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final C2367a getAudioAttributes() {
        m7021D();
        return this.f12308h0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public final ExoPlayer.InterfaceC2346a getAudioComponent() {
        m7021D();
        return this;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final C6635e getAudioDecoderCounters() {
        m7021D();
        return this.f12304f0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final C2416m getAudioFormat() {
        m7021D();
        return this.f12287T;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final int getAudioSessionId() {
        m7021D();
        return this.f12306g0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final InterfaceC2532v.a getAvailableCommands() {
        m7021D();
        return this.f12283P;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final long getBufferedPosition() {
        m7021D();
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        C5920j0 c5920j0 = this.f12334u0;
        return c5920j0.f35323k.equals(c5920j0.f35314b) ? C10134c0.m19033R(this.f12334u0.f35328p) : getDuration();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final InterfaceC10133c getClock() {
        return this.f12337w;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final long getContentBufferedPosition() {
        m7021D();
        if (this.f12334u0.f35313a.m6910p()) {
            return this.f12338w0;
        }
        C5920j0 c5920j0 = this.f12334u0;
        if (c5920j0.f35323k.f34760d != c5920j0.f35314b.f34760d) {
            return C10134c0.m19033R(c5920j0.f35313a.m6908m(getCurrentMediaItemIndex(), this.f12103a).f12087I);
        }
        long j10 = c5920j0.f35328p;
        if (this.f12334u0.f35323k.m12079a()) {
            C5920j0 c5920j1 = this.f12334u0;
            AbstractC2382c0.b bVarMo6778g = c5920j1.f35313a.mo6778g(c5920j1.f35323k.f34757a, this.f12319n);
            long jM6914d = bVarMo6778g.m6914d(this.f12334u0.f35323k.f34758b);
            if (jM6914d == Long.MIN_VALUE) {
                j10 = bVarMo6778g.f12066d;
            } else {
                j10 = jM6914d;
            }
        }
        C5920j0 c5920j2 = this.f12334u0;
        AbstractC2382c0 abstractC2382c0 = c5920j2.f35313a;
        Object obj = c5920j2.f35323k.f34757a;
        AbstractC2382c0.b bVar = this.f12319n;
        abstractC2382c0.mo6778g(obj, bVar);
        return C10134c0.m19033R(j10 + bVar.f12067e);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final long getContentPosition() {
        m7021D();
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        C5920j0 c5920j0 = this.f12334u0;
        AbstractC2382c0 abstractC2382c0 = c5920j0.f35313a;
        Object obj = c5920j0.f35314b.f34757a;
        AbstractC2382c0.b bVar = this.f12319n;
        abstractC2382c0.mo6778g(obj, bVar);
        C5920j0 c5920j1 = this.f12334u0;
        if (c5920j1.f35315c != -9223372036854775807L) {
            return C10134c0.m19033R(bVar.f12067e) + C10134c0.m19033R(this.f12334u0.f35315c);
        }
        return C10134c0.m19033R(c5920j1.f35313a.m6908m(getCurrentMediaItemIndex(), this.f12103a).f12086H);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final int getCurrentAdGroupIndex() {
        m7021D();
        if (isPlayingAd()) {
            return this.f12334u0.f35314b.f34758b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final int getCurrentAdIndexInAdGroup() {
        m7021D();
        if (isPlayingAd()) {
            return this.f12334u0.f35314b.f34759c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final C6642c getCurrentCues() {
        m7021D();
        return this.f12314k0;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final int getCurrentMediaItemIndex() {
        m7021D();
        int iM7027k = m7027k();
        if (iM7027k == -1) {
            return 0;
        }
        return iM7027k;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final int getCurrentPeriodIndex() {
        m7021D();
        if (this.f12334u0.f35313a.m6910p()) {
            return 0;
        }
        C5920j0 c5920j0 = this.f12334u0;
        return c5920j0.f35313a.mo6774b(c5920j0.f35314b.f34757a);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final long getCurrentPosition() {
        m7021D();
        return C10134c0.m19033R(m7026j(this.f12334u0));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final AbstractC2382c0 getCurrentTimeline() {
        m7021D();
        return this.f12334u0.f35313a;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final C5736s getCurrentTrackGroups() {
        m7021D();
        return this.f12334u0.f35320h;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final C9506o getCurrentTrackSelections() {
        m7021D();
        return new C9506o(this.f12334u0.f35321i.f49013c);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final C2384d0 getCurrentTracks() {
        m7021D();
        return this.f12334u0.f35321i.f49014d;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public final ExoPlayer.InterfaceC2349d getDeviceComponent() {
        m7021D();
        return this;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final C2412i getDeviceInfo() {
        m7021D();
        return this.f12328r0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final int getDeviceVolume() {
        m7021D();
        return this.f12269B.f11831g;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final long getDuration() {
        m7021D();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        C5920j0 c5920j0 = this.f12334u0;
        InterfaceC2492i.b bVar = c5920j0.f35314b;
        AbstractC2382c0 abstractC2382c0 = c5920j0.f35313a;
        Object obj = bVar.f34757a;
        AbstractC2382c0.b bVar2 = this.f12319n;
        abstractC2382c0.mo6778g(obj, bVar2);
        return C10134c0.m19033R(bVar2.m6911a(bVar.f34758b, bVar.f34759c));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final long getMaxSeekToPreviousPosition() {
        m7021D();
        return 3000L;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final C2467q getMediaMetadata() {
        m7021D();
        return this.f12284Q;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final boolean getPauseAtEndOfMediaItems() {
        m7021D();
        return this.f12282O;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final boolean getPlayWhenReady() {
        m7021D();
        return this.f12334u0.f35324l;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final Looper getPlaybackLooper() {
        return this.f12313k.f12387j;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final C2505u getPlaybackParameters() {
        m7021D();
        return this.f12334u0.f35326n;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final int getPlaybackState() {
        m7021D();
        return this.f12334u0.f35317e;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final int getPlaybackSuppressionReason() {
        m7021D();
        return this.f12334u0.f35325m;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final ExoPlaybackException getPlayerError() {
        m7021D();
        return this.f12334u0.f35318f;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final C2467q getPlaylistMetadata() {
        m7021D();
        return this.f12285R;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final InterfaceC2536y getRenderer(int i10) {
        m7021D();
        return this.f12305g[i10];
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final int getRendererCount() {
        m7021D();
        return this.f12305g.length;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final int getRendererType(int i10) {
        m7021D();
        return this.f12305g[i10].mo7008y();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final int getRepeatMode() {
        m7021D();
        return this.f12273F;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final long getSeekBackIncrement() {
        m7021D();
        return this.f12333u;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final long getSeekForwardIncrement() {
        m7021D();
        return this.f12335v;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final C5930o0 getSeekParameters() {
        m7021D();
        return this.f12280M;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final boolean getShuffleModeEnabled() {
        m7021D();
        return this.f12274G;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final boolean getSkipSilenceEnabled() {
        m7021D();
        return this.f12312j0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final C10153v getSurfaceSize() {
        m7021D();
        return this.f12300d0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public final ExoPlayer.InterfaceC2350e getTextComponent() {
        m7021D();
        return this;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final long getTotalBufferedDuration() {
        m7021D();
        return C10134c0.m19033R(this.f12334u0.f35329q);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final C9508q getTrackSelectionParameters() {
        m7021D();
        return this.f12307h.mo17940a();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final AbstractC9510s getTrackSelector() {
        m7021D();
        return this.f12307h;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final int getVideoChangeFrameRateStrategy() {
        m7021D();
        return this.f12298c0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public final ExoPlayer.InterfaceC2351f getVideoComponent() {
        m7021D();
        return this;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final C6635e getVideoDecoderCounters() {
        m7021D();
        return this.f12302e0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final C2416m getVideoFormat() {
        m7021D();
        return this.f12286S;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final int getVideoScalingMode() {
        m7021D();
        return this.f12296b0;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final C10332n getVideoSize() {
        m7021D();
        return this.f12330s0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final float getVolume() {
        m7021D();
        return this.f12310i0;
    }

    /* JADX INFO: renamed from: h */
    public final ArrayList m7024h(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f12325q.mo7269a((C2466p) list.get(i10)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final C2534w m7025i(C2534w.b bVar) {
        int iM7027k = m7027k();
        AbstractC2382c0 abstractC2382c0 = this.f12334u0.f35313a;
        if (iM7027k == -1) {
            iM7027k = 0;
        }
        C10155x c10155x = this.f12337w;
        C2415l c2415l = this.f12313k;
        return new C2534w(c2415l, bVar, abstractC2382c0, iM7027k, c10155x, c2415l.f12387j);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void increaseDeviceVolume() {
        m7021D();
        C2353a0 c2353a0 = this.f12269B;
        int i10 = c2353a0.f11831g;
        int i11 = c2353a0.f11830f;
        AudioManager audioManager = c2353a0.f11828d;
        if (i10 >= audioManager.getStreamMaxVolume(i11)) {
            return;
        }
        audioManager.adjustStreamVolume(c2353a0.f11830f, 1, 1);
        c2353a0.m6786d();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final boolean isDeviceMuted() {
        m7021D();
        return this.f12269B.f11832h;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final boolean isLoading() {
        m7021D();
        return this.f12334u0.f35319g;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final boolean isPlayingAd() {
        m7021D();
        return this.f12334u0.f35314b.m12079a();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final boolean isTunnelingEnabled() {
        m7021D();
        for (C5926m0 c5926m0 : this.f12334u0.f35321i.f49012b) {
            if (c5926m0 != null && c5926m0.f35346a) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final long m7026j(C5920j0 c5920j0) {
        if (c5920j0.f35313a.m6910p()) {
            return C10134c0.m19026K(this.f12338w0);
        }
        if (c5920j0.f35314b.m12079a()) {
            return c5920j0.f35330r;
        }
        AbstractC2382c0 abstractC2382c0 = c5920j0.f35313a;
        InterfaceC2492i.b bVar = c5920j0.f35314b;
        long j10 = c5920j0.f35330r;
        Object obj = bVar.f34757a;
        AbstractC2382c0.b bVar2 = this.f12319n;
        abstractC2382c0.mo6778g(obj, bVar2);
        return j10 + bVar2.f12067e;
    }

    /* JADX INFO: renamed from: k */
    public final int m7027k() {
        if (this.f12334u0.f35313a.m6910p()) {
            return this.f12336v0;
        }
        C5920j0 c5920j0 = this.f12334u0;
        return c5920j0.f35313a.mo6778g(c5920j0.f35314b.f34757a, this.f12319n).f12065c;
    }

    /* JADX INFO: renamed from: l */
    public final Pair m7028l(AbstractC2382c0 abstractC2382c0, C5922k0 c5922k0) {
        long contentPosition = getContentPosition();
        if (abstractC2382c0.m6910p() || c5922k0.m6910p()) {
            boolean z10 = !abstractC2382c0.m6910p() && c5922k0.m6910p();
            int iM7027k = z10 ? -1 : m7027k();
            if (z10) {
                contentPosition = -9223372036854775807L;
            }
            return m7031q(c5922k0, iM7027k, contentPosition);
        }
        Pair<Object, Long> pairM6906i = abstractC2382c0.m6906i(this.f12103a, this.f12319n, getCurrentMediaItemIndex(), C10134c0.m19026K(contentPosition));
        Object obj = pairM6906i.first;
        if (c5922k0.mo6774b(obj) != -1) {
            return pairM6906i;
        }
        Object objM7065G = C2415l.m7065G(this.f12103a, this.f12319n, this.f12273F, this.f12274G, obj, abstractC2382c0, c5922k0);
        if (objM7065G == null) {
            return m7031q(c5922k0, -1, -9223372036854775807L);
        }
        AbstractC2382c0.b bVar = this.f12319n;
        c5922k0.mo6778g(objM7065G, bVar);
        int i10 = bVar.f12065c;
        return m7031q(c5922k0, i10, C10134c0.m19033R(c5922k0.m6908m(i10, this.f12103a).f12086H));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void moveMediaItems(int i10, int i11, int i12) {
        m7021D();
        C10129a.m18990b(i10 >= 0 && i10 <= i11 && i12 >= 0);
        ArrayList arrayList = this.f12321o;
        int size = arrayList.size();
        int iMin = Math.min(i11, size);
        int iMin2 = Math.min(i12, size - (iMin - i10));
        if (i10 >= size || i10 == iMin || i10 == iMin2) {
            return;
        }
        AbstractC2382c0 currentTimeline = getCurrentTimeline();
        this.f12275H++;
        C10134c0.m19025J(arrayList, i10, iMin, iMin2);
        C5922k0 c5922k0 = new C5922k0(arrayList, this.f12281N);
        C5920j0 c5920j0M7030p = m7030p(this.f12334u0, c5922k0, m7028l(currentTimeline, c5922k0));
        InterfaceC5732o interfaceC5732o = this.f12281N;
        C2415l c2415l = this.f12313k;
        c2415l.getClass();
        c2415l.f12383h.mo19085k(19, new C2415l.b(i10, iMin, iMin2, interfaceC5732o)).m19164a();
        m7019B(c5920j0M7030p, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: n */
    public final int m7029n(int i10) {
        AudioTrack audioTrack = this.f12288U;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.f12288U.release();
            this.f12288U = null;
        }
        if (this.f12288U == null) {
            this.f12288U = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.f12288U.getAudioSessionId();
    }

    /* JADX INFO: renamed from: p */
    public final C5920j0 m7030p(C5920j0 c5920j0, AbstractC2382c0 abstractC2382c0, Pair<Object, Long> pair) {
        C10129a.m18990b(abstractC2382c0.m6910p() || pair != null);
        AbstractC2382c0 abstractC2382c1 = c5920j0.f35313a;
        C5920j0 c5920j0M12342g = c5920j0.m12342g(abstractC2382c0);
        if (abstractC2382c0.m6910p()) {
            InterfaceC2492i.b bVar = C5920j0.f35312s;
            long jM19026K = C10134c0.m19026K(this.f12338w0);
            C5920j0 c5920j0M12336a = c5920j0M12342g.m12337b(bVar, jM19026K, jM19026K, jM19026K, 0L, C5736s.f34805d, this.f12295b, ImmutableList.m9062Y()).m12336a(bVar);
            c5920j0M12336a.f35328p = c5920j0M12336a.f35330r;
            return c5920j0M12336a;
        }
        Object obj = c5920j0M12342g.f35314b.f34757a;
        boolean z10 = !obj.equals(pair.first);
        InterfaceC2492i.b bVar2 = z10 ? new InterfaceC2492i.b(pair.first) : c5920j0M12342g.f35314b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM19026K2 = C10134c0.m19026K(getContentPosition());
        if (!abstractC2382c1.m6910p()) {
            jM19026K2 -= abstractC2382c1.mo6778g(obj, this.f12319n).f12067e;
        }
        if (z10 || jLongValue < jM19026K2) {
            C10129a.m18992d(!bVar2.m12079a());
            C5920j0 c5920j0M12336a2 = c5920j0M12342g.m12337b(r0, jLongValue, jLongValue, jLongValue, 0L, z10 ? C5736s.f34805d : c5920j0M12342g.f35320h, z10 ? this.f12295b : c5920j0M12342g.f35321i, z10 ? ImmutableList.m9062Y() : c5920j0M12342g.f35322j).m12336a(bVar2);
            c5920j0M12336a2.f35328p = jLongValue;
            return c5920j0M12336a2;
        }
        if (jLongValue == jM19026K2) {
            int iMo6774b = abstractC2382c0.mo6774b(c5920j0M12342g.f35323k.f34757a);
            if (iMo6774b == -1 || abstractC2382c0.mo6777f(iMo6774b, this.f12319n, false).f12065c != abstractC2382c0.mo6778g(bVar2.f34757a, this.f12319n).f12065c) {
                abstractC2382c0.mo6778g(bVar2.f34757a, this.f12319n);
                long jM6911a = bVar2.m12079a() ? this.f12319n.m6911a(bVar2.f34758b, bVar2.f34759c) : this.f12319n.f12066d;
                c5920j0M12342g = c5920j0M12342g.m12337b(bVar2, c5920j0M12342g.f35330r, c5920j0M12342g.f35330r, c5920j0M12342g.f35316d, jM6911a - c5920j0M12342g.f35330r, c5920j0M12342g.f35320h, c5920j0M12342g.f35321i, c5920j0M12342g.f35322j).m12336a(bVar2);
                c5920j0M12342g.f35328p = jM6911a;
            }
        } else {
            C10129a.m18992d(!bVar2.m12079a());
            long jMax = Math.max(0L, c5920j0M12342g.f35329q - (jLongValue - jM19026K2));
            long j10 = c5920j0M12342g.f35328p;
            if (c5920j0M12342g.f35323k.equals(c5920j0M12342g.f35314b)) {
                j10 = jLongValue + jMax;
            }
            c5920j0M12342g = c5920j0M12342g.m12337b(bVar2, jLongValue, jLongValue, jLongValue, jMax, c5920j0M12342g.f35320h, c5920j0M12342g.f35321i, c5920j0M12342g.f35322j);
            c5920j0M12342g.f35328p = j10;
        }
        return c5920j0M12342g;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void prepare() {
        m7021D();
        boolean playWhenReady = getPlayWhenReady();
        int iM6903e = this.f12268A.m6903e(2, playWhenReady);
        m7018A(iM6903e, (!playWhenReady || iM6903e == 1) ? 1 : 2, playWhenReady);
        C5920j0 c5920j0 = this.f12334u0;
        if (c5920j0.f35317e != 1) {
            return;
        }
        C5920j0 c5920j0M12339d = c5920j0.m12339d(null);
        C5920j0 c5920j0M12341f = c5920j0M12339d.m12341f(c5920j0M12339d.f35313a.m6910p() ? 4 : 2);
        this.f12275H++;
        this.f12313k.f12383h.mo19080f(0).m19164a();
        m7019B(c5920j0M12341f, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public final void prepare(InterfaceC2492i interfaceC2492i) {
        m7021D();
        setMediaSource(interfaceC2492i);
        prepare();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public final void prepare(InterfaceC2492i interfaceC2492i, boolean z10, boolean z11) {
        m7021D();
        setMediaSource(interfaceC2492i, z10);
        prepare();
    }

    /* JADX INFO: renamed from: q */
    public final Pair<Object, Long> m7031q(AbstractC2382c0 abstractC2382c0, int i10, long j10) {
        if (abstractC2382c0.m6910p()) {
            this.f12336v0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f12338w0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= abstractC2382c0.mo6909o()) {
            i10 = abstractC2382c0.mo6773a(this.f12274G);
            j10 = C10134c0.m19033R(abstractC2382c0.m6908m(i10, this.f12103a).f12086H);
        }
        return abstractC2382c0.m6906i(this.f12103a, this.f12319n, i10, C10134c0.m19026K(j10));
    }

    /* JADX INFO: renamed from: r */
    public final void m7032r(final int i10, final int i11) {
        C10153v c10153v = this.f12300d0;
        if (i10 != c10153v.f51446a || i11 != c10153v.f51447b) {
            this.f12300d0 = new C10153v(i10, i11);
            this.f12315l.m19091e(24, new C10144m.a() { // from class: h9.j
                @Override // p479xa.C10144m.a
                /* JADX INFO: renamed from: n */
                public final void mo780n(Object obj) {
                    ((InterfaceC2532v.c) obj).mo7505m0(i10, i11);
                }
            });
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void release() {
        String str;
        boolean z10;
        AudioTrack audioTrack;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [ExoPlayerLib/2.18.5] [");
        sb2.append(C10134c0.f51358e);
        sb2.append("] [");
        HashSet<String> hashSet = C5941x.f35374a;
        synchronized (C5941x.class) {
            str = C5941x.f35375b;
        }
        sb2.append(str);
        sb2.append("]");
        C10145n.m19098f("ExoPlayerImpl", sb2.toString());
        m7021D();
        if (C10134c0.f51354a < 21 && (audioTrack = this.f12288U) != null) {
            audioTrack.release();
            this.f12288U = null;
        }
        this.f12341z.m6898a(false);
        C2353a0 c2353a0 = this.f12269B;
        C2353a0.b bVar = c2353a0.f11829e;
        if (bVar != null) {
            try {
                c2353a0.f11825a.unregisterReceiver(bVar);
            } catch (RuntimeException e10) {
                C10145n.m19100h("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            c2353a0.f11829e = null;
        }
        C5932p0 c5932p0 = this.f12270C;
        c5932p0.f35356d = false;
        PowerManager.WakeLock wakeLock = c5932p0.f35354b;
        if (wakeLock != null) {
            boolean z11 = c5932p0.f35355c;
            wakeLock.release();
        }
        C5934q0 c5934q0 = this.f12271D;
        c5934q0.f35361d = false;
        WifiManager.WifiLock wifiLock = c5934q0.f35359b;
        if (wifiLock != null) {
            boolean z12 = c5934q0.f35360c;
            wifiLock.release();
        }
        C2381c c2381c = this.f12268A;
        c2381c.f12049c = null;
        c2381c.m6899a();
        C2415l c2415l = this.f12313k;
        synchronized (c2415l) {
            try {
                int i10 = 1;
                if (c2415l.f12363U || !c2415l.f12387j.getThread().isAlive()) {
                    z10 = true;
                } else {
                    c2415l.f12383h.mo19083i(7);
                    c2415l.m7102f0(new C5913g(i10, c2415l), c2415l.f12359Q);
                    z10 = c2415l.f12363U;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            this.f12315l.m19091e(10, new C9362e(10));
        }
        this.f12315l.m19089c();
        this.f12309i.mo19081g();
        this.f12331t.mo18372e(this.f12327r);
        C5920j0 c5920j0M12341f = this.f12334u0.m12341f(1);
        this.f12334u0 = c5920j0M12341f;
        C5920j0 c5920j0M12336a = c5920j0M12341f.m12336a(c5920j0M12341f.f35314b);
        this.f12334u0 = c5920j0M12336a;
        c5920j0M12336a.f35328p = c5920j0M12336a.f35330r;
        this.f12334u0.f35329q = 0L;
        this.f12327r.release();
        this.f12307h.mo17941c();
        m7034t();
        Surface surface = this.f12290W;
        if (surface != null) {
            surface.release();
            this.f12290W = null;
        }
        if (this.f12324p0) {
            throw null;
        }
        this.f12314k0 = C6642c.f37688b;
        this.f12326q0 = true;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void removeAnalyticsListener(InterfaceC6208b interfaceC6208b) {
        m7021D();
        interfaceC6208b.getClass();
        this.f12327r.mo12752e0(interfaceC6208b);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void removeAudioOffloadListener(ExoPlayer.InterfaceC2347b interfaceC2347b) {
        m7021D();
        this.f12317m.remove(interfaceC2347b);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void removeListener(InterfaceC2532v.c cVar) {
        m7021D();
        cVar.getClass();
        this.f12315l.m19090d(cVar);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void removeMediaItems(int i10, int i11) {
        m7021D();
        C10129a.m18990b(i10 >= 0 && i11 >= i10);
        int size = this.f12321o.size();
        int iMin = Math.min(i11, size);
        if (i10 >= size || i10 == iMin) {
            return;
        }
        C5920j0 c5920j0M7033s = m7033s(i10, iMin);
        m7019B(c5920j0M7033s, 0, 1, false, !c5920j0M7033s.f35314b.f34757a.equals(this.f12334u0.f35314b.f34757a), 4, m7026j(c5920j0M7033s), -1, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public final void retry() {
        m7021D();
        prepare();
    }

    /* JADX INFO: renamed from: s */
    public final C5920j0 m7033s(int i10, int i11) {
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        AbstractC2382c0 currentTimeline = getCurrentTimeline();
        ArrayList arrayList = this.f12321o;
        int size = arrayList.size();
        this.f12275H++;
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            arrayList.remove(i12);
        }
        this.f12281N = this.f12281N.mo12081b(i10, i11);
        C5922k0 c5922k0 = new C5922k0(arrayList, this.f12281N);
        C5920j0 c5920j0M7030p = m7030p(this.f12334u0, c5922k0, m7028l(currentTimeline, c5922k0));
        int i13 = c5920j0M7030p.f35317e;
        if (i13 != 1 && i13 != 4 && i10 < i11 && i11 == size && currentMediaItemIndex >= c5920j0M7030p.f35313a.mo6909o()) {
            c5920j0M7030p = c5920j0M7030p.m12341f(4);
        }
        this.f12313k.f12383h.mo19078d(this.f12281N, 20, i10, i11).m19164a();
        return c5920j0M7030p;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setAudioAttributes(C2367a c2367a, boolean z10) {
        m7021D();
        if (this.f12326q0) {
            return;
        }
        boolean zM19034a = C10134c0.m19034a(this.f12308h0, c2367a);
        int i10 = 1;
        C10144m<InterfaceC2532v.c> c10144m = this.f12315l;
        if (!zM19034a) {
            this.f12308h0 = c2367a;
            m7035u(1, 3, c2367a);
            this.f12269B.m6785c(C10134c0.m19057x(c2367a.f11940c));
            c10144m.m19088b(20, new C9369l(9, c2367a));
        }
        C2367a c2367a2 = z10 ? c2367a : null;
        C2381c c2381c = this.f12268A;
        c2381c.m6901c(c2367a2);
        this.f12307h.mo17942e(c2367a);
        boolean playWhenReady = getPlayWhenReady();
        int iM6903e = c2381c.m6903e(getPlaybackState(), playWhenReady);
        if (playWhenReady && iM6903e != 1) {
            i10 = 2;
        }
        m7018A(iM6903e, i10, playWhenReady);
        c10144m.m19087a();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setAudioSessionId(int i10) {
        m7021D();
        if (this.f12306g0 == i10) {
            return;
        }
        if (i10 == 0) {
            if (C10134c0.f51354a < 21) {
                i10 = m7029n(0);
            } else {
                AudioManager audioManager = (AudioManager) this.f12301e.getSystemService("audio");
                i10 = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            }
        } else if (C10134c0.f51354a < 21) {
            m7029n(i10);
        }
        this.f12306g0 = i10;
        m7035u(1, 10, Integer.valueOf(i10));
        m7035u(2, 10, Integer.valueOf(i10));
        this.f12315l.m19091e(21, new C5931p(i10));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setAuxEffectInfo(C6434k c6434k) {
        m7021D();
        m7035u(1, 6, c6434k);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setCameraMotionListener(InterfaceC10465a interfaceC10465a) {
        m7021D();
        this.f12318m0 = interfaceC10465a;
        C2534w c2534wM7025i = m7025i(this.f12340y);
        c2534wM7025i.m7519e(8);
        c2534wM7025i.m7518d(interfaceC10465a);
        c2534wM7025i.m7517c();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setDeviceMuted(boolean z10) {
        m7021D();
        C2353a0 c2353a0 = this.f12269B;
        c2353a0.getClass();
        int i10 = C10134c0.f51354a;
        AudioManager audioManager = c2353a0.f11828d;
        if (i10 >= 23) {
            audioManager.adjustStreamVolume(c2353a0.f11830f, z10 ? -100 : 100, 1);
        } else {
            audioManager.setStreamMute(c2353a0.f11830f, z10);
        }
        c2353a0.m6786d();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setDeviceVolume(int i10) {
        m7021D();
        C2353a0 c2353a0 = this.f12269B;
        if (i10 >= c2353a0.m6784a()) {
            int i11 = c2353a0.f11830f;
            AudioManager audioManager = c2353a0.f11828d;
            if (i10 > audioManager.getStreamMaxVolume(i11)) {
                return;
            }
            audioManager.setStreamVolume(c2353a0.f11830f, i10, 1);
            c2353a0.m6786d();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setForegroundMode(boolean z10) {
        boolean z11;
        m7021D();
        if (this.f12279L != z10) {
            this.f12279L = z10;
            C2415l c2415l = this.f12313k;
            synchronized (c2415l) {
                z11 = true;
                if (!c2415l.f12363U && c2415l.f12387j.getThread().isAlive()) {
                    if (z10) {
                        c2415l.f12383h.mo19076b(13, 1, 0).m19164a();
                    } else {
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        c2415l.f12383h.mo19078d(atomicBoolean, 13, 0, 0).m19164a();
                        c2415l.m7102f0(new C5909e(1, atomicBoolean), c2415l.f12390k0);
                        z11 = atomicBoolean.get();
                    }
                }
            }
            if (!z11) {
                m7039y(false, new ExoPlaybackException(2, new ExoTimeoutException(2), 1003));
            }
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setHandleAudioBecomingNoisy(boolean z10) {
        m7021D();
        if (this.f12326q0) {
            return;
        }
        this.f12341z.m6898a(z10);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setHandleWakeLock(boolean z10) {
        m7021D();
        setWakeMode(z10 ? 1 : 0);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaItems(List<C2466p> list, int i10, long j10) {
        m7021D();
        setMediaSources(m7024h(list), i10, j10);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaItems(List<C2466p> list, boolean z10) {
        m7021D();
        setMediaSources(m7024h(list), z10);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaSource(InterfaceC2492i interfaceC2492i) {
        m7021D();
        setMediaSources(Collections.singletonList(interfaceC2492i));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaSource(InterfaceC2492i interfaceC2492i, long j10) {
        m7021D();
        setMediaSources(Collections.singletonList(interfaceC2492i), 0, j10);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaSource(InterfaceC2492i interfaceC2492i, boolean z10) {
        m7021D();
        setMediaSources(Collections.singletonList(interfaceC2492i), z10);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaSources(List<InterfaceC2492i> list) {
        m7021D();
        setMediaSources(list, true);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaSources(List<InterfaceC2492i> list, int i10, long j10) {
        m7021D();
        m7036v(list, i10, j10, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaSources(List<InterfaceC2492i> list, boolean z10) {
        m7021D();
        m7036v(list, -1, -9223372036854775807L, z10);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setPauseAtEndOfMediaItems(boolean z10) {
        m7021D();
        if (this.f12282O == z10) {
            return;
        }
        this.f12282O = z10;
        this.f12313k.f12383h.mo19076b(23, z10 ? 1 : 0, 0).m19164a();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setPlayWhenReady(boolean z10) {
        m7021D();
        int iM6903e = this.f12268A.m6903e(getPlaybackState(), z10);
        int i10 = 1;
        if (z10 && iM6903e != 1) {
            i10 = 2;
        }
        m7018A(iM6903e, i10, z10);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void setPlaybackParameters(C2505u c2505u) {
        m7021D();
        if (c2505u == null) {
            c2505u = C2505u.f13473d;
        }
        if (this.f12334u0.f35326n.equals(c2505u)) {
            return;
        }
        C5920j0 c5920j0M12340e = this.f12334u0.m12340e(c2505u);
        this.f12275H++;
        this.f12313k.f12383h.mo19085k(4, c2505u).m19164a();
        m7019B(c5920j0M12340e, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setPlaylistMetadata(C2467q c2467q) {
        m7021D();
        c2467q.getClass();
        if (c2467q.equals(this.f12285R)) {
            return;
        }
        this.f12285R = c2467q;
        this.f12315l.m19091e(15, new C5927n(this));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo) {
        m7021D();
        m7035u(1, 12, audioDeviceInfo);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
        m7021D();
        if (C10134c0.m19034a(null, priorityTaskManager)) {
            return;
        }
        if (this.f12324p0) {
            throw null;
        }
        if (priorityTaskManager == null || !isLoading()) {
            this.f12324p0 = false;
        } else {
            priorityTaskManager.getClass();
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void setRepeatMode(int i10) {
        m7021D();
        if (this.f12273F != i10) {
            this.f12273F = i10;
            this.f12313k.f12383h.mo19076b(11, i10, 0).m19164a();
            C5787k c5787k = new C5787k(i10);
            C10144m<InterfaceC2532v.c> c10144m = this.f12315l;
            c10144m.m19088b(8, c5787k);
            m7040z();
            c10144m.m19087a();
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setSeekParameters(C5930o0 c5930o0) {
        m7021D();
        if (c5930o0 == null) {
            c5930o0 = C5930o0.f35349c;
        }
        if (!this.f12280M.equals(c5930o0)) {
            this.f12280M = c5930o0;
            this.f12313k.f12383h.mo19085k(5, c5930o0).m19164a();
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void setShuffleModeEnabled(boolean z10) {
        m7021D();
        if (this.f12274G != z10) {
            this.f12274G = z10;
            this.f12313k.f12383h.mo19076b(12, z10 ? 1 : 0, 0).m19164a();
            C5925m c5925m = new C5925m(0, z10);
            C10144m<InterfaceC2532v.c> c10144m = this.f12315l;
            c10144m.m19088b(9, c5925m);
            m7040z();
            c10144m.m19087a();
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setShuffleOrder(InterfaceC5732o interfaceC5732o) {
        m7021D();
        this.f12281N = interfaceC5732o;
        C5922k0 c5922k0 = new C5922k0(this.f12321o, this.f12281N);
        C5920j0 c5920j0M7030p = m7030p(this.f12334u0, c5922k0, m7031q(c5922k0, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.f12275H++;
        this.f12313k.f12383h.mo19085k(21, interfaceC5732o).m19164a();
        m7019B(c5920j0M7030p, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setSkipSilenceEnabled(final boolean z10) {
        m7021D();
        if (this.f12312j0 == z10) {
            return;
        }
        this.f12312j0 = z10;
        m7035u(1, 9, Boolean.valueOf(z10));
        this.f12315l.m19091e(23, new C10144m.a() { // from class: h9.o
            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj) {
                ((InterfaceC2532v.c) obj).mo7503k(z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void setTrackSelectionParameters(C9508q c9508q) {
        m7021D();
        AbstractC9510s abstractC9510s = this.f12307h;
        abstractC9510s.getClass();
        if (abstractC9510s instanceof C9496e) {
            if (c9508q.equals(abstractC9510s.mo17940a())) {
                return;
            }
            abstractC9510s.mo17943f(c9508q);
            this.f12315l.m19091e(19, new C9371n(5, c9508q));
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setVideoChangeFrameRateStrategy(int i10) {
        m7021D();
        if (this.f12298c0 == i10) {
            return;
        }
        this.f12298c0 = i10;
        m7035u(2, 5, Integer.valueOf(i10));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setVideoFrameMetadataListener(InterfaceC10327i interfaceC10327i) {
        m7021D();
        this.f12316l0 = interfaceC10327i;
        C2534w c2534wM7025i = m7025i(this.f12340y);
        c2534wM7025i.m7519e(7);
        c2534wM7025i.m7518d(interfaceC10327i);
        c2534wM7025i.m7517c();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setVideoScalingMode(int i10) {
        m7021D();
        this.f12296b0 = i10;
        m7035u(2, 4, Integer.valueOf(i10));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setVideoSurface(Surface surface) {
        m7021D();
        m7034t();
        m7038x(surface);
        int i10 = surface == null ? 0 : -1;
        m7032r(i10, i10);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        m7021D();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        m7034t();
        this.f12293Z = true;
        this.f12291X = surfaceHolder;
        surfaceHolder.addCallback(this.f12339x);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            m7038x(null);
            m7032r(0, 0);
        } else {
            m7038x(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            m7032r(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        m7021D();
        if (surfaceView instanceof InterfaceC10326h) {
            m7034t();
            m7038x(surfaceView);
            m7037w(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof C10474j)) {
                setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            m7034t();
            this.f12292Y = (C10474j) surfaceView;
            C2534w c2534wM7025i = m7025i(this.f12340y);
            c2534wM7025i.m7519e(10000);
            c2534wM7025i.m7518d(this.f12292Y);
            c2534wM7025i.m7517c();
            this.f12292Y.f52386a.add(this.f12339x);
            m7038x(this.f12292Y.getVideoSurface());
            m7037w(surfaceView.getHolder());
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void setVideoTextureView(TextureView textureView) {
        m7021D();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        m7034t();
        this.f12294a0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            C10145n.m19099g("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f12339x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m7038x(null);
            m7032r(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            m7038x(surface);
            this.f12290W = surface;
            m7032r(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setVolume(float f3) {
        m7021D();
        final float fM19040g = C10134c0.m19040g(f3, 0.0f, 1.0f);
        if (this.f12310i0 == fM19040g) {
            return;
        }
        this.f12310i0 = fM19040g;
        m7035u(1, 2, Float.valueOf(this.f12268A.f12053g * fM19040g));
        this.f12315l.m19091e(22, new C10144m.a() { // from class: h9.q
            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj) {
                ((InterfaceC2532v.c) obj).mo7487F(fM19040g);
            }
        });
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setWakeMode(int i10) {
        m7021D();
        C5934q0 c5934q0 = this.f12271D;
        C5932p0 c5932p0 = this.f12270C;
        if (i10 == 0) {
            c5932p0.m12346a(false);
            c5934q0.m12347a(false);
        } else if (i10 == 1) {
            c5932p0.m12346a(true);
            c5934q0.m12347a(false);
        } else {
            if (i10 != 2) {
                return;
            }
            c5932p0.m12346a(true);
            c5934q0.m12347a(true);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void stop() {
        m7021D();
        stop(false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void stop(boolean z10) {
        m7021D();
        this.f12268A.m6903e(1, getPlayWhenReady());
        m7039y(z10, null);
        this.f12314k0 = new C6642c(ImmutableList.m9062Y(), this.f12334u0.f35330r);
    }

    /* JADX INFO: renamed from: t */
    public final void m7034t() {
        C10474j c10474j = this.f12292Y;
        b bVar = this.f12339x;
        if (c10474j != null) {
            C2534w c2534wM7025i = m7025i(this.f12340y);
            c2534wM7025i.m7519e(10000);
            c2534wM7025i.m7518d(null);
            c2534wM7025i.m7517c();
            this.f12292Y.f52386a.remove(bVar);
            this.f12292Y = null;
        }
        TextureView textureView = this.f12294a0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != bVar) {
                C10145n.m19099g("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f12294a0.setSurfaceTextureListener(null);
            }
            this.f12294a0 = null;
        }
        SurfaceHolder surfaceHolder = this.f12291X;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(bVar);
            this.f12291X = null;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m7035u(int i10, int i11, Object obj) {
        for (InterfaceC2536y interfaceC2536y : this.f12305g) {
            if (interfaceC2536y.mo7008y() == i10) {
                C2534w c2534wM7025i = m7025i(interfaceC2536y);
                c2534wM7025i.m7519e(i11);
                c2534wM7025i.m7518d(obj);
                c2534wM7025i.m7517c();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX INFO: renamed from: v */
    public final void m7036v(List<InterfaceC2492i> list, int i10, long j10, boolean z10) {
        long j11;
        int i11;
        int i12;
        int iMo6773a = i10;
        int iM7027k = m7027k();
        long currentPosition = getCurrentPosition();
        this.f12275H++;
        ArrayList arrayList = this.f12321o;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i13 = size - 1; i13 >= 0; i13--) {
                arrayList.remove(i13);
            }
            this.f12281N = this.f12281N.mo12081b(0, size);
        }
        ArrayList arrayListM7022f = m7022f(0, list);
        C5922k0 c5922k0 = new C5922k0(arrayList, this.f12281N);
        boolean zM6910p = c5922k0.m6910p();
        int i14 = c5922k0.f35334f;
        if (!zM6910p && iMo6773a >= i14) {
            throw new IllegalSeekPositionException();
        }
        if (!z10) {
            if (iMo6773a == -1) {
                i11 = iM7027k;
                j11 = currentPosition;
            } else {
                j11 = j10;
            }
            C5920j0 c5920j0M7030p = m7030p(this.f12334u0, c5922k0, m7031q(c5922k0, i11, j11));
            i12 = c5920j0M7030p.f35317e;
            if (i11 != -1 && i12 != 1) {
                if (!c5922k0.m6910p() || i11 >= i14) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
            }
            C5920j0 c5920j0M12341f = c5920j0M7030p.m12341f(i12);
            long jM19026K = C10134c0.m19026K(j11);
            InterfaceC5732o interfaceC5732o = this.f12281N;
            C2415l c2415l = this.f12313k;
            c2415l.getClass();
            c2415l.f12383h.mo19085k(17, new C2415l.a(arrayListM7022f, interfaceC5732o, i11, jM19026K)).m19164a();
            m7019B(c5920j0M12341f, 0, 1, false, this.f12334u0.f35314b.f34757a.equals(c5920j0M12341f.f35314b.f34757a) && !this.f12334u0.f35313a.m6910p(), 4, m7026j(c5920j0M12341f), -1, false);
        }
        iMo6773a = c5922k0.mo6773a(this.f12274G);
        j11 = -9223372036854775807L;
        i11 = iMo6773a;
        C5920j0 c5920j0M7030p2 = m7030p(this.f12334u0, c5922k0, m7031q(c5922k0, i11, j11));
        i12 = c5920j0M7030p2.f35317e;
        if (i11 != -1) {
            if (c5922k0.m6910p()) {
                i12 = 4;
            } else {
                i12 = 4;
            }
        }
        C5920j0 c5920j0M12341f2 = c5920j0M7030p2.m12341f(i12);
        long jM19026K2 = C10134c0.m19026K(j11);
        InterfaceC5732o interfaceC5732o2 = this.f12281N;
        C2415l c2415l2 = this.f12313k;
        c2415l2.getClass();
        c2415l2.f12383h.mo19085k(17, new C2415l.a(arrayListM7022f, interfaceC5732o2, i11, jM19026K2)).m19164a();
        m7019B(c5920j0M12341f2, 0, 1, false, this.f12334u0.f35314b.f34757a.equals(c5920j0M12341f2.f35314b.f34757a) && !this.f12334u0.f35313a.m6910p(), 4, m7026j(c5920j0M12341f2), -1, false);
    }

    /* JADX INFO: renamed from: w */
    public final void m7037w(SurfaceHolder surfaceHolder) {
        this.f12293Z = false;
        this.f12291X = surfaceHolder;
        surfaceHolder.addCallback(this.f12339x);
        Surface surface = this.f12291X.getSurface();
        if (surface == null || !surface.isValid()) {
            m7032r(0, 0);
        } else {
            Rect surfaceFrame = this.f12291X.getSurfaceFrame();
            m7032r(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m7038x(Object obj) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        InterfaceC2536y[] interfaceC2536yArr = this.f12305g;
        int length = interfaceC2536yArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            InterfaceC2536y interfaceC2536y = interfaceC2536yArr[i10];
            if (interfaceC2536y.mo7008y() == 2) {
                C2534w c2534wM7025i = m7025i(interfaceC2536y);
                c2534wM7025i.m7519e(1);
                c2534wM7025i.m7518d(obj);
                c2534wM7025i.m7517c();
                arrayList.add(c2534wM7025i);
            }
            i10++;
        }
        Object obj2 = this.f12289V;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C2534w) it.next()).m7515a(this.f12272E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.f12289V;
            Surface surface = this.f12290W;
            if (obj3 == surface) {
                surface.release();
                this.f12290W = null;
            }
        }
        this.f12289V = obj;
        if (z10) {
            m7039y(false, new ExoPlaybackException(2, new ExoTimeoutException(3), 1003));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m7039y(boolean z10, ExoPlaybackException exoPlaybackException) {
        C5920j0 c5920j0M12336a;
        if (z10) {
            c5920j0M12336a = m7033s(0, this.f12321o.size()).m12339d(null);
        } else {
            C5920j0 c5920j0 = this.f12334u0;
            c5920j0M12336a = c5920j0.m12336a(c5920j0.f35314b);
            c5920j0M12336a.f35328p = c5920j0M12336a.f35330r;
            c5920j0M12336a.f35329q = 0L;
        }
        C5920j0 c5920j0M12341f = c5920j0M12336a.m12341f(1);
        if (exoPlaybackException != null) {
            c5920j0M12341f = c5920j0M12341f.m12339d(exoPlaybackException);
        }
        C5920j0 c5920j1 = c5920j0M12341f;
        this.f12275H++;
        this.f12313k.f12383h.mo19080f(6).m19164a();
        m7019B(c5920j1, 0, 1, false, c5920j1.f35313a.m6910p() && !this.f12334u0.f35313a.m6910p(), 4, m7026j(c5920j1), -1, false);
    }

    /* JADX INFO: renamed from: z */
    public final void m7040z() {
        InterfaceC2532v.a aVar = this.f12283P;
        int i10 = C10134c0.f51354a;
        InterfaceC2532v interfaceC2532v = this.f12303f;
        boolean zIsPlayingAd = interfaceC2532v.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = interfaceC2532v.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = interfaceC2532v.hasPreviousMediaItem();
        boolean zHasNextMediaItem = interfaceC2532v.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = interfaceC2532v.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = interfaceC2532v.isCurrentMediaItemDynamic();
        boolean zM6910p = interfaceC2532v.getCurrentTimeline().m6910p();
        InterfaceC2532v.a.C10602a c10602a = new InterfaceC2532v.a.C10602a();
        C10141j c10141j = this.f12297c.f13754a;
        C10141j.a aVar2 = c10602a.f13755a;
        aVar2.getClass();
        boolean z10 = false;
        for (int i11 = 0; i11 < c10141j.m19072b(); i11++) {
            aVar2.m19073a(c10141j.m19071a(i11));
        }
        boolean z11 = !zIsPlayingAd;
        c10602a.m7482a(4, z11);
        c10602a.m7482a(5, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        c10602a.m7482a(6, zHasPreviousMediaItem && !zIsPlayingAd);
        c10602a.m7482a(7, !zM6910p && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd);
        c10602a.m7482a(8, zHasNextMediaItem && !zIsPlayingAd);
        c10602a.m7482a(9, !zM6910p && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd);
        c10602a.m7482a(10, z11);
        c10602a.m7482a(11, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        if (zIsCurrentMediaItemSeekable && !zIsPlayingAd) {
            z10 = true;
        }
        int i12 = 12;
        c10602a.m7482a(12, z10);
        InterfaceC2532v.a aVar3 = new InterfaceC2532v.a(aVar2.m19074b());
        this.f12283P = aVar3;
        if (aVar3.equals(aVar)) {
            return;
        }
        this.f12315l.m19088b(13, new C9369l(i12, this));
    }
}
