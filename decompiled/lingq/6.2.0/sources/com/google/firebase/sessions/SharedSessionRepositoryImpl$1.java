package com.google.firebase.sessions;

import android.util.Log;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3575si;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.l83;
import p000.un1;
import p000.uy8;
import p000.xfa;
import p000.zi3;
import p000.zy8;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", m4291f = "SharedSessionRepository.kt", m4292l = {96}, m4293m = "invokeSuspend")
final class SharedSessionRepositoryImpl$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f13819a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1168d f13820b;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1 */
    @c32(m4290c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", m4291f = "SharedSessionRepository.kt", m4292l = {94}, m4293m = "invokeSuspend")
    final class C11611 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public int f13821a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ e83 f13822b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Throwable f13823c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C1168d f13824d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11611(C1168d c1168d, Continuation continuation) {
            super(3, continuation);
            this.f13824d = c1168d;
        }

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C11611 c11611 = new C11611(this.f13824d, (Continuation) obj3);
            c11611.f13822b = (e83) obj;
            c11611.f13823c = (Throwable) obj2;
            return c11611.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f13821a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                e83 e83Var = this.f13822b;
                Throwable th = this.f13823c;
                zy8 zy8VarM10759a = this.f13824d.f13859b.m10759a(null);
                uy8 uy8Var = new uy8(zy8VarM10759a, null, null);
                Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + zy8VarM10759a.f72388a);
                this.f13822b = null;
                this.f13821a = 1;
                if (e83Var.emit(uy8Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSessionRepositoryImpl$1(C1168d c1168d, Continuation continuation) {
        super(2, continuation);
        this.f13820b = c1168d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedSessionRepositoryImpl$1(this.f13820b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedSessionRepositoryImpl$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f13819a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1168d c1168d = this.f13820b;
            l83 l83Var = new l83(c1168d.f13862e.getData(), new C11611(c1168d, null), 1);
            C3575si c3575si = new C3575si(c1168d, 4);
            this.f13819a = 1;
            if (l83Var.collect(c3575si, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
