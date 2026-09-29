package androidx.view;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m13365d2 = {"T", "Lno/z;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m19206f = "PausingDispatcher.kt", m19207l = {203}, m19208m = "invokeSuspend")
final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<Object>, Object> {

    /* JADX INFO: renamed from: e */
    public int f6549e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f6550f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lifecycle f6551g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Lifecycle.State f6552h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<Object>, Object> f6553i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, InterfaceC2056p<? super InterfaceC7882z, ? super InterfaceC9968c<Object>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super PausingDispatcherKt$whenStateAtLeast$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f6551g = lifecycle;
        this.f6552h = state;
        this.f6553i = interfaceC2056p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.f6551g, this.f6552h, this.f6553i, interfaceC9968c);
        pausingDispatcherKt$whenStateAtLeast$2.f6550f = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<Object> interfaceC9968c) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        C1043l c1043l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f6549e;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1043l = (C1043l) this.f6550f;
            try {
                C7499b.m14977z0(obj);
                c1043l.m3950a();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                c1043l.m3950a();
                throw th;
            }
        }
        C7499b.m14977z0(obj);
        CoroutineContext f6528b = ((InterfaceC7882z) this.f6550f).getF6528b();
        int i11 = InterfaceC7875v0.f42975B;
        InterfaceC7875v0 interfaceC7875v0 = (InterfaceC7875v0) f6528b.mo1474w(InterfaceC7875v0.b.f42976a);
        if (interfaceC7875v0 == null) {
            throw new IllegalStateException("when[State] methods should have a parent job".toString());
        }
        C1059y c1059y = new C1059y();
        C1043l c1043l2 = new C1043l(this.f6551g, this.f6552h, c1059y.f6692c, interfaceC7875v0);
        try {
            InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<Object>, Object> interfaceC2056p = this.f6553i;
            this.f6550f = c1043l2;
            this.f6549e = 1;
            obj = C7828f.m15574h(this, c1059y, interfaceC2056p);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            c1043l = c1043l2;
            c1043l.m3950a();
            return obj;
        } catch (Throwable th3) {
            th = th3;
            c1043l = c1043l2;
            c1043l.m3950a();
            throw th;
        }
    }
}
