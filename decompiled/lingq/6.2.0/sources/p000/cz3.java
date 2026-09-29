package p000;

import android.content.Context;
import androidx.room.util.AbstractC0758a;
import androidx.work.impl.WorkDatabase;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cz3 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34734a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f34735b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f34736c;

    public /* synthetic */ cz3(Object obj, int i, int i2) {
        this.f34734a = i2;
        this.f34736c = obj;
        this.f34735b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f34734a;
        int i2 = this.f34735b;
        Object obj = this.f34736c;
        switch (i) {
            case 0:
                WorkDatabase workDatabase = (WorkDatabase) ((web) obj).f66742a;
                Long lM20666a = workDatabase.mo2905v().m20666a("next_job_scheduler_id");
                int i3 = 0;
                int iLongValue = lM20666a != null ? (int) lM20666a.longValue() : 0;
                int i4 = iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1;
                ri7 ri7VarMo2905v = workDatabase.mo2905v();
                int i5 = 10;
                AbstractC0758a.m2859b(ri7VarMo2905v.f59365a, false, true, new ui5(i5, ri7VarMo2905v, new qi7("next_job_scheduler_id", Long.valueOf(i4))));
                if (iLongValue < 0 || iLongValue > i2) {
                    ri7 ri7VarMo2905v2 = workDatabase.mo2905v();
                    AbstractC0758a.m2859b(ri7VarMo2905v2.f59365a, false, true, new ui5(i5, ri7VarMo2905v2, new qi7("next_job_scheduler_id", 1L)));
                } else {
                    i3 = iLongValue;
                }
                return Integer.valueOf(i3);
            default:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
                if (!lottieAnimationView.f10579H) {
                    return ll5.m16355h(i2, lottieAnimationView.getContext(), null);
                }
                Context context = lottieAnimationView.getContext();
                return ll5.m16355h(i2, context, ll5.m16360m(context, i2));
        }
    }
}
