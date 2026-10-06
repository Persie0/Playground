package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.compositevideoview.CompositeVideoView;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class czt implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public static final Uri f10147a = Uri.parse("https://www.gstatic.com/aiux/gca/useredu/mountain_original.mp4");

    /* JADX INFO: renamed from: b */
    public static final Uri f10148b = Uri.parse("https://www.gstatic.com/aiux/gca/useredu/mountain_cinematic.mp4");

    /* JADX INFO: renamed from: c */
    public final hst f10149c;

    /* JADX INFO: renamed from: d */
    public final Context f10150d;

    /* JADX INFO: renamed from: e */
    public final Executor f10151e;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f10152f;

    /* JADX INFO: renamed from: g */
    public CompositeVideoView f10153g;

    /* JADX INFO: renamed from: h */
    public czv f10154h;

    /* JADX INFO: renamed from: i */
    public CompositeVideoView f10155i;

    /* JADX INFO: renamed from: j */
    public czv f10156j;

    /* JADX INFO: renamed from: k */
    public View f10157k;

    /* JADX INFO: renamed from: l */
    public boolean f10158l = false;

    /* JADX INFO: renamed from: m */
    public boolean f10159m = false;

    /* JADX INFO: renamed from: n */
    public final ihk f10160n;

    public czt(hst hstVar, ihk ihkVar, Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, byte[] bArr, byte[] bArr2) {
        this.f10149c = hstVar;
        this.f10160n = ihkVar;
        this.f10150d = context;
        this.f10151e = executor;
        this.f10152f = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m5749a() {
        this.f10157k.findViewById(C0100R.id.cinematic_bottom_sheet_cinematic_caption).setVisibility(0);
        this.f10157k.findViewById(C0100R.id.cinematic_bottom_sheet_normal_caption).setVisibility(0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f10154h.m5753a();
        this.f10156j.m5753a();
    }
}
