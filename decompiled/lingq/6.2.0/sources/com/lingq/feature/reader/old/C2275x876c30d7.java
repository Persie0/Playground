package com.lingq.feature.reader.old;

import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.lg3;
import p000.un1;
import p000.wb5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$2 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$2", m4291f = "ReaderFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2275x876c30d7 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28246a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28247b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f28248c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ReaderFragment f28249d;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$2$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$2$1", m4291f = "ReaderFragment.kt", m4292l = {156}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f28250a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f28251b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ReaderFragment f28252c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28252c = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28252c, continuation);
            anonymousClass1.f28251b = obj;
            return anonymousClass1;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f28250a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                ReaderFragment readerFragment = this.f28252c;
                du0 du0Var = readerFragment.m9290W0().f29419x0;
                ReaderFragment$onViewCreated$7$1 readerFragment$onViewCreated$7$1 = new ReaderFragment$onViewCreated$7$1(readerFragment, null);
                this.f28251b = null;
                this.f28250a = 1;
                if (AbstractC3224d.m15529h(du0Var, readerFragment$onViewCreated$7$1, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2275x876c30d7(ReaderFragment readerFragment, Lifecycle$State lifecycle$State, Continuation continuation, ReaderFragment readerFragment2) {
        super(2, continuation);
        this.f28247b = readerFragment;
        this.f28248c = lifecycle$State;
        this.f28249d = readerFragment2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2275x876c30d7(this.f28247b, this.f28248c, continuation, this.f28249d);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2275x876c30d7) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28246a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f28247b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28249d, null);
            this.f28246a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f28248c, anonymousClass1, this) == coroutineSingletons) {
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
