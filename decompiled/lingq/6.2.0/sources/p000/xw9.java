package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class xw9 implements ht5 {

    /* JADX INFO: renamed from: a */
    public final ui3 f68907a;

    /* JADX INFO: renamed from: b */
    public final ui3 f68908b;

    public xw9(ui3 ui3Var, ui3 ui3Var2) {
        this.f68907a = ui3Var;
        this.f68908b = ui3Var2;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        ArrayList arrayList;
        Pair pair;
        ArrayList arrayList2 = new ArrayList(list.size());
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(((ct5) obj).mo1509A() instanceof dx9)) {
                arrayList2.add(obj);
            }
        }
        List list3 = (List) this.f68908b.mo0a();
        if (list3 != null) {
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size2 = list3.size();
            int i2 = 0;
            while (i2 < size2) {
                e28 e28Var = (e28) list3.get(i2);
                if (e28Var != null) {
                    float f = e28Var.f36621b;
                    float f2 = e28Var.f36620a;
                    l87 l87VarMo1514r = ((ct5) arrayList2.get(i2)).mo1514r(dk1.m10424b(0, (int) Math.floor(e28Var.f36622c - f2), 0, (int) Math.floor(e28Var.f36623d - f), 5));
                    int iRound = Math.round(f2);
                    pair = new Pair(l87VarMo1514r, new f84((((long) Math.round(f)) & 4294967295L) | (((long) iRound) << 32)));
                } else {
                    pair = null;
                }
                ArrayList arrayList4 = arrayList3;
                if (pair != null) {
                    arrayList4.add(pair);
                }
                i2++;
                arrayList3 = arrayList4;
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj2 = list.get(i3);
            if (((ct5) obj2).mo1509A() instanceof dx9) {
                arrayList5.add(obj2);
            }
        }
        return jt5Var.mo9895M0(bk1.m3801i(j), bk1.m3800h(j), AbstractC3194a.m15360M(), new ui5(19, arrayList, d32.m10066z(arrayList5, this.f68907a)));
    }
}
