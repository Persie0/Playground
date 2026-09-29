package androidx.collection;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.c32;
import p000.q66;
import p000.vx8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", m4291f = "ScatterSet.kt", m4292l = {1188}, m4293m = "invokeSuspend")
final class MutableSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C0039b f1262H;

    /* JADX INFO: renamed from: b */
    public C0039b f1263b;

    /* JADX INFO: renamed from: c */
    public q66 f1264c;

    /* JADX INFO: renamed from: d */
    public long[] f1265d;

    /* JADX INFO: renamed from: e */
    public int f1266e;

    /* JADX INFO: renamed from: f */
    public int f1267f;

    /* JADX INFO: renamed from: g */
    public int f1268g;

    /* JADX INFO: renamed from: h */
    public int f1269h;

    /* JADX INFO: renamed from: i */
    public long f1270i;

    /* JADX INFO: renamed from: j */
    public int f1271j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f1272k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ q66 f1273l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSetWrapper$iterator$1$iterator$1(q66 q66Var, C0039b c0039b, Continuation continuation) {
        super(2, continuation);
        this.f1273l = q66Var;
        this.f1262H = c0039b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutableSetWrapper$iterator$1$iterator$1 mutableSetWrapper$iterator$1$iterator$1 = new MutableSetWrapper$iterator$1$iterator$1(this.f1273l, this.f1262H, continuation);
        mutableSetWrapper$iterator$1$iterator$1.f1272k = obj;
        return mutableSetWrapper$iterator$1$iterator$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableSetWrapper$iterator$1$iterator$1) create((vx8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x009b  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:23:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:20:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0093 -> B:20:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f1271j
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2d
            if (r2 != r5) goto L26
            int r2 = r0.f1269h
            int r6 = r0.f1268g
            long r7 = r0.f1270i
            int r9 = r0.f1267f
            int r10 = r0.f1266e
            long[] r11 = r0.f1265d
            q66 r12 = r0.f1264c
            androidx.collection.b r13 = r0.f1263b
            java.lang.Object r14 = r0.f1272k
            vx8 r14 = (p000.vx8) r14
            kotlin.AbstractC3193b.m15359b(r22)
            goto L96
        L26:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r0)
            r0 = 0
            return r0
        L2d:
            kotlin.AbstractC3193b.m15359b(r22)
            java.lang.Object r2 = r0.f1272k
            vx8 r2 = (p000.vx8) r2
            q66 r6 = r0.f1273l
            o66 r7 = r6.f57325b
            long[] r7 = r7.f1302a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La6
            androidx.collection.b r9 = r0.f1262H
            r10 = 0
        L42:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La1
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = 0
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L65:
            if (r2 >= r6) goto L99
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L96
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.f1290b = r15
            o66 r3 = r12.f57325b
            java.lang.Object[] r3 = r3.f1303b
            r3 = r3[r15]
            r0.f1272k = r14
            r0.f1263b = r13
            r0.f1264c = r12
            r0.f1265d = r11
            r0.f1266e = r10
            r0.f1267f = r9
            r0.f1270i = r7
            r0.f1268g = r6
            r0.f1269h = r2
            r0.f1271j = r5
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = r14.m23582b(r3, r0)
            if (r3 != r1) goto L96
            return r1
        L96:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L65
        L99:
            if (r6 != r4) goto La6
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La1:
            if (r10 == r8) goto La6
            int r10 = r10 + 1
            goto L42
        La6:
            xfa r0 = p000.xfa.f68157a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableSetWrapper$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
