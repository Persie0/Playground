package p000;

import java.util.ArrayList;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public final class y12 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69087a = 0;

    /* JADX INFO: renamed from: b */
    public final ArrayList f69088b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public Object f69089c;

    public /* synthetic */ y12(Object obj) {
        this.f69089c = obj;
    }

    /* JADX INFO: renamed from: n */
    public static void m24827n(int i, StringBuilder sb) {
        while (true) {
            i--;
            if (i < 0) {
                return;
            } else {
                sb.append((char) 65533);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m24828o(String str, CharSequence charSequence, int i) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m24829p(String str, CharSequence charSequence, int i) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = charSequence.charAt(i + i2);
            char cCharAt2 = str.charAt(i2);
            if (cCharAt != cCharAt2 && (upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m24830a(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        this.f69088b.add(AbstractC3393o1.m17739n(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    /* JADX INFO: renamed from: b */
    public void m24831b(k12 k12Var) {
        if (k12Var != null) {
            m24833d(k12Var.f46544a, k12Var.f46545b);
        } else {
            C3386nv.m17626m("No formatter supplied");
        }
    }

    /* JADX INFO: renamed from: c */
    public void m24832c(t94[] t94VarArr) {
        s94 c22Var;
        int length = t94VarArr.length;
        int i = 0;
        if (length == 1) {
            t94 t94Var = t94VarArr[0];
            if (t94Var != null) {
                m24833d(null, t94Var);
                return;
            } else {
                C3386nv.m17626m("No parser supplied");
                return;
            }
        }
        s94[] s94VarArr = new s94[length];
        while (i < length - 1) {
            t94 t94Var2 = t94VarArr[i];
            if (t94Var2 == null) {
                c22Var = t94Var2 == null ? null : new c22(t94Var2);
            }
            c22Var = t94Var2;
            s94VarArr[i] = c22Var;
            if (c22Var == null) {
                C3386nv.m17626m("Incomplete parser array");
                return;
            }
            i++;
        }
        t94 t94Var3 = t94VarArr[i];
        s94 c22Var2 = t94Var3;
        if (t94Var3 == null) {
            c22Var2 = t94Var3 == null ? null : new c22(t94Var3);
        }
        s94VarArr[i] = c22Var2;
        m24833d(null, new p12(s94VarArr));
    }

    /* JADX INFO: renamed from: d */
    public void m24833d(u94 u94Var, s94 s94Var) {
        this.f69089c = null;
        ArrayList arrayList = this.f69088b;
        arrayList.add(u94Var);
        arrayList.add(s94Var);
    }

    /* JADX INFO: renamed from: e */
    public void m24834e(Object obj) {
        this.f69089c = null;
        ArrayList arrayList = this.f69088b;
        arrayList.add(obj);
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: f */
    public void m24835f(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType == null) {
            C3386nv.m17626m("Field type must not be null");
            return;
        }
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            ij6.m13959q();
        } else if (i <= 1) {
            m24834e(new x12(dateTimeFieldType, i2, false));
        } else {
            m24834e(new r12(dateTimeFieldType, i2, false, i));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m24836g(DateTimeFieldType dateTimeFieldType, int i) {
        if (i > 0) {
            m24834e(new n12(dateTimeFieldType, i, false, i));
        } else {
            C3386nv.m17626m(ux5.m22988k(i, "Illegal number of digits: "));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m24837h(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            ij6.m13959q();
        } else {
            m24834e(new o12(dateTimeFieldType, i, i2));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m24838i(char c) {
        m24834e(new l12(c));
    }

    /* JADX INFO: renamed from: j */
    public void m24839j(String str) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                m24834e(new s12(str));
            } else {
                m24834e(new l12(str.charAt(0)));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m24840k(t94 t94Var) {
        if (t94Var != null) {
            m24833d(null, new p12(new s94[]{t94Var, null}));
        } else {
            C3386nv.m17626m("No parser supplied");
        }
    }

    /* JADX INFO: renamed from: l */
    public void m24841l(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            ij6.m13959q();
        } else if (i <= 1) {
            m24834e(new x12(dateTimeFieldType, i2, true));
        } else {
            m24834e(new r12(dateTimeFieldType, i2, true, i));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m24842m(DateTimeFieldType dateTimeFieldType) {
        m24834e(new t12(dateTimeFieldType, false));
    }

    /* JADX INFO: renamed from: q */
    public Object m24843q() {
        Object m12Var = this.f69089c;
        if (m12Var == null) {
            ArrayList arrayList = this.f69088b;
            if (arrayList.size() == 2) {
                Object obj = arrayList.get(0);
                Object obj2 = arrayList.get(1);
                if (obj == null) {
                    m12Var = obj2;
                } else if (obj == obj2 || obj2 == null) {
                    m12Var = obj;
                }
            }
            if (m12Var == null) {
                m12Var = new m12(arrayList);
            }
            this.f69089c = m12Var;
        }
        return m12Var;
    }

    /* JADX INFO: renamed from: r */
    public k12 m24844r() {
        Object objM24843q = m24843q();
        u94 u94Var = (!(objM24843q instanceof u94) || ((objM24843q instanceof m12) && ((m12) objM24843q).f50425a == null)) ? null : (u94) objM24843q;
        s94 s94Var = (!(objM24843q instanceof s94) || ((objM24843q instanceof m12) && ((m12) objM24843q).f50426b == null)) ? null : (s94) objM24843q;
        if (u94Var != null || s94Var != null) {
            return new k12(u94Var, s94Var);
        }
        C3386nv.m17636w("Both printing and parsing not supported");
        return null;
    }

    /* JADX INFO: renamed from: s */
    public t94 m24845s() {
        Object objM24843q = m24843q();
        if ((objM24843q instanceof s94) && (!(objM24843q instanceof m12) || ((m12) objM24843q).f50426b != null)) {
            return t94.m21902a((s94) objM24843q);
        }
        C3386nv.m17636w("Parsing is not supported");
        return null;
    }

    public String toString() {
        switch (this.f69087a) {
            case 1:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f69089c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = this.f69088b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public y12() {
    }
}
