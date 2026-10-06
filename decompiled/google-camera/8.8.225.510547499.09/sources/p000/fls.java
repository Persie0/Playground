package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.eduimageview.EduImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fls {

    /* JADX INFO: renamed from: a */
    public final hst f22518a;

    /* JADX INFO: renamed from: b */
    public final Context f22519b;

    /* JADX INFO: renamed from: d */
    private final DisplayMetrics f22521d;

    /* JADX INFO: renamed from: f */
    private final jfs f22523f;

    /* JADX INFO: renamed from: e */
    private View f22522e = null;

    /* JADX INFO: renamed from: c */
    public View f22520c = null;

    public fls(hst hstVar, jfs jfsVar, DisplayMetrics displayMetrics, Context context, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f22518a = hstVar;
        this.f22523f = jfsVar;
        this.f22519b = context;
        this.f22521d = displayMetrics;
    }

    /* JADX INFO: renamed from: a */
    public final void m8557a() {
        jvd.m13538a();
        if (this.f22522e == null) {
            FrameLayout frameLayout = new FrameLayout(this.f22519b);
            View.inflate(this.f22519b, C0100R.layout.motionphoto_bottom_sheet, frameLayout);
            ((Button) frameLayout.findViewById(C0100R.id.learn_more_button)).setOnClickListener(new flr(this, 0));
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(C0100R.id.bottom_sheet_video_container);
            EduImageView eduImageView = (EduImageView) frameLayout.findViewById(C0100R.id.bottom_sheet_video);
            ViewGroup.LayoutParams layoutParams = eduImageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
            int i = (this.f22521d.widthPixels - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
            int i2 = (this.f22521d.heightPixels - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
            float f = i;
            if (layoutParams.width > f) {
                float f2 = (layoutParams.height / layoutParams.width) * f;
                layoutParams.width = (int) f;
                layoutParams.height = (int) f2;
                eduImageView.setLayoutParams(layoutParams);
            } else {
                float f3 = i2;
                if (layoutParams.height > f3) {
                    marginLayoutParams.width = (int) ((layoutParams.width / layoutParams.height) * f3);
                    marginLayoutParams.height = (int) f3;
                    eduImageView.setLayoutParams(layoutParams);
                }
            }
            eduImageView.m4362c(this.f22519b.getString(C0100R.string.motion_photos_video_url), this.f22519b.getString(C0100R.string.motion_photos_video_content_description));
            this.f22522e = frameLayout;
        }
        this.f22518a.m10713l(7, C0100R.string.motion_photos_bottomsheet_title, this.f22522e);
        this.f22523f.m13090Z("micro_tutorial_dismiss");
    }
}
