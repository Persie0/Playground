package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ege extends LinkedHashMap {

    /* JADX INFO: renamed from: a */
    private final int f13911a = 10;

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f13911a;
    }
}
