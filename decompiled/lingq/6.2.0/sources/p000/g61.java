package p000;

import com.lingq.feature.challenges.cup.AbstractC1976c;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g61 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40257a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f40258b;

    public /* synthetic */ g61(List list) {
        this.f40257a = 5;
        this.f40258b = list;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6 A[LOOP:0: B:29:0x0083->B:40:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3 A[LOOP:2: B:46:0x00c1->B:57:0x00f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x004b A[SYNTHETIC] */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        String str;
        Pair pair;
        String str2;
        Object next2;
        String str3;
        String str4;
        Object objM22611c1;
        int i = this.f40257a;
        xfa xfaVar = xfa.f68157a;
        List list = this.f40258b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                w7d.m23809d(list, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 1:
                ((Integer) obj2).getClass();
                w7d.m23809d(list, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC1976c.m8832o(list, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 3:
                ((Integer) obj2).getClass();
                djd.m10422b(list, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 4:
                ((Integer) obj2).getClass();
                wx1.m24194c(list, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                charSequence.getClass();
                List list2 = list;
                if (list2.size() == 1) {
                    List list3 = list2;
                    if (list3 instanceof List) {
                        objM22611c1 = u91.m22611c1(list3);
                    } else {
                        Iterator it = list3.iterator();
                        if (!it.hasNext()) {
                            uk9.m22775i("Collection is empty.");
                            return null;
                        }
                        Object next3 = it.next();
                        if (it.hasNext()) {
                            C3386nv.m17626m("Collection has more than one element.");
                            return null;
                        }
                        objM22611c1 = next3;
                    }
                    String str5 = (String) objM22611c1;
                    int iM23389l0 = vk9.m23389l0(charSequence, str5, iIntValue, false, 4);
                    if (iM23389l0 < 0) {
                        pair = null;
                    } else {
                        pair = new Pair(Integer.valueOf(iM23389l0), str5);
                    }
                } else {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    i84 i84Var = new i84(iIntValue, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i2 = i84Var.f40381c;
                    int i3 = i84Var.f40380b;
                    if (z) {
                        if ((i2 <= 0 || iIntValue > i3) && (i2 >= 0 || i3 > iIntValue)) {
                            pair = null;
                        } else {
                            while (true) {
                                Iterator it2 = list2.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        pair = new Pair(Integer.valueOf(iIntValue), str3);
                                    } else if (iIntValue != i3) {
                                        iIntValue += i2;
                                    } else {
                                        pair = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence, iIntValue, str4.length()));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    pair = new Pair(Integer.valueOf(iIntValue), str3);
                                } else if (iIntValue != i3) {
                                    iIntValue += i2;
                                } else {
                                    pair = null;
                                }
                            }
                        }
                    } else if ((i2 <= 0 || iIntValue > i3) && (i2 >= 0 || i3 > iIntValue)) {
                        pair = null;
                    } else {
                        int i4 = iIntValue;
                        while (true) {
                            Iterator it3 = list2.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    pair = new Pair(Integer.valueOf(i4), str);
                                } else if (i4 != i3) {
                                    i4 += i2;
                                } else {
                                    pair = null;
                                }
                            } while (!vk9.m23397t0(str2, 0, charSequence, i4, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                pair = new Pair(Integer.valueOf(i4), str);
                            } else if (i4 != i3) {
                                i4 += i2;
                            } else {
                                pair = null;
                            }
                        }
                    }
                }
                if (pair != null) {
                    return new Pair(pair.f47623a, Integer.valueOf(((String) pair.f47624b).length()));
                }
                return null;
        }
    }

    public /* synthetic */ g61(int i, int i2, List list) {
        this.f40257a = i2;
        this.f40258b = list;
    }
}
