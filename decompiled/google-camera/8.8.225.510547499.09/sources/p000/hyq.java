package p000;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.eduimageview.EduImageView;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyq {

    /* JADX INFO: renamed from: d */
    private static final nbh f29945d = nbh.m17259h(VzWFSVj.jNqTbLIMfY);

    /* JADX INFO: renamed from: a */
    public final hst f29946a;

    /* JADX INFO: renamed from: b */
    public boolean f29947b = false;

    /* JADX INFO: renamed from: c */
    public final jfs f29948c;

    public hyq(hst hstVar, jfs jfsVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f29946a = hstVar;
        this.f29948c = jfsVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m10877a(Context context) {
        if (this.f29946a == null) {
            ((nbe) ((nbe) f29945d.m17252c()).mo17276G((char) 4029)).mo17290o("bottomSheetController is not ready");
            return;
        }
        jvd.m13538a();
        FrameLayout frameLayout = new FrameLayout(context);
        View.inflate(context, C0100R.layout.hotshot_bottom_sheet_layout, frameLayout);
        EduImageView eduImageView = (EduImageView) frameLayout.findViewById(C0100R.id.hotshot_edu_image);
        eduImageView.m4362c(context.getString(C0100R.string.hotshot_edu_image_url), context.getString(C0100R.string.hotshot_edu_image_content_description));
        eduImageView.m4360a();
        this.f29947b = false;
        this.f29946a.m10714m(15, C0100R.string.hotshot_bottom_sheet_title, frameLayout, null);
    }
}
