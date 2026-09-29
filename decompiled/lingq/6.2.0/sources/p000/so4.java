package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.feature.statistics.R$id;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class so4 implements t86 {

    /* JADX INFO: renamed from: a */
    public final LanguageProgressPeriod f61106a;

    /* JADX INFO: renamed from: b */
    public final int f61107b = R$id.actionToStatsAll;

    public so4(LanguageProgressPeriod languageProgressPeriod) {
        this.f61106a = languageProgressPeriod;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LanguageProgressPeriod.class);
        Serializable serializable = this.f61106a;
        if (zIsAssignableFrom) {
            bundle.putParcelable("period", (Parcelable) serializable);
            return bundle;
        }
        if (Serializable.class.isAssignableFrom(LanguageProgressPeriod.class)) {
            bundle.putSerializable("period", serializable);
        }
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f61107b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof so4) && this.f61106a == ((so4) obj).f61106a;
    }

    public final int hashCode() {
        return this.f61106a.hashCode();
    }

    public final String toString() {
        return "ActionToStatsAll(period=" + this.f61106a + ")";
    }
}
