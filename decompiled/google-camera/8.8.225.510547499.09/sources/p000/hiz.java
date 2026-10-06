package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hiz implements DialogInterface.OnDismissListener, View.OnScrollChangeListener, hss {

    /* JADX INFO: renamed from: a */
    public final hst f27966a;

    /* JADX INFO: renamed from: b */
    public final Context f27967b;

    /* JADX INFO: renamed from: c */
    public hjh f27968c;

    /* JADX INFO: renamed from: d */
    public hjh f27969d;

    /* JADX INFO: renamed from: f */
    private final hai f27971f;

    /* JADX INFO: renamed from: g */
    private final Executor f27972g;

    /* JADX INFO: renamed from: h */
    private final ScheduledExecutorService f27973h;

    /* JADX INFO: renamed from: j */
    private final ihk f27975j;

    /* JADX INFO: renamed from: e */
    public boolean f27970e = false;

    /* JADX INFO: renamed from: i */
    private int f27974i = 1;

    public hiz(hst hstVar, Context context, ihk ihkVar, Executor executor, ScheduledExecutorService scheduledExecutorService, hai haiVar, byte[] bArr, byte[] bArr2) {
        this.f27966a = hstVar;
        this.f27967b = context;
        this.f27975j = ihkVar;
        this.f27972g = executor;
        this.f27973h = scheduledExecutorService;
        this.f27971f = haiVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m10362a() {
        jvd.m13538a();
        this.f27971f.mo10033e(gzy.f26996H, true);
        hst hstVar = this.f27966a;
        hstVar.f29442f = this;
        hstVar.f29441e = this;
        View viewInflate = View.inflate(this.f27967b, C0100R.layout.speech_btmsheet_content, null);
        hjh hjhVar = new hjh((htr) viewInflate.findViewById(C0100R.id.speech_btmsheet_normal_container), Uri.parse("https://www.gstatic.com/aiux/gca/cocktailparty/test_sample10_off.mp4"), this.f27967b, this.f27975j, this, this.f27972g, this.f27973h, null, null);
        this.f27968c = hjhVar;
        hjhVar.m10379g();
        hjh hjhVar2 = new hjh((htr) viewInflate.findViewById(C0100R.id.speech_btmsheet_enhanced_container), Uri.parse("https://www.gstatic.com/aiux/gca/cocktailparty/test_sample10_on.mp4"), this.f27967b, this.f27975j, this, this.f27972g, this.f27973h, null, null);
        this.f27969d = hjhVar2;
        hjhVar2.m10379g();
        hstVar.m10714m(10, C0100R.string.speech_btmsheet_title, viewInflate, this);
    }

    @Override // p000.hss
    /* JADX INFO: renamed from: b */
    public final void mo10363b(int i) {
        if (i != this.f27974i) {
            this.f27970e = false;
            this.f27974i = i;
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        hjh hjhVar = this.f27968c;
        if (hjhVar != null) {
            hjhVar.onDismiss(dialogInterface);
        }
        hjh hjhVar2 = this.f27969d;
        if (hjhVar2 != null) {
            hjhVar2.onDismiss(dialogInterface);
        }
        hst hstVar = this.f27966a;
        hstVar.f29442f = null;
        hstVar.f29441e = null;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        if (this.f27974i != 2 || this.f27970e) {
            return;
        }
        view.postDelayed(new hea(this, view, 12), 250L);
    }
}
