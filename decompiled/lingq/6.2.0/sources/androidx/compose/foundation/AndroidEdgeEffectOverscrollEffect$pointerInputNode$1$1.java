package androidx.compose.foundation;

import androidx.compose.p002ui.input.pointer.C0332f;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", m4291f = "AndroidOverscroll.android.kt", m4292l = {788, 792}, m4293m = "invokeSuspend", m4294v = 1)
final class AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public int f1648b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f1649c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0077c f1650d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1(C0077c c0077c, Continuation continuation) {
        super(2, continuation);
        this.f1650d = c0077c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1 androidEdgeEffectOverscrollEffect$pointerInputNode$1$1 = new AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1(this.f1650d, continuation);
        androidEdgeEffectOverscrollEffect$pointerInputNode$1$1.f1649c = obj;
        return androidEdgeEffectOverscrollEffect$pointerInputNode$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f A[LOOP:1: B:24:0x007b->B:28:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[EDGE_INSN: B:43:0x0093->B:30:0x0093 BREAK  A[LOOP:1: B:24:0x007b->B:28:0x008f], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004b -> B:17:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r13.f1648b
            r2 = 0
            r3 = 2
            r4 = 0
            androidx.compose.foundation.c r5 = r13.f1650d
            r6 = 1
            if (r1 == 0) goto L26
            if (r1 == r6) goto L1e
            if (r1 != r3) goto L18
            java.lang.Object r1 = r13.f1649c
            androidx.compose.ui.input.pointer.f r1 = (androidx.compose.p002ui.input.pointer.C0332f) r1
            kotlin.AbstractC3193b.m15359b(r14)
            goto L4e
        L18:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r13)
            return r4
        L1e:
            java.lang.Object r1 = r13.f1649c
            androidx.compose.ui.input.pointer.f r1 = (androidx.compose.p002ui.input.pointer.C0332f) r1
            kotlin.AbstractC3193b.m15359b(r14)
            goto L39
        L26:
            kotlin.AbstractC3193b.m15359b(r14)
            java.lang.Object r14 = r13.f1649c
            r1 = r14
            androidx.compose.ui.input.pointer.f r1 = (androidx.compose.p002ui.input.pointer.C0332f) r1
            r13.f1649c = r1
            r13.f1648b = r6
            java.lang.Object r14 = androidx.compose.foundation.gestures.AbstractC0117w.m939b(r1, r2, r4, r13, r3)
            if (r14 != r0) goto L39
            goto L4d
        L39:
            kg7 r14 = (p000.kg7) r14
            long r6 = r14.f47235a
            r5.f1745h = r6
            long r6 = r14.f47237c
            r5.f1739b = r6
        L43:
            r13.f1649c = r1
            r13.f1648b = r3
            java.lang.Object r14 = androidx.compose.p002ui.input.pointer.C0332f.m1472c(r1, r13)
            if (r14 != r0) goto L4e
        L4d:
            return r0
        L4e:
            fg7 r14 = (p000.fg7) r14
            java.util.List r14 = r14.f39071a
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r14.size()
            r6.<init>(r7)
            r7 = r14
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r8 = r2
        L63:
            if (r8 >= r7) goto L76
            java.lang.Object r9 = r14.get(r8)
            r10 = r9
            kg7 r10 = (p000.kg7) r10
            boolean r10 = r10.f47238d
            if (r10 == 0) goto L73
            r6.add(r9)
        L73:
            int r8 = r8 + 1
            goto L63
        L76:
            int r14 = r6.size()
            r7 = r2
        L7b:
            if (r7 >= r14) goto L92
            java.lang.Object r8 = r6.get(r7)
            r9 = r8
            kg7 r9 = (p000.kg7) r9
            long r9 = r9.f47235a
            long r11 = r5.f1745h
            boolean r9 = p000.pk9.m19371i(r9, r11)
            if (r9 == 0) goto L8f
            goto L93
        L8f:
            int r7 = r7 + 1
            goto L7b
        L92:
            r8 = r4
        L93:
            kg7 r8 = (p000.kg7) r8
            if (r8 != 0) goto L9e
            java.lang.Object r14 = p000.u91.m22591I0(r6)
            r8 = r14
            kg7 r8 = (p000.kg7) r8
        L9e:
            if (r8 == 0) goto La8
            long r9 = r8.f47235a
            r5.f1745h = r9
            long r7 = r8.f47237c
            r5.f1739b = r7
        La8:
            boolean r14 = r6.isEmpty()
            if (r14 == 0) goto L43
            r13 = -1
            r5.f1745h = r13
            xfa r13 = p000.xfa.f68157a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
