package androidx.datastore.core;

import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.util.List;
import kotlin.collections.EmptyList;
import p000.eh0;
import p000.kv4;
import p000.nn9;
import p000.ph2;
import p000.r46;
import p000.t62;
import p000.ui3;
import p000.un1;
import p000.v72;
import p000.vz1;

/* JADX INFO: loaded from: classes.dex */
public final class MultiProcessDataStoreFactory {
    public static final MultiProcessDataStoreFactory INSTANCE = new MultiProcessDataStoreFactory();

    private MultiProcessDataStoreFactory() {
    }

    public static DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, un1 un1Var, ui3 ui3Var, int i, Object obj) {
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
        return multiProcessDataStoreFactory.create(serializer, replaceFileCorruptionHandler2, list2, un1Var, ui3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterProcessCoordinator create$lambda$0(un1 un1Var, File file) {
        file.getClass();
        return new MultiProcessCoordinator(un1Var.mo1309x(), file);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, un1 un1Var, ui3 ui3Var) {
        serializer.getClass();
        list.getClass();
        un1Var.getClass();
        ui3Var.getClass();
        FileStorage fileStorage = new FileStorage(serializer, new kv4(un1Var, 9), ui3Var);
        List listM23604J = vz1.m23604J(DataMigrationInitializer.Companion.getInitializer(list));
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(fileStorage, listM23604J, replaceFileCorruptionHandler, un1Var);
    }

    public static DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, un1 un1Var, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            list = EmptyList.f47638a;
        }
        if ((i & 8) != 0) {
            v72 v72Var = ph2.f56212a;
            t62 t62Var = t62.f61909c;
            nn9 nn9VarM20384i = r46.m20384i();
            t62Var.getClass();
            un1Var = vz1.m23619a(eh0.m11113J(t62Var, nn9VarM20384i));
        }
        return multiProcessDataStoreFactory.create(storage, replaceFileCorruptionHandler, list, un1Var);
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

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, un1 un1Var) {
        storage.getClass();
        list.getClass();
        un1Var.getClass();
        List listM23604J = vz1.m23604J(DataMigrationInitializer.Companion.getInitializer(list));
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(storage, listM23604J, replaceFileCorruptionHandler, un1Var);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ui3 ui3Var) {
        serializer.getClass();
        ui3Var.getClass();
        return create$default(this, serializer, null, null, null, ui3Var, 14, null);
    }
}
