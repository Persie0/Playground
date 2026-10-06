package p000;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class jfa extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public volatile boolean f33858a;

    /* JADX INFO: renamed from: b */
    protected final AtomicReference f33859b;

    /* JADX INFO: renamed from: c */
    public final Handler f33860c;

    /* JADX INFO: renamed from: d */
    public final jcy f33861d;

    public jfa(jft jftVar, jcy jcyVar) {
        super(jftVar);
        this.f33859b = new AtomicReference(null);
        this.f33860c = new jmx(Looper.getMainLooper());
        this.f33861d = jcyVar;
    }

    /* JADX INFO: renamed from: k */
    private static final int m13009k(kym kymVar) {
        if (kymVar == null) {
            return -1;
        }
        return kymVar.f37733a;
    }

    /* JADX INFO: renamed from: a */
    public final void m13010a(jcu jcuVar, int i) {
        this.f33859b.set(null);
        mo13012e(jcuVar, i);
    }

    /* JADX INFO: renamed from: b */
    public final void m13011b() {
        this.f33859b.set(null);
        mo13013f();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: c */
    public final void mo4653c(int i, int i2, Intent intent) {
        kym kymVar = (kym) this.f33859b.get();
        switch (i) {
            case 1:
                if (i2 == -1) {
                    m13011b();
                    return;
                } else if (i2 == 0) {
                    if (kymVar == null) {
                        return;
                    }
                    m13010a(new jcu(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, ((jcu) kymVar.f37734b).toString()), m13009k(kymVar));
                    return;
                }
            case 2:
                int iM12901e = this.f33861d.m12901e(m4659l());
                if (iM12901e == 0) {
                    m13011b();
                    return;
                } else {
                    if (kymVar == null) {
                        return;
                    }
                    if (((jcu) kymVar.f37734b).f33755c == 18 && iM12901e == 18) {
                        return;
                    }
                }
        }
        if (kymVar != null) {
            m13010a((jcu) kymVar.f37734b, kymVar.f37733a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: d */
    public final void mo4654d(Bundle bundle) {
        if (bundle != null) {
            this.f33859b.set(bundle.getBoolean("resolving_error", false) ? new kym(new jcu(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt(VCYBIzY.bDOhjSnYh, -1)) : null);
        }
    }

    /* JADX INFO: renamed from: e */
    protected abstract void mo13012e(jcu jcuVar, int i);

    /* JADX INFO: renamed from: f */
    protected abstract void mo13013f();

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: g */
    public final void mo4655g(Bundle bundle) {
        kym kymVar = (kym) this.f33859b.get();
        if (kymVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", kymVar.f37733a);
        bundle.putInt("failed_status", ((jcu) kymVar.f37734b).f33755c);
        bundle.putParcelable("failed_resolution", ((jcu) kymVar.f37734b).f33756d);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m13010a(new jcu(13, null), m13009k((kym) this.f33859b.get()));
    }
}
