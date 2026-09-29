package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.network.api.result.Participant;
import com.lingq.core.network.api.result.ParticipantStat;
import com.lingq.core.network.api.result.ResultChallenge;
import com.lingq.core.network.api.result.Target;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xpc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f68509a = new C0282a(2050240506, false, new fe1(9));

    /* JADX INFO: renamed from: b */
    public static final C0282a f68510b = new C0282a(710658582, false, new fe1(18));

    /* JADX INFO: renamed from: c */
    public static final C0282a f68511c = new C0282a(-1038420353, false, new fe1(19));

    /* JADX INFO: renamed from: d */
    public static final C0282a f68512d = new C0282a(1543850395, false, new fe1(20));

    /* JADX INFO: renamed from: e */
    public static final C0282a f68513e = new C0282a(1809733028, false, new fe1(21));

    /* JADX INFO: renamed from: f */
    public static final C0282a f68514f = new C0282a(-2067488286, false, new fe1(22));

    /* JADX INFO: renamed from: g */
    public static final C0282a f68515g = new C0282a(-781005981, false, new fe1(10));

    /* JADX INFO: renamed from: h */
    public static final C0282a f68516h = new C0282a(1618281228, false, new fe1(11));

    /* JADX INFO: renamed from: i */
    public static final C0282a f68517i = new C0282a(924735856, false, new fe1(12));

    /* JADX INFO: renamed from: j */
    public static final C0282a f68518j = new C0282a(1053614823, false, new fe1(13));

    /* JADX INFO: renamed from: k */
    public static final C0282a f68519k = new C0282a(-1551873641, false, new fe1(14));

    /* JADX INFO: renamed from: l */
    public static final C0282a f68520l = new C0282a(1017475662, false, new fe1(15));

    /* JADX INFO: renamed from: m */
    public static final C0282a f68521m = new C0282a(-952235907, false, new fe1(16));

    /* JADX INFO: renamed from: n */
    public static final C0282a f68522n = new C0282a(-913254732, false, new fe1(17));

    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0096  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX INFO: renamed from: a */
    public static final gr0 m24637a(ResultChallenge resultChallenge, String str, int i) {
        int i2;
        boolean z;
        int iIntValue;
        int iIntValue2;
        String str2;
        String str3;
        ParticipantStat participantStat;
        Integer num;
        Integer num2;
        ParticipantStat participantStat2;
        Target target;
        Double d;
        resultChallenge.getClass();
        String str4 = resultChallenge.f20672o;
        str.getClass();
        int i3 = resultChallenge.f20664g;
        String str5 = resultChallenge.f20659b;
        String str6 = resultChallenge.f20673p;
        String str7 = resultChallenge.f20658a;
        String str8 = resultChallenge.f20660c;
        String str9 = resultChallenge.f20671n;
        String str10 = resultChallenge.f20663f;
        int i4 = resultChallenge.f20668k;
        boolean z2 = resultChallenge.f20666i;
        String str11 = resultChallenge.f20665h;
        Participant participant = resultChallenge.f20667j;
        if (participant != null && (participantStat2 = participant.f20570b) != null && (target = participantStat2.f20574a) != null && (d = target.f21740a) != null) {
            i2 = i4;
            boolean z3 = ((int) d.doubleValue()) == 100;
            if (participant == null && fa4.m11650l(str4, "active")) {
                z = true;
            } else {
                z = false;
            }
            if (participant != null || (num2 = participant.f20571c) == null) {
                iIntValue = 0;
            } else {
                iIntValue = num2.intValue();
            }
            if (participant != null || (participantStat = participant.f20570b) == null || (num = participantStat.f20578e) == null) {
                iIntValue2 = 0;
            } else {
                iIntValue2 = num.intValue();
            }
            String str12 = resultChallenge.f20674q;
            String str13 = resultChallenge.f20669l;
            if (participant == null && fa4.m11650l(str4, "active")) {
                str2 = "Joined";
            } else if (fa4.m11650l(str4, "eligible")) {
                str2 = "CanJoin";
            } else if (fa4.m11650l(str4, "past")) {
                if (participant != null) {
                    str3 = participant.f20572d;
                } else {
                    str3 = null;
                }
                if (fa4.m11650l(str3, "success")) {
                    str2 = "Successful";
                } else {
                    str2 = "Unsuccessful";
                }
            } else {
                str2 = "Unsuccessful";
            }
            return new gr0(i3, str5, str6, str7, str8, str9, str10, str, i2, z2, str11, z3, z, iIntValue, i, iIntValue2, str12, str2, str13);
        }
        i2 = i4;
        if (participant == null) {
            z = false;
        } else {
            z = false;
        }
        if (participant != null) {
            iIntValue = 0;
        } else {
            iIntValue = 0;
        }
        if (participant != null) {
            iIntValue2 = 0;
        } else {
            iIntValue2 = 0;
        }
        String str14 = resultChallenge.f20674q;
        String str15 = resultChallenge.f20669l;
        if (participant == null) {
            if (fa4.m11650l(str4, "eligible")) {
                str2 = "CanJoin";
            } else if (fa4.m11650l(str4, "past")) {
                str2 = "Unsuccessful";
            } else {
                if (participant != null) {
                    str3 = participant.f20572d;
                } else {
                    str3 = null;
                }
                if (fa4.m11650l(str3, "success")) {
                    str2 = "Successful";
                } else {
                    str2 = "Unsuccessful";
                }
            }
        } else if (fa4.m11650l(str4, "eligible")) {
            str2 = "CanJoin";
        } else if (fa4.m11650l(str4, "past")) {
            str2 = "Unsuccessful";
        } else {
            if (participant != null) {
                str3 = participant.f20572d;
            } else {
                str3 = null;
            }
            if (fa4.m11650l(str3, "success")) {
                str2 = "Successful";
            } else {
                str2 = "Unsuccessful";
            }
        }
        return new gr0(i3, str5, str6, str7, str8, str9, str10, str, i2, z2, str11, z3, z, iIntValue, i, iIntValue2, str14, str2, str15);
    }
}
