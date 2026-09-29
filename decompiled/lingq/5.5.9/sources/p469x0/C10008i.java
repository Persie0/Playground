package p469x0;

import androidx.activity.result.C0204c;
import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: x0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10008i extends AbstractC10010k implements Iterable<AbstractC10010k>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final String f50933a;

    /* JADX INFO: renamed from: b */
    public final float f50934b;

    /* JADX INFO: renamed from: c */
    public final float f50935c;

    /* JADX INFO: renamed from: d */
    public final float f50936d;

    /* JADX INFO: renamed from: e */
    public final float f50937e;

    /* JADX INFO: renamed from: f */
    public final float f50938f;

    /* JADX INFO: renamed from: g */
    public final float f50939g;

    /* JADX INFO: renamed from: h */
    public final float f50940h;

    /* JADX INFO: renamed from: i */
    public final List<AbstractC10003d> f50941i;

    /* JADX INFO: renamed from: j */
    public final List<AbstractC10010k> f50942j;

    /* JADX INFO: renamed from: x0.i$a */
    public static final class a implements Iterator<AbstractC10010k>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public final Iterator<AbstractC10010k> f50943a;

        public a(C10008i c10008i) {
            this.f50943a = c10008i.f50942j.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f50943a.hasNext();
        }

        @Override // java.util.Iterator
        public final AbstractC10010k next() {
            return this.f50943a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10008i() {
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, C10009j.f50944a, EmptyList.f38032a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10008i(String str, float f3, float f10, float f11, float f12, float f13, float f14, float f15, List<? extends AbstractC10003d> list, List<? extends AbstractC10010k> list2) {
        C5207g.m11111f(str, "name");
        C5207g.m11111f(list, "clipPathData");
        C5207g.m11111f(list2, "children");
        this.f50933a = str;
        this.f50934b = f3;
        this.f50935c = f10;
        this.f50936d = f11;
        this.f50937e = f12;
        this.f50938f = f13;
        this.f50939g = f14;
        this.f50940h = f15;
        this.f50941i = list;
        this.f50942j = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C10008i)) {
            C10008i c10008i = (C10008i) obj;
            if (!C5207g.m11106a(this.f50933a, c10008i.f50933a)) {
                return false;
            }
            if (!(this.f50934b == c10008i.f50934b)) {
                return false;
            }
            if (!(this.f50935c == c10008i.f50935c)) {
                return false;
            }
            if (!(this.f50936d == c10008i.f50936d)) {
                return false;
            }
            if (!(this.f50937e == c10008i.f50937e)) {
                return false;
            }
            if (!(this.f50938f == c10008i.f50938f)) {
                return false;
            }
            if (this.f50939g == c10008i.f50939g) {
                return ((this.f50940h > c10008i.f50940h ? 1 : (this.f50940h == c10008i.f50940h ? 0 : -1)) == 0) && C5207g.m11106a(this.f50941i, c10008i.f50941i) && C5207g.m11106a(this.f50942j, c10008i.f50942j);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50942j.hashCode() + C0204c.m848g(this.f50941i, C0204c.m846e(this.f50940h, C0204c.m846e(this.f50939g, C0204c.m846e(this.f50938f, C0204c.m846e(this.f50937e, C0204c.m846e(this.f50936d, C0204c.m846e(this.f50935c, C0204c.m846e(this.f50934b, this.f50933a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<AbstractC10010k> iterator() {
        return new a(this);
    }
}
