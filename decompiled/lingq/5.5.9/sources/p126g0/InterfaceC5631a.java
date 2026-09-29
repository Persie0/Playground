package p126g0;

import ae.C0062b;
import dm.C5207g;
import java.util.Collection;
import java.util.List;
import p100em.InterfaceC5429a;
import tl.AbstractC9313a;

/* JADX INFO: renamed from: g0.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5631a<E> extends List<E>, Collection, InterfaceC5429a {

    /* JADX INFO: renamed from: g0.a$a */
    public static final class a<E> extends AbstractC9313a<E> implements InterfaceC5631a<E> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC5631a<E> f34480a;

        /* JADX INFO: renamed from: b */
        public final int f34481b;

        /* JADX INFO: renamed from: c */
        public final int f34482c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC5631a<? extends E> interfaceC5631a, int i10, int i11) {
            C5207g.m11111f(interfaceC5631a, "source");
            this.f34480a = interfaceC5631a;
            this.f34481b = i10;
            C0062b.m351h0(i10, i11, interfaceC5631a.size());
            this.f34482c = i11 - i10;
        }

        @Override // kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: a */
        public final int mo1847a() {
            return this.f34482c;
        }

        @Override // java.util.List
        public final E get(int i10) {
            C0062b.m342e0(i10, this.f34482c);
            return this.f34480a.get(this.f34481b + i10);
        }

        @Override // tl.AbstractC9313a, java.util.List
        public final List subList(int i10, int i11) {
            C0062b.m351h0(i10, i11, this.f34482c);
            int i12 = this.f34481b;
            return new a(this.f34480a, i10 + i12, i12 + i11);
        }
    }
}
