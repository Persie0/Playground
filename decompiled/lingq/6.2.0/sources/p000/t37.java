package p000;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class t37 extends AbstractC3695vr {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f61800p = 1;

    /* JADX INFO: renamed from: q */
    public final Method f61801q;

    /* JADX INFO: renamed from: r */
    public final int f61802r;

    /* JADX INFO: renamed from: s */
    public final fm1 f61803s;

    /* JADX INFO: renamed from: t */
    public final Object f61804t;

    public t37(Method method, int i, fm1 fm1Var, String str) {
        this.f61801q = method;
        this.f61802r = i;
        this.f61803s = fm1Var;
        this.f61804t = str;
    }

    @Override // p000.AbstractC3695vr
    /* JADX INFO: renamed from: f */
    public final void mo16613f(b78 b78Var, Object obj) {
        int i = this.f61800p;
        fm1 fm1Var = this.f61803s;
        Object obj2 = this.f61804t;
        Method method = this.f61801q;
        int i2 = this.f61802r;
        switch (i) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    b78Var.f8058i.m12905m((qr3) obj2, (z68) fm1Var.convert(obj));
                    return;
                } catch (IOException e) {
                    throw ci8.m4699L(method, i2, "Unable to convert " + obj + " to RequestBody", e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw ci8.m4699L(method, i2, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw ci8.m4699L(method, i2, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw ci8.m4699L(method, i2, wq1.m24118n("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", wq1.m24118n("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    qr3 qr3Var = qr3.f58109b;
                    b78Var.f8058i.m12905m(pb1.m19024L(strArr), (z68) fm1Var.convert(value));
                }
                return;
        }
    }

    public t37(Method method, int i, qr3 qr3Var, fm1 fm1Var) {
        this.f61801q = method;
        this.f61802r = i;
        this.f61804t = qr3Var;
        this.f61803s = fm1Var;
    }
}
