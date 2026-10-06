package p000;

import android.net.Uri;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import android.text.TextUtils;
import com.google.android.libraries.barhopper.Barcode;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p021j$.net.URLEncoder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ddx {

    /* JADX INFO: renamed from: a */
    private static final DecimalFormat f10614a = new DecimalFormat("#.###");

    /* JADX INFO: renamed from: b */
    private final String m5962b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            lvd.f39383a.m16090d(this, "Encode mail param failed, mail param: %s", str);
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x01c8  */
    /* JADX INFO: renamed from: a */
    public final synchronized List m5963a(Barcode[] barcodeArr, int i, int i2) {
        ArrayList arrayList;
        lus lusVar;
        luv luvVarM16030a;
        Barcode.WiFi wiFi;
        Barcode.Sms sms;
        Barcode.GeoPoint geoPoint;
        Barcode.CalendarEvent calendarEvent;
        String strConcat;
        mrm mrmVarM16829i;
        barcodeArr.getClass();
        lku.m15669w(i2 > 0);
        lku.m15669w(i > 0);
        arrayList = new ArrayList();
        for (Barcode barcode : barcodeArr) {
            lva lvaVarM16083a = lva.m16083a(barcode.displayValue);
            switch (barcode.valueFormat) {
                case 1:
                    lusVar = lus.CONTACT;
                    Barcode.ContactInfo contactInfo = barcode.contactInfo;
                    luu luuVarM16035a = luv.m16035a();
                    Barcode.PersonName personName = contactInfo.name;
                    if (personName != null) {
                        luuVarM16035a.f39292a = mrm.m16829i(personName.formattedName);
                    }
                    for (Barcode.Phone phone : contactInfo.phones) {
                        if (phone.number.length() > 0 && phone.number.length() < 60) {
                            luuVarM16035a.m16032c().m17082g(lva.m16083a(phone.number).f39376a);
                        }
                    }
                    for (Barcode.Email email : contactInfo.emails) {
                        luuVarM16035a.m16031b().m17082g(email.address);
                    }
                    String[] strArr = contactInfo.urls;
                    if (strArr.length > 0) {
                        luuVarM16035a.m16034e(strArr[0]);
                    }
                    Barcode.Address[] addressArr = contactInfo.addresses;
                    if (addressArr.length > 0) {
                        luuVarM16035a.m16033d(TextUtils.join("\n", addressArr[0].addressLines));
                    }
                    if (!TextUtils.isEmpty(contactInfo.organization)) {
                        luuVarM16035a.f39294c = mrm.m16829i(contactInfo.organization);
                    }
                    if (!TextUtils.isEmpty(contactInfo.note)) {
                        luuVarM16035a.f39293b = mrm.m16829i(contactInfo.note);
                    }
                    luvVarM16030a = luuVarM16035a.m16030a();
                    wiFi = null;
                    sms = null;
                    geoPoint = null;
                    calendarEvent = null;
                    break;
                case 2:
                    lusVar = lus.EMAIL;
                    Barcode.Email email2 = barcode.email;
                    if (email2 != null) {
                        lvaVarM16083a = lva.m16083a(String.format("?to=%s&subject=%s&body=%s", email2.address, m5962b(mro.m16831a(email2.subject)), m5962b(mro.m16831a(email2.body)))).m16086c(barcode.displayValue);
                    }
                    wiFi = null;
                    sms = null;
                    geoPoint = null;
                    luvVarM16030a = null;
                    calendarEvent = null;
                    break;
                case 3:
                case 5:
                    int i3 = barcode.format;
                    if ((i3 & 1632) != 0) {
                        lusVar = lus.PRODUCT_UPC;
                        wiFi = null;
                        sms = null;
                        geoPoint = null;
                        luvVarM16030a = null;
                        calendarEvent = null;
                    } else if (i3 == 256) {
                        lusVar = lus.QR;
                        wiFi = null;
                        sms = null;
                        geoPoint = null;
                        luvVarM16030a = null;
                        calendarEvent = null;
                    } else {
                        lusVar = lus.RAW_BARCODE;
                        wiFi = null;
                        sms = null;
                        geoPoint = null;
                        luvVarM16030a = null;
                        calendarEvent = null;
                    }
                    break;
                case 4:
                    lusVar = lus.f39273j;
                    lvaVarM16083a = lva.m16083a(barcode.displayValue);
                    wiFi = null;
                    sms = null;
                    geoPoint = null;
                    luvVarM16030a = null;
                    calendarEvent = null;
                    break;
                case 6:
                    lusVar = lus.SMS;
                    String str = barcode.sms.phoneNumber;
                    if (str != null) {
                        lvaVarM16083a = lvaVarM16083a.m16085b(str);
                        sms = barcode.sms;
                        wiFi = null;
                    } else {
                        wiFi = null;
                        sms = null;
                    }
                    geoPoint = null;
                    luvVarM16030a = null;
                    calendarEvent = null;
                    break;
                case 7:
                    lusVar = lus.QR_TEXT;
                    wiFi = null;
                    sms = null;
                    geoPoint = null;
                    luvVarM16030a = null;
                    calendarEvent = null;
                    break;
                case 8:
                    lusVar = lus.URL;
                    String str2 = barcode.displayValue;
                    Pattern pattern = lvb.f39378a;
                    String strReplace = str2.replace(" ", "");
                    int i4 = msh.f41542a;
                    if (!strReplace.regionMatches(true, 0, "http", 0, 4)) {
                        strReplace = "http://".concat(String.valueOf(strReplace));
                    }
                    Uri uri = Uri.parse(strReplace);
                    String authority = uri.getAuthority();
                    Uri uriBuild = (authority == null || authority.isEmpty()) ? Uri.EMPTY : new Uri.Builder().scheme(uri.getScheme().toLowerCase()).encodedAuthority(authority).encodedPath(lvb.f39378a.matcher(uri.getEncodedPath()).replaceAll("/")).encodedQuery(uri.getEncodedQuery()).encodedFragment(uri.getEncodedFragment()).build();
                    lva lvaVarM16083a2 = lva.m16083a(uriBuild.toString());
                    String strM16027a = lut.m16027a("%s@", uriBuild.getUserInfo());
                    int port = uriBuild.getPort();
                    String strM16027a2 = lut.m16027a(":%s", port == -1 ? "" : String.valueOf(port));
                    String lowerCase = mro.m16831a(uriBuild.getHost()).toLowerCase();
                    mrm mrmVarMo16808b = (lowerCase.isEmpty() ? mqu.f41450a : mrm.m16829i(lowerCase.substring(true != lowerCase.startsWith("www.") ? 0 : 4, lowerCase.length() - (lowerCase.endsWith("/") ? 1 : 0)))).mo16808b(new dvz(strM16027a, strM16027a2, 13));
                    if (mrmVarMo16808b.mo16813g()) {
                        String strM16831a = mro.m16831a(uriBuild.getScheme());
                        switch (strM16831a.toLowerCase()) {
                            case "http":
                            case "https":
                            case "":
                                strConcat = "";
                                break;
                            default:
                                strConcat = strM16831a.concat("://");
                                break;
                        }
                        String strConcat2 = strConcat.concat((String) mrmVarMo16808b.mo16809c());
                        String strConcat3 = strConcat2.concat(lut.m16028b(uriBuild));
                        if (lut.m16029c(strConcat3)) {
                            String str3 = (!lut.m16028b(uriBuild).isEmpty() || lut.m16029c(strConcat2)) ? "…" : "";
                            int length = 25 - str3.length();
                            if (length > strConcat2.length()) {
                                length = strConcat2.length();
                            }
                            mrmVarM16829i = mrm.m16829i(String.valueOf(strConcat2.substring(length < 0 ? length : 0, length)).concat(str3));
                        } else {
                            mrmVarM16829i = mrm.m16829i(strConcat3);
                        }
                    } else {
                        mrmVarM16829i = mqu.f41450a;
                    }
                    lvaVarM16083a = lvaVarM16083a2.m16086c((String) mrmVarM16829i.mo16812f());
                    wiFi = null;
                    sms = null;
                    geoPoint = null;
                    luvVarM16030a = null;
                    calendarEvent = null;
                    break;
                case 9:
                    lusVar = lus.QR_WIFI;
                    wiFi = barcode.wifi;
                    wiFi.getClass();
                    lvaVarM16083a = lvaVarM16083a.m16085b(wiFi.ssid);
                    sms = null;
                    geoPoint = null;
                    luvVarM16030a = null;
                    calendarEvent = null;
                    break;
                case 10:
                    lusVar = lus.QR_GEO;
                    Barcode.GeoPoint geoPoint2 = barcode.geoPoint;
                    if (geoPoint2 != null) {
                        String str4 = "(" + geoPoint2.lat + "," + geoPoint2.lng + ")";
                        DecimalFormat decimalFormat = f10614a;
                        lvaVarM16083a = lvaVarM16083a.m16085b(str4).m16086c("(" + decimalFormat.format(barcode.geoPoint.lat) + "°, " + decimalFormat.format(barcode.geoPoint.lng) + "°)");
                        geoPoint = geoPoint2;
                        wiFi = null;
                        sms = null;
                    } else {
                        wiFi = null;
                        sms = null;
                        geoPoint = null;
                    }
                    luvVarM16030a = null;
                    calendarEvent = null;
                    break;
                case 11:
                    lusVar = lus.CALENDAR_ENTRY;
                    Barcode.CalendarEvent calendarEvent2 = barcode.calendarEvent;
                    calendarEvent = calendarEvent2 != null ? calendarEvent2 : null;
                    lvaVarM16083a = lvaVarM16083a.m16085b(calendarEvent2.summary);
                    wiFi = null;
                    sms = null;
                    geoPoint = null;
                    luvVarM16030a = null;
                    break;
                default:
                    lusVar = lus.QR;
                    if (barcode.format == 256) {
                        lvaVarM16083a = lvaVarM16083a.m16085b("");
                        wiFi = null;
                        sms = null;
                        geoPoint = null;
                        luvVarM16030a = null;
                        calendarEvent = null;
                    } else {
                        lvd.f39383a.m16090d(this, "Unexpected Barcode valueFormat, %d, of non-QR type " + barcode.valueFormat, new Object[0]);
                        wiFi = null;
                        sms = null;
                        geoPoint = null;
                        luvVarM16030a = null;
                        calendarEvent = null;
                    }
                    break;
            }
            lku.m15670x(barcode.cornerPoints.length == 4, voNZjxiJou.wbl);
            mws mwsVarM17097l = mws.m17097l(new meg(barcode.cornerPoints[0].x, barcode.cornerPoints[0].y, barcode.cornerPoints[1].x, barcode.cornerPoints[1].y, barcode.cornerPoints[2].x, barcode.cornerPoints[2].y, barcode.cornerPoints[3].x, barcode.cornerPoints[3].y));
            lux luxVarM16072C = luz.m16072C();
            luxVarM16072C.f39340b = lvaVarM16083a;
            luxVarM16072C.m16071h(lusVar);
            luxVarM16072C.f39339a = true;
            luxVarM16072C.m16070g(luy.BARHOPPER);
            luxVarM16072C.f39341c = Float.valueOf(1.0f);
            luxVarM16072C.m16068e(mwsVarM17097l);
            if (lusVar != lus.RAW_TEXT) {
                luxVarM16072C.f39342d = mrm.m16829i(barcode);
            }
            if (luvVarM16030a != null) {
                luxVarM16072C.m16069f(luvVarM16030a);
            }
            if (wiFi != null) {
                luxVarM16072C.f39343e = mrm.m16829i(wiFi);
            }
            if (sms != null) {
                luxVarM16072C.f39344f = mrm.m16829i(sms);
            }
            if (geoPoint != null) {
                luxVarM16072C.f39346h = mrm.m16829i(geoPoint);
            }
            if (calendarEvent != null) {
                luxVarM16072C.f39345g = mrm.m16829i(calendarEvent);
            }
            arrayList.add(luxVarM16072C.m16064a());
        }
        return arrayList;
    }
}
