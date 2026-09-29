package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class zn4 implements v76 {
    public static final yn4 Companion = new yn4();

    /* JADX INFO: renamed from: a */
    public final LanguageProgressPeriod f71795a;

    /* JADX INFO: renamed from: b */
    public final LanguageProgressMetric f71796b;

    public zn4(LanguageProgressPeriod languageProgressPeriod, LanguageProgressMetric languageProgressMetric) {
        languageProgressPeriod.getClass();
        languageProgressMetric.getClass();
        this.f71795a = languageProgressPeriod;
        this.f71796b = languageProgressMetric;
    }

    public static final zn4 fromBundle(Bundle bundle) {
        LanguageProgressPeriod languageProgressPeriod;
        LanguageProgressMetric languageProgressMetric;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(zn4.class.getClassLoader());
        if (!bundle.containsKey("period")) {
            languageProgressPeriod = LanguageProgressPeriod.Last7Days;
        } else {
            if (!Parcelable.class.isAssignableFrom(LanguageProgressPeriod.class) && !Serializable.class.isAssignableFrom(LanguageProgressPeriod.class)) {
                C3386nv.m17636w(LanguageProgressPeriod.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            languageProgressPeriod = (LanguageProgressPeriod) bundle.get("period");
            if (languageProgressPeriod == null) {
                C3386nv.m17626m("Argument \"period\" is marked as non-null but was passed a null value.");
                return null;
            }
        }
        if (!bundle.containsKey("metric")) {
            languageProgressMetric = LanguageProgressMetric.KnownWords;
        } else {
            if (!Parcelable.class.isAssignableFrom(LanguageProgressMetric.class) && !Serializable.class.isAssignableFrom(LanguageProgressMetric.class)) {
                C3386nv.m17636w(LanguageProgressMetric.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            languageProgressMetric = (LanguageProgressMetric) bundle.get("metric");
            if (languageProgressMetric == null) {
                C3386nv.m17626m("Argument \"metric\" is marked as non-null but was passed a null value.");
                return null;
            }
        }
        return new zn4(languageProgressPeriod, languageProgressMetric);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn4)) {
            return false;
        }
        zn4 zn4Var = (zn4) obj;
        return this.f71795a == zn4Var.f71795a && this.f71796b == zn4Var.f71796b;
    }

    public final int hashCode() {
        return this.f71796b.hashCode() + (this.f71795a.hashCode() * 31);
    }

    public final String toString() {
        return "LanguageStatsDetailsFragmentArgs(period=" + this.f71795a + ", metric=" + this.f71796b + ")";
    }
}
