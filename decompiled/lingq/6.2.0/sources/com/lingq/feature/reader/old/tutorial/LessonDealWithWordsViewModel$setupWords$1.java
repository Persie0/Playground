package com.lingq.feature.reader.old.tutorial;

import com.lingq.core.data.repository.C1310z;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonDealWithWordsViewModel$setupWords$1", m4291f = "LessonDealWithWordsViewModel.kt", m4292l = {62}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonDealWithWordsViewModel$setupWords$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29540a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2457b f29541b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f29542c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonDealWithWordsViewModel$setupWords$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonDealWithWordsViewModel$setupWords$1$1", m4291f = "LessonDealWithWordsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24361 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29543a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2457b f29544b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24361(C2457b c2457b, Continuation continuation) {
            super(2, continuation);
            this.f29544b = c2457b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24361 c24361 = new C24361(this.f29544b, continuation);
            c24361.f29543a = obj;
            return c24361;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24361 c24361 = (C24361) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24361.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f29543a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f29544b.f29655k.m15571i(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDealWithWordsViewModel$setupWords$1(C2457b c2457b, List list, Continuation continuation) {
        super(2, continuation);
        this.f29541b = c2457b;
        this.f29542c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonDealWithWordsViewModel$setupWords$1(this.f29541b, this.f29542c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonDealWithWordsViewModel$setupWords$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29540a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2457b c2457b = this.f29541b;
            c83 c83VarM7426e = ((C1310z) c2457b.f29650f).m7426e(c2457b.f29647c.mo4589b2(), this.f29542c);
            C24361 c24361 = new C24361(c2457b, null);
            this.f29540a = 1;
            if (AbstractC3224d.m15529h(c83VarM7426e, c24361, this) == coroutineSingletons) {
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
