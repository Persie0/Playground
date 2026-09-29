package androidx.datastore.core;

import cm.InterfaceC2056p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m13365d2 = {"T", "Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 5, 1})
@InterfaceC10224c(m19205c = "androidx.datastore.core.SimpleActor$offer$2", m19206f = "SimpleActor.kt", m19207l = {122, 122}, m19208m = "invokeSuspend")
final class SimpleActor$offer$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public InterfaceC2056p f5660e;

    /* JADX INFO: renamed from: f */
    public int f5661f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SimpleActor<Object> f5662g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor<Object> simpleActor, InterfaceC9968c<? super SimpleActor$offer$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f5662g = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new SimpleActor$offer$2(this.f5662g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SimpleActor$offer$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0073 -> B:25:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x0073
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r7 = 1
            int r1 = r8.f5661f
            r7 = 5
            r2 = 2
            r7 = 3
            r6 = 1
            r3 = r6
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L22
            if (r1 != r2) goto L16
            p260m8.C7499b.m14977z0(r9)
            r7 = 4
            r9 = r8
            goto L74
        L16:
            r7 = 7
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r0 = r6
            r9.<init>(r0)
            r7 = 4
            throw r9
            r7 = 6
        L22:
            r7 = 5
            cm.p r1 = r8.f5660e
            p260m8.C7499b.m14977z0(r9)
            r7 = 7
            r4 = r1
            r1 = r9
            r9 = r8
            goto L64
        L2d:
            p260m8.C7499b.m14977z0(r9)
            androidx.datastore.core.SimpleActor<java.lang.Object> r9 = r8.f5662g
            java.util.concurrent.atomic.AtomicInteger r9 = r9.f5656d
            int r9 = r9.get()
            if (r9 <= 0) goto L3c
            r9 = r3
            goto L3e
        L3c:
            r7 = 1
            r9 = 0
        L3e:
            if (r9 == 0) goto L84
            r7 = 3
            r9 = r8
        L42:
            androidx.datastore.core.SimpleActor<java.lang.Object> r1 = r9.f5662g
            r7 = 4
            no.z r4 = r1.f5653a
            r7 = 5
            kotlin.coroutines.CoroutineContext r6 = r4.getF6528b()
            r4 = r6
            ae.C0062b.m286L0(r4)
            cm.p<T, wl.c<? super sl.e>, java.lang.Object> r4 = r1.f5654b
            r7 = 7
            r9.f5660e = r4
            r7 = 3
            r9.f5661f = r3
            kotlinx.coroutines.channels.AbstractChannel r1 = r1.f5655c
            r7 = 4
            java.lang.Object r6 = r1.mo14338m(r9)
            r1 = r6
            if (r1 != r0) goto L64
            r7 = 6
            return r0
        L64:
            r6 = 0
            r5 = r6
            r9.f5660e = r5
            r9.f5661f = r2
            r7 = 7
            java.lang.Object r6 = r4.mo1337m0(r1, r9)
            r1 = r6
            if (r1 != r0) goto L73
            return r0
        L73:
            r7 = 3
        L74:
            androidx.datastore.core.SimpleActor<java.lang.Object> r1 = r9.f5662g
            r7 = 3
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f5656d
            int r6 = r1.decrementAndGet()
            r1 = r6
            if (r1 != 0) goto L42
            sl.e r9 = sl.C9072e.f47360a
            r7 = 7
            return r9
        L84:
            r7 = 7
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7 = 3
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
            r7 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.mo1338x(java.lang.Object):java.lang.Object");
    }
}
