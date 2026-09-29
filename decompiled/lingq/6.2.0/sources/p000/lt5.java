package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lt5 {

    /* JADX INFO: renamed from: a */
    public final int f50100a;

    /* JADX INFO: renamed from: b */
    public final int f50101b;

    /* JADX INFO: renamed from: c */
    public final List f50102c;

    /* JADX INFO: renamed from: d */
    public final long f50103d;

    /* JADX INFO: renamed from: e */
    public final Object f50104e;

    /* JADX INFO: renamed from: f */
    public final fc0 f50105f;

    /* JADX INFO: renamed from: g */
    public final LayoutDirection f50106g;

    /* JADX INFO: renamed from: h */
    public final boolean f50107h;

    /* JADX INFO: renamed from: i */
    public final boolean f50108i;

    /* JADX INFO: renamed from: j */
    public final int f50109j;

    /* JADX INFO: renamed from: k */
    public final int[] f50110k;

    /* JADX INFO: renamed from: l */
    public int f50111l;

    /* JADX INFO: renamed from: m */
    public int f50112m;

    public lt5(int i, int i2, List list, long j, Object obj, Orientation orientation, fc0 fc0Var, LayoutDirection layoutDirection, boolean z) {
        this.f50100a = i;
        this.f50101b = i2;
        this.f50102c = list;
        this.f50103d = j;
        this.f50104e = obj;
        this.f50105f = fc0Var;
        this.f50106g = layoutDirection;
        this.f50107h = z;
        this.f50108i = orientation == Orientation.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            l87 l87Var = (l87) list.get(i3);
            iMax = Math.max(iMax, !this.f50108i ? l87Var.f49302b : l87Var.f49301a);
        }
        this.f50109j = iMax;
        this.f50110k = new int[this.f50102c.size() * 2];
        this.f50112m = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public final void m16540a(int i) {
        this.f50111l += i;
        int[] iArr = this.f50110k;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.f50108i;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16541b(int i, int i2, int i3) {
        int i4;
        this.f50111l = i;
        boolean z = this.f50108i;
        this.f50112m = z ? i3 : i2;
        List list = this.f50102c;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            l87 l87Var = (l87) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.f50110k;
            if (z) {
                iArr[i6] = Math.round((1.0f + (this.f50106g != LayoutDirection.Ltr ? 0.0f * (-1.0f) : 0.0f)) * ((i2 - l87Var.f49301a) / 2.0f));
                iArr[i6 + 1] = i;
                i4 = l87Var.f49302b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                fc0 fc0Var = this.f50105f;
                if (fc0Var == null) {
                    throw wq1.m24126v("null verticalAlignment");
                }
                iArr[i7] = fc0Var.m11762a(l87Var.f49302b, i3);
                i4 = l87Var.f49301a;
            }
            i += i4;
        }
    }
}
