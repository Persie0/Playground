package com.lingq.p020ui;

import android.content.Context;
import androidx.glance.appwidget.AbstractC0652b;
import com.lingq.feature.widget.C2863a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$5$1", m4291f = "HomeFragment.kt", m4292l = {246}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeFragment$onViewCreated$5$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33907a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HomeFragment f33908b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$5$1(HomeFragment homeFragment, Continuation continuation) {
        super(2, continuation);
        this.f33908b = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFragment$onViewCreated$5$1(this.f33908b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeFragment$onViewCreated$5$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33907a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2863a c2863a = new C2863a();
            Context contextM2090R = this.f33908b.m2090R();
            this.f33907a = 1;
            if (AbstractC0652b.m2218c(c2863a, contextM2090R, this) == coroutineSingletons) {
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
