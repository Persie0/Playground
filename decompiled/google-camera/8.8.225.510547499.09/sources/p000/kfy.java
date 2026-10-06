package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kfy {

    /* JADX INFO: renamed from: a */
    public final CaptureRequest.Key f35858a;

    /* JADX INFO: renamed from: b */
    public final Object f35859b;

    public kfy(CaptureRequest.Key key, Object obj) {
        key.getClass();
        this.f35858a = key;
        obj.getClass();
        this.f35859b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final String m14177a() {
        return this.f35858a.getName();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kfy)) {
            return false;
        }
        kfy kfyVar = (kfy) obj;
        return mpw.m16768g(this.f35858a.getName(), kfyVar.f35858a.getName()) && mpw.m16768g(this.f35859b, kfyVar.f35859b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35858a.getName(), this.f35859b});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "%s: %s", this.f35858a.getName(), this.f35859b);
    }
}
