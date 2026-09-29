package androidx.view;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", m19206f = "Lifecycle.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class LifecycleCoroutineScopeImpl$register$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f6529e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f6530f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, InterfaceC9968c<? super LifecycleCoroutineScopeImpl$register$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f6530f = lifecycleCoroutineScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.f6530f, interfaceC9968c);
        lifecycleCoroutineScopeImpl$register$1.f6529e = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LifecycleCoroutineScopeImpl$register$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f6529e;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f6530f;
        if (lifecycleCoroutineScopeImpl.f6527a.mo3884b().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
            lifecycleCoroutineScopeImpl.f6527a.mo3883a(lifecycleCoroutineScopeImpl);
        } else {
            C0062b.m330a0(interfaceC7882z.getF6528b(), null);
        }
        return C9072e.f47360a;
    }
}
