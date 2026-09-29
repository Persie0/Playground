package p000;

import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.semantics.C0427g;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zl8 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71711a;

    public /* synthetic */ zl8(int i) {
        this.f71711a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        aa1 aa1Var;
        aa1 aa1Var2;
        aa1 aa1Var3;
        l39Var = null;
        l39 l39Var = null;
        ax9Var = null;
        ax9 ax9Var = null;
        int i = 0;
        switch (this.f71711a) {
            case 0:
                obj.getClass();
                List list = (List) obj;
                return new yv9(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
            case 1:
                obj.getClass();
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                ay9[] ay9VarArr = zx9.f72358b;
                vi3 vi3Var = dm8.f35869x.f10279b;
                Boolean bool = Boolean.FALSE;
                fa4.m11650l(obj2, bool);
                zx9 zx9Var = obj2 != null ? (zx9) vi3Var.invoke(obj2) : null;
                zx9Var.getClass();
                long j = zx9Var.f72360a;
                Object obj3 = list2.get(1);
                fa4.m11650l(obj3, bool);
                zx9 zx9Var2 = obj3 != null ? (zx9) vi3Var.invoke(obj3) : null;
                zx9Var2.getClass();
                return new aw9(j, zx9Var2.f72360a);
            case 2:
                obj.getClass();
                return new bc3(((Integer) obj).intValue());
            case 3:
                obj.getClass();
                return new oa0(((Float) obj).floatValue());
            case 4:
                obj.getClass();
                List list3 = (List) obj;
                Object obj4 = list3.get(0);
                Integer num = obj4 != null ? (Integer) obj4 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj5 = list3.get(1);
                Integer num2 = obj5 != null ? (Integer) obj5 : null;
                num2.getClass();
                return new cx9(eh0.m11127g(iIntValue, num2.intValue()));
            case 5:
                obj.getClass();
                List list4 = (List) obj;
                Object obj6 = list4.get(0);
                int i2 = aa1.f413l;
                Boolean bool2 = Boolean.FALSE;
                fa4.m11650l(obj6, bool2);
                if (obj6 != null) {
                    aa1Var = fa4.m11650l(obj6, Boolean.FALSE) ? new aa1(aa1.f412k) : new aa1(d32.m10035e(((Integer) obj6).intValue()));
                } else {
                    aa1Var = null;
                }
                aa1Var.getClass();
                long j2 = aa1Var.f414a;
                Object obj7 = list4.get(1);
                cm8 cm8Var = dm8.f35871z;
                fa4.m11650l(obj7, bool2);
                gq6 gq6Var = obj7 != null ? (gq6) cm8Var.f10279b.invoke(obj7) : null;
                gq6Var.getClass();
                long j3 = gq6Var.f41189a;
                Object obj8 = list4.get(2);
                Float f = obj8 != null ? (Float) obj8 : null;
                f.getClass();
                return new l39(j2, j3, f.floatValue());
            case 6:
                obj.getClass();
                return new ks9(((Integer) obj).intValue());
            case 7:
                obj.getClass();
                List list5 = (List) obj;
                Object obj9 = list5.get(0);
                String str = obj9 != null ? (String) obj9 : null;
                str.getClass();
                Object obj10 = list5.get(1);
                return new ee5(str, (fa4.m11650l(obj10, Boolean.FALSE) || obj10 == null) ? null : (ww9) ((vi3) dm8.f35855j.f39591c).invoke(obj10), null);
            case 8:
                obj.getClass();
                return new vt9(((Integer) obj).intValue());
            case 9:
                obj.getClass();
                return new kx3(((Integer) obj).intValue());
            case 10:
                obj.getClass();
                List list6 = (List) obj;
                ArrayList arrayList = new ArrayList(list6.size());
                int size = list6.size();
                while (i < size) {
                    Object obj11 = list6.get(i);
                    C3378nn c3378nn = (fa4.m11650l(obj11, Boolean.FALSE) || obj11 == null) ? null : (C3378nn) ((vi3) dm8.f35848c.f39591c).invoke(obj11);
                    c3378nn.getClass();
                    arrayList.add(c3378nn);
                    i++;
                }
                return arrayList;
            case 11:
                obj.getClass();
                return new wb3(((Integer) obj).intValue());
            case 12:
                obj.getClass();
                return new xb3(((Integer) obj).intValue());
            case 13:
                Boolean bool3 = Boolean.FALSE;
                if (fa4.m11650l(obj, bool3)) {
                    return new zx9(zx9.f72359c);
                }
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                Float f2 = obj12 != null ? (Float) obj12 : null;
                f2.getClass();
                float fFloatValue = f2.floatValue();
                Object obj13 = list7.get(1);
                cm8 cm8Var2 = dm8.f35870y;
                fa4.m11650l(obj13, bool3);
                ay9 ay9Var = obj13 != null ? (ay9) cm8Var2.f10279b.invoke(obj13) : null;
                ay9Var.getClass();
                return new zx9(d32.m10032c0(fFloatValue, ay9Var.f7673a));
            case 14:
                if (fa4.m11650l(obj, 0)) {
                    return new ay9(8589934592L);
                }
                return fa4.m11650l(obj, 1) ? new ay9(4294967296L) : new ay9(0L);
            case 15:
                if (fa4.m11650l(obj, Boolean.FALSE)) {
                    return new gq6(9205357640488583168L);
                }
                obj.getClass();
                List list8 = (List) obj;
                Object obj14 = list8.get(0);
                Float f3 = obj14 != null ? (Float) obj14 : null;
                f3.getClass();
                float fFloatValue2 = f3.floatValue();
                Object obj15 = list8.get(1);
                Float f4 = obj15 != null ? (Float) obj15 : null;
                f4.getClass();
                return new gq6((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f4.floatValue())) & 4294967295L));
            case 16:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i < size2) {
                    Object obj16 = list9.get(i);
                    ti5 ti5Var = (fa4.m11650l(obj16, Boolean.FALSE) || obj16 == null) ? null : (ti5) ((vi3) dm8.f35841B.f39591c).invoke(obj16);
                    ti5Var.getClass();
                    arrayList2.add(ti5Var);
                    i++;
                }
                return new xi5(arrayList2);
            case 17:
                obj.getClass();
                return new ti5((String) obj);
            case 18:
                obj.getClass();
                List list10 = (List) obj;
                Object obj17 = list10.get(0);
                String str2 = obj17 != null ? (String) obj17 : null;
                str2.getClass();
                Object obj18 = list10.get(1);
                return new de5(str2, (fa4.m11650l(obj18, Boolean.FALSE) || obj18 == null) ? null : (ww9) ((vi3) dm8.f35855j.f39591c).invoke(obj18), null);
            case 19:
                obj.getClass();
                List list11 = (List) obj;
                Object obj19 = list11.get(0);
                float f5 = oc5.f54170b;
                cm8 cm8Var3 = dm8.f35843D;
                Boolean bool4 = Boolean.FALSE;
                fa4.m11650l(obj19, bool4);
                oc5 oc5Var = obj19 != null ? (oc5) cm8Var3.f10279b.invoke(obj19) : null;
                oc5Var.getClass();
                float f6 = oc5Var.f54173a;
                Object obj20 = list11.get(1);
                cm8 cm8Var4 = dm8.f35844E;
                fa4.m11650l(obj20, bool4);
                qc5 qc5Var = obj20 != null ? (qc5) cm8Var4.f10279b.invoke(obj20) : null;
                qc5Var.getClass();
                int i3 = qc5Var.f57565a;
                Object obj21 = list11.get(2);
                cm8 cm8Var5 = dm8.f35845F;
                fa4.m11650l(obj21, bool4);
                pc5 pc5Var = obj21 != null ? (pc5) cm8Var5.f10279b.invoke(obj21) : null;
                pc5Var.getClass();
                return new rc5(i3, f6, pc5Var.f55947a);
            case 20:
                obj.getClass();
                float fFloatValue3 = ((Float) obj).floatValue();
                oc5.m17909a(fFloatValue3);
                return new oc5(fFloatValue3);
            case 21:
                obj.getClass();
                return new qc5(((Integer) obj).intValue());
            case 22:
                obj.getClass();
                return new pc5(((Integer) obj).intValue());
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                String str3 = obj != null ? (String) obj : null;
                str3.getClass();
                return new ipa(str3);
            case 24:
                String str4 = obj != null ? (String) obj : null;
                str4.getClass();
                return new lja(str4);
            case 25:
                obj.getClass();
                List list12 = (List) obj;
                Object obj22 = list12.get(0);
                cm8 cm8Var6 = dm8.f35864s;
                Boolean bool5 = Boolean.FALSE;
                fa4.m11650l(obj22, bool5);
                ks9 ks9Var = obj22 != null ? (ks9) cm8Var6.f10279b.invoke(obj22) : null;
                ks9Var.getClass();
                int i4 = ks9Var.f48393a;
                Object obj23 = list12.get(1);
                cm8 cm8Var7 = dm8.f35865t;
                fa4.m11650l(obj23, bool5);
                vt9 vt9Var = obj23 != null ? (vt9) cm8Var7.f10279b.invoke(obj23) : null;
                vt9Var.getClass();
                int i5 = vt9Var.f65894a;
                Object obj24 = list12.get(2);
                ay9[] ay9VarArr2 = zx9.f72358b;
                cm8 cm8Var8 = dm8.f35869x;
                fa4.m11650l(obj24, bool5);
                zx9 zx9Var3 = obj24 != null ? (zx9) cm8Var8.f10279b.invoke(obj24) : null;
                zx9Var3.getClass();
                long j4 = zx9Var3.f72360a;
                Object obj25 = list12.get(3);
                aw9 aw9Var = aw9.f7624c;
                aw9 aw9Var2 = (fa4.m11650l(obj25, bool5) || obj25 == null) ? null : (aw9) ((vi3) dm8.f35858m.f39591c).invoke(obj25);
                Object obj26 = list12.get(4);
                a97 a97Var = (fa4.m11650l(obj26, bool5) || obj26 == null) ? null : (a97) ((vi3) lda.f49511d.f39591c).invoke(obj26);
                Object obj27 = list12.get(5);
                rc5 rc5Var = rc5.f59067d;
                rc5 rc5Var2 = (fa4.m11650l(obj27, bool5) || obj27 == null) ? null : (rc5) ((vi3) dm8.f35842C.f39591c).invoke(obj27);
                Object obj28 = list12.get(6);
                hc5 hc5Var = (fa4.m11650l(obj28, bool5) || obj28 == null) ? null : (hc5) ((vi3) lda.f49513f.f39591c).invoke(obj28);
                hc5Var.getClass();
                int i6 = hc5Var.f42172a;
                Object obj29 = list12.get(7);
                cm8 cm8Var9 = dm8.f35866u;
                fa4.m11650l(obj29, bool5);
                kx3 kx3Var = obj29 != null ? (kx3) cm8Var9.f10279b.invoke(obj29) : null;
                kx3Var.getClass();
                int i7 = kx3Var.f48540a;
                Object obj30 = list12.get(8);
                fs6 fs6Var = lda.f49514g;
                if (!fa4.m11650l(obj30, bool5) && obj30 != null) {
                    ax9Var = (ax9) ((vi3) fs6Var.f39591c).invoke(obj30);
                }
                return new j37(i4, i5, j4, aw9Var2, a97Var, rc5Var2, i6, i7, ax9Var);
            case 26:
                obj.getClass();
                List list13 = (List) obj;
                Object obj31 = list13.get(0);
                int i8 = aa1.f413l;
                Boolean bool6 = Boolean.FALSE;
                fa4.m11650l(obj31, bool6);
                if (obj31 != null) {
                    aa1Var2 = obj31.equals(bool6) ? new aa1(aa1.f412k) : new aa1(d32.m10035e(((Integer) obj31).intValue()));
                } else {
                    aa1Var2 = null;
                }
                aa1Var2.getClass();
                long j5 = aa1Var2.f414a;
                Object obj32 = list13.get(1);
                ay9[] ay9VarArr3 = zx9.f72358b;
                vi3 vi3Var2 = dm8.f35869x.f10279b;
                fa4.m11650l(obj32, bool6);
                zx9 zx9Var4 = obj32 != null ? (zx9) vi3Var2.invoke(obj32) : null;
                zx9Var4.getClass();
                long j6 = zx9Var4.f72360a;
                Object obj33 = list13.get(2);
                bc3 bc3Var = bc3.f8316b;
                bc3 bc3Var2 = (fa4.m11650l(obj33, bool6) || obj33 == null) ? null : (bc3) ((vi3) dm8.f35859n.f39591c).invoke(obj33);
                Object obj34 = list13.get(3);
                wb3 wb3Var = (fa4.m11650l(obj34, bool6) || obj34 == null) ? null : (wb3) ((vi3) dm8.f35867v.f39591c).invoke(obj34);
                Object obj35 = list13.get(4);
                xb3 xb3Var = (fa4.m11650l(obj35, bool6) || obj35 == null) ? null : (xb3) ((vi3) dm8.f35868w.f39591c).invoke(obj35);
                Object obj36 = list13.get(6);
                String str5 = obj36 != null ? (String) obj36 : null;
                Object obj37 = list13.get(7);
                fa4.m11650l(obj37, bool6);
                zx9 zx9Var5 = obj37 != null ? (zx9) vi3Var2.invoke(obj37) : null;
                zx9Var5.getClass();
                long j7 = zx9Var5.f72360a;
                Object obj38 = list13.get(8);
                oa0 oa0Var = (fa4.m11650l(obj38, bool6) || obj38 == null) ? null : (oa0) ((vi3) dm8.f35860o.f39591c).invoke(obj38);
                Object obj39 = list13.get(9);
                yv9 yv9Var = (fa4.m11650l(obj39, bool6) || obj39 == null) ? null : (yv9) ((vi3) dm8.f35857l.f39591c).invoke(obj39);
                Object obj40 = list13.get(10);
                xi5 xi5Var = xi5.f68250c;
                xi5 xi5Var2 = (fa4.m11650l(obj40, bool6) || obj40 == null) ? null : (xi5) ((vi3) dm8.f35840A.f39591c).invoke(obj40);
                Object obj41 = list13.get(11);
                fa4.m11650l(obj41, bool6);
                if (obj41 != null) {
                    aa1Var3 = obj41.equals(bool6) ? new aa1(aa1.f412k) : new aa1(d32.m10035e(((Integer) obj41).intValue()));
                } else {
                    aa1Var3 = null;
                }
                aa1Var3.getClass();
                long j8 = aa1Var3.f414a;
                Object obj42 = list13.get(12);
                rt9 rt9Var = (fa4.m11650l(obj42, bool6) || obj42 == null) ? null : (rt9) ((vi3) dm8.f35856k.f39591c).invoke(obj42);
                Object obj43 = list13.get(13);
                l39 l39Var2 = l39.f48992d;
                fs6 fs6Var2 = dm8.f35862q;
                if (!fa4.m11650l(obj43, bool6) && obj43 != null) {
                    l39Var = (l39) ((vi3) fs6Var2.f39591c).invoke(obj43);
                }
                return new he9(j5, j6, bc3Var2, wb3Var, xb3Var, null, str5, j7, oa0Var, yv9Var, xi5Var2, j8, rt9Var, l39Var, 49184);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return new yn8(((Integer) obj).intValue());
            case 28:
                rg7 rg7Var = (rg7) obj;
                if (rg7Var != null && rg7Var.f59237a == 2) {
                    i = 1;
                }
                return Boolean.valueOf(i ^ 1);
            default:
                bh4[] bh4VarArr = AbstractC0426f.f5022a;
                C0427g c0427g = AbstractC0424d.f4998e;
                xfa xfaVar = xfa.f68157a;
                ((tv8) obj).mo3709d(c0427g, xfaVar);
                return xfaVar;
        }
    }
}
