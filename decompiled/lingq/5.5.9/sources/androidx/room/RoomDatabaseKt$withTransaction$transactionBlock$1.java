package androidx.room;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p213k4.C6597q;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m13365d2 = {"R", "Lno/z;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@InterfaceC10224c(m19205c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", m19206f = "RoomDatabaseExt.kt", m19207l = {56}, m19208m = "invokeSuspend")
public final class RoomDatabaseKt$withTransaction$transactionBlock$1<R> extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super R>, Object> {

    /* JADX INFO: renamed from: e */
    public int f7549e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f7550f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ RoomDatabase f7551g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC2052l<InterfaceC9968c<? super R>, Object> f7552h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomDatabaseKt$withTransaction$transactionBlock$1(RoomDatabase roomDatabase, InterfaceC2052l<? super InterfaceC9968c<? super R>, ? extends Object> interfaceC2052l, InterfaceC9968c<? super RoomDatabaseKt$withTransaction$transactionBlock$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f7551g = roomDatabase;
        this.f7552h = interfaceC2052l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(this.f7551g, this.f7552h, interfaceC9968c);
        roomDatabaseKt$withTransaction$transactionBlock$1.f7550f = obj;
        return roomDatabaseKt$withTransaction$transactionBlock$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, Object obj) {
        return ((RoomDatabaseKt$withTransaction$transactionBlock$1) mo1336a(interfaceC7882z, (InterfaceC9968c) obj)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Throwable th2;
        C6597q c6597q;
        Throwable th3;
        C6597q c6597q2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f7549e;
        RoomDatabase roomDatabase = this.f7551g;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CoroutineContext.InterfaceC6757a interfaceC6757aMo1474w = ((InterfaceC7882z) this.f7550f).getF6528b().mo1474w(C6597q.f37492c);
                C5207g.m11108c(interfaceC6757aMo1474w);
                c6597q = (C6597q) interfaceC6757aMo1474w;
                c6597q.f37494b.incrementAndGet();
                try {
                    roomDatabase.m4552c();
                    try {
                        InterfaceC2052l<InterfaceC9968c<? super R>, Object> interfaceC2052l = this.f7552h;
                        this.f7550f = c6597q;
                        this.f7549e = 1;
                        Object objMo528n = interfaceC2052l.mo528n(this);
                        if (objMo528n == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        c6597q2 = c6597q;
                        obj = objMo528n;
                    } catch (Throwable th4) {
                        th3 = th4;
                        roomDatabase.m4563n();
                        throw th3;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    if (c6597q.f37494b.decrementAndGet() >= 0) {
                        throw th2;
                    }
                    throw new IllegalStateException("Transaction was never started or was already released.");
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6597q c6597q3 = (C6597q) this.f7550f;
                try {
                    C7499b.m14977z0(obj);
                    c6597q2 = c6597q3;
                } catch (Throwable th6) {
                    th3 = th6;
                    roomDatabase.m4563n();
                    throw th3;
                }
            }
            roomDatabase.m4568s();
            roomDatabase.m4563n();
            if (c6597q2.f37494b.decrementAndGet() >= 0) {
                return obj;
            }
            throw new IllegalStateException("Transaction was never started or was already released.");
        } catch (Throwable th7) {
            th2 = th7;
            c6597q = coroutineSingletons;
        }
    }
}
