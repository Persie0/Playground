package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC0063e;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.C0227e;
import androidx.compose.material3.SheetValue;
import androidx.compose.p002ui.input.pointer.C0333g;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.AbstractC3720wf;
import p000.C0809bg;
import p000.C2951e4;
import p000.C3386nv;
import p000.C3794yf;
import p000.InterfaceC0025an;
import p000.a62;
import p000.bj3;
import p000.do8;
import p000.e16;
import p000.f32;
import p000.fa4;
import p000.gm5;
import p000.l43;
import p000.og7;
import p000.u06;
import p000.ui3;
import p000.vi3;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0095c {

    /* JADX INFO: renamed from: a */
    public static final C2951e4 f2225a = new C2951e4(3);

    /* JADX INFO: renamed from: b */
    public static final f32 f2226b = new f32(new u06(6));

    /* JADX INFO: renamed from: a */
    public static final Object m826a(C0097e c0097e, float f, C0809bg c0809bg, a62 a62Var, Object obj, InterfaceC0025an interfaceC0025an, SuspendLambda suspendLambda) {
        Object objM754a;
        float fM133f = a62Var.m133f(obj);
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.f47715a = Float.isNaN(c0097e.f2241j.m19861h()) ? 0.0f : c0097e.f2241j.m19861h();
        if (!Float.isNaN(fM133f)) {
            float f2 = ref$FloatRef.f47715a;
            if (f2 != fM133f && (objM754a = AbstractC0063e.m754a(f2, fM133f, f, interfaceC0025an, new C3794yf(0, c0809bg, ref$FloatRef), suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM754a;
            }
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[RETURN] */
    /* JADX INFO: renamed from: b */
    public static final Object m827b(a62 a62Var, float f, float f2, vi3 vi3Var, ui3 ui3Var) {
        if (Float.isNaN(f)) {
            C3386nv.m17626m("The offset provided to computeTarget must not be NaN.");
            return null;
        }
        boolean z = Math.abs(f2) > 0.0f;
        boolean z2 = z && f2 > 0.0f;
        if (!z) {
            Object objM128a = a62Var.m128a(f);
            objM128a.getClass();
            return objM128a;
        }
        if (Math.abs(f2) >= Math.abs(((Number) ui3Var.mo0a()).floatValue())) {
            Object objM129b = a62Var.m129b(f, z2);
            objM129b.getClass();
            return objM129b;
        }
        Object objM129b2 = a62Var.m129b(f, false);
        objM129b2.getClass();
        float fM133f = a62Var.m133f(objM129b2);
        Object objM129b3 = a62Var.m129b(f, true);
        objM129b3.getClass();
        float fM133f2 = a62Var.m133f(objM129b3);
        float fAbs = Math.abs(((Number) vi3Var.invoke(Float.valueOf(Math.abs(fM133f - fM133f2)))).floatValue());
        if (!z2) {
            fM133f = fM133f2;
        }
        boolean z3 = Math.abs(fM133f - f) >= fAbs;
        if (z3) {
            if (z2) {
                return objM129b3;
            }
            return objM129b2;
        }
        if (z3) {
            gm5.m12750e();
            return null;
        }
        if (z2) {
            return objM129b2;
        }
        return objM129b3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m828c(ui3 ui3Var, zi3 zi3Var, ContinuationImpl continuationImpl) throws Throwable {
        AnchoredDraggableKt$restartable$1 anchoredDraggableKt$restartable$1;
        if (continuationImpl instanceof AnchoredDraggableKt$restartable$1) {
            anchoredDraggableKt$restartable$1 = (AnchoredDraggableKt$restartable$1) continuationImpl;
            int i = anchoredDraggableKt$restartable$1.f1794b;
            if ((i & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$restartable$1.f1794b = i - Integer.MIN_VALUE;
            } else {
                anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(continuationImpl);
            }
        } else {
            anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(continuationImpl);
        }
        Object obj = anchoredDraggableKt$restartable$1.f1793a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anchoredDraggableKt$restartable$1.f1794b;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(ui3Var, zi3Var, null);
                anchoredDraggableKt$restartable$1.f1794b = 1;
                if (vz1.m23649s(anchoredDraggableKt$restartable$2, anchoredDraggableKt$restartable$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: d */
    public static e16 m829d(e16 e16Var, C0097e c0097e, Orientation orientation, boolean z, C0227e c0227e) {
        return e16Var.mo3161g(new C0093a(c0097e, orientation, z, null, c0227e));
    }

    /* JADX INFO: renamed from: e */
    public static e16 m830e(e16 e16Var, C0097e c0097e, boolean z, Orientation orientation, boolean z2) {
        return e16Var.mo3161g(new C0093a(c0097e, orientation, z2, Boolean.valueOf(z), null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m831f(do8 do8Var, float f, InterfaceC0025an interfaceC0025an, ContinuationImpl continuationImpl) throws Throwable {
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$1;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof ScrollExtensionsKt$animateScrollBy$1) {
            scrollExtensionsKt$animateScrollBy$1 = (ScrollExtensionsKt$animateScrollBy$1) continuationImpl;
            int i = scrollExtensionsKt$animateScrollBy$1.f2038c;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$animateScrollBy$1.f2038c = i - Integer.MIN_VALUE;
            } else {
                scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(continuationImpl);
            }
        } else {
            scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(continuationImpl);
        }
        Object obj = scrollExtensionsKt$animateScrollBy$1.f2037b;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = scrollExtensionsKt$animateScrollBy$1.f2038c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            zi3 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(f, interfaceC0025an, ref$FloatRef2, null);
            scrollExtensionsKt$animateScrollBy$1.f2036a = ref$FloatRef2;
            scrollExtensionsKt$animateScrollBy$1.f2038c = 1;
            if (do8Var.mo864c(MutatePriority.Default, scrollExtensionsKt$animateScrollBy$2, scrollExtensionsKt$animateScrollBy$1) == obj2) {
                return obj2;
            }
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$FloatRef = scrollExtensionsKt$animateScrollBy$1.f2036a;
            AbstractC3193b.m15359b(obj);
        }
        return new Float(ref$FloatRef.f47715a);
    }

    /* JADX INFO: renamed from: g */
    public static final Object m832g(C0097e c0097e, SheetValue sheetValue, l43 l43Var, SuspendLambda suspendLambda) {
        Object objM848a = c0097e.m848a(sheetValue, MutatePriority.Default, new AnchoredDraggableKt$animateTo$4(c0097e, l43Var, null), suspendLambda);
        return objM848a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM848a : xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: h */
    public static final Object m833h(C0097e c0097e, Object obj, float f, InterfaceC0025an interfaceC0025an, f32 f32Var, ContinuationImpl continuationImpl) throws Throwable {
        AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$1;
        float f2;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof AnchoredDraggableKt$animateToWithDecay$1) {
            anchoredDraggableKt$animateToWithDecay$1 = (AnchoredDraggableKt$animateToWithDecay$1) continuationImpl;
            int i = anchoredDraggableKt$animateToWithDecay$1.f1783d;
            if ((i & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$animateToWithDecay$1.f1783d = i - Integer.MIN_VALUE;
            } else {
                anchoredDraggableKt$animateToWithDecay$1 = new AnchoredDraggableKt$animateToWithDecay$1(continuationImpl);
            }
        } else {
            anchoredDraggableKt$animateToWithDecay$1 = new AnchoredDraggableKt$animateToWithDecay$1(continuationImpl);
        }
        AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$2 = anchoredDraggableKt$animateToWithDecay$1;
        Object obj2 = anchoredDraggableKt$animateToWithDecay$2.f1782c;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anchoredDraggableKt$animateToWithDecay$2.f1783d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj2);
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            ref$FloatRef2.f47715a = f;
            bj3 anchoredDraggableKt$animateToWithDecay$3 = new AnchoredDraggableKt$animateToWithDecay$2(c0097e, f, interfaceC0025an, ref$FloatRef2, f32Var, null);
            anchoredDraggableKt$animateToWithDecay$2.f1781b = ref$FloatRef2;
            anchoredDraggableKt$animateToWithDecay$2.f1780a = f;
            anchoredDraggableKt$animateToWithDecay$2.f1783d = 1;
            if (c0097e.m848a(obj, MutatePriority.Default, anchoredDraggableKt$animateToWithDecay$3, anchoredDraggableKt$animateToWithDecay$2) == obj3) {
                return obj3;
            }
            f2 = f;
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = anchoredDraggableKt$animateToWithDecay$2.f1780a;
            ref$FloatRef = anchoredDraggableKt$animateToWithDecay$2.f1781b;
            AbstractC3193b.m15359b(obj2);
        }
        return new Float(f2 - ref$FloatRef.f47715a);
    }

    /* JADX INFO: renamed from: i */
    public static Object m834i(C0097e c0097e, Object obj, float f, Continuation continuation) {
        InterfaceC0025an interfaceC0025an;
        f32 f32Var;
        if (c0097e.m850d()) {
            interfaceC0025an = c0097e.f2235d;
            if (interfaceC0025an == null) {
                fa4.m11636J("snapAnimationSpec");
                throw null;
            }
        } else {
            interfaceC0025an = AbstractC3720wf.f66744a;
        }
        InterfaceC0025an interfaceC0025an2 = interfaceC0025an;
        if (c0097e.m850d()) {
            f32Var = c0097e.f2236e;
            if (f32Var == null) {
                fa4.m11636J("decayAnimationSpec");
                throw null;
            }
        } else {
            f32Var = AbstractC3720wf.f66746c;
        }
        return m833h(c0097e, obj, f, interfaceC0025an2, f32Var, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[LOOP:0: B:22:0x006c->B:26:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0053 A[EDGE_INSN: B:31:0x0053->B:18:0x0053 BREAK  A[LOOP:0: B:22:0x006c->B:26:0x0079], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005d -> B:21:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: j */
    public static final java.lang.Object m835j(androidx.compose.p002ui.input.pointer.C0332f r8, androidx.compose.p002ui.input.pointer.PointerEventPass r9, kotlin.coroutines.jvm.internal.BaseContinuationImpl r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.f1976d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1976d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f1975c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f1976d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            androidx.compose.ui.input.pointer.PointerEventPass r8 = r0.f1974b
            androidx.compose.ui.input.pointer.f r9 = r0.f1973a
            kotlin.AbstractC3193b.m15359b(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L60
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r8)
            r8 = 0
            return r8
        L36:
            kotlin.AbstractC3193b.m15359b(r10)
            androidx.compose.ui.input.pointer.g r10 = r8.f4136f
            fg7 r10 = r10.f4142O
            java.util.List r10 = r10.f39071a
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r5 = r3
        L47:
            if (r5 >= r2) goto L7f
            java.lang.Object r6 = r10.get(r5)
            kg7 r6 = (p000.kg7) r6
            boolean r6 = r6.f47238d
            if (r6 == 0) goto L7c
        L53:
            r0.f1973a = r8
            r0.f1974b = r9
            r0.f1976d = r4
            java.lang.Object r10 = r8.m1473b(r9, r0)
            if (r10 != r1) goto L60
            return r1
        L60:
            fg7 r10 = (p000.fg7) r10
            java.util.List r10 = r10.f39071a
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r5 = r3
        L6c:
            if (r5 >= r2) goto L7f
            java.lang.Object r6 = r10.get(r5)
            kg7 r6 = (p000.kg7) r6
            boolean r6 = r6.f47238d
            if (r6 == 0) goto L79
            goto L53
        L79:
            int r5 = r5 + 1
            goto L6c
        L7c:
            int r5 = r5 + 1
            goto L47
        L7f:
            xfa r8 = p000.xfa.f68157a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0095c.m835j(androidx.compose.ui.input.pointer.f, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: k */
    public static final Object m836k(og7 og7Var, zi3 zi3Var, Continuation continuation) {
        Object objM1479Z0 = ((C0333g) og7Var).m1479Z0(new ForEachGestureKt$awaitEachGesture$2(zi3Var, continuation.getContext(), null), continuation);
        return objM1479Z0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1479Z0 : xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public static final Object m837l(do8 do8Var, float f, ContinuationImpl continuationImpl) throws Throwable {
        ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$1;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof ScrollExtensionsKt$scrollBy$1) {
            scrollExtensionsKt$scrollBy$1 = (ScrollExtensionsKt$scrollBy$1) continuationImpl;
            int i = scrollExtensionsKt$scrollBy$1.f2046c;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$scrollBy$1.f2046c = i - Integer.MIN_VALUE;
            } else {
                scrollExtensionsKt$scrollBy$1 = new ScrollExtensionsKt$scrollBy$1(continuationImpl);
            }
        } else {
            scrollExtensionsKt$scrollBy$1 = new ScrollExtensionsKt$scrollBy$1(continuationImpl);
        }
        Object obj = scrollExtensionsKt$scrollBy$1.f2045b;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = scrollExtensionsKt$scrollBy$1.f2046c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            zi3 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(ref$FloatRef2, f, null);
            scrollExtensionsKt$scrollBy$1.f2044a = ref$FloatRef2;
            scrollExtensionsKt$scrollBy$1.f2046c = 1;
            if (do8Var.mo864c(MutatePriority.Default, scrollExtensionsKt$scrollBy$2, scrollExtensionsKt$scrollBy$1) == obj2) {
                return obj2;
            }
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$FloatRef = scrollExtensionsKt$scrollBy$1.f2044a;
            AbstractC3193b.m15359b(obj);
        }
        return new Float(ref$FloatRef.f47715a);
    }

    /* JADX INFO: renamed from: m */
    public static Object m838m(do8 do8Var, Continuation continuation) {
        Object objMo864c = do8Var.mo864c(MutatePriority.Default, new ScrollExtensionsKt$stopScroll$2(2, null), (ContinuationImpl) continuation);
        return objMo864c == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo864c : xfa.f68157a;
    }
}
