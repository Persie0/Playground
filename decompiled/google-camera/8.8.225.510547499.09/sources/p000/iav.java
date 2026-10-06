package p000;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.camera.camcorder.p008ui.modeslider.recordspeed.RecordSpeedSlider;
import com.google.android.apps.camera.p014ui.modeslider.ModeSlider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iav implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30184a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LinearLayout f30185b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f30186c;

    public /* synthetic */ iav(RecordSpeedSlider recordSpeedSlider, int i, int i2) {
        this.f30186c = i2;
        this.f30185b = recordSpeedSlider;
        this.f30184a = i;
    }

    public /* synthetic */ iav(ModeSlider modeSlider, int i, int i2) {
        this.f30186c = i2;
        this.f30185b = modeSlider;
        this.f30184a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f30186c) {
            case 0:
                LinearLayout linearLayout = this.f30185b;
                int i = this.f30184a;
                ModeSlider modeSlider = (ModeSlider) linearLayout;
                modeSlider.f7051a.mo5805c(true);
                modeSlider.m4382l(i, true);
                modeSlider.f7051a.mo5804b(linearLayout, true);
                break;
            default:
                LinearLayout linearLayout2 = this.f30185b;
                int i2 = this.f30184a;
                RecordSpeedSlider recordSpeedSlider = (RecordSpeedSlider) linearLayout2;
                recordSpeedSlider.f6578d.mo5805c(true);
                recordSpeedSlider.m4076g(i2, true);
                recordSpeedSlider.f6578d.mo5804b(linearLayout2, true);
                break;
        }
    }
}
