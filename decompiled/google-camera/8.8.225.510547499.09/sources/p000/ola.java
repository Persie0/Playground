package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ola extends okr {
    /* JADX INFO: renamed from: b */
    public abstract boolean mo18607b(Map.Entry entry);

    /* JADX INFO: renamed from: c */
    public /* bridge */ boolean mo18608c(Map.Entry entry) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return mo18607b(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return mo18608c((Map.Entry) obj);
        }
        return false;
    }
}
