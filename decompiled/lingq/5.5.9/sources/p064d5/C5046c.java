package p064d5;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.appcompat.widget.C0322j;
import androidx.work.C1243a;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p026b5.AbstractC1314g;
import p026b5.C1309b;
import p041c5.C1699a0;
import p041c5.C1702c;
import p041c5.C1722t;
import p041c5.InterfaceC1704d;
import p041c5.InterfaceC1720r;
import p131g5.C5700d;
import p131g5.InterfaceC5699c;
import p170i5.C6195n;
import p214k5.C6610l;
import p214k5.C6617s;
import p235l5.C7269p;
import p235l5.RunnableC7271r;
import p235l5.RunnableC7272s;
import p260m8.C7499b;

/* JADX INFO: renamed from: d5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5046c implements InterfaceC1720r, InterfaceC5699c, InterfaceC1704d {

    /* JADX INFO: renamed from: j */
    public static final String f32885j = AbstractC1314g.m4868f("GreedyScheduler");

    /* JADX INFO: renamed from: a */
    public final Context f32886a;

    /* JADX INFO: renamed from: b */
    public final C1699a0 f32887b;

    /* JADX INFO: renamed from: c */
    public final C5700d f32888c;

    /* JADX INFO: renamed from: e */
    public final C5045b f32890e;

    /* JADX INFO: renamed from: f */
    public boolean f32891f;

    /* JADX INFO: renamed from: i */
    public Boolean f32894i;

    /* JADX INFO: renamed from: d */
    public final HashSet f32889d = new HashSet();

    /* JADX INFO: renamed from: h */
    public final C0322j f32893h = new C0322j(4);

    /* JADX INFO: renamed from: g */
    public final Object f32892g = new Object();

    public C5046c(Context context, C1243a c1243a, C6195n c6195n, C1699a0 c1699a0) {
        this.f32886a = context;
        this.f32887b = c1699a0;
        this.f32888c = new C5700d(c6195n, this);
        this.f32890e = new C5045b(this, c1243a.f7814e);
    }

    @Override // p041c5.InterfaceC1720r
    /* JADX INFO: renamed from: a */
    public final void mo5460a(C6617s... c6617sArr) {
        if (this.f32894i == null) {
            this.f32894i = Boolean.valueOf(C7269p.m14659a(this.f32886a, this.f32887b.f9476b));
        }
        if (!this.f32894i.booleanValue()) {
            AbstractC1314g.m4867d().mo4872e(f32885j, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f32891f) {
            this.f32887b.f9480f.m5454a(this);
            this.f32891f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C6617s c6617s : c6617sArr) {
            if (!this.f32893h.m1216d(C7499b.m14892A(c6617s))) {
                long jM13220a = c6617s.m13220a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c6617s.f37525b == WorkInfo$State.ENQUEUED) {
                    if (jCurrentTimeMillis < jM13220a) {
                        C5045b c5045b = this.f32890e;
                        if (c5045b != null) {
                            HashMap map = c5045b.f32884c;
                            Runnable runnable = (Runnable) map.remove(c6617s.f37524a);
                            C1702c c1702c = c5045b.f32883b;
                            if (runnable != null) {
                                ((Handler) c1702c.f9487a).removeCallbacks(runnable);
                            }
                            RunnableC5044a runnableC5044a = new RunnableC5044a(c5045b, c6617s);
                            map.put(c6617s.f37524a, runnableC5044a);
                            ((Handler) c1702c.f9487a).postDelayed(runnableC5044a, c6617s.m13220a() - System.currentTimeMillis());
                        }
                    } else if (c6617s.m13221b()) {
                        C1309b c1309b = c6617s.f37533j;
                        if (c1309b.f8048c) {
                            AbstractC1314g.m4867d().mo4869a(f32885j, "Ignoring " + c6617s + ". Requires device idle.");
                        } else if (!c1309b.f8053h.isEmpty()) {
                            AbstractC1314g.m4867d().mo4869a(f32885j, "Ignoring " + c6617s + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(c6617s);
                            hashSet2.add(c6617s.f37524a);
                        }
                    } else if (!this.f32893h.m1216d(C7499b.m14892A(c6617s))) {
                        AbstractC1314g.m4867d().mo4869a(f32885j, "Starting work for " + c6617s.f37524a);
                        C1699a0 c1699a0 = this.f32887b;
                        C0322j c0322j = this.f32893h;
                        c0322j.getClass();
                        c1699a0.f9478d.m14863a(new RunnableC7271r(c1699a0, c0322j.m1224l(C7499b.m14892A(c6617s)), null));
                    }
                }
            }
        }
        synchronized (this.f32892g) {
            if (!hashSet.isEmpty()) {
                AbstractC1314g.m4867d().mo4869a(f32885j, "Starting tracking for " + TextUtils.join(",", hashSet2));
                this.f32889d.addAll(hashSet);
                this.f32888c.m12066d(this.f32889d);
            }
        }
    }

    @Override // p041c5.InterfaceC1720r
    /* JADX INFO: renamed from: b */
    public final boolean mo5461b() {
        return false;
    }

    @Override // p041c5.InterfaceC1720r
    /* JADX INFO: renamed from: c */
    public final void mo5462c(String str) {
        Runnable runnable;
        Boolean bool = this.f32894i;
        C1699a0 c1699a0 = this.f32887b;
        if (bool == null) {
            this.f32894i = Boolean.valueOf(C7269p.m14659a(this.f32886a, c1699a0.f9476b));
        }
        boolean zBooleanValue = this.f32894i.booleanValue();
        String str2 = f32885j;
        if (!zBooleanValue) {
            AbstractC1314g.m4867d().mo4872e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f32891f) {
            c1699a0.f9480f.m5454a(this);
            this.f32891f = true;
        }
        AbstractC1314g.m4867d().mo4869a(str2, "Cancelling work ID " + str);
        C5045b c5045b = this.f32890e;
        if (c5045b != null && (runnable = (Runnable) c5045b.f32884c.remove(str)) != null) {
            ((Handler) c5045b.f32883b.f9487a).removeCallbacks(runnable);
        }
        Iterator it = this.f32893h.m1222j(str).iterator();
        while (it.hasNext()) {
            c1699a0.f9478d.m14863a(new RunnableC7272s(c1699a0, (C1722t) it.next(), false));
        }
    }

    @Override // p131g5.InterfaceC5699c
    /* JADX INFO: renamed from: d */
    public final void mo4734d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (true) {
            while (it.hasNext()) {
                C6610l c6610lM14892A = C7499b.m14892A((C6617s) it.next());
                AbstractC1314g.m4867d().mo4869a(f32885j, "Constraints not met: Cancelling work ID " + c6610lM14892A);
                C1722t c1722tM1221i = this.f32893h.m1221i(c6610lM14892A);
                if (c1722tM1221i != null) {
                    C1699a0 c1699a0 = this.f32887b;
                    c1699a0.f9478d.m14863a(new RunnableC7272s(c1699a0, c1722tM1221i, false));
                }
            }
            return;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p041c5.InterfaceC1704d
    /* JADX INFO: renamed from: e */
    public final void mo4730e(C6610l c6610l, boolean z10) {
        this.f32893h.m1221i(c6610l);
        synchronized (this.f32892g) {
            for (C6617s c6617s : this.f32889d) {
                if (C7499b.m14892A(c6617s).equals(c6610l)) {
                    AbstractC1314g.m4867d().mo4869a(f32885j, "Stopping tracking for " + c6610l);
                    this.f32889d.remove(c6617s);
                    this.f32888c.m12066d(this.f32889d);
                    break;
                }
            }
        }
    }

    @Override // p131g5.InterfaceC5699c
    /* JADX INFO: renamed from: f */
    public final void mo4736f(List<C6617s> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C6610l c6610lM14892A = C7499b.m14892A((C6617s) it.next());
            C0322j c0322j = this.f32893h;
            if (!c0322j.m1216d(c6610lM14892A)) {
                AbstractC1314g.m4867d().mo4869a(f32885j, "Constraints met: Scheduling work ID " + c6610lM14892A);
                C1722t c1722tM1224l = c0322j.m1224l(c6610lM14892A);
                C1699a0 c1699a0 = this.f32887b;
                c1699a0.f9478d.m14863a(new RunnableC7271r(c1699a0, c1722tM1224l, null));
            }
        }
    }
}
