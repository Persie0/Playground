package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.LocaleList;
import android.os.PersistableBundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import android.view.autofill.AutofillId;
import androidx.compose.foundation.gestures.AbstractC0095c;
import androidx.compose.foundation.gestures.C0097e;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.Invalidation;
import androidx.compose.p002ui.node.SortedSet;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.Lifecycle$State;
import androidx.startup.R$string;
import androidx.startup.StartupException;
import com.facebook.Profile;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag;
import com.google.common.util.concurrent.AbstractC1120j;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.crashlytics.internal.concurrency.C1149a;
import com.iterable.iterableapi.C1212h;
import com.lingq.core.data.repository.C1288d;
import com.lingq.core.domain.model.notification.Notice;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Adler32;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ls */
/* JADX INFO: loaded from: classes.dex */
public final class C3309ls implements hc9, w50, InterfaceC3458pf, InterfaceC3407of, id9, hr7 {

    /* JADX INFO: renamed from: e */
    public static volatile C3309ls f50055e;

    /* JADX INFO: renamed from: h */
    public static C3309ls f50058h;

    /* JADX INFO: renamed from: l */
    public static volatile C3309ls f50062l;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50063a;

    /* JADX INFO: renamed from: b */
    public Object f50064b;

    /* JADX INFO: renamed from: c */
    public Object f50065c;

    /* JADX INFO: renamed from: d */
    public Object f50066d;

    /* JADX INFO: renamed from: f */
    public static final Object f50056f = new Object();

    /* JADX INFO: renamed from: g */
    public static final nid f50057g = new nid();

    /* JADX INFO: renamed from: i */
    public static final mp1 f50059i = new mp1(0);

    /* JADX INFO: renamed from: j */
    public static final C3835zj f50060j = new C3835zj(2);

    /* JADX INFO: renamed from: k */
    public static final p84 f50061k = new p84(15);

    public C3309ls(Context context, int i) {
        this.f50063a = i;
        switch (i) {
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                this.f50064b = Collections.synchronizedMap(new LinkedHashMap());
                HandlerThread handlerThread = new HandlerThread("FileOperationThread");
                this.f50066d = context;
                handlerThread.start();
                this.f50065c = new xb4(this, handlerThread.getLooper(), 0);
                try {
                    File file = new File(context.getFilesDir(), "com.iterable.sdk");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(file, "IterableInAppFileStorage");
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    File file3 = new File(file2, "itbl_inapp.json");
                    if (file3.exists()) {
                        m16487E(new JSONObject(bq1.m4064q0(file3)));
                    } else if (m16518u().exists()) {
                        m16487E(new JSONObject(bq1.m4064q0(m16518u())));
                    }
                } catch (Exception e) {
                    eh0.m11136q("IterableInAppFileStorage", "Error while loading in-app messages from file", e);
                    return;
                }
                break;
            default:
                this.f50066d = context.getApplicationContext();
                this.f50065c = new HashSet();
                this.f50064b = new HashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m16478G(t33 t33Var, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            t33Var.m21831b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e);
        }
    }

