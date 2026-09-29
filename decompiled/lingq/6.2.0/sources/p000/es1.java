package p000;

import com.google.common.collect.AbstractC1104t;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class es1 {

    /* JADX INFO: renamed from: b */
    public static final AbstractC1104t f37770b = AbstractC1104t.m6350c().m6352d(new gj3() { // from class: ds1

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f36154a = 0;

        @Override // p000.gj3
        public final Object apply(Object obj) {
            switch (this.f36154a) {
                case 0:
                    return Integer.valueOf(((cs1) obj).f34481r);
                default:
                    return new l52((mp9) obj);
            }
        }
    });

    /* JADX INFO: renamed from: a */
    public final ImmutableList f37771a;

    static {
        new es1(ImmutableList.m6289v());
        uma.m22828w(0);
        uma.m22828w(1);
    }

    public es1(List list) {
        this.f37771a = ImmutableList.m6282E(f37770b, list);
    }
}
