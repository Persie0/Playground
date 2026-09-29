package com.amplitude.android.plugins;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.ej0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.plugins.AndroidLifecyclePlugin$setup$2", m4291f = "AndroidLifecyclePlugin.kt", m4292l = {97}, m4293m = "invokeSuspend")
final class AndroidLifecyclePlugin$setup$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public ej0 f10939a;

    /* JADX INFO: renamed from: b */
    public int f10940b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0895b f10941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLifecyclePlugin$setup$2(C0895b c0895b, Continuation continuation) {
        super(2, continuation);
        this.f10941c = c0895b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidLifecyclePlugin$setup$2(this.f10941c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidLifecyclePlugin$setup$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0031 -> B:12:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x0058
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.f10940b
            r2 = 0
            com.amplitude.android.plugins.b r3 = r7.f10941c
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 != r4) goto L12
            ej0 r1 = r7.f10939a
            kotlin.AbstractC3193b.m15359b(r8)
            goto L34
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r7)
            return r2
        L18:
            kotlin.AbstractC3193b.m15359b(r8)
            t6 r8 = r3.f10956a
            java.lang.Object r8 = r8.f61897b
            kotlinx.coroutines.channels.a r8 = (kotlinx.coroutines.channels.C3211a) r8
            r8.getClass()
            ej0 r1 = new ej0
            r1.<init>(r8)
        L29:
            r7.f10939a = r1
            r7.f10940b = r4
            java.lang.Object r8 = r1.m11164b(r7)
            if (r8 != r0) goto L34
            return r0
        L34:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L85
            java.lang.Object r8 = r1.m11165c()
            l6 r8 = (p000.C3287l6) r8
            java.lang.ref.WeakReference r5 = r8.f49103a
            java.lang.Object r5 = r5.get()
            android.app.Activity r5 = (android.app.Activity) r5
            if (r5 == 0) goto L29
            com.amplitude.android.utilities.ActivityCallbackType r8 = r8.f49104b
            int[] r6 = p000.AbstractC3612ti.f62333a
            int r8 = r8.ordinal()
            r8 = r6[r8]
            if (r8 == r4) goto L75
            r6 = 2
            if (r8 == r6) goto L71
            r6 = 3
            if (r8 == r6) goto L6d
            r6 = 5
            if (r8 == r6) goto L69
            r6 = 6
            if (r8 == r6) goto L65
            goto L29
        L65:
            r3.onActivityDestroyed(r5)
            goto L29
        L69:
            r3.onActivityStopped(r5)
            goto L29
        L6d:
            r3.onActivityResumed(r5)
            goto L29
        L71:
            r3.onActivityStarted(r5)
            goto L29
        L75:
            android.content.Intent r8 = r5.getIntent()
            if (r8 == 0) goto L80
            android.os.Bundle r8 = r8.getExtras()
            goto L81
        L80:
            r8 = r2
        L81:
            r3.onActivityCreated(r5, r8)
            goto L29
        L85:
            xfa r7 = p000.xfa.f68157a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.android.plugins.AndroidLifecyclePlugin$setup$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
