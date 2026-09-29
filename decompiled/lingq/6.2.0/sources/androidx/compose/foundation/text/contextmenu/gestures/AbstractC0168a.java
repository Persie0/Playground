package androidx.compose.foundation.text.contextmenu.gestures;

import androidx.compose.foundation.gestures.AbstractC0095c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.og7;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.gestures.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0168a {
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[LOOP:0: B:21:0x0051->B:25:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003b -> B:18:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m1062a(androidx.compose.p002ui.input.pointer.C0332f r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1 r0 = (androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1) r0
            int r1 = r0.f2853c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2853c = r1
            goto L18
        L13:
            androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1 r0 = new androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f2852b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f2853c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            androidx.compose.ui.input.pointer.f r7 = r0.f2851a
            kotlin.AbstractC3193b.m15359b(r8)
            goto L3e
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r7)
            r7 = 0
            return r7
        L30:
            kotlin.AbstractC3193b.m15359b(r8)
        L33:
            r0.f2851a = r7
            r0.f2853c = r3
            java.lang.Object r8 = androidx.compose.p002ui.input.pointer.C0332f.m1472c(r7, r0)
            if (r8 != r1) goto L3e
            return r1
        L3e:
            fg7 r8 = (p000.fg7) r8
            int r2 = r8.f39074d
            java.util.List r8 = r8.f39071a
            r2 = r2 & 66
            if (r2 == 0) goto L33
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
            r5 = r4
        L51:
            if (r5 >= r2) goto L63
            java.lang.Object r6 = r8.get(r5)
            kg7 r6 = (p000.kg7) r6
            boolean r6 = p000.ci8.m4722g(r6)
            if (r6 != 0) goto L60
            goto L33
        L60:
            int r5 = r5 + 1
            goto L51
        L63:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.gestures.AbstractC0168a.m1062a(androidx.compose.ui.input.pointer.f, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static final Object m1063b(og7 og7Var, vi3 vi3Var, Continuation continuation) {
        Object objM836k = AbstractC0095c.m836k(og7Var, new RightClickGesturesKt$onRightClickDown$2(vi3Var, null), continuation);
        return objM836k == CoroutineSingletons.COROUTINE_SUSPENDED ? objM836k : xfa.f68157a;
    }
}
