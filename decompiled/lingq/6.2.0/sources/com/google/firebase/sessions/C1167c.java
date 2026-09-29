package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.sessions.api.C1165a;
import com.google.firebase.sessions.settings.C1170b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.kn1;
import p000.np1;
import p000.q43;
import p000.tt2;
import p000.x43;

/* JADX INFO: renamed from: com.google.firebase.sessions.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1167c {

    /* JADX INFO: renamed from: f */
    public static final double f13851f = Math.random();

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f13852g = 0;

    /* JADX INFO: renamed from: a */
    public final q43 f13853a;

    /* JADX INFO: renamed from: b */
    public final x43 f13854b;

    /* JADX INFO: renamed from: c */
    public final C1170b f13855c;

    /* JADX INFO: renamed from: d */
    public final tt2 f13856d;

    /* JADX INFO: renamed from: e */
    public final kn1 f13857e;

    public C1167c(q43 q43Var, x43 x43Var, C1170b c1170b, tt2 tt2Var, kn1 kn1Var) {
        q43Var.getClass();
        x43Var.getClass();
        c1170b.getClass();
        tt2Var.getClass();
        kn1Var.getClass();
        this.f13853a = q43Var;
        this.f13854b = x43Var;
        this.f13855c = c1170b;
        this.f13856d = tt2Var;
        this.f13857e = kn1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r0.m6766b(r1) == r7) goto L31;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m6755a(C1167c c1167c, ContinuationImpl continuationImpl) throws Throwable {
        SessionFirelogPublisherImpl$shouldLogSession$1 sessionFirelogPublisherImpl$shouldLogSession$1;
        C1170b c1170b = c1167c.f13855c;
        if (continuationImpl instanceof SessionFirelogPublisherImpl$shouldLogSession$1) {
            sessionFirelogPublisherImpl$shouldLogSession$1 = (SessionFirelogPublisherImpl$shouldLogSession$1) continuationImpl;
            int i = sessionFirelogPublisherImpl$shouldLogSession$1.f13818c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sessionFirelogPublisherImpl$shouldLogSession$1.f13818c = i - Integer.MIN_VALUE;
            } else {
                sessionFirelogPublisherImpl$shouldLogSession$1 = new SessionFirelogPublisherImpl$shouldLogSession$1(c1167c, continuationImpl);
            }
        } else {
            sessionFirelogPublisherImpl$shouldLogSession$1 = new SessionFirelogPublisherImpl$shouldLogSession$1(c1167c, continuationImpl);
        }
        Object objM6753b = sessionFirelogPublisherImpl$shouldLogSession$1.f13816a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = sessionFirelogPublisherImpl$shouldLogSession$1.f13818c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM6753b);
            C1165a c1165a = C1165a.f13849a;
            sessionFirelogPublisherImpl$shouldLogSession$1.f13818c = 1;
            objM6753b = c1165a.m6753b(sessionFirelogPublisherImpl$shouldLogSession$1);
            if (objM6753b != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(objM6753b);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM6753b);
        }
        Boolean boolMo6761a = c1170b.f13901a.mo6761a();
        if (!((boolMo6761a == null && (boolMo6761a = c1170b.f13902b.mo6761a()) == null) ? true : boolMo6761a.booleanValue())) {
            Log.d("FirebaseSessions", "Sessions SDK disabled through settings API. Events will not be sent.");
            return Boolean.FALSE;
        }
        if (f13851f <= c1170b.m6765a()) {
            return Boolean.TRUE;
        }
        Log.d("FirebaseSessions", "Sessions SDK has dropped this session due to sampling.");
        return Boolean.FALSE;
        Collection collectionValues = ((Map) objM6753b).values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            do {
                if (it.hasNext()) {
                }
            } while (!((np1) it.next()).f53086a.m22354a());
            sessionFirelogPublisherImpl$shouldLogSession$1.f13818c = 2;
        }
        Log.d("FirebaseSessions", "Sessions SDK disabled through data collection. Events will not be sent.");
        return Boolean.FALSE;
    }
}
