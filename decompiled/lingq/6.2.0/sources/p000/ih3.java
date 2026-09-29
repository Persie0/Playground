package p000;

import com.lingq.core.premium.domain.TrialReminderChoice;

/* JADX INFO: loaded from: classes2.dex */
public final class ih3 implements oh3 {

    /* JADX INFO: renamed from: a */
    public final TrialReminderChoice f44103a;

    public ih3(TrialReminderChoice trialReminderChoice) {
        trialReminderChoice.getClass();
        this.f44103a = trialReminderChoice;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih3) && this.f44103a == ((ih3) obj).f44103a;
    }

    public final int hashCode() {
        return this.f44103a.hashCode();
    }

    public final String toString() {
        return "ReminderChoiceSelected(choice=" + this.f44103a + ")";
    }
}
