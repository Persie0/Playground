package p000;

import android.graphics.PointF;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hrp implements hsd {

    /* JADX INFO: renamed from: a */
    public final Executor f29330a;

    /* JADX INFO: renamed from: b */
    public final kbz f29331b;

    /* JADX INFO: renamed from: d */
    public final hsd f29333d;

    /* JADX INFO: renamed from: c */
    public volatile boolean f29332c = false;

    /* JADX INFO: renamed from: e */
    public volatile mrm f29334e = mqu.f41450a;

    /* JADX INFO: renamed from: f */
    private final AtomicInteger f29335f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g */
    private volatile long f29336g = -1;

    public hrp(hru hruVar, mrm mrmVar, kbz kbzVar) {
        this.f29331b = kbzVar;
        lku.m15669w(mrmVar.mo16813g());
        this.f29333d = hruVar;
        this.f29330a = (Executor) mrmVar.mo16809c();
    }

    @Override // p000.hsb
    /* JADX INFO: renamed from: b */
    public final jwn mo10657b(PointF pointF) {
        synchronized (this) {
            this.f29335f.set(0);
            this.f29336g = -1L;
        }
        return this.f29333d.mo10657b(pointF);
    }

    @Override // p000.hnu
    /* JADX INFO: renamed from: by */
    public final void mo5538by(hnv hnvVar) {
        this.f29333d.mo5538by(hnvVar);
    }

    @Override // p000.kpy
    /* JADX INFO: renamed from: ca */
    public final void mo8395ca() {
        synchronized (this) {
        }
    }

    @Override // p000.hsi
    /* JADX INFO: renamed from: d */
    public final kba mo10658d(mrm mrmVar, mrm mrmVar2) {
        synchronized (this) {
            this.f29334e = mrmVar;
        }
        return new gto(this, this.f29333d.mo10658d(mrmVar, mrmVar2), 14);
    }

    @Override // p000.hsi
    /* JADX INFO: renamed from: e */
    public final void mo10659e(hsh hshVar) {
        this.f29333d.mo10659e(hshVar);
    }

    @Override // p000.hsi
    /* JADX INFO: renamed from: f */
    public final void mo10660f(kpw kpwVar) {
        int iIncrementAndGet;
        if (kpwVar.mo7248d() - this.f29336g < 18000000) {
            kpwVar.close();
            return;
        }
        if (!this.f29332c) {
            this.f29332c = true;
            synchronized (this) {
                this.f29335f.set(0);
                this.f29336g = kpwVar.mo7248d();
            }
            this.f29330a.execute(new hri(this, kpwVar, 2));
            return;
        }
        kpwVar.close();
        synchronized (this) {
            iIncrementAndGet = this.f29335f.incrementAndGet();
        }
        if (iIncrementAndGet > 7) {
            this.f29330a.execute(new hps(this, 15));
        }
    }

    @Override // p000.hsi
    /* JADX INFO: renamed from: g */
    public final void mo10661g(hsh hshVar) {
        this.f29333d.mo10661g(hshVar);
    }

    @Override // p000.hsb
    /* JADX INFO: renamed from: h */
    public final void mo10662h() {
        this.f29333d.mo10662h();
    }

    @Override // p000.hsi
    /* JADX INFO: renamed from: i */
    public final boolean mo10663i() {
        return this.f29333d.mo10663i();
    }
}
