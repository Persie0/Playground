package com.lingq.feature.reader.simplify;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.simplify.ReaderSimplifyStateHolder$startSimplifyPolling$1", m4291f = "ReaderSimplifyStateHolder.kt", m4292l = {179, 180, 189}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSimplifyStateHolder$startSimplifyPolling$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30488a;

    /* JADX INFO: renamed from: b */
    public int f30489b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2518a f30490c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f30491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSimplifyStateHolder$startSimplifyPolling$1(C2518a c2518a, int i, Continuation continuation) {
        super(2, continuation);
        this.f30490c = c2518a;
        this.f30491d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderSimplifyStateHolder$startSimplifyPolling$1(this.f30490c, this.f30491d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderSimplifyStateHolder$startSimplifyPolling$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003e A[PHI: r1
      0x003e: PHI (r1v4 int) = (r1v1 int), (r1v2 int), (r1v7 int) binds: [B:12:0x002e, B:33:0x00d2, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:19:0x005a A[PHI: r1
      0x005a: PHI (r1v3 int) = (r1v4 int), (r1v5 int) binds: [B:17:0x0056, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x008e A[PHI: r1 r14
      0x008e: PHI (r1v2 int) = (r1v3 int), (r1v6 int) binds: [B:20:0x008b, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r14v5 java.lang.Object) = (r14v19 java.lang.Object), (r14v0 java.lang.Object) binds: [B:20:0x008b, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d2 -> B:13:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.reader.simplify.ReaderSimplifyStateHolder$startSimplifyPolling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
