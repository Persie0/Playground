package com.iterable.iterableapi;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.iterable.iterableapi.AsyncTaskC1217m;
import com.iterable.iterableapi.C1205a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p000.eh0;
import p000.fb4;
import p000.gb4;
import p000.gvb;
import p000.ub4;
import p000.vb4;

/* JADX INFO: renamed from: com.iterable.iterableapi.m */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC1217m extends AsyncTask {

    /* JADX INFO: renamed from: c */
    public static final Handler f14057c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public int f14058a = 0;

    /* JADX INFO: renamed from: b */
    public C1205a f14059b;

    /* JADX INFO: renamed from: a */
    public static String m6949a(HttpURLConnection httpURLConnection) {
        StringBuilder sb = new StringBuilder("\nHeaders { \n");
        for (String str : httpURLConnection.getRequestProperties().keySet()) {
            if (!str.equals("Api-Key") && !str.equals("Authorization")) {
                sb.append(str);
                sb.append(" : ");
                sb.append(httpURLConnection.getRequestProperties().get(str));
                sb.append("\n");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x029e A[Catch: all -> 0x0103, Exception -> 0x0293, ArrayIndexOutOfBoundsException -> 0x0296, JSONException -> 0x0299, IOException -> 0x029c, TryCatch #18 {all -> 0x0103, blocks: (B:33:0x00be, B:35:0x00ea, B:47:0x0122, B:49:0x014c, B:98:0x0277, B:102:0x0284, B:116:0x02b3, B:117:0x02b8, B:119:0x02be, B:120:0x02c2, B:126:0x02d7, B:127:0x02dc, B:136:0x0313, B:138:0x0319, B:140:0x031f, B:148:0x032e, B:150:0x0334, B:152:0x033a, B:158:0x0346, B:167:0x036b, B:171:0x0379, B:173:0x0381, B:177:0x038c, B:181:0x0397, B:184:0x039f, B:186:0x03b7, B:187:0x03bc, B:189:0x03c5, B:191:0x03cb, B:193:0x03d4, B:195:0x03db, B:133:0x0301, B:217:0x0425, B:222:0x043a, B:227:0x044f, B:232:0x0464, B:124:0x02ce, B:111:0x029e, B:113:0x02a4, B:83:0x01c6, B:85:0x0204, B:94:0x022c, B:96:0x0255), top: B:245:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02a4 A[Catch: all -> 0x0103, Exception -> 0x0293, ArrayIndexOutOfBoundsException -> 0x0296, JSONException -> 0x0299, IOException -> 0x029c, TryCatch #18 {all -> 0x0103, blocks: (B:33:0x00be, B:35:0x00ea, B:47:0x0122, B:49:0x014c, B:98:0x0277, B:102:0x0284, B:116:0x02b3, B:117:0x02b8, B:119:0x02be, B:120:0x02c2, B:126:0x02d7, B:127:0x02dc, B:136:0x0313, B:138:0x0319, B:140:0x031f, B:148:0x032e, B:150:0x0334, B:152:0x033a, B:158:0x0346, B:167:0x036b, B:171:0x0379, B:173:0x0381, B:177:0x038c, B:181:0x0397, B:184:0x039f, B:186:0x03b7, B:187:0x03bc, B:189:0x03c5, B:191:0x03cb, B:193:0x03d4, B:195:0x03db, B:133:0x0301, B:217:0x0425, B:222:0x043a, B:227:0x044f, B:232:0x0464, B:124:0x02ce, B:111:0x029e, B:113:0x02a4, B:83:0x01c6, B:85:0x0204, B:94:0x022c, B:96:0x0255), top: B:245:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b3 A[Catch: all -> 0x0103, Exception -> 0x0293, ArrayIndexOutOfBoundsException -> 0x0296, JSONException -> 0x0299, IOException -> 0x029c, TryCatch #18 {all -> 0x0103, blocks: (B:33:0x00be, B:35:0x00ea, B:47:0x0122, B:49:0x014c, B:98:0x0277, B:102:0x0284, B:116:0x02b3, B:117:0x02b8, B:119:0x02be, B:120:0x02c2, B:126:0x02d7, B:127:0x02dc, B:136:0x0313, B:138:0x0319, B:140:0x031f, B:148:0x032e, B:150:0x0334, B:152:0x033a, B:158:0x0346, B:167:0x036b, B:171:0x0379, B:173:0x0381, B:177:0x038c, B:181:0x0397, B:184:0x039f, B:186:0x03b7, B:187:0x03bc, B:189:0x03c5, B:191:0x03cb, B:193:0x03d4, B:195:0x03db, B:133:0x0301, B:217:0x0425, B:222:0x043a, B:227:0x044f, B:232:0x0464, B:124:0x02ce, B:111:0x029e, B:113:0x02a4, B:83:0x01c6, B:85:0x0204, B:94:0x022c, B:96:0x0255), top: B:245:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x02be A[Catch: all -> 0x0103, Exception -> 0x0293, ArrayIndexOutOfBoundsException -> 0x0296, JSONException -> 0x0299, IOException -> 0x029c, LOOP:0: B:117:0x02b8->B:119:0x02be, LOOP_END, TryCatch #18 {all -> 0x0103, blocks: (B:33:0x00be, B:35:0x00ea, B:47:0x0122, B:49:0x014c, B:98:0x0277, B:102:0x0284, B:116:0x02b3, B:117:0x02b8, B:119:0x02be, B:120:0x02c2, B:126:0x02d7, B:127:0x02dc, B:136:0x0313, B:138:0x0319, B:140:0x031f, B:148:0x032e, B:150:0x0334, B:152:0x033a, B:158:0x0346, B:167:0x036b, B:171:0x0379, B:173:0x0381, B:177:0x038c, B:181:0x0397, B:184:0x039f, B:186:0x03b7, B:187:0x03bc, B:189:0x03c5, B:191:0x03cb, B:193:0x03d4, B:195:0x03db, B:133:0x0301, B:217:0x0425, B:222:0x043a, B:227:0x044f, B:232:0x0464, B:124:0x02ce, B:111:0x029e, B:113:0x02a4, B:83:0x01c6, B:85:0x0204, B:94:0x022c, B:96:0x0255), top: B:245:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:136:0x0313 A[Catch: all -> 0x0103, Exception -> 0x035f, ArrayIndexOutOfBoundsException -> 0x0362, IOException -> 0x0365, JSONException -> 0x0368, TRY_ENTER, TryCatch #18 {all -> 0x0103, blocks: (B:33:0x00be, B:35:0x00ea, B:47:0x0122, B:49:0x014c, B:98:0x0277, B:102:0x0284, B:116:0x02b3, B:117:0x02b8, B:119:0x02be, B:120:0x02c2, B:126:0x02d7, B:127:0x02dc, B:136:0x0313, B:138:0x0319, B:140:0x031f, B:148:0x032e, B:150:0x0334, B:152:0x033a, B:158:0x0346, B:167:0x036b, B:171:0x0379, B:173:0x0381, B:177:0x038c, B:181:0x0397, B:184:0x039f, B:186:0x03b7, B:187:0x03bc, B:189:0x03c5, B:191:0x03cb, B:193:0x03d4, B:195:0x03db, B:133:0x0301, B:217:0x0425, B:222:0x043a, B:227:0x044f, B:232:0x0464, B:124:0x02ce, B:111:0x029e, B:113:0x02a4, B:83:0x01c6, B:85:0x0204, B:94:0x022c, B:96:0x0255), top: B:245:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0328  */
    /* JADX WARN: Code duplicated, block: B:146:0x032b  */
    /* JADX WARN: Code duplicated, block: B:148:0x032e A[Catch: all -> 0x0103, Exception -> 0x035f, ArrayIndexOutOfBoundsException -> 0x0362, IOException -> 0x0365, JSONException -> 0x0368, TryCatch #18 {all -> 0x0103, blocks: (B:33:0x00be, B:35:0x00ea, B:47:0x0122, B:49:0x014c, B:98:0x0277, B:102:0x0284, B:116:0x02b3, B:117:0x02b8, B:119:0x02be, B:120:0x02c2, B:126:0x02d7, B:127:0x02dc, B:136:0x0313, B:138:0x0319, B:140:0x031f, B:148:0x032e, B:150:0x0334, B:152:0x033a, B:158:0x0346, B:167:0x036b, B:171:0x0379, B:173:0x0381, B:177:0x038c, B:181:0x0397, B:184:0x039f, B:186:0x03b7, B:187:0x03bc, B:189:0x03c5, B:191:0x03cb, B:193:0x03d4, B:195:0x03db, B:133:0x0301, B:217:0x0425, B:222:0x043a, B:227:0x044f, B:232:0x0464, B:124:0x02ce, B:111:0x029e, B:113:0x02a4, B:83:0x01c6, B:85:0x0204, B:94:0x022c, B:96:0x0255), top: B:245:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0343  */
    /* JADX WARN: Code duplicated, block: B:158:0x0346 A[Catch: all -> 0x0103, Exception -> 0x035f, ArrayIndexOutOfBoundsException -> 0x0362, IOException -> 0x0365, JSONException -> 0x0368, TryCatch #18 {all -> 0x0103, blocks: (B:33:0x00be, B:35:0x00ea, B:47:0x0122, B:49:0x014c, B:98:0x0277, B:102:0x0284, B:116:0x02b3, B:117:0x02b8, B:119:0x02be, B:120:0x02c2, B:126:0x02d7, B:127:0x02dc, B:136:0x0313, B:138:0x0319, B:140:0x031f, B:148:0x032e, B:150:0x0334, B:152:0x033a, B:158:0x0346, B:167:0x036b, B:171:0x0379, B:173:0x0381, B:177:0x038c, B:181:0x0397, B:184:0x039f, B:186:0x03b7, B:187:0x03bc, B:189:0x03c5, B:191:0x03cb, B:193:0x03d4, B:195:0x03db, B:133:0x0301, B:217:0x0425, B:222:0x043a, B:227:0x044f, B:232:0x0464, B:124:0x02ce, B:111:0x029e, B:113:0x02a4, B:83:0x01c6, B:85:0x0204, B:94:0x022c, B:96:0x0255), top: B:245:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x036b A[Catch: all -> 0x0103, Exception -> 0x035f, ArrayIndexOutOfBoundsException -> 0x0362, IOException -> 0x0365, JSONException -> 0x0368, TryCatch #18 {all -> 0x0103, blocks: (B:33:0x00be, B:35:0x00ea, B:47:0x0122, B:49:0x014c, B:98:0x0277, B:102:0x0284, B:116:0x02b3, B:117:0x02b8, B:119:0x02be, B:120:0x02c2, B:126:0x02d7, B:127:0x02dc, B:136:0x0313, B:138:0x0319, B:140:0x031f, B:148:0x032e, B:150:0x0334, B:152:0x033a, B:158:0x0346, B:167:0x036b, B:171:0x0379, B:173:0x0381, B:177:0x038c, B:181:0x0397, B:184:0x039f, B:186:0x03b7, B:187:0x03bc, B:189:0x03c5, B:191:0x03cb, B:193:0x03d4, B:195:0x03db, B:133:0x0301, B:217:0x0425, B:222:0x043a, B:227:0x044f, B:232:0x0464, B:124:0x02ce, B:111:0x029e, B:113:0x02a4, B:83:0x01c6, B:85:0x0204, B:94:0x022c, B:96:0x0255), top: B:245:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0373 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x0375  */
    /* JADX WARN: Code duplicated, block: B:174:0x0386  */
    /* JADX WARN: Code duplicated, block: B:176:0x038a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0391  */
    /* JADX WARN: Code duplicated, block: B:180:0x0395  */
    /* JADX WARN: Code duplicated, block: B:188:0x03c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x03c5 A[Catch: all -> 0x0103, Exception -> 0x035f, ArrayIndexOutOfBoundsException -> 0x0362, IOException -> 0x0365, JSONException -> 0x0368, TryCatch #18 {all -> 0x0103, blocks: (B:33:0x00be, B:35:0x00ea, B:47:0x0122, B:49:0x014c, B:98:0x0277, B:102:0x0284, B:116:0x02b3, B:117:0x02b8, B:119:0x02be, B:120:0x02c2, B:126:0x02d7, B:127:0x02dc, B:136:0x0313, B:138:0x0319, B:140:0x031f, B:148:0x032e, B:150:0x0334, B:152:0x033a, B:158:0x0346, B:167:0x036b, B:171:0x0379, B:173:0x0381, B:177:0x038c, B:181:0x0397, B:184:0x039f, B:186:0x03b7, B:187:0x03bc, B:189:0x03c5, B:191:0x03cb, B:193:0x03d4, B:195:0x03db, B:133:0x0301, B:217:0x0425, B:222:0x043a, B:227:0x044f, B:232:0x0464, B:124:0x02ce, B:111:0x029e, B:113:0x02a4, B:83:0x01c6, B:85:0x0204, B:94:0x022c, B:96:0x0255), top: B:245:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x03d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x03d4 A[Catch: all -> 0x0103, Exception -> 0x035f, ArrayIndexOutOfBoundsException -> 0x0362, IOException -> 0x0365, JSONException -> 0x0368, TryCatch #18 {all -> 0x0103, blocks: (B:33:0x00be, B:35:0x00ea, B:47:0x0122, B:49:0x014c, B:98:0x0277, B:102:0x0284, B:116:0x02b3, B:117:0x02b8, B:119:0x02be, B:120:0x02c2, B:126:0x02d7, B:127:0x02dc, B:136:0x0313, B:138:0x0319, B:140:0x031f, B:148:0x032e, B:150:0x0334, B:152:0x033a, B:158:0x0346, B:167:0x036b, B:171:0x0379, B:173:0x0381, B:177:0x038c, B:181:0x0397, B:184:0x039f, B:186:0x03b7, B:187:0x03bc, B:189:0x03c5, B:191:0x03cb, B:193:0x03d4, B:195:0x03db, B:133:0x0301, B:217:0x0425, B:222:0x043a, B:227:0x044f, B:232:0x0464, B:124:0x02ce, B:111:0x029e, B:113:0x02a4, B:83:0x01c6, B:85:0x0204, B:94:0x022c, B:96:0x0255), top: B:245:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:195:0x03db A[Catch: all -> 0x0103, Exception -> 0x035f, ArrayIndexOutOfBoundsException -> 0x0362, IOException -> 0x0365, JSONException -> 0x0368, TRY_LEAVE, TryCatch #18 {all -> 0x0103, blocks: (B:33:0x00be, B:35:0x00ea, B:47:0x0122, B:49:0x014c, B:98:0x0277, B:102:0x0284, B:116:0x02b3, B:117:0x02b8, B:119:0x02be, B:120:0x02c2, B:126:0x02d7, B:127:0x02dc, B:136:0x0313, B:138:0x0319, B:140:0x031f, B:148:0x032e, B:150:0x0334, B:152:0x033a, B:158:0x0346, B:167:0x036b, B:171:0x0379, B:173:0x0381, B:177:0x038c, B:181:0x0397, B:184:0x039f, B:186:0x03b7, B:187:0x03bc, B:189:0x03c5, B:191:0x03cb, B:193:0x03d4, B:195:0x03db, B:133:0x0301, B:217:0x0425, B:222:0x043a, B:227:0x044f, B:232:0x0464, B:124:0x02ce, B:111:0x029e, B:113:0x02a4, B:83:0x01c6, B:85:0x0204, B:94:0x022c, B:96:0x0255), top: B:245:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x03f0 A[PHI: r0 r2 r3 r5
      0x03f0: PHI (r0v71 gb4) = 
      (r0v60 gb4)
      (r0v63 gb4)
      (r0v66 gb4)
      (r0v69 gb4)
      (r0v88 gb4)
      (r0v89 gb4)
      (r0v90 gb4)
      (r0v93 gb4)
      (r0v95 gb4)
      (r0v96 gb4)
      (r0v98 gb4)
      (r0v102 gb4)
      (r0v106 gb4)
      (r0v108 gb4)
     binds: [B:219:0x0434, B:233:0x0471, B:224:0x0449, B:229:0x045e, B:195:0x03db, B:194:0x03d9, B:193:0x03d4, B:191:0x03cb, B:187:0x03bc, B:186:0x03b7, B:184:0x039f, B:177:0x038c, B:167:0x036b, B:158:0x0346] A[DONT_GENERATE, DONT_INLINE]
      0x03f0: PHI (r2v50 java.lang.String) = 
      (r2v45 java.lang.String)
      (r2v46 java.lang.String)
      (r2v47 java.lang.String)
      (r2v48 java.lang.String)
      (r2v51 java.lang.String)
      (r2v51 java.lang.String)
      (r2v51 java.lang.String)
      (r2v51 java.lang.String)
      (r2v51 java.lang.String)
      (r2v51 java.lang.String)
      (r2v51 java.lang.String)
      (r2v51 java.lang.String)
      (r2v51 java.lang.String)
      (r2v51 java.lang.String)
     binds: [B:219:0x0434, B:233:0x0471, B:224:0x0449, B:229:0x045e, B:195:0x03db, B:194:0x03d9, B:193:0x03d4, B:191:0x03cb, B:187:0x03bc, B:186:0x03b7, B:184:0x039f, B:177:0x038c, B:167:0x036b, B:158:0x0346] A[DONT_GENERATE, DONT_INLINE]
      0x03f0: PHI (r3v37 java.lang.String) = 
      (r3v32 java.lang.String)
      (r3v33 java.lang.String)
      (r3v34 java.lang.String)
      (r3v35 java.lang.String)
      (r3v38 java.lang.String)
      (r3v38 java.lang.String)
      (r3v38 java.lang.String)
      (r3v38 java.lang.String)
      (r3v38 java.lang.String)
      (r3v38 java.lang.String)
      (r3v38 java.lang.String)
      (r3v38 java.lang.String)
      (r3v38 java.lang.String)
      (r3v38 java.lang.String)
     binds: [B:219:0x0434, B:233:0x0471, B:224:0x0449, B:229:0x045e, B:195:0x03db, B:194:0x03d9, B:193:0x03d4, B:191:0x03cb, B:187:0x03bc, B:186:0x03b7, B:184:0x039f, B:177:0x038c, B:167:0x036b, B:158:0x0346] A[DONT_GENERATE, DONT_INLINE]
      0x03f0: PHI (r5v23 java.net.HttpURLConnection) = 
      (r5v19 java.net.HttpURLConnection)
      (r5v20 java.net.HttpURLConnection)
      (r5v21 java.net.HttpURLConnection)
      (r5v22 java.net.HttpURLConnection)
      (r5v24 java.net.HttpURLConnection)
      (r5v24 java.net.HttpURLConnection)
      (r5v24 java.net.HttpURLConnection)
      (r5v24 java.net.HttpURLConnection)
      (r5v24 java.net.HttpURLConnection)
      (r5v24 java.net.HttpURLConnection)
      (r5v24 java.net.HttpURLConnection)
      (r5v24 java.net.HttpURLConnection)
      (r5v24 java.net.HttpURLConnection)
      (r5v24 java.net.HttpURLConnection)
     binds: [B:219:0x0434, B:233:0x0471, B:224:0x0449, B:229:0x045e, B:195:0x03db, B:194:0x03d9, B:193:0x03d4, B:191:0x03cb, B:187:0x03bc, B:186:0x03b7, B:184:0x039f, B:177:0x038c, B:167:0x036b, B:158:0x0346] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:219:0x0434  */
    /* JADX WARN: Code duplicated, block: B:224:0x0449  */
    /* JADX WARN: Code duplicated, block: B:229:0x045e  */
    /* JADX WARN: Code duplicated, block: B:269:0x02c2 A[EDGE_INSN: B:269:0x02c2->B:120:0x02c2 BREAK  A[LOOP:0: B:117:0x02b8->B:119:0x02be], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:195:0x03db, please report this as an issue */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX INFO: renamed from: b */
    public static gb4 m6950b(C1205a c1205a) throws Throwable {
        String str;
        HttpURLConnection httpURLConnection;
        String str2;
        String str3;
        gb4 gb4VarM12463a;
        int responseCode;
        String message;
        JSONObject jSONObject;
        String message2;
        String string;
        boolean z;
        boolean z2;
        InputStream errorStream;
        BufferedReader bufferedReader;
        String string2;
        StringBuffer stringBuffer;
        String line;
        if (c1205a == null) {
            return null;
        }
        String str4 = c1205a.f13979a;
        String str5 = c1205a.f13982d;
        String str6 = c1205a.f13983e;
        JSONObject jSONObject2 = c1205a.f13981c;
        String str7 = c1205a.f13980b;
        eh0.m11120Q("IterableRequest", ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        String strM6951c = m6951c();
        try {
            String str8 = "======================================";
            try {
                if (str5 == "GET") {
                    try {
                        Uri.Builder builderBuildUpon = Uri.parse(strM6951c + str7).buildUpon();
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (itKeys.hasNext()) {
                            try {
                                String next = itKeys.next();
                                builderBuildUpon.appendQueryParameter(next, jSONObject2.getString(next));
                            } catch (IOException e) {
                                e = e;
                                str = "IterableRequest";
                                httpURLConnection = null;
                                str3 = null;
                                m6954f(c1205a, strM6951c, e);
                                gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                eh0.m11120Q(str, str8);
                                return gb4VarM12463a;
                            } catch (ArrayIndexOutOfBoundsException e2) {
                                e = e2;
                                str = "IterableRequest";
                                httpURLConnection = null;
                                str3 = null;
                                m6954f(c1205a, strM6951c, e);
                                gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                eh0.m11120Q(str, str8);
                                return gb4VarM12463a;
                            } catch (JSONException e3) {
                                e = e3;
                                str = "IterableRequest";
                                httpURLConnection = null;
                                str3 = null;
                                m6954f(c1205a, strM6951c, e);
                                gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                eh0.m11120Q(str, str8);
                                return gb4VarM12463a;
                            } catch (Exception e4) {
                                e = e4;
                                str = "IterableRequest";
                                httpURLConnection = null;
                                str3 = null;
                                m6954f(c1205a, strM6951c, e);
                                gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                eh0.m11120Q(str, str8);
                                return gb4VarM12463a;
                            }
                        }
                        httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(builderBuildUpon.build().toString()).openConnection()));
                        try {
                            httpURLConnection.setReadTimeout(10000);
                            httpURLConnection.setConnectTimeout(10000);
                            httpURLConnection.setRequestProperty("Api-Key", str4);
                            httpURLConnection.setRequestProperty("SDK-Platform", "Android");
                            httpURLConnection.setRequestProperty("SDK-Version", "3.7.0");
                            httpURLConnection.setRequestProperty("Sent-At", String.valueOf(new Date().getTime() / 1000));
                            httpURLConnection.setRequestProperty("SDK-Request-Processor", c1205a.f13984f.toString());
                            if (str6 != null) {
                                try {
                                    httpURLConnection.setRequestProperty("Authorization", "Bearer " + str6);
                                } catch (IOException e5) {
                                    e = e5;
                                    str8 = str8;
                                    str = "IterableRequest";
                                    str3 = null;
                                    m6954f(c1205a, strM6951c, e);
                                    gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    eh0.m11120Q(str, str8);
                                    return gb4VarM12463a;
                                } catch (ArrayIndexOutOfBoundsException e6) {
                                    e = e6;
                                    str8 = str8;
                                    str = "IterableRequest";
                                    str3 = null;
                                    m6954f(c1205a, strM6951c, e);
                                    gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    eh0.m11120Q(str, str8);
                                    return gb4VarM12463a;
                                } catch (JSONException e7) {
                                    e = e7;
                                    str8 = str8;
                                    str = "IterableRequest";
                                    str3 = null;
                                    m6954f(c1205a, strM6951c, e);
                                    gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    eh0.m11120Q(str, str8);
                                    return gb4VarM12463a;
                                } catch (Exception e8) {
                                    e = e8;
                                    str8 = str8;
                                    str = "IterableRequest";
                                    str3 = null;
                                    m6954f(c1205a, strM6951c, e);
                                    gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    eh0.m11120Q(str, str8);
                                    return gb4VarM12463a;
                                }
                            }
                            str2 = "IterableRequest";
                            try {
                                eh0.m11120Q(str2, "GET Request \nURI : " + strM6951c + str7 + m6949a(httpURLConnection) + "\n body : \n" + jSONObject2.toString(2));
                                str = str2;
                                str8 = str8;
                                try {
                                    try {
                                        eh0.m11120Q(str, str8);
                                        responseCode = httpURLConnection.getResponseCode();
                                        try {
                                            if (responseCode >= 0 || responseCode >= 400) {
                                                errorStream = httpURLConnection.getErrorStream();
                                                if (errorStream != null) {
                                                    bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                                                } else {
                                                    bufferedReader = null;
                                                }
                                            } else {
                                                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                            }
                                            if (bufferedReader != null) {
                                                stringBuffer = new StringBuffer();
                                                while (true) {
                                                    line = bufferedReader.readLine();
                                                    if (line != null) {
                                                        break;
                                                    }
                                                    stringBuffer.append(line);
                                                }
                                                bufferedReader.close();
                                                string2 = stringBuffer.toString();
                                            } else {
                                                string2 = null;
                                            }
                                            str3 = string2;
                                            message = null;
                                        } catch (IOException e9) {
                                            m6954f(c1205a, strM6951c, e9);
                                            message = e9.getMessage();
                                            str3 = null;
                                        }
                                        try {
                                            jSONObject = new JSONObject(str3);
                                            try {
                                                eh0.m11120Q(str, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nResponse from : " + strM6951c + str7);
                                                eh0.m11120Q(str, jSONObject.toString(2));
                                                message2 = null;
                                            } catch (Exception e10) {
                                                e = e10;
                                                try {
                                                    m6954f(c1205a, strM6951c, e);
                                                    message2 = e.getMessage();
                                                } catch (IOException e11) {
                                                    e = e11;
                                                    m6954f(c1205a, strM6951c, e);
                                                    gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                                    if (httpURLConnection != null) {
                                                    }
                                                    eh0.m11120Q(str, str8);
                                                    return gb4VarM12463a;
                                                } catch (ArrayIndexOutOfBoundsException e12) {
                                                    e = e12;
                                                    m6954f(c1205a, strM6951c, e);
                                                    gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                                    if (httpURLConnection != null) {
                                                    }
                                                    eh0.m11120Q(str, str8);
                                                    return gb4VarM12463a;
                                                } catch (JSONException e13) {
                                                    e = e13;
                                                    m6954f(c1205a, strM6951c, e);
                                                    gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                                    if (httpURLConnection != null) {
                                                    }
                                                    eh0.m11120Q(str, str8);
                                                    return gb4VarM12463a;
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    m6954f(c1205a, strM6951c, e);
                                                    gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                                    if (httpURLConnection != null) {
                                                    }
                                                    eh0.m11120Q(str, str8);
                                                    return gb4VarM12463a;
                                                }
                                            }
                                        } catch (Exception e15) {
                                            e = e15;
                                            jSONObject = null;
                                        }
                                        if (responseCode == -1) {
                                            if (!m6955g("InvalidJwtPayload", jSONObject) || m6955g("BadAuthorizationHeader", jSONObject) || m6955g("JwtUserIdentifiersMismatched", jSONObject)) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                responseCode = 401;
                                            }
                                        }
                                        if (responseCode == 401) {
                                            if (!m6955g("InvalidJwtPayload", jSONObject) || m6955g("BadAuthorizationHeader", jSONObject) || m6955g("JwtUserIdentifiersMismatched", jSONObject)) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (z) {
                                                gb4VarM12463a = gb4.m12463a(responseCode, str3, jSONObject, "JWT Authorization header error");
                                                C1206b c1206bM11692c = fb4.m11688g().m11692c();
                                                m6952d(jSONObject);
                                                c1206bM11692c.getClass();
                                                m6953e(c1205a);
                                            } else {
                                                gb4VarM12463a = gb4.m12463a(responseCode, str3, jSONObject, "Invalid API Key");
                                            }
                                        } else if (responseCode >= 400) {
                                            string = "Invalid Request";
                                            if (jSONObject == null && jSONObject.has("msg")) {
                                                string = jSONObject.getString("msg");
                                            } else if (responseCode >= 500) {
                                                string = "Internal Server Error";
                                            }
                                            gb4VarM12463a = gb4.m12463a(responseCode, str3, jSONObject, string);
                                        } else if (responseCode == 200) {
                                            gb4VarM12463a = gb4.m12463a(responseCode, str3, jSONObject, "Received non-200 response: " + responseCode);
                                        } else if (message == null || str3.length() <= 0) {
                                            if (message != null && str3.length() == 0) {
                                                gb4VarM12463a = gb4.m12463a(responseCode, str3, jSONObject, "No data received");
                                            } else if (message != null) {
                                                gb4VarM12463a = gb4.m12463a(responseCode, str3, jSONObject, message);
                                            } else {
                                                gb4VarM12463a = null;
                                            }
                                        } else if (message2 != null) {
                                            gb4VarM12463a = gb4.m12463a(responseCode, str3, jSONObject, "Could not parse json: " + message2);
                                        } else {
                                            gb4VarM12463a = jSONObject != null ? gb4.m12464b(responseCode, str3, jSONObject) : gb4.m12463a(responseCode, str3, jSONObject, "Response is not a JSON object");
                                        }
                                    } catch (IOException e16) {
                                        e = e16;
                                        str3 = null;
                                        m6954f(c1205a, strM6951c, e);
                                        gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        eh0.m11120Q(str, str8);
                                        return gb4VarM12463a;
                                    }
                                } catch (ArrayIndexOutOfBoundsException e17) {
                                    e = e17;
                                    str3 = null;
                                    m6954f(c1205a, strM6951c, e);
                                    gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    eh0.m11120Q(str, str8);
                                    return gb4VarM12463a;
                                } catch (JSONException e18) {
                                    e = e18;
                                    str3 = null;
                                    m6954f(c1205a, strM6951c, e);
                                    gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    eh0.m11120Q(str, str8);
                                    return gb4VarM12463a;
                                } catch (Exception e19) {
                                    e = e19;
                                    str3 = null;
                                    m6954f(c1205a, strM6951c, e);
                                    gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    eh0.m11120Q(str, str8);
                                    return gb4VarM12463a;
                                }
                            } catch (IOException e20) {
                                e = e20;
                                str = str2;
                                str8 = str8;
                                str3 = null;
                                m6954f(c1205a, strM6951c, e);
                                gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                eh0.m11120Q(str, str8);
                                return gb4VarM12463a;
                            } catch (ArrayIndexOutOfBoundsException e21) {
                                e = e21;
                                str = str2;
                                str8 = str8;
                                str3 = null;
                                m6954f(c1205a, strM6951c, e);
                                gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                eh0.m11120Q(str, str8);
                                return gb4VarM12463a;
                            } catch (JSONException e22) {
                                e = e22;
                                str = str2;
                                str8 = str8;
                                str3 = null;
                                m6954f(c1205a, strM6951c, e);
                                gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                eh0.m11120Q(str, str8);
                                return gb4VarM12463a;
                            } catch (Exception e23) {
                                e = e23;
                                str = str2;
                                str8 = str8;
                                str3 = null;
                                m6954f(c1205a, strM6951c, e);
                                gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                eh0.m11120Q(str, str8);
                                return gb4VarM12463a;
                            }
                        } catch (IOException e24) {
                            e = e24;
                            str2 = "IterableRequest";
                        } catch (ArrayIndexOutOfBoundsException e25) {
                            e = e25;
                            str2 = "IterableRequest";
                        } catch (JSONException e26) {
                            e = e26;
                            str2 = "IterableRequest";
                        } catch (Exception e27) {
                            e = e27;
                            str2 = "IterableRequest";
                        }
                    } catch (IOException e28) {
                        e = e28;
                        str = "IterableRequest";
                    } catch (ArrayIndexOutOfBoundsException e29) {
                        e = e29;
                        str = "IterableRequest";
                    } catch (JSONException e30) {
                        e = e30;
                        str = "IterableRequest";
                    } catch (Exception e31) {
                        e = e31;
                        str = "IterableRequest";
                    }
                    httpURLConnection.disconnect();
                } else {
                    try {
                        httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(strM6951c + str7).openConnection()));
                        try {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setRequestMethod(str5);
                            httpURLConnection.setReadTimeout(3000);
                            httpURLConnection.setConnectTimeout(3000);
                            httpURLConnection.setRequestProperty("Accept", "application/json");
                            httpURLConnection.setRequestProperty("Content-Type", "application/json");
                            httpURLConnection.setRequestProperty("Api-Key", str4);
                            httpURLConnection.setRequestProperty("SDK-Platform", "Android");
                            httpURLConnection.setRequestProperty("SDK-Version", "3.7.0");
                            httpURLConnection.setRequestProperty("Sent-At", String.valueOf(new Date().getTime() / 1000));
                            httpURLConnection.setRequestProperty("SDK-Request-Processor", c1205a.f13984f.toString());
                            if (str6 != null) {
                                httpURLConnection.setRequestProperty("Authorization", "Bearer ".concat(str6));
                            }
                            str = "IterableRequest";
                            try {
                                eh0.m11120Q(str, "POST Request \nURI : " + strM6951c + str7 + m6949a(httpURLConnection) + "\n body : \n" + jSONObject2.toString(2));
                                OutputStream outputStream = httpURLConnection.getOutputStream();
                                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                                bufferedWriter.write(jSONObject2.toString());
                                bufferedWriter.close();
                                outputStream.close();
                                str8 = str8;
                                eh0.m11120Q(str, str8);
                                responseCode = httpURLConnection.getResponseCode();
                                if (responseCode >= 0) {
                                    errorStream = httpURLConnection.getErrorStream();
                                    if (errorStream != null) {
                                        bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                                    } else {
                                        bufferedReader = null;
                                    }
                                } else {
                                    errorStream = httpURLConnection.getErrorStream();
                                    if (errorStream != null) {
                                        bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                                    } else {
                                        bufferedReader = null;
                                    }
                                }
                                if (bufferedReader != null) {
                                    stringBuffer = new StringBuffer();
                                    while (true) {
                                        line = bufferedReader.readLine();
                                        if (line != null) {
                                            break;
                                            break;
                                        }
                                        stringBuffer.append(line);
                                    }
                                    bufferedReader.close();
                                    string2 = stringBuffer.toString();
                                } else {
                                    string2 = null;
                                }
                                str3 = string2;
                                message = null;
                                jSONObject = new JSONObject(str3);
                                eh0.m11120Q(str, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nResponse from : " + strM6951c + str7);
                                eh0.m11120Q(str, jSONObject.toString(2));
                                message2 = null;
                                if (responseCode == -1) {
                                    if (m6955g("InvalidJwtPayload", jSONObject)) {
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                    if (z2) {
                                        responseCode = 401;
                                    }
                                }
                                if (responseCode == 401) {
                                    if (m6955g("InvalidJwtPayload", jSONObject)) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        gb4VarM12463a = gb4.m12463a(responseCode, str3, jSONObject, "JWT Authorization header error");
                                        C1206b c1206bM11692c2 = fb4.m11688g().m11692c();
                                        m6952d(jSONObject);
                                        c1206bM11692c2.getClass();
                                        m6953e(c1205a);
                                    } else {
                                        gb4VarM12463a = gb4.m12463a(responseCode, str3, jSONObject, "Invalid API Key");
                                    }
                                } else if (responseCode >= 400) {
                                    string = "Invalid Request";
                                    if (jSONObject == null) {
                                        if (responseCode >= 500) {
                                            string = "Internal Server Error";
                                        }
                                    } else if (responseCode >= 500) {
                                        string = "Internal Server Error";
                                    }
                                    gb4VarM12463a = gb4.m12463a(responseCode, str3, jSONObject, string);
                                } else if (responseCode == 200) {
                                    gb4VarM12463a = gb4.m12463a(responseCode, str3, jSONObject, "Received non-200 response: " + responseCode);
                                } else if (message == null) {
                                    if (message != null) {
                                        if (message != null) {
                                            gb4VarM12463a = gb4.m12463a(responseCode, str3, jSONObject, message);
                                        } else {
                                            gb4VarM12463a = null;
                                        }
                                    } else if (message != null) {
                                        gb4VarM12463a = gb4.m12463a(responseCode, str3, jSONObject, message);
                                    } else {
                                        gb4VarM12463a = null;
                                    }
                                } else if (message != null) {
                                    if (message != null) {
                                        gb4VarM12463a = gb4.m12463a(responseCode, str3, jSONObject, message);
                                    } else {
                                        gb4VarM12463a = null;
                                    }
                                } else if (message != null) {
                                    gb4VarM12463a = gb4.m12463a(responseCode, str3, jSONObject, message);
                                } else {
                                    gb4VarM12463a = null;
                                }
                            } catch (IOException e32) {
                                e = e32;
                                str8 = str8;
                                str3 = null;
                                m6954f(c1205a, strM6951c, e);
                                gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                eh0.m11120Q(str, str8);
                                return gb4VarM12463a;
                            } catch (ArrayIndexOutOfBoundsException e33) {
                                e = e33;
                                str8 = str8;
                                str3 = null;
                                m6954f(c1205a, strM6951c, e);
                                gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                eh0.m11120Q(str, str8);
                                return gb4VarM12463a;
                            } catch (JSONException e34) {
                                e = e34;
                                str8 = str8;
                                str3 = null;
                                m6954f(c1205a, strM6951c, e);
                                gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                eh0.m11120Q(str, str8);
                                return gb4VarM12463a;
                            } catch (Exception e35) {
                                e = e35;
                                str8 = str8;
                                str3 = null;
                                m6954f(c1205a, strM6951c, e);
                                gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                eh0.m11120Q(str, str8);
                                return gb4VarM12463a;
                            }
                        } catch (IOException e36) {
                            e = e36;
                            str8 = str8;
                            str = "IterableRequest";
                            str3 = null;
                            m6954f(c1205a, strM6951c, e);
                            gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            eh0.m11120Q(str, str8);
                            return gb4VarM12463a;
                        } catch (ArrayIndexOutOfBoundsException e37) {
                            e = e37;
                            str8 = str8;
                            str = "IterableRequest";
                            str3 = null;
                            m6954f(c1205a, strM6951c, e);
                            gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            eh0.m11120Q(str, str8);
                            return gb4VarM12463a;
                        } catch (JSONException e38) {
                            e = e38;
                            str8 = str8;
                            str = "IterableRequest";
                            str3 = null;
                            m6954f(c1205a, strM6951c, e);
                            gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            eh0.m11120Q(str, str8);
                            return gb4VarM12463a;
                        } catch (Exception e39) {
                            e = e39;
                            str8 = str8;
                            str = "IterableRequest";
                            str3 = null;
                            m6954f(c1205a, strM6951c, e);
                            gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            eh0.m11120Q(str, str8);
                            return gb4VarM12463a;
                        }
                    } catch (IOException e40) {
                        e = e40;
                        str = "IterableRequest";
                        httpURLConnection = null;
                        str3 = null;
                        m6954f(c1205a, strM6951c, e);
                        gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        eh0.m11120Q(str, str8);
                        return gb4VarM12463a;
                    } catch (ArrayIndexOutOfBoundsException e41) {
                        e = e41;
                        str = "IterableRequest";
                        httpURLConnection = null;
                        str3 = null;
                        m6954f(c1205a, strM6951c, e);
                        gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        eh0.m11120Q(str, str8);
                        return gb4VarM12463a;
                    } catch (JSONException e42) {
                        e = e42;
                        str = "IterableRequest";
                        httpURLConnection = null;
                        str3 = null;
                        m6954f(c1205a, strM6951c, e);
                        gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        eh0.m11120Q(str, str8);
                        return gb4VarM12463a;
                    } catch (Exception e43) {
                        e = e43;
                        str = "IterableRequest";
                        httpURLConnection = null;
                        str3 = null;
                        m6954f(c1205a, strM6951c, e);
                        gb4VarM12463a = gb4.m12463a(0, str3, null, e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        eh0.m11120Q(str, str8);
                        return gb4VarM12463a;
                    }
                    httpURLConnection.disconnect();
                }
                eh0.m11120Q(str, str8);
                return gb4VarM12463a;
            } catch (Throwable th) {
                th = th;
                HttpURLConnection httpURLConnection2 = null;
                if (0 != 0) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m6951c() {
        return ((IterableDataRegion) fb4.f38769t.f38771b.f49401g).getEndpoint();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0078, code lost:
    
        if (r2.equals("email could not be found") != false) goto L43;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m6952d(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("msg")) {
                    String lowerCase = jSONObject.getString("msg").toLowerCase();
                    switch (lowerCase.hashCode()) {
                        case -1798300651:
                            break;
                        case -1637373127:
                            if (lowerCase.equals("exp must be less than 1 year from iat")) {
                                AuthFailureReason authFailureReason = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                                return;
                            }
                            AuthFailureReason authFailureReason2 = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                            return;
                        case -1146775046:
                            if (lowerCase.equals("jwt is invalid")) {
                                AuthFailureReason authFailureReason3 = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                                return;
                            }
                            AuthFailureReason authFailureReason4 = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                            return;
                        case -1106130705:
                            if (lowerCase.equals("jwt token is expired")) {
                                AuthFailureReason authFailureReason5 = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                                return;
                            }
                            AuthFailureReason authFailureReason6 = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                            return;
                        case -481783598:
                            if (lowerCase.equals("jwt authorization header is not set")) {
                                AuthFailureReason authFailureReason7 = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                                return;
                            }
                            AuthFailureReason authFailureReason8 = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                            return;
                        case 1952848923:
                            if (lowerCase.equals("jwt token has been invalidated")) {
                                AuthFailureReason authFailureReason9 = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                                return;
                            }
                            AuthFailureReason authFailureReason10 = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                            return;
                        case 2107082853:
                            if (lowerCase.equals("invalid payload")) {
                                AuthFailureReason authFailureReason11 = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                                return;
                            }
                            AuthFailureReason authFailureReason12 = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                            return;
                        case 2124430769:
                            if (lowerCase.equals("jwt format is invalid")) {
                                AuthFailureReason authFailureReason13 = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                                return;
                            }
                            AuthFailureReason authFailureReason14 = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                            return;
                        case 2142617325:
                            if (lowerCase.equals("jwt payload requires a value for userid or email")) {
                                break;
                            }
                            AuthFailureReason authFailureReason15 = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                            return;
                        default:
                            AuthFailureReason authFailureReason16 = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                            return;
                    }
                    AuthFailureReason authFailureReason17 = AuthFailureReason.AUTH_TOKEN_EXPIRED;
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [pc4] */
    /* JADX INFO: renamed from: e */
    public static void m6953e(final C1205a c1205a) {
        if (fb4.f38769t.f38779j && c1205a.f13984f == IterableApiRequest$ProcessorType.OFFLINE) {
            C1206b c1206bM11692c = fb4.f38769t.m11692c();
            c1206bM11692c.getClass();
            c1206bM11692c.m6898e(c1206bM11692c.m6896c(), false, null);
        } else {
            fb4.f38769t.m11692c().getClass();
            fb4.f38769t.m11692c().m6898e(fb4.f38769t.m11692c().m6896c(), false, new vb4() { // from class: pc4
                @Override // p000.vb4
                /* JADX INFO: renamed from: a */
                public final void mo17898a(JSONObject jSONObject) {
                    C1205a c1205a2 = c1205a;
                    try {
                        new AsyncTaskC1217m().execute(new C1205a(c1205a2.f13979a, c1205a2.f13980b, c1205a2.f13981c, c1205a2.f13982d, jSONObject.getString("newAuthToken"), c1205a2.f13985g));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m6954f(C1205a c1205a, String str, Exception exc) {
        eh0.m11135p("IterableRequest", "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nException occurred for : " + str + c1205a.f13980b);
        eh0.m11136q("IterableRequest", exc.getMessage(), exc);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m6955g(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.has("code") && jSONObject.getString("code").equals(str);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        C1205a[] c1205aArr = (C1205a[]) objArr;
        if (c1205aArr != null && c1205aArr.length > 0) {
            this.f14059b = c1205aArr[0];
        }
        return m6950b(this.f14059b);
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) throws Exception {
        gb4 gb4Var = (gb4) obj;
        boolean z = gb4Var.f40488a;
        if (!z && gb4Var.f40489b >= 500 && this.f14058a <= 5) {
            AsyncTaskC1217m asyncTaskC1217m = new AsyncTaskC1217m();
            asyncTaskC1217m.f14058a = this.f14058a + 1;
            int i = this.f14058a;
            f14057c.postDelayed(new gvb(this, asyncTaskC1217m, false, 4), i > 2 ? ((long) i) * 2000 : 0L);
            return;
        }
        C1205a c1205a = this.f14059b;
        if (z) {
            if (!Objects.equals(c1205a.f13980b, "mobile/getRemoteConfiguration") && !Objects.equals(this.f14059b.f13980b, "users/disableDevice")) {
                fb4.f38769t.m11692c().getClass();
                fb4.f38769t.m11692c().getClass();
                C1206b c1206bM11692c = fb4.f38769t.m11692c();
                c1206bM11692c.getClass();
                c1206bM11692c.m6899f(IterableAuthManager$AuthState.VALID);
            }
            vb4 vb4Var = this.f14059b.f13986h;
            if (vb4Var != null) {
                vb4Var.mo17898a(gb4Var.f40491d);
            }
        } else if (c1205a.f13987i != null) {
            JSONObject jSONObject = gb4Var.f40491d;
            if (jSONObject != null) {
                try {
                    jSONObject.put("httpStatusCode", gb4Var.f40489b);
                } catch (JSONException unused) {
                }
            }
            this.f14059b.f13987i.m19057a(gb4Var.f40492e, jSONObject);
        }
        ub4 ub4Var = this.f14059b.f13985g;
        if (ub4Var != null) {
            ub4Var.mo4506a(gb4Var.f40490c);
        }
        super.onPostExecute(gb4Var);
    }
}
