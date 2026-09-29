package p060d1;

import androidx.activity.result.C0204c;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0009a;
import p375s0.C8941c;

/* JADX INFO: renamed from: d1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C5031r {

    /* JADX INFO: renamed from: a */
    public final long f32853a;

    /* JADX INFO: renamed from: b */
    public final long f32854b;

    /* JADX INFO: renamed from: c */
    public final long f32855c;

    /* JADX INFO: renamed from: d */
    public final long f32856d;

    /* JADX INFO: renamed from: e */
    public final boolean f32857e;

    /* JADX INFO: renamed from: f */
    public final float f32858f;

    /* JADX INFO: renamed from: g */
    public final int f32859g;

    /* JADX INFO: renamed from: h */
    public final boolean f32860h;

    /* JADX INFO: renamed from: i */
    public final List<C5018e> f32861i;

    /* JADX INFO: renamed from: j */
    public final long f32862j;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C5031r() {
        throw null;
    }

    public C5031r(long j10, long j11, long j12, long j13, boolean z10, float f3, int i10, boolean z11, ArrayList arrayList, long j14) {
        this.f32853a = j10;
        this.f32854b = j11;
        this.f32855c = j12;
        this.f32856d = j13;
        this.f32857e = z10;
        this.f32858f = f3;
        this.f32859g = i10;
        this.f32860h = z11;
        this.f32861i = arrayList;
        this.f32862j = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5031r)) {
            return false;
        }
        C5031r c5031r = (C5031r) obj;
        if (C5027n.m10711a(this.f32853a, c5031r.f32853a) && this.f32854b == c5031r.f32854b && C8941c.m17162a(this.f32855c, c5031r.f32855c) && C8941c.m17162a(this.f32856d, c5031r.f32856d) && this.f32857e == c5031r.f32857e && Float.compare(this.f32858f, c5031r.f32858f) == 0) {
            return (this.f32859g == c5031r.f32859g) && this.f32860h == c5031r.f32860h && C5207g.m11106a(this.f32861i, c5031r.f32861i) && C8941c.m17162a(this.f32862j, c5031r.f32862j);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final int hashCode() {
        int iM847f = C0204c.m847f(this.f32854b, Long.hashCode(this.f32853a) * 31, 31);
        int i10 = C8941c.f46891e;
        int iM847f2 = C0204c.m847f(this.f32856d, C0204c.m847f(this.f32855c, iM847f, 31), 31);
        boolean z10 = this.f32857e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM16d = C0009a.m16d(this.f32859g, C0204c.m846e(this.f32858f, (iM847f2 + r10) * 31, 31), 31);
        boolean z11 = this.f32860h;
        return Long.hashCode(this.f32862j) + C0204c.m848g(this.f32861i, (iM16d + (z11 ? 1 : z11)) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PointerInputEventData(id=");
        sb2.append((Object) C5027n.m10712b(this.f32853a));
        sb2.append(", uptime=");
        sb2.append(this.f32854b);
        sb2.append(", positionOnScreen=");
        sb2.append((Object) C8941c.m17169h(this.f32855c));
        sb2.append(", position=");
        sb2.append((Object) C8941c.m17169h(this.f32856d));
        sb2.append(", down=");
        sb2.append(this.f32857e);
        sb2.append(", pressure=");
        sb2.append(this.f32858f);
        sb2.append(", type=");
        int i10 = this.f32859g;
        if (i10 == 1) {
            str = "Touch";
        } else if (i10 == 2) {
            str = "Mouse";
        } else if (i10 != 3) {
            str = i10 != 4 ? "Unknown" : "Eraser";
        } else {
            str = "Stylus";
        }
        sb2.append((Object) str);
        sb2.append(", issuesEnterExit=");
        sb2.append(this.f32860h);
        sb2.append(", historical=");
        sb2.append(this.f32861i);
        sb2.append(", scrollDelta=");
        sb2.append((Object) C8941c.m17169h(this.f32862j));
        sb2.append(')');
        return sb2.toString();
    }
}
