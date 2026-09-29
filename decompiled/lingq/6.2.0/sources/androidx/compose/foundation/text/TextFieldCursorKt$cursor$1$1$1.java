package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.C0188b;
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
@c32(m4290c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", m4291f = "TextFieldCursor.kt", m4292l = {60}, m4293m = "invokeSuspend", m4294v = 1)
final class TextFieldCursorKt$cursor$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2810a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0188b f2811b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCursorKt$cursor$1$1$1(C0188b c0188b, Continuation continuation) {
        super(2, continuation);
        this.f2811b = c0188b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldCursorKt$cursor$1$1$1(this.f2811b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldCursorKt$cursor$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2810a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f2810a = 1;
            if (this.f2811b.m1090a(this) == coroutineSingletons) {
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
