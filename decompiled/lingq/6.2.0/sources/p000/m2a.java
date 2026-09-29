package p000;

import com.lingq.core.domain.model.onboarding.TooltipStep;

/* JADX INFO: loaded from: classes2.dex */
public final class m2a implements j3a {

    /* JADX INFO: renamed from: a */
    public final TooltipStep f50475a;

    public m2a(TooltipStep tooltipStep) {
        this.f50475a = tooltipStep;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2a) && this.f50475a == ((m2a) obj).f50475a;
    }

    public final int hashCode() {
        return this.f50475a.hashCode();
    }

    public final String toString() {
        return "ConsumeTooltip(tooltipStep=" + this.f50475a + ")";
    }
}
