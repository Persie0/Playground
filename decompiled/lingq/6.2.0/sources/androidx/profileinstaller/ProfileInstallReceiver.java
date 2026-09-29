package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import p000.ExecutorC3014fu;
import p000.cc4;
import p000.d32;
import p000.o4d;
import p000.rc1;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            d32.m10054n0(context, new ExecutorC3014fu(1), new cc4(this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        cc4 cc4Var = new cc4(this);
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        new rc1(cc4Var, 11, 2, null).run();
                        return;
                    }
                    return;
                }
                cc4 cc4Var2 = new cc4(this);
                try {
                    d32.m10028Z(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    new rc1(cc4Var2, 10, 2, null).run();
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    new rc1(cc4Var2, 7, 2, e).run();
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            cc4 cc4Var3 = new cc4(this);
            if ("DROP_SHADER_CACHE".equals(string2)) {
                o4d.m17802c(context, cc4Var3);
            } else if (!"SAVE_PROFILE".equals(string2)) {
                cc4Var3.mo3878j(16, null);
            } else {
                Process.sendSignal(extras.getInt("EXTRA_PID", Process.myPid()), 10);
                cc4Var3.mo3878j(12, null);
            }
        }
    }
}
