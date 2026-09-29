package p291o7;

import android.os.Handler;
import com.facebook.GraphRequest;
import dm.C5207g;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import tl.C9322j;

/* JADX INFO: renamed from: o7.s */
/* JADX INFO: loaded from: classes.dex */
public final class C8009s extends AbstractList<GraphRequest> {

    /* JADX INFO: renamed from: e */
    public static final AtomicInteger f43580e = new AtomicInteger();

    /* JADX INFO: renamed from: a */
    public Handler f43581a;

    /* JADX INFO: renamed from: c */
    public final ArrayList f43583c;

    /* JADX INFO: renamed from: b */
    public final String f43582b = String.valueOf(Integer.valueOf(f43580e.incrementAndGet()));

    /* JADX INFO: renamed from: d */
    public final ArrayList f43584d = new ArrayList();

    /* JADX INFO: renamed from: o7.s$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo15859a(C8009s c8009s);
    }

    /* JADX INFO: renamed from: o7.s$b */
    public interface b extends a {
        /* JADX INFO: renamed from: b */
        void m15883b();
    }

    public C8009s(List list) {
        this.f43583c = new ArrayList(list);
    }

    public C8009s(GraphRequest... graphRequestArr) {
        this.f43583c = new ArrayList(C9322j.m17670X(graphRequestArr));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        GraphRequest graphRequest = (GraphRequest) obj;
        C5207g.m11111f(graphRequest, "element");
        this.f43583c.add(i10, graphRequest);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        GraphRequest graphRequest = (GraphRequest) obj;
        C5207g.m11111f(graphRequest, "element");
        return this.f43583c.add(graphRequest);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f43583c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return super.contains((GraphRequest) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (GraphRequest) this.f43583c.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return super.indexOf((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return super.lastIndexOf((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        return (GraphRequest) this.f43583c.remove(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return super.remove((GraphRequest) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        GraphRequest graphRequest = (GraphRequest) obj;
        C5207g.m11111f(graphRequest, "element");
        return (GraphRequest) this.f43583c.set(i10, graphRequest);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43583c.size();
    }
}
