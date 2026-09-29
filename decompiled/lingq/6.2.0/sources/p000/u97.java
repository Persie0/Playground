package p000;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.C0713b;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class u97 implements ksa {

    /* JADX INFO: renamed from: a */
    public ImmutableList f63613a;

    /* JADX INFO: renamed from: b */
    public C0713b f63614b;

    /* JADX INFO: renamed from: c */
    public long f63615c;

    /* JADX INFO: renamed from: d */
    public long f63616d;

    /* JADX INFO: renamed from: e */
    public int f63617e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ z97 f63618f;

    public u97(z97 z97Var, Context context) {
        this.f63618f = z97Var;
        uma.m22831z(context);
        this.f63613a = ImmutableList.m6289v();
        this.f63616d = -9223372036854775807L;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: a */
    public final void mo15664a() {
        z97 z97Var = this.f63618f;
        if (z97Var.f71240n == 2) {
            return;
        }
        qp9 qp9Var = z97Var.f71237k;
        if (qp9Var != null) {
            qp9Var.f58033a.removeCallbacksAndMessages(null);
        }
        z97Var.f71238l = null;
        z97Var.f71240n = 2;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: b */
    public final Surface mo15665b() {
        bna.m3987z(false);
        throw null;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: c */
    public final boolean mo15666c() {
        return false;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: d */
    public final void mo15667d() {
        z97 z97Var = this.f63618f;
        if (z97Var.f71230d) {
            z97Var.f71231e.mo15667d();
        }
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: e */
    public final void mo15668e(bu5 bu5Var, Executor executor) {
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: f */
    public final void mo15669f() {
        z97 z97Var = this.f63618f;
        if (z97Var.f71230d) {
            z97Var.f71231e.mo15669f();
        }
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: g */
    public final void mo15670g(long j) {
        this.f63615c = j;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: h */
    public final void mo15671h() {
        long j = this.f63616d;
        z97 z97Var = this.f63618f;
        if (z97Var.f71241o >= j) {
            z97Var.f71231e.mo15671h();
        }
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: i */
    public final void mo15672i(int i) {
        this.f63618f.f71231e.mo15672i(i);
    }

    @Override // p000.ksa
    public final boolean isInitialized() {
        return false;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: j */
    public final void mo15673j(float f) {
        z97 z97Var = this.f63618f;
        z97Var.f71235i.m25738c(f);
        z97Var.f71231e.mo15673j(f);
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: k */
    public final void mo15674k() {
        int i = v89.f65026c.f65027a;
        this.f63618f.f71238l = null;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: l */
    public final boolean mo15675l(long j, cu5 cu5Var) {
        int i;
        bna.m3987z(false);
        long j2 = j + this.f63615c;
        z97 z97Var = this.f63618f;
        zpa zpaVar = z97Var.f71235i;
        long j3 = zpaVar.f71941a;
        long j4 = j3 == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - j3) * zpaVar.f71943c) + zpaVar.f71942b);
        if (j4 != -9223372036854775807L) {
            long j5 = z97Var.f71234h;
            if (j5 != -9223372036854775807L && j4 < j5 && (i = this.f63617e) < 2) {
                this.f63617e = i + 1;
                fu5 fu5Var = cu5Var.f34546c;
                st5 st5Var = cu5Var.f34544a;
                int i2 = cu5Var.f34545b;
                g8d.m12416a("dropVideoBuffer");
                st5Var.mo10720h(i2);
                g8d.m12417b();
                fu5Var.m12174S0(0, 1);
                return true;
            }
        }
        int i3 = z97Var.f71242p;
        if (i3 == -1 || i3 != 0) {
            return false;
        }
        throw null;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: m */
    public final void mo15676m(C0713b c0713b, long j, int i, List list) {
        bna.m3987z(false);
        this.f63613a = ImmutableList.m6287r(list);
        this.f63614b = c0713b;
        lc3 lc3VarM2520a = c0713b.m2520a();
        ga1 ga1Var = c0713b.f6379E;
        if (ga1Var == null || !ga1Var.m12452d()) {
            ga1Var = ga1.f40443h;
        }
        lc3VarM2520a.f49428D = ga1Var;
        lc3VarM2520a.m16068a();
        throw null;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: n */
    public final void mo15677n(boolean z) {
        gh1 gh1Var;
        this.f63616d = -9223372036854775807L;
        z97 z97Var = this.f63618f;
        r92 r92Var = z97Var.f71231e;
        if (z97Var.f71240n == 1) {
            z97Var.f71239m++;
            r92Var.mo15677n(z);
            while (true) {
                int iM12641t = z97Var.f71236j.m12641t();
                gh1Var = z97Var.f71236j;
                if (iM12641t <= 1) {
                    break;
                } else {
                    gh1Var.m12636o();
                }
            }
            if (gh1Var.m12641t() == 1) {
                ((y97) z97Var.f71236j.m12636o()).getClass();
                throw null;
            }
            z97Var.f71241o = -9223372036854775807L;
            qp9 qp9Var = z97Var.f71237k;
            qp9Var.getClass();
            qp9Var.m20098c(new mt6(z97Var, 2));
        }
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: o */
    public final void mo15678o(List list) {
        if (this.f63613a.equals(list)) {
            return;
        }
        this.f63613a = ImmutableList.m6287r(list);
        C0713b c0713b = this.f63614b;
        if (c0713b == null) {
            return;
        }
        lc3 lc3VarM2520a = c0713b.m2520a();
        ga1 ga1Var = c0713b.f6379E;
        if (ga1Var == null || !ga1Var.m12452d()) {
            ga1Var = ga1.f40443h;
        }
        lc3VarM2520a.f49428D = ga1Var;
        lc3VarM2520a.m16068a();
        throw null;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: p */
    public final void mo15679p(long j, long j2) throws VideoSink$VideoSinkException {
        this.f63618f.f71231e.mo15679p(j + this.f63615c, j2);
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: q */
    public final void mo15680q(boolean z) {
        z97 z97Var = this.f63618f;
        if (z97Var.f71230d) {
            z97Var.f71231e.mo15680q(z);
        }
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: r */
    public final boolean mo15681r(boolean z) {
        return this.f63618f.f71231e.f58930a.m25263b(false);
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: s */
    public final void mo15682s(wpa wpaVar) {
        this.f63618f.f71231e.f58939j = wpaVar;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: t */
    public final void mo15683t() {
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: u */
    public final void mo15684u(Surface surface, v89 v89Var) {
        z97 z97Var = this.f63618f;
        Pair pair = z97Var.f71238l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((v89) z97Var.f71238l.second).equals(v89Var)) {
            return;
        }
        z97Var.f71238l = Pair.create(surface, v89Var);
        int i = v89Var.f65027a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x003f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0042 A[Catch: GlUtil$GlException -> 0x0036, TryCatch #1 {GlUtil$GlException -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003c, B:28:0x0042, B:30:0x0046, B:41:0x0060, B:42:0x0063, B:35:0x0051), top: B:53:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0046 A[Catch: GlUtil$GlException -> 0x0036, TryCatch #1 {GlUtil$GlException -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003c, B:28:0x0042, B:30:0x0046, B:41:0x0060, B:42:0x0063, B:35:0x0051), top: B:53:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x004d  */
    /* JADX WARN: Code duplicated, block: B:34:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0051 A[Catch: GlUtil$GlException -> 0x0036, TryCatch #1 {GlUtil$GlException -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003c, B:28:0x0042, B:30:0x0046, B:41:0x0060, B:42:0x0063, B:35:0x0051), top: B:53:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0059  */
    /* JADX WARN: Code duplicated, block: B:39:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0060 A[Catch: GlUtil$GlException -> 0x0036, TryCatch #1 {GlUtil$GlException -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003c, B:28:0x0042, B:30:0x0046, B:41:0x0060, B:42:0x0063, B:35:0x0051), top: B:53:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0063 A[Catch: GlUtil$GlException -> 0x0036, TRY_LEAVE, TryCatch #1 {GlUtil$GlException -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003c, B:28:0x0042, B:30:0x0046, B:41:0x0060, B:42:0x0063, B:35:0x0051), top: B:53:0x0026 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x0063, please report this as an issue */
    @Override // p000.ksa
    /* JADX INFO: renamed from: v */
    public final boolean mo15685v(C0713b c0713b) throws VideoSink$VideoSinkException {
        z97 z97Var = this.f63618f;
        boolean zM17955c = true;
        bna.m3987z(z97Var.f71240n == 0);
        ga1 ga1Var = c0713b.f6379E;
        if (ga1Var == null || !ga1Var.m12452d()) {
            ga1Var = ga1.f40443h;
        }
        int i = ga1Var.f40446c;
        if (i == 7) {
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 34) {
                    if (i == 6) {
                        if (Build.VERSION.SDK_INT >= 33 || !oed.m17955c("EGL_EXT_gl_colorspace_bt2020_pq")) {
                            zM17955c = false;
                        }
                    } else if (i == 7) {
                        zM17955c = oed.m17955c("EGL_EXT_gl_colorspace_bt2020_hlg");
                    }
                    if (!zM17955c) {
                        Locale locale = Locale.US;
                        ss5.m21707d0("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                        ga1 ga1Var2 = ga1.f40443h;
                    } else if (i != 2 || i == 10) {
                        ga1 ga1Var3 = ga1.f40443h;
                    }
                } else {
                    if (!(i2 >= 33 && oed.m17955c("EGL_EXT_gl_colorspace_bt2020_pq"))) {
                        if (i == 6) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                zM17955c = false;
                            } else {
                                zM17955c = false;
                            }
                        } else if (i == 7) {
                            zM17955c = oed.m17955c("EGL_EXT_gl_colorspace_bt2020_hlg");
                        }
                        if (!zM17955c) {
                            Locale locale2 = Locale.US;
                            ss5.m21707d0("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                            ga1 ga1Var4 = ga1.f40443h;
                        } else if (i != 2) {
                            ga1 ga1Var5 = ga1.f40443h;
                        } else {
                            ga1 ga1Var6 = ga1.f40443h;
                        }
                    }
                }
            } catch (GlUtil$GlException e) {
                throw new VideoSink$VideoSinkException(e, c0713b);
            }
        } else {
            if (i == 6) {
                if (Build.VERSION.SDK_INT >= 33) {
                    zM17955c = false;
                } else {
                    zM17955c = false;
                }
            } else if (i == 7) {
                zM17955c = oed.m17955c("EGL_EXT_gl_colorspace_bt2020_hlg");
            }
            if (!zM17955c) {
                Locale locale3 = Locale.US;
                ss5.m21707d0("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                ga1 ga1Var7 = ga1.f40443h;
            } else if (i != 2) {
                ga1 ga1Var8 = ga1.f40443h;
            } else {
                ga1 ga1Var9 = ga1.f40443h;
            }
        }
        mp9 mp9Var = z97Var.f71232f;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        z97Var.f71237k = mp9Var.m16990a(looperMyLooper, null);
        try {
            z97Var.f71228b.m24417a();
            throw null;
        } catch (VideoFrameProcessingException e2) {
            throw new VideoSink$VideoSinkException(e2, c0713b);
        }
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: w */
    public final void mo15686w() {
        z97 z97Var = this.f63618f;
        if (z97Var.f71236j.m12641t() == 0) {
            z97Var.f71231e.mo15686w();
            return;
        }
        gh1 gh1Var = new gh1(3);
        if (z97Var.f71236j.m12641t() <= 0) {
            z97Var.f71236j = gh1Var;
        } else {
            ((y97) z97Var.f71236j.m12636o()).getClass();
            throw null;
        }
    }
}
