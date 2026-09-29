package com.google.firebase.datastorage;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKt;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", m4291f = "JavaDataStorage.kt", m4292l = {220}, m4293m = "invokeSuspend")
final class JavaDataStorage$editSync$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f13680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1153a f13681b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f13682c;

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1$1 */
    @c32(m4290c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", m4291f = "JavaDataStorage.kt", m4292l = {}, m4293m = "invokeSuspend")
    final class C11511 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f13683a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ vi3 f13684b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11511(vi3 vi3Var, Continuation continuation) {
            super(2, continuation);
            this.f13684b = vi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C11511 c11511 = new C11511(this.f13684b, continuation);
            c11511.f13683a = obj;
            return c11511;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C11511 c11511 = (C11511) create((MutablePreferences) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c11511.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f13684b.invoke((MutablePreferences) this.f13683a);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDataStorage$editSync$1(C1153a c1153a, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f13681b = c1153a;
        this.f13682c = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JavaDataStorage$editSync$1(this.f13681b, this.f13682c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((JavaDataStorage$editSync$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1153a c1153a = this.f13681b;
        ThreadLocal threadLocal = c1153a.f13699b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f13680a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Object obj2 = threadLocal.get();
                Boolean bool = Boolean.TRUE;
                if (fa4.m11650l(obj2, bool)) {
                    C3386nv.m17633t("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    return null;
                }
                threadLocal.set(bool);
                DataStore dataStore = c1153a.f13700c;
                C11511 c11511 = new C11511(this.f13682c, null);
                this.f13680a = 1;
                obj = PreferencesKt.edit(dataStore, c11511, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            Preferences preferences = (Preferences) obj;
            threadLocal.set(Boolean.FALSE);
            return preferences;
        } catch (Throwable th) {
            threadLocal.set(Boolean.FALSE);
            throw th;
        }
    }
}
