package com.lingq.core.settings.review;

import com.lingq.core.settings.ViewKeys;
import com.lingq.core.settings.domain.C1870i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3173k6;
import p000.C3386nv;
import p000.c32;
import p000.u1a;
import p000.un1;
import p000.w1a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.review.ReviewSettingsViewModel$onSwitchChanged$1", m4291f = "ReviewSettingsViewModel.kt", m4292l = {129}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSettingsViewModel$onSwitchChanged$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23159a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1880a f23160b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewKeys f23161c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f23162d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSettingsViewModel$onSwitchChanged$1(C1880a c1880a, ViewKeys viewKeys, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f23160b = c1880a;
        this.f23161c = viewKeys;
        this.f23162d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewSettingsViewModel$onSwitchChanged$1(this.f23160b, this.f23161c, this.f23162d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewSettingsViewModel$onSwitchChanged$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23159a;
        C1880a c1880a = this.f23160b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            boolean z = ((C3173k6) c1880a.f23187k.getValue()).f46749j;
            C1870i c1870i = c1880a.f23180d;
            this.f23159a = 1;
            obj = c1870i.m8637c(this.f23161c, this.f23162d, z, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        w1a w1aVar = (w1a) obj;
        if (w1aVar instanceof u1a) {
            c1880a.f23188l.m15571i(((u1a) w1aVar).f63255a);
        }
        return xfa.f68157a;
    }
}
