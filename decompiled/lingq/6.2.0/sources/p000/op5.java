package p000;

import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class op5 implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final MapBuilder f54683a;

    /* JADX INFO: renamed from: b */
    public int f54684b;

    /* JADX INFO: renamed from: c */
    public int f54685c;

    /* JADX INFO: renamed from: d */
    public int f54686d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f54687e;

    public op5(MapBuilder mapBuilder, int i) {
        this.f54687e = i;
        mapBuilder.getClass();
        this.f54683a = mapBuilder;
        this.f54685c = -1;
        this.f54686d = mapBuilder.f47668h;
        m18195b();
    }

    /* JADX INFO: renamed from: a */
    public final void m18194a() {
        if (this.f54683a.f47668h == this.f54686d) {
            return;
        }
        C3386nv.m17619e();
    }

    /* JADX INFO: renamed from: b */
    public final void m18195b() {
        while (true) {
            int i = this.f54684b;
            MapBuilder mapBuilder = this.f54683a;
            if (i >= mapBuilder.f47666f || mapBuilder.f47663c[i] >= 0) {
                return;
            } else {
                this.f54684b = i + 1;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f54684b < this.f54683a.f47666f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f54687e;
        MapBuilder mapBuilder = this.f54683a;
        switch (i) {
            case 0:
                m18194a();
                int i2 = this.f54684b;
                if (i2 >= mapBuilder.f47666f) {
                    uk9.m22784s();
                    return null;
                }
                this.f54684b = i2 + 1;
                this.f54685c = i2;
                pp5 pp5Var = new pp5(mapBuilder, i2);
                m18195b();
                return pp5Var;
            case 1:
                m18194a();
                int i3 = this.f54684b;
                if (i3 >= mapBuilder.f47666f) {
                    uk9.m22784s();
                    return null;
                }
                this.f54684b = i3 + 1;
                this.f54685c = i3;
                Object obj = mapBuilder.f47661a[i3];
                m18195b();
                return obj;
            default:
                m18194a();
                int i4 = this.f54684b;
                if (i4 >= mapBuilder.f47666f) {
                    uk9.m22784s();
                    return null;
                }
                this.f54684b = i4 + 1;
                this.f54685c = i4;
                Object[] objArr = mapBuilder.f47662b;
                objArr.getClass();
                Object obj2 = objArr[this.f54685c];
                m18195b();
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        m18194a();
        if (this.f54685c == -1) {
            C3386nv.m17633t("Call next() before removing element from the iterator.");
            return;
        }
        MapBuilder mapBuilder = this.f54683a;
        mapBuilder.m15393c();
        mapBuilder.m15401k(this.f54685c);
        this.f54685c = -1;
        this.f54686d = mapBuilder.f47668h;
    }
}
