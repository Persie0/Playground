package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d9d {
    /* JADX INFO: renamed from: a */
    public static Intent m10170a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    /* JADX INFO: renamed from: b */
    public static rca m10171b(rca rcaVar, String[] strArr, Map map) {
        int i = 0;
        if (rcaVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (rca) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                rca rcaVar2 = new rca();
                int length = strArr.length;
                while (i < length) {
                    rcaVar2.m20579a((rca) map.get(strArr[i]));
                    i++;
                }
                return rcaVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                rcaVar.m20579a((rca) map.get(strArr[0]));
                return rcaVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    rcaVar.m20579a((rca) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return rcaVar;
    }
}
