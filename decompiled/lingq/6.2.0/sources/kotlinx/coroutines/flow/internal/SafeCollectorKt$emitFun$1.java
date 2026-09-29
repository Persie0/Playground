package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.aj3;
import p000.e83;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements aj3 {

    /* JADX INFO: renamed from: i */
    public static final SafeCollectorKt$emitFun$1 f48129i = new SafeCollectorKt$emitFun$1(3, e83.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((e83) obj).emit(obj2, (Continuation) obj3);
    }
}
