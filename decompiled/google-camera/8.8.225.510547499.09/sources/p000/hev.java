package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hev {

    /* JADX INFO: renamed from: a */
    public final long f27505a;

    /* JADX INFO: renamed from: b */
    public final boolean f27506b;

    /* JADX INFO: renamed from: c */
    public final String f27507c;

    /* JADX INFO: renamed from: d */
    public final Drawable f27508d;

    /* JADX INFO: renamed from: e */
    public final Runnable f27509e;

    /* JADX INFO: renamed from: f */
    public final Runnable f27510f;

    /* JADX INFO: renamed from: g */
    public final String f27511g;

    /* JADX INFO: renamed from: h */
    public final Runnable f27512h;

    /* JADX INFO: renamed from: i */
    public final Runnable f27513i;

    /* JADX INFO: renamed from: j */
    public final Runnable f27514j;

    /* JADX INFO: renamed from: k */
    public final Runnable f27515k;

    /* JADX INFO: renamed from: l */
    public final boolean f27516l;

    public hev() {
    }

    public hev(long j, boolean z, String str, Drawable drawable, Runnable runnable, Runnable runnable2, String str2, Runnable runnable3, Runnable runnable4, Runnable runnable5, Runnable runnable6, boolean z2) {
        this.f27505a = j;
        this.f27506b = z;
        this.f27507c = str;
        this.f27508d = drawable;
        this.f27509e = runnable;
        this.f27510f = runnable2;
        this.f27511g = str2;
        this.f27512h = runnable3;
        this.f27513i = runnable4;
        this.f27514j = runnable5;
        this.f27515k = runnable6;
        this.f27516l = z2;
    }

    /* JADX INFO: renamed from: a */
    public static heu m10165a() {
        heu heuVar = new heu();
        heuVar.m10164e(0L);
        heuVar.m10162c(false);
        heuVar.m10163d(false);
        return heuVar;
    }

    /* JADX INFO: renamed from: b */
    public final heu m10166b() {
        return new heu(this);
    }

    public final boolean equals(Object obj) {
        String str;
        Drawable drawable;
        Runnable runnable;
        Runnable runnable2;
        String str2;
        Runnable runnable3;
        Runnable runnable4;
        Runnable runnable5;
        Runnable runnable6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hev)) {
            return false;
        }
        hev hevVar = (hev) obj;
        return this.f27505a == hevVar.f27505a && this.f27506b == hevVar.f27506b && ((str = this.f27507c) != null ? str.equals(hevVar.f27507c) : hevVar.f27507c == null) && ((drawable = this.f27508d) != null ? drawable.equals(hevVar.f27508d) : hevVar.f27508d == null) && ((runnable = this.f27509e) != null ? runnable.equals(hevVar.f27509e) : hevVar.f27509e == null) && ((runnable2 = this.f27510f) != null ? runnable2.equals(hevVar.f27510f) : hevVar.f27510f == null) && ((str2 = this.f27511g) != null ? str2.equals(hevVar.f27511g) : hevVar.f27511g == null) && ((runnable3 = this.f27512h) != null ? runnable3.equals(hevVar.f27512h) : hevVar.f27512h == null) && ((runnable4 = this.f27513i) != null ? runnable4.equals(hevVar.f27513i) : hevVar.f27513i == null) && ((runnable5 = this.f27514j) != null ? runnable5.equals(hevVar.f27514j) : hevVar.f27514j == null) && ((runnable6 = this.f27515k) != null ? runnable6.equals(hevVar.f27515k) : hevVar.f27515k == null) && this.f27516l == hevVar.f27516l;
    }

    public final String toString() {
        return "SmartsSuggestion{timeoutMillis=" + this.f27505a + ", autoHideOnClick=" + this.f27506b + ", text=" + this.f27507c + ", icon=" + String.valueOf(this.f27508d) + ", onChipClickListener=" + String.valueOf(this.f27509e) + ", button=null, onButtonClickListener=" + String.valueOf(this.f27510f) + ", chipContentDescription=" + this.f27511g + ", buttonContentDescription=null, onDismissButtonClickListener=" + String.valueOf(this.f27512h) + ", onSuggestionDisplayedListener=" + String.valueOf(this.f27513i) + ", onSuggestionHiddenListener=" + String.valueOf(this.f27514j) + ", onSuggestionTimeoutListener=" + String.valueOf(this.f27515k) + ", sticky=" + this.f27516l + "}";
    }

    public final int hashCode() {
        long j = this.f27505a;
        long j2 = j ^ (j >>> 32);
        int i = true != this.f27506b ? 1237 : 1231;
        String str = this.f27507c;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i2 = ((((int) j2) ^ 1000003) * 1000003) ^ i;
        Drawable drawable = this.f27508d;
        int iHashCode2 = ((((i2 * 1000003) ^ iHashCode) * 1000003) ^ (drawable == null ? 0 : drawable.hashCode())) * 1000003;
        Runnable runnable = this.f27509e;
        int iHashCode3 = iHashCode2 ^ (runnable == null ? 0 : runnable.hashCode());
        Runnable runnable2 = this.f27510f;
        int iHashCode4 = ((iHashCode3 * (-721379959)) ^ (runnable2 == null ? 0 : runnable2.hashCode())) * 1000003;
        String str2 = this.f27511g;
        int iHashCode5 = (iHashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * (-721379959);
        Runnable runnable3 = this.f27512h;
        int iHashCode6 = (iHashCode5 ^ (runnable3 == null ? 0 : runnable3.hashCode())) * 1000003;
        Runnable runnable4 = this.f27513i;
        int iHashCode7 = (iHashCode6 ^ (runnable4 == null ? 0 : runnable4.hashCode())) * 1000003;
        Runnable runnable5 = this.f27514j;
        int iHashCode8 = (iHashCode7 ^ (runnable5 == null ? 0 : runnable5.hashCode())) * 1000003;
        Runnable runnable6 = this.f27515k;
        return ((iHashCode8 ^ (runnable6 != null ? runnable6.hashCode() : 0)) * 1000003) ^ (true == this.f27516l ? 1231 : 1237);
    }
}
