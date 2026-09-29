package org.joda.time.format;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.joda.time.DateTimeZone;
import p000.b22;
import p000.ir7;
import p000.s11;
import p000.s94;
import p000.u94;
import p000.ux5;
import p000.y12;

/* JADX INFO: loaded from: classes3.dex */
enum DateTimeFormatterBuilder$TimeZoneId implements u94, s94 {
    INSTANCE;

    private static final List<String> ALL_IDS;
    private static final List<String> BASE_GROUPED_IDS = new ArrayList();
    private static final Map<String, List<String>> GROUPED_IDS;
    static final int MAX_LENGTH;
    static final int MAX_PREFIX_LENGTH;

    static {
        ArrayList<String> arrayList = new ArrayList(DateTimeZone.m18342m().mo3687b());
        ALL_IDS = arrayList;
        Collections.sort(arrayList);
        GROUPED_IDS = new HashMap();
        int iMax = 0;
        int iMax2 = 0;
        for (String str : arrayList) {
            int iIndexOf = str.indexOf(47);
            if (iIndexOf >= 0) {
                iIndexOf = iIndexOf < str.length() ? iIndexOf + 1 : iIndexOf;
                iMax2 = Math.max(iMax2, iIndexOf);
                String strSubstring = str.substring(0, iIndexOf + 1);
                String strSubstring2 = str.substring(iIndexOf);
                Map<String, List<String>> map = GROUPED_IDS;
                if (!map.containsKey(strSubstring)) {
                    map.put(strSubstring, new ArrayList());
                }
                map.get(strSubstring).add(strSubstring2);
            } else {
                BASE_GROUPED_IDS.add(str);
            }
            iMax = Math.max(iMax, str.length());
        }
        MAX_LENGTH = iMax;
        MAX_PREFIX_LENGTH = iMax2;
    }

    @Override // p000.s94
    public int estimateParsedLength() {
        return MAX_LENGTH;
    }

    @Override // p000.u94
    public int estimatePrintedLength() {
        return MAX_LENGTH;
    }

    @Override // p000.s94
    public int parseInto(b22 b22Var, CharSequence charSequence, int i) {
        String string;
        int length;
        String string2;
        List<String> list = BASE_GROUPED_IDS;
        int length2 = charSequence.length();
        int iMin = Math.min(length2, MAX_PREFIX_LENGTH + i);
        int i2 = i;
        while (true) {
            if (i2 >= iMin) {
                string = "";
                length = i;
                break;
            }
            if (charSequence.charAt(i2) == '/') {
                int i3 = i2 + 1;
                string = charSequence.subSequence(i, i3).toString();
                length = string.length() + i;
                if (i2 < length2 - 1) {
                    StringBuilder sbM22997t = ux5.m22997t(string);
                    sbM22997t.append(charSequence.charAt(i3));
                    string2 = sbM22997t.toString();
                } else {
                    string2 = string;
                }
                list = GROUPED_IDS.get(string2);
                if (list != null) {
                    break;
                }
                return ~i;
            }
            i2++;
        }
        String str = null;
        for (int i4 = 0; i4 < list.size(); i4++) {
            String str2 = list.get(i4);
            if (y12.m24828o(str2, charSequence, length) && (str == null || str2.length() > str.length())) {
                str = str2;
            }
        }
        if (str == null) {
            return ~i;
        }
        DateTimeZone dateTimeZoneM18337c = DateTimeZone.m18337c(string.concat(str));
        b22Var.f7789i = null;
        b22Var.f7784d = dateTimeZoneM18337c;
        return str.length() + length;
    }

    @Override // p000.u94
    public void printTo(Appendable appendable, long j, s11 s11Var, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
        appendable.append(dateTimeZone != null ? dateTimeZone.m18348g() : "");
    }

    @Override // p000.u94
    public void printTo(Appendable appendable, ir7 ir7Var, Locale locale) throws IOException {
    }
}
