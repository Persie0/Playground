package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class naj extends nan implements Map.Entry {
    private static final long serialVersionUID = 0;

    public naj(Map.Entry entry, Object obj) {
        super(entry, obj);
    }

    /* JADX INFO: renamed from: a */
    final Map.Entry m17200a() {
        return (Map.Entry) this.f41901g;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        synchronized (this.f41902h) {
            zEquals = m17200a().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        Object key;
        synchronized (this.f41902h) {
            key = m17200a().getKey();
        }
        return key;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object value;
        synchronized (this.f41902h) {
            value = m17200a().getValue();
        }
        return value;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f41902h) {
            iHashCode = m17200a().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object value;
        synchronized (this.f41902h) {
            value = m17200a().setValue(obj);
        }
        return value;
    }
}
