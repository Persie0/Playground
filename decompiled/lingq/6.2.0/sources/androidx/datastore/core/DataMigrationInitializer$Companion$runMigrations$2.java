package androidx.datastore.core;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", m4291f = "DataMigrationInitializer.kt", m4292l = {DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER, 43}, m4293m = "invokeSuspend", m4294v = 1)
public final class DataMigrationInitializer$Companion$runMigrations$2 extends SuspendLambda implements zi3 {
    final /* synthetic */ List<vi3> $cleanUps;
    final /* synthetic */ List<DataMigration<T>> $migrations;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataMigrationInitializer$Companion$runMigrations$2(List<? extends DataMigration<T>> list, List<vi3> list2, Continuation<? super DataMigrationInitializer$Companion$runMigrations$2> continuation) {
        super(2, continuation);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.$migrations, this.$cleanUps, continuation);
        dataMigrationInitializer$Companion$runMigrations$2.L$0 = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @Override // p000.zi3
    public final Object invoke(T t, Continuation<? super T> continuation) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(t, continuation)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L34
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            java.lang.Object r1 = r9.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r5 = r9.L$0
            java.util.List r5 = (java.util.List) r5
            kotlin.AbstractC3193b.m15359b(r10)
            goto L43
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r9)
            return r4
        L1f:
            java.lang.Object r1 = r9.L$3
            java.lang.Object r5 = r9.L$2
            androidx.datastore.core.DataMigration r5 = (androidx.datastore.core.DataMigration) r5
            java.lang.Object r6 = r9.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r9.L$0
            java.util.List r7 = (java.util.List) r7
            kotlin.AbstractC3193b.m15359b(r10)
            r8 = r7
            r7 = r5
            r5 = r8
            goto L65
        L34:
            kotlin.AbstractC3193b.m15359b(r10)
            java.lang.Object r10 = r9.L$0
            java.util.List<androidx.datastore.core.DataMigration<T>> r1 = r9.$migrations
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List<vi3> r5 = r9.$cleanUps
            java.util.Iterator r1 = r1.iterator()
        L43:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L8a
            java.lang.Object r6 = r1.next()
            androidx.datastore.core.DataMigration r6 = (androidx.datastore.core.DataMigration) r6
            r9.L$0 = r5
            r9.L$1 = r1
            r9.L$2 = r6
            r9.L$3 = r10
            r9.label = r3
            java.lang.Object r7 = r6.shouldMigrate(r10, r9)
            if (r7 != r0) goto L60
            goto L85
        L60:
            r8 = r1
            r1 = r10
            r10 = r7
            r7 = r6
            r6 = r8
        L65:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L88
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r10 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r10.<init>(r7, r4)
            r5.add(r10)
            r9.L$0 = r5
            r9.L$1 = r6
            r9.L$2 = r4
            r9.L$3 = r4
            r9.label = r2
            java.lang.Object r10 = r7.migrate(r1, r9)
            if (r10 != r0) goto L86
        L85:
            return r0
        L86:
            r1 = r6
            goto L43
        L88:
            r10 = r1
            goto L86
        L8a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
