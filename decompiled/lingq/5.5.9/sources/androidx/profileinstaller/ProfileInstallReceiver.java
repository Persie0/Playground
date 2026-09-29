package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import p169i4.RunnableC6179e;
import p208k.ExecutorC6558a;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    public class C1088a implements C1094c.c {
        public C1088a() {
        }

        @Override // androidx.profileinstaller.C1094c.c
        /* JADX INFO: renamed from: a */
        public final void mo4041a() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }

        @Override // androidx.profileinstaller.C1094c.c
        /* JADX INFO: renamed from: b */
        public final void mo4042b(int i10, Object obj) {
            C1094c.f6892b.mo4042b(i10, obj);
            ProfileInstallReceiver.this.setResultCode(i10);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws IOException {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            C1094c.m4049b(context, new ExecutorC6558a(1), new C1088a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    C1088a c1088a = new C1088a();
                    try {
                        C1094c.m4048a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        new RunnableC6179e(c1088a, 10, (PackageManager.NameNotFoundException) null).run();
                        return;
                    } catch (PackageManager.NameNotFoundException e10) {
                        new RunnableC6179e(c1088a, 7, e10).run();
                        return;
                    }
                }
                if ("DELETE_SKIP_FILE".equals(string)) {
                    C1088a c1088a2 = new C1088a();
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    new RunnableC6179e(c1088a2, 11, (PackageManager.NameNotFoundException) null).run();
                }
            }
        } else {
            boolean zEquals = "androidx.profileinstaller.action.SAVE_PROFILE".equals(action);
            C1094c.b bVar = C1094c.f6892b;
            if (zEquals) {
                Process.sendSignal(Process.myPid(), 10);
                bVar.mo4042b(12, null);
                setResultCode(12);
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                if ("DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
                    if (C1092a.m4045a(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                        bVar.mo4042b(14, null);
                        setResultCode(14);
                        return;
                    } else {
                        bVar.mo4042b(15, null);
                        setResultCode(15);
                        return;
                    }
                }
                bVar.mo4042b(16, null);
                setResultCode(16);
            }
        }
    }
}
