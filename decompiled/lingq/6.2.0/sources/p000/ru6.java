package p000;

import com.lingq.feature.onboarding.p014v2.OnboardingPage;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ru6 {
    /* JADX INFO: renamed from: a */
    public static OnboardingPage m20820a(int i) {
        Object next;
        Iterator<E> it = OnboardingPage.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((OnboardingPage) next).getIndex() != i);
        OnboardingPage onboardingPage = (OnboardingPage) next;
        return onboardingPage == null ? OnboardingPage.START : onboardingPage;
    }
}
