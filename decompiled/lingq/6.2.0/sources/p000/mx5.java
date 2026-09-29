package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class mx5 implements h57, tp3 {

    /* JADX INFO: renamed from: a */
    public final Path f51992a = new Path();

    /* JADX INFO: renamed from: b */
    public final Path f51993b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f51994c = new Path();

    /* JADX INFO: renamed from: d */
    public final ArrayList f51995d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final kx5 f51996e;

    public mx5(kx5 kx5Var) {
        this.f51996e = kx5Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m17081a(Path.Op op) {
        Path path = this.f51993b;
        path.reset();
        Path path2 = this.f51992a;
        path2.reset();
        ArrayList arrayList = this.f51995d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            h57 h57Var = (h57) arrayList.get(size);
            if (h57Var instanceof uk1) {
                uk1 uk1Var = (uk1) h57Var;
                ArrayList arrayList2 = (ArrayList) uk1Var.m22764e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathMo9831g = ((h57) arrayList2.get(size2)).mo9831g();
                    Matrix matrixM14358e = uk1Var.f64006d;
                    j9a j9aVar = uk1Var.f64014l;
                    if (j9aVar != null) {
                        matrixM14358e = j9aVar.m14358e();
                    } else {
                        matrixM14358e.reset();
                    }
                    pathMo9831g.transform(matrixM14358e);
                    path.addPath(pathMo9831g);
                }
            } else {
                path.addPath(h57Var.mo9831g());
            }
        }
        int i = 0;
        h57 h57Var2 = (h57) arrayList.get(0);
        if (h57Var2 instanceof uk1) {
            uk1 uk1Var2 = (uk1) h57Var2;
            List listM22764e = uk1Var2.m22764e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listM22764e;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathMo9831g2 = ((h57) arrayList3.get(i)).mo9831g();
                Matrix matrixM14358e2 = uk1Var2.f64006d;
                j9a j9aVar2 = uk1Var2.f64014l;
                if (j9aVar2 != null) {
                    matrixM14358e2 = j9aVar2.m14358e();
                } else {
                    matrixM14358e2.reset();
                }
                pathMo9831g2.transform(matrixM14358e2);
                path2.addPath(pathMo9831g2);
                i++;
            }
        } else {
            path2.set(h57Var2.mo9831g());
        }
        this.f51994c.op(path2, path, op);
    }

    @Override // p000.qk1
    /* JADX INFO: renamed from: b */
    public final void mo9828b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f51995d;
            if (i >= arrayList.size()) {
                return;
            }
            ((h57) arrayList.get(i)).mo9828b(list, list2);
            i++;
        }
    }

    @Override // p000.tp3
    /* JADX INFO: renamed from: e */
    public final void mo14919e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            qk1 qk1Var = (qk1) listIterator.previous();
            if (qk1Var instanceof h57) {
                this.f51995d.add((h57) qk1Var);
                listIterator.remove();
            }
        }
    }

    @Override // p000.h57
    /* JADX INFO: renamed from: g */
    public final Path mo9831g() {
        Path path = this.f51994c;
        path.reset();
        kx5 kx5Var = this.f51996e;
        if (!kx5Var.f48543b) {
            int i = lx5.f50241a[kx5Var.f48542a.ordinal()];
            if (i == 1) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.f51995d;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((h57) arrayList.get(i2)).mo9831g());
                    i2++;
                }
            } else {
                if (i == 2) {
                    m17081a(Path.Op.UNION);
                    return path;
                }
                if (i == 3) {
                    m17081a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (i == 4) {
                    m17081a(Path.Op.INTERSECT);
                    return path;
                }
                if (i == 5) {
                    m17081a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
