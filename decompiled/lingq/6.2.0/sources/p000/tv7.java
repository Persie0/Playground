package p000;

import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.p002ui.input.pointer.C0333g;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.gq6;
import p000.l70;
import p000.o72;
import p000.ur7;
import p000.wfb;
import p000.xfa;
import p000.yz4;

/* JADX INFO: loaded from: classes3.dex */
public final class tv7 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ly7 f62950a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o72 f62951b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f62952c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ yz4 f62953d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ un1 f62954e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ vi3 f62955f;

    public tv7(ly7 ly7Var, o72 o72Var, float f, yz4 yz4Var, un1 un1Var, vi3 vi3Var) {
        this.f62950a = ly7Var;
        this.f62951b = o72Var;
        this.f62952c = f;
        this.f62953d = yz4Var;
        this.f62954e = un1Var;
        this.f62955f = vi3Var;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final og7 og7Var, Continuation continuation) {
        if (this.f62950a.f50307a) {
            final o72 o72Var = this.f62951b;
            final float f = this.f62952c;
            final yz4 yz4Var = this.f62953d;
            final un1 un1Var = this.f62954e;
            final vi3 vi3Var = this.f62955f;
            Object objM942e = AbstractC0117w.m942e(og7Var, null, new vi3() { // from class: com.lingq.feature.reader.reader.ui.b
                /* JADX WARN: Code duplicated, block: B:9:0x002f  */
                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    gq6 gq6Var = (gq6) obj;
                    o72 o72Var2 = o72Var;
                    int iMo1039n = o72Var2.mo1039n();
                    xfa xfaVar = xfa.f68157a;
                    if (iMo1039n != 0) {
                        float f2 = (int) (((C0333g) og7Var).f4147T >> 32);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (gq6Var.f41189a >> 32));
                        float f3 = f;
                        yz4 yz4Var2 = yz4Var;
                        int i = -1;
                        if (fIntBitsToFloat < f3) {
                            if (yz4Var2.f70685s) {
                                i = 1;
                            }
                        } else if (Float.intBitsToFloat((int) (gq6Var.f41189a >> 32)) <= f2 - f3) {
                            i = 0;
                        } else if (!yz4Var2.f70685s) {
                            i = 1;
                        }
                        if (i == 0) {
                            vi3Var.invoke(ur7.f64248a);
                            return xfaVar;
                        }
                        int iM15945h = l70.m15945h(o72Var2.m1036k() + i, 0, yz4Var2.f70688v);
                        if (iM15945h != o72Var2.m1036k()) {
                            wfb.m23926u(un1Var, null, null, new ReaderContentKt$ReaderContent$6$12$1$1$1(o72Var2, iM15945h, null), 3);
                        }
                    }
                    return xfaVar;
                }
            }, continuation, 7);
            if (objM942e == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM942e;
            }
        }
        return xfa.f68157a;
    }
}
