package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1", m4291f = "AppBar.kt", m4292l = {3748, 3750}, m4293m = "onPostFling-RZ2iAVY", m4294v = 1)
final class EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f3175a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3176b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0254m f3177c;

    /* JADX INFO: renamed from: d */
    public int f3178d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(C0254m c0254m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3177c = c0254m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3176b = obj;
        this.f3178d |= Integer.MIN_VALUE;
        return this.f3177c.mo919t(0L, 0L, this);
    }
}
