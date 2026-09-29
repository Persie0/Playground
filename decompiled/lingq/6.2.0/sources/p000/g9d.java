package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.C1045d;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g9d implements oad, idc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1045d f40440a;

    public /* synthetic */ g9d(C1045d c1045d) {
        this.f40440a = c1045d;
    }

    @Override // p000.oad
    /* JADX INFO: renamed from: g */
    public void mo12444g(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C1045d c1045d = this.f40440a;
        if (!zIsEmpty) {
            c1045d.mo5913d().m22076M(new jo0(this, str, str2, bundle, 11));
            return;
        }
        kjc kjcVar = c1045d.f12372l;
        if (kjcVar != null) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17924b(str2, "AppId not known when logging event");
        }
    }

    @Override // p000.idc
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void mo12445h(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.f40440a.m5888B(str, i, th, bArr, map);
    }
}
