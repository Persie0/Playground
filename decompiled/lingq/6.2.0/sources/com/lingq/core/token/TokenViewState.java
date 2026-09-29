package com.lingq.core.token;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TokenViewState implements Parcelable {

    public static final class Collapsed extends TokenViewState {

        /* JADX INFO: renamed from: a */
        public static final Collapsed f23708a = new Collapsed();
        public static final Parcelable.Creator<Collapsed> CREATOR = new C1910f();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public static final class Expanded extends TokenViewState {

        /* JADX INFO: renamed from: a */
        public static final Expanded f23709a = new Expanded();
        public static final Parcelable.Creator<Expanded> CREATOR = new C1911g();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
