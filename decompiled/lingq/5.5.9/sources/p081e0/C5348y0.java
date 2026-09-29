package p081e0;

import androidx.compose.runtime.snapshots.AbstractC0497b;
import androidx.compose.runtime.snapshots.SnapshotKt;
import dm.C5207g;
import p267n0.AbstractC7691v;
import p267n0.InterfaceC7680k;
import p267n0.InterfaceC7690u;
import sl.C9072e;

/* JADX INFO: renamed from: e0.y0 */
/* JADX INFO: loaded from: classes.dex */
public class C5348y0<T> implements InterfaceC7690u, InterfaceC7680k<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5350z0<T> f33648a;

    /* JADX INFO: renamed from: b */
    public a<T> f33649b;

    /* JADX INFO: renamed from: e0.y0$a */
    public static final class a<T> extends AbstractC7691v {

        /* JADX INFO: renamed from: c */
        public T f33650c;

        public a(T t10) {
            this.f33650c = t10;
        }

        @Override // p267n0.AbstractC7691v
        /* JADX INFO: renamed from: a */
        public final void mo1700a(AbstractC7691v abstractC7691v) {
            C5207g.m11111f(abstractC7691v, "value");
            this.f33650c = ((a) abstractC7691v).f33650c;
        }

        @Override // p267n0.AbstractC7691v
        /* JADX INFO: renamed from: b */
        public final AbstractC7691v mo1701b() {
            return new a(this.f33650c);
        }
    }

    public C5348y0(T t10, InterfaceC5350z0<T> interfaceC5350z0) {
        C5207g.m11111f(interfaceC5350z0, "policy");
        this.f33648a = interfaceC5350z0;
        this.f33649b = new a<>(t10);
    }

    @Override // p267n0.InterfaceC7690u
    /* JADX INFO: renamed from: C */
    public final AbstractC7691v mo11474C(AbstractC7691v abstractC7691v, AbstractC7691v abstractC7691v2, AbstractC7691v abstractC7691v3) {
        if (this.f33648a.mo11451a(((a) abstractC7691v2).f33650c, ((a) abstractC7691v3).f33650c)) {
            return abstractC7691v2;
        }
        return null;
    }

    @Override // p267n0.InterfaceC7680k
    /* JADX INFO: renamed from: a */
    public final InterfaceC5350z0<T> mo11475a() {
        return this.f33648a;
    }

    @Override // p081e0.InterfaceC5301c1
    public final T getValue() {
        return ((a) SnapshotKt.m1900s(this.f33649b, this)).f33650c;
    }

    @Override // p267n0.InterfaceC7690u
    /* JADX INFO: renamed from: l */
    public final AbstractC7691v mo1698l() {
        return this.f33649b;
    }

    @Override // p267n0.InterfaceC7690u
    /* JADX INFO: renamed from: q */
    public final void mo1699q(AbstractC7691v abstractC7691v) {
        this.f33649b = (a) abstractC7691v;
    }

    @Override // p081e0.InterfaceC5312g0
    public final void setValue(T t10) {
        AbstractC0497b abstractC0497bM1891j;
        a aVar = (a) SnapshotKt.m1889h(this.f33649b);
        if (this.f33648a.mo11451a(aVar.f33650c, t10)) {
            return;
        }
        a<T> aVar2 = this.f33649b;
        synchronized (SnapshotKt.f3262c) {
            abstractC0497bM1891j = SnapshotKt.m1891j();
            ((a) SnapshotKt.m1896o(aVar2, this, abstractC0497bM1891j, aVar)).f33650c = t10;
            C9072e c9072e = C9072e.f47360a;
        }
        SnapshotKt.m1895n(abstractC0497bM1891j, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((a) SnapshotKt.m1889h(this.f33649b)).f33650c + ")@" + hashCode();
    }
}
