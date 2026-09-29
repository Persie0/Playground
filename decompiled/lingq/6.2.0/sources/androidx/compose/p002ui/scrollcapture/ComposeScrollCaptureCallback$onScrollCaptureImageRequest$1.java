package androidx.compose.p002ui.scrollcapture;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bna;
import p000.c32;
import p000.j84;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", m4291f = "ComposeScrollCaptureCallback.android.kt", m4292l = {120}, m4293m = "invokeSuspend", m4294v = 1)
final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f4884a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ScrollCaptureCallbackC0417a f4885b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ScrollCaptureSession f4886c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Rect f4887d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Consumer f4888e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(ScrollCaptureCallbackC0417a scrollCaptureCallbackC0417a, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, Continuation continuation) {
        super(2, continuation);
        this.f4885b = scrollCaptureCallbackC0417a;
        this.f4886c = scrollCaptureSession;
        this.f4887d = rect;
        this.f4888e = consumer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this.f4885b, this.f4886c, this.f4887d, this.f4888e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f4884a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ScrollCaptureSession scrollCaptureSession = this.f4886c;
            Rect rect = this.f4887d;
            j84 j84Var = new j84(rect.left, rect.top, rect.right, rect.bottom);
            this.f4884a = 1;
            obj = ScrollCaptureCallbackC0417a.m1828a(this.f4885b, scrollCaptureSession, j84Var, this);
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
        this.f4888e.accept(bna.m3980v0((j84) obj));
        return xfa.f68157a;
    }
}
