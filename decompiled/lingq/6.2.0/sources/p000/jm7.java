package p000;

import com.kochava.tracker.privacy.consent.internal.ConsentState;

/* JADX INFO: loaded from: classes.dex */
public final class jm7 extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public final long f45832b;

    /* JADX INFO: renamed from: c */
    public ConsentState f45833c;

    /* JADX INFO: renamed from: d */
    public long f45834d;

    public jm7(cj9 cj9Var, long j) {
        super(cj9Var);
        this.f45833c = ConsentState.NOT_ANSWERED;
        this.f45834d = 0L;
        this.f45832b = j;
    }

    /* JADX INFO: renamed from: E */
    public final synchronized ConsentState m14532E() {
        return this.f45833c;
    }

    /* JADX INFO: renamed from: F */
    public final synchronized void m14533F() {
        this.f45833c = ConsentState.fromKey(((cj9) this.f60774a).m4777e("privacy.consent_state", ConsentState.NOT_ANSWERED.key));
        long jLongValue = ((cj9) this.f60774a).m4776d("privacy.consent_state_time_millis", Long.valueOf(this.f45832b)).longValue();
        this.f45834d = jLongValue;
        if (jLongValue == this.f45832b) {
            ((cj9) this.f60774a).m4782j("privacy.consent_state_time_millis", jLongValue);
        }
    }
}
