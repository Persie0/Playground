package al;

import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.Request;
import com.tonyodev.fetch2.fetch.FetchImpl;
import dm.C5207g;
import ge.C5789m;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C6752c;
import p122fl.InterfaceC5585h;

/* JADX INFO: renamed from: al.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C0121h<R> implements InterfaceC5585h<List<? extends Pair<? extends Request, ? extends Error>>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FetchImpl f299a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC5585h f300b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC5585h f301c;

    public C0121h(FetchImpl fetchImpl, InterfaceC5585h interfaceC5585h, C5789m c5789m) {
        this.f299a = fetchImpl;
        this.f300b = interfaceC5585h;
        this.f301c = c5789m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p122fl.InterfaceC5585h
    /* JADX INFO: renamed from: d */
    public final void mo520d(List<? extends Pair<? extends Request, ? extends Error>> list) {
        List<? extends Pair<? extends Request, ? extends Error>> list2 = list;
        C5207g.m11112g(list2, "result");
        boolean z10 = !list2.isEmpty();
        FetchImpl fetchImpl = this.f299a;
        if (!z10) {
            fetchImpl.f32418g.post(new RunnableC0120g(this));
            return;
        }
        Pair pair = (Pair) C6752c.m13423Q(list2);
        if (((Error) pair.f38013b) != Error.NONE) {
            fetchImpl.f32418g.post(new RunnableC0118e(this, pair));
        } else {
            fetchImpl.f32418g.post(new RunnableC0119f(this, pair));
        }
    }
}
