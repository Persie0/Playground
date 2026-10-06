package p000;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.StrictMode;
import android.util.Log;
import androidx.wear.ambient.AmbientMode;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p021j$.util.Collection$EL;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bey implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f3074a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3075b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f3076c;

    public /* synthetic */ bey(ConstraintTrackingWorker constraintTrackingWorker, nps npsVar, int i) {
        this.f3076c = i;
        this.f3074a = constraintTrackingWorker;
        this.f3075b = npsVar;
    }

    public bey(bbr bbrVar, String str, int i) {
        this.f3076c = i;
        this.f3074a = bbrVar;
        this.f3075b = str;
    }

    public bey(bmk bmkVar, bms bmsVar, int i) {
        this.f3076c = i;
        this.f3074a = bmkVar;
        this.f3075b = bmsVar;
    }

    public bey(bms bmsVar, byte[] bArr, int i) {
        this.f3076c = i;
        this.f3074a = bmsVar;
        this.f3075b = bArr;
    }

    public bey(bna bnaVar, byte[] bArr, int i) {
        this.f3076c = i;
        this.f3074a = bnaVar;
        this.f3075b = bArr;
    }

    public bey(bnb bnbVar, Camera.AutoFocusCallback autoFocusCallback, int i) {
        this.f3076c = i;
        this.f3075b = bnbVar;
        this.f3074a = autoFocusCallback;
    }

    public bey(bnf bnfVar, byte[] bArr, int i) {
        this.f3076c = i;
        this.f3074a = bnfVar;
        this.f3075b = bArr;
    }

    public bey(bnn bnnVar, bnq bnqVar, int i) {
        this.f3076c = i;
        this.f3074a = bnnVar;
        this.f3075b = bnqVar;
    }

    public bey(bnn bnnVar, String str, int i) {
        this.f3076c = i;
        this.f3074a = bnnVar;
        this.f3075b = str;
    }

    public bey(bnq bnqVar, SurfaceTexture surfaceTexture, int i) {
        this.f3076c = i;
        this.f3075b = bnqVar;
        this.f3074a = surfaceTexture;
    }

    public bey(bnq bnqVar, bnt bntVar, int i) {
        this.f3076c = i;
        this.f3074a = bnqVar;
        this.f3075b = bntVar;
    }

    public bey(bnq bnqVar, byte[] bArr, int i) {
        this.f3076c = i;
        this.f3074a = bnqVar;
        this.f3075b = bArr;
    }

    public bey(bnu bnuVar, bnt bntVar, int i) {
        this.f3076c = i;
        this.f3075b = bnuVar;
        this.f3074a = bntVar;
    }

    public bey(boh bohVar, RuntimeException runtimeException, int i) {
        this.f3076c = i;
        this.f3074a = bohVar;
        this.f3075b = runtimeException;
    }

    public bey(bui buiVar, Runnable runnable, int i) {
        this.f3076c = i;
        this.f3074a = buiVar;
        this.f3075b = runnable;
    }

    public /* synthetic */ bey(ccf ccfVar, kpp kppVar, int i) {
        this.f3076c = i;
        this.f3074a = ccfVar;
        this.f3075b = kppVar;
    }

    public /* synthetic */ bey(cdz cdzVar, nps npsVar, int i) {
        this.f3076c = i;
        this.f3074a = cdzVar;
        this.f3075b = npsVar;
    }

    public /* synthetic */ bey(cea ceaVar, dnl dnlVar, int i) {
        this.f3076c = i;
        this.f3074a = ceaVar;
        this.f3075b = dnlVar;
    }

    public /* synthetic */ bey(cec cecVar, ArrayList arrayList, int i) {
        this.f3076c = i;
        this.f3074a = cecVar;
        this.f3075b = arrayList;
    }

    public /* synthetic */ bey(cfv cfvVar, cfx cfxVar, int i) {
        this.f3076c = i;
        this.f3074a = cfvVar;
        this.f3075b = cfxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kpp] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        HashSet hashSet;
        nqf nqfVar;
        bcv bcvVar = null;
        switch (this.f3076c) {
            case 0:
                Object obj = this.f3074a;
                ?? r1 = this.f3075b;
                synchronized (((ConstraintTrackingWorker) obj).f1824b) {
                    if (((ConstraintTrackingWorker) obj).f1825g) {
                        bez.m2287b(((ConstraintTrackingWorker) obj).f1827i);
                    } else {
                        ((ConstraintTrackingWorker) obj).f1827i.m2284f(r1);
                    }
                }
                return;
            case 1:
                azb azbVar = ((bbr) this.f3074a).f2912b.f2784f;
                Object obj2 = this.f3075b;
                synchronized (azbVar.f2752f) {
                    azs azsVar = (azs) azbVar.f2748b.get(obj2);
                    if (azsVar == null) {
                        azsVar = (azs) azbVar.f2749c.get(obj2);
                    }
                    if (azsVar != null) {
                        bcvVar = azsVar.f2796c;
                    }
                }
                if (bcvVar == null || !bcvVar.m2229c()) {
                    return;
                }
                synchronized (((bbr) this.f3074a).f2913c) {
                    ((bbr) this.f3074a).f2916f.put(bbu.m2189b(bcvVar), bcvVar);
                    ((bbr) this.f3074a).f2917g.add(bcvVar);
                    Object obj3 = this.f3074a;
                    ((bbr) obj3).f2918h.mo2166a(((bbr) obj3).f2917g);
                    break;
                }
                return;
            case 2:
                ((bms) this.f3074a).f3828b.mo2774a((byte[]) this.f3075b);
                return;
            case 3:
                ((bmk) this.f3074a).f3786c.f3833c.m2804e(-16);
                ((bmk) this.f3074a).f3786c.f3832b.obtainMessage(601, this.f3075b).sendToTarget();
                return;
            case 4:
                if (((bnb) this.f3075b).mo2722g().m2803d()) {
                    return;
                }
                ((bnb) this.f3075b).f3856a.f3880e.m2804e(2);
                ((bnb) this.f3075b).f3856a.f3879d.obtainMessage(301, this.f3074a).sendToTarget();
                return;
            case 5:
                ((bna) this.f3074a).f3854b.mo2774a((byte[]) this.f3075b);
                return;
            case 6:
                AmbientMode.AmbientController ambientController = ((bnf) this.f3074a).f3870a;
                Object obj4 = this.f3075b;
                exm exmVar = (exm) ambientController.f1697a;
                if (exmVar.f20776r) {
                    return;
                }
                exmVar.f20760b.m8019c();
                exm exmVar2 = (exm) ambientController.f1697a;
                if (exmVar2.f20777s) {
                    exp expVar = exmVar2.f20760b;
                    byte[] bArr = (byte[]) obj4;
                    expVar.f20790C = bArr;
                    expVar.f20862z = true;
                    ewt ewtVar = exmVar2.f20761c;
                    if (ewtVar.f20689c) {
                        ewtVar.f20688b.mo2724i(bArr);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((bnu) this.f3075b).mo2742a().obtainMessage(2).sendToTarget();
                ((bnu) this.f3075b).mo2742a().post(((bnt) this.f3074a).f3894a);
                return;
            case 8:
                ((bnn) this.f3074a).f3888b.mo2770b((bnq) this.f3075b);
                return;
            case 9:
                bnm bnmVar = ((bnn) this.f3074a).f3888b;
                Object obj5 = this.f3075b;
                chg chgVar = (chg) bnmVar;
                bnm bnmVar2 = chgVar.f5731c;
                if (bnmVar2 != null) {
                    ((nbe) ((nbe) esl.f15318a.m17252c()).mo17276G((char) 1896)).mo17293r("Camera reconnection failure:%s", obj5);
                    ((esl) bnmVar2).f15400d.mo6459g();
                }
                chgVar.m3679k();
                return;
            case 10:
                ((bnq) this.f3074a).mo2718c().obtainMessage(105, this.f3075b).sendToTarget();
                return;
            case 11:
                ((bnq) this.f3075b).mo2718c().obtainMessage(101, this.f3074a).sendToTarget();
                return;
            case 12:
                ((bnq) this.f3074a).mo2718c().obtainMessage(101, null).sendToTarget();
                ((bnq) this.f3074a).mo2718c().post(((bnt) this.f3075b).f3894a);
                return;
            case 13:
                ((bnq) this.f3074a).mo2718c().obtainMessage(103, this.f3075b).sendToTarget();
                return;
            case 14:
                ((boh) this.f3074a).f3984a.mo2791c((RuntimeException) this.f3075b);
                return;
            case 15:
                if (((bui) this.f3074a).f4484a) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f3075b.run();
                    return;
                } catch (Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 16:
                Object obj6 = this.f3074a;
                ccf ccfVar = (ccf) obj6;
                ccfVar.f5117b.m3433a(this.f3075b);
                if (ccfVar.f5117b.m3435c()) {
                    synchronized (obj6) {
                        hashSet = new HashSet(((ccf) obj6).f5116a);
                        break;
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            case 17:
                Object obj7 = this.f3074a;
                try {
                    dnl dnlVar = (dnl) this.f3075b.get();
                    if (dnlVar.f12100a) {
                        try {
                            List listMo14579b = ((cdz) obj7).f5393a.mo14579b();
                            if (listMo14579b.isEmpty()) {
                                dnlVar = new dnl(true);
                            } else {
                                List list = (List) Collection$EL.stream(listMo14579b).map(cqk.f8915b).filter(cdy.f5373b).collect(Collectors.toList());
                                if (list.isEmpty()) {
                                    dnlVar = new dnl(true);
                                } else {
                                    dnl dnlVar2 = new dnl(false);
                                    dnlVar2.f12101b = (kcl) list.get(0);
                                    dnlVar = dnlVar2;
                                }
                            }
                        } catch (kmi | kml | kmm e) {
                            kcl kclVarM13979a = kcl.CAMERA_ERROR_CODE_UNKNOWN;
                            if (e instanceof kmm) {
                                kclVarM13979a = kcl.CAMERAS_NOT_ENUMERATED;
                            }
                            if (e instanceof kmi) {
                                List list2 = ((kmi) e).f36545a;
                                if (list2 != null && Collection$EL.stream(list2).anyMatch(cdy.f5372a)) {
                                    kclVarM13979a = kcl.CAMERAS_NOT_ENUMERATED;
                                }
                            } else if (e instanceof kml) {
                                kclVarM13979a = kcl.m13979a(((kml) e).f36546a);
                            }
                            dnl dnlVar3 = new dnl(false);
                            dnlVar3.f12101b = kclVarM13979a;
                            dnlVar3.f12102c = e;
                            dnlVar = dnlVar3;
                        }
                        break;
                    }
                    synchronized (((cdz) obj7).f5394b) {
                        nqfVar = ((cdz) obj7).f5395c;
                        ((cdz) obj7).f5395c = null;
                        break;
                    }
                    nqfVar.getClass();
                    nqfVar.mo14894e(dnlVar);
                    return;
                } catch (InterruptedException | ExecutionException e2) {
                    throw new mso(e2);
                }
            case 18:
                Object obj8 = this.f3074a;
                Object obj9 = this.f3075b;
                cea ceaVar = (cea) obj8;
                if (!ceaVar.f5406e.m5672t()) {
                    dnl dnlVar4 = (dnl) obj9;
                    if (dnlVar4.f12100a) {
                        return;
                    }
                    ceaVar.f5404c.mo6457e(new doc("Unable to enumerate any cameras", cea.m3537a(dnlVar4), kmq.BACK, kmq.f36557a));
                    return;
                }
                dnl dnlVar5 = (dnl) obj9;
                if (dnlVar5.f12100a) {
                    ceaVar.f5402a.mo5908a();
                    return;
                } else if (kcl.m13981d(cea.m3537a(dnlVar5))) {
                    ceaVar.f5402a.mo5909b();
                    return;
                } else {
                    ceaVar.f5404c.mo6457e(new doc("Unable to enumerate any cameras", cea.m3537a(dnlVar5), kmq.BACK, kmq.f36557a));
                    return;
                }
            case 19:
                ((cec) this.f3074a).f5410a.requestPermissions((String[]) ((ArrayList) this.f3075b).toArray(new String[0]), 151398431);
                return;
            default:
                Object obj10 = this.f3074a;
                Object obj11 = this.f3075b;
                ((cfv) obj10).f5525c = true;
                cfx cfxVar = (cfx) obj11;
                cfxVar.f5547c.mo3415bf(true);
                cfxVar.f5546b.mo3415bf(15);
                return;
        }
    }
}
