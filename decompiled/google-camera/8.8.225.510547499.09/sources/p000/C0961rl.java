package p000;

import android.view.Surface;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: rl */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0961rl implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final Surface f47555a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C1058va f47556b;

    /* JADX INFO: renamed from: c */
    private final opk f47557c = ook.m18793g(false);

    public C0961rl(C1058va c1058va, Surface surface, byte[] bArr) {
        this.f47556b = c1058va;
        this.f47555a = surface;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        List listM18673M;
        if (this.f47557c.m18843b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("SurfaceToken ");
            sb.append(this);
            sb.append(" closed");
            C1058va c1058va = this.f47556b;
            synchronized (c1058va.f47804c) {
                Surface surface = this.f47555a;
                Integer num = (Integer) c1058va.f47803b.get(surface);
                if (num == null) {
                    throw new IllegalStateException("Surface " + surface + " (" + this + ") has no use count");
                }
                c1058va.f47803b.put(surface, Integer.valueOf(num.intValue() - 1));
                if (num.intValue() - 1 == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Surface ");
                    sb2.append(surface);
                    sb2.append(" has become inactive");
                    listM18673M = omn.m18673M(c1058va.f47802a);
                    c1058va.f47803b.remove(surface);
                } else {
                    listM18673M = null;
                }
            }
            if (listM18673M != null) {
                Iterator it = listM18673M.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0960rk) it.next()).m19379b();
                }
            }
        }
    }
}
