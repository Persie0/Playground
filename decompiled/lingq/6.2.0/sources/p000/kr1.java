package p000;

import com.lingq.core.domain.model.lesson.ReaderBookmarkMode;
import com.lingq.feature.reader.content.C2260a;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes2.dex */
public final class kr1 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48355a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f48356b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f48357c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Serializable f48358d;

    public /* synthetic */ kr1(Object obj, int i, Serializable serializable, int i2) {
        this.f48355a = i2;
        this.f48357c = obj;
        this.f48356b = i;
        this.f48358d = serializable;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        Object value;
        int i = this.f48355a;
        xfa xfaVar = xfa.f68157a;
        Serializable serializable = this.f48358d;
        int i2 = this.f48356b;
        Object obj2 = this.f48357c;
        switch (i) {
            case 0:
                nz0 nz0Var = (nz0) obj;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) serializable;
                if (nz0Var instanceof mz0) {
                    return xfaVar;
                }
                if (nz0Var instanceof iz0) {
                    Object objEmit = ((e83) obj2).emit(new ir1(i2, ((iz0) nz0Var).f44793a), continuation);
                    return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : xfaVar;
                }
                if (nz0Var instanceof jz0) {
                    return xfaVar;
                }
                if (fa4.m11650l(nz0Var, lz0.f50326a)) {
                    ref$ObjectRef.f47718a = gr1.f41230a;
                    return xfaVar;
                }
                if (nz0Var instanceof kz0) {
                    ref$ObjectRef.f47718a = new fr1(((kz0) nz0Var).f48788a);
                    return xfaVar;
                }
                gm5.m12750e();
                return null;
            default:
                C2260a c2260a = (C2260a) obj2;
                C3244l c3244l = c2260a.f27949o;
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, yz4.m25387a((yz4) value, null, null, null, null, null, null, false, null, false, false, null, null, null, 0, 0, false, null, null, false, false, null, 0, true, 4194303)));
                Object objM7993b = c2260a.f27946l.m7993b(i2, (ReaderBookmarkMode) serializable, continuation);
                return objM7993b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM7993b : xfaVar;
        }
    }
}
