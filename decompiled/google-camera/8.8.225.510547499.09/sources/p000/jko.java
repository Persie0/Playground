package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jko extends jhh {
    public jko(Context context, Looper looper, jgz jgzVar, jea jeaVar, jeb jebVar) {
        super(context, looper, 63, jgzVar, jeaVar, jebVar);
    }

    @Override // p000.jhh, p000.jgw, p000.jdu
    /* JADX INFO: renamed from: a */
    public final int mo12833a() {
        return 11925000;
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ IInterface mo12834b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        return iInterfaceQueryLocalInterface instanceof jkq ? (jkq) iInterfaceQueryLocalInterface : new jkq(iBinder);
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: c */
    protected final String mo12835c() {
        return wUzNh.RyVM;
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: d */
    protected final String mo12836d() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }
}
