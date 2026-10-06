package p000;

import android.support.v7.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: renamed from: kr */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0778kr {

    /* JADX INFO: renamed from: a */
    int f36983a;

    /* JADX INFO: renamed from: b */
    int f36984b;

    /* JADX INFO: renamed from: c */
    int[] f36985c;

    /* JADX INFO: renamed from: d */
    int f36986d;

    /* JADX INFO: renamed from: a */
    public final void m14735a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f36986d;
        int i4 = i3 + i3;
        int[] iArr = this.f36985c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f36985c = iArr2;
            Arrays.fill(iArr2, -1);
        } else {
            int length = iArr.length;
            if (i4 >= length) {
                int[] iArr3 = new int[i4 + i4];
                this.f36985c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, length);
            }
        }
        int[] iArr4 = this.f36985c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f36986d++;
    }

    /* JADX INFO: renamed from: b */
    final void m14736b() {
        int[] iArr = this.f36985c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f36986d = 0;
    }

    /* JADX INFO: renamed from: c */
    final void m14737c(RecyclerView recyclerView, boolean z) {
        this.f36986d = 0;
        int[] iArr = this.f36985c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0812ly abstractC0812ly = recyclerView.f1124n;
        if (recyclerView.f1123m == null || abstractC0812ly == null || !abstractC0812ly.f39555v) {
            return;
        }
        if (z) {
            if (!recyclerView.f1082T.m13606m()) {
                abstractC0812ly.mo1169ac(recyclerView.f1123m.mo1762a(), this);
            }
        } else if (!recyclerView.m1238al()) {
            abstractC0812ly.mo1168ab(this.f36983a, this.f36984b, recyclerView.f1075M, this);
        }
        int i = this.f36986d;
        if (i > abstractC0812ly.f39556w) {
            abstractC0812ly.f39556w = i;
            abstractC0812ly.f39557x = z;
            recyclerView.f1116f.m16325n();
        }
    }

    /* JADX INFO: renamed from: d */
    final boolean m14738d(int i) {
        if (this.f36985c != null) {
            int i2 = this.f36986d;
            int i3 = i2 + i2;
            for (int i4 = 0; i4 < i3; i4 += 2) {
                if (this.f36985c[i4] == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
