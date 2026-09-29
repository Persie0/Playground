package p337qc;

import android.widget.CompoundButton;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.chip.Chip;
import com.lingq.p055ui.home.notifications.NotificationsDailyLingQFragment;

/* JADX INFO: renamed from: qc.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8518a implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45782a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f45783b;

    public /* synthetic */ C8518a(int i10, Object obj) {
        this.f45782a = i10;
        this.f45783b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        int i10 = this.f45782a;
        Object obj = this.f45783b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) obj).f15027i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
                }
                break;
            default:
                NotificationsDailyLingQFragment.m9964u0((NotificationsDailyLingQFragment) obj, z10);
                break;
        }
    }
}
