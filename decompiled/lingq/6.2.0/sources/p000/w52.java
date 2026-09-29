package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class w52 implements ul0 {

    /* JADX INFO: renamed from: a */
    public final Executor f66402a;

    /* JADX INFO: renamed from: b */
    public final ul0 f66403b;

    public w52(Executor executor, ul0 ul0Var) {
        this.f66402a = executor;
        this.f66403b = ul0Var;
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: J */
    public final boolean mo4146J() {
        return this.f66403b.mo4146J();
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: Z */
    public final co7 mo4147Z() {
        return this.f66403b.mo4147Z();
    }

    @Override // p000.ul0
    public final void cancel() {
        this.f66403b.cancel();
    }

    @Override // p000.ul0
    public final ul0 clone() {
        return new w52(this.f66402a, this.f66403b.clone());
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: n */
    public final i88 mo4151n() {
        return this.f66403b.mo4151n();
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: r */
    public final void mo4152r(am0 am0Var) {
        this.f66403b.mo4152r(new C3156jq(this, am0Var, false));
    }
}
