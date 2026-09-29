package androidx.datastore.preferences;

import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import java.util.LinkedHashSet;
import java.util.Set;
import p168i3.C6174b;
import p212k3.AbstractC6579a;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesMigrationKt {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet f5772a = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2057q<C6174b, AbstractC6579a, InterfaceC9968c<? super AbstractC6579a>, Object> m3041a() {
        return new SharedPreferencesMigrationKt$getMigrationFunction$1(null);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2056p<AbstractC6579a, InterfaceC9968c<? super Boolean>, Object> m3042b(Set<String> set) {
        return new SharedPreferencesMigrationKt$getShouldRunMigration$1(set, null);
    }
}
