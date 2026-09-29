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
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", m4291f = "JavaDataStorage.kt", m4292l = {145}, m4293m = "invokeSuspend")
final class JavaDataStorage$putSync$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f13690a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1153a f13691b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Preferences.Key f13692c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Long f13693d;

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1$1 */
    @c32(m4290c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", m4291f = "JavaDataStorage.kt", m4292l = {}, m4293m = "invokeSuspend")
    final class C11521 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f13694a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Preferences.Key f13695b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Long f13696c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11521(Preferences.Key key, Long l, Continuation continuation) {
            super(2, continuation);
            this.f13695b = key;
            this.f13696c = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C11521 c11521 = new C11521(this.f13695b, this.f13696c, continuation);
            c11521.f13694a = obj;
            return c11521;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C11521 c11521 = (C11521) create((MutablePreferences) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c11521.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ((MutablePreferences) this.f13694a).set(this.f13695b, this.f13696c);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDataStorage$putSync$1(C1153a c1153a, Preferences.Key key, Long l, Continuation continuation) {
        super(2, continuation);
        this.f13691b = c1153a;
        this.f13692c = key;
        this.f13693d = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JavaDataStorage$putSync$1(this.f13691b, this.f13692c, this.f13693d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((JavaDataStorage$putSync$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f13690a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        DataStore dataStore = this.f13691b.f13700c;
        C11521 c11521 = new C11521(this.f13692c, this.f13693d, null);
        this.f13690a = 1;
        Object objEdit = PreferencesKt.edit(dataStore, c11521, this);
        return objEdit == coroutineSingletons ? coroutineSingletons : objEdit;
    }
}
