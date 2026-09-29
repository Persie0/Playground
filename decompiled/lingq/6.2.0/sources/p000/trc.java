package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class trc extends vkb {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f62790c = 3;

    /* JADX INFO: renamed from: d */
    public final Object f62791d;

    public trc(gw9 gw9Var) {
        super("internal.logger");
        this.f62791d = gw9Var;
        this.f65550b.put("log", new ogd(this, false, true));
        this.f65550b.put("silent", new p3d("silent", 1));
        ((vkb) this.f65550b.get("silent")).mo3881i("log", new ogd(this, true, true));
        this.f65550b.put("unmonitored", new p3d("unmonitored", 2));
        ((vkb) this.f65550b.get("unmonitored")).mo3881i("log", new ogd(this, false, false));
    }

    @Override // p000.vkb
    /* JADX INFO: renamed from: a */
    public final kmb mo12757a(C3329mb c3329mb, List list) {
        TreeMap treeMap;
        int i = this.f62790c;
        String str = this.f65549a;
        cnb cnbVar = kmb.f47523y;
        Object obj = this.f62791d;
        String str2 = null;
        switch (i) {
            case 0:
                qdd.m19875b(3, str, list);
                String strMo3809c = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) list.get(0)).mo3809c();
                kmb kmbVar = (kmb) list.get(1);
                cdb cdbVar = (cdb) c3329mb.f50861c;
                long jM19882i = (long) qdd.m19882i(cdbVar.m4562k(c3329mb, kmbVar).mo3811e().doubleValue());
                kmb kmbVarM4562k = cdbVar.m4562k(c3329mb, (kmb) list.get(2));
                HashMap mapM19884k = kmbVarM4562k instanceof bmb ? qdd.m19884k((bmb) kmbVarM4562k) : new HashMap();
                mq7 mq7Var = (mq7) obj;
                mq7Var.getClass();
                HashMap map = new HashMap();
                for (String str3 : mapM19884k.keySet()) {
                    HashMap map2 = ((ofb) mq7Var.f51733b).f54288c;
                    map.put(str3, ofb.m17966e(str3, map2.containsKey(str3) ? map2.get(str3) : null, mapM19884k.get(str3)));
                }
                ((ArrayList) mq7Var.f51735d).add(new ofb(strMo3809c, jM19882i, map));
                return cnbVar;
            case 1:
                qdd.m19875b(2, "getValue", list);
                kmb kmbVarM4562k2 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) list.get(0));
                kmb kmbVarM4562k3 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) list.get(1));
                String strMo3809c2 = kmbVarM4562k2.mo3809c();
                cdb cdbVar2 = (cdb) obj;
                Map map3 = (Map) ((shc) cdbVar2.f9946c).f60874d.get((String) cdbVar2.f9945b);
                if (map3 != null && map3.containsKey(strMo3809c2)) {
                    str2 = (String) map3.get(strMo3809c2);
                }
                return str2 != null ? new xmb(str2) : kmbVarM4562k3;
            case 2:
                return cnbVar;
            case 3:
                try {
                    return vdd.m23240b(((ahc) obj).call());
                } catch (Exception unused) {
                    return cnbVar;
                }
            default:
                qdd.m19875b(3, str, list);
                ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) list.get(0)).mo3809c();
                kmb kmbVar2 = (kmb) list.get(1);
                cdb cdbVar3 = (cdb) c3329mb.f50861c;
                kmb kmbVarM4562k4 = cdbVar3.m4562k(c3329mb, kmbVar2);
                if (kmbVarM4562k4 instanceof gmb) {
                    kmb kmbVarM4562k5 = cdbVar3.m4562k(c3329mb, (kmb) list.get(2));
                    if (kmbVarM4562k5 instanceof bmb) {
                        bmb bmbVar = (bmb) kmbVarM4562k5;
                        HashMap map4 = bmbVar.f8698a;
                        if (map4.containsKey("type")) {
                            String strMo3809c3 = bmbVar.mo3880f("type").mo3809c();
                            int iM19881h = map4.containsKey("priority") ? qdd.m19881h(bmbVar.mo3880f("priority").mo3811e().doubleValue()) : DescriptorProtos.Edition.EDITION_2023_VALUE;
                            cdb cdbVar4 = (cdb) obj;
                            gmb gmbVar = (gmb) kmbVarM4562k4;
                            cdbVar4.getClass();
                            if ("create".equals(strMo3809c3)) {
                                treeMap = (TreeMap) cdbVar4.f9946c;
                            } else if ("edit".equals(strMo3809c3)) {
                                treeMap = (TreeMap) cdbVar4.f9945b;
                            } else {
                                C3386nv.m17633t("Unknown callback type: ".concat(String.valueOf(strMo3809c3)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(iM19881h))) {
                                iM19881h = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(iM19881h), gmbVar);
                            return cnbVar;
                        }
                        C3386nv.m17626m("Undefined rule type");
                    } else {
                        C3386nv.m17626m("Invalid callback params");
                    }
                } else {
                    C3386nv.m17626m("Invalid callback type");
                }
                return null;
        }
    }

    public trc(mq7 mq7Var) {
        super("internal.eventLogger");
        this.f62791d = mq7Var;
    }

    public trc(cdb cdbVar) {
        super("internal.registerCallback");
        this.f62791d = cdbVar;
    }

    public trc(ahc ahcVar) {
        super("internal.appMetadata");
        this.f62791d = ahcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trc(p3d p3dVar, cdb cdbVar) {
        super("getValue");
        this.f62791d = cdbVar;
    }
}
