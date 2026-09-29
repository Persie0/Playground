package p000;

import android.os.Bundle;
import com.google.common.collect.ImmutableSet;
import com.google.protobuf.C1191l;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zvb implements InterfaceC3434os {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cdb f72289a;

    public zvb(cdb cdbVar) {
        this.f72289a = cdbVar;
    }

    @Override // p000.eqc
    /* JADX INFO: renamed from: a */
    public final void mo10094a(long j, Bundle bundle, String str, String str2) {
        cdb cdbVar = this.f72289a;
        if (((HashSet) cdbVar.f9945b).contains(str2)) {
            Bundle bundle2 = new Bundle();
            ImmutableSet immutableSet = urb.f64252a;
            String strM6880e = C1191l.m6880e(str2, AbstractC3184kh.f47276r, AbstractC3184kh.f47271m);
            if (strM6880e != null) {
                str2 = strM6880e;
            }
            bundle2.putString("events", str2);
            ((b64) cdbVar.f9946c).m3367t(2, bundle2);
        }
    }
}
