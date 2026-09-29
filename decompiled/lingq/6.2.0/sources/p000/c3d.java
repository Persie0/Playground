package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import androidx.glance.appwidget.action.ActionTrampolineType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c3d {
    /* JADX INFO: renamed from: a */
    public static final Intent m4305a(InterfaceC3063h5 interfaceC3063h5, yaa yaaVar, int i, C3013ft c3013ft) {
        if (interfaceC3063h5 instanceof tg9) {
            tg9 tg9Var = (tg9) interfaceC3063h5;
            Intent intentM4308d = m4308d(tg9Var, tg9Var.f62259b);
            if (intentM4308d.getData() == null) {
                intentM4308d.setData(i1d.m13632c(yaaVar, i, ActionTrampolineType.CALLBACK, String.valueOf(intentM4308d.getFlags())));
            }
            return intentM4308d;
        }
        if (interfaceC3063h5 instanceof zj8) {
            int i2 = ActionCallbackBroadcastReceiver.f5981a;
            return i1d.m13631b(d1d.m9993a(yaaVar, ((zj8) interfaceC3063h5).f71655a), yaaVar, i, ActionTrampolineType.BROADCAST);
        }
        if (!(interfaceC3063h5 instanceof cl4)) {
            C3386nv.m17632s(interfaceC3063h5, "Cannot create fill-in Intent for action type: ");
            return null;
        }
        ComponentName componentName = yaaVar.f69581n;
        if (componentName != null) {
            return i1d.m13631b(new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", yaaVar.f69569b), yaaVar, i, ActionTrampolineType.BROADCAST);
        }
        C3386nv.m17626m("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static a79 m4306b(Context context) {
        context.getClass();
        if (a79.f326c == null) {
            ReentrantLock reentrantLock = a79.f327d;
            reentrantLock.lock();
            try {
                if (a79.f326c == null) {
                    y69 y69Var = null;
                    try {
                        kpa kpaVarM23780b = w69.m23780b();
                        if (kpaVarM23780b != null) {
                            kpa kpaVar = kpa.f48300f;
                            kpaVar.getClass();
                            Object value = kpaVarM23780b.f48305e.getValue();
                            value.getClass();
                            Object value2 = kpaVar.f48305e.getValue();
                            value2.getClass();
                            if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                y69 y69Var2 = new y69(context);
                                if (y69Var2.m24963e()) {
                                    y69Var = y69Var2;
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    a79.f326c = new a79(y69Var);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        a79 a79Var = a79.f326c;
        a79Var.getClass();
        return a79Var;
    }

    /* JADX INFO: renamed from: c */
    public static final PendingIntent m4307c(InterfaceC3063h5 interfaceC3063h5, yaa yaaVar, int i, C3013ft c3013ft) {
        Context context = yaaVar.f69568a;
        if (interfaceC3063h5 instanceof tg9) {
            tg9 tg9Var = (tg9) interfaceC3063h5;
            Intent intentM4308d = m4308d(tg9Var, tg9Var.f62259b);
            if (intentM4308d.getData() == null) {
                intentM4308d.setData(i1d.m13632c(yaaVar, i, ActionTrampolineType.CALLBACK, String.valueOf(intentM4308d.getFlags())));
            }
            return PendingIntent.getActivity(context, 0, intentM4308d, 201326592, null);
        }
        if (interfaceC3063h5 instanceof zj8) {
            int i2 = ActionCallbackBroadcastReceiver.f5981a;
            Intent intentM9993a = d1d.m9993a(yaaVar, ((zj8) interfaceC3063h5).f71655a);
            intentM9993a.setData(i1d.m13632c(yaaVar, i, ActionTrampolineType.CALLBACK, ""));
            return PendingIntent.getBroadcast(context, 0, intentM9993a, 201326592);
        }
        if (!(interfaceC3063h5 instanceof cl4)) {
            C3386nv.m17632s(interfaceC3063h5, "Cannot create PendingIntent for action type: ");
            return null;
        }
        ComponentName componentName = yaaVar.f69581n;
        if (componentName == null) {
            C3386nv.m17626m("In order to use LambdaAction, actionBroadcastReceiver must be provided");
            return null;
        }
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", yaaVar.f69569b);
        intentPutExtra.setData(i1d.m13632c(yaaVar, i, ActionTrampolineType.CALLBACK, null));
        return PendingIntent.getBroadcast(context, 0, intentPutExtra, 201326592);
    }

    /* JADX INFO: renamed from: d */
    public static final Intent m4308d(tg9 tg9Var, AbstractC3027g6 abstractC3027g6) {
        if (!(tg9Var instanceof tg9)) {
            C3386nv.m17632s(tg9Var, "Action type not defined in app widget package: ");
            return null;
        }
        Intent intent = tg9Var.f62258a;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(((o56) abstractC3027g6).f53865a);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            C2953e6 c2953e6 = (C2953e6) entry.getKey();
            arrayList.add(new Pair(c2953e6.f36732a, entry.getValue()));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        intent.putExtras(omd.m18160p((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return intent;
    }
}
