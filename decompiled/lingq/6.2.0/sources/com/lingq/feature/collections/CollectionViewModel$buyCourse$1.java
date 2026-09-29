package com.lingq.feature.collections;

import com.lingq.feature.collections.domain.C2035a;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c61;
import p000.l91;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$buyCourse$1", m4291f = "CollectionViewModel.kt", m4292l = {839}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$buyCourse$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25351a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25352b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2031b f25353c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f25354d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ l91 f25355e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f25356f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$buyCourse$1(C2034d c2034d, C2031b c2031b, int i, l91 l91Var, int i2, Continuation continuation) {
        super(1, continuation);
        this.f25352b = c2034d;
        this.f25353c = c2031b;
        this.f25354d = i;
        this.f25355e = l91Var;
        this.f25356f = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$buyCourse$1(this.f25352b, this.f25353c, this.f25354d, this.f25355e, this.f25356f, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$buyCourse$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object failure;
        Object value;
        Object value2;
        Object objM8955a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25351a;
        C2034d c2034d = this.f25352b;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C3244l c3244l = c2034d.f25559R;
                do {
                    value2 = c3244l.getValue();
                } while (!c3244l.m15570h(value2, c61.m4341a((c61) value2, null, null, null, null, false, false, false, true, false, false, false, false, false, false, false, false, null, 130943)));
                int i2 = this.f25354d;
                l91 l91Var = this.f25355e;
                int i3 = this.f25356f;
                C2035a c2035a = c2034d.f25545D;
                String str = l91Var.f49324a;
                this.f25351a = 1;
                objM8955a = c2035a.m8955a(i2, i3, str, this);
                if (objM8955a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                objM8955a = obj;
            }
            failure = (Boolean) objM8955a;
            failure.getClass();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.m15355a(failure) != null) {
            failure = Boolean.FALSE;
        }
        Boolean bool = (Boolean) failure;
        if (bool.booleanValue()) {
            c2034d.m8943X2();
            c2034d.m8944Y2();
        }
        C3244l c3244l2 = c2034d.f25559R;
        do {
            value = c3244l2.getValue();
        } while (!c3244l2.m15570h(value, c61.m4341a((c61) value, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, 130943)));
        this.f25353c.invoke(bool);
        return xfa.f68157a;
    }
}
