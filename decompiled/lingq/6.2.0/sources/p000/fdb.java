package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class fdb extends wdb {

    /* JADX INFO: renamed from: a */
    public final Context f38917a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oo3 f38918b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdb(oo3 oo3Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f38918b = oo3Var;
        this.f38917a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = po3.f56583a;
        oo3 oo3Var = this.f38918b;
        Context context = this.f38917a;
        int iM19432c = oo3Var.m19432c(context, i2);
        int i3 = to3.f62638e;
        if (iM19432c == 1 || iM19432c == 2 || iM19432c == 3 || iM19432c == 9) {
            Intent intentM19431b = oo3Var.m19431b(iM19432c, context, "n");
            oo3Var.m18188g(context, iM19432c, intentM19431b == null ? null : g0c.m12274a(context, intentM19431b));
        }
    }
}
