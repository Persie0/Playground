package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class jvb implements kba {

    /* JADX INFO: renamed from: a */
    private final jvb f34874a;

    /* JADX INFO: renamed from: b */
    private final jvz f34875b;

    /* JADX INFO: renamed from: c */
    private List f34876c;

    public jvb() {
        this(jwc.f34937a);
    }

    /* JADX INFO: renamed from: b */
    public boolean mo8995b() {
        boolean z;
        synchronized (this) {
            z = this.f34876c == null;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final jvb m13536c() {
        jvb jvbVar = new jvb(this, this.f34875b);
        m13537d(jvbVar);
        return jvbVar;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            List list = this.f34876c;
            if (list != null) {
                this.f34876c = null;
                jvb jvbVar = this.f34874a;
                if (jvbVar != null) {
                    synchronized (jvbVar) {
                        List list2 = jvbVar.f34876c;
                        if (list2 != null) {
                            list2.remove(this);
                        }
                    }
                }
                this.f34875b.mo13608b(list);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m13537d(kba kbaVar) {
        boolean z;
        kbaVar.getClass();
        synchronized (this) {
            List list = this.f34876c;
            if (list == null) {
                z = true;
            } else {
                list.add(kbaVar);
                z = false;
            }
        }
        if (z) {
            this.f34875b.mo13607a(kbaVar);
        }
    }

    private jvb(jvb jvbVar, jvz jvzVar) {
        this.f34875b = jvzVar;
        this.f34874a = jvbVar;
        this.f34876c = new ArrayList();
    }

    public jvb(jvz jvzVar) {
        this.f34875b = jvzVar;
        this.f34874a = null;
        this.f34876c = new ArrayList();
    }
}
