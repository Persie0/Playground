package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class BaseSlider$SliderState extends View.BaseSavedState {
    public static final Parcelable.Creator<BaseSlider$SliderState> CREATOR = new C1070a();

    /* JADX INFO: renamed from: a */
    public float f13109a;

    /* JADX INFO: renamed from: b */
    public float f13110b;

    /* JADX INFO: renamed from: c */
    public ArrayList f13111c;

    /* JADX INFO: renamed from: d */
    public float f13112d;

    /* JADX INFO: renamed from: e */
    public boolean f13113e;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f13109a);
        parcel.writeFloat(this.f13110b);
        parcel.writeList(this.f13111c);
        parcel.writeFloat(this.f13112d);
        parcel.writeBooleanArray(new boolean[]{this.f13113e});
    }
}
