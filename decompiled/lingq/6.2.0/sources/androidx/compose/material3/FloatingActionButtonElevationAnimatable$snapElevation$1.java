package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", m4291f = "FloatingActionButton.kt", m4292l = {1396}, m4293m = "snapElevation", m4294v = 1)
final class FloatingActionButtonElevationAnimatable$snapElevation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f3197a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0256o f3198b;

    /* JADX INFO: renamed from: c */
    public int f3199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevationAnimatable$snapElevation$1(C0256o c0256o, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3198b = c0256o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3197a = obj;
        this.f3199c |= Integer.MIN_VALUE;
        return this.f3198b.m1185b(this);
    }
}
