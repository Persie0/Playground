package p115fb;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzq;
import p136gc.C5752h;

/* JADX INFO: renamed from: fb.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5498n<T> {

    /* JADX INFO: renamed from: a */
    public final int f34102a;

    /* JADX INFO: renamed from: b */
    public final C5752h<T> f34103b = new C5752h<>();

    /* JADX INFO: renamed from: c */
    public final int f34104c;

    /* JADX INFO: renamed from: d */
    public final Bundle f34105d;

    public AbstractC5498n(int i10, int i11, Bundle bundle) {
        this.f34102a = i10;
        this.f34104c = i11;
        this.f34105d = bundle;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo11722a(Bundle bundle);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo11723b();

    /* JADX INFO: renamed from: c */
    public final void m11724c(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(zzqVar);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
            sb2.append("Failing ");
            sb2.append(strValueOf);
            sb2.append(" with ");
            sb2.append(strValueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f34103b.m12113a(zzqVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m11725d(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(bundle);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
            sb2.append("Finishing ");
            sb2.append(strValueOf);
            sb2.append(" with ");
            sb2.append(strValueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f34103b.m12114b(bundle);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(this.f34104c);
        sb2.append(" id=");
        sb2.append(this.f34102a);
        sb2.append(" oneWay=");
        sb2.append(mo11723b());
        sb2.append("}");
        return sb2.toString();
    }
}
