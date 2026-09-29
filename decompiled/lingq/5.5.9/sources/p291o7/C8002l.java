package p291o7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.util.Base64;
import android.util.JsonReader;
import cf.InterfaceC2004a;
import cf.InterfaceC2005b;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.cloudbridge.C2294a;
import com.facebook.appevents.cloudbridge.SettingsAPIFields;
import com.facebook.internal.FeatureManager;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.AbstractC2535x;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.C2463n;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.C2504t;
import com.google.android.exoplayer2.InterfaceC2409f;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.google.firebase.components.ComponentRegistrar;
import dm.C5207g;
import ga.C5735r;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C6752c;
import mo.C7661i;
import ne.C7745c0;
import ne.C7750g;
import ne.C7761r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0050a;
import p067d8.C5078r;
import p067d8.C5086z;
import p068d9.C5104r;
import p118fe.InterfaceC5515g;
import p134g8.C5714a;
import p134g8.C5716c;
import p150h9.C5931p;
import p173i8.C6205a;
import p200jf.C6474f;
import p291o7.C8004n;
import p291o7.C8010t;
import p298oe.C8038a;
import p349qo.C8656b;
import p358r7.C8744b;
import p382s7.C8970c;
import p395t8.C9220b;
import p402u0.C9362e;
import p476x7.C10105d;
import p479xa.C10129a;
import p479xa.C10131b;
import p479xa.C10141j;
import p479xa.C10144m;
import p483xe.C10181d;
import p505ya.C10320b;
import ua.C9496e;
import ua.C9507p;

