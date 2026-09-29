package androidx.compose.p002ui.text.font;

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
@c32(m4290c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", m4291f = "FontListFontFamilyTypefaceAdapter.kt", m4292l = {159}, m4293m = "invokeSuspend", m4294v = 1)
final class FontListFontFamilyTypefaceAdapter$resolve$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5050a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0433a f5051b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$resolve$1(C0433a c0433a, Continuation continuation) {
        super(2, continuation);
        this.f5051b = c0433a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FontListFontFamilyTypefaceAdapter$resolve$1(this.f5051b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FontListFontFamilyTypefaceAdapter$resolve$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5050a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f5050a = 1;
            if (this.f5051b.m1881c(this) == coroutineSingletons) {
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
