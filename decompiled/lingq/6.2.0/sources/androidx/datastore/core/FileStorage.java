package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import p000.C2951e4;
import p000.C3757xf;
import p000.ui3;
import p000.vi3;
import p000.xfa;
import p000.y52;

/* JADX INFO: loaded from: classes.dex */
public final class FileStorage<T> implements Storage<T> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final vi3 coordinatorProducer;
    private final ui3 produceFile;
    private final Serializer<T> serializer;

    public FileStorage(Serializer<T> serializer, vi3 vi3Var, ui3 ui3Var) {
        serializer.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        this.serializer = serializer;
        this.coordinatorProducer = vi3Var;
        this.produceFile = ui3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterProcessCoordinator _init_$lambda$0(File file) {
        file.getClass();
        return InterProcessCoordinator_jvmKt.createSingleProcessCoordinator(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xfa createConnection$lambda$1(File file) {
        synchronized (activeFilesLock) {
            activeFiles.remove(file.getAbsolutePath());
        }
        return xfa.f68157a;
    }

    @Override // androidx.datastore.core.Storage
    public StorageConnection<T> createConnection() throws IOException {
        File canonicalFile = ((File) this.produceFile.mo0a()).getCanonicalFile();
        synchronized (activeFilesLock) {
            String absolutePath = canonicalFile.getAbsolutePath();
            Set<String> set = activeFiles;
            if (set.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            absolutePath.getClass();
            set.add(absolutePath);
        }
        return new FileStorageConnection(canonicalFile, this.serializer, (InterProcessCoordinator) this.coordinatorProducer.invoke(canonicalFile), new C3757xf(canonicalFile, 11));
    }

    public static final class Companion {
        public /* synthetic */ Companion(y52 y52Var) {
            this();
        }

        public final Set<String> getActiveFiles$datastore_core() {
            return FileStorage.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core() {
            return FileStorage.activeFilesLock;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FileStorage(Serializer serializer, vi3 vi3Var, ui3 ui3Var, int i, y52 y52Var) {
        this(serializer, (i & 2) != 0 ? new C2951e4(22) : vi3Var, ui3Var);
    }
}
