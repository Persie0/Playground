package p000;

import com.lingq.core.data.repository.C1295k;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;

/* JADX INFO: renamed from: j9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3139j9 {

    /* JADX INFO: renamed from: a */
    public final d65 f45229a;

    public C3139j9(d65 d65Var, int i) {
        d65Var.getClass();
        switch (i) {
            case 1:
                this.f45229a = d65Var;
                break;
            case 2:
                this.f45229a = d65Var;
                break;
            case 3:
                this.f45229a = d65Var;
                break;
            case 4:
                this.f45229a = d65Var;
                break;
            case 5:
                this.f45229a = d65Var;
                break;
            case 6:
                this.f45229a = d65Var;
                break;
            case 7:
                this.f45229a = d65Var;
                break;
            default:
                this.f45229a = d65Var;
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m14345c(C3139j9 c3139j9, String str, int i, double d, double d2, Continuation continuation, int i2) throws Throwable {
        if ((i2 & 4) != 0) {
            d = 0.0d;
        }
        if ((i2 & 8) != 0) {
            d2 = 0.0d;
        }
        Object objM7293o0 = ((C1295k) c3139j9.f45229a).m7293o0(str, i, d, d2, false, (ContinuationImpl) continuation);
        return objM7293o0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM7293o0 : xfa.f68157a;
    }

    /* JADX INFO: renamed from: a */
    public c83 m14346a(int i, String str, int i2) {
        str.getClass();
        return AbstractC3224d.m15536o(new jj2(((C1295k) this.f45229a).m7259Q(i, str), i2, 2));
    }

    /* JADX INFO: renamed from: b */
    public Object m14347b(int i, int i2, String str, SuspendLambda suspendLambda, boolean z) throws Throwable {
        Object objM7297q0 = ((C1295k) this.f45229a).m7297q0(i, i2, z, str, suspendLambda);
        return objM7297q0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM7297q0 : xfa.f68157a;
    }
}
