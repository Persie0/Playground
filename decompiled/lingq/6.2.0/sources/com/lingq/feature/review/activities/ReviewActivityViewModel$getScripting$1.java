package com.lingq.feature.review.activities;

import com.lingq.core.datastore.C1370c;
import com.lingq.core.domain.model.settings.ReviewSettingsKeys;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$getScripting$1", m4291f = "ReviewActivityViewModel.kt", m4292l = {165}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityViewModel$getScripting$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32299a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2750e f32300b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ReviewSettingsKeys f32301c;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityViewModel$getScripting$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$getScripting$1$1", m4291f = "ReviewActivityViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27451 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32302a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2750e f32303b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ReviewSettingsKeys f32304c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27451(C2750e c2750e, ReviewSettingsKeys reviewSettingsKeys, Continuation continuation) {
            super(2, continuation);
            this.f32303b = c2750e;
            this.f32304c = reviewSettingsKeys;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27451 c27451 = new C27451(this.f32303b, this.f32304c, continuation);
            c27451.f32302a = obj;
            return c27451;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27451 c27451 = (C27451) create((Map) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27451.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            String str;
            Map map = (Map) this.f32302a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2750e c2750e = this.f32303b;
            C3244l c3244l = c2750e.f32393z;
            do {
                value = c3244l.getValue();
                str = (String) map.get(this.f32304c.name());
                if (str == null) {
                    str = "Off";
                }
            } while (!c3244l.m15570h(value, new Pair(str, c2750e.f32381n.getValue())));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityViewModel$getScripting$1(C2750e c2750e, ReviewSettingsKeys reviewSettingsKeys, Continuation continuation) {
        super(2, continuation);
        this.f32300b = c2750e;
        this.f32301c = reviewSettingsKeys;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityViewModel$getScripting$1(this.f32300b, this.f32301c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityViewModel$getScripting$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32299a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2750e c2750e = this.f32300b;
            c83 c83Var = ((C1370c) c2750e.f32376i).f18513Y;
            C27451 c27451 = new C27451(c2750e, this.f32301c, null);
            this.f32299a = 1;
            if (AbstractC3224d.m15529h(c83Var, c27451, this) == coroutineSingletons) {
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
