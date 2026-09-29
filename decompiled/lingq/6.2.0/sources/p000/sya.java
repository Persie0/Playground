package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.settings.FilterType;
import com.lingq.feature.vocabulary.R$id;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class sya implements t86 {

    /* JADX INFO: renamed from: a */
    public final FilterType f61633a;

    /* JADX INFO: renamed from: b */
    public final int f61634b;

    public sya(FilterType filterType) {
        filterType.getClass();
        this.f61633a = filterType;
        this.f61634b = R$id.actionToVocabularyFilterSelection;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(FilterType.class);
        Serializable serializable = this.f61633a;
        if (zIsAssignableFrom) {
            serializable.getClass();
            bundle.putParcelable("filterType", (Parcelable) serializable);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(FilterType.class)) {
            C3386nv.m17636w(FilterType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            return null;
        }
        serializable.getClass();
        bundle.putSerializable("filterType", serializable);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f61634b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sya) && this.f61633a == ((sya) obj).f61633a;
    }

    public final int hashCode() {
        return this.f61633a.hashCode();
    }

    public final String toString() {
        return "ActionToVocabularyFilterSelection(filterType=" + this.f61633a + ")";
    }
}
