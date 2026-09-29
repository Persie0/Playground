package androidx.compose.runtime;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cu0;
import p000.e83;
import p000.or3;
import p000.ui3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1", m4291f = "SnapshotFlow.kt", m4292l = {476, 479, 484}, m4293m = "invokeSuspend", m4294v = 1)
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public or3 f3710a;

    /* JADX INFO: renamed from: b */
    public cu0 f3711b;

    /* JADX INFO: renamed from: c */
    public Object f3712c;

    /* JADX INFO: renamed from: d */
    public int f3713d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f3714e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ui3 f3715f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(ui3 ui3Var, Continuation continuation) {
        super(2, continuation);
        this.f3715f = ui3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(this.f3715f, continuation);
        snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1.f3714e = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077 A[Catch: all -> 0x0020, PHI: r1 r5 r7 r8
      0x0077: PHI (r1v3 java.lang.Object) = (r1v2 java.lang.Object), (r1v7 java.lang.Object) binds: [B:23:0x0074, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r5v7 ??) = (r5v10 ??), (r5v11 ??) binds: [B:23:0x0074, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r7v4 ??) = (r7v7 ??), (r7v8 ??) binds: [B:23:0x0074, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r8v3 e83) = (r8v2 e83), (r8v7 e83) binds: [B:23:0x0074, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0020, blocks: (B:15:0x0033, B:25:0x0077, B:22:0x0066, B:27:0x0081, B:8:0x001c), top: B:42:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:15:0x0033, B:25:0x0077, B:22:0x0066, B:27:0x0081, B:8:0x001c), top: B:42:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [sf] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [cu0] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [cu0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [cu0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [or3] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, or3] */
    /* JADX WARN: Type inference failed for: r7v3, types: [or3] */
    /* JADX WARN: Type inference failed for: r7v4, types: [or3] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007f -> B:22:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0092 -> B:22:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.f3713d
            ui3 r2 = r10.f3715f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L37
            if (r1 == r5) goto L12
            if (r1 == r4) goto L29
            if (r1 != r3) goto L23
        L12:
            java.lang.Object r1 = r10.f3712c
            cu0 r5 = r10.f3711b
            or3 r7 = r10.f3710a
            java.lang.Object r8 = r10.f3714e
            e83 r8 = (p000.e83) r8
            kotlin.AbstractC3193b.m15359b(r11)     // Catch: java.lang.Throwable -> L20
            goto L66
        L20:
            r10 = move-exception
            goto L96
        L23:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r10)
            return r6
        L29:
            java.lang.Object r1 = r10.f3712c
            cu0 r5 = r10.f3711b
            or3 r7 = r10.f3710a
            java.lang.Object r8 = r10.f3714e
            e83 r8 = (p000.e83) r8
            kotlin.AbstractC3193b.m15359b(r11)     // Catch: java.lang.Throwable -> L20
            goto L77
        L37:
            kotlin.AbstractC3193b.m15359b(r11)
            java.lang.Object r11 = r10.f3714e
            r8 = r11
            e83 r8 = (p000.e83) r8
            or3 r7 = new or3
            r7.<init>()
            r89 r11 = new r89
            r11.<init>()
            r7.f54782a = r11
            r11 = 6
            kotlinx.coroutines.channels.a r11 = p000.do7.m10525a(r5, r11, r6)
            java.lang.Object r1 = r7.m18301N(r11, r2)     // Catch: java.lang.Throwable -> L94
            r10.f3714e = r8     // Catch: java.lang.Throwable -> L94
            r10.f3710a = r7     // Catch: java.lang.Throwable -> L94
            r10.f3711b = r11     // Catch: java.lang.Throwable -> L94
            r10.f3712c = r1     // Catch: java.lang.Throwable -> L94
            r10.f3713d = r5     // Catch: java.lang.Throwable -> L94
            java.lang.Object r5 = r8.emit(r1, r10)     // Catch: java.lang.Throwable -> L94
            if (r5 != r0) goto L65
            goto L91
        L65:
            r5 = r11
        L66:
            r10.f3714e = r8     // Catch: java.lang.Throwable -> L20
            r10.f3710a = r7     // Catch: java.lang.Throwable -> L20
            r10.f3711b = r5     // Catch: java.lang.Throwable -> L20
            r10.f3712c = r1     // Catch: java.lang.Throwable -> L20
            r10.f3713d = r4     // Catch: java.lang.Throwable -> L20
            java.lang.Object r11 = r5.mo9892o(r10)     // Catch: java.lang.Throwable -> L20
            if (r11 != r0) goto L77
            goto L91
        L77:
            java.lang.Object r11 = r7.m18301N(r5, r2)     // Catch: java.lang.Throwable -> L20
            boolean r9 = p000.fa4.m11650l(r11, r1)     // Catch: java.lang.Throwable -> L20
            if (r9 != 0) goto L66
            r10.f3714e = r8     // Catch: java.lang.Throwable -> L20
            r10.f3710a = r7     // Catch: java.lang.Throwable -> L20
            r10.f3711b = r5     // Catch: java.lang.Throwable -> L20
            r10.f3712c = r11     // Catch: java.lang.Throwable -> L20
            r10.f3713d = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r8.emit(r11, r10)     // Catch: java.lang.Throwable -> L20
            if (r1 != r0) goto L92
        L91:
            return r0
        L92:
            r1 = r11
            goto L66
        L94:
            r10 = move-exception
            r5 = r11
        L96:
            java.lang.Object r11 = r7.f54782a
            sf r11 = (p000.AbstractC3572sf) r11
            if (r11 == 0) goto L9f
            r11.mo11545y(r5)
        L9f:
            java.lang.Object r11 = r7.f54782a
            sf r11 = (p000.AbstractC3572sf) r11
            if (r11 == 0) goto La6
            goto Lab
        La6:
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            p000.hi7.m13279b(r0)
        Lab:
            r11.mo11543n()
            r7.f54782a = r6
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
