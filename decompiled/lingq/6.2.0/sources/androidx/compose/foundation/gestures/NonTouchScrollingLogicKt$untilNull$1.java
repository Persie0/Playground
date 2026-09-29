package androidx.compose.foundation.gestures;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.c32;
import p000.ui3;
import p000.vx8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$untilNull$1", m4291f = "NonTouchScrollingLogic.kt", m4292l = {89}, m4293m = "invokeSuspend", m4294v = 1)
final class NonTouchScrollingLogicKt$untilNull$1 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public Object f2023b;

    /* JADX INFO: renamed from: c */
    public int f2024c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f2025d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ui3 f2026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonTouchScrollingLogicKt$untilNull$1(ui3 ui3Var, Continuation continuation) {
        super(2, continuation);
        this.f2026e = ui3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NonTouchScrollingLogicKt$untilNull$1 nonTouchScrollingLogicKt$untilNull$1 = new NonTouchScrollingLogicKt$untilNull$1(this.f2026e, continuation);
        nonTouchScrollingLogicKt$untilNull$1.f2025d = obj;
        return nonTouchScrollingLogicKt$untilNull$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NonTouchScrollingLogicKt$untilNull$1) create((vx8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:15:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0037 -> B:15:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x003a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.f2024c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L14
            java.lang.Object r1 = r5.f2023b
            java.lang.Object r4 = r5.f2025d
            vx8 r4 = (p000.vx8) r4
            kotlin.AbstractC3193b.m15359b(r6)
            goto L38
        L14:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r5)
            return r2
        L1a:
            kotlin.AbstractC3193b.m15359b(r6)
            java.lang.Object r6 = r5.f2025d
            vx8 r6 = (p000.vx8) r6
            r4 = r6
        L22:
            ui3 r6 = r5.f2026e
            java.lang.Object r1 = r6.mo0a()
            if (r1 == 0) goto L37
            r5.f2025d = r4
            r5.f2023b = r1
            r5.f2024c = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = r4.m23582b(r1, r5)
            if (r6 != r0) goto L38
            return r0
        L37:
            r1 = r2
        L38:
            if (r1 != 0) goto L22
            xfa r5 = p000.xfa.f68157a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$untilNull$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
