package androidx.datastore.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
public final class FileWriteScope<T> extends FileReadScope<T> implements WriteScope<T> {

    /* JADX INFO: renamed from: androidx.datastore.core.FileWriteScope$writeData$2 */
    @c32(m4290c = "androidx.datastore.core.FileWriteScope$writeData$2", m4291f = "FileStorage.kt", m4292l = {206}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05102 extends SuspendLambda implements vi3 {
        final /* synthetic */ T $value;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ FileWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05102(FileWriteScope<T> fileWriteScope, T t, Continuation<? super C05102> continuation) {
            super(1, continuation);
            this.this$0 = fileWriteScope;
            this.$value = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Continuation<?> continuation) {
            return new C05102(this.this$0, this.$value, continuation);
        }

        @Override // p000.vi3
        public final Object invoke(Continuation<? super xfa> continuation) {
            return ((C05102) create(continuation)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            java.io.Closeable closeable;
            Throwable th;
            FileOutputStream fileOutputStream;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(this.this$0.getFile());
                    FileWriteScope<T> fileWriteScope = this.this$0;
                    T t = this.$value;
                    try {
                        Serializer<T> serializer = fileWriteScope.getSerializer();
                        UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream2);
                        this.L$0 = fileOutputStream2;
                        this.L$1 = fileOutputStream2;
                        this.label = 1;
                        if (serializer.writeTo(t, uncloseableOutputStream, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        fileOutputStream = fileOutputStream2;
                        closeable = fileOutputStream;
                    } catch (Throwable th2) {
                        closeable = fileOutputStream2;
                        th = th2;
                        throw th;
                    }
                } catch (Exception e) {
                    if (e instanceof FileNotFoundException) {
                        throw DirectBootExceptionUtilKt.wrapExceptionIfDueToDirectBoot(this.this$0.getFile().getParent(), e);
                    }
                    throw e;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fileOutputStream = (FileOutputStream) this.L$1;
                closeable = (java.io.Closeable) this.L$0;
                try {
                    AbstractC3193b.m15359b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        AbstractC3584sr.m21646y(closeable, th);
                        throw th4;
                    }
                }
            }
            fileOutputStream.getFD().sync();
            AbstractC3584sr.m21646y(closeable, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope(File file, Serializer<T> serializer) {
        super(file, serializer);
        file.getClass();
        serializer.getClass();
    }

    @Override // androidx.datastore.core.WriteScope
    public Object writeData(T t, Continuation<? super xfa> continuation) throws Throwable {
        checkNotClosed();
        Object objRunFileDiagnosticsIfNotCorruption = FileStorageKt.runFileDiagnosticsIfNotCorruption(getFile(), new C05102(this, t, null), continuation);
        return objRunFileDiagnosticsIfNotCorruption == CoroutineSingletons.COROUTINE_SUSPENDED ? objRunFileDiagnosticsIfNotCorruption : xfa.f68157a;
    }
}
