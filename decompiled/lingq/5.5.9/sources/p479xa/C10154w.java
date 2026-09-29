package p479xa;

import com.google.android.exoplayer2.C2505u;

/* JADX INFO: renamed from: xa.w */
/* JADX INFO: loaded from: classes.dex */
public final class C10154w implements InterfaceC10146o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10133c f51448a;

    /* JADX INFO: renamed from: b */
    public boolean f51449b;

    /* JADX INFO: renamed from: c */
    public long f51450c;

    /* JADX INFO: renamed from: d */
    public long f51451d;

    /* JADX INFO: renamed from: e */
    public C2505u f51452e = C2505u.f13473d;

    public C10154w(InterfaceC10133c interfaceC10133c) {
        this.f51448a = interfaceC10133c;
    }

    /* JADX INFO: renamed from: a */
    public final void m19162a(long j10) {
        this.f51450c = j10;
        if (this.f51449b) {
            this.f51451d = this.f51448a.mo19015d();
        }
    }

    @Override // p479xa.InterfaceC10146o
    public final C2505u getPlaybackParameters() {
        return this.f51452e;
    }

    @Override // p479xa.InterfaceC10146o
    /* JADX INFO: renamed from: l */
    public final long mo6886l() {
        long jM19026K = this.f51450c;
        if (this.f51449b) {
            long jMo19015d = this.f51448a.mo19015d() - this.f51451d;
            C2505u c2505u = this.f51452e;
            jM19026K += c2505u.f13474a == 1.0f ? C10134c0.m19026K(jMo19015d) : jMo19015d * ((long) c2505u.f13476c);
        }
        return jM19026K;
    }

    @Override // p479xa.InterfaceC10146o
    public final void setPlaybackParameters(C2505u c2505u) {
        if (this.f51449b) {
            m19162a(mo6886l());
        }
        this.f51452e = c2505u;
    }
}
