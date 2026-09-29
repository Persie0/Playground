package p298oe;

import android.support.v4.media.session.C0166e;
import android.util.Base64;
import android.util.JsonReader;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import ge.C5789m;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import ne.AbstractC7743b0;
import ne.C7740a;
import ne.C7742b;
import ne.C7744c;
import ne.C7745c0;
import ne.C7748e;
import ne.C7749f;
import ne.C7751h;
import ne.C7752i;
import ne.C7754k;
import ne.C7755l;
import ne.C7756m;
import ne.C7757n;
import ne.C7759p;
import ne.C7760q;
import ne.C7762s;
import ne.C7763t;
import ne.C7764u;
import ne.C7765v;
import ne.C7766w;
import p150h9.C5931p;
import p291o7.C8002l;
import p483xe.C10181d;
import p483xe.C10182e;

/* JADX INFO: renamed from: oe.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8038a {

    /* JADX INFO: renamed from: a */
    public static final C10181d f43690a;

    /* JADX INFO: renamed from: oe.a$a */
    public interface a<T> {
        /* JADX INFO: renamed from: c */
        T mo12175c(JsonReader jsonReader) throws IOException;
    }

    static {
        C10182e c10182e = new C10182e();
        C7740a.f42376a.m15335a(c10182e);
        c10182e.f51506d = true;
        f43690a = new C10181d(c10182e);
    }

    /* JADX INFO: renamed from: a */
    public static C7762s m15914a(JsonReader jsonReader) throws IOException {
        C7762s.a aVar = new C7762s.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    aVar.f42650d = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    aVar.f42648b = strNextString;
                    break;
                    break;
                case "pc":
                    aVar.f42647a = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    aVar.f42649c = jsonReader.nextString();
                    break;
                case "importance":
                    aVar.f42651e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.m15469a();
    }

    /* JADX INFO: renamed from: b */
    public static C7748e m15915b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String strConcat = strNextString == null ? " key" : "";
        if (strNextString2 == null) {
            strConcat = strConcat.concat(" value");
        }
        if (strConcat.isEmpty()) {
            return new C7748e(strNextString, strNextString2);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static C7744c m15916c(JsonReader jsonReader) throws IOException {
        C7744c.a aVar = new C7744c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    aVar.f42540i = m15917d(jsonReader, new C5931p(21));
                    break;
                case "pid":
                    aVar.f42532a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "pss":
                    aVar.f42536e = Long.valueOf(jsonReader.nextLong());
                    break;
                case "rss":
                    aVar.f42537f = Long.valueOf(jsonReader.nextLong());
                    break;
                case "timestamp":
                    aVar.f42538g = Long.valueOf(jsonReader.nextLong());
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    aVar.f42533b = strNextString;
                    break;
                    break;
                case "reasonCode":
                    aVar.f42534c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "traceFile":
                    aVar.f42539h = jsonReader.nextString();
                    break;
                case "importance":
                    aVar.f42535d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.m15445a();
    }

    /* JADX INFO: renamed from: d */
    public static <T> C7745c0<T> m15917d(JsonReader jsonReader, a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo12175c(jsonReader));
        }
        jsonReader.endArray();
        return new C7745c0<>(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:119:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:142:0x021c  */
    /* JADX WARN: Code duplicated, block: B:226:0x036a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:83:0x0127  */
    /* JADX INFO: renamed from: e */
    public static C7755l m15918e(JsonReader jsonReader) throws IOException {
        byte b10;
        String str;
        C7755l.a aVar = new C7755l.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    b10 = 0;
                    break;
                case "app":
                    b10 = 1;
                    break;
                case "log":
                    b10 = 2;
                    break;
                case "type":
                    b10 = 3;
                    break;
                case "timestamp":
                    b10 = 4;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            String str2 = "";
            switch (b10) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    C7763t.a aVar2 = new C7763t.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                aVar2.f42658a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                aVar2.f42659b = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "orientation":
                                aVar2.f42661d = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "diskUsed":
                                aVar2.f42663f = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "ramUsed":
                                aVar2.f42662e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "proximityOn":
                                aVar2.f42660c = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    aVar.f42606d = aVar2.m15470a();
                    break;
                case 1:
                    jsonReader.beginObject();
                    Integer numValueOf = null;
                    C7757n c7757n = null;
                    C7745c0 c7745c0M15917d = null;
                    C7745c0 c7745c0 = null;
                    Boolean boolValueOf = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "background":
                                str = str2;
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                str2 = str;
                                break;
                            case "execution":
                                jsonReader.beginObject();
                                C7745c0 c7745c0M15917d2 = null;
                                C7759p c7759pM15919f = null;
                                C7744c c7744cM15916c = null;
                                C7760q c7760q = null;
                                C7745c0 c7745c0M15917d3 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "appExitInfo":
                                            c7744cM15916c = m15916c(jsonReader);
                                            break;
                                        case "threads":
                                            c7745c0M15917d2 = m15917d(jsonReader, new C8002l(24));
                                            str2 = str2;
                                            break;
                                        case "signal":
                                            jsonReader.beginObject();
                                            String strNextString = null;
                                            String strNextString2 = null;
                                            Long lValueOf = null;
                                            while (jsonReader.hasNext()) {
                                                String strNextName5 = jsonReader.nextName();
                                                strNextName5.getClass();
                                                switch (strNextName5) {
                                                    case "address":
                                                        lValueOf = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case "code":
                                                        strNextString2 = jsonReader.nextString();
                                                        if (strNextString2 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                        break;
                                                    case "name":
                                                        strNextString = jsonReader.nextString();
                                                        if (strNextString == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        break;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            String strM765k = strNextString == null ? " name" : str2;
                                            if (strNextString2 == null) {
                                                strM765k = strM765k.concat(" code");
                                            }
                                            if (lValueOf == null) {
                                                strM765k = C0166e.m765k(strM765k, " address");
                                            }
                                            if (!strM765k.isEmpty()) {
                                                throw new IllegalStateException("Missing required properties:".concat(strM765k));
                                            }
                                            c7760q = new C7760q(strNextString, strNextString2, lValueOf.longValue());
                                            str2 = str2;
                                            break;
                                            break;
                                        case "binaries":
                                            c7745c0M15917d3 = m15917d(jsonReader, new C5789m(22));
                                            break;
                                        case "exception":
                                            c7759pM15919f = m15919f(jsonReader);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                str = str2;
                                jsonReader.endObject();
                                String strConcat = c7760q == null ? " signal" : str;
                                if (c7745c0M15917d3 == null) {
                                    strConcat = strConcat.concat(" binaries");
                                }
                                if (!strConcat.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(strConcat));
                                }
                                c7757n = new C7757n(c7745c0M15917d2, c7759pM15919f, c7744cM15916c, c7760q, c7745c0M15917d3);
                                str2 = str;
                                break;
                                break;
                            case "internalKeys":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(m15915b(jsonReader));
                                }
                                jsonReader.endArray();
                                c7745c0 = new C7745c0(arrayList);
                                break;
                            case "customAttributes":
                                c7745c0M15917d = m15917d(jsonReader, new C5789m(21));
                                break;
                            case "uiOrientation":
                                numValueOf = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    String str3 = str2;
                    jsonReader.endObject();
                    String strConcat2 = c7757n == null ? " execution" : str3;
                    if (numValueOf == null) {
                        strConcat2 = strConcat2.concat(" uiOrientation");
                    }
                    if (!strConcat2.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strConcat2));
                    }
                    aVar.f42605c = new C7756m(c7757n, c7745c0M15917d, c7745c0, boolValueOf, numValueOf.intValue());
                    break;
                    break;
                case 2:
                    jsonReader.beginObject();
                    String strNextString3 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName6 = jsonReader.nextName();
                        strNextName6.getClass();
                        if (strNextName6.equals("content")) {
                            strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                throw new NullPointerException("Null content");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    str2 = strNextString3 == null ? " content" : "";
                    if (!str2.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str2));
                    }
                    aVar.f42607e = new C7764u(strNextString3);
                    break;
                    break;
                case 3:
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null type");
                    }
                    aVar.f42604b = strNextString4;
                    break;
                    break;
                case 4:
                    aVar.f42603a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.m15466a();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public static C7759p m15919f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Integer numValueOf = null;
        String strNextString = null;
        String strNextString2 = null;
        C7745c0 c7745c0M15917d = null;
        C7759p c7759pM15919f = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    c7745c0M15917d = m15917d(jsonReader, new C5931p(22));
                    break;
                case "reason":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "type":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null type");
                    }
                    break;
                    break;
                case "causedBy":
                    c7759pM15919f = m15919f(jsonReader);
                    break;
                case "overflowCount":
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strM765k = strNextString == null ? " type" : "";
        if (c7745c0M15917d == null) {
            strM765k = strM765k.concat(" frames");
        }
        if (numValueOf == null) {
            strM765k = C0166e.m765k(strM765k, " overflowCount");
        }
        if (strM765k.isEmpty()) {
            return new C7759p(strNextString, strNextString2, c7745c0M15917d, c7759pM15919f, numValueOf.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strM765k));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:134:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:191:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:229:0x0352  */
    /* JADX WARN: Code duplicated, block: B:44:0x0091  */
    /* JADX WARN: Code duplicated, block: B:98:0x0150  */
    /* JADX INFO: renamed from: g */
    public static C7742b m15920g(JsonReader jsonReader) throws IOException {
        byte b10;
        Charset charset = AbstractC7743b0.f42522a;
        C7742b.a aVar = new C7742b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    b10 = 0;
                    break;
                case "sdkVersion":
                    b10 = 1;
                    break;
                case "appExitInfo":
                    b10 = 2;
                    break;
                case "buildVersion":
                    b10 = 3;
                    break;
                case "gmpAppId":
                    b10 = 4;
                    break;
                case "installationUuid":
                    b10 = 5;
                    break;
                case "platform":
                    b10 = 6;
                    break;
                case "displayVersion":
                    b10 = 7;
                    break;
                case "session":
                    b10 = 8;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    jsonReader.beginObject();
                    C7745c0 c7745c0M15917d = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            c7745c0M15917d = m15917d(jsonReader, new C8002l(23));
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str = c7745c0M15917d == null ? " files" : "";
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    aVar.f42520h = new C7749f(c7745c0M15917d, strNextString);
                    break;
                    break;
                case 1:
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    aVar.f42513a = strNextString2;
                    break;
                    break;
                case 2:
                    aVar.f42521i = m15916c(jsonReader);
                    break;
                case 3:
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    aVar.f42517e = strNextString3;
                    break;
                    break;
                case 4:
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    aVar.f42514b = strNextString4;
                    break;
                    break;
                case 5:
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    aVar.f42516d = strNextString5;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    aVar.f42515c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    aVar.f42518f = strNextString6;
                    break;
                    break;
                case 8:
                    C7751h.a aVar2 = new C7751h.a();
                    aVar2.f42566e = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                aVar2.f42564c = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "identifier":
                                aVar2.f42563b = new String(Base64.decode(jsonReader.nextString(), 2), AbstractC7743b0.f42522a);
                                break;
                            case "endedAt":
                                aVar2.f42565d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                C7754k.a aVar3 = new C7754k.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            aVar3.f42594f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            aVar3.f42596h = strNextString7;
                                            break;
                                            break;
                                        case "ram":
                                            aVar3.f42592d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "arch":
                                            aVar3.f42589a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "diskSpace":
                                            aVar3.f42593e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "cores":
                                            aVar3.f42591c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            aVar3.f42590b = strNextString8;
                                            break;
                                            break;
                                        case "state":
                                            aVar3.f42595g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            aVar3.f42597i = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar2.f42570i = aVar3.m15465a();
                                break;
                            case "events":
                                aVar2.f42571j = m15917d(jsonReader, new C5931p(20));
                                break;
                            case "os":
                                C7765v.a aVar4 = new C7765v.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            aVar4.f42671c = strNextString10;
                                            break;
                                            break;
                                        case "jailbroken":
                                            aVar4.f42672d = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "version":
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            aVar4.f42670b = strNextString11;
                                            break;
                                            break;
                                        case "platform":
                                            aVar4.f42669a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar2.f42569h = aVar4.m15471a();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6) {
                                        case "identifier":
                                            strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                            break;
                                        case "developmentPlatform":
                                            strNextString16 = jsonReader.nextString();
                                            break;
                                        case "developmentPlatformVersion":
                                            strNextString17 = jsonReader.nextString();
                                            break;
                                        case "version":
                                            strNextString13 = jsonReader.nextString();
                                            if (strNextString13 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                            break;
                                        case "installationUuid":
                                            strNextString15 = jsonReader.nextString();
                                            break;
                                        case "displayVersion":
                                            strNextString14 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                String strConcat = strNextString12 == null ? " identifier" : "";
                                if (strNextString13 == null) {
                                    strConcat = strConcat.concat(" version");
                                }
                                if (!strConcat.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(strConcat));
                                }
                                aVar2.f42567f = new C7752i(strNextString12, strNextString13, strNextString14, strNextString15, strNextString16, strNextString17);
                                break;
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName7 = jsonReader.nextName();
                                    strNextName7.getClass();
                                    if (strNextName7.equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        if (strNextString18 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                String str2 = strNextString18 == null ? " identifier" : "";
                                if (!str2.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str2));
                                }
                                aVar2.f42568g = new C7766w(strNextString18);
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                aVar2.f42562a = strNextString19;
                                break;
                                break;
                            case "crashed":
                                aVar2.f42566e = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case "generatorType":
                                aVar2.f42572k = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    aVar.f42519g = aVar2.m15464a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.m15348a();
    }

    /* JADX INFO: renamed from: h */
    public static C7742b m15921h(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                C7742b c7742bM15920g = m15920g(jsonReader);
                jsonReader.close();
                return c7742bM15920g;
            } catch (Throwable th2) {
                try {
                    jsonReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }
}
