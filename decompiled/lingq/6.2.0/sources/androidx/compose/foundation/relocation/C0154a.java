package androidx.compose.foundation.relocation;

import p000.ki0;
import p000.x66;

/* JADX INFO: renamed from: androidx.compose.foundation.relocation.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0154a {

    /* JADX INFO: renamed from: a */
    public final x66 f2721a = new x66(new ki0[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:19:0x0062). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m1046a(p000.e28 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) r0
            int r1 = r0.f2705g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2705g = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f2703e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f2705g
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            int r8 = r0.f2702d
            int r9 = r0.f2701c
            java.lang.Object[] r2 = r0.f2700b
            e28 r4 = r0.f2699a
            kotlin.AbstractC3193b.m15359b(r10)
            r10 = r4
            goto L62
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r8)
            r8 = 0
            return r8
        L37:
            kotlin.AbstractC3193b.m15359b(r10)
            x66 r8 = r8.f2721a
            java.lang.Object[] r10 = r8.f67830a
            int r8 = r8.f67832c
            r2 = 0
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
        L45:
            if (r9 >= r8) goto L64
            r4 = r2[r9]
            ki0 r4 = (p000.ki0) r4
            xf r5 = new xf
            r6 = 6
            r5.<init>(r10, r6)
            r0.f2699a = r10
            r0.f2700b = r2
            r0.f2701c = r9
            r0.f2702d = r8
            r0.f2705g = r3
            java.lang.Object r4 = androidx.compose.p002ui.relocation.AbstractC0415a.m1826a(r4, r5, r0)
            if (r4 != r1) goto L62
            return r1
        L62:
            int r9 = r9 + r3
            goto L45
        L64:
            xfa r8 = p000.xfa.f68157a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.C0154a.m1046a(e28, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
