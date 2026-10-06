package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cph implements eop {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ cpj f8569a;

    /* JADX INFO: renamed from: b */
    private boolean f8570b = false;

    /* JADX INFO: renamed from: c */
    private boolean f8571c = false;

    public cph(cpj cpjVar) {
        this.f8569a = cpjVar;
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo5221a(boolean z) {
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5222b(boolean z) {
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo5223c() {
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: d */
    public final void mo5224d(boolean z) {
        if (this.f8570b == z) {
            return;
        }
        this.f8570b = z;
        if (!z && this.f8571c) {
            this.f8571c = false;
            return;
        }
        synchronized (this.f8569a.f8608t) {
            csj csjVar = (csj) ((jwf) this.f8569a.f8603o.f9277g).f34942d;
            if ((!z && csjVar != csj.RECORDING_SESSION_ACTIVE) || (z && csjVar == csj.RECORDING_SESSION_ACTIVE)) {
                Iterator it = this.f8569a.f8592d.iterator();
                while (it.hasNext()) {
                    ((cre) it.next()).mo5267i(true);
                }
                if (z) {
                    this.f8571c = true;
                }
            }
        }
        this.f8569a.f8594f.mo11254z(z);
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: e */
    public final void mo5225e(boolean z) {
        if (z) {
            this.f8569a.f8593e.mo11738S();
        }
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: f */
    public final void mo5226f(boolean z) {
        if (z) {
            this.f8569a.f8593e.mo11739T();
        }
    }
}
