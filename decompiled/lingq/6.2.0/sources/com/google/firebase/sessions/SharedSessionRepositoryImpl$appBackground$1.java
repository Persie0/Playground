package com.google.firebase.sessions;

import android.util.Log;
import androidx.datastore.core.DataStore;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.r0a;
import p000.un1;
import p000.uy8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1", m4291f = "SharedSessionRepository.kt", m4292l = {118}, m4293m = "invokeSuspend")
final class SharedSessionRepositoryImpl$appBackground$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f13825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1168d f13826b;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1 */
    @c32(m4290c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1", m4291f = "SharedSessionRepository.kt", m4292l = {}, m4293m = "invokeSuspend")
    final class C11621 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f13827a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1168d f13828b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11621(C1168d c1168d, Continuation continuation) {
            super(2, continuation);
            this.f13828b = c1168d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C11621 c11621 = new C11621(this.f13828b, continuation);
            c11621.f13827a = obj;
            return c11621;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C11621) create((uy8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            uy8 uy8Var = (uy8) this.f13827a;
            this.f13828b.f13861d.getClass();
            return uy8.m23014a(uy8Var, null, r0a.m20228a(), null, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSessionRepositoryImpl$appBackground$1(C1168d c1168d, Continuation continuation) {
        super(2, continuation);
        this.f13826b = c1168d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedSessionRepositoryImpl$appBackground$1(this.f13826b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedSessionRepositoryImpl$appBackground$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f13825a;
        C1168d c1168d = this.f13826b;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                DataStore dataStore = c1168d.f13862e;
                C11621 c11621 = new C11621(c1168d, null);
                this.f13825a = 1;
                if (dataStore.updateData(c11621, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception e) {
            Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
            uy8 uy8Var = c1168d.f13865h;
            if (uy8Var == null) {
                fa4.m11636J("localSessionData");
                throw null;
            }
            c1168d.f13861d.getClass();
            c1168d.f13865h = uy8.m23014a(uy8Var, null, r0a.m20228a(), null, 5);
        }
        return xfa.f68157a;
    }
}
