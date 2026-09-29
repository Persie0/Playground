package androidx.gridlayout.widget;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.gridlayout.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1006b {

    /* JADX INFO: renamed from: a */
    public final GridLayout.C0997i[] f6510a;

    /* JADX INFO: renamed from: b */
    public int f6511b;

    /* JADX INFO: renamed from: c */
    public final GridLayout.C0997i[][] f6512c;

    /* JADX INFO: renamed from: d */
    public final int[] f6513d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ GridLayout.C0998j f6514e;

    public C1006b(GridLayout.C0998j c0998j, GridLayout.C0997i[] c0997iArr) {
        this.f6514e = c0998j;
        int length = c0997iArr.length;
        this.f6510a = new GridLayout.C0997i[length];
        this.f6511b = length - 1;
        int iM3869f = c0998j.m3869f() + 1;
        GridLayout.C0997i[][] c0997iArr2 = new GridLayout.C0997i[iM3869f][];
        int[] iArr = new int[iM3869f];
        for (GridLayout.C0997i c0997i : c0997iArr) {
            int i10 = c0997i.f6464a.f6494a;
            iArr[i10] = iArr[i10] + 1;
        }
        for (int i11 = 0; i11 < iM3869f; i11++) {
            c0997iArr2[i11] = new GridLayout.C0997i[iArr[i11]];
        }
        Arrays.fill(iArr, 0);
        for (GridLayout.C0997i c0997i2 : c0997iArr) {
            int i12 = c0997i2.f6464a.f6494a;
            GridLayout.C0997i[] c0997iArr3 = c0997iArr2[i12];
            int i13 = iArr[i12];
            iArr[i12] = i13 + 1;
            c0997iArr3[i13] = c0997i2;
        }
        this.f6512c = c0997iArr2;
        this.f6513d = new int[this.f6514e.m3869f() + 1];
    }

    /* JADX INFO: renamed from: a */
    public final void m3882a(int i10) {
        int[] iArr = this.f6513d;
        if (iArr[i10] != 0) {
            return;
        }
        iArr[i10] = 1;
        for (GridLayout.C0997i c0997i : this.f6512c[i10]) {
            m3882a(c0997i.f6464a.f6495b);
            int i11 = this.f6511b;
            this.f6511b = i11 - 1;
            this.f6510a[i11] = c0997i;
        }
        iArr[i10] = 2;
    }
}
