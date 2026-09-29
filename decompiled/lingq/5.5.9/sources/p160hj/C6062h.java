package p160hj;

import android.os.Bundle;
import com.linguist.R;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: hj.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C6062h implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final int f35773a;

    /* JADX INFO: renamed from: b */
    public final boolean f35774b;

    public C6062h(int i10, boolean z10) {
        this.f35773a = i10;
        this.f35774b = z10;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f35773a);
        bundle.putBoolean("isCompleting", this.f35774b);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return R.id.actionToLessonComplete;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6062h)) {
            return false;
        }
        C6062h c6062h = (C6062h) obj;
        return this.f35773a == c6062h.f35773a && this.f35774b == c6062h.f35774b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f35773a) * 31;
        boolean z10 = this.f35774b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "ActionToLessonComplete(lessonId=" + this.f35773a + ", isCompleting=" + this.f35774b + ")";
    }
}
