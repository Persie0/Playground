package com.lingq.p055ui.home.collections.filter;

import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.FilterType;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.coroutines.flow.InterfaceC7137r;
import p417ui.InterfaceC9530a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/home/collections/filter/CollectionsSearchParentFilterViewModel;", "Landroidx/lifecycle/h0;", "Lui/a;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CollectionsSearchParentFilterViewModel extends AbstractC1036h0 implements InterfaceC9530a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC9530a f23668d;

    public CollectionsSearchParentFilterViewModel(InterfaceC9530a interfaceC9530a, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC9530a, "collectionsSearchFilterDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f23668d = interfaceC9530a;
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: B1 */
    public final void mo9828B1() {
        this.f23668d.mo9828B1();
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: Q */
    public final InterfaceC7137r<Pair<FilterType, String>> mo9829Q() {
        return this.f23668d.mo9829Q();
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: g1 */
    public final InterfaceC7137r<Boolean> mo9833g1() {
        return this.f23668d.mo9833g1();
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: r1 */
    public final void mo9839r1(Pair<? extends FilterType, String> pair) {
        this.f23668d.mo9839r1(pair);
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: s1 */
    public final InterfaceC7137r<Boolean> mo9841s1() {
        return this.f23668d.mo9841s1();
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: u1 */
    public final void mo9842u1() {
        this.f23668d.mo9842u1();
    }
}
