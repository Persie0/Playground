package androidx.room;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.C7828f;
import no.InterfaceC7882z;
import p213k4.C6586f;
import p213k4.C6597q;
import p260m8.C7499b;
import p325po.InterfaceC8428d;
import p325po.InterfaceC8430f;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m13365d2 = {"R", "Lkotlinx/coroutines/flow/d;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@InterfaceC10224c(m19205c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", m19206f = "CoroutinesRoom.kt", m19207l = {110}, m19208m = "invokeSuspend")
final class CoroutinesRoom$Companion$createFlow$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<Object>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f7478e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f7479f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f7480g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ RoomDatabase f7481h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String[] f7482i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Callable<Object> f7483j;

    /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m13365d2 = {"R", "Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    @InterfaceC10224c(m19205c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", m19206f = "CoroutinesRoom.kt", m19207l = {136}, m19208m = "invokeSuspend")
    public static final class C11771 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f7484e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f7485f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ boolean f7486g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ RoomDatabase f7487h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC7117d<Object> f7488i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ String[] f7489j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ Callable<Object> f7490k;

        /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m13365d2 = {"R", "Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
        @InterfaceC10224c(m19205c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", m19206f = "CoroutinesRoom.kt", m19207l = {127, 129}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public InterfaceC8430f f7491e;

            /* JADX INFO: renamed from: f */
            public int f7492f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ RoomDatabase f7493g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ a f7494h;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ InterfaceC8428d<C9072e> f7495i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ Callable<Object> f7496j;

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ InterfaceC8428d<Object> f7497k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RoomDatabase roomDatabase, a aVar, InterfaceC8428d<C9072e> interfaceC8428d, Callable<Object> callable, InterfaceC8428d<Object> interfaceC8428d2, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f7493g = roomDatabase;
                this.f7494h = aVar;
                this.f7495i = interfaceC8428d;
                this.f7496j = callable;
                this.f7497k = interfaceC8428d2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f7493g, this.f7494h, this.f7495i, this.f7496j, this.f7497k, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Code duplicated, block: B:19:0x004e A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:20:0x004f  */
            /* JADX WARN: Code duplicated, block: B:23:0x005f A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #1 {all -> 0x007d, blocks: (B:21:0x0055, B:23:0x005f), top: B:39:0x0055 }] */
            /* JADX WARN: Code duplicated, block: B:25:0x0077  */
            /* JADX WARN: Code duplicated, block: B:27:0x0079  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0079 -> B:41:0x0041). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final java.lang.Object mo1338x(java.lang.Object r10) {
                /*
                    r9 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    r8 = 5
                    int r1 = r9.f7492f
                    r7 = 2
                    r2 = r7
                    r7 = 1
                    r3 = r7
                    if (r1 == 0) goto L29
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L16
                    po.f r1 = r9.f7491e
                    r8 = 6
                    p260m8.C7499b.m14977z0(r10)     // Catch: java.lang.Throwable -> L94
                    goto L40
                L16:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r0 = r7
                    r10.<init>(r0)
                    throw r10
                L1f:
                    po.f r1 = r9.f7491e
                    r8 = 4
                    p260m8.C7499b.m14977z0(r10)     // Catch: java.lang.Throwable -> L94
                    r4 = r1
                    r1 = r0
                    r0 = r9
                    goto L55
                L29:
                    r8 = 3
                    p260m8.C7499b.m14977z0(r10)
                    androidx.room.RoomDatabase r10 = r9.f7493g
                    k4.f r10 = r10.f7514e
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a r1 = r9.f7494h
                    r8 = 1
                    r10.m13174a(r1)
                    r8 = 6
                    r8 = 5
                    po.d<sl.e> r10 = r9.f7495i     // Catch: java.lang.Throwable -> L94
                    po.f r7 = r10.iterator()     // Catch: java.lang.Throwable -> L94
                    r1 = r7
                L40:
                    r10 = r9
                L41:
                    r10.f7491e = r1     // Catch: java.lang.Throwable -> L8f
                    r8 = 6
                    r10.f7492f = r3     // Catch: java.lang.Throwable -> L8f
                    r8 = 4
                    java.lang.Object r7 = r1.mo14348a(r10)     // Catch: java.lang.Throwable -> L8f
                    r4 = r7
                    if (r4 != r0) goto L4f
                    return r0
                L4f:
                    r8 = 4
                    r6 = r0
                    r0 = r10
                    r10 = r4
                    r4 = r1
                    r1 = r6
                L55:
                    r8 = 5
                    java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L7d
                    r8 = 2
                    boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L7d
                    if (r10 == 0) goto L7f
                    r8 = 2
                    r4.next()     // Catch: java.lang.Throwable -> L7d
                    java.util.concurrent.Callable<java.lang.Object> r10 = r0.f7496j     // Catch: java.lang.Throwable -> L7d
                    r8 = 2
                    java.lang.Object r10 = r10.call()     // Catch: java.lang.Throwable -> L7d
                    po.d<java.lang.Object> r5 = r0.f7497k     // Catch: java.lang.Throwable -> L7d
                    r0.f7491e = r4     // Catch: java.lang.Throwable -> L7d
                    r8 = 2
                    r0.f7492f = r2     // Catch: java.lang.Throwable -> L7d
                    java.lang.Object r10 = r5.mo16480k(r10, r0)     // Catch: java.lang.Throwable -> L7d
                    if (r10 != r1) goto L79
                    r8 = 4
                    return r1
                L79:
                    r10 = r0
                    r0 = r1
                    r1 = r4
                    goto L41
                L7d:
                    r10 = move-exception
                    goto L96
                L7f:
                    androidx.room.RoomDatabase r10 = r0.f7493g
                    r8 = 4
                    k4.f r10 = r10.f7514e
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a r0 = r0.f7494h
                    r8 = 5
                    r10.m13176c(r0)
                    r8 = 4
                    sl.e r10 = sl.C9072e.f47360a
                    r8 = 4
                    return r10
                L8f:
                    r0 = move-exception
                    r6 = r0
                    r0 = r10
                    r10 = r6
                    goto L96
                L94:
                    r10 = move-exception
                    r0 = r9
                L96:
                    androidx.room.RoomDatabase r1 = r0.f7493g
                    k4.f r1 = r1.f7514e
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a r0 = r0.f7494h
                    r8 = 7
                    r1.m13176c(r0)
                    throw r10
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.CoroutinesRoom$Companion$createFlow$1.C11771.AnonymousClass1.mo1338x(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a */
        public static final class a extends C6586f.c {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC8428d<C9072e> f7498b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String[] strArr, AbstractChannel abstractChannel) {
                super(strArr);
                this.f7498b = abstractChannel;
            }

            @Override // p213k4.C6586f.c
            /* JADX INFO: renamed from: a */
            public final void mo4545a(Set<String> set) {
                C5207g.m11111f(set, "tables");
                this.f7498b.mo16479j(C9072e.f47360a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11771(boolean z10, RoomDatabase roomDatabase, InterfaceC7117d<Object> interfaceC7117d, String[] strArr, Callable<Object> callable, InterfaceC9968c<? super C11771> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f7486g = z10;
            this.f7487h = roomDatabase;
            this.f7488i = interfaceC7117d;
            this.f7489j = strArr;
            this.f7490k = callable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C11771 c11771 = new C11771(this.f7486g, this.f7487h, this.f7488i, this.f7489j, this.f7490k, interfaceC9968c);
            c11771.f7485f = obj;
            return c11771;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C11771) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineContext coroutineContextM14917O;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f7484e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f7485f;
                AbstractChannel abstractChannelM16738m = C8573r0.m16738m(-1, null, 6);
                a aVar = new a(this.f7489j, abstractChannelM16738m);
                Object obj2 = C9072e.f47360a;
                abstractChannelM16738m.mo16479j(obj2);
                C6597q c6597q = (C6597q) interfaceC7882z.getF6528b().mo1474w(C6597q.f37492c);
                if (c6597q == null || (coroutineContextM14917O = c6597q.f37493a) == null) {
                    boolean z10 = this.f7486g;
                    RoomDatabase roomDatabase = this.f7487h;
                    coroutineContextM14917O = z10 ? C7499b.m14917O(roomDatabase) : C7499b.m14914L(roomDatabase);
                }
                AbstractChannel abstractChannelM16738m2 = C8573r0.m16738m(0, null, 7);
                C7828f.m15570d(interfaceC7882z, coroutineContextM14917O, null, new AnonymousClass1(this.f7487h, aVar, abstractChannelM16738m, this.f7490k, abstractChannelM16738m2, null), 2);
                this.f7484e = 1;
                Object objM14359a = FlowKt__ChannelsKt.m14359a(this.f7488i, abstractChannelM16738m2, true, this);
                if (objM14359a == coroutineSingletons) {
                    obj2 = objM14359a;
                }
                if (obj2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$createFlow$1(boolean z10, RoomDatabase roomDatabase, String[] strArr, Callable<Object> callable, InterfaceC9968c<? super CoroutinesRoom$Companion$createFlow$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f7480g = z10;
        this.f7481h = roomDatabase;
        this.f7482i = strArr;
        this.f7483j = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.f7480g, this.f7481h, this.f7482i, this.f7483j, interfaceC9968c);
        coroutinesRoom$Companion$createFlow$1.f7479f = obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<Object> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CoroutinesRoom$Companion$createFlow$1) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f7478e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C11771 c11771 = new C11771(this.f7480g, this.f7481h, (InterfaceC7117d) this.f7479f, this.f7482i, this.f7483j, null);
            this.f7478e = 1;
            if (C7499b.m14963s(c11771, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
