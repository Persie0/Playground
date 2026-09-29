package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AbstractC0063e;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.C0817bn;
import p000.C3386nv;
import p000.C3764xm;
import p000.C3838zm;
import p000.InterfaceC0025an;
import p000.f32;
import p000.fc9;
import p000.r46;
import p000.vi3;
import p000.wn8;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0113b {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m924a(wn8 wn8Var, float f, C0817bn c0817bn, f32 f32Var, vi3 vi3Var, ContinuationImpl continuationImpl) {
        SnapFlingBehaviorKt$animateDecay$1 snapFlingBehaviorKt$animateDecay$1;
        float f2;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof SnapFlingBehaviorKt$animateDecay$1) {
            snapFlingBehaviorKt$animateDecay$1 = (SnapFlingBehaviorKt$animateDecay$1) continuationImpl;
            int i = snapFlingBehaviorKt$animateDecay$1.f2336e;
            if ((i & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateDecay$1.f2336e = i - Integer.MIN_VALUE;
            } else {
                snapFlingBehaviorKt$animateDecay$1 = new SnapFlingBehaviorKt$animateDecay$1(continuationImpl);
            }
        } else {
            snapFlingBehaviorKt$animateDecay$1 = new SnapFlingBehaviorKt$animateDecay$1(continuationImpl);
        }
        Object obj = snapFlingBehaviorKt$animateDecay$1.f2335d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = snapFlingBehaviorKt$animateDecay$1.f2336e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            boolean z = ((Number) c0817bn.m3884c()).floatValue() == 0.0f;
            fc9 fc9Var = new fc9(f, ref$FloatRef2, wn8Var, vi3Var, 0);
            snapFlingBehaviorKt$animateDecay$1.f2333b = c0817bn;
            snapFlingBehaviorKt$animateDecay$1.f2334c = ref$FloatRef2;
            snapFlingBehaviorKt$animateDecay$1.f2332a = f;
            snapFlingBehaviorKt$animateDecay$1.f2336e = 1;
            if (AbstractC0063e.m757d(c0817bn, f32Var, !z, fc9Var, snapFlingBehaviorKt$animateDecay$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            f2 = f;
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = snapFlingBehaviorKt$animateDecay$1.f2332a;
            ref$FloatRef = snapFlingBehaviorKt$animateDecay$1.f2334c;
            c0817bn = snapFlingBehaviorKt$animateDecay$1.f2333b;
            AbstractC3193b.m15359b(obj);
        }
        return new C3764xm(new Float(f2 - ref$FloatRef.f47715a), c0817bn);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: b */
    public static final Object m925b(wn8 wn8Var, float f, float f2, C0817bn c0817bn, InterfaceC0025an interfaceC0025an, vi3 vi3Var, ContinuationImpl continuationImpl) {
        SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$1;
        float fFloatValue;
        C0817bn c0817bn2;
        Ref$FloatRef ref$FloatRef;
        float f3 = f;
        if (continuationImpl instanceof SnapFlingBehaviorKt$animateWithTarget$1) {
            snapFlingBehaviorKt$animateWithTarget$1 = (SnapFlingBehaviorKt$animateWithTarget$1) continuationImpl;
            int i = snapFlingBehaviorKt$animateWithTarget$1.f2342f;
            if ((i & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateWithTarget$1.f2342f = i - Integer.MIN_VALUE;
            } else {
                snapFlingBehaviorKt$animateWithTarget$1 = new SnapFlingBehaviorKt$animateWithTarget$1(continuationImpl);
            }
        } else {
            snapFlingBehaviorKt$animateWithTarget$1 = new SnapFlingBehaviorKt$animateWithTarget$1(continuationImpl);
        }
        SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$2 = snapFlingBehaviorKt$animateWithTarget$1;
        Object obj = snapFlingBehaviorKt$animateWithTarget$2.f2341e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = snapFlingBehaviorKt$animateWithTarget$2.f2342f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            fFloatValue = ((Number) c0817bn.m3884c()).floatValue();
            Float f4 = new Float(f3);
            boolean z = ((Number) c0817bn.m3884c()).floatValue() == 0.0f;
            fc9 fc9Var = new fc9(f2, ref$FloatRef2, wn8Var, vi3Var, 1);
            snapFlingBehaviorKt$animateWithTarget$2.f2339c = c0817bn;
            snapFlingBehaviorKt$animateWithTarget$2.f2340d = ref$FloatRef2;
            snapFlingBehaviorKt$animateWithTarget$2.f2337a = f3;
            snapFlingBehaviorKt$animateWithTarget$2.f2338b = fFloatValue;
            snapFlingBehaviorKt$animateWithTarget$2.f2342f = 1;
            if (AbstractC0063e.m758e(c0817bn, f4, interfaceC0025an, !z, fc9Var, snapFlingBehaviorKt$animateWithTarget$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c0817bn2 = c0817bn;
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f5 = snapFlingBehaviorKt$animateWithTarget$2.f2338b;
            float f6 = snapFlingBehaviorKt$animateWithTarget$2.f2337a;
            ref$FloatRef = snapFlingBehaviorKt$animateWithTarget$2.f2340d;
            c0817bn2 = snapFlingBehaviorKt$animateWithTarget$2.f2339c;
            AbstractC3193b.m15359b(obj);
            fFloatValue = f5;
            f3 = f6;
        }
        return new C3764xm(new Float(f3 - ref$FloatRef.f47715a), r46.m20392r(c0817bn2, 0.0f, m927d(((Number) c0817bn2.m3884c()).floatValue(), fFloatValue), 29));
    }

    /* JADX INFO: renamed from: c */
    public static final void m926c(C3838zm c3838zm, wn8 wn8Var, vi3 vi3Var, float f) {
        float fMo3997a;
        try {
            fMo3997a = wn8Var.mo3997a(f);
        } catch (CancellationException unused) {
            c3838zm.m25698a();
            fMo3997a = 0.0f;
        }
        vi3Var.invoke(Float.valueOf(fMo3997a));
        if (Math.abs(f - fMo3997a) > 0.5f) {
            c3838zm.m25698a();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final float m927d(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }
}
