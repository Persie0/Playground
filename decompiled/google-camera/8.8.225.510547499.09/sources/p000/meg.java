package p000;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class meg implements Iterable {

    /* JADX INFO: renamed from: a */
    public final List f40170a;

    /* JADX INFO: renamed from: b */
    private final List f40171b;

    public meg() {
        this.f40170a = new ArrayList();
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m16335a() {
        return this.f40170a.size();
    }

    /* JADX INFO: renamed from: b */
    public final PointF m16336b(int i) {
        return (PointF) this.f40170a.get(i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof meg)) {
            return false;
        }
        meg megVar = (meg) obj;
        int iM16335a = m16335a();
        if (megVar.m16335a() != iM16335a) {
            return false;
        }
        if (megVar.m16335a() == 0 && iM16335a == 0) {
            return true;
        }
        PointF pointF = (PointF) this.f40170a.get(0);
        int i = 0;
        while (true) {
            if (i >= megVar.m16335a()) {
                i = -1;
                break;
            }
            if (kxk.m15031x(pointF, megVar.m16336b(i))) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        for (int i2 = 0; i2 < iM16335a; i2++) {
            if (!kxk.m15031x(m16336b(i2), megVar.m16336b((i + i2) % iM16335a))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40170a.toArray());
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f40171b.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Polygon(");
        for (int i = 0; i < this.f40170a.size(); i++) {
            PointF pointF = (PointF) this.f40170a.get(i);
            sb.append("[");
            sb.append(pointF.x);
            sb.append(",");
            sb.append(pointF.y);
            sb.append("]");
            if (i < this.f40170a.size() - 1) {
                sb.append(" ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public meg(float... fArr) {
        ArrayList arrayList = new ArrayList();
        this.f40170a = arrayList;
        this.f40171b = Collections.unmodifiableList(arrayList);
        lku.m15670x(true, "must be even number of coordinates");
        while (this.f40170a.size() < 4) {
            this.f40170a.add(new PointF());
        }
        if (this.f40170a.size() > 4) {
            List list = this.f40170a;
            list.subList(0, list.size() - 4).clear();
        }
        for (int i = 0; i < 8; i += 2) {
            ((PointF) this.f40170a.get(i >> 1)).set(fArr[i], fArr[i + 1]);
        }
    }
}
