package com.lingq.feature.challenges.cup;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.ax1;
import p000.c32;
import p000.cj3;
import p000.ew1;
import p000.xfa;
import p000.zw1;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupViewModel$state$1", m4291f = "CupViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class CupViewModel$state$1 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ew1 f24670a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f24671b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ zw1 f24672c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ax1 f24673d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1980g f24674e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupViewModel$state$1(C1980g c1980g, Continuation continuation) {
        super(5, continuation);
        this.f24674e = c1980g;
    }

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        CupViewModel$state$1 cupViewModel$state$1 = new CupViewModel$state$1(this.f24674e, (Continuation) obj5);
        cupViewModel$state$1.f24670a = (ew1) obj;
        cupViewModel$state$1.f24671b = (List) obj2;
        cupViewModel$state$1.f24672c = (zw1) obj3;
        cupViewModel$state$1.f24673d = (ax1) obj4;
        return cupViewModel$state$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:237:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:239:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:242:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:248:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:249:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:253:0x0403 A[LOOP:6: B:251:0x03fd->B:253:0x0403, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:256:0x0413  */
    /* JADX WARN: Code duplicated, block: B:257:0x0416  */
    /* JADX WARN: Code duplicated, block: B:259:0x041a  */
    /* JADX WARN: Code duplicated, block: B:262:0x0421  */
    /* JADX WARN: Code duplicated, block: B:265:0x0429  */
    /* JADX WARN: Code duplicated, block: B:266:0x0432  */
    /* JADX WARN: Code duplicated, block: B:269:0x043a  */
    /* JADX WARN: Code duplicated, block: B:272:0x0443  */
    /* JADX WARN: Code duplicated, block: B:275:0x0451  */
    /* JADX WARN: Code duplicated, block: B:278:0x045d  */
    /* JADX WARN: Code duplicated, block: B:281:0x0467  */
    /* JADX WARN: Code duplicated, block: B:285:0x0475  */
    /* JADX WARN: Code duplicated, block: B:286:0x0478  */
    /* JADX WARN: Code duplicated, block: B:288:0x047c  */
    /* JADX WARN: Code duplicated, block: B:289:0x047f  */
    /* JADX WARN: Code duplicated, block: B:291:0x0483  */
    /* JADX WARN: Code duplicated, block: B:295:0x049c  */
    /* JADX WARN: Code duplicated, block: B:297:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:300:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:303:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:328:0x045a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x0471 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:? A[LOOP:8: B:279:0x0461->B:330:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x03e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0144  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v17 java.lang.Object, still in use, count: 2, list:
          (r7v17 java.lang.Object) from 0x0380: PHI (r7 I:??) = (r7v14 java.lang.Object), (r7v17 java.lang.Object) binds: [B:216:0x037e, B:319:0x0380] A[DONT_GENERATE, DONT_INLINE]
          (r7v17 java.lang.Object) from 0x0375: CHECK_CAST (java.lang.Number) (r7v17 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.challenges.cup.CupViewModel$state$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
