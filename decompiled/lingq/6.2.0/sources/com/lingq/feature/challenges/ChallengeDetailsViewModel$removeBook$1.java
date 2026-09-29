package com.lingq.feature.challenges;

import com.lingq.feature.challenges.domain.C1984c;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.ef0;
import p000.fr0;
import p000.hha;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$removeBook$1", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {344}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengeDetailsViewModel$removeBook$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f24403a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1962b f24404b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f24405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$removeBook$1(C1962b c1962b, int i, Continuation continuation) {
        super(1, continuation);
        this.f24404b = c1962b;
        this.f24405c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ChallengeDetailsViewModel$removeBook$1(this.f24404b, this.f24405c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ChallengeDetailsViewModel$removeBook$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object failure;
        Object value;
        Object objM8848a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24403a;
        C1962b c1962b = this.f24404b;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                int i2 = this.f24405c;
                C1984c c1984c = c1962b.f24497h;
                String strMo4589b2 = c1962b.f24491b.mo4589b2();
                String str = c1962b.f24500k.f67168a;
                hha hhaVar = new hha(i2);
                this.f24403a = 1;
                objM8848a = c1984c.m8848a(strMo4589b2, str, hhaVar, this);
                if (objM8848a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                objM8848a = obj;
            }
            failure = (ef0) objM8848a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (!(failure instanceof Result.Failure)) {
            ef0 ef0Var = (ef0) failure;
            C3244l c3244l = c1962b.f24509t;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, fr0.m12004a((fr0) value, null, null, null, null, null, ef0Var, null, null, null, null, 4063)));
        }
        Throwable thM15355a = Result.m15355a(failure);
        if (thM15355a != null) {
            if (thM15355a instanceof CancellationException) {
                throw thM15355a;
            }
            c1962b.m8808V2();
        }
        return xfa.f68157a;
    }
}
