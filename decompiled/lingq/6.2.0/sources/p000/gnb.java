package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.internal.measurement.zzbk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gnb {

    /* JADX INFO: renamed from: a */
    public final ArrayList f41057a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f41058b;

    public gnb(int i) {
        this.f41058b = i;
    }

    /* JADX INFO: renamed from: c */
    public static gmb m12770c(C3329mb c3329mb, List list) {
        qdd.m19876c(2, zzbk.FN.name(), list);
        kmb kmbVarM4562k = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) list.get(0));
        kmb kmbVarM4562k2 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) list.get(1));
        if (!(kmbVarM4562k2 instanceof cib)) {
            C3386nv.m17626m(AbstractC3393o1.m17734i("FN requires an ArrayValue of parameter names found ", kmbVarM4562k2.getClass().getCanonicalName()));
            return null;
        }
        List listM4742l = ((cib) kmbVarM4562k2).m4742l();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new gmb(kmbVarM4562k.mo3809c(), (ArrayList) listM4742l, arrayList, c3329mb);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12771d(kmb kmbVar, kmb kmbVar2) {
        if (kmbVar instanceof xlb) {
            kmbVar = new xmb(kmbVar.mo3809c());
        }
        if (kmbVar2 instanceof xlb) {
            kmbVar2 = new xmb(kmbVar2.mo3809c());
        }
        if ((kmbVar instanceof xmb) && (kmbVar2 instanceof xmb)) {
            return ((xmb) kmbVar).f68360a.compareTo(((xmb) kmbVar2).f68360a) < 0;
        }
        double dDoubleValue = kmbVar.mo3811e().doubleValue();
        double dDoubleValue2 = kmbVar2.mo3811e().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static kmb m12772e(rob robVar, kmb kmbVar, kmb kmbVar2) {
        if (kmbVar instanceof Iterable) {
            return m12774g(robVar, ((Iterable) kmbVar).iterator(), kmbVar2);
        }
        C3386nv.m17626m("Non-iterable type in for...of loop.");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m12773f(kmb kmbVar, kmb kmbVar2) {
        if (kmbVar.getClass().equals(kmbVar2.getClass())) {
            if ((kmbVar instanceof cnb) || (kmbVar instanceof emb)) {
                return true;
            }
            if (kmbVar instanceof bkb) {
                return (Double.isNaN(kmbVar.mo3811e().doubleValue()) || Double.isNaN(kmbVar2.mo3811e().doubleValue()) || kmbVar.mo3811e().doubleValue() != kmbVar2.mo3811e().doubleValue()) ? false : true;
            }
            if (kmbVar instanceof xmb) {
                return kmbVar.mo3809c().equals(kmbVar2.mo3809c());
            }
            if (kmbVar instanceof sib) {
                return kmbVar.mo3808b().equals(kmbVar2.mo3808b());
            }
            return kmbVar == kmbVar2;
        }
        if (((kmbVar instanceof cnb) || (kmbVar instanceof emb)) && ((kmbVar2 instanceof cnb) || (kmbVar2 instanceof emb))) {
            return true;
        }
        boolean z = kmbVar instanceof bkb;
        if (z && (kmbVar2 instanceof xmb)) {
            return m12773f(kmbVar, new bkb(kmbVar2.mo3811e()));
        }
        boolean z2 = kmbVar instanceof xmb;
        if ((!z2 || !(kmbVar2 instanceof bkb)) && !(kmbVar instanceof sib)) {
            if (kmbVar2 instanceof sib) {
                return m12773f(kmbVar, new bkb(kmbVar2.mo3811e()));
            }
            if ((z2 || z) && (kmbVar2 instanceof xlb)) {
                return m12773f(kmbVar, new xmb(kmbVar2.mo3809c()));
            }
            if ((kmbVar instanceof xlb) && ((kmbVar2 instanceof xmb) || (kmbVar2 instanceof bkb))) {
                return m12773f(new xmb(kmbVar.mo3809c()), kmbVar2);
            }
            return false;
        }
        return m12773f(new bkb(kmbVar.mo3811e()), kmbVar2);
    }

    /* JADX INFO: renamed from: g */
    public static kmb m12774g(rob robVar, Iterator it, kmb kmbVar) {
        C3329mb c3329mbM16736n;
        if (it != null) {
            while (it.hasNext()) {
                kmb kmbVar2 = (kmb) it.next();
                switch (robVar.f59666a) {
                    case 0:
                        c3329mbM16736n = robVar.f59667b.m16736n();
                        String str = robVar.f59668c;
                        c3329mbM16736n.m16739q(str, kmbVar2);
                        ((HashMap) c3329mbM16736n.f50863e).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        c3329mbM16736n = robVar.f59667b.m16736n();
                        c3329mbM16736n.m16739q(robVar.f59668c, kmbVar2);
                        break;
                    default:
                        c3329mbM16736n = robVar.f59667b;
                        c3329mbM16736n.m16739q(robVar.f59668c, kmbVar2);
                        break;
                }
                kmb kmbVarM16735m = c3329mbM16736n.m16735m((cib) kmbVar);
                if (kmbVarM16735m instanceof jjb) {
                    jjb jjbVar = (jjb) kmbVarM16735m;
                    String str2 = jjbVar.f45638b;
                    if ("break".equals(str2)) {
                        return kmb.f47523y;
                    }
                    if ("return".equals(str2)) {
                        return jjbVar;
                    }
                }
            }
        }
        return kmb.f47523y;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m12775h(kmb kmbVar, kmb kmbVar2) {
        if (kmbVar instanceof xlb) {
            kmbVar = new xmb(kmbVar.mo3809c());
        }
        if (kmbVar2 instanceof xlb) {
            kmbVar2 = new xmb(kmbVar2.mo3809c());
        }
        return (((kmbVar instanceof xmb) && (kmbVar2 instanceof xmb)) || !(Double.isNaN(kmbVar.mo3811e().doubleValue()) || Double.isNaN(kmbVar2.mo3811e().doubleValue()))) && !m12771d(kmbVar2, kmbVar);
    }

    /* JADX WARN: Code duplicated, block: B:400:0x0b8b  */
    /* JADX WARN: Code duplicated, block: B:564:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v323 */
    /* JADX WARN: Type inference failed for: r10v328 */
    /* JADX WARN: Type inference failed for: r10v349, types: [cib] */
    /* JADX WARN: Type inference failed for: r10v356, types: [bmb] */
    /* JADX WARN: Type inference failed for: r10v393 */
    /* JADX WARN: Type inference failed for: r10v394 */
    /* JADX WARN: Type inference failed for: r12v0, types: [mb] */
    /* JADX WARN: Type inference failed for: r7v54, types: [kmb] */
    /* JADX INFO: renamed from: a */
    public final kmb m12776a(String str, C3329mb c3329mb, ArrayList arrayList) {
        boolean zM12773f;
        boolean zM12773f2;
        kmb kmbVar;
        kmb kmbVarM16735m;
        cnb cnbVar;
        jjb jjbVar;
        kmb xmbVar;
        ?? cibVar;
        String str2;
        int i = 0;
        switch (this.f41058b) {
            case 0:
                zzbk zzbkVar = zzbk.ADD;
                switch (qdd.m19879f(str).ordinal()) {
                    case 4:
                        return new bkb(Double.valueOf(qdd.m19881h(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.BITWISE_AND, 2, arrayList, 0)).mo3811e().doubleValue()) & qdd.m19881h(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue())));
                    case 5:
                        return new bkb(Double.valueOf(qdd.m19881h(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.BITWISE_LEFT_SHIFT, 2, arrayList, 0)).mo3811e().doubleValue()) << ((int) (((long) qdd.m19881h(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue())) & 31))));
                    case 6:
                        return new bkb(Double.valueOf(~qdd.m19881h(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.BITWISE_NOT, 1, arrayList, 0)).mo3811e().doubleValue())));
                    case 7:
                        return new bkb(Double.valueOf(qdd.m19881h(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.BITWISE_OR, 2, arrayList, 0)).mo3811e().doubleValue()) | qdd.m19881h(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue())));
                    case 8:
                        return new bkb(Double.valueOf(qdd.m19881h(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.BITWISE_RIGHT_SHIFT, 2, arrayList, 0)).mo3811e().doubleValue()) >> ((int) (((long) qdd.m19881h(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue())) & 31))));
                    case 9:
                        return new bkb(Double.valueOf((((long) qdd.m19881h(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, arrayList, 0)).mo3811e().doubleValue())) & 4294967295L) >>> ((int) (((long) qdd.m19881h(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue())) & 31))));
                    case 10:
                        return new bkb(Double.valueOf(qdd.m19881h(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.BITWISE_XOR, 2, arrayList, 0)).mo3811e().doubleValue()) ^ qdd.m19881h(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue())));
                    default:
                        m12777b(str);
                        throw null;
                }
            case 1:
                qdd.m19875b(2, qdd.m19879f(str).name(), arrayList);
                kmb kmbVarM4562k = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                kmb kmbVarM4562k2 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1));
                int iOrdinal = qdd.m19879f(str).ordinal();
                if (iOrdinal != 23) {
                    if (iOrdinal == 48) {
                        zM12773f2 = m12773f(kmbVarM4562k, kmbVarM4562k2);
                    } else if (iOrdinal == 42) {
                        zM12773f = m12771d(kmbVarM4562k, kmbVarM4562k2);
                    } else if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                zM12773f = m12771d(kmbVarM4562k2, kmbVarM4562k);
                                break;
                            case 38:
                                zM12773f = m12775h(kmbVarM4562k2, kmbVarM4562k);
                                break;
                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                zM12773f = qdd.m19880g(kmbVarM4562k, kmbVarM4562k2);
                                break;
                            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                zM12773f2 = qdd.m19880g(kmbVarM4562k, kmbVarM4562k2);
                                break;
                            default:
                                m12777b(str);
                                throw null;
                        }
                    } else {
                        zM12773f = m12775h(kmbVarM4562k, kmbVarM4562k2);
                    }
                    zM12773f = !zM12773f2;
                } else {
                    zM12773f = m12773f(kmbVarM4562k, kmbVarM4562k2);
                }
                return zM12773f ? kmb.f47520D : kmb.f47521E;
            case 2:
                zzbk zzbkVar2 = zzbk.ADD;
                int iOrdinal2 = qdd.m19879f(str).ordinal();
                if (iOrdinal2 == 2) {
                    kmb kmbVar2 = (kmb) dnb.m10504e(zzbk.APPLY, 3, arrayList, 0);
                    cdb cdbVar = (cdb) c3329mb.f50861c;
                    cdb cdbVar2 = (cdb) c3329mb.f50861c;
                    kmb kmbVarM4562k3 = cdbVar.m4562k(c3329mb, kmbVar2);
                    String strMo3809c = cdbVar2.m4562k(c3329mb, (kmb) arrayList.get(1)).mo3809c();
                    kmb kmbVarM4562k4 = cdbVar2.m4562k(c3329mb, (kmb) arrayList.get(2));
                    if (!(kmbVarM4562k4 instanceof cib)) {
                        C3386nv.m17626m(AbstractC3393o1.m17734i("Function arguments for Apply are not a list found ", kmbVarM4562k4.getClass().getCanonicalName()));
                        return null;
                    }
                    if (!strMo3809c.isEmpty()) {
                        return kmbVarM4562k3.mo3812g(strMo3809c, c3329mb, (ArrayList) ((cib) kmbVarM4562k4).m4742l());
                    }
                    C3386nv.m17626m("Function name for apply is undefined");
                    return null;
                }
                if (iOrdinal2 == 15) {
                    qdd.m19875b(0, zzbk.BREAK.name(), arrayList);
                    return kmb.f47517A;
                }
                if (iOrdinal2 == 25) {
                    return m12770c(c3329mb, arrayList);
                }
                if (iOrdinal2 == 41) {
                    qdd.m19876c(2, zzbk.IF.name(), arrayList);
                    kmb kmbVar3 = (kmb) arrayList.get(0);
                    cdb cdbVar3 = (cdb) c3329mb.f50861c;
                    cdb cdbVar4 = (cdb) c3329mb.f50861c;
                    kmb kmbVarM4562k5 = cdbVar3.m4562k(c3329mb, kmbVar3);
                    kmb kmbVarM4562k6 = cdbVar4.m4562k(c3329mb, (kmb) arrayList.get(1));
                    kmb kmbVarM4562k7 = arrayList.size() > 2 ? cdbVar4.m4562k(c3329mb, (kmb) arrayList.get(2)) : null;
                    cnb cnbVar2 = kmb.f47523y;
                    if (!kmbVarM4562k5.mo3808b().booleanValue()) {
                        if (kmbVarM4562k7 != null) {
                            kmbVarM16735m = c3329mb.m16735m((cib) kmbVarM4562k7);
                        } else {
                            kmbVar = cnbVar2;
                        }
                        if (true != (kmbVar instanceof jjb)) {
                            return cnbVar2;
                        }
                        return kmbVar;
                    }
                    kmbVarM16735m = c3329mb.m16735m((cib) kmbVarM4562k6);
                    kmbVar = kmbVarM16735m;
                    if (true != (kmbVar instanceof jjb)) {
                        return cnbVar2;
                    }
                    return kmbVar;
                }
                if (iOrdinal2 == 54) {
                    return new cib(arrayList);
                }
                if (iOrdinal2 == 57) {
                    if (arrayList.isEmpty()) {
                        return kmb.f47519C;
                    }
                    return new jjb("return", ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.RETURN, 1, arrayList, 0)));
                }
                if (iOrdinal2 != 19) {
                    if (iOrdinal2 == 20) {
                        qdd.m19876c(2, zzbk.DEFINE_FUNCTION.name(), arrayList);
                        gmb gmbVarM12770c = m12770c(c3329mb, arrayList);
                        String str3 = gmbVarM12770c.f65549a;
                        if (str3 == null) {
                            c3329mb.m16738p("", gmbVarM12770c);
                            return gmbVarM12770c;
                        }
                        c3329mb.m16738p(str3, gmbVarM12770c);
                        return gmbVarM12770c;
                    }
                    if (iOrdinal2 == 60) {
                        kmb kmbVar4 = (kmb) dnb.m10504e(zzbk.SWITCH, 3, arrayList, 0);
                        cdb cdbVar5 = (cdb) c3329mb.f50861c;
                        cdb cdbVar6 = (cdb) c3329mb.f50861c;
                        kmb kmbVarM4562k8 = cdbVar5.m4562k(c3329mb, kmbVar4);
                        kmb kmbVarM4562k9 = cdbVar6.m4562k(c3329mb, (kmb) arrayList.get(1));
                        kmb kmbVarM4562k10 = cdbVar6.m4562k(c3329mb, (kmb) arrayList.get(2));
                        if (!(kmbVarM4562k9 instanceof cib)) {
                            C3386nv.m17626m("Malformed SWITCH statement, cases are not a list");
                            return null;
                        }
                        if (!(kmbVarM4562k10 instanceof cib)) {
                            C3386nv.m17626m("Malformed SWITCH statement, case statements are not a list");
                            return null;
                        }
                        cib cibVar2 = (cib) kmbVarM4562k9;
                        cib cibVar3 = (cib) kmbVarM4562k10;
                        boolean z = false;
                        for (int i2 = 0; i2 < cibVar2.m4744n(); i2++) {
                            if (z || kmbVarM4562k8.equals(cdbVar6.m4562k(c3329mb, cibVar2.m4745o(i2)))) {
                                kmb kmbVarM4562k11 = cdbVar6.m4562k(c3329mb, cibVar3.m4745o(i2));
                                if (kmbVarM4562k11 instanceof jjb) {
                                    return ((jjb) kmbVarM4562k11).f45638b.equals("break") ? kmb.f47523y : kmbVarM4562k11;
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (cibVar2.m4744n() + 1 == cibVar3.m4744n()) {
                            kmb kmbVarM4562k12 = cdbVar6.m4562k(c3329mb, cibVar3.m4745o(cibVar2.m4744n()));
                            if (kmbVarM4562k12 instanceof jjb) {
                                String str4 = ((jjb) kmbVarM4562k12).f45638b;
                                if (str4.equals("return") || str4.equals("continue")) {
                                    return kmbVarM4562k12;
                                }
                            }
                        }
                        return kmb.f47523y;
                    }
                    if (iOrdinal2 == 61) {
                        kmb kmbVar5 = (kmb) dnb.m10504e(zzbk.TERNARY, 3, arrayList, 0);
                        cdb cdbVar7 = (cdb) c3329mb.f50861c;
                        cdb cdbVar8 = (cdb) c3329mb.f50861c;
                        return cdbVar7.m4562k(c3329mb, kmbVar5).mo3808b().booleanValue() ? cdbVar8.m4562k(c3329mb, (kmb) arrayList.get(1)) : cdbVar8.m4562k(c3329mb, (kmb) arrayList.get(2));
                    }
                    switch (iOrdinal2) {
                        case 11:
                            return c3329mb.m16736n().m16735m(new cib(arrayList));
                        case 12:
                            qdd.m19875b(0, zzbk.BREAK.name(), arrayList);
                            return kmb.f47518B;
                        case 13:
                            break;
                        default:
                            m12777b(str);
                            throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    return kmb.f47523y;
                }
                kmb kmbVarM4562k13 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                return kmbVarM4562k13 instanceof cib ? c3329mb.m16735m((cib) kmbVarM4562k13) : kmb.f47523y;
            case 3:
                zzbk zzbkVar3 = zzbk.ADD;
                int iOrdinal3 = qdd.m19879f(str).ordinal();
                if (iOrdinal3 == 1) {
                    kmb kmbVarM4562k14 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.AND, 2, arrayList, 0));
                    if (kmbVarM4562k14.mo3808b().booleanValue()) {
                        return ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1));
                    }
                    return kmbVarM4562k14;
                }
                if (iOrdinal3 == 47) {
                    return new sib(Boolean.valueOf(!((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.NOT, 1, arrayList, 0)).mo3808b().booleanValue()));
                }
                if (iOrdinal3 != 50) {
                    m12777b(str);
                    throw null;
                }
                kmb kmbVarM4562k15 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.OR, 2, arrayList, 0));
                if (kmbVarM4562k15.mo3808b().booleanValue()) {
                    return kmbVarM4562k15;
                }
                return ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1));
            case 4:
                zzbk zzbkVar4 = zzbk.ADD;
                int iOrdinal4 = qdd.m19879f(str).ordinal();
                if (iOrdinal4 == 65) {
                    kmb kmbVar6 = (kmb) dnb.m10504e(zzbk.WHILE, 4, arrayList, 0);
                    kmb kmbVar7 = (kmb) arrayList.get(1);
                    kmb kmbVar8 = (kmb) arrayList.get(2);
                    kmb kmbVar9 = (kmb) arrayList.get(3);
                    cdb cdbVar9 = (cdb) c3329mb.f50861c;
                    cdb cdbVar10 = (cdb) c3329mb.f50861c;
                    kmb kmbVarM4562k16 = cdbVar9.m4562k(c3329mb, kmbVar9);
                    if (cdbVar10.m4562k(c3329mb, kmbVar8).mo3808b().booleanValue()) {
                        kmb kmbVarM16735m2 = c3329mb.m16735m((cib) kmbVarM4562k16);
                        if (kmbVarM16735m2 instanceof jjb) {
                            jjb jjbVar2 = (jjb) kmbVarM16735m2;
                            String str5 = jjbVar2.f45638b;
                            if ("break".equals(str5)) {
                                return kmb.f47523y;
                            }
                            if ("return".equals(str5)) {
                                return jjbVar2;
                            }
                        }
                    }
                    while (cdbVar10.m4562k(c3329mb, kmbVar6).mo3808b().booleanValue()) {
                        kmb kmbVarM16735m3 = c3329mb.m16735m((cib) kmbVarM4562k16);
                        if (kmbVarM16735m3 instanceof jjb) {
                            jjb jjbVar3 = (jjb) kmbVarM16735m3;
                            String str6 = jjbVar3.f45638b;
                            if ("break".equals(str6)) {
                                return kmb.f47523y;
                            }
                            if ("return".equals(str6)) {
                                return jjbVar3;
                            }
                        }
                        c3329mb.m16734l(kmbVar7);
                    }
                    return kmb.f47523y;
                }
                switch (iOrdinal4) {
                    case 26:
                        if (!(dnb.m10504e(zzbk.FOR_IN, 3, arrayList, 0) instanceof xmb)) {
                            C3386nv.m17626m("Variable name in FOR_IN must be a string");
                            return null;
                        }
                        String strMo3809c2 = ((kmb) arrayList.get(0)).mo3809c();
                        kmb kmbVarM4562k17 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1));
                        kmb kmbVarM4562k18 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(2));
                        Iterator itMo3810d = kmbVarM4562k17.mo3810d();
                        if (itMo3810d != null) {
                            while (itMo3810d.hasNext()) {
                                c3329mb.m16739q(strMo3809c2, (kmb) itMo3810d.next());
                                kmb kmbVarM16735m4 = c3329mb.m16735m((cib) kmbVarM4562k18);
                                if (kmbVarM16735m4 instanceof jjb) {
                                    jjbVar = (jjb) kmbVarM16735m4;
                                    String str7 = jjbVar.f45638b;
                                    if ("break".equals(str7)) {
                                        cnbVar = kmb.f47523y;
                                    } else if ("return".equals(str7)) {
                                        return jjbVar;
                                    }
                                }
                            }
                            cnbVar = kmb.f47523y;
                        } else {
                            cnbVar = kmb.f47523y;
                        }
                        return cnbVar;
                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        if (dnb.m10504e(zzbk.FOR_IN_CONST, 3, arrayList, 0) instanceof xmb) {
                            return m12774g(new rob(c3329mb, ((kmb) arrayList.get(0)).mo3809c(), 0), ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3810d(), ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(2)));
                        }
                        C3386nv.m17626m("Variable name in FOR_IN_CONST must be a string");
                        return null;
                    case 28:
                        if (!(dnb.m10504e(zzbk.FOR_IN_LET, 3, arrayList, 0) instanceof xmb)) {
                            C3386nv.m17626m("Variable name in FOR_IN_LET must be a string");
                            return null;
                        }
                        String strMo3809c3 = ((kmb) arrayList.get(0)).mo3809c();
                        kmb kmbVarM4562k19 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1));
                        kmb kmbVarM4562k20 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(2));
                        Iterator itMo3810d2 = kmbVarM4562k19.mo3810d();
                        if (itMo3810d2 != null) {
                            while (itMo3810d2.hasNext()) {
                                kmb kmbVar10 = (kmb) itMo3810d2.next();
                                C3329mb c3329mbM16736n = c3329mb.m16736n();
                                c3329mbM16736n.m16739q(strMo3809c3, kmbVar10);
                                kmb kmbVarM16735m5 = c3329mbM16736n.m16735m((cib) kmbVarM4562k20);
                                if (kmbVarM16735m5 instanceof jjb) {
                                    jjbVar = (jjb) kmbVarM16735m5;
                                    String str8 = jjbVar.f45638b;
                                    if ("break".equals(str8)) {
                                        cnbVar = kmb.f47523y;
                                    } else if ("return".equals(str8)) {
                                        return jjbVar;
                                    }
                                }
                            }
                            cnbVar = kmb.f47523y;
                        } else {
                            cnbVar = kmb.f47523y;
                        }
                        return cnbVar;
                    case 29:
                        kmb kmbVar11 = (kmb) dnb.m10504e(zzbk.FOR_LET, 4, arrayList, 0);
                        cdb cdbVar11 = (cdb) c3329mb.f50861c;
                        cdb cdbVar12 = (cdb) c3329mb.f50861c;
                        kmb kmbVarM4562k21 = cdbVar11.m4562k(c3329mb, kmbVar11);
                        if (!(kmbVarM4562k21 instanceof cib)) {
                            C3386nv.m17626m("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        }
                        cib cibVar4 = (cib) kmbVarM4562k21;
                        kmb kmbVar12 = (kmb) arrayList.get(1);
                        kmb kmbVar13 = (kmb) arrayList.get(2);
                        kmb kmbVarM4562k22 = cdbVar12.m4562k(c3329mb, (kmb) arrayList.get(3));
                        C3329mb c3329mbM16736n2 = c3329mb.m16736n();
                        for (int i3 = 0; i3 < cibVar4.m4744n(); i3++) {
                            String strMo3809c4 = cibVar4.m4745o(i3).mo3809c();
                            c3329mbM16736n2.m16738p(strMo3809c4, c3329mb.m16740r(strMo3809c4));
                        }
                        while (cdbVar12.m4562k(c3329mb, kmbVar12).mo3808b().booleanValue()) {
                            kmb kmbVarM16735m6 = c3329mb.m16735m((cib) kmbVarM4562k22);
                            if (kmbVarM16735m6 instanceof jjb) {
                                jjb jjbVar4 = (jjb) kmbVarM16735m6;
                                String str9 = jjbVar4.f45638b;
                                if ("break".equals(str9)) {
                                    return kmb.f47523y;
                                }
                                if ("return".equals(str9)) {
                                    return jjbVar4;
                                }
                            }
                            C3329mb c3329mbM16736n3 = c3329mb.m16736n();
                            for (int i4 = 0; i4 < cibVar4.m4744n(); i4++) {
                                String strMo3809c5 = cibVar4.m4745o(i4).mo3809c();
                                c3329mbM16736n3.m16738p(strMo3809c5, c3329mbM16736n2.m16740r(strMo3809c5));
                            }
                            c3329mbM16736n3.m16734l(kmbVar13);
                            c3329mbM16736n2 = c3329mbM16736n3;
                        }
                        return kmb.f47523y;
                    case 30:
                        if (dnb.m10504e(zzbk.FOR_OF, 3, arrayList, 0) instanceof xmb) {
                            return m12772e(new rob(c3329mb, ((kmb) arrayList.get(0)).mo3809c(), 2), ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)), ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(2)));
                        }
                        C3386nv.m17626m("Variable name in FOR_OF must be a string");
                        return null;
                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        if (dnb.m10504e(zzbk.FOR_OF_CONST, 3, arrayList, 0) instanceof xmb) {
                            return m12772e(new rob(c3329mb, ((kmb) arrayList.get(0)).mo3809c(), 0), ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)), ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(2)));
                        }
                        C3386nv.m17626m("Variable name in FOR_OF_CONST must be a string");
                        return null;
                    case 32:
                        if (dnb.m10504e(zzbk.FOR_OF_LET, 3, arrayList, 0) instanceof xmb) {
                            return m12772e(new rob(c3329mb, ((kmb) arrayList.get(0)).mo3809c(), 1), ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)), ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(2)));
                        }
                        C3386nv.m17626m("Variable name in FOR_OF_LET must be a string");
                        return null;
                    default:
                        m12777b(str);
                        throw null;
                }
            case 5:
                zzbk zzbkVar5 = zzbk.ADD;
                int iOrdinal5 = qdd.m19879f(str).ordinal();
                if (iOrdinal5 == 0) {
                    kmb kmbVarM4562k23 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.ADD, 2, arrayList, 0));
                    kmb kmbVarM4562k24 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1));
                    xmbVar = ((kmbVarM4562k23 instanceof xlb) || (kmbVarM4562k23 instanceof xmb) || (kmbVarM4562k24 instanceof xlb) || (kmbVarM4562k24 instanceof xmb)) ? new xmb(String.valueOf(kmbVarM4562k23.mo3809c()).concat(String.valueOf(kmbVarM4562k24.mo3809c()))) : new bkb(Double.valueOf(kmbVarM4562k24.mo3811e().doubleValue() + kmbVarM4562k23.mo3811e().doubleValue()));
                } else if (iOrdinal5 == 21) {
                    xmbVar = new bkb(Double.valueOf(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.DIVIDE, 2, arrayList, 0)).mo3811e().doubleValue() / ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue()));
                } else {
                    if (iOrdinal5 == 59) {
                        return new bkb(Double.valueOf(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.SUBTRACT, 2, arrayList, 0)).mo3811e().doubleValue() + (-((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue())));
                    }
                    if (iOrdinal5 == 52 || iOrdinal5 == 53) {
                        qdd.m19875b(2, str, arrayList);
                        kmb kmbVarM4562k25 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                        c3329mb.m16734l((kmb) arrayList.get(1));
                        return kmbVarM4562k25;
                    }
                    if (iOrdinal5 == 55 || iOrdinal5 == 56) {
                        qdd.m19875b(1, str, arrayList);
                        return ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                    }
                    switch (iOrdinal5) {
                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            xmbVar = new bkb(Double.valueOf(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.MODULUS, 2, arrayList, 0)).mo3811e().doubleValue() % ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue()));
                            break;
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            return new bkb(Double.valueOf(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue() * ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.MULTIPLY, 2, arrayList, 0)).mo3811e().doubleValue()));
                        case 46:
                            return new bkb(Double.valueOf(-((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.NEGATE, 1, arrayList, 0)).mo3811e().doubleValue()));
                        default:
                            m12777b(str);
                            throw null;
                    }
                }
                return xmbVar;
            case 6:
                if (str == null || str.isEmpty() || !c3329mb.m16737o(str)) {
                    C3386nv.m17626m(AbstractC3393o1.m17734i("Command not found: ", str));
                    return null;
                }
                kmb kmbVarM16740r = c3329mb.m16740r(str);
                if (kmbVarM16740r instanceof vkb) {
                    return ((vkb) kmbVarM16740r).mo12757a(c3329mb, arrayList);
                }
                C3386nv.m17626m(wq1.m24118n("Function ", str, " is not defined"));
                return null;
            default:
                zzbk zzbkVar6 = zzbk.ADD;
                int iOrdinal6 = qdd.m19879f(str).ordinal();
                if (iOrdinal6 == 3) {
                    kmb kmbVarM4562k26 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.ASSIGN, 2, arrayList, 0));
                    if (!(kmbVarM4562k26 instanceof xmb)) {
                        C3386nv.m17626m(AbstractC3393o1.m17734i("Expected string for assign var. got ", kmbVarM4562k26.getClass().getCanonicalName()));
                        return null;
                    }
                    String str10 = ((xmb) kmbVarM4562k26).f68360a;
                    if (!c3329mb.m16737o(str10)) {
                        C3386nv.m17626m(AbstractC3393o1.m17734i("Attempting to assign undefined value ", str10));
                        return null;
                    }
                    kmb kmbVarM4562k27 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1));
                    c3329mb.m16738p(str10, kmbVarM4562k27);
                    return kmbVarM4562k27;
                }
                if (iOrdinal6 == 14) {
                    qdd.m19876c(2, zzbk.CONST.name(), arrayList);
                    if (arrayList.size() % 2 != 0) {
                        C3386nv.m17626m(ux5.m22988k(arrayList.size(), "CONST requires an even number of arguments, found "));
                        return null;
                    }
                    while (i < arrayList.size() - 1) {
                        kmb kmbVarM4562k28 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(i));
                        if (!(kmbVarM4562k28 instanceof xmb)) {
                            C3386nv.m17626m(AbstractC3393o1.m17734i("Expected string for const name. got ", kmbVarM4562k28.getClass().getCanonicalName()));
                            return null;
                        }
                        String str11 = ((xmb) kmbVarM4562k28).f68360a;
                        c3329mb.m16739q(str11, ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(i + 1)));
                        ((HashMap) c3329mb.f50863e).put(str11, Boolean.TRUE);
                        i += 2;
                    }
                    return kmb.f47523y;
                }
                if (iOrdinal6 == 24) {
                    qdd.m19876c(1, zzbk.EXPRESSION_LIST.name(), arrayList);
                    cibVar = kmb.f47523y;
                    while (i < arrayList.size()) {
                        kmb kmbVarM4562k29 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(i));
                        if (kmbVarM4562k29 instanceof jjb) {
                            C3386nv.m17633t("ControlValue cannot be in an expression list");
                            return null;
                        }
                        i++;
                        cibVar = kmbVarM4562k29;
                    }
                } else {
                    if (iOrdinal6 == 33) {
                        kmb kmbVarM4562k30 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.GET, 1, arrayList, 0));
                        if (kmbVarM4562k30 instanceof xmb) {
                            return c3329mb.m16740r(((xmb) kmbVarM4562k30).f68360a);
                        }
                        C3386nv.m17626m(AbstractC3393o1.m17734i("Expected string for get var. got ", kmbVarM4562k30.getClass().getCanonicalName()));
                        return null;
                    }
                    if (iOrdinal6 == 49) {
                        qdd.m19875b(0, zzbk.NULL.name(), arrayList);
                        return kmb.f47524z;
                    }
                    if (iOrdinal6 == 58) {
                        kmb kmbVar14 = (kmb) dnb.m10504e(zzbk.SET_PROPERTY, 3, arrayList, 0);
                        cdb cdbVar13 = (cdb) c3329mb.f50861c;
                        cdb cdbVar14 = (cdb) c3329mb.f50861c;
                        kmb kmbVarM4562k31 = cdbVar13.m4562k(c3329mb, kmbVar14);
                        kmb kmbVarM4562k32 = cdbVar14.m4562k(c3329mb, (kmb) arrayList.get(1));
                        kmb kmbVarM4562k33 = cdbVar14.m4562k(c3329mb, (kmb) arrayList.get(2));
                        if (kmbVarM4562k31 == kmb.f47523y || kmbVarM4562k31 == kmb.f47524z) {
                            C3386nv.m17633t(wq1.m24119o("Can't set property ", kmbVarM4562k32.mo3809c(), " of ", kmbVarM4562k31.mo3809c()));
                            return null;
                        }
                        if ((kmbVarM4562k31 instanceof cib) && (kmbVarM4562k32 instanceof bkb)) {
                            ((cib) kmbVarM4562k31).m4746r(((bkb) kmbVarM4562k32).f8647a.intValue(), kmbVarM4562k33);
                        } else if (kmbVarM4562k31 instanceof xlb) {
                            ((xlb) kmbVarM4562k31).mo3881i(kmbVarM4562k32.mo3809c(), kmbVarM4562k33);
                        }
                        return kmbVarM4562k33;
                    }
                    if (iOrdinal6 != 17) {
                        if (iOrdinal6 != 18) {
                            if (iOrdinal6 == 35 || iOrdinal6 == 36) {
                                kmb kmbVarM4562k34 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.GET_PROPERTY, 2, arrayList, 0));
                                kmb kmbVarM4562k35 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1));
                                if ((kmbVarM4562k34 instanceof cib) && qdd.m19878e(kmbVarM4562k35)) {
                                    return ((cib) kmbVarM4562k34).m4745o(kmbVarM4562k35.mo3811e().intValue());
                                }
                                if (kmbVarM4562k34 instanceof xlb) {
                                    return ((xlb) kmbVarM4562k34).mo3880f(kmbVarM4562k35.mo3809c());
                                }
                                if (kmbVarM4562k34 instanceof xmb) {
                                    if ("length".equals(kmbVarM4562k35.mo3809c())) {
                                        return new bkb(Double.valueOf(((xmb) kmbVarM4562k34).f68360a.length()));
                                    }
                                    if (qdd.m19878e(kmbVarM4562k35)) {
                                        double dDoubleValue = kmbVarM4562k35.mo3811e().doubleValue();
                                        String str12 = ((xmb) kmbVarM4562k34).f68360a;
                                        if (dDoubleValue < str12.length()) {
                                            return new xmb(String.valueOf(str12.charAt(kmbVarM4562k35.mo3811e().intValue())));
                                        }
                                    }
                                }
                                return kmb.f47523y;
                            }
                            switch (iOrdinal6) {
                                case 62:
                                    kmb kmbVarM4562k36 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) dnb.m10504e(zzbk.TYPEOF, 1, arrayList, 0));
                                    if (kmbVarM4562k36 instanceof cnb) {
                                        str2 = "undefined";
                                    } else if (kmbVarM4562k36 instanceof sib) {
                                        str2 = "boolean";
                                    } else if (kmbVarM4562k36 instanceof bkb) {
                                        str2 = "number";
                                    } else if (kmbVarM4562k36 instanceof xmb) {
                                        str2 = "string";
                                    } else if (kmbVarM4562k36 instanceof gmb) {
                                        str2 = "function";
                                    } else {
                                        if ((kmbVarM4562k36 instanceof rmb) || (kmbVarM4562k36 instanceof jjb)) {
                                            uk9.m22783r("Unsupported value type %s in typeof", new Object[]{kmbVarM4562k36});
                                            return null;
                                        }
                                        str2 = "object";
                                    }
                                    return new xmb(str2);
                                case 63:
                                    qdd.m19875b(0, zzbk.UNDEFINED.name(), arrayList);
                                    return kmb.f47523y;
                                case 64:
                                    qdd.m19876c(1, zzbk.VAR.name(), arrayList);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        kmb kmbVarM4562k37 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) it.next());
                                        if (!(kmbVarM4562k37 instanceof xmb)) {
                                            C3386nv.m17626m(AbstractC3393o1.m17734i("Expected string for var name. got ", kmbVarM4562k37.getClass().getCanonicalName()));
                                            return null;
                                        }
                                        c3329mb.m16739q(((xmb) kmbVarM4562k37).f68360a, kmb.f47523y);
                                    }
                                    return kmb.f47523y;
                                default:
                                    m12777b(str);
                                    throw null;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new bmb();
                        }
                        if (arrayList.size() % 2 != 0) {
                            C3386nv.m17626m(ux5.m22988k(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            return null;
                        }
                        cibVar = new bmb();
                        while (i < arrayList.size() - 1) {
                            kmb kmbVarM4562k38 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(i));
                            kmb kmbVarM4562k39 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(i + 1));
                            if ((kmbVarM4562k38 instanceof jjb) || (kmbVarM4562k39 instanceof jjb)) {
                                C3386nv.m17633t("Failed to evaluate map entry");
                                return null;
                            }
                            cibVar.mo3881i(kmbVarM4562k38.mo3809c(), kmbVarM4562k39);
                            i += 2;
                        }
                    } else {
                        if (arrayList.isEmpty()) {
                            return new cib();
                        }
                        cibVar = new cib();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            kmb kmbVarM4562k40 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) it2.next());
                            if (kmbVarM4562k40 instanceof jjb) {
                                C3386nv.m17633t("Failed to evaluate array element");
                                return null;
                            }
                            cibVar.m4746r(i, kmbVarM4562k40);
                            i++;
                        }
                    }
                }
                return cibVar;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12777b(String str) {
        if (!this.f41057a.contains(qdd.m19879f(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
