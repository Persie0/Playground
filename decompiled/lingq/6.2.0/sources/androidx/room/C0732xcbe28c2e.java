package androidx.room;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.c9a;
import p000.eh0;
import p000.in1;
import p000.jj5;
import p000.kn1;
import p000.nn1;
import p000.pz9;
import p000.sm0;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", m4291f = "RoomDatabase.android.kt", m4292l = {2087}, m4293m = "invokeSuspend")
final class C0732xcbe28c2e extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6743a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6744b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0746d f6745c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sm0 f6746d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zi3 f6747e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0732xcbe28c2e(AbstractC0746d abstractC0746d, sm0 sm0Var, zi3 zi3Var, Continuation continuation) {
        super(2, continuation);
        this.f6745c = abstractC0746d;
        this.f6746d = sm0Var;
        this.f6747e = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0732xcbe28c2e c0732xcbe28c2e = new C0732xcbe28c2e(this.f6745c, this.f6746d, this.f6747e, continuation);
        c0732xcbe28c2e.f6744b = obj;
        return c0732xcbe28c2e;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0732xcbe28c2e) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Continuation continuation;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6743a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            in1 in1Var = ((un1) this.f6744b).mo1309x().get(jj5.f45612c);
            in1Var.getClass();
            nn1 nn1Var = (nn1) in1Var;
            kn1 kn1VarM11113J = eh0.m11113J(nn1Var, new c9a(nn1Var));
            kn1 kn1VarPlus = kn1VarM11113J.plus(new pz9(kn1VarM11113J, this.f6745c.f6962i));
            sm0 sm0Var = this.f6746d;
            this.f6744b = sm0Var;
            this.f6743a = 1;
            obj = wfb.m23905G(this.f6747e, kn1VarPlus, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            continuation = sm0Var;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            continuation = (Continuation) this.f6744b;
            AbstractC3193b.m15359b(obj);
        }
        continuation.resumeWith(obj);
        return xfa.f68157a;
    }
}
