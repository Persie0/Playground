package com.amplitude.core.platform;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.ej0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.platform.EventPipeline$write$1", m4291f = "EventPipeline.kt", m4292l = {86, 91}, m4293m = "invokeSuspend")
final class EventPipeline$write$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public ej0 f11091a;

    /* JADX INFO: renamed from: b */
    public int f11092b;

    /* JADX INFO: renamed from: c */
    public int f11093c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0907a f11094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventPipeline$write$1(C0907a c0907a, Continuation continuation) {
        super(2, continuation);
        this.f11094d = c0907a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EventPipeline$write$1(this.f11094d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((EventPipeline$write$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x005c -> B:31:0x006d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006a -> B:31:0x006d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x006f -> B:31:0x006d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            com.amplitude.core.platform.a r0 = r12.f11094d
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f11096b
            com.amplitude.core.a r2 = r0.f11095a
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r12.f11093c
            r5 = 0
            r6 = 0
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L2b
            if (r4 == r8) goto L24
            if (r4 != r7) goto L1e
            int r4 = r12.f11092b
            ej0 r9 = r12.f11091a
            kotlin.AbstractC3193b.m15359b(r13)     // Catch: java.lang.Exception -> L1c
            goto L6d
        L1c:
            r13 = move-exception
            goto L6f
        L1e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r12)
            return r5
        L24:
            ej0 r4 = r12.f11091a
            kotlin.AbstractC3193b.m15359b(r13)
            r9 = r4
            goto L41
        L2b:
            kotlin.AbstractC3193b.m15359b(r13)
            cu0 r13 = r0.f11101g
            ej0 r13 = r13.iterator()
        L34:
            r12.f11091a = r13
            r12.f11093c = r8
            java.lang.Object r4 = r13.m11164b(r12)
            if (r4 != r3) goto L3f
            goto L6c
        L3f:
            r9 = r13
            r13 = r4
        L41:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lc3
            java.lang.Object r13 = r9.m11165c()
            o9b r13 = (p000.o9b) r13
            com.amplitude.core.platform.WriteQueueMessageType r4 = r13.f54090a
            com.amplitude.core.platform.WriteQueueMessageType r10 = com.amplitude.core.platform.WriteQueueMessageType.FLUSH
            if (r4 != r10) goto L57
            r4 = r8
            goto L58
        L57:
            r4 = r6
        L58:
            if (r4 != 0) goto L6d
            b90 r13 = r13.f54091b
            if (r13 == 0) goto L6d
            com.amplitude.android.storage.b r10 = r0.f11099e     // Catch: java.lang.Exception -> L1c
            r12.f11091a = r9     // Catch: java.lang.Exception -> L1c
            r12.f11092b = r4     // Catch: java.lang.Exception -> L1c
            r12.f11093c = r7     // Catch: java.lang.Exception -> L1c
            java.lang.Object r13 = r10.m5103h(r13, r12)     // Catch: java.lang.Exception -> L1c
            if (r13 != r3) goto L6d
        L6c:
            return r3
        L6d:
            r13 = r9
            goto L79
        L6f:
            pj5 r10 = r2.m5113g()
            java.lang.String r11 = "Error when writing event to pipeline"
            p000.smb.m21484a(r13, r10, r11)
            goto L6d
        L79:
            com.amplitude.android.b r9 = r2.f11016a
            java.lang.Boolean r9 = r9.f10804q
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r9 = p000.fa4.m11650l(r9, r10)
            if (r9 == 0) goto L86
            goto L34
        L86:
            int r9 = r1.incrementAndGet()
            com.amplitude.android.b r10 = r2.f11016a
            int r10 = r10.f10790c
            java.util.concurrent.atomic.AtomicInteger r11 = r0.f11105k
            int r11 = r11.get()
            int r10 = r10 / r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            if (r10 != 0) goto L9c
            r11 = r5
        L9c:
            if (r11 == 0) goto La3
            int r10 = r11.intValue()
            goto La4
        La3:
            r10 = r8
        La4:
            if (r9 >= r10) goto Lb7
            if (r4 == 0) goto La9
            goto Lb7
        La9:
            un1 r4 = r0.f11100f
            nn1 r9 = r2.f11021f
            com.amplitude.core.platform.EventPipeline$schedule$1 r10 = new com.amplitude.core.platform.EventPipeline$schedule$1
            r10.<init>(r0, r5)
            p000.wfb.m23926u(r4, r9, r5, r10, r7)
            goto L34
        Lb7:
            r1.set(r6)
            cu0 r4 = r0.f11102h
            java.lang.String r9 = "#!upload"
            r4.mo4677k(r9)
            goto L34
        Lc3:
            xfa r12 = p000.xfa.f68157a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.core.platform.EventPipeline$write$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
