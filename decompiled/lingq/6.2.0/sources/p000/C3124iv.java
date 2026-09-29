package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: iv */
/* JADX INFO: loaded from: classes.dex */
public final class C3124iv implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a */
    public int f44625a;

    /* JADX INFO: renamed from: b */
    public int f44626b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f44627c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3275kv f44628d;

    public C3124iv(C3275kv c3275kv) {
        this.f44628d = c3275kv;
        this.f44625a = c3275kv.f49254c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f44627c) {
            C3386nv.m17633t("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f44626b;
            C3275kv c3275kv = this.f44628d;
            if (fa4.m11650l(key, c3275kv.m15974f(i)) && fa4.m11650l(entry.getValue(), c3275kv.m15977i(this.f44626b))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f44627c) {
            return this.f44628d.m15974f(this.f44626b);
        }
        C3386nv.m17633t("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f44627c) {
            return this.f44628d.m15977i(this.f44626b);
        }
        C3386nv.m17633t("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44626b < this.f44625a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f44627c) {
            C3386nv.m17633t("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.f44626b;
        C3275kv c3275kv = this.f44628d;
        Object objM15974f = c3275kv.m15974f(i);
        Object objM15977i = c3275kv.m15977i(this.f44626b);
        return (objM15974f == null ? 0 : objM15974f.hashCode()) ^ (objM15977i != null ? objM15977i.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        this.f44626b++;
        this.f44627c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f44627c) {
            uk9.m22770c();
            return;
        }
        this.f44628d.m15975g(this.f44626b);
        this.f44626b--;
        this.f44625a--;
        this.f44627c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f44627c) {
            return this.f44628d.m15976h(this.f44626b, obj);
        }
        C3386nv.m17633t("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
