package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mkr implements mkt {

    /* JADX INFO: renamed from: a */
    private final float f40867a;

    public mkr(float f) {
        this.f40867a = f;
    }

    @Override // p000.mkt
    /* JADX INFO: renamed from: a */
    public final float mo16491a(RectF rectF) {
        return this.f40867a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mkr) && this.f40867a == ((mkr) obj).f40867a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f40867a)});
    }
}
