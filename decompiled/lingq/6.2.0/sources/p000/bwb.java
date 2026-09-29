package p000;

import android.content.Intent;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import com.google.mlkit.vision.documentscanner.internal.GmsDocumentScanningDelegateActivity;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bwb implements yr6, InterfaceC2991f7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GmsDocumentScanningDelegateActivity f9106a;

    public /* synthetic */ bwb(GmsDocumentScanningDelegateActivity gmsDocumentScanningDelegateActivity) {
        this.f9106a = gmsDocumentScanningDelegateActivity;
    }

    @Override // p000.InterfaceC2991f7
    /* JADX INFO: renamed from: c */
    public void mo2125c(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        GmsDocumentScanningDelegateActivity gmsDocumentScanningDelegateActivity = this.f9106a;
        bec becVar = new bec(gmsDocumentScanningDelegateActivity.getApplicationContext());
        int i = activityResult.f1007a;
        Intent intent = activityResult.f1008b;
        wr9 wr9Var = new wr9();
        bec.f8446b.execute(new RunnableC3626tw(i, 1, becVar, intent, wr9Var));
        web webVar = new web(gmsDocumentScanningDelegateActivity);
        tld tldVar = wr9Var.f67208a;
        tldVar.getClass();
        tldVar.mo5963e(xr9.f68587a, webVar);
        tldVar.mo5961c(new bwb(gmsDocumentScanningDelegateActivity));
    }

    @Override // p000.yr6
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void mo321m(Exception exc) {
        if (Log.isLoggable("GmsDocScanDelAct", 6)) {
            Log.e("GmsDocScanDelAct", "Failed to handle scanning result", exc);
        }
        this.f9106a.m6779k();
    }
}
