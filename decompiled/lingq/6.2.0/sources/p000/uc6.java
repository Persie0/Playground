package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.settings.R$id;
import com.lingq.core.settings.ViewKeys;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class uc6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final ViewKeys f63717a;

    /* JADX INFO: renamed from: b */
    public final int f63718b;

    public uc6(ViewKeys viewKeys) {
        viewKeys.getClass();
        this.f63717a = viewKeys;
        this.f63718b = R$id.actionToReviewSettings;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(ViewKeys.class);
        Serializable serializable = this.f63717a;
        if (zIsAssignableFrom) {
            serializable.getClass();
            bundle.putParcelable("viewKey", (Parcelable) serializable);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(ViewKeys.class)) {
            C3386nv.m17636w(ViewKeys.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            return null;
        }
        serializable.getClass();
        bundle.putSerializable("viewKey", serializable);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f63718b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uc6) && this.f63717a == ((uc6) obj).f63717a;
    }

    public final int hashCode() {
        return this.f63717a.hashCode();
    }

    public final String toString() {
        return "ActionToReviewSettings(viewKey=" + this.f63717a + ")";
    }
}
