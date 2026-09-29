package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class k4b {

    /* JADX INFO: renamed from: f */
    public static int f46709f;

    /* JADX INFO: renamed from: b */
    public final int f46711b;

    /* JADX INFO: renamed from: c */
    public int f46712c;

    /* JADX INFO: renamed from: a */
    public final ArrayList f46710a = new ArrayList();

    /* JADX INFO: renamed from: d */
    public ArrayList f46713d = null;

    /* JADX INFO: renamed from: e */
    public int f46714e = -1;

    public k4b(int i) {
        int i2 = f46709f;
        f46709f = i2 + 1;
        this.f46711b = i2;
        this.f46712c = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m14844a(vj1 vj1Var) {
        ArrayList arrayList = this.f46710a;
        if (arrayList.contains(vj1Var)) {
            return false;
        }
        arrayList.add(vj1Var);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m14845b(ArrayList arrayList) {
        int size = this.f46710a.size();
        if (this.f46714e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                k4b k4bVar = (k4b) arrayList.get(i);
                if (this.f46714e == k4bVar.f46711b) {
                    m14849f(this.f46712c, k4bVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m14846c() {
        return this.f46711b;
    }

    /* JADX INFO: renamed from: d */
    public final int m14847d() {
        return this.f46712c;
    }

    /* JADX INFO: renamed from: e */
    public final int m14848e(gd5 gd5Var, int i) {
        int iM12484n;
        int iM12484n2;
        ArrayList arrayList = this.f46710a;
        if (arrayList.size() == 0) {
            return 0;
        }
        wj1 wj1Var = (wj1) ((vj1) arrayList.get(0)).f65452U;
        gd5Var.m12503t();
        wj1Var.mo10149b(gd5Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((vj1) arrayList.get(i2)).mo10149b(gd5Var, false);
        }
        if (i == 0 && wj1Var.f66904C0 > 0) {
            o5d.m17809a(wj1Var, gd5Var, arrayList, 0);
        }
        if (i == 1 && wj1Var.f66905D0 > 0) {
            o5d.m17809a(wj1Var, gd5Var, arrayList, 1);
        }
        try {
            gd5Var.m12499p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f46713d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            vj1 vj1Var = (vj1) arrayList.get(i3);
            nid nidVar = new nid();
            new WeakReference(vj1Var);
            gd5.m12484n(vj1Var.f65440I);
            gd5.m12484n(vj1Var.f65441J);
            gd5.m12484n(vj1Var.f65442K);
            gd5.m12484n(vj1Var.f65443L);
            gd5.m12484n(vj1Var.f65444M);
            this.f46713d.add(nidVar);
        }
        if (i == 0) {
            iM12484n = gd5.m12484n(wj1Var.f65440I);
            iM12484n2 = gd5.m12484n(wj1Var.f65442K);
            gd5Var.m12503t();
        } else {
            iM12484n = gd5.m12484n(wj1Var.f65441J);
            iM12484n2 = gd5.m12484n(wj1Var.f65443L);
            gd5Var.m12503t();
        }
        return iM12484n2 - iM12484n;
    }

    /* JADX INFO: renamed from: f */
    public final void m14849f(int i, k4b k4bVar) {
        int i2 = k4bVar.f46711b;
        for (vj1 vj1Var : this.f46710a) {
            k4bVar.m14844a(vj1Var);
            if (i == 0) {
                vj1Var.f65493r0 = i2;
            } else {
                vj1Var.f65495s0 = i2;
            }
        }
        this.f46714e = i2;
    }

    /* JADX INFO: renamed from: g */
    public final void m14850g() {
        this.f46712c = 2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f46712c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strM24123s = wq1.m24123s(sb, this.f46711b, "] <");
        for (vj1 vj1Var : this.f46710a) {
            StringBuilder sbM22999v = ux5.m22999v(strM24123s, " ");
            sbM22999v.append(vj1Var.f65477j0);
            strM24123s = sbM22999v.toString();
        }
        return strM24123s.concat(" >");
    }
}
