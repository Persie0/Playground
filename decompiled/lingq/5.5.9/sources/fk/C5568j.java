package fk;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.p055ui.token.TokenData;
import dm.C5207g;
import java.io.Serializable;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: fk.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C5568j implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final TokenData f34366a;

    /* JADX INFO: renamed from: b */
    public final int f34367b;

    /* JADX INFO: renamed from: c */
    public final boolean f34368c;

    /* JADX INFO: renamed from: d */
    public final boolean f34369d;

    public C5568j(TokenData tokenData, int i10, boolean z10, boolean z11) {
        this.f34366a = tokenData;
        this.f34367b = i10;
        this.f34368c = z10;
        this.f34369d = z11;
    }

    public static final C5568j fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C5568j.class, "tokenData")) {
            throw new IllegalArgumentException("Required argument \"tokenData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(TokenData.class) && !Serializable.class.isAssignableFrom(TokenData.class)) {
            throw new UnsupportedOperationException(TokenData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        TokenData tokenData = (TokenData) bundle.get("tokenData");
        if (tokenData != null) {
            return new C5568j(tokenData, bundle.containsKey("lessonId") ? bundle.getInt("lessonId") : -1, bundle.containsKey("shouldPlayTts") ? bundle.getBoolean("shouldPlayTts") : true, bundle.containsKey("fromVocabulary") ? bundle.getBoolean("fromVocabulary") : false);
        }
        throw new IllegalArgumentException("Argument \"tokenData\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5568j)) {
            return false;
        }
        C5568j c5568j = (C5568j) obj;
        if (C5207g.m11106a(this.f34366a, c5568j.f34366a) && this.f34367b == c5568j.f34367b && this.f34368c == c5568j.f34368c && this.f34369d == c5568j.f34369d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f34367b, this.f34366a.hashCode() * 31, 31);
        ?? r10 = 1;
        boolean z10 = this.f34368c;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iM16d + r11) * 31;
        boolean z11 = this.f34369d;
        if (!z11) {
            r10 = z11;
        }
        return i10 + r10;
    }

    public final String toString() {
        return "TokenFragmentArgs(tokenData=" + this.f34366a + ", lessonId=" + this.f34367b + ", shouldPlayTts=" + this.f34368c + ", fromVocabulary=" + this.f34369d + ")";
    }
}
