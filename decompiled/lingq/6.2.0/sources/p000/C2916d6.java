package p000;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.Pair;

/* JADX INFO: renamed from: d6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2916d6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f35027a;

    /* JADX INFO: renamed from: b */
    public final Bundle f35028b;

    public C2916d6(int i) {
        this.f35027a = i;
        Pair[] pairArr = new Pair[0];
        this.f35028b = omd.m18160p((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        return this.f35028b;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f35027a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2916d6.class.equals(obj.getClass()) && this.f35027a == ((C2916d6) obj).f35027a;
    }

    public final int hashCode() {
        return 31 + this.f35027a;
    }

    public final String toString() {
        return wq1.m24122r(new StringBuilder("ActionOnlyNavDirections(actionId="), this.f35027a, ')');
    }
}
