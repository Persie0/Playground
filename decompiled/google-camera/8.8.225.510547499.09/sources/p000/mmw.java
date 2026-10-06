package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mmw extends mna {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mmx f41071a;

    public mmw(mmx mmxVar, khb khbVar, byte[] bArr, byte[] bArr2) {
        this.f41071a = mmxVar;
        new mav("OnRequestInstallCallback");
        super(mmxVar, khbVar, null, null);
    }

    @Override // p000.mna
    /* JADX INFO: renamed from: c */
    public final void mo16642c(Bundle bundle) {
        super.mo16642c(bundle);
        if (mmx.m16643a(bundle) != 0) {
            this.f41092c.m14244j(new mnd(mmx.m16643a(bundle)));
            return;
        }
        khb khbVar = this.f41092c;
        mmx mmxVar = this.f41071a;
        int i = bundle.getInt("version.code", -1);
        int i2 = bundle.getInt("update.availability");
        int i3 = bundle.getInt("install.status", 0);
        Integer numValueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        bundle.getInt("in.app.update.priority", 0);
        bundle.getLong("bytes.downloaded");
        bundle.getLong("total.bytes.to.download");
        bundle.getLong("additional.size.required");
        mav.m16283f(new File(((Context) mmxVar.f41077e.f39742a).getFilesDir(), "assetpacks"));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        HashMap map = new HashMap();
        map.put("blocking.destructive.intent", mmx.m16646d(bundle.getIntegerArrayList(lkm.m15584k("blocking.destructive.intent"))));
        map.put("nonblocking.destructive.intent", mmx.m16646d(bundle.getIntegerArrayList(lkm.m15584k("nonblocking.destructive.intent"))));
        map.put("blocking.intent", mmx.m16646d(bundle.getIntegerArrayList(lkm.m15584k("blocking.intent"))));
        map.put("nonblocking.intent", mmx.m16646d(bundle.getIntegerArrayList(lkm.m15584k("nonblocking.intent"))));
        khbVar.m14245k(new mmq(i, i2, i3, numValueOf, pendingIntent));
    }
}
