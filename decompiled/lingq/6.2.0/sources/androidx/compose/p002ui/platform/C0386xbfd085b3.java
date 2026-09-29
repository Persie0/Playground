package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.compose.p002ui.R$id;
import androidx.compose.runtime.C0281i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.a7b;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", m4291f = "WindowRecomposer.android.kt", m4292l = {223}, m4293m = "invokeSuspend", m4294v = 1)
final class C0386xbfd085b3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f4599a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0281i f4600b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f4601c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0386xbfd085b3(C0281i c0281i, View view, Continuation continuation) {
        super(2, continuation);
        this.f4600b = c0281i;
        this.f4601c = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0386xbfd085b3(this.f4600b, this.f4601c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0386xbfd085b3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f4599a;
        C0281i c0281i = this.f4600b;
        View view = this.f4601c;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f4599a = 1;
                if (c0281i.m1273D(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            if (a7b.m165a(view) == c0281i) {
                view.setTag(R$id.androidx_compose_ui_view_composition_context, null);
            }
            return xfa.f68157a;
        } catch (Throwable th) {
            if (a7b.m165a(view) == c0281i) {
                view.setTag(R$id.androidx_compose_ui_view_composition_context, null);
            }
            throw th;
        }
    }
}
