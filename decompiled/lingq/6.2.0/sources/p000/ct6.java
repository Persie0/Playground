package p000;

import com.lingq.core.achievements.DailyGoal;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ct6 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34524a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f34525b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DailyGoal f34526c;

    public /* synthetic */ ct6(vi3 vi3Var, DailyGoal dailyGoal, int i) {
        this.f34524a = i;
        this.f34525b = vi3Var;
        this.f34526c = dailyGoal;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f34524a;
        xfa xfaVar = xfa.f68157a;
        DailyGoal dailyGoal = this.f34526c;
        vi3 vi3Var = this.f34525b;
        switch (i) {
            case 0:
                vi3Var.invoke(new qy1(dailyGoal));
                break;
            default:
                vi3Var.invoke(Integer.valueOf(dailyGoal.getMins()));
                break;
        }
        return xfaVar;
    }
}
