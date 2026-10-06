package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mnf extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mng f41101a;

    public mnf(mng mngVar) {
        this.f41101a = mngVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        mng mngVar = this.f41101a;
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            intent.getStringExtra("package.name");
            return;
        }
        Iterator<String> it = intent.getExtras().keySet().iterator();
        while (it.hasNext()) {
            intent.getExtras().get(it.next());
        }
        intent.getIntExtra("install.status", 0);
        intent.getIntExtra("error.code", 0);
        mngVar.m16654a(new mnc(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra(hIAHJKEnGsNbz.LCImYN, 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name")));
    }
}
