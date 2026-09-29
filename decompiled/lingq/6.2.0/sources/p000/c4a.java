package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.token.TokenPopupData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class c4a implements v76 {
    public static final b4a Companion = new b4a();

    /* JADX INFO: renamed from: a */
    public final TokenPopupData f9486a;

    /* JADX INFO: renamed from: b */
    public final int f9487b;

    /* JADX INFO: renamed from: c */
    public final boolean f9488c;

    /* JADX INFO: renamed from: d */
    public final boolean f9489d;

    /* JADX INFO: renamed from: e */
    public final boolean f9490e;

    public c4a(TokenPopupData tokenPopupData, int i, boolean z, boolean z2, boolean z3) {
        this.f9486a = tokenPopupData;
        this.f9487b = i;
        this.f9488c = z;
        this.f9489d = z2;
        this.f9490e = z3;
    }

    public static final c4a fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(c4a.class.getClassLoader());
        if (!bundle.containsKey("tokenData")) {
            C3386nv.m17626m("Required argument \"tokenData\" is missing and does not have an android:defaultValue");
            return null;
        }
        if (!Parcelable.class.isAssignableFrom(TokenPopupData.class) && !Serializable.class.isAssignableFrom(TokenPopupData.class)) {
            C3386nv.m17636w(TokenPopupData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            return null;
        }
        TokenPopupData tokenPopupData = (TokenPopupData) bundle.get("tokenData");
        if (tokenPopupData != null) {
            return new c4a(tokenPopupData, bundle.containsKey("lessonId") ? bundle.getInt("lessonId") : -1, bundle.containsKey("shouldPlayTts") ? bundle.getBoolean("shouldPlayTts") : true, bundle.containsKey("fromVocabulary") ? bundle.getBoolean("fromVocabulary") : false, bundle.containsKey("isSentence") ? bundle.getBoolean("isSentence") : false);
        }
        C3386nv.m17626m("Argument \"tokenData\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4a)) {
            return false;
        }
        c4a c4aVar = (c4a) obj;
        return this.f9486a.equals(c4aVar.f9486a) && this.f9487b == c4aVar.f9487b && this.f9488c == c4aVar.f9488c && this.f9489d == c4aVar.f9489d && this.f9490e == c4aVar.f9490e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9490e) + g9a.m12428e(g9a.m12428e(wq1.m24106b(this.f9487b, this.f9486a.hashCode() * 31, 31), 31, this.f9488c), 31, this.f9489d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenParentFragmentArgs(tokenData=");
        sb.append(this.f9486a);
        sb.append(", lessonId=");
        sb.append(this.f9487b);
        sb.append(", shouldPlayTts=");
        wq1.m24101A(sb, this.f9488c, ", fromVocabulary=", this.f9489d, ", isSentence=");
        return AbstractC3393o1.m17740o(sb, this.f9490e, ")");
    }
}
