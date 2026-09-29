package p000;

import com.facebook.appevents.p008ml.ModelManager$Task;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes2.dex */
public final class t06 {

    /* JADX INFO: renamed from: m */
    public static final HashMap f61704m = AbstractC3194a.m15362O(new Pair("embedding.weight", "embed.weight"), new Pair("dense1.weight", "fc1.weight"), new Pair("dense2.weight", "fc2.weight"), new Pair("dense3.weight", "fc3.weight"), new Pair("dense1.bias", "fc1.bias"), new Pair("dense2.bias", "fc2.bias"), new Pair("dense3.bias", "fc3.bias"));

    /* JADX INFO: renamed from: a */
    public final io5 f61705a;

    /* JADX INFO: renamed from: b */
    public final io5 f61706b;

    /* JADX INFO: renamed from: c */
    public final io5 f61707c;

    /* JADX INFO: renamed from: d */
    public final io5 f61708d;

    /* JADX INFO: renamed from: e */
    public final io5 f61709e;

    /* JADX INFO: renamed from: f */
    public final io5 f61710f;

    /* JADX INFO: renamed from: g */
    public final io5 f61711g;

    /* JADX INFO: renamed from: h */
    public final io5 f61712h;

    /* JADX INFO: renamed from: i */
    public final io5 f61713i;

    /* JADX INFO: renamed from: j */
    public final io5 f61714j;

    /* JADX INFO: renamed from: k */
    public final io5 f61715k;

    /* JADX INFO: renamed from: l */
    public final HashMap f61716l;

    public t06(HashMap map) {
        Object obj = map.get("embed.weight");
        if (obj == null) {
            C3386nv.m17633t("Required value was null.");
            throw null;
        }
        this.f61705a = (io5) obj;
        Object obj2 = map.get("convs.0.weight");
        if (obj2 == null) {
            C3386nv.m17633t("Required value was null.");
            throw null;
        }
        this.f61706b = lz6.m16588m((io5) obj2);
        Object obj3 = map.get("convs.1.weight");
        if (obj3 == null) {
            C3386nv.m17633t("Required value was null.");
            throw null;
        }
        this.f61707c = lz6.m16588m((io5) obj3);
        Object obj4 = map.get("convs.2.weight");
        if (obj4 == null) {
            C3386nv.m17633t("Required value was null.");
            throw null;
        }
        this.f61708d = lz6.m16588m((io5) obj4);
        Object obj5 = map.get("convs.0.bias");
        if (obj5 == null) {
            C3386nv.m17633t("Required value was null.");
            throw null;
        }
        this.f61709e = (io5) obj5;
        Object obj6 = map.get("convs.1.bias");
        if (obj6 == null) {
            C3386nv.m17633t("Required value was null.");
            throw null;
        }
        this.f61710f = (io5) obj6;
        Object obj7 = map.get("convs.2.bias");
        if (obj7 == null) {
            C3386nv.m17633t("Required value was null.");
            throw null;
        }
        this.f61711g = (io5) obj7;
        Object obj8 = map.get("fc1.weight");
        if (obj8 == null) {
            C3386nv.m17633t("Required value was null.");
            throw null;
        }
        this.f61712h = lz6.m16587l((io5) obj8);
        Object obj9 = map.get("fc2.weight");
        if (obj9 == null) {
            C3386nv.m17633t("Required value was null.");
            throw null;
        }
        this.f61713i = lz6.m16587l((io5) obj9);
        Object obj10 = map.get("fc1.bias");
        if (obj10 == null) {
            C3386nv.m17633t("Required value was null.");
            throw null;
        }
        this.f61714j = (io5) obj10;
        Object obj11 = map.get("fc2.bias");
        if (obj11 == null) {
            C3386nv.m17633t("Required value was null.");
            throw null;
        }
        this.f61715k = (io5) obj11;
        this.f61716l = new HashMap();
        for (String str : AbstractC3550rv.m20855w0(new String[]{ModelManager$Task.MTML_INTEGRITY_DETECT.toKey(), ModelManager$Task.MTML_APP_EVENT_PREDICTION.toKey()})) {
            String strM22990m = ux5.m22990m(str, ".weight");
            String strM22990m2 = ux5.m22990m(str, ".bias");
            io5 io5Var = (io5) map.get(strM22990m);
            io5 io5Var2 = (io5) map.get(strM22990m2);
            if (io5Var != null) {
                this.f61716l.put(strM22990m, lz6.m16587l(io5Var));
            }
            if (io5Var2 != null) {
                this.f61716l.put(strM22990m2, io5Var2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final io5 m21806a(io5 io5Var, String[] strArr, String str) {
        HashMap map = this.f61716l;
        if (!lp1.f49971a.contains(this)) {
            try {
                str.getClass();
                io5 io5VarM16578c = lz6.m16578c(lz6.m16580e(strArr, this.f61705a), this.f61706b);
                lz6.m16576a(io5VarM16578c, this.f61709e);
                lz6.m16585j(io5VarM16578c);
                io5 io5VarM16578c2 = lz6.m16578c(io5VarM16578c, this.f61707c);
                lz6.m16576a(io5VarM16578c2, this.f61710f);
                lz6.m16585j(io5VarM16578c2);
                io5 io5VarM16583h = lz6.m16583h(io5VarM16578c2, 2);
                io5 io5VarM16578c3 = lz6.m16578c(io5VarM16583h, this.f61708d);
                lz6.m16576a(io5VarM16578c3, this.f61711g);
                lz6.m16585j(io5VarM16578c3);
                io5 io5VarM16583h2 = lz6.m16583h(io5VarM16578c, io5VarM16578c.f44357a[1]);
                io5 io5VarM16583h3 = lz6.m16583h(io5VarM16583h, io5VarM16583h.f44357a[1]);
                io5 io5VarM16583h4 = lz6.m16583h(io5VarM16578c3, io5VarM16578c3.f44357a[1]);
                lz6.m16581f(io5VarM16583h2);
                lz6.m16581f(io5VarM16583h3);
                lz6.m16581f(io5VarM16583h4);
                io5 io5VarM16579d = lz6.m16579d(lz6.m16577b(new io5[]{io5VarM16583h2, io5VarM16583h3, io5VarM16583h4, io5Var}), this.f61712h, this.f61714j);
                lz6.m16585j(io5VarM16579d);
                io5 io5VarM16579d2 = lz6.m16579d(io5VarM16579d, this.f61713i, this.f61715k);
                lz6.m16585j(io5VarM16579d2);
                io5 io5Var2 = (io5) map.get(str.concat(".weight"));
                io5 io5Var3 = (io5) map.get(str.concat(".bias"));
                if (io5Var2 != null && io5Var3 != null) {
                    io5 io5VarM16579d3 = lz6.m16579d(io5VarM16579d2, io5Var2, io5Var3);
                    lz6.m16586k(io5VarM16579d3);
                    return io5VarM16579d3;
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return null;
            }
        }
        return null;
    }
}
