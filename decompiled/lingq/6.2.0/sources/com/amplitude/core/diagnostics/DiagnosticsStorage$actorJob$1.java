package com.amplitude.core.diagnostics;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.diagnostics.DiagnosticsStorage$actorJob$1", m4291f = "DiagnosticsStorage.kt", m4292l = {65}, m4293m = "invokeSuspend")
final class DiagnosticsStorage$actorJob$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f11048a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f11049b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0906b f11050c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsStorage$actorJob$1(C0906b c0906b, Continuation continuation) {
        super(2, continuation);
        this.f11050c = c0906b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DiagnosticsStorage$actorJob$1 diagnosticsStorage$actorJob$1 = new DiagnosticsStorage$actorJob$1(this.f11050c, continuation);
        diagnosticsStorage$actorJob$1.f11049b = obj;
        return diagnosticsStorage$actorJob$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DiagnosticsStorage$actorJob$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c A[Catch: Exception -> 0x0087, CancellationException -> 0x00aa, TryCatch #2 {CancellationException -> 0x00aa, Exception -> 0x0087, blocks: (B:18:0x0048, B:20:0x004c, B:22:0x0069, B:24:0x006f, B:27:0x0076, B:28:0x007f, B:31:0x0089, B:33:0x008d), top: B:40:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0069 A[Catch: Exception -> 0x0087, CancellationException -> 0x00aa, TryCatch #2 {CancellationException -> 0x00aa, Exception -> 0x0087, blocks: (B:18:0x0048, B:20:0x004c, B:22:0x0069, B:24:0x006f, B:27:0x0076, B:28:0x007f, B:31:0x0089, B:33:0x008d), top: B:40:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0089 A[Catch: Exception -> 0x0087, CancellationException -> 0x00aa, TryCatch #2 {CancellationException -> 0x00aa, Exception -> 0x0087, blocks: (B:18:0x0048, B:20:0x004c, B:22:0x0069, B:24:0x006f, B:27:0x0076, B:28:0x007f, B:31:0x0089, B:33:0x008d), top: B:40:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008d A[Catch: Exception -> 0x0087, CancellationException -> 0x00aa, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00aa, Exception -> 0x0087, blocks: (B:18:0x0048, B:20:0x004c, B:22:0x0069, B:24:0x006f, B:27:0x0076, B:28:0x007f, B:31:0x0089, B:33:0x008d), top: B:40:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0039 -> B:14:0x003c). Please report as a decompilation issue!!! */
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
            int r1 = r9.f11048a
            com.amplitude.core.diagnostics.b r2 = r9.f11050c
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 != r3) goto L17
            java.lang.Object r1 = r9.f11049b
            un1 r1 = (p000.un1) r1
            kotlin.AbstractC3193b.m15359b(r10)
            ju0 r10 = (p000.ju0) r10
            java.lang.Object r10 = r10.f46151a
            goto L3c
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r9)
            r9 = 0
            return r9
        L1e:
            kotlin.AbstractC3193b.m15359b(r10)
            java.lang.Object r10 = r9.f11049b
            un1 r10 = (p000.un1) r10
            r1 = r10
        L26:
            boolean r10 = p000.vz1.m23603I(r1)
            if (r10 == 0) goto Lac
            kotlinx.coroutines.channels.a r10 = r2.f11076g
            r9.f11049b = r1
            r9.f11048a = r3
            r10.getClass()
            java.lang.Object r10 = kotlinx.coroutines.channels.C3211a.m15449J(r10, r9)
            if (r10 != r0) goto L3c
            return r0
        L3c:
            boolean r4 = r10 instanceof p000.hu0
            if (r4 != 0) goto Lac
            java.lang.Object r10 = p000.ju0.m14648a(r10)
            td2 r10 = (p000.td2) r10
            if (r10 == 0) goto L26
            boolean r4 = r10 instanceof p000.sd2     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            if (r4 == 0) goto L89
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            java.io.File r6 = new java.io.File     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            java.io.File r7 = r2.f11070a     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            java.lang.String r8 = "com.amplitude.diagnostics"
            r6.<init>(r7, r8)     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            java.lang.String r7 = r2.f11075f     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            r5.<init>(r6, r7)     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            java.lang.String r6 = r2.f11071b     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            r4.<init>(r5, r6)     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            boolean r5 = r4.exists()     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            if (r5 != 0) goto L7f
            boolean r5 = r4.mkdirs()     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            if (r5 != 0) goto L7f
            boolean r5 = r4.exists()     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            if (r5 == 0) goto L76
            goto L7f
        L76:
            java.lang.String r5 = "Failed to create directory: "
            java.lang.String r6 = r4.getAbsolutePath()     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            p000.v63.m23132j(r6, r5)     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
        L7f:
            sd2 r10 = (p000.sd2) r10     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            od2 r10 = r10.f60706a     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            com.amplitude.core.diagnostics.C0906b.m5126a(r2, r10, r4)     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            goto L26
        L87:
            r10 = move-exception
            goto L91
        L89:
            boolean r10 = r10 instanceof p000.rd2     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            if (r10 == 0) goto L26
            com.amplitude.core.diagnostics.C0906b.m5127b(r2)     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> Laa
            goto L26
        L91:
            pj5 r4 = r2.f11072c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DiagnosticsStorage: Error processing operation: "
            r5.<init>(r6)
            java.lang.String r10 = r10.getMessage()
            r5.append(r10)
            java.lang.String r10 = r5.toString()
            r4.mo16255a(r10)
            goto L26
        Laa:
            r9 = move-exception
            throw r9
        Lac:
            xfa r9 = p000.xfa.f68157a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.core.diagnostics.DiagnosticsStorage$actorJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
