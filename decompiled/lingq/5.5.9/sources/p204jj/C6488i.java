package p204jj;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import com.linguist.R;
import p003a2.C0009a;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: jj.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C6488i implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final int f37090a;

    /* JADX INFO: renamed from: b */
    public final int f37091b;

    /* JADX INFO: renamed from: c */
    public final boolean f37092c;

    public C6488i(int i10, int i11, boolean z10) {
        this.f37090a = i10;
        this.f37091b = i11;
        this.f37092c = z10;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f37090a);
        bundle.putInt("sentenceIndex", this.f37091b);
        bundle.putBoolean("hasAudio", this.f37092c);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return R.id.actionToEditSentence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6488i)) {
            return false;
        }
        C6488i c6488i = (C6488i) obj;
        return this.f37090a == c6488i.f37090a && this.f37091b == c6488i.f37091b && this.f37092c == c6488i.f37092c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f37091b, Integer.hashCode(this.f37090a) * 31, 31);
        boolean z10 = this.f37092c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iM16d + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionToEditSentence(lessonId=");
        sb2.append(this.f37090a);
        sb2.append(", sentenceIndex=");
        sb2.append(this.f37091b);
        sb2.append(", hasAudio=");
        return C0166e.m769p(sb2, this.f37092c, ")");
    }
}
