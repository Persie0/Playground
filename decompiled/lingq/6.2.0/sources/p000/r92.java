package p000;

import android.view.Surface;
import androidx.media3.common.C0713b;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class r92 implements ksa {

    /* JADX INFO: renamed from: a */
    public final ypa f58930a;

    /* JADX INFO: renamed from: b */
    public final zpa f58931b;

    /* JADX INFO: renamed from: c */
    public final eqa f58932c;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f58933d;

    /* JADX INFO: renamed from: e */
    public Surface f58934e;

    /* JADX INFO: renamed from: f */
    public C0713b f58935f;

    /* JADX INFO: renamed from: g */
    public long f58936g;

    /* JADX INFO: renamed from: h */
    public jsa f58937h;

    /* JADX INFO: renamed from: i */
    public Executor f58938i;

    /* JADX INFO: renamed from: j */
    public wpa f58939j;

    public r92(ypa ypaVar, zpa zpaVar, mp9 mp9Var) {
        this.f58930a = ypaVar;
        this.f58931b = zpaVar;
        ypaVar.f70274l = mp9Var;
        this.f58932c = new eqa(new C3156jq((Object) this, false), ypaVar, zpaVar);
        this.f58933d = new ArrayDeque();
        this.f58935f = new C0713b(new lc3());
        this.f58936g = -9223372036854775807L;
        this.f58937h = jsa.f46083a;
        this.f58938i = new o92(0);
        this.f58939j = new p92();
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: a */
    public final void mo15664a() {
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: b */
    public final Surface mo15665b() {
        Surface surface = this.f58934e;
        surface.getClass();
        return surface;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: c */
    public final boolean mo15666c() {
        eqa eqaVar = this.f58932c;
        long j = eqaVar.f37735j;
        return j != -9223372036854775807L && eqaVar.f37734i == j;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: d */
    public final void mo15667d() {
        this.f58931b.m25737b();
        ypa ypaVar = this.f58930a;
        ypaVar.f70266d = false;
        ypaVar.f70271i = -9223372036854775807L;
        dqa dqaVar = ypaVar.f70264b;
        dqaVar.f36044d = false;
        aqa aqaVar = dqaVar.f36043c;
        if (aqaVar != null) {
            aqaVar.mo2994c();
        }
        dqaVar.m10589a();
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: e */
    public final void mo15668e(bu5 bu5Var, Executor executor) {
        this.f58937h = bu5Var;
        this.f58938i = executor;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: f */
    public final void mo15669f() {
        this.f58931b.m25737b();
        this.f58930a.m25265d();
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: g */
    public final void mo15670g(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: h */
    public final void mo15671h() {
        eqa eqaVar = this.f58932c;
        if (eqaVar.f37733h == -9223372036854775807L) {
            eqaVar.f37733h = Long.MIN_VALUE;
            eqaVar.f37734i = Long.MIN_VALUE;
        }
        eqaVar.f37735j = eqaVar.f37733h;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: i */
    public final void mo15672i(int i) {
        dqa dqaVar = this.f58930a.f70264b;
        if (dqaVar.f36050j == i) {
            return;
        }
        dqaVar.f36050j = i;
        dqaVar.m10592d(true);
    }

    @Override // p000.ksa
    public final boolean isInitialized() {
        return true;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: j */
    public final void mo15673j(float f) {
        this.f58930a.m25269h(f);
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: k */
    public final void mo15674k() {
        this.f58934e = null;
        this.f58930a.m25268g(null);
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: l */
    public final boolean mo15675l(long j, cu5 cu5Var) {
        this.f58933d.add(cu5Var);
        eqa eqaVar = this.f58932c;
        yh0 yh0Var = eqaVar.f37731f;
        int i = yh0Var.f69836c;
        long[] jArr = (long[]) yh0Var.f69838e;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                uk9.m22770c();
                return false;
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = yh0Var.f69834a;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy((long[]) yh0Var.f69838e, 0, jArr2, i3, i2);
            yh0Var.f69834a = 0;
            yh0Var.f69835b = yh0Var.f69836c - 1;
            yh0Var.f69838e = jArr2;
            yh0Var.f69837d = length - 1;
        }
        int i4 = (yh0Var.f69835b + 1) & yh0Var.f69837d;
        yh0Var.f69835b = i4;
        ((long[]) yh0Var.f69838e)[i4] = j;
        yh0Var.f69836c++;
        eqaVar.f37733h = j;
        eqaVar.f37735j = -9223372036854775807L;
        this.f58938i.execute(new RunnableC3781y2(this, 15));
        return true;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: m */
    public final void mo15676m(C0713b c0713b, long j, int i, List list) {
        bna.m3987z(list.isEmpty());
        int i2 = c0713b.f6413v;
        int i3 = c0713b.f6414w;
        C0713b c0713b2 = this.f58935f;
        int i4 = c0713b2.f6413v;
        eqa eqaVar = this.f58932c;
        if (i2 != i4 || i3 != c0713b2.f6414w) {
            gh1 gh1Var = eqaVar.f37729d;
            long j2 = eqaVar.f37733h;
            gh1Var.m12622a(new lsa(i2, i3), j2 == -9223372036854775807L ? 0L : j2 + 1);
        }
        float f = c0713b.f6417z;
        if (f != this.f58935f.f6417z) {
            this.f58930a.m25267f(f);
        }
        this.f58935f = c0713b;
        if (j != this.f58936g) {
            if (eqaVar.f37731f.f69836c == 0) {
                eqaVar.f37727b.m25266e(i);
                eqaVar.f37737l = j;
            } else {
                gh1 gh1Var2 = eqaVar.f37730e;
                long j3 = eqaVar.f37733h;
                gh1Var2.m12622a(Long.valueOf(j), j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1);
            }
            this.f58936g = j;
        }
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: n */
    public final void mo15677n(boolean z) {
        if (z) {
            ypa ypaVar = this.f58930a;
            ypaVar.f70264b.m10590b();
            ypaVar.f70270h = -9223372036854775807L;
            ypaVar.f70268f = -9223372036854775807L;
            ypaVar.f70267e = Math.min(ypaVar.f70267e, 1);
            ypaVar.f70271i = -9223372036854775807L;
            ypaVar.f70276n = false;
        }
        this.f58931b.m25737b();
        eqa eqaVar = this.f58932c;
        gh1 gh1Var = eqaVar.f37729d;
        yh0 yh0Var = eqaVar.f37731f;
        yh0Var.f69834a = 0;
        yh0Var.f69835b = -1;
        yh0Var.f69836c = 0;
        eqaVar.f37733h = -9223372036854775807L;
        eqaVar.f37734i = -9223372036854775807L;
        eqaVar.f37735j = -9223372036854775807L;
        gh1 gh1Var2 = eqaVar.f37730e;
        if (gh1Var2.m12641t() > 0) {
            bna.m3969q(gh1Var2.m12641t() > 0);
            while (gh1Var2.m12641t() > 1) {
                gh1Var2.m12636o();
            }
            Object objM12636o = gh1Var2.m12636o();
            objM12636o.getClass();
            eqaVar.f37737l = ((Long) objM12636o).longValue();
        }
        if (gh1Var.m12641t() > 0) {
            bna.m3969q(gh1Var.m12641t() > 0);
            while (gh1Var.m12641t() > 1) {
                gh1Var.m12636o();
            }
            Object objM12636o2 = gh1Var.m12636o();
            objM12636o2.getClass();
            gh1Var.m12622a((lsa) objM12636o2, 0L);
        }
        this.f58933d.clear();
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: o */
    public final void mo15678o(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: p */
    public final void mo15679p(long j, long j2) throws VideoSink$VideoSinkException {
        try {
            this.f58932c.m11321a(j, j2);
        } catch (ExoPlaybackException e) {
            throw new VideoSink$VideoSinkException(e, this.f58935f);
        }
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: q */
    public final void mo15680q(boolean z) {
        this.f58930a.m25264c(z);
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: r */
    public final boolean mo15681r(boolean z) {
        return this.f58930a.m25263b(z);
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: s */
    public final void mo15682s(wpa wpaVar) {
        this.f58939j = wpaVar;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: t */
    public final void mo15683t() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: u */
    public final void mo15684u(Surface surface, v89 v89Var) {
        this.f58934e = surface;
        this.f58930a.m25268g(surface);
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: v */
    public final boolean mo15685v(C0713b c0713b) {
        return true;
    }

    @Override // p000.ksa
    /* JADX INFO: renamed from: w */
    public final void mo15686w() {
        ypa ypaVar = this.f58930a;
        if (ypaVar.f70267e == 0) {
            ypaVar.f70267e = 1;
        }
    }
}
