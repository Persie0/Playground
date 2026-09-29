package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesKt {

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.PreferencesKt$edit$2 */
    @c32(m4290c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m4291f = "Preferences.kt", m4292l = {343}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05392 extends SuspendLambda implements zi3 {
        final /* synthetic */ zi3 $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05392(zi3 zi3Var, Continuation<? super C05392> continuation) {
            super(2, continuation);
            this.$transform = zi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
            C05392 c05392 = new C05392(this.$transform, continuation);
            c05392.L$0 = obj;
            return c05392;
        }

        @Override // p000.zi3
        public final Object invoke(Preferences preferences, Continuation<? super Preferences> continuation) {
            return ((C05392) create(preferences, continuation)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                AbstractC3193b.m15359b(obj);
                return mutablePreferences;
            }
            AbstractC3193b.m15359b(obj);
            MutablePreferences mutablePreferences2 = ((Preferences) this.L$0).toMutablePreferences();
            zi3 zi3Var = this.$transform;
            this.L$0 = mutablePreferences2;
            this.label = 1;
            return zi3Var.invoke(mutablePreferences2, this) == coroutineSingletons ? coroutineSingletons : mutablePreferences2;
        }
    }

    public static final Object edit(DataStore<Preferences> dataStore, zi3 zi3Var, Continuation<? super Preferences> continuation) {
        return dataStore.updateData(new C05392(zi3Var, null), continuation);
    }
}
