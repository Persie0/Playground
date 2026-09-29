package p512yi;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.shared.uimodel.notification.UserNotice;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import java.util.Arrays;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: yi.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C10393u implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final UserNotice f52183a;

    /* JADX INFO: renamed from: b */
    public final String[] f52184b;

    /* JADX INFO: renamed from: c */
    public final int f52185c = R.id.actionToChallengesMonthlyPrompt;

    public C10393u(UserNotice userNotice, String[] strArr) {
        this.f52183a = userNotice;
        this.f52184b = strArr;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(UserNotice.class);
        Parcelable parcelable = this.f52183a;
        if (zIsAssignableFrom) {
            C5207g.m11109d(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("userNotice", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(UserNotice.class)) {
                throw new UnsupportedOperationException(UserNotice.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            C5207g.m11109d(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("userNotice", (Serializable) parcelable);
        }
        bundle.putStringArray("images", this.f52184b);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f52185c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10393u)) {
            return false;
        }
        C10393u c10393u = (C10393u) obj;
        return C5207g.m11106a(this.f52183a, c10393u.f52183a) && C5207g.m11106a(this.f52184b, c10393u.f52184b);
    }

    public final int hashCode() {
        return (this.f52183a.hashCode() * 31) + Arrays.hashCode(this.f52184b);
    }

    public final String toString() {
        return "ActionToChallengesMonthlyPrompt(userNotice=" + this.f52183a + ", images=" + Arrays.toString(this.f52184b) + ")";
    }
}
