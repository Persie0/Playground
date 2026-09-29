package com.facebook.internal.instrument;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import dm.C5206f;
import dm.C5207g;
import java.io.File;
import java.util.Arrays;
import kotlin.Metadata;
import mo.C7661i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5086z;
import p291o7.C8004n;

/* JADX INFO: loaded from: classes.dex */
public final class InstrumentData {

    /* JADX INFO: renamed from: a */
    public final String f11557a;

    /* JADX INFO: renamed from: b */
    public final Type f11558b;

    /* JADX INFO: renamed from: c */
    public final JSONArray f11559c;

    /* JADX INFO: renamed from: d */
    public final String f11560d;

    /* JADX INFO: renamed from: e */
    public final String f11561e;

    /* JADX INFO: renamed from: f */
    public final String f11562f;

    /* JADX INFO: renamed from: g */
    public final Long f11563g;

    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m13365d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Type;", "", "(Ljava/lang/String;I)V", "logPrefix", "", "getLogPrefix", "()Ljava/lang/String;", "toString", "Unknown", "Analysis", "AnrReport", "CrashReport", "CrashShield", "ThreadCheck", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1}, m13369xi = 48)
    public enum Type {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* JADX INFO: renamed from: com.facebook.internal.instrument.InstrumentData$Type$a */
        public /* synthetic */ class C2308a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f11564a;

            static {
                int[] iArr = new int[Type.valuesCustom().length];
                iArr[Type.Analysis.ordinal()] = 1;
                iArr[Type.AnrReport.ordinal()] = 2;
                iArr[Type.CrashReport.ordinal()] = 3;
                iArr[Type.CrashShield.ordinal()] = 4;
                iArr[Type.ThreadCheck.ordinal()] = 5;
                f11564a = iArr;
            }
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            Type[] typeArrValuesCustom = values();
            return (Type[]) Arrays.copyOf(typeArrValuesCustom, typeArrValuesCustom.length);
        }

