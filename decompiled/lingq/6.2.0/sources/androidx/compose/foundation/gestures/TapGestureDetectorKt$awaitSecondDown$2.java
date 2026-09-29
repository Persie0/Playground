package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.C0332f;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.c32;
import p000.kg7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", m4291f = "TapGestureDetector.kt", m4292l = {254}, m4293m = "invokeSuspend", m4294v = 1)
final class TapGestureDetectorKt$awaitSecondDown$2 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public long f2113b;

    /* JADX INFO: renamed from: c */
    public int f2114c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f2115d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ kg7 f2116e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(kg7 kg7Var, Continuation continuation) {
        super(2, continuation);
        this.f2116e = kg7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.f2116e, continuation);
        tapGestureDetectorKt$awaitSecondDown$2.f2115d = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:12:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.f2114c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L14
            long r4 = r8.f2113b
            java.lang.Object r1 = r8.f2115d
            androidx.compose.ui.input.pointer.f r1 = (androidx.compose.p002ui.input.pointer.C0332f) r1
            kotlin.AbstractC3193b.m15359b(r9)
            goto L40
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r8)
            return r2
        L1a:
            kotlin.AbstractC3193b.m15359b(r9)
            java.lang.Object r9 = r8.f2115d
            androidx.compose.ui.input.pointer.f r9 = (androidx.compose.p002ui.input.pointer.C0332f) r9
            kg7 r1 = r8.f2116e
            long r4 = r1.f47236b
            hta r1 = r9.m1475f()
            r1.getClass()
            r6 = 40
            long r6 = r6 + r4
            r1 = r9
            r4 = r6
        L31:
            r8.f2115d = r1
            r8.f2113b = r4
            r8.f2114c = r3
            r9 = 0
            r6 = 3
            java.lang.Object r9 = androidx.compose.foundation.gestures.AbstractC0117w.m939b(r1, r9, r2, r8, r6)
            if (r9 != r0) goto L40
            return r0
        L40:
            kg7 r9 = (p000.kg7) r9
            long r6 = r9.f47236b
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 < 0) goto L31
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
