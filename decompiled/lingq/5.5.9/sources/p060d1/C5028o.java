package p060d1;

import java.util.List;
import kotlin.collections.EmptyList;
import p375s0.C8941c;

/* JADX INFO: renamed from: d1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C5028o {

    /* JADX INFO: renamed from: a */
    public final long f32835a;

    /* JADX INFO: renamed from: b */
    public final long f32836b;

    /* JADX INFO: renamed from: c */
    public final long f32837c;

    /* JADX INFO: renamed from: d */
    public final boolean f32838d;

    /* JADX INFO: renamed from: e */
    public final long f32839e;

    /* JADX INFO: renamed from: f */
    public final long f32840f;

    /* JADX INFO: renamed from: g */
    public final boolean f32841g;

    /* JADX INFO: renamed from: h */
    public final int f32842h;

    /* JADX INFO: renamed from: i */
    public final long f32843i;

    /* JADX INFO: renamed from: j */
    public final Float f32844j;

    /* JADX INFO: renamed from: k */
    public final List<C5018e> f32845k;

    /* JADX INFO: renamed from: l */
    public C5017d f32846l;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C5028o() {
        throw null;
    }

    public C5028o(long j10, long j11, long j12, boolean z10, float f3, long j13, long j14, boolean z11, int i10, List list, long j15) {
        this(j10, j11, j12, z10, f3, j13, j14, z11, false, i10, j15);
        this.f32845k = list;
    }

    public C5028o(long j10, long j11, long j12, boolean z10, float f3, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f32835a = j10;
        this.f32836b = j11;
        this.f32837c = j12;
        this.f32838d = z10;
        this.f32839e = j13;
        this.f32840f = j14;
        this.f32841g = z11;
        this.f32842h = i10;
        this.f32843i = j15;
        this.f32846l = new C5017d(z12, z12);
        this.f32844j = Float.valueOf(f3);
    }

    /* JADX INFO: renamed from: a */
    public final void m10713a() {
        C5017d c5017d = this.f32846l;
        c5017d.f32809b = true;
        c5017d.f32808a = true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10714b() {
        C5017d c5017d = this.f32846l;
        if (!c5017d.f32809b && !c5017d.f32808a) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) C5027n.m10712b(this.f32835a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f32836b);
        sb2.append(", position=");
        sb2.append((Object) C8941c.m17169h(this.f32837c));
        sb2.append(", pressed=");
        sb2.append(this.f32838d);
        sb2.append(", pressure=");
        Float f3 = this.f32844j;
        sb2.append(f3 != null ? f3.floatValue() : 0.0f);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f32839e);
        sb2.append(", previousPosition=");
        sb2.append((Object) C8941c.m17169h(this.f32840f));
        sb2.append(", previousPressed=");
        sb2.append(this.f32841g);
        sb2.append(", isConsumed=");
        sb2.append(m10714b());
        sb2.append(", type=");
        int i10 = this.f32842h;
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
        sb2.append(", historical=");
        Object obj = this.f32845k;
        if (obj == null) {
            obj = EmptyList.f38032a;
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append((Object) C8941c.m17169h(this.f32843i));
        sb2.append(')');
        return sb2.toString();
    }
}
