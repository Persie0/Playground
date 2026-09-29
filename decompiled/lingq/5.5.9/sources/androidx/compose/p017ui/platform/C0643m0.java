package androidx.compose.p017ui.platform;

import android.os.Bundle;
import androidx.compose.runtime.saveable.C0489c;
import androidx.compose.runtime.saveable.InterfaceC0488b;
import androidx.p544savedstate.C1189a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.ui.platform.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0643m0 implements C1189a.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0488b f4327a;

    public C0643m0(C0489c c0489c) {
        this.f4327a = c0489c;
    }

    @Override // androidx.p544savedstate.C1189a.b
    /* JADX INFO: renamed from: a */
    public final Bundle mo811a() {
        Map<String, List<Object>> mapMo1862b = this.f4327a.mo1862b();
        Bundle bundle = new Bundle();
        for (Map.Entry<String, List<Object>> entry : mapMo1862b.entrySet()) {
            String key = entry.getKey();
            List<Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }
}
