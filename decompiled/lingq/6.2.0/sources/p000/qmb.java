package p000;

import android.accounts.Account;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzjo;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.internal.measurement.zzjs;
import com.google.android.gms.internal.measurement.zzju;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzn;
import com.google.android.gms.internal.vision.zzab;
import com.google.android.gms.internal.vision.zzal;
import com.google.android.gms.internal.vision.zzam;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.vision.face.internal.client.zza;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qmb implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57950a;

    public /* synthetic */ qmb(int i) {
        this.f57950a = i;
    }

    /* JADX INFO: renamed from: a */
    public static void m20035a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        int i2 = getServiceRequest.f11700a;
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = getServiceRequest.f11701b;
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = getServiceRequest.f11702c;
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(i4);
        l70.m15930U(parcel, 4, getServiceRequest.f11703d);
        l70.m15927R(parcel, 5, getServiceRequest.f11704e);
        l70.m15933X(parcel, 6, getServiceRequest.f11705f, i);
        l70.m15924O(parcel, 7, getServiceRequest.f11706g);
        l70.m15929T(parcel, 8, getServiceRequest.f11707h, i);
        l70.m15933X(parcel, 10, getServiceRequest.f11708i, i);
        l70.m15933X(parcel, 11, getServiceRequest.f11709j, i);
        boolean z = getServiceRequest.f11710k;
        l70.m15935Z(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = getServiceRequest.f11711l;
        l70.m15935Z(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = getServiceRequest.f11698H;
        l70.m15935Z(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        l70.m15930U(parcel, 15, getServiceRequest.f11699I);
        l70.m15939b0(parcel, iM15937a0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        float fM17101T = 0.0f;
        long jM17104W = 0;
        int iM17103V = 0;
        int iM17103V2 = 0;
        int iM17103V3 = 0;
        int iM17103V4 = 0;
        int iM17103V5 = 0;
        boolean zM17099R = false;
        int iM17103V6 = 0;
        int iM17103V7 = 0;
        String strM17138q = null;
        ArrayList arrayListM17142u = null;
        String strM17138q2 = null;
        Bundle bundleM17130l = null;
        ArrayList arrayListM17142u2 = null;
        String strM17138q3 = null;
        byte[] bArrM17132m = null;
        zzjo[] zzjoVarArr = null;
        PointF[] pointFArr = null;
        Bundle bundleM17130l2 = null;
        switch (this.f57950a) {
            case 0:
                int iM17129k0 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k0) {
                    int i = parcel.readInt();
                    if (((char) i) != 2) {
                        AbstractC3352my.m17113c0(parcel, i);
                    } else {
                        strM17138q = AbstractC3352my.m17138q(parcel, i);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k0);
                return new zzam(strM17138q);
            case 1:
                int iM17129k1 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k1) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        AbstractC3352my.m17113c0(parcel, i2);
                    } else {
                        bundleM17130l2 = AbstractC3352my.m17130l(parcel, i2);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k1);
                return new zzao(bundleM17130l2);
            case 2:
                int iM17129k2 = AbstractC3352my.m17129k0(parcel);
                float fM17101T2 = 0.0f;
                boolean zM17099R2 = false;
                zzal[] zzalVarArr = null;
                zzab zzabVar = null;
                zzab zzabVar2 = null;
                String strM17138q4 = null;
                String strM17138q5 = null;
                while (parcel.dataPosition() < iM17129k2) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 2:
                            zzalVarArr = (zzal[]) AbstractC3352my.m17141t(parcel, i3, zzal.CREATOR);
                            break;
                        case 3:
                            zzabVar = (zzab) AbstractC3352my.m17137p(parcel, i3, zzab.CREATOR);
                            break;
                        case 4:
                            zzabVar2 = (zzab) AbstractC3352my.m17137p(parcel, i3, zzab.CREATOR);
                            break;
                        case 5:
                            strM17138q4 = AbstractC3352my.m17138q(parcel, i3);
                            break;
                        case 6:
                            fM17101T2 = AbstractC3352my.m17101T(parcel, i3);
                            break;
                        case 7:
                            strM17138q5 = AbstractC3352my.m17138q(parcel, i3);
                            break;
                        case '\b':
                            zM17099R2 = AbstractC3352my.m17099R(parcel, i3);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i3);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k2);
                return new com.google.android.gms.internal.vision.zzao(zzalVarArr, zzabVar, zzabVar2, strM17138q4, fM17101T2, strM17138q5, zM17099R2);
            case 3:
                return new zzd(parcel.readStrongBinder());
            case 4:
                int iM17129k3 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k3) {
                    int i4 = parcel.readInt();
                    char c = (char) i4;
                    if (c == 2) {
                        pointFArr = (PointF[]) AbstractC3352my.m17141t(parcel, i4, PointF.CREATOR);
                    } else if (c != 3) {
                        AbstractC3352my.m17113c0(parcel, i4);
                    } else {
                        iM17103V = AbstractC3352my.m17103V(parcel, i4);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k3);
                return new zza(pointFArr, iM17103V);
            case 5:
                int iM17129k4 = AbstractC3352my.m17129k0(parcel);
                boolean zM17099R3 = true;
                int iM17103V8 = 0;
                int iM17103V9 = 0;
                while (parcel.dataPosition() < iM17129k4) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 1) {
                        iM17103V7 = AbstractC3352my.m17103V(parcel, i5);
                    } else if (c2 == 2) {
                        iM17103V8 = AbstractC3352my.m17103V(parcel, i5);
                    } else if (c2 == 3) {
                        iM17103V9 = AbstractC3352my.m17103V(parcel, i5);
                    } else if (c2 != 4) {
                        AbstractC3352my.m17113c0(parcel, i5);
                    } else {
                        zM17099R3 = AbstractC3352my.m17099R(parcel, i5);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k4);
                return new ComplianceOptions(iM17103V7, iM17103V8, iM17103V9, zM17099R3);
            case 6:
                int iM17129k5 = AbstractC3352my.m17129k0(parcel);
                float fM17101T3 = Float.MAX_VALUE;
                float fM17101T4 = Float.MAX_VALUE;
                float fM17101T5 = Float.MAX_VALUE;
                float fM17101T6 = -1.0f;
                float fM17101T7 = 0.0f;
                float fM17101T8 = 0.0f;
                float fM17101T9 = 0.0f;
                float fM17101T10 = 0.0f;
                float fM17101T11 = 0.0f;
                float fM17101T12 = 0.0f;
                float fM17101T13 = 0.0f;
                int iM17103V10 = 0;
                int iM17103V11 = 0;
                LandmarkParcel[] landmarkParcelArr = null;
                zza[] zzaVarArr = null;
                while (parcel.dataPosition() < iM17129k5) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            iM17103V10 = AbstractC3352my.m17103V(parcel, i6);
                            break;
                        case 2:
                            iM17103V11 = AbstractC3352my.m17103V(parcel, i6);
                            break;
                        case 3:
                            fM17101T7 = AbstractC3352my.m17101T(parcel, i6);
                            break;
                        case 4:
                            fM17101T8 = AbstractC3352my.m17101T(parcel, i6);
                            break;
                        case 5:
                            fM17101T9 = AbstractC3352my.m17101T(parcel, i6);
                            break;
                        case 6:
                            fM17101T10 = AbstractC3352my.m17101T(parcel, i6);
                            break;
                        case 7:
                            fM17101T3 = AbstractC3352my.m17101T(parcel, i6);
                            break;
                        case '\b':
                            fM17101T4 = AbstractC3352my.m17101T(parcel, i6);
                            break;
                        case '\t':
                            landmarkParcelArr = (LandmarkParcel[]) AbstractC3352my.m17141t(parcel, i6, LandmarkParcel.CREATOR);
                            break;
                        case '\n':
                            fM17101T11 = AbstractC3352my.m17101T(parcel, i6);
                            break;
                        case 11:
                            fM17101T12 = AbstractC3352my.m17101T(parcel, i6);
                            break;
                        case '\f':
                            fM17101T13 = AbstractC3352my.m17101T(parcel, i6);
                            break;
                        case '\r':
                            zzaVarArr = (zza[]) AbstractC3352my.m17141t(parcel, i6, zza.CREATOR);
                            break;
                        case 14:
                            fM17101T5 = AbstractC3352my.m17101T(parcel, i6);
                            break;
                        case 15:
                            fM17101T6 = AbstractC3352my.m17101T(parcel, i6);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i6);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k5);
                return new FaceParcel(iM17103V10, iM17103V11, fM17101T7, fM17101T8, fM17101T9, fM17101T10, fM17101T3, fM17101T4, fM17101T5, landmarkParcelArr, fM17101T11, fM17101T12, fM17101T13, zzaVarArr, fM17101T6);
            case 7:
                int iM17129k6 = AbstractC3352my.m17129k0(parcel);
                long jM17104W2 = 0;
                long jM17104W3 = 0;
                boolean zM17099R4 = false;
                while (parcel.dataPosition() < iM17129k6) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 1) {
                        zM17099R4 = AbstractC3352my.m17099R(parcel, i7);
                    } else if (c3 == 2) {
                        jM17104W3 = AbstractC3352my.m17104W(parcel, i7);
                    } else if (c3 != 3) {
                        AbstractC3352my.m17113c0(parcel, i7);
                    } else {
                        jM17104W2 = AbstractC3352my.m17104W(parcel, i7);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k6);
                return new zzc(jM17104W2, jM17104W3, zM17099R4);
            case 8:
                int iM17129k7 = AbstractC3352my.m17129k0(parcel);
                long jM17104W4 = 0;
                int iM17103V12 = 0;
                int iM17103V13 = 0;
                int iM17103V14 = 0;
                int iM17103V15 = 0;
                while (parcel.dataPosition() < iM17129k7) {
                    int i8 = parcel.readInt();
                    char c4 = (char) i8;
                    if (c4 == 2) {
                        iM17103V12 = AbstractC3352my.m17103V(parcel, i8);
                    } else if (c4 == 3) {
                        iM17103V13 = AbstractC3352my.m17103V(parcel, i8);
                    } else if (c4 == 4) {
                        iM17103V14 = AbstractC3352my.m17103V(parcel, i8);
                    } else if (c4 == 5) {
                        jM17104W4 = AbstractC3352my.m17104W(parcel, i8);
                    } else if (c4 != 6) {
                        AbstractC3352my.m17113c0(parcel, i8);
                    } else {
                        iM17103V15 = AbstractC3352my.m17103V(parcel, i8);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k7);
                return new com.google.android.gms.internal.mlkit_vision_text_common.zzd(iM17103V12, iM17103V13, iM17103V14, iM17103V15, jM17104W4);
            case 9:
                int iM17129k8 = AbstractC3352my.m17129k0(parcel);
                boolean zM17099R5 = true;
                zzr zzrVar = null;
                byte[] bArrM17132m2 = null;
                int[] iArrM17136o = null;
                String[] strArrM17139r = null;
                int[] iArrM17136o2 = null;
                byte[][] bArrM17134n = null;
                ExperimentTokens[] experimentTokensArr = null;
                while (parcel.dataPosition() < iM17129k8) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 2:
                            zzrVar = (zzr) AbstractC3352my.m17137p(parcel, i9, zzr.CREATOR);
                            break;
                        case 3:
                            bArrM17132m2 = AbstractC3352my.m17132m(parcel, i9);
                            break;
                        case 4:
                            iArrM17136o = AbstractC3352my.m17136o(parcel, i9);
                            break;
                        case 5:
                            strArrM17139r = AbstractC3352my.m17139r(parcel, i9);
                            break;
                        case 6:
                            iArrM17136o2 = AbstractC3352my.m17136o(parcel, i9);
                            break;
                        case 7:
                            bArrM17134n = AbstractC3352my.m17134n(parcel, i9);
                            break;
                        case '\b':
                            zM17099R5 = AbstractC3352my.m17099R(parcel, i9);
                            break;
                        case '\t':
                            experimentTokensArr = (ExperimentTokens[]) AbstractC3352my.m17141t(parcel, i9, ExperimentTokens.CREATOR);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i9);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k8);
                return new zze(zzrVar, bArrM17132m2, iArrM17136o, strArrM17139r, iArrM17136o2, bArrM17134n, zM17099R5, experimentTokensArr);
            case 10:
                int iM17129k9 = AbstractC3352my.m17129k0(parcel);
                float fM17101T14 = 0.0f;
                int iM17103V16 = 0;
                int iM17103V17 = 0;
                int iM17103V18 = 0;
                int iM17103V19 = 0;
                while (parcel.dataPosition() < iM17129k9) {
                    int i10 = parcel.readInt();
                    char c5 = (char) i10;
                    if (c5 == 2) {
                        iM17103V16 = AbstractC3352my.m17103V(parcel, i10);
                    } else if (c5 == 3) {
                        iM17103V17 = AbstractC3352my.m17103V(parcel, i10);
                    } else if (c5 == 4) {
                        iM17103V18 = AbstractC3352my.m17103V(parcel, i10);
                    } else if (c5 == 5) {
                        iM17103V19 = AbstractC3352my.m17103V(parcel, i10);
                    } else if (c5 != 6) {
                        AbstractC3352my.m17113c0(parcel, i10);
                    } else {
                        fM17101T14 = AbstractC3352my.m17101T(parcel, i10);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k9);
                return new zzf(iM17103V16, iM17103V17, iM17103V18, iM17103V19, fM17101T14);
            case 11:
                int iM17129k10 = AbstractC3352my.m17129k0(parcel);
                String strM17138q6 = null;
                byte[] bArrM17132m3 = null;
                byte[][] bArrM17134n2 = null;
                byte[][] bArrM17134n3 = null;
                byte[][] bArrM17134n4 = null;
                byte[][] bArrM17134n5 = null;
                int[] iArrM17136o3 = null;
                byte[][] bArrM17134n6 = null;
                while (parcel.dataPosition() < iM17129k10) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            strM17138q6 = AbstractC3352my.m17138q(parcel, i11);
                            break;
                        case 3:
                            bArrM17132m3 = AbstractC3352my.m17132m(parcel, i11);
                            break;
                        case 4:
                            bArrM17134n2 = AbstractC3352my.m17134n(parcel, i11);
                            break;
                        case 5:
                            bArrM17134n3 = AbstractC3352my.m17134n(parcel, i11);
                            break;
                        case 6:
                            bArrM17134n4 = AbstractC3352my.m17134n(parcel, i11);
                            break;
                        case 7:
                            bArrM17134n5 = AbstractC3352my.m17134n(parcel, i11);
                            break;
                        case '\b':
                            iArrM17136o3 = AbstractC3352my.m17136o(parcel, i11);
                            break;
                        case '\t':
                            bArrM17134n6 = AbstractC3352my.m17134n(parcel, i11);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i11);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k10);
                return new ExperimentTokens(strM17138q6, bArrM17132m3, bArrM17134n2, bArrM17134n3, bArrM17134n4, bArrM17134n5, iArrM17136o3, bArrM17134n6);
            case 12:
                int iM17129k11 = AbstractC3352my.m17129k0(parcel);
                String[] strArrM17139r2 = null;
                while (parcel.dataPosition() < iM17129k11) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 2) {
                        iM17103V6 = AbstractC3352my.m17103V(parcel, i12);
                    } else if (c6 == 3) {
                        zzjoVarArr = (zzjo[]) AbstractC3352my.m17141t(parcel, i12, zzjo.CREATOR);
                    } else if (c6 != 4) {
                        AbstractC3352my.m17113c0(parcel, i12);
                    } else {
                        strArrM17139r2 = AbstractC3352my.m17139r(parcel, i12);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k11);
                return new zzjf(iM17103V6, zzjoVarArr, strArrM17139r2);
            case 13:
                int iM17129k12 = AbstractC3352my.m17129k0(parcel);
                long jM17104W5 = 0;
                boolean zM17099R6 = false;
                String strM17138q7 = null;
                String strM17138q8 = null;
                zzjf[] zzjfVarArr = null;
                byte[] bArrM17132m4 = null;
                while (parcel.dataPosition() < iM17129k12) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            strM17138q7 = AbstractC3352my.m17138q(parcel, i13);
                            break;
                        case 3:
                            strM17138q8 = AbstractC3352my.m17138q(parcel, i13);
                            break;
                        case 4:
                            zzjfVarArr = (zzjf[]) AbstractC3352my.m17141t(parcel, i13, zzjf.CREATOR);
                            break;
                        case 5:
                            zM17099R6 = AbstractC3352my.m17099R(parcel, i13);
                            break;
                        case 6:
                            bArrM17132m4 = AbstractC3352my.m17132m(parcel, i13);
                            break;
                        case 7:
                            jM17104W5 = AbstractC3352my.m17104W(parcel, i13);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i13);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k12);
                return new zzjh(strM17138q7, strM17138q8, zzjfVarArr, zM17099R6, bArrM17132m4, jM17104W5);
            case 14:
                int iM17129k13 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k13) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 2) {
                        AbstractC3352my.m17113c0(parcel, i14);
                    } else {
                        bArrM17132m = AbstractC3352my.m17132m(parcel, i14);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k13);
                return new zzjj(bArrM17132m);
            case 15:
                int iM17129k14 = AbstractC3352my.m17129k0(parcel);
                String strM17138q9 = null;
                byte[] bArrM17132m5 = null;
                byte[][] bArrM17134n7 = null;
                byte[][] bArrM17134n8 = null;
                byte[][] bArrM17134n9 = null;
                byte[][] bArrM17134n10 = null;
                int[] iArrM17136o4 = null;
                byte[][] bArrM17134n11 = null;
                int[] iArrM17136o5 = null;
                byte[][] bArrM17134n12 = null;
                while (parcel.dataPosition() < iM17129k14) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            strM17138q9 = AbstractC3352my.m17138q(parcel, i15);
                            break;
                        case 3:
                            bArrM17132m5 = AbstractC3352my.m17132m(parcel, i15);
                            break;
                        case 4:
                            bArrM17134n7 = AbstractC3352my.m17134n(parcel, i15);
                            break;
                        case 5:
                            bArrM17134n8 = AbstractC3352my.m17134n(parcel, i15);
                            break;
                        case 6:
                            bArrM17134n9 = AbstractC3352my.m17134n(parcel, i15);
                            break;
                        case 7:
                            bArrM17134n10 = AbstractC3352my.m17134n(parcel, i15);
                            break;
                        case '\b':
                            iArrM17136o4 = AbstractC3352my.m17136o(parcel, i15);
                            break;
                        case '\t':
                            bArrM17134n11 = AbstractC3352my.m17134n(parcel, i15);
                            break;
                        case '\n':
                            iArrM17136o5 = AbstractC3352my.m17136o(parcel, i15);
                            break;
                        case 11:
                            bArrM17134n12 = AbstractC3352my.m17134n(parcel, i15);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i15);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k14);
                return new zzjl(strM17138q9, bArrM17132m5, bArrM17134n7, bArrM17134n8, bArrM17134n9, bArrM17134n10, iArrM17136o4, bArrM17134n11, iArrM17136o5, bArrM17134n12);
            case 16:
                int iM17129k15 = AbstractC3352my.m17129k0(parcel);
                double d = 0.0d;
                long jM17104W6 = 0;
                boolean zM17099R7 = false;
                int iM17103V20 = 0;
                int iM17103V21 = 0;
                int iM17103V22 = 0;
                String strM17138q10 = null;
                String strM17138q11 = null;
                byte[] bArrM17132m6 = null;
                while (parcel.dataPosition() < iM17129k15) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 2:
                            strM17138q10 = AbstractC3352my.m17138q(parcel, i16);
                            break;
                        case 3:
                            jM17104W6 = AbstractC3352my.m17104W(parcel, i16);
                            break;
                        case 4:
                            zM17099R7 = AbstractC3352my.m17099R(parcel, i16);
                            break;
                        case 5:
                            AbstractC3352my.m17133m0(parcel, i16, 8);
                            d = parcel.readDouble();
                            break;
                        case 6:
                            strM17138q11 = AbstractC3352my.m17138q(parcel, i16);
                            break;
                        case 7:
                            bArrM17132m6 = AbstractC3352my.m17132m(parcel, i16);
                            break;
                        case '\b':
                            iM17103V20 = AbstractC3352my.m17103V(parcel, i16);
                            break;
                        case '\t':
                            iM17103V21 = AbstractC3352my.m17103V(parcel, i16);
                            break;
                        case '\n':
                            iM17103V22 = AbstractC3352my.m17103V(parcel, i16);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i16);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k15);
                return new zzjo(strM17138q10, jM17104W6, zM17099R7, d, strM17138q11, bArrM17132m6, iM17103V20, iM17103V21, iM17103V22);
            case 17:
                int iM17129k16 = AbstractC3352my.m17129k0(parcel);
                String strM17138q12 = null;
                zzjo zzjoVar = null;
                while (parcel.dataPosition() < iM17129k16) {
                    int i17 = parcel.readInt();
                    char c7 = (char) i17;
                    if (c7 == 2) {
                        strM17138q3 = AbstractC3352my.m17138q(parcel, i17);
                    } else if (c7 == 3) {
                        strM17138q12 = AbstractC3352my.m17138q(parcel, i17);
                    } else if (c7 == 4) {
                        zzjoVar = (zzjo) AbstractC3352my.m17137p(parcel, i17, zzjo.CREATOR);
                    } else if (c7 != 5) {
                        AbstractC3352my.m17113c0(parcel, i17);
                    } else {
                        zM17099R = AbstractC3352my.m17099R(parcel, i17);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k16);
                return new zzjq(strM17138q3, strM17138q12, zzjoVar, zM17099R);
            case 18:
                int iM17129k17 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k17) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 2) {
                        AbstractC3352my.m17113c0(parcel, i18);
                    } else {
                        arrayListM17142u2 = AbstractC3352my.m17142u(parcel, i18, zzjq.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k17);
                return new zzjs(arrayListM17142u2);
            case 19:
                int iM17129k18 = AbstractC3352my.m17129k0(parcel);
                int iM17103V23 = 0;
                while (parcel.dataPosition() < iM17129k18) {
                    int i19 = parcel.readInt();
                    char c8 = (char) i19;
                    if (c8 == 1) {
                        iM17103V5 = AbstractC3352my.m17103V(parcel, i19);
                    } else if (c8 != 2) {
                        AbstractC3352my.m17113c0(parcel, i19);
                    } else {
                        iM17103V23 = AbstractC3352my.m17103V(parcel, i19);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k18);
                return new zzju(iM17103V5, iM17103V23);
            case 20:
                int iM17129k19 = AbstractC3352my.m17129k0(parcel);
                Feature[] featureArr = null;
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                while (parcel.dataPosition() < iM17129k19) {
                    int i20 = parcel.readInt();
                    char c9 = (char) i20;
                    if (c9 == 1) {
                        bundleM17130l = AbstractC3352my.m17130l(parcel, i20);
                    } else if (c9 == 2) {
                        featureArr = (Feature[]) AbstractC3352my.m17141t(parcel, i20, Feature.CREATOR);
                    } else if (c9 == 3) {
                        iM17103V4 = AbstractC3352my.m17103V(parcel, i20);
                    } else if (c9 != 4) {
                        AbstractC3352my.m17113c0(parcel, i20);
                    } else {
                        connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) AbstractC3352my.m17137p(parcel, i20, ConnectionTelemetryConfiguration.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k19);
                zzj zzjVar = new zzj();
                zzjVar.f11743a = bundleM17130l;
                zzjVar.f11744b = featureArr;
                zzjVar.f11745c = iM17103V4;
                zzjVar.f11746d = connectionTelemetryConfiguration;
                return zzjVar;
            case 21:
                int iM17129k20 = AbstractC3352my.m17129k0(parcel);
                boolean zM17099R8 = false;
                boolean zM17099R9 = false;
                int iM17103V24 = 0;
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArrM17136o6 = null;
                int[] iArrM17136o7 = null;
                while (parcel.dataPosition() < iM17129k20) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) AbstractC3352my.m17137p(parcel, i21, RootTelemetryConfiguration.CREATOR);
                            break;
                        case 2:
                            zM17099R8 = AbstractC3352my.m17099R(parcel, i21);
                            break;
                        case 3:
                            zM17099R9 = AbstractC3352my.m17099R(parcel, i21);
                            break;
                        case 4:
                            iArrM17136o6 = AbstractC3352my.m17136o(parcel, i21);
                            break;
                        case 5:
                            iM17103V24 = AbstractC3352my.m17103V(parcel, i21);
                            break;
                        case 6:
                            iArrM17136o7 = AbstractC3352my.m17136o(parcel, i21);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i21);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k20);
                return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zM17099R8, zM17099R9, iArrM17136o6, iM17103V24, iArrM17136o7);
            case 22:
                int iM17129k21 = AbstractC3352my.m17129k0(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = GetServiceRequest.f11696J;
                Feature[] featureArr2 = GetServiceRequest.f11697K;
                Feature[] featureArr3 = featureArr2;
                int iM17103V25 = 0;
                int iM17103V26 = 0;
                int iM17103V27 = 0;
                boolean zM17099R10 = false;
                int iM17103V28 = 0;
                boolean zM17099R11 = false;
                String strM17138q13 = null;
                IBinder iBinderM17102U = null;
                Account account = null;
                String strM17138q14 = null;
                while (parcel.dataPosition() < iM17129k21) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            iM17103V25 = AbstractC3352my.m17103V(parcel, i22);
                            break;
                        case 2:
                            iM17103V26 = AbstractC3352my.m17103V(parcel, i22);
                            break;
                        case 3:
                            iM17103V27 = AbstractC3352my.m17103V(parcel, i22);
                            break;
                        case 4:
                            strM17138q13 = AbstractC3352my.m17138q(parcel, i22);
                            break;
                        case 5:
                            iBinderM17102U = AbstractC3352my.m17102U(parcel, i22);
                            break;
                        case 6:
                            scopeArr = (Scope[]) AbstractC3352my.m17141t(parcel, i22, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = AbstractC3352my.m17130l(parcel, i22);
                            break;
                        case '\b':
                            account = (Account) AbstractC3352my.m17137p(parcel, i22, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            AbstractC3352my.m17113c0(parcel, i22);
                            break;
                        case '\n':
                            featureArr2 = (Feature[]) AbstractC3352my.m17141t(parcel, i22, Feature.CREATOR);
                            break;
                        case 11:
                            featureArr3 = (Feature[]) AbstractC3352my.m17141t(parcel, i22, Feature.CREATOR);
                            break;
                        case '\f':
                            zM17099R10 = AbstractC3352my.m17099R(parcel, i22);
                            break;
                        case '\r':
                            iM17103V28 = AbstractC3352my.m17103V(parcel, i22);
                            break;
                        case 14:
                            zM17099R11 = AbstractC3352my.m17099R(parcel, i22);
                            break;
                        case 15:
                            strM17138q14 = AbstractC3352my.m17138q(parcel, i22);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k21);
                return new GetServiceRequest(iM17103V25, iM17103V26, iM17103V27, strM17138q13, iBinderM17102U, scopeArr, bundle, account, featureArr2, featureArr3, zM17099R10, iM17103V28, zM17099R11, strM17138q14);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                int iM17129k22 = AbstractC3352my.m17129k0(parcel);
                float fM17101T15 = 0.0f;
                int iM17103V29 = 0;
                boolean zM17099R12 = false;
                int iM17103V30 = 0;
                int iM17103V31 = 0;
                com.google.android.gms.internal.mlkit_vision_text_common.zzr[] zzrVarArr = null;
                zzf zzfVar = null;
                zzf zzfVar2 = null;
                zzf zzfVar3 = null;
                String strM17138q15 = null;
                String strM17138q16 = null;
                while (parcel.dataPosition() < iM17129k22) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 2:
                            zzrVarArr = (com.google.android.gms.internal.mlkit_vision_text_common.zzr[]) AbstractC3352my.m17141t(parcel, i23, com.google.android.gms.internal.mlkit_vision_text_common.zzr.CREATOR);
                            break;
                        case 3:
                            zzfVar = (zzf) AbstractC3352my.m17137p(parcel, i23, zzf.CREATOR);
                            break;
                        case 4:
                            zzfVar2 = (zzf) AbstractC3352my.m17137p(parcel, i23, zzf.CREATOR);
                            break;
                        case 5:
                            zzfVar3 = (zzf) AbstractC3352my.m17137p(parcel, i23, zzf.CREATOR);
                            break;
                        case 6:
                            strM17138q15 = AbstractC3352my.m17138q(parcel, i23);
                            break;
                        case 7:
                            fM17101T15 = AbstractC3352my.m17101T(parcel, i23);
                            break;
                        case '\b':
                            strM17138q16 = AbstractC3352my.m17138q(parcel, i23);
                            break;
                        case '\t':
                            iM17103V29 = AbstractC3352my.m17103V(parcel, i23);
                            break;
                        case '\n':
                            zM17099R12 = AbstractC3352my.m17099R(parcel, i23);
                            break;
                        case 11:
                            iM17103V30 = AbstractC3352my.m17103V(parcel, i23);
                            break;
                        case '\f':
                            iM17103V31 = AbstractC3352my.m17103V(parcel, i23);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i23);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k22);
                return new zzl(zzrVarArr, zzfVar, zzfVar2, zzfVar3, strM17138q15, fM17101T15, strM17138q16, iM17103V29, zM17099R12, iM17103V30, iM17103V31);
            case 24:
                int iM17129k23 = AbstractC3352my.m17129k0(parcel);
                float fM17101T16 = 0.0f;
                int iM17103V32 = 0;
                while (parcel.dataPosition() < iM17129k23) {
                    int i24 = parcel.readInt();
                    char c10 = (char) i24;
                    if (c10 == 1) {
                        iM17103V3 = AbstractC3352my.m17103V(parcel, i24);
                    } else if (c10 == 2) {
                        fM17101T = AbstractC3352my.m17101T(parcel, i24);
                    } else if (c10 == 3) {
                        fM17101T16 = AbstractC3352my.m17101T(parcel, i24);
                    } else if (c10 != 4) {
                        AbstractC3352my.m17113c0(parcel, i24);
                    } else {
                        iM17103V32 = AbstractC3352my.m17103V(parcel, i24);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k23);
                return new LandmarkParcel(iM17103V3, fM17101T, fM17101T16, iM17103V32);
            case 25:
                int iM17129k24 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k24) {
                    AbstractC3352my.m17113c0(parcel, parcel.readInt());
                }
                AbstractC3352my.m17145x(parcel, iM17129k24);
                return new zzn();
            case 26:
                int iM17129k25 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k25) {
                    int i25 = parcel.readInt();
                    char c11 = (char) i25;
                    if (c11 == 1) {
                        strM17138q2 = AbstractC3352my.m17138q(parcel, i25);
                    } else if (c11 == 2) {
                        jM17104W = AbstractC3352my.m17104W(parcel, i25);
                    } else if (c11 != 3) {
                        AbstractC3352my.m17113c0(parcel, i25);
                    } else {
                        iM17103V2 = AbstractC3352my.m17103V(parcel, i25);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k25);
                return new zzoh(strM17138q2, iM17103V2, jM17104W);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                int iM17129k26 = AbstractC3352my.m17129k0(parcel);
                long jM17104W7 = 0;
                long jM17104W8 = 0;
                int iM17103V33 = 0;
                byte[] bArrM17132m7 = null;
                String strM17138q17 = null;
                Bundle bundleM17130l3 = null;
                String strM17138q18 = null;
                while (parcel.dataPosition() < iM17129k26) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 1:
                            jM17104W7 = AbstractC3352my.m17104W(parcel, i26);
                            break;
                        case 2:
                            bArrM17132m7 = AbstractC3352my.m17132m(parcel, i26);
                            break;
                        case 3:
                            strM17138q17 = AbstractC3352my.m17138q(parcel, i26);
                            break;
                        case 4:
                            bundleM17130l3 = AbstractC3352my.m17130l(parcel, i26);
                            break;
                        case 5:
                            iM17103V33 = AbstractC3352my.m17103V(parcel, i26);
                            break;
                        case 6:
                            jM17104W8 = AbstractC3352my.m17104W(parcel, i26);
                            break;
                        case 7:
                            strM17138q18 = AbstractC3352my.m17138q(parcel, i26);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i26);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k26);
                return new zzom(jM17104W7, bArrM17132m7, strM17138q17, bundleM17130l3, iM17103V33, jM17104W8, strM17138q18);
            case 28:
                int iM17129k27 = AbstractC3352my.m17129k0(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iM17129k27) {
                            AbstractC3352my.m17145x(parcel, iM17129k27);
                            return new zzoo(arrayList);
                        }
                        int i27 = parcel.readInt();
                        if (((char) i27) != 1) {
                            AbstractC3352my.m17113c0(parcel, i27);
                        } else {
                            int iM17105X = AbstractC3352my.m17105X(parcel, i27);
                            int iDataPosition = parcel.dataPosition();
                            if (iM17105X == 0) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int i28 = parcel.readInt();
                            for (int i29 = 0; i29 < i28; i29++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition + iM17105X);
                            arrayList = arrayList2;
                        }
                        break;
                    }
                }
                break;
            default:
                int iM17129k28 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k28) {
                    int i30 = parcel.readInt();
                    if (((char) i30) != 1) {
                        AbstractC3352my.m17113c0(parcel, i30);
                    } else {
                        arrayListM17142u = AbstractC3352my.m17142u(parcel, i30, zzom.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k28);
                return new zzoq(arrayListM17142u);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f57950a) {
            case 0:
                return new zzam[i];
            case 1:
                return new zzao[i];
            case 2:
                return new com.google.android.gms.internal.vision.zzao[i];
            case 3:
                return new zzd[i];
            case 4:
                return new zza[i];
            case 5:
                return new ComplianceOptions[i];
            case 6:
                return new FaceParcel[i];
            case 7:
                return new zzc[i];
            case 8:
                return new com.google.android.gms.internal.mlkit_vision_text_common.zzd[i];
            case 9:
                return new zze[i];
            case 10:
                return new zzf[i];
            case 11:
                return new ExperimentTokens[i];
            case 12:
                return new zzjf[i];
            case 13:
                return new zzjh[i];
            case 14:
                return new zzjj[i];
            case 15:
                return new zzjl[i];
            case 16:
                return new zzjo[i];
            case 17:
                return new zzjq[i];
            case 18:
                return new zzjs[i];
            case 19:
                return new zzju[i];
            case 20:
                return new zzj[i];
            case 21:
                return new ConnectionTelemetryConfiguration[i];
            case 22:
                return new GetServiceRequest[i];
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new zzl[i];
            case 24:
                return new LandmarkParcel[i];
            case 25:
                return new zzn[i];
            case 26:
                return new zzoh[i];
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return new zzom[i];
            case 28:
                return new zzoo[i];
            default:
                return new zzoq[i];
        }
    }
}
