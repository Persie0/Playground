package androidx.datastore.core;

import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p129g3.InterfaceC5686c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0001H\u008a@"}, m13365d2 = {"T", "startingData", "<anonymous>"}, m13366k = 3, m13367mv = {1, 5, 1})
@InterfaceC10224c(m19205c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", m19206f = "DataMigrationInitializer.kt", m19207l = {44, 46}, m19208m = "invokeSuspend")
final class DataMigrationInitializer$Companion$runMigrations$2 extends SuspendLambda implements InterfaceC2056p<Object, InterfaceC9968c<Object>, Object> {

    /* JADX INFO: renamed from: e */
    public Iterator f5644e;

    /* JADX INFO: renamed from: f */
    public InterfaceC5686c f5645f;

    /* JADX INFO: renamed from: g */
    public Object f5646g;

    /* JADX INFO: renamed from: h */
    public int f5647h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f5648i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List<InterfaceC5686c<Object>> f5649j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ List<InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object>> f5650k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataMigrationInitializer$Companion$runMigrations$2(List<? extends InterfaceC5686c<Object>> list, List<InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object>> list2, InterfaceC9968c<? super DataMigrationInitializer$Companion$runMigrations$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f5649j = list;
        this.f5650k = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.f5649j, this.f5650k, interfaceC9968c);
        dataMigrationInitializer$Companion$runMigrations$2.f5648i = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(Object obj, InterfaceC9968c<Object> interfaceC9968c) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) mo1336a(obj, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:24:0x009c  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r13.f5647h
            r12 = 7
            r2 = 2
            r11 = 1
            r3 = r11
            if (r1 == 0) goto L38
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1b
            java.util.Iterator r1 = r13.f5644e
            r12 = 5
            java.lang.Object r4 = r13.f5648i
            r12 = 5
            java.util.List r4 = (java.util.List) r4
            p260m8.C7499b.m14977z0(r14)
            r12 = 5
            goto L47
        L1b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r12 = 7
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            r12 = 7
            throw r14
            r12 = 1
        L26:
            r12 = 5
            java.lang.Object r1 = r13.f5646g
            g3.c r4 = r13.f5645f
            java.util.Iterator r5 = r13.f5644e
            r12 = 3
            java.lang.Object r6 = r13.f5648i
            java.util.List r6 = (java.util.List) r6
            p260m8.C7499b.m14977z0(r14)
            r12 = 3
            r7 = r13
            goto L75
        L38:
            p260m8.C7499b.m14977z0(r14)
            r12 = 5
            java.lang.Object r14 = r13.f5648i
            java.util.List<g3.c<java.lang.Object>> r1 = r13.f5649j
            r12 = 2
            java.util.Iterator r1 = r1.iterator()
            java.util.List<cm.l<wl.c<? super sl.e>, java.lang.Object>> r4 = r13.f5650k
        L47:
            r5 = r13
        L48:
            boolean r11 = r1.hasNext()
            r6 = r11
            if (r6 == 0) goto La5
            r12 = 2
            java.lang.Object r11 = r1.next()
            r6 = r11
            g3.c r6 = (p129g3.InterfaceC5686c) r6
            r12 = 2
            r5.f5648i = r4
            r5.f5644e = r1
            r12 = 7
            r5.f5645f = r6
            r12 = 2
            r5.f5646g = r14
            r5.f5647h = r3
            java.lang.Object r11 = r6.mo3018a(r14, r5)
            r7 = r11
            if (r7 != r0) goto L6d
            r12 = 4
            return r0
        L6d:
            r9 = r1
            r1 = r14
            r14 = r7
            r7 = r5
            r5 = r9
            r10 = r6
            r6 = r4
            r4 = r10
        L75:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r12 = 1
            boolean r11 = r14.booleanValue()
            r14 = r11
            if (r14 == 0) goto L9e
            r12 = 4
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r14 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r8 = 0
            r14.<init>(r4, r8)
            r6.add(r14)
            r7.f5648i = r6
            r7.f5644e = r5
            r12 = 5
            r7.f5645f = r8
            r7.f5646g = r8
            r12 = 3
            r7.f5647h = r2
            java.lang.Object r11 = r4.mo3019b(r1, r7)
            r14 = r11
            if (r14 != r0) goto La0
            r12 = 5
            return r0
        L9e:
            r12 = 2
            r14 = r1
        La0:
            r12 = 7
            r1 = r5
            r4 = r6
            r5 = r7
            goto L48
        La5:
            r12 = 1
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.mo1338x(java.lang.Object):java.lang.Object");
    }
}
