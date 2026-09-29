package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes2.dex */
public final class u6a implements ph7 {

    /* JADX INFO: renamed from: a */
    public final int f63498a;

    /* JADX INFO: renamed from: b */
    public final long f63499b;

    public u6a(int i, long j) {
        this.f63498a = i;
        this.f63499b = j;
    }

    @Override // p000.ph7
    /* JADX INFO: renamed from: f */
    public final long mo12788f(j84 j84Var, long j, LayoutDirection layoutDirection, long j2) {
        int i = (int) (j2 >> 32);
        int iM14324d = ((j84Var.m14324d() - i) / 2) + j84Var.f45185a;
        long j3 = this.f63499b;
        if (iM14324d < 0) {
            int i2 = j84Var.f45185a;
            int i3 = (i + i2) - ((int) (j3 >> 32));
            iM14324d = i2 - (i3 >= 0 ? i3 : 0);
        } else if (iM14324d + i > ((int) (j3 >> 32)) && (iM14324d = j84Var.f45187c - i) < 0) {
            iM14324d = 0;
        }
        int i4 = j84Var.f45186b - ((int) (j2 & 4294967295L));
        int i5 = this.f63498a;
        int i6 = i4 - i5;
        if (i6 < 0) {
            i6 = j84Var.f45188d + i5;
        }
        return (((long) iM14324d) << 32) | (((long) i6) & 4294967295L);
    }
}
