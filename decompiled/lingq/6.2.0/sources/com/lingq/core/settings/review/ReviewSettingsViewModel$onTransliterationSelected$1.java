package com.lingq.core.settings.review;

import com.lingq.core.settings.ViewKeys;
import com.lingq.core.settings.domain.C1868g;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.review.ReviewSettingsViewModel$onTransliterationSelected$1", m4291f = "ReviewSettingsViewModel.kt", m4292l = {161}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSettingsViewModel$onTransliterationSelected$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23167a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1880a f23168b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewKeys f23169c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f23170d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSettingsViewModel$onTransliterationSelected$1(C1880a c1880a, ViewKeys viewKeys, String str, Continuation continuation) {
        super(2, continuation);
        this.f23168b = c1880a;
        this.f23169c = viewKeys;
        this.f23170d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewSettingsViewModel$onTransliterationSelected$1(this.f23168b, this.f23169c, this.f23170d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewSettingsViewModel$onTransliterationSelected$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23167a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1880a c1880a = this.f23168b;
            C1868g c1868g = c1880a.f23183g;
            String strMo4589b2 = c1880a.f23178b.mo4589b2();
            this.f23167a = 1;
            if (c1868g.m8631a(this.f23169c, this.f23170d, strMo4589b2, this) == coroutineSingletons) {
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
