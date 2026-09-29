package p000;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.core.R$id;
import com.google.android.material.R$string;
import com.google.android.material.slider.AbstractC1071b;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class fa0 extends xw2 {

    /* JADX INFO: renamed from: L */
    public final AbstractC1071b f38697L;

    /* JADX INFO: renamed from: M */
    public final Rect f38698M;

    public fa0(AbstractC1071b abstractC1071b) {
        super(abstractC1071b);
        this.f38698M = new Rect();
        this.f38697L = abstractC1071b;
    }

    @Override // p000.xw2
    /* JADX INFO: renamed from: n */
    public final int mo4267n(float f, float f2) {
        int i = 0;
        while (true) {
            AbstractC1071b abstractC1071b = this.f38697L;
            if (i >= abstractC1071b.getValues().size()) {
                return -1;
            }
            Rect rect = this.f38698M;
            abstractC1071b.m6176F(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    @Override // p000.xw2
    /* JADX INFO: renamed from: o */
    public final void mo4268o(ArrayList arrayList) {
        for (int i = 0; i < this.f38697L.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // p000.xw2
    /* JADX INFO: renamed from: r */
    public final boolean mo4269r(int i, int i2, Bundle bundle) {
        AbstractC1071b abstractC1071b = this.f38697L;
        if (!abstractC1071b.isEnabled()) {
            return false;
        }
        if (i2 != 4096 && i2 != 8192) {
            if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !abstractC1071b.m6174D(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                return false;
            }
            abstractC1071b.m6177G();
            abstractC1071b.postInvalidate();
            return true;
        }
        float fRound = abstractC1071b.f13147P0;
        if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        float f = (abstractC1071b.f13139L0 - abstractC1071b.f13137K0) / fRound;
        if (f > 20.0f) {
            fRound *= Math.round(f / 20.0f);
        }
        if (i2 == 8192) {
            fRound = -fRound;
        }
        if (abstractC1071b.m6209s()) {
            fRound = -fRound;
        }
        if (!abstractC1071b.m6174D(i, AbstractC3584sr.m21644w(abstractC1071b.getValues().get(i).floatValue() + fRound, abstractC1071b.getValueFrom(), abstractC1071b.getValueTo()))) {
            return false;
        }
        abstractC1071b.setActiveThumbIndex(i);
        RunnableC3781y2 runnableC3781y2 = abstractC1071b.f13226y1;
        abstractC1071b.removeCallbacks(runnableC3781y2);
        abstractC1071b.postDelayed(runnableC3781y2, abstractC1071b.f13220v1);
        abstractC1071b.m6177G();
        abstractC1071b.postInvalidate();
        return true;
    }

    @Override // p000.xw2
    /* JADX INFO: renamed from: t */
    public final void mo4271t(int i, C0797b4 c0797b4) {
        Object tag;
        String string;
        AccessibilityNodeInfo accessibilityNodeInfo = c0797b4.f7900a;
        c0797b4.m3272b(C3671v3.f64767q);
        AbstractC1071b abstractC1071b = this.f38697L;
        List<Float> values = abstractC1071b.getValues();
        Float f = values.get(i);
        float fFloatValue = f.floatValue();
        float valueFrom = abstractC1071b.getValueFrom();
        float valueTo = abstractC1071b.getValueTo();
        if (abstractC1071b.isEnabled()) {
            if (fFloatValue > valueFrom) {
                c0797b4.m3271a(8192);
            }
            if (fFloatValue < valueTo) {
                c0797b4.m3271a(4096);
            }
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        try {
            valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
            valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
            fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
        } catch (ParseException unused) {
            int i2 = AbstractC1071b.f13118A1;
            Log.w("b", "Error parsing value(" + f + "), valueFrom(" + valueFrom + "), and valueTo(" + valueTo + ") into a float.");
        }
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue));
        c0797b4.m3279j(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (abstractC1071b.getContentDescription() != null) {
            sb.append(abstractC1071b.getContentDescription());
            sb.append(",");
        }
        String str = String.format(((float) ((int) fFloatValue)) == fFloatValue ? "%.0f" : "%.2f", Float.valueOf(fFloatValue));
        String string2 = abstractC1071b.getContext().getString(R$string.material_slider_value);
        if (values.size() > 1) {
            if (i == abstractC1071b.getValues().size() - 1) {
                string = abstractC1071b.getContext().getString(R$string.material_slider_range_end);
            } else {
                string = i == 0 ? abstractC1071b.getContext().getString(R$string.material_slider_range_start) : "";
            }
            string2 = string;
        }
        WeakHashMap weakHashMap = dta.f36217a;
        int i3 = R$id.tag_state_description;
        if (Build.VERSION.SDK_INT >= 30) {
            tag = bta.m4164b(abstractC1071b);
        } else {
            tag = abstractC1071b.getTag(i3);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (TextUtils.isEmpty(charSequence)) {
            Locale.getDefault();
            sb.append(string2 + ", " + str);
        } else {
            c0797b4.m3283n(charSequence);
        }
        accessibilityNodeInfo.setContentDescription(sb.toString());
        Rect rect = this.f38698M;
        abstractC1071b.m6176F(i, rect);
        c0797b4.m3277h(rect);
    }
}
