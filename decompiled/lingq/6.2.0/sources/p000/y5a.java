package p000;

import com.lingq.core.domain.model.onboarding.TooltipStep;

/* JADX INFO: loaded from: classes3.dex */
public final class y5a {

    /* JADX INFO: renamed from: a */
    public final TooltipStep f69328a;

    /* JADX INFO: renamed from: b */
    public final p6a f69329b;

    public y5a(TooltipStep tooltipStep, p6a p6aVar) {
        tooltipStep.getClass();
        this.f69328a = tooltipStep;
        this.f69329b = p6aVar;
    }

    /* JADX INFO: renamed from: a */
    public final p6a m24946a() {
        return this.f69329b;
    }

    /* JADX INFO: renamed from: b */
    public final TooltipStep m24947b() {
        return this.f69328a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5a)) {
            return false;
        }
        y5a y5aVar = (y5a) obj;
        return this.f69328a == y5aVar.f69328a && this.f69329b.equals(y5aVar.f69329b);
    }

    public final int hashCode() {
        return this.f69329b.hashCode() + (this.f69328a.hashCode() * 31);
    }

    public final String toString() {
        return "Tooltip(step=" + this.f69328a + ", info=" + this.f69329b + ")";
    }
}
