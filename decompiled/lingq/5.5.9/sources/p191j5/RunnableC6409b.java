package p191j5;

import androidx.work.impl.foreground.C1258a;
import p041c5.C1719q;
import p041c5.RunnableC1707e0;
import p214k5.C6617s;
import p260m8.C7499b;

/* JADX INFO: renamed from: j5.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6409b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f36872a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1258a f36873b;

    public RunnableC6409b(C1258a c1258a, String str) {
        this.f36873b = c1258a;
        this.f36872a = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C6617s c6617s;
        C1719q c1719q = this.f36873b.f7900a.f9480f;
        String str = this.f36872a;
        synchronized (c1719q.f9548l) {
            RunnableC1707e0 runnableC1707e0 = (RunnableC1707e0) c1719q.f9542f.get(str);
            if (runnableC1707e0 == null) {
                runnableC1707e0 = (RunnableC1707e0) c1719q.f9543g.get(str);
            }
            c6617s = runnableC1707e0 != null ? runnableC1707e0.f9502d : null;
        }
        if (c6617s == null || !c6617s.m13221b()) {
            return;
        }
        synchronized (this.f36873b.f7902c) {
            this.f36873b.f7905f.put(C7499b.m14892A(c6617s), c6617s);
            this.f36873b.f7906g.add(c6617s);
            C1258a c1258a = this.f36873b;
            c1258a.f7907h.m12066d(c1258a.f7906g);
        }
    }
}
