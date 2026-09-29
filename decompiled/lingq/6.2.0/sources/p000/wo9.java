package p000;

import androidx.compose.animation.core.C0059a;
import androidx.compose.foundation.gestures.AbstractC0102j;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.ci8;
import p000.gq6;
import p000.kg7;
import p000.ui3;
import p000.un1;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class wo9 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67128a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f67129b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0059a f67130c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ un1 f67131d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ui3 f67132e;

    public wo9(int i, float f, C0059a c0059a, un1 un1Var, ui3 ui3Var) {
        this.f67128a = i;
        this.f67129b = f;
        this.f67130c = c0059a;
        this.f67131d = un1Var;
        this.f67132e = ui3Var;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        final int i = this.f67128a;
        final float f = this.f67129b;
        final C0059a c0059a = this.f67130c;
        final un1 un1Var = this.f67131d;
        final ui3 ui3Var = this.f67132e;
        Object objM869d = AbstractC0102j.m869d(og7Var, new C2951e4(20), new ui3() { // from class: com.lingq.core.ui.util.b
            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i2 = i;
                float f2 = i2 * f;
                C0059a c0059a2 = c0059a;
                float fAbs = Math.abs(((Number) c0059a2.m745d()).floatValue());
                ui3 ui3Var2 = ui3Var;
                un1 un1Var2 = un1Var;
                wfb.m23926u(un1Var2, null, null, new SwipeableBoxKt$swipeToDismissGesture$1$1$1$1$1(fAbs, f2, c0059a2, i2, ui3Var2, un1Var2, null), 3);
                return xfa.f68157a;
            }
        }, new ui3() { // from class: com.lingq.core.ui.util.c
            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                wfb.m23926u(un1Var, null, null, new SwipeableBoxKt$swipeToDismissGesture$1$1$1$2$1(c0059a, null), 3);
                return xfa.f68157a;
            }
        }, new zi3() { // from class: com.lingq.core.ui.util.d
            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                kg7 kg7Var = (kg7) obj;
                gq6 gq6Var = (gq6) obj2;
                kg7Var.getClass();
                if (!gq6.m12821b(ci8.m4702O(kg7Var, false), 0L)) {
                    kg7Var.m15189a();
                }
                wfb.m23926u(un1Var, null, null, new SwipeableBoxKt$swipeToDismissGesture$1$1$1$3$1(c0059a, gq6Var, null), 3);
                return xfa.f68157a;
            }
        }, continuation);
        return objM869d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM869d : xfa.f68157a;
    }
}
