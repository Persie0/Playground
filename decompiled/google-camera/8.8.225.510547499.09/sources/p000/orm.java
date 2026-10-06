package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class orm implements Runnable, Comparable, orf, oyf {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a */
    private int f46458a = -1;

    /* JADX INFO: renamed from: b */
    public long f46459b;

    public orm(long j) {
        this.f46459b = j;
    }

    @Override // p000.oyf
    /* JADX INFO: renamed from: b */
    public final int mo18960b() {
        return this.f46458a;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized int m18961c(long j, orn ornVar, oro oroVar) {
        if (this._heap == orp.f46464a) {
            return 2;
        }
        synchronized (ornVar) {
            orm ormVar = (orm) ornVar.m19169b();
            if (oroVar.m18967t()) {
                return 1;
            }
            if (ormVar == null) {
                ornVar.f46460a = j;
            } else {
                long j2 = ormVar.f46459b;
                if (j2 - j < 0) {
                    j = j2;
                }
                long j3 = ornVar.f46460a;
                if (j - j3 > 0) {
                    ornVar.f46460a = j;
                } else {
                    j = j3;
                }
            }
            if (this.f46459b - j < 0) {
                this.f46459b = j;
            }
            boolean z = oqu.f46432a;
            mo18963e(ornVar);
            oyf[] oyfVarArr = ornVar.f46813b;
            if (oyfVarArr == null) {
                oyfVarArr = new oyf[4];
                ornVar.f46813b = oyfVarArr;
            } else if (ornVar.m19168a() >= oyfVarArr.length) {
                int iM19168a = ornVar.m19168a();
                Object[] objArrCopyOf = Arrays.copyOf(oyfVarArr, iM19168a + iM19168a);
                objArrCopyOf.getClass();
                oyfVarArr = (oyf[]) objArrCopyOf;
                ornVar.f46813b = oyfVarArr;
            }
            int iM19168a2 = ornVar.m19168a();
            ornVar.m19172e(iM19168a2 + 1);
            oyfVarArr[iM19168a2] = this;
            mo18964f(iM19168a2);
            ornVar.m19173f(iM19168a2);
            return 0;
        }
    }

    @Override // p000.orf
    /* JADX INFO: renamed from: cF */
    public final synchronized void mo18947cF() {
        Object obj = this._heap;
        if (obj == orp.f46464a) {
            return;
        }
        orn ornVar = obj instanceof orn ? (orn) obj : null;
        if (ornVar != null) {
            synchronized (ornVar) {
                if (mo18962d() != null) {
                    int iMo18960b = mo18960b();
                    boolean z = oqu.f46432a;
                    ornVar.m19171d(iMo18960b);
                }
            }
        }
        this._heap = orp.f46464a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        orm ormVar = (orm) obj;
        ormVar.getClass();
        long j = this.f46459b - ormVar.f46459b;
        if (j > 0) {
            return 1;
        }
        return j >= 0 ? 0 : -1;
    }

    @Override // p000.oyf
    /* JADX INFO: renamed from: d */
    public final oye mo18962d() {
        Object obj = this._heap;
        if (obj instanceof oye) {
            return (oye) obj;
        }
        return null;
    }

    @Override // p000.oyf
    /* JADX INFO: renamed from: e */
    public final void mo18963e(oye oyeVar) {
        if (this._heap == orp.f46464a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = oyeVar;
    }

    @Override // p000.oyf
    /* JADX INFO: renamed from: f */
    public final void mo18964f(int i) {
        this.f46458a = i;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f46459b + "]";
    }
}
