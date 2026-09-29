package androidx.compose.runtime.collection;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.c32;
import p000.vx8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", m4291f = "ScatterSetWrapper.kt", m4292l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 1)
final class ScatterSetWrapper$iterator$1 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public Object[] f3728b;

    /* JADX INFO: renamed from: c */
    public long[] f3729c;

    /* JADX INFO: renamed from: d */
    public int f3730d;

    /* JADX INFO: renamed from: e */
    public int f3731e;

    /* JADX INFO: renamed from: f */
    public int f3732f;

    /* JADX INFO: renamed from: g */
    public int f3733g;

    /* JADX INFO: renamed from: h */
    public long f3734h;

    /* JADX INFO: renamed from: i */
    public int f3735i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f3736j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0275a f3737k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterSetWrapper$iterator$1(C0275a c0275a, Continuation continuation) {
        super(2, continuation);
        this.f3737k = c0275a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScatterSetWrapper$iterator$1 scatterSetWrapper$iterator$1 = new ScatterSetWrapper$iterator$1(this.f3737k, continuation);
        scatterSetWrapper$iterator$1.f3736j = obj;
        return scatterSetWrapper$iterator$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ScatterSetWrapper$iterator$1) create((vx8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
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
            int r2 = r0.f3735i
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2b
            if (r2 != r5) goto L24
            int r2 = r0.f3733g
            int r6 = r0.f3732f
            long r7 = r0.f3734h
            int r9 = r0.f3731e
            int r10 = r0.f3730d
            long[] r11 = r0.f3729c
            java.lang.Object[] r12 = r0.f3728b
            java.lang.Object r13 = r0.f3736j
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
            java.lang.Object r2 = r0.f3736j
            vx8 r2 = (p000.vx8) r2
            androidx.compose.runtime.collection.a r6 = r0.f3737k
            androidx.collection.e r6 = r6.f3738a
            java.lang.Object[] r7 = r6.f1303b
            long[] r6 = r6.f1302a
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
            r0.f3736j = r13
            r0.f3728b = r12
            r0.f3729c = r11
            r0.f3730d = r10
            r0.f3731e = r9
            r0.f3734h = r7
            r0.f3732f = r6
            r0.f3733g = r2
            r0.f3735i = r5
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
