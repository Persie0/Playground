package androidx.compose.foundation.gestures;

import androidx.compose.p017ui.input.pointer.PointerEventTimeoutCancellationException;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import p060d1.C5024k;
import p060d1.C5027n;
import p060d1.C5028o;
import p060d1.InterfaceC5016c;
import p060d1.InterfaceC5035v;
import p260m8.C7499b;
import p375s0.C8941c;
import p401u.InterfaceC9353f;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class DragGestureDetectorKt {

    /* JADX INFO: renamed from: a */
    public static final C0400a f2002a = new C0400a();

    /* JADX INFO: renamed from: b */
    public static final C0401b f2003b = new C0401b();

    /* JADX INFO: renamed from: c */
    public static final float f2004c = ((float) 0.125d) / 18;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$a */
    public static final class C0400a implements InterfaceC9353f {
        @Override // p401u.InterfaceC9353f
        /* JADX INFO: renamed from: a */
        public final float mo1448a(long j10) {
            return C8941c.m17165d(j10);
        }

        @Override // p401u.InterfaceC9353f
        /* JADX INFO: renamed from: b */
        public final float mo1449b(long j10) {
            return C8941c.m17164c(j10);
        }

        @Override // p401u.InterfaceC9353f
        /* JADX INFO: renamed from: c */
        public final long mo1450c(float f3, float f10) {
            return C7499b.m14932c(f3, f10);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$b */
    public static final class C0401b implements InterfaceC9353f {
        @Override // p401u.InterfaceC9353f
        /* JADX INFO: renamed from: a */
        public final float mo1448a(long j10) {
            return C8941c.m17164c(j10);
        }

        @Override // p401u.InterfaceC9353f
        /* JADX INFO: renamed from: b */
        public final float mo1449b(long j10) {
            return C8941c.m17165d(j10);
        }

        @Override // p401u.InterfaceC9353f
        /* JADX INFO: renamed from: c */
        public final long mo1450c(float f3, float f10) {
            return C7499b.m14932c(f10, f3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[LOOP:0: B:23:0x0072->B:27:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x008a A[EDGE_INSN: B:57:0x008a->B:29:0x008a BREAK  A[LOOP:0: B:23:0x0072->B:27:0x0086], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0062 -> B:22:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m1443a(p060d1.InterfaceC5016c r17, long r18, p464wl.InterfaceC9968c<? super p060d1.C5028o> r20) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m1443a(d1.c, long, wl.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, d1.o] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static final Object m1444b(InterfaceC5016c interfaceC5016c, long j10, InterfaceC9968c<? super C5028o> interfaceC9968c) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        C5028o c5028o;
        Ref$ObjectRef ref$ObjectRef;
        ?? r10;
        if (interfaceC9968c instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) interfaceC9968c;
            int i10 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f2012g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.f2012g = i10 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(interfaceC9968c);
            }
        } else {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(interfaceC9968c);
        }
        Object obj = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f2011f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f2012g;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            if (m1447e(interfaceC5016c.mo2027I(), j10)) {
                return null;
            }
            List<C5028o> list = interfaceC5016c.mo2027I().f32832a;
            int size = list.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    c5028o = null;
                    break;
                }
                c5028o = list.get(i12);
                if (C5027n.m10711a(c5028o.f32835a, j10)) {
                    break;
                }
                i12++;
            }
            C5028o c5028o2 = c5028o;
            if (c5028o2 == 0) {
                return null;
            }
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
            ref$ObjectRef3.f38127a = c5028o2;
            long jMo2137a = interfaceC5016c.getViewConfiguration().mo2137a();
            try {
                DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(ref$ObjectRef3, ref$ObjectRef2, null);
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.f2009d = c5028o2;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.f2010e = ref$ObjectRef2;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.f2012g = 1;
                if (interfaceC5016c.mo2025F(jMo2137a, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return null;
            } catch (PointerEventTimeoutCancellationException unused) {
                ref$ObjectRef = ref$ObjectRef2;
                r10 = c5028o2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f2010e;
            C5028o c5028o3 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f2009d;
            try {
                C7499b.m14977z0(obj);
                return null;
            } catch (PointerEventTimeoutCancellationException unused2) {
                r10 = c5028o3;
            }
        }
        C5028o c5028o4 = (C5028o) ref$ObjectRef.f38127a;
        return c5028o4 == null ? r10 : c5028o4;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m1445c(InterfaceC5035v interfaceC5035v, InterfaceC2052l<? super C8941c, C9072e> interfaceC2052l, InterfaceC2041a<C9072e> interfaceC2041a, InterfaceC2041a<C9072e> interfaceC2041a2, InterfaceC2056p<? super C5028o, ? super C8941c, C9072e> interfaceC2056p, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM1458b = ForEachGestureKt.m1458b(interfaceC5035v, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(interfaceC2052l, interfaceC2041a, interfaceC2041a2, interfaceC2056p, null), interfaceC9968c);
        return objM1458b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1458b : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0054 -> B:21:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public static final java.lang.Object m1446d(p060d1.InterfaceC5016c r8, long r9, cm.InterfaceC2052l<? super p060d1.C5028o, sl.C9072e> r11, p464wl.InterfaceC9968c<? super java.lang.Boolean> r12) {
        /*
            r4 = r8
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r6 = 6
            if (r0 == 0) goto L16
            r0 = r12
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.f2029g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            r7 = 7
            int r1 = r1 - r2
            r0.f2029g = r1
            goto L1b
        L16:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r12)
        L1b:
            java.lang.Object r12 = r0.f2028f
            r7 = 3
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f2029g
            r7 = 4
            r6 = 1
            r3 = r6
            if (r2 == 0) goto L40
            if (r2 != r3) goto L35
            r6 = 6
            cm.l r4 = r0.f2027e
            d1.c r9 = r0.f2026d
            p260m8.C7499b.m14977z0(r12)
            r6 = 7
            r11 = r4
            r4 = r9
            goto L55
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r6 = 1
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r9)
            r6 = 2
            throw r4
            r7 = 1
        L40:
            r7 = 1
            p260m8.C7499b.m14977z0(r12)
        L44:
            r0.f2026d = r4
            r7 = 6
            r0.f2027e = r11
            r0.f2029g = r3
            java.lang.Object r7 = m1443a(r4, r9, r0)
            r12 = r7
            if (r12 != r1) goto L54
            r6 = 5
            return r1
        L54:
            r7 = 4
        L55:
            d1.o r12 = (p060d1.C5028o) r12
            r6 = 6
            if (r12 != 0) goto L5d
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L5d:
            boolean r9 = p338qd.C8573r0.m16677I(r12)
            if (r9 == 0) goto L66
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L66:
            r11.mo528n(r12)
            long r9 = r12.f32835a
            r7 = 2
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m1446d(d1.c, long, cm.l, wl.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m1447e(C5024k c5024k, long j10) {
        C5028o c5028o;
        List<C5028o> list = c5024k.f32832a;
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                c5028o = null;
                break;
            }
            c5028o = list.get(i10);
            if (C5027n.m10711a(c5028o.f32835a, j10)) {
                break;
            }
            i10++;
        }
        C5028o c5028o2 = c5028o;
        if (c5028o2 != null && c5028o2.f32838d) {
            z10 = true;
        }
        return true ^ z10;
    }
}
