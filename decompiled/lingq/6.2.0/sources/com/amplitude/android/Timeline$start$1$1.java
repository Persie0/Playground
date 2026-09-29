package com.amplitude.android;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.amplitude.core.AbstractC0903a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.ej0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.Timeline$start$1$1", m4291f = "Timeline.kt", m4292l = {DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER, 49, 50}, m4293m = "invokeSuspend")
final class Timeline$start$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public ej0 f10771a;

    /* JADX INFO: renamed from: b */
    public int f10772b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0903a f10773c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0882d f10774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Timeline$start$1$1(AbstractC0903a abstractC0903a, C0882d c0882d, Continuation continuation) {
        super(2, continuation);
        this.f10773c = abstractC0903a;
        this.f10774d = c0882d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Timeline$start$1$1(this.f10773c, this.f10774d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((Timeline$start$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0070 A[PHI: r1
      0x0070: PHI (r1v6 ej0) = (r1v4 ej0), (r1v5 ej0), (r1v8 ej0) binds: [B:15:0x0038, B:22:0x0091, B:7:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x007b A[PHI: r1 r12
      0x007b: PHI (r1v5 ej0) = (r1v6 ej0), (r1v7 ej0) binds: [B:17:0x0078, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r12v7 java.lang.Object) = (r12v13 java.lang.Object), (r12v0 java.lang.Object) binds: [B:17:0x0078, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0091 -> B:16:0x0070). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.f10772b
            r2 = 3
            r3 = 2
            r4 = 1
            com.amplitude.core.a r5 = r11.f10773c
            com.amplitude.android.d r6 = r11.f10774d
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L26
            if (r1 == r3) goto L20
            if (r1 != r2) goto L19
            ej0 r1 = r11.f10771a
            kotlin.AbstractC3193b.m15359b(r12)
            goto L70
        L19:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r11)
            r11 = 0
            return r11
        L20:
            ej0 r1 = r11.f10771a
            kotlin.AbstractC3193b.m15359b(r12)
            goto L7b
        L26:
            kotlin.AbstractC3193b.m15359b(r12)
            goto L38
        L2a:
            kotlin.AbstractC3193b.m15359b(r12)
            y92 r12 = r5.f11027l
            r11.f10772b = r4
            java.lang.Object r12 = r12.m15517w(r11)
            if (r12 != r0) goto L38
            goto L93
        L38:
            r6.getClass()
            java.util.concurrent.atomic.AtomicLong r12 = r6.f10817e
            com.amplitude.android.storage.b r1 = r5.m5114h()
            com.amplitude.core.Storage$Constants r4 = com.amplitude.core.Storage$Constants.PREVIOUS_SESSION_ID
            r7 = -1
            long r7 = com.amplitude.android.C0882d.m5064P(r6, r1, r4, r7)
            r12.set(r7)
            com.amplitude.android.storage.b r12 = r5.m5114h()
            com.amplitude.core.Storage$Constants r1 = com.amplitude.core.Storage$Constants.LAST_EVENT_ID
            r7 = 0
            long r9 = com.amplitude.android.C0882d.m5064P(r6, r12, r1, r7)
            r6.f10819g = r9
            com.amplitude.android.storage.b r12 = r5.m5114h()
            com.amplitude.core.Storage$Constants r1 = com.amplitude.core.Storage$Constants.LAST_EVENT_TIME
            long r4 = com.amplitude.android.C0882d.m5064P(r6, r12, r1, r7)
            r6.f10820h = r4
            kotlinx.coroutines.channels.a r12 = r6.f10816d
            r12.getClass()
            ej0 r1 = new ej0
            r1.<init>(r12)
        L70:
            r11.f10771a = r1
            r11.f10772b = r3
            java.lang.Object r12 = r1.m11164b(r11)
            if (r12 != r0) goto L7b
            goto L93
        L7b:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L94
            java.lang.Object r12 = r1.m11165c()
            ju2 r12 = (p000.ju2) r12
            r11.f10771a = r1
            r11.f10772b = r2
            java.lang.Object r12 = com.amplitude.android.C0882d.m5063O(r6, r12, r11)
            if (r12 != r0) goto L70
        L93:
            return r0
        L94:
            xfa r11 = p000.xfa.f68157a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.android.Timeline$start$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
