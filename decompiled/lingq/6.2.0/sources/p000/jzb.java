package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.ArrayList;
import java.util.List;
import kotlinx.datetime.internal.format.parser.ParseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jzb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f46441a = new C0282a(518100481, false, new ud1(9));

    /* JADX INFO: renamed from: a */
    public static nm1 m14756a(t47 t47Var, CharSequence charSequence, nm1 nm1Var) throws ParseException {
        String string;
        charSequence.getClass();
        nm1Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListM23608N = vz1.m23608N(new n47(nm1Var, t47Var, 0));
        while (true) {
            n47 n47Var = (n47) u91.m22609a1(arrayListM23608N);
            if (n47Var != null) {
                nm1 nm1Var2 = (nm1) ((nm1) n47Var.f52341a).copy();
                int iIntValue = n47Var.f52343c;
                t47 t47Var2 = n47Var.f52342b;
                List list = t47Var2.f61858a;
                List list2 = t47Var2.f61859b;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        if (!list2.isEmpty()) {
                            int size2 = list2.size() - 1;
                            if (size2 < 0) {
                                break;
                            }
                            while (true) {
                                int i2 = size2 - 1;
                                arrayListM23608N.add(new n47(nm1Var2, (t47) list2.get(size2), iIntValue));
                                if (i2 < 0) {
                                    break;
                                }
                                size2 = i2;
                            }
                        } else {
                            if (iIntValue != charSequence.length()) {
                                arrayList.add(new m47(iIntValue, o47.f53827b));
                                break;
                            }
                            return nm1Var2;
                        }
                    } else {
                        Object objMo10912a = ((s47) t47Var2.f61858a.get(i)).mo10912a(nm1Var2, charSequence, iIntValue);
                        if (!(objMo10912a instanceof Integer)) {
                            if (objMo10912a instanceof m47) {
                                arrayList.add((m47) objMo10912a);
                                break;
                            }
                            C3386nv.m17632s(objMo10912a, "Unexpected parse result: ");
                            return null;
                        }
                        iIntValue = ((Number) objMo10912a).intValue();
                        i++;
                    }
                }
            } else {
                if (arrayList.size() > 1) {
                    x91.m24414t0(arrayList, new ma3(29));
                }
                if (arrayList.size() == 1) {
                    string = "Position " + ((m47) arrayList.get(0)).f50580a + ": " + ((String) ((m47) arrayList.get(0)).f50581b.mo0a());
                } else {
                    StringBuilder sb = new StringBuilder(arrayList.size() * 33);
                    u91.m22595M0(arrayList, sb, ", ", new lz5(21), 56);
                    string = sb.toString();
                }
                throw new ParseException(string);
            }
        }
    }
}
