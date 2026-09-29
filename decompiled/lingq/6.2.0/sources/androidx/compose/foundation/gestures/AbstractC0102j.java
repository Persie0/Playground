package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.C0332f;
import androidx.compose.p002ui.input.pointer.PointerEventTimeoutCancellationException;
import com.lingq.core.p012ui.dragdrop.C1918a;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3288l7;
import p000.C3305lo;
import p000.C3386nv;
import p000.ek2;
import p000.fg7;
import p000.fk2;
import p000.hta;
import p000.kg7;
import p000.og7;
import p000.pk9;
import p000.rm0;
import p000.ui3;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0102j {

    /* JADX INFO: renamed from: a */
    public static final float f2266a = 0.125f / 18.0f;

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082 A[LOOP:0: B:23:0x006e->B:27:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0086 A[EDGE_INSN: B:54:0x0086->B:29:0x0086 BREAK  A[LOOP:0: B:23:0x006e->B:27:0x0082], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005c -> B:22:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m866a(androidx.compose.p002ui.input.pointer.C0332f r17, long r18, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0102j.m866a(androidx.compose.ui.input.pointer.f, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX INFO: renamed from: b */
    public static final Object m867b(C0332f c0332f, long j, BaseContinuationImpl baseContinuationImpl) throws Throwable {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        Object obj;
        kg7 kg7Var;
        Ref$BooleanRef ref$BooleanRef;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) baseContinuationImpl;
            int i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1881e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1881e = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(baseContinuationImpl);
            }
        } else {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(baseContinuationImpl);
        }
        Object obj2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1880d;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1881e;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj2);
                if (!m873h(c0332f.f4136f.f4142O, j)) {
                    List list = c0332f.f4136f.f4142O.f39071a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj = null;
                            break;
                        }
                        obj = list.get(i3);
                        if (pk9.m19371i(((kg7) obj).f47235a, j)) {
                            break;
                        }
                        i3++;
                    }
                    kg7Var = (kg7) obj;
                    if (kg7Var != null) {
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                        ref$ObjectRef2.f47718a = kg7Var;
                        long jMo13456b = c0332f.m1475f().mo13456b();
                        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                        zi3 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(ref$BooleanRef2, ref$ObjectRef2, ref$ObjectRef, null);
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1877a = kg7Var;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1878b = ref$ObjectRef;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1879c = ref$BooleanRef2;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1881e = 1;
                        if (c0332f.m1476g(jMo13456b, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == obj3) {
                            return obj3;
                        }
                        ref$BooleanRef = ref$BooleanRef2;
                        j = ref$ObjectRef;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$BooleanRef = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1879c;
            Ref$ObjectRef ref$ObjectRef3 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1878b;
            kg7Var = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1877a;
            AbstractC3193b.m15359b(obj2);
            j = ref$ObjectRef3;
            if (ref$BooleanRef.f47713a) {
                kg7 kg7Var2 = (kg7) j.f47718a;
                return kg7Var2 == null ? kg7Var : kg7Var2;
            }
            return null;
        } catch (PointerEventTimeoutCancellationException unused) {
            kg7 kg7Var3 = (kg7) j.f47718a;
            return kg7Var3 == null ? kg7Var : kg7Var3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cc A[LOOP:0: B:26:0x00b7->B:30:0x00cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d5 A[EDGE_INSN: B:68:0x00d5->B:32:0x00d5 BREAK  A[LOOP:0: B:26:0x00b7->B:30:0x00cc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0163 -> B:62:0x0169). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public static final java.lang.Object m868c(androidx.compose.p002ui.input.pointer.C0332f r18, long r19, p000.ht6 r21, kotlin.coroutines.jvm.internal.BaseContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0102j.m868c(androidx.compose.ui.input.pointer.f, long, ht6, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public static final Object m869d(og7 og7Var, vi3 vi3Var, ui3 ui3Var, ui3 ui3Var2, zi3 zi3Var, Continuation continuation) {
        Object objM836k = AbstractC0095c.m836k(og7Var, new DragGestureDetectorKt$detectDragGestures$13(new C3288l7(15), new rm0(vi3Var, 2), zi3Var, ui3Var2, new C3305lo(3, ui3Var), null), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        xfa xfaVar = xfa.f68157a;
        if (objM836k != coroutineSingletons) {
            objM836k = xfaVar;
        }
        return objM836k == coroutineSingletons ? objM836k : xfaVar;
    }

    /* JADX INFO: renamed from: e */
    public static final Object m870e(og7 og7Var, ek2 ek2Var, fk2 fk2Var, fk2 fk2Var2, C1918a c1918a, Continuation continuation) {
        Object objM836k = AbstractC0095c.m836k(og7Var, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(ek2Var, fk2Var, fk2Var2, c1918a, null), continuation);
        return objM836k == CoroutineSingletons.COROUTINE_SUSPENDED ? objM836k : xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: f */
    public static final java.lang.Object m871f(androidx.compose.p002ui.input.pointer.C0332f r4, long r5, p000.vi3 r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.f1913d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1913d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f1912c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f1913d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            vi3 r4 = r0.f1911b
            androidx.compose.ui.input.pointer.f r5 = r0.f1910a
            kotlin.AbstractC3193b.m15359b(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r4)
            r4 = 0
            return r4
        L34:
            kotlin.AbstractC3193b.m15359b(r8)
        L37:
            r0.f1910a = r4
            r0.f1911b = r7
            r0.f1913d = r3
            java.lang.Object r8 = m866a(r4, r5, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            kg7 r8 = (p000.kg7) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = p000.ci8.m4725j(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.invoke(r8)
            long r5 = r8.f47235a
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0102j.m871f(androidx.compose.ui.input.pointer.f, long, vi3, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e A[LOOP:0: B:24:0x0088->B:28:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x00a8 A[EDGE_INSN: B:73:0x00a8->B:30:0x00a8 BREAK  A[LOOP:0: B:24:0x0088->B:28:0x009e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0076 -> B:23:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: g */
    public static final java.lang.Object m872g(androidx.compose.p002ui.input.pointer.C0332f r17, long r18, p000.sx7 r20, kotlin.coroutines.jvm.internal.BaseContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0102j.m872g(androidx.compose.ui.input.pointer.f, long, sx7, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m873h(fg7 fg7Var, long j) {
        Object obj;
        List list = fg7Var.f39071a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (pk9.m19371i(((kg7) obj).f47235a, j)) {
                break;
            }
            i++;
        }
        kg7 kg7Var = (kg7) obj;
        if (kg7Var != null && kg7Var.f47238d) {
            z = true;
        }
        return true ^ z;
    }

    /* JADX INFO: renamed from: i */
    public static final float m874i(hta htaVar, int i) {
        return i == 2 ? htaVar.mo13460f() * f2266a : htaVar.mo13460f();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x040a -> B:91:0x03b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0448 -> B:161:0x05b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x04de -> B:161:0x05b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x0542 -> B:161:0x05b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x059b -> B:158:0x05a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x05c4 -> B:162:0x05b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:173:0x0628 -> B:175:0x062b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0239 -> B:31:0x023a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x02c7 -> B:77:0x037d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0324 -> B:77:0x037d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x036c -> B:74:0x0372). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17721. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: j */
    public static final java.lang.Object m875j(androidx.compose.p002ui.input.pointer.C0332f r26, p000.kg7 r27, p000.C3288l7 r28, p000.rm0 r29, p000.zi3 r30, p000.ui3 r31, p000.C3305lo r32, kotlin.coroutines.jvm.internal.BaseContinuationImpl r33) {
        /*
            Method dump skipped, instruction units count: 1772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0102j.m875j(androidx.compose.ui.input.pointer.f, kg7, l7, rm0, zi3, ui3, lo, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }
}
