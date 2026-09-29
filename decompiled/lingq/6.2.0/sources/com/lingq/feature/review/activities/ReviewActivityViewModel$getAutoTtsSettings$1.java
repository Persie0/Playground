package com.lingq.feature.review.activities;

import com.lingq.core.datastore.C1370c;
import com.lingq.core.domain.model.settings.ReviewSettingsKeys;
import java.util.Map;
import kotlin.AbstractC3193b;
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
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$getAutoTtsSettings$1", m4291f = "ReviewActivityViewModel.kt", m4292l = {157}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityViewModel$getAutoTtsSettings$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32290a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2750e f32291b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ReviewSettingsKeys f32292c;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityViewModel$getAutoTtsSettings$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$getAutoTtsSettings$1$1", m4291f = "ReviewActivityViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27431 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32293a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2750e f32294b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ReviewSettingsKeys f32295c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27431(C2750e c2750e, ReviewSettingsKeys reviewSettingsKeys, Continuation continuation) {
            super(2, continuation);
            this.f32294b = c2750e;
            this.f32295c = reviewSettingsKeys;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27431 c27431 = new C27431(this.f32294b, this.f32295c, continuation);
            c27431.f32293a = obj;
            return c27431;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27431 c27431 = (C27431) create((Map) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27431.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Boolean bool;
            Map map = (Map) this.f32293a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f32294b.f32391x;
            do {
                value = c3244l.getValue();
                ((Boolean) value).getClass();
                bool = (Boolean) map.get(this.f32295c.name());
            } while (!c3244l.m15570h(value, Boolean.valueOf(bool != null ? bool.booleanValue() : false)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityViewModel$getAutoTtsSettings$1(C2750e c2750e, ReviewSettingsKeys reviewSettingsKeys, Continuation continuation) {
        super(2, continuation);
        this.f32291b = c2750e;
        this.f32292c = reviewSettingsKeys;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityViewModel$getAutoTtsSettings$1(this.f32291b, this.f32292c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityViewModel$getAutoTtsSettings$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32290a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2750e c2750e = this.f32291b;
            c83 c83Var = ((C1370c) c2750e.f32376i).f18552s0;
            C27431 c27431 = new C27431(c2750e, this.f32292c, null);
            this.f32290a = 1;
            if (AbstractC3224d.m15529h(c83Var, c27431, this) == coroutineSingletons) {
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