    /* JADX INFO: renamed from: H */
    public static final C3309ls m16479H(vqb vqbVar, C3373ni c3373ni) throws GeneralSecurityException {
        byte[] bArr = new byte[0];
        fs2 fs2VarM23478w = vqbVar.m23478w();
        if (fs2VarM23478w.m12051x().size() == 0) {
            v63.m23147y("empty keyset");
            return null;
        }
        try {
            xj4 xj4VarM24564D = xj4.m24564D(c3373ni.mo9871b(fs2VarM23478w.m12051x().m6412j(), bArr), ox2.m18561a());
            if (xj4VarM24564D.m24569y() > 0) {
                return m16481q(xj4VarM24564D);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (InvalidProtocolBufferException unused) {
            v63.m23147y("invalid keyset, corrupted key material");
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m16480j(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return AbstractC3393o1.m17735j(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return str.concat(string);
    }

    /* JADX INFO: renamed from: q */
    public static final C3309ls m16481q(xj4 xj4Var) throws GeneralSecurityException {
        if (xj4Var.m24569y() <= 0) {
            v63.m23147y("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(xj4Var.m24569y());
        for (wj4 wj4Var : xj4Var.m24570z()) {
            wj4Var.getClass();
            try {
                try {
                    lda ldaVarM18922a = p66.f55658b.m18922a(co7.m4920k(wj4Var.m24019z().m439A(), wj4Var.m24019z().m440B(), wj4Var.m24019z().m442z(), wj4Var.m24016B(), wj4Var.m24016B() == OutputPrefixType.RAW ? null : Integer.valueOf(wj4Var.m24015A())));
                    int i = yj4.f69910a[wj4Var.m24017C().ordinal()];
                    if (i != 1 && i != 2 && i != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new zj4(ldaVarM18922a));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e) {
                throw new TinkBugException("Creating a protokey serialization failed", e);
            }
        }
        return new C3309ls(xj4Var, Collections.unmodifiableList(arrayList));
    }

    /* JADX INFO: renamed from: v */
    public static C3309ls m16482v(Context context) {
        if (f50055e == null) {
            synchronized (f50056f) {
                try {
                    if (f50055e == null) {
                        f50055e = new C3309ls(context, 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f50055e;
    }

    /* JADX INFO: renamed from: A */
    public long m16483A() {
        return ((an0) this.f50066d).f852a.f71737d;
    }

    @Override // p000.hr7
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public nsa getValue(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, bh4 bh4Var) {
        abstractComponentCallbacksC0635c.getClass();
        bh4Var.getClass();
        nsa nsaVar = (nsa) this.f50066d;
        if (nsaVar != null) {
            return nsaVar;
        }
        lg3 lg3VarM2112n = ((AbstractComponentCallbacksC0635c) this.f50064b).m2112n();
        lg3VarM2112n.m16179b();
        if (!lg3VarM2112n.f49626e.f66586d.isAtLeast(Lifecycle$State.INITIALIZED)) {
            C3386nv.m17633t("Should not attempt to get bindings when Fragment views are destroyed.");
            return null;
        }
        nsa nsaVar2 = (nsa) ((vi3) this.f50065c).invoke(abstractComponentCallbacksC0635c.m2092T());
        this.f50066d = nsaVar2;
        return nsaVar2;
    }

    /* JADX INFO: renamed from: C */
    public void m16485C(String str, String str2) {
        ((HashMap) this.f50066d).put(str, str2);
    }

    /* JADX INFO: renamed from: D */
    public boolean m16486D() {
        return !(((SortedSet) ((m58) this.f50064b).f50618b).isEmpty() && ((SortedSet) ((m58) this.f50066d).f50618b).isEmpty() && ((SortedSet) ((m58) this.f50065c).f50618b).isEmpty());
    }

    /* JADX INFO: renamed from: E */
    public void m16487E(JSONObject jSONObject) {
        C1212h c1212hM6921d;
        synchronized (this) {
            try {
                Iterator it = ((Map) this.f50064b).entrySet().iterator();
                while (it.hasNext()) {
                    ((C1212h) ((Map.Entry) it.next()).getValue()).m6937t(null);
                }
                ((Map) this.f50064b).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("inAppMessages");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (c1212hM6921d = C1212h.m6921d(jSONObjectOptJSONObject, this)) != null) {
                    c1212hM6921d.m6937t(this);
                    ((Map) this.f50064b).put(c1212hM6921d.m6924g(), c1212hM6921d);
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m16488F(int i, ij1 ij1Var, vj1 vj1Var) {
        ua0 ua0Var = (ua0) this.f50065c;
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = vj1Var.f65451T;
        int[] iArr = vj1Var.f65496t;
        ua0Var.f63626a = constraintWidget$DimensionBehaviourArr[0];
        ua0Var.f63627b = constraintWidget$DimensionBehaviourArr[1];
        ua0Var.f63628c = vj1Var.m23326r();
        ua0Var.f63629d = vj1Var.m23322l();
        ua0Var.f63634i = false;
        ua0Var.f63635j = i;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ua0Var.f63626a;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2;
        boolean z2 = ua0Var.f63627b == constraintWidget$DimensionBehaviour2;
        boolean z3 = z && vj1Var.f65455X > 0.0f;
        boolean z4 = z2 && vj1Var.f65455X > 0.0f;
        if (z3 && iArr[0] == 4) {
            ua0Var.f63626a = ConstraintWidget$DimensionBehaviour.FIXED;
        }
        if (z4 && iArr[1] == 4) {
            ua0Var.f63627b = ConstraintWidget$DimensionBehaviour.FIXED;
        }
        ij1Var.m13942b(vj1Var, ua0Var);
        vj1Var.m23313P(ua0Var.f63630e);
        vj1Var.m23310M(ua0Var.f63631f);
        vj1Var.f65436E = ua0Var.f63633h;
        vj1Var.m23307J(ua0Var.f63632g);
        ua0Var.f63635j = 0;
        return ua0Var.f63634i;
    }

    /* JADX INFO: renamed from: I */
    public void m16489I(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f50065c).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f50066d) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    /* JADX INFO: renamed from: J */
    public synchronized void m16490J(C1212h c1212h) {
        c1212h.m6937t(null);
        String strM6924g = c1212h.m6924g();
        File file = new File(((Context) this.f50066d).getFilesDir(), "com.iterable.sdk");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "IterableInAppFileStorage");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(file2, strM6924g);
        File[] fileArrListFiles = file3.listFiles();
        if (fileArrListFiles != null) {
            for (File file4 : fileArrListFiles) {
                file4.delete();
            }
            file3.delete();
        }
        ((Map) this.f50064b).remove(c1212h.m6924g());
        xb4 xb4Var = (xb4) this.f50065c;
        if (!xb4Var.hasMessages(100)) {
            xb4Var.sendEmptyMessageDelayed(100, 100L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: K */
    public void m16491K(String str, String str2) {
        File file = new File(((Context) this.f50066d).getFilesDir(), "com.iterable.sdk");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "IterableInAppFileStorage");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(file2, str);
        if (!file3.isDirectory() || !new File(file3, "index.html").exists()) {
            if (!file3.mkdir()) {
            }
            if (file3 == null) {
                eh0.m11135p("IterableInAppFileStorage", "Failed to create folder for HTML content");
            } else {
                if (bq1.m4069x0(new File(file3, "index.html"), str2)) {
                }
                eh0.m11135p("IterableInAppFileStorage", "Failed to store HTML content");
            }
        }
        eh0.m11120Q("IterableInAppFileStorage", "Directory with file already exists. No need to store again");
        file3 = null;
        if (file3 == null) {
            eh0.m11135p("IterableInAppFileStorage", "Failed to create folder for HTML content");
        } else if (bq1.m4069x0(new File(file3, "index.html"), str2)) {
            eh0.m11135p("IterableInAppFileStorage", "Failed to store HTML content");
        }
    }

    /* JADX INFO: renamed from: L */
    public synchronized void m16492L() {
        for (C1212h c1212h : ((Map) this.f50064b).values()) {
            if (c1212h.m6927j()) {
                m16491K(c1212h.m6924g(), c1212h.m6922e().f35385a);
                c1212h.m6936s();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m16493M(q50 q50Var, int i, boolean z) {
        i50 i50Var = (i50) this.f50065c;
        Context context = (Context) this.f50066d;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(q50Var.f57279a.getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(mk7.m16869a(q50Var.f57281c)).array());
        byte[] bArr = q50Var.f57280b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    x74.m24357n("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", q50Var);
                    return;
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseM13313a = ((hk8) this.f50064b).m13313a();
        String str = q50Var.f57279a;
        Priority priority = q50Var.f57281c;
        Cursor cursorRawQuery = sQLiteDatabaseM13313a.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(mk7.m16869a(priority))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(i50Var.m13661a(priority, jLongValue, i));
            Set set = ((j50) i50Var.f43531b.get(priority)).f45060c;
            if (set.contains(SchedulerConfig$Flag.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(SchedulerConfig$Flag.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(SchedulerConfig$Flag.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", mk7.m16869a(priority));
            byte[] bArr2 = q50Var.f57280b;
            if (bArr2 != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr2, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {q50Var, Integer.valueOf(value), Long.valueOf(i50Var.m13661a(priority, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            String strConcat = "TRuntime.".concat("JobInfoScheduler");
            if (Log.isLoggable(strConcat, 3)) {
                Log.d(strConcat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: N */
    public JSONObject m16494N() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = ((Map) this.f50064b).entrySet().iterator();
            while (it.hasNext()) {
                jSONArray.put(((C1212h) ((Map.Entry) it.next()).getValue()).m6940w());
            }
            jSONObject.putOpt("inAppMessages", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            eh0.m11136q("IterableInAppFileStorage", "Error while serializing messages", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: O */
    public void m16495O(int i) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.f50066d;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f50066d = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, AbstractC1120j.m6404a(), new fm5(this));
        this.f50066d = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.f50065c).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public void m16496P(String str) {
        if (str != null) {
            this.f50064b = str;
        } else {
            C3386nv.m17635v("Null backendName");
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m16497Q(ym0 ym0Var) {
        ((an0) this.f50066d).f852a.f71736c = ym0Var;
    }

    /* JADX INFO: renamed from: R */
    public void m16498R(Profile profile, boolean z) {
        boolean zEquals;
        Profile profile2 = (Profile) this.f50066d;
        this.f50066d = profile;
        if (z) {
            SharedPreferences sharedPreferences = ((C3336mi) this.f50065c).f51344a;
            if (profile != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", profile.f11369a);
                    jSONObject.put("first_name", profile.f11370b);
                    jSONObject.put("middle_name", profile.f11371c);
                    jSONObject.put("last_name", profile.f11372d);
                    jSONObject.put("name", profile.f11373e);
                    Uri uri = profile.f11374f;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = profile.f11375g;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (profile2 == null) {
            zEquals = profile == null;
        } else {
            zEquals = profile2.equals(profile);
        }
        if (zEquals) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
        ((w41) this.f50064b).m23711E(intent);
    }

    /* JADX INFO: renamed from: S */
    public void m16499S(fb2 fb2Var) {
        ((an0) this.f50066d).f852a.f71734a = fb2Var;
    }

    /* JADX INFO: renamed from: T */
    public void m16500T(LayoutDirection layoutDirection) {
        ((an0) this.f50066d).f852a.f71735b = layoutDirection;
    }

    /* JADX INFO: renamed from: U */
    public void m16501U(long j) {
        ((an0) this.f50066d).f852a.f71737d = j;
    }

    /* JADX INFO: renamed from: V */
    public void m16502V(wj1 wj1Var, int i, int i2, int i3) {
        wj1Var.getClass();
        int i4 = wj1Var.f65463c0;
        int i5 = wj1Var.f65465d0;
        wj1Var.f65463c0 = 0;
        wj1Var.f65465d0 = 0;
        wj1Var.m23313P(i2);
        wj1Var.m23310M(i3);
        if (i4 < 0) {
            wj1Var.f65463c0 = 0;
        } else {
            wj1Var.f65463c0 = i4;
        }
        if (i5 < 0) {
            wj1Var.f65465d0 = 0;
        } else {
            wj1Var.f65465d0 = i5;
        }
        wj1 wj1Var2 = (wj1) this.f50066d;
        wj1Var2.f66920w0 = i;
        wj1Var2.m24007V();
    }

    /* JADX INFO: renamed from: W */
    public void m16503W(wj1 wj1Var) {
        ArrayList arrayList = (ArrayList) this.f50064b;
        arrayList.clear();
        int size = wj1Var.f66917t0.size();
        for (int i = 0; i < size; i++) {
            vj1 vj1Var = (vj1) wj1Var.f66917t0.get(i);
            ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = vj1Var.f65451T;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
            if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2 || constraintWidget$DimensionBehaviourArr[1] == constraintWidget$DimensionBehaviour2) {
                arrayList.add(vj1Var);
            }
        }
        wj1Var.f66919v0.f60612b = true;
    }

    /* JADX INFO: renamed from: a */
    public void m16504a(C0357g c0357g, Invalidation invalidation) {
        m58 m58Var = (m58) this.f50064b;
        m58 m58Var2 = (m58) this.f50065c;
        m58 m58Var3 = (m58) this.f50066d;
        int i = ac2.f481a[invalidation.ordinal()];
        if (i == 1) {
            m58Var.m16639a(c0357g);
            m58Var3.m16639a(c0357g);
            return;
        }
        if (i == 2) {
            m58Var2.m16639a(c0357g);
            m58Var3.m16639a(c0357g);
            return;
        }
        if (i == 3) {
            if (c0357g.f4348h != null) {
                m58Var3.m16639a(c0357g);
                return;
            } else {
                m58Var.m16639a(c0357g);
                return;
            }
        }
        if (i != 4) {
            gm5.m12750e();
        } else if (c0357g.f4348h != null) {
            m58Var3.m16639a(c0357g);
        } else {
            m58Var2.m16639a(c0357g);
        }
    }

    /* JADX INFO: renamed from: b */
    public C3790yb m16505b() throws GeneralSecurityException {
        or3 or3Var;
        C2923dc c2923dc = (C2923dc) this.f50064b;
        if (c2923dc == null || (or3Var = (or3) this.f50065c) == null) {
            v63.m23147y("Cannot build without parameters and/or key material");
            return null;
        }
        if (c2923dc.f35369C != ((yk0) or3Var.f54782a).f69925a.length) {
            v63.m23147y("Key size mismatch");
            return null;
        }
        C0842cc c0842cc = c2923dc.f35372F;
        C0842cc c0842cc2 = C0842cc.f9870e;
        if (c0842cc != c0842cc2 && ((Integer) this.f50066d) == null) {
            v63.m23147y("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (c0842cc == c0842cc2 && ((Integer) this.f50066d) != null) {
            v63.m23147y("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (c0842cc == c0842cc2) {
            yk0.m25164a(new byte[0]);
        } else if (c0842cc == C0842cc.f9869d) {
            yk0.m25164a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f50066d).intValue()).array());
        } else {
            if (c0842cc != C0842cc.f9868c) {
                v63.m23127A(((C2923dc) this.f50064b).f35372F, "Unknown AesGcmParameters.Variant: ");
                return null;
            }
            yk0.m25164a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f50066d).intValue()).array());
        }
        return new C3790yb();
    }

    @Override // p000.id9
    /* JADX INFO: renamed from: c */
    public yd9 mo13795c() {
        return (e18) this.f50065c;
    }

    @Override // p000.hc9
    /* JADX INFO: renamed from: d */
    public float mo12102d(float f, float f2) {
        return 0.0f;
    }

    @Override // p000.hc9
    /* JADX INFO: renamed from: e */
    public float mo12103e(float f) {
        C0097e c0097e = (C0097e) this.f50064b;
        float fM852f = c0097e.m852f();
        Object objM827b = AbstractC0095c.m827b(c0097e.m849c(), fM852f, f, (vi3) this.f50065c, (C3757xf) this.f50066d);
        if (!((Boolean) c0097e.f2232a.invoke(objM827b)).booleanValue()) {
            objM827b = ((xc9) c0097e.f2239h).getValue();
        }
        return c0097e.m849c().m133f(objM827b) - fM852f;
    }

    /* JADX INFO: renamed from: f */
    public q50 m16506f() {
        String strConcat = ((String) this.f50064b) == null ? " backendName" : "";
        if (((Priority) this.f50066d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new q50((String) this.f50064b, (byte[]) this.f50065c, (Priority) this.f50066d);
        }
        C3386nv.m17633t("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // p000.InterfaceC3407of
    /* JADX INFO: renamed from: g */
    public void mo16507g(Bundle bundle) {
        synchronized (this.f50065c) {
            try {
                iy5 iy5Var = iy5.f44770f;
                iy5Var.m14207r("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f50066d = new CountDownLatch(1);
                ((qn3) this.f50064b).mo16507g(bundle);
                iy5Var.m14207r("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f50066d).await(500L, TimeUnit.MILLISECONDS)) {
                        iy5Var.m14207r("App exception callback received from Analytics listener.");
                    } else {
                        iy5Var.m14208s("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f50066d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC3458pf
    /* JADX INFO: renamed from: h */
    public void mo16508h(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f50066d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m16509i(C0357g c0357g) {
        return !(c0357g.f4348h == null) && (((SortedSet) ((m58) this.f50064b).f50618b).contains(c0357g) || ((SortedSet) ((m58) this.f50065c).f50618b).contains(c0357g));
    }

    /* JADX INFO: renamed from: k */
    public void m16510k(Bundle bundle) {
        HashSet hashSet = (HashSet) this.f50065c;
        String string = ((Context) this.f50066d).getString(R$string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (c54.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m16511l((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public Object m16511l(Class cls, HashSet hashSet) {
        Object objMo2061b;
        HashMap map = (HashMap) this.f50064b;
        if (Trace.isEnabled()) {
            try {
                pvc.m19517m(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objMo2061b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                c54 c54Var = (c54) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo2060a = c54Var.mo2060a();
                if (!listMo2060a.isEmpty()) {
                    for (Class cls2 : listMo2060a) {
                        if (!map.containsKey(cls2)) {
                            m16511l(cls2, hashSet);
                        }
                    }
                }
                objMo2061b = c54Var.mo2061b((Context) this.f50066d);
                hashSet.remove(cls);
                map.put(cls, objMo2061b);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return objMo2061b;
    }

    /* JADX INFO: renamed from: m */
    public C3126ix m16512m() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        C1149a.m6680b();
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strM16480j = m16480j((String) this.f50065c, (HashMap) this.f50064b);
            String strConcat = "GET Request URL: ".concat(strM16480j);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strConcat, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(strM16480j).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.f50066d).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int i = bufferedReader.read(cArr);
                            if (i == -1) {
                                break;
                            }
                            sb.append(cArr, 0, i);
                        }
                        string = sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new C3126ix(responseCode, string, 3);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    @Override // p000.id9
    /* JADX INFO: renamed from: n */
    public t89 mo13796n() {
        return (d18) this.f50066d;
    }

    /* JADX INFO: renamed from: o */
    public void m16513o() {
        sq5 sq5Var = (sq5) ((bl2) this.f50065c).f8656b;
        pj5 pj5Var = (pj5) this.f50066d;
        try {
            gz3 gz3VarM3833N = ((bl2) this.f50064b).m3833N();
            pj5Var.mo16256b("Loaded old identity: " + gz3VarM3833N);
            String str = gz3VarM3833N.f41547a;
            if (str != null) {
                sq5Var.m21581x("user_id", str);
            }
            String str2 = gz3VarM3833N.f41548b;
            if (str2 != null) {
                sq5Var.m21581x("device_id", str2);
            }
        } catch (Exception e) {
            pj5Var.mo16255a("Unable to migrate file identity storage: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: p */
    public Object m16514p(String str, Notice notice, Continuation continuation) {
        or0 or0Var = (or0) this.f50065c;
        String str2 = notice.f19542d;
        str2.getClass();
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(str2, dateTimeFormatterOfPattern);
        String str3 = localDateTime.withMonth(localDateTime.getMonthValue() + 1).withDayOfMonth(1).withHour(0).withMinute(0).withSecond(0).withNano(0).format(dateTimeFormatterOfPattern);
        str3.getClass();
        return ((C1288d) or0Var).m7145l(str, str3, (ContinuationImpl) continuation);
    }

    /* JADX INFO: renamed from: r */
    public ym0 m16515r() {
        return ((an0) this.f50066d).f852a.f71736c;
    }

    /* JADX INFO: renamed from: s */
    public xi5 m16516s() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((s46) this.f50066d)) {
            try {
                xi5 xi5Var = (xi5) this.f50065c;
                if (xi5Var != null && localeList == ((LocaleList) this.f50064b)) {
                    return xi5Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new ti5(localeList.get(i)));
                }
                xi5 xi5Var2 = new xi5(arrayList);
                this.f50064b = localeList;
                this.f50065c = xi5Var2;
                return xi5Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public fb2 m16517t() {
        return ((an0) this.f50066d).f852a.f71734a;
    }

    public String toString() {
        switch (this.f50063a) {
            case 26:
                return sma.m21483a((xj4) this.f50064b).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public File m16518u() {
        File file = new File(((Context) this.f50066d).getCacheDir(), "com.iterable.sdk");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "itbl_inapp.json");
    }

    /* JADX INFO: renamed from: w */
    public LayoutDirection m16519w() {
        return ((an0) this.f50066d).f852a.f71735b;
    }

    /* JADX INFO: renamed from: x */
    public synchronized C1212h m16520x(String str) {
        return (C1212h) ((Map) this.f50064b).get(str);
    }

    /* JADX INFO: renamed from: y */
    public synchronized ArrayList m16521y() {
        return new ArrayList(((Map) this.f50064b).values());
    }

    /* JADX INFO: renamed from: z */
    public Object m16522z(Class cls) throws GeneralSecurityException {
        Class clsMo3177a;
        Object objM15791c;
        Object objM15790b;
        AtomicReference atomicReference = l48.f49043a;
        try {
            HashMap map = ((fk7) l66.f49184b.f49185a.get()).f39226b;
            if (map.containsKey(cls)) {
                clsMo3177a = ((jk7) map.get(cls)).mo3177a();
            } else {
                ij6.m13954l("No input primitive class for ", cls, " available");
                clsMo3177a = null;
            }
        } catch (GeneralSecurityException unused) {
        }
        if (clsMo3177a == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        List list = (List) this.f50065c;
        xj4 xj4Var = (xj4) this.f50064b;
        int i = sma.f61027a;
        int iM24567A = xj4Var.m24567A();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (wj4 wj4Var : xj4Var.m24570z()) {
            if (wj4Var.m24017C() == KeyStatusType.ENABLED) {
                if (!wj4Var.m24018D()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(wj4Var.m24015A())));
                }
                if (wj4Var.m24016B() == OutputPrefixType.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(wj4Var.m24015A())));
                }
                if (wj4Var.m24017C() == KeyStatusType.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(wj4Var.m24015A())));
                }
                if (wj4Var.m24015A() == iM24567A) {
                    if (z) {
                        v63.m23147y("keyset contains multiple primary keys");
                        return null;
                    }
                    z = true;
                }
                if (wj4Var.m24019z().m442z() != KeyData$KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i2++;
            }
        }
        if (i2 == 0) {
            v63.m23147y("keyset must contain at least one ENABLED key");
            return null;
        }
        if (!z && !z2) {
            v63.m23147y("keyset doesn't contain a valid primary key");
            return null;
        }
        ny8 ny8Var = new ny8(clsMo3177a);
        o16 o16Var = (o16) this.f50066d;
        if (((ConcurrentHashMap) ny8Var.f53415c) == null) {
            C3386nv.m17633t("setAnnotations cannot be called after build");
            return null;
        }
        ny8Var.f53417e = o16Var;
        for (int i3 = 0; i3 < xj4Var.m24569y(); i3++) {
            wj4 wj4VarM24568x = xj4Var.m24568x(i3);
            if (wj4VarM24568x.m24017C().equals(KeyStatusType.ENABLED)) {
                try {
                    ai4 ai4VarM24019z = wj4VarM24568x.m24019z();
                    AtomicReference atomicReference2 = l48.f49043a;
                    objM15791c = l48.m15791c(ai4VarM24019z.m439A(), ai4VarM24019z.m440B(), clsMo3177a);
                } catch (GeneralSecurityException e) {
                    if (!e.getMessage().contains("No key manager found for key type ") && !e.getMessage().contains(" not supported by key manager of type ")) {
                        throw e;
                    }
                    objM15791c = null;
                }
                if (list.get(i3) != null) {
                    try {
                        objM15790b = l48.m15790b(((zj4) list.get(i3)).f71648a, clsMo3177a);
                    } catch (GeneralSecurityException unused2) {
                        objM15790b = null;
                    }
                } else {
                    objM15790b = null;
                }
                if (wj4VarM24568x.m24015A() == xj4Var.m24567A()) {
                    ny8Var.m17695j(objM15790b, objM15791c, wj4VarM24568x, true);
                } else {
                    ny8Var.m17695j(objM15790b, objM15791c, wj4VarM24568x, false);
                }
            }
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ny8Var.f53415c;
        if (concurrentHashMap == null) {
            C3386nv.m17633t("build cannot be called twice");
            return null;
        }
        hk7 hk7Var = (hk7) ny8Var.f53416d;
        o16 o16Var2 = (o16) ny8Var.f53417e;
        Class cls2 = (Class) ny8Var.f53414b;
        sq5 sq5Var = new sq5(concurrentHashMap, hk7Var, o16Var2, cls2);
        ny8Var.f53415c = null;
        AtomicReference atomicReference3 = l48.f49043a;
        HashMap map2 = ((fk7) l66.f49184b.f49185a.get()).f39226b;
        if (!map2.containsKey(cls)) {
            v63.m23146x(cls, "No wrapper found for ");
            return null;
        }
        jk7 jk7Var = (jk7) map2.get(cls);
        if (cls2.equals(jk7Var.mo3177a()) && jk7Var.mo3177a().equals(cls2)) {
            return jk7Var.mo3178b(sq5Var);
        }
        v63.m23147y("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        return null;
    }

    public /* synthetic */ C3309ls(w41 w41Var, Object obj, int i) {
        this.f50063a = i;
        this.f50064b = w41Var;
        this.f50065c = obj;
    }

    public /* synthetic */ C3309ls(Context context, Object obj, Object obj2, int i) {
        this.f50063a = i;
        this.f50066d = context;
        this.f50064b = obj;
        this.f50065c = obj2;
    }

    public /* synthetic */ C3309ls(Object obj, Object obj2, Object obj3, int i) {
        this.f50063a = i;
        this.f50064b = obj;
        this.f50065c = obj2;
        this.f50066d = obj3;
    }

    public C3309ls(bl2 bl2Var, bl2 bl2Var2, pj5 pj5Var) {
        this.f50063a = 22;
        bl2Var.getClass();
        pj5Var.getClass();
        this.f50064b = bl2Var;
        this.f50065c = bl2Var2;
        this.f50066d = pj5Var;
    }

    public C3309ls(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, vi3 vi3Var) {
        this.f50063a = 20;
        abstractComponentCallbacksC0635c.getClass();
        vi3Var.getClass();
        this.f50064b = abstractComponentCallbacksC0635c;
        this.f50065c = vi3Var;
        abstractComponentCallbacksC0635c.f5709m0.mo21323g(new jg3(this));
    }

    public C3309ls(mm6 mm6Var, or0 or0Var, km7 km7Var, qn6 qn6Var) {
        this.f50063a = 27;
        mm6Var.getClass();
        or0Var.getClass();
        km7Var.getClass();
        qn6Var.getClass();
        this.f50064b = mm6Var;
        this.f50065c = or0Var;
        this.f50066d = km7Var;
    }

    public C3309ls(int i) {
        this.f50063a = i;
        int i2 = 16;
        switch (i) {
            case 8:
                this.f50064b = new ab9(16);
                long[] jArr = om8.f54590a;
                this.f50065c = new n66();
                this.f50066d = new s46(i2);
                break;
            case 19:
                this.f50064b = new m58(18);
                this.f50065c = new m58(18);
                this.f50066d = new m58(18);
                break;
            case 28:
                gm5 gm5Var = gm5.f41008b;
                this.f50065c = new HashSet();
                this.f50064b = gm5Var;
                break;
            default:
                this.f50066d = new s46(i2);
                break;
        }
    }

    public C3309ls(ny8 ny8Var) {
        this.f50063a = 12;
        this.f50064b = ny8Var;
        this.f50065c = r46.m20390p((e82) ny8Var.f53416d);
        this.f50066d = r46.m20389o((d82) ny8Var.f53417e);
    }

    public C3309ls(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c, a60 a60Var) {
        this.f50063a = 6;
        this.f50064b = viewTreeObserverOnGlobalLayoutListenerC0391c;
        this.f50065c = a60Var;
        viewTreeObserverOnGlobalLayoutListenerC0391c.setImportantForAutofill(1);
        AutofillId autofillId = viewTreeObserverOnGlobalLayoutListenerC0391c.getAutofillId();
        if (autofillId != null) {
            this.f50066d = autofillId;
            return;
        }
        throw AbstractC3393o1.m17745t("Required value was null.");
    }

    public C3309ls(String str, HashMap map) {
        this.f50063a = 21;
        this.f50065c = str;
        this.f50064b = map;
        this.f50066d = new HashMap();
    }

    public C3309ls(qn3 qn3Var) {
        this.f50063a = 11;
        this.f50065c = new Object();
        this.f50064b = qn3Var;
    }

    public C3309ls(t33 t33Var) {
        this.f50063a = 2;
        this.f50065c = null;
        this.f50066d = null;
        this.f50064b = t33Var;
    }

    public C3309ls(an0 an0Var) {
        this.f50063a = 14;
        this.f50066d = an0Var;
        this.f50064b = new qn3(this);
    }

    public /* synthetic */ C3309ls(int i, boolean z) {
        this.f50063a = i;
    }

    public C3309ls(wj1 wj1Var) {
        this.f50063a = 10;
        this.f50064b = new ArrayList();
        this.f50065c = new ua0();
        this.f50066d = wj1Var;
    }

    public C3309ls(InterfaceC0828bz[] interfaceC0828bzArr) {
        this.f50063a = 18;
        k79 k79Var = new k79();
        wd9 wd9Var = new wd9();
        wd9Var.f66660c = 1.0f;
        wd9Var.f66661d = 1.0f;
        C3850zy c3850zy = C3850zy.f72365e;
        wd9Var.f66662e = c3850zy;
        wd9Var.f66663f = c3850zy;
        wd9Var.f66664g = c3850zy;
        wd9Var.f66665h = c3850zy;
        ByteBuffer byteBuffer = InterfaceC0828bz.f9188a;
        wd9Var.f66668k = byteBuffer;
        wd9Var.f66669l = byteBuffer;
        wd9Var.f66659b = -1;
        InterfaceC0828bz[] interfaceC0828bzArr2 = new InterfaceC0828bz[interfaceC0828bzArr.length + 2];
        this.f50064b = interfaceC0828bzArr2;
        System.arraycopy(interfaceC0828bzArr, 0, interfaceC0828bzArr2, 0, interfaceC0828bzArr.length);
        this.f50065c = k79Var;
        this.f50066d = wd9Var;
        interfaceC0828bzArr2[interfaceC0828bzArr.length] = k79Var;
        interfaceC0828bzArr2[interfaceC0828bzArr.length + 1] = wd9Var;
    }

    public C3309ls(xj4 xj4Var, List list) {
        this.f50063a = 26;
        this.f50064b = xj4Var;
        this.f50065c = list;
        this.f50066d = o16.f53589b;
    }
}
