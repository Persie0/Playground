package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class kg7 {

    /* JADX INFO: renamed from: a */
    public final long f47235a;

    /* JADX INFO: renamed from: b */
    public final long f47236b;

    /* JADX INFO: renamed from: c */
    public final long f47237c;

    /* JADX INFO: renamed from: d */
    public final boolean f47238d;

    /* JADX INFO: renamed from: e */
    public final float f47239e;

    /* JADX INFO: renamed from: f */
    public final long f47240f;

    /* JADX INFO: renamed from: g */
    public final long f47241g;

    /* JADX INFO: renamed from: h */
    public final boolean f47242h;

    /* JADX INFO: renamed from: i */
    public final int f47243i;

    /* JADX INFO: renamed from: j */
    public final long f47244j;

    /* JADX INFO: renamed from: k */
    public final float f47245k;

    /* JADX INFO: renamed from: l */
    public final long f47246l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f47247m;

    /* JADX INFO: renamed from: n */
    public final long f47248n;

    /* JADX INFO: renamed from: o */
    public boolean f47249o;

    /* JADX INFO: renamed from: p */
    public boolean f47250p;

    /* JADX INFO: renamed from: q */
    public kg7 f47251q;

    public kg7(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.f47235a = j;
        this.f47236b = j2;
        this.f47237c = j3;
        this.f47238d = z;
        this.f47239e = f;
        this.f47240f = j4;
        this.f47241g = j5;
        this.f47242h = z2;
        this.f47243i = i;
        this.f47244j = j6;
        this.f47245k = f2;
        this.f47246l = j7;
        this.f47248n = 0L;
        this.f47249o = z3;
        this.f47250p = z3;
    }

    /* JADX INFO: renamed from: a */
    public final void m15189a() {
        kg7 kg7Var = this.f47251q;
        if (kg7Var == null) {
            this.f47249o = true;
            this.f47250p = true;
        } else if (kg7Var != null) {
            kg7Var.m15189a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final List m15190b() {
        ArrayList arrayList = this.f47247m;
        return arrayList == null ? EmptyList.f47638a : arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15191c() {
        kg7 kg7Var = this.f47251q;
        if (kg7Var != null) {
            return kg7Var.m15191c();
        }
        return this.f47249o || this.f47250p;
    }

    public final String toString() {
        return "PointerInputChange(id=" + ((Object) pk9.m19382y(this.f47235a)) + ", uptimeMillis=" + this.f47236b + ", position=" + ((Object) gq6.m12827h(this.f47237c)) + ", pressed=" + this.f47238d + ", pressure=" + this.f47239e + ", previousUptimeMillis=" + this.f47240f + ", previousPosition=" + ((Object) gq6.m12827h(this.f47241g)) + ", previousPressed=" + this.f47242h + ", isConsumed=" + m15191c() + ", type=" + ((Object) rg7.m20659a(this.f47243i)) + ", historical=" + m15190b() + ", scrollDelta=" + ((Object) gq6.m12827h(this.f47244j)) + ", scaleFactor=" + this.f47245k + ", panOffset=" + ((Object) gq6.m12827h(this.f47246l)) + ')';
    }

    public kg7(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.f47247m = arrayList;
        this.f47248n = j8;
    }
}
