package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", m4291f = "MouseWheelScrollingLogic.kt", m4292l = {219, 273}, m4293m = "dispatchMouseWheelScroll", m4294v = 1)
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0116v f1982a;

    /* JADX INFO: renamed from: b */
    public Ref$FloatRef f1983b;

    /* JADX INFO: renamed from: c */
    public float f1984c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f1985d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0106n f1986e;

    /* JADX INFO: renamed from: f */
    public int f1987f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(C0106n c0106n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1986e = c0106n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1985d = obj;
        this.f1987f |= Integer.MIN_VALUE;
        return C0106n.m894c(this.f1986e, null, null, 0.0f, 0.0f, this);
    }
}
