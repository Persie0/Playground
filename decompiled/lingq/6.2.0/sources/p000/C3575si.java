package p000;

import android.os.Build;
import android.view.View;
import androidx.compose.p002ui.platform.C0409u;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.firebase.sessions.C1168d;
import com.google.firebase.sessions.SharedSessionRepositoryImpl$NotificationType;
import com.lingq.core.analytics.data.LqAnalyticsValues$UpgradePopupSource;
import com.lingq.feature.onboarding.OnboardingStartFragment;
import com.lingq.feature.onboarding.p014v2.C2216d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: si */
/* JADX INFO: loaded from: classes.dex */
public final class C3575si implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60883a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f60884b;

    public /* synthetic */ C3575si(Object obj, int i) {
        this.f60883a = i;
        this.f60884b = obj;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        int i = this.f60883a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f60884b;
        switch (i) {
            case 0:
                b64 b64Var = (b64) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    b64Var.m3362o().startStylusHandwriting((View) b64Var.f8006a);
                }
                return xfaVar;
            case 1:
                q84 q84Var = (q84) obj;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                if (q84Var instanceof rv3) {
                    snapshotStateList.add(q84Var);
                } else if (q84Var instanceof sv3) {
                    snapshotStateList.remove(((sv3) q84Var).f61480a);
                } else if (q84Var instanceof q93) {
                    snapshotStateList.add(q84Var);
                } else if (q84Var instanceof r93) {
                    snapshotStateList.remove(((r93) q84Var).f58940a);
                } else if (q84Var instanceof lj7) {
                    snapshotStateList.add(q84Var);
                } else if (q84Var instanceof mj7) {
                    snapshotStateList.remove(((mj7) q84Var).f51399a);
                } else if (q84Var instanceof kj7) {
                    snapshotStateList.remove(((kj7) q84Var).f47397a);
                }
                return xfaVar;
            case 2:
                ((C0409u) obj2).f4865c.m19862i(((Number) obj).floatValue());
                return xfaVar;
            case 3:
                ox6 ox6Var = (ox6) obj;
                OnboardingStartFragment onboardingStartFragment = (OnboardingStartFragment) obj2;
                w41 w41Var = onboardingStartFragment.f26984E0;
                if (fa4.m11650l(ox6Var, nx6.f53362a)) {
                    ((C2216d) w41Var.getValue()).f27400y.m15571i(null);
                    w41 w41Var2 = onboardingStartFragment.f26982C0;
                    if (w41Var2 != null) {
                        w41Var2.m23737z(new pa6(LqAnalyticsValues$UpgradePopupSource.Registration.getValue(), 14, null));
                        return xfaVar;
                    }
                    fa4.m11636J("navGraphController");
                    throw null;
                }
                if (!fa4.m11650l(ox6Var, mx6.f51997a)) {
                    if (ox6Var == null) {
                        return xfaVar;
                    }
                    gm5.m12750e();
                    return null;
                }
                ((C2216d) w41Var.getValue()).f27400y.m15571i(null);
                ud6 ud6VarM3244j = b34.m3244j(onboardingStartFragment);
                ac6.Companion.getClass();
                jfa.m14428k(ud6VarM3244j, zb6.m25538a(), null);
                return xfaVar;
            default:
                uy8 uy8Var = (uy8) obj;
                C1168d c1168d = (C1168d) obj2;
                uy8Var.getClass();
                c1168d.f13865h = uy8Var;
                if (c1168d.f13867j) {
                    c1168d.f13867j = false;
                    c1168d.m6758c();
                }
                Object objM6756a = C1168d.m6756a(c1168d, uy8Var.f64543a.f72388a, SharedSessionRepositoryImpl$NotificationType.GENERAL, continuation);
                return objM6756a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM6756a : xfaVar;
        }
    }
}
