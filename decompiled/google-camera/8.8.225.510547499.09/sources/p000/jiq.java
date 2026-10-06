package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jiq extends jhh {
    public jiq(Context context, Looper looper, jgz jgzVar, jfe jfeVar, jga jgaVar) {
        super(context, looper, 270, jgzVar, jfeVar, jgaVar);
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: A */
    protected final boolean mo13152A() {
        return true;
    }

    @Override // p000.jhh, p000.jgw, p000.jdu
    /* JADX INFO: renamed from: a */
    public final int mo12833a() {
        return 203400000;
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ IInterface mo12834b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof jim ? (jim) iInterfaceQueryLocalInterface : new jim(iBinder);
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: c */
    protected final String mo12835c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: d */
    protected final String mo12836d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: e */
    public final jcw[] mo12893e() {
        return jct.f33752b;
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: t */
    protected final Bundle mo13168t() {
        return new Bundle();
    }
}
