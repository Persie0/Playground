package de;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzjb;
import dm.C5212l;
import p031bc.C1356a;
import p155he.C6038b;
import p338qd.C8573r0;

/* JADX INFO: renamed from: de.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5155b implements C1356a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5156c f33151a;

    public C5155b(C5156c c5156c) {
        this.f33151a = c5156c;
    }

    @Override // cc.InterfaceC1799d5
    /* JADX INFO: renamed from: a */
    public final void mo5571a(long j10, Bundle bundle, String str, String str2) {
        C5156c c5156c = this.f33151a;
        if (c5156c.f33152a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            zzjb zzjbVar = C5154a.f33147a;
            String strM16751q1 = C8573r0.m16751q1(str2, C5212l.f33285d, C5212l.f33283b);
            if (strM16751q1 != null) {
                str2 = strM16751q1;
            }
            bundle2.putString("events", str2);
            ((C6038b) c5156c.f33153b).m12475a(2, bundle2);
        }
    }
}
