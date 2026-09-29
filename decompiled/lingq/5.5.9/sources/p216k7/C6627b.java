package p216k7;

import com.downloader.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import p133g7.C5708a;
import p259m7.C7493a;
import p259m7.RunnableC7496d;
import p273n7.C7715c;
import p273n7.RunnableC7713a;

/* JADX INFO: renamed from: k7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6627b {

    /* JADX INFO: renamed from: c */
    public static C6627b f37572c;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f37573a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f37574b = new AtomicInteger();

    /* JADX INFO: renamed from: b */
    public static C6627b m13257b() {
        if (f37572c == null) {
            synchronized (C6627b.class) {
                if (f37572c == null) {
                    f37572c = new C6627b();
                }
            }
        }
        return f37572c;
    }

    /* JADX INFO: renamed from: a */
    public final void m13258a(C7493a c7493a) {
        if (c7493a != null) {
            c7493a.f41402p = Status.CANCELLED;
            Future future = c7493a.f41393g;
            if (future != null) {
                future.cancel(true);
            }
            C5708a.m12072a().f34717a.f34721c.execute(new RunnableC7496d(c7493a));
            C5708a.m12072a().f34717a.f34720b.execute(new RunnableC7713a(C7715c.m15306b(c7493a.f41390d, c7493a.f41391e), c7493a.f41401o));
            this.f37573a.remove(Integer.valueOf(c7493a.f41401o));
        }
    }
}
