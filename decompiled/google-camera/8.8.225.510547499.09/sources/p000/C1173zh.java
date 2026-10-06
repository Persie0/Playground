package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: zh */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1173zh {

    /* JADX INFO: renamed from: a */
    static int f48335a = 0;

    /* JADX INFO: renamed from: c */
    public final int f48337c;

    /* JADX INFO: renamed from: d */
    public int f48338d;

    /* JADX INFO: renamed from: b */
    final ArrayList f48336b = new ArrayList();

    /* JADX INFO: renamed from: e */
    ArrayList f48339e = null;

    /* JADX INFO: renamed from: f */
    private int f48340f = -1;

    public C1173zh(int i) {
        int i2 = f48335a;
        f48335a = i2 + 1;
        this.f48337c = i2;
        this.f48338d = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m19778a(C1141yc c1141yc, int i) {
        if (this.f48336b.size() == 0) {
            return 0;
        }
        ArrayList arrayList = this.f48336b;
        C1152yn c1152yn = ((C1152yn) arrayList.get(0)).f48206V;
        c1141yc.m19632k();
        c1152yn.mo19645b(c1141yc, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C1152yn) arrayList.get(i2)).mo19645b(c1141yc, false);
        }
        if (i == 0) {
            C1153yo c1153yo = (C1153yo) c1152yn;
            if (c1153yo.f48267av > 0) {
                C0987sk.m19400b(c1153yo, c1141yc, arrayList, 0);
            }
        }
        if (i == 1) {
            C1153yo c1153yo2 = (C1153yo) c1152yn;
            if (c1153yo2.f48268aw > 0) {
                C0987sk.m19400b(c1153yo2, c1141yc, arrayList, 1);
            }
        }
        try {
            c1141yc.m19631j();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f48339e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f48339e.add(new C0994sr((C1152yn) arrayList.get(i3)));
        }
        if (i == 0) {
            C1153yo c1153yo3 = (C1153yo) c1152yn;
            int iM19615o = C1141yc.m19615o(c1153yo3.f48195K);
            int iM19615o2 = C1141yc.m19615o(c1153yo3.f48197M);
            c1141yc.m19632k();
            return iM19615o2 - iM19615o;
        }
        C1153yo c1153yo4 = (C1153yo) c1152yn;
        int iM19615o3 = C1141yc.m19615o(c1153yo4.f48196L);
        int iM19615o4 = C1141yc.m19615o(c1153yo4.f48198N);
        c1141yc.m19632k();
        return iM19615o4 - iM19615o3;
    }

    /* JADX INFO: renamed from: b */
    public final void m19779b(ArrayList arrayList) {
        int size = this.f48336b.size();
        if (this.f48340f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C1173zh c1173zh = (C1173zh) arrayList.get(i);
                if (this.f48340f == c1173zh.f48337c) {
                    m19780c(this.f48338d, c1173zh);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19780c(int i, C1173zh c1173zh) {
        ArrayList arrayList = this.f48336b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1152yn c1152yn = (C1152yn) arrayList.get(i2);
            c1173zh.m19781d(c1152yn);
            if (i == 0) {
                c1152yn.f48227ap = c1173zh.f48337c;
            } else {
                c1152yn.f48228aq = c1173zh.f48337c;
            }
        }
        this.f48340f = c1173zh.f48337c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19781d(C1152yn c1152yn) {
        if (this.f48336b.contains(c1152yn)) {
            return false;
        }
        this.f48336b.add(c1152yn);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f48338d;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : "Both");
        sb.append(" [");
        sb.append(this.f48337c);
        sb.append("] <");
        String string = sb.toString();
        ArrayList arrayList = this.f48336b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            string = string + " " + ((C1152yn) arrayList.get(i2)).f48221aj;
        }
        return string.concat(" >");
    }
}
