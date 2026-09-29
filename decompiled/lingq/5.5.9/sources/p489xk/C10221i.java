package p489xk;

import al.C0122i;
import com.tonyodev.fetch2.PrioritySort;
import com.tonyodev.fetch2.database.DownloadInfo;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import p122fl.InterfaceC5587j;
import sl.C9072e;

/* JADX INFO: renamed from: xk.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C10221i implements InterfaceC10219g<DownloadInfo> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5587j f51638a;

    /* JADX INFO: renamed from: b */
    public final Object f51639b = new Object();

    /* JADX INFO: renamed from: c */
    public final InterfaceC10219g<DownloadInfo> f51640c;

    public C10221i(InterfaceC10219g<DownloadInfo> interfaceC10219g) {
        this.f51640c = interfaceC10219g;
        this.f51638a = interfaceC10219g.mo10614P();
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: K0 */
    public final List<DownloadInfo> mo10613K0(int i10) {
        List<T> listMo10613K0;
        synchronized (this.f51639b) {
            listMo10613K0 = this.f51640c.mo10613K0(i10);
        }
        return listMo10613K0;
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: P */
    public final InterfaceC5587j mo10614P() {
        return this.f51638a;
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: T */
    public final void mo10615T(DownloadInfo downloadInfo) {
        C5207g.m11112g(downloadInfo, "downloadInfo");
        synchronized (this.f51639b) {
            this.f51640c.mo10615T(downloadInfo);
            C9072e c9072e = C9072e.f47360a;
        }
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: Y */
    public final void mo10616Y(DownloadInfo downloadInfo) {
        C5207g.m11112g(downloadInfo, "downloadInfo");
        synchronized (this.f51639b) {
            try {
                this.f51640c.mo10616Y(downloadInfo);
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: b0 */
    public final void mo10619b0(C0122i.b.a aVar) {
        synchronized (this.f51639b) {
            this.f51640c.mo10619b0(aVar);
            C9072e c9072e = C9072e.f47360a;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f51639b) {
            this.f51640c.close();
            C9072e c9072e = C9072e.f47360a;
        }
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: e */
    public final DownloadInfo mo10620e() {
        return this.f51640c.mo10620e();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: e0 */
    public final void mo10621e0(ArrayList arrayList) {
        synchronized (this.f51639b) {
            this.f51640c.mo10621e0(arrayList);
            C9072e c9072e = C9072e.f47360a;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: f0 */
    public final List<DownloadInfo> mo10622f0(PrioritySort prioritySort) {
        List<T> listMo10622f0;
        synchronized (this.f51639b) {
            try {
                listMo10622f0 = this.f51640c.mo10622f0(prioritySort);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listMo10622f0;
    }

    @Override // p489xk.InterfaceC10219g
    public final DownloadInfo get(int i10) {
        DownloadInfo downloadInfo;
        synchronized (this.f51639b) {
            downloadInfo = this.f51640c.get(i10);
        }
        return downloadInfo;
    }

    @Override // p489xk.InterfaceC10219g
    public final List<DownloadInfo> get() {
        List<T> list;
        synchronized (this.f51639b) {
            list = this.f51640c.get();
        }
        return list;
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: h1 */
    public final void mo10623h1(List<? extends DownloadInfo> list) {
        synchronized (this.f51639b) {
            this.f51640c.mo10623h1(list);
            C9072e c9072e = C9072e.f47360a;
        }
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: i0 */
    public final Pair<DownloadInfo, Boolean> mo10624i0(DownloadInfo downloadInfo) {
        Pair<T, Boolean> pairMo10624i0;
        synchronized (this.f51639b) {
            try {
                pairMo10624i0 = this.f51640c.mo10624i0(downloadInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pairMo10624i0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: i1 */
    public final DownloadInfo mo10625i1(String str) {
        DownloadInfo downloadInfoMo10625i1;
        C5207g.m11112g(str, "file");
        synchronized (this.f51639b) {
            downloadInfoMo10625i1 = this.f51640c.mo10625i1(str);
        }
        return downloadInfoMo10625i1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: j */
    public final InterfaceC10219g.a<DownloadInfo> mo10626j() {
        InterfaceC10219g.a<T> aVarMo10626j;
        synchronized (this.f51639b) {
            try {
                aVarMo10626j = this.f51640c.mo10626j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVarMo10626j;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: m */
    public final void mo10627m(DownloadInfo downloadInfo) {
        synchronized (this.f51639b) {
            this.f51640c.mo10627m(downloadInfo);
            C9072e c9072e = C9072e.f47360a;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: n */
    public final void mo10628n() {
        synchronized (this.f51639b) {
            try {
                this.f51640c.mo10628n();
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: v1 */
    public final long mo10629v1(boolean z10) {
        long jMo10629v1;
        synchronized (this.f51639b) {
            try {
                jMo10629v1 = this.f51640c.mo10629v1(z10);
            } finally {
            }
        }
        return jMo10629v1;
    }
}
