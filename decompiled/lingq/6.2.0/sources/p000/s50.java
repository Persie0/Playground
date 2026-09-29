package p000;

import com.amplitude.core.diagnostics.C0905a;
import com.amplitude.core.remoteconfig.RemoteConfigClient$Source;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60311a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f60312b;

    public /* synthetic */ s50(Object obj, int i) {
        this.f60311a = i;
        this.f60312b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m21080a(Map map, RemoteConfigClient$Source remoteConfigClient$Source) {
        boolean z;
        int i = this.f60311a;
        Object obj = this.f60312b;
        switch (i) {
            case 0:
                t50 t50Var = (t50) obj;
                map.getClass();
                remoteConfigClient$Source.getClass();
                pj5 pj5Var = t50Var.f61868a;
                C3244l c3244l = t50Var.f61870c;
                v50 v50Var = (v50) c3244l.getValue();
                Object obj2 = map.get("autocapture");
                Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
                if (map2 != null) {
                    boolean z2 = v50Var.f64874a;
                    List list = v50Var.f64878e;
                    boolean zM21496a = snc.m21496a("sessions", map2, z2);
                    boolean zM21496a2 = snc.m21496a("appLifecycles", map2, v50Var.f64875b);
                    boolean zM21496a3 = snc.m21496a("pageViews", map2, v50Var.f64876c);
                    boolean zM21496a4 = snc.m21496a("deepLinks", map2, v50Var.f64877d);
                    ListBuilder listBuilderM23650t = vz1.m23650t();
                    s84 s84Var = s84.f60508a;
                    if (snc.m21496a("elementInteractions", map2, list.contains(s84Var))) {
                        listBuilderM23650t.add(s84Var);
                    }
                    Object obj3 = map2.get("frustrationInteractions");
                    Map map3 = obj3 instanceof Map ? (Map) obj3 : null;
                    r84 r84Var = r84.f58876a;
                    t84 t84Var = t84.f61982a;
                    if (map3 != null) {
                        boolean zContains = list.contains(t84Var);
                        boolean zContains2 = list.contains(r84Var);
                        if (snc.m21496a("enabled", map3, zContains || zContains2)) {
                            Object obj4 = map3.get("rageClick");
                            z = zM21496a;
                            Map map4 = obj4 instanceof Map ? (Map) obj4 : null;
                            if (map4 != null) {
                                zContains = snc.m21496a("enabled", map4, zContains);
                            }
                            if (zContains) {
                                listBuilderM23650t.add(t84Var);
                            }
                            Object obj5 = map3.get("deadClick");
                            Map map5 = obj5 instanceof Map ? (Map) obj5 : null;
                            if (map5 != null) {
                                zContains2 = snc.m21496a("enabled", map5, zContains2);
                            }
                            if (zContains2) {
                                listBuilderM23650t.add(r84Var);
                            }
                        } else {
                            z = zM21496a;
                        }
                    } else {
                        z = zM21496a;
                        if (list.contains(t84Var)) {
                            listBuilderM23650t.add(t84Var);
                        }
                        if (list.contains(r84Var)) {
                            listBuilderM23650t.add(r84Var);
                        }
                    }
                    v50 v50Var2 = new v50(z, zM21496a2, zM21496a3, zM21496a4, vz1.m23635i(listBuilderM23650t));
                    if (!v50Var2.equals(v50Var)) {
                        c3244l.m15572j(null, v50Var2);
                        C0905a c0905a = t50Var.f61869b;
                        if (c0905a != null) {
                            c0905a.m5125h("autocapture.enabled", v50Var2.toString());
                        }
                        pj5Var.mo16256b("AutocaptureManager: Updated state from remote config: " + v50Var2);
                    } else {
                        pj5Var.mo16256b("AutocaptureManager: Remote config unchanged, skipping update");
                    }
                } else {
                    pj5Var.mo16256b("AutocaptureManager: Missing 'autocapture' root in analytics remote config");
                }
                break;
            default:
                C0905a c0905a2 = (C0905a) obj;
                map.getClass();
                remoteConfigClient$Source.getClass();
                Object obj6 = map.get("enabled");
                Boolean bool = obj6 instanceof Boolean ? (Boolean) obj6 : null;
                Object obj7 = map.get("sampleRate");
                Number number = obj7 instanceof Number ? (Number) obj7 : null;
                Double dValueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
                c0905a2.f11053c.mo16256b("DiagnosticsClient: Did fetch remote config with sampleRate: " + dValueOf);
                c0905a2.f11068r.mo4677k(new jd2(bool, dValueOf));
                break;
        }
    }
}
