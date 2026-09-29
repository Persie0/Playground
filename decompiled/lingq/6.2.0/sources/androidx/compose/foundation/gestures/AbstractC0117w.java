package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.C0332f;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.input.pointer.PointerEventTimeoutCancellationException;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import p000.C3386nv;
import p000.aj3;
import p000.cd4;
import p000.ci8;
import p000.fa4;
import p000.fg7;
import p000.gb0;
import p000.gm5;
import p000.gq6;
import p000.kg7;
import p000.mk5;
import p000.nk5;
import p000.og7;
import p000.ok5;
import p000.pg9;
import p000.pk5;
import p000.un1;
import p000.vi3;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0117w {

    /* JADX INFO: renamed from: a */
    public static final aj3 f2373a = new TapGestureDetectorKt$NoPressGesture$1(3, null);

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m938a(androidx.compose.p002ui.input.pointer.C0332f r5, boolean r6, androidx.compose.p002ui.input.pointer.PointerEventPass r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            int r1 = r0.f2112e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2112e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f2111d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f2112e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            boolean r5 = r0.f2110c
            androidx.compose.ui.input.pointer.PointerEventPass r6 = r0.f2109b
            androidx.compose.ui.input.pointer.f r7 = r0.f2108a
            kotlin.AbstractC3193b.m15359b(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r5)
            r5 = 0
            return r5
        L38:
            kotlin.AbstractC3193b.m15359b(r8)
        L3b:
            r0.f2108a = r5
            r0.f2109b = r7
            r0.f2110c = r6
            r0.f2112e = r3
            java.lang.Object r8 = r5.m1473b(r7, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            fg7 r8 = (p000.fg7) r8
            boolean r2 = m943f(r8, r6)
            if (r2 == 0) goto L3b
            java.util.List r5 = r8.f39071a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0117w.m938a(androidx.compose.ui.input.pointer.f, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m939b(C0332f c0332f, boolean z, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return m938a(c0332f, z, pointerEventPass, baseContinuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004d A[LOOP:0: B:19:0x004b->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f A[LOOP:1: B:22:0x0062->B:26:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003b -> B:18:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0064
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public static final java.lang.Object m940c(androidx.compose.p002ui.input.pointer.C0332f r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.f2119c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2119c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f2118b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f2119c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            androidx.compose.ui.input.pointer.f r8 = r0.f2117a
            kotlin.AbstractC3193b.m15359b(r9)
            goto L3e
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r8)
            r8 = 0
            return r8
        L30:
            kotlin.AbstractC3193b.m15359b(r9)
        L33:
            r0.f2117a = r8
            r0.f2119c = r3
            java.lang.Object r9 = androidx.compose.p002ui.input.pointer.C0332f.m1472c(r8, r0)
            if (r9 != r1) goto L3e
            return r1
        L3e:
            fg7 r9 = (p000.fg7) r9
            java.util.List r2 = r9.f39071a
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L4b:
            if (r6 >= r4) goto L59
            java.lang.Object r7 = r2.get(r6)
            kg7 r7 = (p000.kg7) r7
            r7.m15189a()
            int r6 = r6 + 1
            goto L4b
        L59:
            java.util.List r9 = r9.f39071a
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L62:
            if (r5 >= r2) goto L72
            java.lang.Object r4 = r9.get(r5)
            kg7 r4 = (p000.kg7) r4
            boolean r4 = r4.f47238d
            if (r4 == 0) goto L6f
            goto L33
        L6f:
            int r5 = r5 + 1
            goto L62
        L72:
            xfa r8 = p000.xfa.f68157a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0117w.m940c(androidx.compose.ui.input.pointer.f, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public static final Object m941d(og7 og7Var, aj3 aj3Var, gb0 gb0Var, Continuation continuation) {
        Object objM23649s = vz1.m23649s(new TapGestureDetectorKt$detectTapAndPress$2(og7Var, aj3Var, gb0Var, new C0108p(og7Var), null), continuation);
        return objM23649s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s : xfa.f68157a;
    }

    /* JADX INFO: renamed from: e */
    public static Object m942e(og7 og7Var, aj3 aj3Var, vi3 vi3Var, Continuation continuation, int i) {
        if ((i & 4) != 0) {
            aj3Var = f2373a;
        }
        if ((i & 8) != 0) {
            vi3Var = null;
        }
        Object objM23649s = vz1.m23649s(new TapGestureDetectorKt$detectTapGestures$2(og7Var, aj3Var, vi3Var, null), continuation);
        return objM23649s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s : xfa.f68157a;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m943f(fg7 fg7Var, boolean z) {
        List list = fg7Var.f39071a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kg7 kg7Var = (kg7) list.get(i);
            if (!(z ? ci8.m4722g(kg7Var) : ci8.m4723h(kg7Var))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static pg9 m944g(un1 un1Var, cd4 cd4Var, zi3 zi3Var) {
        return wfb.m23926u(un1Var, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$launchAwaitingReset$1(cd4Var, zi3Var, null), 1);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x036e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0378  */
    /* JADX WARN: Code duplicated, block: B:104:0x0383  */
    /* JADX WARN: Code duplicated, block: B:107:0x0388  */
    /* JADX WARN: Code duplicated, block: B:26:0x0188  */
    /* JADX WARN: Code duplicated, block: B:28:0x0192  */
    /* JADX WARN: Code duplicated, block: B:31:0x01af  */
    /* JADX WARN: Code duplicated, block: B:33:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:39:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:42:0x020f  */
    /* JADX WARN: Code duplicated, block: B:45:0x021a  */
    /* JADX WARN: Code duplicated, block: B:47:0x021e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0223  */
    /* JADX WARN: Code duplicated, block: B:50:0x0227  */
    /* JADX WARN: Code duplicated, block: B:53:0x0231  */
    /* JADX WARN: Code duplicated, block: B:54:0x023b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x024d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0258  */
    /* JADX WARN: Code duplicated, block: B:63:0x0285  */
    /* JADX WARN: Code duplicated, block: B:66:0x0290 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0292  */
    /* JADX WARN: Code duplicated, block: B:69:0x029d  */
    /* JADX WARN: Code duplicated, block: B:71:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:73:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x02df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x030c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0333  */
    /* JADX WARN: Code duplicated, block: B:90:0x033f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0343  */
    /* JADX WARN: Code duplicated, block: B:94:0x034e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0352  */
    /* JADX WARN: Code duplicated, block: B:98:0x0358  */
    /* JADX INFO: renamed from: h */
    public static final Object m945h(C0332f c0332f, un1 un1Var, C0108p c0108p, aj3 aj3Var, vi3 vi3Var, BaseContinuationImpl baseContinuationImpl) throws Throwable {
        TapGestureDetectorKt$processTapGesture$1 tapGestureDetectorKt$processTapGesture$1;
        C0108p c0108p2;
        aj3 aj3Var2;
        vi3 vi3Var2;
        int i;
        un1 un1Var2;
        C0332f c0332f2;
        vi3 vi3Var3;
        vi3 vi3Var4;
        kg7 kg7Var;
        xfa xfaVar;
        pg9 pg9VarM23926u;
        Object objM946i;
        vi3 vi3Var5;
        cd4 cd4Var;
        kg7 kg7Var2;
        vi3 vi3Var6;
        C0332f c0332f3;
        vi3 vi3Var7;
        aj3 aj3Var3;
        C0108p c0108p3;
        vi3 vi3Var8;
        vi3 vi3Var9;
        kg7 kg7Var3;
        cd4 cd4VarM944g;
        vi3 vi3Var10;
        aj3 aj3Var4;
        Object objM1477i;
        kg7 kg7Var4;
        vi3 vi3Var11;
        vi3 vi3Var12;
        aj3 aj3Var5;
        pk5 pk5Var;
        C0108p c0108p4;
        un1 un1Var3;
        kg7 kg7Var5;
        pg9 pg9VarM23926u2;
        Object objM946i2;
        vi3 vi3Var13;
        vi3 vi3Var14;
        cd4 cd4Var2;
        kg7 kg7Var6;
        vi3 vi3Var15;
        vi3 vi3Var16;
        C0108p c0108p5;
        un1 un1Var4;
        kg7 kg7Var7;
        pk5 pk5Var2;
        cd4 cd4Var3;
        C0108p c0108p6;
        un1 un1Var5;
        if (baseContinuationImpl instanceof TapGestureDetectorKt$processTapGesture$1) {
            tapGestureDetectorKt$processTapGesture$1 = (TapGestureDetectorKt$processTapGesture$1) baseContinuationImpl;
            int i2 = tapGestureDetectorKt$processTapGesture$1.f2166k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$processTapGesture$1.f2166k = i2 - Integer.MIN_VALUE;
            } else {
                tapGestureDetectorKt$processTapGesture$1 = new TapGestureDetectorKt$processTapGesture$1(baseContinuationImpl);
            }
        } else {
            tapGestureDetectorKt$processTapGesture$1 = new TapGestureDetectorKt$processTapGesture$1(baseContinuationImpl);
        }
        Object objM947j = tapGestureDetectorKt$processTapGesture$1.f2165j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = tapGestureDetectorKt$processTapGesture$1.f2166k;
        ok5 ok5Var = ok5.f54493a;
        aj3 aj3Var6 = f2373a;
        xfa xfaVar2 = xfa.f68157a;
        switch (i3) {
            case 0:
                AbstractC3193b.m15359b(objM947j);
                tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f;
                tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var;
                c0108p2 = c0108p;
                tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p2;
                tapGestureDetectorKt$processTapGesture$1.f2159d = null;
                tapGestureDetectorKt$processTapGesture$1.f2160e = null;
                aj3Var2 = aj3Var;
                tapGestureDetectorKt$processTapGesture$1.f2161f = aj3Var2;
                vi3Var2 = vi3Var;
                tapGestureDetectorKt$processTapGesture$1.f2162g = vi3Var2;
                i = 1;
                tapGestureDetectorKt$processTapGesture$1.f2166k = 1;
                Object objM939b = m939b(c0332f, false, null, tapGestureDetectorKt$processTapGesture$1, 3);
                if (objM939b != coroutineSingletons) {
                    un1Var2 = un1Var;
                    objM947j = objM939b;
                    c0332f2 = c0332f;
                    vi3Var3 = null;
                    vi3Var4 = null;
                    kg7Var = (kg7) objM947j;
                    kg7Var.m15189a();
                    xfaVar = xfaVar2;
                    pg9VarM23926u = wfb.m23926u(un1Var2, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$resetJob$1(c0108p2, null), i);
                    if (aj3Var2 != aj3Var6) {
                        m944g(un1Var2, pg9VarM23926u, new TapGestureDetectorKt$processTapGesture$2(aj3Var2, c0108p2, kg7Var, null));
                    }
                    if (vi3Var3 == null) {
                        tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                        tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                        tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p2;
                        tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var4;
                        tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var3;
                        tapGestureDetectorKt$processTapGesture$1.f2161f = aj3Var2;
                        tapGestureDetectorKt$processTapGesture$1.f2162g = vi3Var2;
                        tapGestureDetectorKt$processTapGesture$1.f2163h = pg9VarM23926u;
                        tapGestureDetectorKt$processTapGesture$1.f2166k = 2;
                        objM947j = m947j(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                        if (objM947j != coroutineSingletons) {
                            aj3 aj3Var7 = aj3Var2;
                            vi3Var7 = vi3Var3;
                            cd4Var = pg9VarM23926u;
                            aj3Var3 = aj3Var7;
                            c0108p3 = c0108p2;
                            vi3Var8 = vi3Var2;
                            vi3Var9 = vi3Var4;
                            kg7Var3 = (kg7) objM947j;
                            if (kg7Var3 == null) {
                                cd4VarM944g = m944g(un1Var2, cd4Var, new TapGestureDetectorKt$processTapGesture$4(c0108p3, null));
                            } else {
                                kg7Var3.m15189a();
                                cd4VarM944g = m944g(un1Var2, cd4Var, new TapGestureDetectorKt$processTapGesture$5(c0108p3, null));
                            }
                            if (kg7Var3 != null) {
                                if (vi3Var9 == null) {
                                    tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                                    tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                                    tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p3;
                                    tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var9;
                                    tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var7;
                                    tapGestureDetectorKt$processTapGesture$1.f2161f = aj3Var3;
                                    tapGestureDetectorKt$processTapGesture$1.f2162g = vi3Var8;
                                    tapGestureDetectorKt$processTapGesture$1.f2163h = kg7Var3;
                                    tapGestureDetectorKt$processTapGesture$1.f2164i = cd4VarM944g;
                                    tapGestureDetectorKt$processTapGesture$1.f2166k = 5;
                                    vi3Var10 = vi3Var8;
                                    aj3Var4 = aj3Var3;
                                    objM1477i = c0332f2.m1477i(c0332f2.m1475f().mo13455a(), new TapGestureDetectorKt$awaitSecondDown$2(kg7Var3, null), tapGestureDetectorKt$processTapGesture$1);
                                    if (objM1477i != coroutineSingletons) {
                                        kg7Var4 = kg7Var3;
                                        objM947j = objM1477i;
                                        vi3Var11 = vi3Var10;
                                        vi3Var12 = vi3Var9;
                                        aj3Var5 = aj3Var4;
                                        kg7Var5 = (kg7) objM947j;
                                        if (kg7Var5 != null) {
                                            pg9VarM23926u2 = wfb.m23926u(un1Var2, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$6(cd4VarM944g, c0108p3, null), 1);
                                            if (aj3Var5 != aj3Var6) {
                                                m944g(un1Var2, pg9VarM23926u2, new TapGestureDetectorKt$processTapGesture$7(aj3Var5, c0108p3, kg7Var5, null));
                                            }
                                            if (vi3Var7 == null) {
                                                tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                                                tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p3;
                                                tapGestureDetectorKt$processTapGesture$1.f2158c = vi3Var12;
                                                tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var11;
                                                tapGestureDetectorKt$processTapGesture$1.f2160e = pg9VarM23926u2;
                                                tapGestureDetectorKt$processTapGesture$1.f2161f = kg7Var4;
                                                tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                                                tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                                                tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                                                tapGestureDetectorKt$processTapGesture$1.f2166k = 6;
                                                objM947j = m947j(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                                if (objM947j != coroutineSingletons) {
                                                    cd4Var2 = pg9VarM23926u2;
                                                    kg7Var4 = kg7Var4;
                                                    vi3Var15 = vi3Var11;
                                                    vi3Var16 = vi3Var12;
                                                    c0108p5 = c0108p3;
                                                    un1Var4 = un1Var2;
                                                    kg7Var7 = (kg7) objM947j;
                                                    if (kg7Var7 != null) {
                                                        kg7Var7.m15189a();
                                                        m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$8(c0108p5, null));
                                                        vi3Var16.invoke(new gq6(kg7Var7.f47237c));
                                                        return xfaVar;
                                                    }
                                                    m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$9(c0108p5, null));
                                                    if (vi3Var15 != null) {
                                                        vi3Var15.invoke(new gq6(kg7Var4.f47237c));
                                                        return xfaVar;
                                                    }
                                                }
                                            } else {
                                                tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                                                tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                                                tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p3;
                                                tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var12;
                                                tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var7;
                                                tapGestureDetectorKt$processTapGesture$1.f2161f = vi3Var11;
                                                tapGestureDetectorKt$processTapGesture$1.f2162g = pg9VarM23926u2;
                                                tapGestureDetectorKt$processTapGesture$1.f2163h = kg7Var4;
                                                tapGestureDetectorKt$processTapGesture$1.f2164i = kg7Var5;
                                                tapGestureDetectorKt$processTapGesture$1.f2166k = 7;
                                                objM946i2 = m946i(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                                if (objM946i2 != coroutineSingletons) {
                                                    vi3Var13 = vi3Var11;
                                                    vi3Var14 = vi3Var12;
                                                    cd4Var2 = pg9VarM23926u2;
                                                    kg7Var6 = kg7Var5;
                                                    objM947j = objM946i2;
                                                    pk5Var2 = (pk5) objM947j;
                                                    if (fa4.m11650l(pk5Var2, ok5Var)) {
                                                        vi3Var7.invoke(new gq6(kg7Var6.f47237c));
                                                        tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                                                        tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p3;
                                                        tapGestureDetectorKt$processTapGesture$1.f2158c = cd4Var2;
                                                        tapGestureDetectorKt$processTapGesture$1.f2159d = null;
                                                        tapGestureDetectorKt$processTapGesture$1.f2160e = null;
                                                        tapGestureDetectorKt$processTapGesture$1.f2161f = null;
                                                        tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                                                        tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                                                        tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                                                        tapGestureDetectorKt$processTapGesture$1.f2166k = 8;
                                                        if (m940c(c0332f2, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                                                            cd4Var3 = cd4Var2;
                                                            c0108p6 = c0108p3;
                                                            un1Var5 = un1Var2;
                                                            m944g(un1Var5, cd4Var3, new TapGestureDetectorKt$processTapGesture$secondUp$1(c0108p6, null));
                                                            return xfaVar;
                                                        }
                                                    } else {
                                                        if (pk5Var2 instanceof nk5) {
                                                            kg7Var7 = ((nk5) pk5Var2).f52878a;
                                                        } else {
                                                            if (pk5Var2 instanceof mk5) {
                                                                gm5.m12750e();
                                                                return null;
                                                            }
                                                            kg7Var7 = null;
                                                        }
                                                        vi3Var15 = vi3Var13;
                                                        vi3Var16 = vi3Var14;
                                                        c0108p5 = c0108p3;
                                                        un1Var4 = un1Var2;
                                                        if (kg7Var7 != null) {
                                                            kg7Var7.m15189a();
                                                            m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$8(c0108p5, null));
                                                            vi3Var16.invoke(new gq6(kg7Var7.f47237c));
                                                            return xfaVar;
                                                        }
                                                        m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$9(c0108p5, null));
                                                        if (vi3Var15 != null) {
                                                            vi3Var15.invoke(new gq6(kg7Var4.f47237c));
                                                            return xfaVar;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (vi3Var11 != null) {
                                            vi3Var11.invoke(new gq6(kg7Var4.f47237c));
                                            return xfaVar;
                                        }
                                    }
                                } else if (vi3Var8 != null) {
                                    vi3Var8.invoke(new gq6(kg7Var3.f47237c));
                                    return xfaVar;
                                }
                            }
                            return xfaVar;
                        }
                    } else {
                        tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                        tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                        tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p2;
                        tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var4;
                        tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var3;
                        tapGestureDetectorKt$processTapGesture$1.f2161f = aj3Var2;
                        tapGestureDetectorKt$processTapGesture$1.f2162g = vi3Var2;
                        tapGestureDetectorKt$processTapGesture$1.f2163h = kg7Var;
                        tapGestureDetectorKt$processTapGesture$1.f2164i = pg9VarM23926u;
                        tapGestureDetectorKt$processTapGesture$1.f2166k = 3;
                        objM946i = m946i(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                        if (objM946i != coroutineSingletons) {
                            vi3Var5 = vi3Var3;
                            cd4Var = pg9VarM23926u;
                            kg7Var2 = kg7Var;
                            objM947j = objM946i;
                            vi3Var6 = vi3Var4;
                            c0332f3 = c0332f2;
                            pk5Var = (pk5) objM947j;
                            if (!fa4.m11650l(pk5Var, ok5Var)) {
                                if (pk5Var instanceof nk5) {
                                    kg7Var3 = ((nk5) pk5Var).f52878a;
                                } else {
                                    if (!(pk5Var instanceof mk5)) {
                                        gm5.m12750e();
                                        return null;
                                    }
                                    kg7Var3 = null;
                                }
                                vi3 vi3Var17 = vi3Var6;
                                c0108p3 = c0108p2;
                                vi3Var8 = vi3Var2;
                                vi3Var9 = vi3Var17;
                                aj3Var3 = aj3Var2;
                                c0332f2 = c0332f3;
                                vi3Var7 = vi3Var5;
                                if (kg7Var3 == null) {
                                    cd4VarM944g = m944g(un1Var2, cd4Var, new TapGestureDetectorKt$processTapGesture$4(c0108p3, null));
                                } else {
                                    kg7Var3.m15189a();
                                    cd4VarM944g = m944g(un1Var2, cd4Var, new TapGestureDetectorKt$processTapGesture$5(c0108p3, null));
                                }
                                if (kg7Var3 != null) {
                                    if (vi3Var9 == null) {
                                        tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                                        tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                                        tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p3;
                                        tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var9;
                                        tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var7;
                                        tapGestureDetectorKt$processTapGesture$1.f2161f = aj3Var3;
                                        tapGestureDetectorKt$processTapGesture$1.f2162g = vi3Var8;
                                        tapGestureDetectorKt$processTapGesture$1.f2163h = kg7Var3;
                                        tapGestureDetectorKt$processTapGesture$1.f2164i = cd4VarM944g;
                                        tapGestureDetectorKt$processTapGesture$1.f2166k = 5;
                                        vi3Var10 = vi3Var8;
                                        aj3Var4 = aj3Var3;
                                        objM1477i = c0332f2.m1477i(c0332f2.m1475f().mo13455a(), new TapGestureDetectorKt$awaitSecondDown$2(kg7Var3, null), tapGestureDetectorKt$processTapGesture$1);
                                        if (objM1477i != coroutineSingletons) {
                                            kg7Var4 = kg7Var3;
                                            objM947j = objM1477i;
                                            vi3Var11 = vi3Var10;
                                            vi3Var12 = vi3Var9;
                                            aj3Var5 = aj3Var4;
                                            kg7Var5 = (kg7) objM947j;
                                            if (kg7Var5 != null) {
                                                pg9VarM23926u2 = wfb.m23926u(un1Var2, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$6(cd4VarM944g, c0108p3, null), 1);
                                                if (aj3Var5 != aj3Var6) {
                                                    m944g(un1Var2, pg9VarM23926u2, new TapGestureDetectorKt$processTapGesture$7(aj3Var5, c0108p3, kg7Var5, null));
                                                }
                                                if (vi3Var7 == null) {
                                                    tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                                                    tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p3;
                                                    tapGestureDetectorKt$processTapGesture$1.f2158c = vi3Var12;
                                                    tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var11;
                                                    tapGestureDetectorKt$processTapGesture$1.f2160e = pg9VarM23926u2;
                                                    tapGestureDetectorKt$processTapGesture$1.f2161f = kg7Var4;
                                                    tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                                                    tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                                                    tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                                                    tapGestureDetectorKt$processTapGesture$1.f2166k = 6;
                                                    objM947j = m947j(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                                    if (objM947j != coroutineSingletons) {
                                                        cd4Var2 = pg9VarM23926u2;
                                                        kg7Var4 = kg7Var4;
                                                        vi3Var15 = vi3Var11;
                                                        vi3Var16 = vi3Var12;
                                                        c0108p5 = c0108p3;
                                                        un1Var4 = un1Var2;
                                                        kg7Var7 = (kg7) objM947j;
                                                        if (kg7Var7 != null) {
                                                            kg7Var7.m15189a();
                                                            m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$8(c0108p5, null));
                                                            vi3Var16.invoke(new gq6(kg7Var7.f47237c));
                                                            return xfaVar;
                                                        }
                                                        m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$9(c0108p5, null));
                                                        if (vi3Var15 != null) {
                                                            vi3Var15.invoke(new gq6(kg7Var4.f47237c));
                                                            return xfaVar;
                                                        }
                                                    }
                                                } else {
                                                    tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                                                    tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                                                    tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p3;
                                                    tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var12;
                                                    tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var7;
                                                    tapGestureDetectorKt$processTapGesture$1.f2161f = vi3Var11;
                                                    tapGestureDetectorKt$processTapGesture$1.f2162g = pg9VarM23926u2;
                                                    tapGestureDetectorKt$processTapGesture$1.f2163h = kg7Var4;
                                                    tapGestureDetectorKt$processTapGesture$1.f2164i = kg7Var5;
                                                    tapGestureDetectorKt$processTapGesture$1.f2166k = 7;
                                                    objM946i2 = m946i(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                                    if (objM946i2 != coroutineSingletons) {
                                                        vi3Var13 = vi3Var11;
                                                        vi3Var14 = vi3Var12;
                                                        cd4Var2 = pg9VarM23926u2;
                                                        kg7Var6 = kg7Var5;
                                                        objM947j = objM946i2;
                                                        pk5Var2 = (pk5) objM947j;
                                                        if (fa4.m11650l(pk5Var2, ok5Var)) {
                                                            vi3Var7.invoke(new gq6(kg7Var6.f47237c));
                                                            tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                                                            tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p3;
                                                            tapGestureDetectorKt$processTapGesture$1.f2158c = cd4Var2;
                                                            tapGestureDetectorKt$processTapGesture$1.f2159d = null;
                                                            tapGestureDetectorKt$processTapGesture$1.f2160e = null;
                                                            tapGestureDetectorKt$processTapGesture$1.f2161f = null;
                                                            tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                                                            tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                                                            tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                                                            tapGestureDetectorKt$processTapGesture$1.f2166k = 8;
                                                            if (m940c(c0332f2, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                                                                cd4Var3 = cd4Var2;
                                                                c0108p6 = c0108p3;
                                                                un1Var5 = un1Var2;
                                                                m944g(un1Var5, cd4Var3, new TapGestureDetectorKt$processTapGesture$secondUp$1(c0108p6, null));
                                                                return xfaVar;
                                                            }
                                                        } else {
                                                            if (pk5Var2 instanceof nk5) {
                                                                kg7Var7 = ((nk5) pk5Var2).f52878a;
                                                            } else {
                                                                if (pk5Var2 instanceof mk5) {
                                                                    gm5.m12750e();
                                                                    return null;
                                                                }
                                                                kg7Var7 = null;
                                                            }
                                                            vi3Var15 = vi3Var13;
                                                            vi3Var16 = vi3Var14;
                                                            c0108p5 = c0108p3;
                                                            un1Var4 = un1Var2;
                                                            if (kg7Var7 != null) {
                                                                kg7Var7.m15189a();
                                                                m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$8(c0108p5, null));
                                                                vi3Var16.invoke(new gq6(kg7Var7.f47237c));
                                                                return xfaVar;
                                                            }
                                                            m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$9(c0108p5, null));
                                                            if (vi3Var15 != null) {
                                                                vi3Var15.invoke(new gq6(kg7Var4.f47237c));
                                                                return xfaVar;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (vi3Var11 != null) {
                                                vi3Var11.invoke(new gq6(kg7Var4.f47237c));
                                                return xfaVar;
                                            }
                                        }
                                    } else if (vi3Var8 != null) {
                                        vi3Var8.invoke(new gq6(kg7Var3.f47237c));
                                        return xfaVar;
                                    }
                                }
                                return xfaVar;
                            }
                            vi3Var5.invoke(new gq6(kg7Var2.f47237c));
                            tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                            tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p2;
                            tapGestureDetectorKt$processTapGesture$1.f2158c = cd4Var;
                            tapGestureDetectorKt$processTapGesture$1.f2159d = null;
                            tapGestureDetectorKt$processTapGesture$1.f2160e = null;
                            tapGestureDetectorKt$processTapGesture$1.f2161f = null;
                            tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                            tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                            tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                            tapGestureDetectorKt$processTapGesture$1.f2166k = 4;
                            if (m940c(c0332f3, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                                c0108p4 = c0108p2;
                                un1Var3 = un1Var2;
                                m944g(un1Var3, cd4Var, new TapGestureDetectorKt$processTapGesture$3(c0108p4, null));
                                return xfaVar;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                vi3 vi3Var18 = (vi3) tapGestureDetectorKt$processTapGesture$1.f2162g;
                aj3 aj3Var8 = (aj3) tapGestureDetectorKt$processTapGesture$1.f2161f;
                vi3 vi3Var19 = (vi3) tapGestureDetectorKt$processTapGesture$1.f2160e;
                vi3 vi3Var20 = tapGestureDetectorKt$processTapGesture$1.f2159d;
                C0108p c0108p7 = (C0108p) tapGestureDetectorKt$processTapGesture$1.f2158c;
                un1Var2 = (un1) tapGestureDetectorKt$processTapGesture$1.f2157b;
                c0332f2 = (C0332f) tapGestureDetectorKt$processTapGesture$1.f2156a;
                AbstractC3193b.m15359b(objM947j);
                vi3Var4 = vi3Var20;
                vi3Var2 = vi3Var18;
                vi3Var3 = vi3Var19;
                aj3Var2 = aj3Var8;
                c0108p2 = c0108p7;
                i = 1;
                kg7Var = (kg7) objM947j;
                kg7Var.m15189a();
                xfaVar = xfaVar2;
                pg9VarM23926u = wfb.m23926u(un1Var2, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$resetJob$1(c0108p2, null), i);
                if (aj3Var2 != aj3Var6) {
                    m944g(un1Var2, pg9VarM23926u, new TapGestureDetectorKt$processTapGesture$2(aj3Var2, c0108p2, kg7Var, null));
                }
                if (vi3Var3 == null) {
                    tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                    tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                    tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p2;
                    tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var4;
                    tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var3;
                    tapGestureDetectorKt$processTapGesture$1.f2161f = aj3Var2;
                    tapGestureDetectorKt$processTapGesture$1.f2162g = vi3Var2;
                    tapGestureDetectorKt$processTapGesture$1.f2163h = pg9VarM23926u;
                    tapGestureDetectorKt$processTapGesture$1.f2166k = 2;
                    objM947j = m947j(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                    if (objM947j != coroutineSingletons) {
                        aj3 aj3Var9 = aj3Var2;
                        vi3Var7 = vi3Var3;
                        cd4Var = pg9VarM23926u;
                        aj3Var3 = aj3Var9;
                        c0108p3 = c0108p2;
                        vi3Var8 = vi3Var2;
                        vi3Var9 = vi3Var4;
                        kg7Var3 = (kg7) objM947j;
                        if (kg7Var3 == null) {
                            cd4VarM944g = m944g(un1Var2, cd4Var, new TapGestureDetectorKt$processTapGesture$4(c0108p3, null));
                        } else {
                            kg7Var3.m15189a();
                            cd4VarM944g = m944g(un1Var2, cd4Var, new TapGestureDetectorKt$processTapGesture$5(c0108p3, null));
                        }
                        if (kg7Var3 != null) {
                            if (vi3Var9 == null) {
                                tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                                tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                                tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p3;
                                tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var9;
                                tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var7;
                                tapGestureDetectorKt$processTapGesture$1.f2161f = aj3Var3;
                                tapGestureDetectorKt$processTapGesture$1.f2162g = vi3Var8;
                                tapGestureDetectorKt$processTapGesture$1.f2163h = kg7Var3;
                                tapGestureDetectorKt$processTapGesture$1.f2164i = cd4VarM944g;
                                tapGestureDetectorKt$processTapGesture$1.f2166k = 5;
                                vi3Var10 = vi3Var8;
                                aj3Var4 = aj3Var3;
                                objM1477i = c0332f2.m1477i(c0332f2.m1475f().mo13455a(), new TapGestureDetectorKt$awaitSecondDown$2(kg7Var3, null), tapGestureDetectorKt$processTapGesture$1);
                                if (objM1477i != coroutineSingletons) {
                                    kg7Var4 = kg7Var3;
                                    objM947j = objM1477i;
                                    vi3Var11 = vi3Var10;
                                    vi3Var12 = vi3Var9;
                                    aj3Var5 = aj3Var4;
                                    kg7Var5 = (kg7) objM947j;
                                    if (kg7Var5 != null) {
                                        pg9VarM23926u2 = wfb.m23926u(un1Var2, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$6(cd4VarM944g, c0108p3, null), 1);
                                        if (aj3Var5 != aj3Var6) {
                                            m944g(un1Var2, pg9VarM23926u2, new TapGestureDetectorKt$processTapGesture$7(aj3Var5, c0108p3, kg7Var5, null));
                                        }
                                        if (vi3Var7 == null) {
                                            tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                                            tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p3;
                                            tapGestureDetectorKt$processTapGesture$1.f2158c = vi3Var12;
                                            tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var11;
                                            tapGestureDetectorKt$processTapGesture$1.f2160e = pg9VarM23926u2;
                                            tapGestureDetectorKt$processTapGesture$1.f2161f = kg7Var4;
                                            tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                                            tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                                            tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                                            tapGestureDetectorKt$processTapGesture$1.f2166k = 6;
                                            objM947j = m947j(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                            if (objM947j != coroutineSingletons) {
                                                cd4Var2 = pg9VarM23926u2;
                                                kg7Var4 = kg7Var4;
                                                vi3Var15 = vi3Var11;
                                                vi3Var16 = vi3Var12;
                                                c0108p5 = c0108p3;
                                                un1Var4 = un1Var2;
                                                kg7Var7 = (kg7) objM947j;
                                                if (kg7Var7 != null) {
                                                    kg7Var7.m15189a();
                                                    m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$8(c0108p5, null));
                                                    vi3Var16.invoke(new gq6(kg7Var7.f47237c));
                                                    return xfaVar;
                                                }
                                                m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$9(c0108p5, null));
                                                if (vi3Var15 != null) {
                                                    vi3Var15.invoke(new gq6(kg7Var4.f47237c));
                                                    return xfaVar;
                                                }
                                            }
                                        } else {
                                            tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                                            tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                                            tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p3;
                                            tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var12;
                                            tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var7;
                                            tapGestureDetectorKt$processTapGesture$1.f2161f = vi3Var11;
                                            tapGestureDetectorKt$processTapGesture$1.f2162g = pg9VarM23926u2;
                                            tapGestureDetectorKt$processTapGesture$1.f2163h = kg7Var4;
                                            tapGestureDetectorKt$processTapGesture$1.f2164i = kg7Var5;
                                            tapGestureDetectorKt$processTapGesture$1.f2166k = 7;
                                            objM946i2 = m946i(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                            if (objM946i2 != coroutineSingletons) {
                                                vi3Var13 = vi3Var11;
                                                vi3Var14 = vi3Var12;
                                                cd4Var2 = pg9VarM23926u2;
                                                kg7Var6 = kg7Var5;
                                                objM947j = objM946i2;
                                                pk5Var2 = (pk5) objM947j;
                                                if (fa4.m11650l(pk5Var2, ok5Var)) {
                                                    vi3Var7.invoke(new gq6(kg7Var6.f47237c));
                                                    tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                                                    tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p3;
                                                    tapGestureDetectorKt$processTapGesture$1.f2158c = cd4Var2;
                                                    tapGestureDetectorKt$processTapGesture$1.f2159d = null;
                                                    tapGestureDetectorKt$processTapGesture$1.f2160e = null;
                                                    tapGestureDetectorKt$processTapGesture$1.f2161f = null;
                                                    tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                                                    tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                                                    tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                                                    tapGestureDetectorKt$processTapGesture$1.f2166k = 8;
                                                    if (m940c(c0332f2, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                                                        cd4Var3 = cd4Var2;
                                                        c0108p6 = c0108p3;
                                                        un1Var5 = un1Var2;
                                                        m944g(un1Var5, cd4Var3, new TapGestureDetectorKt$processTapGesture$secondUp$1(c0108p6, null));
                                                        return xfaVar;
                                                    }
                                                } else {
                                                    if (pk5Var2 instanceof nk5) {
                                                        kg7Var7 = ((nk5) pk5Var2).f52878a;
                                                    } else {
                                                        if (pk5Var2 instanceof mk5) {
                                                            gm5.m12750e();
                                                            return null;
                                                        }
                                                        kg7Var7 = null;
                                                    }
                                                    vi3Var15 = vi3Var13;
                                                    vi3Var16 = vi3Var14;
                                                    c0108p5 = c0108p3;
                                                    un1Var4 = un1Var2;
                                                    if (kg7Var7 != null) {
                                                        kg7Var7.m15189a();
                                                        m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$8(c0108p5, null));
                                                        vi3Var16.invoke(new gq6(kg7Var7.f47237c));
                                                        return xfaVar;
                                                    }
                                                    m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$9(c0108p5, null));
                                                    if (vi3Var15 != null) {
                                                        vi3Var15.invoke(new gq6(kg7Var4.f47237c));
                                                        return xfaVar;
                                                    }
                                                }
                                            }
                                        }
                                    } else if (vi3Var11 != null) {
                                        vi3Var11.invoke(new gq6(kg7Var4.f47237c));
                                        return xfaVar;
                                    }
                                }
                            } else if (vi3Var8 != null) {
                                vi3Var8.invoke(new gq6(kg7Var3.f47237c));
                                return xfaVar;
                            }
                        }
                        return xfaVar;
                    }
                } else {
                    tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                    tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                    tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p2;
                    tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var4;
                    tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var3;
                    tapGestureDetectorKt$processTapGesture$1.f2161f = aj3Var2;
                    tapGestureDetectorKt$processTapGesture$1.f2162g = vi3Var2;
                    tapGestureDetectorKt$processTapGesture$1.f2163h = kg7Var;
                    tapGestureDetectorKt$processTapGesture$1.f2164i = pg9VarM23926u;
                    tapGestureDetectorKt$processTapGesture$1.f2166k = 3;
                    objM946i = m946i(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                    if (objM946i != coroutineSingletons) {
                        vi3Var5 = vi3Var3;
                        cd4Var = pg9VarM23926u;
                        kg7Var2 = kg7Var;
                        objM947j = objM946i;
                        vi3Var6 = vi3Var4;
                        c0332f3 = c0332f2;
                        pk5Var = (pk5) objM947j;
                        if (!fa4.m11650l(pk5Var, ok5Var)) {
                            if (pk5Var instanceof nk5) {
                                kg7Var3 = ((nk5) pk5Var).f52878a;
                            } else {
                                if (!(pk5Var instanceof mk5)) {
                                    gm5.m12750e();
                                    return null;
                                }
                                kg7Var3 = null;
                            }
                            vi3 vi3Var110 = vi3Var6;
                            c0108p3 = c0108p2;
                            vi3Var8 = vi3Var2;
                            vi3Var9 = vi3Var110;
                            aj3Var3 = aj3Var2;
                            c0332f2 = c0332f3;
                            vi3Var7 = vi3Var5;
                            if (kg7Var3 == null) {
                                cd4VarM944g = m944g(un1Var2, cd4Var, new TapGestureDetectorKt$processTapGesture$4(c0108p3, null));
                            } else {
                                kg7Var3.m15189a();
                                cd4VarM944g = m944g(un1Var2, cd4Var, new TapGestureDetectorKt$processTapGesture$5(c0108p3, null));
                            }
                            if (kg7Var3 != null) {
                                if (vi3Var9 == null) {
                                    tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                                    tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                                    tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p3;
                                    tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var9;
                                    tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var7;
                                    tapGestureDetectorKt$processTapGesture$1.f2161f = aj3Var3;
                                    tapGestureDetectorKt$processTapGesture$1.f2162g = vi3Var8;
                                    tapGestureDetectorKt$processTapGesture$1.f2163h = kg7Var3;
                                    tapGestureDetectorKt$processTapGesture$1.f2164i = cd4VarM944g;
                                    tapGestureDetectorKt$processTapGesture$1.f2166k = 5;
                                    vi3Var10 = vi3Var8;
                                    aj3Var4 = aj3Var3;
                                    objM1477i = c0332f2.m1477i(c0332f2.m1475f().mo13455a(), new TapGestureDetectorKt$awaitSecondDown$2(kg7Var3, null), tapGestureDetectorKt$processTapGesture$1);
                                    if (objM1477i != coroutineSingletons) {
                                        kg7Var4 = kg7Var3;
                                        objM947j = objM1477i;
                                        vi3Var11 = vi3Var10;
                                        vi3Var12 = vi3Var9;
                                        aj3Var5 = aj3Var4;
                                        kg7Var5 = (kg7) objM947j;
                                        if (kg7Var5 != null) {
                                            pg9VarM23926u2 = wfb.m23926u(un1Var2, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$6(cd4VarM944g, c0108p3, null), 1);
                                            if (aj3Var5 != aj3Var6) {
                                                m944g(un1Var2, pg9VarM23926u2, new TapGestureDetectorKt$processTapGesture$7(aj3Var5, c0108p3, kg7Var5, null));
                                            }
                                            if (vi3Var7 == null) {
                                                tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                                                tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p3;
                                                tapGestureDetectorKt$processTapGesture$1.f2158c = vi3Var12;
                                                tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var11;
                                                tapGestureDetectorKt$processTapGesture$1.f2160e = pg9VarM23926u2;
                                                tapGestureDetectorKt$processTapGesture$1.f2161f = kg7Var4;
                                                tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                                                tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                                                tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                                                tapGestureDetectorKt$processTapGesture$1.f2166k = 6;
                                                objM947j = m947j(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                                if (objM947j != coroutineSingletons) {
                                                    cd4Var2 = pg9VarM23926u2;
                                                    kg7Var4 = kg7Var4;
                                                    vi3Var15 = vi3Var11;
                                                    vi3Var16 = vi3Var12;
                                                    c0108p5 = c0108p3;
                                                    un1Var4 = un1Var2;
                                                    kg7Var7 = (kg7) objM947j;
                                                    if (kg7Var7 != null) {
                                                        kg7Var7.m15189a();
                                                        m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$8(c0108p5, null));
                                                        vi3Var16.invoke(new gq6(kg7Var7.f47237c));
                                                        return xfaVar;
                                                    }
                                                    m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$9(c0108p5, null));
                                                    if (vi3Var15 != null) {
                                                        vi3Var15.invoke(new gq6(kg7Var4.f47237c));
                                                        return xfaVar;
                                                    }
                                                }
                                            } else {
                                                tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                                                tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                                                tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p3;
                                                tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var12;
                                                tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var7;
                                                tapGestureDetectorKt$processTapGesture$1.f2161f = vi3Var11;
                                                tapGestureDetectorKt$processTapGesture$1.f2162g = pg9VarM23926u2;
                                                tapGestureDetectorKt$processTapGesture$1.f2163h = kg7Var4;
                                                tapGestureDetectorKt$processTapGesture$1.f2164i = kg7Var5;
                                                tapGestureDetectorKt$processTapGesture$1.f2166k = 7;
                                                objM946i2 = m946i(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                                if (objM946i2 != coroutineSingletons) {
                                                    vi3Var13 = vi3Var11;
                                                    vi3Var14 = vi3Var12;
                                                    cd4Var2 = pg9VarM23926u2;
                                                    kg7Var6 = kg7Var5;
                                                    objM947j = objM946i2;
                                                    pk5Var2 = (pk5) objM947j;
                                                    if (fa4.m11650l(pk5Var2, ok5Var)) {
                                                        vi3Var7.invoke(new gq6(kg7Var6.f47237c));
                                                        tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                                                        tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p3;
                                                        tapGestureDetectorKt$processTapGesture$1.f2158c = cd4Var2;
                                                        tapGestureDetectorKt$processTapGesture$1.f2159d = null;
                                                        tapGestureDetectorKt$processTapGesture$1.f2160e = null;
                                                        tapGestureDetectorKt$processTapGesture$1.f2161f = null;
                                                        tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                                                        tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                                                        tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                                                        tapGestureDetectorKt$processTapGesture$1.f2166k = 8;
                                                        if (m940c(c0332f2, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                                                            cd4Var3 = cd4Var2;
                                                            c0108p6 = c0108p3;
                                                            un1Var5 = un1Var2;
                                                            m944g(un1Var5, cd4Var3, new TapGestureDetectorKt$processTapGesture$secondUp$1(c0108p6, null));
                                                            return xfaVar;
                                                        }
                                                    } else {
                                                        if (pk5Var2 instanceof nk5) {
                                                            kg7Var7 = ((nk5) pk5Var2).f52878a;
                                                        } else {
                                                            if (pk5Var2 instanceof mk5) {
                                                                gm5.m12750e();
                                                                return null;
                                                            }
                                                            kg7Var7 = null;
                                                        }
                                                        vi3Var15 = vi3Var13;
                                                        vi3Var16 = vi3Var14;
                                                        c0108p5 = c0108p3;
                                                        un1Var4 = un1Var2;
                                                        if (kg7Var7 != null) {
                                                            kg7Var7.m15189a();
                                                            m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$8(c0108p5, null));
                                                            vi3Var16.invoke(new gq6(kg7Var7.f47237c));
                                                            return xfaVar;
                                                        }
                                                        m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$9(c0108p5, null));
                                                        if (vi3Var15 != null) {
                                                            vi3Var15.invoke(new gq6(kg7Var4.f47237c));
                                                            return xfaVar;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (vi3Var11 != null) {
                                            vi3Var11.invoke(new gq6(kg7Var4.f47237c));
                                            return xfaVar;
                                        }
                                    }
                                } else if (vi3Var8 != null) {
                                    vi3Var8.invoke(new gq6(kg7Var3.f47237c));
                                    return xfaVar;
                                }
                            }
                            return xfaVar;
                        }
                        vi3Var5.invoke(new gq6(kg7Var2.f47237c));
                        tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                        tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p2;
                        tapGestureDetectorKt$processTapGesture$1.f2158c = cd4Var;
                        tapGestureDetectorKt$processTapGesture$1.f2159d = null;
                        tapGestureDetectorKt$processTapGesture$1.f2160e = null;
                        tapGestureDetectorKt$processTapGesture$1.f2161f = null;
                        tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                        tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                        tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                        tapGestureDetectorKt$processTapGesture$1.f2166k = 4;
                        if (m940c(c0332f3, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                            c0108p4 = c0108p2;
                            un1Var3 = un1Var2;
                            m944g(un1Var3, cd4Var, new TapGestureDetectorKt$processTapGesture$3(c0108p4, null));
                            return xfaVar;
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                cd4Var = (cd4) tapGestureDetectorKt$processTapGesture$1.f2163h;
                vi3Var8 = (vi3) tapGestureDetectorKt$processTapGesture$1.f2162g;
                aj3Var3 = (aj3) tapGestureDetectorKt$processTapGesture$1.f2161f;
                vi3Var7 = (vi3) tapGestureDetectorKt$processTapGesture$1.f2160e;
                vi3Var9 = tapGestureDetectorKt$processTapGesture$1.f2159d;
                c0108p3 = (C0108p) tapGestureDetectorKt$processTapGesture$1.f2158c;
                un1Var2 = (un1) tapGestureDetectorKt$processTapGesture$1.f2157b;
                c0332f2 = (C0332f) tapGestureDetectorKt$processTapGesture$1.f2156a;
                AbstractC3193b.m15359b(objM947j);
                xfaVar = xfaVar2;
                kg7Var3 = (kg7) objM947j;
                if (kg7Var3 == null) {
                    cd4VarM944g = m944g(un1Var2, cd4Var, new TapGestureDetectorKt$processTapGesture$4(c0108p3, null));
                } else {
                    kg7Var3.m15189a();
                    cd4VarM944g = m944g(un1Var2, cd4Var, new TapGestureDetectorKt$processTapGesture$5(c0108p3, null));
                }
                if (kg7Var3 != null) {
                    if (vi3Var9 == null) {
                        tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                        tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                        tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p3;
                        tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var9;
                        tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var7;
                        tapGestureDetectorKt$processTapGesture$1.f2161f = aj3Var3;
                        tapGestureDetectorKt$processTapGesture$1.f2162g = vi3Var8;
                        tapGestureDetectorKt$processTapGesture$1.f2163h = kg7Var3;
                        tapGestureDetectorKt$processTapGesture$1.f2164i = cd4VarM944g;
                        tapGestureDetectorKt$processTapGesture$1.f2166k = 5;
                        vi3Var10 = vi3Var8;
                        aj3Var4 = aj3Var3;
                        objM1477i = c0332f2.m1477i(c0332f2.m1475f().mo13455a(), new TapGestureDetectorKt$awaitSecondDown$2(kg7Var3, null), tapGestureDetectorKt$processTapGesture$1);
                        if (objM1477i != coroutineSingletons) {
                            kg7Var4 = kg7Var3;
                            objM947j = objM1477i;
                            vi3Var11 = vi3Var10;
                            vi3Var12 = vi3Var9;
                            aj3Var5 = aj3Var4;
                            kg7Var5 = (kg7) objM947j;
                            if (kg7Var5 != null) {
                                pg9VarM23926u2 = wfb.m23926u(un1Var2, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$6(cd4VarM944g, c0108p3, null), 1);
                                if (aj3Var5 != aj3Var6) {
                                    m944g(un1Var2, pg9VarM23926u2, new TapGestureDetectorKt$processTapGesture$7(aj3Var5, c0108p3, kg7Var5, null));
                                }
                                if (vi3Var7 == null) {
                                    tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                                    tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p3;
                                    tapGestureDetectorKt$processTapGesture$1.f2158c = vi3Var12;
                                    tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var11;
                                    tapGestureDetectorKt$processTapGesture$1.f2160e = pg9VarM23926u2;
                                    tapGestureDetectorKt$processTapGesture$1.f2161f = kg7Var4;
                                    tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                                    tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                                    tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                                    tapGestureDetectorKt$processTapGesture$1.f2166k = 6;
                                    objM947j = m947j(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                    if (objM947j != coroutineSingletons) {
                                        cd4Var2 = pg9VarM23926u2;
                                        kg7Var4 = kg7Var4;
                                        vi3Var15 = vi3Var11;
                                        vi3Var16 = vi3Var12;
                                        c0108p5 = c0108p3;
                                        un1Var4 = un1Var2;
                                        kg7Var7 = (kg7) objM947j;
                                        if (kg7Var7 != null) {
                                            kg7Var7.m15189a();
                                            m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$8(c0108p5, null));
                                            vi3Var16.invoke(new gq6(kg7Var7.f47237c));
                                            return xfaVar;
                                        }
                                        m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$9(c0108p5, null));
                                        if (vi3Var15 != null) {
                                            vi3Var15.invoke(new gq6(kg7Var4.f47237c));
                                            return xfaVar;
                                        }
                                    }
                                } else {
                                    tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                                    tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                                    tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p3;
                                    tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var12;
                                    tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var7;
                                    tapGestureDetectorKt$processTapGesture$1.f2161f = vi3Var11;
                                    tapGestureDetectorKt$processTapGesture$1.f2162g = pg9VarM23926u2;
                                    tapGestureDetectorKt$processTapGesture$1.f2163h = kg7Var4;
                                    tapGestureDetectorKt$processTapGesture$1.f2164i = kg7Var5;
                                    tapGestureDetectorKt$processTapGesture$1.f2166k = 7;
                                    objM946i2 = m946i(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                    if (objM946i2 != coroutineSingletons) {
                                        vi3Var13 = vi3Var11;
                                        vi3Var14 = vi3Var12;
                                        cd4Var2 = pg9VarM23926u2;
                                        kg7Var6 = kg7Var5;
                                        objM947j = objM946i2;
                                        pk5Var2 = (pk5) objM947j;
                                        if (fa4.m11650l(pk5Var2, ok5Var)) {
                                            vi3Var7.invoke(new gq6(kg7Var6.f47237c));
                                            tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                                            tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p3;
                                            tapGestureDetectorKt$processTapGesture$1.f2158c = cd4Var2;
                                            tapGestureDetectorKt$processTapGesture$1.f2159d = null;
                                            tapGestureDetectorKt$processTapGesture$1.f2160e = null;
                                            tapGestureDetectorKt$processTapGesture$1.f2161f = null;
                                            tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                                            tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                                            tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                                            tapGestureDetectorKt$processTapGesture$1.f2166k = 8;
                                            if (m940c(c0332f2, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                                                cd4Var3 = cd4Var2;
                                                c0108p6 = c0108p3;
                                                un1Var5 = un1Var2;
                                                m944g(un1Var5, cd4Var3, new TapGestureDetectorKt$processTapGesture$secondUp$1(c0108p6, null));
                                                return xfaVar;
                                            }
                                        } else {
                                            if (pk5Var2 instanceof nk5) {
                                                kg7Var7 = ((nk5) pk5Var2).f52878a;
                                            } else {
                                                if (pk5Var2 instanceof mk5) {
                                                    gm5.m12750e();
                                                    return null;
                                                }
                                                kg7Var7 = null;
                                            }
                                            vi3Var15 = vi3Var13;
                                            vi3Var16 = vi3Var14;
                                            c0108p5 = c0108p3;
                                            un1Var4 = un1Var2;
                                            if (kg7Var7 != null) {
                                                kg7Var7.m15189a();
                                                m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$8(c0108p5, null));
                                                vi3Var16.invoke(new gq6(kg7Var7.f47237c));
                                                return xfaVar;
                                            }
                                            m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$9(c0108p5, null));
                                            if (vi3Var15 != null) {
                                                vi3Var15.invoke(new gq6(kg7Var4.f47237c));
                                                return xfaVar;
                                            }
                                        }
                                    }
                                }
                            } else if (vi3Var11 != null) {
                                vi3Var11.invoke(new gq6(kg7Var4.f47237c));
                                return xfaVar;
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (vi3Var8 != null) {
                        vi3Var8.invoke(new gq6(kg7Var3.f47237c));
                        return xfaVar;
                    }
                }
                return xfaVar;
            case 3:
                cd4Var = (cd4) tapGestureDetectorKt$processTapGesture$1.f2164i;
                kg7 kg7Var8 = (kg7) tapGestureDetectorKt$processTapGesture$1.f2163h;
                vi3 vi3Var21 = (vi3) tapGestureDetectorKt$processTapGesture$1.f2162g;
                aj3Var2 = (aj3) tapGestureDetectorKt$processTapGesture$1.f2161f;
                vi3 vi3Var22 = (vi3) tapGestureDetectorKt$processTapGesture$1.f2160e;
                vi3Var6 = tapGestureDetectorKt$processTapGesture$1.f2159d;
                C0108p c0108p8 = (C0108p) tapGestureDetectorKt$processTapGesture$1.f2158c;
                un1 un1Var6 = (un1) tapGestureDetectorKt$processTapGesture$1.f2157b;
                c0332f3 = (C0332f) tapGestureDetectorKt$processTapGesture$1.f2156a;
                AbstractC3193b.m15359b(objM947j);
                xfaVar = xfaVar2;
                vi3Var5 = vi3Var22;
                vi3Var2 = vi3Var21;
                kg7Var2 = kg7Var8;
                c0108p2 = c0108p8;
                un1Var2 = un1Var6;
                pk5Var = (pk5) objM947j;
                if (!fa4.m11650l(pk5Var, ok5Var)) {
                    if (pk5Var instanceof nk5) {
                        kg7Var3 = ((nk5) pk5Var).f52878a;
                    } else {
                        if (!(pk5Var instanceof mk5)) {
                            gm5.m12750e();
                            return null;
                        }
                        kg7Var3 = null;
                    }
                    vi3 vi3Var111 = vi3Var6;
                    c0108p3 = c0108p2;
                    vi3Var8 = vi3Var2;
                    vi3Var9 = vi3Var111;
                    aj3Var3 = aj3Var2;
                    c0332f2 = c0332f3;
                    vi3Var7 = vi3Var5;
                    if (kg7Var3 == null) {
                        cd4VarM944g = m944g(un1Var2, cd4Var, new TapGestureDetectorKt$processTapGesture$4(c0108p3, null));
                    } else {
                        kg7Var3.m15189a();
                        cd4VarM944g = m944g(un1Var2, cd4Var, new TapGestureDetectorKt$processTapGesture$5(c0108p3, null));
                    }
                    if (kg7Var3 != null) {
                        if (vi3Var9 == null) {
                            tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                            tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                            tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p3;
                            tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var9;
                            tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var7;
                            tapGestureDetectorKt$processTapGesture$1.f2161f = aj3Var3;
                            tapGestureDetectorKt$processTapGesture$1.f2162g = vi3Var8;
                            tapGestureDetectorKt$processTapGesture$1.f2163h = kg7Var3;
                            tapGestureDetectorKt$processTapGesture$1.f2164i = cd4VarM944g;
                            tapGestureDetectorKt$processTapGesture$1.f2166k = 5;
                            vi3Var10 = vi3Var8;
                            aj3Var4 = aj3Var3;
                            objM1477i = c0332f2.m1477i(c0332f2.m1475f().mo13455a(), new TapGestureDetectorKt$awaitSecondDown$2(kg7Var3, null), tapGestureDetectorKt$processTapGesture$1);
                            if (objM1477i != coroutineSingletons) {
                                kg7Var4 = kg7Var3;
                                objM947j = objM1477i;
                                vi3Var11 = vi3Var10;
                                vi3Var12 = vi3Var9;
                                aj3Var5 = aj3Var4;
                                kg7Var5 = (kg7) objM947j;
                                if (kg7Var5 != null) {
                                    pg9VarM23926u2 = wfb.m23926u(un1Var2, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$6(cd4VarM944g, c0108p3, null), 1);
                                    if (aj3Var5 != aj3Var6) {
                                        m944g(un1Var2, pg9VarM23926u2, new TapGestureDetectorKt$processTapGesture$7(aj3Var5, c0108p3, kg7Var5, null));
                                    }
                                    if (vi3Var7 == null) {
                                        tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                                        tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p3;
                                        tapGestureDetectorKt$processTapGesture$1.f2158c = vi3Var12;
                                        tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var11;
                                        tapGestureDetectorKt$processTapGesture$1.f2160e = pg9VarM23926u2;
                                        tapGestureDetectorKt$processTapGesture$1.f2161f = kg7Var4;
                                        tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                                        tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                                        tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                                        tapGestureDetectorKt$processTapGesture$1.f2166k = 6;
                                        objM947j = m947j(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                        if (objM947j != coroutineSingletons) {
                                            cd4Var2 = pg9VarM23926u2;
                                            kg7Var4 = kg7Var4;
                                            vi3Var15 = vi3Var11;
                                            vi3Var16 = vi3Var12;
                                            c0108p5 = c0108p3;
                                            un1Var4 = un1Var2;
                                            kg7Var7 = (kg7) objM947j;
                                            if (kg7Var7 != null) {
                                                kg7Var7.m15189a();
                                                m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$8(c0108p5, null));
                                                vi3Var16.invoke(new gq6(kg7Var7.f47237c));
                                                return xfaVar;
                                            }
                                            m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$9(c0108p5, null));
                                            if (vi3Var15 != null) {
                                                vi3Var15.invoke(new gq6(kg7Var4.f47237c));
                                                return xfaVar;
                                            }
                                        }
                                    } else {
                                        tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                                        tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                                        tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p3;
                                        tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var12;
                                        tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var7;
                                        tapGestureDetectorKt$processTapGesture$1.f2161f = vi3Var11;
                                        tapGestureDetectorKt$processTapGesture$1.f2162g = pg9VarM23926u2;
                                        tapGestureDetectorKt$processTapGesture$1.f2163h = kg7Var4;
                                        tapGestureDetectorKt$processTapGesture$1.f2164i = kg7Var5;
                                        tapGestureDetectorKt$processTapGesture$1.f2166k = 7;
                                        objM946i2 = m946i(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                        if (objM946i2 != coroutineSingletons) {
                                            vi3Var13 = vi3Var11;
                                            vi3Var14 = vi3Var12;
                                            cd4Var2 = pg9VarM23926u2;
                                            kg7Var6 = kg7Var5;
                                            objM947j = objM946i2;
                                            pk5Var2 = (pk5) objM947j;
                                            if (fa4.m11650l(pk5Var2, ok5Var)) {
                                                vi3Var7.invoke(new gq6(kg7Var6.f47237c));
                                                tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                                                tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p3;
                                                tapGestureDetectorKt$processTapGesture$1.f2158c = cd4Var2;
                                                tapGestureDetectorKt$processTapGesture$1.f2159d = null;
                                                tapGestureDetectorKt$processTapGesture$1.f2160e = null;
                                                tapGestureDetectorKt$processTapGesture$1.f2161f = null;
                                                tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                                                tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                                                tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                                                tapGestureDetectorKt$processTapGesture$1.f2166k = 8;
                                                if (m940c(c0332f2, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                                                    cd4Var3 = cd4Var2;
                                                    c0108p6 = c0108p3;
                                                    un1Var5 = un1Var2;
                                                    m944g(un1Var5, cd4Var3, new TapGestureDetectorKt$processTapGesture$secondUp$1(c0108p6, null));
                                                    return xfaVar;
                                                }
                                            } else {
                                                if (pk5Var2 instanceof nk5) {
                                                    kg7Var7 = ((nk5) pk5Var2).f52878a;
                                                } else {
                                                    if (pk5Var2 instanceof mk5) {
                                                        gm5.m12750e();
                                                        return null;
                                                    }
                                                    kg7Var7 = null;
                                                }
                                                vi3Var15 = vi3Var13;
                                                vi3Var16 = vi3Var14;
                                                c0108p5 = c0108p3;
                                                un1Var4 = un1Var2;
                                                if (kg7Var7 != null) {
                                                    kg7Var7.m15189a();
                                                    m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$8(c0108p5, null));
                                                    vi3Var16.invoke(new gq6(kg7Var7.f47237c));
                                                    return xfaVar;
                                                }
                                                m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$9(c0108p5, null));
                                                if (vi3Var15 != null) {
                                                    vi3Var15.invoke(new gq6(kg7Var4.f47237c));
                                                    return xfaVar;
                                                }
                                            }
                                        }
                                    }
                                } else if (vi3Var11 != null) {
                                    vi3Var11.invoke(new gq6(kg7Var4.f47237c));
                                    return xfaVar;
                                }
                            }
                        } else if (vi3Var8 != null) {
                            vi3Var8.invoke(new gq6(kg7Var3.f47237c));
                            return xfaVar;
                        }
                    }
                    return xfaVar;
                }
                vi3Var5.invoke(new gq6(kg7Var2.f47237c));
                tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p2;
                tapGestureDetectorKt$processTapGesture$1.f2158c = cd4Var;
                tapGestureDetectorKt$processTapGesture$1.f2159d = null;
                tapGestureDetectorKt$processTapGesture$1.f2160e = null;
                tapGestureDetectorKt$processTapGesture$1.f2161f = null;
                tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                tapGestureDetectorKt$processTapGesture$1.f2166k = 4;
                if (m940c(c0332f3, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                    c0108p4 = c0108p2;
                    un1Var3 = un1Var2;
                    m944g(un1Var3, cd4Var, new TapGestureDetectorKt$processTapGesture$3(c0108p4, null));
                    return xfaVar;
                }
                return coroutineSingletons;
            case 4:
                cd4Var = (cd4) tapGestureDetectorKt$processTapGesture$1.f2158c;
                c0108p4 = (C0108p) tapGestureDetectorKt$processTapGesture$1.f2157b;
                un1Var3 = (un1) tapGestureDetectorKt$processTapGesture$1.f2156a;
                AbstractC3193b.m15359b(objM947j);
                xfaVar = xfaVar2;
                m944g(un1Var3, cd4Var, new TapGestureDetectorKt$processTapGesture$3(c0108p4, null));
                return xfaVar;
            case 5:
                cd4VarM944g = (cd4) tapGestureDetectorKt$processTapGesture$1.f2164i;
                kg7Var4 = (kg7) tapGestureDetectorKt$processTapGesture$1.f2163h;
                vi3Var11 = (vi3) tapGestureDetectorKt$processTapGesture$1.f2162g;
                aj3Var5 = (aj3) tapGestureDetectorKt$processTapGesture$1.f2161f;
                vi3 vi3Var23 = (vi3) tapGestureDetectorKt$processTapGesture$1.f2160e;
                vi3 vi3Var24 = tapGestureDetectorKt$processTapGesture$1.f2159d;
                C0108p c0108p9 = (C0108p) tapGestureDetectorKt$processTapGesture$1.f2158c;
                un1 un1Var7 = (un1) tapGestureDetectorKt$processTapGesture$1.f2157b;
                C0332f c0332f4 = (C0332f) tapGestureDetectorKt$processTapGesture$1.f2156a;
                AbstractC3193b.m15359b(objM947j);
                c0332f2 = c0332f4;
                vi3Var7 = vi3Var23;
                c0108p3 = c0108p9;
                xfaVar = xfaVar2;
                vi3Var12 = vi3Var24;
                un1Var2 = un1Var7;
                kg7Var5 = (kg7) objM947j;
                if (kg7Var5 != null) {
                    pg9VarM23926u2 = wfb.m23926u(un1Var2, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$6(cd4VarM944g, c0108p3, null), 1);
                    if (aj3Var5 != aj3Var6) {
                        m944g(un1Var2, pg9VarM23926u2, new TapGestureDetectorKt$processTapGesture$7(aj3Var5, c0108p3, kg7Var5, null));
                    }
                    if (vi3Var7 == null) {
                        tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                        tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p3;
                        tapGestureDetectorKt$processTapGesture$1.f2158c = vi3Var12;
                        tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var11;
                        tapGestureDetectorKt$processTapGesture$1.f2160e = pg9VarM23926u2;
                        tapGestureDetectorKt$processTapGesture$1.f2161f = kg7Var4;
                        tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                        tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                        tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                        tapGestureDetectorKt$processTapGesture$1.f2166k = 6;
                        objM947j = m947j(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                        if (objM947j != coroutineSingletons) {
                            cd4Var2 = pg9VarM23926u2;
                            kg7Var4 = kg7Var4;
                            vi3Var15 = vi3Var11;
                            vi3Var16 = vi3Var12;
                            c0108p5 = c0108p3;
                            un1Var4 = un1Var2;
                            kg7Var7 = (kg7) objM947j;
                            if (kg7Var7 != null) {
                                kg7Var7.m15189a();
                                m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$8(c0108p5, null));
                                vi3Var16.invoke(new gq6(kg7Var7.f47237c));
                                return xfaVar;
                            }
                            m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$9(c0108p5, null));
                            if (vi3Var15 != null) {
                                vi3Var15.invoke(new gq6(kg7Var4.f47237c));
                                return xfaVar;
                            }
                        }
                    } else {
                        tapGestureDetectorKt$processTapGesture$1.f2156a = c0332f2;
                        tapGestureDetectorKt$processTapGesture$1.f2157b = un1Var2;
                        tapGestureDetectorKt$processTapGesture$1.f2158c = c0108p3;
                        tapGestureDetectorKt$processTapGesture$1.f2159d = vi3Var12;
                        tapGestureDetectorKt$processTapGesture$1.f2160e = vi3Var7;
                        tapGestureDetectorKt$processTapGesture$1.f2161f = vi3Var11;
                        tapGestureDetectorKt$processTapGesture$1.f2162g = pg9VarM23926u2;
                        tapGestureDetectorKt$processTapGesture$1.f2163h = kg7Var4;
                        tapGestureDetectorKt$processTapGesture$1.f2164i = kg7Var5;
                        tapGestureDetectorKt$processTapGesture$1.f2166k = 7;
                        objM946i2 = m946i(c0332f2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                        if (objM946i2 != coroutineSingletons) {
                            vi3Var13 = vi3Var11;
                            vi3Var14 = vi3Var12;
                            cd4Var2 = pg9VarM23926u2;
                            kg7Var6 = kg7Var5;
                            objM947j = objM946i2;
                            pk5Var2 = (pk5) objM947j;
                            if (fa4.m11650l(pk5Var2, ok5Var)) {
                                vi3Var7.invoke(new gq6(kg7Var6.f47237c));
                                tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                                tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p3;
                                tapGestureDetectorKt$processTapGesture$1.f2158c = cd4Var2;
                                tapGestureDetectorKt$processTapGesture$1.f2159d = null;
                                tapGestureDetectorKt$processTapGesture$1.f2160e = null;
                                tapGestureDetectorKt$processTapGesture$1.f2161f = null;
                                tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                                tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                                tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                                tapGestureDetectorKt$processTapGesture$1.f2166k = 8;
                                if (m940c(c0332f2, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                                    cd4Var3 = cd4Var2;
                                    c0108p6 = c0108p3;
                                    un1Var5 = un1Var2;
                                    m944g(un1Var5, cd4Var3, new TapGestureDetectorKt$processTapGesture$secondUp$1(c0108p6, null));
                                    return xfaVar;
                                }
                            } else {
                                if (pk5Var2 instanceof nk5) {
                                    kg7Var7 = ((nk5) pk5Var2).f52878a;
                                } else {
                                    if (pk5Var2 instanceof mk5) {
                                        gm5.m12750e();
                                        return null;
                                    }
                                    kg7Var7 = null;
                                }
                                vi3Var15 = vi3Var13;
                                vi3Var16 = vi3Var14;
                                c0108p5 = c0108p3;
                                un1Var4 = un1Var2;
                                if (kg7Var7 != null) {
                                    kg7Var7.m15189a();
                                    m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$8(c0108p5, null));
                                    vi3Var16.invoke(new gq6(kg7Var7.f47237c));
                                    return xfaVar;
                                }
                                m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$9(c0108p5, null));
                                if (vi3Var15 != null) {
                                    vi3Var15.invoke(new gq6(kg7Var4.f47237c));
                                    return xfaVar;
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                if (vi3Var11 != null) {
                    vi3Var11.invoke(new gq6(kg7Var4.f47237c));
                    return xfaVar;
                }
                return xfaVar;
            case 6:
                kg7Var4 = (kg7) tapGestureDetectorKt$processTapGesture$1.f2161f;
                cd4Var2 = (cd4) tapGestureDetectorKt$processTapGesture$1.f2160e;
                vi3Var15 = tapGestureDetectorKt$processTapGesture$1.f2159d;
                vi3Var16 = (vi3) tapGestureDetectorKt$processTapGesture$1.f2158c;
                c0108p5 = (C0108p) tapGestureDetectorKt$processTapGesture$1.f2157b;
                un1Var4 = (un1) tapGestureDetectorKt$processTapGesture$1.f2156a;
                AbstractC3193b.m15359b(objM947j);
                xfaVar = xfaVar2;
                kg7Var7 = (kg7) objM947j;
                if (kg7Var7 != null) {
                    kg7Var7.m15189a();
                    m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$8(c0108p5, null));
                    vi3Var16.invoke(new gq6(kg7Var7.f47237c));
                    return xfaVar;
                }
                m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$9(c0108p5, null));
                if (vi3Var15 != null) {
                    vi3Var15.invoke(new gq6(kg7Var4.f47237c));
                    return xfaVar;
                }
                return xfaVar;
            case 7:
                kg7Var6 = (kg7) tapGestureDetectorKt$processTapGesture$1.f2164i;
                kg7Var4 = (kg7) tapGestureDetectorKt$processTapGesture$1.f2163h;
                cd4Var2 = (cd4) tapGestureDetectorKt$processTapGesture$1.f2162g;
                vi3Var13 = (vi3) tapGestureDetectorKt$processTapGesture$1.f2161f;
                vi3Var7 = (vi3) tapGestureDetectorKt$processTapGesture$1.f2160e;
                vi3Var14 = tapGestureDetectorKt$processTapGesture$1.f2159d;
                c0108p3 = (C0108p) tapGestureDetectorKt$processTapGesture$1.f2158c;
                un1Var2 = (un1) tapGestureDetectorKt$processTapGesture$1.f2157b;
                c0332f2 = (C0332f) tapGestureDetectorKt$processTapGesture$1.f2156a;
                AbstractC3193b.m15359b(objM947j);
                xfaVar = xfaVar2;
                pk5Var2 = (pk5) objM947j;
                if (fa4.m11650l(pk5Var2, ok5Var)) {
                    vi3Var7.invoke(new gq6(kg7Var6.f47237c));
                    tapGestureDetectorKt$processTapGesture$1.f2156a = un1Var2;
                    tapGestureDetectorKt$processTapGesture$1.f2157b = c0108p3;
                    tapGestureDetectorKt$processTapGesture$1.f2158c = cd4Var2;
                    tapGestureDetectorKt$processTapGesture$1.f2159d = null;
                    tapGestureDetectorKt$processTapGesture$1.f2160e = null;
                    tapGestureDetectorKt$processTapGesture$1.f2161f = null;
                    tapGestureDetectorKt$processTapGesture$1.f2162g = null;
                    tapGestureDetectorKt$processTapGesture$1.f2163h = null;
                    tapGestureDetectorKt$processTapGesture$1.f2164i = null;
                    tapGestureDetectorKt$processTapGesture$1.f2166k = 8;
                    if (m940c(c0332f2, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                        cd4Var3 = cd4Var2;
                        c0108p6 = c0108p3;
                        un1Var5 = un1Var2;
                        m944g(un1Var5, cd4Var3, new TapGestureDetectorKt$processTapGesture$secondUp$1(c0108p6, null));
                        return xfaVar;
                    }
                    return coroutineSingletons;
                }
                if (pk5Var2 instanceof nk5) {
                    kg7Var7 = ((nk5) pk5Var2).f52878a;
                } else {
                    if (pk5Var2 instanceof mk5) {
                        gm5.m12750e();
                        return null;
                    }
                    kg7Var7 = null;
                }
                vi3Var15 = vi3Var13;
                vi3Var16 = vi3Var14;
                c0108p5 = c0108p3;
                un1Var4 = un1Var2;
                if (kg7Var7 != null) {
                    kg7Var7.m15189a();
                    m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$8(c0108p5, null));
                    vi3Var16.invoke(new gq6(kg7Var7.f47237c));
                    return xfaVar;
                }
                m944g(un1Var4, cd4Var2, new TapGestureDetectorKt$processTapGesture$9(c0108p5, null));
                if (vi3Var15 != null) {
                    vi3Var15.invoke(new gq6(kg7Var4.f47237c));
                    return xfaVar;
                }
                return xfaVar;
            case 8:
                cd4Var3 = (cd4) tapGestureDetectorKt$processTapGesture$1.f2158c;
                c0108p6 = (C0108p) tapGestureDetectorKt$processTapGesture$1.f2157b;
                un1Var5 = (un1) tapGestureDetectorKt$processTapGesture$1.f2156a;
                AbstractC3193b.m15359b(objM947j);
                xfaVar = xfaVar2;
                m944g(un1Var5, cd4Var3, new TapGestureDetectorKt$processTapGesture$secondUp$1(c0108p6, null));
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public static final Object m946i(C0332f c0332f, PointerEventPass pointerEventPass, ContinuationImpl continuationImpl) throws Throwable {
        TapGestureDetectorKt$waitForLongPress$1 tapGestureDetectorKt$waitForLongPress$1;
        Ref$ObjectRef ref$ObjectRef;
        if (continuationImpl instanceof TapGestureDetectorKt$waitForLongPress$1) {
            tapGestureDetectorKt$waitForLongPress$1 = (TapGestureDetectorKt$waitForLongPress$1) continuationImpl;
            int i = tapGestureDetectorKt$waitForLongPress$1.f2188c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$waitForLongPress$1.f2188c = i - Integer.MIN_VALUE;
            } else {
                tapGestureDetectorKt$waitForLongPress$1 = new TapGestureDetectorKt$waitForLongPress$1(continuationImpl);
            }
        } else {
            tapGestureDetectorKt$waitForLongPress$1 = new TapGestureDetectorKt$waitForLongPress$1(continuationImpl);
        }
        Object obj = tapGestureDetectorKt$waitForLongPress$1.f2187b;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tapGestureDetectorKt$waitForLongPress$1.f2188c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                ref$ObjectRef2.f47718a = mk5.f51437a;
                long jMo13456b = c0332f.m1475f().mo13456b();
                zi3 tapGestureDetectorKt$waitForLongPress$2 = new TapGestureDetectorKt$waitForLongPress$2(pointerEventPass, ref$ObjectRef2, null);
                tapGestureDetectorKt$waitForLongPress$1.f2186a = ref$ObjectRef2;
                tapGestureDetectorKt$waitForLongPress$1.f2188c = 1;
                if (c0332f.m1476g(jMo13456b, tapGestureDetectorKt$waitForLongPress$2, tapGestureDetectorKt$waitForLongPress$1) == obj2) {
                    return obj2;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = tapGestureDetectorKt$waitForLongPress$1.f2186a;
                AbstractC3193b.m15359b(obj);
            }
            return ref$ObjectRef.f47718a;
        } catch (PointerEventTimeoutCancellationException unused) {
            return ok5.f54493a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7 A[LOOP:1: B:23:0x0071->B:44:0x00d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b3 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: j */
    public static final java.lang.Object m947j(androidx.compose.p002ui.input.pointer.C0332f r17, androidx.compose.p002ui.input.pointer.PointerEventPass r18, kotlin.coroutines.jvm.internal.BaseContinuationImpl r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0117w.m947j(androidx.compose.ui.input.pointer.f, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }
}
