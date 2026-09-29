package p000;

import androidx.compose.material3.C0253l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes2.dex */
public final class xi6 implements ht5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0253l f68253a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f68254b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qc9 f68255c;

    public xi6(C0253l c0253l, t66 t66Var, qc9 qc9Var) {
        this.f68253a = c0253l;
        this.f68254b = t66Var;
        this.f68255c = qc9Var;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        Integer numValueOf;
        long jM3794b = bk1.m3794b(0, 0, 0, 0, 10, j);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((ct5) list.get(i)).mo1514r(jM3794b));
        }
        Integer num = null;
        int i2 = 1;
        if (!arrayList.isEmpty()) {
            numValueOf = Integer.valueOf(((l87) arrayList.get(0)).f49301a);
            int size2 = arrayList.size() - 1;
            if (1 <= size2) {
                int i3 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((l87) arrayList.get(i3)).f49301a);
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i3 == size2) {
                        break;
                    }
                    i3++;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        if (!arrayList.isEmpty()) {
            Integer numValueOf3 = Integer.valueOf(((l87) arrayList.get(0)).f49302b);
            int size3 = arrayList.size() - 1;
            if (1 <= size3) {
                while (true) {
                    Integer numValueOf4 = Integer.valueOf(((l87) arrayList.get(i2)).f49302b);
                    if (numValueOf4.compareTo(numValueOf3) > 0) {
                        numValueOf3 = numValueOf4;
                    }
                    if (i2 == size3) {
                        break;
                    }
                    i2++;
                }
            }
            num = numValueOf3;
        }
        return jt5Var.mo9895M0(iIntValue, num != null ? num.intValue() : 0, AbstractC3194a.m15360M(), new C3516qz(this.f68253a, iIntValue, arrayList, this.f68254b, this.f68255c, 2));
    }
}
