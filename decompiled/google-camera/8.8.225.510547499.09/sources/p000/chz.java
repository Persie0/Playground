package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chz {

    /* JADX INFO: renamed from: a */
    private static final nbh f5775a = nbh.m17259h("com/google/android/apps/camera/app/silentfeedback/SilentFeedback");

    /* JADX INFO: renamed from: a */
    public static void m3792a(Context context, Throwable th) {
        PackageInfo packageInfo;
        String strValueOf = String.valueOf(context.getPackageName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intent intent = null;
        if (th.getStackTrace().length != 0) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 4);
            } catch (PackageManager.NameNotFoundException e) {
                ((nbe) ((nbe) ((nbe) f5775a.m17251b()).mo17283h(e)).mo17276G((char) 172)).mo17290o("Could not find our own package. This should never happen. Not sending crash info.");
                packageInfo = null;
            }
            String str = null;
            for (ServiceInfo serviceInfo : packageInfo.services) {
                if (serviceInfo.name.equals("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService")) {
                    str = serviceInfo.name;
                }
            }
            if (str == null) {
                ((nbe) ((nbe) f5775a.m17251b()).mo17276G((char) 171)).mo17290o("Could not find SilentFeedbackService, not sending crash info.");
            } else {
                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(context.getApplicationContext(), str));
                intent2.setPackage(context.getApplicationContext().getPackageName());
                StringBuilder sb = new StringBuilder();
                m3793b(th, sb, new HashSet(), null);
                StackTraceElement stackTraceElement = stackTrace[0];
                String fileName = stackTraceElement.getFileName() != null ? stackTraceElement.getFileName() : "Unknown Source";
                String strConcat = strValueOf.concat(".SILENT_FEEDBACK");
                intent2.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.exceptionClass", th.getClass().getName());
                intent2.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.stackTrace", sb.toString());
                intent2.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingClass", stackTraceElement.getClassName());
                intent2.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingFile", fileName);
                intent2.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingLine", stackTraceElement.getLineNumber());
                intent2.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingMethod", stackTraceElement.getMethodName());
                intent2.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.categoryTag", strConcat);
                intent = intent2;
            }
        }
        if (intent != null) {
            try {
                context.startService(intent);
            } catch (IllegalStateException e2) {
                ((nbe) ((nbe) ((nbe) f5775a.m17251b()).mo17283h(th)).mo17276G((char) 175)).mo17290o("failed to start silent feedback service");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m3793b(Throwable th, StringBuilder sb, Set set, String str) {
        Throwable[] thArr;
        if (th == null || set.contains(th)) {
            return;
        }
        set.add(th);
        if (str != null) {
            sb.append(str);
        }
        sb.append(th.getClass().getName());
        sb.append(':');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\n\tat ");
            sb.append(stackTraceElement);
        }
        try {
            thArr = (Throwable[]) Throwable.class.getDeclaredMethod("getSuppressed", new Class[0]).invoke(th, new Object[0]);
        } catch (Exception e) {
            thArr = new Throwable[0];
        }
        for (Throwable th2 : thArr) {
            m3793b(th2, sb, set, "\nSuppressed: ");
        }
        if (th.getCause() != null) {
            m3793b(th.getCause(), sb, set, "\nCaused by: ");
        }
    }
}
