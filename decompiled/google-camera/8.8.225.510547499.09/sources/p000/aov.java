package p000;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aov implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ TwoStatePreference f1938a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f1939b;

    public aov(CheckBoxPreference checkBoxPreference, int i) {
        this.f1939b = i;
        this.f1938a = checkBoxPreference;
    }

    public aov(SwitchPreference switchPreference, int i) {
        this.f1939b = i;
        this.f1938a = switchPreference;
    }

    public aov(SwitchPreferenceCompat switchPreferenceCompat, int i) {
        this.f1939b = i;
        this.f1938a = switchPreferenceCompat;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f1939b) {
            case 0:
                if (!this.f1938a.m1505W(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                } else {
                    this.f1938a.mo1542k(z);
                }
                break;
            case 1:
                if (!this.f1938a.m1505W(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                } else {
                    this.f1938a.mo1542k(z);
                }
                break;
            default:
                if (!this.f1938a.m1505W(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                } else {
                    this.f1938a.mo1542k(z);
                }
                break;
        }
    }
}
