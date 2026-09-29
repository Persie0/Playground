package coil.compose;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3475pw;
import p000.c32;

/* JADX INFO: renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", m4291f = "AsyncImagePainter.kt", m4292l = {221}, m4293m = "emit")
public final class C0857xcb4a215b extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f10418a;

    /* JADX INFO: renamed from: b */
    public int f10419b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3475pw f10420c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0857xcb4a215b(C3475pw c3475pw, Continuation continuation) {
        super(continuation);
        this.f10420c = c3475pw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10418a = obj;
        this.f10419b |= Integer.MIN_VALUE;
        return this.f10420c.emit(null, this);
    }
}
