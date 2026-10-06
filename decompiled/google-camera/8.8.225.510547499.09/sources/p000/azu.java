package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class azu implements azd, ban, ayo {

    /* JADX INFO: renamed from: a */
    Boolean f2815a;

    /* JADX INFO: renamed from: b */
    private final Context f2816b;

    /* JADX INFO: renamed from: c */
    private final azp f2817c;

    /* JADX INFO: renamed from: d */
    private final bao f2818d;

    /* JADX INFO: renamed from: f */
    private final azt f2820f;

    /* JADX INFO: renamed from: g */
    private boolean f2821g;

    /* JADX INFO: renamed from: e */
    private final Set f2819e = new HashSet();

    /* JADX INFO: renamed from: i */
    private final bck f2823i = new bck();

    /* JADX INFO: renamed from: h */
    private final Object f2822h = new Object();

    static {
        ayc.m2100b("GreedyScheduler");
    }

    public azu(Context context, axp axpVar, bbo bboVar, azp azpVar) {
        this.f2816b = context;
        this.f2817c = azpVar;
        this.f2818d = new bap(bboVar, this);
        this.f2820f = new azt(this, axpVar.f2675f, null, null);
    }

    /* JADX INFO: renamed from: g */
    private final void m2138g() {
        this.f2815a = Boolean.valueOf(bea.m2262a(this.f2816b, this.f2817c.f2781c));
    }

    /* JADX INFO: renamed from: h */
    private final void m2139h() {
        if (this.f2821g) {
            return;
        }
        this.f2817c.f2784f.m2112b(this);
        this.f2821g = true;
    }

    @Override // p000.ayo
    /* JADX INFO: renamed from: a */
    public final void mo1714a(bcj bcjVar, boolean z) {
        this.f2823i.m2205E(bcjVar);
        synchronized (this.f2822h) {
            for (bcv bcvVar : this.f2819e) {
                if (bbu.m2189b(bcvVar).equals(bcjVar)) {
                    ayc.m2099a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Stopping tracking for ");
                    sb.append(bcjVar);
                    this.f2819e.remove(bcvVar);
                    this.f2818d.mo2166a(this.f2819e);
                    break;
                }
            }
        }
    }

    @Override // p000.azd
    /* JADX INFO: renamed from: b */
    public final void mo2117b(String str) {
        Runnable runnable;
        if (this.f2815a == null) {
            m2138g();
        }
        if (!this.f2815a.booleanValue()) {
            ayc.m2099a();
            return;
        }
        m2139h();
        ayc.m2099a();
        azt aztVar = this.f2820f;
        if (aztVar != null && (runnable = (Runnable) aztVar.f2813b.remove(str)) != null) {
            aztVar.f2814c.m2586g(runnable);
        }
        Iterator it = this.f2823i.m2207a(str).iterator();
        while (it.hasNext()) {
            this.f2817c.m2129i((bkn) it.next());
        }
    }

    @Override // p000.azd
    /* JADX INFO: renamed from: c */
    public final void mo2118c(bcv... bcvVarArr) {
        if (this.f2815a == null) {
            m2138g();
        }
        if (!this.f2815a.booleanValue()) {
            ayc.m2099a();
            return;
        }
        m2139h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (bcv bcvVar : bcvVarArr) {
            if (!this.f2823i.m2208b(bbu.m2189b(bcvVar))) {
                long jM2228a = bcvVar.m2228a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (bcvVar.f2981r == 1) {
                    if (jCurrentTimeMillis < jM2228a) {
                        azt aztVar = this.f2820f;
                        if (aztVar != null) {
                            Runnable runnable = (Runnable) aztVar.f2813b.remove(bcvVar.f2964a);
                            if (runnable != null) {
                                aztVar.f2814c.m2586g(runnable);
                            }
                            RunnableC0058bd runnableC0058bd = new RunnableC0058bd(aztVar, bcvVar, 19);
                            aztVar.f2813b.put(bcvVar.f2964a, runnableC0058bd);
                            aztVar.f2814c.m2587h(bcvVar.m2228a() - System.currentTimeMillis(), runnableC0058bd);
                        }
                    } else if (bcvVar.m2229c()) {
                        axr axrVar = bcvVar.f2972i;
                        if (axrVar.f2680c) {
                            ayc.m2099a();
                            StringBuilder sb = new StringBuilder();
                            sb.append("Ignoring ");
                            sb.append(bcvVar);
                            sb.append(". Requires device idle.");
                        } else if (axrVar.m2089a()) {
                            ayc.m2099a();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Ignoring ");
                            sb2.append(bcvVar);
                            sb2.append(". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(bcvVar);
                            hashSet2.add(bcvVar.f2964a);
                        }
                    } else if (!this.f2823i.m2208b(bbu.m2189b(bcvVar))) {
                        ayc.m2099a();
                        String str = bcvVar.f2964a;
                        azp azpVar = this.f2817c;
                        bck bckVar = this.f2823i;
                        bcvVar.getClass();
                        azpVar.m2128h(bckVar.m2206F(bbu.m2189b(bcvVar)));
                    }
                }
            }
        }
        synchronized (this.f2822h) {
            if (!hashSet.isEmpty()) {
                TextUtils.join(",", hashSet2);
                ayc.m2099a();
                this.f2819e.addAll(hashSet);
                this.f2818d.mo2166a(this.f2819e);
            }
        }
    }

    @Override // p000.azd
    /* JADX INFO: renamed from: d */
    public final boolean mo2119d() {
        return false;
    }

    @Override // p000.ban
    /* JADX INFO: renamed from: e */
    public final void mo1720e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bcj bcjVarM2189b = bbu.m2189b((bcv) it.next());
            if (!this.f2823i.m2208b(bcjVarM2189b)) {
                ayc.m2099a();
                StringBuilder sb = new StringBuilder();
                sb.append("Constraints met: Scheduling work ID ");
                sb.append(bcjVarM2189b);
                bcjVarM2189b.toString();
                this.f2817c.m2128h(this.f2823i.m2206F(bcjVarM2189b));
            }
        }
    }

    @Override // p000.ban
    /* JADX INFO: renamed from: f */
    public final void mo1721f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bcj bcjVarM2189b = bbu.m2189b((bcv) it.next());
            ayc.m2099a();
            StringBuilder sb = new StringBuilder();
            sb.append("Constraints not met: Cancelling work ID ");
            sb.append(bcjVarM2189b);
            bcjVarM2189b.toString();
            bkn bknVarM2205E = this.f2823i.m2205E(bcjVarM2189b);
            if (bknVarM2205E != null) {
                this.f2817c.m2129i(bknVarM2205E);
            }
        }
    }
}
