package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mkz implements mkt {

    /* JADX INFO: renamed from: a */
    private final float f40915a;

    public mkz(float f) {
        this.f40915a = f;
    }

    @Override // p000.mkt
    /* JADX INFO: renamed from: a */
    public final float mo16491a(RectF rectF) {
        return this.f40915a * Math.min(rectF.width(), rectF.height());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mkz) && this.f40915a == ((mkz) obj).f40915a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f40915a)});
    }
}
