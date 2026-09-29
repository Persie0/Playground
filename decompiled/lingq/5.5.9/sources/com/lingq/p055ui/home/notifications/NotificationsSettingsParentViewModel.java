package com.lingq.p055ui.home.notifications;

import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC7137r;
import p014aj.C0101r;
import p014aj.InterfaceC0100q;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/home/notifications/NotificationsSettingsParentViewModel;", "Landroidx/lifecycle/h0;", "Laj/q;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class NotificationsSettingsParentViewModel extends AbstractC1036h0 implements InterfaceC0100q {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0100q f25349d;

    public NotificationsSettingsParentViewModel(C0101r c0101r, C1024c0 c1024c0) {
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f25349d = c0101r;
    }

    @Override // p014aj.InterfaceC0100q
    /* JADX INFO: renamed from: c0 */
    public final void mo487c0() {
        this.f25349d.mo487c0();
    }

    @Override // p014aj.InterfaceC0100q
    /* JADX INFO: renamed from: d0 */
    public final InterfaceC7137r<Boolean> mo488d0() {
        return this.f25349d.mo488d0();
    }

    @Override // p014aj.InterfaceC0100q
    /* JADX INFO: renamed from: m1 */
    public final InterfaceC7137r<String> mo489m1() {
        return this.f25349d.mo489m1();
    }
}
