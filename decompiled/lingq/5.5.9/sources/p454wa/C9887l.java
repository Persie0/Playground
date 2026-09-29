package p454wa;

import ae.C0062b;
import android.content.Context;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p174i9.InterfaceC6206a;
import p195j9.RunnableC6432i;
import p213k4.RunnableC6590j;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10150s;
import p479xa.C10155x;
import p479xa.InterfaceC10133c;

/* JADX INFO: renamed from: wa.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9887l implements InterfaceC9878c, InterfaceC9894s {

    /* JADX INFO: renamed from: n */
    public static final ImmutableList<Long> f50453n = ImmutableList.m9063a0(4400000L, 3200000L, 2300000L, 1600000L, 810000L);

    /* JADX INFO: renamed from: o */
    public static final ImmutableList<Long> f50454o = ImmutableList.m9063a0(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* JADX INFO: renamed from: p */
    public static final ImmutableList<Long> f50455p = ImmutableList.m9063a0(2100000L, 1400000L, 1000000L, 890000L, 640000L);

    /* JADX INFO: renamed from: q */
    public static final ImmutableList<Long> f50456q = ImmutableList.m9063a0(2600000L, 1700000L, 1300000L, 1000000L, 700000L);

    /* JADX INFO: renamed from: r */
    public static final ImmutableList<Long> f50457r = ImmutableList.m9063a0(5700000L, 3700000L, 2300000L, 1700000L, 990000L);

    /* JADX INFO: renamed from: s */
    public static final ImmutableList<Long> f50458s = ImmutableList.m9063a0(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    /* JADX INFO: renamed from: t */
    public static C9887l f50459t;

    /* JADX INFO: renamed from: a */
    public final ImmutableMap<Integer, Long> f50460a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9878c.a.C10676a f50461b = new InterfaceC9878c.a.C10676a();

    /* JADX INFO: renamed from: c */
    public final C9892q f50462c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC10133c f50463d;

    /* JADX INFO: renamed from: e */
    public final boolean f50464e;

    /* JADX INFO: renamed from: f */
    public int f50465f;

    /* JADX INFO: renamed from: g */
    public long f50466g;

    /* JADX INFO: renamed from: h */
    public long f50467h;

    /* JADX INFO: renamed from: i */
    public int f50468i;

    /* JADX INFO: renamed from: j */
    public long f50469j;

    /* JADX INFO: renamed from: k */
    public long f50470k;

    /* JADX INFO: renamed from: l */
    public long f50471l;

    /* JADX INFO: renamed from: m */
    public long f50472m;

    /* JADX INFO: renamed from: wa.l$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Context f50473a;

        /* JADX INFO: renamed from: b */
        public final HashMap f50474b;

        /* JADX INFO: renamed from: c */
        public final int f50475c;

        /* JADX INFO: renamed from: d */
        public final C10155x f50476d;

        /* JADX INFO: renamed from: e */
        public final boolean f50477e;

        /* JADX WARN: Code duplicated, block: B:13:0x002b  */
        public a(Context context) {
            String strM395s2;
            int[] iArr;
            TelephonyManager telephonyManager;
            this.f50473a = context == null ? null : context.getApplicationContext();
            int i10 = C10134c0.f51354a;
            if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                strM395s2 = C0062b.m395s2(Locale.getDefault().getCountry());
            } else {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (TextUtils.isEmpty(networkCountryIso)) {
                    strM395s2 = C0062b.m395s2(Locale.getDefault().getCountry());
                } else {
                    strM395s2 = C0062b.m395s2(networkCountryIso);
                }
            }
            ImmutableList<Long> immutableList = C9887l.f50453n;
            strM395s2.getClass();
            switch (strM395s2) {
                case "AD":
                case "CW":
                    iArr = new int[]{2, 2, 0, 0, 2, 2};
                    break;
                case "AE":
                    iArr = new int[]{1, 4, 3, 4, 4, 2};
                    break;
                case "AF":
                case "PG":
                    iArr = new int[]{4, 3, 3, 3, 2, 2};
                    break;
                case "AG":
                    iArr = new int[]{2, 4, 3, 4, 2, 2};
                    break;
                case "AI":
                case "BB":
                case "BM":
                case "BQ":
                case "DM":
                case "FO":
                    iArr = new int[]{0, 2, 0, 0, 2, 2};
                    break;
                case "AL":
                    iArr = new int[]{1, 1, 1, 3, 2, 2};
                    break;
                case "AM":
                    iArr = new int[]{2, 3, 2, 3, 2, 2};
                    break;
                case "AO":
                    iArr = new int[]{4, 4, 4, 3, 2, 2};
                    break;
                case "AQ":
                case "ER":
                case "SH":
                    iArr = new int[]{4, 2, 2, 2, 2, 2};
                    break;
                case "AS":
                    iArr = new int[]{2, 2, 3, 3, 2, 2};
                    break;
                case "AT":
                    iArr = new int[]{1, 2, 1, 4, 1, 4};
                    break;
                case "AU":
                    iArr = new int[]{0, 2, 1, 1, 3, 0};
                    break;
                case "AW":
                case "GU":
                    iArr = new int[]{1, 2, 4, 4, 2, 2};
                    break;
                case "AX":
                case "CX":
                case "LI":
                case "MP":
                case "MS":
                case "PM":
                case "SM":
                case "VA":
                    iArr = new int[]{0, 2, 2, 2, 2, 2};
                    break;
                case "AZ":
                case "BF":
                case "DZ":
                    iArr = new int[]{3, 3, 4, 4, 2, 2};
                    break;
                case "BA":
                case "IE":
                    iArr = new int[]{1, 1, 1, 1, 2, 2};
                    break;
                case "BD":
                case "KZ":
                    iArr = new int[]{2, 1, 2, 2, 2, 2};
                    break;
                case "BE":
                    iArr = new int[]{0, 1, 4, 4, 3, 2};
                    break;
                case "BG":
                case "ES":
                case "GR":
                case "SI":
                    iArr = new int[]{0, 0, 0, 0, 1, 2};
                    break;
                case "BH":
                    iArr = new int[]{1, 3, 1, 4, 4, 2};
                    break;
                case "BI":
                case "HT":
                case "MG":
                case "NE":
                case "TD":
                case "VE":
                case "YE":
                    iArr = new int[]{4, 4, 4, 4, 2, 2};
                    break;
                case "BJ":
                    iArr = new int[]{4, 4, 2, 3, 2, 2};
                    break;
                case "BL":
                case "MF":
                case "PY":
                    iArr = new int[]{1, 2, 2, 2, 2, 2};
                    break;
                case "BN":
                    iArr = new int[]{3, 2, 0, 1, 2, 2};
                    break;
                case "BO":
                    iArr = new int[]{1, 2, 3, 2, 2, 2};
                    break;
                case "BR":
                    iArr = new int[]{1, 1, 2, 1, 1, 0};
                    break;
                case "BS":
                case "LB":
                    iArr = new int[]{3, 2, 1, 2, 2, 2};
                    break;
                case "BT":
                case "MZ":
                case "WS":
                    iArr = new int[]{3, 1, 2, 1, 2, 2};
                    break;
                case "BW":
                    iArr = new int[]{3, 2, 1, 0, 2, 2};
                    break;
                case "BY":
                    iArr = new int[]{1, 1, 2, 3, 2, 2};
                    break;
                case "BZ":
                case "CK":
                    iArr = new int[]{2, 2, 2, 1, 2, 2};
                    break;
                case "CA":
                    iArr = new int[]{0, 2, 3, 3, 3, 3};
                    break;
                case "CD":
                case "KM":
                    iArr = new int[]{4, 3, 3, 2, 2, 2};
                    break;
                case "CF":
                case "SB":
                    iArr = new int[]{4, 2, 4, 2, 2, 2};
                    break;
                case "CG":
                case "GH":
                    iArr = new int[]{3, 3, 3, 3, 2, 2};
                    break;
                case "CH":
                    iArr = new int[]{0, 0, 0, 0, 0, 3};
                    break;
                case "CI":
                case "EG":
                    iArr = new int[]{3, 4, 3, 3, 2, 2};
                    break;
                case "CL":
                    iArr = new int[]{1, 1, 2, 1, 3, 2};
                    break;
                case "CM":
                    iArr = new int[]{4, 3, 3, 4, 2, 2};
                    break;
                case "CN":
                    iArr = new int[]{2, 0, 4, 3, 3, 1};
                    break;
                case "CO":
                    iArr = new int[]{2, 3, 4, 2, 2, 2};
                    break;
                case "CR":
                    iArr = new int[]{2, 4, 4, 4, 2, 2};
                    break;
                case "CU":
                case "KI":
                    iArr = new int[]{4, 2, 4, 3, 2, 2};
                    break;
                case "CV":
                    iArr = new int[]{2, 3, 0, 1, 2, 2};
                    break;
                case "CY":
                case "HR":
                case "LV":
                    iArr = new int[]{1, 0, 0, 0, 0, 2};
                    break;
                case "CZ":
                    iArr = new int[]{0, 0, 2, 0, 1, 2};
                    break;
                case "DE":
                    iArr = new int[]{0, 1, 3, 2, 2, 2};
                    break;
                case "DJ":
                case "SY":
                case "TJ":
                    iArr = new int[]{4, 3, 4, 4, 2, 2};
                    break;
                case "DK":
                case "EE":
                case "HU":
                case "LT":
                case "MT":
                    iArr = new int[]{0, 0, 0, 0, 0, 2};
                    break;
                case "DO":
                    iArr = new int[]{3, 4, 4, 4, 4, 2};
                    break;
                case "EC":
                    iArr = new int[]{1, 3, 2, 1, 2, 2};
                    break;
                case "ET":
                case "SN":
                    iArr = new int[]{4, 4, 3, 2, 2, 2};
                    break;
                case "FI":
                    iArr = new int[]{0, 0, 0, 2, 0, 2};
                    break;
                case "FJ":
                    iArr = new int[]{3, 1, 2, 3, 2, 2};
                    break;
                case "FM":
                    iArr = new int[]{4, 2, 3, 0, 2, 2};
                    break;
                case "FR":
                    iArr = new int[]{1, 1, 2, 1, 1, 2};
                    break;
                case "GA":
                case "TG":
                    iArr = new int[]{3, 4, 1, 0, 2, 2};
                    break;
                case "GB":
                    iArr = new int[]{0, 1, 1, 2, 1, 2};
                    break;
                case "GD":
                case "KN":
                case "KY":
                case "LC":
                case "SX":
                case "VC":
                    iArr = new int[]{1, 2, 0, 0, 2, 2};
                    break;
                case "GE":
                    iArr = new int[]{1, 0, 0, 2, 2, 2};
                    break;
                case "GF":
                case "PK":
                case "SL":
                    iArr = new int[]{3, 2, 3, 3, 2, 2};
                    break;
                case "GG":
                    iArr = new int[]{0, 2, 1, 0, 2, 2};
                    break;
                case "GI":
                case "JE":
                    iArr = new int[]{1, 2, 0, 1, 2, 2};
                    break;
                case "GL":
                case "TK":
                    iArr = new int[]{2, 2, 2, 4, 2, 2};
                    break;
                case "GM":
                    iArr = new int[]{4, 3, 2, 4, 2, 2};
                    break;
                case "GN":
                    iArr = new int[]{4, 4, 4, 2, 2, 2};
                    break;
                case "GP":
                    iArr = new int[]{3, 1, 1, 3, 2, 2};
                    break;
                case "GQ":
                    iArr = new int[]{4, 4, 3, 3, 2, 2};
                    break;
                case "GT":
                    iArr = new int[]{2, 2, 2, 1, 1, 2};
                    break;
                case "GW":
                    iArr = new int[]{4, 4, 2, 2, 2, 2};
                    break;
                case "GY":
                    iArr = new int[]{3, 0, 1, 1, 2, 2};
                    break;
                case "HK":
                    iArr = new int[]{0, 1, 1, 3, 2, 0};
                    break;
                case "HN":
                    iArr = new int[]{3, 3, 2, 2, 2, 2};
                    break;
                case "ID":
                    iArr = new int[]{3, 1, 1, 2, 3, 2};
                    break;
                case "IL":
                    iArr = new int[]{1, 2, 2, 3, 4, 2};
                    break;
                case "IM":
                    iArr = new int[]{0, 2, 0, 1, 2, 2};
                    break;
                case "IN":
                    iArr = new int[]{1, 1, 2, 1, 2, 1};
                    break;
                case "IO":
                case "TV":
                case "WF":
                    iArr = new int[]{4, 2, 2, 4, 2, 2};
                    break;
                case "IQ":
                case "SJ":
                    iArr = new int[]{3, 2, 2, 2, 2, 2};
                    break;
                case "IR":
                    iArr = new int[]{4, 2, 3, 3, 4, 2};
                    break;
                case "IS":
                    iArr = new int[]{0, 0, 1, 0, 0, 2};
                    break;
                case "IT":
                    iArr = new int[]{0, 0, 1, 1, 1, 2};
                    break;
                case "JM":
                    iArr = new int[]{2, 4, 2, 1, 2, 2};
                    break;
                case "JO":
                    iArr = new int[]{2, 0, 1, 1, 2, 2};
                    break;
                case "JP":
                    iArr = new int[]{0, 3, 3, 3, 4, 4};
                    break;
                case "KE":
                    iArr = new int[]{3, 2, 2, 1, 2, 2};
                    break;
                case "KG":
                case "MQ":
                    iArr = new int[]{2, 1, 1, 2, 2, 2};
                    break;
                case "KH":
                    iArr = new int[]{1, 0, 4, 2, 2, 2};
                    break;
                case "KR":
                    iArr = new int[]{0, 2, 2, 4, 4, 4};
                    break;
                case "KW":
                    iArr = new int[]{1, 0, 1, 0, 0, 2};
                    break;
                case "LA":
                    iArr = new int[]{1, 2, 1, 3, 2, 2};
                    break;
                case "LK":
                    iArr = new int[]{3, 2, 3, 4, 4, 2};
                    break;
                case "LR":
                    iArr = new int[]{3, 4, 3, 4, 2, 2};
                    break;
                case "LS":
                case "UG":
                    iArr = new int[]{3, 3, 3, 2, 2, 2};
                    break;
                case "LU":
                    iArr = new int[]{1, 1, 4, 2, 0, 2};
                    break;
                case "LY":
                case "TO":
                case "ZW":
                    iArr = new int[]{3, 2, 4, 3, 2, 2};
                    break;
                case "MA":
                    iArr = new int[]{3, 3, 2, 1, 2, 2};
                    break;
                case "MC":
                    iArr = new int[]{0, 2, 2, 0, 2, 2};
                    break;
                case "MD":
                    iArr = new int[]{1, 0, 0, 0, 2, 2};
                    break;
                case "ME":
                    iArr = new int[]{2, 0, 0, 1, 1, 2};
                    break;
                case "MH":
                    iArr = new int[]{4, 2, 1, 3, 2, 2};
                    break;
                case "MK":
                    iArr = new int[]{2, 0, 0, 1, 3, 2};
                    break;
                case "ML":
                case "TZ":
                    iArr = new int[]{3, 4, 2, 2, 2, 2};
                    break;
                case "MM":
                    iArr = new int[]{2, 2, 2, 3, 4, 2};
                    break;
                case "MN":
                    iArr = new int[]{2, 0, 1, 2, 2, 2};
                    break;
                case "MO":
                    iArr = new int[]{0, 2, 4, 4, 4, 2};
                    break;
                case "MR":
                    iArr = new int[]{4, 2, 3, 4, 2, 2};
                    break;
                case "MU":
                case "SA":
                    iArr = new int[]{3, 1, 1, 2, 2, 2};
                    break;
                case "MV":
                    iArr = new int[]{3, 4, 1, 3, 3, 2};
                    break;
                case "MW":
                    iArr = new int[]{4, 2, 3, 3, 2, 2};
                    break;
                case "MX":
                    iArr = new int[]{3, 4, 4, 4, 2, 2};
                    break;
                case "MY":
                    iArr = new int[]{1, 0, 4, 1, 2, 2};
                    break;
                case "NA":
                    iArr = new int[]{3, 4, 3, 2, 2, 2};
                    break;
                case "NC":
                    iArr = new int[]{3, 2, 3, 4, 2, 2};
                    break;
                case "NG":
                    iArr = new int[]{3, 4, 2, 1, 2, 2};
                    break;
                case "NI":
                    iArr = new int[]{2, 3, 4, 3, 2, 2};
                    break;
                case "NL":
                    iArr = new int[]{0, 2, 3, 3, 0, 4};
                    break;
                case "NO":
                    iArr = new int[]{0, 1, 2, 1, 1, 2};
                    break;
                case "NP":
                    iArr = new int[]{2, 1, 4, 3, 2, 2};
                    break;
                case "NR":
                    iArr = new int[]{4, 0, 3, 2, 2, 2};
                    break;
                case "NU":
                    iArr = new int[]{4, 2, 2, 1, 2, 2};
                    break;
                case "NZ":
                    iArr = new int[]{1, 0, 2, 2, 4, 2};
                    break;
                case "OM":
                    iArr = new int[]{2, 3, 1, 3, 4, 2};
                    break;
                case "PA":
                    iArr = new int[]{2, 3, 3, 3, 2, 2};
                    break;
                case "PE":
                    iArr = new int[]{1, 2, 4, 4, 3, 2};
                    break;
                case "PF":
                case "SV":
                    iArr = new int[]{2, 3, 3, 1, 2, 2};
                    break;
                case "PH":
                    iArr = new int[]{2, 1, 3, 2, 2, 0};
                    break;
                case "PL":
                    iArr = new int[]{2, 1, 2, 2, 4, 2};
                    break;
                case "PR":
                    iArr = new int[]{2, 0, 2, 0, 2, 1};
                    break;
                case "PS":
                    iArr = new int[]{3, 4, 1, 4, 2, 2};
                    break;
                case "PT":
                    iArr = new int[]{1, 0, 0, 0, 1, 2};
                    break;
                case "PW":
                    iArr = new int[]{2, 2, 4, 2, 2, 2};
                    break;
                case "QA":
                    iArr = new int[]{1, 4, 4, 4, 4, 2};
                    break;
                case "RE":
                    iArr = new int[]{1, 2, 2, 3, 1, 2};
                    break;
                case "RO":
                    iArr = new int[]{0, 0, 1, 2, 1, 2};
                    break;
                case "RS":
                    iArr = new int[]{2, 0, 0, 0, 2, 2};
                    break;
                case "RU":
                    iArr = new int[]{1, 0, 0, 0, 3, 3};
                    break;
                case "RW":
                    iArr = new int[]{3, 3, 1, 0, 2, 2};
                    break;
                case "SC":
                    iArr = new int[]{4, 3, 1, 1, 2, 2};
                    break;
                case "SD":
                    iArr = new int[]{4, 3, 4, 2, 2, 2};
                    break;
                case "SE":
                    iArr = new int[]{0, 1, 1, 1, 0, 2};
                    break;
                case "SG":
                    iArr = new int[]{2, 3, 3, 3, 3, 3};
                    break;
                case "SK":
                    iArr = new int[]{1, 1, 1, 1, 3, 2};
                    break;
                case "SO":
                    iArr = new int[]{3, 2, 2, 4, 4, 2};
                    break;
                case "SR":
                    iArr = new int[]{2, 4, 3, 0, 2, 2};
                    break;
                case "SS":
                case "TM":
                    iArr = new int[]{4, 2, 2, 3, 2, 2};
                    break;
                case "ST":
                    iArr = new int[]{2, 2, 1, 2, 2, 2};
                    break;
                case "SZ":
                    iArr = new int[]{4, 4, 3, 4, 2, 2};
                    break;
                case "TC":
                    iArr = new int[]{2, 2, 1, 3, 2, 2};
                    break;
                case "TH":
                    iArr = new int[]{0, 1, 2, 1, 2, 2};
                    break;
                case "TL":
                    iArr = new int[]{4, 2, 4, 4, 2, 2};
                    break;
                case "TN":
                case "UY":
                    iArr = new int[]{2, 1, 1, 1, 2, 2};
                    break;
                case "TR":
                    iArr = new int[]{1, 0, 0, 1, 3, 2};
                    break;
                case "TT":
                    iArr = new int[]{1, 4, 0, 0, 2, 2};
                    break;
                case "TW":
                    iArr = new int[]{0, 2, 0, 0, 0, 0};
                    break;
                case "UA":
                    iArr = new int[]{0, 1, 1, 2, 4, 2};
                    break;
                case "US":
                    iArr = new int[]{1, 1, 4, 1, 3, 1};
                    break;
                case "UZ":
                    iArr = new int[]{2, 2, 3, 4, 3, 2};
                    break;
                case "VG":
                    iArr = new int[]{2, 2, 0, 1, 2, 2};
                    break;
                case "VI":
                    iArr = new int[]{0, 2, 1, 2, 2, 2};
                    break;
                case "VN":
                    iArr = new int[]{0, 0, 1, 2, 2, 1};
                    break;
                case "VU":
                    iArr = new int[]{4, 3, 3, 1, 2, 2};
                    break;
                case "XK":
                    iArr = new int[]{1, 2, 1, 1, 2, 2};
                    break;
                case "YT":
                    iArr = new int[]{2, 3, 3, 4, 2, 2};
                    break;
                case "ZA":
                    iArr = new int[]{2, 3, 2, 1, 2, 2};
                    break;
                case "ZM":
                    iArr = new int[]{4, 4, 4, 3, 3, 2};
                    break;
                default:
                    iArr = new int[]{2, 2, 2, 2, 2, 2};
                    break;
            }
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            ImmutableList<Long> immutableList2 = C9887l.f50453n;
            map.put(2, immutableList2.get(iArr[0]));
            map.put(3, C9887l.f50454o.get(iArr[1]));
            map.put(4, C9887l.f50455p.get(iArr[2]));
            map.put(5, C9887l.f50456q.get(iArr[3]));
            map.put(10, C9887l.f50457r.get(iArr[4]));
            map.put(9, C9887l.f50458s.get(iArr[5]));
            map.put(7, immutableList2.get(iArr[0]));
            this.f50474b = map;
            this.f50475c = 2000;
            this.f50476d = InterfaceC10133c.f51353a;
            this.f50477e = true;
        }

        /* JADX INFO: renamed from: a */
        public final C9887l m18389a() {
            return new C9887l(this.f50473a, this.f50474b, this.f50475c, this.f50476d, this.f50477e);
        }
    }

    public C9887l(Context context, HashMap map, int i10, C10155x c10155x, boolean z10) {
        int i11;
        this.f50460a = ImmutableMap.m9069a(map);
        this.f50462c = new C9892q(i10);
        this.f50463d = c10155x;
        this.f50464e = z10;
        if (context == null) {
            this.f50468i = 0;
            this.f50471l = m18387i(0);
            return;
        }
        C10150s c10150sM19119b = C10150s.m19119b(context);
        synchronized (c10150sM19119b.f51432c) {
            try {
                i11 = c10150sM19119b.f51433d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f50468i = i11;
        this.f50471l = m18387i(i11);
        C10150s.a aVar = new C10150s.a() { // from class: wa.k
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // p479xa.C10150s.a
            /* JADX INFO: renamed from: a */
            public final void mo18382a(int i12) {
                C9887l c9887l = this.f50452a;
                synchronized (c9887l) {
                    try {
                        int i13 = c9887l.f50468i;
                        if (i13 == 0 || c9887l.f50464e) {
                            if (i13 == i12) {
                                return;
                            }
                            c9887l.f50468i = i12;
                            if (i12 == 1 || i12 == 0 || i12 == 8) {
                                return;
                            }
                            c9887l.f50471l = c9887l.m18387i(i12);
                            long jMo19015d = c9887l.f50463d.mo19015d();
                            c9887l.m18388j(c9887l.f50465f > 0 ? (int) (jMo19015d - c9887l.f50466g) : 0, c9887l.f50467h, c9887l.f50471l);
                            c9887l.f50466g = jMo19015d;
                            c9887l.f50467h = 0L;
                            c9887l.f50470k = 0L;
                            c9887l.f50469j = 0L;
                            C9892q c9892q = c9887l.f50462c;
                            c9892q.f50516b.clear();
                            c9892q.f50518d = -1;
                            c9892q.f50519e = 0;
                            c9892q.f50520f = 0;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        };
        CopyOnWriteArrayList<WeakReference<C10150s.a>> copyOnWriteArrayList = c10150sM19119b.f51431b;
        Iterator<WeakReference<C10150s.a>> it = copyOnWriteArrayList.iterator();
        while (true) {
            while (true) {
                if (!it.hasNext()) {
                    copyOnWriteArrayList.add(new WeakReference<>(aVar));
                    c10150sM19119b.f51430a.post(new RunnableC6590j(c10150sM19119b, 12, aVar));
                    return;
                } else {
                    WeakReference<C10150s.a> next = it.next();
                    if (next.get() == null) {
                        copyOnWriteArrayList.remove(next);
                    }
                }
            }
        }
    }

    @Override // p454wa.InterfaceC9878c
    /* JADX INFO: renamed from: a */
    public final void mo18371a(Handler handler, InterfaceC6206a interfaceC6206a) {
        interfaceC6206a.getClass();
        InterfaceC9878c.a.C10676a c10676a = this.f50461b;
        c10676a.getClass();
        c10676a.m18375a(interfaceC6206a);
        c10676a.f50418a.add(new InterfaceC9878c.a.C10676a.C10677a(handler, interfaceC6206a));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p454wa.InterfaceC9894s
    /* JADX INFO: renamed from: b */
    public final synchronized void mo18383b(C9884i c9884i, boolean z10) {
        boolean z11 = false;
        if (z10) {
            try {
                if (!((c9884i.f50444i & 8) == 8)) {
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            if (this.f50465f == 0) {
                this.f50466g = this.f50463d.mo19015d();
            }
            this.f50465f++;
        }
    }

    @Override // p454wa.InterfaceC9894s
    /* JADX INFO: renamed from: c */
    public final void mo18384c() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p454wa.InterfaceC9894s
    /* JADX INFO: renamed from: d */
    public final synchronized void mo18385d(C9884i c9884i, boolean z10, int i10) {
        boolean z11 = false;
        if (z10) {
            try {
                if (!((c9884i.f50444i & 8) == 8)) {
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            this.f50467h += (long) i10;
        }
    }

    @Override // p454wa.InterfaceC9878c
    /* JADX INFO: renamed from: e */
    public final void mo18372e(InterfaceC6206a interfaceC6206a) {
        this.f50461b.m18375a(interfaceC6206a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0020  */
    /* JADX WARN: Code duplicated, block: B:21:0x0026  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e A[Catch: all -> 0x00a2, TryCatch #0 {, blocks: (B:6:0x0007, B:19:0x0021, B:22:0x0027, B:24:0x004e, B:26:0x006e, B:29:0x0086, B:28:0x007a, B:30:0x0099), top: B:38:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x007a A[Catch: all -> 0x00a2, TryCatch #0 {, blocks: (B:6:0x0007, B:19:0x0021, B:22:0x0027, B:24:0x004e, B:26:0x006e, B:29:0x0086, B:28:0x007a, B:30:0x0099), top: B:38:0x0007 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p454wa.InterfaceC9894s
    /* JADX INFO: renamed from: f */
    public final synchronized void mo18386f(C9884i c9884i, boolean z10) {
        boolean z11;
        long jMo19015d;
        int i10;
        long j10;
        if (!z10) {
            z11 = false;
            if (z11) {
                C10129a.m18992d(this.f50465f > 0);
                jMo19015d = this.f50463d.mo19015d();
                i10 = (int) (jMo19015d - this.f50466g);
                this.f50469j += (long) i10;
                long j11 = this.f50470k;
                j10 = this.f50467h;
                this.f50470k = j11 + j10;
                if (i10 > 0) {
                    this.f50462c.m18398a((int) Math.sqrt(j10), (j10 * 8000.0f) / i10);
                    if (this.f50469j < ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
                        this.f50471l = (long) this.f50462c.m18399b();
                    } else {
                        this.f50471l = (long) this.f50462c.m18399b();
                    }
                    m18388j(i10, this.f50467h, this.f50471l);
                    this.f50466g = jMo19015d;
                    this.f50467h = 0L;
                }
                this.f50465f--;
                return;
            }
            return;
        }
        if ((c9884i.f50444i & 8) == 8) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return;
        }
        C10129a.m18992d(this.f50465f > 0);
        jMo19015d = this.f50463d.mo19015d();
        i10 = (int) (jMo19015d - this.f50466g);
        this.f50469j += (long) i10;
        long j12 = this.f50470k;
        j10 = this.f50467h;
        this.f50470k = j12 + j10;
        if (i10 > 0) {
            this.f50462c.m18398a((int) Math.sqrt(j10), (j10 * 8000.0f) / i10);
            if (this.f50469j < ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS || this.f50470k >= 524288) {
                this.f50471l = (long) this.f50462c.m18399b();
            }
            m18388j(i10, this.f50467h, this.f50471l);
            this.f50466g = jMo19015d;
            this.f50467h = 0L;
        }
        this.f50465f--;
        return;
        throw th;
    }

    @Override // p454wa.InterfaceC9878c
    /* JADX INFO: renamed from: g */
    public final C9887l mo18373g() {
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p454wa.InterfaceC9878c
    /* JADX INFO: renamed from: h */
    public final synchronized long mo18374h() {
        return this.f50471l;
    }

    /* JADX INFO: renamed from: i */
    public final long m18387i(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        ImmutableMap<Integer, Long> immutableMap = this.f50460a;
        Long l10 = immutableMap.get(numValueOf);
        if (l10 == null) {
            l10 = immutableMap.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    /* JADX INFO: renamed from: j */
    public final void m18388j(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f50472m) {
            return;
        }
        this.f50472m = j11;
        for (InterfaceC9878c.a.C10676a.C10677a c10677a : this.f50461b.f50418a) {
            if (!c10677a.f50421c) {
                c10677a.f50419a.post(new RunnableC6432i(c10677a, i10, j10, j11, 1));
            }
        }
    }
}
