package com.lingq.feature.challenges;

import com.lingq.core.data.repository.C1288d;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.fr0;
import p000.np0;
import p000.op0;
import p000.or0;
import p000.pp0;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$networkGetBadges$1", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {369}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengeDetailsViewModel$networkGetBadges$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f24380a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1962b f24381b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$networkGetBadges$1(C1962b c1962b, Continuation continuation) {
        super(1, continuation);
        this.f24381b = c1962b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ChallengeDetailsViewModel$networkGetBadges$1(this.f24381b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ChallengeDetailsViewModel$networkGetBadges$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object objM7138e;
        Object value3;
        C1962b c1962b = this.f24381b;
        C3244l c3244l = c1962b.f24509t;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24380a;
        np0 np0Var = np0.f53085a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                do {
                    value2 = c3244l.getValue();
                } while (!c3244l.m15570h(value2, fr0.m12004a((fr0) value2, null, null, null, null, op0.f54666a, null, null, null, null, null, 4079)));
                or0 or0Var = c1962b.f24493d;
                this.f24380a = 1;
                objM7138e = ((C1288d) or0Var).m7138e(this);
                if (objM7138e == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                objM7138e = obj;
            }
            List list = (List) objM7138e;
            do {
                value3 = c3244l.getValue();
            } while (!c3244l.m15570h(value3, fr0.m12004a((fr0) value3, null, null, null, null, list.isEmpty() ? np0Var : new pp0(list), null, null, null, null, null, 4079)));
        } catch (Exception unused) {
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, fr0.m12004a((fr0) value, null, null, null, null, np0Var, null, null, null, null, null, 4079)));
        }
        return xfa.f68157a;
    }
}
