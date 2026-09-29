package p000;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e88 {

    /* JADX INFO: renamed from: a */
    public final Resources f36844a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f36845b;

    public e88(Resources resources, Resources.Theme theme) {
        this.f36844a = resources;
        this.f36845b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e88.class == obj.getClass()) {
            e88 e88Var = (e88) obj;
            if (this.f36844a.equals(e88Var.f36844a) && Objects.equals(this.f36845b, e88Var.f36845b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36844a, this.f36845b);
    }
}
