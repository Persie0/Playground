package p000;

import androidx.lifecycle.Lifecycle$Event;

/* JADX INFO: loaded from: classes2.dex */
public final class ol8 implements rb5, AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final String f54548a;

    /* JADX INFO: renamed from: b */
    public final nl8 f54549b;

    /* JADX INFO: renamed from: c */
    public boolean f54550c;

    public ol8(String str, nl8 nl8Var) {
        this.f54548a = str;
        this.f54549b = nl8Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m18104a(fs6 fs6Var, AbstractC3572sf abstractC3572sf) {
        fs6Var.getClass();
        abstractC3572sf.getClass();
        if (this.f54550c) {
            C3386nv.m17633t("Already attached to lifecycleOwner");
            return;
        }
        this.f54550c = true;
        abstractC3572sf.mo21323g(this);
        fs6Var.m12094I(this.f54548a, (mc1) this.f54549b.f52924b.f66369e);
    }

    @Override // p000.rb5
    /* JADX INFO: renamed from: c */
    public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            this.f54550c = false;
            ub5Var.mo256K().mo21331x(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: p */
    public final nl8 m18105p() {
        return this.f54549b;
    }
}
