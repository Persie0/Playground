package p000;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class kgb implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47256a;

    /* JADX INFO: renamed from: b */
    public int f47257b = 0;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractSet f47258c;

    public /* synthetic */ kgb(AbstractSet abstractSet, int i) {
        this.f47256a = i;
        this.f47258c = abstractSet;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f47256a;
        AbstractSet abstractSet = this.f47258c;
        switch (i) {
            case 0:
                lgb lgbVar = (lgb) abstractSet;
                return this.f47257b < lgbVar.m16183f() - lgbVar.m16182d();
            default:
                return this.f47257b < ((ynd) ((pb9) abstractSet).f55933b).f70134e;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f47256a;
        AbstractSet abstractSet = this.f47258c;
        switch (i) {
            case 0:
                int i2 = this.f47257b;
                lgb lgbVar = (lgb) abstractSet;
                if (i2 >= lgbVar.m16183f() - lgbVar.m16182d()) {
                    uk9.m22784s();
                    return null;
                }
                mgb mgbVar = lgbVar.f49648b;
                Object obj = mgbVar.f51309a[lgbVar.m16182d() + i2];
                this.f47257b = i2 + 1;
                return obj;
            default:
                int i3 = this.f47257b;
                this.f47257b = i3 + 1;
                ynd yndVar = (ynd) ((pb9) abstractSet).f55933b;
                return yndVar.m25218d(yndVar.f70133d[i3] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f47256a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
