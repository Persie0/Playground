package androidx.compose.foundation.gestures;

import cm.InterfaceC2056p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p060d1.InterfaceC5016c;
import p060d1.InterfaceC5035v;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ForEachGestureKt {
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x009a A[LOOP:0: B:29:0x008b->B:33:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0080 -> B:28:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m1457a(p060d1.InterfaceC5016c r10, p464wl.InterfaceC9968c<? super sl.C9072e> r11) {
        /*
            r7 = r10
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            java.lang.String r9 = "Modded by Timozhai and secure with Smob - Mod obfuscation tool v4.6 by Kirlif'"
            if (r0 == 0) goto L1a
            r9 = 1
            r0 = r11
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.f2133f
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r9
            r3 = r1 & r2
            r9 = 1
            if (r3 == 0) goto L1a
            int r1 = r1 - r2
            r0.f2133f = r1
            r9 = 4
            goto L21
        L1a:
            r9 = 4
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r11)
            r9 = 3
        L21:
            java.lang.Object r11 = r0.f2132e
            r9 = 7
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r9 = 6
            int r2 = r0.f2133f
            r9 = 0
            r3 = r9
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L37
            d1.c r7 = r0.f2131d
            p260m8.C7499b.m14977z0(r11)
            r9 = 4
            goto L81
        L37:
            r9 = 7
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r11 = r9
            r7.<init>(r11)
            r9 = 5
            throw r7
        L42:
            r9 = 2
            p260m8.C7499b.m14977z0(r11)
            r9 = 5
            java.lang.String r11 = "<this>"
            dm.C5207g.m11111f(r7, r11)
            d1.k r11 = r7.mo2027I()
            java.util.List<d1.o> r11 = r11.f32832a
            int r2 = r11.size()
            r5 = r3
        L57:
            if (r5 >= r2) goto L6c
            java.lang.Object r6 = r11.get(r5)
            d1.o r6 = (p060d1.C5028o) r6
            r9 = 6
            boolean r6 = r6.f32838d
            if (r6 == 0) goto L67
            r9 = 2
            r11 = r4
            goto L6d
        L67:
            r9 = 2
            int r5 = r5 + 1
            r9 = 1
            goto L57
        L6c:
            r11 = r3
        L6d:
            r11 = r11 ^ r4
            if (r11 != 0) goto La1
            r9 = 5
        L71:
            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.p017ui.input.pointer.PointerEventPass.Final
            r9 = 6
            r0.f2131d = r7
            r0.f2133f = r4
            java.lang.Object r9 = r7.mo2026H(r11, r0)
            r11 = r9
            if (r11 != r1) goto L80
            return r1
        L80:
            r9 = 5
        L81:
            d1.k r11 = (p060d1.C5024k) r11
            java.util.List<d1.o> r11 = r11.f32832a
            r9 = 7
            int r2 = r11.size()
            r5 = r3
        L8b:
            if (r5 >= r2) goto L9e
            java.lang.Object r9 = r11.get(r5)
            r6 = r9
            d1.o r6 = (p060d1.C5028o) r6
            boolean r6 = r6.f32838d
            if (r6 == 0) goto L9a
            r11 = r4
            goto L9f
        L9a:
            r9 = 1
            int r5 = r5 + 1
            goto L8b
        L9e:
            r11 = r3
        L9f:
            if (r11 != 0) goto L71
        La1:
            r9 = 6
            sl.e r7 = sl.C9072e.f47360a
            r9 = 3
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.m1457a(d1.c, wl.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static final Object m1458b(InterfaceC5035v interfaceC5035v, InterfaceC2056p<? super InterfaceC5016c, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo2020D0 = interfaceC5035v.mo2020D0(new ForEachGestureKt$awaitEachGesture$2(null, interfaceC9968c.mo2029e(), interfaceC2056p), interfaceC9968c);
        return objMo2020D0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo2020D0 : C9072e.f47360a;
    }
}
