package p000;

import android.util.Log;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.C0634b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n82 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52476a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ze9 f52477b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0634b f52478c;

    public /* synthetic */ n82(ze9 ze9Var, C0634b c0634b, int i) {
        this.f52476a = i;
        this.f52477b = ze9Var;
        this.f52478c = c0634b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f52476a;
        C0634b c0634b = this.f52478c;
        ze9 ze9Var = this.f52477b;
        switch (i) {
            case 0:
                if (AbstractC0638f.m2128L(2)) {
                    Log.v("FragmentManager", "Transition for operation " + ze9Var + " has completed");
                }
                ze9Var.m25573c(c0634b);
                break;
            default:
                if (AbstractC0638f.m2128L(2)) {
                    Log.v("FragmentManager", "Transition for operation " + ze9Var + " has completed");
                }
                ze9Var.m25573c(c0634b);
                break;
        }
    }
}
