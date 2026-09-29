package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.gm5;
import p000.un1;
import p000.xfa;
import p000.zi3;
import p000.zs9;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1", m4291f = "PlatformSelectionBehaviors.android.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class C0193x2b917ae1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0200a f2986a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0193x2b917ae1(C0200a c0200a, Continuation continuation) {
        super(2, continuation);
        this.f2986a = c0200a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0193x2b917ae1(this.f2986a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0193x2b917ae1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C0200a c0200a = this.f2986a;
        Context context = c0200a.f3062b;
        SelectedTextType selectedTextType = c0200a.f3063c;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int i = zs9.f72112a[selectedTextType.ordinal()];
        if (i == 1) {
            str = "edittext";
        } else {
            if (i != 2) {
                gm5.m12750e();
                return null;
            }
            str = "textview";
        }
        TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
        c0200a.f3066f = textClassifierCreateTextClassificationSession;
        return textClassifierCreateTextClassificationSession;
    }
}
