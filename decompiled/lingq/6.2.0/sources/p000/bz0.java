package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.achievements.DailyGoal;
import com.lingq.core.domain.model.milestones.Badge;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bz0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9189a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f9190b;

    public /* synthetic */ bz0(int i, List list) {
        this.f9189a = i;
        this.f9190b = list;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.f9189a;
        List list = this.f9190b;
        switch (i2) {
            case 0:
                iw0 iw0Var = (iw0) list.get(((Integer) obj).intValue());
                if (iw0Var instanceof gw0) {
                    i = ((gw0) iw0Var).f41411a;
                } else {
                    if (!(iw0Var instanceof hw0)) {
                        gm5.m12750e();
                        return null;
                    }
                    i = ((hw0) iw0Var).f43028a;
                }
                return Integer.valueOf(i);
            case 1:
                return Integer.valueOf(((bh9) list.get(((Integer) obj).intValue())).f8548b);
            case 2:
                return Integer.valueOf(((bh9) list.get(((Integer) obj).intValue())).f8548b);
            case 3:
                return Integer.valueOf(((bh9) list.get(((Integer) obj).intValue())).f8548b);
            case 4:
                js4 js4Var = (js4) obj;
                js4Var.getClass();
                js4Var.f46073b.m12798a(list.size(), new is4(new bz0(5, list), js4.f46071c, vs4.f65852b, new C0282a(-435061825, true, new pn4(list, 0))));
                return xfa.f68157a;
            case 5:
                Badge badge = (Badge) list.get(((Integer) obj).intValue());
                return badge.f19512f + "-" + badge.f19511e + "-" + badge.f19510d;
            case 6:
                em4 em4Var = (em4) list.get(((Integer) obj).intValue());
                if (em4Var instanceof dm4) {
                    return ((dm4) em4Var).f35823a.f44255a;
                }
                if (em4Var instanceof cm4) {
                    return Integer.valueOf(((cm4) em4Var).f10267a);
                }
                gm5.m12750e();
                return null;
            case 7:
                return ((DailyGoal) list.get(((Integer) obj).intValue())).name();
            case 8:
                return ((r75) list.get(((Integer) obj).intValue())).f58853a;
            default:
                return Integer.valueOf(((e37) list.get(((Integer) obj).intValue())).f36652a);
        }
    }
}
