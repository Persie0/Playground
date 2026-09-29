package com.lingq.commons.p053ui.views;

import com.google.android.material.slider.RangeSlider;
import dm.C5207g;
import id.InterfaceC6317b;
import java.util.List;
import kotlin.collections.C6752c;

/* JADX INFO: renamed from: com.lingq.commons.ui.views.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3285a implements InterfaceC6317b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DiscreteSlider f16848a;

    public C3285a(DiscreteSlider discreteSlider) {
        this.f16848a = discreteSlider;
    }

    @Override // id.InterfaceC6317b
    /* JADX INFO: renamed from: a */
    public final void mo9383a(Object obj) {
        C5207g.m11111f((RangeSlider) obj, "slider");
    }

    @Override // id.InterfaceC6317b
    /* JADX INFO: renamed from: b */
    public final void mo9384b(Object obj) {
        C5207g.m11111f((RangeSlider) obj, "slider");
        DiscreteSlider discreteSlider = this.f16848a;
        DiscreteSlider.InterfaceC3277a interfaceC3277a = discreteSlider.f16724l;
        if (interfaceC3277a != null) {
            RangeSlider rangeSlider = discreteSlider.f16714b;
            List<Float> values = rangeSlider.getValues();
            C5207g.m11110e(values, "rangeSlider.values");
            int iFloatValue = (int) ((Number) C6752c.m13423Q(values)).floatValue();
            List<Float> values2 = rangeSlider.getValues();
            C5207g.m11110e(values2, "rangeSlider.values");
            interfaceC3277a.mo9349a(iFloatValue, (int) ((Number) C6752c.m13432Z(values2)).floatValue());
        }
    }
}
