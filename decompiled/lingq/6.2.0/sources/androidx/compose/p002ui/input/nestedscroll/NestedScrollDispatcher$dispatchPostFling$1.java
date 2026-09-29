package androidx.compose.p002ui.input.nestedscroll;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m4291f = "NestedScrollModifier.kt", m4292l = {222, 224}, m4293m = "dispatchPostFling-RZ2iAVY", m4294v = 1)
final class NestedScrollDispatcher$dispatchPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f4066a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0317a f4067b;

    /* JADX INFO: renamed from: c */
    public int f4068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPostFling$1(C0317a c0317a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f4067b = c0317a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4066a = obj;
        this.f4068c |= Integer.MIN_VALUE;
        return this.f4067b.m1447a(0L, 0L, this);
    }
}
