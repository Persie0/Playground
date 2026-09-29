package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.e83;
import p000.r34;
import p000.xfa;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3237g implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3211a f48143a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f48144b;

    public C3237g(C3211a c3211a, int i) {
        this.f48143a = c3211a;
        this.f48144b = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (p000.dha.m10394f(r0) == r1) goto L21;
     */
    @Override // p000.e83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        CombineKt$combineInternal$2$1$1$emit$1 combineKt$combineInternal$2$1$1$emit$1;
        if (continuation instanceof CombineKt$combineInternal$2$1$1$emit$1) {
            combineKt$combineInternal$2$1$1$emit$1 = (CombineKt$combineInternal$2$1$1$emit$1) continuation;
            int i = combineKt$combineInternal$2$1$1$emit$1.f48119c;
            if ((i & Integer.MIN_VALUE) != 0) {
                combineKt$combineInternal$2$1$1$emit$1.f48119c = i - Integer.MIN_VALUE;
            } else {
                combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, continuation);
            }
        } else {
            combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, continuation);
        }
        Object obj2 = combineKt$combineInternal$2$1$1$emit$1.f48117a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = combineKt$combineInternal$2$1$1$emit$1.f48119c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj2);
            r34 r34Var = new r34(this.f48144b, obj);
            combineKt$combineInternal$2$1$1$emit$1.f48119c = 1;
            if (this.f48143a.mo4678m(r34Var, combineKt$combineInternal$2$1$1$emit$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(obj2);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj2);
        }
        return xfa.f68157a;
        combineKt$combineInternal$2$1$1$emit$1.f48119c = 2;
    }
}
