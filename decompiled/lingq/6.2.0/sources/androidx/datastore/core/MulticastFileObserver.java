package androidx.datastore.core;

import android.os.FileObserver;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.c83;
import p000.ci2;
import p000.vi3;
import p000.wq3;
import p000.y52;

/* JADX INFO: loaded from: classes.dex */
public final class MulticastFileObserver extends FileObserver {
    public static final Companion Companion = new Companion(null);
    private static final Object LOCK = new Object();
    private static final Map<String, MulticastFileObserver> fileObservers = new LinkedHashMap();
    private final CopyOnWriteArrayList<vi3> delegates;
    private final String path;

    private MulticastFileObserver(String str) {
        super(str, 128);
        this.path = str;
        this.delegates = new CopyOnWriteArrayList<>();
    }

    public final String getPath() {
        return this.path;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        Iterator<T> it = this.delegates.iterator();
        while (it.hasNext()) {
            ((vi3) it.next()).invoke(str);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(y52 y52Var) {
            this();
        }

        public static /* synthetic */ void getFileObservers$datastore_core$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ci2 observe(File file, vi3 vi3Var) {
            int i;
            String path = file.getCanonicalFile().getPath();
            synchronized (MulticastFileObserver.LOCK) {
                try {
                    Map<String, MulticastFileObserver> fileObservers$datastore_core = MulticastFileObserver.Companion.getFileObservers$datastore_core();
                    MulticastFileObserver multicastFileObserver = fileObservers$datastore_core.get(path);
                    if (multicastFileObserver == null) {
                        path.getClass();
                        multicastFileObserver = new MulticastFileObserver(path, null);
                        fileObservers$datastore_core.put(path, multicastFileObserver);
                    }
                    MulticastFileObserver multicastFileObserver2 = multicastFileObserver;
                    multicastFileObserver2.delegates.add(vi3Var);
                    i = 1;
                    if (multicastFileObserver2.delegates.size() == 1) {
                        multicastFileObserver2.startWatching();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new wq3(i, path, vi3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void observe$lambda$1(String str, vi3 vi3Var) {
            synchronized (MulticastFileObserver.LOCK) {
                Companion companion = MulticastFileObserver.Companion;
                MulticastFileObserver multicastFileObserver = companion.getFileObservers$datastore_core().get(str);
                if (multicastFileObserver != null) {
                    multicastFileObserver.delegates.remove(vi3Var);
                    if (multicastFileObserver.delegates.isEmpty()) {
                        companion.getFileObservers$datastore_core().remove(str);
                        multicastFileObserver.stopWatching();
                    }
                }
            }
        }

        public final Map<String, MulticastFileObserver> getFileObservers$datastore_core() {
            return MulticastFileObserver.fileObservers;
        }

        public final void removeAllObservers$datastore_core() {
            synchronized (MulticastFileObserver.LOCK) {
                try {
                    Iterator<T> it = MulticastFileObserver.Companion.getFileObservers$datastore_core().values().iterator();
                    while (it.hasNext()) {
                        ((MulticastFileObserver) it.next()).stopWatching();
                    }
                    MulticastFileObserver.Companion.getFileObservers$datastore_core().clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private Companion() {
        }

        public final c83 observe(File file) {
            file.getClass();
            return AbstractC3224d.m15528g(new MulticastFileObserver$Companion$observe$1(file, null));
        }
    }

    public /* synthetic */ MulticastFileObserver(String str, y52 y52Var) {
        this(str);
    }
}
