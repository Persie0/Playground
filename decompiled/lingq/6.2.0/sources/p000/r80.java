package p000;

import coil.intercept.C0863b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class r80 implements y84 {
    @Override // p000.y84
    /* JADX INFO: renamed from: a */
    public final Object mo4977a(C0863b c0863b, Continuation continuation) {
        e04 e04Var = c0863b.f10560d;
        Object obj = e04Var.f36503b;
        if ((obj instanceof String) && cl9.m4842Y((String) obj, "/", false)) {
            ah9 ah9Var = ah9.f672a;
            obj = vk9.m23378N0((String) ah9.f673b.getValue(), '/') + obj;
        }
        d04 d04VarM10778a = e04.m10778a(e04Var);
        d04VarM10778a.f34778c = obj;
        return c0863b.m4980b(d04VarM10778a.m9960a(), (ContinuationImpl) continuation);
    }
}
