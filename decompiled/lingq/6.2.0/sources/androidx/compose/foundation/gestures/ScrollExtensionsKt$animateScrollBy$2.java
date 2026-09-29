package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC0063e;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.C3386nv;
import p000.C3794yf;
import p000.InterfaceC0025an;
import p000.c32;
import p000.wn8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", m4291f = "ScrollExtensions.kt", m4292l = {DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 1)
final class ScrollExtensionsKt$animateScrollBy$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2039a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2040b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f2041c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0025an f2042d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Ref$FloatRef f2043e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$2(float f, InterfaceC0025an interfaceC0025an, Ref$FloatRef ref$FloatRef, Continuation continuation) {
        super(2, continuation);
        this.f2041c = f;
        this.f2042d = interfaceC0025an;
        this.f2043e = ref$FloatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.f2041c, this.f2042d, this.f2043e, continuation);
        scrollExtensionsKt$animateScrollBy$2.f2040b = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollExtensionsKt$animateScrollBy$2) create((wn8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2039a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3794yf c3794yf = new C3794yf(this.f2043e, (wn8) this.f2040b, 19);
            this.f2039a = 1;
            if (AbstractC0063e.m756c(this.f2041c, this.f2042d, c3794yf, this, 4) == coroutineSingletons) {
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
