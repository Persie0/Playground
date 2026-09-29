package p115fb;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.regex.Matcher;
import p136gc.C5752h;
import p326q.C8452h;
import p434vb.HandlerC9708b;

/* JADX INFO: renamed from: fb.d */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC5488d extends HandlerC9708b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5486b f34081a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5488d(C5486b c5486b, Looper looper) {
        super(looper);
        this.f34081a = c5486b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C5486b c5486b = this.f34081a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C5490f());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        c5486b.f34080g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c5486b.f34079f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String strValueOf = String.valueOf(action);
                        Log.d("Rpc", strValueOf.length() != 0 ? "Unexpected response action: ".concat(strValueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = C5486b.f34073j.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        c5486b.m11717b(extras, strGroup);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String strValueOf2 = String.valueOf(intent2.getExtras());
                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 49);
                    sb2.append("Unexpected response, no error or registration id ");
                    sb2.append(strValueOf2);
                    Log.w("Rpc", sb2.toString());
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c5486b.f34074a) {
                        int i10 = 0;
                        while (true) {
                            C8452h<String, C5752h<Bundle>> c8452h = c5486b.f34074a;
                            if (i10 < c8452h.f45619c) {
                                c5486b.m11717b(intent2.getExtras(), c8452h.m16529h(i10));
                                i10++;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !"ID".equals(strArrSplit[1])) {
                    Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                c5486b.m11717b(intent2.putExtra("error", strSubstring).getExtras(), str);
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
