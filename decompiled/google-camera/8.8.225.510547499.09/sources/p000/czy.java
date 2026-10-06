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
public final class czy implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: f */
    private static final Uri f10182f = Uri.parse("https://www.gstatic.com/aiux/gca/experimental/sdr_peppers.mp4");

    /* JADX INFO: renamed from: g */
    private static final Uri f10183g = Uri.parse("https://www.gstatic.com/aiux/gca/experimental/hdr_peppers.mp4");

    /* JADX INFO: renamed from: a */
    public final Executor f10184a;

    /* JADX INFO: renamed from: b */
    public czv f10185b;

    /* JADX INFO: renamed from: c */
    public czv f10186c;

    /* JADX INFO: renamed from: d */
    public boolean f10187d = false;

    /* JADX INFO: renamed from: e */
    public boolean f10188e = false;

    /* JADX INFO: renamed from: h */
    private final hst f10189h;

    /* JADX INFO: renamed from: i */
    private final Context f10190i;

    /* JADX INFO: renamed from: j */
    private final ScheduledExecutorService f10191j;

    /* JADX INFO: renamed from: k */
    private CompositeVideoView f10192k;

    /* JADX INFO: renamed from: l */
    private CompositeVideoView f10193l;

    /* JADX INFO: renamed from: m */
    private View f10194m;

    /* JADX INFO: renamed from: n */
    private final ihk f10195n;

    public czy(hst hstVar, ihk ihkVar, Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, byte[] bArr, byte[] bArr2) {
        this.f10189h = hstVar;
        this.f10195n = ihkVar;
        this.f10190i = context;
        this.f10184a = executor;
        this.f10191j = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m5763a() {
        if (this.f10194m == null) {
            this.f10194m = View.inflate(this.f10190i, C0100R.layout.hdr_video_bottom_sheet_content, null);
        }
        this.f10192k = (CompositeVideoView) this.f10194m.findViewById(C0100R.id.hdr_bottom_sheet_normal_video);
        this.f10193l = (CompositeVideoView) this.f10194m.findViewById(C0100R.id.hdr_bottom_sheet_hdr_video);
        if (this.f10185b == null || this.f10186c == null) {
            CompositeVideoView compositeVideoView = this.f10192k;
            CompositeVideoView compositeVideoView2 = this.f10193l;
            ihk ihkVar = this.f10195n;
            Context context = this.f10190i;
            Executor executor = this.f10184a;
            Uri uri = f10182f;
            ScheduledExecutorService scheduledExecutorService = this.f10191j;
            this.f10185b = new czv(compositeVideoView, compositeVideoView2, ihkVar, context, executor, uri, scheduledExecutorService, null, null);
            this.f10186c = new czv(compositeVideoView2, compositeVideoView, ihkVar, context, executor, f10183g, scheduledExecutorService, null, null);
        }
        this.f10185b.m5758f();
        czv czvVar = this.f10185b;
        czvVar.f10167f = new cui(this, 20);
        czvVar.m5754b();
        this.f10186c.m5758f();
        czv czvVar2 = this.f10186c;
        czvVar2.f10167f = new czx(this, 1);
        czvVar2.m5754b();
        this.f10192k.m4323g();
        this.f10193l.m4324h();
        this.f10189h.m10714m(13, C0100R.string.hdr_video_bottom_sheet_title, this.f10194m, this);
    }

    /* JADX INFO: renamed from: b */
    public final void m5764b() {
        this.f10194m.findViewById(C0100R.id.hdr_bottom_sheet_hdr_caption).setVisibility(0);
        this.f10194m.findViewById(C0100R.id.hdr_bottom_sheet_normal_caption).setVisibility(0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f10185b.m5753a();
        this.f10186c.m5753a();
    }
}
