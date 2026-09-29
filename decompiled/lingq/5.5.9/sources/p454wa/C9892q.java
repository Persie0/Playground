package p454wa;

import java.util.ArrayList;
import java.util.Collections;
import p166i1.C6161p;
import p253m1.C7461h;

/* JADX INFO: renamed from: wa.q */
/* JADX INFO: loaded from: classes.dex */
public final class C9892q {

    /* JADX INFO: renamed from: h */
    public static final C7461h f50513h = new C7461h(6);

    /* JADX INFO: renamed from: i */
    public static final C6161p f50514i = new C6161p(4);

    /* JADX INFO: renamed from: a */
    public final int f50515a;

    /* JADX INFO: renamed from: e */
    public int f50519e;

    /* JADX INFO: renamed from: f */
    public int f50520f;

    /* JADX INFO: renamed from: g */
    public int f50521g;

    /* JADX INFO: renamed from: c */
    public final a[] f50517c = new a[5];

    /* JADX INFO: renamed from: b */
    public final ArrayList<a> f50516b = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public int f50518d = -1;

    /* JADX INFO: renamed from: wa.q$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f50522a;

        /* JADX INFO: renamed from: b */
        public int f50523b;

        /* JADX INFO: renamed from: c */
        public float f50524c;
    }

    public C9892q(int i10) {
        this.f50515a = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m18398a(int i10, float f3) {
        a aVar;
        int i11 = this.f50518d;
        ArrayList<a> arrayList = this.f50516b;
        if (i11 != 1) {
            Collections.sort(arrayList, f50513h);
            this.f50518d = 1;
        }
        int i12 = this.f50521g;
        a[] aVarArr = this.f50517c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f50521g = i13;
            aVar = aVarArr[i13];
        } else {
            aVar = new a();
        }
        int i14 = this.f50519e;
        this.f50519e = i14 + 1;
        aVar.f50522a = i14;
        aVar.f50523b = i10;
        aVar.f50524c = f3;
        arrayList.add(aVar);
        this.f50520f += i10;
        while (true) {
            int i15 = this.f50520f;
            int i16 = this.f50515a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            a aVar2 = arrayList.get(0);
            int i18 = aVar2.f50523b;
            if (i18 <= i17) {
                this.f50520f -= i18;
                arrayList.remove(0);
                int i19 = this.f50521g;
                if (i19 < 5) {
                    this.f50521g = i19 + 1;
                    aVarArr[i19] = aVar2;
                }
            } else {
                aVar2.f50523b = i18 - i17;
                this.f50520f -= i17;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m18399b() {
        int i10 = this.f50518d;
        ArrayList<a> arrayList = this.f50516b;
        if (i10 != 0) {
            Collections.sort(arrayList, f50514i);
            this.f50518d = 0;
        }
        float f3 = 0.5f * this.f50520f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            a aVar = arrayList.get(i12);
            i11 += aVar.f50523b;
            if (i11 >= f3) {
                return aVar.f50524c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return arrayList.get(arrayList.size() - 1).f50524c;
    }
}
