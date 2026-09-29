package p146h5;

import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p026b5.AbstractC1314g;
import p131g5.InterfaceC5697a;
import p170i5.AbstractC6189h;
import p170i5.C6190i;
import p214k5.C6617s;
import sl.C9072e;

/* JADX INFO: renamed from: h5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5889c<T> implements InterfaceC5697a<T> {

    /* JADX INFO: renamed from: a */
    public final AbstractC6189h<T> f35217a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f35218b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f35219c;

    /* JADX INFO: renamed from: d */
    public T f35220d;

    /* JADX INFO: renamed from: e */
    public a f35221e;

    /* JADX INFO: renamed from: h5.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo12063a(ArrayList arrayList);

        /* JADX INFO: renamed from: b */
        void mo12064b(ArrayList arrayList);
    }

    public AbstractC5889c(AbstractC6189h<T> abstractC6189h) {
        C5207g.m11111f(abstractC6189h, "tracker");
        this.f35217a = abstractC6189h;
        this.f35218b = new ArrayList();
        this.f35219c = new ArrayList();
    }

    @Override // p131g5.InterfaceC5697a
    /* JADX INFO: renamed from: a */
    public final void mo12062a(T t10) {
        this.f35220d = t10;
        m12316e(this.f35221e, t10);
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo12313b(C6617s c6617s);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo12314c(T t10);

    /* JADX INFO: renamed from: d */
    public final void m12315d(Collection collection) {
        C5207g.m11111f(collection, "workSpecs");
        this.f35218b.clear();
        this.f35219c.clear();
        ArrayList arrayList = this.f35218b;
        for (T t10 : collection) {
            if (mo12313b((C6617s) t10)) {
                arrayList.add(t10);
            }
        }
        ArrayList arrayList2 = this.f35218b;
        ArrayList arrayList3 = this.f35219c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C6617s) it.next()).f37524a);
        }
        if (this.f35218b.isEmpty()) {
            this.f35217a.m12708b(this);
        } else {
            AbstractC6189h<T> abstractC6189h = this.f35217a;
            abstractC6189h.getClass();
            synchronized (abstractC6189h.f36047c) {
                try {
                    if (abstractC6189h.f36048d.add(this)) {
                        if (abstractC6189h.f36048d.size() == 1) {
                            abstractC6189h.f36049e = abstractC6189h.mo12702a();
                            AbstractC1314g.m4867d().mo4869a(C6190i.f36050a, abstractC6189h.getClass().getSimpleName() + ": initial state = " + abstractC6189h.f36049e);
                            abstractC6189h.mo12706d();
                        }
                        mo12062a(abstractC6189h.f36049e);
                    }
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        m12316e(this.f35221e, this.f35220d);
    }

    /* JADX INFO: renamed from: e */
    public final void m12316e(a aVar, T t10) {
        ArrayList arrayList = this.f35218b;
        if (arrayList.isEmpty() || aVar == null) {
            return;
        }
        if (t10 != null && !mo12314c(t10)) {
            aVar.mo12063a(arrayList);
            return;
        }
        aVar.mo12064b(arrayList);
    }
}
