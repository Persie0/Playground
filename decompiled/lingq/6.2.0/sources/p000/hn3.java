package p000;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.jvm.internal.PropertyReference2Impl;

/* JADX INFO: loaded from: classes.dex */
public final class hn3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ bh4[] f42651a;

    static {
        PropertyReference2Impl propertyReference2Impl = new PropertyReference2Impl(hn3.class, "appManagerDataStore", "getAppManagerDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        y38.f69246a.getClass();
        f42651a = new bh4[]{propertyReference2Impl};
    }

    /* JADX INFO: renamed from: a */
    public static final Preferences.Key m13377a(hn3 hn3Var, String str) {
        hn3Var.getClass();
        return PreferencesKeys.stringKey("provider:" + str);
    }
}
