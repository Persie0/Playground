package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.C0135d;
import androidx.compose.p002ui.node.C0357g;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dw4;
import p000.eu4;
import p000.ew4;
import p000.fw4;
import p000.sc9;
import p000.u91;
import p000.vz1;
import p000.wn8;
import p000.xc9;
import p000.xfa;
import p000.zc2;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", m4291f = "LazyStaggeredGridState.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class LazyStaggeredGridState$scrollToItem$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0144d f2586a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2587b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$scrollToItem$2(C0144d c0144d, int i, Continuation continuation) {
        super(2, continuation);
        this.f2586a = c0144d;
        this.f2587b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyStaggeredGridState$scrollToItem$2(this.f2586a, this.f2587b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LazyStaggeredGridState$scrollToItem$2 lazyStaggeredGridState$scrollToItem$2 = (LazyStaggeredGridState$scrollToItem$2) create((wn8) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lazyStaggeredGridState$scrollToItem$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        fw4 fw4Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C0144d c0144d = this.f2586a;
        zc2 zc2Var = c0144d.f2600c;
        sc9 sc9Var = (sc9) zc2Var.f71351d;
        sc9 sc9Var2 = (sc9) zc2Var.f71353f;
        int iM21222h = sc9Var.m21222h();
        int i2 = this.f2587b;
        boolean z = (iM21222h == i2 && sc9Var2.m21222h() == 0) ? false : true;
        if (z) {
            C0135d c0135d = c0144d.f2617t;
            c0135d.m1012e();
            c0135d.f2555b = null;
            c0135d.f2556c = -1;
        }
        dw4 dw4Var = (dw4) ((xc9) c0144d.f2601d).getValue();
        dw4 dw4Var2 = ew4.f37987a;
        List list = dw4Var.f36307m;
        if (list.isEmpty()) {
            fw4Var = null;
        } else {
            int i3 = ((fw4) u91.m22589G0(list)).f39785a;
            if (i2 > ((fw4) u91.m22597O0(list)).f39785a || i3 > i2) {
                fw4Var = null;
            } else {
                List list2 = dw4Var.f36307m;
                int size = list2.size();
                vz1.m23614V(list2.size(), size);
                int i4 = size - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i = -(i5 + 1);
                        break;
                    }
                    i = (i5 + i4) >>> 1;
                    int i6 = ((fw4) list2.get(i)).f39785a - i2;
                    if (i6 >= 0) {
                        if (i6 <= 0) {
                            break;
                        }
                        i4 = i - 1;
                    } else {
                        i5 = i + 1;
                    }
                }
                fw4Var = (fw4) u91.m22592J0(i, list);
            }
        }
        if (fw4Var == null || !z) {
            int[] iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) ((zi3) zc2Var.f71349b)).invoke(Integer.valueOf(i2), Integer.valueOf(((int[]) zc2Var.f71350c).length));
            int length = iArr.length;
            int[] iArr2 = new int[length];
            for (int i7 = 0; i7 < length; i7++) {
                iArr2[i7] = 0;
            }
            zc2Var.f71350c = iArr;
            ((sc9) zc2Var.f71351d).m21223i(zc2.m25549a(iArr));
            zc2Var.f71352e = iArr2;
            sc9Var2.m21223i(zc2.m25550b(iArr, iArr2));
            ((eu4) zc2Var.f71355h).m11342c(i2);
            zc2Var.f71354g = null;
        } else {
            Orientation orientation = dw4Var.f36315u;
            int[] iArr3 = dw4Var.f36296b;
            Orientation orientation2 = Orientation.Vertical;
            long j = fw4Var.f39807w;
            int i8 = (int) (orientation == orientation2 ? 4294967295L & j : j >> 32);
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            for (int i9 = 0; i9 < length2; i9++) {
                iArr4[i9] = iArr3[i9] + i8;
            }
            zc2Var.f71352e = iArr4;
            sc9Var2.m21223i(zc2.m25550b((int[]) zc2Var.f71350c, iArr4));
        }
        C0357g c0357g = c0144d.f2605h;
        if (c0357g != null) {
            c0357g.m1598l();
        }
        return xfa.f68157a;
    }
}
