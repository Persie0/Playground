package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.barhopper.Barcode;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class det {

    /* JADX INFO: renamed from: a */
    public static final nbh f10737a = nbh.m17259h(YmzeHXaMYOLk.YfoR);

    /* JADX INFO: renamed from: b */
    public static final Pattern f10738b = Pattern.compile("^([0-9]+)\\.([0-9]+)\\.([0-9]+).*");

    /* JADX INFO: renamed from: c */
    public final Context f10739c;

    /* JADX INFO: renamed from: d */
    public final ddx f10740d;

    /* JADX INFO: renamed from: e */
    public final ksa f10741e;

    /* JADX INFO: renamed from: f */
    public final dfh f10742f;

    /* JADX INFO: renamed from: g */
    public final dhv f10743g;

    /* JADX INFO: renamed from: h */
    public int f10744h;

    /* JADX INFO: renamed from: i */
    public int f10745i;

    /* JADX INFO: renamed from: j */
    public final msi f10746j;

    /* JADX INFO: renamed from: k */
    public oyo f10747k;

    /* JADX INFO: renamed from: l */
    private final lqq f10748l;

    public det(Context context, lqq lqqVar, ddx ddxVar, ksa ksaVar, dfh dfhVar, dhv dhvVar, byte[] bArr) {
        this.f10739c = context;
        this.f10748l = lqqVar;
        this.f10740d = ddxVar;
        this.f10741e = ksaVar;
        this.f10742f = dfhVar;
        this.f10743g = dhvVar;
        this.f10746j = lku.m15663q(new dks(dhvVar, context, 1));
    }

    /* JADX INFO: renamed from: b */
    static String m6022b(luz luzVar, String str, String str2) {
        mrm mrmVar = luzVar.mo16040c().f39377b;
        String str3 = luzVar.mo16040c().f39376a;
        String strM6023c = !mrmVar.mo16813g() ? m6023c(str3) : m6023c((String) mrmVar.mo16809c());
        if (luzVar.mo16038a() == lus.QR && strM6023c.length() == 0) {
            return str;
        }
        if (m6024d(luzVar)) {
            return str2;
        }
        if (luzVar.mo16038a() != lus.URL || str3.isEmpty()) {
            return strM6023c;
        }
        mrm mrmVarM6055a = mqu.f41450a;
        try {
            mrmVarM6055a = dfi.m6055a(new URI(str3));
        } catch (URISyntaxException e) {
        }
        return !mrmVarM6055a.mo16813g() ? m6023c(str3) : (String) mrmVarM6055a.mo16809c();
    }

    /* JADX INFO: renamed from: c */
    private static String m6023c(String str) {
        return str.length() > 25 ? String.valueOf(str.substring(0, 24)).concat("…") : str;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m6024d(luz luzVar) {
        return luzVar.mo16038a() == lus.URL && luzVar.mo16040c().f39376a.toLowerCase(Locale.US).startsWith(zuAgeeF.kvIM);
    }

    /* JADX INFO: renamed from: e */
    private static final boolean m6025e(lus lusVar) {
        switch (lusVar.ordinal()) {
            case 2:
            case 4:
            case 24:
            case 28:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:254:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:255:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:258:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:259:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:261:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:263:0x0907  */
    /* JADX WARN: Code duplicated, block: B:265:0x0913  */
    /* JADX WARN: Code duplicated, block: B:273:0x0940  */
    /* JADX WARN: Code duplicated, block: B:275:0x0948  */
    /* JADX WARN: Code duplicated, block: B:278:0x0969  */
    /* JADX WARN: Code duplicated, block: B:280:0x0972  */
    /* JADX WARN: Code duplicated, block: B:281:0x0974  */
    /* JADX WARN: Code duplicated, block: B:282:0x0978  */
    /* JADX WARN: Code duplicated, block: B:283:0x097c  */
    /* JADX WARN: Code duplicated, block: B:284:0x0980  */
    /* JADX WARN: Code duplicated, block: B:285:0x0984  */
    /* JADX WARN: Code duplicated, block: B:286:0x0988  */
    /* JADX WARN: Code duplicated, block: B:288:0x098d  */
    /* JADX WARN: Code duplicated, block: B:291:0x09a1  */
    /* JADX WARN: Code duplicated, block: B:293:0x09a5  */
    /* JADX WARN: Code duplicated, block: B:296:0x09ba  */
    /* JADX WARN: Code duplicated, block: B:299:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:302:0x09e9 A[Catch: SecurityException -> 0x09fc, TryCatch #1 {SecurityException -> 0x09fc, blocks: (B:301:0x09dd, B:303:0x09f7, B:302:0x09e9), top: B:336:0x09b7 }] */
    /* JADX WARN: Code duplicated, block: B:306:0x09fd  */
    /* JADX WARN: Code duplicated, block: B:309:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:310:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:313:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:315:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:316:0x0a77  */
    /* JADX WARN: Code duplicated, block: B:339:0x09e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x09dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:? A[LOOP:0: B:297:0x09c3->B:341:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final deb m6026a(luz luzVar, long j) {
        Optional optionalEmpty;
        Optional optionalEmpty2;
        Object obj;
        Object obj2;
        kvn kvgVar;
        kvn kvjVar;
        lqq lqqVar;
        boolean z;
        int i;
        int i2;
        mrm mrmVarM16829i;
        PackageManager packageManager;
        Intent intentMo14930a;
        ResolveInfo resolveInfoResolveActivity;
        Drawable drawable;
        Iterator<ResolveInfo> it;
        kvq kvqVar;
        boolean z2;
        mrm mrmVarM16829i2;
        dfh dfhVar = this.f10742f;
        if (luzVar.mo16038a() != lus.QR_TEXT) {
            optionalEmpty = Optional.empty();
        } else {
            String str = luzVar.mo16041d().mo16813g() ? ((Barcode) luzVar.mo16041d().mo16809c()).rawValue : "";
            if (dfh.f10778a.matcher(str).matches()) {
                optionalEmpty = Optional.m12505of(dfhVar.m6054c(luzVar, j, dfhVar.f10781c.getString(C0100R.string.matter_qr), new cuq(dfhVar, str, 20), Optional.m12505of(dfhVar.f10781c.getResources().getDrawable(C0100R.drawable.home_iot_device, null))));
            } else if (str == null || mro.m16832b(Uri.parse(str).normalizeScheme().getScheme())) {
                optionalEmpty = Optional.empty();
            } else {
                if (new Intent("android.intent.action.VIEW", Uri.parse(str)).resolveActivity(dfhVar.f10781c.getPackageManager()) == null) {
                    String lowerCase = str.toLowerCase(Locale.US);
                    Iterator it2 = ((Iterable) dfhVar.f10780b.mo6051a()).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            optionalEmpty = Optional.empty();
                        } else if (lowerCase.startsWith((String) it2.next())) {
                        }
                    }
                }
                dgq dgqVar = new dgq(dfhVar, str, 1);
                try {
                    optionalEmpty2 = Optional.m12505of(dfhVar.f10781c.getPackageManager().getActivityIcon(new Intent("android.intent.action.VIEW", Uri.parse(str))));
                } catch (PackageManager.NameNotFoundException e) {
                    optionalEmpty2 = Optional.empty();
                }
                optionalEmpty = Optional.m12505of(dfhVar.m6054c(luzVar, j, str, dgqVar, optionalEmpty2));
            }
        }
        if (optionalEmpty.isPresent()) {
            return (deb) optionalEmpty.get();
        }
        dea deaVarM5974a = deb.m5974a();
        deaVarM5974a.f10618a = m6022b(luzVar, this.f10739c.getString(C0100R.string.qr_unsupported), this.f10739c.getString(C0100R.string.fido_qr));
        kvp kvpVar = (kvp) kvc.f37316a.get(luzVar.mo16038a());
        if (kvpVar == null) {
            throw new IllegalArgumentException("Not supported ResultType: " + luzVar.mo16038a().f39290I);
        }
        kvd kvdVar = new kvd(null);
        kvdVar.m14928a(kve.NONE);
        kvdVar.f37318a = kvpVar;
        kvdVar.m14928a((kve) kvc.f37317b.get(luzVar.mo16039b()));
        kvdVar.f37320c = luzVar.mo16040c().f39376a;
        if (luzVar.mo16040c().f39377b.mo16813g()) {
            kvdVar.f37321d = mrm.m16829i((String) luzVar.mo16040c().f39377b.mo16809c());
        }
        if (luzVar.mo16044g().mo16813g()) {
            Barcode.CalendarEvent calendarEvent = (Barcode.CalendarEvent) luzVar.mo16044g().mo16809c();
            nxl nxlVarM18137O = kxc.f37609h.m18137O();
            String str2 = calendarEvent.summary;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar = nxlVarM18137O.f44974b;
            str2.getClass();
            ((kxc) nxqVar).f37611a = str2;
            String str3 = calendarEvent.description;
            if (!nxqVar.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar2 = nxlVarM18137O.f44974b;
            str3.getClass();
            ((kxc) nxqVar2).f37612b = str3;
            String str4 = calendarEvent.location;
            if (!nxqVar2.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar3 = nxlVarM18137O.f44974b;
            str4.getClass();
            ((kxc) nxqVar3).f37613c = str4;
            String str5 = calendarEvent.organizer;
            if (!nxqVar3.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar4 = nxlVarM18137O.f44974b;
            str5.getClass();
            ((kxc) nxqVar4).f37614d = str5;
            String str6 = calendarEvent.status;
            if (!nxqVar4.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kxc kxcVar = (kxc) nxlVarM18137O.f44974b;
            str6.getClass();
            kxcVar.f37615e = str6;
            kxb kxbVarM14927a = kvc.m14927a(calendarEvent.start);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kxc kxcVar2 = (kxc) nxlVarM18137O.f44974b;
            kxbVarM14927a.getClass();
            kxcVar2.f37616f = kxbVarM14927a;
            kxb kxbVarM14927a2 = kvc.m14927a(calendarEvent.end);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kxc kxcVar3 = (kxc) nxlVarM18137O.f44974b;
            kxbVarM14927a2.getClass();
            kxcVar3.f37617g = kxbVarM14927a2;
            kvdVar.f37322e = mrm.m16829i((kxc) nxlVarM18137O.mo18103l());
        }
        luzVar.mo16042e();
        luzVar.mo16043f();
        if (luzVar.mo16046i().mo16813g()) {
            luv luvVar = (luv) luzVar.mo16046i().mo16809c();
            nxl nxlVarM18137O2 = kxd.f37618h.m18137O();
            if (luvVar.f39302a.mo16813g()) {
                String str7 = (String) luvVar.f39302a.mo16809c();
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                ((kxd) nxlVarM18137O2.f44974b).f37620a = str7;
            }
            if (luvVar.f39305d.mo16813g()) {
                String str8 = (String) luvVar.f39305d.mo16809c();
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                ((kxd) nxlVarM18137O2.f44974b).f37623d = str8;
            }
            if (luvVar.f39307f.mo16813g()) {
                String str9 = (String) luvVar.f39307f.mo16809c();
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                ((kxd) nxlVarM18137O2.f44974b).f37625f = str9;
            }
            if (luvVar.f39306e.mo16813g()) {
                String str10 = (String) luvVar.f39306e.mo16809c();
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                ((kxd) nxlVarM18137O2.f44974b).f37624e = str10;
            }
            if (!luvVar.f39303b.isEmpty()) {
                mws mwsVar = luvVar.f39303b;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                kxd kxdVar = (kxd) nxlVarM18137O2.f44974b;
                nxy nxyVar = kxdVar.f37621b;
                if (!nxyVar.mo17770c()) {
                    kxdVar.f37621b = nxq.m18127U(nxyVar);
                }
                nwb.m17749e(mwsVar, kxdVar.f37621b);
            }
            if (!luvVar.f39304c.isEmpty()) {
                mws mwsVar2 = luvVar.f39304c;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                kxd kxdVar2 = (kxd) nxlVarM18137O2.f44974b;
                nxy nxyVar2 = kxdVar2.f37622c;
                if (!nxyVar2.mo17770c()) {
                    kxdVar2.f37622c = nxq.m18127U(nxyVar2);
                }
                nwb.m17749e(mwsVar2, kxdVar2.f37622c);
            }
            if (luvVar.f39308g.mo16813g()) {
                String str11 = (String) luvVar.f39308g.mo16809c();
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                ((kxd) nxlVarM18137O2.f44974b).f37626g = str11;
            }
            kvdVar.f37325h = mrm.m16829i((kxd) nxlVarM18137O2.mo18103l());
        }
        if (luzVar.mo16050m().mo16813g()) {
            Barcode.GeoPoint geoPoint = (Barcode.GeoPoint) luzVar.mo16050m().mo16809c();
            nxl nxlVarM18137O3 = kxe.f37627c.m18137O();
            double d = geoPoint.lat;
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nxq nxqVar5 = nxlVarM18137O3.f44974b;
            ((kxe) nxqVar5).f37629a = d;
            double d2 = geoPoint.lng;
            if (!nxqVar5.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            ((kxe) nxlVarM18137O3.f44974b).f37630b = d2;
            kvdVar.f37326i = mrm.m16829i((kxe) nxlVarM18137O3.mo18103l());
        }
        if (luzVar.mo16057t().mo16813g()) {
            Barcode.Sms sms = (Barcode.Sms) luzVar.mo16057t().mo16809c();
            nxl nxlVarM18137O4 = kxg.f37633c.m18137O();
            String str12 = sms.message;
            if (!nxlVarM18137O4.f44974b.m18142ac()) {
                nxlVarM18137O4.mo18106p();
            }
            nxq nxqVar6 = nxlVarM18137O4.f44974b;
            str12.getClass();
            ((kxg) nxqVar6).f37635a = str12;
            String str13 = sms.phoneNumber;
            if (!nxqVar6.m18142ac()) {
                nxlVarM18137O4.mo18106p();
            }
            kxg kxgVar = (kxg) nxlVarM18137O4.f44974b;
            str13.getClass();
            kxgVar.f37636b = str13;
            kvdVar.f37327j = mrm.m16829i((kxg) nxlVarM18137O4.mo18103l());
        }
        if (luzVar.mo16061x().mo16813g()) {
            Barcode.WiFi wiFi = (Barcode.WiFi) luzVar.mo16061x().mo16809c();
            nxl nxlVarM18137O5 = kxi.f37644e.m18137O();
            kxh kxhVarM14954b = kxh.m14954b(wiFi.encryptionType);
            if (!nxlVarM18137O5.f44974b.m18142ac()) {
                nxlVarM18137O5.mo18106p();
            }
            ((kxi) nxlVarM18137O5.f44974b).f37647b = kxhVarM14954b.mo14936a();
            String str14 = wiFi.ssid;
            if (!nxlVarM18137O5.f44974b.m18142ac()) {
                nxlVarM18137O5.mo18106p();
            }
            nxq nxqVar7 = nxlVarM18137O5.f44974b;
            str14.getClass();
            ((kxi) nxqVar7).f37646a = str14;
            String str15 = wiFi.password;
            if (!nxqVar7.m18142ac()) {
                nxlVarM18137O5.mo18106p();
            }
            nxq nxqVar8 = nxlVarM18137O5.f44974b;
            str15.getClass();
            ((kxi) nxqVar8).f37648c = str15;
            boolean z3 = wiFi.isHidden;
            if (!nxqVar8.m18142ac()) {
                nxlVarM18137O5.mo18106p();
            }
            ((kxi) nxlVarM18137O5.f44974b).f37649d = z3;
            kvdVar.f37328k = mrm.m16829i((kxi) nxlVarM18137O5.mo18103l());
        }
        Object obj3 = kvdVar.f37318a;
        if (obj3 == null || (obj = kvdVar.f37319b) == null || (obj2 = kvdVar.f37320c) == null) {
            StringBuilder sb = new StringBuilder();
            if (kvdVar.f37318a == null) {
                sb.append(" actionType");
            }
            if (kvdVar.f37319b == null) {
                sb.append(" engineType");
            }
            if (kvdVar.f37320c == null) {
                sb.append(" actionText");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        Object obj4 = kvdVar.f37321d;
        Object obj5 = kvdVar.f37322e;
        Object obj6 = kvdVar.f37323f;
        mrm mrmVar = (mrm) kvdVar.f37324g;
        mrm mrmVar2 = (mrm) obj6;
        kve kveVar = (kve) obj;
        kvp kvpVar2 = (kvp) obj3;
        kvf kvfVar = new kvf(kvpVar2, kveVar, (String) obj2, (mrm) obj4, (mrm) obj5, mrmVar2, mrmVar, (mrm) kvdVar.f37325h, (mrm) kvdVar.f37326i, (mrm) kvdVar.f37327j, (mrm) kvdVar.f37328k);
        lqq lqqVar2 = this.f10748l;
        int i3 = lqqVar2.f39001a;
        lpe lpeVar = new lpe((Context) lqqVar2.f39002b, (dsx) lqqVar2.f39003c, (byte[]) null, (byte[]) null);
        switch (kvfVar.f37334a) {
            case CALENDAR:
                kvgVar = new kvg(lpeVar, kvfVar, (Context) lqqVar2.f39002b, null, null);
                kvjVar = kvgVar;
                if (m6025e(luzVar.mo16038a())) {
                    deaVarM5974a.f10622e = 1;
                } else {
                    deaVarM5974a.f10622e = 2;
                    deaVarM5974a.f10619b = new czx(kvjVar, 19);
                }
                if (m6024d(luzVar)) {
                    if (m6025e(luzVar.mo16038a())) {
                        deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                    } else {
                        lqqVar = this.f10748l;
                        z = kvjVar instanceof kvq;
                        i = C0100R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                        if (z) {
                            kvqVar = (kvq) kvjVar;
                            if (mro.m16832b(kvqVar.f37385a.preSharedKey) && (kvqVar.f37385a.wepKeys.length <= 0 || mro.m16832b(kvqVar.f37385a.wepKeys[0]))) {
                                i = C0100R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                            }
                            Drawable drawable2 = ((Context) lqqVar.f39002b).getDrawable(i);
                            drawable2.getClass();
                            mrmVarM16829i = mrm.m16829i(drawable2);
                        } else if (kvfVar.f37343j.mo16813g() || ((kxi) kvfVar.f37343j.mo16809c()).equals(kxi.f37644e)) {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0 && !(kvjVar instanceof kvl)) {
                                Drawable drawable3 = ((Context) lqqVar.f39002b).getDrawable(i2);
                                drawable3.getClass();
                                mrmVarM16829i = mrm.m16829i(drawable3);
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                try {
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity2 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity2.getClass();
                                                drawable = resolveInfoResolveActivity2.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } catch (SecurityException e2) {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        } else {
                            Drawable drawable4 = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp);
                            drawable4.getClass();
                            mrmVarM16829i = mrm.m16829i(drawable4);
                        }
                        if (mrmVarM16829i.mo16813g()) {
                            deaVarM5974a.f10620c = (Drawable) mrmVarM16829i.mo16809c();
                        } else {
                            deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                        }
                    }
                    break;
                } else {
                    deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.gs_passkey_fill1_vd_theme_24, null);
                }
                deaVarM5974a.m5972f(j);
                deaVarM5974a.f10623f = 2;
                deaVarM5974a.m5973g(SystemClock.elapsedRealtime());
                deaVarM5974a.m5970d(dez.m6041k(luzVar.mo16036A(), this.f10747k, this.f10744h, this.f10745i));
                if (luzVar.mo16041d().mo16813g()) {
                    deaVarM5974a.m5968b(((Barcode) luzVar.mo16041d().mo16809c()).format);
                    deaVarM5974a.m5969c(((Barcode) luzVar.mo16041d().mo16809c()).valueFormat);
                    if (((Barcode) luzVar.mo16041d().mo16809c()).format == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    deaVarM5974a.m5971e(z2);
                }
                return deaVarM5974a.m5967a();
            case CALL:
                kvjVar = new kvj(lpeVar, kvfVar.f37336c, 1, null, null);
                if (m6025e(luzVar.mo16038a())) {
                    deaVarM5974a.f10622e = 1;
                } else {
                    deaVarM5974a.f10622e = 2;
                    deaVarM5974a.f10619b = new czx(kvjVar, 19);
                }
                if (m6024d(luzVar)) {
                    if (m6025e(luzVar.mo16038a())) {
                        lqqVar = this.f10748l;
                        z = kvjVar instanceof kvq;
                        i = C0100R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                        if (z) {
                            kvqVar = (kvq) kvjVar;
                            if (mro.m16832b(kvqVar.f37385a.preSharedKey)) {
                                i = C0100R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                            }
                            Drawable drawable5 = ((Context) lqqVar.f39002b).getDrawable(i);
                            drawable5.getClass();
                            mrmVarM16829i = mrm.m16829i(drawable5);
                        } else if (kvfVar.f37343j.mo16813g()) {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity3 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity3.getClass();
                                                drawable = resolveInfoResolveActivity3.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity4 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity4.getClass();
                                            drawable = resolveInfoResolveActivity4.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        } else {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity5 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity5.getClass();
                                                drawable = resolveInfoResolveActivity5.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity6 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity6.getClass();
                                            drawable = resolveInfoResolveActivity6.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        }
                        if (mrmVarM16829i.mo16813g()) {
                            deaVarM5974a.f10620c = (Drawable) mrmVarM16829i.mo16809c();
                        } else {
                            deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                        }
                    } else {
                        deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.gs_passkey_fill1_vd_theme_24, null);
                }
                deaVarM5974a.m5972f(j);
                deaVarM5974a.f10623f = 2;
                deaVarM5974a.m5973g(SystemClock.elapsedRealtime());
                deaVarM5974a.m5970d(dez.m6041k(luzVar.mo16036A(), this.f10747k, this.f10744h, this.f10745i));
                if (luzVar.mo16041d().mo16813g()) {
                    deaVarM5974a.m5968b(((Barcode) luzVar.mo16041d().mo16809c()).format);
                    deaVarM5974a.m5969c(((Barcode) luzVar.mo16041d().mo16809c()).valueFormat);
                    if (((Barcode) luzVar.mo16041d().mo16809c()).format == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    deaVarM5974a.m5971e(z2);
                }
                return deaVarM5974a.m5967a();
            case CONTACT:
                kvgVar = new kvh(lpeVar, (dsx) lqqVar2.f39003c, kvfVar.f37340g, kvfVar.f37336c, ((Context) lqqVar2.f39002b).getString(C0100R.string.iris_talkback_label_contact), null, null, null);
                kvjVar = kvgVar;
                if (m6025e(luzVar.mo16038a())) {
                    deaVarM5974a.f10622e = 1;
                } else {
                    deaVarM5974a.f10622e = 2;
                    deaVarM5974a.f10619b = new czx(kvjVar, 19);
                }
                if (m6024d(luzVar)) {
                    if (m6025e(luzVar.mo16038a())) {
                        lqqVar = this.f10748l;
                        z = kvjVar instanceof kvq;
                        i = C0100R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                        if (z) {
                            kvqVar = (kvq) kvjVar;
                            if (mro.m16832b(kvqVar.f37385a.preSharedKey)) {
                                i = C0100R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                            }
                            Drawable drawable6 = ((Context) lqqVar.f39002b).getDrawable(i);
                            drawable6.getClass();
                            mrmVarM16829i = mrm.m16829i(drawable6);
                        } else if (kvfVar.f37343j.mo16813g()) {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity7 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity7.getClass();
                                                drawable = resolveInfoResolveActivity7.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity8 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity8.getClass();
                                            drawable = resolveInfoResolveActivity8.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        } else {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity9 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity9.getClass();
                                                drawable = resolveInfoResolveActivity9.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity10 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity10.getClass();
                                            drawable = resolveInfoResolveActivity10.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        }
                        if (mrmVarM16829i.mo16813g()) {
                            deaVarM5974a.f10620c = (Drawable) mrmVarM16829i.mo16809c();
                        } else {
                            deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                        }
                    } else {
                        deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.gs_passkey_fill1_vd_theme_24, null);
                }
                deaVarM5974a.m5972f(j);
                deaVarM5974a.f10623f = 2;
                deaVarM5974a.m5973g(SystemClock.elapsedRealtime());
                deaVarM5974a.m5970d(dez.m6041k(luzVar.mo16036A(), this.f10747k, this.f10744h, this.f10745i));
                if (luzVar.mo16041d().mo16813g()) {
                    deaVarM5974a.m5968b(((Barcode) luzVar.mo16041d().mo16809c()).format);
                    deaVarM5974a.m5969c(((Barcode) luzVar.mo16041d().mo16809c()).valueFormat);
                    if (((Barcode) luzVar.mo16041d().mo16809c()).format == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    deaVarM5974a.m5971e(z2);
                }
                return deaVarM5974a.m5967a();
            case COPY:
                kvjVar = new kvi((Context) lqqVar2.f39002b, (dsx) lqqVar2.f39003c, kvfVar.f37336c, null, null);
                if (m6025e(luzVar.mo16038a())) {
                    deaVarM5974a.f10622e = 1;
                } else {
                    deaVarM5974a.f10622e = 2;
                    deaVarM5974a.f10619b = new czx(kvjVar, 19);
                }
                if (m6024d(luzVar)) {
                    if (m6025e(luzVar.mo16038a())) {
                        lqqVar = this.f10748l;
                        z = kvjVar instanceof kvq;
                        i = C0100R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                        if (z) {
                            kvqVar = (kvq) kvjVar;
                            if (mro.m16832b(kvqVar.f37385a.preSharedKey)) {
                                i = C0100R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                            }
                            Drawable drawable7 = ((Context) lqqVar.f39002b).getDrawable(i);
                            drawable7.getClass();
                            mrmVarM16829i = mrm.m16829i(drawable7);
                        } else if (kvfVar.f37343j.mo16813g()) {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity11 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity11.getClass();
                                                drawable = resolveInfoResolveActivity11.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity12 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity12.getClass();
                                            drawable = resolveInfoResolveActivity12.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        } else {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity13 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity13.getClass();
                                                drawable = resolveInfoResolveActivity13.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity14 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity14.getClass();
                                            drawable = resolveInfoResolveActivity14.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        }
                        if (mrmVarM16829i.mo16813g()) {
                            deaVarM5974a.f10620c = (Drawable) mrmVarM16829i.mo16809c();
                        } else {
                            deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                        }
                    } else {
                        deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.gs_passkey_fill1_vd_theme_24, null);
                }
                deaVarM5974a.m5972f(j);
                deaVarM5974a.f10623f = 2;
                deaVarM5974a.m5973g(SystemClock.elapsedRealtime());
                deaVarM5974a.m5970d(dez.m6041k(luzVar.mo16036A(), this.f10747k, this.f10744h, this.f10745i));
                if (luzVar.mo16041d().mo16813g()) {
                    deaVarM5974a.m5968b(((Barcode) luzVar.mo16041d().mo16809c()).format);
                    deaVarM5974a.m5969c(((Barcode) luzVar.mo16041d().mo16809c()).valueFormat);
                    if (((Barcode) luzVar.mo16041d().mo16809c()).format == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    deaVarM5974a.m5971e(z2);
                }
                return deaVarM5974a.m5967a();
            case EMAIL:
                kvjVar = new kvj(lpeVar, kvfVar.f37336c, 0, null, null);
                if (m6025e(luzVar.mo16038a())) {
                    deaVarM5974a.f10622e = 1;
                } else {
                    deaVarM5974a.f10622e = 2;
                    deaVarM5974a.f10619b = new czx(kvjVar, 19);
                }
                if (m6024d(luzVar)) {
                    if (m6025e(luzVar.mo16038a())) {
                        lqqVar = this.f10748l;
                        z = kvjVar instanceof kvq;
                        i = C0100R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                        if (z) {
                            kvqVar = (kvq) kvjVar;
                            if (mro.m16832b(kvqVar.f37385a.preSharedKey)) {
                                i = C0100R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                            }
                            Drawable drawable8 = ((Context) lqqVar.f39002b).getDrawable(i);
                            drawable8.getClass();
                            mrmVarM16829i = mrm.m16829i(drawable8);
                        } else if (kvfVar.f37343j.mo16813g()) {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity15 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity15.getClass();
                                                drawable = resolveInfoResolveActivity15.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity16 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity16.getClass();
                                            drawable = resolveInfoResolveActivity16.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        } else {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity17 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity17.getClass();
                                                drawable = resolveInfoResolveActivity17.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity18 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity18.getClass();
                                            drawable = resolveInfoResolveActivity18.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        }
                        if (mrmVarM16829i.mo16813g()) {
                            deaVarM5974a.f10620c = (Drawable) mrmVarM16829i.mo16809c();
                        } else {
                            deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                        }
                    } else {
                        deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.gs_passkey_fill1_vd_theme_24, null);
                }
                deaVarM5974a.m5972f(j);
                deaVarM5974a.f10623f = 2;
                deaVarM5974a.m5973g(SystemClock.elapsedRealtime());
                deaVarM5974a.m5970d(dez.m6041k(luzVar.mo16036A(), this.f10747k, this.f10744h, this.f10745i));
                if (luzVar.mo16041d().mo16813g()) {
                    deaVarM5974a.m5968b(((Barcode) luzVar.mo16041d().mo16809c()).format);
                    deaVarM5974a.m5969c(((Barcode) luzVar.mo16041d().mo16809c()).valueFormat);
                    if (((Barcode) luzVar.mo16041d().mo16809c()).format == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    deaVarM5974a.m5971e(z2);
                }
                return deaVarM5974a.m5967a();
            case MAP:
                kvjVar = new kvm(lpeVar, kvfVar.f37336c, kvfVar.f37341h, null, null);
                if (m6025e(luzVar.mo16038a())) {
                    deaVarM5974a.f10622e = 1;
                } else {
                    deaVarM5974a.f10622e = 2;
                    deaVarM5974a.f10619b = new czx(kvjVar, 19);
                }
                if (m6024d(luzVar)) {
                    if (m6025e(luzVar.mo16038a())) {
                        lqqVar = this.f10748l;
                        z = kvjVar instanceof kvq;
                        i = C0100R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                        if (z) {
                            kvqVar = (kvq) kvjVar;
                            if (mro.m16832b(kvqVar.f37385a.preSharedKey)) {
                                i = C0100R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                            }
                            Drawable drawable9 = ((Context) lqqVar.f39002b).getDrawable(i);
                            drawable9.getClass();
                            mrmVarM16829i = mrm.m16829i(drawable9);
                        } else if (kvfVar.f37343j.mo16813g()) {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity19 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity19.getClass();
                                                drawable = resolveInfoResolveActivity19.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity110 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity110.getClass();
                                            drawable = resolveInfoResolveActivity110.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        } else {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity111 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity111.getClass();
                                                drawable = resolveInfoResolveActivity111.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity112 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity112.getClass();
                                            drawable = resolveInfoResolveActivity112.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        }
                        if (mrmVarM16829i.mo16813g()) {
                            deaVarM5974a.f10620c = (Drawable) mrmVarM16829i.mo16809c();
                        } else {
                            deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                        }
                    } else {
                        deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.gs_passkey_fill1_vd_theme_24, null);
                }
                deaVarM5974a.m5972f(j);
                deaVarM5974a.f10623f = 2;
                deaVarM5974a.m5973g(SystemClock.elapsedRealtime());
                deaVarM5974a.m5970d(dez.m6041k(luzVar.mo16036A(), this.f10747k, this.f10744h, this.f10745i));
                if (luzVar.mo16041d().mo16813g()) {
                    deaVarM5974a.m5968b(((Barcode) luzVar.mo16041d().mo16809c()).format);
                    deaVarM5974a.m5969c(((Barcode) luzVar.mo16041d().mo16809c()).valueFormat);
                    if (((Barcode) luzVar.mo16041d().mo16809c()).format == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    deaVarM5974a.m5971e(z2);
                }
                return deaVarM5974a.m5967a();
            case OPEN_URL:
                kvjVar = new kvj(lpeVar, kvfVar.f37336c, 2, null, null);
                if (m6025e(luzVar.mo16038a())) {
                    deaVarM5974a.f10622e = 1;
                } else {
                    deaVarM5974a.f10622e = 2;
                    deaVarM5974a.f10619b = new czx(kvjVar, 19);
                }
                if (m6024d(luzVar)) {
                    if (m6025e(luzVar.mo16038a())) {
                        lqqVar = this.f10748l;
                        z = kvjVar instanceof kvq;
                        i = C0100R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                        if (z) {
                            kvqVar = (kvq) kvjVar;
                            if (mro.m16832b(kvqVar.f37385a.preSharedKey)) {
                                i = C0100R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                            }
                            Drawable drawable10 = ((Context) lqqVar.f39002b).getDrawable(i);
                            drawable10.getClass();
                            mrmVarM16829i = mrm.m16829i(drawable10);
                        } else if (kvfVar.f37343j.mo16813g()) {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity113 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity113.getClass();
                                                drawable = resolveInfoResolveActivity113.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity114 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity114.getClass();
                                            drawable = resolveInfoResolveActivity114.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        } else {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity115 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity115.getClass();
                                                drawable = resolveInfoResolveActivity115.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity116 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity116.getClass();
                                            drawable = resolveInfoResolveActivity116.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        }
                        if (mrmVarM16829i.mo16813g()) {
                            deaVarM5974a.f10620c = (Drawable) mrmVarM16829i.mo16809c();
                        } else {
                            deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                        }
                    } else {
                        deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.gs_passkey_fill1_vd_theme_24, null);
                }
                deaVarM5974a.m5972f(j);
                deaVarM5974a.f10623f = 2;
                deaVarM5974a.m5973g(SystemClock.elapsedRealtime());
                deaVarM5974a.m5970d(dez.m6041k(luzVar.mo16036A(), this.f10747k, this.f10744h, this.f10745i));
                if (luzVar.mo16041d().mo16813g()) {
                    deaVarM5974a.m5968b(((Barcode) luzVar.mo16041d().mo16809c()).format);
                    deaVarM5974a.m5969c(((Barcode) luzVar.mo16041d().mo16809c()).valueFormat);
                    if (((Barcode) luzVar.mo16041d().mo16809c()).format == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    deaVarM5974a.m5971e(z2);
                }
                return deaVarM5974a.m5967a();
            case SEARCH:
                kvjVar = new kvj(lpeVar, kvfVar.f37336c, 3, null, null);
                if (m6025e(luzVar.mo16038a())) {
                    deaVarM5974a.f10622e = 1;
                } else {
                    deaVarM5974a.f10622e = 2;
                    deaVarM5974a.f10619b = new czx(kvjVar, 19);
                }
                if (m6024d(luzVar)) {
                    if (m6025e(luzVar.mo16038a())) {
                        lqqVar = this.f10748l;
                        z = kvjVar instanceof kvq;
                        i = C0100R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                        if (z) {
                            kvqVar = (kvq) kvjVar;
                            if (mro.m16832b(kvqVar.f37385a.preSharedKey)) {
                                i = C0100R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                            }
                            Drawable drawable11 = ((Context) lqqVar.f39002b).getDrawable(i);
                            drawable11.getClass();
                            mrmVarM16829i = mrm.m16829i(drawable11);
                        } else if (kvfVar.f37343j.mo16813g()) {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity117 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity117.getClass();
                                                drawable = resolveInfoResolveActivity117.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity118 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity118.getClass();
                                            drawable = resolveInfoResolveActivity118.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        } else {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity119 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity119.getClass();
                                                drawable = resolveInfoResolveActivity119.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity1110 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity1110.getClass();
                                            drawable = resolveInfoResolveActivity1110.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        }
                        if (mrmVarM16829i.mo16813g()) {
                            deaVarM5974a.f10620c = (Drawable) mrmVarM16829i.mo16809c();
                        } else {
                            deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                        }
                    } else {
                        deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.gs_passkey_fill1_vd_theme_24, null);
                }
                deaVarM5974a.m5972f(j);
                deaVarM5974a.f10623f = 2;
                deaVarM5974a.m5973g(SystemClock.elapsedRealtime());
                deaVarM5974a.m5970d(dez.m6041k(luzVar.mo16036A(), this.f10747k, this.f10744h, this.f10745i));
                if (luzVar.mo16041d().mo16813g()) {
                    deaVarM5974a.m5968b(((Barcode) luzVar.mo16041d().mo16809c()).format);
                    deaVarM5974a.m5969c(((Barcode) luzVar.mo16041d().mo16809c()).valueFormat);
                    if (((Barcode) luzVar.mo16041d().mo16809c()).format == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    deaVarM5974a.m5971e(z2);
                }
                return deaVarM5974a.m5967a();
            case SHOPPING:
                kvjVar = new kvj(lpeVar, kvfVar.f37336c, 4, null, null, null);
                if (m6025e(luzVar.mo16038a())) {
                    deaVarM5974a.f10622e = 1;
                } else {
                    deaVarM5974a.f10622e = 2;
                    deaVarM5974a.f10619b = new czx(kvjVar, 19);
                }
                if (m6024d(luzVar)) {
                    if (m6025e(luzVar.mo16038a())) {
                        lqqVar = this.f10748l;
                        z = kvjVar instanceof kvq;
                        i = C0100R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                        if (z) {
                            kvqVar = (kvq) kvjVar;
                            if (mro.m16832b(kvqVar.f37385a.preSharedKey)) {
                                i = C0100R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                            }
                            Drawable drawable12 = ((Context) lqqVar.f39002b).getDrawable(i);
                            drawable12.getClass();
                            mrmVarM16829i = mrm.m16829i(drawable12);
                        } else if (kvfVar.f37343j.mo16813g()) {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity1111 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity1111.getClass();
                                                drawable = resolveInfoResolveActivity1111.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity1112 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity1112.getClass();
                                            drawable = resolveInfoResolveActivity1112.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        } else {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity1113 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity1113.getClass();
                                                drawable = resolveInfoResolveActivity1113.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity1114 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity1114.getClass();
                                            drawable = resolveInfoResolveActivity1114.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        }
                        if (mrmVarM16829i.mo16813g()) {
                            deaVarM5974a.f10620c = (Drawable) mrmVarM16829i.mo16809c();
                        } else {
                            deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                        }
                    } else {
                        deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.gs_passkey_fill1_vd_theme_24, null);
                }
                deaVarM5974a.m5972f(j);
                deaVarM5974a.f10623f = 2;
                deaVarM5974a.m5973g(SystemClock.elapsedRealtime());
                deaVarM5974a.m5970d(dez.m6041k(luzVar.mo16036A(), this.f10747k, this.f10744h, this.f10745i));
                if (luzVar.mo16041d().mo16813g()) {
                    deaVarM5974a.m5968b(((Barcode) luzVar.mo16041d().mo16809c()).format);
                    deaVarM5974a.m5969c(((Barcode) luzVar.mo16041d().mo16809c()).valueFormat);
                    if (((Barcode) luzVar.mo16041d().mo16809c()).format == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    deaVarM5974a.m5971e(z2);
                }
                return deaVarM5974a.m5967a();
            case f37379j:
                kvjVar = new kvo(lpeVar, (Context) lqqVar2.f39002b, kvfVar.f37342i, 1, null, null);
                if (m6025e(luzVar.mo16038a())) {
                    deaVarM5974a.f10622e = 1;
                } else {
                    deaVarM5974a.f10622e = 2;
                    deaVarM5974a.f10619b = new czx(kvjVar, 19);
                }
                if (m6024d(luzVar)) {
                    if (m6025e(luzVar.mo16038a())) {
                        lqqVar = this.f10748l;
                        z = kvjVar instanceof kvq;
                        i = C0100R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                        if (z) {
                            kvqVar = (kvq) kvjVar;
                            if (mro.m16832b(kvqVar.f37385a.preSharedKey)) {
                                i = C0100R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                            }
                            Drawable drawable13 = ((Context) lqqVar.f39002b).getDrawable(i);
                            drawable13.getClass();
                            mrmVarM16829i = mrm.m16829i(drawable13);
                        } else if (kvfVar.f37343j.mo16813g()) {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity1115 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity1115.getClass();
                                                drawable = resolveInfoResolveActivity1115.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity1116 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity1116.getClass();
                                            drawable = resolveInfoResolveActivity1116.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        } else {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity1117 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity1117.getClass();
                                                drawable = resolveInfoResolveActivity1117.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity1118 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity1118.getClass();
                                            drawable = resolveInfoResolveActivity1118.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        }
                        if (mrmVarM16829i.mo16813g()) {
                            deaVarM5974a.f10620c = (Drawable) mrmVarM16829i.mo16809c();
                        } else {
                            deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                        }
                    } else {
                        deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.gs_passkey_fill1_vd_theme_24, null);
                }
                deaVarM5974a.m5972f(j);
                deaVarM5974a.f10623f = 2;
                deaVarM5974a.m5973g(SystemClock.elapsedRealtime());
                deaVarM5974a.m5970d(dez.m6041k(luzVar.mo16036A(), this.f10747k, this.f10744h, this.f10745i));
                if (luzVar.mo16041d().mo16813g()) {
                    deaVarM5974a.m5968b(((Barcode) luzVar.mo16041d().mo16809c()).format);
                    deaVarM5974a.m5969c(((Barcode) luzVar.mo16041d().mo16809c()).valueFormat);
                    if (((Barcode) luzVar.mo16041d().mo16809c()).format == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    deaVarM5974a.m5971e(z2);
                }
                return deaVarM5974a.m5967a();
            case TRANSLATE:
                kvjVar = new kvo(lpeVar, (Context) lqqVar2.f39002b, kvfVar.f37336c, Locale.getDefault(), 0, null, null);
                if (m6025e(luzVar.mo16038a())) {
                    deaVarM5974a.f10622e = 1;
                } else {
                    deaVarM5974a.f10622e = 2;
                    deaVarM5974a.f10619b = new czx(kvjVar, 19);
                }
                if (m6024d(luzVar)) {
                    if (m6025e(luzVar.mo16038a())) {
                        lqqVar = this.f10748l;
                        z = kvjVar instanceof kvq;
                        i = C0100R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                        if (z) {
                            kvqVar = (kvq) kvjVar;
                            if (mro.m16832b(kvqVar.f37385a.preSharedKey)) {
                                i = C0100R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                            }
                            Drawable drawable14 = ((Context) lqqVar.f39002b).getDrawable(i);
                            drawable14.getClass();
                            mrmVarM16829i = mrm.m16829i(drawable14);
                        } else if (kvfVar.f37343j.mo16813g()) {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity1119 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity1119.getClass();
                                                drawable = resolveInfoResolveActivity1119.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity11110 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity11110.getClass();
                                            drawable = resolveInfoResolveActivity11110.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        } else {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity11111 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity11111.getClass();
                                                drawable = resolveInfoResolveActivity11111.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity11112 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity11112.getClass();
                                            drawable = resolveInfoResolveActivity11112.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        }
                        if (mrmVarM16829i.mo16813g()) {
                            deaVarM5974a.f10620c = (Drawable) mrmVarM16829i.mo16809c();
                        } else {
                            deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                        }
                    } else {
                        deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.gs_passkey_fill1_vd_theme_24, null);
                }
                deaVarM5974a.m5972f(j);
                deaVarM5974a.f10623f = 2;
                deaVarM5974a.m5973g(SystemClock.elapsedRealtime());
                deaVarM5974a.m5970d(dez.m6041k(luzVar.mo16036A(), this.f10747k, this.f10744h, this.f10745i));
                if (luzVar.mo16041d().mo16813g()) {
                    deaVarM5974a.m5968b(((Barcode) luzVar.mo16041d().mo16809c()).format);
                    deaVarM5974a.m5969c(((Barcode) luzVar.mo16041d().mo16809c()).valueFormat);
                    if (((Barcode) luzVar.mo16041d().mo16809c()).format == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    deaVarM5974a.m5971e(z2);
                }
                return deaVarM5974a.m5967a();
            case WIFI:
                if (!kvfVar.f37343j.mo16813g()) {
                    throw new IllegalStateException("Wifi actions must have wifi network data");
                }
                Context context = (Context) lqqVar2.f39002b;
                WifiManager wifiManager = (WifiManager) abu.m160b(context, WifiManager.class);
                Object obj7 = lqqVar2.f39003c;
                kxi kxiVar = (kxi) kvfVar.f37343j.mo16809c();
                if (wifiManager == null) {
                    kvjVar = new kvk((dsx) obj7, C0100R.string.qr_wifi_error_no_wifi_available, new Object[]{kxiVar.f37646a}, null, null);
                } else if (abx.m170b(context, "android.permission.CHANGE_WIFI_STATE") != 0) {
                    kvjVar = new kvk((dsx) obj7, C0100R.string.qr_wifi_error_no_permissions, new Object[]{kxiVar.f37646a}, null, null);
                } else {
                    kxh kxhVar = kxh.UNKNOWN;
                    kxh kxhVarM14954b2 = kxh.m14954b(kxiVar.f37647b);
                    if (kxhVarM14954b2 == null) {
                        kxhVarM14954b2 = kxh.UNRECOGNIZED;
                    }
                    switch (kxhVarM14954b2.ordinal()) {
                        case 1:
                            mrmVarM16829i2 = mrm.m16829i(lum.OPEN);
                            break;
                        case 2:
                            mrmVarM16829i2 = mrm.m16829i(lum.WPA);
                            break;
                        case 3:
                            mrmVarM16829i2 = mrm.m16829i(lum.WEP);
                            break;
                        default:
                            lvd lvdVar = lvd.f39383a;
                            Object[] objArr = new Object[1];
                            kxh kxhVarM14954b3 = kxh.m14954b(kxiVar.f37647b);
                            if (kxhVarM14954b3 == null) {
                                kxhVarM14954b3 = kxh.UNRECOGNIZED;
                            }
                            objArr[0] = kxhVarM14954b3;
                            lvdVar.m16089c(kvq.class, "Unexpected WifiInt: %s", objArr);
                            mrmVarM16829i2 = mqu.f41450a;
                            break;
                    }
                    if (mrmVarM16829i2.mo16813g()) {
                        try {
                            luo luoVar = new luo();
                            luoVar.f39239a = mro.m16831a(kxiVar.f37646a);
                            luoVar.f39240b = mro.m16831a(kxiVar.f37648c);
                            luoVar.f39241c = (lum) mrmVarM16829i2.mo16809c();
                            luoVar.f39242d = Boolean.valueOf(kxiVar.f37649d);
                            WifiConfiguration wifiConfiguration = new WifiConfiguration();
                            String str16 = luoVar.f39239a;
                            if (!luo.m16015c(str16, 1, 32)) {
                                throw lun.m16012a(1, "SSID must have a length of 1-32 chars. SSID is: %s", str16);
                            }
                            wifiConfiguration.SSID = luo.m16013a(str16);
                            switch (luoVar.f39241c) {
                                case OPEN:
                                    if (!luoVar.f39240b.isEmpty()) {
                                        throw lun.m16012a(2, "Open WiFi network should not have a password specified", new Object[0]);
                                    }
                                    wifiConfiguration.allowedKeyManagement.set(0);
                                    wifiConfiguration.allowedProtocols.set(1);
                                    wifiConfiguration.allowedProtocols.set(0);
                                    wifiConfiguration.allowedAuthAlgorithms.clear();
                                    wifiConfiguration.allowedPairwiseCiphers.set(2);
                                    wifiConfiguration.allowedPairwiseCiphers.set(1);
                                    wifiConfiguration.allowedGroupCiphers.set(0);
                                    wifiConfiguration.allowedGroupCiphers.set(1);
                                    wifiConfiguration.allowedGroupCiphers.set(3);
                                    wifiConfiguration.allowedGroupCiphers.set(2);
                                    break;
                                    break;
                                case WEP:
                                    String[] strArr = wifiConfiguration.wepKeys;
                                    String strM16013a = luoVar.f39240b;
                                    switch (strM16013a.length()) {
                                        case 0:
                                            throw lun.m16012a(3, "No WEP password was specified", new Object[0]);
                                        case 5:
                                        case 13:
                                        case 16:
                                        case 29:
                                            strM16013a = luo.m16013a(strM16013a);
                                            break;
                                        case 10:
                                        case 26:
                                        case 32:
                                        case 58:
                                            if (!luo.m16014b(strM16013a)) {
                                                throw lun.m16012a(4, "WEP password %s is not a hex string, but has a length such that it must be one. %s", strM16013a, "WEP passwords must be 5, 13, 16, or 29 ASCII characters, or 10, 26, 32, or 58 hex characters.");
                                            }
                                            break;
                                            break;
                                        default:
                                            throw lun.m16012a(4, "Invalid WEP password %s. %s", strM16013a, "WEP passwords must be 5, 13, 16, or 29 ASCII characters, or 10, 26, 32, or 58 hex characters.");
                                    }
                                    strArr[0] = strM16013a;
                                    wifiConfiguration.allowedKeyManagement.set(0);
                                    wifiConfiguration.allowedProtocols.set(1);
                                    wifiConfiguration.allowedProtocols.set(0);
                                    wifiConfiguration.allowedAuthAlgorithms.set(0);
                                    wifiConfiguration.allowedAuthAlgorithms.set(1);
                                    wifiConfiguration.allowedPairwiseCiphers.set(2);
                                    wifiConfiguration.allowedPairwiseCiphers.set(1);
                                    wifiConfiguration.allowedGroupCiphers.set(0);
                                    wifiConfiguration.allowedGroupCiphers.set(1);
                                    wifiConfiguration.wepTxKeyIndex = 0;
                                    break;
                                case WPA:
                                    String strM16013a2 = luoVar.f39240b;
                                    if (strM16013a2.isEmpty()) {
                                        throw lun.m16012a(3, "No WPA PSK was specified", new Object[0]);
                                    }
                                    if (luo.m16015c(strM16013a2, 8, 63)) {
                                        strM16013a2 = luo.m16013a(strM16013a2);
                                    } else {
                                        if (strM16013a2.length() != 64) {
                                            throw lun.m16012a(4, "WPA PSK %s has an invalid length. %s", strM16013a2, "WPA PSKs must be 8-63 ASCII characters, or exactly 64 hex characters");
                                        }
                                        if (!luo.m16014b(strM16013a2)) {
                                            throw lun.m16012a(4, "WPA PSK %s is 64 chars, which means it must be hex; but it was not", strM16013a2);
                                        }
                                    }
                                    wifiConfiguration.preSharedKey = strM16013a2;
                                    wifiConfiguration.allowedProtocols.set(1);
                                    wifiConfiguration.allowedProtocols.set(0);
                                    wifiConfiguration.allowedKeyManagement.set(1);
                                    wifiConfiguration.allowedPairwiseCiphers.set(2);
                                    wifiConfiguration.allowedPairwiseCiphers.set(1);
                                    wifiConfiguration.allowedGroupCiphers.set(0);
                                    wifiConfiguration.allowedGroupCiphers.set(1);
                                    wifiConfiguration.allowedGroupCiphers.set(3);
                                    wifiConfiguration.allowedGroupCiphers.set(2);
                                    break;
                            }
                            wifiConfiguration.hiddenSSID = luoVar.f39242d.booleanValue();
                            kvjVar = new kvq(wifiManager, (dsx) obj7, wifiConfiguration, lpeVar, null, null, null);
                        } catch (lun e3) {
                            lvd lvdVar2 = lvd.f39383a;
                            Object[] objArr2 = {e3};
                            if (lvdVar2.m16091e(5)) {
                                Log.w(lvdVar2.f39384b, lvdVar2.m16087a("QR code contained invalid wifi. Details: %s", objArr2), e3);
                            }
                            int i4 = e3.f39238a;
                            int i5 = i4 - 1;
                            if (i4 == 0) {
                                throw null;
                            }
                            switch (i5) {
                                case 0:
                                    kvjVar = new kvk((dsx) obj7, C0100R.string.qr_wifi_error_ssid_invalid, new Object[]{kxiVar.f37646a}, null, null);
                                    break;
                                case 1:
                                case 2:
                                case 3:
                                    kvjVar = new kvk((dsx) obj7, C0100R.string.qr_wifi_error_password_invalid, new Object[]{kxiVar.f37646a}, null, null);
                                    break;
                                default:
                                    lvd.f39383a.m16089c(kvq.class, "Unhandled WifiConfigurationBuilder exception %s", e3);
                                    kvjVar = new kvk((dsx) obj7, C0100R.string.qr_wifi_error_generic_error, new Object[]{kxiVar.f37646a}, null, null);
                                    break;
                            }
                        }
                    } else {
                        kvjVar = new kvk((dsx) obj7, C0100R.string.qr_wifi_error_generic_error, new Object[]{kxiVar.f37646a}, null, null);
                    }
                }
                if (m6025e(luzVar.mo16038a())) {
                    deaVarM5974a.f10622e = 1;
                } else {
                    deaVarM5974a.f10622e = 2;
                    deaVarM5974a.f10619b = new czx(kvjVar, 19);
                }
                if (m6024d(luzVar)) {
                    if (m6025e(luzVar.mo16038a())) {
                        lqqVar = this.f10748l;
                        z = kvjVar instanceof kvq;
                        i = C0100R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                        if (z) {
                            kvqVar = (kvq) kvjVar;
                            if (mro.m16832b(kvqVar.f37385a.preSharedKey)) {
                                i = C0100R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                            }
                            Drawable drawable15 = ((Context) lqqVar.f39002b).getDrawable(i);
                            drawable15.getClass();
                            mrmVarM16829i = mrm.m16829i(drawable15);
                        } else if (kvfVar.f37343j.mo16813g()) {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity11113 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity11113.getClass();
                                                drawable = resolveInfoResolveActivity11113.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity11114 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity11114.getClass();
                                            drawable = resolveInfoResolveActivity11114.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        } else {
                            switch (kvfVar.f37334a.ordinal()) {
                                case 1:
                                    i2 = C0100R.drawable.quantum_ic_phone_white_24;
                                    break;
                                case 2:
                                    i2 = C0100R.drawable.quantum_ic_contacts_product_white_24;
                                    break;
                                case 3:
                                default:
                                    i2 = -1;
                                    break;
                                case 4:
                                    i2 = C0100R.drawable.quantum_ic_email_white_24;
                                    break;
                                case 5:
                                    i2 = C0100R.drawable.quantum_ic_location_on_white_24;
                                    break;
                                case 6:
                                    i2 = C0100R.drawable.quantum_ic_public_white_24;
                                    break;
                                case 7:
                                case 8:
                                    i2 = C0100R.drawable.quantum_ic_barcode_scanner_white_24;
                                    break;
                            }
                            if (i2 < 0) {
                                if (kvjVar instanceof kvl) {
                                    packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                    intentMo14930a = ((kvl) kvjVar).mo14930a();
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                    if (resolveInfoResolveActivity == null) {
                                        drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else {
                                        it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                                drawable.getClass();
                                            } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                                ResolveInfo resolveInfoResolveActivity11115 = packageManager.resolveActivity(intentMo14930a, 0);
                                                resolveInfoResolveActivity11115.getClass();
                                                drawable = resolveInfoResolveActivity11115.loadIcon(packageManager);
                                            }
                                        }
                                    }
                                    mrmVarM16829i = mrm.m16829i(drawable);
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                            } else if (kvjVar instanceof kvl) {
                                packageManager = ((Context) lqqVar.f39002b).getPackageManager();
                                intentMo14930a = ((kvl) kvjVar).mo14930a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentMo14930a, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentMo14930a, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = ((Context) lqqVar.f39002b).getDrawable(C0100R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (mpw.m16768g(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity11116 = packageManager.resolveActivity(intentMo14930a, 0);
                                            resolveInfoResolveActivity11116.getClass();
                                            drawable = resolveInfoResolveActivity11116.loadIcon(packageManager);
                                        }
                                    }
                                }
                                mrmVarM16829i = mrm.m16829i(drawable);
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        }
                        if (mrmVarM16829i.mo16813g()) {
                            deaVarM5974a.f10620c = (Drawable) mrmVarM16829i.mo16809c();
                        } else {
                            deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                        }
                    } else {
                        deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    deaVarM5974a.f10620c = this.f10739c.getResources().getDrawable(C0100R.drawable.gs_passkey_fill1_vd_theme_24, null);
                }
                deaVarM5974a.m5972f(j);
                deaVarM5974a.f10623f = 2;
                deaVarM5974a.m5973g(SystemClock.elapsedRealtime());
                deaVarM5974a.m5970d(dez.m6041k(luzVar.mo16036A(), this.f10747k, this.f10744h, this.f10745i));
                if (luzVar.mo16041d().mo16813g()) {
                    deaVarM5974a.m5968b(((Barcode) luzVar.mo16041d().mo16809c()).format);
                    deaVarM5974a.m5969c(((Barcode) luzVar.mo16041d().mo16809c()).valueFormat);
                    if (((Barcode) luzVar.mo16041d().mo16809c()).format == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    deaVarM5974a.m5971e(z2);
                }
                return deaVarM5974a.m5967a();
            default:
                throw new IllegalStateException("Unsupported action ".concat(String.valueOf(String.valueOf(kvfVar.f37334a))));
        }
    }
}
