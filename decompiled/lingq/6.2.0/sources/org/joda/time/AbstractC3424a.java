package org.joda.time;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.k12;
import p000.v12;
import p000.y12;

/* JADX INFO: renamed from: org.joda.time.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3424a {

    /* JADX INFO: renamed from: a */
    public static final Map f54847a;

    /* JADX INFO: renamed from: b */
    public static final k12 f54848b;

    static {
        HashMap map = new HashMap();
        map.put("GMT", "UTC");
        map.put("WET", "WET");
        map.put("CET", "CET");
        map.put("MET", "CET");
        map.put("ECT", "CET");
        map.put("EET", "EET");
        map.put("MIT", "Pacific/Apia");
        map.put("HST", "Pacific/Honolulu");
        map.put("AST", "America/Anchorage");
        map.put("PST", "America/Los_Angeles");
        map.put("MST", "America/Denver");
        map.put("PNT", "America/Phoenix");
        map.put("CST", "America/Chicago");
        map.put("EST", "America/New_York");
        map.put("IET", "America/Indiana/Indianapolis");
        map.put("PRT", "America/Puerto_Rico");
        map.put("CNT", "America/St_Johns");
        map.put("AGT", "America/Argentina/Buenos_Aires");
        map.put("BET", "America/Sao_Paulo");
        map.put("ART", "Africa/Cairo");
        map.put("CAT", "Africa/Harare");
        map.put("EAT", "Africa/Addis_Ababa");
        map.put("NET", "Asia/Yerevan");
        map.put("PLT", "Asia/Karachi");
        map.put("IST", "Asia/Kolkata");
        map.put("BST", "Asia/Dhaka");
        map.put("VST", "Asia/Ho_Chi_Minh");
        map.put("CTT", "Asia/Shanghai");
        map.put("JST", "Asia/Tokyo");
        map.put("ACT", "Australia/Darwin");
        map.put("AET", "Australia/Sydney");
        map.put("SST", "Pacific/Guadalcanal");
        map.put("NST", "Pacific/Auckland");
        f54847a = Collections.unmodifiableMap(map);
        DateTimeZone$LazyInit$1 dateTimeZone$LazyInit$1 = new DateTimeZone$LazyInit$1();
        y12 y12Var = new y12();
        y12Var.m24834e(new v12(null, 4, null, true));
        k12 k12VarM24844r = y12Var.m24844r();
        f54848b = new k12(k12VarM24844r.f46544a, k12VarM24844r.f46545b, null, false, dateTimeZone$LazyInit$1, null);
    }
}
