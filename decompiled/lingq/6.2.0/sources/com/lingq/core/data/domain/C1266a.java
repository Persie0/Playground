package com.lingq.core.data.domain;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import p000.AbstractC3122is;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.a84;
import p000.cl9;
import p000.dr6;
import p000.fa4;
import p000.h84;
import p000.i84;
import p000.i88;
import p000.jj5;
import p000.l70;
import p000.l88;
import p000.m88;
import p000.pb1;
import p000.vi3;
import p000.vk9;
import p000.vz1;
import p000.wq1;
import p000.xv5;
import p000.yu0;
import retrofit2.HttpException;

/* JADX INFO: renamed from: com.lingq.core.data.domain.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1266a {

    /* JADX INFO: renamed from: a */
    public static final C1266a f14422a = new C1266a();

    /* JADX INFO: renamed from: b */
    public static final dr6 f14423b = new dr6();

    /* JADX INFO: renamed from: c */
    public static final xv5 f14424c;

    static {
        Regex regex = xv5.f68845e;
        f14424c = AbstractC3122is.m14103q("application/json; charset=utf-8");
    }

    /* JADX INFO: renamed from: a */
    public static int m7053a(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject == null || jSONObject.has("aAppend") || (jSONArrayOptJSONArray = jSONObject.optJSONArray("segs")) == null) {
            return 0;
        }
        Iterator it = l70.m15922M(0, jSONArrayOptJSONArray.length()).iterator();
        int i = 0;
        while (((h84) it).f41941c) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(((a84) it).nextInt());
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("utf8", "") : null;
            String str = strOptString != null ? strOptString : "";
            int i2 = 0;
            for (int i3 = 0; i3 < str.length(); i3++) {
                char cCharAt = str.charAt(i3);
                if (cCharAt == '.' || cCharAt == '!' || cCharAt == '?') {
                    i2++;
                }
            }
            i += i2;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static String m7054b(String str, YouTubeSubtitleFormat youTubeSubtitleFormat, boolean z) {
        String strM4839V;
        if (cl9.m4842Y(str, "http", false)) {
            strM4839V = AbstractC3393o1.m17735j(str, "&fmt=", youTubeSubtitleFormat.getFormat());
        } else {
            strM4839V = z ? cl9.m4839V(cl9.m4839V("https://www.youtube.com".concat(str), "&fmt=srv3", ""), "fmt=srv3&", "") : wq1.m24119o("https://www.youtube.com", str, "&fmt=", youTubeSubtitleFormat.getFormat());
        }
        if (z) {
            strM4839V = cl9.m4839V(cl9.m4839V(strM4839V, "&fmt=srv3", ""), "fmt=srv3&", "");
        }
        try {
            URL url = new URL(strM4839V);
            Charset charset = yu0.f70463a;
            InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
            try {
                inputStreamOpenStream.getClass();
                byte[] bArrM19026N = pb1.m19026N(inputStreamOpenStream);
                inputStreamOpenStream.close();
                return new String(bArrM19026N, charset);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3584sr.m21646y(inputStreamOpenStream, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m7055c(JSONArray jSONArray, List list, boolean z) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        String strOptString;
        i84 i84VarM15922M = l70.m15922M(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = i84VarM15922M.iterator();
        while (((h84) it).f41941c) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(((a84) it).nextInt());
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(jSONObjectOptJSONObject);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!fa4.m11650l(((JSONObject) obj2).optString("kind"), "asr")) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        do {
            obj = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!list.contains(((JSONObject) next).optString("languageCode")));
        JSONObject jSONObject = (JSONObject) next;
        if (jSONObject != null) {
            return jSONObject;
        }
        Iterator it3 = arrayList2.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            strOptString = ((JSONObject) next2).optString("languageCode");
            strOptString.getClass();
        } while (!list.contains(vk9.m23371G0(strOptString, "-")));
        JSONObject jSONObject2 = (JSONObject) next2;
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        if (z) {
            return null;
        }
        Iterator it4 = arrayList.iterator();
        do {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
        } while (!list.contains(((JSONObject) next3).optString("languageCode")));
        JSONObject jSONObject3 = (JSONObject) next3;
        if (jSONObject3 != null) {
            return jSONObject3;
        }
        for (Object obj3 : arrayList) {
            String strOptString2 = ((JSONObject) obj3).optString("languageCode");
            strOptString2.getClass();
            if (list.contains(vk9.m23371G0(strOptString2, "-"))) {
                obj = obj3;
                break;
            }
        }
        return (JSONObject) obj;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7 A[PHI: r10 r12
      0x00b7: PHI (r10v4 java.lang.String) = (r10v1 java.lang.String), (r10v6 java.lang.String) binds: [B:28:0x0083, B:37:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r12v3 java.lang.String) = (r12v1 java.lang.String), (r12v6 java.lang.String) binds: [B:28:0x0083, B:37:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r13 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        if (r13 == r1) goto L40;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m7056d(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        YouTubeFetcher$getYouTubeData$1 youTubeFetcher$getYouTubeData$1;
        String str4;
        String str5;
        String str6;
        String str7;
        YouTubeSubtitleFormat youTubeSubtitleFormat;
        if (continuationImpl instanceof YouTubeFetcher$getYouTubeData$1) {
            youTubeFetcher$getYouTubeData$1 = (YouTubeFetcher$getYouTubeData$1) continuationImpl;
            int i = youTubeFetcher$getYouTubeData$1.f14413f;
            if ((i & Integer.MIN_VALUE) != 0) {
                youTubeFetcher$getYouTubeData$1.f14413f = i - Integer.MIN_VALUE;
            } else {
                youTubeFetcher$getYouTubeData$1 = new YouTubeFetcher$getYouTubeData$1(this, continuationImpl);
            }
        } else {
            youTubeFetcher$getYouTubeData$1 = new YouTubeFetcher$getYouTubeData$1(this, continuationImpl);
        }
        Object objM7057e = youTubeFetcher$getYouTubeData$1.f14411d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = youTubeFetcher$getYouTubeData$1.f14413f;
        if (i2 != 0) {
            if (i2 == 1) {
                str3 = youTubeFetcher$getYouTubeData$1.f14410c;
                str2 = youTubeFetcher$getYouTubeData$1.f14409b;
                str = youTubeFetcher$getYouTubeData$1.f14408a;
                AbstractC3193b.m15359b(objM7057e);
            } else if (i2 == 2) {
                str5 = youTubeFetcher$getYouTubeData$1.f14410c;
                str4 = youTubeFetcher$getYouTubeData$1.f14408a;
                AbstractC3193b.m15359b(objM7057e);
                Triple triple = (Triple) objM7057e;
                str6 = (String) triple.f47633a;
                str7 = (String) triple.f47634b;
                youTubeSubtitleFormat = (YouTubeSubtitleFormat) triple.f47635c;
                if (!vk9.m23391n0(str6)) {
                    return new Triple(str6, str7, youTubeSubtitleFormat);
                }
                str3 = str5;
                str = str4;
                vi3 youTubeFetcher$getYouTubeData$4 = new YouTubeFetcher$getYouTubeData$4(str, null);
                youTubeFetcher$getYouTubeData$1.f14408a = null;
                youTubeFetcher$getYouTubeData$1.f14409b = null;
                youTubeFetcher$getYouTubeData$1.f14410c = null;
                youTubeFetcher$getYouTubeData$1.f14413f = 3;
                objM7057e = m7057e(str3, false, youTubeFetcher$getYouTubeData$4, youTubeFetcher$getYouTubeData$1);
            } else {
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM7057e);
            }
            Triple triple2 = (Triple) objM7057e;
            String str8 = (String) triple2.f47633a;
            String str9 = (String) triple2.f47634b;
            YouTubeSubtitleFormat youTubeSubtitleFormat2 = (YouTubeSubtitleFormat) triple2.f47635c;
            if (vk9.m23391n0(str8)) {
                return null;
            }
            return new Triple(str8, str9, youTubeSubtitleFormat2);
        }
        AbstractC3193b.m15359b(objM7057e);
        if (!vk9.m23391n0(str2)) {
            vi3 youTubeFetcher$getYouTubeData$2 = new YouTubeFetcher$getYouTubeData$2(str2, null);
            youTubeFetcher$getYouTubeData$1.f14408a = str;
            youTubeFetcher$getYouTubeData$1.f14409b = str2;
            youTubeFetcher$getYouTubeData$1.f14410c = str3;
            youTubeFetcher$getYouTubeData$1.f14413f = 1;
            objM7057e = m7057e(str3, true, youTubeFetcher$getYouTubeData$2, youTubeFetcher$getYouTubeData$1);
        } else if (vk9.m23391n0(str2)) {
            vi3 youTubeFetcher$getYouTubeData$5 = new YouTubeFetcher$getYouTubeData$4(str, null);
            youTubeFetcher$getYouTubeData$1.f14408a = null;
            youTubeFetcher$getYouTubeData$1.f14409b = null;
            youTubeFetcher$getYouTubeData$1.f14410c = null;
            youTubeFetcher$getYouTubeData$1.f14413f = 3;
            objM7057e = m7057e(str3, false, youTubeFetcher$getYouTubeData$5, youTubeFetcher$getYouTubeData$1);
        } else {
            vi3 youTubeFetcher$getYouTubeData$3 = new YouTubeFetcher$getYouTubeData$3(str2, null);
            youTubeFetcher$getYouTubeData$1.f14408a = str;
            youTubeFetcher$getYouTubeData$1.f14409b = null;
            youTubeFetcher$getYouTubeData$1.f14410c = str3;
            youTubeFetcher$getYouTubeData$1.f14413f = 2;
            objM7057e = m7057e(str3, false, youTubeFetcher$getYouTubeData$3, youTubeFetcher$getYouTubeData$1);
            if (objM7057e != coroutineSingletons) {
                str4 = str;
                str5 = str3;
                Triple triple3 = (Triple) objM7057e;
                str6 = (String) triple3.f47633a;
                str7 = (String) triple3.f47634b;
                youTubeSubtitleFormat = (YouTubeSubtitleFormat) triple3.f47635c;
                if (!vk9.m23391n0(str6)) {
                    return new Triple(str6, str7, youTubeSubtitleFormat);
                }
                str3 = str5;
                str = str4;
                vi3 youTubeFetcher$getYouTubeData$6 = new YouTubeFetcher$getYouTubeData$4(str, null);
                youTubeFetcher$getYouTubeData$1.f14408a = null;
                youTubeFetcher$getYouTubeData$1.f14409b = null;
                youTubeFetcher$getYouTubeData$1.f14410c = null;
                youTubeFetcher$getYouTubeData$1.f14413f = 3;
                objM7057e = m7057e(str3, false, youTubeFetcher$getYouTubeData$6, youTubeFetcher$getYouTubeData$1);
            }
        }
        return coroutineSingletons;
        Triple triple4 = (Triple) objM7057e;
        String str10 = (String) triple4.f47633a;
        String str11 = (String) triple4.f47634b;
        YouTubeSubtitleFormat youTubeSubtitleFormat3 = (YouTubeSubtitleFormat) triple4.f47635c;
        if (!vk9.m23391n0(str10)) {
            return new Triple(str10, str11, youTubeSubtitleFormat3);
        }
        if (vk9.m23391n0(str2)) {
            vi3 youTubeFetcher$getYouTubeData$7 = new YouTubeFetcher$getYouTubeData$3(str2, null);
            youTubeFetcher$getYouTubeData$1.f14408a = str;
            youTubeFetcher$getYouTubeData$1.f14409b = null;
            youTubeFetcher$getYouTubeData$1.f14410c = str3;
            youTubeFetcher$getYouTubeData$1.f14413f = 2;
            objM7057e = m7057e(str3, false, youTubeFetcher$getYouTubeData$7, youTubeFetcher$getYouTubeData$1);
            if (objM7057e != coroutineSingletons) {
                str4 = str;
                str5 = str3;
                Triple triple5 = (Triple) objM7057e;
                str6 = (String) triple5.f47633a;
                str7 = (String) triple5.f47634b;
                youTubeSubtitleFormat = (YouTubeSubtitleFormat) triple5.f47635c;
                if (!vk9.m23391n0(str6)) {
                    return new Triple(str6, str7, youTubeSubtitleFormat);
                }
                str3 = str5;
                str = str4;
                vi3 youTubeFetcher$getYouTubeData$8 = new YouTubeFetcher$getYouTubeData$4(str, null);
                youTubeFetcher$getYouTubeData$1.f14408a = null;
                youTubeFetcher$getYouTubeData$1.f14409b = null;
                youTubeFetcher$getYouTubeData$1.f14410c = null;
                youTubeFetcher$getYouTubeData$1.f14413f = 3;
                objM7057e = m7057e(str3, false, youTubeFetcher$getYouTubeData$8, youTubeFetcher$getYouTubeData$1);
            }
        } else {
            vi3 youTubeFetcher$getYouTubeData$9 = new YouTubeFetcher$getYouTubeData$4(str, null);
            youTubeFetcher$getYouTubeData$1.f14408a = null;
            youTubeFetcher$getYouTubeData$1.f14409b = null;
            youTubeFetcher$getYouTubeData$1.f14410c = null;
            youTubeFetcher$getYouTubeData$1.f14413f = 3;
            objM7057e = m7057e(str3, false, youTubeFetcher$getYouTubeData$9, youTubeFetcher$getYouTubeData$1);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: e */
    public final Serializable m7057e(String str, boolean z, vi3 vi3Var, ContinuationImpl continuationImpl) throws Exception {
        YouTubeFetcher$getYouTubeData$5 youTubeFetcher$getYouTubeData$5;
        String str2;
        Object objInvoke;
        boolean z2;
        String strSubstring;
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        String strOptString2;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        if (continuationImpl instanceof YouTubeFetcher$getYouTubeData$5) {
            youTubeFetcher$getYouTubeData$5 = (YouTubeFetcher$getYouTubeData$5) continuationImpl;
            int i = youTubeFetcher$getYouTubeData$5.f14421e;
            if ((i & Integer.MIN_VALUE) != 0) {
                youTubeFetcher$getYouTubeData$5.f14421e = i - Integer.MIN_VALUE;
            } else {
                youTubeFetcher$getYouTubeData$5 = new YouTubeFetcher$getYouTubeData$5(this, continuationImpl);
            }
        } else {
            youTubeFetcher$getYouTubeData$5 = new YouTubeFetcher$getYouTubeData$5(this, continuationImpl);
        }
        Object obj = youTubeFetcher$getYouTubeData$5.f14419c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = youTubeFetcher$getYouTubeData$5.f14421e;
        JSONArray jSONArrayOptJSONArray2 = null;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                str2 = str;
                youTubeFetcher$getYouTubeData$5.f14417a = str2;
                youTubeFetcher$getYouTubeData$5.f14418b = z;
                youTubeFetcher$getYouTubeData$5.f14421e = 1;
                objInvoke = vi3Var.invoke(youTubeFetcher$getYouTubeData$5);
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z2 = z;
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = youTubeFetcher$getYouTubeData$5.f14418b;
                String str3 = youTubeFetcher$getYouTubeData$5.f14417a;
                AbstractC3193b.m15359b(obj);
                objInvoke = obj;
                str2 = str3;
            }
            String strSubstring2 = (String) objInvoke;
            strSubstring2.getClass();
            int iM23394q0 = vk9.m23394q0(strSubstring2, 6, "ytInitialPlayerResponse = ");
            if (iM23394q0 != -1) {
                strSubstring2 = strSubstring2.substring(26 + iM23394q0, strSubstring2.length());
            }
            int iM7053a = 0;
            int iM23388k0 = vk9.m23388k0(strSubstring2, '{', 0, 6);
            Integer numValueOf = Integer.valueOf(iM23388k0);
            if (iM23388k0 < 0) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                strSubstring = "";
                break;
            }
            int iIntValue = numValueOf.intValue();
            int i3 = 1;
            int i4 = iIntValue;
            while (true) {
                int i5 = i4 + 1;
                if (i5 >= strSubstring2.length()) {
                    strSubstring = "";
                    break;
                }
                char cCharAt = strSubstring2.charAt(i5);
                if (cCharAt == '{') {
                    i3++;
                } else if (cCharAt == '}') {
                    i3--;
                }
                if (i3 == 0) {
                    strSubstring = strSubstring2.substring(iIntValue, i4 + 2);
                    break;
                }
                i4 = i5;
            }
            JSONObject jSONObject = new JSONObject(strSubstring);
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("videoDetails");
            if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject4.optJSONObject("thumbnail")) != null) {
                jSONArrayOptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("thumbnails");
            }
            if (jSONArrayOptJSONArray2 == null || (jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(jSONArrayOptJSONArray2.length() - 1)) == null || (strOptString = jSONObjectOptJSONObject2.optString("url", "")) == null) {
                strOptString = "";
            }
            List listM23604J = (List) AbstractC3194a.m15365R(new Pair("hk", vz1.m23605K("hk", "zh-HK", "yue-HK", "yue-Hant", "yue")), new Pair("zh", vz1.m23605K("zh", "zh-Hans", "zh-CN")), new Pair("zh-t", vz1.m23605K("zh-t", "zh-TW", "zh-HK", "zh-Hant", "zt")), new Pair("hrv", vz1.m23605K("hr", "hrv")), new Pair("srp", vz1.m23605K("sr", "srp")), new Pair("tl", vz1.m23605K("fil", "tl")), new Pair("de", vz1.m23605K("deu", "de")), new Pair("he", vz1.m23605K("iw", "he"))).get(str2);
            if (listM23604J == null) {
                listM23604J = vz1.m23604J(str2);
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("captions");
            if (jSONObjectOptJSONObject5 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject5.optJSONObject("playerCaptionsTracklistRenderer")) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("captionTracks")) == null) {
                l88 l88Var = m88.f50759b;
                throw new HttpException(i88.m13718a(jj5.m14499i("No Captions")));
            }
            JSONObject jSONObjectM7055c = m7055c(jSONArrayOptJSONArray, listM23604J, false);
            if (jSONObjectM7055c == null) {
                l88 l88Var2 = m88.f50759b;
                throw new HttpException(i88.m13718a(jj5.m14499i("No matching captions")));
            }
            String strOptString3 = jSONObjectM7055c.optString("baseUrl");
            if (fa4.m11650l(jSONObjectM7055c.optString("kind"), "asr")) {
                strOptString3.getClass();
                String strM7054b = m7054b(strOptString3, YouTubeSubtitleFormat.JSON3, z2);
                if (!vk9.m23391n0(strM7054b)) {
                    try {
                        JSONArray jSONArrayOptJSONArray3 = new JSONObject(strM7054b).optJSONArray("events");
                        if (jSONArrayOptJSONArray3 != null) {
                            int length = jSONArrayOptJSONArray3.length();
                            Iterator it = l70.m15922M(0, length).iterator();
                            while (((h84) it).f41941c) {
                                iM7053a += m7053a(jSONArrayOptJSONArray3.optJSONObject(((a84) it).nextInt()));
                            }
                            double d = length > 0 ? ((double) iM7053a) / ((double) length) : 0.0d;
                            if (iM7053a >= 20 && d >= 0.05d) {
                                return new Triple(strM7054b, strOptString, YouTubeSubtitleFormat.JSON3);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                JSONObject jSONObjectM7055c2 = m7055c(jSONArrayOptJSONArray, listM23604J, true);
                if (jSONObjectM7055c2 != null && (strOptString2 = jSONObjectM7055c2.optString("baseUrl")) != null) {
                    strOptString3 = strOptString2;
                }
                YouTubeSubtitleFormat youTubeSubtitleFormat = YouTubeSubtitleFormat.TTML;
                String strM7054b2 = m7054b(strOptString3, youTubeSubtitleFormat, z2);
                if (!vk9.m23391n0(strM7054b2) && !vk9.m23391n0(strM7054b2)) {
                    try {
                        DocumentBuilder documentBuilderNewDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                        byte[] bytes = strM7054b2.getBytes(yu0.f70463a);
                        bytes.getClass();
                        Document document = documentBuilderNewDocumentBuilder.parse(new ByteArrayInputStream(bytes));
                        if (document.getElementsByTagName("tt").getLength() > 0 || document.getElementsByTagName("p").getLength() > 0) {
                            return new Triple(strM7054b2, strOptString, youTubeSubtitleFormat);
                        }
                    } catch (Exception unused2) {
                    }
                }
            } else {
                for (YouTubeSubtitleFormat youTubeSubtitleFormat2 : YouTubeSubtitleFormat.getEntries()) {
                    strOptString3.getClass();
                    String strM7054b3 = m7054b(strOptString3, youTubeSubtitleFormat2, z2);
                    if (!vk9.m23391n0(strM7054b3)) {
                        return new Triple(strM7054b3, strOptString, youTubeSubtitleFormat2);
                    }
                }
            }
            return new Triple("", strOptString, YouTubeSubtitleFormat.SRV3);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error getting YouTube data");
        }
    }
}
