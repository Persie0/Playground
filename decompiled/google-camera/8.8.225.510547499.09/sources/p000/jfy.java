package p000;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jfy implements jpj {

    /* JADX INFO: renamed from: a */
    private final jfm f33924a;

    /* JADX INFO: renamed from: b */
    private final int f33925b;

    /* JADX INFO: renamed from: c */
    private final jev f33926c;

    /* JADX INFO: renamed from: d */
    private final long f33927d;

    /* JADX INFO: renamed from: e */
    private final long f33928e;

    public jfy(jfm jfmVar, int i, jev jevVar, long j, long j2) {
        this.f33924a = jfmVar;
        this.f33925b = i;
        this.f33926c = jevVar;
        this.f33927d = j;
        this.f33928e = j2;
    }

    /* JADX INFO: renamed from: b */
    public static jhc m13124b(jfj jfjVar, jgw jgwVar, int i) {
        int[] iArr;
        int[] iArr2;
        jhb jhbVar = jgwVar.f33997n;
        jhc jhcVar = jhbVar == null ? null : jhbVar.f34028d;
        if (jhcVar == null || !jhcVar.f34030b || ((iArr = jhcVar.f34032d) != null ? !jiy.m13280g(iArr, i) : !((iArr2 = jhcVar.f34034f) == null || !jiy.m13280g(iArr2, i))) || jfjVar.f33878j >= jhcVar.f34033e) {
            return null;
        }
        return jhcVar;
    }

    @Override // p000.jpj
    /* JADX INFO: renamed from: a */
    public final void mo8108a(jpp jppVar) {
        jfj jfjVarM13045b;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        int iElapsedRealtime;
        if (this.f33924a.m13049g()) {
            jig jigVar = jif.m13225a().f34121a;
            if ((jigVar == null || jigVar.f34123b) && (jfjVarM13045b = this.f33924a.m13045b(this.f33926c)) != null) {
                Object obj = jfjVarM13045b.f33870b;
                if (obj instanceof jgw) {
                    int i5 = 0;
                    boolean z = this.f33927d > 0;
                    jgw jgwVar = (jgw) obj;
                    int i6 = jgwVar.f33993j;
                    if (jigVar != null) {
                        z &= jigVar.f34124c;
                        int i7 = jigVar.f34125d;
                        int i8 = jigVar.f34126e;
                        i = jigVar.f34122a;
                        if (jgwVar.m13153B() && !jgwVar.m13163m()) {
                            jhc jhcVarM13124b = m13124b(jfjVarM13045b, jgwVar, this.f33925b);
                            if (jhcVarM13124b == null) {
                                return;
                            }
                            boolean z2 = jhcVarM13124b.f34031c && this.f33927d > 0;
                            i8 = jhcVarM13124b.f34033e;
                            z = z2;
                        }
                        i2 = i7;
                        i3 = i8;
                    } else {
                        i = 0;
                        i2 = 5000;
                        i3 = 100;
                    }
                    jfm jfmVar = this.f33924a;
                    if (jppVar.mo13452e()) {
                        i4 = 0;
                    } else if (((jpt) jppVar).f34565c) {
                        i5 = 100;
                        i4 = -1;
                    } else {
                        Exception excMo13449b = jppVar.mo13449b();
                        if (excMo13449b instanceof jdv) {
                            Status status = ((jdv) excMo13449b).f33813a;
                            int i9 = status.f7607g;
                            jcu jcuVar = status.f7610j;
                            if (jcuVar == null) {
                                i5 = i9;
                            } else {
                                i4 = jcuVar.f33755c;
                                i5 = i9;
                            }
                        } else {
                            i5 = 101;
                        }
                        i4 = -1;
                    }
                    if (z) {
                        long j3 = this.f33927d;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f33928e);
                        j = j3;
                        j2 = jCurrentTimeMillis;
                    } else {
                        j = 0;
                        j2 = 0;
                        iElapsedRealtime = -1;
                    }
                    jhx jhxVar = new jhx(this.f33925b, i5, i4, j, j2, null, null, i6, iElapsedRealtime);
                    long j4 = i2;
                    Handler handler = jfmVar.f33903n;
                    handler.sendMessage(handler.obtainMessage(18, new jfz(jhxVar, i, j4, i3)));
                }
            }
        }
    }
}
