package p000;

import android.os.Bundle;
import com.facebook.appevents.OperationalDataEnum;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v24 {

    /* JADX INFO: renamed from: a */
    public static final List f64729a = vz1.m23604J("fb_currency");

    /* JADX INFO: renamed from: b */
    public static final List f64730b = vz1.m23604J("_valueToSum");

    /* JADX INFO: renamed from: c */
    public static final long f64731c = 60000;

    /* JADX INFO: renamed from: d */
    public static final List f64732d = vz1.m23605K(new Pair("fb_iap_product_id", vz1.m23604J("fb_iap_product_id")), new Pair("fb_iap_product_description", vz1.m23604J("fb_iap_product_description")), new Pair("fb_iap_product_title", vz1.m23604J("fb_iap_product_title")), new Pair("fb_iap_purchase_token", vz1.m23604J("fb_iap_purchase_token")));

    /* JADX INFO: renamed from: a */
    public static Pair m23059a(Bundle bundle, Bundle bundle2, jz6 jz6Var) {
        if (bundle == null) {
            return new Pair(bundle2, jz6Var);
        }
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    Map map = jz6.f46432b;
                    OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
                    str.getClass();
                    Pair pairM11647i = fa4.m11647i(operationalDataEnum, str, string, bundle2, jz6Var);
                    Bundle bundle3 = (Bundle) pairM11647i.f47623a;
                    jz6Var = (jz6) pairM11647i.f47624b;
                    bundle2 = bundle3;
                }
            }
        } catch (Exception unused) {
        }
        return new Pair(bundle2, jz6Var);
    }

    /* JADX INFO: renamed from: b */
    public static Currency m23060b(Bundle bundle) {
        String string;
        w23 w23VarM24854b = y23.m24854b(sy2.m21767b());
        for (String str : ((w23VarM24854b != null ? w23VarM24854b.f66271t : null) == null || w23VarM24854b.f66271t.isEmpty()) ? f64729a : w23VarM24854b.f66271t) {
            if (bundle != null) {
                try {
                    string = bundle.getString(str);
                } catch (Exception unused) {
                    continue;
                }
            } else {
                string = null;
            }
            if (string != null && string.length() != 0) {
                return Currency.getInstance(string);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static List m23061c(boolean z) {
        w23 w23VarM24854b = y23.m24854b(sy2.m21767b());
        if ((w23VarM24854b != null ? w23VarM24854b.f66273v : null) != null) {
            List<Pair> list = w23VarM24854b.f66273v;
            if (!list.isEmpty()) {
                if (!z) {
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                for (Pair pair : list) {
                    Iterator it = ((List) pair.f47624b).iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Pair((String) it.next(), vz1.m23604J(pair.f47623a)));
                    }
                }
                return arrayList;
            }
        }
        return f64732d;
    }

    /* JADX INFO: renamed from: d */
    public static long m23062d() {
        Long l;
        w23 w23VarM24854b = y23.m24854b(sy2.m21767b());
        return ((w23VarM24854b != null ? w23VarM24854b.f66275x : null) == null || ((l = w23VarM24854b.f66275x) != null && l.longValue() == 0)) ? f64731c : w23VarM24854b.f66275x.longValue();
    }

    /* JADX INFO: renamed from: e */
    public static List m23063e(boolean z) {
        w23 w23VarM24854b = y23.m24854b(sy2.m21767b());
        if (w23VarM24854b == null) {
            return null;
        }
        List<Pair> list = w23VarM24854b.f66274w;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : list) {
            Iterator it = ((List) pair.f47624b).iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair((String) it.next(), vz1.m23604J(pair.f47623a)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static Double m23064f(Double d, Bundle bundle) {
        if (d != null) {
            return d;
        }
        w23 w23VarM24854b = y23.m24854b(sy2.m21767b());
        Iterator it = (((w23VarM24854b != null ? w23VarM24854b.f66272u : null) == null || w23VarM24854b.f66272u.isEmpty()) ? f64730b : w23VarM24854b.f66272u).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (bundle != null) {
                try {
                    return Double.valueOf(bundle.getDouble(str));
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }
}
