package p000;

import androidx.compose.foundation.text.AbstractC0176d;
import androidx.compose.foundation.text.selection.AbstractC0202c;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class gv9 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41400a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f41401b;

    public /* synthetic */ gv9(Object obj, int i) {
        this.f41400a = i;
        this.f41401b = obj;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        int i = this.f41400a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f41401b;
        switch (i) {
            case 0:
                C0205f c0205f = (C0205f) obj;
                Object objM1097c = AbstractC0202c.m1097c(og7Var, c0205f.f3074A, c0205f.f3101z, continuation);
                return objM1097c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1097c : xfaVar;
            default:
                Object objM1072e = AbstractC0176d.m1072e(og7Var, (xt9) obj, continuation);
                return objM1072e == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1072e : xfaVar;
        }
    }
}
