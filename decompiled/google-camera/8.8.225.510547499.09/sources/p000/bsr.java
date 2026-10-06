package p000;

import com.google.android.libraries.social.licenses.GWO.HEePJw;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsr implements bsd, cbn {

    /* JADX INFO: renamed from: b */
    public bqn f4348b;

    /* JADX INFO: renamed from: c */
    public boolean f4349c;

    /* JADX INFO: renamed from: d */
    public boolean f4350d;

    /* JADX INFO: renamed from: e */
    public bsz f4351e;

    /* JADX INFO: renamed from: f */
    public boolean f4352f;

    /* JADX INFO: renamed from: g */
    bsv f4353g;

    /* JADX INFO: renamed from: h */
    public boolean f4354h;

    /* JADX INFO: renamed from: i */
    bst f4355i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f4356j;

    /* JADX INFO: renamed from: k */
    int f4357k;

    /* JADX INFO: renamed from: m */
    public final ljf f4359m;

    /* JADX INFO: renamed from: n */
    public final ljf f4360n;

    /* JADX INFO: renamed from: o */
    private final aed f4361o;

    /* JADX INFO: renamed from: p */
    private final buj f4362p;

    /* JADX INFO: renamed from: q */
    private final buj f4363q;

    /* JADX INFO: renamed from: r */
    private final buj f4364r;

    /* JADX INFO: renamed from: t */
    private boolean f4366t;

    /* JADX INFO: renamed from: u */
    private bsf f4367u;

    /* JADX INFO: renamed from: a */
    final bsq f4347a = new bsq(new ArrayList(2));

    /* JADX INFO: renamed from: l */
    public final fky f4358l = fky.m8534d();

    /* JADX INFO: renamed from: s */
    private final AtomicInteger f4365s = new AtomicInteger();

    public bsr(buj bujVar, buj bujVar2, buj bujVar3, ljf ljfVar, ljf ljfVar2, aed aedVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f4362p = bujVar;
        this.f4363q = bujVar2;
        this.f4364r = bujVar3;
        this.f4360n = ljfVar;
        this.f4359m = ljfVar2;
        this.f4361o = aedVar;
    }

    /* JADX INFO: renamed from: j */
    private final boolean m3005j() {
        return this.f4354h || this.f4352f || this.f4356j;
    }

    /* JADX INFO: renamed from: a */
    public final buj m3006a() {
        return this.f4366t ? this.f4364r : this.f4363q;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3007b(cac cacVar, Executor executor) {
        this.f4358l.m8537c();
        this.f4347a.f4346a.add(new bsp(cacVar, executor));
        if (this.f4352f) {
            m3009d(1);
            executor.execute(new bso(this, cacVar, 0));
        } else if (!this.f4354h) {
            bzq.m3274n(!this.f4356j, "Cannot add callbacks to a cancelled EngineJob");
        } else {
            m3009d(1);
            executor.execute(new bso(this, cacVar, 1));
        }
    }

    /* JADX INFO: renamed from: c */
    final void m3008c() {
        bst bstVar;
        synchronized (this) {
            this.f4358l.m8537c();
            bzq.m3274n(m3005j(), HEePJw.sHqmGWCOG);
            int iDecrementAndGet = this.f4365s.decrementAndGet();
            bzq.m3274n(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                bstVar = this.f4355i;
                m3010e();
            } else {
                bstVar = null;
            }
        }
        if (bstVar != null) {
            bstVar.m3019f();
        }
    }

    /* JADX INFO: renamed from: d */
    final synchronized void m3009d(int i) {
        bst bstVar;
        bzq.m3274n(m3005j(), "Not yet complete!");
        if (this.f4365s.getAndAdd(i) == 0 && (bstVar = this.f4355i) != null) {
            bstVar.m3017d();
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m3010e() {
        if (this.f4348b == null) {
            throw new IllegalArgumentException();
        }
        this.f4347a.f4346a.clear();
        this.f4348b = null;
        this.f4355i = null;
        this.f4351e = null;
        this.f4354h = false;
        this.f4356j = false;
        this.f4352f = false;
        bsf bsfVar = this.f4367u;
        if (bsfVar.f4301b.m2982d()) {
            bsfVar.m2989a();
        }
        this.f4367u = null;
        this.f4353g = null;
        this.f4357k = 0;
        this.f4361o.mo321b(this);
    }

    @Override // p000.cbn
    /* JADX INFO: renamed from: f */
    public final fky mo2992f() {
        return this.f4358l;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m3011g(cac cacVar) {
        this.f4358l.m8537c();
        this.f4347a.f4346a.remove(bsq.m3000b(cacVar));
        if (this.f4347a.m3004e()) {
            if (!m3005j()) {
                this.f4356j = true;
                bsf bsfVar = this.f4367u;
                bsfVar.f4314o = true;
                bsb bsbVar = bsfVar.f4313n;
                if (bsbVar != null) {
                    bsbVar.mo2966a();
                }
                this.f4360n.m15537o(this, this.f4348b);
            }
            if ((this.f4352f || this.f4354h) && this.f4365s.get() == 0) {
                m3010e();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m3012h(bsf bsfVar) {
        this.f4367u = bsfVar;
        int iM2990c = bsfVar.m2990c(1);
        ((iM2990c == 2 || iM2990c == 3) ? this.f4362p : m3006a()).execute(bsfVar);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m3013i(bqn bqnVar, boolean z, boolean z2, boolean z3) {
        this.f4348b = bqnVar;
        this.f4349c = z;
        this.f4366t = z2;
        this.f4350d = z3;
    }
}
