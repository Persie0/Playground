package androidx.view;

import androidx.p544savedstate.C1189a;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/o;", "lifecycle-viewmodel-savedstate_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SavedStateHandleController implements InterfaceC1049o {

    /* JADX INFO: renamed from: a */
    public final String f6586a;

    /* JADX INFO: renamed from: b */
    public final C1024c0 f6587b;

    /* JADX INFO: renamed from: c */
    public boolean f6588c;

    public SavedStateHandleController(String str, C1024c0 c1024c0) {
        this.f6586a = str;
        this.f6587b = c1024c0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m3907a(Lifecycle lifecycle, C1189a c1189a) {
        C5207g.m11111f(c1189a, "registry");
        C5207g.m11111f(lifecycle, "lifecycle");
        if (!(!this.f6588c)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f6588c = true;
        lifecycle.mo3883a(this);
        c1189a.m4586c(this.f6586a, this.f6587b.f6620e);
    }

    @Override // androidx.view.InterfaceC1049o
    /* JADX INFO: renamed from: e */
    public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f6588c = false;
            interfaceC1051q.mo786G().mo3885c(this);
        }
    }
}
