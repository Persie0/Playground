package p338qd;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.play.core.assetpacks.C3112c;
import com.google.android.play.core.assetpacks.C3120k;
import com.kochava.tracker.BuildConfig;
import p435vd.C9710a;
import td.InterfaceC9271s;

/* JADX INFO: renamed from: qd.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8535e1 implements InterfaceC9271s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45830a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9271s f45831b;

    public /* synthetic */ C8535e1(InterfaceC9271s interfaceC9271s, int i10) {
        this.f45830a = i10;
        this.f45831b = interfaceC9271s;
    }

    @Override // td.InterfaceC9271s
    public final Object zza() {
        int i10 = this.f45830a;
        InterfaceC9271s interfaceC9271s = this.f45831b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return new C3120k((C3112c) interfaceC9271s.zza());
            case 1:
                Context contextM16807a = ((C8586v1) interfaceC9271s).m16807a();
                try {
                    Bundle bundle = contextM16807a.getPackageManager().getApplicationInfo(contextM16807a.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH).metaData;
                    if (bundle == null) {
                        return null;
                    }
                    return bundle.getString("local_testing_dir");
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            default:
                return new C9710a((Context) interfaceC9271s.zza());
        }
    }
}
