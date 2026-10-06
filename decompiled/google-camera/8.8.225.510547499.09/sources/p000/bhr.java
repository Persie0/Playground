package p000;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhr implements bhs, bhp {

    /* JADX INFO: renamed from: a */
    private final Path f3342a = new Path();

    /* JADX INFO: renamed from: b */
    private final Path f3343b = new Path();

    /* JADX INFO: renamed from: c */
    private final Path f3344c = new Path();

    /* JADX INFO: renamed from: d */
    private final List f3345d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final bjr f3346e;

    public bhr(bjr bjrVar) {
        this.f3346e = bjrVar;
    }

    /* JADX INFO: renamed from: a */
    private final void m2478a(Path.Op op) {
        this.f3343b.reset();
        this.f3342a.reset();
        for (int size = this.f3345d.size() - 1; size > 0; size--) {
            bhs bhsVar = (bhs) this.f3345d.get(size);
            if (bhsVar instanceof bhj) {
                bhj bhjVar = (bhj) bhsVar;
                List listM2472j = bhjVar.m2472j();
                for (int size2 = listM2472j.size() - 1; size2 >= 0; size2--) {
                    Path pathMo2471i = ((bhs) listM2472j.get(size2)).mo2471i();
                    pathMo2471i.transform(bhjVar.m2470h());
                    this.f3343b.addPath(pathMo2471i);
                }
            } else {
                this.f3343b.addPath(bhsVar.mo2471i());
            }
        }
        bhs bhsVar2 = (bhs) this.f3345d.get(0);
        if (bhsVar2 instanceof bhj) {
            bhj bhjVar2 = (bhj) bhsVar2;
            List listM2472j2 = bhjVar2.m2472j();
            for (int i = 0; i < listM2472j2.size(); i++) {
                Path pathMo2471i2 = ((bhs) listM2472j2.get(i)).mo2471i();
                pathMo2471i2.transform(bhjVar2.m2470h());
                this.f3342a.addPath(pathMo2471i2);
            }
        } else {
            this.f3342a.set(bhsVar2.mo2471i());
        }
        this.f3344c.op(this.f3342a, this.f3343b, op);
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: e */
    public final void mo2467e(List list, List list2) {
        for (int i = 0; i < this.f3345d.size(); i++) {
            ((bhs) this.f3345d.get(i)).mo2467e(list, list2);
        }
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: g */
    public final String mo2469g() {
        throw null;
    }

    @Override // p000.bhp
    /* JADX INFO: renamed from: h */
    public final void mo2477h(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            bhi bhiVar = (bhi) listIterator.previous();
            if (bhiVar instanceof bhs) {
                this.f3345d.add((bhs) bhiVar);
                listIterator.remove();
            }
        }
    }

    @Override // p000.bhs
    /* JADX INFO: renamed from: i */
    public final Path mo2471i() {
        this.f3344c.reset();
        bjr bjrVar = this.f3346e;
        if (bjrVar.f3511a) {
            return this.f3344c;
        }
        int i = bjrVar.f3512b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                for (int i3 = 0; i3 < this.f3345d.size(); i3++) {
                    this.f3344c.addPath(((bhs) this.f3345d.get(i3)).mo2471i());
                }
                break;
            case 1:
                m2478a(Path.Op.UNION);
                break;
            case 2:
                m2478a(Path.Op.REVERSE_DIFFERENCE);
                break;
            case 3:
                m2478a(Path.Op.INTERSECT);
                break;
            case 4:
                m2478a(Path.Op.XOR);
                break;
        }
        return this.f3344c;
    }
}