/* JADX INFO: renamed from: o7.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8002l implements FeatureManager.InterfaceC2304a, C5104r.a, InterfaceC2409f.a, C10144m.a, C10144m.b, TextInputLayout.InterfaceC3090f, C6474f.a, InterfaceC5515g, InterfaceC2004a.a, C8038a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43547a;

    public /* synthetic */ C8002l(int i10) {
        this.f43547a = i10;
    }

    @Override // p118fe.InterfaceC5515g
    /* JADX INFO: renamed from: a */
    public final List mo11755a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // p068d9.C5104r.a
    public final Object apply(Object obj) {
        C9220b c9220b = C5104r.f33055f;
        return (List) C5104r.m10867Q(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new C5931p(7));
    }

    @Override // p479xa.C10144m.b
    /* JADX INFO: renamed from: b */
    public final void mo12344b(Object obj, C10141j c10141j) {
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p298oe.C8038a.a
    /* JADX INFO: renamed from: c */
    public final Object mo12175c(JsonReader jsonReader) throws IOException {
        String strM765k;
        String strNextString = null;
        switch (this.f43547a) {
            case 23:
                C10181d c10181d = C8038a.f43690a;
                jsonReader.beginObject();
                byte[] bArrDecode = null;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    if (strNextName.equals("filename")) {
                        strNextString = jsonReader.nextString();
                        if (strNextString == null) {
                            throw new NullPointerException("Null filename");
                        }
                    } else if (strNextName.equals("contents")) {
                        bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                        if (bArrDecode == null) {
                            throw new NullPointerException("Null contents");
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                strM765k = strNextString == null ? " filename" : "";
                if (bArrDecode == null) {
                    strM765k = strM765k.concat(" contents");
                }
                if (strM765k.isEmpty()) {
                    return new C7750g(strNextString, bArrDecode);
                }
                throw new IllegalStateException("Missing required properties:".concat(strM765k));
            default:
                C10181d c10181d2 = C8038a.f43690a;
                jsonReader.beginObject();
                Integer numValueOf = null;
                C7745c0 c7745c0M15917d = null;
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    strNextName2.hashCode();
                    switch (strNextName2) {
                        case "frames":
                            c7745c0M15917d = C8038a.m15917d(jsonReader, new C9362e(26));
                            break;
                        case "name":
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                throw new NullPointerException("Null name");
                            }
                            break;
                            break;
                        case "importance":
                            numValueOf = Integer.valueOf(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                strM765k = strNextString == null ? " name" : "";
                if (numValueOf == null) {
                    strM765k = strM765k.concat(" importance");
                }
                if (c7745c0M15917d == null) {
                    strM765k = C0166e.m765k(strM765k, " frames");
                }
                if (strM765k.isEmpty()) {
                    return new C7761r(strNextString, numValueOf.intValue(), c7745c0M15917d);
                }
                throw new IllegalStateException("Missing required properties:".concat(strM765k));
        }
    }

    @Override // p200jf.C6474f.a
    /* JADX INFO: renamed from: e */
    public final String mo12176e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    @Override // cf.InterfaceC2004a.a
    /* JADX INFO: renamed from: f */
    public final void mo5937f(InterfaceC2005b interfaceC2005b) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2409f.a
    /* JADX INFO: renamed from: g */
    public final InterfaceC2409f mo7014g(Bundle bundle) {
        switch (this.f43547a) {
            case 9:
                String str = C2463n.f12756e;
                C10129a.m18990b(bundle.getInt(AbstractC2535x.f13785a, -1) == 0);
                return bundle.getBoolean(C2463n.f12756e, false) ? new C2463n(bundle.getBoolean(C2463n.f12757f, false)) : new C2463n();
            case 10:
                C2466p.h.a aVar = new C2466p.h.a();
                aVar.f12854a = (Uri) bundle.getParcelable(C2466p.h.f12848d);
                aVar.f12855b = bundle.getString(C2466p.h.f12849e);
                aVar.f12856c = bundle.getBundle(C2466p.h.f12850f);
                return new C2466p.h(aVar);
            case 11:
                String str2 = C2504t.f13470d;
                C10129a.m18990b(bundle.getInt(AbstractC2535x.f13785a, -1) == 1);
                float f3 = bundle.getFloat(C2504t.f13470d, -1.0f);
                return f3 == -1.0f ? new C2504t() : new C2504t(f3);
            case 12:
            case 14:
            default:
                return new C10320b(bundle.getInt(C10320b.f51891f, -1), bundle.getInt(C10320b.f51892g, -1), bundle.getInt(C10320b.f51893h, -1), bundle.getByteArray(C10320b.f51894i));
            case 13:
                Bundle bundle2 = bundle.getBundle(AbstractC2382c0.c.f12073P);
                C2466p c2466p = bundle2 != null ? (C2466p) C2466p.f12764H.mo7014g(bundle2) : C2466p.f12765g;
                long j10 = bundle.getLong(AbstractC2382c0.c.f12074Q, -9223372036854775807L);
                long j11 = bundle.getLong(AbstractC2382c0.c.f12075R, -9223372036854775807L);
                long j12 = bundle.getLong(AbstractC2382c0.c.f12076S, -9223372036854775807L);
                boolean z10 = bundle.getBoolean(AbstractC2382c0.c.f12077T, false);
                boolean z11 = bundle.getBoolean(AbstractC2382c0.c.f12078U, false);
                Bundle bundle3 = bundle.getBundle(AbstractC2382c0.c.f12079V);
                C2466p.e eVar = bundle3 != null ? (C2466p.e) C2466p.e.f12829l.mo7014g(bundle3) : null;
                boolean z12 = bundle.getBoolean(AbstractC2382c0.c.f12080W, false);
                long j13 = bundle.getLong(AbstractC2382c0.c.f12081X, 0L);
                long j14 = bundle.getLong(AbstractC2382c0.c.f12082Y, -9223372036854775807L);
                int i10 = bundle.getInt(AbstractC2382c0.c.f12083Z, 0);
                int i11 = bundle.getInt(AbstractC2382c0.c.f12084a0, 0);
                long j15 = bundle.getLong(AbstractC2382c0.c.f12085b0, 0L);
                AbstractC2382c0.c cVar = new AbstractC2382c0.c();
                cVar.m6920b(AbstractC2382c0.c.f12071N, c2466p, null, j10, j11, j12, z10, z11, eVar, j13, j14, i10, i11, j15);
                cVar.f12102l = z12;
                return cVar;
            case 15:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C5735r.f34797f);
                return new C5735r(bundle.getString(C5735r.f34798g, ""), (C2416m[]) (parcelableArrayList == null ? ImmutableList.m9062Y() : C10131b.m19007a(C2416m.f12427K0, parcelableArrayList)).toArray(new C2416m[0]));
            case 16:
                int i12 = bundle.getInt(C9496e.d.f48874d, -1);
                int[] intArray = bundle.getIntArray(C9496e.d.f48875e);
                int i13 = bundle.getInt(C9496e.d.f48876f, -1);
                C10129a.m18990b(i12 >= 0 && i13 >= 0);
                intArray.getClass();
                return new C9496e.d(i12, i13, intArray);
            case 17:
                Bundle bundle4 = bundle.getBundle(C9507p.f48925c);
                bundle4.getClass();
                C5735r c5735r = (C5735r) C5735r.f34799h.mo7014g(bundle4);
                int[] intArray2 = bundle.getIntArray(C9507p.f48926d);
                intArray2.getClass();
                return new C9507p(c5735r, Ints.m9141k0(intArray2));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.facebook.internal.FeatureManager.InterfaceC2304a
    /* JADX INFO: renamed from: h */
    public final void mo6668h(boolean z10) {
        switch (this.f43547a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                if (z10) {
                    C8004n.f43564o = true;
                }
                return;
            case 2:
                if (z10) {
                    C0050a c0050a = C0050a.f60a;
                    if (C6205a.m12742b(C0050a.class)) {
                        return;
                    }
                    try {
                        C0050a.f61b = true;
                        C0050a.f60a.m207b();
                        return;
                    } catch (Throwable th2) {
                        C6205a.m12741a(C0050a.class, th2);
                    }
                }
                return;
            case 3:
                if (z10) {
                    String str = C8744b.f46370b;
                    try {
                        GraphRequest graphRequest = new GraphRequest(null, C5207g.m11116k("/cloudbridge_settings", C8004n.m15872b()), null, HttpMethod.GET, new GraphRequest.InterfaceC2278b() { // from class: r7.a
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // com.facebook.GraphRequest.InterfaceC2278b
                            /* JADX INFO: renamed from: a */
                            public final void mo6614a(C8010t c8010t) {
                                C8744b.f46369a.getClass();
                                String str2 = C8744b.f46370b;
                                linkedHashMap = null;
                                linkedHashMap = null;
                                linkedHashMap = null;
                                linkedHashMap = null;
                                linkedHashMap = null;
                                LinkedHashMap linkedHashMap = null;
                                boolean zBooleanValue = false;
                                FacebookRequestError facebookRequestError = c8010t.f43588c;
                                if (facebookRequestError != null) {
                                    C5078r.a aVar = C5078r.f32986e;
                                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                                    if (str2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    aVar.m10781c(loggingBehavior, str2, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", facebookRequestError.toString(), String.valueOf(facebookRequestError.f11446i));
                                    if (!C6205a.m12742b(C8744b.class)) {
                                        try {
                                            SharedPreferences sharedPreferences = C8004n.m15871a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
                                            if (sharedPreferences != null) {
                                                SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
                                                String string = sharedPreferences.getString(settingsAPIFields.getRawValue(), null);
                                                SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
                                                String string2 = sharedPreferences.getString(settingsAPIFields2.getRawValue(), null);
                                                SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
                                                String string3 = sharedPreferences.getString(settingsAPIFields3.getRawValue(), null);
                                                if ((string == null || C7661i.m15250P2(string)) == false) {
                                                    if ((string2 == null || C7661i.m15250P2(string2)) == false) {
                                                        if ((string3 == null || C7661i.m15250P2(string3)) == false) {
                                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                            linkedHashMap2.put(settingsAPIFields2.getRawValue(), string2);
                                                            linkedHashMap2.put(settingsAPIFields.getRawValue(), string);
                                                            linkedHashMap2.put(settingsAPIFields3.getRawValue(), string3);
                                                            aVar.m10781c(loggingBehavior, str2, " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                                                            linkedHashMap = linkedHashMap2;
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            C6205a.m12741a(C8744b.class, th3);
                                        }
                                    }
                                    if (linkedHashMap != null) {
                                        URL url = new URL(String.valueOf(linkedHashMap.get(SettingsAPIFields.URL.getRawValue())));
                                        HashSet<Integer> hashSet = C2294a.f11502a;
                                        C2294a.m6645b(String.valueOf(linkedHashMap.get(SettingsAPIFields.DATASETID.getRawValue())), url.getProtocol() + "://" + ((Object) url.getHost()), String.valueOf(linkedHashMap.get(SettingsAPIFields.ACCESSKEY.getRawValue())));
                                        C8744b.f46371c = true;
                                        return;
                                    }
                                    return;
                                }
                                C5078r.a aVar2 = C5078r.f32986e;
                                LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
                                if (str2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                aVar2.m10781c(loggingBehavior2, str2, " \n\nGraph Response Received: \n================\n%s\n\n ", c8010t);
                                try {
                                    C5086z c5086z = C5086z.f33015a;
                                    JSONObject jSONObject = c8010t.f43587b;
                                    Object obj = jSONObject != null ? jSONObject.get("data") : null;
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                                    }
                                    HashMap mapM10823h = C5086z.m10823h(new JSONObject((String) C6752c.m13425S(C5086z.m10822g((JSONArray) obj))));
                                    String str3 = (String) mapM10823h.get(SettingsAPIFields.URL.getRawValue());
                                    String str4 = (String) mapM10823h.get(SettingsAPIFields.DATASETID.getRawValue());
                                    String str5 = (String) mapM10823h.get(SettingsAPIFields.ACCESSKEY.getRawValue());
                                    if (str3 == null || str4 == null || str5 == null) {
                                        aVar2.m10780b(loggingBehavior2, str2, "CloudBridge Settings API response doesn't have valid data");
                                        return;
                                    }
                                    try {
                                        C2294a.m6645b(str4, str3, str5);
                                        C8744b.m16982a(mapM10823h);
                                        SettingsAPIFields settingsAPIFields4 = SettingsAPIFields.ENABLED;
                                        if (mapM10823h.get(settingsAPIFields4.getRawValue()) != null) {
                                            Object obj2 = mapM10823h.get(settingsAPIFields4.getRawValue());
                                            if (obj2 == null) {
                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                            }
                                            zBooleanValue = ((Boolean) obj2).booleanValue();
                                        }
                                        C8744b.f46371c = zBooleanValue;
                                    } catch (MalformedURLException e10) {
                                        C5078r.f32986e.m10781c(LoggingBehavior.APP_EVENTS, str2, "CloudBridge Settings API response doesn't have valid url\n %s ", C8656b.m16894U(e10));
                                    }
                                } catch (NullPointerException e11) {
                                    C5078r.f32986e.m10781c(LoggingBehavior.APP_EVENTS, str2, "CloudBridge Settings API response is not a valid json: \n%s ", C8656b.m16894U(e11));
                                } catch (JSONException e12) {
                                    C5078r.f32986e.m10781c(LoggingBehavior.APP_EVENTS, str2, "CloudBridge Settings API response is not a valid json: \n%s ", C8656b.m16894U(e12));
                                }
                            }
                        }, 32);
                        C5078r.a aVar = C5078r.f32986e;
                        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                        if (str == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        aVar.m10781c(loggingBehavior, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", graphRequest);
                        graphRequest.m6607d();
                        return;
                    } catch (JSONException e10) {
                        C5078r.a aVar2 = C5078r.f32986e;
                        LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
                        if (str == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        aVar2.m10781c(loggingBehavior2, str, " \n\nGraph Request Exception: \n=============\n%s\n\n ", C8656b.m16894U(e10));
                        return;
                    }
                }
                return;
            case 4:
                C10105d c10105d = C10105d.f51249a;
                if (z10) {
                    C8970c c8970c = C8970c.f46998a;
                    if (C6205a.m12742b(C8970c.class)) {
                        return;
                    }
                    try {
                        C8970c.f47003f.set(true);
                        return;
                    } catch (Throwable th3) {
                        C6205a.m12741a(C8970c.class, th3);
                        return;
                    }
                }
                C8970c c8970c2 = C8970c.f46998a;
                if (C6205a.m12742b(C8970c.class)) {
                    return;
                }
                try {
                    C8970c.f47003f.set(false);
                    return;
                } catch (Throwable th4) {
                    C6205a.m12741a(C8970c.class, th4);
                    return;
                }
        }
        if (z10) {
            AtomicBoolean atomicBoolean = C5716c.f34732a;
            synchronized (C5716c.class) {
                try {
                    if (C6205a.m12742b(C5716c.class)) {
                        return;
                    }
                    try {
                        if (C5716c.f34732a.getAndSet(true)) {
                            return;
                        }
                        C8004n c8004n = C8004n.f43550a;
                        if (C7993c0.m15849b()) {
                            C5716c.m12074a();
                        }
                        int i10 = C5714a.f34727a;
                        if (!C6205a.m12742b(C5714a.class)) {
                            try {
                                C5714a.f34728b.scheduleAtFixedRate(C5714a.f34730d, 0L, 500, TimeUnit.MILLISECONDS);
                            } catch (Throwable th5) {
                                C6205a.m12741a(C5714a.class, th5);
                            }
                        }
                    } catch (Throwable th6) {
                        C6205a.m12741a(C5716c.class, th6);
                    }
                } catch (Throwable th7) {
                    throw th7;
                }
            }
        }
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        ((InterfaceC2532v.c) obj).mo7410f0();
    }
}
