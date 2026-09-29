package p000;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class vvc extends bmb {

    /* JADX INFO: renamed from: b */
    public final mq7 f65995b;

    public vvc(mq7 mq7Var) {
        this.f65995b = mq7Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.bmb, p000.kmb
    /* JADX INFO: renamed from: g */
    public final kmb mo3812g(String str, C3329mb c3329mb, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        mq7 mq7Var = this.f65995b;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    qdd.m19875b(0, "getEventName", arrayList);
                    return new xmb(((ofb) mq7Var.f51734c).f54286a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    qdd.m19875b(0, "getTimestamp", arrayList);
                    return new bkb(Double.valueOf(((ofb) mq7Var.f51734c).f54287b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    qdd.m19875b(1, "getParamValue", arrayList);
                    String strMo3809c = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0)).mo3809c();
                    HashMap map = ((ofb) mq7Var.f51734c).f54288c;
                    return vdd.m23240b(map.containsKey(strMo3809c) ? map.get(strMo3809c) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    qdd.m19875b(0, "getParams", arrayList);
                    HashMap map2 = ((ofb) mq7Var.f51734c).f54288c;
                    bmb bmbVar = new bmb();
                    for (String str2 : map2.keySet()) {
                        bmbVar.mo3881i(str2, vdd.m23240b(map2.get(str2)));
                    }
                    return bmbVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    qdd.m19875b(2, "setParamValue", arrayList);
                    String strMo3809c2 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0)).mo3809c();
                    kmb kmbVarM4562k = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1));
                    ofb ofbVar = (ofb) mq7Var.f51734c;
                    Object objM19883j = qdd.m19883j(kmbVarM4562k);
                    HashMap map3 = ofbVar.f54288c;
                    if (objM19883j == null) {
                        map3.remove(strMo3809c2);
                        return kmbVarM4562k;
                    }
                    map3.put(strMo3809c2, ofb.m17966e(strMo3809c2, map3.get(strMo3809c2), objM19883j));
                    return kmbVarM4562k;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    qdd.m19875b(1, "setEventName", arrayList);
                    kmb kmbVarM4562k2 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                    if (kmb.f47523y.equals(kmbVarM4562k2) || kmb.f47524z.equals(kmbVarM4562k2)) {
                        C3386nv.m17626m("Illegal event name");
                        return null;
                    }
                    ((ofb) mq7Var.f51734c).f54286a = kmbVarM4562k2.mo3809c();
                    return new xmb(kmbVarM4562k2.mo3809c());
                }
                break;
        }
        return super.mo3812g(str, c3329mb, arrayList);
    }
}
