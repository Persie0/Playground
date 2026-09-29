package p000;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.Pair;

/* JADX INFO: renamed from: bp */
/* JADX INFO: loaded from: classes.dex */
public final class C0819bp implements ul8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8779a;

    /* JADX INFO: renamed from: b */
    public final Object f8780b;

    public C0819bp(fs6 fs6Var) {
        this.f8779a = 1;
        this.f8780b = new LinkedHashSet();
        fs6Var.m12094I("androidx.savedstate.Restarter", this);
    }

    @Override // p000.ul8
    /* JADX INFO: renamed from: a */
    public final Bundle mo4018a() {
        int i = this.f8779a;
        Object obj = this.f8780b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC2935dp) obj).m10565l().getClass();
                return bundle;
            default:
                Bundle bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                vz1.m23613T(bundleM18160p, "classes_to_restore", u91.m22622n1((LinkedHashSet) obj));
                return bundleM18160p;
        }
    }

    public C0819bp(AbstractActivityC2935dp abstractActivityC2935dp) {
        this.f8779a = 0;
        this.f8780b = abstractActivityC2935dp;
    }
}
