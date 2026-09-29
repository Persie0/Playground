package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.AbstractC1109b0;
import java.util.List;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: androidx.recyclerview.widget.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1170u<T, VH extends RecyclerView.AbstractC1109b0> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: d */
    public final C1146d<T> f7471d;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.u$a */
    public class a implements C1146d.b<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.C1146d.b
        /* JADX INFO: renamed from: a */
        public final void mo4443a() {
            AbstractC1170u.this.getClass();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public AbstractC1170u(C1162m.e<T> eVar) {
        a aVar = new a();
        C1142b c1142b = new C1142b(this);
        C1144c.a aVar2 = new C1144c.a(eVar);
        if (aVar2.f7225a == null) {
            synchronized (C1144c.a.f7223b) {
                if (C1144c.a.f7224c == null) {
                    C1144c.a.f7224c = Executors.newFixedThreadPool(2);
                }
            }
            aVar2.f7225a = C1144c.a.f7224c;
        }
        C1146d<T> c1146d = new C1146d<>(c1142b, new C1144c(aVar2.f7225a, eVar));
        this.f7471d = c1146d;
        c1146d.f7231d.add(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e */
    public final int mo4226e() {
        return this.f7471d.f7233f.size();
    }

    /* JADX INFO: renamed from: p */
    public final T m4528p(int i10) {
        return this.f7471d.f7233f.get(i10);
    }

    /* JADX INFO: renamed from: q */
    public final void m4529q(List<T> list) {
        this.f7471d.m4439b(list, null);
    }
}
