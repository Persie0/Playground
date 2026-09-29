package p000;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class yi1 implements xl6 {

    /* JADX INFO: renamed from: a */
    public final String f69862a;

    public yi1(String str) {
        str.getClass();
        this.f69862a = str;
    }

    @Override // p000.mc3
    /* JADX INFO: renamed from: a */
    public final pc3 mo337a() {
        this.f69862a.getClass();
        return new cg1();
    }

    @Override // p000.mc3
    /* JADX INFO: renamed from: b */
    public final t47 mo338b() {
        List listM23635i;
        String strSubstring;
        String strSubstring2 = this.f69862a;
        int length = strSubstring2.length();
        EmptyList emptyList = EmptyList.f47638a;
        if (length == 0) {
            listM23635i = emptyList;
        } else {
            ListBuilder listBuilderM23650t = vz1.m23650t();
            String strSubstring3 = "";
            if (ead.m11005b(strSubstring2.charAt(0))) {
                int length2 = strSubstring2.length();
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        strSubstring = strSubstring2;
                        break;
                    }
                    if (!ead.m11005b(strSubstring2.charAt(i))) {
                        strSubstring = strSubstring2.substring(0, i);
                        break;
                    }
                    i++;
                }
                listBuilderM23650t.add(new zo6(vz1.m23604J(new zi1(strSubstring))));
                int length3 = strSubstring2.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length3) {
                        strSubstring2 = "";
                        break;
                    }
                    if (!ead.m11005b(strSubstring2.charAt(i2))) {
                        strSubstring2 = strSubstring2.substring(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (strSubstring2.length() > 0) {
                if (ead.m11005b(strSubstring2.charAt(strSubstring2.length() - 1))) {
                    int length4 = strSubstring2.length();
                    while (true) {
                        length4--;
                        if (-1 >= length4) {
                            break;
                        }
                        if (!ead.m11005b(strSubstring2.charAt(length4))) {
                            strSubstring3 = strSubstring2.substring(0, length4 + 1);
                            break;
                        }
                    }
                    listBuilderM23650t.add(new s87(strSubstring3));
                    for (int length5 = strSubstring2.length() - 1; -1 < length5; length5--) {
                        if (!ead.m11005b(strSubstring2.charAt(length5))) {
                            strSubstring2 = strSubstring2.substring(length5 + 1);
                            break;
                        }
                    }
                    listBuilderM23650t.add(new zo6(vz1.m23604J(new zi1(strSubstring2))));
                } else {
                    listBuilderM23650t.add(new s87(strSubstring2));
                }
            }
            listM23635i = vz1.m23635i(listBuilderM23650t);
        }
        return new t47(listM23635i, emptyList);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yi1) {
            return fa4.m11650l(this.f69862a, ((yi1) obj).f69862a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69862a.hashCode();
    }

    public final String toString() {
        return ux5.m22992o(new StringBuilder("ConstantFormatStructure("), this.f69862a, ')');
    }
}
