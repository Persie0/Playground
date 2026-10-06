package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mvo extends mvq implements Map.Entry {
    protected mvo() {
    }

    @Override // p000.mvq
    /* JADX INFO: renamed from: a */
    protected /* bridge */ /* synthetic */ Object mo3816a() {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    protected abstract Map.Entry mo16873b();

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        return mo16873b().equals(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return mo16873b().getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return mo16873b().getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return mo16873b().hashCode();
    }

    public Object setValue(Object obj) {
        return mo16873b().setValue(obj);
    }
}
