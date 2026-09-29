package androidx.datastore.core.okio;

import androidx.datastore.core.Closeable;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.StorageConnection;
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
import p000.d57;
import p000.lda;
import p000.u33;
import p000.ui3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
public final class OkioStorageConnection<T> implements StorageConnection<T> {
    private final AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final u33 fileSystem;
    private final ui3 onClose;
    private final d57 path;
    private final OkioSerializer<T> serializer;
    private final c76 transactionMutex;

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioStorageConnection$readScope$1 */
    @c32(m4290c = "androidx.datastore.core.okio.OkioStorageConnection", m4291f = "OkioStorage.kt", m4292l = {113}, m4293m = "readScope", m4294v = 1)
    public static final class C05261<R> extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05261(OkioStorageConnection<T> okioStorageConnection, Continuation<? super C05261> continuation) {
            super(continuation);
            this.this$0 = okioStorageConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readScope(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioStorageConnection$writeScope$1 */
    @c32(m4290c = "androidx.datastore.core.okio.OkioStorageConnection", m4291f = "OkioStorage.kt", m4292l = {242, 131}, m4293m = "writeScope", m4294v = 1)
    public static final class C05271 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05271(OkioStorageConnection<T> okioStorageConnection, Continuation<? super C05271> continuation) {
            super(continuation);
            this.this$0 = okioStorageConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeScope(null, this);
        }
    }

