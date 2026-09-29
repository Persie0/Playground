package com.lingq.feature.collections;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.lj2;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeDownloadProgress$1", m4291f = "CollectionViewModel.kt", m4292l = {867}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observeDownloadProgress$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25452a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25453b;

    /* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observeDownloadProgress$1$1 */
    @c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeDownloadProgress$1$1", m4291f = "CollectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20211 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25454a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2034d f25455b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20211(C2034d c2034d, Continuation continuation) {
            super(2, continuation);
            this.f25455b = c2034d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20211 c20211 = new C20211(this.f25455b, continuation);
            c20211.f25454a = obj;
            return c20211;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20211 c20211 = (C20211) create((Map) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20211.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Map map = (Map) this.f25454a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f25455b.f25566Y.m15571i(map);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeDownloadProgress$1(C2034d c2034d, Continuation continuation) {
        super(2, continuation);
        this.f25453b = c2034d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionViewModel$observeDownloadProgress$1(this.f25453b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionViewModel$observeDownloadProgress$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25452a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25453b;
            C3244l c3244l = ((lj2) c2034d.f25550I.f65802b).f49736a;
            C20211 c20211 = new C20211(c2034d, null);
            this.f25452a = 1;
            if (AbstractC3224d.m15529h(c3244l, c20211, this) == coroutineSingletons) {
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
