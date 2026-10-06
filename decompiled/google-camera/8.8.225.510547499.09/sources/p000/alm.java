package p000;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class alm implements aql {

    /* JADX INFO: renamed from: a */
    public Bundle f646a;

    /* JADX INFO: renamed from: b */
    private final aqm f647b;

    /* JADX INFO: renamed from: c */
    private boolean f648c;

    /* JADX INFO: renamed from: d */
    private final ojy f649d;

    public alm(aqm aqmVar, alw alwVar) {
        this.f647b = aqmVar;
        this.f649d = lkm.m15593t(new C0910po(alwVar, 4));
    }

    /* JADX INFO: renamed from: c */
    private final aln m914c() {
        return (aln) this.f649d.mo18586a();
    }

    @Override // p000.aql
    /* JADX INFO: renamed from: a */
    public final Bundle mo910a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f646a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : m914c().f650a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo910a = ((alj) entry.getValue()).f640f.mo910a();
            if (!ooc.m18737c(bundleMo910a, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleMo910a);
            }
        }
        this.f648c = false;
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public final void m915b() {
        if (this.f648c) {
            return;
        }
        this.f646a = this.f647b.m1858a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.f648c = true;
        m914c();
    }
}
