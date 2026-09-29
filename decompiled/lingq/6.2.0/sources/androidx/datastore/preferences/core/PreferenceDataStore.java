package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStore implements DataStore<Preferences> {
    private final DataStore<Preferences> delegate;

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.PreferenceDataStore$updateData$2 */
    @c32(m4290c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", m4291f = "PreferenceDataStoreFactory.kt", m4292l = {90}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05382 extends SuspendLambda implements zi3 {
        final /* synthetic */ zi3 $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05382(zi3 zi3Var, Continuation<? super C05382> continuation) {
            super(2, continuation);
            this.$transform = zi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
            C05382 c05382 = new C05382(this.$transform, continuation);
            c05382.L$0 = obj;
            return c05382;
        }

        @Override // p000.zi3
        public final Object invoke(Preferences preferences, Continuation<? super Preferences> continuation) {
            return ((C05382) create(preferences, continuation)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Preferences preferences = (Preferences) this.L$0;
                zi3 zi3Var = this.$transform;
                this.label = 1;
                obj = zi3Var.invoke(preferences, this);
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
            Preferences preferences2 = (Preferences) obj;
            preferences2.getClass();
            ((MutablePreferences) preferences2).freeze$datastore_preferences_core();
            return preferences2;
        }
    }

    public PreferenceDataStore(DataStore<Preferences> dataStore) {
        dataStore.getClass();
        this.delegate = dataStore;
    }

    @Override // androidx.datastore.core.DataStore
    public c83 getData() {
        return this.delegate.getData();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(zi3 zi3Var, Continuation<? super Preferences> continuation) {
        return this.delegate.updateData(new C05382(zi3Var, null), continuation);
    }
}
