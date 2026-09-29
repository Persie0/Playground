package androidx.datastore.core;

import android.content.Context;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.util.List;
import kotlin.collections.EmptyList;
import p000.eh0;
import p000.l02;
import p000.nn1;
import p000.nn9;
import p000.ph2;
import p000.r46;
import p000.t62;
import p000.ui3;
import p000.un1;
import p000.v72;
import p000.vz1;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreFactory {
    public static final DataStoreFactory INSTANCE = new DataStoreFactory();

    private DataStoreFactory() {
    }

    public static DataStore create$default(DataStoreFactory dataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, un1 un1Var, ui3 ui3Var, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = replaceFileCorruptionHandler;
        if ((i & 4) != 0) {
            list = EmptyList.f47638a;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            v72 v72Var = ph2.f56212a;
            t62 t62Var = t62.f61909c;
            nn9 nn9VarM20384i = r46.m20384i();
            t62Var.getClass();
            un1Var = vz1.m23619a(eh0.m11113J(t62Var, nn9VarM20384i));
        }
        return dataStoreFactory.create(serializer, replaceFileCorruptionHandler2, list2, un1Var, ui3Var);
    }

    public static DataStore createInDeviceProtectedStorage$default(DataStoreFactory dataStoreFactory, Context context, String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, un1 un1Var, int i, Object obj) {
        if ((i & 8) != 0) {
            replaceFileCorruptionHandler = null;
        }
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = replaceFileCorruptionHandler;
        if ((i & 16) != 0) {
            list = EmptyList.f47638a;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            v72 v72Var = ph2.f56212a;
            t62 t62Var = t62.f61909c;
            nn9 nn9VarM20384i = r46.m20384i();
            t62Var.getClass();
            un1Var = vz1.m23619a(eh0.m11113J(t62Var, nn9VarM20384i));
        }
        return dataStoreFactory.createInDeviceProtectedStorage(context, str, serializer, replaceFileCorruptionHandler2, list2, un1Var);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, un1 un1Var) {
        storage.getClass();
        list.getClass();
        un1Var.getClass();
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(storage, vz1.m23604J(DataMigrationInitializer.Companion.getInitializer(list)), replaceFileCorruptionHandler, un1Var);
    }

    public final <T> DataStore<T> createInDeviceProtectedStorage(Context context, String str, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, un1 un1Var) {
        context.getClass();
        str.getClass();
        serializer.getClass();
        list.getClass();
        un1Var.getClass();
        FileStorage fileStorage = new FileStorage(serializer, null, new l02(0, context, str), 2, null);
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(fileStorage, vz1.m23604J(DataMigrationInitializer.Companion.getInitializer(list)), replaceFileCorruptionHandler, un1Var);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, ui3 ui3Var) {
        serializer.getClass();
        ui3Var.getClass();
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, ui3Var, 12, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, ui3 ui3Var) {
        serializer.getClass();
        list.getClass();
        ui3Var.getClass();
        return create$default(this, serializer, replaceFileCorruptionHandler, list, null, ui3Var, 8, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage) {
        storage.getClass();
        return create$default(this, storage, null, null, null, 14, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        storage.getClass();
        return create$default(this, storage, replaceFileCorruptionHandler, null, null, 12, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list) {
        storage.getClass();
        list.getClass();
        return create$default(this, storage, replaceFileCorruptionHandler, list, null, 8, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, un1 un1Var, ui3 ui3Var) {
        serializer.getClass();
        list.getClass();
        un1Var.getClass();
        ui3Var.getClass();
        return create(new FileStorage(serializer, null, ui3Var, 2, null), replaceFileCorruptionHandler, list, un1Var);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ui3 ui3Var) {
        serializer.getClass();
        ui3Var.getClass();
        return create$default(this, serializer, null, null, null, ui3Var, 14, null);
    }

    public static DataStore create$default(DataStoreFactory dataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, un1 un1Var, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            list = EmptyList.f47638a;
        }
        if ((i & 8) != 0) {
            nn1 nn1VarIoDispatcher = Actual_jvmKt.ioDispatcher();
            nn9 nn9VarM20384i = r46.m20384i();
            nn1VarIoDispatcher.getClass();
            un1Var = vz1.m23619a(eh0.m11113J(nn1VarIoDispatcher, nn9VarM20384i));
        }
        return dataStoreFactory.create(storage, replaceFileCorruptionHandler, list, un1Var);
    }

    public final <T> DataStore<T> createInDeviceProtectedStorage(Context context, String str, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        context.getClass();
        str.getClass();
        serializer.getClass();
        return createInDeviceProtectedStorage$default(this, context, str, serializer, replaceFileCorruptionHandler, null, null, 48, null);
    }

    public final <T> DataStore<T> createInDeviceProtectedStorage(Context context, String str, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list) {
        context.getClass();
        str.getClass();
        serializer.getClass();
        list.getClass();
        return createInDeviceProtectedStorage$default(this, context, str, serializer, replaceFileCorruptionHandler, list, null, 32, null);
    }

    public final <T> DataStore<T> createInDeviceProtectedStorage(Context context, String str, Serializer<T> serializer) {
        context.getClass();
        str.getClass();
        serializer.getClass();
        return createInDeviceProtectedStorage$default(this, context, str, serializer, null, null, null, 56, null);
    }
}
