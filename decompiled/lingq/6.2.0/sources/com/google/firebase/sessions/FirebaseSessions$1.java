package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.sessions.api.C1165a;
import com.google.firebase.sessions.settings.C1170b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ho2;
import p000.lda;
import p000.np1;
import p000.nz8;
import p000.q43;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.FirebaseSessions$1", m4291f = "FirebaseSessions.kt", m4292l = {51, 55}, m4293m = "invokeSuspend")
final class FirebaseSessions$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f13800a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1164a f13801b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nz8 f13802c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseSessions$1(C1164a c1164a, nz8 nz8Var, Continuation continuation) {
        super(2, continuation);
        this.f13801b = c1164a;
        this.f13802c = nz8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FirebaseSessions$1(this.f13801b, this.f13802c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FirebaseSessions$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r1.m6766b(r7) == r2) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1164a c1164a = this.f13801b;
        C1170b c1170b = c1164a.f13840b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f13800a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1165a c1165a = C1165a.f13849a;
            this.f13800a = 1;
            obj = c1165a.m6753b(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        Boolean boolMo6761a = c1170b.f13901a.mo6761a();
        if ((boolMo6761a == null && (boolMo6761a = c1170b.f13902b.mo6761a()) == null) ? true : boolMo6761a.booleanValue()) {
            q43 q43Var = c1164a.f13839a;
            ho2 ho2Var = new ho2(27);
            q43Var.m19644a();
            q43Var.f57261j.add(ho2Var);
        } else {
            lda.m16121g(Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events."));
        }
        return xfa.f68157a;
        Collection collectionValues = ((Map) obj).values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((np1) it.next()).f53086a.m22354a()) {
                        this.f13800a = 2;
                    }
                }
            }
        }
        lda.m16121g(Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events."));
        return xfa.f68157a;
    }
}
