package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.semantics.C0427g;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.SetBuilder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wx8 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67487a;

    public /* synthetic */ wx8(int i) {
        this.f67487a = i;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x02a1  */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int iOffsetByCodePoints;
        ww9 ww9VarMo10312b;
        he9 he9Var;
        int i = this.f67487a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                return Boolean.valueOf(obj == null);
            case 1:
                wx8 wx8Var = nc9.f52600a;
                return xfaVar;
            case 2:
                bh4[] bh4VarArr = AbstractC0426f.f5022a;
                C0427g c0427g = AbstractC0424d.f5006m;
                bh4 bh4Var = AbstractC0426f.f5022a[5];
                ((tv8) obj).mo3709d(c0427g, Boolean.TRUE);
                return xfaVar;
            case 3:
                return xfaVar;
            case 4:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        arrayList.add(ik8VarMo2873e0.mo2875L(0));
                    }
                    ik8VarMo2873e0.close();
                    return arrayList;
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            case 5:
                ((Float) obj).getClass();
                return xfaVar;
            case 6:
                ((Integer) obj).intValue();
                return ju9.f46169a;
            case 7:
                hv9 hv9Var = (hv9) obj;
                String str = hv9Var.f43001g.f54604b;
                long j = hv9Var.f43000f;
                int i2 = cx9.f34693c;
                int i3 = (int) (j & 4294967295L);
                if (i3 > 0) {
                    pq2 pq2VarM11142w = eh0.m11142w();
                    if (pq2VarM11142w != null) {
                        int iM19450b = pq2VarM11142w.m19450b(str, i3 - 1);
                        if (iM19450b >= 0) {
                            iOffsetByCodePoints = iM19450b;
                        } else if (i3 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i3, -1);
                        }
                    } else if (i3 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i3, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new ya2(((int) (hv9Var.f43000f & 4294967295L)) - iOffsetByCodePoints, 0);
            case 8:
                hv9 hv9Var2 = (hv9) obj;
                String str2 = hv9Var2.f43001g.f54604b;
                long j2 = hv9Var2.f43000f;
                int i4 = cx9.f34693c;
                int iM11137r = eh0.m11137r((int) (j2 & 4294967295L), str2);
                if (iM11137r != -1) {
                    return new ya2(0, iM11137r - ((int) (hv9Var2.f43000f & 4294967295L)));
                }
                return null;
            case 9:
                hv9 hv9Var3 = (hv9) obj;
                Integer numM13492e = hv9Var3.m13492e();
                if (numM13492e == null) {
                    return null;
                }
                int iIntValue = numM13492e.intValue();
                long j3 = hv9Var3.f43000f;
                int i5 = cx9.f34693c;
                return new ya2(((int) (j3 & 4294967295L)) - iIntValue, 0);
            case 10:
                hv9 hv9Var4 = (hv9) obj;
                Integer numM13491d = hv9Var4.m13491d();
                if (numM13491d == null) {
                    return null;
                }
                int iIntValue2 = numM13491d.intValue();
                long j4 = hv9Var4.f43000f;
                int i6 = cx9.f34693c;
                return new ya2(0, iIntValue2 - ((int) (j4 & 4294967295L)));
            case 11:
                hv9 hv9Var5 = (hv9) obj;
                Integer numM13490c = hv9Var5.m13490c();
                if (numM13490c == null) {
                    return null;
                }
                int iIntValue3 = numM13490c.intValue();
                long j5 = hv9Var5.f43000f;
                int i7 = cx9.f34693c;
                return new ya2(((int) (j5 & 4294967295L)) - iIntValue3, 0);
            case 12:
                hv9 hv9Var6 = (hv9) obj;
                Integer numM13489b = hv9Var6.m13489b();
                if (numM13489b == null) {
                    return null;
                }
                int iIntValue4 = numM13489b.intValue();
                long j6 = hv9Var6.f43000f;
                int i8 = cx9.f34693c;
                return new ya2(0, iIntValue4 - ((int) (j6 & 4294967295L)));
            case 13:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                Orientation orientation = ((Boolean) obj2).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new mv9(orientation, ((Float) obj3).floatValue());
            case 14:
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                fs6 fs6Var = dm8.f35846a;
                Boolean bool = Boolean.FALSE;
                C3419on c3419on = (fa4.m11650l(obj4, bool) || obj4 == null) ? null : (C3419on) ((vi3) fs6Var.f39591c).invoke(obj4);
                c3419on.getClass();
                Object obj5 = list2.get(1);
                int i9 = cx9.f34693c;
                cx9 cx9Var = (fa4.m11650l(obj5, bool) || obj5 == null) ? null : (cx9) ((vi3) dm8.f35861p.f39591c).invoke(obj5);
                cx9Var.getClass();
                return new vv9(c3419on, cx9Var.f34694a, (cx9) null);
            case 15:
                zf1 zf1Var = lw9.f50220a;
                return xfaVar;
            case 16:
                C3378nn c3378nn = (C3378nn) obj;
                Object obj6 = c3378nn.f52979a;
                if (!(obj6 instanceof fe5) || (ww9VarMo10312b = ((fe5) obj6).mo10312b()) == null || (ww9VarMo10312b.f67431a == null && ww9VarMo10312b.f67432b == null && ww9VarMo10312b.f67433c == null && ww9VarMo10312b.f67434d == null)) {
                    return vz1.m23627e(c3378nn);
                }
                Object obj7 = c3378nn.f52979a;
                obj7.getClass();
                ww9 ww9VarMo10312b2 = ((fe5) obj7).mo10312b();
                if (ww9VarMo10312b2 == null || (he9Var = ww9VarMo10312b2.f67431a) == null) {
                    he9Var = new he9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                }
                return vz1.m23627e(c3378nn, new C3378nn(he9Var, c3378nn.f52980b, c3378nn.f52981c));
            case 17:
                ((tv8) obj).mo3709d(AbstractC0424d.f4978B, xfaVar);
                return xfaVar;
            case 18:
                ik8 ik8Var = (ik8) obj;
                ik8Var.getClass();
                return Boolean.valueOf(ik8Var.mo2876a0());
            case 19:
                ik8 ik8Var2 = (ik8) obj;
                ik8Var2.getClass();
                SetBuilder setBuilder = new SetBuilder();
                while (ik8Var2.mo2876a0()) {
                    setBuilder.add(Integer.valueOf((int) ik8Var2.getLong(0)));
                }
                return AbstractC3489q9.m19776f(setBuilder);
            case 20:
                return new C2934dn(((Float) obj).floatValue());
            case 21:
                return new C2934dn(((Integer) obj).intValue());
            case 22:
                return Integer.valueOf((int) ((C2934dn) obj).f35886a);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new C2934dn(((xj2) obj).f68285a);
            case 24:
                return new xj2(((C2934dn) obj).f35886a);
            case 25:
                ak2 ak2Var = (ak2) obj;
                return new C2970en(ak2.m524a(ak2Var.f761a), ak2.m525b(ak2Var.f761a));
            case 26:
                C2970en c2970en = (C2970en) obj;
                return new ak2((((long) Float.floatToRawIntBits(c2970en.f37539a)) << 32) | (((long) Float.floatToRawIntBits(c2970en.f37540b)) & 4294967295L));
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                x89 x89Var = (x89) obj;
                return new C2970en(Float.intBitsToFloat((int) (x89Var.f67935a >> 32)), Float.intBitsToFloat((int) (x89Var.f67935a & 4294967295L)));
            case 28:
                C2970en c2970en2 = (C2970en) obj;
                return new x89((((long) Float.floatToRawIntBits(c2970en2.f37539a)) << 32) | (((long) Float.floatToRawIntBits(c2970en2.f37540b)) & 4294967295L));
            default:
                gq6 gq6Var = (gq6) obj;
                return new C2970en(Float.intBitsToFloat((int) (gq6Var.f41189a >> 32)), Float.intBitsToFloat((int) (gq6Var.f41189a & 4294967295L)));
        }
    }
}
