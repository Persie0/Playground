package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jab extends izs {

    /* JADX INFO: renamed from: a */
    private final izi f33550a;

    public jab(izv izvVar) {
        super(izvVar);
        this.f33550a = new izi();
    }

    @Override // p000.izs
    /* JADX INFO: renamed from: a */
    protected final void mo11918a() {
        izo izoVarM11925e = m11925e();
        if (izoVarM11925e.f32720d == null) {
            synchronized (izoVarM11925e) {
                if (izoVarM11925e.f32720d == null) {
                    izi iziVar = new izi();
                    PackageManager packageManager = izoVarM11925e.f32718b.getPackageManager();
                    String packageName = izoVarM11925e.f32718b.getPackageName();
                    iziVar.f32711c = packageName;
                    iziVar.f32712d = packageManager.getInstallerPackageName(packageName);
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(izoVarM11925e.f32718b.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            try {
                                str = packageInfo.versionName;
                            } catch (PackageManager.NameNotFoundException e) {
                                Log.e("GAv4", "Error retrieving package info: appName set to " + packageName);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                    }
                    iziVar.f32709a = packageName;
                    iziVar.f32710b = str;
                    izoVarM11925e.f32720d = iziVar;
                }
            }
        }
        izi iziVar2 = izoVarM11925e.f32720d;
        izi iziVar3 = this.f33550a;
        if (!TextUtils.isEmpty(iziVar2.f32709a)) {
            iziVar3.f32709a = iziVar2.f32709a;
        }
        if (!TextUtils.isEmpty(iziVar2.f32710b)) {
            iziVar3.f32710b = iziVar2.f32710b;
        }
        if (!TextUtils.isEmpty(iziVar2.f32711c)) {
            iziVar3.f32711c = iziVar2.f32711c;
        }
        if (!TextUtils.isEmpty(iziVar2.f32712d)) {
            iziVar3.f32712d = iziVar2.f32712d;
        }
        jaz jazVarM11931k = m11931k();
        jazVarM11931k.m11946z();
        String str2 = jazVarM11931k.f33637c;
        if (str2 != null) {
            this.f33550a.f32709a = str2;
        }
        jazVarM11931k.m11946z();
        String str3 = jazVarM11931k.f33636a;
        if (str3 != null) {
            this.f33550a.f32710b = str3;
        }
    }
}
