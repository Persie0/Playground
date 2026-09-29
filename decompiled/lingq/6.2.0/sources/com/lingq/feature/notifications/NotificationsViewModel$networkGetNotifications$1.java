package com.lingq.feature.notifications;

import com.lingq.core.data.repository.C1300p;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.en6;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.notifications.NotificationsViewModel$networkGetNotifications$1", m4291f = "NotificationsViewModel.kt", m4292l = {161, 166}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsViewModel$networkGetNotifications$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f26868a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2168b f26869b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel$networkGetNotifications$1(C2168b c2168b, Continuation continuation) {
        super(1, continuation);
        this.f26869b = c2168b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new NotificationsViewModel$networkGetNotifications$1(this.f26869b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((NotificationsViewModel$networkGetNotifications$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r0.f26886f.mo7002H0(r9, r8) == r2) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2168b c2168b = this.f26869b;
        C3244l c3244l = c2168b.f26889i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26868a;
        boolean z = true;
        try {
            if (i != 0) {
                if (i == 1) {
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
            en6 en6Var = c2168b.f26883c;
            String strMo4589b2 = c2168b.f26882b.mo4589b2();
            int iIntValue = ((Number) c3244l.getValue()).intValue();
            this.f26868a = 1;
            obj = ((C1300p) en6Var).m7336c(iIntValue, strMo4589b2, this);
            if (obj == coroutineSingletons) {
            }
            return coroutineSingletons;
            Pair pair = (Pair) obj;
            int iIntValue2 = ((Number) pair.f47623a).intValue();
            int iIntValue3 = ((Number) pair.f47624b).intValue();
            C3244l c3244l2 = c2168b.f26888h;
            if (iIntValue2 != 0 || ((Number) c3244l.getValue()).intValue() != 1) {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            c3244l2.getClass();
            c3244l2.m15572j(null, boolValueOf);
            this.f26868a = 2;
        } catch (Exception unused) {
        }
    }
}
