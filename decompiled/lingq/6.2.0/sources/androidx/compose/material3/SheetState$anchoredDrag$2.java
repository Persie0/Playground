package androidx.compose.material3;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.C0809bg;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.o59;
import p000.x63;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.SheetState$anchoredDrag$2", m4291f = "SheetDefaults.kt", m4292l = {312}, m4293m = "invokeSuspend", m4294v = 1)
final class SheetState$anchoredDrag$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f3254a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3255b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref$FloatRef f3256c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ x63 f3257d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0269z f3258e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f3259f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheetState$anchoredDrag$2(Ref$FloatRef ref$FloatRef, x63 x63Var, C0269z c0269z, float f, Continuation continuation) {
        super(3, continuation);
        this.f3256c = ref$FloatRef;
        this.f3257d = x63Var;
        this.f3258e = c0269z;
        this.f3259f = f;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0269z c0269z = this.f3258e;
        float f = this.f3259f;
        SheetState$anchoredDrag$2 sheetState$anchoredDrag$2 = new SheetState$anchoredDrag$2(this.f3256c, this.f3257d, c0269z, f, (Continuation) obj3);
        sheetState$anchoredDrag$2.f3255b = (C0809bg) obj;
        return sheetState$anchoredDrag$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$FloatRef ref$FloatRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3254a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            o59 o59Var = new o59(this.f3258e, (C0809bg) this.f3255b);
            Ref$FloatRef ref$FloatRef2 = this.f3256c;
            this.f3255b = ref$FloatRef2;
            this.f3254a = 1;
            Object objMo862a = this.f3257d.mo862a(o59Var, this.f3259f, this);
            if (objMo862a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objMo862a;
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$FloatRef = (Ref$FloatRef) this.f3255b;
            AbstractC3193b.m15359b(obj);
        }
        ref$FloatRef.f47715a = ((Number) obj).floatValue();
        return xfa.f68157a;
    }
}
