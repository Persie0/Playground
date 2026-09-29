package p000;

import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.foundation.lazy.grid.C0129b;
import androidx.compose.foundation.lazy.staggeredgrid.C0144d;
import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.Message;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ln1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49857a;

    public /* synthetic */ ln1(int i) {
        this.f49857a = i;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0118 A[LOOP:0: B:23:0x00d1->B:36:0x0118, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x011b A[SYNTHETIC] */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f49857a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return DataStoreImpl.writeActor$lambda$1((Message.Update) obj, (Throwable) obj2);
            case 2:
                o72 o72Var = (o72) obj2;
                return vz1.m23605K(Integer.valueOf(o72Var.m1036k()), Float.valueOf(l70.m15944g(o72Var.m1037l(), -0.5f, 0.5f)), Integer.valueOf(o72Var.mo1039n()));
            case 3:
                return Boolean.valueOf(fa4.m11650l(obj, obj2));
            case 4:
                ((zp2) obj).f71932b = (zz3) obj2;
                return xfaVar;
            case 5:
                ((zp2) obj).f71931a = (on3) obj2;
                return xfaVar;
            case 6:
                ((zp2) obj).f71935e = ((il1) obj2).f44253a;
                return xfaVar;
            case 7:
                ea1 ea1Var = (ea1) obj2;
                ((zp2) obj).f71933c = ea1Var != null ? ea1Var.f36898a : null;
                return xfaVar;
            case 8:
                ((zp2) obj).f71934d = (Float) obj2;
                return xfaVar;
            case 9:
                ((Integer) obj2).getClass();
                return new aq3(1L);
            case 10:
                C0129b c0129b = (C0129b) obj2;
                return vz1.m23605K(Integer.valueOf(c0129b.f2471d.f67245b.m21222h()), Integer.valueOf(c0129b.f2471d.f67246c.m21222h()));
            case 11:
                C0127b c0127b = (C0127b) obj2;
                return vz1.m23605K(Integer.valueOf(c0127b.m978h()), Integer.valueOf(c0127b.m979i()));
            case 12:
                Map mapMo10401d = ((ov4) obj2).mo10401d();
                if (mapMo10401d.isEmpty()) {
                    return null;
                }
                return mapMo10401d;
            case 13:
                zc2 zc2Var = ((C0144d) obj2).f2600c;
                return vz1.m23605K((int[]) zc2Var.f71350c, (int[]) zc2Var.f71352e);
            case 14:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                return xfaVar;
            case 15:
                return (Float) ((mp7) obj2).f51704a.m745d();
            case 16:
                el8 el8Var = (el8) obj;
                t66 t66Var = (t66) obj2;
                if (!(t66Var instanceof vc9)) {
                    C3386nv.m17626m("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                    return null;
                }
                vc9 vc9Var = (vc9) t66Var;
                Object objInvoke = ((zi3) vv9.f65989d.f39590b).invoke(el8Var, vc9Var.getValue());
                if (objInvoke == null) {
                    return null;
                }
                yc9 yc9VarMo19860b = vc9Var.mo19860b();
                yc9VarMo19860b.getClass();
                return AbstractC0278f.m1259i(objInvoke, yc9VarMo19860b);
            case 17:
                ((fq2) obj).f39450d = (on3) obj2;
                return xfaVar;
            case 18:
                ((fq2) obj).f39452f = ((C3494qe) obj2).f57630a;
                return xfaVar;
            case 19:
                ((fq2) obj).f39451e = ((C3406oe) obj2).f54237a;
                return xfaVar;
            case 20:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 21:
                gl8 gl8Var = (gl8) obj2;
                Map map = gl8Var.f40974a;
                n66 n66Var = gl8Var.f40975b;
                Object[] objArr = n66Var.f52400b;
                Object[] objArr2 = n66Var.f52401c;
                long[] jArr = n66Var.f52399a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj3 = objArr[i5];
                                    Map mapMo10401d2 = ((il8) objArr2[i5]).mo10401d();
                                    if (mapMo10401d2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapMo10401d2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 == 8) {
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        } else if (i2 != length) {
                            i2++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 22:
                return obj2;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                C3419on c3419on = (C3419on) obj2;
                return vz1.m23627e(c3419on.f54604b, dm8.m10482a(c3419on.f54603a, dm8.f35847b, (el8) obj));
            case 24:
                return Integer.valueOf(((rt9) obj2).f59804a);
            case 25:
                yv9 yv9Var = (yv9) obj2;
                return vz1.m23627e(Float.valueOf(yv9Var.f70560a), Float.valueOf(yv9Var.f70561b));
            case 26:
                el8 el8Var2 = (el8) obj;
                aw9 aw9Var = (aw9) obj2;
                zx9 zx9Var = new zx9(aw9Var.f7625a);
                cm8 cm8Var = dm8.f35869x;
                return vz1.m23627e(dm8.m10482a(zx9Var, cm8Var, el8Var2), dm8.m10482a(new zx9(aw9Var.f7626b), cm8Var, el8Var2));
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return Integer.valueOf(((bc3) obj2).f8327a);
            case 28:
                ee5 ee5Var = (ee5) obj2;
                return vz1.m23627e(ee5Var.f37108a, dm8.m10482a(ee5Var.f37109b, dm8.f35855j, (el8) obj));
            default:
                return Float.valueOf(((oa0) obj2).f54096a);
        }
    }
}
