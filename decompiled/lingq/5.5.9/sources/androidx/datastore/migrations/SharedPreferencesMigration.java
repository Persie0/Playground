package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import dm.C5207g;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.C6740a;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p129g3.InterfaceC5686c;
import p168i3.C6173a;
import p168i3.C6174b;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesMigration<T> implements InterfaceC5686c<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2056p<T, InterfaceC9968c<? super Boolean>, Object> f5758a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2057q<C6174b, T, InterfaceC9968c<? super T>, Object> f5759b;

    /* JADX INFO: renamed from: c */
    public final Context f5760c;

    /* JADX INFO: renamed from: d */
    public final String f5761d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9070c f5762e;

    /* JADX INFO: renamed from: f */
    public final Set<String> f5763f;

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$a */
    public static final class C0797a {
        /* JADX INFO: renamed from: a */
        public static final boolean m3021a(Context context, String str) {
            C5207g.m11111f(context, "context");
            C5207g.m11111f(str, "name");
            return context.deleteSharedPreferences(str);
        }
    }

    public SharedPreferencesMigration(Context context, InterfaceC2056p interfaceC2056p, InterfaceC2057q interfaceC2057q) {
        this(context, C6173a.f36011a, interfaceC2056p, interfaceC2057q);
    }

    public SharedPreferencesMigration(final Context context, Set set, InterfaceC2056p interfaceC2056p, InterfaceC2057q interfaceC2057q) {
        C5207g.m11111f(context, "context");
        C5207g.m11111f(set, "keysToMigrate");
        C5207g.m11111f(interfaceC2056p, "shouldRunMigration");
        InterfaceC2041a<SharedPreferences> interfaceC2041a = new InterfaceC2041a<SharedPreferences>() { // from class: androidx.datastore.migrations.SharedPreferencesMigration.4

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f5765c = "com.linguist_preferences";

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final SharedPreferences mo807E() {
                SharedPreferences sharedPreferences = context.getSharedPreferences(this.f5765c, 0);
                C5207g.m11110e(sharedPreferences, "context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)");
                return sharedPreferences;
            }
        };
        this.f5758a = interfaceC2056p;
        this.f5759b = interfaceC2057q;
        this.f5760c = context;
        this.f5761d = "com.linguist_preferences";
        this.f5762e = C6740a.m13372a(interfaceC2041a);
        this.f5763f = set == C6173a.f36011a ? null : C6752c.m13456x0(set);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p129g3.InterfaceC5686c
    /* JADX INFO: renamed from: a */
    public final Object mo3018a(T t10, InterfaceC9968c<? super Boolean> interfaceC9968c) throws Throwable {
        SharedPreferencesMigration$shouldMigrate$1 sharedPreferencesMigration$shouldMigrate$1;
        SharedPreferencesMigration<T> sharedPreferencesMigration;
        if (interfaceC9968c instanceof SharedPreferencesMigration$shouldMigrate$1) {
            sharedPreferencesMigration$shouldMigrate$1 = (SharedPreferencesMigration$shouldMigrate$1) interfaceC9968c;
            int i10 = sharedPreferencesMigration$shouldMigrate$1.f5769g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sharedPreferencesMigration$shouldMigrate$1.f5769g = i10 - Integer.MIN_VALUE;
            } else {
                sharedPreferencesMigration$shouldMigrate$1 = new SharedPreferencesMigration$shouldMigrate$1(this, interfaceC9968c);
            }
        } else {
            sharedPreferencesMigration$shouldMigrate$1 = new SharedPreferencesMigration$shouldMigrate$1(this, interfaceC9968c);
        }
        Object objMo1337m0 = sharedPreferencesMigration$shouldMigrate$1.f5767e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = sharedPreferencesMigration$shouldMigrate$1.f5769g;
        boolean z10 = true;
        if (i11 == 0) {
            C7499b.m14977z0(objMo1337m0);
            sharedPreferencesMigration$shouldMigrate$1.f5766d = this;
            sharedPreferencesMigration$shouldMigrate$1.f5769g = 1;
            objMo1337m0 = this.f5758a.mo1337m0(t10, sharedPreferencesMigration$shouldMigrate$1);
            if (objMo1337m0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            sharedPreferencesMigration = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sharedPreferencesMigration = sharedPreferencesMigration$shouldMigrate$1.f5766d;
            C7499b.m14977z0(objMo1337m0);
        }
        if (!((Boolean) objMo1337m0).booleanValue()) {
            return Boolean.FALSE;
        }
        Set<String> set = sharedPreferencesMigration.f5763f;
        InterfaceC9070c interfaceC9070c = sharedPreferencesMigration.f5762e;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) interfaceC9070c.getValue()).getAll();
            C5207g.m11110e(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z10 = false;
            }
        } else {
            SharedPreferences sharedPreferences = (SharedPreferences) interfaceC9070c.getValue();
            if (set.isEmpty()) {
                z10 = false;
            } else {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (Boolean.valueOf(sharedPreferences.contains((String) it.next())).booleanValue()) {
                    }
                }
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // p129g3.InterfaceC5686c
    /* JADX INFO: renamed from: b */
    public final Object mo3019b(T t10, InterfaceC9968c<? super T> interfaceC9968c) {
        return this.f5759b.mo1343M(new C6174b((SharedPreferences) this.f5762e.getValue(), this.f5763f), t10, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p129g3.InterfaceC5686c
    /* JADX INFO: renamed from: d */
    public final C9072e mo3020d() throws IOException {
        C9072e c9072e;
        Context context;
        String str;
        InterfaceC9070c interfaceC9070c = this.f5762e;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) interfaceC9070c.getValue()).edit();
        Set<String> set = this.f5763f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (((SharedPreferences) interfaceC9070c.getValue()).getAll().isEmpty() && (context = this.f5760c) != null && (str = this.f5761d) != null && !C0797a.m3021a(context, str)) {
            throw new IOException(C5207g.m11116k(str, "Unable to delete SharedPreferences: "));
        }
        if (set == null) {
            c9072e = null;
        } else {
            set.clear();
            c9072e = C9072e.f47360a;
        }
        return c9072e == CoroutineSingletons.COROUTINE_SUSPENDED ? c9072e : C9072e.f47360a;
    }
}
