package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.ArrayMap;
import android.widget.Toast;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cuq implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f9663a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9664b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f9665c;

    public /* synthetic */ cuq(cur curVar, idl idlVar, int i) {
        this.f9665c = i;
        this.f9663a = curVar;
        this.f9664b = idlVar;
    }

    public /* synthetic */ cuq(cvr cvrVar, cti ctiVar, int i) {
        this.f9665c = i;
        this.f9664b = cvrVar;
        this.f9663a = ctiVar;
    }

    public /* synthetic */ cuq(cvr cvrVar, ctj ctjVar, int i) {
        this.f9665c = i;
        this.f9664b = cvrVar;
        this.f9663a = ctjVar;
    }

    public /* synthetic */ cuq(dab dabVar, fan fanVar, int i) {
        this.f9665c = i;
        this.f9663a = dabVar;
        this.f9664b = fanVar;
    }

    public /* synthetic */ cuq(dcf dcfVar, fan fanVar, int i) {
        this.f9665c = i;
        this.f9663a = dcfVar;
        this.f9664b = fanVar;
    }

    public /* synthetic */ cuq(dct dctVar, kmg kmgVar, int i) {
        this.f9665c = i;
        this.f9663a = dctVar;
        this.f9664b = kmgVar;
    }

    public /* synthetic */ cuq(ddr ddrVar, ddp ddpVar, int i) {
        this.f9665c = i;
        this.f9664b = ddrVar;
        this.f9663a = ddpVar;
    }

    public /* synthetic */ cuq(ddr ddrVar, ddp[] ddpVarArr, int i) {
        this.f9665c = i;
        this.f9663a = ddrVar;
        this.f9664b = ddpVarArr;
    }

    public /* synthetic */ cuq(ddw ddwVar, Bitmap bitmap, int i) {
        this.f9665c = i;
        this.f9664b = ddwVar;
        this.f9663a = bitmap;
    }

    public /* synthetic */ cuq(ddw ddwVar, Uri uri, int i) {
        this.f9665c = i;
        this.f9664b = ddwVar;
        this.f9663a = uri;
    }

    public /* synthetic */ cuq(dep depVar, Intent intent, int i) {
        this.f9665c = i;
        this.f9664b = depVar;
        this.f9663a = intent;
    }

    public /* synthetic */ cuq(dep depVar, deb debVar, int i) {
        this.f9665c = i;
        this.f9664b = depVar;
        this.f9663a = debVar;
    }

    public /* synthetic */ cuq(dep depVar, des desVar, int i) {
        this.f9665c = i;
        this.f9663a = depVar;
        this.f9664b = desVar;
    }

    public /* synthetic */ cuq(dep depVar, hew hewVar, int i) {
        this.f9665c = i;
        this.f9663a = depVar;
        this.f9664b = hewVar;
    }

    public /* synthetic */ cuq(dep depVar, kpw kpwVar, int i) {
        this.f9665c = i;
        this.f9663a = depVar;
        this.f9664b = kpwVar;
    }

    public /* synthetic */ cuq(dfh dfhVar, String str, int i) {
        this.f9665c = i;
        this.f9663a = dfhVar;
        this.f9664b = str;
    }

    public /* synthetic */ cuq(dsx dsxVar, String str, int i, byte[] bArr, byte[] bArr2) {
        this.f9665c = i;
        this.f9663a = dsxVar;
        this.f9664b = str;
    }

    public /* synthetic */ cuq(oju ojuVar, Intent intent, int i) {
        this.f9665c = i;
        this.f9664b = ojuVar;
        this.f9663a = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [fbp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [fbp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v61, types: [dej, dfa, hdo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [fcp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v59, types: [hew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v54, types: [fcp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v61, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kpw] */
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
        int i = 3;
        int i2 = 2;
        int i3 = 1;
        switch (this.f9665c) {
            case 0:
                Object obj = this.f9663a;
                idl idlVar = (idl) this.f9664b;
                idlVar.m11116a(idk.RECORDING_STOPPED);
                idlVar.m11116a(idk.RECORDING_DISABLED);
                cuo cuoVar = ((cur) obj).f9674i;
                cuoVar.getClass();
                ((cpw) cuoVar).f8688d.m5370k(true);
                return;
            case 1:
                cur curVar = (cur) this.f9663a;
                ((idl) this.f9664b).m11119d(curVar.m5540e() ? idk.RECORDING_STOPPED : idk.RECORDING_DISABLED);
                cuo cuoVar2 = curVar.f9674i;
                cuoVar2.getClass();
                ((cpw) cuoVar2).m5262d();
                return;
            case 2:
                Object obj2 = this.f9664b;
                ctj ctjVar = (ctj) this.f9663a;
                gyw gywVar = ctjVar.f9462m;
                mrm mrmVarMo5500d = ctjVar.f9450a.mo5500d();
                mrm mrmVarMo5499c = ctjVar.f9450a.mo5499c();
                long j = ctjVar.f9454e;
                ctjVar.f9450a.mo5505i();
                StringBuilder sb = new StringBuilder();
                if (!ctjVar.f9463n.isEmpty()) {
                    cxk cxkVar = (cxk) ctjVar.f9463n.get(0);
                    cxk cxkVar2 = cxk.OFF;
                    switch (cxkVar.ordinal()) {
                        case 2:
                            sb.append("CINEMATIC");
                            break;
                        case 3:
                            sb.append("LOCKED");
                            break;
                        case 4:
                            sb.append("ACTIVE");
                            break;
                    }
                }
                if (ctjVar.f9470u) {
                    if (!sb.toString().isEmpty()) {
                        sb.append(".");
                    }
                    sb.append("TS");
                }
                ((cvr) obj2).m5621e(gywVar, mrmVarMo5500d, mrmVarMo5499c, j, "", sb.toString(), ctjVar.f9465p, ctjVar.f9469t);
                return;
            case 3:
                Object obj3 = this.f9664b;
                cti ctiVar = (cti) this.f9663a;
                gyu gyuVar = ctiVar.f9445h.f26875a;
                gyj gyjVar = ctiVar.f9440c;
                gyjVar.m9977b();
                cvr cvrVar = (cvr) obj3;
                ctiVar.f9441d.m9985e(cvrVar.m5618a(ctiVar.f9445h, gyjVar, gyw.VIDEO_SNAPSHOT, ((Boolean) cvrVar.f9823d.mo10031c(gzy.f27036at)).booleanValue() ? gyx.MARS_STORE : gyx.MEDIA_STORE, false));
                ctiVar.f9441d.m9987g();
                return;
            case 4:
                ((fba) this.f9664b).m8097e(this.f9663a);
                return;
            case 5:
                ((fba) this.f9664b).m8097e(this.f9663a);
                return;
            case 6:
                ((dct) this.f9663a).f10528b.mo4084x().mo5938a(new ddc(((kmg) this.f9664b).f36540a));
                return;
            case 7:
                Object obj4 = this.f9663a;
                Object obj5 = this.f9664b;
                ddd dddVarMo4084x = ((dct) obj4).f10528b.mo4084x();
                String str = ((kmg) obj5).f36540a;
                ddi ddiVar = (ddi) dddVarMo4084x;
                ddiVar.f10557a.m1824l();
                arf arfVarM1853e = ddiVar.f10559c.m1853e();
                if (str == null) {
                    arfVarM1853e.mo1846f(1);
                } else {
                    arfVarM1853e.mo1847g(1, str);
                }
                ddiVar.f10557a.m1825m();
                try {
                    arfVarM1853e.m1883a();
                    ((ddi) dddVarMo4084x).f10557a.m1829q();
                    return;
                } finally {
                    ddiVar.f10557a.m1827o();
                    ddiVar.f10559c.m1855g(arfVarM1853e);
                }
            case 8:
                Object obj6 = this.f9664b;
                Object obj7 = this.f9663a;
                ddr ddrVar = (ddr) obj6;
                ddrVar.f10579b.m6228b();
                ddj ddjVarMo5939a = ddrVar.f10578a.mo4085y().mo5939a((ddp) obj7);
                if (ddjVarMo5939a.f10565d == 0) {
                    ddjVarMo5939a.f10563b++;
                } else {
                    ddjVarMo5939a.f10564c++;
                }
                ddrVar.f10578a.mo4085y().mo5940b(ddjVarMo5939a);
                return;
            case 9:
                Collection$EL.forEach(Arrays.asList((Object[]) this.f9664b), new dco((ddr) this.f9663a, i));
                return;
            case 10:
                ((ddw) this.f9664b).m5960c((Uri) this.f9663a);
                return;
            case 11:
                Object obj8 = this.f9664b;
                try {
                    jvh.m13562j(((ddw) obj8).f10607b.m10977c(new cuq((ddw) obj8, ((ddw) obj8).m5958a((Bitmap) this.f9663a), 10)), new cis((ddw) obj8, 5), ((ddw) obj8).f10608c);
                    return;
                } catch (IOException | IllegalStateException e) {
                    e.printStackTrace();
                    ((ddw) obj8).m5961d();
                    return;
                }
            case 12:
                ?? r0 = this.f9664b;
                Object obj9 = this.f9663a;
                dep depVar = (dep) r0.get();
                depVar.f10692k.execute(depVar.f10705x.m3841a(new cuq(depVar, (Intent) obj9, 16)));
                return;
            case 13:
                Object obj10 = this.f9663a;
                ?? r6 = this.f9664b;
                dep depVar2 = (dep) obj10;
                if (depVar2.f10687f) {
                    long jMo7248d = r6.mo7248d();
                    if (TimeUnit.NANOSECONDS.toMillis(jMo7248d - depVar2.f10677F) >= depVar2.f10675D) {
                        depVar2.f10677F = jMo7248d;
                        long micros = TimeUnit.NANOSECONDS.toMicros(r6.mo7248d());
                        Map map = depVar2.f10686e;
                        Long lValueOf = Long.valueOf(micros);
                        map.put(lValueOf, r6);
                        int i4 = depVar2.f10701t.mo9216f().f35503e + 90;
                        List listMo7251g = r6.mo7251g();
                        kpv kpvVar = (kpv) listMo7251g.get(0);
                        kpv kpvVar2 = (kpv) listMo7251g.get(1);
                        kpv kpvVar3 = (kpv) listMo7251g.get(2);
                        int i5 = i4 % 360;
                        switch (i5) {
                            case 0:
                                i = 1;
                                break;
                            case 90:
                                i = 4;
                                break;
                            case 180:
                                break;
                            case 270:
                                i = 2;
                                break;
                            default:
                                throw new IllegalArgumentException("Unsupported rotation: " + i5);
                        }
                        if (depVar2.f10683b.mo6002h(micros, kpvVar.getBuffer(), kpvVar2.getBuffer(), kpvVar3.getBuffer(), r6.mo7247c(), r6.mo7246b(), kpvVar.getRowStride(), kpvVar2.getRowStride(), kpvVar2.getPixelStride(), i - 1)) {
                            return;
                        }
                        depVar2.f10686e.remove(lValueOf);
                        r6.close();
                        return;
                    }
                }
                r6.close();
                return;
            case 14:
                Object obj11 = this.f9663a;
                Object obj12 = this.f9664b;
                dep depVar3 = (dep) obj11;
                if (depVar3.f10687f) {
                    des desVar = (des) obj12;
                    mws mwsVar = desVar.f10735b;
                    if (!mwsVar.isEmpty()) {
                        dfb dfbVar = depVar3.f10707z;
                        if (dfbVar.f10758a != null) {
                            dfbVar.m6048a(mwsVar);
                        }
                    }
                    long j2 = desVar.f10734a;
                    mrm mrmVar = desVar.f10736c;
                    if (mrmVar.mo16813g()) {
                        mwx mwxVar = ((dee) mrmVar.mo16809c()).f10653a;
                        if (!mwxVar.isEmpty()) {
                            depVar3.f10684c.mo6081bq(j2, mwxVar);
                        }
                        mrm mrmVar2 = ((dee) mrmVar.mo16809c()).f10654b;
                        if (mrmVar2.mo16813g()) {
                            ArrayMap arrayMap = new ArrayMap();
                            for (mfp mfpVar : ((mfq) mrmVar2.mo16809c()).f40379a) {
                                mfr mfrVar = mfpVar.f40374a;
                                if (mfrVar == null) {
                                    mfrVar = mfr.f40380b;
                                }
                                nxv nxvVar = mfrVar.f40382a;
                                if (!nxvVar.isEmpty()) {
                                    arrayMap.put(Long.valueOf(mfpVar.f40375b), nxvVar);
                                }
                            }
                            if (arrayMap.isEmpty()) {
                                return;
                            }
                            depVar3.f10685d.mo3954g(j2, arrayMap);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                dep depVar4 = (dep) this.f9663a;
                depVar4.f10693l = this.f9664b;
                if (depVar4.f10695n.mo16813g()) {
                    depVar4.m6015k(depVar4.m6009e((deb) depVar4.f10695n.mo16809c()));
                    return;
                }
                return;
            case 16:
                ?? r1 = this.f9664b;
                Object obj13 = this.f9663a;
                dep depVar5 = (dep) r1;
                jvb jvbVar = depVar5.f10691j;
                hdp hdpVar = depVar5.f10700s;
                hdpVar.f27370f = r1;
                jvbVar.m13537d(new gto(hdpVar, hdpVar.f27371g.m10724b(hdpVar), 8));
                depVar5.f10683b.mo5997c();
                depVar5.f10691j.m13537d(depVar5.f10683b.mo5995a(r1));
                depVar5.f10691j.m13537d(new dev(depVar5, i3));
                depVar5.f10691j.m13537d(depVar5.f10702u.mo3830a(new czq(depVar5, 12), depVar5.f10692k));
                jvb jvbVar2 = depVar5.f10691j;
                dfb dfbVar2 = depVar5.f10707z;
                dfbVar2.f10758a = r1;
                jvbVar2.m13537d(new dev(dfbVar2, i2));
                depVar5.f10688g = true;
                Intent intent = (Intent) obj13;
                if (cds.m3511j(intent) || cds.m3505d(intent) != ikw.PHOTO) {
                    return;
                }
                depVar5.f10689h = true;
                depVar5.m6013i();
                return;
            case 17:
                Object obj14 = this.f9664b;
                final deb debVar = (deb) this.f9663a;
                int i6 = debVar.f10641k;
                if (i6 != 1) {
                    if (i6 == 3) {
                        final ddw ddwVar = ((dep) obj14).f10672A;
                        synchronized (ddwVar) {
                            if (!ddwVar.f10610e) {
                                ddwVar.f10610e = true;
                                ((hdw) ddwVar.f10609d.get()).m10129a(new heq() { // from class: ddv
                                    @Override // p000.heq
                                    /* JADX INFO: renamed from: a */
                                    public final void mo5957a(Bitmap bitmap) {
                                        ddw ddwVar2 = ddwVar;
                                        if (bitmap == null) {
                                            ddwVar2.m5961d();
                                        } else {
                                            ddwVar2.f10608c.execute(new cuq(ddwVar2, bitmap, 11));
                                        }
                                    }
                                });
                            }
                        }
                    } else {
                        Runnable runnable = debVar.f10633c;
                        if (runnable != null) {
                            ((dep) obj14).f10672A.f10607b.m10977c(runnable);
                        }
                    }
                    break;
                } else {
                    final dep depVar6 = (dep) obj14;
                    ((hdw) depVar6.f10699r.get()).m10129a(new heq() { // from class: deo
                        @Override // p000.heq
                        /* JADX INFO: renamed from: a */
                        public final void mo5957a(Bitmap bitmap) {
                            dep depVar7 = depVar6;
                            deb debVar2 = debVar;
                            if (bitmap != null) {
                                depVar7.f10696o.execute(new bmj(depVar7, bitmap, debVar2, 11));
                            }
                        }
                    });
                }
                cwd cwdVar = ((dep) obj14).f10679H;
                long j3 = debVar.f10631a;
                ?? r2 = cwdVar.f9866a;
                nxl nxlVarM18137O = nka.f43156d.m18137O();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nka nkaVar = (nka) nxlVarM18137O.f44974b;
                nkaVar.f43160c = 2;
                nkaVar.f43158a = 2 | nkaVar.f43158a;
                nkb nkbVarM5642l = cwd.m5642l(debVar);
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nka nkaVar2 = (nka) nxlVarM18137O.f44974b;
                nkbVarM5642l.getClass();
                nkaVar2.f43159b = nkbVarM5642l;
                nkaVar2.f43158a |= 1;
                r2.mo8202v((nka) nxlVarM18137O.mo18103l());
                return;
            case 18:
                Object obj15 = this.f9664b;
                Object obj16 = this.f9663a;
                dep depVar7 = (dep) obj15;
                if (!depVar7.f10694m.mo16813g() || ((deb) depVar7.f10694m.mo16809c()).f10631a != ((deb) obj16).f10631a) {
                    cwd cwdVar2 = depVar7.f10679H;
                    deb debVar2 = (deb) obj16;
                    long j4 = debVar2.f10631a;
                    ?? r3 = cwdVar2.f9866a;
                    nxl nxlVarM18137O2 = nka.f43156d.m18137O();
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    nka nkaVar3 = (nka) nxlVarM18137O2.f44974b;
                    nkaVar3.f43160c = 1;
                    nkaVar3.f43158a = 2 | nkaVar3.f43158a;
                    nkb nkbVarM5642l2 = cwd.m5642l(debVar2);
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    nka nkaVar4 = (nka) nxlVarM18137O2.f44974b;
                    nkbVarM5642l2.getClass();
                    nkaVar4.f43159b = nkbVarM5642l2;
                    nkaVar4.f43158a |= 1;
                    r3.mo8202v((nka) nxlVarM18137O2.mo18103l());
                }
                depVar7.f10694m = mrm.m16829i(obj16);
                return;
            case 19:
                Toast.makeText((Context) ((dsx) this.f9663a).f12521a, (CharSequence) this.f9664b, 0).show();
                return;
            default:
                ((dfh) this.f9663a).m6052a((String) this.f9664b);
                return;
        }
    }
}
