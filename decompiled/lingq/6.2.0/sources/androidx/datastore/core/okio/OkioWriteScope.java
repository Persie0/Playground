package androidx.datastore.core.okio;

import androidx.datastore.core.DirectBootExceptionUtilKt;
import androidx.datastore.core.WriteScope;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.c32;
import p000.d18;
import p000.d57;
import p000.lda;
import p000.qg4;
import p000.u33;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioWriteScope$writeData$1 */
    @c32(m4290c = "androidx.datastore.core.okio.OkioWriteScope", m4291f = "OkioStorage.kt", m4292l = {214}, m4293m = "writeData", m4294v = 1)
    public static final class C05281 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05281(OkioWriteScope<T> okioWriteScope, Continuation<? super C05281> continuation) {
            super(continuation);
            this.this$0 = okioWriteScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(u33 u33Var, d57 d57Var, OkioSerializer<T> okioSerializer) {
        super(u33Var, d57Var, okioSerializer);
        u33Var.getClass();
        d57Var.getClass();
        okioSerializer.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:79:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [qg4] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, qg4] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.Closeable] */
    @Override // androidx.datastore.core.WriteScope
    public Object writeData(T t, Continuation<? super xfa> continuation) throws Exception {
        C05281 c05281;
        ?? Mo259A;
        ?? r0;
        Throwable th;
        Closeable closeable;
        ?? r1;
        Throwable th2;
        if (continuation instanceof C05281) {
            c05281 = (C05281) continuation;
            int i = c05281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05281.label = i - Integer.MIN_VALUE;
            } else {
                c05281 = new C05281(this, continuation);
            }
        } else {
            c05281 = new C05281(this, continuation);
        }
        Object obj = c05281.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c05281.label;
        Throwable th3 = null;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            checkClose();
            try {
                u33 fileSystem = getFileSystem();
                d57 path = getPath();
                fileSystem.getClass();
                path.getClass();
                Mo259A = fileSystem.mo259A(path);
                try {
                    d18 d18Var = new d18(qg4.m19947a(Mo259A));
                    try {
                        OkioSerializer<T> serializer = getSerializer();
                        c05281.L$0 = Mo259A;
                        c05281.L$1 = Mo259A;
                        c05281.L$2 = d18Var;
                        c05281.label = 1;
                        if (serializer.writeTo(t, d18Var, c05281) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ?? r2 = Mo259A;
                        r1 = r2;
                        closeable = d18Var;
                        r0 = r2;
                    } catch (Throwable th4) {
                        r0 = Mo259A;
                        th = th4;
                        closeable = d18Var;
                        if (closeable != null) {
                            closeable.close();
                        }
                        th2 = th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (Mo259A != 0) {
                        Mo259A.close();
                    }
                    th3 = th;
                }
            } catch (Exception e) {
                if (e instanceof FileNotFoundException) {
                    throw DirectBootExceptionUtilKt.wrapExceptionIfDueToDirectBoot(String.valueOf(getPath().m10105c()), e);
                }
                throw e;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            closeable = (Closeable) c05281.L$2;
            qg4 qg4Var = (qg4) c05281.L$1;
            r0 = (Closeable) c05281.L$0;
            try {
                AbstractC3193b.m15359b(obj);
                r0 = r0;
                r1 = qg4Var;
            } catch (Throwable th6) {
                th = th6;
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th7) {
                        try {
                            lda.m16117c(th, th7);
                        } catch (Throwable th8) {
                            th = th8;
                            Mo259A = r0;
                            if (Mo259A != 0) {
                                try {
                                    Mo259A.close();
                                } catch (Throwable th9) {
                                    lda.m16117c(th, th9);
                                }
                            }
                            th3 = th;
                        }
                    }
                }
                th2 = th;
            }
        }
        r1.flush();
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th10) {
                th2 = th10;
            }
        }
        th2 = null;
        Mo259A = r0;
        if (th2 != null) {
            throw th2;
        }
        if (Mo259A != 0) {
            try {
                Mo259A.close();
            } catch (Throwable th11) {
                th3 = th11;
            }
        }
        if (th3 == null) {
            return xfa.f68157a;
        }
        throw th3;
    }
}
