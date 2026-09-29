package com.lingq.feature.challenges.bookchallenge;

import com.lingq.feature.challenges.domain.C1982a;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.df0;
import p000.t13;
import p000.vi3;
import p000.vk9;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.bookchallenge.BookChallengeChooserParentViewModel$search$2", m4291f = "BookChallengeChooserParentViewModel.kt", m4292l = {83, 85}, m4293m = "invokeSuspend", m4294v = 2)
final class BookChallengeChooserParentViewModel$search$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f24532a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f24533b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1972c f24534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookChallengeChooserParentViewModel$search$2(String str, C1972c c1972c, Continuation continuation) {
        super(1, continuation);
        this.f24533b = str;
        this.f24534c = c1972c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BookChallengeChooserParentViewModel$search$2(this.f24533b, this.f24534c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((BookChallengeChooserParentViewModel$search$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r0 == r3) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object failure;
        Object value;
        df0 df0Var;
        String message;
        Object value2;
        Object value3;
        Object objM8846a;
        C1972c c1972c = this.f24534c;
        C3244l c3244l = c1972c.f24549i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24532a;
        String str = this.f24533b;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (!vk9.m23391n0(str)) {
                    this.f24532a = 1;
                    if (AbstractC3208a.m15437d(600L, this) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                objM8846a = obj;
            }
            failure = (t13) objM8846a;
            if (!(failure instanceof Result.Failure)) {
                t13 t13Var = (t13) failure;
                do {
                    value2 = c3244l.getValue();
                } while (!c3244l.m15570h(value2, df0.m10318a((df0) value2, null, t13Var.f61743a, t13Var.f61744b, null, null, false, null, 0, 985)));
            }
            Throwable thM15355a = Result.m15355a(failure);
            if (thM15355a != null) {
                if (thM15355a instanceof CancellationException) {
                    throw thM15355a;
                }
                do {
                    value = c3244l.getValue();
                    df0Var = (df0) value;
                    message = thM15355a.getMessage();
                    if (message == null) {
                        message = "Couldn't update the Book Challenge. Please try again.";
                    }
                } while (!c3244l.m15570h(value, df0.m10318a(df0Var, null, null, null, null, null, false, message, 0, 927)));
            }
            return xfa.f68157a;
            do {
                value3 = c3244l.getValue();
            } while (!c3244l.m15570h(value3, df0.m10318a((df0) value3, null, null, null, null, null, true, null, 0, 927)));
            C1982a c1982a = c1972c.f24544d;
            String strMo4589b2 = c1972c.f24542b.mo4589b2();
            this.f24532a = 2;
            objM8846a = c1982a.m8846a(strMo4589b2, str, this);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
    }
}
