package de;

import android.os.Bundle;
import p031bc.C1356a;
import p155he.C6038b;

/* JADX INFO: renamed from: de.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5157d implements C1356a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5158e f33154a;

    public C5157d(C5158e c5158e) {
        this.f33154a = c5158e;
    }

    @Override // cc.InterfaceC1799d5
    /* JADX INFO: renamed from: a */
    public final void mo5571a(long j10, Bundle bundle, String str, String str2) {
        if (str == null || !(!C5154a.f33147a.contains(str2))) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        ((C6038b) this.f33154a.f33155a).m12475a(3, bundle2);
    }
}
