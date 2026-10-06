package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqj implements aql {

    /* JADX INFO: renamed from: a */
    public final Set f2139a = new LinkedHashSet();

    public aqj(aqm aqmVar) {
        aqmVar.m1859b("androidx.savedstate.Restarter", this);
    }

    @Override // p000.aql
    /* JADX INFO: renamed from: a */
    public final Bundle mo910a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f2139a));
        return bundle;
    }
}
