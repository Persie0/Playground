package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.internal.instrument.InstrumentData$Type;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class egd {
    /* JADX INFO: renamed from: a */
    public static final r74 m11099a(String str, String str2) {
        r74 r74Var = new r74();
        r74Var.f58847b = InstrumentData$Type.AnrReport;
        Context contextM21766a = sy2.m21766a();
        String str3 = null;
        try {
            PackageInfo packageInfo = contextM21766a.getPackageManager().getPackageInfo(contextM21766a.getPackageName(), 0);
            if (packageInfo != null) {
                str3 = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        r74Var.f58849d = str3;
        r74Var.f58850e = str;
        r74Var.f58851f = str2;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        r74Var.f58852g = lValueOf;
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        string.getClass();
        r74Var.f58846a = string;
        return r74Var;
    }

    /* JADX INFO: renamed from: b */
    public static final r74 m11100b(Throwable th, InstrumentData$Type instrumentData$Type) {
        String str;
        instrumentData$Type.getClass();
        r74 r74Var = new r74();
        r74Var.f58847b = instrumentData$Type;
        Context contextM21766a = sy2.m21766a();
        Throwable th2 = null;
        try {
            PackageInfo packageInfo = contextM21766a.getPackageManager().getPackageInfo(contextM21766a.getPackageName(), 0);
            str = packageInfo == null ? null : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        r74Var.f58849d = str;
        r74Var.f58850e = th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            stackTrace.getClass();
            for (StackTraceElement stackTraceElement : stackTrace) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        r74Var.f58851f = jSONArray.toString();
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        r74Var.f58852g = lValueOf;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(instrumentData$Type.getLogPrefix());
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        string.getClass();
        r74Var.f58846a = string;
        return r74Var;
    }

    /* JADX INFO: renamed from: c */
    public static final r74 m11101c(JSONArray jSONArray) {
        r74 r74Var = new r74();
        r74Var.f58847b = InstrumentData$Type.Analysis;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        r74Var.f58852g = lValueOf;
        r74Var.f58848c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer("analysis_log_");
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        string.getClass();
        r74Var.f58846a = string;
        return r74Var;
    }

    /* JADX INFO: renamed from: d */
    public static final r74 m11102d(File file) {
        InstrumentData$Type instrumentData$Type;
        file.getClass();
        r74 r74Var = new r74();
        String name = file.getName();
        name.getClass();
        r74Var.f58846a = name;
        if (cl9.m4842Y(name, "crash_log_", false)) {
            instrumentData$Type = InstrumentData$Type.CrashReport;
        } else if (cl9.m4842Y(name, "shield_log_", false)) {
            instrumentData$Type = InstrumentData$Type.CrashShield;
        } else if (cl9.m4842Y(name, "thread_check_log_", false)) {
            instrumentData$Type = InstrumentData$Type.ThreadCheck;
        } else if (cl9.m4842Y(name, "analysis_log_", false)) {
            instrumentData$Type = InstrumentData$Type.Analysis;
        } else {
            instrumentData$Type = cl9.m4842Y(name, "anr_log_", false) ? InstrumentData$Type.AnrReport : InstrumentData$Type.Unknown;
        }
        r74Var.f58847b = instrumentData$Type;
        JSONObject jSONObjectM22067z = thb.m22067z(name);
        if (jSONObjectM22067z != null) {
            r74Var.f58852g = Long.valueOf(jSONObjectM22067z.optLong("timestamp", 0L));
            r74Var.f58849d = jSONObjectM22067z.optString("app_version", null);
            r74Var.f58850e = jSONObjectM22067z.optString("reason", null);
            r74Var.f58851f = jSONObjectM22067z.optString("callstack", null);
            r74Var.f58848c = jSONObjectM22067z.optJSONArray("feature_names");
        }
        return r74Var;
    }
}
