package p000;

import android.content.Context;
import android.os.StrictMode;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.eduimageview.EduImageView;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdj implements fdu {

    /* JADX INFO: renamed from: a */
    private final Context f21434a;

    /* JADX INFO: renamed from: b */
    private final hst f21435b;

    /* JADX INFO: renamed from: c */
    private final mrm f21436c;

    /* JADX INFO: renamed from: d */
    private final float f21437d;

    /* JADX INFO: renamed from: e */
    private final jww f21438e;

    public fdj(Context context, hst hstVar, mrm mrmVar, dhv dhvVar, jww jwwVar) {
        this.f21434a = context;
        this.f21435b = hstVar;
        this.f21436c = mrmVar;
        this.f21438e = jwwVar;
        this.f21437d = TimeUnit.MILLISECONDS.toSeconds(((Integer) dhvVar.mo6173a(did.f11464r).get()).intValue()) / 60.0f;
    }

    @Override // p000.fdu
    /* JADX INFO: renamed from: a */
    public final void mo8270a() {
        FrameLayout frameLayout = new FrameLayout(this.f21434a);
        View.inflate(this.f21434a, C0100R.layout.bottom_sheet, frameLayout);
        EduImageView eduImageView = (EduImageView) frameLayout.findViewById(C0100R.id.bottom_sheet_image);
        eduImageView.m4362c(this.f21434a.getString(C0100R.string.astro_photo_url), this.f21434a.getString(C0100R.string.astro_edu_image_content_description));
        eduImageView.m4360a();
        bgv bgvVar = new bgv();
        Object obj = bgp.m2422c(this.f21434a, C0100R.raw.astro_edu_animation).f3263a;
        obj.getClass();
        bgvVar.m2450q((bgm) obj);
        bgvVar.m2448o(-1);
        ((ImageView) frameLayout.findViewById(C0100R.id.bottom_sheet_animation)).setImageDrawable(bgvVar);
        if (this.f21436c.mo16813g() && ((Boolean) this.f21438e.mo3831be()).booleanValue()) {
            Context context = this.f21434a;
            Object[] objArr = {"count", Float.valueOf(this.f21437d)};
            Locale locale = Locale.getDefault();
            String string = context.getResources().getString(C0100R.string.kepler_edu_text);
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                StringBuilder sb = new StringBuilder(string.length());
                new C0283j(string, locale).m11967b(0, null, null, null, objArr, new C0274ir(sb), null);
                String string2 = sb.toString();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                ((TextView) frameLayout.findViewById(C0100R.id.kepler_edu_textview)).setText(string2);
                ((LinearLayout) frameLayout.findViewById(C0100R.id.kepler_edu)).setVisibility(0);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        }
        frameLayout.addOnAttachStateChangeListener(new fdi(bgvVar, frameLayout, 0));
        this.f21435b.m10713l(6, C0100R.string.astrophotography_edu_title, frameLayout);
    }
}
