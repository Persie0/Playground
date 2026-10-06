package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mks implements mkt {

    /* JADX INFO: renamed from: a */
    private final mkt f40868a;

    /* JADX INFO: renamed from: b */
    private final float f40869b;

    public mks(float f, mkt mktVar) {
        while (mktVar instanceof mks) {
            mktVar = ((mks) mktVar).f40868a;
            f += ((mks) mktVar).f40869b;
        }
        this.f40868a = mktVar;
        this.f40869b = f;
    }

    @Override // p000.mkt
    /* JADX INFO: renamed from: a */
    public final float mo16491a(RectF rectF) {
        return Math.max(0.0f, this.f40868a.mo16491a(rectF) + this.f40869b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mks)) {
            return false;
        }
        mks mksVar = (mks) obj;
        return this.f40868a.equals(mksVar.f40868a) && this.f40869b == mksVar.f40869b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40868a, Float.valueOf(this.f40869b)});
    }
}
