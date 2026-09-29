package p000;

import com.amplitude.android.AutocaptureOption;
import com.amplitude.core.diagnostics.C0905a;
import com.amplitude.core.remoteconfig.C0912a;
import com.amplitude.core.remoteconfig.RemoteConfigClient$Key;
import java.util.Set;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class t50 {

    /* JADX INFO: renamed from: a */
    public final pj5 f61868a;

    /* JADX INFO: renamed from: b */
    public final C0905a f61869b;

    /* JADX INFO: renamed from: c */
    public final C3244l f61870c;

    /* JADX INFO: renamed from: d */
    public final c18 f61871d;

    public t50(Set set, v84 v84Var, C0912a c0912a, pj5 pj5Var, C0905a c0905a) {
        set.getClass();
        v84Var.getClass();
        pj5Var.getClass();
        this.f61868a = pj5Var;
        this.f61869b = c0905a;
        ListBuilder listBuilderM23650t = vz1.m23650t();
        if (set.contains(AutocaptureOption.ELEMENT_INTERACTIONS)) {
            listBuilderM23650t.add(s84.f60508a);
        }
        if (set.contains(AutocaptureOption.FRUSTRATION_INTERACTIONS)) {
            listBuilderM23650t.add(t84.f61982a);
            listBuilderM23650t.add(r84.f58876a);
        }
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new v50(set.contains(AutocaptureOption.SESSIONS), set.contains(AutocaptureOption.APP_LIFECYCLES), set.contains(AutocaptureOption.SCREEN_VIEWS), set.contains(AutocaptureOption.DEEP_LINKS), vz1.m23635i(listBuilderM23650t)));
        this.f61870c = c3244lM17114d;
        this.f61871d = AbstractC3224d.m15524c(c3244lM17114d);
        v50 v50Var = (v50) c3244lM17114d.getValue();
        if (c0905a != null) {
            c0905a.m5125h("autocapture.enabled", v50Var.toString());
        }
        if (c0912a != null) {
            c0912a.m5152f(RemoteConfigClient$Key.ANALYTICS_SDK, new s50(this, 0));
        }
    }
}
