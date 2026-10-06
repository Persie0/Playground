package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kkx implements klc, kba {

    /* JADX INFO: renamed from: a */
    private final kgg f36436a;

    /* JADX INFO: renamed from: c */
    private final kle f36438c;

    /* JADX INFO: renamed from: d */
    private kfd f36439d = null;

    /* JADX INFO: renamed from: e */
    private kpw f36440e = null;

    /* JADX INFO: renamed from: f */
    private boolean f36441f = false;

    /* JADX INFO: renamed from: g */
    private boolean f36442g = false;

    /* JADX INFO: renamed from: b */
    private final List f36437b = new ArrayList();

    public kkx(kgg kggVar, kle kleVar) {
        this.f36436a = kggVar;
        this.f36438c = kleVar;
    }

    /* JADX INFO: renamed from: e */
    public static klc m14472e(kgg kggVar, kle kleVar) {
        kleVar.getClass();
        kkx kkxVar = new kkx(kggVar, kleVar);
        kleVar.m14482e(kkxVar);
        return kkxVar;
    }

    /* JADX INFO: renamed from: f */
    private final synchronized void m14473f() {
        if (this.f36442g) {
            return;
        }
        this.f36442g = true;
        if (!this.f36437b.isEmpty()) {
            Iterator it = this.f36437b.iterator();
            while (it.hasNext()) {
                ((klb) it.next()).mo14284h();
            }
            this.f36437b.clear();
        }
    }

    @Override // p000.klc
    /* JADX INFO: renamed from: a */
    public final kba mo14458a() {
        return this.f36438c.m14478a();
    }

    @Override // p000.klc
    /* JADX INFO: renamed from: b */
    public final kba mo14459b() {
        return this.f36438c.m14479b();
    }

    @Override // p000.klc
    /* JADX INFO: renamed from: c */
    public final synchronized kfd mo14460c() {
        return this.f36439d;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        m14473f();
        this.f36440e = null;
    }

    @Override // p000.klc
    /* JADX INFO: renamed from: d */
    public final kgg mo14461d() {
        return this.f36436a;
    }

    @Override // p000.klc
    /* JADX INFO: renamed from: h */
    public final synchronized kpw mo14462h() {
        kba kbaVarM14479b;
        kpw kpwVar = this.f36440e;
        kle kleVar = this.f36438c;
        if (kpwVar == null || (kbaVarM14479b = kleVar.m14479b()) == null) {
            return null;
        }
        return new klf(kpwVar, kbaVarM14479b);
    }

    @Override // p000.klc
    /* JADX INFO: renamed from: i */
    public final synchronized void mo14463i(klb klbVar) {
        if (this.f36442g) {
            klbVar.mo14284h();
        } else {
            this.f36437b.add(klbVar);
        }
    }

    @Override // p000.klc
    /* JADX INFO: renamed from: j */
    public final synchronized void mo14464j(kfd kfdVar) {
        lku.m15660n(!this.f36441f, "An image was already set for frame %s on %s!", kfdVar, this.f36436a);
        this.f36439d = kfdVar;
    }

    @Override // p000.klc
    /* JADX INFO: renamed from: k */
    public final synchronized void mo14465k(kpw kpwVar) {
        boolean z;
        if (kpwVar != null) {
            try {
                z = this.f36439d != null;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = true;
        }
        lku.m15657k(z);
        boolean z2 = this.f36441f;
        if (z2 && kpwVar == null) {
            return;
        }
        lku.m15660n(!z2, "An image was already set for frame %s on %s!", this.f36439d, this.f36436a);
        this.f36441f = true;
        if (kpwVar != null) {
            this.f36439d.getClass();
            this.f36438c.m14482e(kpwVar);
            if (!this.f36438c.m14481d()) {
                this.f36440e = kpwVar;
            }
        } else {
            kle kleVar = this.f36438c;
            synchronized (kleVar) {
                kleVar.f36466c = true;
            }
            kleVar.f36467d.close();
        }
        m14473f();
    }

    public final synchronized String toString() {
        Long lValueOf;
        kfd kfdVar = this.f36439d;
        lValueOf = kfdVar == null ? null : Long.valueOf(kfdVar.f35812c);
        StringBuilder sb = new StringBuilder();
        sb.append("ImageStreamResult-");
        sb.append(lValueOf);
        return "ImageStreamResult-".concat(String.valueOf(lValueOf));
    }
}
