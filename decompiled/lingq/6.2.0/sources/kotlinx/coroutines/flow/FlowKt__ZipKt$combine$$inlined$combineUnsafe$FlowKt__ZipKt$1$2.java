package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.bj3;
import p000.c32;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", m4291f = "Zip.kt", m4292l = {329, 258}, m4293m = "invokeSuspend", m4294v = 1)
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public e83 f47959a;

    /* JADX INFO: renamed from: b */
    public int f47960b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ e83 f47961c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object[] f47962d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ bj3 f47963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2(Continuation continuation, bj3 bj3Var) {
        super(3, continuation);
        this.f47963e = bj3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 = new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2((Continuation) obj3, this.f47963e);
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2.f47961c = (e83) obj;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2.f47962d = (Object[]) obj2;
        return flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r0.emit(r8, r7) == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f47961c;
        Object[] objArr = this.f47962d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f47960b;
        if (i != 0) {
            if (i == 1) {
                e83Var = this.f47959a;
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
        Object obj4 = objArr[2];
        this.f47961c = null;
        this.f47962d = null;
        this.f47959a = e83Var;
        this.f47960b = 1;
        obj = this.f47963e.mo825e(obj2, obj3, obj4, this);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        this.f47961c = null;
        this.f47962d = null;
        this.f47959a = null;
        this.f47960b = 2;
    }
}
