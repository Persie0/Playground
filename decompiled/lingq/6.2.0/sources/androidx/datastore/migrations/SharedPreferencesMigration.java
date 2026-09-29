package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.core.DataMigration;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3192a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3006fm;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.cs4;
import p000.u91;
import p000.ui3;
import p000.ux5;
import p000.v63;
import p000.xfa;
import p000.y52;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesMigration<T> implements DataMigration<T> {
    private final Context context;
    private final Set<String> keySet;
    private final aj3 migrate;
    private final String name;
    private final cs4 sharedPrefs$delegate;
    private final zi3 shouldRunMigration;

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1 */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "androidx.datastore.migrations.SharedPreferencesMigration$1", m4291f = "SharedPreferencesMigration.android.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05301 extends SuspendLambda implements zi3 {
        int label;

        public C05301(Continuation<? super C05301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
            return new C05301(continuation);
        }

        @Override // p000.zi3
        public final Object invoke(T t, Continuation<? super Boolean> continuation) {
            return ((C05301) create(t, continuation)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                AbstractC3193b.m15359b(obj);
                return Boolean.TRUE;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2 */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "androidx.datastore.migrations.SharedPreferencesMigration$2", m4291f = "SharedPreferencesMigration.android.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05312 extends SuspendLambda implements zi3 {
        int label;

        public C05312(Continuation<? super C05312> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
            return new C05312(continuation);
        }

        @Override // p000.zi3
        public final Object invoke(T t, Continuation<? super Boolean> continuation) {
            return ((C05312) create(t, continuation)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                AbstractC3193b.m15359b(obj);
                return Boolean.TRUE;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3 */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "androidx.datastore.migrations.SharedPreferencesMigration$3", m4291f = "SharedPreferencesMigration.android.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05323 extends SuspendLambda implements zi3 {
        int label;

        public C05323(Continuation<? super C05323> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
            return new C05323(continuation);
        }

        @Override // p000.zi3
        public final Object invoke(T t, Continuation<? super Boolean> continuation) {
            return ((C05323) create(t, continuation)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                AbstractC3193b.m15359b(obj);
                return Boolean.TRUE;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        public static final boolean deleteSharedPreferences(Context context, String str) {
            context.getClass();
            str.getClass();
            return context.deleteSharedPreferences(str);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 */
    @c32(m4290c = "androidx.datastore.migrations.SharedPreferencesMigration", m4291f = "SharedPreferencesMigration.android.kt", m4292l = {145}, m4293m = "shouldMigrate", m4294v = 1)
    public static final class C05331 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedPreferencesMigration<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05331(SharedPreferencesMigration<T> sharedPreferencesMigration, Continuation<? super C05331> continuation) {
            super(continuation);
            this.this$0 = sharedPreferencesMigration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.shouldMigrate(null, this);
        }
    }

    private SharedPreferencesMigration(ui3 ui3Var, Set<String> set, zi3 zi3Var, aj3 aj3Var, Context context, String str) {
        this.shouldRunMigration = zi3Var;
        this.migrate = aj3Var;
        this.context = context;
        this.name = str;
        this.sharedPrefs$delegate = AbstractC3192a.m15356a(ui3Var);
        this.keySet = set == SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() ? null : u91.m22626r1(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences _init_$lambda$0(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    private final void deleteSharedPreferences(Context context, String str) {
        Api24Impl.deleteSharedPreferences(context, str);
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs$delegate.getValue();
    }

    private final File getSharedPrefsBackup(File file) {
        return new File(file.getPath() + ".bak");
    }

    private final File getSharedPrefsFile(Context context, String str) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), ux5.m22990m(str, ".xml"));
    }

    @Override // androidx.datastore.core.DataMigration
    public Object cleanUp(Continuation<? super xfa> continuation) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = getSharedPrefs().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            v63.m23133k("Unable to delete migrated keys from SharedPreferences.");
            return null;
        }
        if (getSharedPrefs().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            deleteSharedPreferences(context, str);
        }
        Set<String> set2 = this.keySet;
        if (set2 != null) {
            set2.clear();
        }
        return xfa.f68157a;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object migrate(T t, Continuation<? super T> continuation) {
        return this.migrate.invoke(new SharedPreferencesView(getSharedPrefs(), this.keySet), t, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.DataMigration
    public Object shouldMigrate(T t, Continuation<? super Boolean> continuation) throws Throwable {
        C05331 c05331;
        if (continuation instanceof C05331) {
            c05331 = (C05331) continuation;
            int i = c05331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05331.label = i - Integer.MIN_VALUE;
            } else {
                c05331 = new C05331(this, continuation);
            }
        } else {
            c05331 = new C05331(this, continuation);
        }
        Object objInvoke = c05331.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c05331.label;
        boolean z = true;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objInvoke);
            zi3 zi3Var = this.shouldRunMigration;
            c05331.label = 1;
            objInvoke = zi3Var.invoke(t, c05331);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        Set<String> set = this.keySet;
        if (set == null) {
            Map<String, ?> all = getSharedPrefs().getAll();
            all.getClass();
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            Set<String> set2 = set;
            SharedPreferences sharedPrefs = getSharedPrefs();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPrefs.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(ui3 ui3Var, Set<String> set, aj3 aj3Var) {
        this(ui3Var, set, (zi3) null, aj3Var, 4, (y52) null);
        ui3Var.getClass();
        set.getClass();
        aj3Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String str, aj3 aj3Var) {
        this(context, str, null, null, aj3Var, 12, null);
        context.getClass();
        str.getClass();
        aj3Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String str, Set<String> set, aj3 aj3Var) {
        this(context, str, set, null, aj3Var, 8, null);
        context.getClass();
        str.getClass();
        set.getClass();
        aj3Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(ui3 ui3Var, aj3 aj3Var) {
        this(ui3Var, (Set) null, (zi3) null, aj3Var, 6, (y52) null);
        ui3Var.getClass();
        aj3Var.getClass();
    }

    public /* synthetic */ SharedPreferencesMigration(ui3 ui3Var, Set set, zi3 zi3Var, aj3 aj3Var, Context context, String str, int i, y52 y52Var) {
        this(ui3Var, (Set<String>) set, (i & 4) != 0 ? new C05301(null) : zi3Var, aj3Var, context, str);
    }

    public /* synthetic */ SharedPreferencesMigration(ui3 ui3Var, Set set, zi3 zi3Var, aj3 aj3Var, int i, y52 y52Var) {
        this(ui3Var, (Set<String>) ((i & 2) != 0 ? SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() : set), (i & 4) != 0 ? new C05312(null) : zi3Var, aj3Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(ui3 ui3Var, Set<String> set, zi3 zi3Var, aj3 aj3Var) {
        this(ui3Var, set, zi3Var, aj3Var, (Context) null, (String) null);
        ui3Var.getClass();
        set.getClass();
        zi3Var.getClass();
        aj3Var.getClass();
    }

    public /* synthetic */ SharedPreferencesMigration(Context context, String str, Set set, zi3 zi3Var, aj3 aj3Var, int i, y52 y52Var) {
        this(context, str, (i & 4) != 0 ? SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() : set, (i & 8) != 0 ? new C05323(null) : zi3Var, aj3Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String str, Set<String> set, zi3 zi3Var, aj3 aj3Var) {
        this(new C3006fm(29, context, str), set, zi3Var, aj3Var, context, str);
        context.getClass();
        str.getClass();
        set.getClass();
        zi3Var.getClass();
        aj3Var.getClass();
    }
}
