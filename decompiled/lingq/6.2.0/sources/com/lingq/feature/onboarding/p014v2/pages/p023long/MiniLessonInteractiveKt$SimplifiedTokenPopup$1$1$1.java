package com.lingq.feature.onboarding.p014v2.pages.p023long;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.fda;
import p000.io2;
import p000.ss5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.pages.long.MiniLessonInteractiveKt$SimplifiedTokenPopup$1$1$1", m4291f = "MiniLessonInteractive.kt", m4292l = {485, 486}, m4293m = "invokeSuspend", m4294v = 2)
final class MiniLessonInteractiveKt$SimplifiedTokenPopup$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27515a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0059a f27516b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniLessonInteractiveKt$SimplifiedTokenPopup$1$1$1(C0059a c0059a, Continuation continuation) {
        super(2, continuation);
        this.f27516b = c0059a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MiniLessonInteractiveKt$SimplifiedTokenPopup$1$1$1(this.f27516b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MiniLessonInteractiveKt$SimplifiedTokenPopup$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (androidx.compose.animation.core.C0059a.m744c(r10.f27516b, r5, r6, null, r10, 12) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27515a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Float f = new Float(0.0f);
            this.f27515a = 1;
            if (this.f27516b.m747f(f, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        Float f2 = new Float(1.0f);
        fda fdaVarM21703b0 = ss5.m21703b0(160, 0, io2.f44349a, 2);
        this.f27515a = 2;
    }
}
