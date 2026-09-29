package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import java.io.File;
import java.util.List;
import p000.C3006fm;
import p000.bh4;
import p000.hr7;
import p000.un1;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreSingletonDelegate implements hr7 {
    private volatile DataStore<Preferences> INSTANCE;
    private final ReplaceFileCorruptionHandler<Preferences> corruptionHandler;
    private final Object lock;
    private final String name;
    private final vi3 produceMigrations;
    private final un1 scope;

    public PreferenceDataStoreSingletonDelegate(String str, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, vi3 vi3Var, un1 un1Var) {
        str.getClass();
        vi3Var.getClass();
        un1Var.getClass();
        this.name = str;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = vi3Var;
        this.scope = un1Var;
        this.lock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File getValue$lambda$0$0(Context context, PreferenceDataStoreSingletonDelegate preferenceDataStoreSingletonDelegate) {
        context.getClass();
        return PreferenceDataStoreFile.preferencesDataStoreFile(context, preferenceDataStoreSingletonDelegate.name);
    }

    @Override // p000.hr7
    public DataStore<Preferences> getValue(Context context, bh4 bh4Var) {
        DataStore<Preferences> dataStore;
        context.getClass();
        bh4Var.getClass();
        DataStore<Preferences> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = context.getApplicationContext();
                    PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.INSTANCE;
                    ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler = this.corruptionHandler;
                    vi3 vi3Var = this.produceMigrations;
                    applicationContext.getClass();
                    this.INSTANCE = preferenceDataStoreFactory.create(replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) vi3Var.invoke(applicationContext), this.scope, new C3006fm(26, applicationContext, this));
                }
                dataStore = this.INSTANCE;
                dataStore.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return dataStore;
    }
}
