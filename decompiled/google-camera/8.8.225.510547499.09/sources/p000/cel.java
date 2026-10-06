package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cel {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f5449a = 0;

    /* JADX INFO: renamed from: b */
    private static final Uri f5450b = Uri.parse("https://support.google.com/nexus/topic/6012822");

    /* JADX INFO: renamed from: c */
    private static final Uri f5451c = Uri.parse("http://www.google.com/policies/privacy/");

    /* JADX INFO: renamed from: d */
    private static final Uri f5452d = Uri.parse("http://www.google.com/policies/terms/");

    /* JADX INFO: renamed from: a */
    public static final void m3559a(String str, Context context) {
        jdz jdzVar = new jdz(context);
        jjw jjwVar = new jjw();
        jjwVar.f34191b = String.valueOf(str).concat(".USER_INITIATED_FEEDBACK_REPORT");
        jjwVar.f34190a = context.getString(C0100R.string.feedback_description_empty);
        jjx jjxVarM13321a = jjwVar.m13321a();
        jec jecVar = jdzVar.f33826i;
        System.nanoTime();
        jdz jdzVar2 = ((jfn) jecVar).f33909a;
        jjs jjsVar = new jjs(jecVar, jjxVarM13321a);
        jecVar.mo12967b(jjsVar);
        jib.m13208m(jjsVar);
    }

    /* JADX INFO: renamed from: b */
    public static final void m3560b(Context context, Activity activity) {
        new ihk(activity).m11355w(m3562d("android_default", context));
    }

    /* JADX INFO: renamed from: c */
    public static final void m3561c(Context context, Activity activity) {
        new ihk(activity).m11355w(m3562d("fix_camera_app_1", context));
    }

    /* JADX INFO: renamed from: d */
    private static final Intent m3562d(String str, Context context) {
        GoogleHelp googleHelp = new GoogleHelp(19, str, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false, null, false, null, false, new ArrayList(), null);
        googleHelp.f7738q = f5450b;
        googleHelp.m4664a(0, context.getResources().getString(C0100R.string.privacy_policy), new Intent("android.intent.action.VIEW", f5451c));
        googleHelp.m4664a(1, context.getResources().getString(C0100R.string.open_source_licenses), new Intent(context, (Class<?>) LicenseMenuActivity.class));
        googleHelp.m4664a(2, context.getResources().getString(C0100R.string.terms_of_service), new Intent("android.intent.action.VIEW", f5452d));
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", googleHelp);
    }
}
