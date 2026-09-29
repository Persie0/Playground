package androidx.compose.foundation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.MagnifierNode$onAttach$1", m4291f = "Magnifier.android.kt", m4292l = {382, 386}, m4293m = "invokeSuspend", m4294v = 1)
final class MagnifierNode$onAttach$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1688a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0124k f1689b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierNode$onAttach$1(C0124k c0124k, Continuation continuation) {
        super(2, continuation);
        this.f1689b = c0124k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MagnifierNode$onAttach$1(this.f1689b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MagnifierNode$onAttach$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x002f -> B:11:0x0020). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004b -> B:21:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.f1688a
            r2 = 2
            r3 = 1
            androidx.compose.foundation.k r4 = r6.f1689b
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            kotlin.AbstractC3193b.m15359b(r7)
            goto L4e
        L12:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r6)
            r6 = 0
            return r6
        L19:
            kotlin.AbstractC3193b.m15359b(r7)
            goto L2d
        L1d:
            kotlin.AbstractC3193b.m15359b(r7)
        L20:
            kotlinx.coroutines.channels.a r7 = r4.f2408T
            if (r7 == 0) goto L2d
            r6.f1688a = r3
            java.lang.Object r7 = kotlinx.coroutines.channels.C3211a.m15448I(r7, r6)
            if (r7 != r0) goto L2d
            goto L4d
        L2d:
            or3 r7 = r4.f2403O
            if (r7 == 0) goto L20
            ry4 r7 = new ry4
            r1 = 27
            r7.<init>(r1)
            r6.f1688a = r2
            kn1 r1 = r6.getContext()
            t16 r1 = p000.b34.m3250q(r1)
            xn3 r5 = new xn3
            r5.<init>(r7, r3)
            java.lang.Object r7 = r1.mo1250e(r5, r6)
            if (r7 != r0) goto L4e
        L4d:
            return r0
        L4e:
            or3 r7 = r4.f2403O
            if (r7 == 0) goto L20
            java.lang.Object r7 = r7.f54782a
            android.widget.Magnifier r7 = (android.widget.Magnifier) r7
            r7.update()
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode$onAttach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
