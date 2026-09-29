package androidx.compose.p002ui.input.nestedscroll;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m4291f = "NestedScrollModifier.kt", m4292l = {199}, m4293m = "dispatchPreFling-QWom1Mo", m4294v = 1)
final class NestedScrollDispatcher$dispatchPreFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f4069a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0317a f4070b;

    /* JADX INFO: renamed from: c */
    public int f4071c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPreFling$1(C0317a c0317a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f4070b = c0317a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4069a = obj;
        this.f4071c |= Integer.MIN_VALUE;
        return this.f4070b.m1448b(0L, this);
    }
}
