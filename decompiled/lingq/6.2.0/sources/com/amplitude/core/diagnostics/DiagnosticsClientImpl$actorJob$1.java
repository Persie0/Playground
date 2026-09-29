package com.amplitude.core.diagnostics;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.diagnostics.DiagnosticsClientImpl$actorJob$1", m4291f = "DiagnosticsClientImpl.kt", m4292l = {164, 168}, m4293m = "invokeSuspend")
final class DiagnosticsClientImpl$actorJob$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f11033a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f11034b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0905a f11035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsClientImpl$actorJob$1(C0905a c0905a, Continuation continuation) {
        super(2, continuation);
        this.f11035c = c0905a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DiagnosticsClientImpl$actorJob$1 diagnosticsClientImpl$actorJob$1 = new DiagnosticsClientImpl$actorJob$1(this.f11035c, continuation);
        diagnosticsClientImpl$actorJob$1.f11034b = obj;
        return diagnosticsClientImpl$actorJob$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DiagnosticsClientImpl$actorJob$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: Exception -> 0x0017, CancellationException -> 0x00aa, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00aa, Exception -> 0x0017, blocks: (B:7:0x0013, B:32:0x0078, B:34:0x007c, B:19:0x003a, B:21:0x0044, B:24:0x0054, B:26:0x0058, B:28:0x0060, B:29:0x0064, B:35:0x0080, B:37:0x0086, B:39:0x008e, B:14:0x0024), top: B:46:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[Catch: Exception -> 0x0017, CancellationException -> 0x00aa, TryCatch #2 {CancellationException -> 0x00aa, Exception -> 0x0017, blocks: (B:7:0x0013, B:32:0x0078, B:34:0x007c, B:19:0x003a, B:21:0x0044, B:24:0x0054, B:26:0x0058, B:28:0x0060, B:29:0x0064, B:35:0x0080, B:37:0x0086, B:39:0x008e, B:14:0x0024), top: B:46:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0054 A[Catch: Exception -> 0x0017, CancellationException -> 0x00aa, PHI: r1 r10
      0x0054: PHI (r1v2 ??) = (r1v18 ??), (r1v19 ??) binds: [B:22:0x0051, B:14:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0054: PHI (r10v4 java.lang.Object) = (r10v12 java.lang.Object), (r10v21 java.lang.Object) binds: [B:22:0x0051, B:14:0x0024] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x00aa, Exception -> 0x0017, blocks: (B:7:0x0013, B:32:0x0078, B:34:0x007c, B:19:0x003a, B:21:0x0044, B:24:0x0054, B:26:0x0058, B:28:0x0060, B:29:0x0064, B:35:0x0080, B:37:0x0086, B:39:0x008e, B:14:0x0024), top: B:46:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[Catch: Exception -> 0x0017, CancellationException -> 0x00aa, TryCatch #2 {CancellationException -> 0x00aa, Exception -> 0x0017, blocks: (B:7:0x0013, B:32:0x0078, B:34:0x007c, B:19:0x003a, B:21:0x0044, B:24:0x0054, B:26:0x0058, B:28:0x0060, B:29:0x0064, B:35:0x0080, B:37:0x0086, B:39:0x008e, B:14:0x0024), top: B:46:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0060 A[Catch: Exception -> 0x0017, CancellationException -> 0x00aa, TryCatch #2 {CancellationException -> 0x00aa, Exception -> 0x0017, blocks: (B:7:0x0013, B:32:0x0078, B:34:0x007c, B:19:0x003a, B:21:0x0044, B:24:0x0054, B:26:0x0058, B:28:0x0060, B:29:0x0064, B:35:0x0080, B:37:0x0086, B:39:0x008e, B:14:0x0024), top: B:46:0x0009 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, un1] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x005e -> B:17:0x0034). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0060 -> B:17:0x0034). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0075 -> B:32:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.f11033a
            r2 = 0
            r3 = 2
            r4 = 1
            com.amplitude.core.diagnostics.a r5 = r9.f11035c
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L20
            if (r1 != r3) goto L1a
            java.lang.Object r1 = r9.f11034b
            un1 r1 = (p000.un1) r1
            kotlin.AbstractC3193b.m15359b(r10)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            goto L78
        L17:
            r10 = move-exception
            goto L92
        L1a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r9)
            return r2
        L20:
            java.lang.Object r1 = r9.f11034b
            un1 r1 = (p000.un1) r1
            kotlin.AbstractC3193b.m15359b(r10)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            ju0 r10 = (p000.ju0) r10     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            java.lang.Object r10 = r10.f46151a     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            goto L54
        L2c:
            kotlin.AbstractC3193b.m15359b(r10)
            java.lang.Object r10 = r9.f11034b
            un1 r10 = (p000.un1) r10
            r1 = r10
        L34:
            boolean r10 = p000.vz1.m23603I(r1)
            if (r10 == 0) goto Lac
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            java.lang.Long r10 = com.amplitude.core.diagnostics.C0905a.m5120c(r5, r6)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            if (r10 != 0) goto L64
            kotlinx.coroutines.channels.a r10 = r5.f11068r     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            r9.f11034b = r1     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            r9.f11033a = r4     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            r10.getClass()     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            java.lang.Object r10 = kotlinx.coroutines.channels.C3211a.m15449J(r10, r9)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            if (r10 != r0) goto L54
            goto L77
        L54:
            boolean r6 = r10 instanceof p000.hu0     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            if (r6 != 0) goto Lac
            java.lang.Object r10 = p000.ju0.m14648a(r10)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            kd2 r10 = (p000.kd2) r10     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            if (r10 == 0) goto L34
            com.amplitude.core.diagnostics.C0905a.m5119b(r5, r10)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            goto L34
        L64:
            long r6 = r10.longValue()     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            com.amplitude.core.diagnostics.DiagnosticsClientImpl$actorJob$1$result$1 r10 = new com.amplitude.core.diagnostics.DiagnosticsClientImpl$actorJob$1$result$1     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            r10.<init>(r5, r2)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            r9.f11034b = r1     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            r9.f11033a = r3     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            java.lang.Object r10 = kotlinx.coroutines.AbstractC3208a.m15447n(r6, r10, r9)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            if (r10 != r0) goto L78
        L77:
            return r0
        L78:
            ju0 r10 = (p000.ju0) r10     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            if (r10 != 0) goto L80
            com.amplitude.core.diagnostics.C0905a.m5118a(r5)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            goto L34
        L80:
            java.lang.Object r10 = r10.f46151a     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            boolean r6 = r10 instanceof p000.hu0     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            if (r6 != 0) goto Lac
            java.lang.Object r10 = p000.ju0.m14648a(r10)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            kd2 r10 = (p000.kd2) r10     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            if (r10 == 0) goto L34
            com.amplitude.core.diagnostics.C0905a.m5119b(r5, r10)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> Laa
            goto L34
        L92:
            pj5 r6 = r5.f11053c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "DiagnosticsClient: Error in actor loop: "
            r7.<init>(r8)
            java.lang.String r10 = r10.getMessage()
            r7.append(r10)
            java.lang.String r10 = r7.toString()
            r6.mo16255a(r10)
            goto L34
        Laa:
            r9 = move-exception
            throw r9
        Lac:
            xfa r9 = p000.xfa.f68157a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.core.diagnostics.DiagnosticsClientImpl$actorJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
