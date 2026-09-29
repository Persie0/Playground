package p000;

import com.lingq.core.settings.ViewKeys;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yf8 {

    /* JADX INFO: renamed from: a */
    public final List f69771a;

    /* JADX INFO: renamed from: b */
    public final ViewKeys f69772b;

    /* JADX INFO: renamed from: c */
    public final ViewKeys f69773c;

    /* JADX INFO: renamed from: d */
    public final String f69774d;

    /* JADX INFO: renamed from: e */
    public final boolean f69775e;

    /* JADX INFO: renamed from: f */
    public final int f69776f;

    public yf8(List list, ViewKeys viewKeys, ViewKeys viewKeys2, String str, boolean z, int i) {
        list.getClass();
        str.getClass();
        this.f69771a = list;
        this.f69772b = viewKeys;
        this.f69773c = viewKeys2;
        this.f69774d = str;
        this.f69775e = z;
        this.f69776f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf8)) {
            return false;
        }
        yf8 yf8Var = (yf8) obj;
        return fa4.m11650l(this.f69771a, yf8Var.f69771a) && this.f69772b == yf8Var.f69772b && this.f69773c == yf8Var.f69773c && fa4.m11650l(this.f69774d, yf8Var.f69774d) && this.f69775e == yf8Var.f69775e && this.f69776f == yf8Var.f69776f;
    }

    public final int hashCode() {
        int iHashCode = this.f69771a.hashCode() * 31;
        ViewKeys viewKeys = this.f69772b;
        int iHashCode2 = (iHashCode + (viewKeys == null ? 0 : viewKeys.hashCode())) * 31;
        ViewKeys viewKeys2 = this.f69773c;
        return Integer.hashCode(this.f69776f) + g9a.m12428e(ux5.m22980c((iHashCode2 + (viewKeys2 != null ? viewKeys2.hashCode() : 0)) * 31, this.f69774d, 31), 31, this.f69775e);
    }

    public final String toString() {
        return "ReviewSettingsState(settings=" + this.f69771a + ", selectOneActivityWarning=" + this.f69772b + ", activeTransliterationKey=" + this.f69773c + ", transliterationCurrentValue=" + this.f69774d + ", showCardsPerSessionDialog=" + this.f69775e + ", cardsPerSession=" + this.f69776f + ")";
    }
}
