package p000;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ogc extends cbr implements IInterface {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f45901a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PendingIntent f45902b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f45903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogc(Activity activity, PendingIntent pendingIntent, int i) {
        super("com.google.vr.vrcore.common.api.ITransitionCallbacks");
        this.f45901a = activity;
        this.f45902b = pendingIntent;
        this.f45903c = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m18474b() {
        this.f45901a.runOnUiThread(new ofo(this, 0));
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        m18474b();
        return true;
    }

    public ogc() {
        super("com.google.vr.vrcore.common.api.ITransitionCallbacks");
    }
}
