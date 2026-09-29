package p498y3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.kochava.tracker.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: y3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10289a {

    /* JADX INFO: renamed from: f */
    public static final Object f51763f = new Object();

    /* JADX INFO: renamed from: g */
    public static C10289a f51764g;

    /* JADX INFO: renamed from: a */
    public final Context f51765a;

    /* JADX INFO: renamed from: b */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f51766b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final HashMap<String, ArrayList<c>> f51767c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public final ArrayList<b> f51768d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public final a f51769e;

    /* JADX INFO: renamed from: y3.a$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            C10289a c10289a = C10289a.this;
            while (true) {
                synchronized (c10289a.f51766b) {
                    try {
                        size = c10289a.f51768d.size();
                        if (size <= 0) {
                            return;
                        }
                        bVarArr = new b[size];
                        c10289a.f51768d.toArray(bVarArr);
                        c10289a.f51768d.clear();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                for (int i10 = 0; i10 < size; i10++) {
                    b bVar = bVarArr[i10];
                    int size2 = bVar.f51772b.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        c cVar = bVar.f51772b.get(i11);
                        if (!cVar.f51776d) {
                            cVar.f51774b.onReceive(c10289a.f51765a, bVar.f51771a);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: y3.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Intent f51771a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<c> f51772b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f51771a = intent;
            this.f51772b = arrayList;
        }
    }

    /* JADX INFO: renamed from: y3.a$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final IntentFilter f51773a;

        /* JADX INFO: renamed from: b */
        public final BroadcastReceiver f51774b;

        /* JADX INFO: renamed from: c */
        public boolean f51775c;

        /* JADX INFO: renamed from: d */
        public boolean f51776d;

        public c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f51773a = intentFilter;
            this.f51774b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(BuildConfig.SDK_TRUNCATE_LENGTH);
            sb2.append("Receiver{");
            sb2.append(this.f51774b);
            sb2.append(" filter=");
            sb2.append(this.f51773a);
            if (this.f51776d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    public C10289a(Context context) {
        this.f51765a = context;
        this.f51769e = new a(context.getMainLooper());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C10289a m19281a(Context context) {
        C10289a c10289a;
        synchronized (f51763f) {
            if (f51764g == null) {
                f51764g = new C10289a(context.getApplicationContext());
            }
            c10289a = f51764g;
        }
        return c10289a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m19282b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f51766b) {
            c cVar = new c(broadcastReceiver, intentFilter);
            ArrayList<c> arrayList = this.f51766b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f51766b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<c> arrayList2 = this.f51767c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f51767c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public final void m19283c(Intent intent) {
        ArrayList<c> arrayList;
        int i10;
        String str;
        boolean z10;
        String str2;
        synchronized (this.f51766b) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f51765a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z11 = true;
            boolean z12 = false;
            Object[] objArr = (intent.getFlags() & 8) != 0;
            if (objArr != false) {
                Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList2 = this.f51767c.get(intent.getAction());
            if (arrayList2 != null) {
                if (objArr != false) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                }
                ArrayList arrayList3 = null;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    c cVar = arrayList2.get(i11);
                    if (objArr != false) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f51773a);
                    }
                    if (cVar.f51775c) {
                        if (objArr != false) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        arrayList = arrayList2;
                        i10 = i11;
                        str = action;
                        z10 = z11;
                    } else {
                        String str3 = action;
                        arrayList = arrayList2;
                        i10 = i11;
                        str = action;
                        z10 = z11;
                        int iMatch = cVar.f51773a.match(str3, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (objArr != false) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                            }
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(cVar);
                            cVar.f51775c = z10;
                        } else if (objArr != false) {
                            if (iMatch == -4) {
                                str2 = "category";
                            } else if (iMatch == -3) {
                                str2 = "action";
                            } else if (iMatch != -2) {
                                str2 = iMatch != -1 ? "unknown reason" : "type";
                            } else {
                                str2 = "data";
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + str2);
                        }
                    }
                    i11 = i10 + 1;
                    z11 = z10;
                    arrayList2 = arrayList;
                    action = str;
                    z12 = false;
                }
                boolean z13 = z11;
                if (arrayList3 != null) {
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        ((c) arrayList3.get(i12)).f51775c = false;
                    }
                    this.f51768d.add(new b(intent, arrayList3));
                    if (!this.f51769e.hasMessages(z13 ? 1 : 0)) {
                        this.f51769e.sendEmptyMessage(z13 ? 1 : 0);
                    }
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m19284d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f51766b) {
            ArrayList<c> arrayListRemove = this.f51766b.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                c cVar = arrayListRemove.get(size);
                cVar.f51776d = true;
                for (int i10 = 0; i10 < cVar.f51773a.countActions(); i10++) {
                    String action = cVar.f51773a.getAction(i10);
                    ArrayList<c> arrayList = this.f51767c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f51774b == broadcastReceiver) {
                                cVar2.f51776d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f51767c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
