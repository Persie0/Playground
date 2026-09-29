package com.google.firebase.sessions.api;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.t53;
import p000.v63;

/* JADX INFO: renamed from: com.google.firebase.sessions.api.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1165a {

    /* JADX INFO: renamed from: a */
    public static final C1165a f13849a = new C1165a();

    /* JADX INFO: renamed from: b */
    public static final Map f13850b = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: a */
    public static t53 m6752a(SessionSubscriber$Name sessionSubscriber$Name) {
        Map map = f13850b;
        map.getClass();
        Object obj = map.get(sessionSubscriber$Name);
        if (obj != null) {
            return (t53) obj;
        }
        v63.m23148z("Cannot get dependency ", sessionSubscriber$Name, ". Dependencies should be added at class load time.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:19:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x008f  */
    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008f -> B:21:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m6753b(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            if (r0 == 0) goto L13
            r0 = r10
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) r0
            int r1 = r0.f13848h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13848h = r1
            goto L18
        L13:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r9 = r0.f13846f
            kotlin.coroutines.intrinsics.CoroutineSingletons r10 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.f13848h
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 != r3) goto L32
            java.lang.Object r1 = r0.f13845e
            java.util.Map r4 = r0.f13844d
            com.google.firebase.sessions.api.SessionSubscriber$Name r5 = r0.f13843c
            java.util.Iterator r6 = r0.f13842b
            java.util.Map r7 = r0.f13841a
            kotlin.AbstractC3193b.m15359b(r9)
            goto L90
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r9)
            return r2
        L38:
            kotlin.AbstractC3193b.m15359b(r9)
            java.util.Map r9 = com.google.firebase.sessions.api.C1165a.f13850b
            r9.getClass()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r4 = r9.size()
            int r4 = kotlin.collections.AbstractC3194a.m15363P(r4)
            r1.<init>(r4)
            java.util.Set r9 = r9.entrySet()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r6 = r9
            r4 = r1
        L59:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto La8
            java.lang.Object r9 = r6.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r1 = r9.getKey()
            java.lang.Object r5 = r9.getKey()
            com.google.firebase.sessions.api.SessionSubscriber$Name r5 = (com.google.firebase.sessions.api.SessionSubscriber$Name) r5
            java.lang.Object r9 = r9.getValue()
            t53 r9 = (p000.t53) r9
            xf r7 = new xf
            r8 = 12
            r7.<init>(r9, r8)
            r0.f13841a = r4
            r0.f13842b = r6
            r0.f13843c = r5
            r0.f13844d = r4
            r0.f13845e = r1
            r0.f13848h = r3
            java.lang.Object r9 = kotlinx.coroutines.AbstractC3208a.m15444k(r7, r0)
            if (r9 != r10) goto L8f
            return r10
        L8f:
            r7 = r4
        L90:
            r5.getClass()
            t53 r9 = m6752a(r5)
            np1 r9 = r9.f61875b
            if (r9 == 0) goto La0
            r4.put(r1, r9)
            r4 = r7
            goto L59
        La0:
            java.lang.String r9 = "Subscriber "
            java.lang.String r10 = " has not been registered."
            p000.v63.m23148z(r9, r5, r10)
            return r2
        La8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.C1165a.m6753b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
