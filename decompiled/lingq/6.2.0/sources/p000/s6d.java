package p000;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class s6d extends i9c {

    /* JADX INFO: renamed from: c */
    public wdb f60439c;

    /* JADX INFO: renamed from: d */
    public boolean f60440d;

    /* JADX INFO: renamed from: e */
    public final gw9 f60441e;

    /* JADX INFO: renamed from: f */
    public final zoa f60442f;

    /* JADX INFO: renamed from: g */
    public final qfa f60443g;

    public s6d(kjc kjcVar) {
        super(kjcVar);
        this.f60440d = true;
        this.f60441e = new gw9(this, 15);
        this.f60442f = new zoa(this);
        qfa qfaVar = new qfa();
        qfaVar.f57706b = this;
        this.f60443g = qfaVar;
    }

    @Override // p000.i9c
    /* JADX INFO: renamed from: G */
    public final boolean mo5850G() {
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final void m21133H() {
        mo12359D();
        if (this.f60439c == null) {
            this.f60439c = new wdb(Looper.getMainLooper(), 2);
        }
    }
}
