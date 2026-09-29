package androidx.view;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.internal.C7162l;
import kotlinx.coroutines.scheduling.C7178b;
import no.C7828f;
import no.C7832g0;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", m19206f = "Lifecycle.kt", m19207l = {375}, m19208m = "invokeSuspend")
final class LifecycleCoroutineScope$launchWhenResumed$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f6524e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC1045m f6525f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> f6526g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleCoroutineScope$launchWhenResumed$1(AbstractC1045m abstractC1045m, InterfaceC2056p<? super InterfaceC7882z, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super LifecycleCoroutineScope$launchWhenResumed$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f6525f = abstractC1045m;
        this.f6526g = interfaceC2056p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LifecycleCoroutineScope$launchWhenResumed$1(this.f6525f, this.f6526g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LifecycleCoroutineScope$launchWhenResumed$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f6524e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            Lifecycle lifecycleMo3890a = this.f6525f.mo3890a();
            this.f6524e = 1;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C7178b c7178b = C7832g0.f42930a;
            if (C7828f.m15574h(this, C7162l.f40438a.mo14316C1(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycleMo3890a, state, this.f6526g, null)) == coroutineSingletons) {
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
