package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class hn4 implements v76 {
    public static final gn4 Companion = new gn4();

    /* JADX INFO: renamed from: a */
    public final LanguageProgressPeriod f42652a;

    public hn4(LanguageProgressPeriod languageProgressPeriod) {
        languageProgressPeriod.getClass();
        this.f42652a = languageProgressPeriod;
    }

    public static final hn4 fromBundle(Bundle bundle) {
        LanguageProgressPeriod languageProgressPeriod;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(hn4.class.getClassLoader());
        if (!bundle.containsKey("period")) {
            languageProgressPeriod = LanguageProgressPeriod.Today;
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
        return new hn4(languageProgressPeriod);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hn4) && this.f42652a == ((hn4) obj).f42652a;
    }

    public final int hashCode() {
        return this.f42652a.hashCode();
    }

    public final String toString() {
        return "LanguageStatsAllFragmentArgs(period=" + this.f42652a + ")";
    }
}
