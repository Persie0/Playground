package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import p000.ajd;
import p000.b4c;
import p000.gp0;
import p000.kd8;
import p000.tld;
import p000.vzc;
import p000.wr9;
import p000.yic;

/* JADX INFO: renamed from: com.google.android.play.core.review.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1075b implements kd8 {

    /* JADX INFO: renamed from: a */
    public final yic f13358a;

    /* JADX INFO: renamed from: b */
    public final Handler f13359b = new Handler(Looper.getMainLooper());

    public C1075b(yic yicVar) {
        this.f13358a = yicVar;
    }

    @Override // p000.kd8
    /* JADX INFO: renamed from: b */
    public final tld mo6255b(Activity activity, ReviewInfo reviewInfo) {
        if (((zza) reviewInfo).f13364b) {
            return Tasks.m5975c(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", ((zza) reviewInfo).f13363a);
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        wr9 wr9Var = new wr9();
        intent.putExtra("result_receiver", new zzc(this.f13359b, wr9Var));
        activity.startActivity(intent);
        return wr9Var.f67208a;
    }

    @Override // p000.kd8
    /* JADX INFO: renamed from: g */
    public final tld mo6256g() {
        yic yicVar = this.f13358a;
        String str = yicVar.f69887b;
        gp0 gp0Var = yic.f69885c;
        gp0Var.m12786b("requestInAppReview (%s)", str);
        ajd ajdVar = yicVar.f69886a;
        if (ajdVar == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", gp0.m12785d(gp0Var.f41124b, "Play Store app is either not installed or not the official version", objArr));
            }
            return Tasks.m5974b(new ReviewException(-1));
        }
        wr9 wr9Var = new wr9();
        ajdVar.m507a().post(new vzc(ajdVar, wr9Var, wr9Var, new b4c(yicVar, wr9Var, wr9Var)));
        return wr9Var.f67208a;
    }
}
