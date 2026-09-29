package com.lingq.p055ui.token;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/ui/token/TokenViewState;", "Landroid/os/Parcelable;", "()V", "Collapsed", "Expanded", "Lcom/lingq/ui/token/TokenViewState$Collapsed;", "Lcom/lingq/ui/token/TokenViewState$Expanded;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public abstract class TokenViewState implements Parcelable {

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/token/TokenViewState$Collapsed;", "Lcom/lingq/ui/token/TokenViewState;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final class Collapsed extends TokenViewState {

        /* JADX INFO: renamed from: a */
        public static final Collapsed f31716a = new Collapsed();
        public static final Parcelable.Creator<Collapsed> CREATOR = new C4861a();

        /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewState$Collapsed$a */
        public static final class C4861a implements Parcelable.Creator<Collapsed> {
            @Override // android.os.Parcelable.Creator
            public final Collapsed createFromParcel(Parcel parcel) {
                C5207g.m11111f(parcel, "parcel");
                parcel.readInt();
                return Collapsed.f31716a;
            }

            @Override // android.os.Parcelable.Creator
            public final Collapsed[] newArray(int i10) {
                return new Collapsed[i10];
            }
        }

        private Collapsed() {
            super(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            C5207g.m11111f(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/token/TokenViewState$Expanded;", "Lcom/lingq/ui/token/TokenViewState;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final class Expanded extends TokenViewState {

        /* JADX INFO: renamed from: a */
        public static final Expanded f31717a = new Expanded();
        public static final Parcelable.Creator<Expanded> CREATOR = new C4862a();

        /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewState$Expanded$a */
        public static final class C4862a implements Parcelable.Creator<Expanded> {
            @Override // android.os.Parcelable.Creator
            public final Expanded createFromParcel(Parcel parcel) {
                C5207g.m11111f(parcel, "parcel");
                parcel.readInt();
                return Expanded.f31717a;
            }

            @Override // android.os.Parcelable.Creator
            public final Expanded[] newArray(int i10) {
                return new Expanded[i10];
            }
        }

        private Expanded() {
            super(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            C5207g.m11111f(parcel, "out");
            parcel.writeInt(1);
        }
    }

    private TokenViewState() {
    }

    public /* synthetic */ TokenViewState(int i10) {
        this();
    }
}
