package p000;

import androidx.compose.foundation.gestures.AbstractC0102j;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import com.lingq.core.p012ui.dragdrop.C1918a;
import com.lingq.core.p012ui.dragdrop.C1919b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes2.dex */
public final class gk2 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vi3 f40904a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1919b f40905b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f40906c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ un1 f40907d;

    public gk2(vi3 vi3Var, C1919b c1919b, int i, un1 un1Var) {
        this.f40904a = vi3Var;
        this.f40905b = c1919b;
        this.f40906c = i;
        this.f40907d = un1Var;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        vi3 vi3Var = this.f40904a;
        int i = this.f40906c;
        C1919b c1919b = this.f40905b;
        Object objM870e = AbstractC0102j.m870e(og7Var, new ek2(vi3Var, i, 0, c1919b), new fk2(vi3Var, c1919b, ref$ObjectRef, 0), new fk2(vi3Var, c1919b, ref$ObjectRef, 1), new C1918a(c1919b, ref$ObjectRef, og7Var, this.f40907d), continuation);
        return objM870e == CoroutineSingletons.COROUTINE_SUSPENDED ? objM870e : xfa.f68157a;
    }
}
