package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class jl8 implements il8 {

    /* JADX INFO: renamed from: a */
    public final vi3 f45676a;

    /* JADX INFO: renamed from: b */
    public final n66 f45677b;

    /* JADX INFO: renamed from: c */
    public n66 f45678c;

    public jl8(Map map, vi3 vi3Var) {
        n66 n66Var;
        this.f45676a = vi3Var;
        if (map == null || map.isEmpty()) {
            n66Var = null;
        } else {
            n66Var = new n66(map.size());
            for (Map.Entry entry : map.entrySet()) {
                n66Var.m17261m(entry.getKey(), entry.getValue());
            }
        }
        this.f45677b = n66Var;
    }

    @Override // p000.il8
    /* JADX INFO: renamed from: a */
    public final hl8 mo10399a(String str, ui3 ui3Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!ci8.m4697J(str.charAt(i))) {
                n66 n66Var = this.f45678c;
                if (n66Var == null) {
                    long[] jArr = om8.f54590a;
                    n66Var = new n66();
                    this.f45678c = n66Var;
                }
                Object objM17255g = n66Var.m17255g(str);
                if (objM17255g == null) {
                    objM17255g = new ArrayList();
                    n66Var.m17261m(str, objM17255g);
                }
                ((List) objM17255g).add(ui3Var);
                return new sq5(12, n66Var, ui3Var, str);
            }
        }
        C3386nv.m17626m("Registered key is empty or blank");
        return null;
    }

    @Override // p000.il8
    /* JADX INFO: renamed from: b */
    public final boolean mo10400b(Object obj) {
        return ((Boolean) this.f45676a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    @Override // p000.il8
    /* JADX INFO: renamed from: d */
    public final Map mo10401d() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        n66 n66Var = this.f45677b;
        if (n66Var == null && this.f45678c == null) {
            return AbstractC3194a.m15360M();
        }
        int i3 = 0;
        int i4 = n66Var != null ? n66Var.f52403e : 0;
        n66 n66Var2 = this.f45678c;
        HashMap map = new HashMap(i4 + (n66Var2 != null ? n66Var2.f52403e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (n66Var != null) {
            Object[] objArr = n66Var.f52400b;
            Object[] objArr2 = n66Var.f52401c;
            long[] jArr3 = n66Var.f52399a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        n66 n66Var3 = this.f45678c;
        if (n66Var3 != null) {
            Object[] objArr3 = n66Var3.f52400b;
            Object[] objArr4 = n66Var3.f52401c;
            long[] jArr4 = n66Var3.f52399a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objMo0a = ((ui3) list.get(i3)).mo0a();
                                    if (objMo0a != null) {
                                        if (!mo10400b(objMo0a)) {
                                            gm5.m12751g(xwc.m24783u(objMo0a));
                                            return null;
                                        }
                                        map.put(str, vz1.m23627e(objMo0a));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objMo0a2 = ((ui3) list.get(i3)).mo0a();
                                        if (objMo0a2 != null && !mo10400b(objMo0a2)) {
                                            gm5.m12751g(xwc.m24783u(objMo0a2));
                                            return null;
                                        }
                                        arrayList.add(objMo0a2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // p000.il8
    /* JADX INFO: renamed from: e */
    public final Object mo10402e(String str) {
        n66 n66Var = this.f45677b;
        List list = n66Var != null ? (List) n66Var.m17259k(str) : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && n66Var != null) {
            List listSubList = list.subList(1, list.size());
            int iM17254f = n66Var.m17254f(str);
            if (iM17254f < 0) {
                iM17254f = ~iM17254f;
            }
            Object[] objArr = n66Var.f52401c;
            Object obj = objArr[iM17254f];
            n66Var.f52400b[iM17254f] = str;
            objArr[iM17254f] = listSubList;
        }
        return list.get(0);
    }
}
