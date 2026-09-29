package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.C3248a;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c76;
import p000.lda;
import p000.ui3;
import p000.uk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public final class FileStorageConnection<T> implements StorageConnection<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final File file;
    private final ui3 onClose;
    private final Serializer<T> serializer;
    private final c76 transactionMutex;

    /* JADX INFO: renamed from: androidx.datastore.core.FileStorageConnection$readScope$1 */
    @c32(m4290c = "androidx.datastore.core.FileStorageConnection", m4291f = "FileStorage.kt", m4292l = {96}, m4293m = "readScope", m4294v = 1)
    public static final class C05071<R> extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05071(FileStorageConnection<T> fileStorageConnection, Continuation<? super C05071> continuation) {
            super(continuation);
            this.this$0 = fileStorageConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readScope(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.FileStorageConnection$writeScope$1 */
    @c32(m4290c = "androidx.datastore.core.FileStorageConnection", m4291f = "FileStorage.kt", m4292l = {238, 112}, m4293m = "writeScope", m4294v = 1)
    public static final class C05081 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05081(FileStorageConnection<T> fileStorageConnection, Continuation<? super C05081> continuation) {
            super(continuation);
            this.this$0 = fileStorageConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeScope(null, this);
        }
    }

    public FileStorageConnection(File file, Serializer<T> serializer, InterProcessCoordinator interProcessCoordinator, ui3 ui3Var) {
        file.getClass();
        serializer.getClass();
        interProcessCoordinator.getClass();
        ui3Var.getClass();
        this.file = file;
        this.serializer = serializer;
        this.coordinator = interProcessCoordinator;
        this.onClose = ui3Var;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.transactionMutex = new C3248a();
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            C3386nv.m17633t("StorageConnection has already been disposed.");
        }
    }

    private final void createParentDirectories(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            uk9.m22774h(file, "Unable to create parent directories of ");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
        this.onClose.mo0a();
    }

    @Override // androidx.datastore.core.StorageConnection
    public InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[Catch: all -> 0x0071, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0071, blocks: (B:31:0x0070, B:40:0x0080, B:39:0x007d, B:36:0x0078), top: B:48:0x0020, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [aj3] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.datastore.core.StorageConnection
    public <R> Object readScope(aj3 aj3Var, Continuation<? super R> continuation) throws Throwable {
        C05071 c05071;
        Throwable th;
        Closeable closeable;
        ?? r9;
        if (continuation instanceof C05071) {
            c05071 = (C05071) continuation;
            int i = c05071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05071.label = i - Integer.MIN_VALUE;
            } else {
                c05071 = new C05071(this, continuation);
            }
        } else {
            c05071 = new C05071(this, continuation);
        }
        Object obj = c05071.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c05071.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aj3Var = c05071.Z$0;
                closeable = (Closeable) c05071.L$0;
                try {
                    AbstractC3193b.m15359b(obj);
                    r9 = aj3Var;
                    try {
                        closeable.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
                        this.transactionMutex.mo4387b(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        closeable.close();
                    } catch (Throwable th4) {
                        lda.m16117c(th, th4);
                    }
                    throw th;
                }
            }
            AbstractC3193b.m15359b(obj);
            checkNotClosed();
            boolean zMo4386a = this.transactionMutex.mo4386a(null);
            try {
                FileReadScope fileReadScope = new FileReadScope(this.file, this.serializer);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zMo4386a);
                    c05071.L$0 = fileReadScope;
                    c05071.Z$0 = zMo4386a;
                    c05071.label = 1;
                    Object objInvoke = aj3Var.invoke(fileReadScope, boolValueOf, c05071);
                    if (objInvoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = objInvoke;
                    r9 = zMo4386a;
                    closeable = fileReadScope;
                    closeable.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
                        this.transactionMutex.mo4387b(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    aj3Var = zMo4386a;
                    closeable = fileReadScope;
                    closeable.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                aj3Var = zMo4386a;
                if (aj3Var != 0) {
                    this.transactionMutex.mo4387b(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a7 A[Catch: all -> 0x00d7, IOException -> 0x00da, TRY_ENTER, TryCatch #8 {IOException -> 0x00da, all -> 0x00d7, blocks: (B:33:0x00a7, B:35:0x00ad, B:38:0x00b6, B:39:0x00d6, B:46:0x00e4, B:53:0x00f1, B:52:0x00ee), top: B:63:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4 A[Catch: all -> 0x00d7, IOException -> 0x00da, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x00da, all -> 0x00d7, blocks: (B:33:0x00a7, B:35:0x00ad, B:38:0x00b6, B:39:0x00d6, B:46:0x00e4, B:53:0x00f1, B:52:0x00ee), top: B:63:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [c76] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File, java.lang.Object] */
    @Override // androidx.datastore.core.StorageConnection
    public Object writeScope(zi3 zi3Var, Continuation<? super xfa> continuation) throws Throwable {
        C05081 c05081;
        ?? file;
        c76 c76Var;
        FileWriteScope fileWriteScope;
        Closeable closeable;
        c76 c76Var2;
        ?? r2;
        if (continuation instanceof C05081) {
            c05081 = (C05081) continuation;
            int i = c05081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05081.label = i - Integer.MIN_VALUE;
            } else {
                c05081 = new C05081(this, continuation);
            }
        } else {
            c05081 = new C05081(this, continuation);
        }
        ?? r10 = c05081.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c05081.label;
        try {
            try {
                try {
                    try {
                        if (i2 == 0) {
                            AbstractC3193b.m15359b(r10);
                            checkNotClosed();
                            createParentDirectories(this.file);
                            c76Var = this.transactionMutex;
                            c05081.L$0 = zi3Var;
                            c05081.L$1 = c76Var;
                            c05081.label = 1;
                            if (c76Var.mo4388c(c05081) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            closeable = (Closeable) c05081.L$2;
                            File file2 = (File) c05081.L$1;
                            c76Var2 = (c76) c05081.L$0;
                            try {
                                AbstractC3193b.m15359b(r10);
                                r2 = file2;
                                try {
                                    closeable.close();
                                    th = null;
                                } catch (Throwable th) {
                                    th = th;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (r2.exists() && !FileMoves_androidKt.atomicMoveTo(r2, this.file)) {
                                    throw new IOException("Unable to rename " + r2 + " to " + this.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                                c76Var2.mo4387b(null);
                                return xfa.f68157a;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    closeable.close();
                                } catch (Throwable th3) {
                                    lda.m16117c(th, th3);
                                }
                                throw th;
                            }
                        }
                        c76 c76Var3 = (c76) c05081.L$1;
                        zi3 zi3Var2 = (zi3) c05081.L$0;
                        AbstractC3193b.m15359b(r10);
                        c76Var = c76Var3;
                        zi3Var = zi3Var2;
                        c05081.L$0 = c76Var;
                        c05081.L$1 = file;
                        c05081.L$2 = fileWriteScope;
                        c05081.label = 2;
                        if (zi3Var.invoke(fileWriteScope, c05081) != coroutineSingletons) {
                            c76Var2 = c76Var;
                            r2 = file;
                            closeable = fileWriteScope;
                            closeable.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (r2.exists()) {
                                throw new IOException("Unable to rename " + r2 + " to " + this.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                            }
                            c76Var2.mo4387b(null);
                            return xfa.f68157a;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th4) {
                        th = th4;
                        closeable = fileWriteScope;
                        closeable.close();
                        throw th;
                    }
                    fileWriteScope = new FileWriteScope(file, this.serializer);
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(this.file.getAbsolutePath() + ".tmp");
            } catch (Throwable th5) {
                th = th5;
                r10.mo4387b(null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            file = coroutineSingletons;
        } catch (Throwable th6) {
            th = th6;
            r10 = c05081;
            r10.mo4387b(null);
            throw th;
        }
    }
}
