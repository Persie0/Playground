package p000;

import coil.compose.C0858a;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: renamed from: ow */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3438ow implements e83, hj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55049a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f55050b;

    public /* synthetic */ C3438ow(Object obj, int i) {
        this.f55049a = i;
        this.f55050b = obj;
    }

    @Override // p000.hj3
    /* JADX INFO: renamed from: b */
    public final xi3 mo13293b() {
        int i = this.f55049a;
        Object obj = this.f55050b;
        switch (i) {
            case 0:
                return new AdaptedFunctionReference(2, (C0858a) obj, C0858a.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            default:
                return new AdaptedFunctionReference(2, (AtomicReference) obj, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
        }
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.f55049a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f55050b;
        switch (i) {
            case 0:
                ((C0858a) obj2).m4954l((AbstractC3387nw) obj);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                break;
            default:
                ((AtomicReference) obj2).set((ry8) obj);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                break;
        }
        return xfaVar;
    }

    public final boolean equals(Object obj) {
        switch (this.f55049a) {
            case 0:
                if ((obj instanceof e83) && (obj instanceof hj3)) {
                    return mo13293b().equals(((hj3) obj).mo13293b());
                }
                return false;
            default:
                if ((obj instanceof e83) && (obj instanceof hj3)) {
                    return mo13293b().equals(((hj3) obj).mo13293b());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f55049a) {
            case 0:
                break;
        }
        return mo13293b().hashCode();
    }
}
