package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.PreferenceCategory;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.C0813lz;
import p000.acj;
import p000.aor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class WearPreferenceCategory extends PreferenceCategory {

    /* JADX INFO: renamed from: e */
    private final int f7525e;

    public WearPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f7525e = Math.round(acj.m195a(resources, C0100R.dimen.wear_preference_category_horizontal_padding_percent) * resources.getDisplayMetrics().widthPixels);
    }

    @Override // androidx.preference.PreferenceCategory, androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        CharSequence charSequence = this.f1589q;
        TextView textView = (TextView) aorVar.f41155a;
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            textView.setLayoutParams(new C0813lz(0, 0));
        } else {
            textView.setText(charSequence);
            textView.setMaxLines(true != this.f1596x ? Integer.MAX_VALUE : 1);
            textView.setPadding(this.f7525e, textView.getPaddingTop(), this.f7525e, textView.getPaddingBottom());
        }
    }
}
