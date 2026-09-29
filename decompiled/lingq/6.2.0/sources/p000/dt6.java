package p000;

import androidx.compose.animation.AbstractC0070i;
import androidx.compose.animation.C0068g;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.token.PopupInteractionState;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dt6 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f36214b;

    public /* synthetic */ dt6(int i, t66 t66Var) {
        this.f36213a = i;
        this.f36214b = t66Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f36213a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f36214b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                if (!((Boolean) t66Var.getValue()).booleanValue()) {
                    iIntValue = -iIntValue;
                }
                return Integer.valueOf(iIntValue);
            case 1:
                vv9 vv9Var = (vv9) obj;
                vv9Var.getClass();
                t66Var.setValue(vv9Var);
                return xfaVar;
            case 2:
                t66Var.setValue(new n84(((n84) obj).f52482a));
                return xfaVar;
            case 3:
                t66Var.setValue(new n84(((n84) obj).f52482a));
                return xfaVar;
            case 4:
                String str = (String) obj;
                str.getClass();
                t66Var.setValue(str);
                return xfaVar;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                t66Var.setValue(str2);
                return xfaVar;
            case 6:
                String str3 = (String) obj;
                str3.getClass();
                t66Var.setValue(str3);
                return xfaVar;
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                t66Var.setValue(bool);
                return xfaVar;
            case 8:
                t66Var.setValue((pbb) obj);
                return xfaVar;
            case 9:
                vv9 vv9Var2 = (vv9) obj;
                vv9Var2.getClass();
                t66Var.setValue(vv9Var2);
                return xfaVar;
            case 10:
                String str4 = (String) obj;
                str4.getClass();
                if (str4.length() <= 120) {
                    t66Var.setValue(str4);
                }
                return xfaVar;
            case 11:
                String str5 = (String) obj;
                str5.getClass();
                t66Var.setValue(str5);
                return xfaVar;
            case 12:
                String str6 = (String) obj;
                str6.getClass();
                t66Var.setValue(str6);
                return xfaVar;
            case 13:
                String str7 = (String) obj;
                str7.getClass();
                t66Var.setValue(str7);
                return xfaVar;
            case 14:
                String str8 = (String) obj;
                str8.getClass();
                t66Var.setValue(str8);
                return xfaVar;
            case 15:
                String str9 = (String) obj;
                str9.getClass();
                t66Var.setValue(str9);
                return xfaVar;
            case 16:
                String str10 = (String) obj;
                str10.getClass();
                t66Var.setValue(str10);
                return xfaVar;
            case 17:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                t66Var.setValue(bool2);
                return xfaVar;
            case 18:
                String str11 = (String) obj;
                str11.getClass();
                t66Var.setValue(str11);
                return xfaVar;
            case 19:
                t66Var.setValue(new n84(((n84) obj).f52482a));
                return xfaVar;
            case 20:
                ((C3189km) obj).getClass();
                return new C0068g(AbstractC0070i.m777l(ss5.m21703b0(500, 0, null, 6), new dt6(21, t66Var)).m23531a(AbstractC0070i.m772g(null, 0.0f, 3)), AbstractC0070i.m779n(ss5.m21703b0(500, 0, null, 6), new dt6(22, t66Var)).m20180a(AbstractC0070i.m773h(null, 3)));
            case 21:
                int iIntValue2 = ((Integer) obj).intValue();
                if (((Boolean) t66Var.getValue()).booleanValue()) {
                    iIntValue2 = -iIntValue2;
                }
                return Integer.valueOf(iIntValue2);
            case 22:
                int iIntValue3 = ((Integer) obj).intValue();
                if (!((Boolean) t66Var.getValue()).booleanValue()) {
                    iIntValue3 = -iIntValue3;
                }
                return Integer.valueOf(iIntValue3);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                t66Var.setValue(PopupInteractionState.Idle);
                return xfaVar;
            case 24:
                vv9 vv9Var3 = (vv9) obj;
                vv9Var3.getClass();
                t66Var.setValue(vv9Var3);
                return xfaVar;
            case 25:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                t66Var.setValue(bool3);
                return xfaVar;
            case 26:
                t66Var.setValue((aq4) obj);
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                t66Var.setValue(new gq6(((aq4) obj).mo1695q(0L)));
                return xfaVar;
            case 28:
                aia aiaVar = (aia) obj;
                aiaVar.getClass();
                t66Var.setValue(aiaVar.f701a);
                return xfaVar;
            default:
                t66Var.setValue(new gq6(((gq6) obj).f41189a));
                return xfaVar;
        }
    }
}
