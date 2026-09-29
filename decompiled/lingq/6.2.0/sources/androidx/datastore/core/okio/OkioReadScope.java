package androidx.datastore.core.okio;

import androidx.datastore.core.DirectBootExceptionUtilKt;
import androidx.datastore.core.ReadScope;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.c32;
import p000.d57;
import p000.e18;
import p000.lda;
import p000.r46;
import p000.u33;

/* JADX INFO: loaded from: classes2.dex */
public class OkioReadScope<T> implements ReadScope<T> {
    private final AtomicBoolean closed;
    private final u33 fileSystem;
    private final d57 path;
    private final OkioSerializer<T> serializer;

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioReadScope$readData$1 */
    @c32(m4290c = "androidx.datastore.core.okio.OkioReadScope", m4291f = "OkioStorage.kt", m4292l = {170, 177}, m4293m = "readData$suspendImpl", m4294v = 1)
    public static final class C05251<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioReadScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05251(OkioReadScope<T> okioReadScope, Continuation<? super C05251> continuation) {
            super(continuation);
            this.this$0 = okioReadScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkioReadScope.readData$suspendImpl(this.this$0, this);
        }
    }

    public OkioReadScope(u33 u33Var, d57 d57Var, OkioSerializer<T> okioSerializer) {
        u33Var.getClass();
        d57Var.getClass();
        okioSerializer.getClass();
        this.fileSystem = u33Var;
        this.path = d57Var;
        this.serializer = okioSerializer;
        this.closed = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de A[Catch: Exception -> 0x00df, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00df, blocks: (B:73:0x00de, B:50:0x009d), top: B:83:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:83:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Throwable] */
    public static <T> Object readData$suspendImpl(OkioReadScope<T> okioReadScope, Continuation<? super T> continuation) throws Exception {
        C05251 c05251;
        OkioReadScope<T> okioReadScope2;
        Closeable closeable;
        Throwable th;
        Throwable th2;
        e18 e18VarM20390p;
        OkioReadScope<T> okioReadScope3;
        Closeable closeable2;
        ?? th3;
        Object from;
        if (continuation instanceof C05251) {
            c05251 = (C05251) continuation;
            int i = c05251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05251.label = i - Integer.MIN_VALUE;
            } else {
                c05251 = new C05251(okioReadScope, continuation);
            }
        } else {
            c05251 = new C05251(okioReadScope, continuation);
        }
        Object obj = c05251.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c05251.label;
        Object th4 = null;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            okioReadScope.checkClose();
            try {
                e18 e18VarM20390p2 = r46.m20390p(((OkioReadScope) okioReadScope).fileSystem.mo261N(((OkioReadScope) okioReadScope).path));
                try {
                    OkioSerializer<T> okioSerializer = ((OkioReadScope) okioReadScope).serializer;
                    c05251.L$0 = okioReadScope;
                    c05251.L$1 = e18VarM20390p2;
                    c05251.label = 1;
                    Object from2 = okioSerializer.readFrom(e18VarM20390p2, c05251);
                    if (from2 != coroutineSingletons) {
                        okioReadScope2 = okioReadScope;
                        closeable = e18VarM20390p2;
                        obj = from2;
                        if (closeable != null) {
                            closeable.close();
                        }
                        th2 = null;
                    }
                    return coroutineSingletons;
                } catch (Throwable th5) {
                    okioReadScope2 = okioReadScope;
                    closeable = e18VarM20390p2;
                    th = th5;
                    if (closeable != null) {
                        closeable.close();
                    }
                    th2 = th;
                    obj = null;
                }
            } catch (FileNotFoundException unused) {
                if (((OkioReadScope) okioReadScope).fileSystem.m22434q(((OkioReadScope) okioReadScope).path)) {
                    return ((OkioReadScope) okioReadScope).serializer.getDefaultValue();
                }
                e18VarM20390p = r46.m20390p(((OkioReadScope) okioReadScope).fileSystem.mo261N(((OkioReadScope) okioReadScope).path));
                OkioSerializer<T> okioSerializer2 = ((OkioReadScope) okioReadScope).serializer;
                c05251.L$0 = okioReadScope;
                c05251.L$1 = e18VarM20390p;
                c05251.label = 2;
                from = okioSerializer2.readFrom(e18VarM20390p, c05251);
                if (from != coroutineSingletons) {
                    okioReadScope3 = okioReadScope;
                    closeable2 = e18VarM20390p;
                    obj = from;
                    if (closeable2 != null) {
                        closeable2.close();
                    }
                    Object obj2 = th4;
                    th4 = obj;
                    th3 = obj2;
                    okioReadScope = okioReadScope3;
                    if (th3 == 0) {
                        return th4;
                    }
                    throw th3;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable2 = (Closeable) c05251.L$1;
                okioReadScope3 = (OkioReadScope) c05251.L$0;
                try {
                    AbstractC3193b.m15359b(obj);
                    if (closeable2 != null) {
                        try {
                            closeable2.close();
                        } catch (Throwable th6) {
                            th4 = th6;
                        }
                    }
                    Object obj3 = th4;
                    th4 = obj;
                    th3 = obj3;
                } catch (Throwable th7) {
                    th3 = th7;
                    if (closeable2 != null) {
                        try {
                            closeable2.close();
                        } catch (Throwable th8) {
                            try {
                                lda.m16117c(th3, th8);
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof FileNotFoundException) {
                                    throw DirectBootExceptionUtilKt.wrapExceptionIfDueToDirectBoot(String.valueOf(((OkioReadScope) okioReadScope3).path.m10105c()), e);
                                }
                                throw e;
                            }
                        }
                    }
                }
                okioReadScope = okioReadScope3;
                if (th3 == 0) {
                    return th4;
                }
                throw th3;
            }
            closeable = (Closeable) c05251.L$1;
            okioReadScope2 = (OkioReadScope) c05251.L$0;
            try {
                AbstractC3193b.m15359b(obj);
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th9) {
                        th2 = th9;
                    }
                }
                th2 = null;
            } catch (Throwable th10) {
                th = th10;
                if (closeable != null) {
                    try {
                        try {
                            closeable.close();
                        } catch (Throwable th11) {
                            lda.m16117c(th, th11);
                        }
                    } catch (FileNotFoundException unused2) {
                        okioReadScope = okioReadScope2;
                        if (((OkioReadScope) okioReadScope).fileSystem.m22434q(((OkioReadScope) okioReadScope).path)) {
                            return ((OkioReadScope) okioReadScope).serializer.getDefaultValue();
                        }
                        try {
                            e18VarM20390p = r46.m20390p(((OkioReadScope) okioReadScope).fileSystem.mo261N(((OkioReadScope) okioReadScope).path));
                            try {
                                OkioSerializer<T> okioSerializer3 = ((OkioReadScope) okioReadScope).serializer;
                                c05251.L$0 = okioReadScope;
                                c05251.L$1 = e18VarM20390p;
                                c05251.label = 2;
                                from = okioSerializer3.readFrom(e18VarM20390p, c05251);
                                if (from != coroutineSingletons) {
                                    okioReadScope3 = okioReadScope;
                                    closeable2 = e18VarM20390p;
                                    obj = from;
                                    if (closeable2 != null) {
                                        closeable2.close();
                                    }
                                    Object obj4 = th4;
                                    th4 = obj;
                                    th3 = obj4;
                                    okioReadScope = okioReadScope3;
                                    if (th3 == 0) {
                                        return th4;
                                    }
                                    throw th3;
                                }
                                return coroutineSingletons;
                            } catch (Throwable th12) {
                                okioReadScope3 = okioReadScope;
                                closeable2 = e18VarM20390p;
                                th3 = th12;
                                if (closeable2 != null) {
                                    closeable2.close();
                                }
                            }
                        } catch (Exception e2) {
                            okioReadScope3 = okioReadScope;
                            e = e2;
                            if (e instanceof FileNotFoundException) {
                                throw DirectBootExceptionUtilKt.wrapExceptionIfDueToDirectBoot(String.valueOf(((OkioReadScope) okioReadScope3).path.m10105c()), e);
                            }
                            throw e;
                        }
                    }
                }
                th2 = th;
                obj = null;
            }
        }
        if (th2 == null) {
            return obj;
        }
        throw th2;
    }

    public final void checkClose() {
        if (this.closed.get()) {
            C3386nv.m17633t("This scope has already been closed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    public final u33 getFileSystem() {
        return this.fileSystem;
    }

    public final d57 getPath() {
        return this.path;
    }

    public final OkioSerializer<T> getSerializer() {
        return this.serializer;
    }

    @Override // androidx.datastore.core.ReadScope
    public Object readData(Continuation<? super T> continuation) {
        return readData$suspendImpl(this, continuation);
    }
}
