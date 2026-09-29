package p000;

import android.content.Context;
import com.lingq.core.p012ui.challenges.LeaderboardMetric;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hq0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42766a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f42767b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f42768c;

    public /* synthetic */ hq0(vi3 vi3Var, Context context) {
        this.f42767b = vi3Var;
        this.f42768c = context;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        LeaderboardMetric leaderboardMetric;
        int i = this.f42766a;
        Object obj2 = null;
        xfa xfaVar = xfa.f68157a;
        Context context = this.f42768c;
        vi3 vi3Var = this.f42767b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                for (Object obj3 : LeaderboardMetric.getEntries()) {
                    if (fa4.m11650l(context.getString(((LeaderboardMetric) obj3).getValue()), str)) {
                        obj2 = obj3;
                        leaderboardMetric = (LeaderboardMetric) obj2;
                        if (leaderboardMetric != null) {
                            vi3Var.invoke(new mq0(leaderboardMetric));
                        }
                        return xfaVar;
                    }
                }
                leaderboardMetric = (LeaderboardMetric) obj2;
                if (leaderboardMetric != null) {
                    vi3Var.invoke(new mq0(leaderboardMetric));
                }
                return xfaVar;
            default:
                go6 go6Var = (go6) obj;
                go6Var.getClass();
                if (!(go6Var instanceof go6)) {
                    gm5.m12750e();
                    return null;
                }
                String str2 = go6Var.f41082a.f19113a;
                vi3Var.invoke(new zh6(str2, AbstractC3352my.m17093L(context, str2)));
                return xfaVar;
        }
    }

    public /* synthetic */ hq0(Context context, vi3 vi3Var) {
        this.f42768c = context;
        this.f42767b = vi3Var;
    }
}
