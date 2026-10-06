package p000;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class lkk implements lkj {

    /* JADX INFO: renamed from: a */
    private final Context f38488a;

    public lkk(Context context) {
        this.f38488a = context;
    }

    @Override // p000.lkj
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ List mo15557a(int i, int i2, String str, long j) {
        return m15558b(0, 0, str, j);
    }

    /* JADX INFO: renamed from: b */
    public mws m15558b(int i, int i2, String str, long j) {
        int i3;
        ActivityManager activityManager = (ActivityManager) this.f38488a.getSystemService("activity");
        activityManager.getClass();
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(this.f38488a.getPackageName(), 0, 0);
        mwn mwnVarM17090e = mws.m17090e();
        for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
            if (applicationExitInfo.getProcessName().equals(str) && applicationExitInfo.getTimestamp() == j) {
                return mwnVarM17090e.m17081f();
            }
            nxl nxlVarM18137O = oyw.f46872j.m18137O();
            String processName = applicationExitInfo.getProcessName();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            oyw oywVar = (oyw) nxlVarM18137O.f44974b;
            processName.getClass();
            oywVar.f46874a |= 1;
            oywVar.f46875b = processName;
            int status = applicationExitInfo.getStatus();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            oyw oywVar2 = (oyw) nxlVarM18137O.f44974b;
            int i4 = 4;
            oywVar2.f46874a |= 4;
            oywVar2.f46877d = status;
            long timestamp = applicationExitInfo.getTimestamp();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            oyw oywVar3 = (oyw) nxlVarM18137O.f44974b;
            oywVar3.f46874a |= 16;
            oywVar3.f46879f = timestamp;
            long pss = applicationExitInfo.getPss();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            oyw oywVar4 = (oyw) nxlVarM18137O.f44974b;
            oywVar4.f46874a |= 32;
            oywVar4.f46880g = pss;
            long rss = applicationExitInfo.getRss();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            oyw oywVar5 = (oyw) nxlVarM18137O.f44974b;
            oywVar5.f46874a |= 64;
            oywVar5.f46881h = rss;
            boolean zIsLowMemoryKillReportSupported = ActivityManager.isLowMemoryKillReportSupported();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            oyw oywVar6 = (oyw) nxlVarM18137O.f44974b;
            oywVar6.f46874a |= 128;
            oywVar6.f46882i = zIsLowMemoryKillReportSupported;
            switch (applicationExitInfo.getReason()) {
                case 0:
                    i3 = 15;
                    break;
                case 1:
                    i3 = 2;
                    break;
                case 2:
                    i3 = 3;
                    break;
                case 3:
                    i3 = 4;
                    break;
                case 4:
                    i3 = 5;
                    break;
                case 5:
                    i3 = 6;
                    break;
                case 6:
                    i3 = 7;
                    break;
                case 7:
                    i3 = 8;
                    break;
                case 8:
                    i3 = 9;
                    break;
                case 9:
                    i3 = 10;
                    break;
                case 10:
                    i3 = 11;
                    break;
                case 11:
                    i3 = 12;
                    break;
                case 12:
                    i3 = 13;
                    break;
                case 13:
                    i3 = 14;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            if (i3 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                oyw oywVar7 = (oyw) nxlVarM18137O.f44974b;
                oywVar7.f46876c = i3 - 1;
                oywVar7.f46874a |= 2;
            }
            switch (applicationExitInfo.getImportance()) {
                case 100:
                    i4 = 2;
                    break;
                case C0100R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                    i4 = 3;
                    break;
                case 200:
                    i4 = 5;
                    break;
                case 230:
                    i4 = 6;
                    break;
                case 300:
                    i4 = 8;
                    break;
                case 325:
                    break;
                case 350:
                    i4 = 7;
                    break;
                case 400:
                    i4 = 9;
                    break;
                case 1000:
                    i4 = 10;
                    break;
                default:
                    i4 = 0;
                    break;
            }
            if (i4 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                oyw oywVar8 = (oyw) nxlVarM18137O.f44974b;
                oywVar8.f46878e = i4 - 1;
                oywVar8.f46874a |= 8;
            }
            mwnVarM17090e.m17082g((oyw) nxlVarM18137O.mo18103l());
        }
        return mwnVarM17090e.m17081f();
    }
}
