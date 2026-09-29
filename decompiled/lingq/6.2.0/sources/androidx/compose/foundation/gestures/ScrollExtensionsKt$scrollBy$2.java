package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.c32;
import p000.wn8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", m4291f = "ScrollExtensions.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class ScrollExtensionsKt$scrollBy$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f2047a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$FloatRef f2048b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f2049c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$scrollBy$2(Ref$FloatRef ref$FloatRef, float f, Continuation continuation) {
        super(2, continuation);
        this.f2048b = ref$FloatRef;
        this.f2049c = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(this.f2048b, this.f2049c, continuation);
        scrollExtensionsKt$scrollBy$2.f2047a = obj;
        return scrollExtensionsKt$scrollBy$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = (ScrollExtensionsKt$scrollBy$2) create((wn8) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        scrollExtensionsKt$scrollBy$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f2048b.f47715a = ((wn8) this.f2047a).mo3997a(this.f2049c);
        return xfa.f68157a;
    }
}
