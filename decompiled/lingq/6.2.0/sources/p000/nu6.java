package p000;

import android.content.DialogInterface;
import android.os.Build;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.onboarding.R$id;
import com.lingq.feature.onboarding.notification.OnboardingNotificationFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nu6 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53258a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ OnboardingNotificationFragment f53259b;

    public /* synthetic */ nu6(OnboardingNotificationFragment onboardingNotificationFragment, int i) {
        this.f53258a = i;
        this.f53259b = onboardingNotificationFragment;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f53258a;
        xfa xfaVar = xfa.f68157a;
        OnboardingNotificationFragment onboardingNotificationFragment = this.f53259b;
        switch (i) {
            case 0:
                b34.m3244j(onboardingNotificationFragment).m22689f();
                return xfaVar;
            case 1:
                if (Build.VERSION.SDK_INT >= 33) {
                    hd3 hd3Var = onboardingNotificationFragment.f5675Q;
                    final int i2 = 0;
                    if (hd3Var != null ? do7.m10517D(hd3Var.f42213O, "android.permission.POST_NOTIFICATIONS") : false) {
                        int i3 = R$string.lingq_notifications;
                        int i4 = com.lingq.feature.onboarding.R$string.welcome_get_learning_reminders;
                        int i5 = R$string.ui_ok;
                        int i6 = R$string.ui_cancel;
                        final nu6 nu6Var = new nu6(onboardingNotificationFragment, 3);
                        final C3288l7 c3288l7 = new C3288l7(7);
                        final C3288l7 c3288l8 = new C3288l7(7);
                        fr5 fr5Var = new fr5(onboardingNotificationFragment.m2090R(), 0);
                        fr5Var.m12028k(i3);
                        fr5Var.m12020c(i4);
                        fr5Var.m12025h(i5, new DialogInterface.OnClickListener() { // from class: vd2
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i7) {
                                int i8 = i2;
                                ui3 ui3Var = nu6Var;
                                switch (i8) {
                                    case 0:
                                        ui3Var.mo0a();
                                        break;
                                    default:
                                        ui3Var.mo0a();
                                        break;
                                }
                            }
                        });
                        final int i7 = 1;
                        fr5Var.m12022e(i6, new DialogInterface.OnClickListener() { // from class: vd2
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i8) {
                                int i9 = i7;
                                ui3 ui3Var = c3288l7;
                                switch (i9) {
                                    case 0:
                                        ui3Var.mo0a();
                                        break;
                                    default:
                                        ui3Var.mo0a();
                                        break;
                                }
                            }
                        });
                        fr5Var.f71376a.f65217o = new DialogInterface.OnDismissListener() { // from class: wd2
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                c3288l8.mo0a();
                            }
                        };
                        fr5Var.m25557a();
                    } else {
                        ad3 ad3Var = onboardingNotificationFragment.f27266B0;
                        if (ad3Var == null) {
                            fa4.m11636J("requestPermissionLauncher");
                            throw null;
                        }
                        ad3Var.mo276a("android.permission.POST_NOTIFICATIONS");
                    }
                }
                return xfaVar;
            case 2:
                ud6 ud6VarM3244j = b34.m3244j(onboardingNotificationFragment);
                pu6.Companion.getClass();
                ac6.Companion.getClass();
                jfa.m14428k(ud6VarM3244j, new C2916d6(R$id.actionToOnboardingTopics), null);
                return xfaVar;
            default:
                ad3 ad3Var2 = onboardingNotificationFragment.f27266B0;
                if (ad3Var2 != null) {
                    ad3Var2.mo276a("android.permission.POST_NOTIFICATIONS");
                    return xfaVar;
                }
                fa4.m11636J("requestPermissionLauncher");
                throw null;
        }
    }
}
