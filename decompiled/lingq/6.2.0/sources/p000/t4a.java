package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.token.TokenPopupData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class t4a implements v76 {
    public static final s4a Companion = new s4a();

    /* JADX INFO: renamed from: a */
    public final TokenPopupData f61862a;

    /* JADX INFO: renamed from: b */
    public final int f61863b;

    /* JADX INFO: renamed from: c */
    public final boolean f61864c;

    /* JADX INFO: renamed from: d */
    public final boolean f61865d;

    /* JADX INFO: renamed from: e */
    public final boolean f61866e;

    public t4a(TokenPopupData tokenPopupData, int i, boolean z, boolean z2, boolean z3) {
        this.f61862a = tokenPopupData;
        this.f61863b = i;
        this.f61864c = z;
        this.f61865d = z2;
        this.f61866e = z3;
    }

    public static final t4a fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(t4a.class.getClassLoader());
        TokenPopupData tokenPopupData = null;
        if (bundle.containsKey("tokenData")) {
            if (!Parcelable.class.isAssignableFrom(TokenPopupData.class) && !Serializable.class.isAssignableFrom(TokenPopupData.class)) {
                C3386nv.m17636w(TokenPopupData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            tokenPopupData = (TokenPopupData) bundle.get("tokenData");
        }
        return new t4a(tokenPopupData, bundle.containsKey("lessonId") ? bundle.getInt("lessonId") : -1, bundle.containsKey("shouldPlayTts") ? bundle.getBoolean("shouldPlayTts") : true, bundle.containsKey("fromVocabulary") ? bundle.getBoolean("fromVocabulary") : false, bundle.containsKey("isSentence") ? bundle.getBoolean("isSentence") : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4a)) {
            return false;
        }
        t4a t4aVar = (t4a) obj;
        return fa4.m11650l(this.f61862a, t4aVar.f61862a) && this.f61863b == t4aVar.f61863b && this.f61864c == t4aVar.f61864c && this.f61865d == t4aVar.f61865d && this.f61866e == t4aVar.f61866e;
    }

    public final int hashCode() {
        TokenPopupData tokenPopupData = this.f61862a;
        return Boolean.hashCode(this.f61866e) + g9a.m12428e(g9a.m12428e(wq1.m24106b(this.f61863b, (tokenPopupData == null ? 0 : tokenPopupData.hashCode()) * 31, 31), 31, this.f61864c), 31, this.f61865d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenPopupHostFragmentArgs(tokenData=");
        sb.append(this.f61862a);
        sb.append(", lessonId=");
        sb.append(this.f61863b);
        sb.append(", shouldPlayTts=");
        wq1.m24101A(sb, this.f61864c, ", fromVocabulary=", this.f61865d, ", isSentence=");
        return AbstractC3393o1.m17740o(sb, this.f61866e, ")");
    }
}
