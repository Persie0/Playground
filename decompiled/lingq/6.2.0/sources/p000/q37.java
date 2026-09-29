package p000;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class q37 extends AbstractC3695vr {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f57190p;

    /* JADX INFO: renamed from: q */
    public final Method f57191q;

    /* JADX INFO: renamed from: r */
    public final int f57192r;

    /* JADX INFO: renamed from: s */
    public final boolean f57193s;

    public /* synthetic */ q37(Method method, int i, boolean z, int i2) {
        this.f57190p = i2;
        this.f57191q = method;
        this.f57192r = i;
        this.f57193s = z;
    }

    @Override // p000.AbstractC3695vr
    /* JADX INFO: renamed from: f */
    public final void mo16613f(b78 b78Var, Object obj) {
        int i = this.f57190p;
        boolean z = this.f57193s;
        Method method = this.f57191q;
        int i2 = this.f57192r;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    throw ci8.m4699L(method, i2, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw ci8.m4699L(method, i2, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw ci8.m4699L(method, i2, wq1.m24118n("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw ci8.m4699L(method, i2, "Field map value '" + value + "' converted to null by " + nj0.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    b78Var.m3399a(str, string, z);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                if (map2 == null) {
                    throw ci8.m4699L(method, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw ci8.m4699L(method, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw ci8.m4699L(method, i2, wq1.m24118n("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    b78Var.m3400b(str2, value2.toString(), z);
                }
                return;
            default:
                Map map3 = (Map) obj;
                if (map3 == null) {
                    throw ci8.m4699L(method, i2, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw ci8.m4699L(method, i2, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw ci8.m4699L(method, i2, wq1.m24118n("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw ci8.m4699L(method, i2, "Query map value '" + value3 + "' converted to null by " + nj0.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    b78Var.m3401c(str3, string2, z);
                }
                return;
        }
    }
}
