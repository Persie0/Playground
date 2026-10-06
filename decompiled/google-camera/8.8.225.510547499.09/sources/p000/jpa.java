package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpa extends jhh implements jou {

    /* JADX INFO: renamed from: a */
    public final jgz f34521a;

    /* JADX INFO: renamed from: t */
    public final Integer f34522t;

    /* JADX INFO: renamed from: u */
    private final boolean f34523u;

    /* JADX INFO: renamed from: v */
    private final Bundle f34524v;

    public jpa(Context context, Looper looper, jgz jgzVar, Bundle bundle, jea jeaVar, jeb jebVar) {
        super(context, looper, 44, jgzVar, jeaVar, jebVar);
        this.f34523u = true;
        this.f34521a = jgzVar;
        this.f34524v = bundle;
        this.f34522t = jgzVar.f34021h;
    }

    @Override // p000.jhh, p000.jgw, p000.jdu
    /* JADX INFO: renamed from: a */
    public final int mo12833a() {
        return 12451000;
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ IInterface mo12834b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof joy ? (joy) iInterfaceQueryLocalInterface : new joy(iBinder);
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: c */
    protected final String mo12835c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: d */
    protected final String mo12836d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // p000.jgw, p000.jdu
    /* JADX INFO: renamed from: o */
    public final boolean mo12947o() {
        return this.f34523u;
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: t */
    protected final Bundle mo13168t() {
        if (!this.f33986c.getPackageName().equals(this.f34521a.f34018e)) {
            this.f34524v.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f34521a.f34018e);
        }
        return this.f34524v;
    }
}
