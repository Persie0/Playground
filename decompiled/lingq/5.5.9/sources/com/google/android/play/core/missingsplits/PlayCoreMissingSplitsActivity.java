package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import p290o6.C7967l0;
import td.C9264l;

/* JADX INFO: loaded from: classes.dex */
public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        if (i10 == -1) {
            String packageName = getPackageName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 66);
            sb2.append("market://details?id=");
            sb2.append(packageName);
            sb2.append("&referrer=utm_source%3Dplay.core.missingsplits");
            try {
                startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(sb2.toString())).setPackage("com.android.vending"));
            } catch (ActivityNotFoundException e10) {
                String name = getClass().getName();
                int iMyUid = Process.myUid();
                int iMyPid = Process.myPid();
                StringBuilder sb3 = new StringBuilder(39);
                sb3.append("UID: [");
                sb3.append(iMyUid);
                sb3.append("]  PID: [");
                sb3.append(iMyPid);
                sb3.append("] ");
                String string = sb3.toString();
                String strConcat = name.length() != 0 ? string.concat(name) : new String(string);
                Object[] objArr = {packageName};
                if (Log.isLoggable("PlayCore", 6)) {
                    Log.e("PlayCore", C7967l0.m15807q(strConcat, "Couldn't start missing splits activity for %s", objArr), e10);
                }
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this).setTitle("Installation failed").setCancelable(false).setNeutralButton("Close", this);
        if (C9264l.m17625b(this)) {
            String string = getApplicationInfo().loadLabel(getPackageManager()).toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 91);
            sb2.append("The app ");
            sb2.append(string);
            sb2.append(" is missing required components and must be reinstalled from the Google Play Store.");
            neutralButton.setMessage(sb2.toString()).setPositiveButton("Reinstall", this);
        } else {
            String string2 = getApplicationInfo().loadLabel(getPackageManager()).toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(string2).length() + 87);
            sb3.append("The app ");
            sb3.append(string2);
            sb3.append(" is missing required components and must be reinstalled from an official store.");
            neutralButton.setMessage(sb3.toString());
        }
        neutralButton.create().show();
    }
}
