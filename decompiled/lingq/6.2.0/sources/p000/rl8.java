package p000;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.AbstractC3192a;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class rl8 implements ul8 {

    /* JADX INFO: renamed from: a */
    public final fs6 f59498a;

    /* JADX INFO: renamed from: b */
    public boolean f59499b;

    /* JADX INFO: renamed from: c */
    public Bundle f59500c;

    /* JADX INFO: renamed from: d */
    public final cs4 f59501d;

    public rl8(fs6 fs6Var, dua duaVar) {
        fs6Var.getClass();
        this.f59498a = fs6Var;
        this.f59501d = AbstractC3192a.m15356a(new y47(duaVar, 7));
    }

    @Override // p000.ul8
    /* JADX INFO: renamed from: a */
    public final Bundle mo4018a() {
        Bundle bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.f59500c;
        if (bundle != null) {
            bundleM18160p.putAll(bundle);
        }
        for (Map.Entry entry : ((sl8) this.f59501d.getValue()).f60981b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo4018a = ((mc1) ((nl8) entry.getValue()).f52924b.f66369e).mo4018a();
            if (!bundleMo4018a.isEmpty()) {
                str.getClass();
                bundleM18160p.putBundle(str, bundleMo4018a);
            }
        }
        this.f59499b = false;
        return bundleM18160p;
    }

    /* JADX INFO: renamed from: b */
    public final void m20706b() {
        if (this.f59499b) {
            return;
        }
        Bundle bundleM12108m = this.f59498a.m12108m("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.f59500c;
        if (bundle != null) {
            bundleM18160p.putAll(bundle);
        }
        if (bundleM12108m != null) {
            bundleM18160p.putAll(bundleM12108m);
        }
        this.f59500c = bundleM18160p;
        this.f59499b = true;
    }
}
