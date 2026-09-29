package androidx.compose.animation.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.AbstractC3081hn;
import p000.C0817bn;
import p000.InterfaceC3579sm;
import p000.c32;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.animation.core.SuspendAnimationKt", m4291f = "SuspendAnimation.kt", m4292l = {231, 280}, m4293m = "animate", m4294v = 1)
final class SuspendAnimationKt$animate$4<T, V extends AbstractC3081hn> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0817bn f1528a;

    /* JADX INFO: renamed from: b */
    public InterfaceC3579sm f1529b;

    /* JADX INFO: renamed from: c */
    public vi3 f1530c;

    /* JADX INFO: renamed from: d */
    public Ref$ObjectRef f1531d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f1532e;

    /* JADX INFO: renamed from: f */
    public int f1533f;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1532e = obj;
        this.f1533f |= Integer.MIN_VALUE;
        return AbstractC0063e.m755b(null, null, 0L, null, this);
    }
}
