package p021j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: j$.util.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0547e implements Comparator, Serializable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33242a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f33243b;

    public /* synthetic */ C0547e(int i, Object obj) {
        this.f33242a = i;
        this.f33243b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f33242a;
        Object obj3 = this.f33243b;
        switch (i) {
            case 0:
                ToIntFunction toIntFunction = (ToIntFunction) obj3;
                int iApplyAsInt = toIntFunction.applyAsInt(obj);
                int iApplyAsInt2 = toIntFunction.applyAsInt(obj2);
                if (iApplyAsInt == iApplyAsInt2) {
                    return 0;
                }
                return iApplyAsInt < iApplyAsInt2 ? -1 : 1;
            default:
                Function function = (Function) obj3;
                return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
        }
    }
}
