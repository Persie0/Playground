package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.feature.statistics.R$id;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class to4 implements t86 {

    /* JADX INFO: renamed from: a */
    public final LanguageProgressPeriod f62639a;

    /* JADX INFO: renamed from: b */
    public final LanguageProgressMetric f62640b;

    /* JADX INFO: renamed from: c */
    public final int f62641c;

    public to4(LanguageProgressPeriod languageProgressPeriod, LanguageProgressMetric languageProgressMetric) {
        languageProgressPeriod.getClass();
        languageProgressMetric.getClass();
        this.f62639a = languageProgressPeriod;
        this.f62640b = languageProgressMetric;
        this.f62641c = R$id.actionToStatsDetails;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LanguageProgressPeriod.class);
        Serializable serializable = this.f62639a;
        if (zIsAssignableFrom) {
            serializable.getClass();
            bundle.putParcelable("period", (Parcelable) serializable);
        } else if (Serializable.class.isAssignableFrom(LanguageProgressPeriod.class)) {
            serializable.getClass();
            bundle.putSerializable("period", serializable);
        }
        boolean zIsAssignableFrom2 = Parcelable.class.isAssignableFrom(LanguageProgressMetric.class);
        Serializable serializable2 = this.f62640b;
        if (zIsAssignableFrom2) {
            serializable2.getClass();
            bundle.putParcelable("metric", (Parcelable) serializable2);
            return bundle;
        }
        if (Serializable.class.isAssignableFrom(LanguageProgressMetric.class)) {
            serializable2.getClass();
            bundle.putSerializable("metric", serializable2);
        }
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f62641c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to4)) {
            return false;
        }
        to4 to4Var = (to4) obj;
        return this.f62639a == to4Var.f62639a && this.f62640b == to4Var.f62640b;
    }

    public final int hashCode() {
        return this.f62640b.hashCode() + (this.f62639a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionToStatsDetails(period=" + this.f62639a + ", metric=" + this.f62640b + ")";
    }
}
