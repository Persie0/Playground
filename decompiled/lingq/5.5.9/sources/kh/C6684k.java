package kh;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import com.linguist.R;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6684k implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final int f37805a;

    /* JADX INFO: renamed from: b */
    public final boolean f37806b;

    /* JADX INFO: renamed from: c */
    public final boolean f37807c;

    public C6684k(int i10, boolean z10, boolean z11) {
        this.f37805a = i10;
        this.f37806b = z10;
        this.f37807c = z11;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f37805a);
        bundle.putBoolean("fromLesson", this.f37806b);
        bundle.putBoolean("video", this.f37807c);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return R.id.actionToListeningMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6684k)) {
            return false;
        }
        C6684k c6684k = (C6684k) obj;
        return this.f37805a == c6684k.f37805a && this.f37806b == c6684k.f37806b && this.f37807c == c6684k.f37807c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f37805a) * 31;
        boolean z10 = this.f37806b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        boolean z11 = this.f37807c;
        return i10 + (z11 ? 1 : z11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionToListeningMode(lessonId=");
        sb2.append(this.f37805a);
        sb2.append(", fromLesson=");
        sb2.append(this.f37806b);
        sb2.append(", video=");
        return C0166e.m769p(sb2, this.f37807c, ")");
    }
}
