package p000;

import android.widget.CompoundButton;
import com.google.android.clockwork.common.wearable.wearmaterial.button.WearChipButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iwm extends iwp {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ WearChipButton f32485a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwm(WearChipButton wearChipButton, WearChipButton wearChipButton2) {
        super(wearChipButton2);
        this.f32485a = wearChipButton;
    }

    @Override // p000.iwp
    /* JADX INFO: renamed from: j */
    public final iwo mo11828j() {
        CompoundButton compoundButton = this.f32485a.f7438k;
        return new iwo(compoundButton == null ? null : compoundButton.getAccessibilityClassName(), this.f32485a.m4593g(), null);
    }
}
