package p372rm;

import dm.C5207g;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: renamed from: rm.q0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8859q0 {

    /* JADX INFO: renamed from: a */
    public final String f46764a;

    /* JADX INFO: renamed from: b */
    public final boolean f46765b;

    public AbstractC8859q0(String str, boolean z10) {
        this.f46764a = str;
        this.f46765b = z10;
    }

    /* JADX INFO: renamed from: a */
    public Integer mo17117a(AbstractC8859q0 abstractC8859q0) {
        C5207g.m11111f(abstractC8859q0, "visibility");
        MapBuilder mapBuilder = C8857p0.f46752a;
        if (this == abstractC8859q0) {
            return 0;
        }
        MapBuilder mapBuilder2 = C8857p0.f46752a;
        Integer num = (Integer) mapBuilder2.get(this);
        Integer num2 = (Integer) mapBuilder2.get(abstractC8859q0);
        if (num != null && num2 != null && !C5207g.m11106a(num, num2)) {
            return Integer.valueOf(num.intValue() - num2.intValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public String mo17116b() {
        return this.f46764a;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC8859q0 mo17118c() {
        return this;
    }

    public final String toString() {
        return mo17116b();
    }
}
