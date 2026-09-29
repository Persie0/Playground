package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", m4291f = "Zip.kt", m4292l = {29, 29}, m4293m = "invokeSuspend", m4294v = 1)
final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public e83 f47974a;

    /* JADX INFO: renamed from: b */
    public int f47975b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ e83 f47976c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object[] f47977d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ aj3 f47978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$1$1(aj3 aj3Var, Continuation continuation) {
        super(3, continuation);
        this.f47978e = aj3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.f47978e, (Continuation) obj3);
        flowKt__ZipKt$combine$1$1.f47976c = (e83) obj;
        flowKt__ZipKt$combine$1$1.f47977d = (Object[]) obj2;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r0.emit(r8, r7) == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f47976c;
        Object[] objArr = this.f47977d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f47975b;
        if (i != 0) {
            if (i == 1) {
                e83Var = this.f47974a;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        Object obj2 = objArr[0];
        Object obj3 = objArr[1];
        this.f47976c = null;
        this.f47977d = null;
        this.f47974a = e83Var;
        this.f47975b = 1;
        obj = this.f47978e.invoke(obj2, obj3, this);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        this.f47976c = null;
        this.f47977d = null;
        this.f47974a = null;
        this.f47975b = 2;
    }
}
