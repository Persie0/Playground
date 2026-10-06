package p000;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jcx extends jmx {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jcy f33764a;

    /* JADX INFO: renamed from: b */
    private final Context f33765b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcx(jcy jcyVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f33764a = jcyVar;
        this.f33765b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                int iM12901e = this.f33764a.m12901e(this.f33765b);
                int i = jdm.f33802c;
                switch (iM12901e) {
                    case 1:
                    case 2:
                    case 3:
                    case 9:
                        jcy jcyVar = this.f33764a;
                        Context context = this.f33765b;
                        jcyVar.m12900d(context, iM12901e, jcyVar.m12904h(context, iM12901e, "n"));
                        break;
                }
                break;
            default:
                Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + message.what);
                break;
        }
    }
}
