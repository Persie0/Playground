package p000;

import android.R;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.R$string;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class c11 extends xw2 {

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Chip f9304L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c11(Chip chip, Chip chip2) {
        super(chip2);
        this.f9304L = chip;
    }

    @Override // p000.xw2
    /* JADX INFO: renamed from: n */
    public final int mo4267n(float f, float f2) {
        int i = Chip.f12852R;
        Chip chip = this.f9304L;
        return (chip.m6102d() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
    }

    @Override // p000.xw2
    /* JADX INFO: renamed from: o */
    public final void mo4268o(ArrayList arrayList) {
        f11 f11Var;
        arrayList.add(0);
        int i = Chip.f12852R;
        Chip chip = this.f9304L;
        if (!chip.m6102d() || (f11Var = chip.f12866e) == null || !f11Var.f38222p0 || chip.f12869h == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // p000.xw2
    /* JADX INFO: renamed from: r */
    public final boolean mo4269r(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.f9304L;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f12869h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.f12862N) {
                    chip.f12861M.m24723w(1, 1);
                }
            }
        }
        return z;
    }

    @Override // p000.xw2
    /* JADX INFO: renamed from: s */
    public final void mo4270s(C0797b4 c0797b4) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0797b4.f7900a;
        Chip chip = this.f9304L;
        f11 f11Var = chip.f12866e;
        accessibilityNodeInfo.setCheckable(f11Var != null && f11Var.f38228v0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c0797b4.m3279j(chip.getAccessibilityClassName());
        c0797b4.m3284o(chip.getText());
    }

    @Override // p000.xw2
    /* JADX INFO: renamed from: t */
    public final void mo4271t(int i, C0797b4 c0797b4) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0797b4.f7900a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            c0797b4.m3277h(Chip.f12853S);
            return;
        }
        Chip chip = this.f9304L;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R$string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        c0797b4.m3277h(chip.getCloseIconTouchBoundsInt());
        c0797b4.m3272b(C3671v3.f64755e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        c0797b4.m3279j(Button.class.getName());
    }

    @Override // p000.xw2
    /* JADX INFO: renamed from: u */
    public final void mo4272u(int i, boolean z) {
        Chip chip = this.f9304L;
        if (i == 1) {
            chip.f12856H = z;
        }
        f11 f11Var = chip.f12866e;
        boolean z2 = chip.f12856H;
        boolean zM11475d0 = false;
        if (f11Var.f38223q0 != null) {
            zM11475d0 = f11Var.m11475d0(z2 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : f11.f38171k1);
        }
        if (zM11475d0) {
            chip.refreshDrawableState();
        }
    }
}
