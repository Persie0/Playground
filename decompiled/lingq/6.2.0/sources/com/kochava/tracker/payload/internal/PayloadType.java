package com.kochava.tracker.payload.internal;

import android.net.Uri;
import com.kochava.tracker.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p000.a54;
import p000.b34;
import p000.dg4;
import p000.ef4;
import p000.eg4;
import p000.ff4;
import p000.ji8;
import p000.ki8;
import p000.li8;
import p000.z44;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class PayloadType {
    public static final PayloadType[] ALL_TRACKING;
    public static final PayloadType Click;
    public static final PayloadType Event;
    public static final PayloadType GetAttribution;
    public static final PayloadType IdentityLink;
    public static final PayloadType Init;
    public static final PayloadType Install;
    public static final PayloadType PushTokenAdd;
    public static final PayloadType PushTokenRemove;
    public static final PayloadType SessionBegin;
    public static final PayloadType SessionEnd;
    public static final PayloadType Smartlink;
    public static final PayloadType Update;

    /* JADX INFO: renamed from: l */
    private static final /* synthetic */ PayloadType[] f14126l;

    /* JADX INFO: renamed from: a */
    private final String f14127a;

    /* JADX INFO: renamed from: b */
    private final String f14128b;

    /* JADX INFO: renamed from: c */
    private final Uri f14129c;

    /* JADX INFO: renamed from: d */
    private final ki8 f14130d;

    /* JADX INFO: renamed from: e */
    private ki8 f14131e;

    /* JADX INFO: renamed from: f */
    private Uri f14132f;

    /* JADX INFO: renamed from: g */
    private Uri f14133g;

    /* JADX INFO: renamed from: h */
    private Map f14134h;

    /* JADX INFO: renamed from: i */
    private int f14135i;

    /* JADX INFO: renamed from: j */
    private int f14136j;

    /* JADX INFO: renamed from: k */
    private boolean f14137k;

    static {
        String strM3217L;
        Uri uri = Uri.EMPTY;
        Uri uriM3218M = b34.m3218M(BuildConfig.URL_INIT);
        Uri uri2 = uriM3218M != null ? uriM3218M : uri;
        boolean z = true;
        dg4 dg4VarM10329d = dg4.m10329d(BuildConfig.URL_INIT_ROTATION, true);
        String strM10344n = dg4VarM10329d.m10344n("type_id", "");
        ff4 ff4VarM10340j = dg4VarM10329d.m10340j("variations", true);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            ef4 ef4Var = (ef4) ff4VarM10340j;
            if (i >= ef4Var.m11093f()) {
                break;
            }
            eg4 eg4VarM11092e = ef4Var.m11092e(i);
            if (eg4VarM11092e != null) {
                dg4 dg4Var = (dg4) eg4VarM11092e;
                String strM10344n2 = dg4Var.m10344n("start_ymd", "");
                ff4 ff4VarM10340j2 = dg4Var.m10340j("urls", z);
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                while (true) {
                    ef4 ef4Var2 = (ef4) ff4VarM10340j2;
                    if (i2 >= ef4Var2.m11093f()) {
                        break;
                    }
                    synchronized (ef4Var2) {
                        strM3217L = b34.m3217L(ef4Var2.m11089a(i2));
                        strM3217L = strM3217L == null ? null : strM3217L;
                    }
                    Uri uriM3218M2 = b34.m3218M(strM3217L);
                    if (uriM3218M2 != null) {
                        arrayList2.add(uriM3218M2);
                    }
                    i2++;
                }
                arrayList.add(new li8(strM10344n2, (Uri[]) arrayList2.toArray(new Uri[0])));
            }
            i++;
            z = true;
        }
        PayloadType payloadType = new PayloadType("Init", 0, "init", "init", uri2, new ji8(strM10344n, (li8[]) arrayList.toArray(new li8[0])));
        Init = payloadType;
        Uri uriM3218M3 = b34.m3218M("https://control.kochava.com/track/json");
        PayloadType payloadType2 = new PayloadType("Install", 1, "install", "install", uriM3218M3 != null ? uriM3218M3 : uri, null);
        Install = payloadType2;
        Uri uriM3218M4 = b34.m3218M("https://control.kochava.com/track/json");
        PayloadType payloadType3 = new PayloadType("Update", 2, "update", "update", uriM3218M4 != null ? uriM3218M4 : uri, null);
        Update = payloadType3;
        Uri uriM3218M5 = b34.m3218M(BuildConfig.URL_GET_ATTRIBUTION);
        PayloadType payloadType4 = new PayloadType("GetAttribution", 3, "get_attribution", "get_attribution", uriM3218M5 != null ? uriM3218M5 : uri, null);
        GetAttribution = payloadType4;
        Uri uriM3218M6 = b34.m3218M("https://control.kochava.com/track/json");
        PayloadType payloadType5 = new PayloadType("IdentityLink", 4, "identityLink", "identityLink", uriM3218M6 != null ? uriM3218M6 : uri, null);
        IdentityLink = payloadType5;
        Uri uriM3218M7 = b34.m3218M(BuildConfig.URL_PUSH_TOKEN_ADD);
        PayloadType payloadType6 = new PayloadType("PushTokenAdd", 5, "push_token_add", "push_token_add", uriM3218M7 != null ? uriM3218M7 : uri, null);
        PushTokenAdd = payloadType6;
        Uri uriM3218M8 = b34.m3218M(BuildConfig.URL_PUSH_TOKEN_REMOVE);
        PayloadType payloadType7 = new PayloadType("PushTokenRemove", 6, "push_token_remove", "push_token_remove", uriM3218M8 != null ? uriM3218M8 : uri, null);
        PushTokenRemove = payloadType7;
        Uri uriM3218M9 = b34.m3218M("https://control.kochava.com/track/json");
        PayloadType payloadType8 = new PayloadType("SessionBegin", 7, "session_begin", "session", uriM3218M9 != null ? uriM3218M9 : uri, null);
        SessionBegin = payloadType8;
        Uri uriM3218M10 = b34.m3218M("https://control.kochava.com/track/json");
        PayloadType payloadType9 = new PayloadType("SessionEnd", 8, "session_end", "session", uriM3218M10 != null ? uriM3218M10 : uri, null);
        SessionEnd = payloadType9;
        Uri uriM3218M11 = b34.m3218M("https://control.kochava.com/track/json");
        PayloadType payloadType10 = new PayloadType("Event", 9, "event", "event", uriM3218M11 != null ? uriM3218M11 : uri, null);
        Event = payloadType10;
        Uri uriM3218M12 = b34.m3218M(BuildConfig.URL_SMARTLINK);
        Smartlink = new PayloadType("Smartlink", 10, "smartlink", "smartlink", uriM3218M12 != null ? uriM3218M12 : uri, null);
        Click = new PayloadType("Click", 11, "click", "click", uri, null);
        f14126l = m6987a();
        ALL_TRACKING = new PayloadType[]{payloadType, payloadType2, payloadType3, payloadType4, payloadType5, payloadType6, payloadType7, payloadType8, payloadType9, payloadType10};
    }

    private PayloadType(String str, int i, String str2, String str3, Uri uri, ki8 ki8Var) {
        super(str, i);
        this.f14131e = null;
        this.f14132f = null;
        this.f14133g = null;
        this.f14134h = null;
        this.f14135i = 0;
        this.f14136j = 0;
        this.f14137k = false;
        this.f14127a = str2;
        this.f14128b = str3;
        this.f14129c = uri;
        this.f14130d = ki8Var;
    }

    /* JADX INFO: renamed from: a */
    private Uri m6986a(ki8 ki8Var) {
        li8 li8Var;
        int i = this.f14135i;
        if (i != 0) {
            li8[] li8VarArr = ((ji8) ki8Var).f45583b;
            int length = li8VarArr.length - 1;
            while (true) {
                if (length < 0) {
                    li8Var = null;
                    break;
                }
                li8Var = li8VarArr[length];
                Integer numM3211F = b34.m3211F(li8Var.f49719a);
                if (i >= (numM3211F != null ? numM3211F : 0).intValue()) {
                    break;
                }
                length--;
            }
            if (li8Var != null) {
                int i2 = this.f14136j;
                Uri[] uriArr = li8Var.f49720b;
                if (i2 >= uriArr.length) {
                    this.f14136j = 0;
                    this.f14137k = true;
                }
                return uriArr[this.f14136j];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private ki8 m6988b() {
        ki8 ki8Var = this.f14131e;
        if (ki8Var != null) {
            return ki8Var;
        }
        ki8 ki8Var2 = this.f14130d;
        return ki8Var2 != null ? ki8Var2 : new ji8();
    }

    public static PayloadType fromKey(String str) {
        PayloadType payloadTypeFromKeyNullable = fromKeyNullable(str);
        return payloadTypeFromKeyNullable != null ? payloadTypeFromKeyNullable : Event;
    }

    public static PayloadType fromKeyNullable(String str) {
        for (PayloadType payloadType : values()) {
            if (payloadType.f14127a.equals(str)) {
                return payloadType;
            }
        }
        return null;
    }

    public static void resetAll() {
        for (PayloadType payloadType : values()) {
            payloadType.reset();
        }
    }

    public static void setInitOverrideUrls(a54 a54Var) {
        Init.setInitOverrideUrl(((z44) a54Var).f70862a);
        PayloadType payloadType = Install;
        z44 z44Var = (z44) a54Var;
        Uri uri = z44Var.f70870i;
        payloadType.setInitOverrideUrl(z44Var.f70863b);
        Update.setInitOverrideUrl(z44Var.f70865d);
        GetAttribution.setInitOverrideUrl(z44Var.f70864c);
        IdentityLink.setInitOverrideUrl(z44Var.f70866e);
        PushTokenAdd.setInitOverrideUrl(z44Var.f70868g);
        PushTokenRemove.setInitOverrideUrl(z44Var.f70869h);
        PayloadType payloadType2 = SessionBegin;
        Uri uri2 = z44Var.f70871j;
        if (!b34.m3257y(uri2)) {
            uri2 = uri;
        }
        payloadType2.setInitOverrideUrl(uri2);
        PayloadType payloadType3 = SessionEnd;
        Uri uri3 = z44Var.f70872k;
        if (b34.m3257y(uri3)) {
            uri = uri3;
        }
        payloadType3.setInitOverrideUrl(uri);
        Event.setInitOverrideUrl(z44Var.f70873l);
        Smartlink.setInitOverrideUrl(z44Var.f70867f);
        dg4 dg4Var = (dg4) z44Var.f70874m;
        for (String str : dg4Var.m10347q()) {
            Uri uri4 = null;
            Uri uriM3218M = b34.m3218M(dg4Var.m10344n(str, null));
            if (uriM3218M != null) {
                uri4 = uriM3218M;
            }
            Event.setInitEventNameOverrideUrl(str, uri4);
        }
    }

    public static void setTestingOverrideRotationUrls(List<ki8> list) {
        for (ki8 ki8Var : list) {
            for (PayloadType payloadType : values()) {
                if (((ji8) ki8Var).f45582a.equals(payloadType.f14127a)) {
                    payloadType.setTestingOverrideRotationUrl(ki8Var);
                }
            }
        }
    }

    public static void setTestingOverrideUrls(a54 a54Var) {
        Init.setTestingOverrideUrl(((z44) a54Var).f70862a);
        PayloadType payloadType = Install;
        z44 z44Var = (z44) a54Var;
        Uri uri = z44Var.f70870i;
        payloadType.setTestingOverrideUrl(z44Var.f70863b);
        Update.setTestingOverrideUrl(z44Var.f70865d);
        GetAttribution.setTestingOverrideUrl(z44Var.f70864c);
        IdentityLink.setTestingOverrideUrl(z44Var.f70866e);
        PushTokenAdd.setTestingOverrideUrl(z44Var.f70868g);
        PushTokenRemove.setTestingOverrideUrl(z44Var.f70869h);
        PayloadType payloadType2 = SessionBegin;
        Uri uri2 = z44Var.f70871j;
        if (!b34.m3257y(uri2)) {
            uri2 = uri;
        }
        payloadType2.setTestingOverrideUrl(uri2);
        PayloadType payloadType3 = SessionEnd;
        Uri uri3 = z44Var.f70872k;
        if (b34.m3257y(uri3)) {
            uri = uri3;
        }
        payloadType3.setTestingOverrideUrl(uri);
        Event.setTestingOverrideUrl(z44Var.f70873l);
        Smartlink.setTestingOverrideUrl(z44Var.f70867f);
    }

    public static PayloadType valueOf(String str) {
        return (PayloadType) Enum.valueOf(PayloadType.class, str);
    }

    public static PayloadType[] values() {
        return (PayloadType[]) f14126l.clone();
    }

    public final String getAction() {
        return this.f14128b;
    }

    public final String getKey() {
        return this.f14127a;
    }

    public final synchronized int getRotationUrlDate() {
        return this.f14135i;
    }

    public final synchronized int getRotationUrlIndex() {
        return this.f14136j;
    }

    public final synchronized Uri getUrl(String str) {
        Map map;
        if (b34.m3257y(this.f14132f)) {
            return this.f14132f;
        }
        ki8 ki8Var = this.f14131e;
        if (ki8Var != null) {
            Uri uriM6986a = m6986a(ki8Var);
            if (b34.m3257y(uriM6986a)) {
                return uriM6986a;
            }
        }
        if (!b34.m3255w(str) && (map = this.f14134h) != null && map.containsKey(str)) {
            Uri uri = (Uri) this.f14134h.get(str);
            if (b34.m3257y(uri)) {
                return uri;
            }
        }
        if (b34.m3257y(this.f14133g)) {
            return this.f14133g;
        }
        ki8 ki8Var2 = this.f14130d;
        if (ki8Var2 != null) {
            Uri uriM6986a2 = m6986a(ki8Var2);
            if (b34.m3257y(uriM6986a2)) {
                return uriM6986a2;
            }
        }
        return this.f14129c;
    }

    public final synchronized void incrementRotationUrlIndex() {
        this.f14136j++;
        m6986a(m6988b());
    }

    public final synchronized boolean isRotationUrlRotated() {
        return this.f14137k;
    }

    public final synchronized void loadRotationUrl(int i, int i2, boolean z) {
        li8 li8Var;
        Integer num = 0;
        synchronized (this) {
            this.f14135i = i;
            this.f14136j = i2;
            this.f14137k = z;
            Date date = new Date(System.currentTimeMillis());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Integer numM3211F = b34.m3211F(simpleDateFormat.format(date));
            if (numM3211F == null) {
                numM3211F = num;
            }
            int iIntValue = numM3211F.intValue();
            li8[] li8VarArr = ((ji8) m6988b()).f45583b;
            int length = li8VarArr.length - 1;
            while (true) {
                if (length < 0) {
                    li8Var = null;
                    break;
                }
                li8Var = li8VarArr[length];
                Integer numM3211F2 = b34.m3211F(li8Var.f49719a);
                if (numM3211F2 == null) {
                    numM3211F2 = num;
                }
                if (iIntValue >= numM3211F2.intValue()) {
                    break;
                } else {
                    length--;
                }
            }
            if (li8Var == null) {
                this.f14135i = 0;
                this.f14136j = 0;
                this.f14137k = false;
                return;
            }
            Integer numM3211F3 = b34.m3211F(li8Var.f49719a);
            int iIntValue2 = (numM3211F3 != null ? numM3211F3 : 0).intValue();
            if (i != iIntValue2) {
                this.f14135i = iIntValue2;
                this.f14136j = 0;
                this.f14137k = false;
            }
            if (this.f14136j >= li8Var.f49720b.length) {
                this.f14136j = 0;
            }
        }
    }

    public final synchronized void reset() {
        this.f14131e = null;
        this.f14132f = null;
        this.f14133g = null;
        this.f14134h = null;
        this.f14135i = 0;
        this.f14136j = 0;
        this.f14137k = false;
    }

    public final synchronized void setInitEventNameOverrideUrl(String str, Uri uri) {
        if (this.f14134h == null) {
            this.f14134h = new HashMap();
        }
        Map map = this.f14134h;
        if (uri == null) {
            map.remove(str);
        } else {
            map.put(str, uri);
        }
    }

    public final synchronized void setInitOverrideUrl(Uri uri) {
        this.f14133g = uri;
    }

    public final synchronized void setTestingOverrideRotationUrl(ki8 ki8Var) {
        this.f14131e = ki8Var;
    }

    public final synchronized void setTestingOverrideUrl(Uri uri) {
        this.f14132f = uri;
    }

    /* JADX INFO: renamed from: a */
    private static /* synthetic */ PayloadType[] m6987a() {
        return new PayloadType[]{Init, Install, Update, GetAttribution, IdentityLink, PushTokenAdd, PushTokenRemove, SessionBegin, SessionEnd, Event, Smartlink, Click};
    }

    public final synchronized Uri getUrl() {
        return getUrl("");
    }
}
