package androidx.view;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/o;", "lifecycle-viewmodel-savedstate_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SavedStateHandleAttacher implements InterfaceC1049o {

    /* JADX INFO: renamed from: a */
    public final SavedStateHandlesProvider f6585a;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        this.f6585a = savedStateHandlesProvider;
    }

    @Override // androidx.view.InterfaceC1049o
    /* JADX INFO: renamed from: e */
    public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
        if (!(event == Lifecycle.Event.ON_CREATE)) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
        interfaceC1051q.mo786G().mo3885c(this);
        SavedStateHandlesProvider savedStateHandlesProvider = this.f6585a;
        if (savedStateHandlesProvider.f6594b) {
            return;
        }
        savedStateHandlesProvider.f6595c = savedStateHandlesProvider.f6593a.m4584a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        savedStateHandlesProvider.f6594b = true;
    }
}
