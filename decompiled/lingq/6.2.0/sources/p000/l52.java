package p000;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l52 implements ba7, ov5, gm2 {

    /* JADX INFO: renamed from: a */
    public final mp9 f49064a;

    /* JADX INFO: renamed from: b */
    public final x0a f49065b;

    /* JADX INFO: renamed from: c */
    public final y0a f49066c;

    /* JADX INFO: renamed from: d */
    public final co7 f49067d;

    /* JADX INFO: renamed from: e */
    public final SparseArray f49068e;

    /* JADX INFO: renamed from: f */
    public vg5 f49069f;

    /* JADX INFO: renamed from: g */
    public da7 f49070g;

    /* JADX INFO: renamed from: h */
    public boolean f49071h;

    public l52(mp9 mp9Var) {
        mp9Var.getClass();
        this.f49064a = mp9Var;
        String str = uma.f64080a;
        Looper looperMyLooper = Looper.myLooper();
        this.f49069f = new vg5((looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper).getThread());
        x0a x0aVar = new x0a();
        this.f49065b = x0aVar;
        this.f49066c = new y0a();
        this.f49067d = new co7(x0aVar);
        this.f49068e = new SparseArray();
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: A */
    public final void mo3505A(PlaybackException playbackException) {
        jv5 jv5Var;
        C3496qf c3496qfM15803E = (!(playbackException instanceof ExoPlaybackException) || (jv5Var = ((ExoPlaybackException) playbackException).f6444h) == null) ? m15803E() : m15804F(jv5Var);
        m15808J(c3496qfM15803E, 10, new vg1(4, c3496qfM15803E, playbackException));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: B */
    public final void mo3506B(final int i, final int i2) {
        final C3496qf c3496qfM15807I = m15807I();
        m15808J(c3496qfM15807I, 24, new sg5() { // from class: e52
            @Override // p000.sg5
            public final void invoke(Object obj) {
                ((InterfaceC3534rf) obj).mo20628m(c3496qfM15807I, i, i2);
            }
        });
    }

    @Override // p000.ov5
    /* JADX INFO: renamed from: C */
    public final void mo11804C(int i, jv5 jv5Var, eh5 eh5Var, ru5 ru5Var, int i2) {
        C3496qf c3496qfM15806H = m15806H(i, jv5Var);
        m15808J(c3496qfM15806H, DescriptorProtos.Edition.EDITION_2023_VALUE, new hm2(c3496qfM15806H, eh5Var, ru5Var, i2));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: D */
    public final void mo3507D(boolean z) {
        C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, 7, new x42(c3496qfM15803E, z, 0));
    }

    /* JADX INFO: renamed from: E */
    public final C3496qf m15803E() {
        return m15804F((jv5) this.f49067d.f10362e);
    }

    /* JADX INFO: renamed from: F */
    public final C3496qf m15804F(jv5 jv5Var) {
        this.f49070g.getClass();
        z0a z0aVar = jv5Var == null ? null : (z0a) ((ImmutableMap) this.f49067d.f10361d).get(jv5Var);
        if (jv5Var != null && z0aVar != null) {
            return m15805G(z0aVar, z0aVar.mo23250g(jv5Var.f46226a, this.f49065b).f67601c, jv5Var);
        }
        int iM14712h = ((jw2) this.f49070g).m14712h();
        z0a z0aVarM14716l = ((jw2) this.f49070g).m14716l();
        if (iM14712h >= z0aVarM14716l.mo17288o()) {
            z0aVarM14716l = z0a.f70734a;
        }
        return m15805G(z0aVarM14716l, iM14712h, null);
    }

    /* JADX INFO: renamed from: G */
    public final C3496qf m15805G(z0a z0aVar, int i, jv5 jv5Var) {
        jv5 jv5Var2 = z0aVar.m25398p() ? null : jv5Var;
        this.f49064a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = z0aVar.equals(((jw2) this.f49070g).m14716l()) && i == ((jw2) this.f49070g).m14712h();
        long jM22805J = 0;
        if (jv5Var2 == null || !jv5Var2.m14690b()) {
            if (z) {
                jw2 jw2Var = (jw2) this.f49070g;
                jw2Var.m14705K();
                jM22805J = jw2Var.m14709e(jw2Var.f46281a0);
            } else if (!z0aVar.m25398p()) {
                jM22805J = uma.m22805J(z0aVar.mo39m(i, this.f49066c, 0L).f69073j);
            }
        } else if (z && ((jw2) this.f49070g).m14710f() == jv5Var2.f46227b && ((jw2) this.f49070g).m14711g() == jv5Var2.f46228c) {
            jM22805J = ((jw2) this.f49070g).m14714j();
        }
        long j = jM22805J;
        jv5 jv5Var3 = (jv5) this.f49067d.f10362e;
        z0a z0aVarM14716l = ((jw2) this.f49070g).m14716l();
        int iM14712h = ((jw2) this.f49070g).m14712h();
        long jM14714j = ((jw2) this.f49070g).m14714j();
        jw2 jw2Var2 = (jw2) this.f49070g;
        jw2Var2.m14705K();
        return new C3496qf(jElapsedRealtime, z0aVar, i, jv5Var2, j, z0aVarM14716l, iM14712h, jv5Var3, jM14714j, uma.m22805J(jw2Var2.f46281a0.f46910r));
    }

    /* JADX INFO: renamed from: H */
    public final C3496qf m15806H(int i, jv5 jv5Var) {
        this.f49070g.getClass();
        if (jv5Var != null) {
            return ((z0a) ((ImmutableMap) this.f49067d.f10361d).get(jv5Var)) != null ? m15804F(jv5Var) : m15805G(z0a.f70734a, i, jv5Var);
        }
        z0a z0aVarM14716l = ((jw2) this.f49070g).m14716l();
        if (i >= z0aVarM14716l.mo17288o()) {
            z0aVarM14716l = z0a.f70734a;
        }
        return m15805G(z0aVarM14716l, i, null);
    }

    /* JADX INFO: renamed from: I */
    public final C3496qf m15807I() {
        return m15804F((jv5) this.f49067d.f10364g);
    }

    /* JADX INFO: renamed from: J */
    public final void m15808J(C3496qf c3496qf, int i, sg5 sg5Var) {
        this.f49068e.put(i, c3496qf);
        this.f49069f.m23271d(i, sg5Var);
    }

    /* JADX INFO: renamed from: K */
    public final void m15809K(jw2 jw2Var, Looper looper) {
        bna.m3987z(this.f49070g == null || ((ImmutableList) this.f49067d.f10360c).isEmpty());
        jw2Var.getClass();
        this.f49070g = jw2Var;
        this.f49064a.m16990a(looper, null);
        vg5 vg5Var = this.f49069f;
        r41 r41Var = new r41(4, this, jw2Var);
        vg5Var.getClass();
        mp9 mp9Var = this.f49064a;
        bna.m3987z(mp9Var != null);
        this.f49069f = new vg5(vg5Var.f65348d, looper, looper.getThread(), mp9Var, r41Var, vg5Var.f65353i);
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: a */
    public final void mo3508a(lsa lsaVar) {
        C3496qf c3496qfM15807I = m15807I();
        m15808J(c3496qfM15807I, 25, new vg1(8, c3496qfM15807I, lsaVar));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: b */
    public final void mo3509b(int i) {
        C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, 6, new z42(c3496qfM15803E, i, 0));
    }

    @Override // p000.ov5
    /* JADX INFO: renamed from: c */
    public final void mo11807c(int i, jv5 jv5Var, ru5 ru5Var) {
        C3496qf c3496qfM15806H = m15806H(i, jv5Var);
        m15808J(c3496qfM15806H, 1004, new vg1(6, c3496qfM15806H, ru5Var));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: d */
    public final void mo3510d(boolean z) {
        C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, 3, new x42(c3496qfM15803E, z, 3));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: e */
    public final void mo3511e(final int i, final boolean z) {
        final C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, 5, new sg5() { // from class: a52
            @Override // p000.sg5
            public final void invoke(Object obj) {
                ((InterfaceC3534rf) obj).mo20612K(c3496qfM15803E, z, i);
            }
        });
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: f */
    public final void mo3512f(final float f) {
        final C3496qf c3496qfM15807I = m15807I();
        m15808J(c3496qfM15807I, 22, new sg5() { // from class: w42
            @Override // p000.sg5
            public final void invoke(Object obj) {
                ((InterfaceC3534rf) obj).mo20605D(c3496qfM15807I, f);
            }
        });
    }

    @Override // p000.ov5
    /* JADX INFO: renamed from: g */
    public final void mo11808g(int i, jv5 jv5Var, eh5 eh5Var, ru5 ru5Var) {
        C3496qf c3496qfM15806H = m15806H(i, jv5Var);
        m15808J(c3496qfM15806H, 1002, new hm2(c3496qfM15806H, eh5Var, ru5Var, 26, (byte) 0));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: h */
    public final void mo3513h(final int i) {
        final C3496qf c3496qfM15807I = m15807I();
        m15808J(c3496qfM15807I, 21, new sg5() { // from class: h52
            @Override // p000.sg5
            public final void invoke(Object obj) {
                ((InterfaceC3534rf) obj).mo20641z(c3496qfM15807I, i);
            }
        });
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: i */
    public final void mo3514i(int i) {
        C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, 4, new z42(c3496qfM15803E, i, 2));
    }

    @Override // p000.ov5
    /* JADX INFO: renamed from: j */
    public final void mo11809j(int i, jv5 jv5Var, eh5 eh5Var, ru5 ru5Var) {
        C3496qf c3496qfM15806H = m15806H(i, jv5Var);
        m15808J(c3496qfM15806H, 1001, new hm2(c3496qfM15806H, eh5Var, ru5Var, 27, (byte) 0));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: k */
    public final void mo3515k(boolean z) {
        C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, 9, new x42(c3496qfM15803E, z, 1));
    }

    @Override // p000.ov5
    /* JADX INFO: renamed from: l */
    public final void mo11810l(int i, jv5 jv5Var, eh5 eh5Var, ru5 ru5Var, IOException iOException, boolean z) {
        C3496qf c3496qfM15806H = m15806H(i, jv5Var);
        m15808J(c3496qfM15806H, 1003, new ah1(c3496qfM15806H, eh5Var, ru5Var, iOException, z));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: m */
    public final void mo3516m(es1 es1Var) {
        C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, 27, new hm2(c3496qfM15803E, es1Var, 22));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: n */
    public final void mo3517n(a9a a9aVar) {
        C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, 2, new vg1(5, c3496qfM15803E, a9aVar));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: o */
    public final void mo3518o(int i, ca7 ca7Var, ca7 ca7Var2) {
        if (i == 1) {
            this.f49071h = false;
        }
        da7 da7Var = this.f49070g;
        da7Var.getClass();
        co7 co7Var = this.f49067d;
        co7Var.f10362e = co7.m4922n(da7Var, (ImmutableList) co7Var.f10360c, (jv5) co7Var.f10363f, (x0a) co7Var.f10359b);
        C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, 11, new d52(i, c3496qfM15803E, ca7Var, ca7Var2));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: p */
    public final void mo3519p(int i) {
        da7 da7Var = this.f49070g;
        da7Var.getClass();
        co7 co7Var = this.f49067d;
        co7Var.f10362e = co7.m4922n(da7Var, (ImmutableList) co7Var.f10360c, (jv5) co7Var.f10363f, (x0a) co7Var.f10359b);
        co7Var.m4941w(((jw2) da7Var).m14716l());
        C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, 0, new z42(c3496qfM15803E, i, 4));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: q */
    public final void mo3520q(tu5 tu5Var) {
        C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, 14, new hm2(c3496qfM15803E, tu5Var, 25));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: r */
    public final void mo3521r() {
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: s */
    public final void mo3522s(boolean z) {
        C3496qf c3496qfM15807I = m15807I();
        m15808J(c3496qfM15807I, 23, new x42(c3496qfM15807I, z, 2));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: t */
    public final void mo3523t(List list) {
        C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, 27, new c52(c3496qfM15803E, list));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: u */
    public final void mo3524u(int i, boolean z) {
        C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, -1, new hm2(c3496qfM15803E, z, i));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: v */
    public final void mo3525v(n97 n97Var) {
        C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, 12, new vg1(3, c3496qfM15803E, n97Var));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: w */
    public final void mo3526w(aa7 aa7Var) {
        C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, 13, new hm2(c3496qfM15803E, aa7Var, 28));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: x */
    public final void mo3527x(PlaybackException playbackException) {
        jv5 jv5Var;
        C3496qf c3496qfM15803E = (!(playbackException instanceof ExoPlaybackException) || (jv5Var = ((ExoPlaybackException) playbackException).f6444h) == null) ? m15803E() : m15804F(jv5Var);
        m15808J(c3496qfM15803E, 10, new hm2(c3496qfM15803E, playbackException, 18));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: y */
    public final void mo3528y(ey5 ey5Var) {
        C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, 28, new vg1(2, c3496qfM15803E, ey5Var));
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: z */
    public final void mo3529z(pu5 pu5Var, int i) {
        C3496qf c3496qfM15803E = m15803E();
        m15808J(c3496qfM15803E, 1, new z42(c3496qfM15803E, pu5Var, i));
    }
}
