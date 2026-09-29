package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.InterfaceC0025an;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.AppBarKt", m4291f = "AppBar.kt", m4292l = {3857, 3873}, m4293m = "settleAppBar", m4294v = 1)
final class AppBarKt$settleAppBar$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f3107a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0025an f3108b;

    /* JADX INFO: renamed from: c */
    public Ref$FloatRef f3109c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f3110d;

    /* JADX INFO: renamed from: e */
    public int f3111e;

    public AppBarKt$settleAppBar$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3110d = obj;
        this.f3111e |= Integer.MIN_VALUE;
        return AbstractC0218a.m1128h(null, 0.0f, null, null, this);
    }
}
