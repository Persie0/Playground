package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class khx {

    /* JADX INFO: renamed from: a */
    public final kbo f36107a;

    /* JADX INFO: renamed from: b */
    private final kbz f36108b;

    /* JADX INFO: renamed from: c */
    private final Deque f36109c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    private final Deque f36110d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    private boolean f36111e = false;

    /* JADX INFO: renamed from: f */
    private boolean f36112f = false;

    /* JADX INFO: renamed from: g */
    private Runnable f36113g;

    /* JADX INFO: renamed from: h */
    private final kqj f36114h;

    /* JADX INFO: renamed from: i */
    private final khb f36115i;

    /* JADX INFO: renamed from: j */
    private final djm f36116j;

    public khx(djm djmVar, kqj kqjVar, khb khbVar, jvb jvbVar, kbo kboVar, kbz kbzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f36116j = djmVar;
        this.f36114h = kqjVar;
        this.f36115i = khbVar;
        this.f36108b = kbzVar;
        this.f36107a = kboVar.mo6314a("PendingFrameQueue");
        jvbVar.m13537d(new kap(this, 4));
    }

    /* JADX INFO: renamed from: h */
    private final khq m14298h(kho khoVar) {
        khb khbVar = this.f36115i;
        mxi mxiVarM17132D = mxk.m17132D();
        Iterator it = khoVar.f36067c.iterator();
        while (it.hasNext()) {
            mxiVarM17132D.mo17072d(kks.m14456f((kgg) it.next()));
        }
        khq khqVarM14274p = khq.m14274p(khbVar, khoVar, mxiVarM17132D.mo17127f());
        khqVarM14274p.m14282f();
        return khqVarM14274p;
    }

    /* JADX INFO: renamed from: a */
    final synchronized Set m14299a() {
        if (!this.f36110d.isEmpty() && !this.f36112f) {
            Set set = (Set) this.f36110d.removeFirst();
            m14303e();
            return set;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m14300b(Set set, Set set2) {
        if (this.f36112f) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                khq khqVar = (khq) it.next();
                khqVar.m14282f();
                khqVar.m14283g();
            }
            naz nazVarListIterator = ((nad) set).listIterator();
            while (nazVarListIterator.hasNext()) {
                khw khwVar = (khw) nazVarListIterator.next();
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    khq khqVar2 = (khq) it2.next();
                    if (khqVar2.f36079c == khwVar.f36101a) {
                        khwVar.m14296l(khqVar2);
                    }
                }
            }
            return;
        }
        this.f36108b.mo13961e("onRequestAllocated");
        naz nazVarListIterator2 = ((nad) set).listIterator();
        while (nazVarListIterator2.hasNext()) {
            khw khwVar2 = (khw) nazVarListIterator2.next();
            Iterator it3 = set2.iterator();
            while (it3.hasNext()) {
                khq khqVar3 = (khq) it3.next();
                if (khqVar3.f36079c == khwVar2.f36101a) {
                    khwVar2.m14296l(khqVar3);
                }
            }
        }
        this.f36110d.add(set2);
        this.f36108b.mo13962f();
        if (!this.f36110d.isEmpty() && !this.f36112f && this.f36113g != null) {
            this.f36108b.mo13961e("invokeSubmitListener");
            this.f36113g.run();
            this.f36108b.mo13962f();
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m14301c(Runnable runnable) {
        lku.m15613H(this.f36113g == null);
        lku.m15613H(this.f36110d.isEmpty());
        lku.m15613H(!this.f36112f);
        this.f36113g = runnable;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m14302d() {
        if (this.f36112f) {
            return;
        }
        this.f36112f = true;
        if (!this.f36109c.isEmpty() || !this.f36110d.isEmpty()) {
            this.f36107a.mo13940b("Aborting pending frames on shutdown.");
        }
        for (khw khwVar : this.f36109c) {
            khwVar.m14296l(m14298h(khwVar.f36101a));
        }
        this.f36109c.clear();
        Iterator it = this.f36110d.iterator();
        while (it.hasNext()) {
            for (khq khqVar : (Set) it.next()) {
                khqVar.m14282f();
                khqVar.m14283g();
            }
        }
        this.f36110d.clear();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m14303e() {
        if (!this.f36111e && !this.f36109c.isEmpty() && this.f36110d.isEmpty() && !this.f36112f) {
            this.f36108b.mo13961e("allocate#FrameStream(s)");
            khw khwVar = (khw) this.f36109c.removeFirst();
            khwVar.getClass();
            mxk mxkVarM17136H = mxk.m17136H(khwVar);
            mxk mxkVarM17136H2 = mxk.m17136H(khwVar.f36101a);
            this.f36111e = true;
            kxk.m14975U(this.f36116j.m6246u(mxkVarM17136H2), new cwx(this, mxkVarM17136H, mxkVarM17136H2, 4), not.INSTANCE);
            this.f36108b.mo13962f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: f */
    public final synchronized key m14304f(kho khoVar) {
        khw khwVar;
        this.f36108b.mo13961e("submit#FrameStream");
        kqj kqjVar = this.f36114h;
        boolean z = false;
        if ((khoVar instanceof kho) && kqjVar.f36862c.contains(khoVar)) {
            z = true;
        }
        lku.m15669w(z);
        khwVar = new khw(khoVar);
        if (this.f36112f) {
            khwVar.m14296l(m14298h(khoVar));
        } else {
            this.f36109c.addLast(khwVar);
            m14303e();
        }
        this.f36108b.mo13962f();
        return khwVar;
    }
}
