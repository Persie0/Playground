package com.lingq.p055ui.home.vocabulary.filter;

import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.FilterType;
import dm.C5207g;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC7137r;
import p097ej.C5416g;
import p097ej.InterfaceC5415f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/home/vocabulary/filter/VocabularyParentFilterViewModel;", "Landroidx/lifecycle/h0;", "Lej/f;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class VocabularyParentFilterViewModel extends AbstractC1036h0 implements InterfaceC5415f {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC5415f f26527d;

    public VocabularyParentFilterViewModel(C5416g c5416g, C1024c0 c1024c0) {
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f26527d = c5416g;
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: Y0 */
    public final void mo10040Y0() {
        this.f26527d.mo10040Y0();
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: e1 */
    public final void mo10046e1() {
        this.f26527d.mo10046e1();
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: e2 */
    public final InterfaceC7137r<Boolean> mo10047e2() {
        return this.f26527d.mo10047e2();
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: h1 */
    public final void mo10050h1(FilterType filterType) {
        C5207g.m11111f(filterType, "filterType");
        this.f26527d.mo10050h1(filterType);
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: k */
    public final InterfaceC7137r<Boolean> mo10052k() {
        return this.f26527d.mo10052k();
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: n1 */
    public final InterfaceC7137r<FilterType> mo10055n1() {
        return this.f26527d.mo10055n1();
    }
}
