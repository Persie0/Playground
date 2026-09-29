package androidx.view;

import android.os.Bundle;
import androidx.p544savedstate.C1189a;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.Map;
import kotlin.C6740a;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandlesProvider implements C1189a.b {

    /* JADX INFO: renamed from: a */
    public final C1189a f6593a;

    /* JADX INFO: renamed from: b */
    public boolean f6594b;

    /* JADX INFO: renamed from: c */
    public Bundle f6595c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9070c f6596d;

    public SavedStateHandlesProvider(C1189a c1189a, final InterfaceC1048n0 interfaceC1048n0) {
        C5207g.m11111f(c1189a, "savedStateRegistry");
        C5207g.m11111f(interfaceC1048n0, "viewModelStoreOwner");
        this.f6593a = c1189a;
        this.f6596d = C6740a.m13372a(new InterfaceC2041a<C1028d0>() { // from class: androidx.lifecycle.SavedStateHandlesProvider$viewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1028d0 mo807E() {
                return SavedStateHandleSupport.m3910c(interfaceC1048n0);
            }
        });
    }

    @Override // androidx.p544savedstate.C1189a.b
    /* JADX INFO: renamed from: a */
    public final Bundle mo811a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f6595c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C1028d0) this.f6596d.getValue()).f6637d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo811a = ((C1024c0) entry.getValue()).f6620e.mo811a();
            if (!C5207g.m11106a(bundleMo811a, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleMo811a);
            }
        }
        this.f6594b = false;
        return bundle;
    }
}
