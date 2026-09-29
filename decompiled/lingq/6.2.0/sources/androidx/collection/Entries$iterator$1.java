package androidx.collection;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.c32;
import p000.vx8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.collection.Entries$iterator$1", m4291f = "ScatterMap.kt", m4292l = {1414}, m4293m = "invokeSuspend")
final class Entries$iterator$1 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public C0038a f1234b;

    /* JADX INFO: renamed from: c */
    public long[] f1235c;

    /* JADX INFO: renamed from: d */
    public int f1236d;

    /* JADX INFO: renamed from: e */
    public int f1237e;

    /* JADX INFO: renamed from: f */
    public int f1238f;

    /* JADX INFO: renamed from: g */
    public int f1239g;

    /* JADX INFO: renamed from: h */
    public long f1240h;

    /* JADX INFO: renamed from: i */
    public int f1241i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f1242j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0038a f1243k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Entries$iterator$1(C0038a c0038a, Continuation continuation) {
        super(2, continuation);
        this.f1243k = c0038a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Entries$iterator$1 entries$iterator$1 = new Entries$iterator$1(this.f1243k, continuation);
        entries$iterator$1.f1242j = obj;
        return entries$iterator$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((Entries$iterator$1) create((vx8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004e -> B:14:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0069 -> B:20:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0095 -> B:21:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a8 -> B:26:0x00a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f1241i
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2b
            if (r2 != r5) goto L24
            int r2 = r0.f1239g
            int r6 = r0.f1238f
            long r7 = r0.f1240h
            int r9 = r0.f1237e
            int r10 = r0.f1236d
            long[] r11 = r0.f1235c
            androidx.collection.a r12 = r0.f1234b
            java.lang.Object r13 = r0.f1242j
            vx8 r13 = (p000.vx8) r13
            kotlin.AbstractC3193b.m15359b(r21)
            goto L98
        L24:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r0)
            r0 = 0
            return r0
        L2b:
            kotlin.AbstractC3193b.m15359b(r21)
            java.lang.Object r2 = r0.f1242j
            vx8 r2 = (p000.vx8) r2
            androidx.collection.a r6 = r0.f1243k
            n66 r7 = r6.f1288b
            long[] r7 = r7.f52399a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto Laf
            r9 = 0
        L3e:
            r10 = r7[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto La8
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r12
            r12 = r6
            r6 = r13
            r13 = r2
            r2 = 0
            r18 = r10
            r11 = r7
            r10 = r8
            r7 = r18
        L60:
            if (r2 >= r6) goto La0
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L98
            int r14 = r9 << 3
            int r14 = r14 + r2
            sp5 r15 = new sp5
            n66 r3 = r12.f1288b
            r17 = r4
            java.lang.Object[] r4 = r3.f52400b
            r4 = r4[r14]
            java.lang.Object[] r3 = r3.f52401c
            r3 = r3[r14]
            r15.<init>(r5, r4, r3)
            r0.f1242j = r13
            r0.f1234b = r12
            r0.f1235c = r11
            r0.f1236d = r10
            r0.f1237e = r9
            r0.f1240h = r7
            r0.f1238f = r6
            r0.f1239g = r2
            r0.f1241i = r5
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = r13.m23582b(r15, r0)
            if (r3 != r1) goto L9a
            return r1
        L98:
            r17 = r4
        L9a:
            long r7 = r7 >> r17
            int r2 = r2 + r5
            r4 = r17
            goto L60
        La0:
            r3 = r4
            if (r6 != r3) goto Laf
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r13
            goto La9
        La8:
            r3 = r4
        La9:
            if (r9 == r8) goto Laf
            int r9 = r9 + 1
            r4 = r3
            goto L3e
        Laf:
            xfa r0 = p000.xfa.f68157a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.Entries$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
