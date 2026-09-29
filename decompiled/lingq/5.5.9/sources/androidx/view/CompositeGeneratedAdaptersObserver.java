package androidx.view;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/o;", "lifecycle-common"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CompositeGeneratedAdaptersObserver implements InterfaceC1049o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1035h[] f6515a;

    public CompositeGeneratedAdaptersObserver(InterfaceC1035h[] interfaceC1035hArr) {
        this.f6515a = interfaceC1035hArr;
    }

    @Override // androidx.view.InterfaceC1049o
    /* JADX INFO: renamed from: e */
    public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
        new HashMap();
        InterfaceC1035h[] interfaceC1035hArr = this.f6515a;
        for (InterfaceC1035h interfaceC1035h : interfaceC1035hArr) {
            interfaceC1035h.m3939a();
        }
        for (InterfaceC1035h interfaceC1035h2 : interfaceC1035hArr) {
            interfaceC1035h2.m3939a();
        }
    }
}
