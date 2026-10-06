package p000;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oes {

    /* JADX INFO: renamed from: a */
    public static final String f45809a = oes.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    public final PackageManager f45810b;

    public oes(PackageManager packageManager) {
        packageManager.getClass();
        this.f45810b = packageManager;
    }

    /* JADX INFO: renamed from: a */
    public final String m18439a(String str, String str2) {
        try {
            Resources resourcesForApplication = this.f45810b.getResourcesForApplication(str);
            return resourcesForApplication.getString(resourcesForApplication.getIdentifier(str2, "string", str));
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(f45809a, String.format(TVkaNXnfP.dyblMnGumpnHd, str));
            return null;
        } catch (Resources.NotFoundException e2) {
            Log.w(f45809a, String.format("String resource name '%s' not found in package '%s'.", str2, str));
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m18440b() {
        return true != m18441c("com.google.vr.apps.ornament", "com.google.vr.apps.ornament.measure.MeasureMainActivity") ? "com.google.vr.apps.ornament.measure" : "com.google.vr.apps.ornament";
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18441c(String str, String str2) {
        Intent intent = new Intent();
        intent.setClassName(str, str2);
        return this.f45810b.resolveActivity(intent, 0) != null;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m18442d() {
        try {
            Resources resourcesForApplication = this.f45810b.getResourcesForApplication("com.google.vr.apps.ornament");
            return resourcesForApplication.getDrawable(resourcesForApplication.getIdentifier("playground_mode_icon", "drawable", "com.google.vr.apps.ornament"), null);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(f45809a, String.format("Application package name '%s' not found.", "com.google.vr.apps.ornament"));
            return null;
        } catch (Resources.NotFoundException e2) {
            Log.w(f45809a, String.format("Drawable resource name '%s' not found in package '%s'.", "playground_mode_icon", "com.google.vr.apps.ornament"));
            return null;
        }
    }
}
