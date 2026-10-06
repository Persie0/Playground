package p000;

import android.widget.CompoundButton;
import com.google.android.clockwork.common.wearable.wearmaterial.button.WearChipButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iwl extends iwp {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ WearChipButton f32484a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwl(WearChipButton wearChipButton, WearChipButton wearChipButton2) {
        super(wearChipButton2);
        this.f32484a = wearChipButton;
    }

    @Override // p000.iwp
    /* JADX INFO: renamed from: j */
    public final iwo mo11828j() {
        CompoundButton compoundButton = this.f32484a.f7438k;
        CharSequence accessibilityClassName = compoundButton != null ? compoundButton.getAccessibilityClassName() : null;
        CharSequence charSequenceM4593g = this.f32484a.m4593g();
        WearChipButton wearChipButton = this.f32484a;
        return new iwo(accessibilityClassName, charSequenceM4593g, wearChipButton.f7437j.getVisibility() == 0 ? wearChipButton.f7437j.getText() : "");
    }
}
