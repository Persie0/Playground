package androidx.collection;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.c32;
import p000.vx8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.collection.Keys$iterator$1", m4291f = "ScatterMap.kt", m4292l = {1431}, m4293m = "invokeSuspend")
final class Keys$iterator$1 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public Object[] f1244b;

    /* JADX INFO: renamed from: c */
    public long[] f1245c;

    /* JADX INFO: renamed from: d */
    public int f1246d;

    /* JADX INFO: renamed from: e */
    public int f1247e;

    /* JADX INFO: renamed from: f */
    public int f1248f;

    /* JADX INFO: renamed from: g */
    public int f1249g;

    /* JADX INFO: renamed from: h */
    public long f1250h;

    /* JADX INFO: renamed from: i */
    public int f1251i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f1252j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0038a f1253k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Keys$iterator$1(C0038a c0038a, Continuation continuation) {
        super(2, continuation);
        this.f1253k = c0038a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Keys$iterator$1 keys$iterator$1 = new Keys$iterator$1(this.f1253k, continuation);
        keys$iterator$1.f1252j = obj;
        return keys$iterator$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((Keys$iterator$1) create((vx8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004e -> B:23:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:14:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006a -> B:20:0x008a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0087 -> B:20:0x008a). Please report as a decompilation issue!!! */
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
            int r2 = r0.f1251i
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2b
            if (r2 != r5) goto L24
            int r2 = r0.f1249g
            int r6 = r0.f1248f
            long r7 = r0.f1250h
            int r9 = r0.f1247e
            int r10 = r0.f1246d
            long[] r11 = r0.f1245c
            java.lang.Object[] r12 = r0.f1244b
            java.lang.Object r13 = r0.f1252j
            vx8 r13 = (p000.vx8) r13
            kotlin.AbstractC3193b.m15359b(r21)
            goto L8a
        L24:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r0)
            r0 = 0
            return r0
        L2b:
            kotlin.AbstractC3193b.m15359b(r21)
            java.lang.Object r2 = r0.f1252j
            vx8 r2 = (p000.vx8) r2
            androidx.collection.a r6 = r0.f1253k
            n66 r6 = r6.f1288b
            java.lang.Object[] r7 = r6.f52400b
            long[] r6 = r6.f52399a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L98
            r9 = r3
        L40:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L93
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = r3
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L61:
            if (r2 >= r6) goto L8d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8a
            int r14 = r9 << 3
            int r14 = r14 + r2
            r14 = r12[r14]
            r0.f1252j = r13
            r0.f1244b = r12
            r0.f1245c = r11
            r0.f1246d = r10
            r0.f1247e = r9
            r0.f1250h = r7
            r0.f1248f = r6
            r0.f1249g = r2
            r0.f1251i = r5
            kotlin.coroutines.intrinsics.CoroutineSingletons r14 = r13.m23582b(r14, r0)
            if (r14 != r1) goto L8a
            return r1
        L8a:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L61
        L8d:
            if (r6 != r4) goto L98
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L93:
            if (r9 == r8) goto L98
            int r9 = r9 + 1
            goto L40
        L98:
            xfa r0 = p000.xfa.f68157a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.Keys$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
