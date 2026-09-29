package p000;

import androidx.compose.p002ui.layout.AbstractC0343j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: rn */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3542rn implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59567a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f59568b;

    public /* synthetic */ C3542rn(int i, ArrayList arrayList) {
        this.f59567a = i;
        this.f59568b = arrayList;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f59567a;
        xfa xfaVar = xfa.f68157a;
        int i2 = 0;
        ArrayList arrayList = this.f59568b;
        switch (i) {
            case 0:
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractC0343j.m1521j(abstractC0343j, (l87) arrayList.get(i3), 0, 0);
                }
                break;
            case 1:
                AbstractC0343j abstractC0343j2 = (AbstractC0343j) obj;
                int size2 = arrayList.size();
                int i4 = 0;
                while (i4 < size2) {
                    lt5 lt5Var = (lt5) arrayList.get(i4);
                    List list = lt5Var.f50102c;
                    boolean z = lt5Var.f50108i;
                    if (lt5Var.f50112m == Integer.MIN_VALUE) {
                        l54.m15814a("position() should be called first");
                    }
                    int size3 = list.size();
                    int i5 = i2;
                    while (i5 < size3) {
                        l87 l87Var = (l87) list.get(i5);
                        int[] iArr = lt5Var.f50110k;
                        int i6 = i5 * 2;
                        int i7 = size2;
                        long j = (((long) iArr[i6 + 1]) & 4294967295L) | (((long) iArr[i6]) << 32);
                        if (lt5Var.f50107h) {
                            int i8 = z ? (int) (j >> 32) : (lt5Var.f50112m - ((int) (j >> 32))) - (z ? l87Var.f49302b : l87Var.f49301a);
                            j = (((long) (z ? (lt5Var.f50112m - ((int) (j & 4294967295L))) - (z ? l87Var.f49302b : l87Var.f49301a) : (int) (j & 4294967295L))) & 4294967295L) | (((long) i8) << 32);
                        }
                        long jM11595d = f84.m11595d(j, lt5Var.f50103d);
                        if (z) {
                            AbstractC0343j.m1526q(abstractC0343j2, l87Var, jM11595d);
                        } else {
                            AbstractC0343j.m1523m(abstractC0343j2, l87Var, jM11595d);
                        }
                        i5++;
                        size2 = i7;
                    }
                    i4++;
                    i2 = 0;
                }
                break;
            default:
                AbstractC0343j abstractC0343j3 = (AbstractC0343j) obj;
                int size4 = arrayList.size();
                for (int i9 = 0; i9 < size4; i9++) {
                    abstractC0343j3.m1530f((l87) arrayList.get(i9), 0, 0, 0.0f);
                }
                break;
        }
        return xfaVar;
    }
}
