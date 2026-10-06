package p000;

import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iyp {

    /* JADX INFO: renamed from: a */
    public final View f32667a;

    /* JADX INFO: renamed from: b */
    public boolean f32668b;

    /* JADX INFO: renamed from: c */
    public boolean f32669c;

    /* JADX INFO: renamed from: d */
    public final float f32670d;

    /* JADX INFO: renamed from: e */
    public float f32671e;

    /* JADX INFO: renamed from: f */
    public int f32672f;

    /* JADX INFO: renamed from: g */
    public boolean f32673g;

    /* JADX INFO: renamed from: h */
    public boolean f32674h;

    /* JADX INFO: renamed from: i */
    public long f32675i;

    /* JADX INFO: renamed from: j */
    public int f32676j;

    /* JADX INFO: renamed from: k */
    public final jfs f32677k;

    /* JADX INFO: renamed from: l */
    private final Vibrator f32678l;

    /* JADX INFO: renamed from: m */
    private final ExecutorService f32679m;

    /* JADX INFO: renamed from: n */
    private Future f32680n;

    /* JADX INFO: renamed from: o */
    private final boolean f32681o;

    public iyp(Context context, View view) {
        jfs jfsVar = new jfs(view);
        this.f32668b = true;
        this.f32669c = true;
        this.f32671e = 0.0f;
        this.f32672f = 1;
        this.f32673g = true;
        boolean z = false;
        this.f32674h = false;
        this.f32667a = view;
        this.f32677k = jfsVar;
        this.f32679m = Executors.newSingleThreadExecutor();
        this.f32670d = ViewConfiguration.get(context).getScaledVerticalScrollFactor();
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        this.f32678l = vibrator;
        if (vibrator != null) {
            try {
                if (vibrator.areAllPrimitivesSupported(7, 1)) {
                    z = true;
                }
            } catch (RuntimeException e) {
            }
        }
        this.f32681o = z;
        view.setHapticFeedbackEnabled(!z);
    }

    /* JADX INFO: renamed from: a */
    public final void m11908a(final int i) {
        if (this.f32681o) {
            Future future = this.f32680n;
            if (future != null) {
                future.cancel(true);
            }
            this.f32680n = this.f32679m.submit(new Callable() { // from class: iyo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    iyp iypVar = this.f32665a;
                    return Boolean.valueOf(iypVar.f32667a.performHapticFeedback(i, 1));
                }
            });
        }
    }
}
