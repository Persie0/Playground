package androidx.compose.foundation.gestures;

import cm.InterfaceC2052l;
import cm.InterfaceC2057q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p060d1.InterfaceC5035v;
import p260m8.C7499b;
import p375s0.C8941c;
import p401u.InterfaceC9354g;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class TapGestureDetectorKt {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2057q<InterfaceC9354g, C8941c, InterfaceC9968c<? super C9072e>, Object> f2237a = new TapGestureDetectorKt$NoPressGesture$1(null);

    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[LOOP:0: B:19:0x0066->B:33:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0057 -> B:18:0x005a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m1484a(p060d1.InterfaceC5016c r11, boolean r12, androidx.compose.p017ui.input.pointer.PointerEventPass r13, p464wl.InterfaceC9968c<? super p060d1.C5028o> r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L15
            r0 = r14
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            r10 = 7
            int r1 = r0.f2242h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r10 = 6
            r0.f2242h = r1
            goto L1b
        L15:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r14)
            r10 = 2
        L1b:
            java.lang.Object r14 = r0.f2241g
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r10 = 5
            int r2 = r0.f2242h
            r10 = 3
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L39
            r10 = 4
            boolean r11 = r0.f2240f
            androidx.compose.ui.input.pointer.PointerEventPass r12 = r0.f2239e
            r10 = 4
            d1.c r13 = r0.f2238d
            p260m8.C7499b.m14977z0(r14)
            r10 = 1
            r9 = r12
            r12 = r11
            r11 = r13
            r13 = r9
            goto L5a
        L39:
            r10 = 4
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r10 = 4
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r12 = r10
            r11.<init>(r12)
            throw r11
        L44:
            r10 = 7
            p260m8.C7499b.m14977z0(r14)
        L48:
            r0.f2238d = r11
            r0.f2239e = r13
            r10 = 4
            r0.f2240f = r12
            r10 = 1
            r0.f2242h = r3
            r10 = 3
            java.lang.Object r14 = r11.mo2026H(r13, r0)
            if (r14 != r1) goto L5a
            return r1
        L5a:
            d1.k r14 = (p060d1.C5024k) r14
            java.util.List<d1.o> r2 = r14.f32832a
            r10 = 7
            int r4 = r2.size()
            r10 = 0
            r5 = r10
            r6 = r5
        L66:
            if (r6 >= r4) goto L98
            java.lang.Object r7 = r2.get(r6)
            d1.o r7 = (p060d1.C5028o) r7
            if (r12 == 0) goto L8b
            java.lang.String r8 = "<this>"
            dm.C5207g.m11111f(r7, r8)
            boolean r8 = r7.m10714b()
            if (r8 != 0) goto L89
            boolean r8 = r7.f32841g
            r10 = 5
            if (r8 != 0) goto L89
            r10 = 7
            boolean r7 = r7.f32838d
            r10 = 5
            if (r7 == 0) goto L89
            r10 = 7
            r7 = r3
            goto L90
        L89:
            r7 = r5
            goto L90
        L8b:
            boolean r10 = p338qd.C8573r0.m16675H(r7)
            r7 = r10
        L90:
            if (r7 != 0) goto L94
            r2 = r5
            goto L99
        L94:
            int r6 = r6 + 1
            r10 = 5
            goto L66
        L98:
            r2 = r3
        L99:
            if (r2 == 0) goto L48
            r10 = 7
            java.util.List<d1.o> r11 = r14.f32832a
            r10 = 4
            java.lang.Object r11 = r11.get(r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.m1484a(d1.c, boolean, androidx.compose.ui.input.pointer.PointerEventPass, wl.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public static final Object m1486c(InterfaceC5035v interfaceC5035v, InterfaceC2057q<? super InterfaceC9354g, ? super C8941c, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2057q, InterfaceC2052l<? super C8941c, C9072e> interfaceC2052l, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        Object objM14963s = C7499b.m14963s(new TapGestureDetectorKt$detectTapAndPress$2(interfaceC5035v, interfaceC2057q, interfaceC2052l, new PressGestureScopeImpl(interfaceC5035v), null), interfaceC9968c);
        return objM14963s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14963s : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x0097 A[LOOP:1: B:23:0x0075->B:34:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00e0 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public static final java.lang.Object m1487d(p060d1.InterfaceC5016c r18, androidx.compose.p017ui.input.pointer.PointerEventPass r19, p464wl.InterfaceC9968c<? super p060d1.C5028o> r20) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.m1487d(d1.c, androidx.compose.ui.input.pointer.PointerEventPass, wl.c):java.lang.Object");
    }
}
