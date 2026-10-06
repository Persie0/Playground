package p021j$.time.format;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: j$.time.format.c */
/* JADX INFO: loaded from: classes3.dex */
final class C0435c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj2).getKey()).length() - ((String) ((Map.Entry) obj).getKey()).length();
    }
}
