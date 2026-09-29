package p000;

import android.content.Context;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.store.google.referrer.internal.GoogleReferrerStatus;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d02 extends c02 {

    /* JADX INFO: renamed from: c */
    public String f34757c;

    /* JADX INFO: renamed from: d */
    public Boolean f34758d;

    /* JADX INFO: renamed from: e */
    public String f34759e;

    /* JADX INFO: renamed from: f */
    public Integer f34760f;

    /* JADX INFO: renamed from: g */
    public uo3 f34761g;

    /* JADX INFO: renamed from: h */
    public String f34762h;

    /* JADX INFO: renamed from: i */
    public Boolean f34763i;

    /* JADX INFO: renamed from: j */
    public String f34764j;

    /* JADX INFO: renamed from: k */
    public Boolean f34765k;

    /* JADX INFO: renamed from: l */
    public hx3 f34766l;

    /* JADX INFO: renamed from: m */
    public bl8 f34767m;

    /* JADX INFO: renamed from: n */
    public String f34768n;

    /* JADX INFO: renamed from: o */
    public Boolean f34769o;

    /* JADX INFO: renamed from: p */
    public String f34770p;

    /* JADX INFO: renamed from: q */
    public by5 f34771q;

    /* JADX INFO: renamed from: r */
    public Boolean f34772r;

    /* JADX INFO: renamed from: s */
    public eg4 f34773s;

    @Override // p000.c02
    /* JADX INFO: renamed from: a */
    public final synchronized a02[] mo4248a() {
        PayloadType payloadType;
        PayloadType payloadType2;
        payloadType = PayloadType.Install;
        payloadType2 = PayloadType.Update;
        return new a02[]{a02.m2a("adid", false, false, payloadType, payloadType2), a02.m2a("asid", false, false, payloadType, payloadType2), a02.m2a("asid_scope", false, false, payloadType), a02.m2a("install_referrer", false, false, payloadType), a02.m2a("fire_adid", false, false, payloadType, payloadType2), a02.m2a("oaid", false, false, payloadType, payloadType2), a02.m2a("huawei_referrer", false, false, payloadType), a02.m2a("samsung_referrer", false, false, payloadType), a02.m2a("cgid", false, false, payloadType, payloadType2), a02.m2a("fb_attribution_id", false, false, payloadType), a02.m2a("meta_referrer", false, false, payloadType), a02.m2a("app_limit_tracking", false, false, payloadType, payloadType2), a02.m2a("device_limit_tracking", false, false, payloadType, payloadType2), a02.m2a("custom_device_ids", false, true, payloadType), a02.m2a("conversion_data", false, false, payloadType), a02.m2a("conversion_type", false, false, payloadType)};
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00e0 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:4:0x0006, B:170:0x0228, B:171:0x022f, B:6:0x000b, B:8:0x0013, B:10:0x0017, B:12:0x001f, B:14:0x0029, B:17:0x0039, B:20:0x003f, B:22:0x0047, B:24:0x004b, B:26:0x0053, B:27:0x0060, B:30:0x0066, B:32:0x006e, B:34:0x0072, B:35:0x0078, B:38:0x007e, B:40:0x0086, B:42:0x008a, B:44:0x0092, B:46:0x009c, B:47:0x00a9, B:50:0x00af, B:52:0x00b7, B:54:0x00bb, B:56:0x00c2, B:58:0x00c6, B:63:0x00cf, B:68:0x00d7, B:69:0x00e0, B:72:0x00e6, B:74:0x00ee, B:76:0x00f2, B:77:0x00f8, B:80:0x00fe, B:82:0x0106, B:84:0x010a, B:85:0x010f, B:87:0x0117, B:88:0x011c, B:90:0x0128, B:91:0x012d, B:95:0x0137, B:97:0x013f, B:99:0x0145, B:100:0x014a, B:102:0x0152, B:103:0x0157, B:105:0x0161, B:106:0x0166, B:109:0x0170, B:111:0x0178, B:114:0x017e, B:116:0x0186, B:118:0x018a, B:119:0x0190, B:122:0x0196, B:124:0x019e, B:126:0x01a2, B:127:0x01a8, B:130:0x01ae, B:132:0x01b6, B:134:0x01ba, B:135:0x01c0, B:138:0x01c6, B:140:0x01ce, B:142:0x01d2, B:143:0x01d8, B:146:0x01de, B:148:0x01e6, B:150:0x01ea, B:151:0x01f0, B:154:0x01f6, B:156:0x01fe, B:158:0x0202, B:159:0x0208, B:162:0x020e, B:164:0x0216, B:166:0x021c, B:167:0x0222), top: B:174:0x0001 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.c02
    /* JADX INFO: renamed from: b */
    public final synchronized rf4 mo4249b(Context context, n67 n67Var, String str, List list, List list2) {
        rf4 rf4VarM20644d;
        try {
            boolean z = true;
            switch (str.hashCode()) {
                case -1144512572:
                    if (str.equals("device_limit_tracking")) {
                        Boolean boolM9955e = m9955e();
                        return boolM9955e != null ? new rf4(boolM9955e) : rf4.m20644d();
                    }
                    break;
                case -286797593:
                    if (str.equals("fire_adid")) {
                        String str2 = this.f34762h;
                        return str2 != null ? new rf4(str2) : rf4.m20644d();
                    }
                    break;
                case 2989182:
                    if (str.equals("adid")) {
                        String str3 = this.f34757c;
                        return str3 != null ? new rf4(str3) : rf4.m20644d();
                    }
                    break;
                case 3003597:
                    if (str.equals("asid")) {
                        String str4 = this.f34759e;
                        return str4 != null ? new rf4(str4) : rf4.m20644d();
                    }
                    break;
                case 3051647:
                    if (str.equals("cgid")) {
                        String str5 = this.f34768n;
                        return str5 != null ? new rf4(str5) : rf4.m20644d();
                    }
                    break;
                case 3403373:
                    if (str.equals("oaid")) {
                        String str6 = this.f34764j;
                        return str6 != null ? new rf4(str6) : rf4.m20644d();
                    }
                    break;
                case 410773602:
                    if (str.equals("asid_scope")) {
                        Integer num = this.f34760f;
                        return num != null ? new rf4(num) : rf4.m20644d();
                    }
                    break;
                case 542225117:
                    if (str.equals("custom_device_ids")) {
                        return m9956f(list);
                    }
                    break;
                case 623780147:
                    if (str.equals("conversion_data")) {
                        rf4 rf4VarM10341k = (this.f34773s != null && list.contains("conversion_data") && ((dg4) this.f34773s).m10345o("legacy_referrer")) ? ((dg4) this.f34773s).m10341k("legacy_referrer", true) : rf4.m20644d();
                        return rf4VarM10341k;
                    }
                    break;
                case 624279747:
                    if (str.equals("conversion_type")) {
                        rf4 rf4Var = (this.f34773s != null && list.contains("conversion_type") && ((dg4) this.f34773s).m10345o("legacy_referrer")) ? new rf4("gplay") : rf4.m20644d();
                        return rf4Var;
                    }
                    break;
                case 1174099097:
                    if (str.equals("app_limit_tracking")) {
                        Boolean bool = this.f34772r;
                        return bool != null ? new rf4(bool) : rf4.m20644d();
                    }
                    break;
                case 1328981571:
                    if (str.equals("install_referrer")) {
                        uo3 uo3Var = this.f34761g;
                        if (uo3Var == null) {
                            rf4VarM20644d = rf4.m20644d();
                        } else {
                            GoogleReferrerStatus googleReferrerStatus = uo3Var.f64130d;
                            if ((googleReferrerStatus == GoogleReferrerStatus.FeatureNotSupported || googleReferrerStatus == GoogleReferrerStatus.MissingDependency || googleReferrerStatus == GoogleReferrerStatus.PermissionError) ? false : true) {
                                if (googleReferrerStatus == GoogleReferrerStatus.NotGathered) {
                                    z = false;
                                }
                                if (z) {
                                    rf4VarM20644d = uo3Var.m22845b().m10332C();
                                } else {
                                    rf4VarM20644d = rf4.m20644d();
                                }
                            } else {
                                rf4VarM20644d = rf4.m20644d();
                            }
                        }
                        return rf4VarM20644d;
                    }
                    break;
                case 1397376708:
                    if (str.equals("samsung_referrer")) {
                        bl8 bl8Var = this.f34767m;
                        return (bl8Var != null && ((al8) bl8Var).m544e() && ((al8) this.f34767m).m543d()) ? ((al8) this.f34767m).m541a().m10332C() : rf4.m20644d();
                    }
                    break;
                case 1757114046:
                    if (str.equals("fb_attribution_id")) {
                        String str7 = this.f34770p;
                        return str7 != null ? new rf4(str7) : rf4.m20644d();
                    }
                    break;
                case 2024312089:
                    if (str.equals("meta_referrer")) {
                        by5 by5Var = this.f34771q;
                        return (by5Var == null || !((ay5) by5Var).m3124e()) ? rf4.m20644d() : ((ay5) this.f34771q).m3122a().m10332C();
                    }
                    break;
                case 2036809591:
                    if (str.equals("huawei_referrer")) {
                        hx3 hx3Var = this.f34766l;
                        return (hx3Var != null && ((gx3) hx3Var).m12961e() && ((gx3) this.f34766l).m12960d()) ? ((gx3) this.f34766l).m12958a().m10332C() : rf4.m20644d();
                    }
                    break;
            }
            throw new Exception("Invalid key name");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Boolean m9955e() {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4 = this.f34758d;
        if (bool4 == null && this.f34763i == null && this.f34765k == null && this.f34769o == null) {
            return null;
        }
        return Boolean.valueOf((bool4 != null && bool4.booleanValue()) || ((bool = this.f34763i) != null && bool.booleanValue()) || (((bool2 = this.f34765k) != null && bool2.booleanValue()) || ((bool3 = this.f34769o) != null && bool3.booleanValue())));
    }

    /* JADX INFO: renamed from: f */
    public final rf4 m9956f(List list) {
        if (this.f34773s == null) {
            return rf4.m20644d();
        }
        dg4 dg4VarM10328c = dg4.m10328c();
        for (String str : ((dg4) this.f34773s).m10347q()) {
            if (list.contains(str)) {
                boolean zEquals = "email".equals(str);
                eg4 eg4Var = this.f34773s;
                if (zEquals) {
                    String strM10344n = ((dg4) eg4Var).m10344n(str, "");
                    dg4 dg4VarM10328c2 = dg4.m10328c();
                    dg4VarM10328c2.m10331B("email", "[" + strM10344n + "]");
                    dg4VarM10328c.m10356z("ids", dg4VarM10328c2);
                } else {
                    dg4VarM10328c.m10355y(str, ((dg4) eg4Var).m10341k(str, true));
                }
            }
        }
        return dg4VarM10328c.m10332C();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m9957g() {
        Boolean boolM9955e;
        boolM9955e = m9955e();
        return boolM9955e != null && boolM9955e.booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m9958h(Boolean bool) {
        this.f34772r = bool;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m9959i(dg4 dg4Var) {
        this.f34773s = dg4Var;
    }
}
