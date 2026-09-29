package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.token.TokenPopupData;
import com.lingq.feature.token.R$id;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class cd6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final TokenPopupData f9930a;

    /* JADX INFO: renamed from: b */
    public final int f9931b;

    /* JADX INFO: renamed from: c */
    public final int f9932c = R$id.actionToTokenParent;

    public cd6(TokenPopupData tokenPopupData, int i) {
        this.f9930a = tokenPopupData;
        this.f9931b = i;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(TokenPopupData.class);
        Parcelable parcelable = this.f9930a;
        if (zIsAssignableFrom) {
            bundle.putParcelable("tokenData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(TokenPopupData.class)) {
                C3386nv.m17636w(TokenPopupData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            bundle.putSerializable("tokenData", (Serializable) parcelable);
        }
        bundle.putInt("lessonId", this.f9931b);
        bundle.putBoolean("shouldPlayTts", true);
        bundle.putBoolean("fromVocabulary", false);
        bundle.putBoolean("isSentence", false);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f9932c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd6)) {
            return false;
        }
        cd6 cd6Var = (cd6) obj;
        return this.f9930a.equals(cd6Var.f9930a) && this.f9931b == cd6Var.f9931b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + g9a.m12428e(g9a.m12428e(wq1.m24106b(this.f9931b, this.f9930a.hashCode() * 31, 31), 31, true), 31, false);
    }

    public final String toString() {
        return "ActionToTokenParent(tokenData=" + this.f9930a + ", lessonId=" + this.f9931b + ", shouldPlayTts=true, fromVocabulary=false, isSentence=false)";
    }
}
