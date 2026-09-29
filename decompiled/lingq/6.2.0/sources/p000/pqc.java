package p000;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.C1043b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pqc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56706a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1043b f56707b;

    public /* synthetic */ pqc(C1043b c1043b, int i) {
        this.f56706a = i;
        this.f56707b = c1043b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f56706a;
        C1043b c1043b = this.f56707b;
        switch (i) {
            case 0:
                c1043b.m5870a0();
                break;
            case 1:
                gw9 gw9Var = c1043b.f12319L;
                kjc kjcVar = (kjc) gw9Var.f41432b;
                tic ticVar = kjcVar.f47439g;
                C1043b c1043b2 = kjcVar.f47414H;
                qfc qfcVar = kjcVar.f47437e;
                kjc.m15280l(ticVar);
                ticVar.mo12359D();
                if (gw9Var.m12942m()) {
                    if (gw9Var.m12941l()) {
                        kjc.m15278j(qfcVar);
                        qfcVar.f57722R.m20981p(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        kjc.m15279k(c1043b2);
                        c1043b2.m5854K("auto", "_cmpx", bundle);
                    } else {
                        kjc.m15278j(qfcVar);
                        C3552rx c3552rx = qfcVar.f57722R;
                        String strM20980o = c3552rx.m20980o();
                        if (TextUtils.isEmpty(strM20980o)) {
                            xcc xccVar = kjcVar.f47438f;
                            kjc.m15280l(xccVar);
                            xccVar.f68081g.m17923a("Cache still valid but referrer not found");
                        } else {
                            long j = 3600000;
                            long jM19952g = qfcVar.f57723S.m19952g() / 3600000;
                            Uri uri = Uri.parse(strM20980o);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                                j = j;
                            }
                            ((Bundle) pair.second).putLong("_cc", (jM19952g - 1) * j);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            kjc.m15279k(c1043b2);
                            c1043b2.m5854K(str2, "_cmp", (Bundle) pair.second);
                        }
                        c3552rx.m20981p(null);
                    }
                    kjc.m15278j(qfcVar);
                    qfcVar.f57723S.m19953h(0L);
                    break;
                }
                break;
            case 2:
                c1043b.mo12359D();
                kjc kjcVar2 = (kjc) c1043b.f60774a;
                qfc qfcVar2 = kjcVar2.f47437e;
                xcc xccVar2 = kjcVar2.f47438f;
                kjc.m15278j(qfcVar2);
                uec uecVar = qfcVar2.f57719O;
                if (uecVar.m22719a()) {
                    kjc.m15280l(xccVar2);
                    xccVar2.f68075H.m17923a("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    qg9 qg9Var = qfcVar2.f57720P;
                    long jM19952g2 = qg9Var.m19952g();
                    qg9Var.m19953h(1 + jM19952g2);
                    if (jM19952g2 >= 5) {
                        kjc.m15280l(xccVar2);
                        xccVar2.f68083i.m17923a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        uecVar.m22720b(true);
                    } else {
                        if (c1043b.f12321N == null) {
                            c1043b.f12321N = new tqc((uoc) c1043b, (uoc) kjcVar2, 2);
                        }
                        c1043b.f12321N.m25215b(0L);
                    }
                }
                break;
            default:
                c1043b.m5870a0();
                break;
        }
    }
}
