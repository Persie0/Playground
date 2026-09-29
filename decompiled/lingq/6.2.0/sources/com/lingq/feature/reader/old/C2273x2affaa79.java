package com.lingq.feature.reader.old;

import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.lda;
import p000.lg3;
import p000.un1;
import p000.wb5;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$1", m4291f = "ReaderFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2273x2affaa79 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28233a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28234b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f28235c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ReaderFragment f28236d;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$1$1", m4291f = "ReaderFragment.kt", m4292l = {157}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f28237a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f28238b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ReaderFragment f28239c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28239c = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28239c, continuation);
            anonymousClass1.f28238b = obj;
            return anonymousClass1;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f28237a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                ReaderFragment readerFragment = this.f28239c;
                C2412n c2412nM9290W0 = readerFragment.m9290W0();
                c2412nM9290W0.getClass();
                wfb.m23926u(lda.m16103C(c2412nM9290W0), null, null, new ReaderViewModel$checkLessonUpdate$1(c2412nM9290W0, null), 3);
                C2412n c2412nM9290W1 = readerFragment.m9290W0();
                this.f28238b = null;
                this.f28237a = 1;
                if (c2412nM9290W1.f29391o.mo3012w1(this) == coroutineSingletons) {
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
    public C2273x2affaa79(ReaderFragment readerFragment, Lifecycle$State lifecycle$State, Continuation continuation, ReaderFragment readerFragment2) {
        super(2, continuation);
        this.f28234b = readerFragment;
        this.f28235c = lifecycle$State;
        this.f28236d = readerFragment2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2273x2affaa79(this.f28234b, this.f28235c, continuation, this.f28236d);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2273x2affaa79) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28233a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f28234b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28236d, null);
            this.f28233a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f28235c, anonymousClass1, this) == coroutineSingletons) {
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
