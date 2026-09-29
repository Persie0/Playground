package androidx.compose.foundation.gestures;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic$startReceivingEvents$1", m4291f = "TrackpadScrollingLogic.kt", m4292l = {95, 95}, m4293m = "invokeSuspend", m4294v = 1)
final class TrackpadScrollingLogic$startReceivingEvents$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public C0118x f2206a;

    /* JADX INFO: renamed from: b */
    public C0116v f2207b;

    /* JADX INFO: renamed from: c */
    public int f2208c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f2209d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0118x f2210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackpadScrollingLogic$startReceivingEvents$1(C0118x c0118x, Continuation continuation) {
        super(2, continuation);
        this.f2210e = c0118x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrackpadScrollingLogic$startReceivingEvents$1 trackpadScrollingLogic$startReceivingEvents$1 = new TrackpadScrollingLogic$startReceivingEvents$1(this.f2210e, continuation);
        trackpadScrollingLogic$startReceivingEvents$1.f2209d = obj;
        return trackpadScrollingLogic$startReceivingEvents$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackpadScrollingLogic$startReceivingEvents$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:17:0x0033, B:19:0x003d, B:23:0x0056, B:14:0x0028), top: B:31:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0067 -> B:17:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.f2208c
            androidx.compose.foundation.gestures.x r2 = r8.f2210e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L20
            if (r1 != r3) goto L1a
            java.lang.Object r1 = r8.f2209d
            un1 r1 = (p000.un1) r1
            kotlin.AbstractC3193b.m15359b(r9)     // Catch: java.lang.Throwable -> L18
            r9 = r1
            goto L33
        L18:
            r8 = move-exception
            goto L6e
        L1a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r8)
            return r5
        L20:
            androidx.compose.foundation.gestures.v r1 = r8.f2207b
            androidx.compose.foundation.gestures.x r6 = r8.f2206a
            java.lang.Object r7 = r8.f2209d
            un1 r7 = (p000.un1) r7
            kotlin.AbstractC3193b.m15359b(r9)     // Catch: java.lang.Throwable -> L18
            goto L56
        L2c:
            kotlin.AbstractC3193b.m15359b(r9)
            java.lang.Object r9 = r8.f2209d
            un1 r9 = (p000.un1) r9
        L33:
            kn1 r1 = r9.mo1309x()     // Catch: java.lang.Throwable -> L18
            boolean r1 = kotlinx.coroutines.AbstractC3208a.m15443j(r1)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L69
            androidx.compose.foundation.gestures.v r1 = r2.f2296a     // Catch: java.lang.Throwable -> L18
            kotlinx.coroutines.channels.a r6 = r2.f2374f     // Catch: java.lang.Throwable -> L18
            r8.f2209d = r9     // Catch: java.lang.Throwable -> L18
            r8.f2206a = r2     // Catch: java.lang.Throwable -> L18
            r8.f2207b = r1     // Catch: java.lang.Throwable -> L18
            r8.f2208c = r4     // Catch: java.lang.Throwable -> L18
            r6.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.Object r6 = kotlinx.coroutines.channels.C3211a.m15448I(r6, r8)     // Catch: java.lang.Throwable -> L18
            if (r6 != r0) goto L53
            goto L66
        L53:
            r7 = r9
            r9 = r6
            r6 = r2
        L56:
            y8a r9 = (p000.y8a) r9     // Catch: java.lang.Throwable -> L18
            r8.f2209d = r7     // Catch: java.lang.Throwable -> L18
            r8.f2206a = r5     // Catch: java.lang.Throwable -> L18
            r8.f2207b = r5     // Catch: java.lang.Throwable -> L18
            r8.f2208c = r3     // Catch: java.lang.Throwable -> L18
            java.lang.Object r9 = androidx.compose.foundation.gestures.C0118x.m948c(r6, r1, r9, r8)     // Catch: java.lang.Throwable -> L18
            if (r9 != r0) goto L67
        L66:
            return r0
        L67:
            r9 = r7
            goto L33
        L69:
            r2.f2375g = r5
            xfa r8 = p000.xfa.f68157a
            return r8
        L6e:
            r2.f2375g = r5
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TrackpadScrollingLogic$startReceivingEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
