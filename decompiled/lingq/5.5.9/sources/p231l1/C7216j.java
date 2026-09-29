package p231l1;

import ae.C0062b;
import android.support.v4.media.C0141b;
import androidx.activity.result.C0204c;
import androidx.compose.p017ui.text.C0692c;
import androidx.compose.p017ui.text.C0693d;
import androidx.compose.p017ui.text.MultiParagraphIntrinsics;
import androidx.compose.p017ui.text.style.ResolvedTextDirection;
import dm.C5207g;
import java.util.ArrayList;
import kotlin.collections.C6752c;
import p260m8.C7499b;
import p338qd.C8573r0;
import p375s0.C8941c;
import p385sf.C9000b;
import p470x1.C10022j;

/* JADX INFO: renamed from: l1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7216j {

    /* JADX INFO: renamed from: a */
    public final C0693d f40590a;

    /* JADX INFO: renamed from: b */
    public final C0692c f40591b;

    /* JADX INFO: renamed from: c */
    public final long f40592c;

    /* JADX INFO: renamed from: d */
    public final float f40593d;

    /* JADX INFO: renamed from: e */
    public final float f40594e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f40595f;

    public C7216j(C0693d c0693d, C0692c c0692c, long j10) {
        this.f40590a = c0693d;
        this.f40591b = c0692c;
        this.f40592c = j10;
        ArrayList arrayList = c0692c.f4563h;
        float fMo2549f = 0.0f;
        this.f40593d = arrayList.isEmpty() ? 0.0f : ((C7208b) arrayList.get(0)).f40548a.mo2551h();
        ArrayList arrayList2 = c0692c.f4563h;
        if (!arrayList2.isEmpty()) {
            C7208b c7208b = (C7208b) C6752c.m13432Z(arrayList2);
            fMo2549f = c7208b.f40553f + c7208b.f40548a.mo2549f();
        }
        this.f40594e = fMo2549f;
        this.f40595f = c0692c.f4562g;
    }

    /* JADX INFO: renamed from: a */
    public final int m14532a(int i10, boolean z10) {
        C0692c c0692c = this.f40591b;
        c0692c.m2586c(i10);
        ArrayList arrayList = c0692c.f4563h;
        C7208b c7208b = (C7208b) arrayList.get(C8573r0.m16731j0(i10, arrayList));
        return c7208b.f40548a.mo2557n(i10 - c7208b.f40551d, z10) + c7208b.f40549b;
    }

    /* JADX INFO: renamed from: b */
    public final int m14533b(int i10) {
        int iM16729i0;
        C0692c c0692c = this.f40591b;
        int length = c0692c.f4556a.f4456a.length();
        ArrayList arrayList = c0692c.f4563h;
        if (i10 >= length) {
            iM16729i0 = C9000b.m17249o(arrayList);
        } else {
            iM16729i0 = i10 < 0 ? 0 : C8573r0.m16729i0(i10, arrayList);
        }
        C7208b c7208b = (C7208b) arrayList.get(iM16729i0);
        InterfaceC7207a interfaceC7207a = c7208b.f40548a;
        int i11 = c7208b.f40549b;
        return interfaceC7207a.mo2550g(C0062b.m361k0(i10, i11, c7208b.f40550c) - i11) + c7208b.f40551d;
    }

    /* JADX INFO: renamed from: c */
    public final int m14534c(float f3) {
        int iM17249o;
        C0692c c0692c = this.f40591b;
        ArrayList arrayList = c0692c.f4563h;
        if (f3 <= 0.0f) {
            iM17249o = 0;
        } else {
            iM17249o = f3 >= c0692c.f4560e ? C9000b.m17249o(arrayList) : C8573r0.m16733k0(arrayList, f3);
        }
        C7208b c7208b = (C7208b) arrayList.get(iM17249o);
        int i10 = c7208b.f40550c;
        int i11 = c7208b.f40549b;
        if (i10 - i11 == 0) {
            return Math.max(0, i11 - 1);
        }
        return c7208b.f40548a.mo2559p(f3 - c7208b.f40553f) + c7208b.f40551d;
    }

    /* JADX INFO: renamed from: d */
    public final int m14535d(int i10) {
        C0692c c0692c = this.f40591b;
        c0692c.m2586c(i10);
        ArrayList arrayList = c0692c.f4563h;
        C7208b c7208b = (C7208b) arrayList.get(C8573r0.m16731j0(i10, arrayList));
        return c7208b.f40548a.mo2556m(i10 - c7208b.f40551d) + c7208b.f40549b;
    }

    /* JADX INFO: renamed from: e */
    public final float m14536e(int i10) {
        C0692c c0692c = this.f40591b;
        c0692c.m2586c(i10);
        ArrayList arrayList = c0692c.f4563h;
        C7208b c7208b = (C7208b) arrayList.get(C8573r0.m16731j0(i10, arrayList));
        return c7208b.f40548a.mo2548e(i10 - c7208b.f40551d) + c7208b.f40553f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7216j)) {
            return false;
        }
        C7216j c7216j = (C7216j) obj;
        if (!C5207g.m11106a(this.f40590a, c7216j.f40590a) || !C5207g.m11106a(this.f40591b, c7216j.f40591b) || !C10022j.m18627a(this.f40592c, c7216j.f40592c)) {
            return false;
        }
        if (this.f40593d == c7216j.f40593d) {
            return ((this.f40594e > c7216j.f40594e ? 1 : (this.f40594e == c7216j.f40594e ? 0 : -1)) == 0) && C5207g.m11106a(this.f40595f, c7216j.f40595f);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m14537f(long j10) {
        int iM17249o;
        C0692c c0692c = this.f40591b;
        c0692c.getClass();
        float fM17165d = C8941c.m17165d(j10);
        ArrayList arrayList = c0692c.f4563h;
        if (fM17165d <= 0.0f) {
            iM17249o = 0;
        } else {
            iM17249o = C8941c.m17165d(j10) >= c0692c.f4560e ? C9000b.m17249o(arrayList) : C8573r0.m16733k0(arrayList, C8941c.m17165d(j10));
        }
        C7208b c7208b = (C7208b) arrayList.get(iM17249o);
        int i10 = c7208b.f40550c;
        int i11 = c7208b.f40549b;
        if (i10 - i11 == 0) {
            return Math.max(0, i11 - 1);
        }
        return c7208b.f40548a.mo2552i(C7499b.m14932c(C8941c.m17164c(j10), C8941c.m17165d(j10) - c7208b.f40553f)) + i11;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final ResolvedTextDirection m14538g(int i10) {
        C0692c c0692c = this.f40591b;
        MultiParagraphIntrinsics multiParagraphIntrinsics = c0692c.f4556a;
        if (!(i10 >= 0 && i10 <= multiParagraphIntrinsics.f4456a.f4523a.length())) {
            StringBuilder sbM614j = C0141b.m614j("offset(", i10, ") is out of bounds [0, ");
            sbM614j.append(multiParagraphIntrinsics.f4456a.length());
            sbM614j.append(']');
            throw new IllegalArgumentException(sbM614j.toString().toString());
        }
        int length = multiParagraphIntrinsics.f4456a.length();
        ArrayList arrayList = c0692c.f4563h;
        C7208b c7208b = (C7208b) arrayList.get(i10 == length ? C9000b.m17249o(arrayList) : C8573r0.m16729i0(i10, arrayList));
        InterfaceC7207a interfaceC7207a = c7208b.f40548a;
        int i11 = c7208b.f40549b;
        return interfaceC7207a.mo2547d(C0062b.m361k0(i10, i11, c7208b.f40550c) - i11);
    }

    public final int hashCode() {
        return this.f40595f.hashCode() + C0204c.m846e(this.f40594e, C0204c.m846e(this.f40593d, C0204c.m847f(this.f40592c, (this.f40591b.hashCode() + (this.f40590a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f40590a + ", multiParagraph=" + this.f40591b + ", size=" + ((Object) C10022j.m18629c(this.f40592c)) + ", firstBaseline=" + this.f40593d + ", lastBaseline=" + this.f40594e + ", placeholderRects=" + this.f40595f + ')';
    }
}