        public final String getLogPrefix() {
            int i10 = C2308a.f11564a[ordinal()];
            if (i10 == 1) {
                return "analysis_log_";
            }
            if (i10 == 2) {
                return "anr_log_";
            }
            if (i10 == 3) {
                return "crash_log_";
            }
            if (i10 != 4) {
                return i10 != 5 ? "Unknown" : "thread_check_log_";
            }
            return "shield_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = C2308a.f11564a[ordinal()];
            if (i10 == 1) {
                return "Analysis";
            }
            if (i10 == 2) {
                return "AnrReport";
            }
            if (i10 == 3) {
                return "CrashReport";
            }
            if (i10 != 4) {
                return i10 != 5 ? "Unknown" : "ThreadCheck";
            }
            return "CrashShield";
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.instrument.InstrumentData$a */
    public /* synthetic */ class C2309a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11565a;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            iArr[Type.Analysis.ordinal()] = 1;
            iArr[Type.AnrReport.ordinal()] = 2;
            iArr[Type.CrashReport.ordinal()] = 3;
            iArr[Type.CrashShield.ordinal()] = 4;
            iArr[Type.ThreadCheck.ordinal()] = 5;
            f11565a = iArr;
        }
    }

    public InstrumentData(File file) {
        String name = file.getName();
        C5207g.m11110e(name, "file.name");
        this.f11557a = name;
        this.f11558b = C7661i.m15256V2(name, "crash_log_", false) ? Type.CrashReport : C7661i.m15256V2(name, "shield_log_", false) ? Type.CrashShield : C7661i.m15256V2(name, "thread_check_log_", false) ? Type.ThreadCheck : C7661i.m15256V2(name, "analysis_log_", false) ? Type.Analysis : C7661i.m15256V2(name, "anr_log_", false) ? Type.AnrReport : Type.Unknown;
        JSONObject jSONObjectM11012k1 = C5206f.m11012k1(name);
        if (jSONObjectM11012k1 != null) {
            this.f11563g = Long.valueOf(jSONObjectM11012k1.optLong("timestamp", 0L));
            this.f11560d = jSONObjectM11012k1.optString("app_version", null);
            this.f11561e = jSONObjectM11012k1.optString("reason", null);
            this.f11562f = jSONObjectM11012k1.optString("callstack", null);
            this.f11559c = jSONObjectM11012k1.optJSONArray("feature_names");
        }
    }

    public InstrumentData(String str, String str2) {
        this.f11558b = Type.AnrReport;
        C5086z c5086z = C5086z.f33015a;
        Context contextM15871a = C8004n.m15871a();
        String str3 = null;
        try {
            PackageInfo packageInfo = contextM15871a.getPackageManager().getPackageInfo(contextM15871a.getPackageName(), 0);
            if (packageInfo != null) {
                str3 = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        this.f11560d = str3;
        this.f11561e = str;
        this.f11562f = str2;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f11563g = lValueOf;
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        C5207g.m11110e(string, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f11557a = string;
    }

    public InstrumentData(Throwable th2, Type type) {
        String str;
        this.f11558b = type;
        C5086z c5086z = C5086z.f33015a;
        Context contextM15871a = C8004n.m15871a();
        Throwable th3 = null;
        String string = null;
        try {
            PackageInfo packageInfo = contextM15871a.getPackageManager().getPackageInfo(contextM15871a.getPackageName(), 0);
            str = packageInfo == null ? null : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        this.f11560d = str;
        this.f11561e = th2 == null ? null : th2.getCause() == null ? th2.toString() : String.valueOf(th2.getCause());
        if (th2 != null) {
            JSONArray jSONArray = new JSONArray();
            while (th2 != null && th2 != th3) {
                StackTraceElement[] stackTrace = th2.getStackTrace();
                C5207g.m11110e(stackTrace, "t.stackTrace");
                int length = stackTrace.length;
                int i10 = 0;
                while (i10 < length) {
                    StackTraceElement stackTraceElement = stackTrace[i10];
                    i10++;
                    jSONArray.put(stackTraceElement.toString());
                }
                th3 = th2;
                th2 = th2.getCause();
            }
            string = jSONArray.toString();
        }
        this.f11562f = string;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f11563g = lValueOf;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(type.getLogPrefix());
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        String string2 = stringBuffer.toString();
        C5207g.m11110e(string2, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.f11557a = string2;
    }

    public InstrumentData(JSONArray jSONArray) {
        this.f11558b = Type.Analysis;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f11563g = lValueOf;
        this.f11559c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer("analysis_log_");
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        C5207g.m11110e(string, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f11557a = string;
    }

    /* JADX INFO: renamed from: a */
    public final int m6678a(InstrumentData instrumentData) {
        C5207g.m11111f(instrumentData, "data");
        Long l10 = this.f11563g;
        if (l10 == null) {
            return -1;
        }
        long jLongValue = l10.longValue();
        Long l11 = instrumentData.f11563g;
        if (l11 == null) {
            return 1;
        }
        long jLongValue2 = l11.longValue();
        if (jLongValue2 < jLongValue) {
            return -1;
        }
        return jLongValue2 == jLongValue ? 0 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0046  */
    /* JADX INFO: renamed from: b */
    public final boolean m6679b() {
        Type type = this.f11558b;
        int i10 = type == null ? -1 : C2309a.f11565a[type.ordinal()];
        Long l10 = this.f11563g;
        boolean z10 = false;
        if (i10 != 1) {
            String str = this.f11562f;
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && str != null && l10 != null) {
                    z10 = true;
                }
            } else if (str != null && this.f11561e != null && l10 != null) {
                z10 = true;
            }
        } else if (this.f11559c != null && l10 != null) {
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: c */
    public final void m6680c() {
        if (m6679b()) {
            C5206f.m10980A1(this.f11557a, toString());
        }
    }

    public final String toString() {
        JSONObject jSONObject;
        Type type = this.f11558b;
        int i10 = type == null ? -1 : C2309a.f11565a[type.ordinal()];
        Long l10 = this.f11563g;
        try {
            if (i10 == 1) {
                jSONObject = new JSONObject();
                JSONArray jSONArray = this.f11559c;
                if (jSONArray != null) {
                    jSONObject.put("feature_names", jSONArray);
                }
                if (l10 != null) {
                    jSONObject.put("timestamp", l10);
                }
            } else if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                jSONObject = new JSONObject();
                jSONObject.put("device_os_version", Build.VERSION.RELEASE);
                jSONObject.put("device_model", Build.MODEL);
                String str = this.f11560d;
                if (str != null) {
                    jSONObject.put("app_version", str);
                }
                if (l10 != null) {
                    jSONObject.put("timestamp", l10);
                }
                String str2 = this.f11561e;
                if (str2 != null) {
                    jSONObject.put("reason", str2);
                }
                String str3 = this.f11562f;
                if (str3 != null) {
                    jSONObject.put("callstack", str3);
                }
                if (type != null) {
                    jSONObject.put("type", type);
                }
            } else {
                jSONObject = null;
            }
        } catch (JSONException unused) {
        }
        if (jSONObject == null) {
            String string = new JSONObject().toString();
            C5207g.m11110e(string, "JSONObject().toString()");
            return string;
        }
        String string2 = jSONObject.toString();
        C5207g.m11110e(string2, "params.toString()");
        return string2;
    }
}
