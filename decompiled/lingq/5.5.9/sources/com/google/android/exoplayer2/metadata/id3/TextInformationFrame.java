package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2467q;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new C2447a();

    /* JADX INFO: renamed from: b */
    public final String f12702b;

    /* JADX INFO: renamed from: c */
    public final ImmutableList<String> f12703c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.TextInformationFrame$a */
    public class C2447a implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            string.getClass();
            String string2 = parcel.readString();
            String[] strArrCreateStringArray = parcel.createStringArray();
            strArrCreateStringArray.getClass();
            return new TextInformationFrame(string, string2, ImmutableList.m9061U(strArrCreateStringArray));
        }

        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame[] newArray(int i10) {
            return new TextInformationFrame[i10];
        }
    }

    public TextInformationFrame(String str, String str2, List<String> list) {
        super(str);
        C10129a.m18990b(!list.isEmpty());
        this.f12702b = str2;
        ImmutableList<String> immutableListM9060Q = ImmutableList.m9060Q(list);
        this.f12703c = immutableListM9060Q;
        immutableListM9060Q.get(0);
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m7211a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TextInformationFrame.class == obj.getClass()) {
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            return C10134c0.m19034a(this.f12691a, textInformationFrame.f12691a) && C10134c0.m19034a(this.f12702b, textInformationFrame.f12702b) && this.f12703c.equals(textInformationFrame.f12703c);
        }
        return false;
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f12691a, 527, 31);
        String str = this.f12702b;
        return this.f12703c.hashCode() + ((iM758d + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0180  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* JADX INFO: renamed from: s */
    public final void mo7206s(C2467q.a aVar) {
        byte b10;
        String str = this.f12691a;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                if (!str.equals("TAL")) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 82878:
                if (!str.equals("TCM")) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 82897:
                if (!str.equals("TDA")) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 83253:
                if (!str.equals("TP1")) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case 83254:
                if (!str.equals("TP2")) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case 83255:
                if (!str.equals("TP3")) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case 83341:
                if (!str.equals("TRK")) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case 83378:
                if (!str.equals("TT2")) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 83536:
                if (!str.equals("TXT")) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case 83552:
                if (!str.equals("TYE")) {
                    b10 = -1;
                } else {
                    b10 = 9;
                }
                break;
            case 2567331:
                if (!str.equals("TALB")) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case 2569357:
                if (!str.equals("TCOM")) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case 2569891:
                if (!str.equals("TDAT")) {
                    b10 = -1;
                } else {
                    b10 = 12;
                }
                break;
            case 2570401:
                if (!str.equals("TDRC")) {
                    b10 = -1;
                } else {
                    b10 = 13;
                }
                break;
            case 2570410:
                if (!str.equals("TDRL")) {
                    b10 = -1;
                } else {
                    b10 = 14;
                }
                break;
            case 2571565:
                if (!str.equals("TEXT")) {
                    b10 = -1;
                } else {
                    b10 = 15;
                }
                break;
            case 2575251:
                if (!str.equals("TIT2")) {
                    b10 = -1;
                } else {
                    b10 = 16;
                }
                break;
            case 2581512:
                if (!str.equals("TPE1")) {
                    b10 = -1;
                } else {
                    b10 = 17;
                }
                break;
            case 2581513:
                if (!str.equals("TPE2")) {
                    b10 = -1;
                } else {
                    b10 = 18;
                }
                break;
            case 2581514:
                if (!str.equals("TPE3")) {
                    b10 = -1;
                } else {
                    b10 = 19;
                }
                break;
            case 2583398:
                if (!str.equals("TRCK")) {
                    b10 = -1;
                } else {
                    b10 = 20;
                }
                break;
            case 2590194:
                if (!str.equals("TYER")) {
                    b10 = -1;
                } else {
                    b10 = 21;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        ImmutableList<String> immutableList = this.f12703c;
        try {
            switch (b10) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                case 10:
                    aVar.f12949c = immutableList.get(0);
                    break;
                case 1:
                case 11:
                    aVar.f12971y = immutableList.get(0);
                    break;
                case 2:
                case 12:
                    String str2 = immutableList.get(0);
                    int i10 = Integer.parseInt(str2.substring(2, 4));
                    int i11 = Integer.parseInt(str2.substring(0, 2));
                    aVar.f12965s = Integer.valueOf(i10);
                    aVar.f12966t = Integer.valueOf(i11);
                    break;
                case 3:
                case 17:
                    aVar.f12948b = immutableList.get(0);
                    break;
                case 4:
                case 18:
                    aVar.f12950d = immutableList.get(0);
                    break;
                case 5:
                case 19:
                    aVar.f12972z = immutableList.get(0);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                case 20:
                    String str3 = immutableList.get(0);
                    int i12 = C10134c0.f51354a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i13 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    aVar.f12959m = Integer.valueOf(i13);
                    aVar.f12960n = numValueOf;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 16:
                    aVar.f12947a = immutableList.get(0);
                    break;
                case 8:
                case 15:
                    aVar.f12970x = immutableList.get(0);
                    break;
                case 9:
                case 21:
                    aVar.f12964r = Integer.valueOf(Integer.parseInt(immutableList.get(0)));
                    break;
                case 13:
                    ArrayList arrayListM7211a = m7211a(immutableList.get(0));
                    int size = arrayListM7211a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                aVar.f12966t = (Integer) arrayListM7211a.get(2);
                            }
                        }
                        aVar.f12965s = (Integer) arrayListM7211a.get(1);
                    }
                    aVar.f12964r = (Integer) arrayListM7211a.get(0);
                    break;
                case 14:
                    ArrayList arrayListM7211a2 = m7211a(immutableList.get(0));
                    int size2 = arrayListM7211a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                aVar.f12969w = (Integer) arrayListM7211a2.get(2);
                            }
                        }
                        aVar.f12968v = (Integer) arrayListM7211a2.get(1);
                    }
                    aVar.f12967u = (Integer) arrayListM7211a2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f12691a + ": description=" + this.f12702b + ": values=" + this.f12703c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12691a);
        parcel.writeString(this.f12702b);
        parcel.writeStringArray((String[]) this.f12703c.toArray(new String[0]));
    }
}
