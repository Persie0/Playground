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
import p095eh.C5404a;
import p095eh.InterfaceC5405b;
import p095eh.InterfaceC5407d;
import p338qd.C8573r0;
import p349qo.C8656b;
import p459wg.C9926j;
import p459wg.InterfaceC9927k;
import p534zf.C10487e;
import p534zf.InterfaceC10484b;
import p534zf.InterfaceC10488f;

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
    private static final /* synthetic */ PayloadType[] f16495l;

    /* JADX INFO: renamed from: a */
    private final String f16496a;

    /* JADX INFO: renamed from: b */
    private final String f16497b;

    /* JADX INFO: renamed from: c */
    private final Uri f16498c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC5405b f16499d;

    /* JADX INFO: renamed from: e */
    private InterfaceC5405b f16500e;

    /* JADX INFO: renamed from: f */
    private Uri f16501f;

    /* JADX INFO: renamed from: g */
    private Uri f16502g;

    /* JADX INFO: renamed from: h */
    private Map<String, Uri> f16503h;

    /* JADX INFO: renamed from: i */
    private int f16504i;

    /* JADX INFO: renamed from: j */
    private int f16505j;

    /* JADX INFO: renamed from: k */
    private boolean f16506k;

    static {
        Uri uriM16890Q = C8656b.m16890Q(BuildConfig.URL_INIT, Uri.EMPTY);
        C10487e c10487eM19446v = C10487e.m19446v(BuildConfig.URL_INIT_ROTATION, true);
        String strMo19467q = c10487eM19446v.mo19467q("type_id", "");
        InterfaceC10484b interfaceC10484bMo19455e = c10487eM19446v.mo19455e("variations");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < interfaceC10484bMo19455e.length(); i10++) {
            InterfaceC10488f interfaceC10488fMo19434d = interfaceC10484bMo19455e.mo19434d(i10);
            if (interfaceC10488fMo19434d != null) {
                final String strMo19467q2 = interfaceC10488fMo19434d.mo19467q("start_ymd", "");
                InterfaceC10484b interfaceC10484bMo19455e2 = interfaceC10488fMo19434d.mo19455e("urls");
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < interfaceC10484bMo19455e2.length(); i11++) {
                    String strMo19431a = interfaceC10484bMo19455e2.mo19431a(i11);
                    Uri uri = null;
                    if (strMo19431a instanceof String) {
                        try {
                            uri = Uri.parse(strMo19431a);
                        } catch (Exception unused) {
                        }
                    }
                    if (uri != null) {
                        arrayList2.add(uri);
                    }
                }
                final Uri[] uriArr = (Uri[]) arrayList2.toArray(new Uri[0]);
                arrayList.add(new InterfaceC5407d(strMo19467q2, uriArr) { // from class: eh.c

                    /* JADX INFO: renamed from: a */
                    public final String f33822a;

                    /* JADX INFO: renamed from: b */
                    public final Uri[] f33823b;

                    {
                        this.f33822a = strMo19467q2;
                        this.f33823b = uriArr;
                    }

                    @Override // p095eh.InterfaceC5407d
                    /* JADX INFO: renamed from: a */
                    public final int mo11566a() {
                        Integer num = 0;
                        Integer numM16883J = C8656b.m16883J(this.f33822a);
                        if (numM16883J != null) {
                            num = numM16883J;
                        }
                        return num.intValue();
                    }

                    @Override // p095eh.InterfaceC5407d
                    /* JADX INFO: renamed from: b */
                    public final Uri[] mo11567b() {
                        return this.f33823b;
                    }
                });
            }
        }
        PayloadType payloadType = new PayloadType("Init", 0, "init", "init", uriM16890Q, new C5404a(strMo19467q, (InterfaceC5407d[]) arrayList.toArray(new InterfaceC5407d[0])));
        Init = payloadType;
        PayloadType payloadType2 = new PayloadType("Install", 1, "install", "install", C8656b.m16890Q("https://control.kochava.com/track/json", Uri.EMPTY), null);
        Install = payloadType2;
        PayloadType payloadType3 = new PayloadType("Update", 2, "update", "update", C8656b.m16890Q("https://control.kochava.com/track/json", Uri.EMPTY), null);
        Update = payloadType3;
        PayloadType payloadType4 = new PayloadType("GetAttribution", 3, "get_attribution", "get_attribution", C8656b.m16890Q(BuildConfig.URL_GET_ATTRIBUTION, Uri.EMPTY), null);
        GetAttribution = payloadType4;
        PayloadType payloadType5 = new PayloadType("IdentityLink", 4, "identityLink", "identityLink", C8656b.m16890Q("https://control.kochava.com/track/json", Uri.EMPTY), null);
        IdentityLink = payloadType5;
        PayloadType payloadType6 = new PayloadType("PushTokenAdd", 5, "push_token_add", "push_token_add", C8656b.m16890Q(BuildConfig.URL_PUSH_TOKEN_ADD, Uri.EMPTY), null);
        PushTokenAdd = payloadType6;
        PayloadType payloadType7 = new PayloadType("PushTokenRemove", 6, "push_token_remove", "push_token_remove", C8656b.m16890Q(BuildConfig.URL_PUSH_TOKEN_REMOVE, Uri.EMPTY), null);
        PushTokenRemove = payloadType7;
        PayloadType payloadType8 = new PayloadType("SessionBegin", 7, "session_begin", "session", C8656b.m16890Q("https://control.kochava.com/track/json", Uri.EMPTY), null);
        SessionBegin = payloadType8;
        PayloadType payloadType9 = new PayloadType("SessionEnd", 8, "session_end", "session", C8656b.m16890Q("https://control.kochava.com/track/json", Uri.EMPTY), null);
        SessionEnd = payloadType9;
        PayloadType payloadType10 = new PayloadType("Event", 9, "event", "event", C8656b.m16890Q("https://control.kochava.com/track/json", Uri.EMPTY), null);
        Event = payloadType10;
        Smartlink = new PayloadType("Smartlink", 10, "smartlink", "smartlink", C8656b.m16890Q(BuildConfig.URL_SMARTLINK, Uri.EMPTY), null);
        Click = new PayloadType("Click", 11, "click", "click", Uri.EMPTY, null);
        f16495l = m9312a();
        ALL_TRACKING = new PayloadType[]{payloadType, payloadType2, payloadType3, payloadType4, payloadType5, payloadType6, payloadType7, payloadType8, payloadType9, payloadType10};
    }

    private PayloadType(String str, int i10, String str2, String str3, Uri uri, InterfaceC5405b interfaceC5405b) {
        super(str, i10);
        this.f16500e = null;
        this.f16501f = null;
        this.f16502g = null;
        this.f16503h = null;
        this.f16504i = 0;
        this.f16505j = 0;
        this.f16506k = false;
        this.f16496a = str2;
        this.f16497b = str3;
        this.f16498c = uri;
        this.f16499d = interfaceC5405b;
    }

    /* JADX INFO: renamed from: a */
    private Uri m9311a(InterfaceC5405b interfaceC5405b) {
        InterfaceC5407d interfaceC5407dMo11565b;
        int i10 = this.f16504i;
        if (i10 == 0 || (interfaceC5407dMo11565b = interfaceC5405b.mo11565b(i10)) == null) {
            return null;
        }
        if (this.f16505j >= interfaceC5407dMo11565b.mo11567b().length) {
            this.f16505j = 0;
            this.f16506k = true;
        }
        return interfaceC5407dMo11565b.mo11567b()[this.f16505j];
    }

    /* JADX INFO: renamed from: a */
    private static /* synthetic */ PayloadType[] m9312a() {
        return new PayloadType[]{Init, Install, Update, GetAttribution, IdentityLink, PushTokenAdd, PushTokenRemove, SessionBegin, SessionEnd, Event, Smartlink, Click};
    }

    /* JADX INFO: renamed from: b */
    private InterfaceC5405b m9313b() {
        InterfaceC5405b interfaceC5405b = this.f16500e;
        if (interfaceC5405b != null) {
            return interfaceC5405b;
        }
        InterfaceC5405b interfaceC5405b2 = this.f16499d;
        return interfaceC5405b2 != null ? interfaceC5405b2 : new C5404a();
    }

    public static PayloadType fromKey(String str) {
        PayloadType payloadTypeFromKeyNullable = fromKeyNullable(str);
        return payloadTypeFromKeyNullable != null ? payloadTypeFromKeyNullable : Event;
    }

    public static PayloadType fromKeyNullable(String str) {
        for (PayloadType payloadType : values()) {
            if (payloadType.f16496a.equals(str)) {
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

    public static void setInitOverrideUrls(InterfaceC9927k interfaceC9927k) {
        C9926j c9926j = (C9926j) interfaceC9927k;
        Init.setInitOverrideUrl(c9926j.f50597a);
        Install.setInitOverrideUrl(c9926j.f50598b);
        Update.setInitOverrideUrl(c9926j.f50600d);
        GetAttribution.setInitOverrideUrl(c9926j.f50599c);
        IdentityLink.setInitOverrideUrl(c9926j.f50601e);
        PushTokenAdd.setInitOverrideUrl(c9926j.f50603g);
        PushTokenRemove.setInitOverrideUrl(c9926j.f50604h);
        PayloadType payloadType = SessionBegin;
        Uri uri = c9926j.f50606j;
        boolean zM16878E = C8656b.m16878E(uri);
        Uri uri2 = c9926j.f50605i;
        if (!zM16878E) {
            uri = uri2;
        }
        payloadType.setInitOverrideUrl(uri);
        PayloadType payloadType2 = SessionEnd;
        Uri uri3 = c9926j.f50607k;
        if (C8656b.m16878E(uri3)) {
            uri2 = uri3;
        }
        payloadType2.setInitOverrideUrl(uri2);
        Event.setInitOverrideUrl(c9926j.f50608l);
        Smartlink.setInitOverrideUrl(c9926j.f50602f);
        InterfaceC10488f interfaceC10488f = c9926j.f50609m;
        for (String str : interfaceC10488f.mo19460j()) {
            Event.setInitEventNameOverrideUrl(str, C8656b.m16890Q(interfaceC10488f.mo19467q(str, null), null));
        }
    }

    public static void setTestingOverrideRotationUrls(List<InterfaceC5405b> list) {
        for (InterfaceC5405b interfaceC5405b : list) {
            for (PayloadType payloadType : values()) {
                if (interfaceC5405b.mo11564a().equals(payloadType.f16496a)) {
                    payloadType.setTestingOverrideRotationUrl(interfaceC5405b);
                }
            }
        }
    }

    public static void setTestingOverrideUrls(InterfaceC9927k interfaceC9927k) {
        C9926j c9926j = (C9926j) interfaceC9927k;
        Init.setTestingOverrideUrl(c9926j.f50597a);
        Install.setTestingOverrideUrl(c9926j.f50598b);
        Update.setTestingOverrideUrl(c9926j.f50600d);
        GetAttribution.setTestingOverrideUrl(c9926j.f50599c);
        IdentityLink.setTestingOverrideUrl(c9926j.f50601e);
        PushTokenAdd.setTestingOverrideUrl(c9926j.f50603g);
        PushTokenRemove.setTestingOverrideUrl(c9926j.f50604h);
        PayloadType payloadType = SessionBegin;
        Uri uri = c9926j.f50606j;
        boolean zM16878E = C8656b.m16878E(uri);
        Uri uri2 = c9926j.f50605i;
        if (!zM16878E) {
            uri = uri2;
        }
        payloadType.setTestingOverrideUrl(uri);
        PayloadType payloadType2 = SessionEnd;
        Uri uri3 = c9926j.f50607k;
        if (C8656b.m16878E(uri3)) {
            uri2 = uri3;
        }
        payloadType2.setTestingOverrideUrl(uri2);
        Event.setTestingOverrideUrl(c9926j.f50608l);
        Smartlink.setTestingOverrideUrl(c9926j.f50602f);
    }

    public static PayloadType valueOf(String str) {
        return (PayloadType) Enum.valueOf(PayloadType.class, str);
    }

    public static PayloadType[] values() {
        return (PayloadType[]) f16495l.clone();
    }

    public final String getAction() {
        return this.f16497b;
    }

    public final String getKey() {
        return this.f16496a;
    }

    public final synchronized int getRotationUrlDate() {
        return this.f16504i;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final synchronized int getRotationUrlIndex() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f16505j;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final synchronized Uri getUrl() {
        return getUrl("");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final synchronized Uri getUrl(String str) {
        Map<String, Uri> map;
        if (C8656b.m16878E(this.f16501f)) {
            return this.f16501f;
        }
        InterfaceC5405b interfaceC5405b = this.f16500e;
        if (interfaceC5405b != null) {
            Uri uriM9311a = m9311a(interfaceC5405b);
            if (C8656b.m16878E(uriM9311a)) {
                return uriM9311a;
            }
        }
        if (!C8573r0.m16662A0(str) && (map = this.f16503h) != null && map.containsKey(str)) {
            Uri uri = this.f16503h.get(str);
            if (C8656b.m16878E(uri)) {
                return uri;
            }
        }
        if (C8656b.m16878E(this.f16502g)) {
            return this.f16502g;
        }
        InterfaceC5405b interfaceC5405b2 = this.f16499d;
        if (interfaceC5405b2 != null) {
            Uri uriM9311a2 = m9311a(interfaceC5405b2);
            if (C8656b.m16878E(uriM9311a2)) {
                return uriM9311a2;
            }
        }
        return this.f16498c;
    }

    public final synchronized void incrementRotationUrlIndex() {
        this.f16505j++;
        m9311a(m9313b());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final synchronized boolean isRotationUrlRotated() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f16506k;
    }

    public final synchronized void loadRotationUrl(int i10, int i11, boolean z10) {
        try {
            this.f16504i = i10;
            this.f16505j = i11;
            this.f16506k = z10;
            Date date = new Date(System.currentTimeMillis());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Integer num = 0;
            Integer numM16883J = C8656b.m16883J(simpleDateFormat.format(date));
            if (numM16883J != null) {
                num = numM16883J;
            }
            InterfaceC5407d interfaceC5407dMo11565b = m9313b().mo11565b(num.intValue());
            if (interfaceC5407dMo11565b == null) {
                this.f16504i = 0;
                this.f16505j = 0;
                this.f16506k = false;
                return;
            }
            int iMo11566a = interfaceC5407dMo11565b.mo11566a();
            if (i10 != iMo11566a) {
                this.f16504i = iMo11566a;
                this.f16505j = 0;
                this.f16506k = false;
            }
            if (this.f16505j >= interfaceC5407dMo11565b.mo11567b().length) {
                this.f16505j = 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final synchronized void reset() {
        this.f16500e = null;
        this.f16501f = null;
        this.f16502g = null;
        this.f16503h = null;
        this.f16504i = 0;
        this.f16505j = 0;
        this.f16506k = false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final synchronized void setInitEventNameOverrideUrl(String str, Uri uri) {
        try {
            if (this.f16503h == null) {
                this.f16503h = new HashMap();
            }
            if (uri == null) {
                this.f16503h.remove(str);
            } else {
                this.f16503h.put(str, uri);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final synchronized void setInitOverrideUrl(Uri uri) {
        try {
            this.f16502g = uri;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final synchronized void setTestingOverrideRotationUrl(InterfaceC5405b interfaceC5405b) {
        try {
            this.f16500e = interfaceC5405b;
        } finally {
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final synchronized void setTestingOverrideUrl(Uri uri) {
        this.f16501f = uri;
    }
}
