package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.acj;
import p000.aor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class WearTextBoxPreference extends Preference {

    /* JADX INFO: renamed from: a */
    private final int f7527a;

    public WearTextBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1559A = C0100R.layout.wear_text_block_preference;
        Resources resources = context.getResources();
        this.f7527a = Math.round(acj.m195a(resources, C0100R.dimen.wear_preference_text_box_horizontal_padding_percent) * resources.getDisplayMetrics().widthPixels);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        TextView textView = (TextView) aorVar.f41155a;
        textView.setText(this.f1589q);
        textView.setPadding(this.f7527a, textView.getPaddingTop(), this.f7527a, textView.getPaddingBottom());
    }
}
