package p000;

import com.lingq.core.data.repository.C1287c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class xa2 {

    /* JADX INFO: renamed from: a */
    public final ao0 f67988a;

    public xa2(ao0 ao0Var, int i) {
        ao0Var.getClass();
        switch (i) {
            case 1:
                this.f67988a = ao0Var;
                break;
            case 2:
                this.f67988a = ao0Var;
                break;
            case 3:
                this.f67988a = ao0Var;
                break;
            case 4:
                this.f67988a = ao0Var;
                break;
            default:
                this.f67988a = ao0Var;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m24431a(String str, String str2, int i, int i2, SuspendLambda suspendLambda) throws Throwable {
        Object objM7133w = ((C1287c) this.f67988a).m7133w(str, str2, i, new Integer(i2), suspendLambda);
        return objM7133w == CoroutineSingletons.COROUTINE_SUSPENDED ? objM7133w : xfa.f68157a;
    }
}
