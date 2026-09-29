package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import coil.memory.MemoryCache$Key;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.core.navigation.model.DictionaryToUseDataNavArg;
import com.lingq.core.navigation.model.ImportDataNavArg;
import com.lingq.core.navigation.model.LibraryShelfNavArg;
import com.lingq.core.navigation.model.LibraryTabNavArg;
import com.lingq.core.navigation.model.TokenMeaningNavArg;
import com.lingq.core.token.TokenFragmentData;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.TokenViewState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: v2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3670v2 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64716a;

    public /* synthetic */ C3670v2(int i) {
        this.f64716a = i;
    }

    /* JADX INFO: renamed from: a */
    public static void m23048a(zzbh zzbhVar, Parcel parcel, int i) {
        String str = zzbhVar.f12389a;
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 2, str);
        l70.m15929T(parcel, 3, zzbhVar.f12390b, i);
        l70.m15930U(parcel, 4, zzbhVar.f12391c);
        long j = zzbhVar.f12392d;
        l70.m15935Z(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = zzbhVar.f12393e;
        l70.m15935Z(parcel, 6, 8);
        parcel.writeLong(j2);
        l70.m15939b0(parcel, iM15937a0);
    }

    /* JADX INFO: renamed from: b */
    public static void m23049b(zzpl zzplVar, Parcel parcel) {
        int i = zzplVar.f12406a;
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(i);
        l70.m15930U(parcel, 2, zzplVar.f12407b);
        long j = zzplVar.f12408c;
        l70.m15935Z(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = zzplVar.f12409d;
        if (l != null) {
            l70.m15935Z(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        l70.m15930U(parcel, 6, zzplVar.f12410e);
        l70.m15930U(parcel, 7, zzplVar.f12411f);
        Double d = zzplVar.f12412g;
        if (d != null) {
            l70.m15935Z(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        l70.m15939b0(parcel, iM15937a0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String strM17138q = null;
        String strM17138q2 = null;
        String strM17138q3 = null;
        Bundle bundleM17130l = null;
        ArrayList arrayListM17142u = null;
        int iM17103V = 0;
        switch (this.f64716a) {
            case 0:
                parcel.getClass();
                return new AccessToken(parcel);
            case 1:
                parcel.getClass();
                return new DictionaryToUseDataNavArg(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 2:
                parcel.getClass();
                return new FacebookRequestError(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, false);
            case 3:
                parcel.getClass();
                return new ImportDataNavArg(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                parcel.getClass();
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iM17103V != i) {
                    arrayList.add(LibraryTabNavArg.CREATOR.createFromParcel(parcel));
                    iM17103V++;
                }
                return new LibraryShelfNavArg(z, z2, arrayList, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 5:
                parcel.getClass();
                return new LibraryTabNavArg(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readString());
            case 6:
                String string = parcel.readString();
                string.getClass();
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                while (iM17103V < i2) {
                    String string2 = parcel.readString();
                    string2.getClass();
                    String string3 = parcel.readString();
                    string3.getClass();
                    linkedHashMap.put(string2, string3);
                    iM17103V++;
                }
                return new MemoryCache$Key(string, linkedHashMap);
            case 7:
                return new PerfSession(parcel);
            case 8:
                return new Timer(parcel.readLong(), parcel.readLong());
            case 9:
                parcel.getClass();
                return new TokenMeaningNavArg(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, parcel.readInt());
            case 10:
                parcel.getClass();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                TokenType tokenTypeValueOf = TokenType.valueOf(parcel.readString());
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                TokenFragmentData tokenFragmentDataCreateFromParcel = TokenFragmentData.CREATOR.createFromParcel(parcel);
                TokenViewState tokenViewState = (TokenViewState) parcel.readParcelable(TokenPopupData.class.getClassLoader());
                TokenControllerType tokenControllerTypeValueOf = TokenControllerType.valueOf(parcel.readString());
                List listM23161c = v7d.m23161c(parcel);
                int i5 = parcel.readInt();
                TokenTransliteration tokenTransliterationM3488b = b8d.m3488b(parcel);
                boolean z3 = parcel.readInt() != 0;
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                return new TokenPopupData(string4, string5, tokenTypeValueOf, i3, i4, tokenFragmentDataCreateFromParcel, tokenViewState, tokenControllerTypeValueOf, listM23161c, i5, tokenTransliterationM3488b, z3, i6, i7, linkedHashMap2, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 11:
                return new Trace(parcel, false);
            case 12:
                int iM17129k0 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k0) {
                    int i10 = parcel.readInt();
                    char c = (char) i10;
                    if (c == 1) {
                        iM17103V = AbstractC3352my.m17103V(parcel, i10);
                    } else if (c != 2) {
                        AbstractC3352my.m17113c0(parcel, i10);
                    } else {
                        arrayListM17142u = AbstractC3352my.m17142u(parcel, i10, MethodInvocation.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k0);
                return new TelemetryData(iM17103V, arrayListM17142u);
            case 13:
                int iM17129k1 = AbstractC3352my.m17129k0(parcel);
                int iM17103V2 = -1;
                long jM17104W = 0;
                long jM17104W2 = 0;
                String strM17138q4 = null;
                String strM17138q5 = null;
                int iM17103V3 = 0;
                int iM17103V4 = 0;
                int iM17103V5 = 0;
                int iM17103V6 = 0;
                while (parcel.dataPosition() < iM17129k1) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iM17103V3 = AbstractC3352my.m17103V(parcel, i11);
                            break;
                        case 2:
                            iM17103V4 = AbstractC3352my.m17103V(parcel, i11);
                            break;
                        case 3:
                            iM17103V5 = AbstractC3352my.m17103V(parcel, i11);
                            break;
                        case 4:
                            jM17104W = AbstractC3352my.m17104W(parcel, i11);
                            break;
                        case 5:
                            jM17104W2 = AbstractC3352my.m17104W(parcel, i11);
                            break;
                        case 6:
                            strM17138q4 = AbstractC3352my.m17138q(parcel, i11);
                            break;
                        case 7:
                            strM17138q5 = AbstractC3352my.m17138q(parcel, i11);
                            break;
                        case '\b':
                            iM17103V6 = AbstractC3352my.m17103V(parcel, i11);
                            break;
                        case '\t':
                            iM17103V2 = AbstractC3352my.m17103V(parcel, i11);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i11);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k1);
                return new MethodInvocation(iM17103V3, iM17103V4, iM17103V5, jM17104W, jM17104W2, strM17138q4, strM17138q5, iM17103V6, iM17103V2);
            case 14:
                int iM17129k2 = AbstractC3352my.m17129k0(parcel);
                ArrayList arrayListM17142u2 = null;
                String strM17138q6 = null;
                Account account = null;
                String strM17138q7 = null;
                String strM17138q8 = null;
                Bundle bundleM17130l2 = null;
                boolean zM17099R = false;
                boolean zM17099R2 = false;
                boolean zM17099R3 = false;
                boolean zM17099R4 = false;
                int iM17103V7 = 0;
                while (parcel.dataPosition() < iM17129k2) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            arrayListM17142u2 = AbstractC3352my.m17142u(parcel, i12, Scope.CREATOR);
                            break;
                        case 2:
                            strM17138q6 = AbstractC3352my.m17138q(parcel, i12);
                            break;
                        case 3:
                            zM17099R = AbstractC3352my.m17099R(parcel, i12);
                            break;
                        case 4:
                            zM17099R2 = AbstractC3352my.m17099R(parcel, i12);
                            break;
                        case 5:
                            account = (Account) AbstractC3352my.m17137p(parcel, i12, Account.CREATOR);
                            break;
                        case 6:
                            strM17138q7 = AbstractC3352my.m17138q(parcel, i12);
                            break;
                        case 7:
                            strM17138q8 = AbstractC3352my.m17138q(parcel, i12);
                            break;
                        case '\b':
                            zM17099R3 = AbstractC3352my.m17099R(parcel, i12);
                            break;
                        case '\t':
                            bundleM17130l2 = AbstractC3352my.m17130l(parcel, i12);
                            break;
                        case '\n':
                            zM17099R4 = AbstractC3352my.m17099R(parcel, i12);
                            break;
                        case 11:
                            iM17103V7 = AbstractC3352my.m17103V(parcel, i12);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i12);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k2);
                return new AuthorizationRequest(arrayListM17142u2, strM17138q6, zM17099R, zM17099R2, account, strM17138q7, strM17138q8, zM17099R3, bundleM17130l2, zM17099R4, iM17103V7);
            case 15:
                int iM17129k3 = AbstractC3352my.m17129k0(parcel);
                PendingIntent pendingIntent = null;
                String strM17138q9 = null;
                Integer numValueOf = null;
                int iM17103V8 = 0;
                int iM17103V9 = 0;
                while (parcel.dataPosition() < iM17129k3) {
                    int i13 = parcel.readInt();
                    char c2 = (char) i13;
                    if (c2 == 1) {
                        iM17103V8 = AbstractC3352my.m17103V(parcel, i13);
                    } else if (c2 == 2) {
                        iM17103V9 = AbstractC3352my.m17103V(parcel, i13);
                    } else if (c2 == 3) {
                        pendingIntent = (PendingIntent) AbstractC3352my.m17137p(parcel, i13, PendingIntent.CREATOR);
                    } else if (c2 == 4) {
                        strM17138q9 = AbstractC3352my.m17138q(parcel, i13);
                    } else if (c2 != 5) {
                        AbstractC3352my.m17113c0(parcel, i13);
                    } else {
                        int iM17105X = AbstractC3352my.m17105X(parcel, i13);
                        if (iM17105X == 0) {
                            numValueOf = null;
                        } else {
                            AbstractC3352my.m17135n0(parcel, iM17105X, 4);
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k3);
                return new ConnectionResult(iM17103V8, iM17103V9, pendingIntent, strM17138q9, numValueOf);
            case 16:
                int iM17129k4 = AbstractC3352my.m17129k0(parcel);
                long jM17104W3 = -1;
                String strM17138q10 = null;
                int iM17103V10 = 0;
                boolean zM17099R5 = false;
                while (parcel.dataPosition() < iM17129k4) {
                    int i14 = parcel.readInt();
                    char c3 = (char) i14;
                    if (c3 == 1) {
                        strM17138q10 = AbstractC3352my.m17138q(parcel, i14);
                    } else if (c3 == 2) {
                        iM17103V10 = AbstractC3352my.m17103V(parcel, i14);
                    } else if (c3 == 3) {
                        jM17104W3 = AbstractC3352my.m17104W(parcel, i14);
                    } else if (c3 != 4) {
                        AbstractC3352my.m17113c0(parcel, i14);
                    } else {
                        zM17099R5 = AbstractC3352my.m17099R(parcel, i14);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k4);
                return new Feature(iM17103V10, jM17104W3, strM17138q10, zM17099R5);
            case 17:
                int iM17129k5 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k5) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 2) {
                        AbstractC3352my.m17113c0(parcel, i15);
                    } else {
                        bundleM17130l = AbstractC3352my.m17130l(parcel, i15);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k5);
                return new zzbf(bundleM17130l);
            case 18:
                int iM17129k6 = AbstractC3352my.m17129k0(parcel);
                long jM17104W4 = 0;
                long jM17104W5 = 0;
                String strM17138q11 = null;
                zzbf zzbfVar = null;
                String strM17138q12 = null;
                while (parcel.dataPosition() < iM17129k6) {
                    int i16 = parcel.readInt();
                    char c4 = (char) i16;
                    if (c4 == 2) {
                        strM17138q11 = AbstractC3352my.m17138q(parcel, i16);
                    } else if (c4 == 3) {
                        zzbfVar = (zzbf) AbstractC3352my.m17137p(parcel, i16, zzbf.CREATOR);
                    } else if (c4 == 4) {
                        strM17138q12 = AbstractC3352my.m17138q(parcel, i16);
                    } else if (c4 == 5) {
                        jM17104W4 = AbstractC3352my.m17104W(parcel, i16);
                    } else if (c4 != 6) {
                        AbstractC3352my.m17113c0(parcel, i16);
                    } else {
                        jM17104W5 = AbstractC3352my.m17104W(parcel, i16);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k6);
                return new zzbh(strM17138q11, zzbfVar, strM17138q12, jM17104W4, jM17104W5);
            case 19:
                int iM17129k7 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k7) {
                    int i17 = parcel.readInt();
                    char c5 = (char) i17;
                    if (c5 == 1) {
                        iM17103V = AbstractC3352my.m17103V(parcel, i17);
                    } else if (c5 != 2) {
                        AbstractC3352my.m17113c0(parcel, i17);
                    } else {
                        strM17138q3 = AbstractC3352my.m17138q(parcel, i17);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k7);
                return new Scope(iM17103V, strM17138q3);
            case 20:
                int iM17129k8 = AbstractC3352my.m17129k0(parcel);
                long jM17104W6 = 0;
                long jM17104W7 = 0;
                Bundle bundleM17130l3 = null;
                String strM17138q13 = null;
                boolean zM17099R6 = false;
                while (parcel.dataPosition() < iM17129k8) {
                    int i18 = parcel.readInt();
                    char c6 = (char) i18;
                    if (c6 == 1) {
                        jM17104W6 = AbstractC3352my.m17104W(parcel, i18);
                    } else if (c6 == 2) {
                        jM17104W7 = AbstractC3352my.m17104W(parcel, i18);
                    } else if (c6 == 3) {
                        zM17099R6 = AbstractC3352my.m17099R(parcel, i18);
                    } else if (c6 == 7) {
                        bundleM17130l3 = AbstractC3352my.m17130l(parcel, i18);
                    } else if (c6 != '\b') {
                        AbstractC3352my.m17113c0(parcel, i18);
                    } else {
                        strM17138q13 = AbstractC3352my.m17138q(parcel, i18);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k8);
                return new zzdb(jM17104W6, jM17104W7, zM17099R6, bundleM17130l3, strM17138q13);
            case 21:
                int iM17129k9 = AbstractC3352my.m17129k0(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iM17129k9) {
                    int i19 = parcel.readInt();
                    char c7 = (char) i19;
                    if (c7 == 1) {
                        iM17103V = AbstractC3352my.m17103V(parcel, i19);
                    } else if (c7 == 2) {
                        strM17138q2 = AbstractC3352my.m17138q(parcel, i19);
                    } else if (c7 != 3) {
                        AbstractC3352my.m17113c0(parcel, i19);
                    } else {
                        intent = (Intent) AbstractC3352my.m17137p(parcel, i19, Intent.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k9);
                return new zzdd(iM17103V, strM17138q2, intent);
            case 22:
                int iM17129k10 = AbstractC3352my.m17129k0(parcel);
                PendingIntent pendingIntent2 = null;
                ConnectionResult connectionResult = null;
                while (parcel.dataPosition() < iM17129k10) {
                    int i20 = parcel.readInt();
                    char c8 = (char) i20;
                    if (c8 == 1) {
                        iM17103V = AbstractC3352my.m17103V(parcel, i20);
                    } else if (c8 == 2) {
                        strM17138q = AbstractC3352my.m17138q(parcel, i20);
                    } else if (c8 == 3) {
                        pendingIntent2 = (PendingIntent) AbstractC3352my.m17137p(parcel, i20, PendingIntent.CREATOR);
                    } else if (c8 != 4) {
                        AbstractC3352my.m17113c0(parcel, i20);
                    } else {
                        connectionResult = (ConnectionResult) AbstractC3352my.m17137p(parcel, i20, ConnectionResult.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k10);
                return new Status(iM17103V, strM17138q, pendingIntent2, connectionResult);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                int iM17129k11 = AbstractC3352my.m17129k0(parcel);
                long jM17104W8 = 0;
                String strM17138q14 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strM17138q15 = null;
                String strM17138q16 = null;
                Double dValueOf = null;
                int iM17103V11 = 0;
                while (parcel.dataPosition() < iM17129k11) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            iM17103V11 = AbstractC3352my.m17103V(parcel, i21);
                            break;
                        case 2:
                            strM17138q14 = AbstractC3352my.m17138q(parcel, i21);
                            break;
                        case 3:
                            jM17104W8 = AbstractC3352my.m17104W(parcel, i21);
                            break;
                        case 4:
                            int iM17105X2 = AbstractC3352my.m17105X(parcel, i21);
                            if (iM17105X2 == 0) {
                                lValueOf = null;
                            } else {
                                AbstractC3352my.m17135n0(parcel, iM17105X2, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            }
                            break;
                        case 5:
                            int iM17105X3 = AbstractC3352my.m17105X(parcel, i21);
                            if (iM17105X3 == 0) {
                                fValueOf = null;
                            } else {
                                AbstractC3352my.m17135n0(parcel, iM17105X3, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            }
                            break;
                        case 6:
                            strM17138q15 = AbstractC3352my.m17138q(parcel, i21);
                            break;
                        case 7:
                            strM17138q16 = AbstractC3352my.m17138q(parcel, i21);
                            break;
                        case '\b':
                            int iM17105X4 = AbstractC3352my.m17105X(parcel, i21);
                            if (iM17105X4 == 0) {
                                dValueOf = null;
                            } else {
                                AbstractC3352my.m17135n0(parcel, iM17105X4, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i21);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k11);
                return new zzpl(iM17103V11, strM17138q14, jM17104W8, lValueOf, fValueOf, strM17138q15, strM17138q16, dValueOf);
            default:
                int iM17129k12 = AbstractC3352my.m17129k0(parcel);
                String strM17138q17 = "";
                String strM17138q18 = strM17138q17;
                String strM17138q19 = strM17138q18;
                String strM17138q20 = strM17138q19;
                int iM17103V12 = 100;
                long jM17104W9 = 0;
                long jM17104W10 = 0;
                long jM17104W11 = 0;
                long jM17104W12 = 0;
                long jM17104W13 = 0;
                long jM17104W14 = 0;
                long jM17104W15 = 0;
                long jM17104W16 = 0;
                boolean zM17099R7 = true;
                boolean zM17099R8 = true;
                String strM17138q21 = null;
                String strM17138q22 = null;
                String strM17138q23 = null;
                String strM17138q24 = null;
                String strM17138q25 = null;
                String strM17138q26 = null;
                Boolean boolValueOf = null;
                ArrayList arrayListM17140s = null;
                String strM17138q27 = null;
                String strM17138q28 = null;
                boolean zM17099R9 = false;
                int iM17103V13 = 0;
                boolean zM17099R10 = false;
                boolean zM17099R11 = false;
                int iM17103V14 = 0;
                int iM17103V15 = 0;
                long jM17104W17 = -2147483648L;
                while (parcel.dataPosition() < iM17129k12) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            strM17138q21 = AbstractC3352my.m17138q(parcel, i22);
                            break;
                        case 3:
                            strM17138q22 = AbstractC3352my.m17138q(parcel, i22);
                            break;
                        case 4:
                            strM17138q23 = AbstractC3352my.m17138q(parcel, i22);
                            break;
                        case 5:
                            strM17138q24 = AbstractC3352my.m17138q(parcel, i22);
                            break;
                        case 6:
                            jM17104W9 = AbstractC3352my.m17104W(parcel, i22);
                            break;
                        case 7:
                            jM17104W10 = AbstractC3352my.m17104W(parcel, i22);
                            break;
                        case '\b':
                            strM17138q25 = AbstractC3352my.m17138q(parcel, i22);
                            break;
                        case '\t':
                            zM17099R7 = AbstractC3352my.m17099R(parcel, i22);
                            break;
                        case '\n':
                            zM17099R9 = AbstractC3352my.m17099R(parcel, i22);
                            break;
                        case 11:
                            jM17104W17 = AbstractC3352my.m17104W(parcel, i22);
                            break;
                        case '\f':
                            strM17138q26 = AbstractC3352my.m17138q(parcel, i22);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            AbstractC3352my.m17113c0(parcel, i22);
                            break;
                        case 14:
                            jM17104W11 = AbstractC3352my.m17104W(parcel, i22);
                            break;
                        case 15:
                            iM17103V13 = AbstractC3352my.m17103V(parcel, i22);
                            break;
                        case 16:
                            zM17099R8 = AbstractC3352my.m17099R(parcel, i22);
                            break;
                        case 18:
                            zM17099R10 = AbstractC3352my.m17099R(parcel, i22);
                            break;
                        case 21:
                            int iM17105X5 = AbstractC3352my.m17105X(parcel, i22);
                            if (iM17105X5 == 0) {
                                boolValueOf = null;
                            } else {
                                AbstractC3352my.m17135n0(parcel, iM17105X5, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            break;
                        case 22:
                            jM17104W12 = AbstractC3352my.m17104W(parcel, i22);
                            break;
                        case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                            arrayListM17140s = AbstractC3352my.m17140s(parcel, i22);
                            break;
                        case 25:
                            strM17138q17 = AbstractC3352my.m17138q(parcel, i22);
                            break;
                        case 26:
                            strM17138q18 = AbstractC3352my.m17138q(parcel, i22);
                            break;
                        case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            strM17138q27 = AbstractC3352my.m17138q(parcel, i22);
                            break;
                        case 28:
                            zM17099R11 = AbstractC3352my.m17099R(parcel, i22);
                            break;
                        case 29:
                            jM17104W13 = AbstractC3352my.m17104W(parcel, i22);
                            break;
                        case 30:
                            iM17103V12 = AbstractC3352my.m17103V(parcel, i22);
                            break;
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            strM17138q19 = AbstractC3352my.m17138q(parcel, i22);
                            break;
                        case ' ':
                            iM17103V14 = AbstractC3352my.m17103V(parcel, i22);
                            break;
                        case '\"':
                            jM17104W14 = AbstractC3352my.m17104W(parcel, i22);
                            break;
                        case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            strM17138q28 = AbstractC3352my.m17138q(parcel, i22);
                            break;
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            strM17138q20 = AbstractC3352my.m17138q(parcel, i22);
                            break;
                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            jM17104W15 = AbstractC3352my.m17104W(parcel, i22);
                            break;
                        case '&':
                            iM17103V15 = AbstractC3352my.m17103V(parcel, i22);
                            break;
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            jM17104W16 = AbstractC3352my.m17104W(parcel, i22);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k12);
                return new zzr(strM17138q21, strM17138q22, strM17138q23, strM17138q24, jM17104W9, jM17104W10, strM17138q25, zM17099R7, zM17099R9, jM17104W17, strM17138q26, jM17104W11, iM17103V13, zM17099R8, zM17099R10, boolValueOf, jM17104W12, arrayListM17140s, strM17138q17, strM17138q18, strM17138q27, zM17099R11, jM17104W13, iM17103V12, strM17138q19, iM17103V14, jM17104W14, strM17138q28, strM17138q20, jM17104W15, iM17103V15, jM17104W16);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f64716a) {
            case 0:
                return new AccessToken[i];
            case 1:
                return new DictionaryToUseDataNavArg[i];
            case 2:
                return new FacebookRequestError[i];
            case 3:
                return new ImportDataNavArg[i];
            case 4:
                return new LibraryShelfNavArg[i];
            case 5:
                return new LibraryTabNavArg[i];
            case 6:
                return new MemoryCache$Key[i];
            case 7:
                return new PerfSession[i];
            case 8:
                return new Timer[i];
            case 9:
                return new TokenMeaningNavArg[i];
            case 10:
                return new TokenPopupData[i];
            case 11:
                return new Trace[i];
            case 12:
                return new TelemetryData[i];
            case 13:
                return new MethodInvocation[i];
            case 14:
                return new AuthorizationRequest[i];
            case 15:
                return new ConnectionResult[i];
            case 16:
                return new Feature[i];
            case 17:
                return new zzbf[i];
            case 18:
                return new zzbh[i];
            case 19:
                return new Scope[i];
            case 20:
                return new zzdb[i];
            case 21:
                return new zzdd[i];
            case 22:
                return new Status[i];
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new zzpl[i];
            default:
                return new zzr[i];
        }
    }
}
