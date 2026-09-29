package androidx.datastore.preferences.core;

import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.FileStorage;
import androidx.datastore.core.Storage;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.util.List;
import kotlin.collections.EmptyList;
import p000.C3386nv;
import p000.d57;
import p000.eh0;
import p000.k92;
import p000.nn1;
import p000.nn9;
import p000.ph2;
import p000.r46;
import p000.t62;
import p000.ui3;
import p000.un1;
import p000.v33;
import p000.v72;
import p000.vz1;
import p000.xa0;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreFactory {
    public static final PreferenceDataStoreFactory INSTANCE = new PreferenceDataStoreFactory();

    private PreferenceDataStoreFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, un1 un1Var, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            list = EmptyList.f47638a;
        }
        if ((i & 8) != 0) {
            nn1 nn1VarIoDispatcher = Actual_jvmAndroidKt.ioDispatcher();
            nn9 nn9VarM20384i = r46.m20384i();
            nn1VarIoDispatcher.getClass();
            un1Var = vz1.m23619a(eh0.m11113J(nn1VarIoDispatcher, nn9VarM20384i));
        }
        return preferenceDataStoreFactory.create((Storage<Preferences>) storage, (ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, un1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File create$lambda$0(ui3 ui3Var) {
        File file = (File) ui3Var.mo0a();
        if (!v33.m23078T(file).equals("preferences_pb")) {
            C3386nv.m17634u("File extension for file: ", file, " does not match required extension for Preferences file: preferences_pb");
            return null;
        }
        File absoluteFile = file.getAbsoluteFile();
        absoluteFile.getClass();
        return absoluteFile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DataStore createWithPath$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, un1 un1Var, ui3 ui3Var, int i, Object obj) {
        if ((i & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 2) != 0) {
            list = EmptyList.f47638a;
        }
        if ((i & 4) != 0) {
            nn1 nn1VarIoDispatcher = Actual_jvmAndroidKt.ioDispatcher();
            nn9 nn9VarM20384i = r46.m20384i();
            nn1VarIoDispatcher.getClass();
            un1Var = vz1.m23619a(eh0.m11113J(nn1VarIoDispatcher, nn9VarM20384i));
        }
        return preferenceDataStoreFactory.createWithPath(replaceFileCorruptionHandler, list, un1Var, ui3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File createWithPath$lambda$0(ui3 ui3Var) {
        return ((d57) ui3Var.mo0a()).toFile();
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> list, un1 un1Var, ui3 ui3Var) {
        list.getClass();
        un1Var.getClass();
        ui3Var.getClass();
        return new PreferenceDataStore(create(new FileStorage(PreferencesFileSerializer.INSTANCE, null, new k92(21, ui3Var), 2, null), replaceFileCorruptionHandler, list, un1Var));
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> list, un1 un1Var, ui3 ui3Var) {
        list.getClass();
        un1Var.getClass();
        ui3Var.getClass();
        return create(replaceFileCorruptionHandler, list, un1Var, new xa0(26, ui3Var));
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, ui3 ui3Var) {
        ui3Var.getClass();
        return createWithPath$default(this, replaceFileCorruptionHandler, null, null, ui3Var, 6, null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> list, ui3 ui3Var) {
        list.getClass();
        ui3Var.getClass();
        return createWithPath$default(this, replaceFileCorruptionHandler, list, null, ui3Var, 4, null);
    }

    public final DataStore<Preferences> createWithPath(ui3 ui3Var) {
        ui3Var.getClass();
        return createWithPath$default(this, null, null, null, ui3Var, 7, null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage) {
        storage.getClass();
        return create$default(this, storage, (ReplaceFileCorruptionHandler) null, (List) null, (un1) null, 14, (Object) null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler) {
        storage.getClass();
        return create$default(this, storage, replaceFileCorruptionHandler, (List) null, (un1) null, 12, (Object) null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> list) {
        storage.getClass();
        list.getClass();
        return create$default(this, storage, replaceFileCorruptionHandler, list, (un1) null, 8, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, un1 un1Var, ui3 ui3Var, int i, Object obj) {
        if ((i & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 2) != 0) {
            list = EmptyList.f47638a;
        }
        if ((i & 4) != 0) {
            v72 v72Var = ph2.f56212a;
            t62 t62Var = t62.f61909c;
            nn9 nn9VarM20384i = r46.m20384i();
            t62Var.getClass();
            un1Var = vz1.m23619a(eh0.m11113J(t62Var, nn9VarM20384i));
        }
        return preferenceDataStoreFactory.create((ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, un1Var, ui3Var);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, ui3 ui3Var) {
        ui3Var.getClass();
        return create$default(this, replaceFileCorruptionHandler, (List) null, (un1) null, ui3Var, 6, (Object) null);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> list, ui3 ui3Var) {
        list.getClass();
        ui3Var.getClass();
        return create$default(this, replaceFileCorruptionHandler, list, (un1) null, ui3Var, 4, (Object) null);
    }

    public final DataStore<Preferences> create(ui3 ui3Var) {
        ui3Var.getClass();
        return create$default(this, (ReplaceFileCorruptionHandler) null, (List) null, (un1) null, ui3Var, 7, (Object) null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> list, un1 un1Var) {
        storage.getClass();
        list.getClass();
        un1Var.getClass();
        return new PreferenceDataStore(DataStoreFactory.INSTANCE.create(storage, replaceFileCorruptionHandler, list, un1Var));
    }
}
