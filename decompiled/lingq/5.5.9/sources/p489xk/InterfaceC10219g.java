package p489xk;

import al.C0122i;
import com.tonyodev.fetch2.PrioritySort;
import com.tonyodev.fetch2.database.DownloadInfo;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import p122fl.InterfaceC5587j;

/* JADX INFO: renamed from: xk.g */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC10219g<T extends DownloadInfo> extends Closeable {

    /* JADX INFO: renamed from: xk.g$a */
    public interface a<T extends DownloadInfo> {
        /* JADX INFO: renamed from: a */
        void mo522a(T t10);
    }

    /* JADX INFO: renamed from: K0 */
    List<T> mo10613K0(int i10);

    /* JADX INFO: renamed from: P */
    InterfaceC5587j mo10614P();

    /* JADX INFO: renamed from: T */
    void mo10615T(T t10);

    /* JADX INFO: renamed from: Y */
    void mo10616Y(T t10);

    /* JADX INFO: renamed from: b0 */
    void mo10619b0(C0122i.b.a aVar);

    /* JADX INFO: renamed from: e */
    T mo10620e();

    /* JADX INFO: renamed from: e0 */
    void mo10621e0(ArrayList arrayList);

    /* JADX INFO: renamed from: f0 */
    List<T> mo10622f0(PrioritySort prioritySort);

    T get(int i10);

    List<T> get();

    /* JADX INFO: renamed from: h1 */
    void mo10623h1(List<? extends T> list);

    /* JADX INFO: renamed from: i0 */
    Pair<T, Boolean> mo10624i0(T t10);

    /* JADX INFO: renamed from: i1 */
    T mo10625i1(String str);

    /* JADX INFO: renamed from: j */
    a<T> mo10626j();

    /* JADX INFO: renamed from: m */
    void mo10627m(T t10);

    /* JADX INFO: renamed from: n */
    void mo10628n();

    /* JADX INFO: renamed from: v1 */
    long mo10629v1(boolean z10);
}