    public OkioStorageConnection(u33 u33Var, d57 d57Var, OkioSerializer<T> okioSerializer, InterProcessCoordinator interProcessCoordinator, ui3 ui3Var) {
        u33Var.getClass();
        d57Var.getClass();
        okioSerializer.getClass();
        interProcessCoordinator.getClass();
        ui3Var.getClass();
        this.fileSystem = u33Var;
        this.path = d57Var;
        this.serializer = okioSerializer;
        this.coordinator = interProcessCoordinator;
        this.onClose = ui3Var;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = new C3248a();
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            C3386nv.m17633t("StorageConnection has already been disposed.");
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

    /* JADX WARN: Code duplicated, block: B:28:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[Catch: all -> 0x0073, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0073, blocks: (B:31:0x0072, B:40:0x0082, B:39:0x007f, B:36:0x007a), top: B:48:0x0020, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [aj3] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // androidx.datastore.core.StorageConnection
    public <R> Object readScope(aj3 aj3Var, Continuation<? super R> continuation) throws Throwable {
        C05261 c05261;
        Throwable th;
        Closeable closeable;
        ?? r10;
        if (continuation instanceof C05261) {
            c05261 = (C05261) continuation;
            int i = c05261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05261.label = i - Integer.MIN_VALUE;
            } else {
                c05261 = new C05261(this, continuation);
            }
        } else {
            c05261 = new C05261(this, continuation);
        }
        Object obj = c05261.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c05261.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aj3Var = c05261.Z$0;
                closeable = (Closeable) c05261.L$0;
                try {
                    AbstractC3193b.m15359b(obj);
                    r10 = aj3Var;
                    try {
                        closeable.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
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
                OkioReadScope okioReadScope = new OkioReadScope(this.fileSystem, this.path, this.serializer);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zMo4386a);
                    c05261.L$0 = okioReadScope;
                    c05261.Z$0 = zMo4386a;
                    c05261.label = 1;
                    Object objInvoke = aj3Var.invoke(okioReadScope, boolValueOf, c05261);
                    if (objInvoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = objInvoke;
                    r10 = zMo4386a;
                    closeable = okioReadScope;
                    closeable.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
                        this.transactionMutex.mo4387b(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    aj3Var = zMo4386a;
                    closeable = okioReadScope;
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

    /* JADX WARN: Code duplicated, block: B:35:0x00ad A[Catch: all -> 0x00bd, IOException -> 0x00c0, TRY_ENTER, TryCatch #9 {IOException -> 0x00c0, all -> 0x00bd, blocks: (B:35:0x00ad, B:37:0x00b5, B:45:0x00c9, B:52:0x00d6, B:51:0x00d3), top: B:79:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5 A[Catch: all -> 0x00bd, IOException -> 0x00c0, TRY_LEAVE, TryCatch #9 {IOException -> 0x00c0, all -> 0x00bd, blocks: (B:35:0x00ad, B:37:0x00b5, B:45:0x00c9, B:52:0x00d6, B:51:0x00d3), top: B:79:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9 A[Catch: all -> 0x00bd, IOException -> 0x00c0, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x00c0, all -> 0x00bd, blocks: (B:35:0x00ad, B:37:0x00b5, B:45:0x00c9, B:52:0x00d6, B:51:0x00d3), top: B:79:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [d57] */
    /* JADX WARN: Type inference failed for: r0v3, types: [d57, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [d57] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [c76] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [u33] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [c76] */
    /* JADX WARN: Type inference failed for: r3v3, types: [u33] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, u33] */
    /* JADX WARN: Type inference failed for: r9v14, types: [u33] */
    /* JADX WARN: Type inference failed for: r9v16, types: [u33] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.datastore.core.StorageConnection
    public Object writeScope(zi3 zi3Var, Continuation<? super xfa> continuation) throws Throwable {
        C05271 c05271;
        ?? r10;
        d57 d57VarM10105c;
        c76 c76Var;
        OkioWriteScope okioWriteScope;
        Throwable th;
        Closeable closeable;
        ?? r1;
        ?? r0;
        ?? M10107e = ".tmp";
        if (continuation instanceof C05271) {
            c05271 = (C05271) continuation;
            int i = c05271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05271.label = i - Integer.MIN_VALUE;
            } else {
                c05271 = new C05271(this, continuation);
            }
        } else {
            c05271 = new C05271(this, continuation);
        }
        Object obj = c05271.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c05271.label;
        try {
            try {
                try {
                    try {
                        if (i2 == 0) {
                            AbstractC3193b.m15359b(obj);
                            checkNotClosed();
                            d57VarM10105c = this.path.m10105c();
                            if (d57VarM10105c == null) {
                                C3386nv.m17633t("must have a parent path");
                                return null;
                            }
                            this.fileSystem.m22432c(d57VarM10105c);
                            c76Var = this.transactionMutex;
                            c05271.L$0 = zi3Var;
                            c05271.L$1 = d57VarM10105c;
                            c05271.L$2 = c76Var;
                            c05271.label = 1;
                            if (c76Var.mo4388c(c05271) != coroutineSingletons) {
                            }
                            r10 = c76Var;
                            return coroutineSingletons;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            closeable = (Closeable) c05271.L$2;
                            d57 d57Var = (d57) c05271.L$1;
                            c76 c76Var2 = (c76) c05271.L$0;
                            try {
                                AbstractC3193b.m15359b(obj);
                                r0 = d57Var;
                                r1 = c76Var2;
                                try {
                                    closeable.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (this.fileSystem.m22434q(r0)) {
                                    this.fileSystem.mo263b(r0, this.path);
                                }
                                r1.mo4387b(null);
                                return xfa.f68157a;
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
                        c76 c76Var3 = (c76) c05271.L$2;
                        d57VarM10105c = (d57) c05271.L$1;
                        zi3 zi3Var2 = (zi3) c05271.L$0;
                        AbstractC3193b.m15359b(obj);
                        r10 = c76Var3;
                        zi3Var = zi3Var2;
                        c05271.L$0 = r10;
                        c05271.L$1 = M10107e;
                        c05271.L$2 = okioWriteScope;
                        c05271.label = 2;
                        if (zi3Var.invoke(okioWriteScope, c05271) != coroutineSingletons) {
                            r1 = r10;
                            closeable = okioWriteScope;
                            r0 = M10107e;
                            closeable.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (this.fileSystem.m22434q(r0)) {
                                this.fileSystem.mo263b(r0, this.path);
                            }
                            r1.mo4387b(null);
                            return xfa.f68157a;
                        }
                        r10 = c76Var;
                        return coroutineSingletons;
                    } catch (Throwable th5) {
                        th = th5;
                        closeable = okioWriteScope;
                        closeable.close();
                        throw th;
                    }
                    this.fileSystem.mo265n(M10107e);
                    okioWriteScope = new OkioWriteScope(this.fileSystem, M10107e, this.serializer);
                } catch (IOException e) {
                    e = e;
                    if (this.fileSystem.m22434q(M10107e)) {
                        try {
                            ?? r8 = this.fileSystem;
                            r8.getClass();
                            r8.mo265n(M10107e);
                        } catch (IOException unused) {
                        }
                    }
                    throw e;
                }
                r10 = c76Var;
                M10107e = d57VarM10105c.m10107e(this.path.m10104b().concat(".tmp"));
            } catch (Throwable th6) {
                th = th6;
                r10.mo4387b(null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            r10 = c05271;
        } catch (Throwable th7) {
            th = th7;
            r10 = c05271;
            r10.mo4387b(null);
            throw th;
        }
    }
}
