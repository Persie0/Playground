package p169i4;

import android.content.pm.PackageManager;
import androidx.profileinstaller.C1094c;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.drm.InterfaceC2398b;

/* JADX INFO: renamed from: i4.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6179e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36027a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f36028b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f36029c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f36030d;

    public /* synthetic */ RunnableC6179e(ProfileInstallReceiver.C1088a c1088a, int i10, PackageManager.NameNotFoundException nameNotFoundException) {
        this.f36029c = c1088a;
        this.f36028b = i10;
        this.f36030d = nameNotFoundException;
    }

    public /* synthetic */ RunnableC6179e(InterfaceC2398b.a aVar, InterfaceC2398b interfaceC2398b, int i10) {
        this.f36029c = aVar;
        this.f36030d = interfaceC2398b;
        this.f36028b = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f36027a;
        Object obj = this.f36030d;
        int i11 = this.f36028b;
        Object obj2 = this.f36029c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((C1094c.c) obj2).mo4042b(i11, obj);
                break;
            default:
                InterfaceC2398b.a aVar = (InterfaceC2398b.a) obj2;
                InterfaceC2398b interfaceC2398b = (InterfaceC2398b) obj;
                int i12 = aVar.f12200a;
                interfaceC2398b.getClass();
                interfaceC2398b.mo6963o0(i12, aVar.f12201b, i11);
                break;
        }
    }
}
