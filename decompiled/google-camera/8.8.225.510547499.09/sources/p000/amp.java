package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class amp {

    /* JADX INFO: renamed from: d */
    private static final Object f717d = new Object();

    /* JADX INFO: renamed from: e */
    private static amp f718e;

    /* JADX INFO: renamed from: a */
    public final Context f719a;

    /* JADX INFO: renamed from: g */
    private final Handler f723g;

    /* JADX INFO: renamed from: b */
    public final HashMap f720b = new HashMap();

    /* JADX INFO: renamed from: f */
    private final HashMap f722f = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f721c = new ArrayList();

    private amp(Context context) {
        this.f719a = context;
        this.f723g = new amn(this, context.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public static amp m961a(Context context) {
        amp ampVar;
        synchronized (f717d) {
            if (f718e == null) {
                f718e = new amp(context.getApplicationContext());
            }
            ampVar = f718e;
        }
        return ampVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m962b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f720b) {
            amo amoVar = new amo(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.f720b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f720b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(amoVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.f722f.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f722f.put(action, arrayList2);
                }
                arrayList2.add(amoVar);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m963c(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f720b) {
            ArrayList arrayList = (ArrayList) this.f720b.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                amo amoVar = (amo) arrayList.get(size);
                amoVar.f716d = true;
                for (int i = 0; i < amoVar.f713a.countActions(); i++) {
                    String action = amoVar.f713a.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.f722f.get(action);
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            amo amoVar2 = (amo) arrayList2.get(size2);
                            if (amoVar2.f714b == broadcastReceiver) {
                                amoVar2.f716d = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            this.f722f.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m964d(Intent intent) {
        int i;
        int i2;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        synchronized (this.f720b) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f719a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("Resolving type ");
                sb.append(strResolveTypeIfNeeded);
                sb.append(" scheme ");
                sb.append(scheme);
                sb.append(" of intent ");
                sb.append(intent);
            }
            ArrayList arrayList3 = (ArrayList) this.f722f.get(intent.getAction());
            if (arrayList3 != null) {
                ArrayList arrayList4 = null;
                if (z) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Action list: ");
                    sb2.append(arrayList3);
                    i = 0;
                } else {
                    i = 0;
                }
                while (i < arrayList3.size()) {
                    amo amoVar = (amo) arrayList3.get(i);
                    if (z) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Matching against filter ");
                        sb3.append(amoVar.f713a);
                    }
                    if (amoVar.f715c) {
                        i2 = i;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i2 = i;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = strResolveTypeIfNeeded;
                        int iMatch = amoVar.f713a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z) {
                                Integer.toHexString(iMatch);
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(amoVar);
                            amoVar.f715c = true;
                        }
                        i = i2 + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    arrayList4 = arrayList;
                    i = i2 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    strResolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((amo) arrayList5.get(i3)).f715c = false;
                    }
                    this.f721c.add(new bck(intent, arrayList5));
                    if (!this.f723g.hasMessages(1)) {
                        this.f723g.sendEmptyMessage(1);
                    }
                }
            }
        }
    }
}
