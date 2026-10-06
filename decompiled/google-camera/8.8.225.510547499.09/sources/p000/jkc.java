package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jkc extends jhh {

    /* JADX INFO: renamed from: a */
    public final Context f34229a;

    public jkc(Context context, Looper looper, jea jeaVar, jeb jebVar, jgz jgzVar) {
        super(context, looper, 29, jgzVar, jeaVar, jebVar);
        this.f34229a = context;
        jup.m13521b(context);
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        return iInterfaceQueryLocalInterface instanceof jkd ? (jkd) iInterfaceQueryLocalInterface : new jkd(iBinder);
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: c */
    protected final String mo12835c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: d */
    protected final String mo12836d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: e */
    public final jcw[] mo12893e() {
        return jjq.f34185b;
    }
}
