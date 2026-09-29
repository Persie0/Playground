package p000;

import android.content.Context;
import com.kochava.core.json.internal.JsonType;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.datapoint.internal.DataPointLocation;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c02 {

    /* JADX INFO: renamed from: b */
    public static final sq5 f9246b;

    /* JADX INFO: renamed from: a */
    public final a02[] f9247a = mo4248a();

    static {
        sj5 sj5VarM20396w = r46.m20396w();
        f9246b = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "DataPointCollection");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX INFO: renamed from: c */
    public static boolean m4247c(rf4 rf4Var) {
        Object obj = rf4Var.f59203a;
        Object obj2 = rf4Var.f59203a;
        if (!(JsonType.getType(obj) == JsonType.Null) && JsonType.getType(obj2) != JsonType.Invalid) {
            if (JsonType.getType(obj2) == JsonType.String) {
                String strM3217L = b34.m3217L(obj2);
                if (strM3217L == null) {
                    strM3217L = "";
                }
                if (!b34.m3255w(strM3217L)) {
                    return JsonType.getType(obj2) == JsonType.JsonObject ? true : true;
                }
            } else if ((JsonType.getType(obj2) == JsonType.JsonObject || ((dg4) rf4Var.m20646a()).m10348r() != 0) && (JsonType.getType(obj2) != JsonType.JsonArray || ((ef4) b34.m3213H(obj2, true)).m11093f() != 0)) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public abstract a02[] mo4248a();

    /* JADX INFO: renamed from: b */
    public abstract rf4 mo4249b(Context context, n67 n67Var, String str, List list, List list2);

    /* JADX INFO: renamed from: d */
    public final void m4250d(Context context, n67 n67Var, boolean z, boolean z2, ArrayList arrayList, ArrayList arrayList2, List list, ArrayList arrayList3, eg4 eg4Var, eg4 eg4Var2) {
        sq5 sq5Var = f9246b;
        c02 c02Var = this;
        a02[] a02VarArr = c02Var.f9247a;
        int length = a02VarArr.length;
        int i = 0;
        while (i < length) {
            a02 a02Var = a02VarArr[i];
            String str = (String) a02Var.f14d;
            boolean z3 = a02Var.f13c;
            DataPointLocation dataPointLocation = (DataPointLocation) a02Var.f15e;
            PayloadType payloadType = n67Var.f52405a;
            if (((ArrayList) a02Var.f16f).contains(payloadType) && (z2 || dataPointLocation == DataPointLocation.Envelope || payloadType == PayloadType.Init)) {
                if (!arrayList2.contains(str)) {
                    if ((payloadType == PayloadType.Init || !list.contains(str)) && ((a02Var.f11a || !z) && (a02Var.f12b || ((dataPointLocation != DataPointLocation.Data || !((dg4) eg4Var2).m10345o(str)) && (dataPointLocation != DataPointLocation.Envelope || !((dg4) eg4Var).m10345o(str)))))) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            rf4 rf4VarMo4249b = c02Var.mo4249b(context, n67Var, str, arrayList, arrayList3);
                            if (m4247c(rf4VarMo4249b)) {
                                if (dataPointLocation == DataPointLocation.Envelope) {
                                    if (z3) {
                                        ((dg4) eg4Var).m10346p(rf4VarMo4249b.m20646a());
                                    } else {
                                        ((dg4) eg4Var).m10355y(str, rf4VarMo4249b);
                                    }
                                } else if (dataPointLocation == DataPointLocation.Data) {
                                    if (z3) {
                                        ((dg4) eg4Var2).m10346p(rf4VarMo4249b.m20646a());
                                    } else {
                                        ((dg4) eg4Var2).m10355y(str, rf4VarMo4249b);
                                    }
                                }
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                if (jCurrentTimeMillis2 > 500) {
                                    StringBuilder sbM17742q = AbstractC3393o1.m17742q("Datapoint gathering took longer then expected for ", str, " at ");
                                    sbM17742q.append(jCurrentTimeMillis2 / 1000.0d);
                                    sbM17742q.append(" seconds");
                                    sq5Var.m21555D(sbM17742q.toString());
                                }
                            }
                        } catch (Throwable th) {
                            StringBuilder sbM17742q2 = AbstractC3393o1.m17742q("Unable to gather datapoint: ", str, ", reason: ");
                            sbM17742q2.append(th.getMessage());
                            sq5Var.m21555D(sbM17742q2.toString());
                        }
                    }
                }
                i++;
                c02Var = this;
            }
            i++;
            c02Var = this;
        }
    }
}
