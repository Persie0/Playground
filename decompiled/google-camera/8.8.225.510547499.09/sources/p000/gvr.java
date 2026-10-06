package p000;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gvr implements gvo {

    /* JADX INFO: renamed from: a */
    public final Context f26512a;

    /* JADX INFO: renamed from: b */
    public final oju f26513b;

    /* JADX INFO: renamed from: c */
    public final Class f26514c;

    /* JADX INFO: renamed from: d */
    public gvn f26515d;

    /* JADX INFO: renamed from: e */
    private final boolean f26516e;

    /* JADX INFO: renamed from: f */
    private final Activity f26517f;

    /* JADX INFO: renamed from: g */
    private final KeyguardManager f26518g;

    /* JADX INFO: renamed from: h */
    private final hah f26519h;

    /* JADX INFO: renamed from: i */
    private final bko f26520i;

    public gvr(bko bkoVar, Activity activity, oju ojuVar, boolean z, Class cls, KeyguardManager keyguardManager, hah hahVar, byte[] bArr, byte[] bArr2) {
        this.f26520i = bkoVar;
        this.f26512a = activity.getApplicationContext();
        this.f26516e = z;
        this.f26517f = activity;
        this.f26514c = cls;
        this.f26513b = ojuVar;
        this.f26518g = keyguardManager;
        this.f26519h = hahVar;
    }

    /* JADX INFO: renamed from: h */
    private final void m9800h(Intent intent, boolean z) {
        if (!this.f26516e) {
            this.f26520i.m2612f(intent);
        } else {
            mo9794b(this.f26517f, new gvq(this, z, intent));
        }
    }

    @Override // p000.gvo
    /* JADX INFO: renamed from: a */
    public final void mo9793a() {
        this.f26515d = null;
    }

    @Override // p000.gvo
    /* JADX INFO: renamed from: b */
    public final void mo9794b(Activity activity, KeyguardManager.KeyguardDismissCallback keyguardDismissCallback) {
        if (this.f26516e) {
            gvn gvnVar = this.f26515d;
            if (gvnVar != null) {
                gvnVar.mo7778A();
            }
            int i = ((eoq) this.f26513b.get()).f14896f;
            ((eoq) this.f26513b.get()).m7600g(3);
            this.f26518g.requestDismissKeyguard(activity, new gvp(this, i, keyguardDismissCallback));
        }
    }

    @Override // p000.gvo
    /* JADX INFO: renamed from: c */
    public final void mo9795c(gvn gvnVar) {
        this.f26515d = gvnVar;
    }

    @Override // p000.gvo
    /* JADX INFO: renamed from: d */
    public final void mo9796d(Parcelable parcelable, Serializable serializable) {
        Intent intent = new Intent(this.f26512a, (Class<?>) this.f26514c);
        intent.putExtra("open_socialshare", true);
        intent.putExtra("filmstrip_item_data", parcelable);
        intent.putExtra(yTyWiTtGtnBhy.vti, serializable);
        m9800h(intent, false);
    }

    @Override // p000.gvo
    /* JADX INFO: renamed from: e */
    public final void mo9797e() {
        Intent intent = new Intent(this.f26512a, (Class<?>) this.f26514c);
        intent.putExtra("open_empty_vault", true);
        m9800h(intent, false);
    }

    @Override // p000.gvo
    /* JADX INFO: renamed from: f */
    public final void mo9798f() {
        Intent intent = new Intent(this.f26512a, (Class<?>) this.f26514c);
        intent.putExtra("open_filmstrip", true);
        if (((Boolean) this.f26519h.mo10031c(gzy.f27036at)).booleanValue()) {
            intent.putExtra("open_mars", true);
        }
        m9800h(intent, false);
    }

    @Override // p000.gvo
    /* JADX INFO: renamed from: g */
    public final void mo9799g(Intent intent) {
        m9800h(intent, true);
    }
}
