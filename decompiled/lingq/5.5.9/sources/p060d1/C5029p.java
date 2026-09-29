package p060d1;

import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: d1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C5029p {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f32847a = new LinkedHashMap();

    /* JADX INFO: renamed from: d1.p$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f32848a;

        /* JADX INFO: renamed from: b */
        public final long f32849b;

        /* JADX INFO: renamed from: c */
        public final boolean f32850c;

        public a(long j10, long j11, boolean z10) {
            this.f32848a = j10;
            this.f32849b = j11;
            this.f32850c = z10;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C5019f m10715a(C5030q c5030q, InterfaceC5037x interfaceC5037x) {
        boolean z10;
        long j10;
        long j11;
        C5207g.m11111f(interfaceC5037x, "positionCalculator");
        List<C5031r> list = c5030q.f32851a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C5031r c5031r = list.get(i10);
            LinkedHashMap linkedHashMap2 = this.f32847a;
            a aVar = (a) linkedHashMap2.get(new C5027n(c5031r.f32853a));
            if (aVar == null) {
                j11 = c5031r.f32854b;
                j10 = c5031r.f32856d;
                z10 = false;
            } else {
                long jMo2263o = interfaceC5037x.mo2263o(aVar.f32849b);
                long j12 = aVar.f32848a;
                z10 = aVar.f32850c;
                j10 = jMo2263o;
                j11 = j12;
            }
            long j13 = c5031r.f32853a;
            linkedHashMap.put(new C5027n(j13), new C5028o(j13, c5031r.f32854b, c5031r.f32856d, c5031r.f32857e, c5031r.f32858f, j11, j10, z10, c5031r.f32859g, c5031r.f32861i, c5031r.f32862j));
            boolean z11 = c5031r.f32857e;
            long j14 = c5031r.f32853a;
            if (z11) {
                linkedHashMap2.put(new C5027n(j14), new a(c5031r.f32854b, c5031r.f32855c, z11));
            } else {
                linkedHashMap2.remove(new C5027n(j14));
            }
        }
        return new C5019f(linkedHashMap, c5030q);
    }
}
