package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.zzp;
import com.google.android.gms.common.zzr;
import com.google.android.gms.common.zzt;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzuc;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzue;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzn;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvj;
import com.google.android.gms.internal.vision.zzs;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class nbd implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52581a;

    public /* synthetic */ nbd(int i) {
        this.f52581a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jM17104W = 0;
        boolean zM17099R = false;
        int iM17103V = 0;
        String strM17138q = null;
        String strM17138q2 = null;
        ArrayList arrayListM17142u = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strM17138q3 = null;
        switch (this.f52581a) {
            case 0:
                int iM17129k0 = AbstractC3352my.m17129k0(parcel);
                boolean zM17099R2 = false;
                boolean zM17099R3 = false;
                boolean zM17099R4 = false;
                boolean zM17099R5 = false;
                boolean zM17099R6 = false;
                String strM17138q4 = null;
                IBinder iBinderM17102U = null;
                while (parcel.dataPosition() < iM17129k0) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            strM17138q4 = AbstractC3352my.m17138q(parcel, i);
                            break;
                        case 2:
                            zM17099R2 = AbstractC3352my.m17099R(parcel, i);
                            break;
                        case 3:
                            zM17099R3 = AbstractC3352my.m17099R(parcel, i);
                            break;
                        case 4:
                            iBinderM17102U = AbstractC3352my.m17102U(parcel, i);
                            break;
                        case 5:
                            zM17099R4 = AbstractC3352my.m17099R(parcel, i);
                            break;
                        case 6:
                            zM17099R5 = AbstractC3352my.m17099R(parcel, i);
                            break;
                        case 7:
                        default:
                            AbstractC3352my.m17113c0(parcel, i);
                            break;
                        case '\b':
                            zM17099R6 = AbstractC3352my.m17099R(parcel, i);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k0);
                return new zzp(strM17138q4, zM17099R2, zM17099R3, iBinderM17102U, zM17099R4, zM17099R5, zM17099R6);
            case 1:
                int iM17129k1 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k1) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 2) {
                        AbstractC3352my.m17113c0(parcel, i2);
                    } else {
                        strM17138q = AbstractC3352my.m17138q(parcel, i2);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k1);
                return new com.google.android.gms.internal.mlkit_vision_text_common.zzp(strM17138q);
            case 2:
                int iM17129k2 = AbstractC3352my.m17129k0(parcel);
                long jM17104W2 = -1;
                int iM17103V2 = 0;
                int iM17103V3 = 0;
                boolean zM17099R7 = false;
                String strM17138q5 = null;
                while (parcel.dataPosition() < iM17129k2) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 1) {
                        zM17099R7 = AbstractC3352my.m17099R(parcel, i3);
                    } else if (c == 2) {
                        strM17138q5 = AbstractC3352my.m17138q(parcel, i3);
                    } else if (c == 3) {
                        iM17103V2 = AbstractC3352my.m17103V(parcel, i3);
                    } else if (c == 4) {
                        iM17103V3 = AbstractC3352my.m17103V(parcel, i3);
                    } else if (c != 5) {
                        AbstractC3352my.m17113c0(parcel, i3);
                    } else {
                        jM17104W2 = AbstractC3352my.m17104W(parcel, i3);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k2);
                return new zzr(iM17103V2, iM17103V3, jM17104W2, strM17138q5, zM17099R7);
            case 3:
                int iM17129k3 = AbstractC3352my.m17129k0(parcel);
                int iM17103V4 = 0;
                int iM17103V5 = 0;
                int iM17103V6 = 0;
                boolean zM17099R8 = false;
                boolean zM17099R9 = true;
                String strM17138q6 = null;
                String strM17138q7 = null;
                String strM17138q8 = null;
                String strM17138q9 = null;
                while (parcel.dataPosition() < iM17129k3) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 2:
                            strM17138q6 = AbstractC3352my.m17138q(parcel, i4);
                            break;
                        case 3:
                            iM17103V4 = AbstractC3352my.m17103V(parcel, i4);
                            break;
                        case 4:
                            iM17103V5 = AbstractC3352my.m17103V(parcel, i4);
                            break;
                        case 5:
                            strM17138q7 = AbstractC3352my.m17138q(parcel, i4);
                            break;
                        case 6:
                            strM17138q8 = AbstractC3352my.m17138q(parcel, i4);
                            break;
                        case 7:
                            zM17099R9 = AbstractC3352my.m17099R(parcel, i4);
                            break;
                        case '\b':
                            strM17138q9 = AbstractC3352my.m17138q(parcel, i4);
                            break;
                        case '\t':
                            zM17099R8 = AbstractC3352my.m17099R(parcel, i4);
                            break;
                        case '\n':
                            iM17103V6 = AbstractC3352my.m17103V(parcel, i4);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i4);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k3);
                return new com.google.android.gms.internal.clearcut.zzr(iM17103V4, iM17103V5, iM17103V6, strM17138q6, strM17138q7, strM17138q8, strM17138q9, zM17099R9, zM17099R8);
            case 4:
                int iM17129k4 = AbstractC3352my.m17129k0(parcel);
                float fM17101T = 0.0f;
                boolean zM17099R10 = false;
                zzn[] zznVarArr = null;
                zzf zzfVar = null;
                zzf zzfVar2 = null;
                String strM17138q10 = null;
                String strM17138q11 = null;
                while (parcel.dataPosition() < iM17129k4) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 2:
                            zznVarArr = (zzn[]) AbstractC3352my.m17141t(parcel, i5, zzn.CREATOR);
                            break;
                        case 3:
                            zzfVar = (zzf) AbstractC3352my.m17137p(parcel, i5, zzf.CREATOR);
                            break;
                        case 4:
                            zzfVar2 = (zzf) AbstractC3352my.m17137p(parcel, i5, zzf.CREATOR);
                            break;
                        case 5:
                            strM17138q10 = AbstractC3352my.m17138q(parcel, i5);
                            break;
                        case 6:
                            fM17101T = AbstractC3352my.m17101T(parcel, i5);
                            break;
                        case 7:
                            strM17138q11 = AbstractC3352my.m17138q(parcel, i5);
                            break;
                        case '\b':
                            zM17099R10 = AbstractC3352my.m17099R(parcel, i5);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i5);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k4);
                return new com.google.android.gms.internal.mlkit_vision_text_common.zzr(zznVarArr, zzfVar, zzfVar2, strM17138q10, fM17101T, strM17138q11, zM17099R10);
            case 5:
                int iM17129k5 = AbstractC3352my.m17129k0(parcel);
                boolean zM17099R11 = false;
                IBinder iBinderM17102U2 = null;
                while (parcel.dataPosition() < iM17129k5) {
                    int i6 = parcel.readInt();
                    char c2 = (char) i6;
                    if (c2 == 1) {
                        strM17138q3 = AbstractC3352my.m17138q(parcel, i6);
                    } else if (c2 == 2) {
                        iBinderM17102U2 = AbstractC3352my.m17102U(parcel, i6);
                    } else if (c2 == 3) {
                        zM17099R = AbstractC3352my.m17099R(parcel, i6);
                    } else if (c2 != 4) {
                        AbstractC3352my.m17113c0(parcel, i6);
                    } else {
                        zM17099R11 = AbstractC3352my.m17099R(parcel, i6);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k5);
                return new zzt(strM17138q3, iBinderM17102U2, zM17099R, zM17099R11);
            case 6:
                int iM17129k6 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k6) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        AbstractC3352my.m17113c0(parcel, i7);
                    } else {
                        bitmapTeleporter = (BitmapTeleporter) AbstractC3352my.m17137p(parcel, i7, BitmapTeleporter.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k6);
                return new zzuc(bitmapTeleporter);
            case 7:
                int iM17129k7 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k7) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 1) {
                        AbstractC3352my.m17113c0(parcel, i8);
                    } else {
                        arrayListM17142u = AbstractC3352my.m17142u(parcel, i8, zzuc.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k7);
                return new zzue(arrayListM17142u);
            case 8:
                int iM17129k8 = AbstractC3352my.m17129k0(parcel);
                long jM17104W3 = 0;
                int iM17103V7 = 0;
                int iM17103V8 = 0;
                int iM17103V9 = 0;
                int iM17103V10 = 0;
                while (parcel.dataPosition() < iM17129k8) {
                    int i9 = parcel.readInt();
                    char c3 = (char) i9;
                    if (c3 == 1) {
                        iM17103V7 = AbstractC3352my.m17103V(parcel, i9);
                    } else if (c3 == 2) {
                        iM17103V8 = AbstractC3352my.m17103V(parcel, i9);
                    } else if (c3 == 3) {
                        iM17103V9 = AbstractC3352my.m17103V(parcel, i9);
                    } else if (c3 == 4) {
                        iM17103V10 = AbstractC3352my.m17103V(parcel, i9);
                    } else if (c3 != 5) {
                        AbstractC3352my.m17113c0(parcel, i9);
                    } else {
                        jM17104W3 = AbstractC3352my.m17104W(parcel, i9);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k8);
                return new zzuq(iM17103V7, iM17103V8, iM17103V9, iM17103V10, jM17104W3);
            case 9:
                int iM17129k9 = AbstractC3352my.m17129k0(parcel);
                int iM17103V11 = 0;
                int iM17103V12 = 0;
                int iM17103V13 = 0;
                while (parcel.dataPosition() < iM17129k9) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 2) {
                        iM17103V = AbstractC3352my.m17103V(parcel, i10);
                    } else if (c4 == 3) {
                        iM17103V11 = AbstractC3352my.m17103V(parcel, i10);
                    } else if (c4 == 4) {
                        iM17103V12 = AbstractC3352my.m17103V(parcel, i10);
                    } else if (c4 == 5) {
                        jM17104W = AbstractC3352my.m17104W(parcel, i10);
                    } else if (c4 != 6) {
                        AbstractC3352my.m17113c0(parcel, i10);
                    } else {
                        iM17103V13 = AbstractC3352my.m17103V(parcel, i10);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k9);
                zzs zzsVar = new zzs();
                zzsVar.f12301a = iM17103V;
                zzsVar.f12302b = iM17103V11;
                zzsVar.f12303c = iM17103V12;
                zzsVar.f12304d = jM17104W;
                zzsVar.f12305e = iM17103V13;
                return zzsVar;
            case 10:
                int iM17129k10 = AbstractC3352my.m17129k0(parcel);
                String strM17138q12 = null;
                Rect rect = null;
                ArrayList arrayListM17142u2 = null;
                String strM17138q13 = null;
                ArrayList arrayListM17142u3 = null;
                while (parcel.dataPosition() < iM17129k10) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 1) {
                        strM17138q12 = AbstractC3352my.m17138q(parcel, i11);
                    } else if (c5 == 2) {
                        rect = (Rect) AbstractC3352my.m17137p(parcel, i11, Rect.CREATOR);
                    } else if (c5 == 3) {
                        arrayListM17142u2 = AbstractC3352my.m17142u(parcel, i11, Point.CREATOR);
                    } else if (c5 == 4) {
                        strM17138q13 = AbstractC3352my.m17138q(parcel, i11);
                    } else if (c5 != 5) {
                        AbstractC3352my.m17113c0(parcel, i11);
                    } else {
                        arrayListM17142u3 = AbstractC3352my.m17142u(parcel, i11, zzvd.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k10);
                return new zzuz(strM17138q12, rect, arrayListM17142u2, strM17138q13, arrayListM17142u3);
            case 11:
                int iM17129k11 = AbstractC3352my.m17129k0(parcel);
                float fM17101T2 = 0.0f;
                float fM17101T3 = 0.0f;
                Rect rect2 = null;
                String strM17138q14 = null;
                String strM17138q15 = null;
                ArrayList arrayListM17142u4 = null;
                ArrayList arrayListM17142u5 = null;
                while (parcel.dataPosition() < iM17129k11) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            strM17138q14 = AbstractC3352my.m17138q(parcel, i12);
                            break;
                        case 2:
                            rect2 = (Rect) AbstractC3352my.m17137p(parcel, i12, Rect.CREATOR);
                            break;
                        case 3:
                            arrayListM17142u4 = AbstractC3352my.m17142u(parcel, i12, Point.CREATOR);
                            break;
                        case 4:
                            strM17138q15 = AbstractC3352my.m17138q(parcel, i12);
                            break;
                        case 5:
                            fM17101T2 = AbstractC3352my.m17101T(parcel, i12);
                            break;
                        case 6:
                            fM17101T3 = AbstractC3352my.m17101T(parcel, i12);
                            break;
                        case 7:
                            arrayListM17142u5 = AbstractC3352my.m17142u(parcel, i12, zzvj.CREATOR);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i12);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k11);
                return new zzvb(fM17101T2, fM17101T3, rect2, strM17138q14, strM17138q15, arrayListM17142u4, arrayListM17142u5);
            case 12:
                int iM17129k12 = AbstractC3352my.m17129k0(parcel);
                float fM17101T4 = 0.0f;
                float fM17101T5 = 0.0f;
                Rect rect3 = null;
                String strM17138q16 = null;
                String strM17138q17 = null;
                ArrayList arrayListM17142u6 = null;
                ArrayList arrayListM17142u7 = null;
                while (parcel.dataPosition() < iM17129k12) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            strM17138q16 = AbstractC3352my.m17138q(parcel, i13);
                            break;
                        case 2:
                            rect3 = (Rect) AbstractC3352my.m17137p(parcel, i13, Rect.CREATOR);
                            break;
                        case 3:
                            arrayListM17142u6 = AbstractC3352my.m17142u(parcel, i13, Point.CREATOR);
                            break;
                        case 4:
                            strM17138q17 = AbstractC3352my.m17138q(parcel, i13);
                            break;
                        case 5:
                            arrayListM17142u7 = AbstractC3352my.m17142u(parcel, i13, zzvb.CREATOR);
                            break;
                        case 6:
                            fM17101T4 = AbstractC3352my.m17101T(parcel, i13);
                            break;
                        case 7:
                            fM17101T5 = AbstractC3352my.m17101T(parcel, i13);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i13);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k12);
                return new zzvd(fM17101T4, fM17101T5, rect3, strM17138q16, strM17138q17, arrayListM17142u6, arrayListM17142u7);
            case 13:
                int iM17129k13 = AbstractC3352my.m17129k0(parcel);
                ArrayList arrayListM17142u8 = null;
                while (parcel.dataPosition() < iM17129k13) {
                    int i14 = parcel.readInt();
                    char c6 = (char) i14;
                    if (c6 == 1) {
                        strM17138q2 = AbstractC3352my.m17138q(parcel, i14);
                    } else if (c6 != 2) {
                        AbstractC3352my.m17113c0(parcel, i14);
                    } else {
                        arrayListM17142u8 = AbstractC3352my.m17142u(parcel, i14, zzuz.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k13);
                return new zzvf(strM17138q2, arrayListM17142u8);
            case 14:
                int iM17129k14 = AbstractC3352my.m17129k0(parcel);
                int iM17103V14 = 0;
                boolean zM17099R12 = false;
                boolean zM17099R13 = false;
                String strM17138q18 = null;
                String strM17138q19 = null;
                String strM17138q20 = null;
                String strM17138q21 = null;
                while (parcel.dataPosition() < iM17129k14) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            strM17138q18 = AbstractC3352my.m17138q(parcel, i15);
                            break;
                        case 2:
                            strM17138q19 = AbstractC3352my.m17138q(parcel, i15);
                            break;
                        case 3:
                            strM17138q20 = AbstractC3352my.m17138q(parcel, i15);
                            break;
                        case 4:
                            zM17099R12 = AbstractC3352my.m17099R(parcel, i15);
                            break;
                        case 5:
                            iM17103V14 = AbstractC3352my.m17103V(parcel, i15);
                            break;
                        case 6:
                            strM17138q21 = AbstractC3352my.m17138q(parcel, i15);
                            break;
                        case 7:
                            zM17099R13 = AbstractC3352my.m17099R(parcel, i15);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i15);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k14);
                return new zzvh(iM17103V14, strM17138q18, strM17138q19, strM17138q20, strM17138q21, zM17099R12, zM17099R13);
            default:
                int iM17129k15 = AbstractC3352my.m17129k0(parcel);
                float fM17101T6 = 0.0f;
                float fM17101T7 = 0.0f;
                String strM17138q22 = null;
                Rect rect4 = null;
                ArrayList arrayListM17142u9 = null;
                while (parcel.dataPosition() < iM17129k15) {
                    int i16 = parcel.readInt();
                    char c7 = (char) i16;
                    if (c7 == 1) {
                        strM17138q22 = AbstractC3352my.m17138q(parcel, i16);
                    } else if (c7 == 2) {
                        rect4 = (Rect) AbstractC3352my.m17137p(parcel, i16, Rect.CREATOR);
                    } else if (c7 == 3) {
                        arrayListM17142u9 = AbstractC3352my.m17142u(parcel, i16, Point.CREATOR);
                    } else if (c7 == 4) {
                        fM17101T6 = AbstractC3352my.m17101T(parcel, i16);
                    } else if (c7 != 5) {
                        AbstractC3352my.m17113c0(parcel, i16);
                    } else {
                        fM17101T7 = AbstractC3352my.m17101T(parcel, i16);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k15);
                return new zzvj(strM17138q22, rect4, arrayListM17142u9, fM17101T6, fM17101T7);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f52581a) {
            case 0:
                return new zzp[i];
            case 1:
                return new com.google.android.gms.internal.mlkit_vision_text_common.zzp[i];
            case 2:
                return new zzr[i];
            case 3:
                return new com.google.android.gms.internal.clearcut.zzr[i];
            case 4:
                return new com.google.android.gms.internal.mlkit_vision_text_common.zzr[i];
            case 5:
                return new zzt[i];
            case 6:
                return new zzuc[i];
            case 7:
                return new zzue[i];
            case 8:
                return new zzuq[i];
            case 9:
                return new zzs[i];
            case 10:
                return new zzuz[i];
            case 11:
                return new zzvb[i];
            case 12:
                return new zzvd[i];
            case 13:
                return new zzvf[i];
            case 14:
                return new zzvh[i];
            default:
                return new zzvj[i];
        }
    }
}
