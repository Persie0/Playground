package p131g5;

import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p026b5.AbstractC1314g;
import p146h5.AbstractC5889c;
import p146h5.C5887a;
import p146h5.C5888b;
import p146h5.C5890d;
import p146h5.C5891e;
import p146h5.C5892f;
import p146h5.C5893g;
import p170i5.AbstractC6189h;
import p170i5.C6184c;
import p170i5.C6195n;
import p214k5.C6617s;
import sl.C9072e;

/* JADX INFO: renamed from: g5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5700d implements AbstractC5889c.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5699c f34712a;

    /* JADX INFO: renamed from: b */
    public final AbstractC5889c<?>[] f34713b;

    /* JADX INFO: renamed from: c */
    public final Object f34714c;

    public C5700d(C6195n c6195n, InterfaceC5699c interfaceC5699c) {
        C5207g.m11111f(c6195n, "trackers");
        Object obj = c6195n.f36057b;
        AbstractC5889c<?>[] abstractC5889cArr = {new C5887a((AbstractC6189h) c6195n.f36056a, 0), new C5888b((C6184c) c6195n.f36059d), new C5887a((AbstractC6189h) c6195n.f36058c, 1), new C5890d((AbstractC6189h) obj), new C5893g((AbstractC6189h) obj), new C5892f((AbstractC6189h) obj), new C5891e((AbstractC6189h) obj)};
        this.f34712a = interfaceC5699c;
        this.f34713b = abstractC5889cArr;
        this.f34714c = new Object();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p146h5.AbstractC5889c.a
    /* JADX INFO: renamed from: a */
    public final void mo12063a(ArrayList arrayList) {
        C5207g.m11111f(arrayList, "workSpecs");
        synchronized (this.f34714c) {
            try {
                ArrayList<C6617s> arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        Object next = it.next();
                        if (m12065c(((C6617s) next).f37524a)) {
                            arrayList2.add(next);
                        }
                    }
                }
                for (C6617s c6617s : arrayList2) {
                    AbstractC1314g.m4867d().mo4869a(C5701e.f34715a, "Constraints met for " + c6617s);
                }
                InterfaceC5699c interfaceC5699c = this.f34712a;
                if (interfaceC5699c != null) {
                    interfaceC5699c.mo4736f(arrayList2);
                    C9072e c9072e = C9072e.f47360a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p146h5.AbstractC5889c.a
    /* JADX INFO: renamed from: b */
    public final void mo12064b(ArrayList arrayList) {
        C5207g.m11111f(arrayList, "workSpecs");
        synchronized (this.f34714c) {
            InterfaceC5699c interfaceC5699c = this.f34712a;
            if (interfaceC5699c != null) {
                interfaceC5699c.mo4734d(arrayList);
                C9072e c9072e = C9072e.f47360a;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m12065c(String str) {
        boolean z10;
        AbstractC5889c<?> abstractC5889c;
        C5207g.m11111f(str, "workSpecId");
        synchronized (this.f34714c) {
            try {
                AbstractC5889c<?>[] abstractC5889cArr = this.f34713b;
                int length = abstractC5889cArr.length;
                z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        abstractC5889c = null;
                        break;
                    }
                    abstractC5889c = abstractC5889cArr[i10];
                    abstractC5889c.getClass();
                    Object obj = abstractC5889c.f35220d;
                    if (obj != null && abstractC5889c.mo12314c(obj) && abstractC5889c.f35219c.contains(str)) {
                        break;
                    }
                    i10++;
                }
                if (abstractC5889c != null) {
                    AbstractC1314g.m4867d().mo4869a(C5701e.f34715a, "Work " + str + " constrained by " + abstractC5889c.getClass().getSimpleName());
                }
                if (abstractC5889c == null) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m12066d(Collection collection) {
        C5207g.m11111f(collection, "workSpecs");
        synchronized (this.f34714c) {
            for (AbstractC5889c<?> abstractC5889c : this.f34713b) {
                if (abstractC5889c.f35221e != null) {
                    abstractC5889c.f35221e = null;
                    abstractC5889c.m12316e(null, abstractC5889c.f35220d);
                }
            }
            for (AbstractC5889c<?> abstractC5889c2 : this.f34713b) {
                abstractC5889c2.m12315d(collection);
            }
            for (AbstractC5889c<?> abstractC5889c3 : this.f34713b) {
                if (abstractC5889c3.f35221e != this) {
                    abstractC5889c3.f35221e = this;
                    abstractC5889c3.m12316e(this, abstractC5889c3.f35220d);
                }
            }
            C9072e c9072e = C9072e.f47360a;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m12067e() {
        synchronized (this.f34714c) {
            for (AbstractC5889c<?> abstractC5889c : this.f34713b) {
                ArrayList arrayList = abstractC5889c.f35218b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    abstractC5889c.f35217a.m12708b(abstractC5889c);
                }
            }
            C9072e c9072e = C9072e.f47360a;
        }
    }
}
