package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", m4291f = "MouseWheelScrollingLogic.kt", m4292l = {201}, m4293m = "dispatchMouseWheelScroll$waitNextScrollDelta", m4294v = 1)
final class C0088x7147264e extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0106n f2000a;

    /* JADX INFO: renamed from: b */
    public Ref$ObjectRef f2001b;

    /* JADX INFO: renamed from: c */
    public Ref$FloatRef f2002c;

    /* JADX INFO: renamed from: d */
    public C0116v f2003d;

    /* JADX INFO: renamed from: e */
    public Ref$ObjectRef f2004e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f2005f;

    /* JADX INFO: renamed from: g */
    public int f2006g;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2005f = obj;
        this.f2006g |= Integer.MIN_VALUE;
        return C0106n.m895d(null, null, null, null, null, 0L, this);
    }
}
