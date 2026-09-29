package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.material.slider.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1070a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        BaseSlider$SliderState baseSlider$SliderState = new BaseSlider$SliderState(parcel);
        baseSlider$SliderState.f13109a = parcel.readFloat();
        baseSlider$SliderState.f13110b = parcel.readFloat();
        ArrayList arrayList = new ArrayList();
        baseSlider$SliderState.f13111c = arrayList;
        parcel.readList(arrayList, Float.class.getClassLoader());
        baseSlider$SliderState.f13112d = parcel.readFloat();
        baseSlider$SliderState.f13113e = parcel.createBooleanArray()[0];
        return baseSlider$SliderState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BaseSlider$SliderState[i];
    }
}
