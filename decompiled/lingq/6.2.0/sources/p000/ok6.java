package p000;

import com.lingq.core.network.adapters.C1553a;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class ok6 implements ul0 {

    /* JADX INFO: renamed from: a */
    public final ul0 f54494a;

    /* JADX INFO: renamed from: b */
    public final Type f54495b;

    public ok6(ul0 ul0Var, Type type) {
        this.f54494a = ul0Var;
        this.f54495b = type;
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: J */
    public final boolean mo4146J() {
        return this.f54494a.mo4146J();
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: Z */
    public final co7 mo4147Z() {
        co7 co7VarMo4147Z = this.f54494a.mo4147Z();
        co7VarMo4147Z.getClass();
        return co7VarMo4147Z;
    }

    @Override // p000.ul0
    public final void cancel() {
        this.f54494a.cancel();
    }

    @Override // p000.ul0
    public final ul0 clone() {
        return new ok6(this.f54494a.clone(), this.f54495b);
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: n */
    public final i88 mo4151n() {
        throw new UnsupportedOperationException("This adapter does not support synchronous execution");
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: r */
    public final void mo4152r(am0 am0Var) {
        this.f54494a.mo4152r(new C1553a(am0Var, this));
    }
}
