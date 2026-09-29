package p000;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class h83 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41937a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jl7 f41938b;

    public /* synthetic */ h83(jl7 jl7Var, int i) {
        this.f41937a = i;
        this.f41938b = jl7Var;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.f41937a;
        xfa xfaVar = xfa.f68157a;
        jl7 jl7Var = this.f41938b;
        switch (i) {
            case 0:
                jl7Var.setValue(obj);
                break;
            case 1:
                jl7Var.setValue(obj);
                break;
            default:
                jl7Var.setValue(obj);
                break;
        }
        return xfaVar;
    }
}
