package com.lingq.feature.karaoke;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.database.dao.C1321i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.bx0;
import p000.c32;
import p000.c83;
import p000.h05;
import p000.l85;
import p000.q05;
import p000.u45;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$updateLesson$1", m4291f = "KaraokeViewModel.kt", m4292l = {255}, m4293m = "invokeSuspend", m4294v = 2)
final class KaraokeViewModel$updateLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26275a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2118c f26276b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f26277c;

    /* JADX INFO: renamed from: com.lingq.feature.karaoke.KaraokeViewModel$updateLesson$1$1 */
    @c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$updateLesson$1$1", m4291f = "KaraokeViewModel.kt", m4292l = {259}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21151 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f26278a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f26279b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2118c f26280c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f26281d;

        /* JADX INFO: renamed from: com.lingq.feature.karaoke.KaraokeViewModel$updateLesson$1$1$1, reason: invalid class name */
        @c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$updateLesson$1$1$1", m4291f = "KaraokeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f26282a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C2118c f26283b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C2118c c2118c, Continuation continuation) {
                super(2, continuation);
                this.f26283b = c2118c;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26283b, continuation);
                anonymousClass1.f26282a = obj;
                return anonymousClass1;
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) throws Throwable {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((u45) obj, (Continuation) obj2);
                xfa xfaVar = xfa.f68157a;
                anonymousClass1.invokeSuspend(xfaVar);
                return xfaVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                u45 u45Var = (u45) this.f26282a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                AbstractC3193b.m15359b(obj);
                this.f26283b.f26302p.m15571i(u45Var);
                return xfa.f68157a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21151(C2118c c2118c, int i, Continuation continuation) {
            super(2, continuation);
            this.f26280c = c2118c;
            this.f26281d = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21151 c21151 = new C21151(this.f26280c, this.f26281d, continuation);
            c21151.f26279b = obj;
            return c21151;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C21151) create((u45) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            u45 u45Var = (u45) this.f26279b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f26278a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2118c c2118c = this.f26280c;
                c2118c.f26302p.m15571i(u45Var);
                if (u45Var == null) {
                    C1321i c1321i = ((C1295k) c2118c.f26291e).f16501e;
                    c83 c83VarM15536o = AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(c1321i.f17034K, false, new String[]{"LibraryDataEntity"}, new l85(this.f26281d, c1321i, 4)), 8));
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(c2118c, null);
                    this.f26279b = null;
                    this.f26278a = 1;
                    if (AbstractC3224d.m15529h(c83VarM15536o, anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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
    public KaraokeViewModel$updateLesson$1(C2118c c2118c, int i, Continuation continuation) {
        super(2, continuation);
        this.f26276b = c2118c;
        this.f26277c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KaraokeViewModel$updateLesson$1(this.f26276b, this.f26277c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((KaraokeViewModel$updateLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26275a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2118c c2118c = this.f26276b;
            q05 q05Var = (q05) ((C1295k) c2118c.f26291e).f16498b;
            int i2 = this.f26277c;
            c83 c83VarM15536o = AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(q05Var.f57071K, false, new String[]{"LessonEntity"}, new h05(i2, q05Var, 3)), 7));
            C21151 c21151 = new C21151(c2118c, i2, null);
            this.f26275a = 1;
            if (AbstractC3224d.m15529h(c83VarM15536o, c21151, this) == coroutineSingletons) {
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
