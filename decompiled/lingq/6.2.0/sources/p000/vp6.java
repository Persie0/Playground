package p000;

import android.content.Context;
import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.user.ProfileSettingType;
import com.lingq.core.network.api.result.ResultOffer;
import java.util.List;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vp6 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65764a;

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f65764a;
        Object objInvoke = null;
        he9Var = null;
        he9 he9Var = null;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("DELETE FROM OfferEntity");
                try {
                    ik8VarMo2873e0.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                ResultOffer resultOffer = (ResultOffer) obj;
                resultOffer.getClass();
                int i2 = resultOffer.f21359a;
                String str = resultOffer.f21361c;
                String str2 = resultOffer.f21363e;
                Integer num = resultOffer.f21366h;
                boolean z = resultOffer.f21369k;
                boolean z2 = resultOffer.f21370l;
                StringBuilder sbM22995r = ux5.m22995r(i2, "{id=", " code=", str, " visibility=");
                hn1.m13371u(sbM22995r, str2, " tier=", num, " countdown=");
                return e65.m10875g(sbM22995r, z, " isActive=", z2, "}");
            case 2:
                ((String) obj).getClass();
                return xfaVar;
            case 3:
                ((String) obj).getClass();
                return xfaVar;
            case 4:
                return xfaVar;
            case 5:
                sf1 sf1Var = (sf1) obj;
                int i3 = AbstractC3113ij.f44172a;
                Context context = (Context) sf1Var.mo1058A(AbstractC0394f.f4761b);
                fb2 fb2Var = (fb2) sf1Var.mo1058A(AbstractC0402n.f4816h);
                w07 w07Var = (w07) sf1Var.mo1058A(x07.f67592a);
                if (w07Var == null) {
                    return null;
                }
                return new C3833zh(context, fb2Var, w07Var.f66180a, w07Var.f66181b);
            case 6:
                return PreferenceDataStoreDelegateKt.preferencesDataStore$lambda$0((Context) obj);
            case 7:
                ProfileSettingType profileSettingType = (ProfileSettingType) obj;
                profileSettingType.getClass();
                return new Pair(profileSettingType.f19701B, profileSettingType.f19713N);
            case 8:
                ProfileSettingType profileSettingType2 = (ProfileSettingType) obj;
                profileSettingType2.getClass();
                return new Pair(profileSettingType2.f19702C, profileSettingType2.f19714O);
            case 9:
                ProfileSettingType profileSettingType3 = (ProfileSettingType) obj;
                profileSettingType3.getClass();
                return new Pair(profileSettingType3.f19739w, profileSettingType3.f19708I);
            case 10:
                ProfileSettingType profileSettingType4 = (ProfileSettingType) obj;
                profileSettingType4.getClass();
                return new Pair(profileSettingType4.f19703D, profileSettingType4.f19715P);
            case 11:
                ProfileSettingType profileSettingType5 = (ProfileSettingType) obj;
                profileSettingType5.getClass();
                return new Pair(profileSettingType5.f19736t, profileSettingType5.f19705F);
            case 12:
                ProfileSettingType profileSettingType6 = (ProfileSettingType) obj;
                profileSettingType6.getClass();
                return new Pair(profileSettingType6.f19737u, profileSettingType6.f19706G);
            case 13:
                ProfileSettingType profileSettingType7 = (ProfileSettingType) obj;
                profileSettingType7.getClass();
                return new Pair(profileSettingType7.f19738v, profileSettingType7.f19707H);
            case 14:
                ProfileSettingType profileSettingType8 = (ProfileSettingType) obj;
                profileSettingType8.getClass();
                return new Pair(profileSettingType8.f19740x, profileSettingType8.f19709J);
            case 15:
                ProfileSettingType profileSettingType9 = (ProfileSettingType) obj;
                profileSettingType9.getClass();
                return new Pair(profileSettingType9.f19741y, profileSettingType9.f19710K);
            case 16:
                ProfileSettingType profileSettingType10 = (ProfileSettingType) obj;
                profileSettingType10.getClass();
                return new Pair(profileSettingType10.f19742z, profileSettingType10.f19711L);
            case 17:
                ProfileSettingType profileSettingType11 = (ProfileSettingType) obj;
                profileSettingType11.getClass();
                return new Pair(profileSettingType11.f19700A, profileSettingType11.f19712M);
            case 18:
                pj4 pj4Var = (pj4) obj;
                pj4Var.f56315a = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                pj4Var.m19201a(300, fValueOf).f54461b = u36.f63352b;
                pj4Var.m19201a(1500, fValueOf);
                Float fValueOf2 = Float.valueOf(180.0f);
                pj4Var.m19201a(1800, fValueOf2);
                pj4Var.m19201a(3000, fValueOf2);
                Float fValueOf3 = Float.valueOf(270.0f);
                pj4Var.m19201a(3300, fValueOf3);
                pj4Var.m19201a(4500, fValueOf3);
                Float fValueOf4 = Float.valueOf(360.0f);
                pj4Var.m19201a(4800, fValueOf4);
                pj4Var.m19201a(6000, fValueOf4);
                return xfaVar;
            case 19:
                AbstractC0426f.m1863g((tv8) obj, tm7.f62530d);
                return xfaVar;
            case 20:
                C0358h c0358h = (C0358h) obj;
                C3309ls c3309ls = c0358h.f4358a.f853b;
                long jM16483A = c3309ls.m16483A();
                c3309ls.m16515r().mo17016h();
                try {
                    ((qn3) c3309ls.f50064b).m20070k(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    c0358h.m1614b();
                    return xfaVar;
                } finally {
                    AbstractC3393o1.m17751z(c3309ls, jM16483A);
                }
            case 21:
                Float f = (Float) obj;
                f.getClass();
                return new mp7(new C0059a(f, pk9.f56363h, null, 12));
            case 22:
                t66 t66Var = (t66) obj;
                if (!(t66Var instanceof vc9)) {
                    C3386nv.m17626m("Failed requirement.");
                    return null;
                }
                vc9 vc9Var = (vc9) t66Var;
                if (vc9Var.getValue() != null) {
                    Object value = vc9Var.getValue();
                    value.getClass();
                    objInvoke = ((vi3) vv9.f65989d.f39591c).invoke(value);
                }
                yc9 yc9VarMo19860b = vc9Var.mo19860b();
                yc9VarMo19860b.getClass();
                return AbstractC0278f.m1259i(objInvoke, yc9VarMo19860b);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new ch8();
            case 24:
                ((s02) obj).getClass();
                throw new NotImplementedError(0);
            case 25:
                return new gl8((Map) obj);
            case 26:
                return obj;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                vi3 vi3Var = (vi3) dm8.f35854i.f39591c;
                Boolean bool = Boolean.FALSE;
                he9 he9Var2 = (fa4.m11650l(obj2, bool) || obj2 == null) ? null : (he9) vi3Var.invoke(obj2);
                Object obj3 = list.get(1);
                he9 he9Var3 = (fa4.m11650l(obj3, bool) || obj3 == null) ? null : (he9) vi3Var.invoke(obj3);
                Object obj4 = list.get(2);
                he9 he9Var4 = (fa4.m11650l(obj4, bool) || obj4 == null) ? null : (he9) vi3Var.invoke(obj4);
                Object obj5 = list.get(3);
                if (!fa4.m11650l(obj5, bool) && obj5 != null) {
                    he9Var = (he9) vi3Var.invoke(obj5);
                }
                return new ww9(he9Var2, he9Var3, he9Var4, he9Var);
            case 28:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (fa4.m11650l(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((vi3) dm8.f35847b.f39591c).invoke(obj6);
                Object obj7 = list2.get(0);
                String str3 = obj7 != null ? (String) obj7 : null;
                str3.getClass();
                return new C3419on(list3, str3);
            default:
                obj.getClass();
                return new rt9(((Integer) obj).intValue());
        }
    }

    public /* synthetic */ vp6(int i) {
        this.f65764a = i;
    }
}
