package androidx.view;

import ae.C0062b;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C7162l;
import kotlinx.coroutines.scheduling.C7178b;
import no.C7828f;
import no.C7832g0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/m;", "Landroidx/lifecycle/o;", "lifecycle-common"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LifecycleCoroutineScopeImpl extends AbstractC1045m implements InterfaceC1049o {

    /* JADX INFO: renamed from: a */
    public final Lifecycle f6527a;

    /* JADX INFO: renamed from: b */
    public final CoroutineContext f6528b;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "coroutineContext");
        this.f6527a = lifecycle;
        this.f6528b = coroutineContext;
        if (lifecycle.mo3884b() == Lifecycle.State.DESTROYED) {
            C0062b.m330a0(coroutineContext, null);
        }
    }

    @Override // no.InterfaceC7882z
    /* JADX INFO: renamed from: G0, reason: from getter */
    public final CoroutineContext getF6528b() {
        return this.f6528b;
    }

    @Override // androidx.view.AbstractC1045m
    /* JADX INFO: renamed from: a */
    public final Lifecycle mo3890a() {
        return this.f6527a;
    }

    @Override // androidx.view.InterfaceC1049o
    /* JADX INFO: renamed from: e */
    public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
        Lifecycle lifecycle = this.f6527a;
        if (lifecycle.mo3884b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            lifecycle.mo3885c(this);
            C0062b.m330a0(this.f6528b, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3891f() {
        C7178b c7178b = C7832g0.f42930a;
        C7828f.m15570d(this, C7162l.f40438a.mo14316C1(), null, new LifecycleCoroutineScopeImpl$register$1(this, null), 2);
    }
}
