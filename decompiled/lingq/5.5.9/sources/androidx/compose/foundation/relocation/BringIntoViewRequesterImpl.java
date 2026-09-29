package androidx.compose.foundation.relocation;

import p105f0.C5458f;
import p468x.C9998f;
import p468x.InterfaceC9996d;

/* JADX INFO: loaded from: classes.dex */
public final class BringIntoViewRequesterImpl implements InterfaceC9996d {

    /* JADX INFO: renamed from: a */
    public final C5458f<C9998f> f2439a = new C5458f<>(new C9998f[16]);

    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0094 -> B:32:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:30:0x0093
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p468x.InterfaceC9996d
    /* JADX INFO: renamed from: a */
    public final java.lang.Object mo1525a(p375s0.C8942d r14, p464wl.InterfaceC9968c<? super sl.C9072e> r15) {
        /*
            r13 = this;
            r10 = r13
            boolean r0 = r15 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            if (r0 == 0) goto L18
            r12 = 2
            r0 = r15
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) r0
            r12 = 2
            int r1 = r0.f2446j
            r12 = 5
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            r12 = 6
            int r1 = r1 - r2
            r0.f2446j = r1
            goto L1e
        L18:
            r12 = 6
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r10, r15)
        L1e:
            java.lang.Object r15 = r0.f2444h
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f2446j
            r12 = 7
            r3 = 1
            r12 = 4
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3b
            r12 = 3
            int r14 = r0.f2443g
            r12 = 1
            int r2 = r0.f2442f
            java.lang.Object[] r4 = r0.f2441e
            r12 = 4
            s0.d r5 = r0.f2440d
            p260m8.C7499b.m14977z0(r15)
            r15 = r5
            goto L95
        L3b:
            r12 = 3
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
            r12 = 6
        L45:
            p260m8.C7499b.m14977z0(r15)
            r12 = 7
            f0.f<x.f> r15 = r10.f2439a
            int r2 = r15.f34019c
            if (r2 <= 0) goto L9a
            r12 = 3
            T[] r15 = r15.f34017a
            r12 = 5
            r12 = 0
            r4 = r12
            r9 = r15
            r15 = r14
            r14 = r4
            r4 = r9
        L59:
            r12 = 6
            r5 = r4[r14]
            r12 = 3
            x.f r5 = (p468x.C9998f) r5
            r12 = 4
            r0.f2440d = r15
            r12 = 4
            r0.f2441e = r4
            r0.f2442f = r2
            r0.f2443g = r14
            r12 = 5
            r0.f2446j = r3
            x.c r6 = r5.f50809b
            r12 = 1
            if (r6 != 0) goto L73
            x.c r6 = r5.f50808a
        L73:
            r12 = 4
            g1.k r7 = r5.m18582d()
            if (r7 != 0) goto L7b
            goto L8e
        L7b:
            r12 = 7
            androidx.compose.foundation.relocation.BringIntoViewRequesterModifier$bringIntoView$2 r8 = new androidx.compose.foundation.relocation.BringIntoViewRequesterModifier$bringIntoView$2
            r8.<init>()
            java.lang.Object r12 = r6.mo1529c(r7, r8, r0)
            r5 = r12
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r12 = 5
            if (r5 != r6) goto L8d
            r12 = 4
            goto L91
        L8d:
            r12 = 2
        L8e:
            sl.e r5 = sl.C9072e.f47360a
            r12 = 4
        L91:
            if (r5 != r1) goto L94
            return r1
        L94:
            r12 = 2
        L95:
            int r14 = r14 + r3
            r12 = 6
            if (r14 < r2) goto L59
            r12 = 5
        L9a:
            sl.e r14 = sl.C9072e.f47360a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.mo1525a(s0.d, wl.c):java.lang.Object");
    }
}
