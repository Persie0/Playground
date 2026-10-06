package p000;

import com.google.android.libraries.barhopper.Barcode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvc {

    /* JADX INFO: renamed from: a */
    public static final mwx f37316a;

    /* JADX INFO: renamed from: b */
    public static final mwx f37317b;

    static {
        mwt mwtVar = new mwt();
        mwtVar.mo17110e(lus.ADDRESS, kvp.MAP);
        mwtVar.mo17110e(lus.CALENDAR_ENTRY, kvp.CALENDAR);
        mwtVar.mo17110e(lus.CONTACT, kvp.CONTACT);
        mwtVar.mo17110e(lus.EMAIL, kvp.EMAIL);
        mwtVar.mo17110e(lus.f39273j, kvp.CALL);
        mwtVar.mo17110e(lus.PRODUCT_UPC, kvp.SHOPPING);
        mwtVar.mo17110e(lus.QR, kvp.SEARCH);
        mwtVar.mo17110e(lus.QR_TEXT, kvp.SEARCH);
        mwtVar.mo17110e(lus.RAW_BARCODE, kvp.SHOPPING);
        mwtVar.mo17110e(lus.TEXT_BLOCK, kvp.COPY);
        mwtVar.mo17110e(lus.URL, kvp.OPEN_URL);
        mwtVar.mo17110e(lus.FOREIGN_TEXT, kvp.TRANSLATE);
        mwtVar.mo17110e(lus.QR_WIFI, kvp.WIFI);
        mwtVar.mo17110e(lus.TEXT_WIFI, kvp.WIFI);
        mwtVar.mo17110e(lus.SMS, kvp.f37379j);
        mwtVar.mo17110e(lus.DOCUMENT_SCANNING, kvp.DOCUMENT_SCANNING);
        mwtVar.mo17110e(lus.LABELED_PRODUCT, kvp.SHOPPING);
        mwtVar.mo17110e(lus.APPAREL, kvp.SHOPPING);
        mwtVar.mo17110e(lus.TEXT_SELECTION, kvp.TEXT_SELECTION);
        mwtVar.mo17110e(lus.QR_GEO, kvp.MAP);
        f37316a = mwtVar.mo17059b();
        f37317b = mwx.m17122q(luy.PHOTO_OCR, kve.PHOTO_OCR, luy.BARHOPPER, kve.BARHOPPER, luy.PHILEASSTORM, kve.PHILEASSTORM, luy.NONE, kve.NONE);
        mwx.m17122q(kvx.PHOTO_OCR, kve.PHOTO_OCR, kvx.BARHOPPER, kve.BARHOPPER, kvx.f37466d, kve.PHILEASSTORM, kvx.NONE, kve.NONE);
    }

    /* JADX INFO: renamed from: a */
    public static kxb m14927a(Barcode.CalendarDateTime calendarDateTime) {
        nxl nxlVarM18137O = kxb.f37600h.m18137O();
        boolean z = calendarDateTime.isUtc;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        ((kxb) nxqVar).f37608g = z;
        int i = calendarDateTime.year;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        ((kxb) nxqVar2).f37602a = i;
        int i2 = calendarDateTime.month;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        ((kxb) nxqVar3).f37603b = i2;
        int i3 = calendarDateTime.day;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O.f44974b;
        ((kxb) nxqVar4).f37604c = i3;
        int i4 = calendarDateTime.hours;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar5 = nxlVarM18137O.f44974b;
        ((kxb) nxqVar5).f37605d = i4;
        int i5 = calendarDateTime.minutes;
        if (!nxqVar5.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar6 = nxlVarM18137O.f44974b;
        ((kxb) nxqVar6).f37606e = i5;
        int i6 = calendarDateTime.seconds;
        if (!nxqVar6.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ((kxb) nxlVarM18137O.f44974b).f37607f = i6;
        return (kxb) nxlVarM18137O.mo18103l();
    }
}
