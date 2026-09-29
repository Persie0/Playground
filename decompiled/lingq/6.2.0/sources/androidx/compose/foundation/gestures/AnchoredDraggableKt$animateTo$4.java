package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0809bg;
import p000.C3386nv;
import p000.InterfaceC0025an;
import p000.a62;
import p000.bj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", m4291f = "AnchoredDraggable.kt", m4292l = {1378}, m4293m = "invokeSuspend", m4294v = 1)
final class AnchoredDraggableKt$animateTo$4 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public int f1774a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0809bg f1775b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ a62 f1776c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f1777d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0097e f1778e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0025an f1779f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$4(C0097e c0097e, InterfaceC0025an interfaceC0025an, Continuation continuation) {
        super(4, continuation);
        this.f1778e = c0097e;
        this.f1779f = interfaceC0025an;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        AnchoredDraggableKt$animateTo$4 anchoredDraggableKt$animateTo$4 = new AnchoredDraggableKt$animateTo$4(this.f1778e, this.f1779f, (Continuation) obj4);
        anchoredDraggableKt$animateTo$4.f1775b = (C0809bg) obj;
        anchoredDraggableKt$animateTo$4.f1776c = (a62) obj2;
        anchoredDraggableKt$animateTo$4.f1777d = obj3;
        return anchoredDraggableKt$animateTo$4.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1774a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0809bg c0809bg = this.f1775b;
            a62 a62Var = this.f1776c;
            Object obj2 = this.f1777d;
            C0097e c0097e = this.f1778e;
            float fM19861h = c0097e.f2242k.m19861h();
            this.f1775b = null;
            this.f1776c = null;
            this.f1774a = 1;
            if (AbstractC0095c.m826a(c0097e, fM19861h, c0809bg, a62Var, obj2, this.f1779f, this) == coroutineSingletons) {
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
