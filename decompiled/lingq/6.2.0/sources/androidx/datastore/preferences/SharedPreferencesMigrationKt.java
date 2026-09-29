package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.ui3;
import p000.v91;
import p000.xfa;
import p000.y52;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesMigrationKt {
    private static final Set<String> MIGRATE_ALL_KEYS = new LinkedHashSet();

    /* JADX INFO: renamed from: androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1 */
    @c32(m4290c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", m4291f = "SharedPreferencesMigration.android.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05361 extends SuspendLambda implements aj3 {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C05361(Continuation<? super C05361> continuation) {
            super(3, continuation);
        }

        @Override // p000.aj3
        public final Object invoke(SharedPreferencesView sharedPreferencesView, Preferences preferences, Continuation<? super Preferences> continuation) {
            C05361 c05361 = new C05361(continuation);
            c05361.L$0 = sharedPreferencesView;
            c05361.L$1 = preferences;
            return c05361.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            SharedPreferencesView sharedPreferencesView = (SharedPreferencesView) this.L$0;
            Preferences preferences = (Preferences) this.L$1;
            Set<Preferences.Key<?>> setKeySet = preferences.asMap().keySet();
            ArrayList arrayList = new ArrayList(v91.m23189q0(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((Preferences.Key) it.next()).getName());
            }
            Map<String, Object> all = sharedPreferencesView.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : all.entrySet()) {
                if (!arrayList.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            MutablePreferences mutablePreferences = preferences.toMutablePreferences();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    mutablePreferences.set(PreferencesKeys.booleanKey(str), value);
                } else if (value instanceof Float) {
                    mutablePreferences.set(PreferencesKeys.floatKey(str), value);
                } else if (value instanceof Integer) {
                    mutablePreferences.set(PreferencesKeys.intKey(str), value);
                } else if (value instanceof Long) {
                    mutablePreferences.set(PreferencesKeys.longKey(str), value);
                } else if (value instanceof String) {
                    mutablePreferences.set(PreferencesKeys.stringKey(str), value);
                } else if (value instanceof Set) {
                    mutablePreferences.set(PreferencesKeys.stringSetKey(str), (Set) value);
                }
            }
            return mutablePreferences.toPreferences();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1 */
    @c32(m4290c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", m4291f = "SharedPreferencesMigration.android.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05371 extends SuspendLambda implements zi3 {
        final /* synthetic */ Set<String> $keysToMigrate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05371(Set<String> set, Continuation<? super C05371> continuation) {
            super(2, continuation);
            this.$keysToMigrate = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
            C05371 c05371 = new C05371(this.$keysToMigrate, continuation);
            c05371.L$0 = obj;
            return c05371;
        }

        @Override // p000.zi3
        public final Object invoke(Preferences preferences, Continuation<? super Boolean> continuation) {
            return ((C05371) create(preferences, continuation)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            Set<Preferences.Key<?>> setKeySet = ((Preferences) this.L$0).asMap().keySet();
            ArrayList arrayList = new ArrayList(v91.m23189q0(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((Preferences.Key) it.next()).getName());
            }
            boolean z = true;
            if (this.$keysToMigrate != SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS()) {
                Set<String> set = this.$keysToMigrate;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z = false;
                } else {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                        }
                    }
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(Context context, String str, Set<String> set) {
        context.getClass();
        str.getClass();
        set.getClass();
        if (set != MIGRATE_ALL_KEYS) {
            return new SharedPreferencesMigration<>(context, str, set, getShouldRunMigration(set), getMigrationFunction());
        }
        return new SharedPreferencesMigration<>(context, str, null, getShouldRunMigration(set), getMigrationFunction(), 4, null);
    }

    public static /* synthetic */ SharedPreferencesMigration SharedPreferencesMigration$default(ui3 ui3Var, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration(ui3Var, (Set<String>) set);
    }

    public static final Set<String> getMIGRATE_ALL_KEYS() {
        return MIGRATE_ALL_KEYS;
    }

    private static final aj3 getMigrationFunction() {
        return new C05361(null);
    }

    private static final zi3 getShouldRunMigration(Set<String> set) {
        return new C05371(set, null);
    }

    public static /* synthetic */ SharedPreferencesMigration SharedPreferencesMigration$default(Context context, String str, Set set, int i, Object obj) {
        if ((i & 4) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration(context, str, set);
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(Context context, String str) {
        context.getClass();
        str.getClass();
        return SharedPreferencesMigration$default(context, str, null, 4, null);
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(ui3 ui3Var, Set<String> set) {
        ui3Var.getClass();
        set.getClass();
        if (set == MIGRATE_ALL_KEYS) {
            return new SharedPreferencesMigration<>(ui3Var, (Set) null, getShouldRunMigration(set), getMigrationFunction(), 2, (y52) null);
        }
        return new SharedPreferencesMigration<>(ui3Var, set, getShouldRunMigration(set), getMigrationFunction());
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(ui3 ui3Var) {
        ui3Var.getClass();
        return SharedPreferencesMigration$default(ui3Var, null, 2, null);
    }
}
