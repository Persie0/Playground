package androidx.datastore.core;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", m4291f = "DataMigrationInitializer.kt", m4292l = {42}, m4293m = "invokeSuspend", m4294v = 1)
public final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends SuspendLambda implements vi3 {
    final /* synthetic */ DataMigration<T> $migration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2$1$1(DataMigration<T> dataMigration, Continuation<? super DataMigrationInitializer$Companion$runMigrations$2$1$1> continuation) {
        super(1, continuation);
        this.$migration = dataMigration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<xfa> create(Continuation<?> continuation) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.$migration, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Continuation<? super xfa> continuation) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create(continuation)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 for r3v3 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            kotlin.AbstractC3193b.m15359b(r4)
            goto L22
        Ld:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r3)
            r3 = 0
            return r3
        L14:
            kotlin.AbstractC3193b.m15359b(r4)
            androidx.datastore.core.DataMigration<T> r4 = r3.$migration
            r3.label = r2
            java.lang.Object r3 = r4.cleanUp(r3)
            if (r3 != r0) goto L22
            return r0
        L22:
            xfa r3 = p000.xfa.f68157a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
