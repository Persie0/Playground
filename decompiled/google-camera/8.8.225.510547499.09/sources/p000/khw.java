package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class khw implements key {

    /* JADX INFO: renamed from: a */
    public final kho f36101a;

    /* JADX INFO: renamed from: b */
    private final List f36102b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final List f36103c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private khq f36104d;

    /* JADX INFO: renamed from: e */
    private kba f36105e;

    /* JADX INFO: renamed from: f */
    private boolean f36106f;

    public khw(kho khoVar) {
        this.f36101a = khoVar;
    }

    @Override // p000.key
    /* JADX INFO: renamed from: a */
    public final synchronized key mo7040a() {
        if (this.f36106f) {
            return null;
        }
        khq khqVar = this.f36104d;
        if (khqVar != null) {
            return kim.m14356l(khqVar);
        }
        khw khwVar = new khw(this.f36101a);
        this.f36103c.add(khwVar);
        return khwVar;
    }

    @Override // p000.key
    /* JADX INFO: renamed from: b */
    public final synchronized kfd mo7041b() {
        khq khqVar = this.f36104d;
        if (khqVar == null) {
            return null;
        }
        return khqVar.f36078b;
    }

    @Override // p000.key
    /* JADX INFO: renamed from: c */
    public final synchronized kpp mo7042c() {
        khq khqVar = this.f36104d;
        if (khqVar == null) {
            return null;
        }
        return khqVar.m14280d();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f36106f) {
            return;
        }
        this.f36106f = true;
        this.f36102b.clear();
        kba kbaVar = this.f36105e;
        if (kbaVar != null) {
            kbaVar.close();
            this.f36105e = null;
        }
    }

    @Override // p000.key
    /* JADX INFO: renamed from: d */
    public final synchronized kpw mo7043d(kgg kggVar) {
        khq khqVar = this.f36104d;
        if (khqVar != null && !this.f36106f) {
            return khqVar.m14281e(kggVar);
        }
        return null;
    }

    @Override // p000.key
    /* JADX INFO: renamed from: e */
    public final synchronized boolean mo7044e() {
        return this.f36106f;
    }

    @Override // p000.key
    /* JADX INFO: renamed from: f */
    public final synchronized boolean mo7045f() {
        khq khqVar = this.f36104d;
        return khqVar != null && khqVar.m14287k();
    }

    @Override // p000.key
    /* JADX INFO: renamed from: g */
    public final synchronized boolean mo7046g() {
        khq khqVar = this.f36104d;
        return khqVar != null && khqVar.m14288l();
    }

    @Override // p000.key
    /* JADX INFO: renamed from: h */
    public final synchronized boolean mo7047h() {
        khq khqVar = this.f36104d;
        return khqVar != null && khqVar.m14289m();
    }

    @Override // p000.key
    /* JADX INFO: renamed from: i */
    public final synchronized boolean mo7048i() {
        khq khqVar = this.f36104d;
        return khqVar != null && khqVar.m14290n();
    }

    @Override // p000.key
    /* JADX INFO: renamed from: j */
    public final kho mo7049j() {
        return this.f36101a;
    }

    @Override // p000.key
    /* JADX INFO: renamed from: k */
    public final synchronized void mo7050k(kfv kfvVar) {
        khq khqVar = this.f36104d;
        if (khqVar == null) {
            this.f36102b.add(kfvVar);
        } else {
            if (!this.f36106f) {
                khqVar.m14291o(kfvVar);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m14296l(khq khqVar) {
        kba kbaVar;
        khqVar.getClass();
        lku.m15614I(this.f36104d == null, "FrameStreamResult was set twice!");
        this.f36104d = khqVar;
        this.f36105e = khqVar.m14278b();
        Iterator it = this.f36102b.iterator();
        while (it.hasNext()) {
            khqVar.m14291o((kfv) it.next());
        }
        this.f36102b.clear();
        Iterator it2 = this.f36103c.iterator();
        while (it2.hasNext()) {
            ((khw) it2.next()).m14296l(khqVar);
        }
        this.f36103c.clear();
        if (this.f36106f && (kbaVar = this.f36105e) != null) {
            kbaVar.close();
            this.f36105e = null;
        }
    }
}
