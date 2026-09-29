package com.lingq.p020ui;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vk9;
import p000.wi7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.HomeViewModel$setHighlightingColorUserProperty$1", m4291f = "HomeViewModel.kt", m4292l = {366}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeViewModel$setHighlightingColorUserProperty$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33981a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2888d f33982b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$setHighlightingColorUserProperty$1(C2888d c2888d, Continuation continuation) {
        super(2, continuation);
        this.f33982b = c2888d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$setHighlightingColorUserProperty$1(this.f33982b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeViewModel$setHighlightingColorUserProperty$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33981a;
        C2888d c2888d = this.f33982b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            wi7 wi7Var = ((C1368a) c2888d.f34178m).f18323A0;
            this.f33981a = 1;
            obj = AbstractC3224d.m15541t(wi7Var, this);
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
        ((C1240a) c2888d.f34176k).m7027h("reader highlighting color", vk9.m23380c0((String) obj, "yellow", true) ? "yellow" : "default");
        return xfa.f68157a;
    }
}
