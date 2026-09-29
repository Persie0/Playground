package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes2.dex */
public final class l23 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref$IntRef f48932a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f48933b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f48934c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Ref$BooleanRef f48935d;

    public l23(Ref$IntRef ref$IntRef, Ref$ObjectRef ref$ObjectRef, zi3 zi3Var, Ref$BooleanRef ref$BooleanRef) {
        this.f48932a = ref$IntRef;
        this.f48933b = ref$ObjectRef;
        this.f48934c = zi3Var;
        this.f48935d = ref$BooleanRef;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        nz0 nz0Var = (nz0) obj;
        boolean z = nz0Var instanceof mz0;
        xfa xfaVar = xfa.f68157a;
        if (z) {
            this.f48932a.f47716a = ((mz0) nz0Var).f52057a;
            return xfaVar;
        }
        if (nz0Var instanceof iz0) {
            String str = ((iz0) nz0Var).f44793a;
            this.f48933b.f47718a = str;
            Object objInvoke = this.f48934c.invoke(str, continuation);
            if (objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objInvoke;
            }
        } else if (!(nz0Var instanceof jz0)) {
            boolean zM11650l = fa4.m11650l(nz0Var, lz0.f50326a);
            Ref$BooleanRef ref$BooleanRef = this.f48935d;
            if (zM11650l) {
                ref$BooleanRef.f47713a = true;
                return xfaVar;
            }
            if (nz0Var instanceof kz0) {
                ref$BooleanRef.f47713a = true;
                return xfaVar;
            }
            gm5.m12750e();
            return null;
        }
        return xfaVar;
    }
}
