package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1296l;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e23;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeLessonCounters$2", m4291f = "CollectionViewModel.kt", m4292l = {1093}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observeLessonCounters$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25477a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25478b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f25479c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f25480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeLessonCounters$2(C2034d c2034d, String str, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f25478b = c2034d;
        this.f25479c = str;
        this.f25480d = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$observeLessonCounters$2(this.f25478b, this.f25479c, this.f25480d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$observeLessonCounters$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7311f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25477a;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25478b;
            String str = this.f25479c;
            ArrayList arrayList = this.f25480d;
            e23 e23Var = c2034d.f25583m;
            this.f25477a = 1;
            e23Var.getClass();
            if (arrayList.isEmpty() || (objM7311f = ((C1296l) e23Var.f36613a).m7311f(str, arrayList, this)) != coroutineSingletons) {
                objM7311f = xfaVar;
            }
            return objM7311f == coroutineSingletons ? coroutineSingletons : xfaVar;
        } catch (Throwable th) {
            new Result.Failure(th);
            return xfaVar;
        }
    }
}
