package p000;

import java.io.Serializable;
import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class kj2 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47370a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f47371b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f47372c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Serializable f47373d;

    public /* synthetic */ kj2(c83 c83Var, Object obj, Serializable serializable, int i) {
        this.f47370a = i;
        this.f47371b = c83Var;
        this.f47372c = obj;
        this.f47373d = serializable;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f47370a;
        xfa xfaVar = xfa.f68157a;
        Serializable serializable = this.f47373d;
        Object obj = this.f47372c;
        c83 c83Var = this.f47371b;
        switch (i) {
            case 0:
                Object objCollect = c83Var.collect(new d51(e83Var, (lj2) obj, (LinkedHashSet) serializable, 2), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            default:
                Object objCollect2 = c83Var.collect(new d51(e83Var, (mm3) obj, (String) serializable, 3), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
        }
    }
}
