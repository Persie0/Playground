package kotlinx.serialization.json.internal;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlinx.serialization.json.AbstractC3262b;
import p000.C3386nv;
import p000.C3488q8;
import p000.aj3;
import p000.c32;
import p000.w32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", m4291f = "JsonTreeReader.kt", m4292l = {113}, m4293m = "invokeSuspend", m4294v = 2)
final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements aj3 {

    /* JADX INFO: renamed from: b */
    public int f48243b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ w32 f48244c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3266b f48245d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(C3266b c3266b, Continuation continuation) {
        super(3, continuation);
        this.f48245d = c3266b;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.f48245d, (Continuation) obj3);
        jsonTreeReader$readDeepRecursive$1.f48244c = (w32) obj;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C3266b c3266b = this.f48245d;
        C3488q8 c3488q8 = c3266b.f48256a;
        w32 w32Var = this.f48244c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f48243b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            byte bM19718D = c3488q8.m19718D();
            if (bM19718D == 1) {
                return c3266b.m15626d(true);
            }
            if (bM19718D == 0) {
                return c3266b.m15626d(false);
            }
            if (bM19718D != 6) {
                if (bM19718D == 8) {
                    return c3266b.m15625c();
                }
                C3488q8.m19714s(c3488q8, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f48244c = null;
            this.f48243b = 1;
            obj = C3266b.m15623a(c3266b, w32Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return (AbstractC3262b) obj;
    }
}
