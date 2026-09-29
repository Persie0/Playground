package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassifier;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2", m4291f = "PlatformSelectionBehaviors.android.kt", m4292l = {174}, m4293m = "invokeSuspend", m4294v = 1)
final class C0191x101d3cd6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2973a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2974b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0200a f2975c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CharSequence f2976d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f2977e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0191x101d3cd6(long j, C0200a c0200a, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.f2975c = c0200a;
        this.f2976d = charSequence;
        this.f2977e = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0191x101d3cd6 c0191x101d3cd6 = new C0191x101d3cd6(this.f2977e, this.f2975c, this.f2976d, continuation);
        c0191x101d3cd6.f2974b = obj;
        return c0191x101d3cd6;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0191x101d3cd6) create((TextClassifier) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2973a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            TextClassifier textClassifier = (TextClassifier) this.f2974b;
            this.f2973a = 1;
            if (C0200a.m1092a(this.f2975c, this.f2976d, this.f2977e, textClassifier, this) == coroutineSingletons) {
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
