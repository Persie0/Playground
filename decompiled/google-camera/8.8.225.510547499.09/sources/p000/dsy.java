package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dsy {
    /* JADX INFO: renamed from: b */
    public static final ocd m6712b(gsr gsrVar, float f, float f2) {
        return m6713c(gsrVar, null, f, f2);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: c */
    public static final ocd m6713c(gsr gsrVar, jzk jzkVar, float f, float f2) {
        Map map = gsrVar.f26240D;
        HashMap map2 = new HashMap();
        if (jzkVar != null) {
            for (dyk dykVar : jzkVar.f35297b) {
                map2.put(Long.valueOf(dykVar.f12918a), Float.valueOf(dykVar.f12919b));
            }
        }
        ArrayList arrayList = new ArrayList();
        gsu[] gsuVarArr = gsrVar.f26257q;
        int length = gsuVarArr.length;
        int i = 0;
        while (i < length) {
            gsu gsuVar = gsuVarArr[i];
            dyt dytVar = (dyt) map.get(Integer.valueOf(gsuVar.f26294i));
            Float f3 = (Float) map2.get(Long.valueOf(gsuVar.f26294i));
            float fFloatValue = f3 == null ? 0.0f : f3.floatValue();
            Rect rect = gsuVar.f26286a;
            nxl nxlVarM18137O = oca.f45417f.m18137O();
            float f4 = rect.left * f;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            oca ocaVar = (oca) nxlVarM18137O.f44974b;
            gsu[] gsuVarArr2 = gsuVarArr;
            ocaVar.f45419a |= 1;
            ocaVar.f45420b = f4;
            float f5 = rect.right * f;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            oca ocaVar2 = (oca) nxlVarM18137O.f44974b;
            ocaVar2.f45419a |= 4;
            ocaVar2.f45422d = f5;
            float f6 = rect.top * f2;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            oca ocaVar3 = (oca) nxlVarM18137O.f44974b;
            ocaVar3.f45419a |= 2;
            ocaVar3.f45421c = f6;
            float f7 = rect.bottom * f2;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            oca ocaVar4 = (oca) nxlVarM18137O.f44974b;
            ocaVar4.f45419a |= 8;
            ocaVar4.f45423e = f7;
            oca ocaVar5 = (oca) nxlVarM18137O.mo18103l();
            ArrayList arrayList2 = new ArrayList();
            m6714d(1, gsuVar.f26288c, arrayList2, f, f2);
            m6714d(2, gsuVar.f26289d, arrayList2, f, f2);
            m6714d(46, gsuVar.f26290e, arrayList2, f, f2);
            m6714d(10, gsuVar.f26291f, arrayList2, f, f2);
            m6714d(241, gsuVar.f26292g, arrayList2, f, f2);
            m6714d(242, gsuVar.f26293h, arrayList2, f, f2);
            nxn nxnVar = (nxn) occ.f45430k.m18137O();
            if (!nxnVar.f44974b.m18142ac()) {
                nxnVar.mo18106p();
            }
            occ occVar = (occ) nxnVar.f44974b;
            ocaVar5.getClass();
            occVar.f45433b = ocaVar5;
            occVar.f45432a |= 1;
            float f8 = gsuVar.f26287b;
            if (!nxnVar.f44974b.m18142ac()) {
                nxnVar.mo18106p();
            }
            occ occVar2 = (occ) nxnVar.f44974b;
            occVar2.f45432a = 2 | occVar2.f45432a;
            occVar2.f45435d = f8 / 100.0f;
            float f9 = gsuVar.f26295j;
            if (!nxnVar.f44974b.m18142ac()) {
                nxnVar.mo18106p();
            }
            occ occVar3 = (occ) nxnVar.f44974b;
            occVar3.f45432a |= 16;
            occVar3.f45438g = f9;
            float f10 = gsuVar.f26296k;
            if (!nxnVar.f44974b.m18142ac()) {
                nxnVar.mo18106p();
            }
            occ occVar4 = (occ) nxnVar.f44974b;
            occVar4.f45432a |= 8;
            occVar4.f45437f = f10;
            float f11 = gsuVar.f26297l;
            if (!nxnVar.f44974b.m18142ac()) {
                nxnVar.mo18106p();
            }
            occ occVar5 = (occ) nxnVar.f44974b;
            occVar5.f45432a |= 4;
            occVar5.f45436e = f11;
            if (!nxnVar.f44974b.m18142ac()) {
                nxnVar.mo18106p();
            }
            occ occVar6 = (occ) nxnVar.f44974b;
            nxy nxyVar = occVar6.f45434c;
            if (!nxyVar.mo17770c()) {
                occVar6.f45434c = nxq.m18127U(nxyVar);
            }
            nwb.m17749e(arrayList2, occVar6.f45434c);
            nxl nxlVarM18137O2 = odn.f45632i.m18137O();
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            odn odnVar = (odn) nxlVarM18137O2.f44974b;
            odnVar.f45635a |= 4;
            odnVar.f45638d = fFloatValue;
            int i2 = gsuVar.f26294i;
            if (i2 != -1) {
                if (!nxnVar.f44974b.m18142ac()) {
                    nxnVar.mo18106p();
                }
                occ occVar7 = (occ) nxnVar.f44974b;
                occVar7.f45432a |= 64;
                occVar7.f45440i = i2;
                long j = gsuVar.f26294i;
                if (!nxnVar.f44974b.m18142ac()) {
                    nxnVar.mo18106p();
                }
                occ occVar8 = (occ) nxnVar.f44974b;
                occVar8.f45432a |= 128;
                occVar8.f45441j = j;
                if (dytVar != null) {
                    nxl nxlVarM18137O3 = odo.f45645d.m18137O();
                    mws mwsVar = dytVar.f12931b;
                    if (!nxlVarM18137O3.f44974b.m18142ac()) {
                        nxlVarM18137O3.mo18106p();
                    }
                    odo odoVar = (odo) nxlVarM18137O3.f44974b;
                    nxv nxvVar = odoVar.f45648b;
                    if (!nxvVar.mo17770c()) {
                        odoVar.f45648b = nxq.m18124R(nxvVar);
                    }
                    nwb.m17749e(mwsVar, odoVar.f45648b);
                    float f12 = dytVar.f12932c;
                    if (!nxlVarM18137O3.f44974b.m18142ac()) {
                        nxlVarM18137O3.mo18106p();
                    }
                    odo odoVar2 = (odo) nxlVarM18137O3.f44974b;
                    odoVar2.f45647a |= 1;
                    odoVar2.f45649c = f12;
                    odo odoVar3 = (odo) nxlVarM18137O3.mo18103l();
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    odn odnVar2 = (odn) nxlVarM18137O2.f44974b;
                    odoVar3.getClass();
                    odnVar2.f45641g = odoVar3;
                    odnVar2.f45635a |= 32;
                }
            }
            nxnVar.m18119aJ(odn.f45633j, (odn) nxlVarM18137O2.mo18103l());
            arrayList.add((occ) nxnVar.mo18103l());
            i++;
            gsuVarArr = gsuVarArr2;
        }
        nxl nxlVarM18137O4 = ocd.f45443b.m18137O();
        if (!nxlVarM18137O4.f44974b.m18142ac()) {
            nxlVarM18137O4.mo18106p();
        }
        ocd ocdVar = (ocd) nxlVarM18137O4.f44974b;
        nxy nxyVar2 = ocdVar.f45445a;
        if (!nxyVar2.mo17770c()) {
            ocdVar.f45445a = nxq.m18127U(nxyVar2);
        }
        nwb.m17749e(arrayList, ocdVar.f45445a);
        return (ocd) nxlVarM18137O4.mo18103l();
    }

    /* JADX INFO: renamed from: d */
    private static final void m6714d(int i, PointF pointF, ArrayList arrayList, float f, float f2) {
        if (pointF == null || pointF.x < -1000.0f) {
            return;
        }
        nxl nxlVarM18137O = ocb.f45424e.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ocb ocbVar = (ocb) nxlVarM18137O.f44974b;
        ocbVar.f45429d = i - 1;
        ocbVar.f45426a |= 8;
        float f3 = f * pointF.x;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ocb ocbVar2 = (ocb) nxlVarM18137O.f44974b;
        ocbVar2.f45426a |= 1;
        ocbVar2.f45427b = f3;
        float f4 = f2 * pointF.y;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ocb ocbVar3 = (ocb) nxlVarM18137O.f44974b;
        ocbVar3.f45426a |= 2;
        ocbVar3.f45428c = f4;
        arrayList.add((ocb) nxlVarM18137O.mo18103l());
    }
}
