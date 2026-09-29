package p000;

import android.content.DialogInterface;
import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$ValueOnOrNot;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.feature.library.preview.LessonPreviewFragment;
import com.lingq.p020ui.C2889e;
import com.lingq.p020ui.MainActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o5a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53871a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f53872b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Enum f53873c;

    public /* synthetic */ o5a(Object obj, Enum r2, int i) {
        this.f53871a = i;
        this.f53872b = obj;
        this.f53873c = r2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f53871a;
        Enum r2 = this.f53873c;
        Object obj = this.f53872b;
        switch (i2) {
            case 0:
                TooltipStep tooltipStep = (TooltipStep) r2;
                dialogInterface.dismiss();
                MainActivity mainActivity = ((ro5) ((v48) obj).f64849f).f59652a;
                int i3 = MainActivity.f33994m0;
                Bundle bundle = new Bundle();
                bundle.putString("Is Premium", (mainActivity.m9802q().f34200b.mo4593p0() ? LqAnalyticsValues$ValueOnOrNot.Yes : LqAnalyticsValues$ValueOnOrNot.No).getValue());
                bundle.putString("Tooltip step", tooltipStep.name());
                ((C1240a) mainActivity.m9800n()).m7025f("Tutorial step skipped", bundle);
                C2889e c2889eM9802q = mainActivity.m9802q();
                c2889eM9802q.getClass();
                c2889eM9802q.f34202d.mo8742L(tooltipStep);
                break;
            case 1:
                TooltipStep tooltipStep2 = (TooltipStep) r2;
                MainActivity mainActivity2 = ((ro5) ((v48) obj).f64850g).f59652a;
                int i4 = MainActivity.f33994m0;
                Bundle bundle2 = new Bundle();
                bundle2.putString("Is Premium", (mainActivity2.m9802q().f34200b.mo4593p0() ? LqAnalyticsValues$ValueOnOrNot.Yes : LqAnalyticsValues$ValueOnOrNot.No).getValue());
                bundle2.putString("Tooltip step", tooltipStep2.name());
                ((C1240a) mainActivity2.m9800n()).m7025f("Tutorial quit", bundle2);
                mainActivity2.m9802q().mo8759d1();
                break;
            default:
                bh4[] bh4VarArr = LessonPreviewFragment.f26702G0;
                dialogInterface.dismiss();
                ((LessonPreviewFragment) obj).m9083i0().f26766c.mo3737M1((UpgradeReason) r2);
                break;
        }
    }
}
