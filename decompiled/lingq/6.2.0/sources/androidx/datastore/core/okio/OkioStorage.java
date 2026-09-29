package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.Storage;
import androidx.datastore.core.StorageConnection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.AbstractC3192a;
import p000.AbstractC2909d;
import p000.cs4;
import p000.d57;
import p000.er6;
import p000.gz8;
import p000.ij6;
import p000.u33;
import p000.ui3;
import p000.xfa;
import p000.y52;
import p000.yu4;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
public final class OkioStorage<T> implements Storage<T> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Synchronizer activeFilesLock = new Synchronizer();
    private final cs4 canonicalPath$delegate;
    private final zi3 coordinatorProducer;
    private final u33 fileSystem;
    private final ui3 producePath;
    private final OkioSerializer<T> serializer;

    public OkioStorage(u33 u33Var, OkioSerializer<T> okioSerializer, zi3 zi3Var, ui3 ui3Var) {
        u33Var.getClass();
        okioSerializer.getClass();
        zi3Var.getClass();
        ui3Var.getClass();
        this.fileSystem = u33Var;
        this.serializer = okioSerializer;
        this.coordinatorProducer = zi3Var;
        this.producePath = ui3Var;
        this.canonicalPath$delegate = AbstractC3192a.m15356a(new er6(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterProcessCoordinator _init_$lambda$0(d57 d57Var, u33 u33Var) {
        d57Var.getClass();
        u33Var.getClass();
        return OkioStorageKt.createSingleProcessCoordinator(d57Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d57 canonicalPath_delegate$lambda$0(OkioStorage okioStorage) {
        d57 d57Var = (d57) okioStorage.producePath.mo0a();
        d57Var.getClass();
        if (AbstractC2909d.m9949a(d57Var) != -1) {
            return gz8.m12976h(d57Var.f35014a.m18089r(), true);
        }
        ij6.m13955m("OkioStorage requires absolute paths, but did not get an absolute path from producePath = ", okioStorage.producePath, ", instead got ", d57Var);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xfa createConnection$lambda$1(OkioStorage okioStorage) {
        synchronized (activeFilesLock) {
            activeFiles.remove(okioStorage.getCanonicalPath().f35014a.m18089r());
        }
        return xfa.f68157a;
    }

    private final d57 getCanonicalPath() {
        return (d57) this.canonicalPath$delegate.getValue();
    }

    @Override // androidx.datastore.core.Storage
    public StorageConnection<T> createConnection() {
        String strM18089r = getCanonicalPath().f35014a.m18089r();
        synchronized (activeFilesLock) {
            Set<String> set = activeFiles;
            if (set.contains(strM18089r)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + strM18089r + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(strM18089r);
        }
        return new OkioStorageConnection(this.fileSystem, getCanonicalPath(), this.serializer, (InterProcessCoordinator) this.coordinatorProducer.invoke(getCanonicalPath(), this.fileSystem), new er6(this, 0));
    }

    public static final class Companion {
        public /* synthetic */ Companion(y52 y52Var) {
            this();
        }

        public final Set<String> getActiveFiles$datastore_core_okio() {
            return OkioStorage.activeFiles;
        }

        public final Synchronizer getActiveFilesLock() {
            return OkioStorage.activeFilesLock;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OkioStorage(u33 u33Var, OkioSerializer okioSerializer, zi3 zi3Var, ui3 ui3Var, int i, y52 y52Var) {
        this(u33Var, okioSerializer, (i & 4) != 0 ? new yu4(18) : zi3Var, ui3Var);
    }
}
