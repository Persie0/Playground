package p000;

import android.widget.TextView;
import com.google.android.material.slider.AbstractC1071b;
import com.google.android.material.slider.RangeSlider;
import com.lingq.core.p012ui.views.DiscreteSlider;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vg2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DiscreteSlider f65343a;

    public /* synthetic */ vg2(DiscreteSlider discreteSlider) {
        this.f65343a = discreteSlider;
    }

    /* JADX INFO: renamed from: a */
    public final void m23267a(AbstractC1071b abstractC1071b, boolean z) {
        String str;
        RangeSlider rangeSlider = (RangeSlider) abstractC1071b;
        int i = DiscreteSlider.f24179k;
        if (z) {
            List<Float> values = rangeSlider.getValues();
            values.getClass();
            int iFloatValue = (int) ((Number) u91.m22589G0(values)).floatValue();
            DiscreteSlider discreteSlider = this.f65343a;
            discreteSlider.f24188i = iFloatValue;
            discreteSlider.f24189j = (int) ((Number) u91.m22597O0(values)).floatValue();
            String str2 = (String) discreteSlider.f24185f.get(discreteSlider.f24188i);
            String str3 = (String) discreteSlider.f24185f.get(discreteSlider.f24189j);
            TextView textView = discreteSlider.f24182c;
            if (vk9.m23391n0(discreteSlider.f24187h)) {
                str = fa4.m11650l(str2, str3) ? String.format("%s", Arrays.copyOf(new Object[]{str2}, 1)) : String.format("%s - %s", Arrays.copyOf(new Object[]{str2, str3}, 2));
            } else {
                str = discreteSlider.f24187h;
            }
            textView.setText(str);
        }
    }
}
