package androidx.datastore.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
public class FileReadScope<T> implements ReadScope<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final File file;
    private final Serializer<T> serializer;

    /* JADX INFO: renamed from: androidx.datastore.core.FileReadScope$readData$2 */
    @c32(m4290c = "androidx.datastore.core.FileReadScope$readData$2", m4291f = "FileStorage.kt", m4292l = {162, 170}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05062 extends SuspendLambda implements vi3 {
        Object L$0;
        int label;
        final /* synthetic */ FileReadScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05062(FileReadScope<T> fileReadScope, Continuation<? super C05062> continuation) {
            super(1, continuation);
            this.this$0 = fileReadScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Continuation<?> continuation) {
            return new C05062(this.this$0, continuation);
        }

        @Override // p000.vi3
        public final Object invoke(Continuation<? super T> continuation) {
            return ((C05062) create(continuation)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        
            if (r7 == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            java.io.Closeable closeable;
            Throwable th;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ?? r1 = this.label;
            try {
                try {
                    try {
                        if (r1 == 0) {
                            AbstractC3193b.m15359b(obj);
                            FileInputStream fileInputStream = new FileInputStream(this.this$0.getFile());
                            Serializer<T> serializer = this.this$0.getSerializer();
                            this.L$0 = fileInputStream;
                            this.label = 1;
                            obj = serializer.readFrom(fileInputStream, this);
                            r1 = fileInputStream;
                        } else {
                            if (r1 != 1) {
                                if (r1 != 2) {
                                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                closeable = (java.io.Closeable) this.L$0;
                                try {
                                    AbstractC3193b.m15359b(obj);
                                    AbstractC3584sr.m21646y(closeable, null);
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        AbstractC3584sr.m21646y(closeable, th);
                                        throw th3;
                                    }
                                }
                            }
                            java.io.Closeable closeable2 = (java.io.Closeable) this.L$0;
                            AbstractC3193b.m15359b(obj);
                            r1 = closeable2;
                        }
                        AbstractC3584sr.m21646y(r1, null);
                        return obj;
                    } catch (Exception e) {
                        if (e instanceof FileNotFoundException) {
                            throw DirectBootExceptionUtilKt.wrapExceptionIfDueToDirectBoot(this.this$0.getFile().getParent(), e);
                        }
                        throw e;
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        AbstractC3584sr.m21646y(r1, th4);
                        throw th5;
                    }
                }
            } catch (FileNotFoundException unused) {
                if (!this.this$0.getFile().exists()) {
                    return this.this$0.getSerializer().getDefaultValue();
                }
                FileInputStream fileInputStream2 = new FileInputStream(this.this$0.getFile());
                try {
                    Serializer<T> serializer2 = this.this$0.getSerializer();
                    this.L$0 = fileInputStream2;
                    this.label = 2;
                    Object from = serializer2.readFrom(fileInputStream2, this);
                    if (from != coroutineSingletons) {
                        closeable = fileInputStream2;
                        obj = from;
                    }
                    return coroutineSingletons;
                } catch (Throwable th6) {
                    closeable = fileInputStream2;
                    th = th6;
                    throw th;
                }
            }
        }
    }

    public FileReadScope(File file, Serializer<T> serializer) {
        file.getClass();
        serializer.getClass();
        this.file = file;
        this.serializer = serializer;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static /* synthetic */ <T> Object readData$suspendImpl(FileReadScope<T> fileReadScope, Continuation<? super T> continuation) {
        fileReadScope.checkNotClosed();
        return FileStorageKt.runFileDiagnosticsIfNotCorruption(((FileReadScope) fileReadScope).file, new C05062(fileReadScope, null), continuation);
    }

    public final void checkNotClosed() {
        if (this.closed.get()) {
            C3386nv.m17633t("This scope has already been closed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    public final File getFile() {
        return this.file;
    }

    public final Serializer<T> getSerializer() {
        return this.serializer;
    }

    @Override // androidx.datastore.core.ReadScope
    public Object readData(Continuation<? super T> continuation) {
        return readData$suspendImpl(this, continuation);
    }
}
