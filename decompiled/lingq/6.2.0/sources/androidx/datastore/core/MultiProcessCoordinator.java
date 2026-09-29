package androidx.datastore.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.AbstractC3192a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.C3248a;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.b56;
import p000.c32;
import p000.c76;
import p000.c83;
import p000.cl9;
import p000.cs4;
import p000.eda;
import p000.kn1;
import p000.uk9;
import p000.un1;
import p000.vi3;
import p000.wfb;
import p000.xfa;
import p000.y52;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public final class MultiProcessCoordinator implements InterProcessCoordinator {
    public static final Companion Companion = new Companion(null);
    private static final String DEADLOCK_ERROR_MESSAGE = "Resource deadlock would occur";
    private static final long INITIAL_WAIT_MILLIS = 10;
    private static final long MAX_WAIT_MILLIS = 60000;
    private final String LOCK_ERROR_MESSAGE;
    private final String LOCK_SUFFIX;
    private final String VERSION_SUFFIX;
    private final kn1 context;
    private final File file;
    private final c76 inMemoryMutex;
    private final cs4 lazySharedCounter;
    private final cs4 lockFile$delegate;
    private final c83 updateNotifications;

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$lock$1 */
    @c32(m4290c = "androidx.datastore.core.MultiProcessCoordinator", m4291f = "MultiProcessCoordinator.android.kt", m4292l = {213, 47, eda.f37086g}, m4293m = "lock", m4294v = 1)
    public static final class C05131<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C05131(Continuation<? super C05131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.lock(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$tryLock$1 */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "androidx.datastore.core.MultiProcessCoordinator", m4291f = "MultiProcessCoordinator.android.kt", m4292l = {62, 92}, m4293m = "tryLock", m4294v = 1)
    public static final class C05141<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C05141(Continuation<? super C05141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.tryLock(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2 */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", m4291f = "MultiProcessCoordinator.android.kt", m4292l = {166}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05152 extends SuspendLambda implements zi3 {
        final /* synthetic */ zi3 $block;
        int label;
        final /* synthetic */ MultiProcessCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05152(zi3 zi3Var, MultiProcessCoordinator multiProcessCoordinator, Continuation<? super C05152> continuation) {
            super(2, continuation);
            this.$block = zi3Var;
            this.this$0 = multiProcessCoordinator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
            return new C05152(this.$block, this.this$0, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(un1 un1Var, Continuation<? super T> continuation) {
            return ((C05152) create(un1Var, continuation)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return obj;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            zi3 zi3Var = this.$block;
            SharedCounter sharedCounter = this.this$0.getSharedCounter();
            this.label = 1;
            Object objInvoke = zi3Var.invoke(sharedCounter, this);
            return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            return this.$block.invoke(this.this$0.getSharedCounter(), this);
        }
    }

    public MultiProcessCoordinator(kn1 kn1Var, File file) {
        kn1Var.getClass();
        file.getClass();
        this.context = kn1Var;
        this.file = file;
        this.updateNotifications = MulticastFileObserver.Companion.observe(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = new C3248a();
        this.lockFile$delegate = AbstractC3192a.m15356a(new b56(this, 0));
        this.lazySharedCounter = AbstractC3192a.m15356a(new b56(this, 1));
    }

    private final void createIfNotExists(File file) throws IOException {
        createParentDirectories(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
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

    private final File fileWithSuffix(String str) {
        return new File(this.file.getAbsolutePath() + str);
    }

    private final File getLockFile() {
        return (File) this.lockFile$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedCounter getSharedCounter() {
        return (SharedCounter) this.lazySharedCounter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedCounter lazySharedCounter$lambda$0(MultiProcessCoordinator multiProcessCoordinator) {
        return SharedCounter.Factory.create$datastore_core(new b56(multiProcessCoordinator, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File lazySharedCounter$lambda$0$0(MultiProcessCoordinator multiProcessCoordinator) throws IOException {
        File fileFileWithSuffix = multiProcessCoordinator.fileWithSuffix(multiProcessCoordinator.VERSION_SUFFIX);
        multiProcessCoordinator.createIfNotExists(fileFileWithSuffix);
        return fileFileWithSuffix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File lockFile_delegate$lambda$0(MultiProcessCoordinator multiProcessCoordinator) throws IOException {
        File fileFileWithSuffix = multiProcessCoordinator.fileWithSuffix(multiProcessCoordinator.LOCK_SUFFIX);
        multiProcessCoordinator.createIfNotExists(fileFileWithSuffix);
        return fileFileWithSuffix;
    }

    private final <T> Object withLazyCounter(zi3 zi3Var, Continuation<? super T> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return zi3Var.invoke(getSharedCounter(), continuation);
        }
        return wfb.m23905G(new C05152(zi3Var, this, null), this.context, continuation);
    }

    public final File getFile() {
        return this.file;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public c83 getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object getVersion(Continuation<? super Integer> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return new Integer(getSharedCounter().getValue());
        }
        return wfb.m23905G(new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), this.context, continuation);
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object incrementAndGetVersion(Continuation<? super Integer> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return new Integer(getSharedCounter().incrementAndGetValue());
        }
        return wfb.m23905G(new C0512xb55e9682(this, null), this.context, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1 A[Catch: all -> 0x00b5, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00b5, blocks: (B:41:0x00b1, B:55:0x00cf, B:56:0x00d2), top: B:70:0x0022, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00cf A[Catch: all -> 0x00b5, TRY_ENTER, TryCatch #3 {all -> 0x00b5, blocks: (B:41:0x00b1, B:55:0x00cf, B:56:0x00d2), top: B:70:0x0022, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [c76] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [c76] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [vi3] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19, types: [c76] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.Closeable, java.lang.Object, vi3] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public <T> Object lock(vi3 vi3Var, Continuation<? super T> continuation) throws Throwable {
        C05131 c05131;
        c76 c76Var;
        ?? r9;
        FileOutputStream fileOutputStream;
        Throwable th;
        ?? r10;
        ?? r8;
        ?? r2;
        java.io.Closeable closeable;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        ?? r0;
        ?? r11;
        if (continuation instanceof C05131) {
            c05131 = (C05131) continuation;
            int i = c05131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05131.label = i - Integer.MIN_VALUE;
            } else {
                c05131 = new C05131(continuation);
            }
        } else {
            c05131 = new C05131(continuation);
        }
        ?? r12 = c05131.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c05131.label;
        try {
            try {
                try {
                    if (i2 == 0) {
                        AbstractC3193b.m15359b(r12);
                        c76Var = this.inMemoryMutex;
                        c05131.L$0 = vi3Var;
                        c05131.L$1 = c76Var;
                        c05131.label = 1;
                        if (c76Var.mo4388c(c05131) != coroutineSingletons) {
                        }
                        r9 = vi3Var;
                        r12 = c76Var;
                        return coroutineSingletons;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileLock = (FileLock) c05131.L$2;
                            closeable = (java.io.Closeable) c05131.L$1;
                            c76 c76Var2 = (c76) c05131.L$0;
                            try {
                                AbstractC3193b.m15359b(r12);
                                r0 = c76Var2;
                                r11 = r12;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    AbstractC3584sr.m21646y(closeable, null);
                                    r0.mo4387b(null);
                                    return r11;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r12 = r0;
                                    r12.mo4387b(null);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        }
                        closeable = (java.io.Closeable) c05131.L$2;
                        r8 = (c76) c05131.L$1;
                        vi3 vi3Var2 = (vi3) c05131.L$0;
                        try {
                            AbstractC3193b.m15359b(r12);
                            r2 = vi3Var2;
                            r8 = r8;
                            r10 = r12;
                            fileLock2 = (FileLock) r10;
                            try {
                                c05131.L$0 = r8;
                                c05131.L$1 = closeable;
                                c05131.L$2 = fileLock2;
                                c05131.label = 3;
                                objInvoke = r2.invoke(c05131);
                                if (objInvoke != coroutineSingletons) {
                                    r0 = r8;
                                    fileLock = fileLock2;
                                    r11 = objInvoke;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    AbstractC3584sr.m21646y(closeable, null);
                                    r0.mo4387b(null);
                                    return r11;
                                }
                                r9 = vi3Var;
                                r12 = c76Var;
                                return coroutineSingletons;
                            } catch (Throwable th4) {
                                fileLock = fileLock2;
                                th = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    c76 c76Var3 = (c76) c05131.L$1;
                    vi3 vi3Var3 = (vi3) c05131.L$0;
                    AbstractC3193b.m15359b(r12);
                    r12 = c76Var3;
                    r9 = vi3Var3;
                    Companion companion = Companion;
                    c05131.L$0 = r9;
                    c05131.L$1 = r12;
                    c05131.L$2 = fileOutputStream;
                    c05131.label = 2;
                    Object exclusiveFileLockWithRetryIfDeadlock = companion.getExclusiveFileLockWithRetryIfDeadlock(fileOutputStream, c05131);
                    if (exclusiveFileLockWithRetryIfDeadlock != coroutineSingletons) {
                        ?? r7 = r12;
                        r10 = exclusiveFileLockWithRetryIfDeadlock;
                        r8 = r7;
                        r2 = r9;
                        closeable = fileOutputStream;
                        fileLock2 = (FileLock) r10;
                        c05131.L$0 = r8;
                        c05131.L$1 = closeable;
                        c05131.L$2 = fileLock2;
                        c05131.label = 3;
                        objInvoke = r2.invoke(c05131);
                        if (objInvoke != coroutineSingletons) {
                            r0 = r8;
                            fileLock = fileLock2;
                            r11 = objInvoke;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            AbstractC3584sr.m21646y(closeable, null);
                            r0.mo4387b(null);
                            return r11;
                        }
                    }
                    r9 = vi3Var;
                    r12 = c76Var;
                    return coroutineSingletons;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                r9 = vi3Var;
                r12 = c76Var;
                fileOutputStream = new FileOutputStream(getLockFile());
            } catch (Throwable th7) {
                th = th7;
                r12.mo4387b(null);
                throw th;
            }
        } catch (Throwable th8) {
            r12 = c05131;
            try {
                throw th8;
            } catch (Throwable th9) {
                AbstractC3584sr.m21646y(vi3Var, th8);
                throw th9;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e0 A[Catch: all -> 0x00e4, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00e4, blocks: (B:61:0x00e0, B:75:0x00fb, B:76:0x00fe), top: B:96:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb A[Catch: all -> 0x00e4, TRY_ENTER, TryCatch #5 {all -> 0x00e4, blocks: (B:61:0x00e0, B:75:0x00fb, B:76:0x00fe), top: B:96:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [zi3] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v10, types: [c76] */
    /* JADX WARN: Type inference failed for: r2v14, types: [c76] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [c76] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.MultiProcessCoordinator$tryLock$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [c76] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.Closeable, java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public <T> Object tryLock(zi3 zi3Var, Continuation<? super T> continuation) throws Throwable {
        ?? c05141;
        ?? r1;
        ?? r2;
        FileLock fileLock;
        String message;
        FileLock fileLockTryLock;
        java.io.Closeable closeable;
        ?? r3;
        ?? r4;
        if (continuation instanceof C05141) {
            C05141 c05142 = (C05141) continuation;
            int i = c05142.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05142.label = i - Integer.MIN_VALUE;
                c05141 = c05142;
            } else {
                c05141 = new C05141(continuation);
            }
        } else {
            c05141 = new C05141(continuation);
        }
        Object objInvoke = c05141.result;
        ?? r5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c05141.label;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objInvoke);
                c76 c76Var = this.inMemoryMutex;
                boolean zMo4386a = c76Var.mo4386a(null);
                try {
                    if (zMo4386a) {
                        FileInputStream fileInputStream = new FileInputStream(getLockFile());
                        try {
                            try {
                                fileLockTryLock = fileInputStream.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (IOException e) {
                                String message2 = e.getMessage();
                                if ((message2 == null || !cl9.m4842Y(message2, this.LOCK_ERROR_MESSAGE, false)) && ((message = e.getMessage()) == null || !cl9.m4842Y(message, DEADLOCK_ERROR_MESSAGE, false))) {
                                    throw e;
                                }
                                fileLockTryLock = null;
                            }
                            try {
                                Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                                c05141.L$0 = c76Var;
                                c05141.L$1 = fileInputStream;
                                c05141.L$2 = fileLockTryLock;
                                c05141.Z$0 = zMo4386a;
                                c05141.label = 2;
                                objInvoke = zi3Var.invoke(boolValueOf, c05141);
                                if (objInvoke != r5) {
                                    fileLock = fileLockTryLock;
                                    c05141 = c76Var;
                                    r1 = zMo4386a;
                                    closeable = fileInputStream;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    AbstractC3584sr.m21646y(closeable, null);
                                    if (r1 != 0) {
                                        c05141.mo4387b(null);
                                    }
                                    return objInvoke;
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        c05141.L$0 = c76Var;
                        c05141.Z$0 = zMo4386a;
                        c05141.label = 1;
                        objInvoke = zi3Var.invoke(bool, c05141);
                        if (objInvoke != r5) {
                            r3 = c76Var;
                            r4 = zMo4386a;
                            if (r4 != 0) {
                                r3.mo4387b(null);
                            }
                            return objInvoke;
                        }
                    }
                    return r5;
                } catch (Throwable th3) {
                    th = th3;
                    r2 = c76Var;
                    r1 = zMo4386a;
                }
            } else if (i2 == 1) {
                r1 = c05141.Z$0;
                r2 = (c76) c05141.L$0;
                try {
                    AbstractC3193b.m15359b(objInvoke);
                    r4 = r1;
                    r3 = r2;
                    if (r4 != 0) {
                        r3.mo4387b(null);
                    }
                    return objInvoke;
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z = c05141.Z$0;
                fileLock = (FileLock) c05141.L$2;
                closeable = (java.io.Closeable) c05141.L$1;
                c76 c76Var2 = (c76) c05141.L$0;
                try {
                    AbstractC3193b.m15359b(objInvoke);
                    r1 = z;
                    c05141 = c76Var2;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    try {
                        AbstractC3584sr.m21646y(closeable, null);
                        if (r1 != 0) {
                            c05141.mo4387b(null);
                        }
                        return objInvoke;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                try {
                    AbstractC3584sr.m21646y(r5, th7);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    r1 = this;
                }
            }
        }
        r2 = c05141;
        if (r1 != 0) {
            r2.mo4387b(null);
        }
        throw th;
    }

    public static final class Companion {
        public /* synthetic */ Companion(y52 y52Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|18) */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        
            r1 = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        
            if (r1 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        
            r11.L$0 = r12;
            r11.J$0 = r3;
            r11.label = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
        
            if (kotlinx.coroutines.AbstractC3208a.m15437d(r3, r11) == r13) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
        
            return r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
        
            throw r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:27:0x0078). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getExclusiveFileLockWithRetryIfDeadlock(FileOutputStream fileOutputStream, Continuation<? super FileLock> continuation) throws Throwable {
            C0511xe413854a c0511xe413854a;
            long j;
            C0511xe413854a c0511xe413854a2;
            if (continuation instanceof C0511xe413854a) {
                c0511xe413854a = (C0511xe413854a) continuation;
                int i = c0511xe413854a.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0511xe413854a.label = i - Integer.MIN_VALUE;
                } else {
                    c0511xe413854a = new C0511xe413854a(this, continuation);
                }
            } else {
                c0511xe413854a = new C0511xe413854a(this, continuation);
            }
            Object obj = c0511xe413854a.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = c0511xe413854a.label;
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                j = MultiProcessCoordinator.INITIAL_WAIT_MILLIS;
                c0511xe413854a2 = c0511xe413854a;
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = c0511xe413854a.J$0;
                fileOutputStream = (FileOutputStream) c0511xe413854a.L$0;
                AbstractC3193b.m15359b(obj);
                c0511xe413854a2 = c0511xe413854a;
                j *= 2;
            }
            if (j <= MultiProcessCoordinator.MAX_WAIT_MILLIS) {
                FileLock fileLockLock = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                fileLockLock.getClass();
                return fileLockLock;
            }
            FileLock fileLockLock2 = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
            fileLockLock2.getClass();
            return fileLockLock2;
        }

        private Companion() {
        }
    }
}
