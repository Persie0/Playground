package p000;

import com.google.android.gms.internal.measurement.zzaeh;
import com.google.common.collect.C1097m;
import com.google.common.collect.C1099o;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedSet;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class d3d {

    /* JADX INFO: renamed from: b */
    public static final d3d f34977b = new d3d(ImmutableSortedSet.m6315y());

    /* JADX INFO: renamed from: a */
    public final ImmutableSortedSet f34978a;

    public d3d(ImmutableSortedSet immutableSortedSet) {
        this.f34978a = immutableSortedSet;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0111  */
    /* JADX INFO: renamed from: a */
    public static d3d m10075a(d3d d3dVar, ImmutableMap immutableMap) {
        long j;
        if (immutableMap.isEmpty()) {
            return d3dVar;
        }
        HashMap map = new HashMap(immutableMap);
        ImmutableSortedSet immutableSortedSet = d3dVar.f34978a;
        C1099o c1099oM6314w = ImmutableSortedSet.m6314w();
        bga it = immutableSortedSet.iterator();
        while (true) {
            d14 d14Var = (d14) it;
            if (!d14Var.hasNext()) {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    int length = str.length();
                    if (length > 19 || length == 0) {
                        j = 0;
                        break;
                    }
                    boolean z = false;
                    long jCharAt = str.charAt(0) - '0';
                    if (jCharAt < 1 || jCharAt > 9) {
                        j = 0;
                        break;
                    }
                    int i = 1;
                    while (true) {
                        if (i >= length) {
                            if (jCharAt >= 0 && jCharAt <= 2305843009213693951L) {
                                j = jCharAt;
                                break;
                            }
                            break;
                        }
                        int iCharAt = str.charAt(i) - '0';
                        if (!((iCharAt > 9) | (iCharAt < 0 ? true : z))) {
                            jCharAt = (jCharAt * 10) + ((long) iCharAt);
                            i++;
                            z = false;
                        }
                        j = 0;
                        break;
                    }
                    String str2 = j == 0 ? str : null;
                    if (obj instanceof String) {
                        c1099oM6314w.m3157b(new z2d(4, j, 0L, obj, str2));
                    } else if (obj instanceof byte[]) {
                        c1099oM6314w.m3157b(new z2d(5, j, 0L, obj, str2));
                    } else if (obj instanceof Boolean) {
                        c1099oM6314w.m3157b(new z2d(((Boolean) obj).booleanValue() ? 1 : 0, j, 0L, null, str2));
                    } else if (obj instanceof Long) {
                        c1099oM6314w.m3157b(new z2d(2, j, ((Long) obj).longValue(), null, str2));
                    } else {
                        if (!(obj instanceof Double)) {
                            String strValueOf = String.valueOf(obj);
                            C3386nv.m17633t(wq1.m24125u(new StringBuilder(str.length() + 28 + strValueOf.length()), "Cannot serialize override ", str, ": ", strValueOf));
                            return null;
                        }
                        c1099oM6314w.m3157b(new z2d(3, j, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null, str2));
                    }
                }
                return new d3d(c1099oM6314w.m6344i());
            }
            z2d z2dVar = (z2d) d14Var.next();
            Object string = z2dVar.f70811b;
            long j2 = z2dVar.f70810a;
            if (string == null) {
                string = Long.toString(j2);
            }
            Object objRemove = map.remove(string);
            if (objRemove == null) {
                c1099oM6314w.m3157b(z2dVar);
            } else if (objRemove instanceof String) {
                c1099oM6314w.m3157b(new z2d(4, z2dVar.f70810a, 0L, objRemove, z2dVar.f70811b));
            } else if (objRemove instanceof byte[]) {
                c1099oM6314w.m3157b(new z2d(5, z2dVar.f70810a, 0L, objRemove, z2dVar.f70811b));
            } else if (objRemove instanceof Boolean) {
                c1099oM6314w.m3157b(new z2d(((Boolean) objRemove).booleanValue() ? 1 : 0, z2dVar.f70810a, 0L, null, z2dVar.f70811b));
            } else if (objRemove instanceof Long) {
                c1099oM6314w.m3157b(new z2d(2, z2dVar.f70810a, ((Long) objRemove).longValue(), null, z2dVar.f70811b));
            } else {
                if (!(objRemove instanceof Double)) {
                    String string2 = z2dVar.f70811b;
                    if (string2 == null) {
                        string2 = Long.toString(j2);
                    }
                    String string3 = objRemove.toString();
                    throw new IllegalStateException(wq1.m24125u(new StringBuilder(String.valueOf(string2).length() + 46 + string3.length()), "Cannot serialize override for existing flag ", string2, ": ", string3));
                }
                c1099oM6314w.m3157b(new z2d(3, z2dVar.f70810a, Double.doubleToRawLongBits(((Double) objRemove).doubleValue()), null, z2dVar.f70811b));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static d3d m10076b() {
        return f34977b;
    }

    /* JADX INFO: renamed from: d */
    public static d3d m10077d(ghb ghbVar) throws zzaeh {
        String strMo5391w;
        long j;
        z2d z2dVar;
        int iMo5366G = ghbVar.mo5366G();
        if (iMo5366G < 0) {
            uk9.m22782q("Negative number of flags");
            return null;
        }
        C1099o c1099oM6314w = ImmutableSortedSet.m6314w();
        long j2 = 0;
        for (int i = 0; i < iMo5366G; i++) {
            long jMo5367H = ghbVar.mo5367H();
            int i2 = (int) jMo5367H;
            long j3 = jMo5367H >>> 3;
            if (j3 == 0) {
                j = 0;
                strMo5391w = ghbVar.mo5391w();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    uk9.m22782q("Flag name larger than max size");
                    return null;
                }
                strMo5391w = null;
                j = j4;
            }
            int i3 = i2 & 7;
            if (i3 == 0 || i3 == 1) {
                z2dVar = new z2d(i3, j, 0L, null, strMo5391w);
            } else if (i3 == 2) {
                z2dVar = new z2d(i3, j, ghbVar.mo5367H(), null, strMo5391w);
            } else if (i3 == 3) {
                z2dVar = new z2d(i3, j, Double.doubleToRawLongBits(ghbVar.mo5383o()), null, strMo5391w);
            } else if (i3 == 4) {
                z2dVar = new z2d(i3, j, 0L, ghbVar.mo5391w(), strMo5391w);
            } else {
                if (i3 != 5) {
                    uk9.m22782q(wq1.m24124t(new StringBuilder(String.valueOf(i3).length() + 23), "Unrecognized flag type ", i3));
                    return null;
                }
                z2dVar = new z2d(i3, j, 0L, ghbVar.mo5394z(), strMo5391w);
            }
            long j5 = z2dVar.f70810a;
            if (j5 != 0) {
                j2 = j5;
            }
            c1099oM6314w.m3157b(z2dVar);
        }
        return new d3d(c1099oM6314w.m6344i());
    }

    /* JADX INFO: renamed from: c */
    public final void m10078c(C1097m c1097m) {
        bga it = this.f34978a.iterator();
        while (true) {
            d14 d14Var = (d14) it;
            if (!d14Var.hasNext()) {
                return;
            }
            z2d z2dVar = (z2d) d14Var.next();
            String string = z2dVar.f70811b;
            if (string == null) {
                string = Long.toString(z2dVar.f70810a);
            }
            c1097m.m6340b(string, z2dVar.m25422a());
        }
    }

    /* JADX INFO: renamed from: e */
    public final ImmutableSortedSet m10079e() {
        return this.f34978a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d3d)) {
            return false;
        }
        return this.f34978a.equals(((d3d) obj).f34978a);
    }

    /* JADX INFO: renamed from: f */
    public final int m10080f() {
        return this.f34978a.size();
    }

    public final int hashCode() {
        return this.f34978a.hashCode();
    }
}
