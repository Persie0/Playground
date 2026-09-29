package com.google.firebase.datastorage;

import androidx.datastore.preferences.core.Preferences;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", m4291f = "JavaDataStorage.kt", m4292l = {104}, m4293m = "invokeSuspend")
final class JavaDataStorage$getSync$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f13687a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1153a f13688b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Preferences.Key f13689c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDataStorage$getSync$1(C1153a c1153a, Preferences.Key key, Continuation continuation) {
        super(2, continuation);
        this.f13688b = c1153a;
        this.f13689c = key;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JavaDataStorage$getSync$1(this.f13688b, this.f13689c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((JavaDataStorage$getSync$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f13687a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 data = this.f13688b.f13700c.getData();
            this.f13687a = 1;
            obj = AbstractC3224d.m15542u(data, this);
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
        if (preferences == null || (obj2 = preferences.get(this.f13689c)) == null) {
            return -1L;
        }
        return obj2;
    }
}
