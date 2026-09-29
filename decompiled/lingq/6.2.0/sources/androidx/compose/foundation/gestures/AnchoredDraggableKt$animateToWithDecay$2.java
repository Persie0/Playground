package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.AbstractC3489q9;
import p000.C0809bg;
import p000.C0817bn;
import p000.C3386nv;
import p000.InterfaceC0025an;
import p000.a62;
import p000.bj3;
import p000.c32;
import p000.f32;
import p000.fc9;
import p000.r46;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", m4291f = "AnchoredDraggable.kt", m4292l = {1425, 1443, 1467}, m4293m = "invokeSuspend", m4294v = 1)
final class AnchoredDraggableKt$animateToWithDecay$2 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public int f1784a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0809bg f1785b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ a62 f1786c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f1787d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0097e f1788e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f1789f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC0025an f1790g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Ref$FloatRef f1791h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ f32 f1792i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateToWithDecay$2(C0097e c0097e, float f, InterfaceC0025an interfaceC0025an, Ref$FloatRef ref$FloatRef, f32 f32Var, Continuation continuation) {
        super(4, continuation);
        this.f1788e = c0097e;
        this.f1789f = f;
        this.f1790g = interfaceC0025an;
        this.f1791h = ref$FloatRef;
        this.f1792i = f32Var;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        Ref$FloatRef ref$FloatRef = this.f1791h;
        f32 f32Var = this.f1792i;
        AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(this.f1788e, this.f1789f, this.f1790g, ref$FloatRef, f32Var, (Continuation) obj4);
        anchoredDraggableKt$animateToWithDecay$2.f1785b = (C0809bg) obj;
        anchoredDraggableKt$animateToWithDecay$2.f1786c = (a62) obj2;
        anchoredDraggableKt$animateToWithDecay$2.f1787d = obj3;
        return anchoredDraggableKt$animateToWithDecay$2.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (androidx.compose.animation.core.AbstractC0063e.m757d(r1, r0, false, r8, r16) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        if (androidx.compose.foundation.gestures.AbstractC0095c.m826a(r16.f1788e, r14, r11, r3, r5, r16.f1790g, r16) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        if (androidx.compose.foundation.gestures.AbstractC0095c.m826a(r16.f1788e, r15, r11, r3, r5, r16.f1790g, r16) == r7) goto L43;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1784a;
        Ref$FloatRef ref$FloatRef = this.f1791h;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0809bg c0809bg = this.f1785b;
            a62 a62Var = this.f1786c;
            Object obj2 = this.f1787d;
            float fM133f = a62Var.m133f(obj2);
            if (!Float.isNaN(fM133f)) {
                Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                C0097e c0097e = this.f1788e;
                float fM19861h = Float.isNaN(c0097e.f2241j.m19861h()) ? 0.0f : c0097e.f2241j.m19861h();
                ref$FloatRef2.f47715a = fM19861h;
                if (fM19861h != fM133f) {
                    float f = this.f1789f;
                    if ((fM133f - fM19861h) * f < 0.0f || f == 0.0f) {
                        this.f1785b = null;
                        this.f1786c = null;
                        this.f1784a = 1;
                    } else {
                        f32 f32Var = this.f1792i;
                        float fM19777g = AbstractC3489q9.m19777g(f32Var, fM19861h, f);
                        float f2 = this.f1789f;
                        if (f2 <= 0.0f ? fM19777g > fM133f : fM19777g < fM133f) {
                            this.f1785b = null;
                            this.f1786c = null;
                            this.f1784a = 3;
                        } else {
                            C0817bn c0817bnM20376a = r46.m20376a(ref$FloatRef2.f47715a, f2, 28);
                            fc9 fc9Var = new fc9(fM133f, ref$FloatRef2, c0809bg, ref$FloatRef, 2);
                            this.f1785b = null;
                            this.f1786c = null;
                            this.f1784a = 2;
                        }
                    }
                    return coroutineSingletons;
                }
            }
        } else if (i == 1) {
            AbstractC3193b.m15359b(obj);
            ref$FloatRef.f47715a = 0.0f;
        } else if (i == 2) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            ref$FloatRef.f47715a = 0.0f;
        }
        return xfa.f68157a;
    }
}
