package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class htc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1043b f42935b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bundle f42936c;

    public /* synthetic */ htc(C1043b c1043b, Bundle bundle, int i) {
        this.f42934a = i;
        this.f42936c = bundle;
        this.f42935b = c1043b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f42934a;
        Bundle bundle = this.f42936c;
        C1043b c1043b = this.f42935b;
        switch (i) {
            case 0:
                c1043b.mo12359D();
                c1043b.m13744E();
                String string = bundle.getString("name");
                lda.m16127m(string);
                kjc kjcVar = (kjc) c1043b.f60774a;
                if (!kjcVar.m15282f()) {
                    xcc xccVar = kjcVar.f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68076I.m17923a("Conditional property not cleared since app measurement is disabled");
                } else {
                    zzpl zzplVar = new zzpl(0L, null, string, "");
                    try {
                        rad radVar = kjcVar.f47441i;
                        kjc.m15278j(radVar);
                        bundle.getString("app_id");
                        kjcVar.m15287o().m23122W(new zzah(bundle.getString("app_id"), "", zzplVar, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), radVar.m20546j0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            default:
                nr9 nr9Var = c1043b.f12324Q;
                kjc kjcVar2 = (kjc) c1043b.f60774a;
                if (!bundle.isEmpty()) {
                    qfc qfcVar = kjcVar2.f47437e;
                    rad radVar2 = kjcVar2.f47441i;
                    cmb cmbVar = kjcVar2.f47436d;
                    xcc xccVar2 = kjcVar2.f47438f;
                    kjc.m15278j(qfcVar);
                    Bundle bundle2 = new Bundle(qfcVar.f57724T.m17688P());
                    for (String str : bundle.keySet()) {
                        Object obj = bundle.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            kjc.m15278j(radVar2);
                            if (rad.m20502O0(obj)) {
                                rad.m20503V(nr9Var, null, 27, null, null, 0);
                            }
                            kjc.m15280l(xccVar2);
                            xccVar2.f68085k.m17925c("Invalid default event parameter type. Name, value", str, obj);
                        } else if (rad.m20510g0(str)) {
                            kjc.m15280l(xccVar2);
                            xccVar2.f68085k.m17924b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle2.remove(str);
                        } else {
                            kjc.m15278j(radVar2);
                            cmbVar.getClass();
                            if (radVar2.m20520H(500, obj, "param", str)) {
                                radVar2.m20539U(bundle2, str, obj);
                            }
                        }
                    }
                    kjc.m15278j(radVar2);
                    rad radVar3 = ((kjc) cmbVar.f60774a).f47441i;
                    kjc.m15278j(radVar3);
                    int i2 = radVar3.m20548m0(201500000) ? 100 : 25;
                    if (bundle2.size() > i2) {
                        int i3 = 0;
                        for (String str2 : new TreeSet(bundle2.keySet())) {
                            i3++;
                            if (i3 > i2) {
                                bundle2.remove(str2);
                            }
                        }
                        kjc.m15278j(radVar2);
                        rad.m20503V(nr9Var, null, 26, null, null, 0);
                        kjc.m15280l(xccVar2);
                        xccVar2.f68085k.m17923a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle = bundle2;
                }
                qfc qfcVar2 = kjcVar2.f47437e;
                kjc.m15278j(qfcVar2);
                qfcVar2.f57724T.m17689Q(bundle);
                kjcVar2.m15287o().m23108I(bundle);
                break;
        }
    }
}
