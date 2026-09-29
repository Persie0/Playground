package p000;

import com.lingq.core.common.util.LqAnalyticsVariant;

/* JADX INFO: loaded from: classes.dex */
public abstract class lm5 {

    /* JADX INFO: renamed from: a */
    public static final jm5 f49832a;

    /* JADX INFO: renamed from: b */
    public static final jm5 f49833b;

    static {
        vz1.m23605K(new LqAnalyticsVariant("baseline", 302, true), new LqAnalyticsVariant("sentenceTranslationOn", 303, false));
        f49832a = new jm5(73, "onboardingMultipagePaywallReminderChoice", vz1.m23605K(new LqAnalyticsVariant("baseline", 730, true), new LqAnalyticsVariant("onboardingMultipagePaywallReminderChoice", 731, false)));
        f49833b = new jm5(74, "onboardingTrialVsTrialPromotion", vz1.m23605K(new LqAnalyticsVariant("trialWithDiscount", 740, true), new LqAnalyticsVariant("trialNoDiscount", 741, false)));
    }
}
