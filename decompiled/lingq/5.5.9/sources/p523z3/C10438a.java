package p523z3;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: z3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10438a {

    /* JADX INFO: renamed from: a */
    public final C10440c f52279a;

    public C10438a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f52279a = new C10439b(remoteUserInfo);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C10438a(String str, int i10, int i11) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f52279a = new C10439b(str, i10, i11);
        } else {
            this.f52279a = new C10440c(str, i10, i11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10438a)) {
            return false;
        }
        return this.f52279a.equals(((C10438a) obj).f52279a);
    }

    public final int hashCode() {
        return this.f52279a.hashCode();
    }
}
