package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.C0269z;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class am8 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f848a;

    public /* synthetic */ am8(int i) {
        this.f848a = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f848a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                el8 el8Var = (el8) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(dm8.m10482a((C3378nn) list.get(i2), dm8.f35848c, el8Var));
                }
                return arrayList;
            case 1:
                cx9 cx9Var = (cx9) obj2;
                return vz1.m23627e(Integer.valueOf((int) (cx9Var.f34694a >> 32)), Integer.valueOf((int) (cx9Var.f34694a & 4294967295L)));
            case 2:
                el8 el8Var2 = (el8) obj;
                l39 l39Var = (l39) obj2;
                return vz1.m23627e(dm8.m10482a(new aa1(l39Var.f48993a), dm8.f35863r, el8Var2), dm8.m10482a(new gq6(l39Var.f48994b), dm8.f35871z, el8Var2), Float.valueOf(l39Var.f48995c));
            case 3:
                return Integer.valueOf(((ks9) obj2).f48393a);
            case 4:
                return Integer.valueOf(((vt9) obj2).f65894a);
            case 5:
                return Integer.valueOf(((kx3) obj2).f48540a);
            case 6:
                return Integer.valueOf(((wb3) obj2).f66583a);
            case 7:
                return Integer.valueOf(((xb3) obj2).f68021a);
            case 8:
                zx9 zx9Var = (zx9) obj2;
                return zx9Var != null ? zx9.m25846a(zx9Var.f72360a, zx9.f72359c) : false ? Boolean.FALSE : vz1.m23627e(Float.valueOf(zx9.m25848c(zx9Var.f72360a)), dm8.m10482a(new ay9(zx9.m25847b(zx9Var.f72360a)), dm8.f35870y, (el8) obj));
            case 9:
                de5 de5Var = (de5) obj2;
                return vz1.m23627e(de5Var.f35498a, dm8.m10482a(de5Var.f35499b, dm8.f35855j, (el8) obj));
            case 10:
                long j = ((ay9) obj2).f7673a;
                if (ay9.m3127a(j, 8589934592L)) {
                    return 0;
                }
                if (ay9.m3127a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 11:
                gq6 gq6Var = (gq6) obj2;
                return gq6Var != null ? gq6.m12821b(gq6Var.f41189a, 9205357640488583168L) : false ? Boolean.FALSE : vz1.m23627e(Float.valueOf(Float.intBitsToFloat((int) (gq6Var.f41189a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (gq6Var.f41189a & 4294967295L))));
            case 12:
                el8 el8Var3 = (el8) obj;
                List list2 = ((xi5) obj2).f68251a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList2.add(dm8.m10482a((ti5) list2.get(i3), dm8.f35841B, el8Var3));
                }
                return arrayList2;
            case 13:
                return ((ti5) obj2).f62341a.toLanguageTag();
            case 14:
                el8 el8Var4 = (el8) obj;
                rc5 rc5Var = (rc5) obj2;
                return vz1.m23627e(dm8.m10482a(new oc5(rc5Var.f59068a), dm8.f35843D, el8Var4), dm8.m10482a(new qc5(rc5Var.f59069b), dm8.f35844E, el8Var4), dm8.m10482a(new pc5(rc5Var.f59070c), dm8.f35845F, el8Var4));
            case 15:
                return Float.valueOf(((oc5) obj2).f54173a);
            case 16:
                return Integer.valueOf(((qc5) obj2).f57565a);
            case 17:
                return Integer.valueOf(((pc5) obj2).f55947a);
            case 18:
                return ((ipa) obj2).f44410a;
            case 19:
                el8 el8Var5 = (el8) obj;
                j37 j37Var = (j37) obj2;
                Object objM10482a = dm8.m10482a(new ks9(j37Var.f45012a), dm8.f35864s, el8Var5);
                Object objM10482a2 = dm8.m10482a(new vt9(j37Var.f45013b), dm8.f35865t, el8Var5);
                Object objM10482a3 = dm8.m10482a(new zx9(j37Var.f45014c), dm8.f35869x, el8Var5);
                aw9 aw9Var = j37Var.f45015d;
                aw9 aw9Var2 = aw9.f7624c;
                Object objM10482a4 = dm8.m10482a(aw9Var, dm8.f35858m, el8Var5);
                Object objM10482a5 = dm8.m10482a(j37Var.f45016e, lda.f49511d, el8Var5);
                rc5 rc5Var2 = j37Var.f45017f;
                rc5 rc5Var3 = rc5.f59067d;
                return vz1.m23627e(objM10482a, objM10482a2, objM10482a3, objM10482a4, objM10482a5, dm8.m10482a(rc5Var2, dm8.f35842C, el8Var5), dm8.m10482a(new hc5(j37Var.f45018g), lda.f49513f, el8Var5), dm8.m10482a(new kx3(j37Var.f45019h), dm8.f35866u, el8Var5), dm8.m10482a(j37Var.f45020i, lda.f49514g, el8Var5));
            case 20:
                return ((lja) obj2).f49749a;
            case 21:
                el8 el8Var6 = (el8) obj;
                he9 he9Var = (he9) obj2;
                aa1 aa1Var = new aa1(he9Var.f42264a.mo24173a());
                cm8 cm8Var = dm8.f35863r;
                Object objM10482a6 = dm8.m10482a(aa1Var, cm8Var, el8Var6);
                zx9 zx9Var2 = new zx9(he9Var.f42265b);
                cm8 cm8Var2 = dm8.f35869x;
                Object objM10482a7 = dm8.m10482a(zx9Var2, cm8Var2, el8Var6);
                bc3 bc3Var = he9Var.f42266c;
                bc3 bc3Var2 = bc3.f8316b;
                Object objM10482a8 = dm8.m10482a(bc3Var, dm8.f35859n, el8Var6);
                Object objM10482a9 = dm8.m10482a(he9Var.f42267d, dm8.f35867v, el8Var6);
                Object objM10482a10 = dm8.m10482a(he9Var.f42268e, dm8.f35868w, el8Var6);
                String str = he9Var.f42270g;
                Object objM10482a11 = dm8.m10482a(new zx9(he9Var.f42271h), cm8Var2, el8Var6);
                Object objM10482a12 = dm8.m10482a(he9Var.f42272i, dm8.f35860o, el8Var6);
                Object objM10482a13 = dm8.m10482a(he9Var.f42273j, dm8.f35857l, el8Var6);
                xi5 xi5Var = he9Var.f42274k;
                xi5 xi5Var2 = xi5.f68250c;
                Object objM10482a14 = dm8.m10482a(xi5Var, dm8.f35840A, el8Var6);
                Object objM10482a15 = dm8.m10482a(new aa1(he9Var.f42275l), cm8Var, el8Var6);
                Object objM10482a16 = dm8.m10482a(he9Var.f42276m, dm8.f35856k, el8Var6);
                l39 l39Var2 = he9Var.f42277n;
                l39 l39Var3 = l39.f48992d;
                return vz1.m23627e(objM10482a6, objM10482a7, objM10482a8, objM10482a9, objM10482a10, -1, str, objM10482a11, objM10482a12, objM10482a13, objM10482a14, objM10482a15, objM10482a16, dm8.m10482a(l39Var2, dm8.f35862q, el8Var6));
            case 22:
                el8 el8Var7 = (el8) obj;
                ww9 ww9Var = (ww9) obj2;
                he9 he9Var2 = ww9Var.f67431a;
                fs6 fs6Var = dm8.f35854i;
                return vz1.m23627e(dm8.m10482a(he9Var2, fs6Var, el8Var7), dm8.m10482a(ww9Var.f67432b, fs6Var, el8Var7), dm8.m10482a(ww9Var.f67433c, fs6Var, el8Var7), dm8.m10482a(ww9Var.f67434d, fs6Var, el8Var7));
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return Integer.valueOf(((yn8) obj2).f70117a.m21222h());
            case 24:
                return ((C0269z) obj2).m1215c();
            case 25:
                ((gq2) obj).f41177d = ((bk2) obj2).f8632a;
                return xfaVar;
            case 26:
                ((gq2) obj).f41178e = (g99) obj2;
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ((hq2) obj).f42769a = (on3) obj2;
                return xfaVar;
            case 28:
                mv9 mv9Var = (mv9) obj2;
                return vz1.m23605K(Float.valueOf(mv9Var.f51891a.m19861h()), Boolean.valueOf(((Orientation) ((xc9) mv9Var.f51896f).getValue()) == Orientation.Vertical));
            default:
                el8 el8Var8 = (el8) obj;
                vv9 vv9Var = (vv9) obj2;
                return vz1.m23627e(dm8.m10482a(vv9Var.f65990a, dm8.f35846a, el8Var8), dm8.m10482a(new cx9(vv9Var.f65991b), dm8.f35861p, el8Var8));
        }
    }
}
