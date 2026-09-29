package com.lingq.feature.collections;

import com.lingq.feature.collections.domain.C2038d;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c61;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeProfileUsername$1", m4291f = "CollectionViewModel.kt", m4292l = {579}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observeProfileUsername$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25511a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f25512b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2034d f25513c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeProfileUsername$1(C2034d c2034d, Continuation continuation) {
        super(2, continuation);
        this.f25513c = c2034d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CollectionViewModel$observeProfileUsername$1 collectionViewModel$observeProfileUsername$1 = new CollectionViewModel$observeProfileUsername$1(this.f25513c, continuation);
        collectionViewModel$observeProfileUsername$1.f25512b = obj;
        return collectionViewModel$observeProfileUsername$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionViewModel$observeProfileUsername$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object failure;
        Object value;
        Object objM8961b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25511a;
        C2034d c2034d = this.f25513c;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2038d c2038d = c2034d.f25546E;
                this.f25512b = null;
                this.f25511a = 1;
                objM8961b = c2038d.m8961b(this);
                if (objM8961b == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                objM8961b = obj;
            }
            failure = (String) objM8961b;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        String str = (String) (failure instanceof Result.Failure ? null : failure);
        if (str == null) {
            str = "";
        }
        String str2 = str;
        C3244l c3244l = c2034d.f25559R;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, c61.m4341a((c61) value, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, str2, 65535)));
        return xfa.f68157a;
    }
}
