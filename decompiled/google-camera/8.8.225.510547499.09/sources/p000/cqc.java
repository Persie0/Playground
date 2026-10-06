package p000;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cqc implements nom {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f8812a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8813b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f8814c;

    public /* synthetic */ cqc(cpd cpdVar, csn csnVar, int i) {
        this.f8814c = i;
        this.f8812a = cpdVar;
        this.f8813b = csnVar;
    }

    public /* synthetic */ cqc(cqg cqgVar, ctg ctgVar, int i) {
        this.f8814c = i;
        this.f8812a = cqgVar;
        this.f8813b = ctgVar;
    }

    public /* synthetic */ cqc(fuc fucVar, kba kbaVar, int i) {
        this.f8814c = i;
        this.f8812a = fucVar;
        this.f8813b = kbaVar;
    }

    public /* synthetic */ cqc(fyf fyfVar, grm grmVar, int i) {
        this.f8814c = i;
        this.f8812a = fyfVar;
        this.f8813b = grmVar;
    }

    public /* synthetic */ cqc(lor lorVar, pat patVar, int i) {
        this.f8814c = i;
        this.f8812a = lorVar;
        this.f8813b = patVar;
    }

    public /* synthetic */ cqc(lpj lpjVar, String str, int i) {
        this.f8814c = i;
        this.f8812a = lpjVar;
        this.f8813b = str;
    }

    public /* synthetic */ cqc(ltn ltnVar, nps npsVar, int i) {
        this.f8814c = i;
        this.f8812a = ltnVar;
        this.f8813b = npsVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [fuc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kba] */
    @Override // p000.nom
    /* JADX INFO: renamed from: a */
    public final nps mo3942a(Object obj) {
        nps npsVarM14965K;
        boolean zM15886a = true;
        switch (this.f8814c) {
            case 0:
                Object obj2 = this.f8812a;
                Object obj3 = this.f8813b;
                synchronized (((cqg) obj2).f8854f) {
                    if (((cqg) obj2).f8830E != cqf.STOPPING_RECORDING) {
                        npsVarM14965K = kxk.m14964J(new IllegalStateException("doStop when state=" + String.valueOf(((cqg) obj2).f8830E)));
                    } else {
                        if (((cqg) obj2).f8860l.f9330B) {
                            ((cqg) obj2).f8834I.m6415c();
                            ((cqg) obj2).f8870v.m5745c(false);
                        }
                        ((cqg) obj2).f8855g.m5533f();
                        ((cqg) obj2).f8868t.m10437h(hlh.VIDEO_RECORDER_STOPPED);
                        ((cqg) obj2).f8863o.mo5683d();
                        ((cqg) obj2).f8833H.mo13952a();
                        ((cqg) obj2).m5354j(cqf.STOPPED);
                        if (((jwf) ((cqg) obj2).f8861m.f9277g).f34942d == csj.RECORDING_SESSION_ACTIVE) {
                            ((cqg) obj2).f8861m.m5463a(csj.f9247c);
                        }
                        ((cqg) obj2).m5355k((ctg) obj3);
                        ScheduledFuture scheduledFuture = ((cqg) obj2).f8828C;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        npsVarM14965K = kxk.m14965K(((cqg) obj2).f8826A);
                    }
                }
                return npsVarM14965K;
            case 1:
                Object obj4 = this.f8812a;
                Object obj5 = this.f8813b;
                mrm mrmVar = (mrm) obj;
                if (mrmVar.mo16813g()) {
                    return kxk.m14965K((Surface) mrmVar.mo16809c());
                }
                cpd cpdVar = (cpd) obj4;
                return nod.m17553i(cpdVar.f8528f.m5359b((csn) obj5), new ceg(cpdVar, 7), cpdVar.f8523a);
            case 2:
                ?? r0 = this.f8812a;
                ?? r1 = this.f8813b;
                Throwable th = (Throwable) obj;
                ((nbe) ((nbe) ((nbe) fvs.f23675a.m17251b()).mo17283h(th)).mo17276G((char) 2525)).mo17290o("Exception occurred while starting camera");
                r0.close();
                r1.close();
                return kxk.m14964J(th);
            case 3:
                fyf fyfVar = (fyf) this.f8812a;
                grm grmVar = (grm) this.f8813b;
                return ((drc) fyfVar.f23886e.f23892d.get()).mo6564a(new cvy(grmVar.f26152a, grmVar.f26160i, (kpp) obj, mrm.m16828h(fyfVar.f23886e.f23895g.mo9758c(grmVar.f26152a.mo7248d()))));
            case 4:
                Object obj6 = this.f8812a;
                Object obj7 = this.f8813b;
                loe loeVar = (loe) obj;
                lor lorVar = (lor) obj6;
                ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter = lorVar.f38841b;
                Context context = lorVar.f38840a;
                nxl nxlVar = (nxl) loeVar.m18143ad(5);
                nxlVar.m18108s(loeVar);
                nxn nxnVar = (nxn) nxlVar;
                if (!nxnVar.f44974b.m18142ac()) {
                    nxnVar.mo18106p();
                }
                loe loeVar2 = (loe) nxnVar.f44974b;
                loe loeVar3 = loe.f38797c;
                obj7.getClass();
                loeVar2.f38800b = (pat) obj7;
                loeVar2.f38799a |= 1;
                return clearcutMetricSnapshotTransmitter.mo4717a(context, (loe) nxnVar.mo18103l());
            case 5:
                Object obj8 = this.f8812a;
                Object obj9 = this.f8813b;
                lpw lpwVar = lqp.f38996a;
                mwn mwnVarM17090e = mws.m17090e();
                lpj lpjVar = (lpj) obj8;
                mwnVarM17090e.m17082g(lpjVar.f38894c);
                int i = kuh.f37221a;
                mwnVarM17090e.m17082g(kuh.m14886a(lpjVar.f38894c));
                mws mwsVarM17081f = mwnVarM17090e.m17081f();
                int i2 = ((mzr) mwsVarM17081f).f41859c;
                for (int i3 = 0; i3 < i2; i3++) {
                    File file = new File(String.valueOf(((Context) mwsVarM17081f.get(i3)).getFilesDir()) + "/phenotype/shared/" + ((String) obj9));
                    if (file.exists()) {
                        zM15886a = lqp.m15886a(file);
                    }
                }
                return zM15886a ? npp.f44031a : kxk.m14964J(new IOException("Unable to remove snapshots for removed user"));
            default:
                Object obj10 = this.f8812a;
                ?? r2 = this.f8813b;
                ltn ltnVar = (ltn) obj10;
                ltnVar.m15975c((Uri) kxk.m14973S(ltnVar.f39179b), obj);
                synchronized (ltnVar.f39182e) {
                    ((ltn) obj10).f39183f = r2;
                    break;
                }
                return npp.f44031a;
        }
    }
}
