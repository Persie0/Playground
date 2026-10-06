package p000;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kka implements kiv, kba {

    /* JADX INFO: renamed from: a */
    public final kiw f36317a;

    /* JADX INFO: renamed from: b */
    public kiv f36318b;

    /* JADX INFO: renamed from: c */
    public kiv f36319c;

    /* JADX INFO: renamed from: d */
    public kiy f36320d;

    /* JADX INFO: renamed from: g */
    private final Handler f36323g;

    /* JADX INFO: renamed from: h */
    private final kbo f36324h;

    /* JADX INFO: renamed from: j */
    private kiz f36326j;

    /* JADX INFO: renamed from: e */
    public boolean f36321e = false;

    /* JADX INFO: renamed from: f */
    public boolean f36322f = false;

    /* JADX INFO: renamed from: i */
    private final List f36325i = new ArrayList();

    public kka(Handler handler, kbo kboVar, kiw kiwVar) {
        this.f36323g = handler;
        this.f36317a = kiwVar;
        this.f36324h = kboVar.mo6314a("QReqProcessor");
    }

    /* JADX INFO: renamed from: h */
    private final void m14405h() {
        this.f36326j = null;
        ArrayList arrayList = new ArrayList(this.f36325i);
        this.f36325i.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kjy) arrayList.get(i)).mo14400a(this.f36323g);
        }
    }

    @Override // p000.kiv
    /* JADX INFO: renamed from: a */
    public final void mo14366a() {
        synchronized (this) {
            if (this.f36322f) {
                return;
            }
            kiv kivVar = this.f36318b;
            if (kivVar == null) {
                m14405h();
                return;
            }
            this.f36321e = true;
            this.f36319c = kivVar;
            this.f36318b = null;
            kivVar.mo14366a();
        }
    }

    @Override // p000.kiv
    /* JADX INFO: renamed from: b */
    public final synchronized void mo14367b(kiz kizVar) {
        if (!this.f36322f) {
            this.f36326j = kizVar;
            kiv kivVar = this.f36318b;
            if (kivVar != null) {
                kivVar.mo14367b(kizVar);
            }
        }
    }

    @Override // p000.kiv
    /* JADX INFO: renamed from: c */
    public final synchronized void mo14368c() {
        if (!this.f36322f) {
            this.f36326j = null;
            kiv kivVar = this.f36318b;
            if (kivVar != null) {
                kivVar.mo14368c();
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f36322f) {
                return;
            }
            this.f36322f = true;
            m14405h();
            m14407g();
        }
    }

    @Override // p000.kiv
    /* JADX INFO: renamed from: d */
    public final synchronized void mo14369d(kiz kizVar) {
        if (this.f36322f) {
            kua.m14871j(kizVar, this.f36323g);
            return;
        }
        kiv kivVar = this.f36318b;
        if (kivVar != null) {
            kivVar.mo14369d(kizVar);
        } else {
            this.f36325i.add(new kjz(kizVar));
        }
    }

    @Override // p000.kiv
    /* JADX INFO: renamed from: e */
    public final synchronized void mo14370e(List list) {
        lku.m15669w(!list.isEmpty());
        if (this.f36322f) {
            kua.m14872k(list, this.f36323g);
            return;
        }
        kiv kivVar = this.f36318b;
        if (kivVar != null) {
            kivVar.mo14370e(list);
        } else {
            this.f36325i.add(new kjx(list));
        }
    }

    /* JADX INFO: renamed from: f */
    public final kiy m14406f() {
        try {
            kiv kivVar = this.f36318b;
            if (kivVar != null) {
                kiz kizVar = this.f36326j;
                if (kizVar != null) {
                    kivVar.mo14367b(kizVar);
                }
                for (kjy kjyVar : this.f36325i) {
                    kiv kivVar2 = this.f36318b;
                    kivVar2.getClass();
                    kjyVar.mo14401b(kivVar2);
                }
                this.f36325i.clear();
            }
            return this.f36320d;
        } catch (kec e) {
            this.f36324h.mo13948j("Failed to submit queued requests.", e);
            close();
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m14407g() {
        kiy kiyVar;
        synchronized (this) {
            this.f36318b = null;
            this.f36319c = null;
            this.f36321e = false;
            kiyVar = this.f36320d;
            if (this.f36322f) {
                this.f36320d = null;
            }
        }
        if (kiyVar != null) {
            kiyVar.mo14324a();
        }
        this.f36317a.mo14324a();
    }
}
