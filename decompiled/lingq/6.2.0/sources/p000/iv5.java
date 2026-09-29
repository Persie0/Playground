package p000;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class iv5 {

    /* JADX INFO: renamed from: a */
    public int f44674a;

    /* JADX INFO: renamed from: b */
    public int f44675b;

    public final boolean equals(Object obj) {
        int i = this.f44675b;
        int i2 = this.f44674a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv5)) {
            return false;
        }
        iv5 iv5Var = (iv5) obj;
        int i3 = iv5Var.f44675b;
        int i4 = iv5Var.f44674a;
        if (i2 < 0 || i4 < 0) {
            return TextUtils.equals("android.media.session.MediaController", "android.media.session.MediaController") && i == i3;
        }
        return TextUtils.equals("android.media.session.MediaController", "android.media.session.MediaController") && i2 == i4 && i == i3;
    }

    public final int hashCode() {
        return Objects.hash("android.media.session.MediaController", Integer.valueOf(this.f44675b));
    }
}
