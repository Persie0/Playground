package p000;

import android.app.Service;
import android.app.job.JobParameters;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.protobuf.C1191l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class wlc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67026a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f67027b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f67028c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f67029d;

    public wlc(v4d v4dVar, AtomicReference atomicReference, zzr zzrVar) {
        this.f67026a = 2;
        this.f67029d = atomicReference;
        this.f67027b = zzrVar;
        Objects.requireNonNull(v4dVar);
        this.f67028c = v4dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        AtomicReference atomicReference;
        switch (this.f67026a) {
            case 0:
                zzbh zzbhVar = (zzbh) this.f67029d;
                zzr zzrVar = (zzr) this.f67027b;
                eoc eocVar = (eoc) this.f67028c;
                eocVar.getClass();
                C1045d c1045d = eocVar.f37647f;
                if ("_cmp".equals(zzbhVar.f12389a) && (zzbfVar = zzbhVar.f12390b) != null) {
                    Bundle bundle = zzbfVar.f12388a;
                    if (bundle.size() != 0) {
                        String string = bundle.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            c1045d.mo5909b().f68086l.m17924b(zzbhVar.toString(), "Event has been filtered ");
                            zzbhVar = new zzbh("_cmpx", zzbfVar, zzbhVar.f12391c, zzbhVar.f12392d, zzbhVar.f12393e);
                        }
                    }
                }
                String str = zzbhVar.f12389a;
                shc shcVar = c1045d.f12356a;
                dad dadVar = c1045d.f12367g;
                C1045d.m5885T(shcVar);
                String str2 = zzrVar.f12432a;
                orb orbVar = TextUtils.isEmpty(str2) ? null : (orb) shcVar.f60881k.m238d(str2);
                if (orbVar == null) {
                    c1045d.mo5909b().f68076I.m17924b(zzrVar.f12432a, "EES not loaded for");
                    c1045d.m5902V();
                    c1045d.m5925j(zzbhVar, zzrVar);
                    return;
                }
                try {
                    mq7 mq7Var = orbVar.f54802c;
                    C1045d.m5885T(dadVar);
                    HashMap mapM10241r0 = dad.m10241r0(zzbhVar.f12390b.m5952g0(), true);
                    String strM6880e = C1191l.m6880e(str, AbstractC3184kh.f47276r, AbstractC3184kh.f47271m);
                    if (strM6880e == null) {
                        strM6880e = str;
                    }
                    if (orbVar.m18330a(new ofb(strM6880e, zzbhVar.f12392d, mapM10241r0))) {
                        if (mq7Var.m17005q().equals(mq7Var.m17003n())) {
                            c1045d.m5902V();
                            c1045d.m5925j(zzbhVar, zzrVar);
                        } else {
                            c1045d.mo5909b().f68076I.m17924b(str, "EES edited event");
                            C1045d.m5885T(dadVar);
                            zzbh zzbhVarM10220H = dad.m10220H(mq7Var.m17005q());
                            c1045d.m5902V();
                            c1045d.m5925j(zzbhVarM10220H, zzrVar);
                        }
                        if (((ArrayList) mq7Var.m17006r()).isEmpty()) {
                            return;
                        }
                        for (ofb ofbVar : (ArrayList) mq7Var.m17006r()) {
                            c1045d.mo5909b().f68076I.m17924b(ofbVar.m17968b(), "EES logging created event");
                            C1045d.m5885T(dadVar);
                            zzbh zzbhVarM10220H2 = dad.m10220H(ofbVar);
                            c1045d.m5902V();
                            c1045d.m5925j(zzbhVarM10220H2, zzrVar);
                        }
                        return;
                    }
                } catch (zzd unused) {
                    c1045d.mo5909b().f68080f.m17925c("EES error. appId, eventName", zzrVar.f12434b, str);
                }
                c1045d.mo5909b().f68076I.m17924b(str, "EES was not applied to event");
                c1045d.m5902V();
                c1045d.m5925j(zzbhVar, zzrVar);
                return;
            case 1:
                C1045d c1045d2 = ((eoc) this.f67028c).f37647f;
                c1045d2.m5902V();
                zzpl zzplVar = (zzpl) this.f67029d;
                Object objZza = zzplVar.zza();
                zzr zzrVar2 = (zzr) this.f67027b;
                if (objZza == null) {
                    c1045d2.m5904X(zzplVar.f12407b, zzrVar2);
                    return;
                } else {
                    c1045d2.m5903W(zzplVar, zzrVar2);
                    return;
                }
            case 2:
                AtomicReference atomicReference2 = (AtomicReference) this.f67029d;
                synchronized (atomicReference2) {
                    try {
                        try {
                            v4d v4dVar = (v4d) this.f67028c;
                            kjc kjcVar = (kjc) v4dVar.f60774a;
                            qfc qfcVar = kjcVar.f47437e;
                            kjc.m15278j(qfcVar);
                            if (qfcVar.m19933K().m17590i(zzjk.ANALYTICS_STORAGE)) {
                                q9c q9cVar = v4dVar.f64866d;
                                if (q9cVar != null) {
                                    atomicReference2.set(q9cVar.mo11284B((zzr) this.f67027b));
                                    String str3 = (String) atomicReference2.get();
                                    if (str3 != null) {
                                        C1043b c1043b = ((kjc) v4dVar.f60774a).f47414H;
                                        kjc.m15279k(c1043b);
                                        c1043b.f12329g.set(str3);
                                        qfc qfcVar2 = kjcVar.f47437e;
                                        kjc.m15278j(qfcVar2);
                                        qfcVar2.f57729g.m20981p(str3);
                                    }
                                    v4dVar.m23116Q();
                                    atomicReference = (AtomicReference) this.f67029d;
                                    atomicReference.notify();
                                    return;
                                }
                                xcc xccVar = kjcVar.f47438f;
                                kjc.m15280l(xccVar);
                                xccVar.f68080f.m17923a("Failed to get app instance id");
                            } else {
                                xcc xccVar2 = kjcVar.f47438f;
                                kjc.m15280l(xccVar2);
                                xccVar2.f68085k.m17923a("Analytics storage consent denied; will not get app instance id");
                                C1043b c1043b2 = ((kjc) v4dVar.f60774a).f47414H;
                                kjc.m15279k(c1043b2);
                                c1043b2.f12329g.set(null);
                                qfc qfcVar3 = kjcVar.f47437e;
                                kjc.m15278j(qfcVar3);
                                qfcVar3.f57729g.m20981p(null);
                                atomicReference2.set(null);
                            }
                            atomicReference2.notify();
                            return;
                        } catch (RemoteException e) {
                            xcc xccVar3 = ((kjc) ((v4d) this.f67028c).f60774a).f47438f;
                            kjc.m15280l(xccVar3);
                            xccVar3.f68080f.m17924b(e, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.f67029d;
                        }
                    } catch (Throwable th) {
                        ((AtomicReference) this.f67029d).notify();
                        throw th;
                    }
                }
                break;
            case 3:
                nr9 nr9Var = (nr9) this.f67029d;
                xcc xccVar4 = (xcc) this.f67027b;
                JobParameters jobParameters = (JobParameters) this.f67028c;
                xccVar4.f68076I.m17923a("AppMeasurementJobService processed last upload request.");
                ((i5d) ((Service) nr9Var.f53173a)).mo5842c(jobParameters);
                return;
            default:
                if (((Ref$ObjectRef) this.f67029d).f47718a != null) {
                    ho2.m13383c();
                    return;
                }
                gmd gmdVar = (gmd) this.f67027b;
                wnc wncVar = (wnc) this.f67028c;
                fmd fmdVarM20022c = qld.m20022c();
                gmd gmdVarM20021b = qld.m20021b(fmdVarM20022c, gmdVar);
                try {
                    wncVar.run();
                    qld.m20021b(fmdVarM20022c, gmdVarM20021b);
                    return;
                } catch (Throwable th2) {
                    try {
                        pld.m19392a(th2);
                        throw th2;
                    } catch (Throwable th3) {
                        qld.m20021b(fmdVarM20022c, gmdVarM20021b);
                        throw th3;
                    }
                }
        }
    }

    public String toString() {
        switch (this.f67026a) {
            case 4:
                wnc wncVar = (wnc) this.f67028c;
                StringBuilder sb = new StringBuilder(wncVar.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(wncVar);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ wlc(eoc eocVar, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar, int i) {
        this.f67026a = i;
        this.f67029d = abstractSafeParcelable;
        this.f67027b = zzrVar;
        this.f67028c = eocVar;
    }

    public /* synthetic */ wlc(Object obj, Object obj2, Object obj3, int i) {
        this.f67026a = i;
        this.f67029d = obj;
        this.f67027b = obj2;
        this.f67028c = obj3;
    }
}
