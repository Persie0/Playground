package p152hb;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.ProgressBar;
import com.google.android.gms.common.C2548c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import p176ib.C6272i;
import p176ib.C6284o;

/* JADX INFO: renamed from: hb.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6015u1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final C6009s1 f35603a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC6018v1 f35604b;

    public RunnableC6015u1(AbstractDialogInterfaceOnCancelListenerC6018v1 abstractDialogInterfaceOnCancelListenerC6018v1, C6009s1 c6009s1) {
        this.f35604b = abstractDialogInterfaceOnCancelListenerC6018v1;
        this.f35603a = c6009s1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f35604b.f35614b) {
            ConnectionResult connectionResult = this.f35603a.f35594b;
            if (connectionResult.m7530q()) {
                AbstractDialogInterfaceOnCancelListenerC6018v1 abstractDialogInterfaceOnCancelListenerC6018v1 = this.f35604b;
                InterfaceC5968f interfaceC5968f = abstractDialogInterfaceOnCancelListenerC6018v1.f13913a;
                Activity activityM7573b = abstractDialogInterfaceOnCancelListenerC6018v1.m7573b();
                PendingIntent pendingIntent = connectionResult.f13858c;
                C6272i.m12915i(pendingIntent);
                int i10 = this.f35603a.f35593a;
                int i11 = GoogleApiActivity.f13869b;
                Intent intent = new Intent(activityM7573b, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", false);
                interfaceC5968f.startActivityForResult(intent, 1);
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC6018v1 abstractDialogInterfaceOnCancelListenerC6018v2 = this.f35604b;
            if (abstractDialogInterfaceOnCancelListenerC6018v2.f35617e.mo7585a(abstractDialogInterfaceOnCancelListenerC6018v2.m7573b(), connectionResult.f13857b, null) != null) {
                AbstractDialogInterfaceOnCancelListenerC6018v1 abstractDialogInterfaceOnCancelListenerC6018v3 = this.f35604b;
                C2548c c2548c = abstractDialogInterfaceOnCancelListenerC6018v3.f35617e;
                Activity activityM7573b2 = abstractDialogInterfaceOnCancelListenerC6018v3.m7573b();
                AbstractDialogInterfaceOnCancelListenerC6018v1 abstractDialogInterfaceOnCancelListenerC6018v4 = this.f35604b;
                c2548c.m7590j(activityM7573b2, abstractDialogInterfaceOnCancelListenerC6018v4.f13913a, connectionResult.f13857b, abstractDialogInterfaceOnCancelListenerC6018v4);
                return;
            }
            if (connectionResult.f13857b != 18) {
                AbstractDialogInterfaceOnCancelListenerC6018v1 abstractDialogInterfaceOnCancelListenerC6018v5 = this.f35604b;
                int i12 = this.f35603a.f35593a;
                abstractDialogInterfaceOnCancelListenerC6018v5.f35615c.set(null);
                abstractDialogInterfaceOnCancelListenerC6018v5.mo12450j(connectionResult, i12);
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC6018v1 abstractDialogInterfaceOnCancelListenerC6018v6 = this.f35604b;
            C2548c c2548c2 = abstractDialogInterfaceOnCancelListenerC6018v6.f35617e;
            Activity activityM7573b3 = abstractDialogInterfaceOnCancelListenerC6018v6.m7573b();
            AbstractDialogInterfaceOnCancelListenerC6018v1 abstractDialogInterfaceOnCancelListenerC6018v7 = this.f35604b;
            c2548c2.getClass();
            ProgressBar progressBar = new ProgressBar(activityM7573b3, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activityM7573b3);
            builder.setView(progressBar);
            builder.setMessage(C6284o.m12924b(18, activityM7573b3));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            C2548c.m7584h(activityM7573b3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", abstractDialogInterfaceOnCancelListenerC6018v7);
            AbstractDialogInterfaceOnCancelListenerC6018v1 abstractDialogInterfaceOnCancelListenerC6018v8 = this.f35604b;
            C2548c c2548c3 = abstractDialogInterfaceOnCancelListenerC6018v8.f35617e;
            Context applicationContext = abstractDialogInterfaceOnCancelListenerC6018v8.m7573b().getApplicationContext();
            C6012t1 c6012t1 = new C6012t1(this, alertDialogCreate);
            c2548c3.getClass();
            C2548c.m7583g(applicationContext, c6012t1);
        }
    }
}
