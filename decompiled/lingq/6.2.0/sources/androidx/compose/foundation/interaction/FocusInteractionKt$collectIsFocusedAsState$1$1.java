package androidx.compose.foundation.interaction;

import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3229i;
import p000.C3386nv;
import p000.c32;
import p000.r83;
import p000.t66;
import p000.un1;
import p000.v56;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", m4291f = "FocusInteraction.kt", m4292l = {68}, m4293m = "invokeSuspend", m4294v = 1)
final class FocusInteractionKt$collectIsFocusedAsState$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2393a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v56 f2394b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f2395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusInteractionKt$collectIsFocusedAsState$1$1(v56 v56Var, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f2394b = v56Var;
        this.f2395c = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FocusInteractionKt$collectIsFocusedAsState$1$1(this.f2394b, this.f2395c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FocusInteractionKt$collectIsFocusedAsState$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2393a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayList = new ArrayList();
            C3229i c3229i = this.f2394b.f64886a;
            r83 r83Var = new r83(1, arrayList, this.f2395c);
            this.f2393a = 1;
            c3229i.getClass();
            if (C3229i.m15548j(c3229i, r83Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
