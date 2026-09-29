package p040c4;

import android.os.Bundle;
import androidx.activity.result.C0204c;
import dm.C5207g;

/* JADX INFO: renamed from: c4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1676a implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final int f9393a;

    /* JADX INFO: renamed from: b */
    public final Bundle f9394b = new Bundle();

    public C1676a(int i10) {
        this.f9393a = i10;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        return this.f9394b;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f9393a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5207g.m11106a(C1676a.class, obj.getClass()) && this.f9393a == ((C1676a) obj).f9393a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 31 + this.f9393a;
    }

    public final String toString() {
        return C0204c.m853l(new StringBuilder("ActionOnlyNavDirections(actionId="), this.f9393a, ')');
    }
}
