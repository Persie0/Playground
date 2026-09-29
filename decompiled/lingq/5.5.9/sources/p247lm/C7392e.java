package p247lm;

import java.util.Comparator;
import p372rm.AbstractC8852n;
import p372rm.C8850m;

/* JADX INFO: renamed from: lm.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C7392e<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public static final C7392e<T> f41203a = new C7392e<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numM17099b = C8850m.m17099b((AbstractC8852n) obj, (AbstractC8852n) obj2);
        if (numM17099b == null) {
            return 0;
        }
        return numM17099b.intValue();
    }
}
