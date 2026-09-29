package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.AbstractC0095c;
import androidx.compose.foundation.gestures.AbstractC0102j;
import androidx.compose.p002ui.input.pointer.C0332f;
import androidx.compose.p002ui.input.pointer.C0333g;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import p000.C3047gq;
import p000.C3386nv;
import p000.av8;
import p000.bv8;
import p000.cg7;
import p000.ci8;
import p000.cx9;
import p000.fg7;
import p000.gq6;
import p000.ij6;
import p000.kg7;
import p000.og7;
import p000.p84;
import p000.te1;
import p000.u91;
import p000.ws6;
import p000.x44;
import p000.xfa;
import p000.xt9;
import p000.yw4;
import p000.z93;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0202c {
    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b A[LOOP:0: B:19:0x004c->B:23:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m1095a(androidx.compose.p002ui.input.pointer.C0332f r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1) r0
            int r1 = r0.f2997c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2997c = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f2996b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f2997c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            androidx.compose.ui.input.pointer.f r7 = r0.f2995a
            kotlin.AbstractC3193b.m15359b(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r7)
            r7 = 0
            return r7
        L30:
            kotlin.AbstractC3193b.m15359b(r8)
        L33:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.p002ui.input.pointer.PointerEventPass.Main
            r0.f2995a = r7
            r0.f2997c = r3
            java.lang.Object r8 = r7.m1473b(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            fg7 r8 = (p000.fg7) r8
            java.util.List r2 = r8.f39071a
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L4c:
            if (r5 >= r4) goto L5e
            java.lang.Object r6 = r2.get(r5)
            kg7 r6 = (p000.kg7) r6
            boolean r6 = p000.ci8.m4722g(r6)
            if (r6 != 0) goto L5b
            goto L33
        L5b:
            int r5 = r5 + 1
            goto L4c
        L5e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AbstractC0202c.m1095a(androidx.compose.ui.input.pointer.f, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r15 == r1) goto L48;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1096b(C0332f c0332f, xt9 xt9Var, fg7 fg7Var, int i, BaseContinuationImpl baseContinuationImpl) throws Throwable {
        SelectionGesturesKt$touchSelectionSubsequentPress$1 selectionGesturesKt$touchSelectionSubsequentPress$1;
        long j;
        Ref$LongRef ref$LongRef;
        if (baseContinuationImpl instanceof SelectionGesturesKt$touchSelectionSubsequentPress$1) {
            selectionGesturesKt$touchSelectionSubsequentPress$1 = (SelectionGesturesKt$touchSelectionSubsequentPress$1) baseContinuationImpl;
            int i2 = selectionGesturesKt$touchSelectionSubsequentPress$1.f3018f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$touchSelectionSubsequentPress$1.f3018f = i2 - Integer.MIN_VALUE;
            } else {
                selectionGesturesKt$touchSelectionSubsequentPress$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$1(baseContinuationImpl);
            }
        } else {
            selectionGesturesKt$touchSelectionSubsequentPress$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$1(baseContinuationImpl);
        }
        Object objM1477i = selectionGesturesKt$touchSelectionSubsequentPress$1.f3017e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = selectionGesturesKt$touchSelectionSubsequentPress$1.f3018f;
        xfa xfaVar = xfa.f68157a;
        int i4 = 1;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM1477i);
                kg7 kg7Var = (kg7) u91.m22589G0(fg7Var.f39071a);
                j = kg7Var.f47235a;
                xt9Var.mo17646c(kg7Var.f47237c, i > 2 ? p84.f55749k : p84.f55748j);
                ref$LongRef = new Ref$LongRef();
                ref$LongRef.f47717a = 9205357640488583168L;
                long jMo13456b = c0332f.m1475f().mo13456b();
                C0195xcb1d223 c0195xcb1d223 = new C0195xcb1d223(j, ref$LongRef, null);
                selectionGesturesKt$touchSelectionSubsequentPress$1.f3013a = c0332f;
                selectionGesturesKt$touchSelectionSubsequentPress$1.f3014b = xt9Var;
                selectionGesturesKt$touchSelectionSubsequentPress$1.f3015c = ref$LongRef;
                selectionGesturesKt$touchSelectionSubsequentPress$1.f3016d = j;
                selectionGesturesKt$touchSelectionSubsequentPress$1.f3018f = 1;
                objM1477i = c0332f.m1477i(jMo13456b, c0195xcb1d223, selectionGesturesKt$touchSelectionSubsequentPress$1);
                if (objM1477i == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 == 1) {
                long j2 = selectionGesturesKt$touchSelectionSubsequentPress$1.f3016d;
                ref$LongRef = selectionGesturesKt$touchSelectionSubsequentPress$1.f3015c;
                xt9 xt9Var2 = selectionGesturesKt$touchSelectionSubsequentPress$1.f3014b;
                C0332f c0332f2 = selectionGesturesKt$touchSelectionSubsequentPress$1.f3013a;
                try {
                    AbstractC3193b.m15359b(objM1477i);
                    j = j2;
                    xt9Var = xt9Var2;
                    c0332f = c0332f2;
                } catch (CancellationException e) {
                    e = e;
                    xt9Var = xt9Var2;
                    xt9Var.onCancel();
                    throw e;
                }
            } else {
                if (i3 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xt9Var = selectionGesturesKt$touchSelectionSubsequentPress$1.f3014b;
                c0332f = selectionGesturesKt$touchSelectionSubsequentPress$1.f3013a;
                AbstractC3193b.m15359b(objM1477i);
            }
            if (!((Boolean) objM1477i).booleanValue()) {
                xt9Var.onCancel();
                return xfaVar;
            }
            List list = c0332f.f4136f.f4142O.f39071a;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                kg7 kg7Var2 = (kg7) list.get(i5);
                if (ci8.m4724i(kg7Var2)) {
                    kg7Var2.m15189a();
                }
            }
            xt9Var.mo17644a();
            return xfaVar;
            DownResolution downResolution = (DownResolution) objM1477i;
            if (downResolution == null) {
                downResolution = DownResolution.Timeout;
            }
            if (downResolution == DownResolution.Cancel) {
                xt9Var.onCancel();
                return xfaVar;
            }
            if (downResolution == DownResolution.Up) {
                xt9Var.mo17644a();
                return xfaVar;
            }
            if (downResolution == DownResolution.Drag) {
                xt9Var.mo17648e(ref$LongRef.f47717a);
            }
            av8 av8Var = new av8(xt9Var, i4);
            selectionGesturesKt$touchSelectionSubsequentPress$1.f3013a = c0332f;
            selectionGesturesKt$touchSelectionSubsequentPress$1.f3014b = xt9Var;
            selectionGesturesKt$touchSelectionSubsequentPress$1.f3015c = null;
            selectionGesturesKt$touchSelectionSubsequentPress$1.f3018f = 2;
            objM1477i = AbstractC0102j.m871f(c0332f, j, av8Var, selectionGesturesKt$touchSelectionSubsequentPress$1);
        } catch (CancellationException e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Object m1097c(og7 og7Var, x44 x44Var, xt9 xt9Var, Continuation continuation) {
        C0333g c0333g = (C0333g) og7Var;
        c0333g.getClass();
        Object objM836k = AbstractC0095c.m836k(og7Var, new SelectionGesturesKt$awaitSelectionGestures$2(new C3047gq(te1.m21979L(c0333g).f4329V), x44Var, xt9Var, null), continuation);
        return objM836k == CoroutineSingletons.COROUTINE_SUSPENDED ? objM836k : xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0051, B:44:0x00b5, B:46:0x00bd, B:48:0x00cc, B:50:0x00d8, B:41:0x009b), top: B:99:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0051, B:44:0x00b5, B:46:0x00bd, B:48:0x00cc, B:50:0x00d8, B:41:0x009b), top: B:99:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0051, B:44:0x00b5, B:46:0x00bd, B:48:0x00cc, B:50:0x00d8, B:41:0x009b), top: B:99:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0169, code lost:
    
        if (r3 == r9) goto L83;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1098d(C0332f c0332f, x44 x44Var, C3047gq c3047gq, fg7 fg7Var, BaseContinuationImpl baseContinuationImpl) throws Throwable {
        SelectionGesturesKt$mouseSelection$1 selectionGesturesKt$mouseSelection$1;
        ij6 ij6Var;
        boolean z;
        Ref$BooleanRef ref$BooleanRef;
        yw4 yw4Var;
        boolean z2;
        List list;
        int size;
        kg7 kg7Var;
        C0332f c0332f2 = c0332f;
        x44 x44Var2 = x44Var;
        ij6 ij6Var2 = p84.f55747i;
        if (baseContinuationImpl instanceof SelectionGesturesKt$mouseSelection$1) {
            selectionGesturesKt$mouseSelection$1 = (SelectionGesturesKt$mouseSelection$1) baseContinuationImpl;
            int i = selectionGesturesKt$mouseSelection$1.f3007e;
            if ((i & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$mouseSelection$1.f3007e = i - Integer.MIN_VALUE;
            } else {
                selectionGesturesKt$mouseSelection$1 = new SelectionGesturesKt$mouseSelection$1(baseContinuationImpl);
            }
        } else {
            selectionGesturesKt$mouseSelection$1 = new SelectionGesturesKt$mouseSelection$1(baseContinuationImpl);
        }
        SelectionGesturesKt$mouseSelection$1 selectionGesturesKt$mouseSelection$2 = selectionGesturesKt$mouseSelection$1;
        Object objM871f = selectionGesturesKt$mouseSelection$2.f3006d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = selectionGesturesKt$mouseSelection$2.f3007e;
        int i3 = 0;
        try {
            try {
                if (i2 == 0) {
                    AbstractC3193b.m15359b(objM871f);
                    kg7 kg7Var2 = (kg7) fg7Var.f39071a.get(0);
                    if ((fg7Var.f39075e & 1) != 0) {
                        long j = kg7Var2.f47237c;
                        C0205f c0205f = (C0205f) x44Var2.f67753d;
                        yw4 yw4Var2 = c0205f.f3079d;
                        if (yw4Var2 == null || yw4Var2.m25363d() == null || !c0205f.m1111l()) {
                            z2 = false;
                        } else {
                            c0205f.f3095t = -1;
                            z93 z93Var = c0205f.f3087l;
                            if (z93Var != null) {
                                z93.m25512a(z93Var);
                            }
                            x44Var2.m24267d(c0205f.m1114o(), j, false, p84.f55747i);
                            z2 = true;
                        }
                        if (z2) {
                            kg7Var2.m15189a();
                            long j2 = kg7Var2.f47235a;
                            cg7 cg7Var = new cg7(x44Var2, 17);
                            selectionGesturesKt$mouseSelection$2.f3003a = c0332f2;
                            selectionGesturesKt$mouseSelection$2.f3004b = x44Var2;
                            selectionGesturesKt$mouseSelection$2.f3007e = 1;
                            objM871f = AbstractC0102j.m871f(c0332f2, j2, cg7Var, selectionGesturesKt$mouseSelection$2);
                            if (objM871f == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            if (((Boolean) objM871f).booleanValue()) {
                                list = c0332f2.f4136f.f4142O.f39071a;
                                size = list.size();
                                while (i3 < size) {
                                    kg7Var = (kg7) list.get(i3);
                                    if (ci8.m4724i(kg7Var)) {
                                        kg7Var.m15189a();
                                    }
                                    i3++;
                                }
                            }
                            x44Var2.m24266c();
                        }
                    } else {
                        int i4 = c3047gq.f41171b;
                        if (i4 != 1) {
                            ij6Var = i4 != 2 ? p84.f55749k : p84.f55748j;
                        } else {
                            ij6Var = ij6Var2;
                        }
                        long j3 = kg7Var2.f47237c;
                        C0205f c0205f2 = (C0205f) x44Var2.f67753d;
                        if (!c0205f2.m1111l() || c0205f2.m1114o().f65990a.f54604b.length() == 0 || (yw4Var = c0205f2.f3079d) == null || yw4Var.m25363d() == null) {
                            z = false;
                        } else {
                            z93 z93Var2 = c0205f2.f3087l;
                            if (z93Var2 != null) {
                                z93.m25512a(z93Var2);
                            }
                            c0205f2.f3090o = j3;
                            c0205f2.f3095t = -1;
                            c0205f2.m1107h(true);
                            long jM24267d = x44Var2.m24267d(c0205f2.m1114o(), c0205f2.f3090o, true, ij6Var);
                            if (i4 >= 2) {
                                x44Var2.f67751b = true;
                                x44Var2.f67752c = new cx9(jM24267d);
                            }
                            z = true;
                        }
                        if (z) {
                            ref$BooleanRef = new Ref$BooleanRef();
                            ref$BooleanRef.f47713a = !ij6Var.equals(ij6Var2);
                            long j4 = kg7Var2.f47235a;
                            ws6 ws6Var = new ws6(x44Var2, ij6Var, ref$BooleanRef, 12);
                            selectionGesturesKt$mouseSelection$2.f3003a = c0332f2;
                            selectionGesturesKt$mouseSelection$2.f3004b = x44Var2;
                            selectionGesturesKt$mouseSelection$2.f3005c = ref$BooleanRef;
                            selectionGesturesKt$mouseSelection$2.f3007e = 2;
                            objM871f = AbstractC0102j.m871f(c0332f2, j4, ws6Var, selectionGesturesKt$mouseSelection$2);
                        }
                    }
                } else if (i2 == 1) {
                    x44Var2 = selectionGesturesKt$mouseSelection$2.f3004b;
                    c0332f2 = selectionGesturesKt$mouseSelection$2.f3003a;
                    AbstractC3193b.m15359b(objM871f);
                    if (((Boolean) objM871f).booleanValue()) {
                        list = c0332f2.f4136f.f4142O.f39071a;
                        size = list.size();
                        while (i3 < size) {
                            kg7Var = (kg7) list.get(i3);
                            if (ci8.m4724i(kg7Var)) {
                                kg7Var.m15189a();
                            }
                            i3++;
                        }
                    }
                    x44Var2.m24266c();
                } else {
                    if (i2 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$BooleanRef ref$BooleanRef2 = selectionGesturesKt$mouseSelection$2.f3005c;
                    x44Var2 = selectionGesturesKt$mouseSelection$2.f3004b;
                    C0332f c0332f3 = selectionGesturesKt$mouseSelection$2.f3003a;
                    AbstractC3193b.m15359b(objM871f);
                    ref$BooleanRef = ref$BooleanRef2;
                    c0332f2 = c0332f3;
                    if (((Boolean) objM871f).booleanValue() && ref$BooleanRef.f47713a) {
                        List list2 = c0332f2.f4136f.f4142O.f39071a;
                        int size2 = list2.size();
                        while (i3 < size2) {
                            kg7 kg7Var3 = (kg7) list2.get(i3);
                            if (ci8.m4724i(kg7Var3)) {
                                kg7Var3.m15189a();
                            }
                            i3++;
                        }
                    }
                    x44Var2.m24266c();
                }
                return xfa.f68157a;
            } catch (Throwable th) {
                x44Var2.m24266c();
                throw th;
            }
        } catch (Throwable th2) {
            x44Var2.m24266c();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r15 == r1) goto L35;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1099e(C0332f c0332f, xt9 xt9Var, fg7 fg7Var, BaseContinuationImpl baseContinuationImpl) throws Throwable {
        SelectionGesturesKt$touchSelectionFirstPress$1 selectionGesturesKt$touchSelectionFirstPress$1;
        kg7 kg7Var;
        if (baseContinuationImpl instanceof SelectionGesturesKt$touchSelectionFirstPress$1) {
            selectionGesturesKt$touchSelectionFirstPress$1 = (SelectionGesturesKt$touchSelectionFirstPress$1) baseContinuationImpl;
            int i = selectionGesturesKt$touchSelectionFirstPress$1.f3012e;
            if ((i & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$touchSelectionFirstPress$1.f3012e = i - Integer.MIN_VALUE;
            } else {
                selectionGesturesKt$touchSelectionFirstPress$1 = new SelectionGesturesKt$touchSelectionFirstPress$1(baseContinuationImpl);
            }
        } else {
            selectionGesturesKt$touchSelectionFirstPress$1 = new SelectionGesturesKt$touchSelectionFirstPress$1(baseContinuationImpl);
        }
        Object objM867b = selectionGesturesKt$touchSelectionFirstPress$1.f3011d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = selectionGesturesKt$touchSelectionFirstPress$1.f3012e;
        int i3 = 0;
        boolean z = true;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM867b);
                kg7Var = (kg7) u91.m22589G0(fg7Var.f39071a);
                long j = kg7Var.f47235a;
                selectionGesturesKt$touchSelectionFirstPress$1.f3008a = c0332f;
                selectionGesturesKt$touchSelectionFirstPress$1.f3009b = xt9Var;
                selectionGesturesKt$touchSelectionFirstPress$1.f3010c = kg7Var;
                selectionGesturesKt$touchSelectionFirstPress$1.f3012e = 1;
                objM867b = AbstractC0102j.m867b(c0332f, j, selectionGesturesKt$touchSelectionFirstPress$1);
                if (objM867b == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                kg7 kg7Var2 = selectionGesturesKt$touchSelectionFirstPress$1.f3010c;
                xt9Var = selectionGesturesKt$touchSelectionFirstPress$1.f3009b;
                C0332f c0332f2 = selectionGesturesKt$touchSelectionFirstPress$1.f3008a;
                AbstractC3193b.m15359b(objM867b);
                kg7Var = kg7Var2;
                c0332f = c0332f2;
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xt9Var = selectionGesturesKt$touchSelectionFirstPress$1.f3009b;
                c0332f = selectionGesturesKt$touchSelectionFirstPress$1.f3008a;
                AbstractC3193b.m15359b(objM867b);
            }
            if (((Boolean) objM867b).booleanValue()) {
                List list = c0332f.f4136f.f4142O.f39071a;
                int size = list.size();
                while (i3 < size) {
                    kg7 kg7Var3 = (kg7) list.get(i3);
                    if (ci8.m4724i(kg7Var3)) {
                        kg7Var3.m15189a();
                    }
                    i3++;
                }
                xt9Var.mo17644a();
            } else {
                xt9Var.onCancel();
            }
            return xfa.f68157a;
            kg7 kg7Var4 = (kg7) objM867b;
            if (kg7Var4 != null) {
                long j2 = kg7Var4.f47237c;
                if (gq6.m12822c(gq6.m12824e(kg7Var.f47237c, j2)) >= AbstractC0102j.m874i(c0332f.m1475f(), kg7Var.f47243i)) {
                    z = false;
                }
                if (z) {
                    xt9Var.mo17646c(j2, bv8.f9055a);
                    long j3 = kg7Var4.f47235a;
                    av8 av8Var = new av8(xt9Var, i3);
                    selectionGesturesKt$touchSelectionFirstPress$1.f3008a = c0332f;
                    selectionGesturesKt$touchSelectionFirstPress$1.f3009b = xt9Var;
                    selectionGesturesKt$touchSelectionFirstPress$1.f3010c = null;
                    selectionGesturesKt$touchSelectionFirstPress$1.f3012e = 2;
                    objM867b = AbstractC0102j.m871f(c0332f, j3, av8Var, selectionGesturesKt$touchSelectionFirstPress$1);
                }
            }
            return xfa.f68157a;
        } catch (CancellationException e) {
            xt9Var.onCancel();
            throw e;
        }
    }
}
