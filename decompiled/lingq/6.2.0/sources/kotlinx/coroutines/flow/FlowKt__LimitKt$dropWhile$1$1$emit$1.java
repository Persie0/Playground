package kotlinx.coroutines.flow;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m4291f = "Limit.kt", m4292l = {34, DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m4293m = "emit", m4294v = 1)
final class FlowKt__LimitKt$dropWhile$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f47885a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f47886b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3223c f47887c;

    /* JADX INFO: renamed from: d */
    public int f47888d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$dropWhile$1$1$emit$1(C3223c c3223c, Continuation continuation) {
        super(continuation);
        this.f47887c = c3223c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47886b = obj;
        this.f47888d |= Integer.MIN_VALUE;
        return this.f47887c.emit(null, this);
    }
}
