package ua;

import android.os.SystemClock;
import com.google.android.exoplayer2.C2416m;
import ga.C5735r;
import java.util.Arrays;
import java.util.List;
import p134g8.C5715b;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: ua.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9493b implements InterfaceC9502k {

    /* JADX INFO: renamed from: a */
    public final C5735r f48787a;

    /* JADX INFO: renamed from: b */
    public final int f48788b;

    /* JADX INFO: renamed from: c */
    public final int[] f48789c;

    /* JADX INFO: renamed from: d */
    public final C2416m[] f48790d;

    /* JADX INFO: renamed from: e */
    public final long[] f48791e;

    /* JADX INFO: renamed from: f */
    public int f48792f;

    public AbstractC9493b(C5735r c5735r, int[] iArr) {
        int i10 = 0;
        C10129a.m18992d(iArr.length > 0);
        c5735r.getClass();
        this.f48787a = c5735r;
        int length = iArr.length;
        this.f48788b = length;
        this.f48790d = new C2416m[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f48790d[i11] = c5735r.f34803d[iArr[i11]];
        }
        Arrays.sort(this.f48790d, new C5715b(2));
        this.f48789c = new int[this.f48788b];
        while (true) {
            int i12 = this.f48788b;
            if (i10 >= i12) {
                this.f48791e = new long[i12];
                return;
            } else {
                this.f48789c[i10] = c5735r.m12090a(this.f48790d[i10]);
                i10++;
            }
        }
    }

    @Override // ua.InterfaceC9505n
    /* JADX INFO: renamed from: a */
    public final C5735r mo7339a() {
        return this.f48787a;
    }

    @Override // ua.InterfaceC9502k
    /* JADX INFO: renamed from: d */
    public final boolean mo7342d(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zMo7343e = mo7343e(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f48788b && !zMo7343e) {
            zMo7343e = (i11 == i10 || mo7343e(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zMo7343e) {
            return false;
        }
        long[] jArr = this.f48791e;
        long j11 = jArr[i10];
        int i12 = C10134c0.f51354a;
        long j12 = jElapsedRealtime + j10;
        if (((j10 ^ j12) & (jElapsedRealtime ^ j12)) < 0) {
            j12 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j11, j12);
        return true;
    }

    @Override // ua.InterfaceC9502k
    /* JADX INFO: renamed from: e */
    public final boolean mo7343e(int i10, long j10) {
        return this.f48791e[i10] > j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC9493b abstractC9493b = (AbstractC9493b) obj;
        return this.f48787a == abstractC9493b.f48787a && Arrays.equals(this.f48789c, abstractC9493b.f48789c);
    }

    @Override // ua.InterfaceC9502k
    /* JADX INFO: renamed from: f */
    public void mo7344f() {
    }

    @Override // ua.InterfaceC9505n
    /* JADX INFO: renamed from: h */
    public final C2416m mo7346h(int i10) {
        return this.f48790d[i10];
    }

    public final int hashCode() {
        if (this.f48792f == 0) {
            this.f48792f = Arrays.hashCode(this.f48789c) + (System.identityHashCode(this.f48787a) * 31);
        }
        return this.f48792f;
    }

    @Override // ua.InterfaceC9502k
    /* JADX INFO: renamed from: i */
    public void mo7347i() {
    }

    @Override // ua.InterfaceC9505n
    /* JADX INFO: renamed from: j */
    public final int mo7348j(int i10) {
        return this.f48789c[i10];
    }

    @Override // ua.InterfaceC9502k
    /* JADX INFO: renamed from: k */
    public final int mo7349k() {
        return this.f48789c[mo7340b()];
    }

    @Override // ua.InterfaceC9502k
    /* JADX INFO: renamed from: l */
    public final C2416m mo7350l() {
        return this.f48790d[mo7340b()];
    }

    @Override // ua.InterfaceC9505n
    public final int length() {
        return this.f48789c.length;
    }

    @Override // ua.InterfaceC9502k
    /* JADX INFO: renamed from: n */
    public void mo7352n(float f3) {
    }

    @Override // ua.InterfaceC9502k
    /* JADX INFO: renamed from: s */
    public int mo7357s(List list, long j10) {
        return list.size();
    }

    @Override // ua.InterfaceC9505n
    /* JADX INFO: renamed from: t */
    public final int mo7358t(int i10) {
        for (int i11 = 0; i11 < this.f48788b; i11++) {
            if (this.f48789c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }
}
