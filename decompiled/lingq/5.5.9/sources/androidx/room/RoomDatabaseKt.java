package androidx.room;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.internal.C7170t;
import no.C7828f;
import no.C7843k;
import no.InterfaceC7840j;
import no.InterfaceC7882z;
import p213k4.C6597q;
import p213k4.ExecutorC6598r;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import p464wl.InterfaceC9969d;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class RoomDatabaseKt {
    /* JADX INFO: renamed from: a */
    public static final <R> Object m4573a(final RoomDatabase roomDatabase, InterfaceC2052l<? super InterfaceC9968c<? super R>, ? extends Object> interfaceC2052l, InterfaceC9968c<? super R> interfaceC9968c) {
        final RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(roomDatabase, interfaceC2052l, null);
        C6597q c6597q = (C6597q) interfaceC9968c.mo2029e().mo1474w(C6597q.f37492c);
        InterfaceC9969d interfaceC9969d = c6597q != null ? c6597q.f37493a : null;
        if (interfaceC9969d != null) {
            return C7828f.m15574h(interfaceC9968c, interfaceC9969d, roomDatabaseKt$withTransaction$transactionBlock$1);
        }
        final CoroutineContext coroutineContextMo2029e = interfaceC9968c.mo2029e();
        final C7843k c7843k = new C7843k(1, C8656b.m16874A(interfaceC9968c));
        c7843k.m15594r();
        try {
            ExecutorC6598r executorC6598r = roomDatabase.f7512c;
            if (executorC6598r == null) {
                C5207g.m11117l("internalTransactionExecutor");
                throw null;
            }
            executorC6598r.execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1

                /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1 */
                @Metadata(m13364d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m13365d2 = {"R", "Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
                @InterfaceC10224c(m19205c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", m19206f = "RoomDatabaseExt.kt", m19207l = {97}, m19208m = "invokeSuspend")
                public static final class C11831 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public int f7544e;

                    /* JADX INFO: renamed from: f */
                    public /* synthetic */ Object f7545f;

                    /* JADX INFO: renamed from: g */
                    public final /* synthetic */ RoomDatabase f7546g;

                    /* JADX INFO: renamed from: h */
                    public final /* synthetic */ InterfaceC7840j<Object> f7547h;

                    /* JADX INFO: renamed from: i */
                    public final /* synthetic */ InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<Object>, Object> f7548i;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C11831(RoomDatabase roomDatabase, InterfaceC7840j<Object> interfaceC7840j, InterfaceC2056p<? super InterfaceC7882z, ? super InterfaceC9968c<Object>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super C11831> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f7546g = roomDatabase;
                        this.f7547h = interfaceC7840j;
                        this.f7548i = interfaceC2056p;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        C11831 c11831 = new C11831(this.f7546g, this.f7547h, this.f7548i, interfaceC9968c);
                        c11831.f7545f = obj;
                        return c11831;
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((C11831) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        InterfaceC9968c interfaceC9968c;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i10 = this.f7544e;
                        if (i10 == 0) {
                            C7499b.m14977z0(obj);
                            CoroutineContext.InterfaceC6757a interfaceC6757aMo1474w = ((InterfaceC7882z) this.f7545f).getF6528b().mo1474w(InterfaceC9969d.a.f50692a);
                            C5207g.m11108c(interfaceC6757aMo1474w);
                            InterfaceC9969d interfaceC9969d = (InterfaceC9969d) interfaceC6757aMo1474w;
                            C6597q c6597q = new C6597q(interfaceC9969d);
                            CoroutineContext coroutineContextMo1471C = interfaceC9969d.mo1471C(c6597q).mo1471C(new C7170t(Integer.valueOf(System.identityHashCode(c6597q)), this.f7546g.f7519j));
                            InterfaceC7840j<Object> interfaceC7840j = this.f7547h;
                            this.f7545f = interfaceC7840j;
                            this.f7544e = 1;
                            obj = C7828f.m15574h(this, coroutineContextMo1471C, this.f7548i);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            interfaceC9968c = interfaceC7840j;
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC9968c = (InterfaceC9968c) this.f7545f;
                            C7499b.m14977z0(obj);
                        }
                        interfaceC9968c.mo2031y(obj);
                        return C9072e.f47360a;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC7840j<Object> interfaceC7840j = c7843k;
                    try {
                        CoroutineContext coroutineContext = coroutineContextMo2029e;
                        int i10 = InterfaceC9969d.f50691G;
                        C7828f.m15572f(coroutineContext.mo1473m0(InterfaceC9969d.a.f50692a), new C11831(roomDatabase, interfaceC7840j, roomDatabaseKt$withTransaction$transactionBlock$1, null));
                    } catch (Throwable th2) {
                        interfaceC7840j.mo15583t0(th2);
                    }
                }
            });
            Object objM15593p = c7843k.m15593p();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return objM15593p;
        } catch (RejectedExecutionException e10) {
            c7843k.mo15583t0(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
    }
}
